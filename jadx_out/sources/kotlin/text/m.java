package kotlin.text;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lkotlin/text/MatchGroup;", "", t0.b.f22420d, "", "range", "Lkotlin/ranges/IntRange;", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getRange", "()Lkotlin/ranges/IntRange;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final String f19790a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final kotlin.ranges.l f19791b;

    public m(@p4.l String value, @p4.l kotlin.ranges.l range) {
        kotlin.jvm.internal.l0.p(value, "value");
        kotlin.jvm.internal.l0.p(range, "range");
        this.f19790a = value;
        this.f19791b = range;
    }

    public static /* synthetic */ m d(m mVar, String str, kotlin.ranges.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = mVar.f19790a;
        }
        if ((i5 & 2) != 0) {
            lVar = mVar.f19791b;
        }
        return mVar.c(str, lVar);
    }

    @p4.l
    public final String a() {
        return this.f19790a;
    }

    @p4.l
    public final kotlin.ranges.l b() {
        return this.f19791b;
    }

    @p4.l
    public final m c(@p4.l String value, @p4.l kotlin.ranges.l range) {
        kotlin.jvm.internal.l0.p(value, "value");
        kotlin.jvm.internal.l0.p(range, "range");
        return new m(value, range);
    }

    @p4.l
    public final kotlin.ranges.l e() {
        return this.f19791b;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.l0.g(this.f19790a, mVar.f19790a) && kotlin.jvm.internal.l0.g(this.f19791b, mVar.f19791b);
    }

    @p4.l
    public final String f() {
        return this.f19790a;
    }

    public int hashCode() {
        return (this.f19790a.hashCode() * 31) + this.f19791b.hashCode();
    }

    @p4.l
    public String toString() {
        return "MatchGroup(value=" + this.f19790a + ", range=" + this.f19791b + ')';
    }
}
