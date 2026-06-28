package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.internal.util.s;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class c implements e, f {

    /* renamed from: a, reason: collision with root package name */
    s<e> f16240a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f16241b;

    public c() {
    }

    @Override // io.reactivex.rxjava3.disposables.f
    public boolean a(@l3.f e eVar) {
        if (c(eVar)) {
            eVar.dispose();
            return true;
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.f
    public boolean b(@l3.f e eVar) {
        Objects.requireNonNull(eVar, "disposable is null");
        if (!this.f16241b) {
            synchronized (this) {
                if (!this.f16241b) {
                    s<e> sVar = this.f16240a;
                    if (sVar == null) {
                        sVar = new s<>();
                        this.f16240a = sVar;
                    }
                    sVar.a(eVar);
                    return true;
                }
            }
        }
        eVar.dispose();
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.f
    public boolean c(@l3.f e eVar) {
        Objects.requireNonNull(eVar, "disposable is null");
        if (this.f16241b) {
            return false;
        }
        synchronized (this) {
            if (this.f16241b) {
                return false;
            }
            s<e> sVar = this.f16240a;
            if (sVar != null && sVar.e(eVar)) {
                return true;
            }
            return false;
        }
    }

    public boolean d(@l3.f e... eVarArr) {
        Objects.requireNonNull(eVarArr, "disposables is null");
        if (!this.f16241b) {
            synchronized (this) {
                if (!this.f16241b) {
                    s<e> sVar = this.f16240a;
                    if (sVar == null) {
                        sVar = new s<>(eVarArr.length + 1);
                        this.f16240a = sVar;
                    }
                    for (e eVar : eVarArr) {
                        Objects.requireNonNull(eVar, "A Disposable in the disposables array is null");
                        sVar.a(eVar);
                    }
                    return true;
                }
            }
        }
        for (e eVar2 : eVarArr) {
            eVar2.dispose();
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        if (this.f16241b) {
            return;
        }
        synchronized (this) {
            if (this.f16241b) {
                return;
            }
            this.f16241b = true;
            s<e> sVar = this.f16240a;
            this.f16240a = null;
            g(sVar);
        }
    }

    public void e() {
        if (this.f16241b) {
            return;
        }
        synchronized (this) {
            if (this.f16241b) {
                return;
            }
            s<e> sVar = this.f16240a;
            this.f16240a = null;
            g(sVar);
        }
    }

    void g(@l3.g s<e> sVar) {
        if (sVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : sVar.b()) {
            if (obj instanceof e) {
                try {
                    ((e) obj).dispose();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw io.reactivex.rxjava3.internal.util.k.i((Throwable) arrayList.get(0));
            }
            throw new io.reactivex.rxjava3.exceptions.a(arrayList);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this.f16241b;
    }

    public int o() {
        int i5 = 0;
        if (this.f16241b) {
            return 0;
        }
        synchronized (this) {
            if (this.f16241b) {
                return 0;
            }
            s<e> sVar = this.f16240a;
            if (sVar != null) {
                i5 = sVar.g();
            }
            return i5;
        }
    }

    public c(@l3.f e... eVarArr) {
        Objects.requireNonNull(eVarArr, "disposables is null");
        this.f16240a = new s<>(eVarArr.length + 1);
        for (e eVar : eVarArr) {
            Objects.requireNonNull(eVar, "A Disposable in the disposables array is null");
            this.f16240a.a(eVar);
        }
    }

    public c(@l3.f Iterable<? extends e> iterable) {
        Objects.requireNonNull(iterable, "disposables is null");
        this.f16240a = new s<>();
        for (e eVar : iterable) {
            Objects.requireNonNull(eVar, "A Disposable item in the disposables sequence is null");
            this.f16240a.a(eVar);
        }
    }
}
