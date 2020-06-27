# Implmenting Insertion Sort in Python.
import numpy as np
import time

def forTime():
    start = time.perf_counter()
    arr = [np.random.randint(1,1000) for _ in range(50000)]
    def mergeSort(arr):
        if len(arr) >1:
            mid = len(arr)//2 # Finding the mid of the array
            L = arr[:mid] # Dividing the array elements
            R = arr[mid:] # into 2 halves

            mergeSort(L) # Sorting the first half
            mergeSort(R) # Sorting the second half

            i = j = k = 0

            # Copy data to temp arrays L[] and R[]
            while i < len(L) and j < len(R):
                if L[i] < R[j]:
                    arr[k] = L[i]
                    i+= 1
                else:
                    arr[k] = R[j]
                    j+= 1
                k+= 1

            # Checking if any element was left
            while i < len(L):
                arr[k] = L[i]
                i+= 1
                k+= 1

            while j < len(R):
                arr[k] = R[j]
                j+= 1
                k+= 1
        return arr
    stop = time.perf_counter()
    print(f"Insertion sort with range 50000 took {stop - start:0.4f} seconds")

forTime()