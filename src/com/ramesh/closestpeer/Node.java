package com.ramesh.closestpeer;

/**
 * Created by rameshroddam on 2/25/17.
 */
public class Node {
    String data;
    Node childPointer, parentPointer, siblingPointer;

    Node(String data)
    {
        this.data = data;
        childPointer = parentPointer = siblingPointer = null;
    }

    @Override
    public String toString() {
        return this.data;
    }
}

