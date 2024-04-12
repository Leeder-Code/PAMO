package com.example.bmi_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Recipes extends AppCompatActivity {

    TextView recipesText;
    List<String> recipes = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fillRecipes();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        recipesText = findViewById(R.id.displayRecipe);

        Button getRecipesButton = findViewById(R.id.getRecipe);

        getRecipesButton.setOnClickListener(v -> {
            Random rand = new Random();
            int randomIndex = rand.nextInt(recipes.size());
            String randomRecipe = recipes.get(randomIndex);
            recipesText.setText(randomRecipe);
        });

    }
    protected void fillRecipes(){
        recipes.add("Classic Spaghetti Carbonara:\n" +
                "Ingredients:\n" +
                "- 8 ounces spaghetti\n" +
                "- 4 slices bacon, diced\n" +
                "- 2 cloves garlic, minced\n" +
                "- 2 large eggs\n" +
                "- 1/2 cup grated Parmesan cheese\n" +
                "- Salt and pepper to taste\n" +
                "Instructions:\n" +
                "1. Cook spaghetti according to package instructions. Reserve 1/2 cup of pasta water, then drain the spaghetti.\n" +
                "2. In a skillet, cook bacon until crispy. Add minced garlic and cook until fragrant.\n" +
                "3. In a bowl, whisk together eggs, Parmesan cheese, and a pinch of salt and pepper.\n" +
                "4. Add cooked spaghetti to the skillet with bacon and garlic. Remove from heat and quickly stir in the egg mixture, using the residual heat to cook the eggs and create a creamy sauce. If too thick, add reserved pasta water.\n" +
                "5. Serve immediately with extra Parmesan cheese on top.\n");

        recipes.add("Vegetable Stir-Fry:\n" +
                "Ingredients:\n" +
                "- Assorted vegetables (bell peppers, broccoli, carrots, snap peas, etc.), sliced\n" +
                "- 2 tablespoons soy sauce\n" +
                "- 1 tablespoon oyster sauce\n" +
                "- 1 tablespoon sesame oil\n" +
                "- 2 cloves garlic, minced\n" +
                "- 1 teaspoon grated ginger\n" +
                "- Cooked rice or noodles, for serving\n" +
                "Instructions:\n" +
                "1. Heat sesame oil in a large skillet or wok over medium-high heat. Add garlic and ginger, and cook until fragrant.\n" +
                "2. Add vegetables to the skillet and stir-fry until crisp-tender.\n" +
                "3. In a small bowl, mix soy sauce and oyster sauce. Pour over the vegetables and toss to coat evenly.\n" +
                "4. Continue cooking for another minute or two, then remove from heat.\n" +
                "5. Serve hot over cooked rice or noodles.\n");

        recipes.add("Grilled Lemon Herb Chicken:\n" +
                "Ingredients:\n" +
                "- 4 boneless, skinless chicken breasts\n" +
                "- 2 tablespoons olive oil\n" +
                "- Zest and juice of 1 lemon\n" +
                "- 2 cloves garlic, minced\n" +
                "- 1 teaspoon dried thyme\n" +
                "- 1 teaspoon dried rosemary\n" +
                "- Salt and pepper to taste\n" +
                "Instructions:\n" +
                "1. In a bowl, whisk together olive oil, lemon zest, lemon juice, minced garlic, thyme, rosemary, salt, and pepper.\n" +
                "2. Place chicken breasts in a resealable plastic bag or shallow dish. Pour the marinade over the chicken, ensuring it's evenly coated. Marinate in the refrigerator for at least 30 minutes, or up to 4 hours.\n" +
                "3. Preheat grill to medium-high heat. Remove chicken from marinade and discard excess marinade.\n" +
                "4. Grill chicken for 6-8 minutes per side, or until cooked through and no longer pink in the center.\n" +
                "5. Serve hot with your favorite side dishes.\n");
    }
}