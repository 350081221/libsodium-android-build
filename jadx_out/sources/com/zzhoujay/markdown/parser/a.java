package com.zzhoujay.markdown.parser;

import android.text.SpannableStringBuilder;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: l, reason: collision with root package name */
    public static final int f15363l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f15364m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f15365n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f15366o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f15367p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f15368q = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f15369r = 6;

    /* renamed from: s, reason: collision with root package name */
    public static final int f15370s = 7;

    /* renamed from: t, reason: collision with root package name */
    public static final int f15371t = 8;

    /* renamed from: u, reason: collision with root package name */
    public static final int f15372u = 9;

    /* renamed from: v, reason: collision with root package name */
    public static final int f15373v = 10;

    /* renamed from: w, reason: collision with root package name */
    public static final int f15374w = 11;

    /* renamed from: x, reason: collision with root package name */
    public static final int f15375x = 12;

    /* renamed from: y, reason: collision with root package name */
    public static final int f15376y = 1;

    /* renamed from: a, reason: collision with root package name */
    private a f15377a;

    /* renamed from: b, reason: collision with root package name */
    private a f15378b;

    /* renamed from: c, reason: collision with root package name */
    private a f15379c;

    /* renamed from: d, reason: collision with root package name */
    private a f15380d;

    /* renamed from: e, reason: collision with root package name */
    private String f15381e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f15382f;

    /* renamed from: g, reason: collision with root package name */
    private int f15383g;

    /* renamed from: h, reason: collision with root package name */
    private int f15384h;

    /* renamed from: i, reason: collision with root package name */
    private int f15385i;

    /* renamed from: j, reason: collision with root package name */
    private int f15386j;

    /* renamed from: k, reason: collision with root package name */
    private int f15387k;

    public a(String str) {
        this.f15381e = str;
        this.f15384h = 1;
        this.f15383g = 0;
    }

    private void l() {
        a aVar = this.f15380d;
        if (aVar != null) {
            aVar.l();
        }
        a aVar2 = this.f15377a;
        if (aVar2 != null) {
            aVar2.f15378b = null;
        }
        this.f15377a = null;
        a aVar3 = this.f15378b;
        if (aVar3 != null) {
            aVar3.f15377a = null;
        }
        this.f15378b = null;
    }

    private void x() {
        a aVar = this.f15380d;
        if (aVar != null) {
            aVar.x();
        }
        a aVar2 = this.f15377a;
        if (aVar2 != null) {
            aVar2.f15378b = this.f15378b;
        }
        a aVar3 = this.f15378b;
        if (aVar3 != null) {
            aVar3.f15377a = aVar2;
        }
        this.f15378b = null;
        this.f15377a = null;
    }

    public a A() {
        a aVar = this.f15377a;
        if (aVar != null) {
            aVar.y();
        }
        return this;
    }

    public void B(int i5) {
        this.f15385i = i5;
    }

    public void C(int i5) {
        this.f15384h = i5;
    }

    public void D(int i5) {
        this.f15387k = i5;
    }

    public void E(int i5) {
        this.f15386j = i5;
    }

    public void F(String str) {
        this.f15381e = str;
    }

    public void G(CharSequence charSequence) {
        this.f15382f = charSequence;
    }

    public void H(int i5) {
        this.f15383g = i5;
    }

    public void I() {
        if (this.f15379c != null) {
            l();
            this.f15379c.f15380d = null;
        }
        this.f15379c = null;
    }

    public a a(a aVar) {
        return c(aVar);
    }

    public void b(a aVar) {
        a aVar2 = this.f15380d;
        if (aVar2 != null) {
            aVar2.f15379c = null;
        }
        this.f15380d = aVar;
        a aVar3 = aVar.f15379c;
        if (aVar3 != null) {
            aVar3.f15380d = null;
        }
        aVar.f15379c = this;
        e();
        f();
    }

    public a c(a aVar) {
        if (aVar == null) {
            this.f15378b = null;
        } else {
            a aVar2 = aVar.f15378b;
            if (aVar2 != null) {
                aVar2.f15377a = null;
            }
            aVar.f15378b = this.f15378b;
            a aVar3 = this.f15378b;
            if (aVar3 != null) {
                aVar3.f15377a = aVar;
            }
            a aVar4 = aVar.f15377a;
            if (aVar4 != null) {
                aVar4.f15378b = null;
            }
            aVar.f15377a = this;
            this.f15378b = aVar;
            a aVar5 = this.f15380d;
            if (aVar5 != null) {
                aVar5.c(aVar.f15380d);
            }
        }
        return aVar;
    }

    public a d(a aVar) {
        if (aVar == null) {
            this.f15377a = null;
        } else {
            a aVar2 = aVar.f15377a;
            if (aVar2 != null) {
                aVar2.f15378b = null;
            }
            aVar.f15377a = this.f15377a;
            a aVar3 = this.f15377a;
            if (aVar3 != null) {
                aVar3.f15378b = aVar;
            }
            a aVar4 = aVar.f15378b;
            if (aVar4 != null) {
                aVar4.f15377a = null;
            }
            aVar.f15378b = this;
            this.f15377a = aVar;
            a aVar5 = this.f15380d;
            if (aVar5 != null) {
                aVar5.d(aVar.f15380d);
            }
        }
        return aVar;
    }

    public void e() {
        a aVar;
        a aVar2 = this.f15380d;
        if (aVar2 != null && (aVar = this.f15378b) != null) {
            a aVar3 = aVar2.f15378b;
            if (aVar3 != null) {
                aVar3.f15377a = null;
            }
            aVar2.f15378b = aVar.f15380d;
            a aVar4 = this.f15378b.f15380d;
            if (aVar4 != null) {
                a aVar5 = aVar4.f15377a;
                if (aVar5 != null) {
                    aVar5.f15378b = null;
                }
                this.f15378b.f15380d.f15377a = aVar2;
            }
            aVar2.e();
        }
    }

    public void f() {
        a aVar;
        a aVar2 = this.f15380d;
        if (aVar2 != null && (aVar = this.f15377a) != null) {
            a aVar3 = aVar2.f15377a;
            if (aVar3 != null) {
                aVar3.f15378b = null;
            }
            aVar2.f15377a = aVar.f15380d;
            a aVar4 = this.f15377a.f15380d;
            if (aVar4 != null) {
                a aVar5 = aVar4.f15378b;
                if (aVar5 != null) {
                    aVar5.f15377a = null;
                }
                this.f15377a.f15380d.f15378b = aVar2;
            }
            aVar2.f();
        }
    }

    public void g(a aVar) {
        aVar.b(this);
    }

    public a h() {
        return this.f15380d;
    }

    public a i() {
        a aVar;
        a aVar2 = this.f15379c;
        if (aVar2 != null) {
            aVar = aVar2.i();
        } else {
            aVar = null;
        }
        a aVar3 = new a(this);
        if (aVar == null) {
            aVar3.f15378b = this.f15378b;
            a aVar4 = this.f15378b;
            if (aVar4 != null) {
                aVar4.f15377a = aVar3;
            }
            aVar3.f15377a = this;
            this.f15378b = aVar3;
        } else {
            aVar.b(aVar3);
        }
        return aVar3;
    }

    public a j() {
        a aVar;
        a aVar2 = this.f15379c;
        if (aVar2 != null) {
            aVar = aVar2.j();
        } else {
            aVar = null;
        }
        a aVar3 = new a(this);
        if (aVar == null) {
            aVar3.f15377a = this.f15377a;
            a aVar4 = this.f15377a;
            if (aVar4 != null) {
                aVar4.f15378b = aVar3;
            }
            aVar3.f15378b = this;
            this.f15377a = this;
        } else {
            aVar.b(aVar3);
        }
        return aVar3;
    }

    public a k(String str) {
        a aVar = new a(str);
        b(aVar);
        return aVar;
    }

    public a m() {
        return this;
    }

    public int n() {
        return this.f15385i;
    }

    public int o() {
        return this.f15384h;
    }

    public int p() {
        return this.f15387k;
    }

    public int q() {
        return this.f15386j;
    }

    public String r() {
        return this.f15381e;
    }

    public CharSequence s() {
        return this.f15382f;
    }

    public int t() {
        return this.f15383g;
    }

    public String toString() {
        return this.f15381e;
    }

    public a u() {
        return this.f15378b;
    }

    public a v() {
        return this.f15379c;
    }

    public a w() {
        return this.f15377a;
    }

    public void y() {
        if (this.f15379c == null) {
            x();
        } else {
            l();
        }
    }

    public a z() {
        a aVar = this.f15378b;
        if (aVar != null) {
            aVar.y();
        }
        return this;
    }

    private a(a aVar) {
        this.f15381e = aVar.f15381e;
        this.f15384h = aVar.f15384h;
        this.f15385i = aVar.f15385i;
        if (aVar.f15382f != null) {
            this.f15382f = new SpannableStringBuilder(aVar.f15382f);
        }
        this.f15383g = aVar.f15383g;
    }
}
