package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.e;
import com.airbnb.lottie.parser.moshi.c;
import com.airbnb.lottie.y0;
import com.umeng.analytics.pro.bi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1714a = c.a.a("w", bi.aJ, "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    static c.a f1715b = c.a.a("id", "layers", "w", bi.aJ, bi.aA, bi.aK);

    /* renamed from: c, reason: collision with root package name */
    private static final c.a f1716c = c.a.a("list");

    /* renamed from: d, reason: collision with root package name */
    private static final c.a f1717d = c.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0043. Please report as an issue. */
    public static com.airbnb.lottie.k a(com.airbnb.lottie.parser.moshi.c cVar) throws IOException {
        HashMap hashMap;
        ArrayList arrayList;
        com.airbnb.lottie.parser.moshi.c cVar2 = cVar;
        float e5 = com.airbnb.lottie.utils.l.e();
        LongSparseArray<com.airbnb.lottie.model.layer.e> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat<com.airbnb.lottie.model.d> sparseArrayCompat = new SparseArrayCompat<>();
        com.airbnb.lottie.k kVar = new com.airbnb.lottie.k();
        cVar.c();
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        int i5 = 0;
        int i6 = 0;
        while (cVar.j()) {
            switch (cVar2.J(f1714a)) {
                case 0:
                    i5 = cVar.p();
                    break;
                case 1:
                    i6 = cVar.p();
                    break;
                case 2:
                    f5 = (float) cVar.o();
                    break;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f6 = ((float) cVar.o()) - 0.01f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f7 = (float) cVar.o();
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 5:
                    String[] split = cVar.y().split("\\.");
                    if (!com.airbnb.lottie.utils.l.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        kVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 6:
                    e(cVar2, kVar, arrayList2, longSparseArray);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 7:
                    b(cVar2, kVar, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 8:
                    d(cVar2, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 9:
                    c(cVar2, kVar, sparseArrayCompat);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 10:
                    f(cVar2, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    cVar.M();
                    cVar.O();
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
            }
            cVar2 = cVar;
        }
        kVar.w(new Rect(0, 0, (int) (i5 * e5), (int) (i6 * e5)), f5, f6, f7, arrayList2, longSparseArray, hashMap2, hashMap3, com.airbnb.lottie.utils.l.e(), sparseArrayCompat, hashMap4, arrayList3);
        return kVar;
    }

    private static void b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, Map<String, List<com.airbnb.lottie.model.layer.e>> map, Map<String, y0> map2) throws IOException {
        cVar.b();
        while (cVar.j()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            cVar.c();
            int i5 = 0;
            int i6 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (cVar.j()) {
                int J = cVar.J(f1715b);
                if (J != 0) {
                    if (J != 1) {
                        if (J != 2) {
                            if (J != 3) {
                                if (J != 4) {
                                    if (J != 5) {
                                        cVar.M();
                                        cVar.O();
                                    } else {
                                        str3 = cVar.y();
                                    }
                                } else {
                                    str2 = cVar.y();
                                }
                            } else {
                                i6 = cVar.p();
                            }
                        } else {
                            i5 = cVar.p();
                        }
                    } else {
                        cVar.b();
                        while (cVar.j()) {
                            com.airbnb.lottie.model.layer.e b5 = v.b(cVar, kVar);
                            longSparseArray.put(b5.e(), b5);
                            arrayList.add(b5);
                        }
                        cVar.d();
                    }
                } else {
                    str = cVar.y();
                }
            }
            cVar.h();
            if (str2 != null) {
                y0 y0Var = new y0(i5, i6, str, str2, str3);
                map2.put(y0Var.f(), y0Var);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.d();
    }

    private static void c(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, SparseArrayCompat<com.airbnb.lottie.model.d> sparseArrayCompat) throws IOException {
        cVar.b();
        while (cVar.j()) {
            com.airbnb.lottie.model.d a5 = m.a(cVar, kVar);
            sparseArrayCompat.put(a5.hashCode(), a5);
        }
        cVar.d();
    }

    private static void d(com.airbnb.lottie.parser.moshi.c cVar, Map<String, com.airbnb.lottie.model.c> map) throws IOException {
        cVar.c();
        while (cVar.j()) {
            if (cVar.J(f1716c) != 0) {
                cVar.M();
                cVar.O();
            } else {
                cVar.b();
                while (cVar.j()) {
                    com.airbnb.lottie.model.c a5 = n.a(cVar);
                    map.put(a5.c(), a5);
                }
                cVar.d();
            }
        }
        cVar.h();
    }

    private static void e(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, List<com.airbnb.lottie.model.layer.e> list, LongSparseArray<com.airbnb.lottie.model.layer.e> longSparseArray) throws IOException {
        cVar.b();
        int i5 = 0;
        while (cVar.j()) {
            com.airbnb.lottie.model.layer.e b5 = v.b(cVar, kVar);
            if (b5.g() == e.a.IMAGE) {
                i5++;
            }
            list.add(b5);
            longSparseArray.put(b5.e(), b5);
            if (i5 > 4) {
                com.airbnb.lottie.utils.f.e("You have " + i5 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.d();
    }

    private static void f(com.airbnb.lottie.parser.moshi.c cVar, List<com.airbnb.lottie.model.h> list) throws IOException {
        cVar.b();
        while (cVar.j()) {
            cVar.c();
            float f5 = 0.0f;
            String str = null;
            float f6 = 0.0f;
            while (cVar.j()) {
                int J = cVar.J(f1717d);
                if (J != 0) {
                    if (J != 1) {
                        if (J != 2) {
                            cVar.M();
                            cVar.O();
                        } else {
                            f6 = (float) cVar.o();
                        }
                    } else {
                        f5 = (float) cVar.o();
                    }
                } else {
                    str = cVar.y();
                }
            }
            cVar.h();
            list.add(new com.airbnb.lottie.model.h(str, f5, f6));
        }
        cVar.d();
    }
}
