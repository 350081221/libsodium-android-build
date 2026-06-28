package androidx.compose.material3;

import androidx.annotation.IntRange;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.t0;

@ExperimentalMaterial3Api
@Stable
@kotlin.i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010k\u001a\u00020\u0002\u0012\b\b\u0003\u0010!\u001a\u00020\u0017\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010%\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*¢\u0006\u0004\bn\u0010oJ \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002JA\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R+\u00106\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R0\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010?\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR+\u0010H\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010$\"\u0004\bF\u0010GR\"\u0010J\u001a\u00020I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR+\u0010S\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bP\u00101\u001a\u0004\bQ\u00103\"\u0004\bR\u00105R+\u0010X\u001a\u00020I2\u0006\u0010/\u001a\u00020I8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010M\"\u0004\bW\u0010OR \u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u0010'\u001a\u0004\bZ\u0010)R+\u0010^\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b[\u00101\u001a\u0004\b\\\u00103\"\u0004\b]\u00105R+\u0010b\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b_\u00101\u001a\u0004\b`\u00103\"\u0004\ba\u00105R\u0014\u0010c\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR$\u0010k\u001a\u00020\u00022\u0006\u0010h\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u00103\"\u0004\bj\u00105R\u0014\u0010m\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bl\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006p"}, d2 = {"Landroidx/compose/material3/SliderState;", "Landroidx/compose/foundation/gestures/DraggableState;", "", "minPx", "maxPx", TypedValues.CycleType.S_WAVE_OFFSET, "scaleToUserValue", "userValue", "scaleToOffset", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "newThumbWidth", "", "newTotalWidth", "updateDimensions$material3_release", "(FI)V", "updateDimensions", "Landroidx/compose/ui/geometry/Offset;", "pos", "onPress-k-4lQ0M$material3_release", "(J)V", "onPress", "steps", "I", "getSteps", "()I", "Lkotlin/Function0;", "onValueChangeFinished", "Lv3/a;", "getOnValueChangeFinished", "()Lv3/a;", "Lkotlin/ranges/f;", "valueRange", "Lkotlin/ranges/f;", "getValueRange", "()Lkotlin/ranges/f;", "<set-?>", "valueState$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getValueState", "()F", "setValueState", "(F)V", "valueState", "Lkotlin/Function1;", "onValueChange", "Lv3/l;", "getOnValueChange$material3_release", "()Lv3/l;", "setOnValueChange$material3_release", "(Lv3/l;)V", "", "tickFractions", "[F", "getTickFractions$material3_release", "()[F", "totalWidth$delegate", "Landroidx/compose/runtime/MutableIntState;", "getTotalWidth", "setTotalWidth", "(I)V", "totalWidth", "", "isRtl", "Z", "isRtl$material3_release", "()Z", "setRtl$material3_release", "(Z)V", "thumbWidth$delegate", "getThumbWidth", "setThumbWidth", "thumbWidth", "isDragging$delegate", "Landroidx/compose/runtime/MutableState;", "isDragging$material3_release", "setDragging", "isDragging", "gestureEndAction", "getGestureEndAction$material3_release", "rawOffset$delegate", "getRawOffset", "setRawOffset", "rawOffset", "pressOffset$delegate", "getPressOffset", "setPressOffset", "pressOffset", "dragScope", "Landroidx/compose/foundation/gestures/DragScope;", "Landroidx/compose/foundation/MutatorMutex;", "scrollMutex", "Landroidx/compose/foundation/MutatorMutex;", "newVal", "getValue", "setValue", t0.b.f22420d, "getCoercedValueAsFraction$material3_release", "coercedValueAsFraction", "<init>", "(FILv3/a;Lkotlin/ranges/f;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2151:1\n76#2:2152\n109#2,2:2153\n76#2:2159\n109#2,2:2160\n76#2:2165\n109#2,2:2166\n76#2:2168\n109#2,2:2169\n1#3:2155\n75#4:2156\n108#4,2:2157\n81#5:2162\n107#5,2:2163\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderState\n*L\n1796#1:2152\n1796#1:2153,2\n1848#1:2159\n1848#1:2160,2\n1880#1:2165\n1880#1:2166,2\n1881#1:2168\n1881#1:2169,2\n1846#1:2156\n1846#1:2157,2\n1857#1:2162\n1857#1:2163,2\n*E\n"})
/* loaded from: classes.dex */
public final class SliderState implements DraggableState {
    public static final int $stable = 0;

    @p4.l
    private final DragScope dragScope;

    @p4.l
    private final v3.a<r2> gestureEndAction;

    @p4.l
    private final MutableState isDragging$delegate;
    private boolean isRtl;

    @p4.m
    private v3.l<? super Float, r2> onValueChange;

    @p4.m
    private final v3.a<r2> onValueChangeFinished;

    @p4.l
    private final MutableFloatState pressOffset$delegate;

    @p4.l
    private final MutableFloatState rawOffset$delegate;

    @p4.l
    private final MutatorMutex scrollMutex;
    private final int steps;

    @p4.l
    private final MutableFloatState thumbWidth$delegate;

    @p4.l
    private final float[] tickFractions;

    @p4.l
    private final MutableIntState totalWidth$delegate;

    @p4.l
    private final kotlin.ranges.f<Float> valueRange;

    @p4.l
    private final MutableFloatState valueState$delegate;

    public SliderState() {
        this(0.0f, 0, null, null, 15, null);
    }

    public SliderState(float f5, @IntRange(from = 0) int i5, @p4.m v3.a<r2> aVar, @p4.l kotlin.ranges.f<Float> fVar) {
        float[] stepsToTickFractions;
        MutableState mutableStateOf$default;
        this.steps = i5;
        this.onValueChangeFinished = aVar;
        this.valueRange = fVar;
        this.valueState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f5);
        stepsToTickFractions = SliderKt.stepsToTickFractions(i5);
        this.tickFractions = stepsToTickFractions;
        this.totalWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.thumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isDragging$delegate = mutableStateOf$default;
        this.gestureEndAction = new SliderState$gestureEndAction$1(this);
        this.rawOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(scaleToOffset(0.0f, 0.0f, f5));
        this.pressOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragScope = new DragScope() { // from class: androidx.compose.material3.SliderState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f6) {
                SliderState.this.dispatchRawDelta(f6);
            }
        };
        this.scrollMutex = new MutatorMutex();
    }

    private final float getPressOffset() {
        return this.pressOffset$delegate.getFloatValue();
    }

    private final float getRawOffset() {
        return this.rawOffset$delegate.getFloatValue();
    }

    private final float getThumbWidth() {
        return this.thumbWidth$delegate.getFloatValue();
    }

    private final int getTotalWidth() {
        return this.totalWidth$delegate.getIntValue();
    }

    private final float getValueState() {
        return this.valueState$delegate.getFloatValue();
    }

    private final float scaleToOffset(float f5, float f6, float f7) {
        float scale;
        scale = SliderKt.scale(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), f7, f5, f6);
        return scale;
    }

    private final float scaleToUserValue(float f5, float f6, float f7) {
        float scale;
        scale = SliderKt.scale(f5, f6, f7, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragging(boolean z4) {
        this.isDragging$delegate.setValue(Boolean.valueOf(z4));
    }

    private final void setPressOffset(float f5) {
        this.pressOffset$delegate.setFloatValue(f5);
    }

    private final void setRawOffset(float f5) {
        this.rawOffset$delegate.setFloatValue(f5);
    }

    private final void setThumbWidth(float f5) {
        this.thumbWidth$delegate.setFloatValue(f5);
    }

    private final void setTotalWidth(int i5) {
        this.totalWidth$delegate.setIntValue(i5);
    }

    private final void setValueState(float f5) {
        this.valueState$delegate.setFloatValue(f5);
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f5) {
        float snapValueToTick;
        boolean z4;
        float f6 = 2;
        float max = Math.max(getTotalWidth() - (getThumbWidth() / f6), 0.0f);
        float min = Math.min(getThumbWidth() / f6, max);
        setRawOffset(getRawOffset() + f5 + getPressOffset());
        setPressOffset(0.0f);
        snapValueToTick = SliderKt.snapValueToTick(getRawOffset(), this.tickFractions, min, max);
        float scaleToUserValue = scaleToUserValue(min, max, snapValueToTick);
        if (scaleToUserValue == getValue()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            v3.l<? super Float, r2> lVar = this.onValueChange;
            if (lVar != null) {
                if (lVar != null) {
                    lVar.invoke(Float.valueOf(scaleToUserValue));
                    return;
                }
                return;
            }
            setValue(scaleToUserValue);
        }
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    @p4.m
    public Object drag(@p4.l MutatePriority mutatePriority, @p4.l v3.p<? super DragScope, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object g5 = t0.g(new SliderState$drag$2(this, mutatePriority, pVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return g5 == l5 ? g5 : r2.f19517a;
    }

    public final float getCoercedValueAsFraction$material3_release() {
        float H;
        float calcFraction;
        float floatValue = this.valueRange.getStart().floatValue();
        float floatValue2 = this.valueRange.getEndInclusive().floatValue();
        H = kotlin.ranges.u.H(getValue(), this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
        calcFraction = SliderKt.calcFraction(floatValue, floatValue2, H);
        return calcFraction;
    }

    @p4.l
    public final v3.a<r2> getGestureEndAction$material3_release() {
        return this.gestureEndAction;
    }

    @p4.m
    public final v3.l<Float, r2> getOnValueChange$material3_release() {
        return this.onValueChange;
    }

    @p4.m
    public final v3.a<r2> getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public final int getSteps() {
        return this.steps;
    }

    @p4.l
    public final float[] getTickFractions$material3_release() {
        return this.tickFractions;
    }

    public final float getValue() {
        return getValueState();
    }

    @p4.l
    public final kotlin.ranges.f<Float> getValueRange() {
        return this.valueRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging$material3_release() {
        return ((Boolean) this.isDragging$delegate.getValue()).booleanValue();
    }

    public final boolean isRtl$material3_release() {
        return this.isRtl;
    }

    /* renamed from: onPress-k-4lQ0M$material3_release, reason: not valid java name */
    public final void m2217onPressk4lQ0M$material3_release(long j5) {
        float m3493getXimpl;
        if (this.isRtl) {
            m3493getXimpl = getTotalWidth() - Offset.m3493getXimpl(j5);
        } else {
            m3493getXimpl = Offset.m3493getXimpl(j5);
        }
        setPressOffset(m3493getXimpl - getRawOffset());
    }

    public final void setOnValueChange$material3_release(@p4.m v3.l<? super Float, r2> lVar) {
        this.onValueChange = lVar;
    }

    public final void setRtl$material3_release(boolean z4) {
        this.isRtl = z4;
    }

    public final void setValue(float f5) {
        float H;
        float snapValueToTick;
        H = kotlin.ranges.u.H(f5, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
        snapValueToTick = SliderKt.snapValueToTick(H, this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
        setValueState(snapValueToTick);
    }

    public final void updateDimensions$material3_release(float f5, int i5) {
        setThumbWidth(f5);
        setTotalWidth(i5);
    }

    public /* synthetic */ SliderState(float f5, int i5, v3.a aVar, kotlin.ranges.f fVar, int i6, kotlin.jvm.internal.w wVar) {
        this((i6 & 1) != 0 ? 0.0f : f5, (i6 & 2) != 0 ? 0 : i5, (i6 & 4) != 0 ? null : aVar, (i6 & 8) != 0 ? kotlin.ranges.t.e(0.0f, 1.0f) : fVar);
    }
}
