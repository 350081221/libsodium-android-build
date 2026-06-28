package com.umeng.analytics.pro;

/* loaded from: classes3.dex */
public final class co {

    /* renamed from: a, reason: collision with root package name */
    public final String f12445a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f12446b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12447c;

    public co() {
        this("", (byte) 0, 0);
    }

    public boolean a(co coVar) {
        return this.f12445a.equals(coVar.f12445a) && this.f12446b == coVar.f12446b && this.f12447c == coVar.f12447c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof co) {
            return a((co) obj);
        }
        return false;
    }

    public String toString() {
        return "<TMessage name:'" + this.f12445a + "' type: " + ((int) this.f12446b) + " seqid:" + this.f12447c + ">";
    }

    public co(String str, byte b5, int i5) {
        this.f12445a = str;
        this.f12446b = b5;
        this.f12447c = i5;
    }
}
