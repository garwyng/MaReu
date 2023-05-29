package com.openclassrooms.mareu.view;

import static com.openclassrooms.mareu.controler.MyMeetingApiService.*;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.openclassrooms.mareu.R;
import com.openclassrooms.mareu.controler.MyMeetingApiService;
import com.openclassrooms.mareu.controler.MyMeetingApiServiceInterface;
import com.openclassrooms.mareu.model.Meeting;

import java.util.ArrayList;

public class MeetingRecyclerviewAdapter extends RecyclerView.Adapter<MeetingRecyclerviewAdapter.ViewHolder> {

    public ArrayList<Meeting> mMeetings = ;

    public MeetingRecyclerviewAdapter(ArrayList<Meeting> meetings) {
        this.mMeetings = meetings;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.meeting_item_row, parent, false);
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
        public final TextView meetingRoom;
        public final TextView hourMeeting;
        public final TextView subjectReu;
        public final TextView meetingGuest;
        public final ImageView imageMeeting;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            meetingRoom = itemView.findViewById(R.id.item_list_salle);
            hourMeeting = itemView.findViewById(R.id.item_list_heure);
            subjectReu = itemView.findViewById(R.id.item_list_objet);
            meetingGuest= itemView.findViewById(R.id.item_list_guest);
            imageMeeting = itemView.findViewById(R.id.item_image_list_reu);
        }

        public void displayReu(Meeting meeting) {
            meetingRoom.setText(meeting.getRoomReseved());
            subjectReu.setText(meeting.getSubject());
            meetingGuest.setText(meeting.getGuests());

        }
    }
}
