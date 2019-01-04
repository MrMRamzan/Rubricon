package com.mad.rubricon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AddCloActivity extends AppCompatActivity {

    ListView addClo;
    String [] CLOs = {"CLO 1","CLO 2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_clo);

        addClo =findViewById(R.id.cloList);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, CLOs);

        addClo.setAdapter(adapter);
    }

    public void AddClo(View view){
        startActivity(new Intent(this,CloSubCategoryActivity.class));
    }
}