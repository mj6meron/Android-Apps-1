package com.example.recipe_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recipes = populateData()

        // Importing
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val generatedName = findViewById<TextView>(R.id.generatedName)
        val generatedName2 = findViewById<TextView>(R.id.generatedName2)
        val generatedDetails = findViewById<TextView>(R.id.generatedDetails)
        val topDiv = findViewById<LinearLayout>(R.id.topDiv)
        //var imageRecipe = findViewById<ImageView>(R.id.imageRecipe)

        button1.setOnClickListener {
            generatedName.text = recipes[0].name
            generatedName2.text = recipes[0].name2
            generatedDetails.text = recipes[0].details
            topDiv.setBackgroundResource(R.drawable.image_gwyneth)
        }

        button2.setOnClickListener {
            generatedName.text = recipes[1].name
            generatedName2.text = recipes[1].name2
            generatedDetails.text = recipes[1].details
            topDiv.setBackgroundResource(R.drawable.image_martha)
        }

        button3.setOnClickListener {
            generatedName.text = recipes[2].name
            generatedName2.text = recipes[2].name2
            generatedDetails.text = recipes[2].details
            topDiv.setBackgroundResource(R.drawable.image_arthur)
        }

        button4.setOnClickListener {
            generatedName.text = recipes[3].name
            generatedName2.text = recipes[3].name2
            generatedDetails.text = recipes[3].details
            topDiv.setBackgroundResource(R.drawable.image_fluffy)
        }
    }
}


// Regarding data and populating it
data class Recipe(var name: String = "",
                  var name2: String = "",
                  var details: String = "",
                  var imageId: String = "")

fun populateData(): ArrayList<Recipe> {
    val gwyneth = Recipe("Gwyneth’s Dad’s “World Famous” Pancakes",
        "The Pretty Good Pancake That Ultimately Fell Flat",
        "Though Gwyneth’s dad may seem like an unlikely pick for a pancake recipe," +
                " we were intrigued that his pancakes are adapted from Joy of Cooking. " +
                "The bulk of the batter gets mixed up the night before, " +
                "and it makes a huge batch that cook up pretty thin. ",
        "image_gwyneth")
    val martha = Recipe ( "Martha Stewart’s Old Fashioned Pancake Recipe",
        "The Easy-But-Kinda-Boring Pantry Pancake",
        "Martha Stewart’s Old Fashioned Pancakes can probably be pulled off from ingredients in your pantry, " +
                "making it a great weekday recipe. It’s super-simple and solid, " +
                "but is it special? Nope. Is it light and fluffy? " +
                "Not especially. Does it get tasty pancakes on the table? Absolutely.",
        "image_martha")
    val arthur = Recipe ("King Arthur Flour’s Simply Perfect Pancake",
        "The Best Diner-Style Pancake",
        "These pancakes have a lot going for them. You’ll whip together the whole eggs and milk," +
                " which makes for a lofty pancake without the fuss of separating and " +
                "whipping egg whites first thing in the morning. " +
                "They’re also distinctly flavorful, thanks to the addition of malted milk powder. ",
        "image_arthur")
    val fluffy = Recipe("Serious Eats’ Light and Fluffy Pancakes",
        "The Absolute Best Pancake Recipe",
        "We love and stand by Kitchn’s own Lofty Pancake recipe, " +
                "which includes folding whipped egg whites into the batter. " +
                "Even though this recipe is a little fussy, the smart addition of sour cream" +
                " made for a really special pancake that is more than worth the effort.",
        "image_fluffy")

    return arrayListOf( gwyneth, martha, arthur, fluffy)
}


