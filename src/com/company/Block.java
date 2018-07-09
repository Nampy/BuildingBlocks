package com.company;

public class Block {
    private int width;
    private int height;
    private int length;

    public Block(int[] a){
        // constructor with an array as parameter
        this.width = a[0];
        this.length = a[1];
        this.height = a[2];
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int getLength(){
        return length;
    }

    public int getVolume(){
        return getHeight()*getLength()*getWidth();
    }

    public int getSurfaceArea(){
        return (2* getWidth()*getLength()) +(2*getLength()*getHeight()) + (2*getHeight()*getWidth());
    }
}
