package com.yuanqi.group.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;

/* loaded from: classes3.dex */
public class ListViewPlus extends ListView implements NestedScrollingChild {

    /* renamed from: a, reason: collision with root package name */
    private final NestedScrollingChildHelper f14173a;

    public ListViewPlus(Context context) {
        this(context, null);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f5, float f6, boolean z4) {
        return this.f14173a.dispatchNestedFling(f5, f6, z4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f5, float f6) {
        return this.f14173a.dispatchNestedPreFling(f5, f6);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i5, int i6, int[] iArr, int[] iArr2) {
        return this.f14173a.dispatchNestedPreScroll(i5, i6, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i5, int i6, int i7, int i8, int[] iArr) {
        return this.f14173a.dispatchNestedScroll(i5, i6, i7, i8, iArr);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f14173a.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f14173a.isNestedScrollingEnabled();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z4) {
        this.f14173a.setNestedScrollingEnabled(z4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i5) {
        return this.f14173a.startNestedScroll(i5);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f14173a.stopNestedScroll();
    }

    public ListViewPlus(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListViewPlus(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f14173a = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
    }
}
