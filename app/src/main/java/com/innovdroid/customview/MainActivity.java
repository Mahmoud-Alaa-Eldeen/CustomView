package com.innovdroid.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //LayoutInflater muInflater = LayoutInflater.from(MainActivity.this);

      LayoutInflater muInflater=getLayoutInflater();

        View myView=muInflater.inflate(R.layout.welcome_view,(ViewGroup)findViewById(R.id.contentLayout));
        TextView txtv=(TextView)myView.findViewById(R.id.textView3);
        Button btn=(Button)myView.findViewById(R.id.button);
        txtv.setText("Welcome from my inflater !");

        btn.setText("Click from inflater");
        // working with toast
        Toast toast=new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(myView);
        setContentView(R.layout.activity_main);
    }
}
