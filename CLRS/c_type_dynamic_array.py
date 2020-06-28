# A dynamic array implementation

import ctypes

class DynamicArray(object):
    # Dynamic Array Class

    def __init__(self):
        self.n = 0 # Count actual elements
        self.capacity = 100 # Default Capacity
        self.A = self.make_array(self.capacity)

    def append(self, ele):
        # Add an element to the end of an array
        if self.n == self.capacity:
            # Add capacity if there isn't enough room.
            self._resize(2 * self.capacity)

        self.A


    def make_array(self, new_cap):
        return (new_cap * ctypes.py_object)()


arr = DynamicArray()
# arr.append(1)
print(len(arr))