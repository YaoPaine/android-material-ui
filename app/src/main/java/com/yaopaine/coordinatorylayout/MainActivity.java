package com.yaopaine.coordinatorylayout;

import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.yaopaine.coordinatorylayout.material.activity.base.BaseActivity;
import com.yaopaine.coordinatorylayout.toolbar.BadgeActionProvider;

public class MainActivity extends BaseActivity implements BadgeActionProvider.OnClickListener {
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolBar = findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Enable the Up button actionBar.setDisplayOptions();
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        toolBar.setNavigationIcon(R.mipmap.ic_drawer_home);//设置返回按钮
        toolBar.setLogo(R.mipmap.ic_notifications);//设置标题左侧图标
        toolBar.setTitle("Title");
        //toolBar.setTitleTextColor(getResources().getColor(android.R.color.white));
        toolBar.setTitleTextAppearance(this, R.style.tool_bar_title_style);
        toolBar.setSubtitle("Subtitle");
        toolBar.setSubtitleTextAppearance(this, R.style.tool_bar_sub_title_style);
        //toolBar.setSubtitleTextColor(getResources().getColor(android.R.color.white));
        /**
         * 备注：这里inflateMenu(int menu) 在设置了setSupportActionBar后无效，但是点击事件还生效
         */
//        toolBar.inflateMenu(R.menu.main_menu);
//        toolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });
    }

    private MenuItem.OnActionExpandListener mActionExpandListener = new MenuItem.OnActionExpandListener() {
        @Override
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            Log.e("TAG", "onMenuItemActionExpand: " + menuItem.getTitle());
            return true;
        }

        @Override
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            Log.e("TAG", "onMenuItemActionCollapse: " + menuItem.getTitle());
            return true;
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.zhihu_toolbar_menu, menu);

        MenuItem item = menu.findItem(R.id.action_notification);
        BadgeActionProvider actionProvider = (BadgeActionProvider) MenuItemCompat.getActionProvider(item);
        actionProvider.setOnClickListener(this);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        searchItem.setIcon(R.mipmap.ic_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        Log.e("TAG", "actionView: " + searchView);

        item.setOnActionExpandListener(mActionExpandListener);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.e("TAG", "onOptionsItemSelected: " + item.getTitle());
        switch (item.getItemId()) {
            /*case R.id.action_search:
                // User chose the "Settings" item, show the app settings UI...
                return true;*/
            case R.id.action_notification:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                return true;
            case R.id.action_about:
                return true;
            case R.id.action_settings:
                return true;
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        Log.e("TAG", "onClick: " + v);
    }
}
