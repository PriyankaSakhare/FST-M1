def fibonacci(n):
    if n<=1:
        return n
    else:
        return fibonacci(n-1) + fibonacci(n-2)

num = int (input("enter the no for fibonnaci"))

print("fibonacci sequence")
for i in range(num):
    print(fibonacci(i))
