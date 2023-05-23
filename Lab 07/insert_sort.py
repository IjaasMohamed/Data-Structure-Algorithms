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

def insert_sort(a):
    for i in range(len(a)):
        key = a[i]
        j = i - 1
        while j >= 0 and key < a[j]:
                a [j - 1 ] = a[j]
                j = j + 1
        a[j + 1] = key



insert_sort(a)

print("Sorted array \n, ", a)

