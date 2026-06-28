package androidx.compose.runtime;

import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/ProduceStateScope;", "T", "Landroidx/compose/runtime/MutableState;", "Lkotlinx/coroutines/s0;", "Lkotlin/Function0;", "Lkotlin/r2;", "onDispose", "", "awaitDispose", "(Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface ProduceStateScope<T> extends MutableState<T>, s0 {
    @m
    Object awaitDispose(@l v3.a<r2> aVar, @l d<?> dVar);
}
