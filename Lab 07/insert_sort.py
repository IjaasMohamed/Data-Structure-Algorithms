#write a program to read a set of numbers( 10 - 20 ) from the keyboad and store them in an array

a = []

for i in range (0 , 9):
     number = int(input("Ënter a value : "))
     if number > 10 and number < 20:
         a.append(number)
     else:
         print("Paathu adiye da ")
         i = i + 1
print(a)