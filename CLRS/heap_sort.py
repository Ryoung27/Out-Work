#Heap sort,  sort it in-place to get O(1) space.
#As seen in, https://www.geeksforgeeks.org/heap-sort/
def heapify(arr, n, i):
    # Initialize largest as root.
    largest = i
    l = 2 * i + 1
    r = 2 * i + 2

    # See if left child of root exists and is greater than root.
    if l < n and arr[i] < arr[l]:
        largest = l

    # See if right child of root exists and is greater than root.
    if r < n and arr[largest] < arr[r]:
        largest = r

    # If needed change root.
    if largest != i:
        arr[i],arr[largest] = arr[largest],arr[i]

        # Heapify the root.
        heapify(arr, n, largest)

# Actual heap sort function to sort an array into given size.
def heapSort(arr):
    n = len(arr)

    # Build a maxheap.
    for i in range(n//2 - 1, -1, -1):
        heapify(arr, n, i)

    # One by one extract elements
    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i] # swap
        heapify(arr, i, 0)

arr = [12, 11, 13, 5, 6, 7]
heapSort(arr)
# print(heapSort(arr))
print(arr)