package com.yuanqi.group.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public class DragSelectRecyclerView extends RecyclerView {

    /* renamed from: x, reason: collision with root package name */
    private static final boolean f14089x = false;

    /* renamed from: y, reason: collision with root package name */
    private static final int f14090y = 25;

    /* renamed from: a, reason: collision with root package name */
    private int f14091a;

    /* renamed from: b, reason: collision with root package name */
    private DragSelectRecyclerViewAdapter<?> f14092b;

    /* renamed from: c, reason: collision with root package name */
    private int f14093c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14094d;

    /* renamed from: e, reason: collision with root package name */
    private int f14095e;

    /* renamed from: f, reason: collision with root package name */
    private int f14096f;

    /* renamed from: g, reason: collision with root package name */
    private int f14097g;

    /* renamed from: h, reason: collision with root package name */
    private int f14098h;

    /* renamed from: i, reason: collision with root package name */
    private int f14099i;

    /* renamed from: j, reason: collision with root package name */
    private int f14100j;

    /* renamed from: k, reason: collision with root package name */
    private int f14101k;

    /* renamed from: l, reason: collision with root package name */
    private int f14102l;

    /* renamed from: m, reason: collision with root package name */
    private int f14103m;

    /* renamed from: n, reason: collision with root package name */
    private int f14104n;

    /* renamed from: o, reason: collision with root package name */
    private b f14105o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f14106p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f14107q;

    /* renamed from: r, reason: collision with root package name */
    private Handler f14108r;

    /* renamed from: s, reason: collision with root package name */
    private Runnable f14109s;

    /* renamed from: t, reason: collision with root package name */
    private RectF f14110t;

    /* renamed from: u, reason: collision with root package name */
    private RectF f14111u;

    /* renamed from: v, reason: collision with root package name */
    private Paint f14112v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f14113w;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (DragSelectRecyclerView.this.f14108r == null) {
                return;
            }
            if (DragSelectRecyclerView.this.f14106p) {
                DragSelectRecyclerView dragSelectRecyclerView = DragSelectRecyclerView.this;
                dragSelectRecyclerView.scrollBy(0, -dragSelectRecyclerView.f14104n);
                DragSelectRecyclerView.this.f14108r.postDelayed(this, 25L);
            } else if (DragSelectRecyclerView.this.f14107q) {
                DragSelectRecyclerView dragSelectRecyclerView2 = DragSelectRecyclerView.this;
                dragSelectRecyclerView2.scrollBy(0, dragSelectRecyclerView2.f14104n);
                DragSelectRecyclerView.this.f14108r.postDelayed(this, 25L);
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(boolean z4);
    }

    public DragSelectRecyclerView(Context context) {
        super(context);
        this.f14091a = -1;
        this.f14109s = new a();
        this.f14113w = false;
        h(context, null);
    }

    private static void a(String str, Object... objArr) {
    }

    private int g(MotionEvent motionEvent) {
        View findChildViewUnder = findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        if (findChildViewUnder == null) {
            return -1;
        }
        if (findChildViewUnder.getTag() != null && (findChildViewUnder.getTag() instanceof RecyclerView.ViewHolder)) {
            return ((RecyclerView.ViewHolder) findChildViewUnder.getTag()).getAdapterPosition();
        }
        throw new IllegalStateException("Make sure your adapter makes a call to super.onBindViewHolder(), and doesn't override itemView tags.");
    }

    private void h(Context context, AttributeSet attributeSet) {
        this.f14108r = new Handler();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dsrv_defaultHotspotHeight);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.DragSelectRecyclerView, 0, 0);
            try {
                if (!obtainStyledAttributes.getBoolean(0, true)) {
                    this.f14097g = -1;
                    this.f14098h = -1;
                    this.f14099i = -1;
                    a("Auto-scroll disabled", new Object[0]);
                } else {
                    this.f14097g = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
                    this.f14098h = obtainStyledAttributes.getDimensionPixelSize(3, 0);
                    this.f14099i = obtainStyledAttributes.getDimensionPixelSize(2, 0);
                    a("Hotspot height = %d", Integer.valueOf(this.f14097g));
                }
                return;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f14097g = dimensionPixelSize;
        a("Hotspot height = %d", Integer.valueOf(dimensionPixelSize));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f14092b.getItemCount() == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.f14094d) {
            if (motionEvent.getAction() == 1) {
                this.f14094d = false;
                this.f14106p = false;
                this.f14107q = false;
                this.f14108r.removeCallbacks(this.f14109s);
                b bVar = this.f14105o;
                if (bVar != null) {
                    bVar.a(false);
                }
                return true;
            }
            if (motionEvent.getAction() == 2) {
                if (this.f14097g > -1) {
                    if (motionEvent.getY() >= this.f14100j && motionEvent.getY() <= this.f14101k) {
                        this.f14107q = false;
                        if (!this.f14106p) {
                            this.f14106p = true;
                            a("Now in TOP hotspot", new Object[0]);
                            this.f14108r.removeCallbacks(this.f14109s);
                            this.f14108r.postDelayed(this.f14109s, 25L);
                        }
                        int y4 = ((int) ((this.f14101k - this.f14100j) - (motionEvent.getY() - this.f14100j))) / 2;
                        this.f14104n = y4;
                        a("Auto scroll velocity = %d", Integer.valueOf(y4));
                    } else if (motionEvent.getY() >= this.f14102l && motionEvent.getY() <= this.f14103m) {
                        this.f14106p = false;
                        if (!this.f14107q) {
                            this.f14107q = true;
                            a("Now in BOTTOM hotspot", new Object[0]);
                            this.f14108r.removeCallbacks(this.f14109s);
                            this.f14108r.postDelayed(this.f14109s, 25L);
                        }
                        int y5 = ((int) ((motionEvent.getY() + this.f14103m) - (this.f14102l + r0))) / 2;
                        this.f14104n = y5;
                        a("Auto scroll velocity = %d", Integer.valueOf(y5));
                    } else if (this.f14106p || this.f14107q) {
                        a("Left the hotspot", new Object[0]);
                        this.f14108r.removeCallbacks(this.f14109s);
                        this.f14106p = false;
                        this.f14107q = false;
                    }
                }
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void f() {
        this.f14113w = true;
        invalidate();
    }

    public boolean i(boolean z4, int i5) {
        if (z4 && this.f14094d) {
            a("Drag selection is already active.", new Object[0]);
            return false;
        }
        this.f14091a = -1;
        this.f14095e = -1;
        this.f14096f = -1;
        if (!this.f14092b.e(i5)) {
            this.f14094d = false;
            this.f14093c = -1;
            this.f14091a = -1;
            a("Index %d is not selectable.", Integer.valueOf(i5));
            return false;
        }
        this.f14092b.m(i5, true);
        this.f14094d = z4;
        this.f14093c = i5;
        this.f14091a = i5;
        b bVar = this.f14105o;
        if (bVar != null) {
            bVar.a(true);
        }
        a("Drag selection initialized, starting at index %d.", Integer.valueOf(i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f14113w) {
            if (this.f14112v == null) {
                Paint paint = new Paint();
                this.f14112v = paint;
                paint.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f14112v.setAntiAlias(true);
                this.f14112v.setStyle(Paint.Style.FILL);
                this.f14110t = new RectF(0.0f, this.f14100j, getMeasuredWidth(), this.f14101k);
                this.f14111u = new RectF(0.0f, this.f14102l, getMeasuredWidth(), this.f14103m);
            }
            canvas.drawRect(this.f14110t, this.f14112v);
            canvas.drawRect(this.f14111u, this.f14112v);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        int i7 = this.f14097g;
        if (i7 > -1) {
            int i8 = this.f14098h;
            this.f14100j = i8;
            this.f14101k = i8 + i7;
            this.f14102l = (getMeasuredHeight() - this.f14097g) - this.f14099i;
            this.f14103m = getMeasuredHeight() - this.f14099i;
            a("RecyclerView height = %d", Integer.valueOf(getMeasuredHeight()));
            a("Hotspot top bound = %d to %d", Integer.valueOf(this.f14100j), Integer.valueOf(this.f14100j));
            a("Hotspot bottom bound = %d to %d", Integer.valueOf(this.f14102l), Integer.valueOf(this.f14103m));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @Deprecated
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (adapter instanceof DragSelectRecyclerViewAdapter) {
            setAdapter((DragSelectRecyclerViewAdapter<?>) adapter);
            return;
        }
        throw new IllegalArgumentException("Adapter must be a DragSelectRecyclerViewAdapter.");
    }

    public void setFingerListener(@Nullable b bVar) {
        this.f14105o = bVar;
    }

    public void setAdapter(DragSelectRecyclerViewAdapter<?> dragSelectRecyclerViewAdapter) {
        super.setAdapter((RecyclerView.Adapter) dragSelectRecyclerViewAdapter);
        this.f14092b = dragSelectRecyclerViewAdapter;
    }

    public DragSelectRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14091a = -1;
        this.f14109s = new a();
        this.f14113w = false;
        h(context, attributeSet);
    }

    public DragSelectRecyclerView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f14091a = -1;
        this.f14109s = new a();
        this.f14113w = false;
        h(context, attributeSet);
    }
}
