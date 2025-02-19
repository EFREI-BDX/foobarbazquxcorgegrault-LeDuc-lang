package com.jad;

import java.util.ArrayList;

public class Foo {

    private String bar;
    private ArrayList<Baz> bazs;
    private String qux;
    private String corge;
    private ArrayList<Grault> graults;

    public Foo (String bar) {
        this.bar = bar;
    }

    public void addBaz (Baz baz) {}

    public void addGrault () {}

    public String getBar() {
        return this.bar;
    }

    public ArrayList<Baz> getBazs() {
        return this.bazs;
    }

    public String getQux() {
        return this.qux;
    }

    public String getCorge() {
        return this.corge;
    }

    public void setCorge(String corge) {
        this.corge = corge;
    }

    public ArrayList<Grault> getGraults() {
        return this.graults;
    }
}
