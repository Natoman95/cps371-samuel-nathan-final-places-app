package com.example.tkdsa.cards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initializeData();

        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);



        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(llm);






        RVAdapter adapter = new RVAdapter(cards);
        rv.setAdapter(adapter);

    }

    private List<cardLocation> cards;

    private void initializeData() {
        cards = new ArrayList<>();
        cards.add(new cardLocation("Burger", "Burder Address", R.drawable.logo));
        cards.add(new cardLocation("Dinner", "Dinner Address", R.drawable.ic_action_name));
    }


}
