package com.rplbo.mathex;

public abstract class UnaryOperator extends Node {
    private Node dataNode;

    public UnaryOperator(Node dataNode) {
        this.dataNode = dataNode;
    }

    public void setDataNode(Node dataNode) {
        this.dataNode = dataNode;
    }

    public Node getDataNode() {
        return dataNode;
    }

    @Override
    public abstract double hitung();
}
