package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.flow.d0;
import kotlinx.coroutines.flow.k0;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/interaction/MutableInteractionSourceImpl;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Lkotlin/r2;", "emit", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "tryEmit", "Lkotlinx/coroutines/flow/d0;", "interactions", "Lkotlinx/coroutines/flow/d0;", "getInteractions", "()Lkotlinx/coroutines/flow/d0;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MutableInteractionSourceImpl implements MutableInteractionSource {

    @l
    private final d0<Interaction> interactions = k0.b(0, 16, i.DROP_OLDEST, 1, null);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    @m
    public Object emit(@l Interaction interaction, @l d<? super r2> dVar) {
        Object l5;
        Object emit = getInteractions().emit(interaction, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return emit == l5 ? emit : r2.f19517a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean tryEmit(@l Interaction interaction) {
        return getInteractions().b(interaction);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    @l
    public d0<Interaction> getInteractions() {
        return this.interactions;
    }
}
