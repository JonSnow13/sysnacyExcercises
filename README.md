# Coding Exercises

Please allow around 6-8 hours to complete these tasks. The last exercise will
take a fair bit longer than the other four exercises.

Submission can be in the form of a GitHub Pull Request, or a simple git commit.
Answers for each exercise should be placed in their respective exercise
directories.

If you have any questions, please don't hesitate to ask :)

### Exercise 1

Write a function that calculates the probability of getting a certain result from rolling two regular six-sided dice:

```
Sample results:

probablityOfResult(1) = 0.000
probablityOfResult(2) = 0.028
probablityOfResult(3) = 0.056
probablityOfResult(4) = 0.083
probablityOfResult(5) = 0.111
probablityOfResult(6) = 0.139
probablityOfResult(7) = 0.167
```

### Exercise 2

Imagine you're tasked with designing the software that runs and controls
elevators.

What interfaces and class objects would you use to represent this?

What configuration options would you need for the software to work in
skyscrapers, buildings with only one elevator, and buildings with banks of
elevators?

How would these different use cases change the objects and interfaces in your
design?

### Exercise 3

Imagine you're tasked with designing a simple text chat application, like a
really simple version of Skype or Messenger.

What are the main functions involved in this application?

What domain models and relationships would you use to provide this
functionality?

Are there any areas we would want to look at in terms of optimising the storage
and retrieval of the data in this model for speed and efficiency? If so, how
would we go about doing that?

> Think things like: showing the user their contact list, showing the user their
> message history with another user, and allowing the user to search through
> that message history.

Happy for this to cover just the basics, but feel free to go into as much detail
as you like.

### Exercise 4

Use a scripting language of your choice (Python, Ruby, Perl, or even plain Bash)
to perform the following operation:

Our customers often finding themselves wanting to remove a list of "bad" numbers
from the list of numbers they would like to send to.

For example, say we had the following two lists:

send-list.csv:

```
61211110001
61211110002
61211110003
```

block-list.csv:

```
61211110002
```

The resulting output after filtering out the bad numbers in block-list.csv would
be:

```
61211110001
61211110003
```

Implement this operation on the sample `send-list.csv` and `block-list.csv`
files inside the [exercise4 directory].

Feel free to make use of common Unix tools to aid you in this task. Don't be
afraid of a simple solution if you can find one.

If you have time, try implementing a few solutions and benchmark them against
each other to find the one that is most performant.

### Exercise 5

This task involves designing and implementing a local message queue. See the
[exercise5 directory] for more details.


