numlist1 = list(input("Enter a sequence of comma separated values: "))
print(numlist1)

numlist2 = list(input("Enter a sequence of comma separated values: "))
print(numlist2)

numlist3=[]

for number in numlist1:
    if (int(number)%2==1):
        numlist3.append(number)

for number in numlist2:
    if (int(number)%2==0):
        numlist3.append(number)

print("result is ")
print(numlist3)
    
