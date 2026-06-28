package org.burnoutcrew.reorderable;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001e\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0003\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lorg/burnoutcrew/reorderable/n;", "", "Landroidx/compose/ui/input/pointer/PointerId;", bi.ay, "()J", "Landroidx/compose/ui/geometry/Offset;", "b", "()Landroidx/compose/ui/geometry/Offset;", "id", TypedValues.CycleType.S_WAVE_OFFSET, "c", "(JLandroidx/compose/ui/geometry/Offset;)Lorg/burnoutcrew/reorderable/n;", "", "toString", "", TTDownloadField.TT_HASHCODE, "other", "", "equals", "J", "e", "Landroidx/compose/ui/geometry/Offset;", "f", "<init>", "(JLandroidx/compose/ui/geometry/Offset;Lkotlin/jvm/internal/w;)V", "reorderable"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final long f21132a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private final Offset f21133b;

    private n(long j5, Offset offset) {
        this.f21132a = j5;
        this.f21133b = offset;
    }

    public /* synthetic */ n(long j5, Offset offset, w wVar) {
        this(j5, offset);
    }

    public static /* synthetic */ n d(n nVar, long j5, Offset offset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = nVar.f21132a;
        }
        if ((i5 & 2) != 0) {
            offset = nVar.f21133b;
        }
        return nVar.c(j5, offset);
    }

    public final long a() {
        return this.f21132a;
    }

    @p4.m
    public final Offset b() {
        return this.f21133b;
    }

    @p4.l
    public final n c(long j5, @p4.m Offset offset) {
        return new n(j5, offset, null);
    }

    public final long e() {
        return this.f21132a;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return PointerId.m4854equalsimpl0(this.f21132a, nVar.f21132a) && l0.g(this.f21133b, nVar.f21133b);
    }

    @p4.m
    public final Offset f() {
        return this.f21133b;
    }

    public int hashCode() {
        int m4855hashCodeimpl = PointerId.m4855hashCodeimpl(this.f21132a) * 31;
        Offset offset = this.f21133b;
        return m4855hashCodeimpl + (offset == null ? 0 : Offset.m3495hashCodeimpl(offset.m3503unboximpl()));
    }

    @p4.l
    public String toString() {
        return "StartDrag(id=" + ((Object) PointerId.m4856toStringimpl(this.f21132a)) + ", offset=" + this.f21133b + ')';
    }

    public /* synthetic */ n(long j5, Offset offset, int i5, w wVar) {
        this(j5, (i5 & 2) != 0 ? null : offset, null);
    }
}
