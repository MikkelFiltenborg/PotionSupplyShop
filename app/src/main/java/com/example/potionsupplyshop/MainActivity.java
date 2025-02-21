package com.example.potionsupplyshop;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            showAdvancedListview();
            return insets;
        });
    }
    List<Wares> inventory = Data.AddData();
    void exampleList()
    {
        List<String> strings = new ArrayList<>();
        strings.add("1st string");
        strings.add("2st string");
        strings.add("3st string");
        strings.add("4st string");

        ArrayAdapter adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, strings);
        ListView lv = findViewById(R.id.lvStringlist);
        lv.setAdapter(adapter);
    }
    void showAdvancedListview()
    {
        List<Wares> inventory = Data.AddData();
        WaresAdapter adapter = new WaresAdapter(this, 0, inventory);
        ListView lv = findViewById(R.id.lvStringlist);
        lv.setAdapter(adapter);
    }
}