package com.example.recyclerviewlab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    private final LinkedList<String> mWordList;
    private final LinkedList<String> mDescription;
    private LayoutInflater mInflater;
    class WordViewHolder extends RecyclerView.ViewHolder
    {
        public final TextView wordItemView;
        public final TextView wordItemView2;
        final WordListAdapter mAdpater;
        public WordViewHolder(View itemView, View itemView2, WordListAdapter adapter)
        {
            super(itemView);
            //super(itemView2);
            wordItemView = itemView.findViewById(R.id.txtfooditem);
            wordItemView2 = itemView.findViewById(R.id.txtDescription);
            this.mAdpater = adapter;
        }
    }
    public WordListAdapter(Context context, LinkedList<String> wordlist, LinkedList<String> description)
    {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordlist;
        this.mDescription = description;
    }
    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item,parent,false);
        View mItemView2 = mInflater.inflate(R.layout.wordlist_item,parent,false);
        return new WordViewHolder(mItemView,mItemView2,this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        String mCurrent2 = mDescription.get(position);
        holder.wordItemView.setText(mCurrent);
        holder.wordItemView2.setText(mCurrent2);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }
}
