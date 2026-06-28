package com.huawei.secure.android.common.util;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private String f9080a;

    /* renamed from: b, reason: collision with root package name */
    private Character f9081b;

    /* renamed from: c, reason: collision with root package name */
    private Character f9082c;

    /* renamed from: d, reason: collision with root package name */
    private int f9083d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f9084e = 0;

    public n(String str) {
        this.f9080a = str;
    }

    public static boolean e(Character ch) {
        if (ch == null) {
            return false;
        }
        char charValue = ch.charValue();
        return (charValue >= '0' && charValue <= '9') || (charValue >= 'a' && charValue <= 'f') || (charValue >= 'A' && charValue <= 'F');
    }

    public static boolean g(Character ch) {
        char charValue;
        return ch != null && (charValue = ch.charValue()) >= '0' && charValue <= '7';
    }

    public void a(Character ch) {
        this.f9081b = ch;
    }

    public boolean b() {
        if (this.f9081b != null) {
            return true;
        }
        String str = this.f9080a;
        if (str != null && str.length() != 0 && this.f9083d < this.f9080a.length()) {
            return true;
        }
        return false;
    }

    public boolean c(char c5) {
        Character ch = this.f9081b;
        if (ch != null && ch.charValue() == c5) {
            return true;
        }
        String str = this.f9080a;
        if (str != null && str.length() != 0 && this.f9083d < this.f9080a.length() && this.f9080a.charAt(this.f9083d) == c5) {
            return true;
        }
        return false;
    }

    public int d() {
        return this.f9083d;
    }

    public void f() {
        this.f9082c = this.f9081b;
        this.f9084e = this.f9083d;
    }

    public Character h() {
        Character ch = this.f9081b;
        if (ch != null) {
            this.f9081b = null;
            return ch;
        }
        String str = this.f9080a;
        if (str == null || str.length() == 0 || this.f9083d >= this.f9080a.length()) {
            return null;
        }
        String str2 = this.f9080a;
        int i5 = this.f9083d;
        this.f9083d = i5 + 1;
        return Character.valueOf(str2.charAt(i5));
    }

    public Character i() {
        Character h5 = h();
        if (h5 == null || !e(h5)) {
            return null;
        }
        return h5;
    }

    public Character j() {
        Character h5 = h();
        if (h5 == null || !g(h5)) {
            return null;
        }
        return h5;
    }

    public Character k() {
        Character ch = this.f9081b;
        if (ch != null) {
            return ch;
        }
        String str = this.f9080a;
        if (str == null || str.length() == 0 || this.f9083d >= this.f9080a.length()) {
            return null;
        }
        return Character.valueOf(this.f9080a.charAt(this.f9083d));
    }

    protected String l() {
        String substring = this.f9080a.substring(this.f9083d);
        if (this.f9081b != null) {
            return this.f9081b + substring;
        }
        return substring;
    }

    public void m() {
        this.f9081b = this.f9082c;
        this.f9083d = this.f9084e;
    }
}
