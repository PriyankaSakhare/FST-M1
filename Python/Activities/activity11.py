fruit = {
    "pineapple":1,
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15
}

check = input("which fruit you want? ").lower()

if(check in fruit):
    print("Fruit is available")
else:
    print("Fruit is not available")