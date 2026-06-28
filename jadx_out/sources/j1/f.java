package j1;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class f implements Serializable, Comparable<f> {

    /* renamed from: a, reason: collision with root package name */
    private String f18966a;

    /* renamed from: b, reason: collision with root package name */
    private String f18967b;

    /* renamed from: c, reason: collision with root package name */
    private int f18968c;

    /* renamed from: d, reason: collision with root package name */
    private int f18969d;

    /* renamed from: e, reason: collision with root package name */
    private String f18970e;

    /* renamed from: f, reason: collision with root package name */
    private int f18971f;

    /* renamed from: g, reason: collision with root package name */
    private int f18972g;

    /* renamed from: h, reason: collision with root package name */
    private int f18973h;

    /* renamed from: i, reason: collision with root package name */
    private String f18974i;

    /* renamed from: j, reason: collision with root package name */
    private int f18975j;

    /* renamed from: k, reason: collision with root package name */
    private int f18976k;

    /* renamed from: l, reason: collision with root package name */
    private int f18977l;

    public int a() {
        return this.f18977l;
    }

    public String b() {
        return this.f18974i;
    }

    public int c() {
        return this.f18976k;
    }

    public String d() {
        return this.f18970e;
    }

    public int e() {
        return this.f18975j;
    }

    public int f() {
        return this.f18973h;
    }

    public int g() {
        return this.f18971f;
    }

    public String h() {
        return this.f18966a;
    }

    public String i() {
        return this.f18967b;
    }

    public boolean j() {
        int i5 = this.f18968c;
        return i5 == 1 || i5 == 2;
    }

    public int k() {
        return this.f18969d;
    }

    public void a(int i5) {
        this.f18977l = i5;
    }

    public void b(int i5) {
        this.f18976k = i5;
    }

    public void c(int i5) {
        this.f18973h = i5;
    }

    public void d(int i5) {
        this.f18971f = i5;
    }

    public void e(int i5) {
        this.f18972g = i5;
    }

    public void f(int i5) {
        this.f18968c = i5;
    }

    public void g(int i5) {
        this.f18969d = i5;
    }

    public void a(String str) {
        this.f18974i = str;
    }

    public void b(String str) {
        this.f18970e = str;
    }

    public void c(String str) {
        this.f18966a = str;
    }

    public void d(String str) {
        this.f18967b = str;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        if (fVar != null && this.f18971f <= fVar.g()) {
            return this.f18971f < fVar.g() ? -1 : 0;
        }
        return 1;
    }
}
