# Closest-Peer

https://github.com/roddamramesh/Closest-Peer/blob/master/Question.pdf

Write a function to find closest peer node.

The idea behind this program is to make use of Breadth-first search and find the closest node.

Solution:

1.Construct the tree as specified on the pdf and send the root node as a parameter to the method closestPeer.

2.I used Queue to store the root node and added null value into the queue to differentiate the same level nodes.

3.when queue is not empty remove the first element and assign to current node.Check the current node with user inputto find the sibling and return the head of the queue to print the sibling.

4.If the userinput is not equal to the current node data then add the child node and all the child node siblings to the queue. And the while loop again executes till the queue is empty.




