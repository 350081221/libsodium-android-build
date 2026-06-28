package o4;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public class c<K, T> implements a<K, T> {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<K, Reference<T>> f20849a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final ReentrantLock f20850b = new ReentrantLock();

    @Override // o4.a
    public void a() {
        this.f20850b.unlock();
    }

    @Override // o4.a
    public void b(Iterable<K> iterable) {
        this.f20850b.lock();
        try {
            Iterator<K> it = iterable.iterator();
            while (it.hasNext()) {
                this.f20849a.remove(it.next());
            }
        } finally {
            this.f20850b.unlock();
        }
    }

    @Override // o4.a
    public void c() {
        this.f20850b.lock();
    }

    @Override // o4.a
    public void clear() {
        this.f20850b.lock();
        try {
            this.f20849a.clear();
        } finally {
            this.f20850b.unlock();
        }
    }

    @Override // o4.a
    public void d(K k5, T t5) {
        this.f20849a.put(k5, new WeakReference(t5));
    }

    @Override // o4.a
    public T e(K k5) {
        Reference<T> reference = this.f20849a.get(k5);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    @Override // o4.a
    public void f(int i5) {
    }

    @Override // o4.a
    public boolean g(K k5, T t5) {
        this.f20850b.lock();
        try {
            if (get(k5) == t5 && t5 != null) {
                remove(k5);
                this.f20850b.unlock();
                return true;
            }
            this.f20850b.unlock();
            return false;
        } catch (Throwable th) {
            this.f20850b.unlock();
            throw th;
        }
    }

    @Override // o4.a
    public T get(K k5) {
        this.f20850b.lock();
        try {
            Reference<T> reference = this.f20849a.get(k5);
            if (reference != null) {
                return reference.get();
            }
            return null;
        } finally {
            this.f20850b.unlock();
        }
    }

    @Override // o4.a
    public void put(K k5, T t5) {
        this.f20850b.lock();
        try {
            this.f20849a.put(k5, new WeakReference(t5));
        } finally {
            this.f20850b.unlock();
        }
    }

    @Override // o4.a
    public void remove(K k5) {
        this.f20850b.lock();
        try {
            this.f20849a.remove(k5);
        } finally {
            this.f20850b.unlock();
        }
    }
}
