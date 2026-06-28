package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/RangeSliderLogic;", "", "", "draggingStart", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "activeInteraction", "", "eventX", "", "compareOffsets", "posX", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Lkotlinx/coroutines/s0;", "scope", "Lkotlin/r2;", "captureThumb", "Landroidx/compose/material3/RangeSliderState;", "state", "Landroidx/compose/material3/RangeSliderState;", "getState", "()Landroidx/compose/material3/RangeSliderState;", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getStartInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "getEndInteractionSource", "<init>", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RangeSliderLogic {

    @p4.l
    private final MutableInteractionSource endInteractionSource;

    @p4.l
    private final MutableInteractionSource startInteractionSource;

    @p4.l
    private final RangeSliderState state;

    public RangeSliderLogic(@p4.l RangeSliderState rangeSliderState, @p4.l MutableInteractionSource mutableInteractionSource, @p4.l MutableInteractionSource mutableInteractionSource2) {
        this.state = rangeSliderState;
        this.startInteractionSource = mutableInteractionSource;
        this.endInteractionSource = mutableInteractionSource2;
    }

    @p4.l
    public final MutableInteractionSource activeInteraction(boolean z4) {
        return z4 ? this.startInteractionSource : this.endInteractionSource;
    }

    public final void captureThumb(boolean z4, float f5, @p4.l Interaction interaction, @p4.l s0 s0Var) {
        float rawOffsetEnd$material3_release;
        RangeSliderState rangeSliderState = this.state;
        if (z4) {
            rawOffsetEnd$material3_release = rangeSliderState.getRawOffsetStart$material3_release();
        } else {
            rawOffsetEnd$material3_release = rangeSliderState.getRawOffsetEnd$material3_release();
        }
        rangeSliderState.onDrag$material3_release(z4, f5 - rawOffsetEnd$material3_release);
        kotlinx.coroutines.k.f(s0Var, null, null, new RangeSliderLogic$captureThumb$1(this, z4, interaction, null), 3, null);
    }

    public final int compareOffsets(float f5) {
        return Float.compare(Math.abs(this.state.getRawOffsetStart$material3_release() - f5), Math.abs(this.state.getRawOffsetEnd$material3_release() - f5));
    }

    @p4.l
    public final MutableInteractionSource getEndInteractionSource() {
        return this.endInteractionSource;
    }

    @p4.l
    public final MutableInteractionSource getStartInteractionSource() {
        return this.startInteractionSource;
    }

    @p4.l
    public final RangeSliderState getState() {
        return this.state;
    }
}
