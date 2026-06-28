package org.ahocorasick.interval;

/* loaded from: classes4.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private int f21065a;

    /* renamed from: b, reason: collision with root package name */
    private int f21066b;

    public a(int i5, int i6) {
        this.f21065a = i5;
        this.f21066b = i6;
    }

    public boolean c(int i5) {
        return this.f21065a <= i5 && i5 <= this.f21066b;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof d)) {
            return -1;
        }
        d dVar = (d) obj;
        int start = this.f21065a - dVar.getStart();
        if (start == 0) {
            return this.f21066b - dVar.getEnd();
        }
        return start;
    }

    public boolean e(a aVar) {
        if (this.f21065a <= aVar.getEnd() && this.f21066b >= aVar.getStart()) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f21065a != dVar.getStart() || this.f21066b != dVar.getEnd()) {
            return false;
        }
        return true;
    }

    @Override // org.ahocorasick.interval.d
    public int getEnd() {
        return this.f21066b;
    }

    @Override // org.ahocorasick.interval.d
    public int getStart() {
        return this.f21065a;
    }

    public int hashCode() {
        return (this.f21065a % 100) + (this.f21066b % 100);
    }

    @Override // org.ahocorasick.interval.d
    public int size() {
        return (this.f21066b - this.f21065a) + 1;
    }

    public String toString() {
        return this.f21065a + ":" + this.f21066b;
    }
}
