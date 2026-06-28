package o4;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public class b<T> implements a<Long, T> {

    /* renamed from: a, reason: collision with root package name */
    private final org.greenrobot.greendao.internal.c<Reference<T>> f20847a = new org.greenrobot.greendao.internal.c<>();

    /* renamed from: b, reason: collision with root package name */
    private final ReentrantLock f20848b = new ReentrantLock();

    @Override // o4.a
    public void a() {
        this.f20848b.unlock();
    }

    @Override // o4.a
    public void b(Iterable<Long> iterable) {
        this.f20848b.lock();
        try {
            Iterator<Long> it = iterable.iterator();
            while (it.hasNext()) {
                this.f20847a.f(it.next().longValue());
            }
        } finally {
            this.f20848b.unlock();
        }
    }

    @Override // o4.a
    public void c() {
        this.f20848b.lock();
    }

    @Override // o4.a
    public void clear() {
        this.f20848b.lock();
        try {
            this.f20847a.a();
        } finally {
            this.f20848b.unlock();
        }
    }

    @Override // o4.a
    public void f(int i5) {
        this.f20847a.g(i5);
    }

    @Override // o4.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean g(Long l5, T t5) {
        this.f20848b.lock();
        try {
            if (get(l5) == t5 && t5 != null) {
                remove(l5);
                this.f20848b.unlock();
                return true;
            }
            this.f20848b.unlock();
            return false;
        } catch (Throwable th) {
            this.f20848b.unlock();
            throw th;
        }
    }

    @Override // o4.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public T get(Long l5) {
        return j(l5.longValue());
    }

    public T j(long j5) {
        this.f20848b.lock();
        try {
            Reference<T> c5 = this.f20847a.c(j5);
            if (c5 != null) {
                return c5.get();
            }
            return null;
        } finally {
            this.f20848b.unlock();
        }
    }

    public T k(long j5) {
        Reference<T> c5 = this.f20847a.c(j5);
        if (c5 != null) {
            return c5.get();
        }
        return null;
    }

    @Override // o4.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public T e(Long l5) {
        return k(l5.longValue());
    }

    @Override // o4.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void put(Long l5, T t5) {
        n(l5.longValue(), t5);
    }

    public void n(long j5, T t5) {
        this.f20848b.lock();
        try {
            this.f20847a.e(j5, new WeakReference(t5));
        } finally {
            this.f20848b.unlock();
        }
    }

    public void o(long j5, T t5) {
        this.f20847a.e(j5, new WeakReference(t5));
    }

    @Override // o4.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void d(Long l5, T t5) {
        o(l5.longValue(), t5);
    }

    @Override // o4.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void remove(Long l5) {
        this.f20848b.lock();
        try {
            this.f20847a.f(l5.longValue());
        } finally {
            this.f20848b.unlock();
        }
    }
}
