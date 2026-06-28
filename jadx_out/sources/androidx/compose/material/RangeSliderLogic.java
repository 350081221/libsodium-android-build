package androidx.compose.material;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017\u0012\u001e\u0010\u001f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u001e0\u0017¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR/\u0010\u001f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u001e0\u00178\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b¨\u0006#"}, d2 = {"Landroidx/compose/material/RangeSliderLogic;", "", "", "draggingStart", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "activeInteraction", "", "eventX", "", "compareOffsets", "posX", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Lkotlinx/coroutines/s0;", "scope", "Lkotlin/r2;", "captureThumb", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getStartInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "getEndInteractionSource", "Landroidx/compose/runtime/State;", "rawOffsetStart", "Landroidx/compose/runtime/State;", "getRawOffsetStart", "()Landroidx/compose/runtime/State;", "rawOffsetEnd", "getRawOffsetEnd", "Lkotlin/Function2;", "onDrag", "getOnDrag", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "material_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RangeSliderLogic {

    @l
    private final MutableInteractionSource endInteractionSource;

    @l
    private final State<p<Boolean, Float, r2>> onDrag;

    @l
    private final State<Float> rawOffsetEnd;

    @l
    private final State<Float> rawOffsetStart;

    @l
    private final MutableInteractionSource startInteractionSource;

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSliderLogic(@l MutableInteractionSource mutableInteractionSource, @l MutableInteractionSource mutableInteractionSource2, @l State<Float> state, @l State<Float> state2, @l State<? extends p<? super Boolean, ? super Float, r2>> state3) {
        this.startInteractionSource = mutableInteractionSource;
        this.endInteractionSource = mutableInteractionSource2;
        this.rawOffsetStart = state;
        this.rawOffsetEnd = state2;
        this.onDrag = state3;
    }

    @l
    public final MutableInteractionSource activeInteraction(boolean z4) {
        return z4 ? this.startInteractionSource : this.endInteractionSource;
    }

    public final void captureThumb(boolean z4, float f5, @l Interaction interaction, @l s0 s0Var) {
        State<Float> state;
        p<Boolean, Float, r2> value = this.onDrag.getValue();
        Boolean valueOf = Boolean.valueOf(z4);
        if (z4) {
            state = this.rawOffsetStart;
        } else {
            state = this.rawOffsetEnd;
        }
        value.invoke(valueOf, Float.valueOf(f5 - state.getValue().floatValue()));
        k.f(s0Var, null, null, new RangeSliderLogic$captureThumb$1(this, z4, interaction, null), 3, null);
    }

    public final int compareOffsets(float f5) {
        return Float.compare(Math.abs(this.rawOffsetStart.getValue().floatValue() - f5), Math.abs(this.rawOffsetEnd.getValue().floatValue() - f5));
    }

    @l
    public final MutableInteractionSource getEndInteractionSource() {
        return this.endInteractionSource;
    }

    @l
    public final State<p<Boolean, Float, r2>> getOnDrag() {
        return this.onDrag;
    }

    @l
    public final State<Float> getRawOffsetEnd() {
        return this.rawOffsetEnd;
    }

    @l
    public final State<Float> getRawOffsetStart() {
        return this.rawOffsetStart;
    }

    @l
    public final MutableInteractionSource getStartInteractionSource() {
        return this.startInteractionSource;
    }
}
