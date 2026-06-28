package f0;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public long f16049a;

    /* renamed from: b, reason: collision with root package name */
    public String f16050b;

    /* renamed from: c, reason: collision with root package name */
    public String f16051c;

    /* renamed from: d, reason: collision with root package name */
    public int f16052d;

    public a(String str) {
        this.f16051c = str;
    }

    public void a(int i5) {
        this.f16052d = i5;
    }

    public void b(long j5) {
        this.f16049a = j5;
    }

    public void c(String str) {
        this.f16050b = str;
    }

    public boolean d() {
        return this.f16049a > System.currentTimeMillis();
    }

    public void e() {
        this.f16049a = 0L;
    }
}
