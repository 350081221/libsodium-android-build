package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.umeng.analytics.pro.bi;
import java.util.List;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0001H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "T", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$swipeable$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,908:1\n74#2:909\n1116#3,6:910\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$swipeable$3\n*L\n602#1:909\n625#1:910,6\n*E\n"})
/* loaded from: classes.dex */
public final class SwipeableKt$swipeable$3 extends n0 implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Map<Float, T> $anchors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ ResistanceConfig $resistance;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ SwipeableState<T> $state;
    final /* synthetic */ p<T, T, ThresholdConfig> $thresholds;
    final /* synthetic */ float $velocityThreshold;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", i = {}, l = {616}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ Map<Float, T> $anchors;
        final /* synthetic */ Density $density;
        final /* synthetic */ ResistanceConfig $resistance;
        final /* synthetic */ SwipeableState<T> $state;
        final /* synthetic */ p<T, T, ThresholdConfig> $thresholds;
        final /* synthetic */ float $velocityThreshold;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", bi.ay, "b", "invoke", "(FF)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$swipeable$3$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,908:1\n1#2:909\n*E\n"})
        /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$3$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends n0 implements p<Float, Float, Float> {
            final /* synthetic */ Map<Float, T> $anchors;
            final /* synthetic */ Density $density;
            final /* synthetic */ p<T, T, ThresholdConfig> $thresholds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Map<Float, ? extends T> map, p<? super T, ? super T, ? extends ThresholdConfig> pVar, Density density) {
                super(2);
                this.$anchors = map;
                this.$thresholds = pVar;
                this.$density = density;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ Float invoke(Float f5, Float f6) {
                return invoke(f5.floatValue(), f6.floatValue());
            }

            @l
            public final Float invoke(float f5, float f6) {
                Object K;
                Object K2;
                K = a1.K(this.$anchors, Float.valueOf(f5));
                K2 = a1.K(this.$anchors, Float.valueOf(f6));
                return Float.valueOf(this.$thresholds.invoke(K, K2).computeThreshold(this.$density, f5, f6));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(SwipeableState<T> swipeableState, Map<Float, ? extends T> map, ResistanceConfig resistanceConfig, Density density, p<? super T, ? super T, ? extends ThresholdConfig> pVar, float f5, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$state = swipeableState;
            this.$anchors = map;
            this.$resistance = resistanceConfig;
            this.$density = density;
            this.$thresholds = pVar;
            this.$velocityThreshold = f5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass3(this.$state, this.$anchors, this.$resistance, this.$density, this.$thresholds, this.$velocityThreshold, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass3) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                Map anchors$material_release = this.$state.getAnchors$material_release();
                this.$state.setAnchors$material_release(this.$anchors);
                this.$state.setResistance$material_release(this.$resistance);
                this.$state.setThresholds$material_release(new AnonymousClass1(this.$anchors, this.$thresholds, this.$density));
                this.$state.setVelocityThreshold$material_release(this.$density.mo304toPx0680j_4(this.$velocityThreshold));
                SwipeableState<T> swipeableState = this.$state;
                Object obj2 = this.$anchors;
                this.label = 1;
                if (swipeableState.processNewAnchors$material_release(anchors$material_release, obj2, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableKt$swipeable$3(Map<Float, ? extends T> map, SwipeableState<T> swipeableState, Orientation orientation, boolean z4, MutableInteractionSource mutableInteractionSource, boolean z5, ResistanceConfig resistanceConfig, p<? super T, ? super T, ? extends ThresholdConfig> pVar, float f5) {
        super(3);
        this.$anchors = map;
        this.$state = swipeableState;
        this.$orientation = orientation;
        this.$enabled = z4;
        this.$interactionSource = mutableInteractionSource;
        this.$reverseDirection = z5;
        this.$resistance = resistanceConfig;
        this.$thresholds = pVar;
        this.$velocityThreshold = f5;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @l
    @Composable
    public final Modifier invoke(@l Modifier modifier, @m Composer composer, int i5) {
        List X1;
        composer.startReplaceableGroup(43594985);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(43594985, i5, -1, "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:595)");
        }
        if (!this.$anchors.isEmpty()) {
            X1 = e0.X1(this.$anchors.values());
            if (X1.size() == this.$anchors.size()) {
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                this.$state.ensureInit$material_release(this.$anchors);
                Map<Float, T> map = this.$anchors;
                SwipeableState<T> swipeableState = this.$state;
                EffectsKt.LaunchedEffect(map, swipeableState, new AnonymousClass3(swipeableState, map, this.$resistance, density, this.$thresholds, this.$velocityThreshold, null), composer, 520);
                Modifier.Companion companion = Modifier.Companion;
                boolean isAnimationRunning = this.$state.isAnimationRunning();
                DraggableState draggableState$material_release = this.$state.getDraggableState$material_release();
                Orientation orientation = this.$orientation;
                boolean z4 = this.$enabled;
                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                composer.startReplaceableGroup(25753663);
                boolean changed = composer.changed(this.$state);
                SwipeableState<T> swipeableState2 = this.$state;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new SwipeableKt$swipeable$3$4$1(swipeableState2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier draggable$default = DraggableKt.draggable$default(companion, draggableState$material_release, orientation, z4, mutableInteractionSource, isAnimationRunning, null, (q) rememberedValue, this.$reverseDirection, 32, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return draggable$default;
            }
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
        }
        throw new IllegalArgumentException("You must have at least one anchor.".toString());
    }
}
