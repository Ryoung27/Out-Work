class ListNode:
    # A node in a singly-linked list.
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

    def __repr__(self):
        return repr(self.data)

class SinglyLinkedList:
    def __init__(self):
        # Creates a new singly-linked list with a O(1) time.
        self.head = None

    def __repr__(self):
        # Return a list, takes O(n)
        nodes = []
        curr = self.head
        while curr:
            nodes.append(repr(curr))
            curr = curr.next
        return '[' + ', '.join(nodes) + ']'

    def prepend(self, data):
        # Insert a new element, at the beginning, takes O(1) time.
        self.head = ListNode(data=data, next=self.head)

    def append(self, data):
        # Insert a new element, takes O(n) time.
        if not self.head:
            self.head = ListNode(data=data)
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = ListNode(data=data)

    def find(self, key):
        # Search for the first element matching, takes O(n) time.
        curr = self.head
        while curr and curr.data != key:
            curr = curr.next
        return curr

    def remove(self, key):
        # Remove first occurence of key, takes O(n) time.
        curr = self.head
        prev = None
        while curr and curr.data != key:
            prev = curr
            curr = curr.next
        if prev is None:
            self.head = curr.next
            curr.next = None

    def reverse(self):
        # Reverse the list in-place, takes O(n) time.
        curr = self.head
        prev_node = None
        next_node = None
        while curr:
            next_node = curr.next
            curr.next = prev_node
            prev_node = curr
            curr = next_node
        self.head = prev_node


new_list = SinglyLinkedList()
print(new_list)

new_list.append(23)
print(new_list)
new_list.prepend('a')
print(new_list)
print(new_list.find('a'))
print(new_list.find('b'))