package org.greenrobot.greendao;

import java.util.Collection;
import org.greenrobot.greendao.query.m;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f21356a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f21357b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21358c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21359d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21360e;

    public i(int i5, Class<?> cls, String str, boolean z4, String str2) {
        this.f21356a = i5;
        this.f21357b = cls;
        this.f21358c = str;
        this.f21359d = z4;
        this.f21360e = str2;
    }

    public m a(Object obj, Object obj2) {
        return new m.b(this, " BETWEEN ? AND ?", new Object[]{obj, obj2});
    }

    public m b(Object obj) {
        return new m.b(this, "=?", obj);
    }

    public m c(Object obj) {
        return new m.b(this, ">=?", obj);
    }

    public m d(Object obj) {
        return new m.b(this, ">?", obj);
    }

    public m e(Collection<?> collection) {
        return f(collection.toArray());
    }

    public m f(Object... objArr) {
        StringBuilder sb = new StringBuilder(" IN (");
        org.greenrobot.greendao.internal.d.g(sb, objArr.length).append(')');
        return new m.b(this, sb.toString(), objArr);
    }

    public m g() {
        return new m.b(this, " IS NOT NULL");
    }

    public m h() {
        return new m.b(this, " IS NULL");
    }

    public m i(Object obj) {
        return new m.b(this, "<=?", obj);
    }

    public m j(String str) {
        return new m.b(this, " LIKE ?", str);
    }

    public m k(Object obj) {
        return new m.b(this, "<?", obj);
    }

    public m l(Object obj) {
        return new m.b(this, "<>?", obj);
    }

    public m m(Collection<?> collection) {
        return n(collection.toArray());
    }

    public m n(Object... objArr) {
        StringBuilder sb = new StringBuilder(" NOT IN (");
        org.greenrobot.greendao.internal.d.g(sb, objArr.length).append(')');
        return new m.b(this, sb.toString(), objArr);
    }
}
