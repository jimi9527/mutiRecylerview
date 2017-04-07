package com.example.mutirecylerview;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
    }

    private void initFragment() {

        MutiRecylerviewFragment mutifragment = new MutiRecylerviewFragment();

        FragmentManager fragment = getSupportFragmentManager();
        FragmentTransaction transaction = fragment.beginTransaction();
        if(fragment != null){
            transaction.add(R.id.fragment, mutifragment);
        }else{
            transaction.show(mutifragment);
        }

        transaction.commit();

    }
}
