# Implmenting Insertion Sort in Python.
import numpy as np
import time
# Uses: Insertion sort is used when number of elements is small. It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.

# Sort an array of Size n.

# Sudo Code for Insertion Sort. According to CLRS

# Function to do insertion sort
def insertionSort(arr):
    start = time.perf_counter()
    # Traverse through 1 to len(arr)
    # for i in range(1, len(arr)) starts at 1 and does a count of the array.
    # Ex: arr = [100, 99, 98, 97, 96, 95] returns 1, 2, 3, 4, 5
    for i in range(1, len(arr)):
        # key is equal to arr[i] and for the loop returns 99, 98, 97, 96, 95 since the range starts at 1
        key = arr[i]
        # j gets the range 0, 1, 2, 3, 4
        # Why wouldn't we start at 0?
        j = i-1
        # While j >= 0, which is essentially while there is something to sort
        # And key < arr[j]
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
            arr[j + 1] = key
    stop = time.perf_counter()
    print(f"Insertion sort with range 20000 took {stop - start:0.4f} seconds")
    return arr

arr = [np.random.randint(1,1000) for _ in range(50000)]
insertionSort(arr)
# print(insertionSort(arr))