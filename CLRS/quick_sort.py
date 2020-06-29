import numpy as np
import time

def forTime():
    start = time.perf_counter()
    arr = [np.random.randint(1,1000) for _ in range(500000)]

    def partition(arr, low, high):
        i = (low - 1)
        pivot = arr[high]

        for j in range(low, high):
            if arr[j] <= pivot:
                i = i + 1
                arr[i], arr[j] = arr[j], arr[i]

        arr[i+1], arr[high] = arr[high, arr[i+1]]

        return (i + 1)

    def quickSort(arr, low, high):
        if low < high:
            pi = partition(arr, low, high)

            quickSort(arr, low, pi-1)
            quickSort(arr, pi+1, high)

    stop = time.perf_counter()
    print(f"Quick sort with range 500000 took {stop - start:0.4f} seconds")

forTime()