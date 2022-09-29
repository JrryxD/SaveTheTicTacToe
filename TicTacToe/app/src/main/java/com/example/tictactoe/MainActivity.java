    package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener{

        Button topleft, midleft, bottomleft,
               topmid, mid, bottommid,
               topright, midright, bottomright, retry;

        TextView text;

        Logic l = new Logic();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.ttext);

        topleft = findViewById(R.id.btopleft);
        midleft = findViewById(R.id. bmidleft);
        bottomleft = findViewById(R.id.bbottomleft);
        topmid = findViewById(R.id.btopmid);
        mid = findViewById(R.id.bmid);
        bottommid = findViewById(R.id.bbottommid);
        topright = findViewById(R.id.btopright);
        midright = findViewById(R.id.bmidright);
        bottomright = findViewById(R.id.bbottomright);
        retry = findViewById(R.id.bretry);

        topleft.setOnClickListener(this);
        midleft.setOnClickListener(this);
        bottomleft.setOnClickListener(this);
        topmid.setOnClickListener(this);
        mid.setOnClickListener(this);
        bottommid.setOnClickListener(this);
        topright.setOnClickListener(this);
        midright.setOnClickListener(this);
        bottomright.setOnClickListener(this);
        retry.setOnClickListener(this);
    }


        @Override
        public void onClick(View view) {
            if  (l.counter%2 == 1) text.setText("Player 2 (o)");
            else text.setText("Player 1 (x)");
            switch (view.getId())
            {
                case R.id.btopleft:
                            if (l.getCounter()%2 == 1)   view = findViewById(R.id.vtopleft_x);
                            else    view = findViewById(R.id.vtopleft_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.btopleft).setClickable(false);
                            l.setField(0);
                            break;
                case R.id.bmidleft:
                            if (l.getCounter()%2 == 1)    view = findViewById(R.id.vmidleft_x);
                            else     view = findViewById(R.id.vmidleft_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.bmidleft).setClickable(false);
                            l.setField(3);
                    break;
                case R.id.bbottomleft:
                            if (l.getCounter()%2 == 1)   view = findViewById(R.id.vbottomleft_x);
                            else    view = findViewById(R.id.vbottomleft_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.bbottomleft).setClickable(false);
                            l.setField(6);
                    break;
                case R.id.btopmid:
                            if (l.getCounter()%2 == 1)   view = findViewById(R.id.vtopmid_x);
                            else    view = findViewById(R.id.vtopmid_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.btopmid).setClickable(false);
                            l.setField(1);
                    break;
                case R.id.bmid:
                            if (l.getCounter()%2 == 1)    view = findViewById(R.id.vmid_x);
                            else     view = findViewById(R.id.vmid_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.bmid).setClickable(false);
                            l.setField(4);
                    break;
                case R.id.bbottommid:
                            if (l.getCounter()%2 == 1)    view = findViewById(R.id.vbottommid_x);
                            else     view = findViewById(R.id.vbottommid_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.bbottommid).setClickable(false);
                            l.setField(7);
                    break;
                case R.id.btopright:
                            if (l.getCounter()%2 == 1)    view = findViewById(R.id.vtopright_x);
                            else     view = findViewById(R.id.vtopright_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.btopright).setClickable(false);
                            l.setField(2);
                    break;
                case R.id.bmidright:
                            if (l.getCounter()%2 == 1)    view = findViewById(R.id.vmidright_x);
                            else     view = findViewById(R.id.vmidright_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.bmidright).setClickable(false);
                            l.setField(5);
                    break;
                case R.id.bbottomright:
                            if (l.getCounter()%2 == 1)    view = findViewById(R.id.vbottomright_x);
                            else     view = findViewById(R.id.vbottomright_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.bbottomright).setClickable(false);
                            l.setField(8);
                    break;
            }
            if (l.isgameOver())
            {
                text.setText(l.winner + " won :D");
                findViewById(R.id.btopleft).setClickable(false);
                findViewById(R.id.bmidleft).setClickable(false);
                findViewById(R.id.bbottomleft).setClickable(false);
                findViewById(R.id.btopmid).setClickable(false);
                findViewById(R.id.bmid).setClickable(false);
                findViewById(R.id.bbottommid).setClickable(false);
                findViewById(R.id.btopright).setClickable(false);
                findViewById(R.id.bmidright).setClickable(false);
                findViewById(R.id.bbottomright).setClickable(false);
                findViewById(R.id.bretry).setClickable(true);
                findViewById(R.id.bretry).setVisibility(View.VISIBLE);
            } else if (l.getCounter() == 9 && !l.isgameOver())
            {
                text.setText("draw");
                findViewById(R.id.bretry).setClickable(true);
                findViewById(R.id.bretry).setVisibility(View.VISIBLE);
            }
            if (view.getId() == R.id.bretry) retry();
        }

        private void retry() {
            findViewById(R.id.btopleft).setClickable(true);
            findViewById(R.id.bmidleft).setClickable(true);
            findViewById(R.id.bbottomleft).setClickable(true);
            findViewById(R.id.btopmid).setClickable(true);
            findViewById(R.id.bmid).setClickable(true);
            findViewById(R.id.bbottommid).setClickable(true);
            findViewById(R.id.btopright).setClickable(true);
            findViewById(R.id.bmidright).setClickable(true);
            findViewById(R.id.bbottomright).setClickable(true);
            findViewById(R.id.bretry).setClickable(false);
            findViewById(R.id.bretry).setVisibility(View.INVISIBLE);

            findViewById(R.id.vtopleft_o).setVisibility(View.INVISIBLE);
            findViewById(R.id.vtopleft_x).setVisibility(View.INVISIBLE);
            findViewById(R.id.vmidleft_o).setVisibility(View.INVISIBLE);
            findViewById(R.id.vmidleft_x).setVisibility(View.INVISIBLE);
            findViewById(R.id.vbottomleft_o).setVisibility(View.INVISIBLE);
            findViewById(R.id.vbottomleft_x).setVisibility(View.INVISIBLE);
            findViewById(R.id.vtopmid_o).setVisibility(View.INVISIBLE);
            findViewById(R.id.vtopmid_x).setVisibility(View.INVISIBLE);
            findViewById(R.id.vmid_o).setVisibility(View.INVISIBLE);
            findViewById(R.id.vmid_x).setVisibility(View.INVISIBLE);
            findViewById(R.id.vbottommid_o).setVisibility(View.INVISIBLE);
            findViewById(R.id.vbottommid_x).setVisibility(View.INVISIBLE);
            findViewById(R.id.vtopright_o).setVisibility(View.INVISIBLE);
            findViewById(R.id.vtopright_x).setVisibility(View.INVISIBLE);
            findViewById(R.id.vmidright_o).setVisibility(View.INVISIBLE);
            findViewById(R.id.vmidright_x).setVisibility(View.INVISIBLE);
            findViewById(R.id.vbottomright_o).setVisibility(View.INVISIBLE);
            findViewById(R.id.vbottomright_x).setVisibility(View.INVISIBLE);

            text.setText("player 1 starts (o)");

            l.setcounter();
            l.fillField();
        }
    }