package org.osmdroid.views.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import org.osmdroid.library.R;

/* loaded from: classes4.dex */
public class ItemizedOverlayControlView extends LinearLayout {
    protected ImageButton mCenterToButton;
    protected ItemizedOverlayControlViewListener mLis;
    protected ImageButton mNavToButton;
    protected ImageButton mNextButton;
    protected ImageButton mPreviousButton;

    /* loaded from: classes4.dex */
    public interface ItemizedOverlayControlViewListener {
        void onCenter();

        void onNavTo();

        void onNext();

        void onPrevious();
    }

    public ItemizedOverlayControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ImageButton imageButton = new ImageButton(context);
        this.mPreviousButton = imageButton;
        imageButton.setImageDrawable(context.getResources().getDrawable(R.drawable.f21677s));
        ImageButton imageButton2 = new ImageButton(context);
        this.mNextButton = imageButton2;
        imageButton2.setImageDrawable(context.getResources().getDrawable(R.drawable.f21671m));
        ImageButton imageButton3 = new ImageButton(context);
        this.mCenterToButton = imageButton3;
        imageButton3.setImageDrawable(context.getResources().getDrawable(R.drawable.f21661c));
        ImageButton imageButton4 = new ImageButton(context);
        this.mNavToButton = imageButton4;
        imageButton4.setImageDrawable(context.getResources().getDrawable(R.drawable.f21670l));
        addView(this.mPreviousButton, new LinearLayout.LayoutParams(-2, -2));
        addView(this.mCenterToButton, new LinearLayout.LayoutParams(-2, -2));
        addView(this.mNavToButton, new LinearLayout.LayoutParams(-2, -2));
        addView(this.mNextButton, new LinearLayout.LayoutParams(-2, -2));
        initViewListeners();
    }

    private void initViewListeners() {
        this.mNextButton.setOnClickListener(new View.OnClickListener() { // from class: org.osmdroid.views.overlay.ItemizedOverlayControlView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ItemizedOverlayControlViewListener itemizedOverlayControlViewListener = ItemizedOverlayControlView.this.mLis;
                if (itemizedOverlayControlViewListener != null) {
                    itemizedOverlayControlViewListener.onNext();
                }
            }
        });
        this.mPreviousButton.setOnClickListener(new View.OnClickListener() { // from class: org.osmdroid.views.overlay.ItemizedOverlayControlView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ItemizedOverlayControlViewListener itemizedOverlayControlViewListener = ItemizedOverlayControlView.this.mLis;
                if (itemizedOverlayControlViewListener != null) {
                    itemizedOverlayControlViewListener.onPrevious();
                }
            }
        });
        this.mCenterToButton.setOnClickListener(new View.OnClickListener() { // from class: org.osmdroid.views.overlay.ItemizedOverlayControlView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ItemizedOverlayControlViewListener itemizedOverlayControlViewListener = ItemizedOverlayControlView.this.mLis;
                if (itemizedOverlayControlViewListener != null) {
                    itemizedOverlayControlViewListener.onCenter();
                }
            }
        });
        this.mNavToButton.setOnClickListener(new View.OnClickListener() { // from class: org.osmdroid.views.overlay.ItemizedOverlayControlView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ItemizedOverlayControlViewListener itemizedOverlayControlViewListener = ItemizedOverlayControlView.this.mLis;
                if (itemizedOverlayControlViewListener != null) {
                    itemizedOverlayControlViewListener.onNavTo();
                }
            }
        });
    }

    public void setItemizedOverlayControlViewListener(ItemizedOverlayControlViewListener itemizedOverlayControlViewListener) {
        this.mLis = itemizedOverlayControlViewListener;
    }

    public void setNavToVisible(int i5) {
        this.mNavToButton.setVisibility(i5);
    }

    public void setNextEnabled(boolean z4) {
        this.mNextButton.setEnabled(z4);
    }

    public void setPreviousEnabled(boolean z4) {
        this.mPreviousButton.setEnabled(z4);
    }
}
