# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        carry, value = 0, 0

        res = ListNode()
        curr = res

        while l1 or l2:
            if not l1:
                value = 0 + l2.val
            elif not l2:
                value = l1.val + 0
            else:
                value = l1.val + l2.val
            if carry:
                value += 1
                carry = 0 

            if value > 9:
                value = value % 10 
                carry = 1

            curr.next = ListNode(value, None)
            curr = curr.next

            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next
    
        if carry:
            curr.next = ListNode(1, None)

        return res.next