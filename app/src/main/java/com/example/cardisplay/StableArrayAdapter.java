package com.example.cardisplay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.HashMap;
import java.util.List;

public class StableArrayAdapter extends ArrayAdapter<Car> {
    //    declare and init map used to keep track of data
    private HashMap<Car, Integer> idMap = new HashMap<>();

    //    Declare context and data to be available in the class scope
    private Context context;
    private List<Car> data;

    //    Create constructor and pass value from constructor to the super class/parent
    StableArrayAdapter(Context context, List<Car> data) {
        super(context, R.layout.car_card, data);

//        Init context and data
        this.context = context;
        this.data = data;

        for (int i = 0; i < data.size(); i++) {
            idMap.put(data.get(i), i);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//         Declare and Init LayoutInflater
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

//        Declare and Init the view we want to use
        View itemView = inflater.inflate(R.layout.car_card, parent, false);

//        Declare and Init the children of the view
//        TextView tvName = itemView.findViewById(R.id.tv_name);
//        TextView tvDob = itemView.findViewById(R.id.tv_dob);
//        ImageView ivImage = itemView.findViewById(R.id.iv_image);

//        Get value/object at current position
        Car person = data.get(position);

//        Use value/object with children of the views
//        tvName.setText(person.getName());
//        tvDob.setText(person.getSeatCount());
//        tvDob.setText(person.getSeatCount());
//        tvDob.setText(person.getSeatCount());
//        tvDob.setText(person.getSeatCount());
//        tvDob.setText(person.getSeatCount());
//        tvDob.setText(person.getSeatCount());

        String imageUri = "https://boygeniusreport.files.wordpress.com/2016/11/puppy-dog.jpg?quality=98&strip=all";



//        Glide.with(context)
//                .load(imageUri)
//                .centerCrop()
//                .into(ivImage);

//        Return the view
        return itemView;
    }

    public long getItemId(int position) {
        Car item = getItem(position);
        return idMap.get(item);
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }
}
