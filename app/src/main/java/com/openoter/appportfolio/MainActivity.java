package com.openoter.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bt_popular_movies,bt_stock_hawk,bt_build_it_bigger,bt_make_your_app_material,
            btn_go_ubiquitous,btn_capstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        initEvents();
    }

    /***
     * find button
     */
    private void findViews() {
        bt_popular_movies           = (Button) findViewById(R.id.bt_popular_movies);
        bt_stock_hawk               = (Button) findViewById(R.id.bt_stock_hawk);
        bt_build_it_bigger          = (Button) findViewById(R.id.bt_build_it_bigger);
        bt_make_your_app_material   = (Button) findViewById(R.id.bt_make_your_app_material);
        btn_go_ubiquitous           = (Button) findViewById(R.id.btn_go_ubiquitous);
        btn_capstone                = (Button) findViewById(R.id.btn_capstone);
    }

    /**
     * binding event
     */
    private void initEvents() {
        bt_popular_movies.setOnClickListener(this);
        bt_stock_hawk.setOnClickListener(this);
        bt_build_it_bigger.setOnClickListener(this);
        bt_make_your_app_material.setOnClickListener(this);
        btn_go_ubiquitous.setOnClickListener(this);
        btn_capstone.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_popular_movies: //热门电影
                makeToast(bt_popular_movies.getText().toString());
                break;
            case R.id.bt_stock_hawk://股票雄鹰
                makeToast(bt_stock_hawk.getText().toString());
                break;
            case R.id.bt_build_it_bigger: //实现突破
                makeToast(bt_build_it_bigger.getText().toString());
                break;
            case R.id.bt_make_your_app_material: //让应用“材料化”
                makeToast(bt_make_your_app_material.getText().toString());
                break;
            case R.id.btn_go_ubiquitous: //Sunshine
                makeToast(btn_go_ubiquitous.getText().toString());
                break;
            case R.id.btn_capstone: //毕业项目
                makeToast(btn_capstone.getText().toString());
                break;
        }
    }

    private void makeToast(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }


}
