package org.osmdroid.views.overlay.simplefastpoint;

import android.graphics.Color;
import android.graphics.Paint;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected Paint f22071a;

    /* renamed from: b, reason: collision with root package name */
    protected Paint f22072b;

    /* renamed from: c, reason: collision with root package name */
    protected Paint f22073c;

    /* renamed from: d, reason: collision with root package name */
    protected float f22074d = 5.0f;

    /* renamed from: e, reason: collision with root package name */
    protected float f22075e = 13.0f;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f22076f = true;

    /* renamed from: g, reason: collision with root package name */
    protected int f22077g = 10;

    /* renamed from: h, reason: collision with root package name */
    protected b f22078h = b.MAXIMUM_OPTIMIZATION;

    /* renamed from: i, reason: collision with root package name */
    protected c f22079i = c.SQUARE;

    /* renamed from: j, reason: collision with root package name */
    protected EnumC0654a f22080j = EnumC0654a.ZOOM_THRESHOLD;

    /* renamed from: k, reason: collision with root package name */
    protected int f22081k = 250;

    /* renamed from: l, reason: collision with root package name */
    protected int f22082l = 11;

    /* renamed from: org.osmdroid.views.overlay.simplefastpoint.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0654a {
        ZOOM_THRESHOLD,
        DENSITY_THRESHOLD
    }

    /* loaded from: classes4.dex */
    public enum b {
        NO_OPTIMIZATION,
        MEDIUM_OPTIMIZATION,
        MAXIMUM_OPTIMIZATION
    }

    /* loaded from: classes4.dex */
    public enum c {
        CIRCLE,
        SQUARE
    }

    public a() {
        Paint paint = new Paint();
        this.f22071a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f22071a.setColor(Color.parseColor("#ff7700"));
        Paint paint2 = new Paint();
        this.f22072b = paint2;
        paint2.setStrokeWidth(5.0f);
        this.f22072b.setStyle(Paint.Style.STROKE);
        this.f22072b.setColor(Color.parseColor("#ffff00"));
        Paint paint3 = new Paint();
        this.f22073c = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f22073c.setColor(Color.parseColor("#ffff00"));
        this.f22073c.setTextAlign(Paint.Align.CENTER);
        this.f22073c.setTextSize(24.0f);
    }

    public static a d() {
        return new a();
    }

    public b a() {
        return this.f22078h;
    }

    public int b() {
        return this.f22077g;
    }

    public float c() {
        return this.f22074d;
    }

    public EnumC0654a e() {
        return this.f22080j;
    }

    public int f() {
        return this.f22081k;
    }

    public int g() {
        return this.f22082l;
    }

    public Paint h() {
        return this.f22071a;
    }

    public float i() {
        return this.f22075e;
    }

    public Paint j() {
        return this.f22072b;
    }

    public c k() {
        return this.f22079i;
    }

    public Paint l() {
        return this.f22073c;
    }

    public boolean m() {
        return this.f22076f;
    }

    public a n(b bVar) {
        this.f22078h = bVar;
        return this;
    }

    public a o(int i5) {
        this.f22077g = i5;
        return this;
    }

    public a p(boolean z4) {
        this.f22076f = z4;
        return this;
    }

    public a q(EnumC0654a enumC0654a) {
        this.f22080j = enumC0654a;
        return this;
    }

    public a r(int i5) {
        this.f22081k = i5;
        return this;
    }

    public a s(int i5) {
        this.f22082l = i5;
        return this;
    }

    public a t(Paint paint) {
        this.f22071a = paint;
        return this;
    }

    public a u(float f5) {
        this.f22074d = f5;
        return this;
    }

    public a v(Paint paint) {
        this.f22072b = paint;
        return this;
    }

    public a w(float f5) {
        this.f22075e = f5;
        return this;
    }

    public a x(c cVar) {
        this.f22079i = cVar;
        return this;
    }

    public a y(Paint paint) {
        this.f22073c = paint;
        return this;
    }
}
