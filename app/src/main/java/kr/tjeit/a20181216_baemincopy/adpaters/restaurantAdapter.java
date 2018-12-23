package kr.tjeit.a20181216_baemincopy.adpaters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import kr.tjeit.a20181216_baemincopy.R;
import kr.tjeit.a20181216_baemincopy.datas.Restaurant;

public class restaurantAdapter extends ArrayAdapter<Restaurant> {
//    여기가 진짜 중요함!!
    Context mContext;
    List<Restaurant> mList;
    LayoutInflater inf;

    public RestaurantAdapter (Context mContext, List<Restaurant> mList){
        super(mContext, R.layout.restaurant_list_item, mList);

        this.mContext=mContext;
        this.mList=mList;
        this.inf= LayoutInflater.from(mContext);

    }

    @androidx.annotation.NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row==null){
            row = inf.inflate(R.layout.restaurant_list_item, "null");
        }
        return row;
    }
}
