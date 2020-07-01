class Node:

    def __init__(self, data):
        self.data = data
        self.next = None

    def __repr__(self):
        return str(self.data)


class LinkedList:

    def __init__(self):
        self.head = None

    def __repr__(self):
        return str(self)

    def add(self, data):
        temp = self.head
        self.head = Node(data)
        self.head.next = temp

    def __str__(self):
        str_list = []
        current = self.head
        while current:
            str_list.append(str(current.data))
            current = current.next
        return "[" + "->".join(str_list) + "]"

# Implement the missing functions in the ChainedHashTable ADT
class ChainedHashTable:

    def __init__(self, size):
        self.links = [None] * size
        self.size = size

    def __repr__(self):
        return str(self.links)

    def insert(self, key):
        #Make 'lst' equal to LL/None at given key in hash table
        lst = self.links[self.hash(key)]

        #Check to see if spot at hash table is None. If so, make new LL.
        if lst == None:
            lst = LinkedList()
            node = Node(key)
            lst.add(node)
            self.links[self.hash(key)] = lst
            return

        #Else append key to already existing linked list.
        node = Node(key)
        lst.add(node)
        return

    def hash(self, key):
        hash_code = (key*key) % self.size
        return hash_code


# Sample testing code
# You should test your ADT with other input as well
cht = ChainedHashTable(11)
cht.insert(1)
cht.insert(36)
cht.insert(3)
cht.insert(44)
cht.insert(91)
cht.insert(54)
cht.insert(18)
print(cht)