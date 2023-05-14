package com.openclassrooms.mareu.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.openclassrooms.mareu.R;
import com.openclassrooms.mareu.model.Meeting;

import java.util.ArrayList;

public class ReuAdapter extends RecyclerView.Adapter<ReuAdapter.ViewHolder> {

    private ArrayList<Meeting> mMeetings;

    public ReuAdapter(ArrayList<Meeting> meetings) {
        this.mMeetings = meetings;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_reu, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.displayReu(mMeetings.get(position));
    }

    @Override
    public int getItemCount() {
        return mMeetings.size() ;
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder{
        /**
         * declaration view's elements
         */
        public final TextView salleReu;
        public final TextView heureReu;
        public final TextView objetReu;
        public final TextView participantReu;
        public final ImageView imageReu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            salleReu = itemView.findViewById(R.id.item_list_salle);
            heureReu = itemView.findViewById(R.id.item_list_heure);
            objetReu = itemView.findViewById(R.id.item_list_objet);
            participantReu= itemView.findViewById(R.id.item_list_guest);
            imageReu = itemView.findViewById(R.id.item_image_list_reu);
        }

        public void displayReu(Meeting meeting) {
            salleReu.setText(meeting.salle.getSalleName());
            heureReu.setText(meeting.heure);
            objetReu.setText(meeting.subject);
            participantReu.setText(meeting.participants.toString());

        }
    }
}
