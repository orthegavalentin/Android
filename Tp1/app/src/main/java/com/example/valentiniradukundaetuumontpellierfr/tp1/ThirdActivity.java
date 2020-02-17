package com.example.valentiniradukundaetuumontpellierfr.tp1;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends ListActivity {
    static final String[] fruits = new String []{
            "Blueberry", "Coconut", "Durian", "Guava", "Kiwifruit","Jackfruit",
            "Mango", "Olive", "Pear", "Sugar-apple"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_fruit);
        setListAdapter(new ArrayAdapter<String>(this,R.layout.list_fruit,fruits));
        ListView listView=getListView();
      //  listView.setTextFilterEnabled(true);
        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),((TextView)view).getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}
