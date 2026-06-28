package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
class ViewOffsetHelper {
    private int layoutLeft;
    private int layoutTop;
    private int offsetLeft;
    private int offsetTop;
    private final View view;
    private boolean verticalOffsetEnabled = true;
    private boolean horizontalOffsetEnabled = true;

    public ViewOffsetHelper(View view) {
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void applyOffsets() {
        View view = this.view;
        ViewCompat.offsetTopAndBottom(view, this.offsetTop - (view.getTop() - this.layoutTop));
        View view2 = this.view;
        ViewCompat.offsetLeftAndRight(view2, this.offsetLeft - (view2.getLeft() - this.layoutLeft));
    }

    public int getLayoutLeft() {
        return this.layoutLeft;
    }

    public int getLayoutTop() {
        return this.layoutTop;
    }

    public int getLeftAndRightOffset() {
        return this.offsetLeft;
    }

    public int getTopAndBottomOffset() {
        return this.offsetTop;
    }

    public boolean isHorizontalOffsetEnabled() {
        return this.horizontalOffsetEnabled;
    }

    public boolean isVerticalOffsetEnabled() {
        return this.verticalOffsetEnabled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onViewLayout() {
        this.layoutTop = this.view.getTop();
        this.layoutLeft = this.view.getLeft();
    }

    public void setHorizontalOffsetEnabled(boolean z4) {
        this.horizontalOffsetEnabled = z4;
    }

    public boolean setLeftAndRightOffset(int i5) {
        if (this.horizontalOffsetEnabled && this.offsetLeft != i5) {
            this.offsetLeft = i5;
            applyOffsets();
            return true;
        }
        return false;
    }

    public boolean setTopAndBottomOffset(int i5) {
        if (this.verticalOffsetEnabled && this.offsetTop != i5) {
            this.offsetTop = i5;
            applyOffsets();
            return true;
        }
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z4) {
        this.verticalOffsetEnabled = z4;
    }
}
