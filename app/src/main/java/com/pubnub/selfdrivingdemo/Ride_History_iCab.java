package com.pubnub.selfdrivingdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.RidehistoryAdapter;
import model.RidehistoryModel;

public class Ride_History_iCab extends AppCompatActivity {

    private RidehistoryAdapter ridehistoryAdapter;
    private RecyclerView recyclerview;
    private ArrayList<RidehistoryModel> ridehistoryModelArrayList;

    Integer i1[]={R.drawable.pin_black,R.drawable.pin_black,R.drawable.pin_black,R.drawable.pin_black,R.drawable.pin_black};
    Integer i2[]={R.drawable.rect_dotted,R.drawable.rect_dotted,R.drawable.rect_dotted,R.drawable.rect_dotted,R.drawable.rect_dotted};
    Integer i3[]={R.drawable.navigatiob_blue,R.drawable.navigatiob_blue,R.drawable.navigatiob_blue,R.drawable.navigatiob_blue,R.drawable.navigatiob_blue};
    String txtmall[]={"Phoenix Market City","Phoenix Market City","Phoenix Market City","Phoenix Market City","Phoenix Market City"};
    String txthome[]={"Home","Home","Home","Home","Home"};
    String txtdate[]={"01 May 2018","01 May 2018","01 May 2018","01 May 2018","01 May 2018"};
    String txtprice[]={"$2.94","$2.94","$2.94","$2.94","$2.94"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride__history_i_cab);

        recyclerview=findViewById(R.id.recycler1);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Ride_History_iCab.this);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        ridehistoryModelArrayList = new ArrayList<>();

        for (int i=0;i<i1.length;i++){

            RidehistoryModel listModel = new RidehistoryModel(i1[i],i2[i],i3[i],txtmall[i],txthome[i],txtdate[i],txtprice[i]);

            ridehistoryModelArrayList.add(listModel);

        }
        ridehistoryAdapter = new RidehistoryAdapter(Ride_History_iCab.this,ridehistoryModelArrayList);
        recyclerview.setAdapter(ridehistoryAdapter);



    }
}
