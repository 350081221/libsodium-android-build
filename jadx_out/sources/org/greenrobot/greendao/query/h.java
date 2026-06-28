package org.greenrobot.greendao.query;

/* loaded from: classes4.dex */
public class h<SRC, DST> {

    /* renamed from: a, reason: collision with root package name */
    final String f21411a;

    /* renamed from: b, reason: collision with root package name */
    final org.greenrobot.greendao.a<DST, ?> f21412b;

    /* renamed from: c, reason: collision with root package name */
    final org.greenrobot.greendao.i f21413c;

    /* renamed from: d, reason: collision with root package name */
    final org.greenrobot.greendao.i f21414d;

    /* renamed from: e, reason: collision with root package name */
    final String f21415e;

    /* renamed from: f, reason: collision with root package name */
    final l<DST> f21416f;

    public h(String str, org.greenrobot.greendao.i iVar, org.greenrobot.greendao.a<DST, ?> aVar, org.greenrobot.greendao.i iVar2, String str2) {
        this.f21411a = str;
        this.f21413c = iVar;
        this.f21412b = aVar;
        this.f21414d = iVar2;
        this.f21415e = str2;
        this.f21416f = new l<>(aVar, str2);
    }

    public m a(m mVar, m mVar2, m... mVarArr) {
        return this.f21416f.f(" AND ", mVar, mVar2, mVarArr);
    }

    public String b() {
        return this.f21415e;
    }

    public m c(m mVar, m mVar2, m... mVarArr) {
        return this.f21416f.f(" OR ", mVar, mVar2, mVarArr);
    }

    public h<SRC, DST> d(m mVar, m... mVarArr) {
        this.f21416f.a(mVar, mVarArr);
        return this;
    }

    public h<SRC, DST> e(m mVar, m mVar2, m... mVarArr) {
        this.f21416f.a(c(mVar, mVar2, mVarArr), new m[0]);
        return this;
    }
}
