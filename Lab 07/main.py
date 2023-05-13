#write a program to read a set of numbers( 10 - 20 ) from the keyboad and store them in an array

a = []

for v in range( 10 , 20 ):
    a.append(int(input("Enter the value")))
print(a)