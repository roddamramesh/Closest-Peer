# Closest-Peer

https://github.com/roddamramesh/Closest-Peer/blob/master/Question.pdf

Write a function to find closest peer node as described in following table.
Feel free to define whatever class, function and/or parameters as needed.

The idea behind this program is to make use of Breadth-first search and find the closest node.

Solution:Construct the tree as specified on the pdf and send the root node as a parameter to the method closestPeer.
I used Queue to store the root node and added null value into the queue to differentiate the same level nodes.
when queue is not empty remove the first element and assign to current node.Check the current node with user input to find the sibling.




