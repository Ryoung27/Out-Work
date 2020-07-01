# Generate a Node class.
class Node:

    def __init__(self, data):
        # A node does not inheritently have a left or right, but should have data.
        self.left = None
        self.right = None
        self.data = data

    # Insert is a method to create nodes.
    def insert(self, data):
        # If data exists.
        if self.data:
            # If the root is greater than data.
            if data < self.data:
                # We check if left is empty.
                if self.left is None:
                    # If it is, data is now self.left.
                    self.left = Node(data)
                else:
                    # Make a recursive call to this function
                    # Until we hit a blank spot.
                    self.left.insert(data)
            # Now for the right side.
            elif data > self.data:
                if self.right is None:
                    self.right = Node(data)
                else:
                    self.right.insert(data)
        # This should be for an empty BST.
        else:
            self.data = data

    # Search a method to compare nodes.
    def search(self, lookUpVal):
        if lookUpVal < self.data:
            if self.left is None:
                return str(lookUpVal) + " not found."
            return self.left.search(lookUpVal)
        elif lookUpVal > self.data:
            if self.right is None:
                return str(lookUpVal) + " not found."
            return self.right.search(lookUpVal)
        else:
            print(str(self.data) + ' found.')

    def showTree(self):
        if self.left:
            self.left.showTree()
        print(self.data),
        if self.right:
            self.right.showTree()

root = Node(12)
print(root)
root.insert(6)
print(root)
root.showTree()
print(root.search(7))
print(root.search(12))
root.insert(712)
root.showTree()