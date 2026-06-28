package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.animatable.l;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.content.c> f1544a;

    /* renamed from: b, reason: collision with root package name */
    private final k f1545b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1546c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1547d;

    /* renamed from: e, reason: collision with root package name */
    private final a f1548e;

    /* renamed from: f, reason: collision with root package name */
    private final long f1549f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f1550g;

    /* renamed from: h, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.content.i> f1551h;

    /* renamed from: i, reason: collision with root package name */
    private final l f1552i;

    /* renamed from: j, reason: collision with root package name */
    private final int f1553j;

    /* renamed from: k, reason: collision with root package name */
    private final int f1554k;

    /* renamed from: l, reason: collision with root package name */
    private final int f1555l;

    /* renamed from: m, reason: collision with root package name */
    private final float f1556m;

    /* renamed from: n, reason: collision with root package name */
    private final float f1557n;

    /* renamed from: o, reason: collision with root package name */
    private final float f1558o;

    /* renamed from: p, reason: collision with root package name */
    private final float f1559p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.model.animatable.j f1560q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.model.animatable.k f1561r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.model.animatable.b f1562s;

    /* renamed from: t, reason: collision with root package name */
    private final List<com.airbnb.lottie.value.a<Float>> f1563t;

    /* renamed from: u, reason: collision with root package name */
    private final b f1564u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f1565v;

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.model.content.a f1566w;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.parser.j f1567x;

    /* renamed from: y, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.h f1568y;

    /* loaded from: classes2.dex */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* loaded from: classes2.dex */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<com.airbnb.lottie.model.content.c> list, k kVar, String str, long j5, a aVar, long j6, @Nullable String str2, List<com.airbnb.lottie.model.content.i> list2, l lVar, int i5, int i6, int i7, float f5, float f6, float f7, float f8, @Nullable com.airbnb.lottie.model.animatable.j jVar, @Nullable com.airbnb.lottie.model.animatable.k kVar2, List<com.airbnb.lottie.value.a<Float>> list3, b bVar, @Nullable com.airbnb.lottie.model.animatable.b bVar2, boolean z4, @Nullable com.airbnb.lottie.model.content.a aVar2, @Nullable com.airbnb.lottie.parser.j jVar2, com.airbnb.lottie.model.content.h hVar) {
        this.f1544a = list;
        this.f1545b = kVar;
        this.f1546c = str;
        this.f1547d = j5;
        this.f1548e = aVar;
        this.f1549f = j6;
        this.f1550g = str2;
        this.f1551h = list2;
        this.f1552i = lVar;
        this.f1553j = i5;
        this.f1554k = i6;
        this.f1555l = i7;
        this.f1556m = f5;
        this.f1557n = f6;
        this.f1558o = f7;
        this.f1559p = f8;
        this.f1560q = jVar;
        this.f1561r = kVar2;
        this.f1563t = list3;
        this.f1564u = bVar;
        this.f1562s = bVar2;
        this.f1565v = z4;
        this.f1566w = aVar2;
        this.f1567x = jVar2;
        this.f1568y = hVar;
    }

    @Nullable
    public com.airbnb.lottie.model.content.h a() {
        return this.f1568y;
    }

    @Nullable
    public com.airbnb.lottie.model.content.a b() {
        return this.f1566w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k c() {
        return this.f1545b;
    }

    @Nullable
    public com.airbnb.lottie.parser.j d() {
        return this.f1567x;
    }

    public long e() {
        return this.f1547d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.airbnb.lottie.value.a<Float>> f() {
        return this.f1563t;
    }

    public a g() {
        return this.f1548e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.airbnb.lottie.model.content.i> h() {
        return this.f1551h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b i() {
        return this.f1564u;
    }

    public String j() {
        return this.f1546c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long k() {
        return this.f1549f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float l() {
        return this.f1559p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float m() {
        return this.f1558o;
    }

    @Nullable
    public String n() {
        return this.f1550g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.airbnb.lottie.model.content.c> o() {
        return this.f1544a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.f1555l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        return this.f1554k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r() {
        return this.f1553j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float s() {
        return this.f1557n / this.f1545b.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public com.airbnb.lottie.model.animatable.j t() {
        return this.f1560q;
    }

    public String toString() {
        return z("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public com.airbnb.lottie.model.animatable.k u() {
        return this.f1561r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public com.airbnb.lottie.model.animatable.b v() {
        return this.f1562s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float w() {
        return this.f1556m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l x() {
        return this.f1552i;
    }

    public boolean y() {
        return this.f1565v;
    }

    public String z(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j());
        sb.append("\n");
        e x4 = this.f1545b.x(k());
        if (x4 != null) {
            sb.append("\t\tParents: ");
            sb.append(x4.j());
            e x5 = this.f1545b.x(x4.k());
            while (x5 != null) {
                sb.append("->");
                sb.append(x5.j());
                x5 = this.f1545b.x(x5.k());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!h().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(h().size());
            sb.append("\n");
        }
        if (r() != 0 && q() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.f1544a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.airbnb.lottie.model.content.c cVar : this.f1544a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(cVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
