package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pubnub.selfdrivingdemo.Book_icab;
import com.pubnub.selfdrivingdemo.Home;
import com.pubnub.selfdrivingdemo.In_Ride_icab;
import com.pubnub.selfdrivingdemo.Login_icab;
import com.pubnub.selfdrivingdemo.Menu_icab1;
import com.pubnub.selfdrivingdemo.R;
import com.pubnub.selfdrivingdemo.Ride_History_iCab;
import com.pubnub.selfdrivingdemo.Ride_complete_rating_icab;
import com.pubnub.selfdrivingdemo.Sign_Up_icab;

import java.util.ArrayList;

import model.ListModel;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    Context context;
    private ArrayList<ListModel> listModelArrayList;

    public ListAdapter(Context context, ArrayList<ListModel> listModelArrayList) {
        this.context = context;
        this.listModelArrayList = listModelArrayList;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, final int position) {
        holder.title.setText(listModelArrayList.get(position).getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0){
                    Intent i = new Intent(context, Login_icab.class);
                    context.startActivity(i);}
                if(position==1){
                    Intent i = new Intent(context, Sign_Up_icab.class);
                    context.startActivity(i);}
                if(position==2){
                    Intent i = new Intent(context, Home.class);
                    context.startActivity(i);}
                if(position==3){
                    Intent i = new Intent(context, Book_icab.class);
                    context.startActivity(i);}
                if(position==4){
                    Intent i = new Intent(context, In_Ride_icab.class);
                    context.startActivity(i);}

                if(position==5){
                    Intent i = new Intent(context,Ride_complete_rating_icab.class);
                    context.startActivity(i);}
                if(position==6){
                    Intent i = new Intent(context, Ride_History_iCab.class);
                    context.startActivity(i);}
                if(position==7){
                    Intent i = new Intent(context, Menu_icab1.class);
                    context.startActivity(i);}

            }
        });

    }

    @Override
    public int getItemCount() {
        return listModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.title);
        }
    }
}
