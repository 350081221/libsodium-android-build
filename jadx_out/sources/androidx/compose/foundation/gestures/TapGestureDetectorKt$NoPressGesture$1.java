package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.q;

@f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TapGestureDetectorKt$NoPressGesture$1 extends o implements q<PressGestureScope, Offset, d<? super r2>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TapGestureDetectorKt$NoPressGesture$1(d<? super TapGestureDetectorKt$NoPressGesture$1> dVar) {
        super(3, dVar);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, d<? super r2> dVar) {
        return m407invoked4ec7I(pressGestureScope, offset.m3503unboximpl(), dVar);
    }

    @m
    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m407invoked4ec7I(@l PressGestureScope pressGestureScope, long j5, @m d<? super r2> dVar) {
        return new TapGestureDetectorKt$NoPressGesture$1(dVar).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
