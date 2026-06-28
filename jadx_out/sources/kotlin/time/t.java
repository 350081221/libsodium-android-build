package kotlin.time;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.v2;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0018\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u000e\u001a\u00020\u0005HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lkotlin/time/TimedValue;", "T", "", t0.b.f22420d, "duration", "Lkotlin/time/Duration;", "(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDuration-UwyO8pc", "()J", "J", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component2-UwyO8pc", "copy", "copy-RFiDyg4", "(Ljava/lang/Object;J)Lkotlin/time/TimedValue;", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.9")
@v2(markerClass = {l.class})
/* loaded from: classes4.dex */
public final class t<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f19832a;

    /* renamed from: b, reason: collision with root package name */
    private final long f19833b;

    private t(T t5, long j5) {
        this.f19832a = t5;
        this.f19833b = j5;
    }

    public /* synthetic */ t(Object obj, long j5, w wVar) {
        this(obj, j5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ t d(t tVar, Object obj, long j5, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            obj = tVar.f19832a;
        }
        if ((i5 & 2) != 0) {
            j5 = tVar.f19833b;
        }
        return tVar.c(obj, j5);
    }

    public final T a() {
        return this.f19832a;
    }

    public final long b() {
        return this.f19833b;
    }

    @p4.l
    public final t<T> c(T t5, long j5) {
        return new t<>(t5, j5, null);
    }

    public final long e() {
        return this.f19833b;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return l0.g(this.f19832a, tVar.f19832a) && e.r(this.f19833b, tVar.f19833b);
    }

    public final T f() {
        return this.f19832a;
    }

    public int hashCode() {
        T t5 = this.f19832a;
        return ((t5 == null ? 0 : t5.hashCode()) * 31) + e.Z(this.f19833b);
    }

    @p4.l
    public String toString() {
        return "TimedValue(value=" + this.f19832a + ", duration=" + ((Object) e.u0(this.f19833b)) + ')';
    }
}
