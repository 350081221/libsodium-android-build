package com.zzhoujay.richtext.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class d extends Drawable {

    /* renamed from: k, reason: collision with root package name */
    private static final int f15686k = 855;

    /* renamed from: a, reason: collision with root package name */
    private Movie f15687a;

    /* renamed from: b, reason: collision with root package name */
    private long f15688b;

    /* renamed from: c, reason: collision with root package name */
    private int f15689c;

    /* renamed from: d, reason: collision with root package name */
    private int f15690d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15691e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f15692f;

    /* renamed from: g, reason: collision with root package name */
    private float f15693g;

    /* renamed from: h, reason: collision with root package name */
    private float f15694h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f15695i;

    /* renamed from: j, reason: collision with root package name */
    private Handler f15696j;

    /* loaded from: classes3.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == d.f15686k && d.this.f15691e && d.this.f15692f != null) {
                d.this.f15692f.invalidate();
                sendEmptyMessageDelayed(d.f15686k, 33L);
            }
        }
    }

    public d(Movie movie, int i5, int i6) {
        this.f15687a = movie;
        this.f15689c = i5;
        this.f15690d = i6;
        setBounds(0, 0, i6, i5);
        this.f15694h = 1.0f;
        this.f15693g = 1.0f;
        this.f15695i = new Paint();
        this.f15696j = new a(Looper.getMainLooper());
    }

    private void c() {
        this.f15693g = getBounds().width() / this.f15690d;
        this.f15694h = getBounds().height() / this.f15689c;
    }

    public int d() {
        return this.f15689c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f15688b == 0) {
            this.f15688b = uptimeMillis;
        }
        Movie movie = this.f15687a;
        if (movie != null) {
            int duration = movie.duration();
            if (duration == 0) {
                duration = 1000;
            }
            this.f15687a.setTime((int) ((uptimeMillis - this.f15688b) % duration));
            Rect bounds = getBounds();
            canvas.scale(this.f15693g, this.f15694h);
            this.f15687a.draw(canvas, bounds.left, bounds.top);
        }
    }

    public int e() {
        return this.f15690d;
    }

    public void f(TextView textView) {
        this.f15691e = true;
        this.f15692f = textView;
        this.f15696j.sendEmptyMessage(f15686k);
    }

    public void g() {
        this.f15691e = false;
        this.f15692f = null;
        this.f15687a = null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f15689c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f15690d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.f15695i.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@NonNull Rect rect) {
        super.setBounds(rect);
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15695i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i5, int i6, int i7, int i8) {
        super.setBounds(i5, i6, i7, i8);
        c();
    }
}
