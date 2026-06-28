package com.yuanqi.group.widgets;

import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: k, reason: collision with root package name */
    private static final int f14414k = -1;

    /* renamed from: a, reason: collision with root package name */
    private View f14415a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f14416b;

    /* renamed from: c, reason: collision with root package name */
    private float f14417c;

    /* renamed from: d, reason: collision with root package name */
    private LinearGradient f14418d;

    /* renamed from: e, reason: collision with root package name */
    private Matrix f14419e;

    /* renamed from: f, reason: collision with root package name */
    private int f14420f;

    /* renamed from: g, reason: collision with root package name */
    private int f14421g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14422h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14423i;

    /* renamed from: j, reason: collision with root package name */
    private a f14424j;

    /* loaded from: classes3.dex */
    public interface a {
        void a(View view);
    }

    public n(View view, Paint paint, AttributeSet attributeSet) {
        this.f14415a = view;
        this.f14416b = paint;
        d(attributeSet);
    }

    private void d(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        this.f14421g = -1;
        if (attributeSet != null && (obtainStyledAttributes = this.f14415a.getContext().obtainStyledAttributes(attributeSet, R.styleable.ShimmerView, 0, 0)) != null) {
            try {
                try {
                    this.f14421g = obtainStyledAttributes.getColor(0, -1);
                } catch (Exception e5) {
                    Log.e("ShimmerTextView", "Error while creating the view:", e5);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f14419e = new Matrix();
    }

    private void i() {
        float f5 = -this.f14415a.getWidth();
        int i5 = this.f14420f;
        LinearGradient linearGradient = new LinearGradient(f5, 0.0f, 0.0f, 0.0f, new int[]{i5, this.f14421g, i5}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f14418d = linearGradient;
        this.f14416b.setShader(linearGradient);
    }

    public float a() {
        return this.f14417c;
    }

    public int b() {
        return this.f14420f;
    }

    public int c() {
        return this.f14421g;
    }

    public boolean e() {
        return this.f14423i;
    }

    public boolean f() {
        return this.f14422h;
    }

    public void g() {
        if (this.f14422h) {
            if (this.f14416b.getShader() == null) {
                this.f14416b.setShader(this.f14418d);
            }
            this.f14419e.setTranslate(this.f14417c * 2.0f, 0.0f);
            this.f14418d.setLocalMatrix(this.f14419e);
            return;
        }
        this.f14416b.setShader(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h() {
        i();
        if (!this.f14423i) {
            this.f14423i = true;
            a aVar = this.f14424j;
            if (aVar != null) {
                aVar.a(this.f14415a);
            }
        }
    }

    public void j(a aVar) {
        this.f14424j = aVar;
    }

    public void k(float f5) {
        this.f14417c = f5;
        this.f14415a.invalidate();
    }

    public void l(int i5) {
        this.f14420f = i5;
        if (this.f14423i) {
            i();
        }
    }

    public void m(int i5) {
        this.f14421g = i5;
        if (this.f14423i) {
            i();
        }
    }

    public void n(boolean z4) {
        this.f14422h = z4;
    }
}
