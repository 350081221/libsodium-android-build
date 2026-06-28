package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
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
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1195:1\n74#2:1196\n74#2:1197\n487#3,4:1198\n491#3,2:1206\n495#3:1212\n25#4:1202\n25#4:1213\n25#4:1220\n67#4,3:1227\n66#4:1230\n1116#5,3:1203\n1119#5,3:1209\n1116#5,6:1214\n1116#5,6:1221\n1116#5,6:1231\n1116#5,6:1237\n487#6:1208\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$3\n*L\n180#1:1196\n185#1:1197\n196#1:1198,4\n196#1:1206,2\n196#1:1212\n196#1:1202\n197#1:1213\n198#1:1220\n200#1:1227,3\n200#1:1230\n196#1:1203,3\n196#1:1209,3\n197#1:1214,6\n198#1:1221,6\n200#1:1231,6\n240#1:1237,6\n196#1:1208\n*E\n"})
/* loaded from: classes.dex */
public final class SliderKt$Slider$3 extends n0 implements q<BoxWithConstraintsScope, Composer, Integer, r2> {
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ a<r2> $onValueChangeFinished;
    final /* synthetic */ State<l<Float, r2>> $onValueChangeState;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $value;
    final /* synthetic */ f<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$Slider$3$2, reason: invalid class name */
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
            return Float.valueOf(SliderKt$Slider$3.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f5));
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Float invoke(Float f5) {
            return invoke(f5.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$3(f<Float> fVar, float f5, MutableInteractionSource mutableInteractionSource, boolean z4, List<Float> list, SliderColors sliderColors, State<? extends l<? super Float, r2>> state, a<r2> aVar) {
        super(3);
        this.$valueRange = fVar;
        this.$value = f5;
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z4;
        this.$tickFractions = list;
        this.$colors = sliderColors;
        this.$onValueChangeState = state;
        this.$onValueChangeFinished = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(f<Float> fVar, k1.e eVar, k1.e eVar2, float f5) {
        float scale;
        scale = SliderKt.scale(fVar.getStart().floatValue(), fVar.getEndInclusive().floatValue(), f5, eVar.element, eVar2.element);
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToUserValue(k1.e eVar, k1.e eVar2, f<Float> fVar, float f5) {
        float scale;
        scale = SliderKt.scale(eVar.element, eVar2.element, f5, fVar.getStart().floatValue(), fVar.getEndInclusive().floatValue());
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
        Modifier sliderTapModifier;
        float H;
        float calcFraction;
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
            ComposerKt.traceEventStart(2085116814, i6, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:179)");
        }
        boolean z4 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        float m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(boxWithConstraintsScope.mo489getConstraintsmsEJaDk());
        k1.e eVar = new k1.e();
        k1.e eVar2 = new k1.e();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        eVar.element = Math.max(m6000getMaxWidthimpl - density.mo304toPx0680j_4(SliderKt.getThumbRadius()), 0.0f);
        eVar2.element = Math.min(density.mo304toPx0680j_4(SliderKt.getThumbRadius()), eVar.element);
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(i.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        float f5 = this.$value;
        f<Float> fVar = this.$valueRange;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(fVar, eVar2, eVar, f5));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue3;
        Object valueOf = Float.valueOf(eVar2.element);
        Object valueOf2 = Float.valueOf(eVar.element);
        f<Float> fVar2 = this.$valueRange;
        State<l<Float, r2>> state = this.$onValueChangeState;
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(fVar2);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed || rememberedValue4 == companion.getEmpty()) {
            Object sliderDraggableState = new SliderDraggableState(new SliderKt$Slider$3$draggableState$1$1(mutableFloatState, mutableFloatState2, eVar2, eVar, state, fVar2));
            composer.updateRememberedValue(sliderDraggableState);
            rememberedValue4 = sliderDraggableState;
        }
        composer.endReplaceableGroup();
        SliderDraggableState sliderDraggableState2 = (SliderDraggableState) rememberedValue4;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$valueRange, eVar2, eVar);
        f<Float> fVar3 = this.$valueRange;
        e5 = t.e(eVar2.element, eVar.element);
        SliderKt.CorrectValueSideEffect(anonymousClass2, fVar3, e5, mutableFloatState, this.$value, composer, 3072);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new SliderKt$Slider$3$gestureEndAction$1(mutableFloatState, this.$tickFractions, eVar2, eVar, coroutineScope, sliderDraggableState2, this.$onValueChangeFinished), composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        sliderTapModifier = SliderKt.sliderTapModifier(companion2, sliderDraggableState2, this.$interactionSource, m6000getMaxWidthimpl, z4, mutableFloatState, rememberUpdatedState, mutableFloatState2, this.$enabled);
        Orientation orientation = Orientation.Horizontal;
        boolean isDragging = sliderDraggableState2.isDragging();
        boolean z5 = this.$enabled;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        composer.startReplaceableGroup(17274857);
        boolean changed2 = composer.changed(rememberUpdatedState);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed2 || rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new SliderKt$Slider$3$drag$1$1(rememberUpdatedState, null);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        Modifier draggable$default = DraggableKt.draggable$default(companion2, sliderDraggableState2, orientation, z5, mutableInteractionSource, isDragging, null, (q) rememberedValue5, z4, 32, null);
        H = u.H(this.$value, this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
        calcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), H);
        SliderKt.SliderImpl(this.$enabled, calcFraction, this.$tickFractions, this.$colors, eVar.element - eVar2.element, this.$interactionSource, sliderTapModifier.then(draggable$default), composer, 512);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
