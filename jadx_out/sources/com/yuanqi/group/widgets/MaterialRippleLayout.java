package com.yuanqi.group.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public class MaterialRippleLayout extends FrameLayout {
    private static final int G = 350;
    private static final int H = 75;
    private static final float I = 35.0f;
    private static final float J = 0.2f;
    private static final int K = -16777216;
    private static final int L = 0;
    private static final boolean M = true;

    /* renamed from: s0, reason: collision with root package name */
    private static final boolean f14194s0 = true;

    /* renamed from: t0, reason: collision with root package name */
    private static final boolean f14195t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    private static final boolean f14196u0 = false;

    /* renamed from: v0, reason: collision with root package name */
    private static final boolean f14197v0 = false;

    /* renamed from: w0, reason: collision with root package name */
    private static final int f14198w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    private static final int f14199x0 = 50;

    /* renamed from: y0, reason: collision with root package name */
    private static final long f14200y0 = 2500;
    private f A;
    private g B;
    private boolean C;
    private Property<MaterialRippleLayout, Float> D;
    private Property<MaterialRippleLayout, Integer> E;
    private GestureDetector.SimpleOnGestureListener F;

    /* renamed from: a, reason: collision with root package name */
    private final Paint f14201a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f14202b;

    /* renamed from: c, reason: collision with root package name */
    private int f14203c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14204d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14205e;

    /* renamed from: f, reason: collision with root package name */
    private int f14206f;

    /* renamed from: g, reason: collision with root package name */
    private int f14207g;

    /* renamed from: h, reason: collision with root package name */
    private int f14208h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14209i;

    /* renamed from: j, reason: collision with root package name */
    private int f14210j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14211k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f14212l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14213m;

    /* renamed from: n, reason: collision with root package name */
    private float f14214n;

    /* renamed from: o, reason: collision with root package name */
    private float f14215o;

    /* renamed from: p, reason: collision with root package name */
    private AdapterView f14216p;

    /* renamed from: q, reason: collision with root package name */
    private View f14217q;

    /* renamed from: r, reason: collision with root package name */
    private AnimatorSet f14218r;

    /* renamed from: s, reason: collision with root package name */
    private ObjectAnimator f14219s;

    /* renamed from: t, reason: collision with root package name */
    private Point f14220t;

    /* renamed from: u, reason: collision with root package name */
    private Point f14221u;

    /* renamed from: v, reason: collision with root package name */
    private int f14222v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f14223w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f14224x;

    /* renamed from: y, reason: collision with root package name */
    private int f14225y;

    /* renamed from: z, reason: collision with root package name */
    private GestureDetector f14226z;

    /* loaded from: classes3.dex */
    class a extends Property<MaterialRippleLayout, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(MaterialRippleLayout materialRippleLayout) {
            return Float.valueOf(materialRippleLayout.getRadius());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(MaterialRippleLayout materialRippleLayout, Float f5) {
            materialRippleLayout.setRadius(f5.floatValue());
        }
    }

    /* loaded from: classes3.dex */
    class b extends Property<MaterialRippleLayout, Integer> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(MaterialRippleLayout materialRippleLayout) {
            return Integer.valueOf(materialRippleLayout.getRippleAlpha());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(MaterialRippleLayout materialRippleLayout, Integer num) {
            materialRippleLayout.setRippleAlpha(num);
        }
    }

    /* loaded from: classes3.dex */
    class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            MaterialRippleLayout.this.C = false;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            MaterialRippleLayout materialRippleLayout = MaterialRippleLayout.this;
            materialRippleLayout.C = materialRippleLayout.f14217q.performLongClick();
            if (MaterialRippleLayout.this.C) {
                if (MaterialRippleLayout.this.f14205e) {
                    MaterialRippleLayout.this.B(null);
                }
                MaterialRippleLayout.this.q();
            }
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialRippleLayout.this.f14217q.setPressed(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f14231a;

        e(Runnable runnable) {
            this.f14231a = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!MaterialRippleLayout.this.f14211k) {
                MaterialRippleLayout.this.setRadius(0.0f);
                MaterialRippleLayout materialRippleLayout = MaterialRippleLayout.this;
                materialRippleLayout.setRippleAlpha(Integer.valueOf(materialRippleLayout.f14208h));
            }
            if (this.f14231a != null && MaterialRippleLayout.this.f14209i) {
                this.f14231a.run();
            }
            MaterialRippleLayout.this.f14217q.setPressed(false);
        }
    }

    /* loaded from: classes3.dex */
    private class f implements Runnable {
        private f() {
        }

        private void a(AdapterView adapterView) {
            long j5;
            int positionForView = adapterView.getPositionForView(MaterialRippleLayout.this);
            if (adapterView.getAdapter() != null) {
                j5 = adapterView.getAdapter().getItemId(positionForView);
            } else {
                j5 = 0;
            }
            if (positionForView != -1) {
                adapterView.performItemClick(MaterialRippleLayout.this, positionForView, j5);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MaterialRippleLayout.this.C) {
                return;
            }
            if (MaterialRippleLayout.this.getParent() instanceof AdapterView) {
                if (!MaterialRippleLayout.this.f14217q.performClick()) {
                    a((AdapterView) MaterialRippleLayout.this.getParent());
                }
            } else if (MaterialRippleLayout.this.f14213m) {
                a(MaterialRippleLayout.this.u());
            } else {
                MaterialRippleLayout.this.f14217q.performClick();
            }
        }

        /* synthetic */ f(MaterialRippleLayout materialRippleLayout, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final MotionEvent f14234a;

        public g(MotionEvent motionEvent) {
            this.f14234a = motionEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialRippleLayout.this.f14224x = false;
            MaterialRippleLayout.this.f14217q.setLongClickable(false);
            MaterialRippleLayout.this.f14217q.onTouchEvent(this.f14234a);
            MaterialRippleLayout.this.f14217q.setPressed(true);
            if (MaterialRippleLayout.this.f14205e) {
                MaterialRippleLayout.this.A();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        private final Context f14236a;

        /* renamed from: b, reason: collision with root package name */
        private final View f14237b;

        /* renamed from: c, reason: collision with root package name */
        private int f14238c = -16777216;

        /* renamed from: d, reason: collision with root package name */
        private boolean f14239d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f14240e = true;

        /* renamed from: f, reason: collision with root package name */
        private float f14241f = MaterialRippleLayout.I;

        /* renamed from: g, reason: collision with root package name */
        private int f14242g = MaterialRippleLayout.G;

        /* renamed from: h, reason: collision with root package name */
        private float f14243h = 0.2f;

        /* renamed from: i, reason: collision with root package name */
        private boolean f14244i = true;

        /* renamed from: j, reason: collision with root package name */
        private int f14245j = 75;

        /* renamed from: k, reason: collision with root package name */
        private boolean f14246k = false;

        /* renamed from: l, reason: collision with root package name */
        private int f14247l = 0;

        /* renamed from: m, reason: collision with root package name */
        private boolean f14248m = false;

        /* renamed from: n, reason: collision with root package name */
        private float f14249n = 0.0f;

        public h(View view) {
            this.f14237b = view;
            this.f14236a = view.getContext();
        }

        public MaterialRippleLayout a() {
            int i5;
            MaterialRippleLayout materialRippleLayout = new MaterialRippleLayout(this.f14236a);
            materialRippleLayout.setRippleColor(this.f14238c);
            materialRippleLayout.setDefaultRippleAlpha(this.f14243h);
            materialRippleLayout.setRippleDelayClick(this.f14244i);
            materialRippleLayout.setRippleDiameter((int) MaterialRippleLayout.r(this.f14236a.getResources(), this.f14241f));
            materialRippleLayout.setRippleDuration(this.f14242g);
            materialRippleLayout.setRippleFadeDuration(this.f14245j);
            materialRippleLayout.setRippleHover(this.f14240e);
            materialRippleLayout.setRipplePersistent(this.f14246k);
            materialRippleLayout.setRippleOverlay(this.f14239d);
            materialRippleLayout.setRippleBackground(this.f14247l);
            materialRippleLayout.setRippleInAdapter(this.f14248m);
            materialRippleLayout.setRippleRoundedCorners((int) MaterialRippleLayout.r(this.f14236a.getResources(), this.f14249n));
            ViewGroup.LayoutParams layoutParams = this.f14237b.getLayoutParams();
            ViewGroup viewGroup = (ViewGroup) this.f14237b.getParent();
            if (viewGroup != null && (viewGroup instanceof MaterialRippleLayout)) {
                throw new IllegalStateException("MaterialRippleLayout could not be created: parent of the view already is a MaterialRippleLayout");
            }
            if (viewGroup != null) {
                i5 = viewGroup.indexOfChild(this.f14237b);
                viewGroup.removeView(this.f14237b);
            } else {
                i5 = 0;
            }
            materialRippleLayout.addView(this.f14237b, new ViewGroup.LayoutParams(-1, -1));
            if (viewGroup != null) {
                viewGroup.addView(materialRippleLayout, i5, layoutParams);
            }
            return materialRippleLayout;
        }

        public h b(float f5) {
            this.f14243h = f5;
            return this;
        }

        public h c(int i5) {
            this.f14247l = i5;
            return this;
        }

        public h d(int i5) {
            this.f14238c = i5;
            return this;
        }

        public h e(boolean z4) {
            this.f14244i = z4;
            return this;
        }

        public h f(int i5) {
            this.f14241f = i5;
            return this;
        }

        public h g(int i5) {
            this.f14242g = i5;
            return this;
        }

        public h h(int i5) {
            this.f14245j = i5;
            return this;
        }

        public h i(boolean z4) {
            this.f14240e = z4;
            return this;
        }

        public h j(boolean z4) {
            this.f14248m = z4;
            return this;
        }

        public h k(boolean z4) {
            this.f14239d = z4;
            return this;
        }

        public h l(boolean z4) {
            this.f14246k = z4;
            return this;
        }

        public h m(int i5) {
            this.f14249n = i5;
            return this;
        }
    }

    public MaterialRippleLayout(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        if (this.f14223w) {
            return;
        }
        ObjectAnimator objectAnimator = this.f14219s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, this.D, this.f14206f, (float) (Math.sqrt(Math.pow(getWidth(), 2.0d) + Math.pow(getHeight(), 2.0d)) * 1.2000000476837158d)).setDuration(f14200y0);
        this.f14219s = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.f14219s.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(Runnable runnable) {
        if (this.f14223w) {
            return;
        }
        float endRadius = getEndRadius();
        p();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f14218r = animatorSet;
        animatorSet.addListener(new e(runnable));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.D, this.f14215o, endRadius);
        ofFloat.setDuration(this.f14207g);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, this.E, this.f14208h, 0);
        ofInt.setDuration(this.f14210j);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.setStartDelay((this.f14207g - this.f14210j) - 50);
        if (this.f14211k) {
            this.f14218r.play(ofFloat);
        } else if (getRadius() > endRadius) {
            ofInt.setStartDelay(0L);
            this.f14218r.play(ofInt);
        } else {
            this.f14218r.playTogether(ofFloat, ofInt);
        }
        this.f14218r.start();
    }

    private float getEndRadius() {
        float f5;
        float f6;
        int width = getWidth();
        int height = getHeight();
        int i5 = width / 2;
        int i6 = height / 2;
        Point point = this.f14220t;
        int i7 = point.x;
        if (i5 > i7) {
            f5 = width - i7;
        } else {
            f5 = i7;
        }
        int i8 = point.y;
        if (i6 > i8) {
            f6 = height - i8;
        } else {
            f6 = i8;
        }
        return ((float) Math.sqrt(Math.pow(f5, 2.0d) + Math.pow(f6, 2.0d))) * 1.2f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getRadius() {
        return this.f14215o;
    }

    private boolean o() {
        boolean z4;
        if (!this.f14213m) {
            return false;
        }
        int positionForView = u().getPositionForView(this);
        if (positionForView != this.f14225y) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f14225y = positionForView;
        if (z4) {
            q();
            p();
            this.f14217q.setPressed(false);
            setRadius(0.0f);
        }
        return z4;
    }

    private void p() {
        AnimatorSet animatorSet = this.f14218r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f14218r.removeAllListeners();
        }
        ObjectAnimator objectAnimator = this.f14219s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        g gVar = this.B;
        if (gVar != null) {
            removeCallbacks(gVar);
            this.f14224x = false;
        }
    }

    static float r(Resources resources, float f5) {
        return TypedValue.applyDimension(1, f5, resources.getDisplayMetrics());
    }

    private void s() {
    }

    private boolean t(View view, int i5, int i6) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                if (rect.contains(i5, i6)) {
                    return t(childAt, i5 - rect.left, i6 - rect.top);
                }
            }
        } else if (view != this.f14217q) {
            if (!view.isEnabled()) {
                return false;
            }
            if (!view.isClickable() && !view.isLongClickable() && !view.isFocusableInTouchMode()) {
                return false;
            }
            return true;
        }
        return view.isFocusableInTouchMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AdapterView u() {
        AdapterView adapterView = this.f14216p;
        if (adapterView != null) {
            return adapterView;
        }
        ViewParent parent = getParent();
        while (!(parent instanceof AdapterView)) {
            try {
                parent = parent.getParent();
            } catch (NullPointerException unused) {
                throw new RuntimeException("Could not find a parent AdapterView");
            }
        }
        AdapterView adapterView2 = (AdapterView) parent;
        this.f14216p = adapterView2;
        return adapterView2;
    }

    private boolean v() {
        for (ViewParent parent = getParent(); parent != null && (parent instanceof ViewGroup); parent = parent.getParent()) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public static h w(View view) {
        return new h(view);
    }

    private void z() {
        if (this.f14213m) {
            this.f14225y = u().getPositionForView(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            this.f14217q = view;
            super.addView(view, i5, layoutParams);
            return;
        }
        throw new IllegalStateException("MaterialRippleLayout can host only one child");
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean o5 = o();
        if (this.f14204d) {
            if (!o5) {
                this.f14212l.draw(canvas);
            }
            super.draw(canvas);
            if (!o5) {
                if (this.f14214n != 0.0f) {
                    Path path = new Path();
                    RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
                    float f5 = this.f14214n;
                    path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
                    canvas.clipPath(path);
                }
                Point point = this.f14220t;
                canvas.drawCircle(point.x, point.y, this.f14215o, this.f14201a);
                return;
            }
            return;
        }
        if (!o5) {
            this.f14212l.draw(canvas);
            Point point2 = this.f14220t;
            canvas.drawCircle(point2.x, point2.y, this.f14215o, this.f14201a);
        }
        super.draw(canvas);
    }

    public <T extends View> T getChildView() {
        return (T) this.f14217q;
    }

    public int getRippleAlpha() {
        return this.f14201a.getAlpha();
    }

    @Override // android.view.View
    public boolean isInEditMode() {
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !t(this.f14217q, (int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        this.f14202b.set(0, 0, i5, i6);
        this.f14212l.setBounds(this.f14202b);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (isEnabled() && this.f14217q.isEnabled()) {
            boolean contains = this.f14202b.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            if (contains) {
                Point point = this.f14221u;
                Point point2 = this.f14220t;
                point.set(point2.x, point2.y);
                this.f14220t.set((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (!this.f14226z.onTouchEvent(motionEvent) && !this.C) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    a aVar = null;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                if (this.f14213m) {
                                    Point point3 = this.f14220t;
                                    Point point4 = this.f14221u;
                                    point3.set(point4.x, point4.y);
                                    this.f14221u = new Point();
                                }
                                this.f14217q.onTouchEvent(motionEvent);
                                if (this.f14205e) {
                                    if (!this.f14224x) {
                                        B(null);
                                    }
                                } else {
                                    this.f14217q.setPressed(false);
                                }
                                q();
                            }
                        } else {
                            if (this.f14205e) {
                                if (contains && !this.f14223w) {
                                    invalidate();
                                } else if (!contains) {
                                    B(null);
                                }
                            }
                            if (!contains) {
                                q();
                                ObjectAnimator objectAnimator = this.f14219s;
                                if (objectAnimator != null) {
                                    objectAnimator.cancel();
                                }
                                this.f14217q.onTouchEvent(motionEvent);
                                this.f14223w = true;
                            }
                        }
                    } else {
                        this.A = new f(this, aVar);
                        if (this.f14224x) {
                            this.f14217q.setPressed(true);
                            postDelayed(new d(), ViewConfiguration.getPressedStateDuration());
                        }
                        if (contains) {
                            B(this.A);
                        } else if (!this.f14205e) {
                            setRadius(0.0f);
                        }
                        if (!this.f14209i && contains) {
                            this.A.run();
                        }
                        q();
                    }
                } else {
                    z();
                    this.f14223w = false;
                    this.B = new g(motionEvent);
                    if (v()) {
                        q();
                        this.f14224x = true;
                        postDelayed(this.B, ViewConfiguration.getTapTimeout());
                    } else {
                        this.B.run();
                    }
                }
            }
            return true;
        }
        return onTouchEvent;
    }

    public void setDefaultRippleAlpha(float f5) {
        int i5 = (int) (f5 * 255.0f);
        this.f14208h = i5;
        this.f14201a.setAlpha(i5);
        invalidate();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        View view = this.f14217q;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            return;
        }
        throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        View view = this.f14217q;
        if (view != null) {
            view.setOnLongClickListener(onLongClickListener);
            return;
        }
        throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
    }

    public void setRadius(float f5) {
        this.f14215o = f5;
        invalidate();
    }

    public void setRippleAlpha(Integer num) {
        this.f14201a.setAlpha(num.intValue());
        invalidate();
    }

    public void setRippleBackground(int i5) {
        ColorDrawable colorDrawable = new ColorDrawable(i5);
        this.f14212l = colorDrawable;
        colorDrawable.setBounds(this.f14202b);
        invalidate();
    }

    public void setRippleColor(int i5) {
        this.f14203c = i5;
        this.f14201a.setColor(i5);
        this.f14201a.setAlpha(this.f14208h);
        invalidate();
    }

    public void setRippleDelayClick(boolean z4) {
        this.f14209i = z4;
    }

    public void setRippleDiameter(int i5) {
        this.f14206f = i5;
    }

    public void setRippleDuration(int i5) {
        this.f14207g = i5;
    }

    public void setRippleFadeDuration(int i5) {
        this.f14210j = i5;
    }

    public void setRippleHover(boolean z4) {
        this.f14205e = z4;
    }

    public void setRippleInAdapter(boolean z4) {
        this.f14213m = z4;
    }

    public void setRippleOverlay(boolean z4) {
        this.f14204d = z4;
    }

    public void setRipplePersistent(boolean z4) {
        this.f14211k = z4;
    }

    public void setRippleRoundedCorners(int i5) {
        this.f14214n = i5;
        s();
    }

    public void x() {
        this.f14220t = new Point(getWidth() / 2, getHeight() / 2);
        B(null);
    }

    public void y(Point point) {
        this.f14220t = new Point(point.x, point.y);
        B(null);
    }

    public MaterialRippleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialRippleLayout(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        Paint paint = new Paint(1);
        this.f14201a = paint;
        this.f14202b = new Rect();
        this.f14220t = new Point();
        this.f14221u = new Point();
        this.D = new a(Float.class, "radius");
        this.E = new b(Integer.class, "rippleAlpha");
        this.F = new c();
        setWillNotDraw(false);
        this.f14226z = new GestureDetector(context, this.F);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialRippleLayout);
        this.f14203c = obtainStyledAttributes.getColor(2, -16777216);
        this.f14206f = obtainStyledAttributes.getDimensionPixelSize(4, (int) r(getResources(), I));
        this.f14204d = obtainStyledAttributes.getBoolean(9, false);
        this.f14205e = obtainStyledAttributes.getBoolean(7, true);
        this.f14207g = obtainStyledAttributes.getInt(5, G);
        this.f14208h = (int) (obtainStyledAttributes.getFloat(0, 0.2f) * 255.0f);
        this.f14209i = obtainStyledAttributes.getBoolean(3, true);
        this.f14210j = obtainStyledAttributes.getInteger(6, 75);
        this.f14212l = new ColorDrawable(obtainStyledAttributes.getColor(1, 0));
        this.f14211k = obtainStyledAttributes.getBoolean(10, false);
        this.f14213m = obtainStyledAttributes.getBoolean(8, false);
        this.f14214n = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        obtainStyledAttributes.recycle();
        paint.setColor(this.f14203c);
        paint.setAlpha(this.f14208h);
        s();
    }
}
