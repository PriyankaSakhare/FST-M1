try:
    print(x)
except NameError:
    print("handling name exception without haltling execution")
except:
    print("something went wrong")   