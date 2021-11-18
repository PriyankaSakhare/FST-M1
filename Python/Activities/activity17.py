# import pandas
import pandas as pd
 
# Create a dictionary to hold our data
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"],
}
 
# Create a new DataFrame using our dictionary
table = pd.DataFrame(data)
 
# Print the DataFrame
print(table)

table.to_csv("usernname.csv", index=False)