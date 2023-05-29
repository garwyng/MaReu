package com.openclassrooms.mareu.view;


import static android.os.Build.VERSION_CODES.R;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.openclassrooms.mareu.R;
import com.openclassrooms.mareu.model.Meeting;

public class MyMeetingViewHolder extends RecyclerView.ViewHolder {

    public TextView meetingRoom;
    public TextView hourMeeting;
    public TextView subjectReu;
    public TextView meetingGuest;
    public ImageView imageMeeting;

    public MyMeetingViewHolder(@NonNull View itemView) {
        super(itemView);
        meetingRoom = itemView.findViewById(com.openclassrooms.mareu.R.id.item_list_salle);
        hourMeeting = itemView.findViewById(com.openclassrooms.mareu.R.id.item_list_heure);
        subjectReu = itemView.findViewById(com.openclassrooms.mareu.R.id.item_list_objet);
        meetingGuest= itemView.findViewById(com.openclassrooms.mareu.R.id.item_list_guest);
        imageMeeting = itemView.findViewById(com.openclassrooms.mareu.R.id.item_image_list_reu);
    }
}
