package f0;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public String f16057a;

    /* renamed from: b, reason: collision with root package name */
    public int f16058b;

    /* renamed from: c, reason: collision with root package name */
    public long f16059c = System.currentTimeMillis() + 86400000;

    public d(String str, int i5) {
        this.f16057a = str;
        this.f16058b = i5;
    }

    public String toString() {
        return "ValueData{value='" + this.f16057a + "', code=" + this.f16058b + ", expired=" + this.f16059c + '}';
    }
}
