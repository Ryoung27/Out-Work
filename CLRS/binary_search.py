# Recursive Binary Search
def recursive_binary_search(arr, low, high, x):
    if high >= low:

        mid = (high + low) // 2
        # If element is present at the middle itself.
        if arr[mid] == x:
            return mid

        # If element is smaller than mid, then it's only in left sub-array.
        elif arr[mid] > x:
            return recursive_binary_search(arr, low, mid - 1, x)

        # Else the element can only be present in right sub-array.
        else:
            return recursive_binary_search(arr, mid + 1, high, x)
    else:
        # Element is not present in array.
        return - 1
arr = [ 2, 3, 4, 10, 40, 100]
x = 10

# result = recursive_binary_search(arr, 0, len(arr)-1, x)
# print(result)

# Iterative Binary Search
def iterative_binary_search(arr, x):
    low = 0
    high = len(arr) - 1
    mid = 0

    while low <= high:

        mid = (high + low) // 2

        # Check if X is the mid-point.
        if arr[mid] < x:
            low = mid + 1

        # If X is greater, ignore left half.
        elif arr[mid] > x:
            high = mid - 1

        # If X is smaller, ignore right half.
        else:
            return mid

    return - 1

print(iterative_binary_search(arr, x))



# Test array