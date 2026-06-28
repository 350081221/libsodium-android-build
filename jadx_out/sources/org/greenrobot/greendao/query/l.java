package org.greenrobot.greendao.query;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.greenrobot.greendao.query.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class l<T> {

    /* renamed from: a, reason: collision with root package name */
    private final org.greenrobot.greendao.a<T, ?> f21443a;

    /* renamed from: b, reason: collision with root package name */
    private final List<m> f21444b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final String f21445c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(org.greenrobot.greendao.a<T, ?> aVar, String str) {
        this.f21443a = aVar;
        this.f21445c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(m mVar, m... mVarArr) {
        d(mVar);
        this.f21444b.add(mVar);
        for (m mVar2 : mVarArr) {
            d(mVar2);
            this.f21444b.add(mVar2);
        }
    }

    void b(StringBuilder sb, List<Object> list, m mVar) {
        d(mVar);
        mVar.b(sb, this.f21445c);
        mVar.a(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(StringBuilder sb, String str, List<Object> list) {
        ListIterator<m> listIterator = this.f21444b.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.hasPrevious()) {
                sb.append(" AND ");
            }
            m next = listIterator.next();
            next.b(sb, str);
            next.a(list);
        }
    }

    void d(m mVar) {
        if (mVar instanceof m.b) {
            e(((m.b) mVar).f21449d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(org.greenrobot.greendao.i iVar) {
        org.greenrobot.greendao.a<T, ?> aVar = this.f21443a;
        if (aVar != null) {
            org.greenrobot.greendao.i[] properties = aVar.getProperties();
            int length = properties.length;
            boolean z4 = false;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (iVar == properties[i5]) {
                    z4 = true;
                    break;
                }
                i5++;
            }
            if (!z4) {
                throw new org.greenrobot.greendao.d("Property '" + iVar.f21358c + "' is not part of " + this.f21443a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m f(String str, m mVar, m mVar2, m... mVarArr) {
        StringBuilder sb = new StringBuilder("(");
        ArrayList arrayList = new ArrayList();
        b(sb, arrayList, mVar);
        sb.append(str);
        b(sb, arrayList, mVar2);
        for (m mVar3 : mVarArr) {
            sb.append(str);
            b(sb, arrayList, mVar3);
        }
        sb.append(')');
        return new m.c(sb.toString(), arrayList.toArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.f21444b.isEmpty();
    }
}
