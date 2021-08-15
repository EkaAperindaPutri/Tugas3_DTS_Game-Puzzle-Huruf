package com.ekaaverinda.gamepuzzle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private String[] huruf = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button kosong;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        kosong = button16;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button2 || kosong == button5){
                    ganti(button1);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button1 || kosong == button3 || kosong == button6){
                    ganti(button2);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button2 || kosong == button4 || kosong == button7){
                    ganti(button3);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button3 || kosong == button8){
                    ganti(button4);
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button1 || kosong == button6 || kosong == button9){
                    ganti(button5);
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button2 || kosong == button5 || kosong == button7 || kosong == button10){
                    ganti(button6);
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button3 || kosong == button6 || kosong == button8 || kosong == button11){
                    ganti(button7);
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button4 || kosong == button7 || kosong == button12){
                    ganti(button8);
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button5 || kosong == button10 || kosong == button13){
                    ganti(button9);
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button6 || kosong == button9 || kosong == button11 || kosong == button14){
                    ganti(button10);
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button7 || kosong == button10 || kosong == button12 || kosong == button15){
                    ganti(button11);
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button8 || kosong == button11 || kosong == button16){
                    ganti(button12);
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button9 || kosong == button14){
                    ganti(button13);
                }
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button10 || kosong == button13 || kosong == button15){
                    ganti(button14);
                }
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button11 || kosong == button14 || kosong == button16){
                    ganti(button15);
                }
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kosong == button12 || kosong == button15){
                    ganti(button16);
                }
            }
        });
    }

    private void ganti(Button button){
        kosong.setText(button.getText());
        button.setText("");
        kosong = button;

        if(button1.getText().equals("A") && button2.getText().equals("B") && button3.getText().equals("C") && button4.getText().equals("D") && button5.getText().equals("E") && button6.getText().equals("F") && button7.getText().equals("G") && button8.getText().equals("H") && button9.getText().equals("I") && button10.getText().equals("J") && button11.getText().equals("K") && button12.getText().equals("L") && button13.getText().equals("M") && button14.getText().equals("N") && button15.getText().equals("O")){
            Toast.makeText(getApplicationContext(), "You Win", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.ulangi){
            ulang();
        } else if (item.getItemId() == R.id.keluar){
            finish();
        }

        return true;
    }

    private void ulang(){
        for (int i = huruf.length - 2; i >= 0; i--) {
            Random r = new Random();
            int index = r.nextInt(i + 1);
            String a = huruf[index];
            huruf[index] = huruf[i];
            huruf[i] = a;
        }

        button1.setText(huruf[0]);
        button2.setText(huruf[1]);
        button3.setText(huruf[2]);
        button4.setText(huruf[3]);
        button5.setText(huruf[4]);
        button6.setText(huruf[5]);
        button7.setText(huruf[6]);
        button8.setText(huruf[7]);
        button9.setText(huruf[8]);
        button10.setText(huruf[9]);
        button11.setText(huruf[10]);
        button12.setText(huruf[11]);
        button13.setText(huruf[12]);
        button14.setText(huruf[13]);
        button15.setText(huruf[14]);
        button16.setText("");

        kosong = button16;
    }
}