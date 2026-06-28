package j1;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f18957a;

    /* renamed from: b, reason: collision with root package name */
    private String f18958b;

    /* renamed from: c, reason: collision with root package name */
    private String f18959c;

    /* renamed from: d, reason: collision with root package name */
    private String f18960d;

    /* renamed from: e, reason: collision with root package name */
    private int f18961e;

    public d(String str, String str2) {
        this.f18957a = str;
        this.f18958b = str2;
    }

    public String a() {
        return this.f18957a;
    }

    public String b() {
        return this.f18958b;
    }

    public String c() {
        return this.f18959c;
    }

    public String d() {
        return this.f18960d;
    }

    public int e() {
        return this.f18961e;
    }

    public String toString() {
        return "TTAdnConfig{mAppId='" + this.f18957a + "', mAppKey='" + this.f18958b + "'}";
    }

    public void a(String str) {
        this.f18959c = str;
    }

    public void b(String str) {
        this.f18960d = str;
    }

    public void a(int i5) {
        this.f18961e = i5;
    }
}
