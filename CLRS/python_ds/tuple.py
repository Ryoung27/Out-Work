tup1 = ('Knoxville', 'Nashville', "Chat", "Memphis")
tup2 = ("This is immutable")
tup3 = ('a', 'b' 'c', 'd', 1, 2, 3, 4)

for i in tup1:
    print(i)

print(tup2)
print(tup1[0])

# If you want to update a tuple you have to make a new one.

tup4 = ()
for i in enumerate(tup1):
    if i[0] % 2 == 0:
        tup5 = list(tup4).append(i)

print(tup5)