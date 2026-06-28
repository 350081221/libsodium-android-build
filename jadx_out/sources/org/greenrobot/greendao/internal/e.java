package org.greenrobot.greendao.internal;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final org.greenrobot.greendao.database.a f21382a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21383b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f21384c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f21385d;

    /* renamed from: e, reason: collision with root package name */
    private org.greenrobot.greendao.database.c f21386e;

    /* renamed from: f, reason: collision with root package name */
    private org.greenrobot.greendao.database.c f21387f;

    /* renamed from: g, reason: collision with root package name */
    private org.greenrobot.greendao.database.c f21388g;

    /* renamed from: h, reason: collision with root package name */
    private org.greenrobot.greendao.database.c f21389h;

    /* renamed from: i, reason: collision with root package name */
    private org.greenrobot.greendao.database.c f21390i;

    /* renamed from: j, reason: collision with root package name */
    private volatile String f21391j;

    /* renamed from: k, reason: collision with root package name */
    private volatile String f21392k;

    /* renamed from: l, reason: collision with root package name */
    private volatile String f21393l;

    /* renamed from: m, reason: collision with root package name */
    private volatile String f21394m;

    public e(org.greenrobot.greendao.database.a aVar, String str, String[] strArr, String[] strArr2) {
        this.f21382a = aVar;
        this.f21383b = str;
        this.f21384c = strArr;
        this.f21385d = strArr2;
    }

    public org.greenrobot.greendao.database.c a() {
        if (this.f21390i == null) {
            this.f21390i = this.f21382a.compileStatement(d.i(this.f21383b));
        }
        return this.f21390i;
    }

    public org.greenrobot.greendao.database.c b() {
        if (this.f21389h == null) {
            org.greenrobot.greendao.database.c compileStatement = this.f21382a.compileStatement(d.j(this.f21383b, this.f21385d));
            synchronized (this) {
                if (this.f21389h == null) {
                    this.f21389h = compileStatement;
                }
            }
            if (this.f21389h != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f21389h;
    }

    public org.greenrobot.greendao.database.c c() {
        if (this.f21387f == null) {
            org.greenrobot.greendao.database.c compileStatement = this.f21382a.compileStatement(d.k("INSERT OR REPLACE INTO ", this.f21383b, this.f21384c));
            synchronized (this) {
                if (this.f21387f == null) {
                    this.f21387f = compileStatement;
                }
            }
            if (this.f21387f != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f21387f;
    }

    public org.greenrobot.greendao.database.c d() {
        if (this.f21386e == null) {
            org.greenrobot.greendao.database.c compileStatement = this.f21382a.compileStatement(d.k("INSERT INTO ", this.f21383b, this.f21384c));
            synchronized (this) {
                if (this.f21386e == null) {
                    this.f21386e = compileStatement;
                }
            }
            if (this.f21386e != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f21386e;
    }

    public String e() {
        if (this.f21391j == null) {
            this.f21391j = d.l(this.f21383b, "T", this.f21384c, false);
        }
        return this.f21391j;
    }

    public String f() {
        if (this.f21392k == null) {
            StringBuilder sb = new StringBuilder(e());
            sb.append("WHERE ");
            d.e(sb, "T", this.f21385d);
            this.f21392k = sb.toString();
        }
        return this.f21392k;
    }

    public String g() {
        if (this.f21393l == null) {
            this.f21393l = e() + "WHERE ROWID=?";
        }
        return this.f21393l;
    }

    public String h() {
        if (this.f21394m == null) {
            this.f21394m = d.l(this.f21383b, "T", this.f21385d, false);
        }
        return this.f21394m;
    }

    public org.greenrobot.greendao.database.c i() {
        if (this.f21388g == null) {
            org.greenrobot.greendao.database.c compileStatement = this.f21382a.compileStatement(d.n(this.f21383b, this.f21384c, this.f21385d));
            synchronized (this) {
                if (this.f21388g == null) {
                    this.f21388g = compileStatement;
                }
            }
            if (this.f21388g != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f21388g;
    }
}
