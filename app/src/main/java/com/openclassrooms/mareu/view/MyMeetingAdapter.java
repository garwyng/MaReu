package com.openclassrooms.mareu.view;

import static com.openclassrooms.mareu.R.layout.meeting_item_row;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.openclassrooms.mareu.R;
import com.openclassrooms.mareu.model.Meeting;

import java.util.List;

public class MyMeetingAdapter extends RecyclerView.Adapter<MyMeetingViewHolder> {

    Context mContext;
    List<Meeting> mMeetingList;

    public MyMeetingAdapter(Context context, List<Meeting> meetingList) {
        mContext = context;
        mMeetingList = meetingList;
    }

    /**
     * @param parent   The ViewGroup into which the new View will be added after it is bound to
     *                 an adapter position.
     * @param viewType The view type of the new View.
     * @return
     */
    @NonNull
    @Override
    public MyMeetingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyMeetingViewHolder(LayoutInflater.from(mContext).inflate(meeting_item_row,parent,false));
    }

    /**
     * @param holder   The ViewHolder which should be updated to represent the contents of the
     *                 item at the given position in the data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull MyMeetingViewHolder holder, int position) {
        holder.hourMeeting.setText(mMeetingList.get(position).getReservedHour());
        holder.subjectReu.setText(mMeetingList.get(position).getSubject());
        holder.meetingRoom.setText(mMeetingList.get(position).getRoomReseved());
        holder.meetingGuest.setText(mMeetingList.get(position).getGuests());
    }

    /**
     * @return
     */
    @Override
    public int getItemCount() {
        return mMeetingList.size();
    }
}
