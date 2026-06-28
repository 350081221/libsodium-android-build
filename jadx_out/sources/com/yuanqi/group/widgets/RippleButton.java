package com.yuanqi.group.widgets;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.ViewCompat;
import com.yqtech.multiapp.R;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes3.dex */
public class RippleButton extends AppCompatButton {

    /* renamed from: a, reason: collision with root package name */
    private float f14250a;

    /* renamed from: b, reason: collision with root package name */
    private float f14251b;

    /* renamed from: c, reason: collision with root package name */
    private float f14252c;

    /* renamed from: d, reason: collision with root package name */
    private float f14253d;

    /* renamed from: e, reason: collision with root package name */
    private float f14254e;

    /* renamed from: f, reason: collision with root package name */
    private float f14255f;

    /* renamed from: g, reason: collision with root package name */
    private int f14256g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14257h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14258i;

    /* renamed from: j, reason: collision with root package name */
    private RadialGradient f14259j;

    /* renamed from: k, reason: collision with root package name */
    private Paint f14260k;

    /* renamed from: l, reason: collision with root package name */
    private ObjectAnimator f14261l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14262m;

    /* renamed from: n, reason: collision with root package name */
    private Rect f14263n;

    /* renamed from: o, reason: collision with root package name */
    private Path f14264o;

    /* loaded from: classes3.dex */
    class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RippleButton.this.setRadius(0.0f);
            RippleButton.this.setAlpha(1.0f);
            RippleButton.this.f14257h = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            RippleButton.this.f14257h = true;
        }
    }

    /* loaded from: classes3.dex */
    class b implements Animator.AnimatorListener {
        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RippleButton.this.setRadius(0.0f);
            RippleButton.this.setAlpha(1.0f);
            RippleButton.this.f14257h = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            RippleButton.this.f14257h = true;
        }
    }

    public RippleButton(Context context) {
        this(context, null);
    }

    private int c(int i5) {
        return (int) ((i5 * this.f14253d) + 0.5f);
    }

    public int b(int i5, float f5) {
        return Color.argb(Math.round(Color.alpha(i5) * f5), Color.red(i5), Color.green(i5), Color.blue(i5));
    }

    public void d() {
        this.f14253d = getContext().getResources().getDisplayMetrics().density;
        Paint paint = new Paint(1);
        this.f14260k = paint;
        paint.setAlpha(100);
        setRippleColor(ViewCompat.MEASURED_STATE_MASK, 0.2f);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode()) {
            return;
        }
        canvas.save();
        this.f14264o.reset();
        this.f14264o.addCircle(this.f14250a, this.f14251b, this.f14254e, Path.Direction.CW);
        canvas.clipPath(this.f14264o);
        canvas.drawCircle(this.f14250a, this.f14251b, this.f14254e, this.f14260k);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        this.f14255f = (float) Math.sqrt((i5 * i5) + (i6 * i6));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Log.d("TouchEvent", String.valueOf(motionEvent.getActionMasked()));
        Log.d("mIsAnimating", String.valueOf(this.f14257h));
        Log.d("mAnimationIsCancel", String.valueOf(this.f14262m));
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 0 && isEnabled() && this.f14258i) {
            this.f14263n = new Rect(getLeft(), getTop(), getRight(), getBottom());
            this.f14262m = false;
            this.f14250a = motionEvent.getX();
            this.f14251b = motionEvent.getY();
            ObjectAnimator duration = ObjectAnimator.ofFloat(this, "radius", 0.0f, c(50)).setDuration(400L);
            this.f14261l = duration;
            duration.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f14261l.addListener(new a());
            this.f14261l.start();
            if (!onTouchEvent) {
                return true;
            }
        } else if (motionEvent.getActionMasked() == 2 && isEnabled() && this.f14258i) {
            this.f14250a = motionEvent.getX();
            this.f14251b = motionEvent.getY();
            boolean z4 = !this.f14263n.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY()));
            this.f14262m = z4;
            if (z4) {
                setRadius(0.0f);
            } else {
                setRadius(c(50));
            }
            if (!onTouchEvent) {
                return true;
            }
        } else if (motionEvent.getActionMasked() == 1 && !this.f14262m && isEnabled()) {
            this.f14250a = motionEvent.getX();
            this.f14251b = motionEvent.getY();
            float f5 = this.f14250a;
            float max = Math.max((float) Math.sqrt((f5 * f5) + (r13 * r13)), this.f14255f);
            if (this.f14257h) {
                this.f14261l.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "radius", c(50), max);
            this.f14261l = ofFloat;
            ofFloat.setDuration(500L);
            this.f14261l.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f14261l.addListener(new b());
            this.f14261l.start();
            if (!onTouchEvent) {
                return true;
            }
        }
        return onTouchEvent;
    }

    public void setHover(boolean z4) {
        this.f14258i = z4;
    }

    public void setRadius(float f5) {
        this.f14254e = f5;
        if (f5 > 0.0f) {
            RadialGradient radialGradient = new RadialGradient(this.f14250a, this.f14251b, this.f14254e, b(this.f14256g, this.f14252c), this.f14256g, Shader.TileMode.MIRROR);
            this.f14259j = radialGradient;
            this.f14260k.setShader(radialGradient);
        }
        invalidate();
    }

    public void setRippleColor(int i5, float f5) {
        this.f14256g = i5;
        this.f14252c = f5;
    }

    public RippleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RippleButton(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f14257h = false;
        this.f14258i = true;
        this.f14264o = new Path();
        d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RippleButton);
        this.f14256g = obtainStyledAttributes.getColor(2, this.f14256g);
        this.f14252c = obtainStyledAttributes.getFloat(0, this.f14252c);
        this.f14258i = obtainStyledAttributes.getBoolean(1, this.f14258i);
        obtainStyledAttributes.recycle();
    }
}
