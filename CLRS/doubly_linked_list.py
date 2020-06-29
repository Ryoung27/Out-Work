class doubleListNode:
    # A node in a doubly linked list.
    def __init__(self, data=None, prev=None, next=None):
        self.data = data
        self.prev = prev
        self.next = next

    def __repr__(self):
        return repr(self.data)

class DoublyLinkedList:
    # Create a new doubly linked list. Takes 0(1) time.
    def __init__(self):
        self.head = None

    def __repr__(self):
        # Return a string representation. Takes O(n) time.
        nodes = []
        curr = self.head
        while curr:
            nodes.append(repr(curr))
            curr = curr.next
        return '[' + ', '.join(nodes) + ']'

    def prepend(self, data):
        #Insert an element at the beginning. Takes O(1) time.
        new_head = DListNode(data=data, next=self.head)
        if self.head:
            self.head.prev = new_head
        self.head = new_head

    def append(self, data):
        # Insert an element at the end. Takes O(1) time.
        if not self.head:
            self.head = DListNode(data=data)
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = DListNode(data=data, prev=curr)

    def find(self, key):
        # Search for a matching key. Takes O(n) time.
        curr = self.head
        while curr and curr.data != key:
            curr = curr.next
        return curr

    def remove_elem(self, node):
        # Unlink an element from the list. Takes O(1) time.
        if node.prev:
            node.prev.next = node.next
        if node.next:
            node.next.prev = node.prev
        if node is self.head:
            self.head = node.next
        node.prev = None
        node.next = None

    def remove(self, key):
        # Remove the first occurence of key. Takes O(n) time.
        elem = self.find(key)
        if not elem:
            return
        self.remove_elem(elem)

    def reverse(self):
        # Reverse the list in place. Takes O(n) time.
        curr = self.head
        prev_node = None
        while curr:
            prev_node = curr.prev
            curr.prev = curr.next
            curr.next = prev_node
            curr = curr.prev
        self.head = prev_node.prev

