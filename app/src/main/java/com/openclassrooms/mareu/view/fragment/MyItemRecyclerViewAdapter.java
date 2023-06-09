package com.openclassrooms.mareu.view.fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.openclassrooms.mareu.R;
import com.openclassrooms.mareu.databinding.FragmentMyMeetingsBinding;
import com.openclassrooms.mareu.events.DeleteMeetingEvent;
import com.openclassrooms.mareu.model.Meeting;

import org.greenrobot.eventbus.EventBus;

import java.util.List;



/**
 * TODO: Replace the implementation with code for your data type.
 */
public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private final List<Meeting> mMeetingList;

    public MyItemRecyclerViewAdapter(List<Meeting> items) {
        mMeetingList = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentMyMeetingsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Meeting meeting = mMeetingList.get(position);
        holder.hourMeeting.setText(mMeetingList.get(position).getReservedHour());
        holder.subjectReu.setText(mMeetingList.get(position).getSubject());
        holder.meetingRoom.setText(mMeetingList.get(position).getRoomReseved());
        holder.meetingGuest.setText(mMeetingList.get(position).getGuests());
        holder.imageMeeting.setImageResource(R.drawable.baseline_meeting_room_24);
        holder.imageDeleteMeeting.setImageResource(R.drawable.baseline_delete_24);

        holder.imageDeleteMeeting.setOnClickListener(v -> {
            Log.d("meetingToDelete", "onClick: "+ meeting);
            EventBus.getDefault().post(new DeleteMeetingEvent(meeting));

        });
    }

    @Override
    public int getItemCount() {
        return mMeetingList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {


        public final TextView meetingRoom;
        public final TextView hourMeeting;
        public final TextView subjectReu;
        public final TextView meetingGuest;
        public ImageView imageMeeting;
        public final ImageView imageDeleteMeeting;


        public ViewHolder(FragmentMyMeetingsBinding binding) {
            super(binding.getRoot());
            meetingRoom = binding.itemListSalle;
            hourMeeting = binding.itemListHeure;
            subjectReu = binding.itemListObjet;
            meetingGuest = binding.itemListGuest;
            imageMeeting = binding.itemImageListReu;
            imageDeleteMeeting = binding.itemListDeleteButton;
        }
    }
}