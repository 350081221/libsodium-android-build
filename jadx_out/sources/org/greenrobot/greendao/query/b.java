package org.greenrobot.greendao.query;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.greenrobot.greendao.query.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class b<T, Q extends a<T>> {

    /* renamed from: a, reason: collision with root package name */
    final String f21400a;

    /* renamed from: b, reason: collision with root package name */
    final org.greenrobot.greendao.a<T, ?> f21401b;

    /* renamed from: c, reason: collision with root package name */
    final String[] f21402c;

    /* renamed from: d, reason: collision with root package name */
    final Map<Long, WeakReference<Q>> f21403d = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr) {
        this.f21401b = aVar;
        this.f21400a = str;
        this.f21402c = strArr;
    }

    protected abstract Q a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q b() {
        Q q5;
        long id = Thread.currentThread().getId();
        synchronized (this.f21403d) {
            WeakReference<Q> weakReference = this.f21403d.get(Long.valueOf(id));
            if (weakReference != null) {
                q5 = weakReference.get();
            } else {
                q5 = null;
            }
            if (q5 == null) {
                d();
                q5 = a();
                this.f21403d.put(Long.valueOf(id), new WeakReference<>(q5));
            } else {
                String[] strArr = this.f21402c;
                System.arraycopy(strArr, 0, q5.f21398d, 0, strArr.length);
            }
        }
        return q5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q c(Q q5) {
        if (Thread.currentThread() == q5.f21399e) {
            String[] strArr = this.f21402c;
            System.arraycopy(strArr, 0, q5.f21398d, 0, strArr.length);
            return q5;
        }
        return b();
    }

    void d() {
        synchronized (this.f21403d) {
            Iterator<Map.Entry<Long, WeakReference<Q>>> it = this.f21403d.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().get() == null) {
                    it.remove();
                }
            }
        }
    }
}
