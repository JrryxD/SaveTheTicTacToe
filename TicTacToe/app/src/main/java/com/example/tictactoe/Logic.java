package com.example.tictactoe;

import java.util.Arrays;

public class Logic {

    String[] field = new String[9];
    int counter = 0;

    public Logic()
    {
        // # = leer, x = p1, o = p2;
        Arrays.fill(field, "#");
    }

    public void game()
    {

    }

    public void higherCounterBy1()
    {
        counter++;
    }

    public int getCounter()
    {
        return counter;
    }

    public String[] getField()
    {
        return field;
    }

    public boolean isgameOver()
    {
        return true;
    }
}
