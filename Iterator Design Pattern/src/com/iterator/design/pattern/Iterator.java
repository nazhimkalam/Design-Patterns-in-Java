package com.iterator.design.pattern;


// This pattern is used to get a way to access the elements of a collection object in sequential manner without
//   any need to know its underlying representation.


public interface Iterator {
    public boolean hasNext();
    public Object next();
}