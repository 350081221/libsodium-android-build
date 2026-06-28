package org.ccil.cowan.tagsoup;

import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class o {
    public static final int B = -1;
    public static final int C = 0;
    public static final int D = 1073741824;
    public static final int E = Integer.MIN_VALUE;
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 4;

    /* renamed from: w, reason: collision with root package name */
    private HashMap f21281w = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    private HashMap f21282x = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    private String f21283y = "";

    /* renamed from: z, reason: collision with root package name */
    private String f21284z = "";
    private e A = null;

    public void a(String str, String str2, String str3, String str4) {
        e d5 = d(str);
        if (d5 != null) {
            d5.n(str2, str3, str4);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Attribute ");
        stringBuffer.append(str2);
        stringBuffer.append(" specified for unknown element type ");
        stringBuffer.append(str);
        throw new Error(stringBuffer.toString());
    }

    public void b(String str, int i5, int i6, int i7) {
        e eVar = new e(str, i5, i6, i7, this);
        this.f21282x.put(str.toLowerCase(), eVar);
        if (i6 == Integer.MIN_VALUE) {
            this.A = eVar;
        }
    }

    public void c(String str, int i5) {
        this.f21281w.put(str, new Integer(i5));
    }

    public e d(String str) {
        return (e) this.f21282x.get(str.toLowerCase());
    }

    public int e(String str) {
        Integer num = (Integer) this.f21281w.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String f() {
        return this.f21284z;
    }

    public String g() {
        return this.f21283y;
    }

    public void h(String str, String str2) {
        e d5 = d(str);
        e d6 = d(str2);
        if (d5 != null) {
            if (d6 != null) {
                d5.s(d6);
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No parent ");
            stringBuffer.append(str2);
            stringBuffer.append(" for child ");
            stringBuffer.append(str);
            throw new Error(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("No child ");
        stringBuffer2.append(str);
        stringBuffer2.append(" for parent ");
        stringBuffer2.append(str2);
        throw new Error(stringBuffer2.toString());
    }

    public e i() {
        return this.A;
    }

    public void j(String str) {
        this.f21284z = str;
    }

    public void k(String str) {
        this.f21283y = str;
    }
}
