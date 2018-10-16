package com.example.asus.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2,btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnResset;
    TextView TV1, TV2, TV3;
    int btn1C=-1, btn2C=-2,btn3C =-3;
    int btn4C=-4, btn5C=-5,btn6C =-6;
    int btn7C=-7, btn8C=-8,btn9C =-9;
    int Turn = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TV1 = (TextView) findViewById(R.id.TV1);
        TV2 = (TextView) findViewById(R.id.TV2);
        TV3 = (TextView) findViewById(R.id.TV3);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnResset = (Button) findViewById(R.id.btnResset);

        TV2.setText(""+Turn);

        btnResset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Turn = 1;
                TV2.setText(""+Turn);
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                btn1C=-1; btn2C=-2;btn3C =-3;
                btn4C=-4; btn5C=-5;btn6C =-6;
                btn7C=-7; btn8C=-8;btn9C =-9;
                btn1.setClickable(true);
                btn2.setClickable(true);
                btn3.setClickable(true);
                btn4.setClickable(true);
                btn5.setClickable(true);
                btn6.setClickable(true);
                btn7.setClickable(true);
                btn8.setClickable(true);
                btn9.setClickable(true);
                TV3.setText("");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV2.setText(""+Turn);
                if(Turn % 2 == 1){ btn1.setText("X"); btn1C=1;}
                else {btn1.setText("0"); btn1C =0;}
                Turn++;
                check();
                btn1.setClickable(false);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV2.setText(""+Turn);
                if(Turn % 2 == 1){ btn2.setText("X"); btn2C =1;}
                    else { btn2.setText("0"); btn2C =0;}
                Turn++;
                check();
                btn2.setClickable(false);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV2.setText(""+Turn);
                if(Turn % 2 == 1) {btn3.setText("X");btn3C =1;}
                else {btn3.setText("0"); btn3C =0;}
                Turn++;
                check();
                btn3.setClickable(false);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV2.setText(""+Turn);
                if(Turn % 2 == 1){ btn4.setText("X");btn4C = 1;}
                else {btn4.setText("0"); btn4C = 0;}
                Turn++;
                check();
                btn4.setClickable(false);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV2.setText(""+Turn);
                if(Turn % 2 == 1) {btn5.setText("X"); btn5C =1;}
                else {btn5.setText("0"); btn5C = 0;}
                Turn++;
                check();
                btn5.setClickable(false);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV2.setText(""+Turn);
                if(Turn % 2 == 1) {btn6.setText("X"); btn6C = 1;}
                else {btn6.setText("0"); btn6C=0;}
                Turn++;
                check();
                btn6.setClickable(false);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV2.setText(""+Turn);
                if(Turn % 2 == 1) {btn7.setText("X"); btn7C = 1;}
                else{ btn7.setText("0"); btn7C = 0;}
                Turn++;
                check();
                btn7.setClickable(false);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV2.setText(""+Turn);
                if(Turn % 2 == 1){ btn8.setText("X"); btn8C = 1;}
                else {btn8.setText("0"); btn8C = 0;}
                Turn++;
                check();
                btn8.setClickable(false);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV2.setText(""+Turn);
                if(Turn % 2 == 1) {btn9.setText("X"); btn9C = 1;}
                else {btn9.setText("0"); btn9C=0;}
                Turn++;
                check();
                btn9.setClickable(false);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public  void check(){
        boolean winer = false;
        if(btn1C==btn2C&btn1C==btn3C){
            if(Turn%2 == 1) {
                TV3.setText("Победитель 0");
            }
            else TV3.setText("Победитель X");
            winer =true;
        }
        if(btn4C==btn5C&btn4C==btn6C){
            if(Turn%2 == 1) {
                TV3.setText("Победитель 0");
            }
            else TV3.setText("Победитель X");
            winer =true;
        }
        if(btn7C==btn8C&btn7C==btn9C){
            if(Turn%2 == 1) {
                TV3.setText("Победитель 0");
            }
            else TV3.setText("Победитель X");
            winer =true;
        }
        if(btn1C==btn4C&btn1C==btn7C){
            if(Turn%2 == 1) {
                TV3.setText("Победитель 0");
            }
            else TV3.setText("Победитель X");
            winer =true;
        }
        if(btn2C==btn5C&btn2C==btn8C){
            if(Turn%2 == 1) {
                TV3.setText("Победитель 0");
            }
            else TV3.setText("Победитель X");
            winer =true;
        }
        if(btn3C==btn6C&btn3C==btn9C){
            if(Turn%2 == 1) {
                TV3.setText("Победитель 0");
            }
            else TV3.setText("Победитель X");
            winer =true;
        }
        if(btn1C==btn5C&btn1C==btn9C){
            if(Turn%2 == 1) {
                TV3.setText("Победитель 0");
            }
            else TV3.setText("Победитель X");
            winer =true;
        }
        if(btn3C==btn5C&btn3C==btn7C){
            if(Turn%2 == 1) {
                TV3.setText("Победитель 0");
            }
            else TV3.setText("Победитель X");
            winer =true;
        }
        if(winer){
            btn1.setClickable(false);
            btn2.setClickable(false);
            btn3.setClickable(false);
            btn4.setClickable(false);
            btn5.setClickable(false);
            btn6.setClickable(false);
            btn7.setClickable(false);
            btn8.setClickable(false);
            btn9.setClickable(false);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
