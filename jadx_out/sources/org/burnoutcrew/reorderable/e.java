package org.burnoutcrew.reorderable;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lorg/burnoutcrew/reorderable/e;", "Lorg/burnoutcrew/reorderable/b;", "Lorg/burnoutcrew/reorderable/d;", "position", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/r2;", bi.ay, "(Lorg/burnoutcrew/reorderable/d;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lorg/burnoutcrew/reorderable/d;", "getPosition", "()Lorg/burnoutcrew/reorderable/d;", "b", "J", "()J", "<init>", "()V", "reorderable"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public final class e implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21100c = 8;

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private final d f21101a;

    /* renamed from: b, reason: collision with root package name */
    private final long f21102b = Offset.Companion.m3509getZeroF1C5BW0();

    @Override // org.burnoutcrew.reorderable.b
    @p4.m
    public Object a(@p4.l d dVar, long j5, @p4.l kotlin.coroutines.d<? super r2> dVar2) {
        return r2.f19517a;
    }

    @Override // org.burnoutcrew.reorderable.b
    public long b() {
        return this.f21102b;
    }

    @Override // org.burnoutcrew.reorderable.b
    @p4.m
    public d getPosition() {
        return this.f21101a;
    }
}
