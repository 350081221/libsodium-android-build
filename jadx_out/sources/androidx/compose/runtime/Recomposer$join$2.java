package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Recomposer$join$2 extends o implements p<Recomposer.State, d<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Recomposer$join$2(d<? super Recomposer$join$2> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(dVar);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l Recomposer.State state, @m d<? super Boolean> dVar) {
        return ((Recomposer$join$2) create(state, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        boolean z4;
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            if (((Recomposer.State) this.L$0) == Recomposer.State.ShutDown) {
                z4 = true;
            } else {
                z4 = false;
            }
            return b.a(z4);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
