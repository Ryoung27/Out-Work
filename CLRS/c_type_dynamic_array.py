# A dynamic array implementation

import ctypes

class DynamicArray(object):
    # Dynamic Array Class

    def __init__(self):
        self.n = 0 # Count actual elements
        self.capacity = 100 # Default Capacity
        self.A = self.make_array(self.capacity)


    def __len__(self):
        # Number of elements in array
        return self.n


    def __getItem__(self):
        # Return element at index k.
        if not 0 <= k <self.n:
            # Check if k index is in bounds.
            return IndexError('K is out of bounds !')
        # Return item from array.
        return self.A[k]


    def append(self, ele):
        # Add an element to the end of an array
        if self.n == self.capacity:
            # Add capacity if there isn't enough room.
            self._resize(2 * self.capacity)

        # Set self.n index to element
        self.A[self.n] = ele
        self.n += 1


    def insertAt(self, item, index):
        # Inserts the item at a specific index.
        if index<0 or index>self.n:
            print("please enter appropriate index..")
            return

        if self.n==self.capacity:
            self._resize(2*self.capacity)


        for i in range(self.n-1,index-1,-1):
            self.A[i+1]=self.A[i]


        self.A[index]=item
        self.n+=1


    def delete(self):
        # Deletes an item from the end.
        if self.n == 0:
            print("Array is empty.")
            return
        self.A[self.n-1]=0
        self.n-=1

    def removeAt(self,index):
        """
        This function deletes item from a specified index..
        """

        if self.n==0:
            print("Array is empty deletion not Possible")
            return

        if index<0 or index>=self.n:
            return IndexError("Index out of bound....deletion not possible")

        if index==self.n-1:
            self.A[index]=0
            self.n-=1
            return

        for i in range(index,self.n-1):
            self.A[i]=self.A[i+1]


        self.A[self.n-1]=0
        self.n-=1


    def _resize(self, new_cap):
        """
        Resize internal array to capacity new_cap
        """

        B = self.make_array(new_cap) # New bigger array

        for k in range(self.n): # Reference all existing values
            B[k] = self.A[k]

        self.A = B # Call A the new bigger array
        self.capacity = new_cap # Reset the capacity


    def make_array(self, new_cap):
        return (new_cap * ctypes.py_object)()


arr = DynamicArray()
print(len(arr))
arr.append(1)
print(len(arr))
arr.insertAt(2, 0)
print(len(arr))
arr.delete()
print(len(arr))
# print(arr.n)