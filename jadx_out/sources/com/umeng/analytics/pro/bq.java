package com.umeng.analytics.pro;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* loaded from: classes3.dex */
public class bq extends bx {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12348a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12349b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12350c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12351d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f12352e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f12353f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f12354g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final int f12355h = 7;

    /* renamed from: j, reason: collision with root package name */
    private static final cv f12356j = new cv("TApplicationException");

    /* renamed from: k, reason: collision with root package name */
    private static final cl f12357k = new cl(CrashHianalyticsData.MESSAGE, (byte) 11, 1);

    /* renamed from: l, reason: collision with root package name */
    private static final cl f12358l = new cl("type", (byte) 8, 2);

    /* renamed from: m, reason: collision with root package name */
    private static final long f12359m = 1;

    /* renamed from: i, reason: collision with root package name */
    protected int f12360i;

    public bq() {
        this.f12360i = 0;
    }

    public int a() {
        return this.f12360i;
    }

    public void b(cq cqVar) throws bx {
        cqVar.a(f12356j);
        if (getMessage() != null) {
            cqVar.a(f12357k);
            cqVar.a(getMessage());
            cqVar.c();
        }
        cqVar.a(f12358l);
        cqVar.a(this.f12360i);
        cqVar.c();
        cqVar.d();
        cqVar.b();
    }

    public static bq a(cq cqVar) throws bx {
        cqVar.j();
        String str = null;
        int i5 = 0;
        while (true) {
            cl l5 = cqVar.l();
            byte b5 = l5.f12438b;
            if (b5 == 0) {
                cqVar.k();
                return new bq(i5, str);
            }
            short s5 = l5.f12439c;
            if (s5 != 1) {
                if (s5 != 2) {
                    ct.a(cqVar, b5);
                } else if (b5 == 8) {
                    i5 = cqVar.w();
                } else {
                    ct.a(cqVar, b5);
                }
            } else if (b5 == 11) {
                str = cqVar.z();
            } else {
                ct.a(cqVar, b5);
            }
            cqVar.m();
        }
    }

    public bq(int i5) {
        this.f12360i = i5;
    }

    public bq(int i5, String str) {
        super(str);
        this.f12360i = i5;
    }

    public bq(String str) {
        super(str);
        this.f12360i = 0;
    }
}
