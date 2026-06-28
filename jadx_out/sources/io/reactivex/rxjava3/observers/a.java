package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.internal.util.y;
import io.reactivex.rxjava3.observers.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import m3.r;

/* loaded from: classes3.dex */
public abstract class a<T, U extends a<T, U>> {

    /* renamed from: d, reason: collision with root package name */
    protected long f18709d;

    /* renamed from: e, reason: collision with root package name */
    protected Thread f18710e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f18711f;

    /* renamed from: g, reason: collision with root package name */
    protected CharSequence f18712g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f18713h;

    /* renamed from: b, reason: collision with root package name */
    protected final List<T> f18707b = new y();

    /* renamed from: c, reason: collision with root package name */
    protected final List<Throwable> f18708c = new y();

    /* renamed from: a, reason: collision with root package name */
    protected final CountDownLatch f18706a = new CountDownLatch(1);

    @l3.f
    public static String H(@l3.g Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj + " (class: " + obj.getClass().getSimpleName() + ")";
    }

    @SafeVarargs
    @l3.f
    public final U A(@l3.f T... tArr) {
        int size = this.f18707b.size();
        if (size == tArr.length) {
            for (int i5 = 0; i5 < size; i5++) {
                T t5 = this.f18707b.get(i5);
                T t6 = tArr[i5];
                if (!Objects.equals(t6, t5)) {
                    throw G("Values at position " + i5 + " differ; expected: " + H(t6) + " but was: " + H(t5));
                }
            }
            return this;
        }
        throw G("Value count differs; expected: " + tArr.length + " " + Arrays.toString(tArr) + " but was: " + size + " " + this.f18707b);
    }

    @SafeVarargs
    @l3.f
    public final U B(@l3.f T... tArr) {
        return (U) t().A(tArr).o().r();
    }

    @l3.f
    public final U C() throws InterruptedException {
        if (this.f18706a.getCount() == 0) {
            return this;
        }
        this.f18706a.await();
        return this;
    }

    public final boolean D(long j5, @l3.f TimeUnit timeUnit) throws InterruptedException {
        boolean z4;
        if (this.f18706a.getCount() != 0 && !this.f18706a.await(j5, timeUnit)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f18713h = !z4;
        return z4;
    }

    @l3.f
    public final U E(int i5) {
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (System.currentTimeMillis() - currentTimeMillis >= 5000) {
                this.f18713h = true;
                break;
            }
            if (this.f18706a.getCount() == 0 || this.f18707b.size() >= i5) {
                break;
            }
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e5) {
                throw new RuntimeException(e5);
            }
        }
        return this;
    }

    @l3.f
    public final U F(long j5, @l3.f TimeUnit timeUnit) {
        try {
            if (!this.f18706a.await(j5, timeUnit)) {
                this.f18713h = true;
                dispose();
            }
            return this;
        } catch (InterruptedException e5) {
            dispose();
            throw io.reactivex.rxjava3.internal.util.k.i(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.f
    public final AssertionError G(@l3.f String str) {
        StringBuilder sb = new StringBuilder(str.length() + 64);
        sb.append(str);
        sb.append(" (");
        sb.append("latch = ");
        sb.append(this.f18706a.getCount());
        sb.append(", ");
        sb.append("values = ");
        sb.append(this.f18707b.size());
        sb.append(", ");
        sb.append("errors = ");
        sb.append(this.f18708c.size());
        sb.append(", ");
        sb.append("completions = ");
        sb.append(this.f18709d);
        if (this.f18713h) {
            sb.append(", timeout!");
        }
        if (isDisposed()) {
            sb.append(", disposed!");
        }
        CharSequence charSequence = this.f18712g;
        if (charSequence != null) {
            sb.append(", tag = ");
            sb.append(charSequence);
        }
        sb.append(')');
        AssertionError assertionError = new AssertionError(sb.toString());
        if (!this.f18708c.isEmpty()) {
            if (this.f18708c.size() == 1) {
                assertionError.initCause(this.f18708c.get(0));
            } else {
                assertionError.initCause(new io.reactivex.rxjava3.exceptions.a(this.f18708c));
            }
        }
        return assertionError;
    }

    @l3.f
    public final List<T> I() {
        return this.f18707b;
    }

    @l3.f
    public final U J(@l3.g CharSequence charSequence) {
        this.f18712g = charSequence;
        return this;
    }

    @l3.f
    public final U a() {
        long j5 = this.f18709d;
        if (j5 != 0) {
            if (j5 <= 1) {
                return this;
            }
            throw G("Multiple completions: " + j5);
        }
        throw G("Not completed");
    }

    @l3.f
    public final U b() {
        return (U) t().q().o().r();
    }

    @l3.f
    public final U c(@l3.f Class<? extends Throwable> cls) {
        return e(io.reactivex.rxjava3.internal.functions.a.l(cls));
    }

    @l3.f
    public final U d(@l3.f Throwable th) {
        return e(io.reactivex.rxjava3.internal.functions.a.i(th));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void dispose();

    @l3.f
    public final U e(@l3.f r<Throwable> rVar) {
        boolean z4;
        int size = this.f18708c.size();
        if (size != 0) {
            Iterator<Throwable> it = this.f18708c.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        if (rVar.test(it.next())) {
                            z4 = true;
                            break;
                        }
                    } catch (Throwable th) {
                        throw io.reactivex.rxjava3.internal.util.k.i(th);
                    }
                } else {
                    z4 = false;
                    break;
                }
            }
            if (z4) {
                if (size == 1) {
                    return this;
                }
                throw G("Error present but other errors as well");
            }
            throw G("Error not present");
        }
        throw G("No errors");
    }

    @SafeVarargs
    @l3.f
    public final U g(@l3.f Class<? extends Throwable> cls, @l3.f T... tArr) {
        return (U) t().A(tArr).c(cls).r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean isDisposed();

    @l3.f
    public final U o() {
        if (this.f18708c.size() == 0) {
            return this;
        }
        throw G("Error(s) present: " + this.f18708c);
    }

    @l3.f
    public final U q() {
        return y(0);
    }

    @l3.f
    public final U r() {
        long j5 = this.f18709d;
        if (j5 != 1) {
            if (j5 <= 1) {
                return this;
            }
            throw G("Multiple completions: " + j5);
        }
        throw G("Completed!");
    }

    @SafeVarargs
    @l3.f
    public final U s(@l3.f T... tArr) {
        return (U) t().A(tArr).o().a();
    }

    @l3.f
    protected abstract U t();

    @l3.f
    public final U u(@l3.f T t5) {
        if (this.f18707b.size() == 1) {
            T t6 = this.f18707b.get(0);
            if (Objects.equals(t5, t6)) {
                return this;
            }
            throw G("expected: " + H(t5) + " but was: " + H(t6));
        }
        throw G("expected: " + H(t5) + " but was: " + this.f18707b);
    }

    @l3.f
    public final U v(@l3.f r<T> rVar) {
        x(0, rVar);
        if (this.f18707b.size() <= 1) {
            return this;
        }
        throw G("Value present but other values as well");
    }

    @l3.f
    public final U w(int i5, @l3.f T t5) {
        int size = this.f18707b.size();
        if (size != 0) {
            if (i5 < size) {
                T t6 = this.f18707b.get(i5);
                if (Objects.equals(t5, t6)) {
                    return this;
                }
                throw G("expected: " + H(t5) + " but was: " + H(t6));
            }
            throw G("Invalid index: " + i5);
        }
        throw G("No values");
    }

    @l3.f
    public final U x(int i5, @l3.f r<T> rVar) {
        if (this.f18707b.size() != 0) {
            if (i5 < this.f18707b.size()) {
                try {
                    if (rVar.test(this.f18707b.get(i5))) {
                        return this;
                    }
                    throw G("Value not present");
                } catch (Throwable th) {
                    throw io.reactivex.rxjava3.internal.util.k.i(th);
                }
            }
            throw G("Invalid index: " + i5);
        }
        throw G("No values");
    }

    @l3.f
    public final U y(int i5) {
        int size = this.f18707b.size();
        if (size == i5) {
            return this;
        }
        throw G("Value counts differ; expected: " + i5 + " but was: " + size);
    }

    @l3.f
    public final U z(@l3.f Iterable<? extends T> iterable) {
        boolean hasNext;
        boolean hasNext2;
        Iterator<T> it = this.f18707b.iterator();
        Iterator<? extends T> it2 = iterable.iterator();
        int i5 = 0;
        while (true) {
            hasNext = it2.hasNext();
            hasNext2 = it.hasNext();
            if (!hasNext2 || !hasNext) {
                break;
            }
            T next = it2.next();
            T next2 = it.next();
            if (Objects.equals(next, next2)) {
                i5++;
            } else {
                throw G("Values at position " + i5 + " differ; expected: " + H(next) + " but was: " + H(next2));
            }
        }
        if (!hasNext2) {
            if (!hasNext) {
                return this;
            }
            throw G("Fewer values received than expected (" + i5 + ")");
        }
        throw G("More values received than expected (" + i5 + ")");
    }
}
