package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import kotlin.i0;
import p4.l;
import t0.b;

@Stable
@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0018\u0010\u0004\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/runtime/IntState;", "Landroidx/compose/runtime/MutableState;", "", "intValue", "getIntValue", "()I", "setIntValue", "(I)V", b.f22420d, "getValue", "()Ljava/lang/Integer;", "setValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MutableIntState extends IntState, MutableState<Integer> {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
        @l
        @Deprecated
        public static Integer getValue(@l MutableIntState mutableIntState) {
            return Integer.valueOf(MutableIntState.access$getValue$jd(mutableIntState));
        }

        @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
        @Deprecated
        public static void setValue(@l MutableIntState mutableIntState, int i5) {
            MutableIntState.super.setValue(i5);
        }
    }

    static /* synthetic */ int access$getValue$jd(MutableIntState mutableIntState) {
        return super.getValue().intValue();
    }

    @Override // androidx.compose.runtime.IntState
    int getIntValue();

    void setIntValue(int i5);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        setValue(num.intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
    @l
    default Integer getValue() {
        return Integer.valueOf(getIntValue());
    }

    @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
    default void setValue(int i5) {
        setIntValue(i5);
    }
}
