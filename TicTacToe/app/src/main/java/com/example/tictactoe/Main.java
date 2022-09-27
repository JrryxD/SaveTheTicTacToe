package com.example.tictactoe;

public class Main {

    public static void main(String[] args) {
            Logic l = new Logic();

            int player = 1;

            while(l.isgameOver())
            {
                if (player == 1)
                {

                    player = 2;
                } else if (player == 2)
                {

                    player = 1;
                }
            }

    }
}
