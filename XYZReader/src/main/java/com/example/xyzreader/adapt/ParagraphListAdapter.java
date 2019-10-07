package com.example.xyzreader.adapt;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xyzreader.R;

public class ParagraphListAdapter extends RecyclerView.Adapter<ParagraphListAdapter.ParagraphHolder> {
    private String [] mParagraphs;

    public void setParagraphs(String [] paragraphs) {
        mParagraphs = paragraphs;
    }

    @Override
    public ParagraphHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutId = R.layout.list_item_paragraph;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(
                layoutId,
                parent,
                false
        );
        return new ParagraphHolder(view);
    }

    @Override
    public void onBindViewHolder(ParagraphHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mParagraphs.length;
    }

    class ParagraphHolder extends RecyclerView.ViewHolder {
        TextView mParagraph;

        ParagraphHolder(View itemView) {
            super(itemView);
            mParagraph = (TextView) itemView.findViewById(R.id.tv_paragraph);
        }

        void bind (int position) {
            mParagraph.setText(mParagraphs[position]);
        }
    }
}
