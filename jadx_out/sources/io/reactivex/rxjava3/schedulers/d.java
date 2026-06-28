package io.reactivex.rxjava3.schedulers;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l3.f;

/* loaded from: classes3.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name */
    final T f18857a;

    /* renamed from: b, reason: collision with root package name */
    final long f18858b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f18859c;

    public d(@f T t5, long j5, @f TimeUnit timeUnit) {
        Objects.requireNonNull(t5, "value is null");
        this.f18857a = t5;
        this.f18858b = j5;
        Objects.requireNonNull(timeUnit, "unit is null");
        this.f18859c = timeUnit;
    }

    public long a() {
        return this.f18858b;
    }

    public long b(@f TimeUnit timeUnit) {
        return timeUnit.convert(this.f18858b, this.f18859c);
    }

    @f
    public TimeUnit c() {
        return this.f18859c;
    }

    @f
    public T d() {
        return this.f18857a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!Objects.equals(this.f18857a, dVar.f18857a) || this.f18858b != dVar.f18858b || !Objects.equals(this.f18859c, dVar.f18859c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f18857a.hashCode() * 31;
        long j5 = this.f18858b;
        return ((hashCode + ((int) (j5 ^ (j5 >>> 31)))) * 31) + this.f18859c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.f18858b + ", unit=" + this.f18859c + ", value=" + this.f18857a + "]";
    }
}
