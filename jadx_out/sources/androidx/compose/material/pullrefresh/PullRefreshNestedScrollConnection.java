package androidx.compose.material.pullrefresh;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.coroutines.d;
import kotlin.i0;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001Be\u0012!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00120\u0011\u00121\u0010\u001c\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\"\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR/\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R?\u0010\u001c\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "onPreFling", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "pullDelta", "onPull", "Lv3/l;", "Lkotlin/Function2;", "flingVelocity", "Lkotlin/coroutines/d;", "", "onRelease", "Lv3/p;", "", "enabled", "Z", "<init>", "(Lv3/l;Lv3/p;Z)V", "material_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PullRefreshNestedScrollConnection implements NestedScrollConnection {
    private final boolean enabled;

    @l
    private final v3.l<Float, Float> onPull;

    @l
    private final p<Float, d<? super Float>, Object> onRelease;

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshNestedScrollConnection(@l v3.l<? super Float, Float> lVar, @l p<? super Float, ? super d<? super Float>, ? extends Object> pVar, boolean z4) {
        this.onPull = lVar;
        this.onRelease = pVar;
        this.enabled = z4;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo391onPostScrollDzOQY0M(long j5, long j6, int i5) {
        if (!this.enabled) {
            return Offset.Companion.m3509getZeroF1C5BW0();
        }
        if (NestedScrollSource.m4761equalsimpl0(i5, NestedScrollSource.Companion.m4766getDragWNlRxjI()) && Offset.m3494getYimpl(j6) > 0.0f) {
            return OffsetKt.Offset(0.0f, this.onPull.invoke(Float.valueOf(Offset.m3494getYimpl(j6))).floatValue());
        }
        return Offset.Companion.m3509getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @p4.m
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo632onPreFlingQWom1Mo(long r5, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.unit.Velocity> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = (androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = new androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            float r5 = r0.F$0
            kotlin.e1.n(r7)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.e1.n(r7)
            v3.p<java.lang.Float, kotlin.coroutines.d<? super java.lang.Float>, java.lang.Object> r7 = r4.onRelease
            float r5 = androidx.compose.ui.unit.Velocity.m6280getYimpl(r5)
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.e(r5)
            r6 = 0
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r5, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r5 = r6
        L4d:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = androidx.compose.ui.unit.VelocityKt.Velocity(r5, r6)
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.m6270boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection.mo632onPreFlingQWom1Mo(long, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo392onPreScrollOzD1aCk(long j5, int i5) {
        if (!this.enabled) {
            return Offset.Companion.m3509getZeroF1C5BW0();
        }
        if (NestedScrollSource.m4761equalsimpl0(i5, NestedScrollSource.Companion.m4766getDragWNlRxjI()) && Offset.m3494getYimpl(j5) < 0.0f) {
            return OffsetKt.Offset(0.0f, this.onPull.invoke(Float.valueOf(Offset.m3494getYimpl(j5))).floatValue());
        }
        return Offset.Companion.m3509getZeroF1C5BW0();
    }
}
