package com.ramesh.closestpeer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by rameshroddam on 2/25/17.
 */
public class FindingPeerNode {

    public static void main(String args[]) {

        boolean repeat= true;
        String decision="YES";
        Node closestPeerNode;

        FindingPeerNode findingPeerNode = new FindingPeerNode();
        Node rootNode = findingPeerNode.buildAndMapAllNodes();
        Scanner scanner = new Scanner(System.in);

        while(repeat){
            switch(decision.toUpperCase()){
                case "YES":
                    repeat=true;
                    System.out.print("Please Enter the Closest Peer you want to find for: ");
                    String userInput=scanner.next();
                    closestPeerNode = findingPeerNode.closestPeer(rootNode, userInput);
                    findingPeerNode.printClosestPeer(closestPeerNode,userInput);
                    System.out.print("\nDo You want to find another closest peer (Yes/No): ");
                    decision=scanner.next();
                    break;
                case "NO":
                    repeat=false;
                    scanner.close();
                    break;
                default:
                    repeat=false;
                    System.out.print("Invalid data entered");
                    scanner.close();
                    break;
            }
        }

    }

    public Node closestPeer(Node rootNode, String userInput) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(rootNode);
        queue.add(null);
        while (!queue.isEmpty()) {

            /* poll() removes the present head. */
            Node currentNode = queue.poll();
            if (currentNode == null) {
                if (queue.isEmpty()) {
                    return null;
                }
                queue.add(null);
                continue;
            }
            if (currentNode.data.equals(userInput)) {
                if (queue.isEmpty()) {
                    return null;
                } else {
                    return queue.peek();
                }
            }

            /*Enqueue child and sibling  */
            if (currentNode.childPointer != null) {
                queue.add(currentNode.childPointer);
                Node child = currentNode.childPointer;
                while (child.siblingPointer != null) {
                    queue.add(child.siblingPointer);
                    child = child.siblingPointer;
                }

            }
        }
        return null;
    }

    public void printClosestPeer(Node closestPeerNode, String userInput) {
        if (closestPeerNode == null)
            System.out.println("Closest Peer for "+ userInput+" is NULL");
        else
            System.out.println("Closest Peer for " +  userInput+" is "+closestPeerNode);
    }

    public Node buildAndMapAllNodes() {

        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        Node G = new Node("G");
        Node H = new Node("H");
        Node I = new Node("I");
        Node J = new Node("J");
        Node K = new Node("K");
        Node L = new Node("L");
        Node M = new Node("M");
        Node N = new Node("N");
        Node O = new Node("O");

        A.childPointer = B;
        B.childPointer = C;
        B.parentPointer = A;
        B.siblingPointer = H;
        C.childPointer = D;
        C.parentPointer = B;
        C.siblingPointer = F;
        F.childPointer = G;
        F.parentPointer = B;
        D.childPointer = E;
        D.parentPointer = C;
        E.parentPointer = D;
        G.parentPointer = F;
        H.childPointer = I;
        H.siblingPointer = L;
        H.parentPointer = A;
        I.siblingPointer = J;
        I.parentPointer = H;
        J.childPointer = K;
        J.parentPointer = H;
        K.parentPointer = J;
        L.childPointer = M;
        L.parentPointer = A;
        M.childPointer = N;
        M.parentPointer = L;
        N.childPointer = O;
        N.parentPointer = M;
        O.parentPointer = N;
        return A;
    }

}






