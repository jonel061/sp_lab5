package com.company;
import java.util.Collection;

import java.util.Collection;

import java.util.Collection;

public interface Element {
    //atribute
    //metode

    default void add(Element e)
    {
        throw new UnsupportedOperationException();
    };
    default void remove(Element e)
    {
        throw new UnsupportedOperationException();
    };
    default Element getElement(int i)
    {
        throw new UnsupportedOperationException();
    };
    void render();
}
