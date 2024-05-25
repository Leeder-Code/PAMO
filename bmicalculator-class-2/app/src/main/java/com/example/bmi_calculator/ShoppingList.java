package com.example.bmi_calculator;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ShoppingListAdapter adapter;
    private List<Item> shoppingItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        shoppingItems = new ArrayList<>();
        fillShoppingItems();

        adapter = new ShoppingListAdapter(shoppingItems);
        recyclerView.setAdapter(adapter);
    }

    private void fillShoppingItems() {
        shoppingItems.add(new Item("2 pounds of chicken breasts"));
        shoppingItems.add(new Item("1 gallon of milk"));
        shoppingItems.add(new Item("3 cans of beans"));
        shoppingItems.add(new Item("1 loaf of bread"));
        shoppingItems.add(new Item("5 apples"));
        shoppingItems.add(new Item("2 bags of rice"));
        shoppingItems.add(new Item("1 packet of pasta"));
        shoppingItems.add(new Item("1 jar of peanut butter"));
    }
}