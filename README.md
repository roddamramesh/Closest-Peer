# Closest-Peer

https://github.com/roddamramesh/Closest-Peer/blob/master/Question.pdf

Write a function to find closest peer node.


Program explanation: The idea behind this program is to make use of Breadth-first search and find the closest node.

1. First part of code deals with construction of tree as specified on the PDF. Root node of this tree is passed as a parameter to the method closest Peer.

2. In Closest peer method, I used Queue to store the root node and added null value into the queue to differentiate nodes at same levels. (Example structure on Queue {null, A} and on second iteration it will be {Null, L, H, B}).

3. When queue is not empty remove the first element and assign first element to current node. Check the current node with user input to find the sibling and return the head of the queue to print the sibling.

4. If the user input is not equal to the current node data, then add the child node and all the child node siblings to the queue. And the while loop again executes till the queue is empty.

5. Time complexity for this program is O(n).

After running the program on console, it will prompt for

1. Please Enter the Closest Peer you want to find for: C

2. After User enters the value C output will be printed as Closest Peer for C is F

3. After that it will again prompt for user input  Do You want to find another closest peer (Yes/No): Yes

4. Once the user enters yes it will again request for user to  Please Enter the Closest Peer you want to find for: F

5. And the output will be Closest Peer for F is I

6. After that it will again prompt for user input Do You want to find another closest peer (Yes/No): No

7. Now it will exit the loop based one switch condition fails and program stops running.