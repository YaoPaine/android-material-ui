package com.yaopaine.coordinatorylayout.toolbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v4.view.ActionProvider;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yaopaine.coordinatorylayout.R;

/**
 * Created by yaopaine on 1/22/18.
 */

public class BadgeActionProvider extends ActionProvider {

    private ImageView mIvIcon;
    private TextView mTvBadge;
    private OnClickListener onClickListener;

    /**
     * Creates a new instance.
     *
     * @param context Context for accessing resources.
     */
    public BadgeActionProvider(Context context) {
        super(context);
    }

    @Override
    public View onCreateActionView() {
        int size = getContext().getResources().getDimensionPixelSize(
                android.support.design.R.dimen.abc_action_bar_default_height_material);
        Log.e("TAG", "size: " + size + "\t" + getContext().getResources().getDimension(android.support.design.R.dimen.abc_action_bar_default_height_material));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(size, size);
        View view = LayoutInflater.from(getContext()).inflate(R.layout.menu_badge_provider, null, false);
        view.setLayoutParams(layoutParams);
        mIvIcon = view.findViewById(R.id.iv_icon);
        mTvBadge = view.findViewById(R.id.tv_badge);
        view.setOnClickListener(onViewClickListener);
        return view;
    }

    // 点击处理。
    private View.OnClickListener onViewClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (onClickListener != null)
                onClickListener.onClick(v);
        }
    };

    // 外部设置监听。
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public interface OnClickListener {
        void onClick(View v);
    }

    // 设置图标。
    public void setIcon(@DrawableRes int icon) {
        mIvIcon.setImageResource(icon);
    }

    // 设置显示的数字。
    @SuppressLint("SetTextI18n")
    public void setBadge(int i) {
        mTvBadge.setText(Integer.toString(i));
    }

    // 设置文字。
    public void setTextInt(@StringRes int i) {
        mTvBadge.setText(i);
    }

    // 设置显示的文字。
    public void setText(CharSequence i) {
        mTvBadge.setText(i);
    }
}
