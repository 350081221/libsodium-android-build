package com.yuanqi.master.tools;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/yuanqi/master/tools/DisabledInteractionSource;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "()V", "interactions", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/foundation/interaction/Interaction;", "getInteractions", "()Lkotlinx/coroutines/flow/Flow;", "emit", "", "interaction", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryEmit", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisabledInteractionSource implements MutableInteractionSource {

    /* renamed from: b, reason: collision with root package name */
    public static final int f15037b = 0;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final kotlinx.coroutines.flow.i<Interaction> f15038a = kotlinx.coroutines.flow.k.n0();

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    @p4.m
    public Object emit(@p4.l Interaction interaction, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return r2.f19517a;
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    @p4.l
    public kotlinx.coroutines.flow.i<Interaction> getInteractions() {
        return this.f15038a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean tryEmit(@p4.l Interaction interaction) {
        kotlin.jvm.internal.l0.p(interaction, "interaction");
        return true;
    }
}
