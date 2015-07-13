package net.icepc.vertretungsplan;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CustomViewHolder> {
    private ArrayList<replacementData> data;
    View v;

    // Provide a suitable constructor (depends on the kind of dataset)
    public RecyclerViewAdapter(ArrayList<replacementData> data) {
        this.data = data;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
        // create a new view
        v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_recyclerview, parent, false);
        // set the view's size, margins, paddings and layout parameters
        CustomViewHolder vh = new CustomViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

        // set Text and stuff
        // example:
        // customViewHolder.textView.setText("");

        holder.time.setText(data.get(position).hour+".Std");
        holder.course.setText(data.get(position).course);
        holder.originalRoom.setText(data.get(position).originalRoom);
        holder.replacementRoom.setText(data.get(position).replacementRoom);
        holder.teacher.setText(data.get(position).teacher);
        holder.subject.setText(data.get(position).subject);

        if (data.get(position).canceled == true){
            holder.canceled.setBackgroundColor(v.getContext().getResources().getColor(R.color.accentColor2));
            holder.canceledText.setText("E");
        }
        else {
            holder.canceled.setBackgroundColor(v.getContext().getResources().getColor(R.color.primaryColorDark));
            holder.canceledText.setText("V");
        }

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return data.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView time;
        protected TextView course;
        protected TextView originalRoom;
        protected TextView replacementRoom;
        protected TextView teacher;
        protected TextView subject;
        protected ImageView canceled;
        protected TextView canceledText;

        public CustomViewHolder(View itemView) {
            super(itemView);
            this.time = (TextView) itemView.findViewById(R.id.time);
            this.course = (TextView) itemView.findViewById(R.id.course);
            this.originalRoom = (TextView) itemView.findViewById(R.id.originalRoom);
            this.replacementRoom = (TextView) itemView.findViewById(R.id.replacementRoom);
            this.subject = (TextView) itemView.findViewById(R.id.subject);
            this.canceled = (ImageView) itemView.findViewById(R.id.canceled);
            this.canceledText = (TextView) itemView.findViewById(R.id.canceledText);
            this.teacher = (TextView) itemView.findViewById(R.id.teacher);

        }
    }
}
