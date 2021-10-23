package com.example.pnu_arena_mvp_10;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class frag_home extends Fragment {

    ArrayList<HomeItem> actors;
    ListView customListView;
    private static HomeAdapter homeAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.frag_home, container, false);

        //data를 가져와서 어답터와 연결해 준다. 서버에서 가져오는게 대부분 이다.
        actors = new ArrayList<HomeItem>();
        actors.add(new HomeItem(R.mipmap.ic_launcher, R.drawable.ic_baseline_star_24,
                R.drawable.ic_baseline_star_border_24, R.drawable.ic_baseline_warning_24,
                "부산광역시 장전동", "부산대학교 학생식당",
                "종합 식당", "4.5"));
        actors.add(new HomeItem(R.mipmap.ic_launcher, R.drawable.ic_baseline_star_24,
                R.drawable.ic_baseline_star_border_24, R.drawable.ic_baseline_warning_24,
                "부산광역시 장전동", "부산대학교 학생식당",
                "종합 식당", "4.5"));
        actors.add(new HomeItem(R.mipmap.ic_launcher, R.drawable.ic_baseline_star_24,
                R.drawable.ic_baseline_star_border_24, R.drawable.ic_baseline_warning_24,
                "부산광역시 장전동", "부산대학교 학생식당",
                "종합 식당", "4.5"));
        actors.add(new HomeItem(R.mipmap.ic_launcher, R.drawable.ic_baseline_star_24,
                R.drawable.ic_baseline_star_border_24, R.drawable.ic_baseline_warning_24,
                "부산광역시 장전동", "부산대학교 학생식당",
                "종합 식당", "4.5"));
        actors.add(new HomeItem(R.mipmap.ic_launcher, R.drawable.ic_baseline_star_24,
                R.drawable.ic_baseline_star_border_24, R.drawable.ic_baseline_warning_24,
                "부산광역시 장전동", "부산대학교 학생식당",
                "종합 식당", "4.5"));
        actors.add(new HomeItem(R.mipmap.ic_launcher, R.drawable.ic_baseline_star_24,
                R.drawable.ic_baseline_star_border_24, R.drawable.ic_baseline_warning_24,
                "부산광역시 장전동", "부산대학교 학생식당",
                "종합 식당", "4.5"));
        actors.add(new HomeItem(R.mipmap.ic_launcher, R.drawable.ic_baseline_star_24,
                R.drawable.ic_baseline_star_border_24, R.drawable.ic_baseline_warning_24,
                "부산광역시 장전동", "부산대학교 학생식당",
                "종합 식당", "4.5"));
        actors.add(new HomeItem(R.mipmap.ic_launcher, R.drawable.ic_baseline_star_24,
                R.drawable.ic_baseline_star_border_24, R.drawable.ic_baseline_warning_24,
                "부산광역시 장전동", "부산대학교 학생식당",
                "종합 식당", "4.5"));
        actors.add(new HomeItem(R.mipmap.ic_launcher, R.drawable.ic_baseline_star_24,
                R.drawable.ic_baseline_star_border_24, R.drawable.ic_baseline_warning_24,
                "부산광역시 장전동", "부산대학교 학생식당",
                "종합 식당", "4.5"));

        customListView = (ListView) rootView.findViewById(R.id.listview);
        homeAdapter = new HomeAdapter(getContext(),actors);
        customListView.setAdapter(homeAdapter);

        //리스트 항목 클릭하면 다른 액티비티로 전환됨
        //final String[] listMenu = getResources().getStringArray(R.array.stores_array);
        //final String[] listContent = getResources().getStringArray(R.array.contents_array);

        customListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), StoreActivity.class); //fragment에서 Activity 불러올 땐 이렇게.
                //intent.putExtra("inside", listContent[position]);
                startActivity(intent);
            }
        });

        return rootView;
    }
}

class HomeItem {
    private int main_img;
    private int star_img;
    private int mystore_img;
    private int warning_img;
    private String locationofstore;
    private String nameofstore;
    private String kindofstore;
    private String star_point;

    public HomeItem(int main_img, int star_img, int mystore_img, int warning_img, String locationofstore, String nameofstore, String kindofstore, String star_point) {
        this.main_img = main_img;
        this.star_img = star_img;
        this.mystore_img = mystore_img;
        this.warning_img = warning_img;
        this.locationofstore = locationofstore;
        this.nameofstore = nameofstore;
        this.kindofstore = kindofstore;
        this.star_point = star_point;
    }

    public int getMain_img() {
        return main_img;
    }

    public int getStar_img() {
        return star_img;
    }

    public int getMystore_img() {
        return mystore_img;
    }

    public int getWarning_img() {
        return warning_img;
    }

    public String getLocationofstore() {
        return locationofstore;
    }

    public String getNameofstore() {
        return nameofstore;
    }

    public String getKindofstore() {
        return kindofstore;
    }

    public String getStar_point() {
        return star_point;
    }
}

