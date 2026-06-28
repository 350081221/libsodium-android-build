package com.yuanqi.group.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public class CardStackLayout extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f14080h = false;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f14081i = true;

    /* renamed from: a, reason: collision with root package name */
    private float f14082a;

    /* renamed from: b, reason: collision with root package name */
    private float f14083b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14084c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14085d;

    /* renamed from: e, reason: collision with root package name */
    private int f14086e;

    /* renamed from: f, reason: collision with root package name */
    private a f14087f;

    /* renamed from: g, reason: collision with root package name */
    private f f14088g;

    /* loaded from: classes3.dex */
    public interface a {
        void a(View view, int i5);
    }

    public CardStackLayout(Context context) {
        super(context);
        this.f14087f = null;
        this.f14088g = null;
        f();
    }

    private void a(Context context, AttributeSet attributeSet, int i5, int i6) {
        f();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.CardStackLayout, i5, i6);
        this.f14085d = obtainStyledAttributes.getBoolean(2, false);
        this.f14084c = obtainStyledAttributes.getBoolean(4, true);
        this.f14086e = obtainStyledAttributes.getInteger(3, getResources().getInteger(R.integer.parallax_scale_default));
        this.f14083b = obtainStyledAttributes.getDimension(0, getResources().getDimension(R.dimen.card_gap));
        this.f14082a = obtainStyledAttributes.getDimension(1, getResources().getDimension(R.dimen.card_gap_bottom));
        obtainStyledAttributes.recycle();
    }

    private void f() {
        this.f14087f = null;
    }

    public boolean b() {
        return this.f14088g.m();
    }

    public boolean c() {
        return this.f14085d;
    }

    public boolean d() {
        return this.f14084c;
    }

    public void e() {
        if (getChildCount() > 0) {
            removeAllViews();
        }
        this.f14088g = null;
        this.f14087f = null;
    }

    public void g() {
        this.f14088g.q();
    }

    public f getAdapter() {
        return this.f14088g;
    }

    public float getCardGap() {
        return this.f14083b;
    }

    public float getCardGapBottom() {
        return this.f14082a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a getOnCardSelectedListener() {
        return this.f14087f;
    }

    public int getParallaxScale() {
        return this.f14086e;
    }

    public void setAdapter(f fVar) {
        this.f14088g = fVar;
        fVar.s(this);
        for (int i5 = 0; i5 < this.f14088g.k(); i5++) {
            this.f14088g.d(i5);
        }
        if (this.f14084c) {
            postDelayed(new Runnable() { // from class: com.yuanqi.group.widgets.g
                @Override // java.lang.Runnable
                public final void run() {
                    CardStackLayout.this.g();
                }
            }, 500L);
        }
    }

    public void setCardGap(float f5) {
        this.f14083b = f5;
    }

    public void setCardGapBottom(float f5) {
        this.f14082a = f5;
    }

    public void setOnCardSelectedListener(a aVar) {
        this.f14087f = aVar;
    }

    public void setParallaxEnabled(boolean z4) {
        this.f14085d = z4;
    }

    public void setParallaxScale(int i5) {
        this.f14086e = i5;
    }

    public void setShowInitAnimation(boolean z4) {
        this.f14084c = z4;
    }

    public CardStackLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardStackLayout(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f14087f = null;
        this.f14088g = null;
        a(context, attributeSet, i5, 0);
    }

    @TargetApi(21)
    public CardStackLayout(Context context, AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        this.f14087f = null;
        this.f14088g = null;
        a(context, attributeSet, i5, i6);
    }
}
