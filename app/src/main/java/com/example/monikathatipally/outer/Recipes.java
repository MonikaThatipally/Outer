package com.example.monikathatipally.outer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Recipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        String rec[]={"Breakfast/Snack","Lunch/Dinner","2 Cup Vegetables","On The Go Options","Diet Tea/Coffe","IP Phase3 Breakfast Ideas","Maintenence Recipes"};
        ListAdapter moniadapter2=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,rec);
        // ListAdapter moniadapter= new Custom(this, Calc);
        ListView lv=(ListView)findViewById(R.id.listView);
        lv.setAdapter(moniadapter2);
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String temp=String.valueOf(adapterView.getItemAtPosition(i));
                        // Toast.makeText(MainActivity.this,temp,Toast.LENGTH_SHORT).show();

                        if (i == 0) {

                            Intent myIntentr = new Intent(Recipes.this, Breakfast.class);
                            startActivityForResult(myIntentr, 0);

                        }
                        if (i == 1) {
                            Intent myIntent2r = new Intent(Recipes.this, Breakfast.class);
                            startActivityForResult(myIntent2r, 0);

                        }
                        /*
                        if (i == 2) {
                            Intent myIntent3 = new Intent(Recipes.this, Reviews.class);
                            startActivityForResult(myIntent3, 0);

                        }
                        if (i == 3) {

                            Intent myIntent4 = new Intent(Recipes.this, Products.class);
                            startActivityForResult(myIntent4, 0);
                        }
                        if (i == 4) {

                            Intent myIntent4 = new Intent(Recipes.this, Diet.class);
                            startActivityForResult(myIntent4, 0);
                        }
                        if (i == 5) {

                            Intent myIntent4 = new Intent(Recipes.this, FAQ.class);
                            startActivityForResult(myIntent4, 0);
                        }*/


                    }
                }
        );
    }
}
