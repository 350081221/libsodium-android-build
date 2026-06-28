package com.yuanqi.master.tools.guide.core;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.yuanqi.master.tools.guide.model.b;
import com.yuanqi.master.tools.guide.model.f;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class GuideLayout extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int f15117h = -1308622848;

    /* renamed from: a, reason: collision with root package name */
    private com.yuanqi.master.tools.guide.core.b f15118a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f15119b;

    /* renamed from: c, reason: collision with root package name */
    public com.yuanqi.master.tools.guide.model.a f15120c;

    /* renamed from: d, reason: collision with root package name */
    private e f15121d;

    /* renamed from: e, reason: collision with root package name */
    private float f15122e;

    /* renamed from: f, reason: collision with root package name */
    private float f15123f;

    /* renamed from: g, reason: collision with root package name */
    private int f15124g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GuideLayout.this.f15120c.C()) {
                GuideLayout.this.h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GuideLayout.this.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends y2.a {
        c() {
        }

        @Override // y2.a, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            GuideLayout.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15128a;

        static {
            int[] iArr = new int[b.a.values().length];
            f15128a = iArr;
            try {
                iArr[b.a.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15128a[b.a.OVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15128a[b.a.ROUND_RECTANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15128a[b.a.RECTANGLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface e {
        void a(GuideLayout guideLayout);
    }

    public GuideLayout(Context context, com.yuanqi.master.tools.guide.model.a aVar, com.yuanqi.master.tools.guide.core.b bVar) {
        super(context);
        e();
        setGuidePage(aVar);
        this.f15118a = bVar;
    }

    private void b(com.yuanqi.master.tools.guide.model.a aVar) {
        removeAllViews();
        int y4 = aVar.y();
        if (y4 != 0) {
            View inflate = LayoutInflater.from(getContext()).inflate(y4, (ViewGroup) this, false);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            int[] u4 = aVar.u();
            if (u4 != null && u4.length > 0) {
                for (int i5 : u4) {
                    View findViewById = inflate.findViewById(i5);
                    if (findViewById != null) {
                        findViewById.setOnClickListener(new b());
                    } else {
                        Log.w(x2.a.f22642a, "can't find the view by id : " + i5 + " which used to remove guide page");
                    }
                }
            }
            y2.d z4 = aVar.z();
            if (z4 != null) {
                z4.a(inflate, this.f15118a);
            }
            addView(inflate, layoutParams);
        }
        List<f> A = aVar.A();
        if (A.size() > 0) {
            Iterator<f> it = A.iterator();
            while (it.hasNext()) {
                addView(it.next().a((ViewGroup) getParent(), this.f15118a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
            e eVar = this.f15121d;
            if (eVar != null) {
                eVar.a(this);
            }
        }
    }

    private void d(Canvas canvas) {
        List<com.yuanqi.master.tools.guide.model.b> x4 = this.f15120c.x();
        if (x4 != null) {
            for (com.yuanqi.master.tools.guide.model.b bVar : x4) {
                RectF a5 = bVar.a((ViewGroup) getParent());
                int i5 = d.f15128a[bVar.getShape().ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            canvas.drawRect(a5, this.f15119b);
                        } else {
                            canvas.drawRoundRect(a5, bVar.b(), bVar.b(), this.f15119b);
                        }
                    } else {
                        canvas.drawOval(a5, this.f15119b);
                    }
                } else {
                    canvas.drawCircle(a5.centerX(), a5.centerY(), bVar.getRadius(), this.f15119b);
                }
                g(canvas, bVar, a5);
            }
        }
    }

    private void e() {
        Paint paint = new Paint();
        this.f15119b = paint;
        paint.setAntiAlias(true);
        this.f15119b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f15119b.setMaskFilter(new BlurMaskFilter(10.0f, BlurMaskFilter.Blur.INNER));
        setLayerType(1, null);
        setWillNotDraw(false);
        this.f15124g = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private void f(com.yuanqi.master.tools.guide.model.b bVar) {
        View.OnClickListener onClickListener;
        com.yuanqi.master.tools.guide.model.c options = bVar.getOptions();
        if (options != null && (onClickListener = options.f15168a) != null) {
            onClickListener.onClick(this);
        }
    }

    private void g(Canvas canvas, com.yuanqi.master.tools.guide.model.b bVar, RectF rectF) {
        y2.c cVar;
        com.yuanqi.master.tools.guide.model.c options = bVar.getOptions();
        if (options != null && (cVar = options.f15170c) != null) {
            cVar.a(canvas, rectF);
        }
    }

    private void setGuidePage(com.yuanqi.master.tools.guide.model.a aVar) {
        this.f15120c = aVar;
        setOnClickListener(new a());
    }

    public void h() {
        Animation w4 = this.f15120c.w();
        if (w4 != null) {
            w4.setAnimationListener(new c());
            startAnimation(w4);
        } else {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(this.f15120c);
        Animation v4 = this.f15120c.v();
        if (v4 != null) {
            startAnimation(v4);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int t5 = this.f15120c.t();
        if (t5 == 0) {
            t5 = f15117h;
        }
        canvas.drawColor(t5);
        d(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                float x4 = motionEvent.getX();
                float y4 = motionEvent.getY();
                if (Math.abs(x4 - this.f15122e) < this.f15124g && Math.abs(y4 - this.f15123f) < this.f15124g) {
                    for (com.yuanqi.master.tools.guide.model.b bVar : this.f15120c.x()) {
                        if (bVar.a((ViewGroup) getParent()).contains(x4, y4)) {
                            f(bVar);
                            return true;
                        }
                    }
                    performClick();
                }
            }
        } else {
            this.f15122e = motionEvent.getX();
            this.f15123f = motionEvent.getY();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setOnGuideLayoutDismissListener(e eVar) {
        this.f15121d = eVar;
    }

    private GuideLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private GuideLayout(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
    }
}
