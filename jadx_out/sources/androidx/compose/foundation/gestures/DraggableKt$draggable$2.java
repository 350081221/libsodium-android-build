package androidx.compose.foundation.gestures;

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

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DraggableKt$draggable$2 extends o implements q<s0, Float, d<? super r2>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DraggableKt$draggable$2(d<? super DraggableKt$draggable$2> dVar) {
        super(3, dVar);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, Float f5, d<? super r2> dVar) {
        return invoke(s0Var, f5.floatValue(), dVar);
    }

    @m
    public final Object invoke(@l s0 s0Var, float f5, @m d<? super r2> dVar) {
        return new DraggableKt$draggable$2(dVar).invokeSuspend(r2.f19517a);
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
