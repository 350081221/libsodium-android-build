package org.greenrobot.greendao.query;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.k0;

/* loaded from: classes4.dex */
public class k<T> {

    /* renamed from: k, reason: collision with root package name */
    public static boolean f21431k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f21432l;

    /* renamed from: a, reason: collision with root package name */
    private final l<T> f21433a;

    /* renamed from: b, reason: collision with root package name */
    private StringBuilder f21434b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Object> f21435c;

    /* renamed from: d, reason: collision with root package name */
    private final List<h<T, ?>> f21436d;

    /* renamed from: e, reason: collision with root package name */
    private final org.greenrobot.greendao.a<T, ?> f21437e;

    /* renamed from: f, reason: collision with root package name */
    private final String f21438f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f21439g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f21440h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21441i;

    /* renamed from: j, reason: collision with root package name */
    private String f21442j;

    protected k(org.greenrobot.greendao.a<T, ?> aVar) {
        this(aVar, "T");
    }

    private void C(String str, org.greenrobot.greendao.i... iVarArr) {
        String str2;
        for (org.greenrobot.greendao.i iVar : iVarArr) {
            l();
            c(this.f21434b, iVar);
            if (String.class.equals(iVar.f21357b) && (str2 = this.f21442j) != null) {
                this.f21434b.append(str2);
            }
            this.f21434b.append(str);
        }
    }

    private <J> h<T, J> a(String str, org.greenrobot.greendao.i iVar, org.greenrobot.greendao.a<J, ?> aVar, org.greenrobot.greendao.i iVar2) {
        h<T, J> hVar = new h<>(str, iVar, aVar, iVar2, "J" + (this.f21436d.size() + 1));
        this.f21436d.add(hVar);
        return hVar;
    }

    private void d(StringBuilder sb, String str) {
        this.f21435c.clear();
        for (h<T, ?> hVar : this.f21436d) {
            sb.append(" JOIN ");
            sb.append(k0.f19765b);
            sb.append(hVar.f21412b.getTablename());
            sb.append(k0.f19765b);
            sb.append(' ');
            sb.append(hVar.f21415e);
            sb.append(" ON ");
            org.greenrobot.greendao.internal.d.h(sb, hVar.f21411a, hVar.f21413c).append(o0.a.f20835h);
            org.greenrobot.greendao.internal.d.h(sb, hVar.f21415e, hVar.f21414d);
        }
        boolean z4 = !this.f21433a.g();
        if (z4) {
            sb.append(" WHERE ");
            this.f21433a.c(sb, str, this.f21435c);
        }
        for (h<T, ?> hVar2 : this.f21436d) {
            if (!hVar2.f21416f.g()) {
                if (!z4) {
                    sb.append(" WHERE ");
                    z4 = true;
                } else {
                    sb.append(" AND ");
                }
                hVar2.f21416f.c(sb, hVar2.f21415e, this.f21435c);
            }
        }
    }

    private int i(StringBuilder sb) {
        if (this.f21439g != null) {
            sb.append(" LIMIT ?");
            this.f21435c.add(this.f21439g);
            return this.f21435c.size() - 1;
        }
        return -1;
    }

    private int j(StringBuilder sb) {
        if (this.f21440h != null) {
            if (this.f21439g != null) {
                sb.append(" OFFSET ?");
                this.f21435c.add(this.f21440h);
                return this.f21435c.size() - 1;
            }
            throw new IllegalStateException("Offset cannot be set without limit");
        }
        return -1;
    }

    private void k(String str) {
        if (f21431k) {
            org.greenrobot.greendao.e.a("Built SQL for query: " + str);
        }
        if (f21432l) {
            org.greenrobot.greendao.e.a("Values for query: " + this.f21435c);
        }
    }

    private void l() {
        StringBuilder sb = this.f21434b;
        if (sb == null) {
            this.f21434b = new StringBuilder();
        } else if (sb.length() > 0) {
            this.f21434b.append(",");
        }
    }

    private StringBuilder n() {
        StringBuilder sb = new StringBuilder(org.greenrobot.greendao.internal.d.l(this.f21437e.getTablename(), this.f21438f, this.f21437e.getAllColumns(), this.f21441i));
        d(sb, this.f21438f);
        StringBuilder sb2 = this.f21434b;
        if (sb2 != null && sb2.length() > 0) {
            sb.append(" ORDER BY ");
            sb.append((CharSequence) this.f21434b);
        }
        return sb;
    }

    public static <T2> k<T2> p(org.greenrobot.greendao.a<T2, ?> aVar) {
        return new k<>(aVar);
    }

    public m A(m mVar, m mVar2, m... mVarArr) {
        return this.f21433a.f(" OR ", mVar, mVar2, mVarArr);
    }

    public k<T> B(org.greenrobot.greendao.i... iVarArr) {
        C(" ASC", iVarArr);
        return this;
    }

    public k<T> D(org.greenrobot.greendao.i iVar, String str) {
        l();
        c(this.f21434b, iVar).append(' ');
        this.f21434b.append(str);
        return this;
    }

    public k<T> E(org.greenrobot.greendao.i... iVarArr) {
        C(" DESC", iVarArr);
        return this;
    }

    public k<T> F(String str) {
        l();
        this.f21434b.append(str);
        return this;
    }

    public k<T> G() {
        if (this.f21437e.getDatabase().a() instanceof SQLiteDatabase) {
            this.f21442j = " COLLATE LOCALIZED";
        }
        return this;
    }

    @m4.b
    public org.greenrobot.greendao.rx.c<T> H() {
        return e().i();
    }

    @m4.b
    public org.greenrobot.greendao.rx.c<T> I() {
        return e().j();
    }

    public k<T> J(String str) {
        if (str != null && !str.startsWith(" ")) {
            str = " " + str;
        }
        this.f21442j = str;
        return this;
    }

    public T K() {
        return e().u();
    }

    public T L() {
        return e().v();
    }

    public k<T> M(m mVar, m... mVarArr) {
        this.f21433a.a(mVar, mVarArr);
        return this;
    }

    public k<T> N(m mVar, m mVar2, m... mVarArr) {
        this.f21433a.a(A(mVar, mVar2, mVarArr), new m[0]);
        return this;
    }

    public m b(m mVar, m mVar2, m... mVarArr) {
        return this.f21433a.f(" AND ", mVar, mVar2, mVarArr);
    }

    protected StringBuilder c(StringBuilder sb, org.greenrobot.greendao.i iVar) {
        this.f21433a.e(iVar);
        sb.append(this.f21438f);
        sb.append(external.org.apache.commons.lang3.d.f15957a);
        sb.append('\'');
        sb.append(iVar.f21360e);
        sb.append('\'');
        return sb;
    }

    public j<T> e() {
        StringBuilder n5 = n();
        int i5 = i(n5);
        int j5 = j(n5);
        String sb = n5.toString();
        k(sb);
        return j.k(this.f21437e, sb, this.f21435c.toArray(), i5, j5);
    }

    public e<T> f() {
        StringBuilder sb = new StringBuilder(org.greenrobot.greendao.internal.d.m(this.f21437e.getTablename(), this.f21438f));
        d(sb, this.f21438f);
        String sb2 = sb.toString();
        k(sb2);
        return e.g(this.f21437e, sb2, this.f21435c.toArray());
    }

    public f g() {
        StringBuilder n5 = n();
        int i5 = i(n5);
        int j5 = j(n5);
        String sb = n5.toString();
        k(sb);
        return f.i(this.f21437e, sb, this.f21435c.toArray(), i5, j5);
    }

    public g<T> h() {
        if (this.f21436d.isEmpty()) {
            String tablename = this.f21437e.getTablename();
            StringBuilder sb = new StringBuilder(org.greenrobot.greendao.internal.d.j(tablename, null));
            d(sb, this.f21438f);
            String replace = sb.toString().replace(this.f21438f + ".\"", k0.f19765b + tablename + "\".\"");
            k(replace);
            return g.f(this.f21437e, replace, this.f21435c.toArray());
        }
        throw new org.greenrobot.greendao.d("JOINs are not supported for DELETE queries");
    }

    public long m() {
        return f().f();
    }

    public k<T> o() {
        this.f21441i = true;
        return this;
    }

    public <J> h<T, J> q(Class<J> cls, org.greenrobot.greendao.i iVar) {
        return s(this.f21437e.getPkProperty(), cls, iVar);
    }

    public <J> h<T, J> r(org.greenrobot.greendao.i iVar, Class<J> cls) {
        org.greenrobot.greendao.a<?, ?> dao = this.f21437e.getSession().getDao(cls);
        return a(this.f21438f, iVar, dao, dao.getPkProperty());
    }

    public <J> h<T, J> s(org.greenrobot.greendao.i iVar, Class<J> cls, org.greenrobot.greendao.i iVar2) {
        return a(this.f21438f, iVar, this.f21437e.getSession().getDao(cls), iVar2);
    }

    public <J> h<T, J> t(h<?, T> hVar, org.greenrobot.greendao.i iVar, Class<J> cls, org.greenrobot.greendao.i iVar2) {
        return a(hVar.f21415e, iVar, this.f21437e.getSession().getDao(cls), iVar2);
    }

    public k<T> u(int i5) {
        this.f21439g = Integer.valueOf(i5);
        return this;
    }

    public List<T> v() {
        return e().n();
    }

    public d<T> w() {
        return e().o();
    }

    public i<T> x() {
        return e().p();
    }

    public i<T> y() {
        return e().q();
    }

    public k<T> z(int i5) {
        this.f21440h = Integer.valueOf(i5);
        return this;
    }

    protected k(org.greenrobot.greendao.a<T, ?> aVar, String str) {
        this.f21437e = aVar;
        this.f21438f = str;
        this.f21435c = new ArrayList();
        this.f21436d = new ArrayList();
        this.f21433a = new l<>(aVar, str);
        this.f21442j = " COLLATE NOCASE";
    }
}
