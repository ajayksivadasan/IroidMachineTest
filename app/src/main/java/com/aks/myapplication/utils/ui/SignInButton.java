package com.aks.myapplication.utils.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import com.aks.myapplication.R;

public class SignInButton extends RelativeLayout {
    Context context;
    private String buttonText;
    private Drawable buttonDrawable;

    public SignInButton(@NonNull Context context) {
        super(context);
        this.context = context;
        init();
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
        this.context = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.mta, 0, 0);
        try {
            setText(context.getString(obtainStyledAttributes.getResourceId(R.styleable.mta_text, R.string.str_sign_in)));
            setBackGround(ContextCompat.getDrawable(getContext(), obtainStyledAttributes.getResourceId(R.styleable.mta_buttonBackGround, R.drawable.bg_subscribe_now_bubble)));
            setIcon(ContextCompat.getDrawable(getContext(), obtainStyledAttributes.getResourceId(R.styleable.mta_icon, R.drawable.ic_icon_subscribe_key)));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void setIcon(Drawable drawable) {
        buttonDrawable = drawable;
        ImageView view = findViewById(R.id.imvButtonDrawableStart);
        if (view != null) {
            view.setImageDrawable(drawable);
        }
    }

    private void init() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_icon_button, null, false);
        if (inflate != null) {
            addView(inflate);
        }
        setClickable(true);
        setFocusable(true);
    }

    public String getText() {
        return this.buttonText;
    }

    public void setText(String str) {
        this.buttonText = str;
        TextView textView = findViewById(R.id.vw_text);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setBackGround(Drawable backGroundDrawable) {
        buttonDrawable = backGroundDrawable;
        View view = findViewById(R.id.backGroundView);
        if (view != null) {
            view.setBackground(backGroundDrawable);
        }
    }

    public Drawable getBackGroundDrawable() {
        return buttonDrawable;
    }
}
