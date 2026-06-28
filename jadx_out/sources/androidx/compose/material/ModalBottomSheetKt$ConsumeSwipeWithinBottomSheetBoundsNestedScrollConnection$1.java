package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import kotlin.i0;
import u3.h;

@i0(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0003H\u0003¢\u0006\u0004\b\n\u0010\bJ\"\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"androidx/compose/material/ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "Landroidx/compose/ui/geometry/Offset;", "toOffset", "(F)J", "Landroidx/compose/ui/unit/Velocity;", "velocityToFloat", "(J)F", "toFloat", "offsetToFloat", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "onPostFling", "material_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ AnchoredDraggableState<?> $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        this.$state = anchoredDraggableState;
        this.$orientation = orientation;
    }

    @h(name = "offsetToFloat")
    private final float offsetToFloat(long j5) {
        return this.$orientation == Orientation.Horizontal ? Offset.m3493getXimpl(j5) : Offset.m3494getYimpl(j5);
    }

    private final long toOffset(float f5) {
        float f6;
        Orientation orientation = this.$orientation;
        if (orientation == Orientation.Horizontal) {
            f6 = f5;
        } else {
            f6 = 0.0f;
        }
        if (orientation != Orientation.Vertical) {
            f5 = 0.0f;
        }
        return OffsetKt.Offset(f6, f5);
    }

    @h(name = "velocityToFloat")
    private final float velocityToFloat(long j5) {
        return this.$orientation == Orientation.Horizontal ? Velocity.m6279getXimpl(j5) : Velocity.m6280getYimpl(j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @p4.m
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo390onPostFlingRZ2iAVY(long r3, long r5, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.unit.Velocity> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.label = r4
            goto L18
        L13:
            androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.b.l()
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r5 = r3.J$0
            kotlin.e1.n(r4)
            goto L47
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            kotlin.e1.n(r4)
            androidx.compose.material.AnchoredDraggableState<?> r4 = r2.$state
            float r0 = r2.velocityToFloat(r5)
            r3.J$0 = r5
            r3.label = r1
            java.lang.Object r3 = r4.settle(r0, r3)
            if (r3 != r7) goto L47
            return r7
        L47:
            androidx.compose.ui.unit.Velocity r3 = androidx.compose.ui.unit.Velocity.m6270boximpl(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.mo390onPostFlingRZ2iAVY(long, long, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo391onPostScrollDzOQY0M(long j5, long j6, int i5) {
        if (NestedScrollSource.m4761equalsimpl0(i5, NestedScrollSource.Companion.m4766getDragWNlRxjI())) {
            return toOffset(this.$state.dispatchRawDelta(offsetToFloat(j6)));
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
    public java.lang.Object mo632onPreFlingQWom1Mo(long r6, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.unit.Velocity> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r6 = r0.J$0
            kotlin.e1.n(r8)
            goto L66
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.e1.n(r8)
            float r8 = r5.velocityToFloat(r6)
            androidx.compose.material.AnchoredDraggableState<?> r2 = r5.$state
            float r2 = r2.requireOffset()
            r4 = 0
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L60
            androidx.compose.material.AnchoredDraggableState<?> r4 = r5.$state
            androidx.compose.material.DraggableAnchors r4 = r4.getAnchors()
            float r4 = r4.minAnchor()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L60
            androidx.compose.material.AnchoredDraggableState<?> r2 = r5.$state
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r8 = r2.settle(r8, r0)
            if (r8 != r1) goto L66
            return r1
        L60:
            androidx.compose.ui.unit.Velocity$Companion r6 = androidx.compose.ui.unit.Velocity.Companion
            long r6 = r6.m6290getZero9UxMQ8M()
        L66:
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.m6270boximpl(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.mo632onPreFlingQWom1Mo(long, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo392onPreScrollOzD1aCk(long j5, int i5) {
        float offsetToFloat = offsetToFloat(j5);
        if (offsetToFloat < 0.0f && NestedScrollSource.m4761equalsimpl0(i5, NestedScrollSource.Companion.m4766getDragWNlRxjI())) {
            return toOffset(this.$state.dispatchRawDelta(offsetToFloat));
        }
        return Offset.Companion.m3509getZeroF1C5BW0();
    }
}
