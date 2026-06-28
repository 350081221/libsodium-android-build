package com.zzhoujay.richtext;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import f3.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: q, reason: collision with root package name */
    public static final int f15619q = Integer.MIN_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public static final int f15620r = Integer.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    private String f15621a;

    /* renamed from: b, reason: collision with root package name */
    private String f15622b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15623c;

    /* renamed from: d, reason: collision with root package name */
    private int f15624d;

    /* renamed from: e, reason: collision with root package name */
    private int f15625e;

    /* renamed from: f, reason: collision with root package name */
    private b f15626f;

    /* renamed from: g, reason: collision with root package name */
    private int f15627g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15628h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15629i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15630j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15631k = false;

    /* renamed from: l, reason: collision with root package name */
    private com.zzhoujay.richtext.drawable.a f15632l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f15633m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f15634n;

    /* renamed from: o, reason: collision with root package name */
    private String f15635o;

    /* renamed from: p, reason: collision with root package name */
    private int f15636p;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f15637a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f15638b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f15639c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f15640d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f15641e = 4;
    }

    /* loaded from: classes3.dex */
    public enum b {
        none(0),
        center(1),
        center_crop(2),
        center_inside(3),
        fit_center(4),
        fit_start(5),
        fit_end(6),
        fit_xy(7),
        fit_auto(8);

        int value;

        b(int i5) {
            this.value = i5;
        }

        public int intValue() {
            return this.value;
        }

        public static b valueOf(int i5) {
            return values()[i5];
        }
    }

    /* renamed from: com.zzhoujay.richtext.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0439c {

        /* renamed from: a, reason: collision with root package name */
        private int f15642a;

        /* renamed from: b, reason: collision with root package name */
        private int f15643b;

        /* renamed from: c, reason: collision with root package name */
        private float f15644c = 1.0f;

        public C0439c(int i5, int i6) {
            this.f15642a = i5;
            this.f15643b = i6;
        }

        public int a() {
            return (int) (this.f15644c * this.f15643b);
        }

        public int b() {
            return (int) (this.f15644c * this.f15642a);
        }

        public boolean c() {
            return this.f15644c > 0.0f && this.f15642a > 0 && this.f15643b > 0;
        }

        public void d(float f5) {
            this.f15644c = f5;
        }

        public void e(int i5, int i6) {
            this.f15642a = i5;
            this.f15643b = i6;
        }
    }

    public c(String str, int i5, g gVar, TextView textView) {
        String name;
        this.f15621a = str;
        this.f15623c = i5;
        this.f15636p = gVar.c();
        com.zzhoujay.richtext.ig.i iVar = gVar.f15768w;
        if (iVar == null) {
            name = "";
        } else {
            name = iVar.getClass().getName();
        }
        this.f15635o = name;
        b();
        this.f15629i = gVar.f15750e;
        if (gVar.f15748c) {
            this.f15624d = Integer.MAX_VALUE;
            this.f15625e = Integer.MIN_VALUE;
            this.f15626f = b.fit_auto;
        } else {
            this.f15626f = gVar.f15751f;
            this.f15624d = gVar.f15753h;
            this.f15625e = gVar.f15754i;
        }
        this.f15630j = !gVar.f15757l;
        this.f15632l = new com.zzhoujay.richtext.drawable.a(gVar.f15764s);
        this.f15633m = gVar.f15769x.a(this, gVar, textView);
        this.f15634n = gVar.f15770y.a(this, gVar, textView);
    }

    private void b() {
        this.f15622b = com.zzhoujay.richtext.ext.g.a(this.f15635o + this.f15636p + this.f15621a);
    }

    public void A(Drawable drawable) {
        this.f15633m = drawable;
    }

    public void B(b bVar) {
        this.f15626f = bVar;
    }

    public void C(boolean z4) {
        this.f15630j = z4;
    }

    public void D(boolean z4) {
        this.f15632l.i(z4);
    }

    public void E(int i5, int i6) {
        this.f15624d = i5;
        this.f15625e = i6;
    }

    public void F(String str) {
        if (this.f15627g == 0) {
            this.f15621a = str;
            b();
            return;
        }
        throw new k();
    }

    public void G(int i5) {
        this.f15624d = i5;
    }

    public boolean H() {
        return this.f15627g == 2;
    }

    public boolean a() {
        return this.f15627g == 3;
    }

    public com.zzhoujay.richtext.drawable.a c() {
        return this.f15632l;
    }

    public Drawable d() {
        return this.f15634n;
    }

    public int e() {
        return this.f15625e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f15623c != cVar.f15623c || this.f15624d != cVar.f15624d || this.f15625e != cVar.f15625e || this.f15626f != cVar.f15626f || this.f15627g != cVar.f15627g || this.f15628h != cVar.f15628h || this.f15629i != cVar.f15629i || this.f15630j != cVar.f15630j || this.f15631k != cVar.f15631k || !this.f15635o.equals(cVar.f15635o) || !this.f15621a.equals(cVar.f15621a) || !this.f15622b.equals(cVar.f15622b) || !this.f15632l.equals(cVar.f15632l)) {
            return false;
        }
        Drawable drawable = this.f15633m;
        if (drawable == null ? cVar.f15633m != null : !drawable.equals(cVar.f15633m)) {
            return false;
        }
        Drawable drawable2 = this.f15634n;
        Drawable drawable3 = cVar.f15634n;
        if (drawable2 != null) {
            return drawable2.equals(drawable3);
        }
        if (drawable3 == null) {
            return true;
        }
        return false;
    }

    public int f() {
        return this.f15627g;
    }

    public String g() {
        return this.f15622b;
    }

    public Drawable h() {
        return this.f15633m;
    }

    public int hashCode() {
        int i5;
        int i6;
        int hashCode = ((((((((((((((((((((this.f15621a.hashCode() * 31) + this.f15622b.hashCode()) * 31) + this.f15623c) * 31) + this.f15624d) * 31) + this.f15625e) * 31) + this.f15626f.hashCode()) * 31) + this.f15627g) * 31) + (this.f15628h ? 1 : 0)) * 31) + (this.f15629i ? 1 : 0)) * 31) + (this.f15630j ? 1 : 0)) * 31) + (this.f15631k ? 1 : 0)) * 31;
        com.zzhoujay.richtext.drawable.a aVar = this.f15632l;
        int i7 = 0;
        if (aVar != null) {
            i5 = aVar.hashCode();
        } else {
            i5 = 0;
        }
        int i8 = (hashCode + i5) * 31;
        Drawable drawable = this.f15633m;
        if (drawable != null) {
            i6 = drawable.hashCode();
        } else {
            i6 = 0;
        }
        int i9 = (i8 + i6) * 31;
        Drawable drawable2 = this.f15634n;
        if (drawable2 != null) {
            i7 = drawable2.hashCode();
        }
        return ((i9 + i7) * 31) + this.f15635o.hashCode();
    }

    public int i() {
        return this.f15623c;
    }

    public b j() {
        return this.f15626f;
    }

    public String k() {
        return this.f15621a;
    }

    public int l() {
        return this.f15624d;
    }

    public boolean m() {
        return this.f15628h;
    }

    public boolean n() {
        return this.f15629i;
    }

    public boolean o() {
        return this.f15631k;
    }

    public boolean p() {
        return this.f15624d > 0 && this.f15625e > 0;
    }

    public boolean q() {
        return this.f15630j;
    }

    public void r(boolean z4) {
        this.f15628h = z4;
        if (z4) {
            this.f15624d = Integer.MAX_VALUE;
            this.f15625e = Integer.MIN_VALUE;
            this.f15626f = b.fit_auto;
        } else {
            this.f15624d = Integer.MIN_VALUE;
            this.f15625e = Integer.MIN_VALUE;
            this.f15626f = b.none;
        }
    }

    public void s(boolean z4) {
        this.f15629i = z4;
    }

    public void t(@ColorInt int i5) {
        this.f15632l.f(i5);
    }

    public String toString() {
        return "ImageHolder{source='" + this.f15621a + "', key='" + this.f15622b + "', position=" + this.f15623c + ", width=" + this.f15624d + ", height=" + this.f15625e + ", scaleType=" + this.f15626f + ", imageState=" + this.f15627g + ", autoFix=" + this.f15628h + ", autoPlay=" + this.f15629i + ", show=" + this.f15630j + ", isGif=" + this.f15631k + ", borderHolder=" + this.f15632l + ", placeHolder=" + this.f15633m + ", errorImage=" + this.f15634n + ", prefixCode=" + this.f15635o + '}';
    }

    public void u(float f5) {
        this.f15632l.h(f5);
    }

    public void v(float f5) {
        this.f15632l.g(f5);
    }

    public void w(Drawable drawable) {
        this.f15634n = drawable;
    }

    public void x(int i5) {
        this.f15625e = i5;
    }

    public void y(int i5) {
        this.f15627g = i5;
    }

    public void z(boolean z4) {
        this.f15631k = z4;
    }
}
