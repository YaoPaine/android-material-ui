package com.yaopaine.coordinatorylayout.material.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yaopaine.coordinatorylayout.R;
import com.yaopaine.coordinatorylayout.material.activity.bs.BottomSheetsDemoActivity;
import com.yaopaine.coordinatorylayout.material.activity.bt.BarTabDemoActivity;
import com.yaopaine.coordinatorylayout.material.activity.cardview.CardViewDemoActivity;
import com.yaopaine.coordinatorylayout.material.activity.collapsing.CollapsingDemoActivity;
import com.yaopaine.coordinatorylayout.material.activity.listview.ListViewDemoActivity;
import com.yaopaine.coordinatorylayout.material.activity.navigation.NavigationDemoActivity;
import com.yaopaine.coordinatorylayout.material.activity.recycler.RecyclerDemoActivity;
import com.yaopaine.coordinatorylayout.material.activity.snackbar.SnackBarDemoActivity;
import com.yaopaine.coordinatorylayout.material.activity.toolbar.ToolDemoActivity;
import com.yaopaine.coordinatorylayout.material.activity.translucent.TranslucentDemoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_main);

        findViewById(R.id.btn_translucent_demo).setOnClickListener(this);
        findViewById(R.id.btn_toolbar_demo).setOnClickListener(this);
        findViewById(R.id.btn_navigation_demo).setOnClickListener(this);
        findViewById(R.id.btn_listview_demo).setOnClickListener(this);
        findViewById(R.id.btn_recycler_demo).setOnClickListener(this);
        findViewById(R.id.btn_card_view).setOnClickListener(this);
        findViewById(R.id.btn_snack_bar).setOnClickListener(this);
        findViewById(R.id.btn_bar_tab).setOnClickListener(this);
        findViewById(R.id.btn_collapsing).setOnClickListener(this);
        findViewById(R.id.btn_bottom_sheets).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if (viewId == R.id.btn_translucent_demo) {
            Intent intent = new Intent(this, TranslucentDemoActivity.class);
            startActivity(intent);

        } else if (viewId == R.id.btn_toolbar_demo) {
            Intent intent = new Intent(this, ToolDemoActivity.class);
            startActivity(intent);

        } else if (viewId == R.id.btn_navigation_demo) {
            Intent intent = new Intent(this, NavigationDemoActivity.class);
            startActivity(intent);

        } else if (viewId == R.id.btn_listview_demo) {
            Intent intent = new Intent(this, ListViewDemoActivity.class);
            startActivity(intent);

        } else if (viewId == R.id.btn_recycler_demo) {
            Intent intent = new Intent(this, RecyclerDemoActivity.class);
            startActivity(intent);

        } else if (viewId == R.id.btn_card_view) {
            Intent intent = new Intent(this, CardViewDemoActivity.class);
            startActivity(intent);

        } else if (viewId == R.id.btn_snack_bar) {
            Intent intent = new Intent(this, SnackBarDemoActivity.class);
            startActivity(intent);

        } else if (viewId == R.id.btn_bar_tab) {
            Intent intent = new Intent(this, BarTabDemoActivity.class);
            startActivity(intent);

        } else if (viewId == R.id.btn_collapsing) {
            Intent intent = new Intent(this, CollapsingDemoActivity.class);
            startActivity(intent);

        } else if (viewId == R.id.btn_bottom_sheets) {
            Intent intent = new Intent(this, BottomSheetsDemoActivity.class);
            startActivity(intent);

        }

    }
}
