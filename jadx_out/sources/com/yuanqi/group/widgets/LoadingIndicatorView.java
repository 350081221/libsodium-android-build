package com.yuanqi.group.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public class LoadingIndicatorView extends View {

    /* renamed from: n, reason: collision with root package name */
    private static final String f14174n = "LoadingIndicatorView";

    /* renamed from: o, reason: collision with root package name */
    private static final i f14175o = new com.yuanqi.group.widgets.b();

    /* renamed from: p, reason: collision with root package name */
    private static final int f14176p = 500;

    /* renamed from: q, reason: collision with root package name */
    private static final int f14177q = 500;

    /* renamed from: a, reason: collision with root package name */
    int f14178a;

    /* renamed from: b, reason: collision with root package name */
    int f14179b;

    /* renamed from: c, reason: collision with root package name */
    int f14180c;

    /* renamed from: d, reason: collision with root package name */
    int f14181d;

    /* renamed from: e, reason: collision with root package name */
    private long f14182e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14183f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14184g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14185h;

    /* renamed from: i, reason: collision with root package name */
    private i f14186i;

    /* renamed from: j, reason: collision with root package name */
    private int f14187j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14188k;

    /* renamed from: l, reason: collision with root package name */
    private final Runnable f14189l;

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f14190m;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingIndicatorView.this.f14183f = false;
            LoadingIndicatorView.this.f14182e = -1L;
            LoadingIndicatorView.this.setVisibility(8);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingIndicatorView.this.f14184g = false;
            if (!LoadingIndicatorView.this.f14185h) {
                LoadingIndicatorView.this.f14182e = System.currentTimeMillis();
                LoadingIndicatorView.this.setVisibility(0);
            }
        }
    }

    public LoadingIndicatorView(Context context) {
        super(context);
        this.f14182e = -1L;
        this.f14183f = false;
        this.f14184g = false;
        this.f14185h = false;
        this.f14189l = new a();
        this.f14190m = new b();
        g(context, null, 0, 0);
    }

    private void g(Context context, AttributeSet attributeSet, int i5, int i6) {
        this.f14178a = 24;
        this.f14179b = 48;
        this.f14180c = 24;
        this.f14181d = 48;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LoadingIndicatorView, i5, i6);
        this.f14178a = obtainStyledAttributes.getDimensionPixelSize(5, this.f14178a);
        this.f14179b = obtainStyledAttributes.getDimensionPixelSize(3, this.f14179b);
        this.f14180c = obtainStyledAttributes.getDimensionPixelSize(4, this.f14180c);
        this.f14181d = obtainStyledAttributes.getDimensionPixelSize(2, this.f14181d);
        String string = obtainStyledAttributes.getString(1);
        this.f14187j = obtainStyledAttributes.getColor(0, -1);
        setIndicator(string);
        if (this.f14186i == null) {
            setIndicator(f14175o);
        }
        obtainStyledAttributes.recycle();
    }

    private void h() {
        removeCallbacks(this.f14189l);
        removeCallbacks(this.f14190m);
    }

    private void n(int i5, int i6) {
        int i7;
        int paddingRight = i5 - (getPaddingRight() + getPaddingLeft());
        int paddingTop = i6 - (getPaddingTop() + getPaddingBottom());
        if (this.f14186i != null) {
            float intrinsicWidth = r0.getIntrinsicWidth() / this.f14186i.getIntrinsicHeight();
            float f5 = paddingRight;
            float f6 = paddingTop;
            float f7 = f5 / f6;
            int i8 = 0;
            if (intrinsicWidth != f7) {
                if (f7 > intrinsicWidth) {
                    int i9 = (int) (f6 * intrinsicWidth);
                    int i10 = (paddingRight - i9) / 2;
                    i8 = i10;
                    paddingRight = i9 + i10;
                    i7 = 0;
                } else {
                    int i11 = (int) (f5 * (1.0f / intrinsicWidth));
                    int i12 = (paddingTop - i11) / 2;
                    int i13 = i11 + i12;
                    i7 = i12;
                    paddingTop = i13;
                }
            } else {
                i7 = 0;
            }
            this.f14186i.setBounds(i8, i7, paddingRight, paddingTop);
        }
    }

    private void o() {
        int[] drawableState = getDrawableState();
        i iVar = this.f14186i;
        if (iVar != null && iVar.isStateful()) {
            this.f14186i.setState(drawableState);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f5, float f6) {
        super.drawableHotspotChanged(f5, f6);
        i iVar = this.f14186i;
        if (iVar != null) {
            iVar.setHotspot(f5, f6);
        }
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        o();
    }

    void e(Canvas canvas) {
        i iVar = this.f14186i;
        if (iVar != null) {
            int save = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            iVar.draw(canvas);
            canvas.restoreToCount(save);
            if (this.f14188k) {
                iVar.start();
                this.f14188k = false;
            }
        }
    }

    public void f() {
        this.f14185h = true;
        removeCallbacks(this.f14190m);
        long currentTimeMillis = System.currentTimeMillis();
        long j5 = this.f14182e;
        long j6 = currentTimeMillis - j5;
        if (j6 < 500 && j5 != -1) {
            if (!this.f14183f) {
                postDelayed(this.f14189l, 500 - j6);
                this.f14183f = true;
                return;
            }
            return;
        }
        setVisibility(8);
    }

    public i getIndicator() {
        return this.f14186i;
    }

    public void i() {
        this.f14182e = -1L;
        this.f14185h = false;
        removeCallbacks(this.f14189l);
        if (!this.f14184g) {
            postDelayed(this.f14190m, 500L);
            this.f14184g = true;
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (verifyDrawable(drawable)) {
            Rect bounds = drawable.getBounds();
            int scrollX = getScrollX() + getPaddingLeft();
            int scrollY = getScrollY() + getPaddingTop();
            invalidate(bounds.left + scrollX, bounds.top + scrollY, bounds.right + scrollX, bounds.bottom + scrollY);
            return;
        }
        super.invalidateDrawable(drawable);
    }

    public void j() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_out));
        setVisibility(8);
    }

    public void k() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_in));
        setVisibility(0);
    }

    void l() {
        if (getVisibility() != 0) {
            return;
        }
        if (this.f14186i instanceof Animatable) {
            this.f14188k = true;
        }
        postInvalidate();
    }

    void m() {
        i iVar = this.f14186i;
        if (iVar instanceof Animatable) {
            iVar.stop();
            this.f14188k = false;
        }
        postInvalidate();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l();
        h();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        m();
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e(canvas);
    }

    @Override // android.view.View
    protected synchronized void onMeasure(int i5, int i6) {
        int i7;
        int i8;
        i iVar = this.f14186i;
        if (iVar != null) {
            i8 = Math.max(this.f14178a, Math.min(this.f14179b, iVar.getIntrinsicWidth()));
            i7 = Math.max(this.f14180c, Math.min(this.f14181d, iVar.getIntrinsicHeight()));
        } else {
            i7 = 0;
            i8 = 0;
        }
        o();
        setMeasuredDimension(View.resolveSizeAndState(i8 + getPaddingLeft() + getPaddingRight(), i5, 0), View.resolveSizeAndState(i7 + getPaddingTop() + getPaddingBottom(), i6, 0));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        n(i5, i6);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i5) {
        super.onVisibilityChanged(view, i5);
        if (i5 != 8 && i5 != 4) {
            l();
        } else {
            m();
        }
    }

    public void setIndicator(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!str.contains(".")) {
            sb.append(getClass().getPackage().getName());
            sb.append(".");
        }
        sb.append(str);
        try {
            setIndicator((i) Class.forName(sb.toString()).newInstance());
        } catch (ClassNotFoundException unused) {
            Log.e(f14174n, "Didn't find your class , check the name again !");
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
        } catch (InstantiationException e6) {
            e6.printStackTrace();
        }
    }

    public void setIndicatorColor(int i5) {
        this.f14187j = i5;
        this.f14186i.o(i5);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        if (getVisibility() != i5) {
            super.setVisibility(i5);
            if (i5 != 8 && i5 != 4) {
                l();
            } else {
                m();
            }
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f14186i && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public LoadingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14182e = -1L;
        this.f14183f = false;
        this.f14184g = false;
        this.f14185h = false;
        this.f14189l = new a();
        this.f14190m = new b();
        g(context, attributeSet, 0, R.style.AVLoadingIndicatorView);
    }

    public void setIndicator(i iVar) {
        i iVar2 = this.f14186i;
        if (iVar2 != iVar) {
            if (iVar2 != null) {
                iVar2.setCallback(null);
                unscheduleDrawable(this.f14186i);
            }
            this.f14186i = iVar;
            setIndicatorColor(this.f14187j);
            if (iVar != null) {
                iVar.setCallback(this);
            }
            postInvalidate();
        }
    }

    public LoadingIndicatorView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f14182e = -1L;
        this.f14183f = false;
        this.f14184g = false;
        this.f14185h = false;
        this.f14189l = new a();
        this.f14190m = new b();
        g(context, attributeSet, i5, R.style.AVLoadingIndicatorView);
    }

    @TargetApi(21)
    public LoadingIndicatorView(Context context, AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        this.f14182e = -1L;
        this.f14183f = false;
        this.f14184g = false;
        this.f14185h = false;
        this.f14189l = new a();
        this.f14190m = new b();
        g(context, attributeSet, i5, R.style.AVLoadingIndicatorView);
    }
}
