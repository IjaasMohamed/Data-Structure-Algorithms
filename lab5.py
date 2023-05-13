a = int(input("Enter the value for a"))
b = int(input("Enter the value for b"))

if(a > b):
        print("{0} is greater than value b which is {1}".format(a,b))
elif(b > a):
        print("value of b {0} is greater than value a {1}".format(b,a))
else:
    print("a ({0}) is equal to ({1})")
