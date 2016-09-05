package com.t3h.kidandparent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mImageLearnToWrite;
    private ImageView mImageAlphabet;
    private ImageView mImageMomAndKid;
    private ImageView mImageVideo;
    private ImageView mImageStory;
    private ImageView mImageGame;
    private Toolbar mToolbar;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewBys();
        init();
        setEvent();
        initToolbar();
    }

    private void findViewBys() {
        mImageLearnToWrite = (ImageView) findViewById(R.id.img_learntowrite);
        mImageAlphabet = (ImageView) findViewById(R.id.img_alphabet);
        mImageMomAndKid = (ImageView) findViewById(R.id.img_momandkid);
        mImageVideo = (ImageView) findViewById(R.id.videoforkid);
        mImageStory = (ImageView) findViewById(R.id.img_story);
        mImageGame = (ImageView) findViewById(R.id.img_game);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
    }

    private void init() {

    }

    private void setEvent() {
        mImageLearnToWrite.setOnClickListener(this);
        mImageAlphabet.setOnClickListener(this);
        mImageMomAndKid.setOnClickListener(this);
        mImageVideo.setOnClickListener(this);
        mImageStory.setOnClickListener(this);
        mImageGame.setOnClickListener(this);
    }

    private void initToolbar() {
        setSupportActionBar(mToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.aciton_setting:
                break;
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_learntowrite:
                break;
            case R.id.img_alphabet:
                break;
            case R.id.img_momandkid:
                break;
            case R.id.img_story:
                break;
            case R.id.img_game:
                break;
            case R.id.videoforkid:
                break;
            default:
                break;
        }
    }
}
