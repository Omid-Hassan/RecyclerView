package com.example.recyclerviewlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mWordList = new LinkedList<>();
    private final LinkedList<String> mDescriptions = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWordList.addLast("Frozen Zabaglione");
        mDescriptions.addLast("Marsala wine is the star of the show in this frozen treat. " +
                "It gets mixed up with egg yolks, sugar, and salt over a double boiler until thickened before whipped cold heavy cream is folded in. " +
                "Then it's wrapped, covered, and frozen! Easy, luxurious, and sure to please guests--and no ice cream machine is necessary");
        mWordList.addLast("Air Fryer Chicken Thighs");
        mDescriptions.addLast("These juicy chicken thighs are done in under 30 minutes and the air fryer makes it so easy!");
        mWordList.addLast("Butter Swim Biscuits");
        mDescriptions.addLast("These fluffy biscuits are literally swimming in butter! This biscuit-making method gives you the richest and tastiest biscuits ever!");
        mWordList.addLast("Sourdough Blueberry Muffins");
        mDescriptions.addLast("\"Slightly dense and bursting with blueberries. I've used unfed sourdough starter discard in this recipe but active sourdough can also be used. Muffins made with active sourdough will be slightly fluffier.\" ");
        mWordList.addLast("Grilled Italian Sausage with Peppers and Onions");
        mDescriptions.addLast("\"Italian sausage, bell peppers, and onions made easy on the grill. You can also serve the sausage in hot dog buns and finely chop the veggies once grilled as a \"relish\". I like to add a squirt of mustard when I serve them this way.\" ");
        mWordList.addLast("Easy No-Bake Strawberry Ice Cream Cake");
        mDescriptions.addLast("It's hard to find a summer dessert easier and more refreshing than this combination of strawberry ice cream and a purchased 10-inch angel food cake! Layers of cake and ice cream, frosted with a purchased frozen whipped topping, are stored in the freezer until you are ready to garnish and slice. This should keep, covered, in the freezer for a week or two. I've never been able to find out exactly how long it will store, because it's usually gone in a few days!");

        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapter(this, mWordList, mDescriptions);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}