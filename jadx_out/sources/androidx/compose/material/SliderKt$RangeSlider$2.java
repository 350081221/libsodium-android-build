package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.coroutines.i;
import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.f;
import kotlin.ranges.t;
import kotlin.ranges.u;
import kotlinx.coroutines.s0;
import p4.m;
import v3.a;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1195:1\n74#2:1196\n74#2:1197\n25#3:1198\n25#3:1205\n25#3:1216\n1116#4,6:1199\n1116#4,6:1206\n1116#4,3:1217\n1119#4,3:1223\n1116#4,6:1227\n1116#4,6:1233\n1116#4,6:1239\n487#5,4:1212\n491#5,2:1220\n495#5:1226\n487#6:1222\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n*L\n319#1:1196\n324#1:1197\n335#1:1198\n336#1:1205\n353#1:1216\n335#1:1199,6\n336#1:1206,6\n353#1:1217,3\n353#1:1223,3\n378#1:1227,6\n420#1:1233,6\n428#1:1239,6\n353#1:1212,4\n353#1:1220,2\n353#1:1226\n353#1:1222\n*E\n"})
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2 extends n0 implements q<BoxWithConstraintsScope, Composer, Integer, r2> {
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ a<r2> $onValueChangeFinished;
    final /* synthetic */ State<l<f<Float>, r2>> $onValueChangeState;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ int $steps;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ f<Float> $value;
    final /* synthetic */ f<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass2 extends h0 implements l<Float, Float> {
        final /* synthetic */ k1.e $maxPx;
        final /* synthetic */ k1.e $minPx;
        final /* synthetic */ f<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(f<Float> fVar, k1.e eVar, k1.e eVar2) {
            super(1, l0.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = fVar;
            this.$minPx = eVar;
            this.$maxPx = eVar2;
        }

        @p4.l
        public final Float invoke(float f5) {
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f5));
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Float invoke(Float f5) {
            return invoke(f5.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass3 extends h0 implements l<Float, Float> {
        final /* synthetic */ k1.e $maxPx;
        final /* synthetic */ k1.e $minPx;
        final /* synthetic */ f<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(f<Float> fVar, k1.e eVar, k1.e eVar2) {
            super(1, l0.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = fVar;
            this.$minPx = eVar;
            this.$maxPx = eVar2;
        }

        @p4.l
        public final Float invoke(float f5) {
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f5));
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Float invoke(Float f5) {
            return invoke(f5.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2(f<Float> fVar, f<Float> fVar2, State<? extends l<? super f<Float>, r2>> state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z4, int i5, a<r2> aVar, List<Float> list, SliderColors sliderColors) {
        super(3);
        this.$valueRange = fVar;
        this.$value = fVar2;
        this.$onValueChangeState = state;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$enabled = z4;
        this.$steps = i5;
        this.$onValueChangeFinished = aVar;
        this.$tickFractions = list;
        this.$colors = sliderColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(f<Float> fVar, k1.e eVar, k1.e eVar2, float f5) {
        float scale;
        scale = SliderKt.scale(fVar.getStart().floatValue(), fVar.getEndInclusive().floatValue(), f5, eVar.element, eVar2.element);
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f<Float> invoke$scaleToUserValue(k1.e eVar, k1.e eVar2, f<Float> fVar, f<Float> fVar2) {
        f<Float> scale;
        scale = SliderKt.scale(eVar.element, eVar2.element, (f<Float>) fVar2, fVar.getStart().floatValue(), fVar.getEndInclusive().floatValue());
        return scale;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.l BoxWithConstraintsScope boxWithConstraintsScope, @m Composer composer, int i5) {
        int i6;
        f e5;
        f e6;
        Modifier rangeSliderPressDragModifier;
        float H;
        float H2;
        float calcFraction;
        float calcFraction2;
        f e7;
        Modifier sliderSemantics;
        f e8;
        Modifier sliderSemantics2;
        if ((i5 & 14) == 0) {
            i6 = i5 | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i6 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(652589923, i6, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:318)");
        }
        boolean z4 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        float m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(boxWithConstraintsScope.mo489getConstraintsmsEJaDk());
        k1.e eVar = new k1.e();
        k1.e eVar2 = new k1.e();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        eVar.element = m6000getMaxWidthimpl - density.mo304toPx0680j_4(SliderKt.getThumbRadius());
        eVar2.element = density.mo304toPx0680j_4(SliderKt.getThumbRadius());
        f<Float> fVar = this.$value;
        f<Float> fVar2 = this.$valueRange;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(fVar2, eVar2, eVar, fVar.getStart().floatValue()));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
        f<Float> fVar3 = this.$value;
        f<Float> fVar4 = this.$valueRange;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(fVar4, eVar2, eVar, fVar3.getEndInclusive().floatValue()));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue2;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$valueRange, eVar2, eVar);
        f<Float> fVar5 = this.$valueRange;
        e5 = t.e(eVar2.element, eVar.element);
        SliderKt.CorrectValueSideEffect(anonymousClass2, fVar5, e5, mutableFloatState, this.$value.getStart().floatValue(), composer, 3072);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$valueRange, eVar2, eVar);
        f<Float> fVar6 = this.$valueRange;
        e6 = t.e(eVar2.element, eVar.element);
        SliderKt.CorrectValueSideEffect(anonymousClass3, fVar6, e6, mutableFloatState2, this.$value.getEndInclusive().floatValue(), composer, 3072);
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(i.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue3 = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
        composer.endReplaceableGroup();
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new SliderKt$RangeSlider$2$gestureEndAction$1(mutableFloatState, mutableFloatState2, this.$tickFractions, eVar2, eVar, this.$onValueChangeFinished, coroutineScope, this.$onValueChangeState, this.$valueRange), composer, 0);
        composer.startReplaceableGroup(17280602);
        boolean changed = composer.changed(mutableFloatState) | composer.changed(mutableFloatState2) | composer.changed(this.$valueRange) | composer.changed(eVar2.element) | composer.changed(eVar.element) | composer.changed(this.$value) | composer.changed(this.$onValueChangeState);
        f<Float> fVar7 = this.$value;
        State<l<f<Float>, r2>> state = this.$onValueChangeState;
        f<Float> fVar8 = this.$valueRange;
        Object rememberedValue4 = composer.rememberedValue();
        if (changed || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new SliderKt$RangeSlider$2$onDrag$1$1(mutableFloatState, mutableFloatState2, fVar7, eVar2, eVar, state, fVar8);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState((p) rememberedValue4, composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        rangeSliderPressDragModifier = SliderKt.rangeSliderPressDragModifier(companion2, this.$startInteractionSource, this.$endInteractionSource, mutableFloatState, mutableFloatState2, this.$enabled, z4, m6000getMaxWidthimpl, this.$valueRange, rememberUpdatedState, rememberUpdatedState2);
        H = u.H(this.$value.getStart().floatValue(), this.$valueRange.getStart().floatValue(), this.$value.getEndInclusive().floatValue());
        H2 = u.H(this.$value.getEndInclusive().floatValue(), this.$value.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
        calcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), H);
        calcFraction2 = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), H2);
        int floor = (int) Math.floor(this.$steps * calcFraction2);
        int floor2 = (int) Math.floor(this.$steps * (1.0f - calcFraction));
        boolean z5 = this.$enabled;
        composer.startReplaceableGroup(17282478);
        boolean changed2 = composer.changed(this.$onValueChangeState) | composer.changed(H2);
        State<l<f<Float>, r2>> state2 = this.$onValueChangeState;
        Object rememberedValue5 = composer.rememberedValue();
        if (changed2 || rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new SliderKt$RangeSlider$2$startThumbSemantics$1$1(state2, H2);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        a<r2> aVar = this.$onValueChangeFinished;
        e7 = t.e(this.$valueRange.getStart().floatValue(), H2);
        sliderSemantics = SliderKt.sliderSemantics(companion2, H, z5, (l) rememberedValue5, aVar, e7, floor);
        boolean z6 = this.$enabled;
        composer.startReplaceableGroup(17282768);
        boolean changed3 = composer.changed(this.$onValueChangeState) | composer.changed(H);
        State<l<f<Float>, r2>> state3 = this.$onValueChangeState;
        Object rememberedValue6 = composer.rememberedValue();
        if (changed3 || rememberedValue6 == companion.getEmpty()) {
            rememberedValue6 = new SliderKt$RangeSlider$2$endThumbSemantics$1$1(state3, H);
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceableGroup();
        a<r2> aVar2 = this.$onValueChangeFinished;
        e8 = t.e(H, this.$valueRange.getEndInclusive().floatValue());
        sliderSemantics2 = SliderKt.sliderSemantics(companion2, H2, z6, (l) rememberedValue6, aVar2, e8, floor2);
        SliderKt.RangeSliderImpl(this.$enabled, calcFraction, calcFraction2, this.$tickFractions, this.$colors, eVar.element - eVar2.element, this.$startInteractionSource, this.$endInteractionSource, rangeSliderPressDragModifier, sliderSemantics, sliderSemantics2, composer, 14159872, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
