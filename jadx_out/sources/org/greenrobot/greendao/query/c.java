package org.greenrobot.greendao.query;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class c<T> extends a<T> {

    /* renamed from: f, reason: collision with root package name */
    protected final int f21404f;

    /* renamed from: g, reason: collision with root package name */
    protected final int f21405g;

    /* JADX INFO: Access modifiers changed from: protected */
    public c(org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr, int i5, int i6) {
        super(aVar, str, strArr);
        this.f21404f = i5;
        this.f21405g = i6;
    }

    public void f(int i5) {
        a();
        int i6 = this.f21404f;
        if (i6 != -1) {
            this.f21398d[i6] = Integer.toString(i5);
            return;
        }
        throw new IllegalStateException("Limit must be set with QueryBuilder before it can be used here");
    }

    public void g(int i5) {
        a();
        int i6 = this.f21405g;
        if (i6 != -1) {
            this.f21398d[i6] = Integer.toString(i5);
            return;
        }
        throw new IllegalStateException("Offset must be set with QueryBuilder before it can be used here");
    }

    @Override // org.greenrobot.greendao.query.a
    public c<T> h(int i5, Object obj) {
        if (i5 >= 0 && (i5 == this.f21404f || i5 == this.f21405g)) {
            throw new IllegalArgumentException("Illegal parameter index: " + i5);
        }
        return (c) super.h(i5, obj);
    }
}
