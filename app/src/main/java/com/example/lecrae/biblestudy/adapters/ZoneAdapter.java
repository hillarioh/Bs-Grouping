package com.example.lecrae.biblestudy.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lecrae.biblestudy.models.GroupedMembers;
import com.example.lecrae.biblestudy.R;

import java.util.ArrayList;
import java.util.List;

public class ZoneAdapter extends RecyclerView.Adapter<ZoneAdapter.ViewHolder>  {

    private List<GroupedMembers> groupedMembers;
    private Context context;
    private int[] group;
    private List<GroupedMembers> groupedMembersList;

    private GroupAdapter groupAdapter;

    private LinearLayoutManager lln;


    final private ListItemClickListener mlistItemClickListener;
    GroupAdapter.MemberClickListener memberClickListener;


    public interface ListItemClickListener {
        void onLongClick(int position,View view );
    }



    public ZoneAdapter(List<GroupedMembers> groupedMembers, Context context, int[] group,
                       ListItemClickListener mlistItemClickListener, GroupAdapter.MemberClickListener memberClickListener){
        this.groupedMembers=groupedMembers;
        this.context=context;
        this.group=group;
        this.mlistItemClickListener = mlistItemClickListener;
        this.memberClickListener=memberClickListener;

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener{

        public TextView grpText;
        public RecyclerView innerrecyl;

        public ViewHolder(View viewItem){

            super(viewItem);

//            Context context = itemView.getContext();
            grpText = viewItem.findViewById(R.id.textGroup);

            innerrecyl = (RecyclerView) viewItem.findViewById(R.id.innercyl);
//            innerrecyl.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));

            viewItem.setOnLongClickListener(this);

        }

        @Override
        public boolean onLongClick(View v) {
            int clickedPosition = getAdapterPosition();
            mlistItemClickListener.onLongClick(clickedPosition,v);
            return false;
        }
    }


    @NonNull
    @Override
    public ZoneAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);


        View zoneView = inflater.inflate(R.layout.row,viewGroup,false);

        ViewHolder viewHolder = new ViewHolder(zoneView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ZoneAdapter.ViewHolder viewHolder, int i) {

        LinearLayoutManager mLayoutManager;

        groupedMembersList = new ArrayList<>();

        for (int j=0;j<groupedMembers.size();j++){

            if (groupedMembers.get(j).getGroup_No()==i){
                groupedMembersList.add(groupedMembers.get(j));
            }

        }

        TextView textView=viewHolder.grpText;
        textView.setText(""+(group[i]+1));

        mLayoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        viewHolder.innerrecyl.setLayoutManager(mLayoutManager);

        groupAdapter = new GroupAdapter(groupedMembersList,memberClickListener,context,group);
        viewHolder.innerrecyl.setAdapter(groupAdapter);


//        textView.setText(""+groupedMembers1.getGroup_No());




    }

    @Override
    public int getItemCount() {
//        return groupedMembers.size();
        return group.length;
    }


}
