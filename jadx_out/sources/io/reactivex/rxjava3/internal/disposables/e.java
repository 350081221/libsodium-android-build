package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.internal.util.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class e implements io.reactivex.rxjava3.disposables.e, io.reactivex.rxjava3.disposables.f {

    /* renamed from: a, reason: collision with root package name */
    List<io.reactivex.rxjava3.disposables.e> f16247a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f16248b;

    public e() {
    }

    @Override // io.reactivex.rxjava3.disposables.f
    public boolean a(io.reactivex.rxjava3.disposables.e eVar) {
        if (c(eVar)) {
            eVar.dispose();
            return true;
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.f
    public boolean b(io.reactivex.rxjava3.disposables.e eVar) {
        Objects.requireNonNull(eVar, "d is null");
        if (!this.f16248b) {
            synchronized (this) {
                if (!this.f16248b) {
                    List list = this.f16247a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f16247a = list;
                    }
                    list.add(eVar);
                    return true;
                }
            }
        }
        eVar.dispose();
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.f
    public boolean c(io.reactivex.rxjava3.disposables.e eVar) {
        Objects.requireNonNull(eVar, "Disposable item is null");
        if (this.f16248b) {
            return false;
        }
        synchronized (this) {
            if (this.f16248b) {
                return false;
            }
            List<io.reactivex.rxjava3.disposables.e> list = this.f16247a;
            if (list != null && list.remove(eVar)) {
                return true;
            }
            return false;
        }
    }

    public boolean d(io.reactivex.rxjava3.disposables.e... eVarArr) {
        Objects.requireNonNull(eVarArr, "ds is null");
        if (!this.f16248b) {
            synchronized (this) {
                if (!this.f16248b) {
                    List list = this.f16247a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f16247a = list;
                    }
                    for (io.reactivex.rxjava3.disposables.e eVar : eVarArr) {
                        Objects.requireNonNull(eVar, "d is null");
                        list.add(eVar);
                    }
                    return true;
                }
            }
        }
        for (io.reactivex.rxjava3.disposables.e eVar2 : eVarArr) {
            eVar2.dispose();
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        if (this.f16248b) {
            return;
        }
        synchronized (this) {
            if (this.f16248b) {
                return;
            }
            this.f16248b = true;
            List<io.reactivex.rxjava3.disposables.e> list = this.f16247a;
            this.f16247a = null;
            g(list);
        }
    }

    public void e() {
        if (this.f16248b) {
            return;
        }
        synchronized (this) {
            if (this.f16248b) {
                return;
            }
            List<io.reactivex.rxjava3.disposables.e> list = this.f16247a;
            this.f16247a = null;
            g(list);
        }
    }

    void g(List<io.reactivex.rxjava3.disposables.e> list) {
        if (list == null) {
            return;
        }
        Iterator<io.reactivex.rxjava3.disposables.e> it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw k.i((Throwable) arrayList.get(0));
            }
            throw new io.reactivex.rxjava3.exceptions.a(arrayList);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this.f16248b;
    }

    public e(io.reactivex.rxjava3.disposables.e... eVarArr) {
        Objects.requireNonNull(eVarArr, "resources is null");
        this.f16247a = new LinkedList();
        for (io.reactivex.rxjava3.disposables.e eVar : eVarArr) {
            Objects.requireNonNull(eVar, "Disposable item is null");
            this.f16247a.add(eVar);
        }
    }

    public e(Iterable<? extends io.reactivex.rxjava3.disposables.e> iterable) {
        Objects.requireNonNull(iterable, "resources is null");
        this.f16247a = new LinkedList();
        for (io.reactivex.rxjava3.disposables.e eVar : iterable) {
            Objects.requireNonNull(eVar, "Disposable item is null");
            this.f16247a.add(eVar);
        }
    }
}
