package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Lkotlin/r2;", "emit", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "tryEmit", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface MutableInteractionSource extends InteractionSource {
    @m
    Object emit(@l Interaction interaction, @l d<? super r2> dVar);

    boolean tryEmit(@l Interaction interaction);
}
