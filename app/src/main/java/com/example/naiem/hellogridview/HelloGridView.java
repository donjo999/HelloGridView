package com.example.hellogridview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.naiem.hellogridview.ImageAdapter;
import com.example.naiem.hellogridview.R;

public class HelloGridView {
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);

	    GridView gridview = (GridView) findViewById(R.id.gridview);
	    gridview.setAdapter();

	    gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	        public void onItemClick(AdapterView<?> parent, View v,
	                int position, long id) {
	            Toast.makeText(HelloGridView.this, "" + position,
						Toast.LENGTH_SHORT).show();
	        }
	    });
	}



}
