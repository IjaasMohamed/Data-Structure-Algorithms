Array = []
i =0
while i<= 8:
    number=int(input("Enter Number Between 10 to 20 "))
    if number>10 and number <20:
        Array.append(number)
        i=i+1
    else:
        print("Plase Input number between 10 to 20 ")

print(Array)