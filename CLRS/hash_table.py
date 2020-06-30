# Link to tutorial http://blog.chapagain.com.np/hash-table-implementation-in-python-data-structures-algorithms/

# In python this can be implemented as a list.
# Allows a key value look up.
# Time is constant, O(1).
# The worst case is, O(n).

# hash_table = [None] * 10
# hash_table = [[] for _ in range(10)]
# print(hash_table)

# def hashing_func(key):
#     return key % len(hash_table)

# def insert(hash_table, key, value):
#     hash_key = hashing_func(key)
#     hash_table[hash_key].append(value)

# insert(hash_table, 10, 'Tennessee')

# insert(hash_table, 9, 'Nashville')
# insert(hash_table, 11, 'Knoxville')

# # print(hashing_func(10))
# # print(hashing_func(25))
# # print(len(hash_table))
# # print(hash_table)

# # # Generate a collision.
# insert(hash_table, 8, 'Memphis')
# insert(hash_table, 8, 'Chat')
# print(hash_table)

# hash_key = hash('zyx')
# print(hash_key)
# Chaining to avoid a collision.

# Create an empty hash table.
hash_table = [[] for x in range(100)]
print(hash_table)

def insert(hash_table, key, value):
    hash_key = hash(key) % len(hash_table)
    key_exists = False
    bucket = hash_table[hash_key]
    for i, kv in enumerate(bucket):
        k, v = kv
        if key == k:
            key_exists = True
            break
    if key_exists:
        bucket[i] = ((key, value))
    else:
        bucket.append((key, value))

def search(hash_table, key):
    hash_key = hash(key) % len(hash_table)
    bucket = hash_table[hash_key]
    for i, kv in enumerate(bucket):
        k, v = kv
        if key == k:
            return v

def delete(hash_table, key):
    hash_key = hash(key) % len(hash_table)
    key_exists = False
    bucket = hash_table[hash_key]
    for i, kv in enumerate(bucket):
        k, v = kv
        if key == k:
            key_exists == True
            break
    if key_exists:
        del bucket[i]
        print('Key {} deleted'.format(key))
    else:
        print('Key {} not found.'.format(key))

insert(hash_table, 10, 'Nashville')
insert(hash_table, 25, 'Tennessee')
insert(hash_table, 20, 'Knoxville')
insert(hash_table, 30, 'Memphis')
insert(hash_table, 1, 'Test')

print(hash_table)
delete(hash_table, 30)
delete(hash_table, 29)
delete(hash_table, 31)

print(search(hash_table, 1))
print(delete(hash_table, 1))

print(hash_table)