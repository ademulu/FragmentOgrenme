package com.example.lenovo2.fragmentogrenme;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm=getSupportFragmentManager();
    }
    public void butonaTikla(View v){//dinamik olarak fragment ekleme
        switch (v.getId()){
            case R.id.button1:
                FragmentTransaction trans=fm.beginTransaction();
                Fragment1 fragment1=new Fragment1();
                trans.replace(R.id.container,fragment1,"dinamikfrag1");
                trans.addToBackStack(null);
                trans.commit();
                break;

            case R.id.button2:
                FragmentTransaction trans2=fm.beginTransaction();
                Fragment2 fragment2=new Fragment2();
                trans2.replace(R.id.container,fragment2,"dinamikfrag2");
                trans2.addToBackStack(null);
                trans2.commit();
                break;
        }

    }
}
