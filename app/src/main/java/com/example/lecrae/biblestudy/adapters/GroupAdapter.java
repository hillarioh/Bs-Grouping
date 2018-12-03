package com.example.lecrae.biblestudy.adapters;


import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lecrae.biblestudy.data.BibleStudyContractor;
import com.example.lecrae.biblestudy.data.BibleStudyDbHelper;
import com.example.lecrae.biblestudy.models.GroupedMembers;
import com.example.lecrae.biblestudy.R;

import java.util.Arrays;
import java.util.List;


public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.ViewHolder> {

    public List<GroupedMembers> groupedMembers;
    Context context;
    public int[] group;

    BibleStudyDbHelper bibleStudyDbHelper;
    SQLiteDatabase db;

    final private MemberClickListener memberClickListener;

    public interface MemberClickListener {

        void onLongGroupClick(int position, View view);

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener {

        public TextView mTextPos, mTextReg;

        public ViewHolder(View itemView2) {

            super(itemView2);

            mTextPos = itemView2.findViewById(R.id.position);
            mTextReg = itemView2.findViewById(R.id.reggg);

            itemView2.setOnLongClickListener(this);

            itemView2.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(final View v) {

//                    Toast.makeText(context, ""+getAdapterPosition(), Toast.LENGTH_SHORT).show();

//                    Toast.makeText(context, ""+groupedMembers.get(getAdapterPosition()).getId(), Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    builder.setTitle("Choose action");

// add a list
                    String[] action = {"Make BS Pastor", " MOVE TO"};
                    builder.setItems(action, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which) {
                                case 0: // horse
//                                    v.setBackgroundColor(getResources.getColor(R.color.colorPrimary));
//                                    v.getResources().getColor(R.color.colorPrimary);
                                    v.setBackgroundColor(Color.GREEN);

                                    ContentValues values = new ContentValues();
                                    values.put(BibleStudyContractor.BibleEntry.MEMBER_STATUS,"YES");

                                    String selection = BibleStudyContractor.BibleEntry.MEMBER_ID +
                                            " LIKE ?";
                                    String[] selectionArgs = {groupedMembers.get(getAdapterPosition()).getId()};

                                    int count = db.update(BibleStudyContractor.BibleEntry.TABLE_1,values,selection,selectionArgs);

                                    Toast.makeText(context, ""+count, Toast.LENGTH_SHORT).show();

                                    break;

                                case 1: // cow
                                    selectGroup(groupedMembers.get(getAdapterPosition()).getId());
                                    break;
                            }
                        }
                    });

// create and show the alert dialog
                    AlertDialog dialog = builder.create();
                    dialog.show();


                    return false;
                }
            });


        }

        public void selectGroup(final String value) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle("Select group ");

            final String strArray[] = new String[group.length];

            for (int i = 0; i < group.length; i++) {
                strArray[i] = String.valueOf(group[i]);
            }


            builder.setItems(strArray, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    ContentValues values1 = new ContentValues();
                    values1.put(BibleStudyContractor.BibleEntry.MEMBER_GROUP,strArray[which]);

                    String selection = BibleStudyContractor.BibleEntry.MEMBER_ID +
                            " LIKE ?";
                    String[] selectionArgs = {value};

                    int count = db.update(BibleStudyContractor.BibleEntry.TABLE_1,values1,selection,selectionArgs);

                    Toast.makeText(context, "" + strArray[which], Toast.LENGTH_SHORT).show();



                }
            });

// create and show the alert dialog
            AlertDialog dialog = builder.create();
            dialog.show();
        }

        @Override
        public boolean onLongClick(View v) {
            int clickedPosition = getAdapterPosition();
            memberClickListener.onLongGroupClick(clickedPosition, v);
            return false;
        }
    }

    public GroupAdapter(List<GroupedMembers> groupedMembers, MemberClickListener memberClickListener, Context context, int[] group) {
        this.groupedMembers = groupedMembers;
        this.memberClickListener = memberClickListener;
        this.context = context;
        this.group = group;
    }


    @NonNull
    @Override
    public GroupAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        bibleStudyDbHelper =new BibleStudyDbHelper(context);
        db = bibleStudyDbHelper.getWritableDatabase();

        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.row2, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GroupAdapter.ViewHolder viewHolder, int i) {

        final GroupedMembers groupedMembers1 = groupedMembers.get(i);

        TextView textView = viewHolder.mTextPos;
        TextView textView1 = viewHolder.mTextReg;

        textView.setText("" + i);
        textView1.setText(groupedMembers1.getId());

//        if (groupedMembers1.getGroup_No()==3) {
//
//            viewHolder.itemView.setBackgroundColor(Color.YELLOW);
//        }

        final String code = groupedMembers.get(i).getId();


    }

    @Override
    public int getItemCount() {

        return groupedMembers.size();
    }


}
