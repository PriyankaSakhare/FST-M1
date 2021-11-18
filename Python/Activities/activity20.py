# import pandas
import pandas as pd
from pandas.core.frame import DataFrame
 
# read data
table=pd.read_csv("activity19.csv")
 
# Print the DataFrame
print("Csv data is: ")
print(table)

print("Data in Email Column is: ")
print(table["Email"])

print("No of rows and columns are: ")
print(table.shape)

print("Sort the Usernames in ascending order")
print(table.sort_values('FirstName'))