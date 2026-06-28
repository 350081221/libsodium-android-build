package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "it", "Lkotlin/r2;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Draggable2DKt$rememberDraggable2DState$1$1 extends n0 implements l<Offset, r2> {
    final /* synthetic */ State<l<Offset, r2>> $onDeltaState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Draggable2DKt$rememberDraggable2DState$1$1(State<? extends l<? super Offset, r2>> state) {
        super(1);
        this.$onDeltaState = state;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Offset offset) {
        m352invokek4lQ0M(offset.m3503unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m352invokek4lQ0M(long j5) {
        this.$onDeltaState.getValue().invoke(Offset.m3482boximpl(j5));
    }
}
