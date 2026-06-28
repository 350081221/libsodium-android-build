package com.zzhoujay.richtext;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.util.Pair;
import com.zzhoujay.richtext.c;
import e3.j;
import e3.k;
import e3.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class g {
    public static final String B = "com.zzhoujay.okhttpimagedownloader.OkHttpImageDownloader";
    private final HashMap<String, Object> A;

    /* renamed from: a, reason: collision with root package name */
    public final String f15746a;

    /* renamed from: b, reason: collision with root package name */
    public final i f15747b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15748c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15749d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15750e;

    /* renamed from: f, reason: collision with root package name */
    public final c.b f15751f;

    /* renamed from: g, reason: collision with root package name */
    public final com.zzhoujay.richtext.b f15752g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15753h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15754i;

    /* renamed from: j, reason: collision with root package name */
    public final e3.e f15755j;

    /* renamed from: k, reason: collision with root package name */
    public final e3.h f15756k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f15757l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15758m;

    /* renamed from: n, reason: collision with root package name */
    public final e3.i f15759n;

    /* renamed from: o, reason: collision with root package name */
    public final k f15760o;

    /* renamed from: p, reason: collision with root package name */
    public final j f15761p;

    /* renamed from: q, reason: collision with root package name */
    public final l f15762q;

    /* renamed from: r, reason: collision with root package name */
    public final e3.b f15763r;

    /* renamed from: s, reason: collision with root package name */
    public final com.zzhoujay.richtext.drawable.a f15764s;

    /* renamed from: t, reason: collision with root package name */
    final e3.f f15765t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f15766u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f15767v;

    /* renamed from: w, reason: collision with root package name */
    public final com.zzhoujay.richtext.ig.i f15768w;

    /* renamed from: x, reason: collision with root package name */
    public final e3.d f15769x;

    /* renamed from: y, reason: collision with root package name */
    public final e3.d f15770y;

    /* renamed from: z, reason: collision with root package name */
    private WeakReference<f> f15771z;

    /* loaded from: classes3.dex */
    public static final class b {
        private static final int A = 9;
        private static final Handler B = new a(Looper.getMainLooper());
        private static final e3.d C = new C0443b();
        private static final e3.d D = new c();

        /* renamed from: a, reason: collision with root package name */
        final String f15772a;

        /* renamed from: b, reason: collision with root package name */
        i f15773b;

        /* renamed from: f, reason: collision with root package name */
        e3.e f15777f;

        /* renamed from: g, reason: collision with root package name */
        e3.h f15778g;

        /* renamed from: j, reason: collision with root package name */
        e3.i f15781j;

        /* renamed from: k, reason: collision with root package name */
        k f15782k;

        /* renamed from: l, reason: collision with root package name */
        j f15783l;

        /* renamed from: m, reason: collision with root package name */
        l f15784m;

        /* renamed from: n, reason: collision with root package name */
        e3.f f15785n;

        /* renamed from: o, reason: collision with root package name */
        e3.b f15786o;

        /* renamed from: p, reason: collision with root package name */
        WeakReference<Object> f15787p;

        /* renamed from: x, reason: collision with root package name */
        com.zzhoujay.richtext.ig.i f15795x;

        /* renamed from: c, reason: collision with root package name */
        boolean f15774c = true;

        /* renamed from: d, reason: collision with root package name */
        boolean f15775d = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f15779h = false;

        /* renamed from: i, reason: collision with root package name */
        int f15780i = 0;

        /* renamed from: e, reason: collision with root package name */
        com.zzhoujay.richtext.b f15776e = com.zzhoujay.richtext.b.all;

        /* renamed from: q, reason: collision with root package name */
        boolean f15788q = false;

        /* renamed from: r, reason: collision with root package name */
        c.b f15789r = c.b.none;

        /* renamed from: s, reason: collision with root package name */
        int f15790s = Integer.MIN_VALUE;

        /* renamed from: t, reason: collision with root package name */
        int f15791t = Integer.MIN_VALUE;

        /* renamed from: u, reason: collision with root package name */
        com.zzhoujay.richtext.drawable.a f15792u = new com.zzhoujay.richtext.drawable.a();

        /* renamed from: v, reason: collision with root package name */
        boolean f15793v = true;

        /* renamed from: y, reason: collision with root package name */
        e3.d f15796y = C;

        /* renamed from: z, reason: collision with root package name */
        e3.d f15797z = D;

        /* renamed from: w, reason: collision with root package name */
        boolean f15794w = false;

        /* loaded from: classes3.dex */
        static class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                if (message.what == 9) {
                    Pair pair = (Pair) message.obj;
                    Drawable drawable = (Drawable) pair.first;
                    TextView textView = (TextView) pair.second;
                    int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
                    drawable.setBounds(0, 0, width, width / 2);
                }
            }
        }

        /* renamed from: com.zzhoujay.richtext.g$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static class C0443b implements e3.d {
            C0443b() {
            }

            @Override // e3.d
            public Drawable a(com.zzhoujay.richtext.c cVar, g gVar, TextView textView) {
                ColorDrawable colorDrawable = new ColorDrawable(-3355444);
                int width = textView.getWidth();
                colorDrawable.setBounds(0, 0, width, width / 2);
                b.B.obtainMessage(9, Pair.create(colorDrawable, textView)).sendToTarget();
                return colorDrawable;
            }
        }

        /* loaded from: classes3.dex */
        static class c implements e3.d {
            c() {
            }

            @Override // e3.d
            public Drawable a(com.zzhoujay.richtext.c cVar, g gVar, TextView textView) {
                ColorDrawable colorDrawable = new ColorDrawable(-12303292);
                int width = textView.getWidth();
                colorDrawable.setBounds(0, 0, width, width / 2);
                b.B.obtainMessage(9, Pair.create(colorDrawable, textView)).sendToTarget();
                return colorDrawable;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(String str, i iVar) {
            this.f15772a = str;
            this.f15773b = iVar;
        }

        public b A(i iVar) {
            this.f15773b = iVar;
            return this;
        }

        public b B(k kVar) {
            this.f15782k = kVar;
            return this;
        }

        public b C(l lVar) {
            this.f15784m = lVar;
            return this;
        }

        public b b(boolean z4) {
            this.f15774c = z4;
            return this;
        }

        public b c(boolean z4) {
            this.f15788q = z4;
            return this;
        }

        public b d(Object obj) {
            this.f15787p = new WeakReference<>(obj);
            return this;
        }

        public b e(@ColorInt int i5) {
            this.f15792u.f(i5);
            return this;
        }

        public b f(float f5) {
            this.f15792u.h(f5);
            return this;
        }

        public b g(float f5) {
            this.f15792u.g(f5);
            return this;
        }

        public b h(com.zzhoujay.richtext.b bVar) {
            this.f15776e = bVar;
            return this;
        }

        public b i(boolean z4) {
            this.f15780i = z4 ? 1 : -1;
            return this;
        }

        public b j(e3.b bVar) {
            this.f15786o = bVar;
            return this;
        }

        public b k(e3.d dVar) {
            this.f15797z = dVar;
            return this;
        }

        public b l(e3.e eVar) {
            this.f15777f = eVar;
            return this;
        }

        public b m(e3.i iVar) {
            this.f15781j = iVar;
            return this;
        }

        public b n(com.zzhoujay.richtext.ig.i iVar) {
            this.f15795x = iVar;
            return this;
        }

        public b o(e3.f fVar) {
            this.f15785n = fVar;
            return this;
        }

        public b p(j jVar) {
            this.f15783l = jVar;
            return this;
        }

        public f q(TextView textView) {
            if (this.f15785n == null) {
                this.f15785n = new com.zzhoujay.richtext.ig.g();
            }
            if ((this.f15785n instanceof com.zzhoujay.richtext.ig.g) && this.f15795x == null) {
                try {
                    Class<?> cls = Class.forName(g.B);
                    com.zzhoujay.richtext.ig.i iVar = (com.zzhoujay.richtext.ig.i) f.n(g.B);
                    if (iVar == null) {
                        iVar = (com.zzhoujay.richtext.ig.i) cls.newInstance();
                        f.u(g.B, iVar);
                    }
                    this.f15795x = iVar;
                } catch (Exception unused) {
                    String str = com.zzhoujay.richtext.ig.f.f15814a;
                    com.zzhoujay.richtext.ig.f fVar = (com.zzhoujay.richtext.ig.f) f.n(str);
                    if (fVar == null) {
                        fVar = new com.zzhoujay.richtext.ig.f();
                        f.u(str, fVar);
                    }
                    this.f15795x = fVar;
                }
            }
            f fVar2 = new f(new g(this), textView);
            WeakReference<Object> weakReference = this.f15787p;
            if (weakReference != null) {
                f.e(weakReference.get(), fVar2);
            }
            this.f15787p = null;
            fVar2.l();
            return fVar2;
        }

        public b r(e3.h hVar) {
            this.f15778g = hVar;
            return this;
        }

        public b s(boolean z4) {
            this.f15779h = z4;
            return this;
        }

        public b t(e3.d dVar) {
            this.f15796y = dVar;
            return this;
        }

        public b u(boolean z4) {
            this.f15775d = z4;
            return this;
        }

        public b v(c.b bVar) {
            this.f15789r = bVar;
            return this;
        }

        public b w(boolean z4) {
            this.f15792u.i(z4);
            return this;
        }

        public b x(boolean z4) {
            this.f15793v = z4;
            return this;
        }

        public b y(int i5, int i6) {
            this.f15790s = i5;
            this.f15791t = i6;
            return this;
        }

        public b z(boolean z4) {
            this.f15794w = z4;
            return this;
        }
    }

    public Object a(String str) {
        return this.A.get(str);
    }

    public f b() {
        WeakReference<f> weakReference = this.f15771z;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int c() {
        return (((((((((((((((((((((this.f15746a.hashCode() * 31) + this.f15747b.hashCode()) * 31) + (this.f15748c ? 1 : 0)) * 31) + (this.f15749d ? 1 : 0)) * 31) + (this.f15750e ? 1 : 0)) * 31) + this.f15751f.hashCode()) * 31) + this.f15752g.hashCode()) * 31) + this.f15753h) * 31) + this.f15754i) * 31) + (this.f15757l ? 1 : 0)) * 31) + this.f15758m) * 31) + this.f15764s.hashCode();
    }

    public void d(String str, Object obj) {
        this.A.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(f fVar) {
        if (this.f15771z == null) {
            this.f15771z = new WeakReference<>(fVar);
        }
    }

    private g(b bVar) {
        this(bVar.f15772a, bVar.f15773b, bVar.f15774c, bVar.f15775d, bVar.f15776e, bVar.f15777f, bVar.f15778g, bVar.f15779h, bVar.f15780i, bVar.f15781j, bVar.f15782k, bVar.f15783l, bVar.f15784m, bVar.f15785n, bVar.f15786o, bVar.f15788q, bVar.f15789r, bVar.f15790s, bVar.f15791t, bVar.f15792u, bVar.f15793v, bVar.f15794w, bVar.f15795x, bVar.f15796y, bVar.f15797z);
    }

    private g(String str, i iVar, boolean z4, boolean z5, com.zzhoujay.richtext.b bVar, e3.e eVar, e3.h hVar, boolean z6, int i5, e3.i iVar2, k kVar, j jVar, l lVar, e3.f fVar, e3.b bVar2, boolean z7, c.b bVar3, int i6, int i7, com.zzhoujay.richtext.drawable.a aVar, boolean z8, boolean z9, com.zzhoujay.richtext.ig.i iVar3, e3.d dVar, e3.d dVar2) {
        this.f15746a = str;
        this.f15747b = iVar;
        this.f15748c = z4;
        this.f15749d = z5;
        this.f15755j = eVar;
        this.f15756k = hVar;
        this.f15757l = z6;
        this.f15752g = bVar;
        this.f15759n = iVar2;
        this.f15760o = kVar;
        this.f15761p = jVar;
        this.f15762q = lVar;
        this.f15765t = fVar;
        this.f15763r = bVar2;
        this.f15751f = bVar3;
        this.f15750e = z7;
        this.f15753h = i6;
        this.f15754i = i7;
        this.f15764s = aVar;
        this.f15766u = z8;
        this.f15767v = z9;
        this.f15768w = iVar3;
        this.f15769x = dVar;
        this.f15770y = dVar2;
        this.f15758m = (i5 != 0 || (jVar == null && lVar == null && iVar2 == null && kVar == null)) ? i5 : 1;
        this.A = new HashMap<>();
    }
}
