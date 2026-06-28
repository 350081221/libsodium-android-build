package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import kotlin.i0;
import p4.l;
import t0.b;

@Stable
@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0018\u0010\u0004\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MutableFloatState;", "Landroidx/compose/runtime/FloatState;", "Landroidx/compose/runtime/MutableState;", "", "floatValue", "getFloatValue", "()F", "setFloatValue", "(F)V", b.f22420d, "getValue", "()Ljava/lang/Float;", "setValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MutableFloatState extends FloatState, MutableState<Float> {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
        @l
        @Deprecated
        public static Float getValue(@l MutableFloatState mutableFloatState) {
            return Float.valueOf(MutableFloatState.access$getValue$jd(mutableFloatState));
        }

        @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
        @Deprecated
        public static void setValue(@l MutableFloatState mutableFloatState, float f5) {
            MutableFloatState.super.setValue(f5);
        }
    }

    static /* synthetic */ float access$getValue$jd(MutableFloatState mutableFloatState) {
        return super.getValue().floatValue();
    }

    @Override // androidx.compose.runtime.FloatState
    float getFloatValue();

    void setFloatValue(float f5);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Float f5) {
        setValue(f5.floatValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    @l
    default Float getValue() {
        return Float.valueOf(getFloatValue());
    }

    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    default void setValue(float f5) {
        setFloatValue(f5);
    }
}
