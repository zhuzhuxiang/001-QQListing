package com.example.a001_qqlisting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    private ArrayList<Message> list;
    private ListView listView;

    private ImageView iv_glide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lv);
        iv_glide=findViewById(R.id.iv_glide);


        String url = "https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=5&spn=0&di=7214885350303334401&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=2827879057%2C1057145291&os=2272107334%2C3936113497&simid=3410591501%2C272030914&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=%E5%9B%BE%E7%89%87&objurl=https%3A%2F%2Flmg.jj20.com%2Fup%2Fallimg%2Ftp09%2F210H51R3313N3-0-lp.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3B33da_z%26e3Bv54AzdH3FprAzdH3Fnnbdna_z%26e3Bip4s&gsm=&islist=&querylist=&dyTabStr=MCwxLDYsMyw0LDUsMiw3LDgsOQ%3D%3D";

        Glide.with(this)
                .load(url)
                .into(iv_glide);
//        getMsg();
//
//        QQlistAdatper qlistAdatper = new QQlistAdatper(this, list);
//        listView.setAdapter(qlistAdatper);
    }






    private void getMsg() {
       //   http://www.sinaimg.cn/qc/photo_auto/photo/72/69/39277269/39277269_140.jpg   可显示链接 1
        //  http://b.hiphotos.baidu.com/zhidao/pic/item/faedab64034f78f066abccc57b310a55b3191c67.jpg   可显示链接2

       // https://b247.photo.store.qq.com/psb?/V11ZojBI312o2K/63aY8a4M5quhi.78*krOo7k3Gu3cknuclBJHS3g1fpc!/b/dDXWPZMlBgA  网上可显示链接


     //https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=5&spn=0&di=7214885350303334401&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=2827879057%2C1057145291&os=2272107334%2C3936113497&simid=3410591501%2C272030914&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=%E5%9B%BE%E7%89%87&objurl=https%3A%2F%2Flmg.jj20.com%2Fup%2Fallimg%2Ftp09%2F210H51R3313N3-0-lp.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3B33da_z%26e3Bv54AzdH3FprAzdH3Fnnbdna_z%26e3Bip4s&gsm=&islist=&querylist=&dyTabStr=MCwxLDYsMyw0LDUsMiw3LDgsOQ%3D%3D"



        String url = "https://b247.photo.store.qq.com/psb?/V11ZojBI312o2K/63aY8a4M5quhi.78*krOo7k3Gu3cknuclBJHS3g1fpc!/b/dDXWPZMlBgA";
        list = new ArrayList<>();
        Message msg = new Message(url, "世界房产大户1", "大哥请喝冰阔落:厉害了1", "2023-5-8");
        list.add(msg);
    }
}
