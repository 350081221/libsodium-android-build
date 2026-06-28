package com.umeng.analytics.pro;

import com.umeng.analytics.pro.ck;

/* loaded from: classes3.dex */
public class ct {

    /* renamed from: a, reason: collision with root package name */
    private static int f12461a = Integer.MAX_VALUE;

    public static void a(int i5) {
        f12461a = i5;
    }

    public static void a(cq cqVar, byte b5) throws bx {
        a(cqVar, b5, f12461a);
    }

    public static void a(cq cqVar, byte b5, int i5) throws bx {
        if (i5 > 0) {
            int i6 = 0;
            switch (b5) {
                case 2:
                    cqVar.t();
                    return;
                case 3:
                    cqVar.u();
                    return;
                case 4:
                    cqVar.y();
                    return;
                case 5:
                case 7:
                case 9:
                default:
                    return;
                case 6:
                    cqVar.v();
                    return;
                case 8:
                    cqVar.w();
                    return;
                case 10:
                    cqVar.x();
                    return;
                case 11:
                    cqVar.A();
                    return;
                case 12:
                    cqVar.j();
                    while (true) {
                        byte b6 = cqVar.l().f12438b;
                        if (b6 == 0) {
                            cqVar.k();
                            return;
                        } else {
                            a(cqVar, b6, i5 - 1);
                            cqVar.m();
                        }
                    }
                case 13:
                    cn n5 = cqVar.n();
                    while (i6 < n5.f12444c) {
                        int i7 = i5 - 1;
                        a(cqVar, n5.f12442a, i7);
                        a(cqVar, n5.f12443b, i7);
                        i6++;
                    }
                    cqVar.o();
                    return;
                case 14:
                    cu r5 = cqVar.r();
                    while (i6 < r5.f12463b) {
                        a(cqVar, r5.f12462a, i5 - 1);
                        i6++;
                    }
                    cqVar.s();
                    return;
                case 15:
                    cm p5 = cqVar.p();
                    while (i6 < p5.f12441b) {
                        a(cqVar, p5.f12440a, i5 - 1);
                        i6++;
                    }
                    cqVar.q();
                    return;
            }
        } else {
            throw new bx("Maximum skip depth exceeded");
        }
    }

    public static cs a(byte[] bArr, cs csVar) {
        if (bArr[0] > 16) {
            return new ck.a();
        }
        return (bArr.length <= 1 || (bArr[1] & kotlin.jvm.internal.o.f19427b) == 0) ? csVar : new ck.a();
    }
}
