package com.zdn.loginform;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;

import com.google.android.gms.maps.GoogleMap;

public class HomeActivity extends AppCompatActivity {

    //private Button btnLogout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String[] menu = {"Maps", "sms", "call", "Profille Petani"};
        ListAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu);
        ListView lvHome =(ListView) findViewById(R.id.lvHome);
        lvHome.setAdapter(listAdapter);
        lvHome.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
            @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                   if(position == 0) {
                       //Toast.makeText(HomeActivity.this, menu, Toast.LENGTH_SHORT).show();
                       Intent intent = new Intent(view.getContext(), MapsActivity.class);
                       startActivityForResult(intent, 0);
                   }

                }
                }
        );

        //btnLogout = (Button) findViewById(R.id.btnLogout);
        //btnLogout.setOnClickListener(new View.OnClickListener() {
        //    @Override
         //   public void onClick(View view) {
           //     finish();
           // }
        //});

        /*list = (ListView) findViewById(R.id.list);
        myAdapter myadapter = new myAdapter(HomeActivity.this, name, brand, price);
        list.setAdapter(myadapter); */



    }
}
