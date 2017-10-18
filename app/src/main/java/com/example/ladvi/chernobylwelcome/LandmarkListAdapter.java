package com.example.ladvi.chernobylwelcome;

import android.content.Context;
import android.location.LocationManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Jacek on 10/18/2017.
 */

public class LandmarkListAdapter extends BaseAdapter
{
    private static ArrayList<Landmark> landmarkList;
    private LayoutInflater layoutInflater;

    public LandmarkListAdapter(Context context, ArrayList<Landmark> itemList) {
        landmarkList = itemList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return landmarkList.size();
    }

    @Override
    public Object getItem(int position) {
        return landmarkList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.landmark_list_row, null);
            holder = new ViewHolder();
            holder.Image = (ImageView) convertView.findViewById(R.id.landmarkRowImage);
            holder.Title = (TextView) convertView.findViewById(R.id.landmarkRowTitle);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }



        holder.Image.setImageResource(landmarkList.get(position).getImage());
        holder.Title.setText(landmarkList.get(position).getTitle());

        return convertView;
    }

    static class ViewHolder {
        ImageView Image;
        TextView Title;
    }
}
