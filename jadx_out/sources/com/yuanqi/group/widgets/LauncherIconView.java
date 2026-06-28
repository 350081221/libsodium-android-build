package com.yuanqi.group.widgets;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.yuanqi.group.widgets.n;

/* loaded from: classes3.dex */
public class LauncherIconView extends AppCompatImageView implements m {

    /* renamed from: t, reason: collision with root package name */
    private static final int f14145t = 5;

    /* renamed from: u, reason: collision with root package name */
    private static final String f14146u = "LauncherIconView";

    /* renamed from: a, reason: collision with root package name */
    private n f14147a;

    /* renamed from: b, reason: collision with root package name */
    private l f14148b;

    /* renamed from: c, reason: collision with root package name */
    private float f14149c;

    /* renamed from: d, reason: collision with root package name */
    private int f14150d;

    /* renamed from: e, reason: collision with root package name */
    private int f14151e;

    /* renamed from: f, reason: collision with root package name */
    private int f14152f;

    /* renamed from: g, reason: collision with root package name */
    private float f14153g;

    /* renamed from: h, reason: collision with root package name */
    private float f14154h;

    /* renamed from: i, reason: collision with root package name */
    private int f14155i;

    /* renamed from: j, reason: collision with root package name */
    private float f14156j;

    /* renamed from: k, reason: collision with root package name */
    private float f14157k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14158l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14159m;

    /* renamed from: n, reason: collision with root package name */
    private long f14160n;

    /* renamed from: o, reason: collision with root package name */
    private Paint f14161o;

    /* renamed from: p, reason: collision with root package name */
    private Paint f14162p;

    /* renamed from: q, reason: collision with root package name */
    private RectF f14163q;

    /* renamed from: r, reason: collision with root package name */
    private ValueAnimator f14164r;

    /* renamed from: s, reason: collision with root package name */
    private ValueAnimator f14165s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LauncherIconView.this.f14154h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            LauncherIconView.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f14167a;

        b(int i5) {
            this.f14167a = i5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            int i5 = this.f14167a;
            if (i5 > 0) {
                LauncherIconView.this.o(0.0f, i5);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f14169a;

        c(boolean z4) {
            this.f14169a = z4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LauncherIconView.this.f14149c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (0.0f < LauncherIconView.this.f14149c && LauncherIconView.this.f14149c < 100.0f) {
                LauncherIconView.this.invalidate();
            } else if (LauncherIconView.this.f14149c == 100.0f && !this.f14169a) {
                LauncherIconView.this.n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LauncherIconView.this.f14159m = true;
            LauncherIconView.this.f14157k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            LauncherIconView.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            LauncherIconView.this.f14159m = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            LauncherIconView.this.f14159m = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            LauncherIconView.this.f14159m = true;
        }
    }

    public LauncherIconView(Context context) {
        super(context);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        this.f14160n = getContext().getResources().getInteger(R.integer.config_mediumAnimTime);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.yqtech.multiapp.R.styleable.ProgressImageView);
        try {
            this.f14149c = obtainStyledAttributes.getInteger(2, 0);
            this.f14152f = obtainStyledAttributes.getDimensionPixelOffset(4, 8);
            this.f14153g = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.f14158l = obtainStyledAttributes.getBoolean(0, false);
            this.f14155i = obtainStyledAttributes.getColor(1, Color.argb(180, 0, 0, 0));
            Paint paint = new Paint();
            this.f14162p = paint;
            paint.setColor(this.f14155i);
            this.f14162p.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.f14161o = paint2;
            paint2.setColor(-1);
            obtainStyledAttributes.recycle();
            this.f14147a = new n(this, this.f14161o, attributeSet);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void j(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, this.f14151e, this.f14150d, this.f14162p);
    }

    private void k(Canvas canvas) {
        this.f14162p.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawCircle(this.f14151e / 2.0f, this.f14150d / 2.0f, this.f14153g, this.f14162p);
        this.f14162p.setXfermode(null);
        RectF rectF = this.f14163q;
        float f5 = this.f14149c;
        canvas.drawArc(rectF, (-90.0f) + (f5 * 3.6f), 360.0f - (f5 * 3.6f), true, this.f14162p);
    }

    private void l() {
        int i5;
        if (this.f14151e == 0) {
            this.f14151e = getWidth();
        }
        if (this.f14150d == 0) {
            this.f14150d = getHeight();
        }
        if (this.f14151e != 0 && (i5 = this.f14150d) != 0) {
            if (this.f14153g == 0.0f) {
                this.f14153g = Math.min(r0, i5) / 4.0f;
            }
            if (this.f14156j == 0.0f) {
                int i6 = this.f14151e;
                int i7 = this.f14150d;
                this.f14156j = (float) (Math.sqrt((i6 * i6) + (i7 * i7)) * 0.5d);
            }
            if (this.f14163q == null) {
                int i8 = this.f14151e;
                float f5 = this.f14153g;
                int i9 = this.f14152f;
                int i10 = this.f14150d;
                this.f14163q = new RectF(((i8 / 2.0f) - f5) + i9, ((i10 / 2.0f) - f5) + i9, ((i8 / 2.0f) + f5) - i9, ((i10 / 2.0f) + f5) - i9);
            }
        }
    }

    private void m(int i5) {
        ValueAnimator valueAnimator = this.f14164r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f14152f);
        this.f14164r = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator());
        this.f14164r.setDuration(getContext().getResources().getInteger(R.integer.config_shortAnimTime));
        this.f14164r.addUpdateListener(new a());
        this.f14164r.addListener(new b(i5));
        this.f14164r.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ValueAnimator valueAnimator = this.f14165s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f14156j);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(this.f14160n);
        ofFloat.addUpdateListener(new d());
        ofFloat.addListener(new e());
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(float f5, float f6) {
        boolean z4;
        ValueAnimator valueAnimator = this.f14165s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (f5 > f6) {
            z4 = true;
        } else {
            z4 = false;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f6);
        this.f14165s = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator());
        this.f14165s.setDuration(this.f14160n);
        this.f14165s.addUpdateListener(new c(z4));
        this.f14165s.start();
    }

    private void r(Canvas canvas) {
        this.f14162p.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawCircle(this.f14151e / 2.0f, this.f14150d / 2.0f, this.f14153g, this.f14162p);
        this.f14162p.setXfermode(null);
        canvas.drawCircle(this.f14151e / 2.0f, this.f14150d / 2.0f, this.f14153g - this.f14154h, this.f14162p);
    }

    private void s(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, this.f14151e, this.f14150d, this.f14162p);
        this.f14162p.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawCircle(this.f14151e / 2.0f, this.f14150d / 2.0f, this.f14153g + this.f14157k, this.f14162p);
        this.f14162p.setXfermode(null);
    }

    @Override // com.yuanqi.group.widgets.m
    public boolean a() {
        return this.f14147a.f();
    }

    @Override // com.yuanqi.group.widgets.m
    public boolean b() {
        return this.f14147a.e();
    }

    @Override // com.yuanqi.group.widgets.m
    public float getGradientX() {
        return this.f14147a.a();
    }

    public int getMaskColor() {
        return this.f14155i;
    }

    @Override // com.yuanqi.group.widgets.m
    public int getPrimaryColor() {
        return this.f14147a.b();
    }

    public int getProgress() {
        return (int) this.f14149c;
    }

    public float getRadius() {
        return this.f14153g;
    }

    @Override // com.yuanqi.group.widgets.m
    public int getReflectionColor() {
        return this.f14147a.c();
    }

    public int getStrokeWidth() {
        return this.f14152f;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        n nVar = this.f14147a;
        if (nVar != null) {
            nVar.g();
        }
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        l();
        if (this.f14149c < 100.0f) {
            j(canvas);
            if (this.f14149c == 0.0f) {
                r(canvas);
            } else {
                k(canvas);
            }
        }
        if (this.f14159m) {
            s(canvas);
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (this.f14158l) {
            int size = View.MeasureSpec.getSize(i5);
            if (size == 0) {
                size = View.MeasureSpec.getSize(i6);
            }
            setMeasuredDimension(size, size);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        n nVar = this.f14147a;
        if (nVar != null) {
            nVar.h();
        }
    }

    public void p() {
        q();
        l lVar = new l();
        this.f14148b = lVar;
        lVar.r(1).s(800L).p(0).t(this);
    }

    public void q() {
        l lVar = this.f14148b;
        if (lVar != null && lVar.n()) {
            this.f14148b.h();
            this.f14148b = null;
        }
    }

    @Override // com.yuanqi.group.widgets.m
    public void setAnimationSetupCallback(n.a aVar) {
        this.f14147a.j(aVar);
    }

    @Override // com.yuanqi.group.widgets.m
    public void setGradientX(float f5) {
        this.f14147a.k(f5);
    }

    public void setMaskColor(int i5) {
        this.f14155i = i5;
        this.f14162p.setColor(i5);
        invalidate();
    }

    @Override // com.yuanqi.group.widgets.m
    public void setPrimaryColor(int i5) {
        this.f14147a.l(i5);
    }

    public void setProgress(int i5) {
        setProgress(i5, true);
    }

    public void setRadius(float f5) {
        this.f14153g = f5;
        this.f14163q = null;
        invalidate();
    }

    @Override // com.yuanqi.group.widgets.m
    public void setReflectionColor(int i5) {
        this.f14147a.m(i5);
    }

    @Override // com.yuanqi.group.widgets.m
    public void setShimmering(boolean z4) {
        this.f14147a.n(z4);
    }

    public void setStrokeWidth(int i5) {
        this.f14152f = i5;
        this.f14163q = null;
        invalidate();
    }

    public void setProgress(int i5, boolean z4) {
        int min = Math.min(Math.max(i5, 0), 100);
        float f5 = min;
        if (Math.abs(f5 - this.f14149c) > 5.0f && z4) {
            float f6 = this.f14149c;
            if (f6 == 0.0f) {
                m(min);
                return;
            } else {
                o(f6, f5);
                return;
            }
        }
        if (min == 100 && z4) {
            this.f14149c = 100.0f;
            n();
        } else {
            this.f14149c = f5;
            if (f5 == 0.0f) {
                this.f14154h = 0.0f;
            }
            invalidate();
        }
    }

    public LauncherIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public LauncherIconView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        init(context, attributeSet);
    }
}
