package com.example.cjd38.lab03;

 /*lab 3 for CS 262
  *
  * @author: Cameron Dewey
  * @version: 1.0 9/23/2016
 */

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Lab03 extends AppCompatActivity{
    private EditText pass; // Makes the password editable
    private ImageView image; //makes image a variable that can be controlled\
    private TextView inpass; //makes it possible to make the text "Invalid Password" disappear
    private String password = "";
    private String actualPassword = "cs262";


    //main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab03);
        pass = (EditText) findViewById((R.id.editText));
        image = (ImageView) findViewById((R.id.imageView));
        image.setVisibility(View.GONE);
        inpass = (TextView) findViewById(R.id.textView2);
        inpass.setVisibility(View.GONE);

        //create listener for password field change
        pass.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int i, KeyEvent e){
                password = pass.getText().toString();
                if (password.equals(actualPassword)){
                    image.setVisibility(View.VISIBLE);
                    inpass.setVisibility(View.GONE);
                }
                else{
                    image.setVisibility(View.GONE);
                    inpass.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
    }
}
