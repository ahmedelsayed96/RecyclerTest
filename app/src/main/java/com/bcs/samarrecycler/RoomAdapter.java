package com.bcs.samarrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class RoomAdapter  extends  RecyclerView.Adapter<RoomAdapter.MyViewHolder>{

    List<Room> rooms;
    Context context;

    public RoomAdapter(List<Room> rooms,Context context) {
        this.rooms = rooms;
        this.context =context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.message_row,parent,false);
        return new  MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Room room=rooms.get(position);

        holder.friendName.setText(room.Name);
        holder.firendMessage.setText(room.message);
        Picasso.get().load(room.image)
                .placeholder(android.R.drawable.ic_menu_agenda)
                .into(holder.friendImage);


    }

    @Override
    public int getItemCount() {
        return rooms.size();
    }





    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView friendImage;
        TextView friendName;
        TextView firendMessage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            friendImage=itemView.findViewById(R.id.firendImage);
            friendName=itemView.findViewById(R.id.friendNameText);
            firendMessage=itemView.findViewById(R.id.messagetext);

        }
    }
}
