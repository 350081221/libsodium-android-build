package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.model.layer.e;
import com.airbnb.lottie.parser.moshi.c;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.umeng.analytics.pro.bi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1710a = c.a.a("nm", "ind", "refId", y0.a.f22651s, "parent", "sw", "sh", "sc", MediationConstant.ADN_KS, "tt", "masksProperties", "shapes", bi.aL, "ef", "sr", "st", "w", bi.aJ, "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f1711b = c.a.a("d", bi.ay);

    /* renamed from: c, reason: collision with root package name */
    private static final c.a f1712c = c.a.a(y0.a.f22651s, "nm");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1713a;

        static {
            int[] iArr = new int[e.b.values().length];
            f1713a = iArr;
            try {
                iArr[e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1713a[e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private v() {
    }

    public static com.airbnb.lottie.model.layer.e a(com.airbnb.lottie.k kVar) {
        Rect b5 = kVar.b();
        return new com.airbnb.lottie.model.layer.e(Collections.emptyList(), kVar, "__container", -1L, e.a.PRE_COMP, -1L, null, Collections.emptyList(), new com.airbnb.lottie.model.animatable.l(), 0, 0, 0, 0.0f, 0.0f, b5.width(), b5.height(), null, null, Collections.emptyList(), e.b.NONE, null, false, null, null, com.airbnb.lottie.model.content.h.NORMAL);
    }

    public static com.airbnb.lottie.model.layer.e b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList;
        boolean z4;
        float f5;
        e.b bVar = e.b.NONE;
        com.airbnb.lottie.model.content.h hVar = com.airbnb.lottie.model.content.h.NORMAL;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        cVar.c();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        e.b bVar2 = bVar;
        com.airbnb.lottie.model.content.h hVar2 = hVar;
        e.a aVar = null;
        String str = null;
        com.airbnb.lottie.model.animatable.j jVar = null;
        com.airbnb.lottie.model.animatable.k kVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        com.airbnb.lottie.model.content.a aVar2 = null;
        j jVar2 = null;
        long j5 = 0;
        boolean z5 = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z6 = false;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        long j6 = -1;
        float f11 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        com.airbnb.lottie.model.animatable.l lVar = null;
        while (cVar.j()) {
            switch (cVar.J(f1710a)) {
                case 0:
                    str2 = cVar.y();
                    break;
                case 1:
                    j5 = cVar.p();
                    break;
                case 2:
                    str = cVar.y();
                    break;
                case 3:
                    int p5 = cVar.p();
                    aVar = e.a.UNKNOWN;
                    if (p5 >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = e.a.values()[p5];
                        break;
                    }
                case 4:
                    j6 = cVar.p();
                    break;
                case 5:
                    i5 = (int) (cVar.p() * com.airbnb.lottie.utils.l.e());
                    break;
                case 6:
                    i6 = (int) (cVar.p() * com.airbnb.lottie.utils.l.e());
                    break;
                case 7:
                    i7 = Color.parseColor(cVar.y());
                    break;
                case 8:
                    lVar = c.g(cVar, kVar);
                    break;
                case 9:
                    int p6 = cVar.p();
                    if (p6 >= e.b.values().length) {
                        kVar.a("Unsupported matte type: " + p6);
                        break;
                    } else {
                        bVar2 = e.b.values()[p6];
                        int i8 = a.f1713a[bVar2.ordinal()];
                        if (i8 != 1) {
                            if (i8 == 2) {
                                kVar.a("Unsupported matte type: Luma Inverted");
                            }
                        } else {
                            kVar.a("Unsupported matte type: Luma");
                        }
                        kVar.v(1);
                        break;
                    }
                case 10:
                    cVar.b();
                    while (cVar.j()) {
                        arrayList2.add(x.a(cVar, kVar));
                    }
                    kVar.v(arrayList2.size());
                    cVar.d();
                    break;
                case 11:
                    cVar.b();
                    while (cVar.j()) {
                        com.airbnb.lottie.model.content.c a5 = h.a(cVar, kVar);
                        if (a5 != null) {
                            arrayList3.add(a5);
                        }
                    }
                    cVar.d();
                    break;
                case 12:
                    cVar.c();
                    while (cVar.j()) {
                        int J = cVar.J(f1711b);
                        if (J != 0) {
                            if (J != 1) {
                                cVar.M();
                                cVar.O();
                            } else {
                                cVar.b();
                                if (cVar.j()) {
                                    kVar2 = b.a(cVar, kVar);
                                }
                                while (cVar.j()) {
                                    cVar.O();
                                }
                                cVar.d();
                            }
                        } else {
                            jVar = d.d(cVar, kVar);
                        }
                    }
                    cVar.h();
                    break;
                case 13:
                    cVar.b();
                    ArrayList arrayList4 = new ArrayList();
                    while (cVar.j()) {
                        cVar.c();
                        while (cVar.j()) {
                            int J2 = cVar.J(f1712c);
                            if (J2 != 0) {
                                if (J2 != 1) {
                                    cVar.M();
                                    cVar.O();
                                } else {
                                    arrayList4.add(cVar.y());
                                }
                            } else {
                                int p7 = cVar.p();
                                if (p7 == 29) {
                                    aVar2 = e.b(cVar, kVar);
                                } else if (p7 == 25) {
                                    jVar2 = new k().b(cVar, kVar);
                                }
                            }
                        }
                        cVar.h();
                    }
                    cVar.d();
                    kVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    break;
                case 14:
                    f11 = (float) cVar.o();
                    break;
                case 15:
                    f7 = (float) cVar.o();
                    break;
                case 16:
                    f8 = (float) (cVar.o() * com.airbnb.lottie.utils.l.e());
                    break;
                case 17:
                    f9 = (float) (cVar.o() * com.airbnb.lottie.utils.l.e());
                    break;
                case 18:
                    f6 = (float) cVar.o();
                    break;
                case 19:
                    f10 = (float) cVar.o();
                    break;
                case 20:
                    bVar3 = d.f(cVar, kVar, false);
                    break;
                case 21:
                    str3 = cVar.y();
                    break;
                case 22:
                    z6 = cVar.m();
                    break;
                case 23:
                    if (cVar.p() == 1) {
                        z5 = true;
                        break;
                    } else {
                        z5 = false;
                        break;
                    }
                case 24:
                    int p8 = cVar.p();
                    if (p8 >= com.airbnb.lottie.model.content.h.values().length) {
                        kVar.a("Unsupported Blend Mode: " + p8);
                        hVar2 = com.airbnb.lottie.model.content.h.NORMAL;
                        break;
                    } else {
                        hVar2 = com.airbnb.lottie.model.content.h.values()[p8];
                        break;
                    }
                default:
                    cVar.M();
                    cVar.O();
                    break;
            }
        }
        cVar.h();
        ArrayList arrayList5 = new ArrayList();
        if (f6 > 0.0f) {
            arrayList = arrayList2;
            z4 = z5;
            arrayList5.add(new com.airbnb.lottie.value.a(kVar, valueOf, valueOf, null, 0.0f, Float.valueOf(f6)));
            f5 = 0.0f;
        } else {
            arrayList = arrayList2;
            z4 = z5;
            f5 = 0.0f;
        }
        if (f10 <= f5) {
            f10 = kVar.f();
        }
        arrayList5.add(new com.airbnb.lottie.value.a(kVar, valueOf2, valueOf2, null, f6, Float.valueOf(f10)));
        arrayList5.add(new com.airbnb.lottie.value.a(kVar, valueOf, valueOf, null, f10, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            kVar.a("Convert your Illustrator layers to shape layers.");
        }
        if (z4) {
            if (lVar == null) {
                lVar = new com.airbnb.lottie.model.animatable.l();
            }
            lVar.m(z4);
        }
        return new com.airbnb.lottie.model.layer.e(arrayList3, kVar, str2, j5, aVar, j6, str, arrayList, lVar, i5, i6, i7, f11, f7, f8, f9, jVar, kVar2, arrayList5, bVar2, bVar3, z6, aVar2, jVar2, hVar2);
    }
}
