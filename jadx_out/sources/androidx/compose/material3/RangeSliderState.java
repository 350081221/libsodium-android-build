package androidx.compose.material3;

import androidx.annotation.IntRange;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@ExperimentalMaterial3Api
@Stable
@kotlin.i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b;\b\u0007\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010d\u001a\u00020\u0002\u0012\b\b\u0002\u0010g\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0015\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001a\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f¢\u0006\u0004\bp\u0010qJ*\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R+\u0010+\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R+\u0010/\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R0\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u0001008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00108\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R+\u0010?\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010&\u001a\u0004\b=\u0010(\"\u0004\b>\u0010*R+\u0010C\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010&\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*R+\u0010I\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00158@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010\u0019\"\u0004\bG\u0010HR+\u0010M\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010&\u001a\u0004\bK\u0010(\"\u0004\bL\u0010*R+\u0010Q\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010&\u001a\u0004\bO\u0010(\"\u0004\bP\u0010*R+\u0010X\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR&\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u00102\u001a\u0004\bZ\u00104R+\u0010\u0004\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010&\u001a\u0004\b\\\u0010(\"\u0004\b]\u0010*R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010&\u001a\u0004\b_\u0010(\"\u0004\b`\u0010*R$\u0010d\u001a\u00020\u00022\u0006\u0010a\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010(\"\u0004\bc\u0010*R$\u0010g\u001a\u00020\u00022\u0006\u0010a\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010(\"\u0004\bf\u0010*R\u0014\u0010i\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bh\u0010(R\u0014\u0010k\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bj\u0010(R\u0014\u0010m\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\u0019R\u0014\u0010o\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006r"}, d2 = {"Landroidx/compose/material3/RangeSliderState;", "", "", "minPx", "maxPx", "Landroidx/compose/material3/SliderRange;", TypedValues.CycleType.S_WAVE_OFFSET, "scaleToUserValue-owVgs5E", "(FFJ)J", "scaleToUserValue", "userValue", "scaleToOffset", "", "isStart", "Lkotlin/r2;", "onDrag$material3_release", "(ZF)V", "onDrag", "updateMinMaxPx$material3_release", "()V", "updateMinMaxPx", "", "steps", "I", "getSteps", "()I", "Lkotlin/Function0;", "onValueChangeFinished", "Lv3/a;", "getOnValueChangeFinished", "()Lv3/a;", "Lkotlin/ranges/f;", "valueRange", "Lkotlin/ranges/f;", "getValueRange", "()Lkotlin/ranges/f;", "<set-?>", "activeRangeStartState$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getActiveRangeStartState", "()F", "setActiveRangeStartState", "(F)V", "activeRangeStartState", "activeRangeEndState$delegate", "getActiveRangeEndState", "setActiveRangeEndState", "activeRangeEndState", "Lkotlin/Function1;", "onValueChange", "Lv3/l;", "getOnValueChange$material3_release", "()Lv3/l;", "setOnValueChange$material3_release", "(Lv3/l;)V", "", "tickFractions", "[F", "getTickFractions$material3_release", "()[F", "startThumbWidth$delegate", "getStartThumbWidth$material3_release", "setStartThumbWidth$material3_release", "startThumbWidth", "endThumbWidth$delegate", "getEndThumbWidth$material3_release", "setEndThumbWidth$material3_release", "endThumbWidth", "totalWidth$delegate", "Landroidx/compose/runtime/MutableIntState;", "getTotalWidth$material3_release", "setTotalWidth$material3_release", "(I)V", "totalWidth", "rawOffsetStart$delegate", "getRawOffsetStart$material3_release", "setRawOffsetStart$material3_release", "rawOffsetStart", "rawOffsetEnd$delegate", "getRawOffsetEnd$material3_release", "setRawOffsetEnd$material3_release", "rawOffsetEnd", "isRtl$delegate", "Landroidx/compose/runtime/MutableState;", "isRtl$material3_release", "()Z", "setRtl$material3_release", "(Z)V", "isRtl", "gestureEndAction", "getGestureEndAction$material3_release", "maxPx$delegate", "getMaxPx", "setMaxPx", "minPx$delegate", "getMinPx", "setMinPx", "newVal", "getActiveRangeStart", "setActiveRangeStart", "activeRangeStart", "getActiveRangeEnd", "setActiveRangeEnd", "activeRangeEnd", "getCoercedActiveRangeStartAsFraction$material3_release", "coercedActiveRangeStartAsFraction", "getCoercedActiveRangeEndAsFraction$material3_release", "coercedActiveRangeEndAsFraction", "getStartSteps$material3_release", "startSteps", "getEndSteps$material3_release", "endSteps", "<init>", "(FFILv3/a;Lkotlin/ranges/f;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/RangeSliderState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2151:1\n76#2:2152\n109#2,2:2153\n76#2:2155\n109#2,2:2156\n76#2:2158\n109#2,2:2159\n76#2:2161\n109#2,2:2162\n76#2:2167\n109#2,2:2168\n76#2:2170\n109#2,2:2171\n76#2:2176\n109#2,2:2177\n76#2:2179\n109#2,2:2180\n75#3:2164\n108#3,2:2165\n81#4:2173\n107#4,2:2174\n1#5:2182\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/RangeSliderState\n*L\n1923#1:2152\n1923#1:2153,2\n1924#1:2155\n1924#1:2156,2\n1962#1:2158\n1962#1:2159,2\n1963#1:2161\n1963#1:2162,2\n1965#1:2167\n1965#1:2168,2\n1966#1:2170\n1966#1:2171,2\n1974#1:2176\n1974#1:2177,2\n1975#1:2179\n1975#1:2180,2\n1964#1:2164\n1964#1:2165,2\n1968#1:2173\n1968#1:2174,2\n*E\n"})
/* loaded from: classes.dex */
public final class RangeSliderState {
    public static final int $stable = 0;

    @p4.l
    private final MutableFloatState activeRangeEndState$delegate;

    @p4.l
    private final MutableFloatState activeRangeStartState$delegate;

    @p4.l
    private final MutableFloatState endThumbWidth$delegate;

    @p4.l
    private final v3.l<Boolean, r2> gestureEndAction;

    @p4.l
    private final MutableState isRtl$delegate;

    @p4.l
    private final MutableFloatState maxPx$delegate;

    @p4.l
    private final MutableFloatState minPx$delegate;

    @p4.m
    private v3.l<? super SliderRange, r2> onValueChange;

    @p4.m
    private final v3.a<r2> onValueChangeFinished;

    @p4.l
    private final MutableFloatState rawOffsetEnd$delegate;

    @p4.l
    private final MutableFloatState rawOffsetStart$delegate;

    @p4.l
    private final MutableFloatState startThumbWidth$delegate;
    private final int steps;

    @p4.l
    private final float[] tickFractions;

    @p4.l
    private final MutableIntState totalWidth$delegate;

    @p4.l
    private final kotlin.ranges.f<Float> valueRange;

    public RangeSliderState() {
        this(0.0f, 0.0f, 0, null, null, 31, null);
    }

    public RangeSliderState(float f5, float f6, @IntRange(from = 0) int i5, @p4.m v3.a<r2> aVar, @p4.l kotlin.ranges.f<Float> fVar) {
        float[] stepsToTickFractions;
        MutableState mutableStateOf$default;
        this.steps = i5;
        this.onValueChangeFinished = aVar;
        this.valueRange = fVar;
        this.activeRangeStartState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f5);
        this.activeRangeEndState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f6);
        stepsToTickFractions = SliderKt.stepsToTickFractions(i5);
        this.tickFractions = stepsToTickFractions;
        this.startThumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.endThumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.totalWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.rawOffsetStart$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.rawOffsetEnd$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isRtl$delegate = mutableStateOf$default;
        this.gestureEndAction = new RangeSliderState$gestureEndAction$1(this);
        this.maxPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.minPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    private final float getActiveRangeEndState() {
        return this.activeRangeEndState$delegate.getFloatValue();
    }

    private final float getActiveRangeStartState() {
        return this.activeRangeStartState$delegate.getFloatValue();
    }

    private final float getMaxPx() {
        return this.maxPx$delegate.getFloatValue();
    }

    private final float getMinPx() {
        return this.minPx$delegate.getFloatValue();
    }

    private final float scaleToOffset(float f5, float f6, float f7) {
        float scale;
        scale = SliderKt.scale(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), f7, f5, f6);
        return scale;
    }

    /* renamed from: scaleToUserValue-owVgs5E, reason: not valid java name */
    private final long m2099scaleToUserValueowVgs5E(float f5, float f6, long j5) {
        long m2202scaleziovWd0;
        m2202scaleziovWd0 = SliderKt.m2202scaleziovWd0(f5, f6, j5, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
        return m2202scaleziovWd0;
    }

    private final void setActiveRangeEndState(float f5) {
        this.activeRangeEndState$delegate.setFloatValue(f5);
    }

    private final void setActiveRangeStartState(float f5) {
        this.activeRangeStartState$delegate.setFloatValue(f5);
    }

    private final void setMaxPx(float f5) {
        this.maxPx$delegate.setFloatValue(f5);
    }

    private final void setMinPx(float f5) {
        this.minPx$delegate.setFloatValue(f5);
    }

    public final float getActiveRangeEnd() {
        return getActiveRangeEndState();
    }

    public final float getActiveRangeStart() {
        return getActiveRangeStartState();
    }

    public final float getCoercedActiveRangeEndAsFraction$material3_release() {
        float calcFraction;
        calcFraction = SliderKt.calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), getActiveRangeEnd());
        return calcFraction;
    }

    public final float getCoercedActiveRangeStartAsFraction$material3_release() {
        float calcFraction;
        calcFraction = SliderKt.calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), getActiveRangeStart());
        return calcFraction;
    }

    public final int getEndSteps$material3_release() {
        return (int) Math.floor(this.steps * (1.0f - getCoercedActiveRangeStartAsFraction$material3_release()));
    }

    public final float getEndThumbWidth$material3_release() {
        return this.endThumbWidth$delegate.getFloatValue();
    }

    @p4.l
    public final v3.l<Boolean, r2> getGestureEndAction$material3_release() {
        return this.gestureEndAction;
    }

    @p4.m
    public final v3.l<SliderRange, r2> getOnValueChange$material3_release() {
        return this.onValueChange;
    }

    @p4.m
    public final v3.a<r2> getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public final float getRawOffsetEnd$material3_release() {
        return this.rawOffsetEnd$delegate.getFloatValue();
    }

    public final float getRawOffsetStart$material3_release() {
        return this.rawOffsetStart$delegate.getFloatValue();
    }

    public final int getStartSteps$material3_release() {
        return (int) Math.floor(this.steps * getCoercedActiveRangeEndAsFraction$material3_release());
    }

    public final float getStartThumbWidth$material3_release() {
        return this.startThumbWidth$delegate.getFloatValue();
    }

    public final int getSteps() {
        return this.steps;
    }

    @p4.l
    public final float[] getTickFractions$material3_release() {
        return this.tickFractions;
    }

    public final int getTotalWidth$material3_release() {
        return this.totalWidth$delegate.getIntValue();
    }

    @p4.l
    public final kotlin.ranges.f<Float> getValueRange() {
        return this.valueRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRtl$material3_release() {
        return ((Boolean) this.isRtl$delegate.getValue()).booleanValue();
    }

    public final void onDrag$material3_release(boolean z4, float f5) {
        float H;
        float snapValueToTick;
        long SliderRange;
        float H2;
        float snapValueToTick2;
        if (z4) {
            setRawOffsetStart$material3_release(getRawOffsetStart$material3_release() + f5);
            setRawOffsetEnd$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
            float rawOffsetEnd$material3_release = getRawOffsetEnd$material3_release();
            H2 = kotlin.ranges.u.H(getRawOffsetStart$material3_release(), getMinPx(), rawOffsetEnd$material3_release);
            snapValueToTick2 = SliderKt.snapValueToTick(H2, this.tickFractions, getMinPx(), getMaxPx());
            SliderRange = SliderKt.SliderRange(snapValueToTick2, rawOffsetEnd$material3_release);
        } else {
            setRawOffsetEnd$material3_release(getRawOffsetEnd$material3_release() + f5);
            setRawOffsetStart$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
            float rawOffsetStart$material3_release = getRawOffsetStart$material3_release();
            H = kotlin.ranges.u.H(getRawOffsetEnd$material3_release(), rawOffsetStart$material3_release, getMaxPx());
            snapValueToTick = SliderKt.snapValueToTick(H, this.tickFractions, getMinPx(), getMaxPx());
            SliderRange = SliderKt.SliderRange(rawOffsetStart$material3_release, snapValueToTick);
        }
        long m2099scaleToUserValueowVgs5E = m2099scaleToUserValueowVgs5E(getMinPx(), getMaxPx(), SliderRange);
        if (!SliderRange.m2209equalsimpl0(m2099scaleToUserValueowVgs5E, SliderKt.SliderRange(getActiveRangeStart(), getActiveRangeEnd()))) {
            v3.l<? super SliderRange, r2> lVar = this.onValueChange;
            if (lVar != null) {
                if (lVar != null) {
                    lVar.invoke(SliderRange.m2206boximpl(m2099scaleToUserValueowVgs5E));
                }
            } else {
                setActiveRangeStart(SliderRange.m2211getStartimpl(m2099scaleToUserValueowVgs5E));
                setActiveRangeEnd(SliderRange.m2210getEndInclusiveimpl(m2099scaleToUserValueowVgs5E));
            }
        }
    }

    public final void setActiveRangeEnd(float f5) {
        float H;
        float snapValueToTick;
        H = kotlin.ranges.u.H(f5, getActiveRangeStart(), this.valueRange.getEndInclusive().floatValue());
        snapValueToTick = SliderKt.snapValueToTick(H, this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
        setActiveRangeEndState(snapValueToTick);
    }

    public final void setActiveRangeStart(float f5) {
        float H;
        float snapValueToTick;
        H = kotlin.ranges.u.H(f5, this.valueRange.getStart().floatValue(), getActiveRangeEnd());
        snapValueToTick = SliderKt.snapValueToTick(H, this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
        setActiveRangeStartState(snapValueToTick);
    }

    public final void setEndThumbWidth$material3_release(float f5) {
        this.endThumbWidth$delegate.setFloatValue(f5);
    }

    public final void setOnValueChange$material3_release(@p4.m v3.l<? super SliderRange, r2> lVar) {
        this.onValueChange = lVar;
    }

    public final void setRawOffsetEnd$material3_release(float f5) {
        this.rawOffsetEnd$delegate.setFloatValue(f5);
    }

    public final void setRawOffsetStart$material3_release(float f5) {
        this.rawOffsetStart$delegate.setFloatValue(f5);
    }

    public final void setRtl$material3_release(boolean z4) {
        this.isRtl$delegate.setValue(Boolean.valueOf(z4));
    }

    public final void setStartThumbWidth$material3_release(float f5) {
        this.startThumbWidth$delegate.setFloatValue(f5);
    }

    public final void setTotalWidth$material3_release(int i5) {
        this.totalWidth$delegate.setIntValue(i5);
    }

    public final void updateMinMaxPx$material3_release() {
        boolean z4;
        float f5 = 2;
        float max = Math.max(getTotalWidth$material3_release() - (getEndThumbWidth$material3_release() / f5), 0.0f);
        float min = Math.min(getStartThumbWidth$material3_release() / f5, max);
        boolean z5 = true;
        if (getMinPx() == min) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (getMaxPx() != max) {
                z5 = false;
            }
            if (z5) {
                return;
            }
        }
        setMinPx(min);
        setMaxPx(max);
        setRawOffsetStart$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
        setRawOffsetEnd$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
    }

    public /* synthetic */ RangeSliderState(float f5, float f6, int i5, v3.a aVar, kotlin.ranges.f fVar, int i6, kotlin.jvm.internal.w wVar) {
        this((i6 & 1) != 0 ? 0.0f : f5, (i6 & 2) != 0 ? 1.0f : f6, (i6 & 4) != 0 ? 0 : i5, (i6 & 8) != 0 ? null : aVar, (i6 & 16) != 0 ? kotlin.ranges.t.e(0.0f, 1.0f) : fVar);
    }
}
