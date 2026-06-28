package org.repackage.com.meizu.flyme.openidsdk;

/* loaded from: classes4.dex */
class ValueData {

    /* renamed from: a, reason: collision with root package name */
    public String f22112a;

    /* renamed from: b, reason: collision with root package name */
    public int f22113b;

    /* renamed from: c, reason: collision with root package name */
    public long f22114c = System.currentTimeMillis() + 86400000;

    public ValueData(String str, int i5) {
        this.f22112a = str;
        this.f22113b = i5;
    }

    public String toString() {
        return "ValueData{value='" + this.f22112a + "', code=" + this.f22113b + ", expired=" + this.f22114c + '}';
    }
}
