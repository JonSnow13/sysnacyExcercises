## Implement a Message Queue

Message queues provide a way for multiple components in a system to communicate
with each other in a distributed, decoupled, and asynchronous manner. This makes
them one of the go-to mechanisms for achieving horizontal scalability.

This task involves designing and implementing a simple message queue API that
supports the following two implementations:

### Memory based queue

This implementation would be suited for producers and consumers within the same
JVM.

This implementation should be thread-safe.

### File based queue

This implementation would be suited for producers and consumers on the same
host, but not necessarily within the same JVM.

Instead of storing the queue in memory, it would use the file system to store
the queue data and provide a locking mechanism to ensure safety with
applications running concurrently in multiple different JVMs.

## Features

Both message queue implementations should have the following properties:

- The queue should support multiple producers and multiple consumers polling
  concurrently.

- The queue should aim to deliver each message in a FIFO order, but there are no
  strict guarantees on this.

- The queue should aim to deliver each message once to one single consumer, but
  there are some rare circumstances where a message could be re-delivered to the
  same consumer or delivered to multiple consumers. The main thing is that we
  are always guaranteeing "at-least once" delivery, and it's up to the consumers
  to handle multiple deliveries of the same message gracefully.

- When a consumer takes a message, it isn't immediately removed from the queue.
  Instead, it should be temporarily suppressed from the queue so that it won't
  be picked up by another consumer until a timeout has been reached. Once the
  consumer receives the message, they should call the "delete" method to
  acknowledge they have received it so it can be permanently deleted from the
  queue. If they do not call the delete method within the timeout period (Amazon
  SQS calls this the "visibility timeout") then the message will automatically
  become visible again at the top of the queue, ready to be delivered to another
  consumer. This is how we are able to ensure the "at-least once" delivery
  guarantee.

For more information on these properties, take a look at the Amazon SQS documentation:

http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/Welcome.html
http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/DistributedQueues.html

## Implementation

A skeleton project has been provided in this directory which includes:

- A Maven pom file containing all the dependencies you should need (Guava,
  JUnit, and Mockito). Feel free to switch out Guava for Apache Commons if you
  prefer that instead. You should be able to load this project up into your IDE
  of choice, or alternatively run Maven from the command line to compile/test
  the project.

- An empty QueueService interface for you to define the three main queueing methods:
  - push -- pushes a new message onto a specified queue
  - pop -- receives a message from a specified queue
  - delete -- deletes a message that was received by a consumer

- A few empty classes for your implementation of MemoryQueueService and
  FileQueueService.

- A few empty test files for you to unit test your implementations.

Please ensure all tests pass before submitting your code.

