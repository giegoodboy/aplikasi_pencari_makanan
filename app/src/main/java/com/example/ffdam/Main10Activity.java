package com.example.ffdam;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main10Activity extends AppCompatActivity {

    // Declare Variables
    ListView list;
    AdapterClass adapter;
    SearchView editsearch;
    String[] searchQueries;
    ArrayList<SearchQuery> arraylist = new ArrayList<SearchQuery>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        searchQueries = new String[]{"Nasi Padang", "Roti Panggang", "Burger",
                "Nasi Kuning", "Sate", "Soto", "Ayam Goreng", "Ayam Bakar",
                "Deder","Botok","Pizza"};

        list = (ListView) findViewById(R.id.list_view);
        for (String searchQuery:searchQueries) {
            SearchQuery searchQuery1 = new SearchQuery(searchQuery);
            // Binds all strings into an array
            arraylist.add(searchQuery1);
        }
        adapter = new AdapterClass(this, arraylist);
        list.setAdapter(adapter);
        editsearch = (SearchView) findViewById(R.id.searchView);
        editsearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                String text = newText;
                adapter.filter(text);
                return false;
            }
        });
    }
}
