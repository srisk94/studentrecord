package com.example.srima.studentrec;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView list;
    ListView Contact;
    ArrayList<values> contact_data = new ArrayList<values>();
    //values_Adapter cAdapter;
    DBHelper db;
    String Toast_msg;
    Button add_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tex = (TextView) findViewById(R.id.text);
        db = new DBHelper(MainActivity.this);
       db.openDB();
       Contact=(ListView)findViewById(R.id.listu);
        db.Add_Contact("asdfghjk","iuytds");
        String[] countries = db.Get_Contacts();
        //List<values> array = new ArrayList<>();
        // Print out the values to the log
       //int listSize = countries.size();
        for (int i = 0; i <countries.length; i++) {
            Log.i(this.toString(), countries[i]);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list, countries);
        Contact.setAdapter(adapter);
    }
}



