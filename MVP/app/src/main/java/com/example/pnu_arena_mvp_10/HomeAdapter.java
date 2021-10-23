package com.example.pnu_arena_mvp_10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeAdapter extends ArrayAdapter implements AdapterView.OnItemClickListener {

    private Context context;
    private List homeItems;

    class ViewHolder {
        public TextView locationofstore, nameofstore, kindofstore, star_point;
        public ImageView star_img, warning_img, main_img, mystore_img;
    }


    public HomeAdapter(Context context, ArrayList<HomeItem> homeItems) {
        super(context, 0, homeItems);
        this.context = context;
        this.homeItems = homeItems;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder homeItemView;

        if (convertView==null){
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            convertView = layoutInflater.inflate(R.layout.frag_home_list, parent, false);
        }

        homeItemView = new ViewHolder();
        homeItemView.locationofstore = convertView.findViewById(R.id.locationofstore);
        homeItemView.nameofstore = convertView.findViewById(R.id.nameofstore);
        homeItemView.kindofstore = convertView.findViewById(R.id.kindofstore);
        homeItemView.star_point = convertView.findViewById(R.id.star_point);
        homeItemView.star_img = convertView.findViewById(R.id.star_img);
        homeItemView.warning_img = convertView.findViewById(R.id.warning_img);
        homeItemView.main_img = convertView.findViewById(R.id.main_img);
        homeItemView.star_img = convertView.findViewById(R.id.star_img);

        /*HomeItem item = (HomeItem) homeItems.get(position);
        homeItemView.nameofstore.setText((item.getNameofstore()));
        homeItemView.kindofstore.setText((item.getKindofstore()));
        homeItemView.locationofstore.setText((item.getLocationofstore()));
        homeItemView.star_point.setText((item.getStar_point()));
        homeItemView.main_img.setTag((item.getMain_img()));
        homeItemView.mystore_img.setTag((item.getMystore_img()));
        homeItemView.star_img.setTag((item.getStar_img()));
        homeItemView.warning_img.setTag((item.getWarning_img()));*/

        return convertView;
    }

}
