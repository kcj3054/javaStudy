package com.company.bookShelf;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return  shelf.size();
    }
    public  void  setShelf(String book) {
        shelf.add(book);
    }
}
