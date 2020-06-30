# In python this can be implemented as a list.
# Allows a key value look up.
# Time is constant, O(1).
# The worst case is, O(n).

# hash_table = [None] * 10
hash_table = [[] for _ in range(10)]
print(hash_table)

def hashing_func(key):
    return key % len(hash_table)

def insert(hash_table, key, value):
    hash_key = hashing_func(key)
    hash_table[hash_key].append(value)

insert(hash_table, 10, 'Tennessee')

insert(hash_table, 9, 'Nashville')
insert(hash_table, 11, 'Knoxville')

# print(hashing_func(10))
# print(hashing_func(25))
# print(len(hash_table))
# print(hash_table)

# # Generate a collision.
insert(hash_table, 8, 'Memphis')
insert(hash_table, 8, 'Chat')
print(hash_table)

# Chaining to avoid a collision.