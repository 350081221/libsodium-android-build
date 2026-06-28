package com.umeng.analytics.pro;

/* loaded from: classes3.dex */
public class cl {

    /* renamed from: a, reason: collision with root package name */
    public final String f12437a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f12438b;

    /* renamed from: c, reason: collision with root package name */
    public final short f12439c;

    public cl() {
        this("", (byte) 0, (short) 0);
    }

    public boolean a(cl clVar) {
        return this.f12438b == clVar.f12438b && this.f12439c == clVar.f12439c;
    }

    public String toString() {
        return "<TField name:'" + this.f12437a + "' type:" + ((int) this.f12438b) + " field-id:" + ((int) this.f12439c) + ">";
    }

    public cl(String str, byte b5, short s5) {
        this.f12437a = str;
        this.f12438b = b5;
        this.f12439c = s5;
    }
}
