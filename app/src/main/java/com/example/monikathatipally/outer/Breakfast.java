package com.example.monikathatipally.outer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Breakfast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
        String Break[]={"Hot n Spicy Soynuts Chaat Masala Snack","High Protein Pancake (Eggetarian)","Grilled Meatless Vegetarian Smart Dog","High Protein Bread Sticks Snack","High Protein Ghatia Sticks Snack","No Sev Protein SevPuri Chaat Snack","Protein Masala Vada (Baked) Nuggets","Protein Jalapeno Broccoli Bread (Eggetarian)"};
        // ListAdapter moniadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Calc);
        ListAdapter moniadapter= new Custom(this, Break);

        ListView lv=(ListView)findViewById(R.id.listView2);
        lv.setAdapter(moniadapter);
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String temp=String.valueOf(adapterView.getItemAtPosition(i));
                        // Toast.makeText(MainActivity.this,temp,Toast.LENGTH_SHORT).show();



                    }
                }
        );
    }
}
