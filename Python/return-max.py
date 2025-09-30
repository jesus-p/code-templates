class Stack(object):
    def __init__(self):
        """Initialize an empty stack"""
        self.items = []

    def push(self, item):
        """Push a new item onto the stack"""
        self.items.append(item)
    
    def pop(self):
        """Remove and return the last item"""
        # If the stack is empty, return None
        # Could also throw an exception
        if not self.items:
            return None
        
        return self.items.pop()
    
    def peek(self):
        """Return the last item without removing it"""
        if not self.items:
            return None
        return self.items[-1]
    
class MaxStack(object):
    # To do this we have to define two new stacks
    # one holds all integers, second holds the maxes after comparing

    # 1. whenever we push() a new item, we check to see if it's greater than or equal to the current max. If it is then we also push() it onto maxes_stack

    # 2. whenever we pop(), we also pop() from the top of maxes_stack if the item equals the top item in maxes_stack
    def __init__(self):
        self.stack = Stack()
        
    def get_max(object):
        