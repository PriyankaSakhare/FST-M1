import pandas as pd
from pandas import ExcelWriter

 
data = {
  "FirstName": ["Satvik", "Avinash", "Lahri"],
  "LastName": ["Shah", "kati", "Rath"],
  "Email":["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
  "PhoneNumber":["4537829158","5892184058","4528727830"]
}

table = pd.DataFrame(data)

#create new file
print(table)
table.to_csv("activity19.csv", index=False)

#write to existing file	
writer = ExcelWriter('activity19.xlsx')
table.to_excel(writer, 'Sheet1', index = False)

writer.save()