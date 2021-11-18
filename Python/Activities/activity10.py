numlist1 = list(input("Enter a sequence of comma separated values: "))
print(numlist1)

numlist3=[]

for number in numlist1:
    if (int(number) % 5==0):
        numlist3.append(number)


print("Numbers which are divisible by 5 are ")
print(numlist3)
    
