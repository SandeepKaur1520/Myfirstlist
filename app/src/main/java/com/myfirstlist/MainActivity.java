package com.myfirstlist;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvList;
    LinearLayoutManager layoutManager;
    TextView textView;
    RatingBar ratingBar;
    TextView tvPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        rvList = findViewById(R.id.rvList);
        textView = findViewById(R.id.tvtext);
        ratingBar = findViewById(R.id.ratingBar);
        tvPrice = findViewById(R.id.tvPrice);
        layoutManager = new LinearLayoutManager(MainActivity.this);
        rvList.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        String[] Product_info = {"the beautiful magenta dress with dashing looking", "dress1", "dress2", "dress3", "dress4", "dress5"};
        String[] Product_image = {"https://cdn.shopify.com/s/files/1/2686/6438/products/2018-New-Girls-Dresses-Summer-Baby-Girls-Princess-Dress-For-Party-Kids-Cute-Dresses-For-Girls_1024x1024.jpg?v=1544240804",
                "https://www.shoppershook.com/wp-content/uploads/2018/04/2017-Petal-hem-Girls-Wedding-Dress-infantil-Fancy-princess-dress-girl-for-girls-clothes-tutu-dresses_53-1.jpg",
                "https://mypreciouslittleone.com/wp-content/uploads/2017/02/Rose-Flower-Princess-Dress-for-Girls-Pink-1.jpg",
                "https://www.rachelallan.com/uploads/products/1741-17.jpg",
                "https://www.rachelallan.com/uploads/products/1738-71.jpg"
        };
        rvList.setAdapter(new CustomAdapter(Product_info, MainActivity.this, Product_image));
    }
}


       /* listAdapter=new MyListAdapter();
        rvList.setAdapter(listAdapter);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
    }*/

