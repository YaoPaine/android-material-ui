package com.yaopaine.coordinatorylayout.coordinate;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.yaopaine.coordinatorylayout.R;
import com.yaopaine.coordinatorylayout.material.activity.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaopaine on 1/23/18.
 */

public class CoordinateLayoutActivity extends BaseActivity implements TabLayout.OnTabSelectedListener {

    private ViewPager mNewsPager;
    private TabLayout mTableLayout;
    private List<TestFragment> mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinate);
        initView();
    }

    private void initView() {
        mNewsPager = findViewById(R.id.id_uc_news_content);
        mTableLayout = findViewById(R.id.id_uc_news_tab);
        mFragments = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            mFragments.add(TestFragment.newInstance(String.valueOf(i), false));
            mTableLayout.addTab(mTableLayout.newTab().setText("Tab" + i));
        }
        mNewsPager.setAdapter(new TestFragmentAdapter(mFragments, getSupportFragmentManager()));
        mTableLayout.setTabMode(TabLayout.MODE_FIXED);
        mTableLayout.addOnTabSelectedListener(this);
        mTableLayout.setupWithViewPager(mNewsPager);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
