# This Python 3 environment comes with many helpful analytics libraries installed
# It is defined by the kaggle/python docker image: https://github.com/kaggle/docker-python
# For example, here's several helpful packages to load in 

import numpy as np # linear algebra
import pandas as pd # data processing, CSV file I/O (e.g. pd.read_csv)
import itertools

# Input data files are available in the "../input/" directory.
# For example, running this (by clicking run or pressing Shift+Enter) will list the files in the input directory

import os

os.getcwd()

sendListDf = pd.read_csv("send-list.csv", header=0)
blockListDf = pd.read_csv("block-list.csv", header=0)

sendListDf = pd.concat([sendListDf, blockListDf])
sendListDf = sendListDf.reset_index(drop=True)

df_gpby = sendListDf.groupby(list(sendListDf.columns))
idx = [x[0] for x in df_gpby.groups.values() if len(x) == 1]
filteredData = sendListDf.reindex(idx)
filteredData


# Any results you write to the current directory are saved as output.