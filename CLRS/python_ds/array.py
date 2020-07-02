# from array import *

array1 = [10, 20, 30, 40, 50]

print(array1)
print(array1[0])
print(array1[-1])

for x in array1:
    print(x)

array1.insert(-1, 55)
array1.insert(0, 5)
print(array1)

array1.remove(40)
print(array1)
print(array1.index(55))