package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.File;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f1281a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final String f1282b = "LOTTIE";

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1283c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f1284d = true;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f1285e = true;

    /* renamed from: f, reason: collision with root package name */
    private static a f1286f = a.AUTOMATIC;

    /* renamed from: g, reason: collision with root package name */
    private static com.airbnb.lottie.network.f f1287g;

    /* renamed from: h, reason: collision with root package name */
    private static com.airbnb.lottie.network.e f1288h;

    /* renamed from: i, reason: collision with root package name */
    private static volatile com.airbnb.lottie.network.h f1289i;

    /* renamed from: j, reason: collision with root package name */
    private static volatile com.airbnb.lottie.network.g f1290j;

    /* renamed from: k, reason: collision with root package name */
    private static ThreadLocal<com.airbnb.lottie.utils.h> f1291k;

    private f() {
    }

    public static void b(String str) {
        if (!f1283c) {
            return;
        }
        f().a(str);
    }

    public static float c(String str) {
        if (!f1283c) {
            return 0.0f;
        }
        return f().b(str);
    }

    public static a d() {
        return f1286f;
    }

    public static boolean e() {
        return f1285e;
    }

    private static com.airbnb.lottie.utils.h f() {
        com.airbnb.lottie.utils.h hVar = f1291k.get();
        if (hVar == null) {
            com.airbnb.lottie.utils.h hVar2 = new com.airbnb.lottie.utils.h();
            f1291k.set(hVar2);
            return hVar2;
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ File g(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    @Nullable
    public static com.airbnb.lottie.network.g h(@NonNull Context context) {
        if (!f1284d) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.airbnb.lottie.network.g gVar = f1290j;
        if (gVar == null) {
            synchronized (com.airbnb.lottie.network.g.class) {
                gVar = f1290j;
                if (gVar == null) {
                    com.airbnb.lottie.network.e eVar = f1288h;
                    if (eVar == null) {
                        eVar = new com.airbnb.lottie.network.e() { // from class: com.airbnb.lottie.e
                            @Override // com.airbnb.lottie.network.e
                            public final File a() {
                                File g5;
                                g5 = f.g(applicationContext);
                                return g5;
                            }
                        };
                    }
                    gVar = new com.airbnb.lottie.network.g(eVar);
                    f1290j = gVar;
                }
            }
        }
        return gVar;
    }

    @NonNull
    public static com.airbnb.lottie.network.h i(@NonNull Context context) {
        com.airbnb.lottie.network.h hVar = f1289i;
        if (hVar == null) {
            synchronized (com.airbnb.lottie.network.h.class) {
                hVar = f1289i;
                if (hVar == null) {
                    com.airbnb.lottie.network.g h5 = h(context);
                    com.airbnb.lottie.network.f fVar = f1287g;
                    if (fVar == null) {
                        fVar = new com.airbnb.lottie.network.b();
                    }
                    hVar = new com.airbnb.lottie.network.h(h5, fVar);
                    f1289i = hVar;
                }
            }
        }
        return hVar;
    }

    public static void j(com.airbnb.lottie.network.e eVar) {
        com.airbnb.lottie.network.e eVar2 = f1288h;
        if (eVar2 != null || eVar != null) {
            if (eVar2 != null && eVar2.equals(eVar)) {
                return;
            }
            f1288h = eVar;
            f1290j = null;
        }
    }

    public static void k(a aVar) {
        f1286f = aVar;
    }

    public static void l(boolean z4) {
        f1285e = z4;
    }

    public static void m(com.airbnb.lottie.network.f fVar) {
        com.airbnb.lottie.network.f fVar2 = f1287g;
        if (fVar2 != null || fVar != null) {
            if (fVar2 != null && fVar2.equals(fVar)) {
                return;
            }
            f1287g = fVar;
            f1289i = null;
        }
    }

    public static void n(boolean z4) {
        f1284d = z4;
    }

    public static void o(boolean z4) {
        if (f1283c == z4) {
            return;
        }
        f1283c = z4;
        if (z4 && f1291k == null) {
            f1291k = new ThreadLocal<>();
        }
    }
}
