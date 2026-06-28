package kotlin.collections;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lkotlin/collections/IndexedValue;", "T", "", "index", "", t0.b.f22420d, "(ILjava/lang/Object;)V", "getIndex", "()I", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(ILjava/lang/Object;)Lkotlin/collections/IndexedValue;", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f19180a;

    /* renamed from: b, reason: collision with root package name */
    private final T f19181b;

    public p0(int i5, T t5) {
        this.f19180a = i5;
        this.f19181b = t5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p0 d(p0 p0Var, int i5, Object obj, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            i5 = p0Var.f19180a;
        }
        if ((i6 & 2) != 0) {
            obj = p0Var.f19181b;
        }
        return p0Var.c(i5, obj);
    }

    public final int a() {
        return this.f19180a;
    }

    public final T b() {
        return this.f19181b;
    }

    @p4.l
    public final p0<T> c(int i5, T t5) {
        return new p0<>(i5, t5);
    }

    public final int e() {
        return this.f19180a;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f19180a == p0Var.f19180a && kotlin.jvm.internal.l0.g(this.f19181b, p0Var.f19181b);
    }

    public final T f() {
        return this.f19181b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f19180a) * 31;
        T t5 = this.f19181b;
        return hashCode + (t5 == null ? 0 : t5.hashCode());
    }

    @p4.l
    public String toString() {
        return "IndexedValue(index=" + this.f19180a + ", value=" + this.f19181b + ')';
    }
}
