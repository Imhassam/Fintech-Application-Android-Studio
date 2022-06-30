//package com.internship.bank_sparks;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.google.android.material.button.MaterialButton;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class signin extends AppCompatActivity  {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        TextView username =(TextView) findViewById(R.id.username);
//        TextView password =(TextView) findViewById(R.id.password);
//
//        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
//
//        //admin and admin
//
//        loginbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
//                    //correct
//                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
//                }else
//                    //incorrect
//                    Toast.makeText(MainActivity.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}
package com.internship.bank_sparks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signin extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);


        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);
        TextView otp =(TextView) findViewById(R.id.otptxt);

        Button loginbtn = (Button) findViewById(R.id.loginbtn);
        Button otpbtn = (Button) findViewById(R.id.otpbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("Hassam") && password.getText().toString().equals("1234")){
                    //correct

                    startActivity(new Intent(signin.this,MainActivity.class));
                }else
                    //incorrect
                    Toast.makeText(signin.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
            }
        });
        otpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(signin.this,"OTP SEND !!!",Toast.LENGTH_SHORT).show();

            }
        });
    }
}