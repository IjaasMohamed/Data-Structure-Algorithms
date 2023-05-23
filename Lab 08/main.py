Array = []

for i in range(7):
    Array.append(int(input("Enter : ")))
print(Array)

def PARTITION(A, p, r):
    x = Array[r]
    i = p - 1
    for j in range(p, r - 1):
        if Array[j] <= x:
            i = i + 1
            A[i], A[j] = A[j], A[i]
        A[i + 1], A[r] = A[r], A[i + 1]
    return i + 1

def QUICKSORT(A, p, r):
    if p < r:
        q = PARTITION(A,p,r)
        QUICKSORT(A,p,q-1)
        QUICKSORT(A,q+1,r)


QUICKSORT(Array, 0, len(Array)- 1)

for i in range(len(Array)):
    print(Array[i])
