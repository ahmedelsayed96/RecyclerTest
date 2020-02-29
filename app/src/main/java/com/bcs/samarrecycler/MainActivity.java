package com.bcs.samarrecycler;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView messageRecyclerView;
    String image1="https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.pexels.com%2Fphotos%2F614810%2Fpexels-photo-614810.jpeg%3Fauto%3Dcompress%26cs%3Dtinysrgb%26dpr%3D1%26w%3D500&imgrefurl=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fface%2F&tbnid=HVo2yp17IUCWqM&vet=12ahUKEwja9q6-j_fnAhULwoUKHXR0BhMQMygAegUIARCIAg..i&docid=Bg0wwhYqbH9NmM&w=500&h=427&q=face%20image&ved=2ahUKEwja9q6-j_fnAhULwoUKHXR0BhMQMygAegUIARCIAg";
    String image2 ="https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.unsplash.com%2Fphoto-1542080681-b52d382432af%3Fixlib%3Drb-1.2.1%26ixid%3DeyJhcHBfaWQiOjEyMDd9%26w%3D1000%26q%3D80&imgrefurl=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fface&tbnid=2LTOAMaWnJ9NvM&vet=12ahUKEwja9q6-j_fnAhULwoUKHXR0BhMQMygBegUIARCKAg..i&docid=w0nmBSuXplOpiM&w=1000&h=1500&q=face%20image&ved=2ahUKEwja9q6-j_fnAhULwoUKHXR0BhMQMygBegUIARCKAg";
    String image3="https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80";
    String image4 ="https://image.shutterstock.com/image-photo/beautiful-face-young-woman-clean-260nw-149962697.jpg";
    // 1- Model ----> Done

    //2- Layout  ---- > Done

    // 3- Adapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageRecyclerView=findViewById(R.id.messageRecycler);

        List<Room> rooms =new ArrayList<>();
        rooms.add(new Room(image1,"Ahmed","someText"));
        rooms.add(new Room(image2,"Mohamed","someText2"));
        rooms.add(new Room(image3,"Samar","someText3"));
        rooms.add(new Room(image4,"Al","someText4"));
        rooms.add(new Room("http://i.imgur.com/DvpvklR.png","iomage","someText4"));


        RoomAdapter adapter=new RoomAdapter(rooms,this);


        messageRecyclerView.setAdapter(adapter);

        messageRecyclerView.setLayoutManager(
                new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        );



    }

}

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//}
