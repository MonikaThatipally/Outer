package com.example.monikathatipally.outer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String Calc[]={"Home","Diet Recipes","Product Reviews","Diet Products","How to Diet","FAQ"};
        ListAdapter moniadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Calc);
       // ListAdapter moniadapter= new Custom(this, Calc);
        ListView lv=(ListView)findViewById(R.id.lid);
        lv.setAdapter(moniadapter);
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String temp=String.valueOf(adapterView.getItemAtPosition(i));
                        // Toast.makeText(MainActivity.this,temp,Toast.LENGTH_SHORT).show();

                        if (i == 0) {

                            Intent myIntent = new Intent(MainActivity.this, HomeActivity.class);
                            startActivityForResult(myIntent, 0);

                        }
                       if (i == 1) {
                            Intent myIntent2 = new Intent(MainActivity.this, Recipes.class);
                            startActivityForResult(myIntent2, 0);

                        }
                        /*
                        if (i == 2) {
                            Intent myIntent3 = new Intent(MainActivity.this, Reviews.class);
                            startActivityForResult(myIntent3, 0);

                        }
                        if (i == 3) {

                            Intent myIntent4 = new Intent(MainActivity.this, Products.class);
                            startActivityForResult(myIntent4, 0);
                        }
                        if (i == 4) {

                            Intent myIntent4 = new Intent(MainActivity.this, Diet.class);
                            startActivityForResult(myIntent4, 0);
                        }
                        if (i == 5) {

                            Intent myIntent4 = new Intent(MainActivity.this, FAQ.class);
                            startActivityForResult(myIntent4, 0);
                        }*/


                    }
                }
        );
    }
}
