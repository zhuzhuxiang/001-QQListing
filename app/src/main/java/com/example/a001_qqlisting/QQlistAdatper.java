package com.example.a001_qqlisting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class QQlistAdatper extends BaseAdapter {
    private Context context;
    private ArrayList<Message> list;

    public QQlistAdatper(Context context, ArrayList<Message> list) {
        this.context = context;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.qq_item,null);
            holder=new ViewHolder();
            holder.imageView=convertView.findViewById(R.id.iv);
            holder.msg_name=convertView.findViewById(R.id.tv_name);
            holder.msg_content=convertView.findViewById(R.id.tv_content);
            holder.msg_time=convertView.findViewById(R.id.tv_time);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }
        Glide.with(context).load(list.get(position).getImageView())
                .apply(RequestOptions.bitmapTransform(new RoundedCorners(20)))
                .into(holder.imageView);

//        holder.imageView.setImageResource(R.drawable.ic_launcher_background);
        holder.msg_name.setText(list.get(position).getMsg_name());
        holder.msg_content.setText(list.get(position).getMsg_content());
        holder.msg_time.setText(list.get(position).getMsg_time());
        return convertView;
    }

    class ViewHolder{
        ImageView imageView;
        TextView  msg_name;
        TextView msg_content;
        TextView msg_time;
    }
}
