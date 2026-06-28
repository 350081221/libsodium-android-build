package com.yuanqi.group.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes3.dex */
public class MarqueeTextView extends AppCompatTextView {

    /* renamed from: a, reason: collision with root package name */
    private boolean f14193a;

    public MarqueeTextView(Context context) {
        super(context);
        this.f14193a = false;
    }

    public void a() {
        this.f14193a = false;
    }

    public void b() {
        this.f14193a = true;
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (this.f14193a) {
            return super.isFocused();
        }
        return true;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        b();
        super.onDetachedFromWindow();
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14193a = false;
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f14193a = false;
    }
}
