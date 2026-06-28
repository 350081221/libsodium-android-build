package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<com.airbnb.lottie.model.layer.e>> f1320c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, y0> f1321d;

    /* renamed from: e, reason: collision with root package name */
    private float f1322e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, com.airbnb.lottie.model.c> f1323f;

    /* renamed from: g, reason: collision with root package name */
    private List<com.airbnb.lottie.model.h> f1324g;

    /* renamed from: h, reason: collision with root package name */
    private SparseArrayCompat<com.airbnb.lottie.model.d> f1325h;

    /* renamed from: i, reason: collision with root package name */
    private LongSparseArray<com.airbnb.lottie.model.layer.e> f1326i;

    /* renamed from: j, reason: collision with root package name */
    private List<com.airbnb.lottie.model.layer.e> f1327j;

    /* renamed from: k, reason: collision with root package name */
    private Rect f1328k;

    /* renamed from: l, reason: collision with root package name */
    private float f1329l;

    /* renamed from: m, reason: collision with root package name */
    private float f1330m;

    /* renamed from: n, reason: collision with root package name */
    private float f1331n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1332o;

    /* renamed from: a, reason: collision with root package name */
    private final i1 f1318a = new i1();

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<String> f1319b = new HashSet<>();

    /* renamed from: p, reason: collision with root package name */
    private int f1333p = 0;

    @Deprecated
    /* loaded from: classes2.dex */
    public static class b {

        /* loaded from: classes2.dex */
        private static final class a implements z0<k>, com.airbnb.lottie.b {

            /* renamed from: a, reason: collision with root package name */
            private final h1 f1334a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f1335b;

            @Override // com.airbnb.lottie.z0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResult(k kVar) {
                if (this.f1335b) {
                    return;
                }
                this.f1334a.a(kVar);
            }

            @Override // com.airbnb.lottie.b
            public void cancel() {
                this.f1335b = true;
            }

            private a(h1 h1Var) {
                this.f1335b = false;
                this.f1334a = h1Var;
            }
        }

        private b() {
        }

        @Deprecated
        public static com.airbnb.lottie.b a(Context context, String str, h1 h1Var) {
            a aVar = new a(h1Var);
            d0.u(context, str).d(aVar);
            return aVar;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k b(Context context, String str) {
            return d0.w(context, str).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b c(InputStream inputStream, h1 h1Var) {
            a aVar = new a(h1Var);
            d0.z(inputStream, null).d(aVar);
            return aVar;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k d(InputStream inputStream) {
            return d0.B(inputStream, null).b();
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k e(InputStream inputStream, boolean z4) {
            if (z4) {
                com.airbnb.lottie.utils.f.e("Lottie now auto-closes input stream!");
            }
            return d0.B(inputStream, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b f(com.airbnb.lottie.parser.moshi.c cVar, h1 h1Var) {
            a aVar = new a(h1Var);
            d0.D(cVar, null).d(aVar);
            return aVar;
        }

        @Deprecated
        public static com.airbnb.lottie.b g(String str, h1 h1Var) {
            a aVar = new a(h1Var);
            d0.H(str, null).d(aVar);
            return aVar;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k h(Resources resources, JSONObject jSONObject) {
            return d0.J(jSONObject, null).b();
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k i(com.airbnb.lottie.parser.moshi.c cVar) {
            return d0.E(cVar, null).b();
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k j(String str) {
            return d0.I(str, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b k(Context context, @RawRes int i5, h1 h1Var) {
            a aVar = new a(h1Var);
            d0.K(context, i5).d(aVar);
            return aVar;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(String str) {
        com.airbnb.lottie.utils.f.e(str);
        this.f1319b.add(str);
    }

    public Rect b() {
        return this.f1328k;
    }

    public SparseArrayCompat<com.airbnb.lottie.model.d> c() {
        return this.f1325h;
    }

    public float d() {
        return (e() / this.f1331n) * 1000.0f;
    }

    public float e() {
        return this.f1330m - this.f1329l;
    }

    public float f() {
        return this.f1330m;
    }

    public Map<String, com.airbnb.lottie.model.c> g() {
        return this.f1323f;
    }

    public float h(float f5) {
        return com.airbnb.lottie.utils.k.k(this.f1329l, this.f1330m, f5);
    }

    public float i() {
        return this.f1331n;
    }

    public Map<String, y0> j() {
        float e5 = com.airbnb.lottie.utils.l.e();
        if (e5 != this.f1322e) {
            this.f1322e = e5;
            for (Map.Entry<String, y0> entry : this.f1321d.entrySet()) {
                this.f1321d.put(entry.getKey(), entry.getValue().a(this.f1322e / e5));
            }
        }
        return this.f1321d;
    }

    public List<com.airbnb.lottie.model.layer.e> k() {
        return this.f1327j;
    }

    @Nullable
    public com.airbnb.lottie.model.h l(String str) {
        int size = this.f1324g.size();
        for (int i5 = 0; i5 < size; i5++) {
            com.airbnb.lottie.model.h hVar = this.f1324g.get(i5);
            if (hVar.d(str)) {
                return hVar;
            }
        }
        return null;
    }

    public List<com.airbnb.lottie.model.h> m() {
        return this.f1324g;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int n() {
        return this.f1333p;
    }

    public i1 o() {
        return this.f1318a;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<com.airbnb.lottie.model.layer.e> p(String str) {
        return this.f1320c.get(str);
    }

    public float q(float f5) {
        float f6 = this.f1329l;
        return (f5 - f6) / (this.f1330m - f6);
    }

    public float r() {
        return this.f1329l;
    }

    public ArrayList<String> s() {
        HashSet<String> hashSet = this.f1319b;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean t() {
        return this.f1332o;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<com.airbnb.lottie.model.layer.e> it = this.f1327j.iterator();
        while (it.hasNext()) {
            sb.append(it.next().z("\t"));
        }
        return sb.toString();
    }

    public boolean u() {
        return !this.f1321d.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void v(int i5) {
        this.f1333p += i5;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void w(Rect rect, float f5, float f6, float f7, List<com.airbnb.lottie.model.layer.e> list, LongSparseArray<com.airbnb.lottie.model.layer.e> longSparseArray, Map<String, List<com.airbnb.lottie.model.layer.e>> map, Map<String, y0> map2, float f8, SparseArrayCompat<com.airbnb.lottie.model.d> sparseArrayCompat, Map<String, com.airbnb.lottie.model.c> map3, List<com.airbnb.lottie.model.h> list2) {
        this.f1328k = rect;
        this.f1329l = f5;
        this.f1330m = f6;
        this.f1331n = f7;
        this.f1327j = list;
        this.f1326i = longSparseArray;
        this.f1320c = map;
        this.f1321d = map2;
        this.f1322e = f8;
        this.f1325h = sparseArrayCompat;
        this.f1323f = map3;
        this.f1324g = list2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public com.airbnb.lottie.model.layer.e x(long j5) {
        return this.f1326i.get(j5);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void y(boolean z4) {
        this.f1332o = z4;
    }

    public void z(boolean z4) {
        this.f1318a.g(z4);
    }
}
