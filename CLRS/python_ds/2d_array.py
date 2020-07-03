T = [[11, 12, 5, 2], [15, 6,10], [10, 8, 12, 5], [12,15,8,6]]

# print(T[0])
# print(T[0][0])
# print(T[-1][-1])

T[1].append(5)
print(T[1])

for x, y in zip(T[0], T[1]):
    print(x + y)

# for i in T:
#     for j in i:
#         print(j)