package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.q;

@f(c = "androidx.compose.foundation.gestures.Draggable2DKt$draggable2D$2", f = "Draggable2D.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Landroidx/compose/ui/unit/Velocity;", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Draggable2DKt$draggable2D$2 extends o implements q<s0, Velocity, d<? super r2>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Draggable2DKt$draggable2D$2(d<? super Draggable2DKt$draggable2D$2> dVar) {
        super(3, dVar);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, Velocity velocity, d<? super r2> dVar) {
        return m351invokeLuvzFrg(s0Var, velocity.m6288unboximpl(), dVar);
    }

    @m
    /* renamed from: invoke-LuvzFrg, reason: not valid java name */
    public final Object m351invokeLuvzFrg(@l s0 s0Var, long j5, @m d<? super r2> dVar) {
        return new Draggable2DKt$draggable2D$2(dVar).invokeSuspend(r2.f19517a);
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
