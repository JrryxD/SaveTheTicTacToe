    package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener{

        Button topleft, midleft, bottomleft,
               topmid, mid, bottommid,
               topright, midright, bottomright;

        ImageView image_topleft, image_midleft, image_bottomleft,
                imagetop_mid, image_mid, image_bottommid,
                image_topright, image_midright, image_bottomright;

        LinearLayout field;

        Logic l = new Logic();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topleft = findViewById(R.id.btopleft);
        midleft = findViewById(R.id. bmidleft);
        bottomleft = findViewById(R.id.bbottomleft);
        topmid = findViewById(R.id.btopmid);
        mid = findViewById(R.id.bmid);
        bottommid = findViewById(R.id.bbottommid);
        topright = findViewById(R.id.btopright);
        midright = findViewById(R.id.bmidright);
        bottomright = findViewById(R.id.bbottomright);

        topleft.setOnClickListener(this);
        midleft.setOnClickListener(this);
        bottomleft.setOnClickListener(this);
        topmid.setOnClickListener(this);
        mid.setOnClickListener(this);
        bottommid.setOnClickListener(this);
        topright.setOnClickListener(this);
        midright.setOnClickListener(this);
        bottomright.setOnClickListener(this);

    }


        @Override
        public void onClick(View view) {
        //TODO make logic: how and who can win / optimize code / adjust activity_main priorities / win screen / play again screen :D
            switch (view.getId())
            {
                case R.id.btopleft:
                            if (l.getCounter()%2 == 1)   view = findViewById(R.id.vtopleft_x);
                            else    view = findViewById(R.id.vtopleft_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.btopleft).setClickable(false);
                            break;
                case R.id.bmidleft:
                            if (l.getCounter()%2 == 1)    view = findViewById(R.id.vmidleft_x);
                            else     view = findViewById(R.id.vmidleft_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.bmidleft).setClickable(false);
                    break;
                case R.id.bbottomleft:
                            if (l.getCounter()%2 == 1)   view = findViewById(R.id.vbottomleft_x);
                            else    view = findViewById(R.id.vbottomleft_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.bbottomleft).setClickable(false);
                    break;
                case R.id.btopmid:
                            if (l.getCounter()%2 == 1)   view = findViewById(R.id.vtopmid_x);
                            else    view = findViewById(R.id.vtopmid_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.btopmid).setClickable(false);
                    break;
                case R.id.bmid:
                            if (l.getCounter()%2 == 1)    view = findViewById(R.id.vmid_x);
                            else     view = findViewById(R.id.vmid_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.bmid).setClickable(false);
                    break;
                case R.id.bbottommid:
                            if (l.getCounter()%2 == 1)    view = findViewById(R.id.vbottommid_x);
                            else     view = findViewById(R.id.vbottommid_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.bbottommid).setClickable(false);
                    break;
                case R.id.btopright:
                            if (l.getCounter()%2 == 1)    view = findViewById(R.id.vtopright_x);
                            else     view = findViewById(R.id.vtopright_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.btopright).setClickable(false);
                    break;
                case R.id.bmidright:
                            if (l.getCounter()%2 == 1)    view = findViewById(R.id.vmidright_x);
                            else     view = findViewById(R.id.vmidright_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.bmidright).setClickable(false);
                    break;
                case R.id.bbottomright:
                            if (l.getCounter()%2 == 1)    view = findViewById(R.id.vbottomright_x);
                            else     view = findViewById(R.id.vbottomright_o);
                            view.setVisibility(View.VISIBLE);
                            l.higherCounterBy1();
                            findViewById(R.id.bbottomright).setClickable(false);
                    break;
            }


        }
    }