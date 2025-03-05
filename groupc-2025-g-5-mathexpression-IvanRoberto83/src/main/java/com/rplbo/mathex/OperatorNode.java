package com.rplbo.mathex;

public abstract class OperatorNode extends Node {
    private Node kiri;
    private Node kanan;

    public OperatorNode(Node kiri, Node kanan) {
        this.kiri = kiri;
        this.kanan = kanan;
    }

    public void setKiri(Node kiri) {
        this.kiri = kiri;
    }

    public void setKanan(Node kanan) {
        this.kanan = kanan;
    }

    public Node getKiri() {
        return kiri;
    }

    public Node getKanan() {
        return kanan;
    }

    @Override
    public abstract double hitung();
}
