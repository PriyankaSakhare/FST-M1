# import pandas
import pandas as pd
from pandas.core.frame import DataFrame
 
# read data
table=pd.read_csv("usernname.csv")
 
# Print the DataFrame
print("Csv data is: ")
print(table)

print("Usernames column data is: ")
print(table["Usernames"])

print("Username and Password of the 2nd row is")
print(table['Usernames'][1] +" "+ table['Passwords'][1])

print("sorted Username column is ")
print(table.sort_values('Usernames',ascending=True))

print("sorted Passwords column is ")
print(table.sort_values('Passwords', ascending=False))