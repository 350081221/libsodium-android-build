package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
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
@f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", f = "Draggable.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DraggableKt$draggable$5 extends o implements q<s0, Velocity, d<? super r2>, Object> {
    final /* synthetic */ q<s0, Float, d<? super r2>, Object> $onDragStopped;
    final /* synthetic */ Orientation $orientation;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraggableKt$draggable$5(q<? super s0, ? super Float, ? super d<? super r2>, ? extends Object> qVar, Orientation orientation, d<? super DraggableKt$draggable$5> dVar) {
        super(3, dVar);
        this.$onDragStopped = qVar;
        this.$orientation = orientation;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, Velocity velocity, d<? super r2> dVar) {
        return m363invokeLuvzFrg(s0Var, velocity.m6288unboximpl(), dVar);
    }

    @m
    /* renamed from: invoke-LuvzFrg, reason: not valid java name */
    public final Object m363invokeLuvzFrg(@l s0 s0Var, long j5, @m d<? super r2> dVar) {
        DraggableKt$draggable$5 draggableKt$draggable$5 = new DraggableKt$draggable$5(this.$onDragStopped, this.$orientation, dVar);
        draggableKt$draggable$5.L$0 = s0Var;
        draggableKt$draggable$5.J$0 = j5;
        return draggableKt$draggable$5.invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        float m360toFloatsFctU;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            s0 s0Var = (s0) this.L$0;
            long j5 = this.J$0;
            q<s0, Float, d<? super r2>, Object> qVar = this.$onDragStopped;
            m360toFloatsFctU = DraggableKt.m360toFloatsFctU(j5, this.$orientation);
            Float e5 = b.e(m360toFloatsFctU);
            this.label = 1;
            if (qVar.invoke(s0Var, e5, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
