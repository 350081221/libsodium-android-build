package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "screen", "Lkotlin/r2;", "invoke", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TimePickerKt$ClockFace$2 extends kotlin.jvm.internal.n0 implements v3.q<List<? extends Integer>, Composer, Integer, r2> {
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ TimePickerColors $colors;
        final /* synthetic */ List<Integer> $screen;
        final /* synthetic */ TimePickerState $state;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1\n*L\n1366#1:1844,6\n*E\n"})
        /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00701 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
            final /* synthetic */ boolean $autoSwitchToMinute;
            final /* synthetic */ List<Integer> $screen;
            final /* synthetic */ TimePickerState $state;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n*L\n1386#1:1844,6\n*E\n"})
            /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
                final /* synthetic */ boolean $autoSwitchToMinute;
                final /* synthetic */ TimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(TimePickerState timePickerState, boolean z4) {
                    super(2);
                    this.$state = timePickerState;
                    this.$autoSwitchToMinute = z4;
                }

                @Override // v3.p
                public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r2.f19517a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@p4.m Composer composer, int i5) {
                    List list;
                    List list2;
                    if ((i5 & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-448649404, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                    }
                    list = TimePickerKt.ExtraHours;
                    int size = list.size();
                    TimePickerState timePickerState = this.$state;
                    boolean z4 = this.$autoSwitchToMinute;
                    for (int i6 = 0; i6 < size; i6++) {
                        list2 = TimePickerKt.ExtraHours;
                        int intValue = ((Number) list2.get(i6)).intValue();
                        Modifier.Companion companion = Modifier.Companion;
                        composer.startReplaceableGroup(-1469917176);
                        boolean changed = composer.changed(i6);
                        Object rememberedValue = composer.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = new TimePickerKt$ClockFace$2$1$1$2$1$1$1(i6);
                            composer.updateRememberedValue(rememberedValue);
                        }
                        composer.endReplaceableGroup();
                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (v3.l) rememberedValue, 1, null), timePickerState, intValue, z4, composer, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00701(List<Integer> list, TimePickerState timePickerState, boolean z4) {
                super(2);
                this.$screen = list;
                this.$state = timePickerState;
                this.$autoSwitchToMinute = z4;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@p4.m Composer composer, int i5) {
                float f5;
                int intValue;
                if ((i5 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2018362505, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1358)");
                }
                composer.startReplaceableGroup(-504293055);
                int size = this.$screen.size();
                TimePickerState timePickerState = this.$state;
                List<Integer> list = this.$screen;
                boolean z4 = this.$autoSwitchToMinute;
                for (int i6 = 0; i6 < size; i6++) {
                    if (timePickerState.is24hour() && !Selection.m2172equalsimpl0(timePickerState.m2500getSelectionJiIwxys$material3_release(), Selection.Companion.m2177getMinuteJiIwxys())) {
                        intValue = list.get(i6).intValue() % 12;
                    } else {
                        intValue = list.get(i6).intValue();
                    }
                    int i7 = intValue;
                    Modifier.Companion companion = Modifier.Companion;
                    composer.startReplaceableGroup(-1916851139);
                    boolean changed = composer.changed(i6);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new TimePickerKt$ClockFace$2$1$1$1$1$1(i6);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (v3.l) rememberedValue, 1, null), timePickerState, i7, z4, composer, 0);
                }
                composer.endReplaceableGroup();
                if (Selection.m2172equalsimpl0(this.$state.m2500getSelectionJiIwxys$material3_release(), Selection.Companion.m2176getHourJiIwxys()) && this.$state.is24hour()) {
                    Modifier m200backgroundbw27NRU = BackgroundKt.m200backgroundbw27NRU(SizeKt.m602size3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m3161getClockDialContainerSizeD9Ej5fM()), Color.Companion.m3769getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape());
                    f5 = TimePickerKt.InnerCircleRadius;
                    TimePickerKt.m2478CircularLayoutuFdPcIQ(m200backgroundbw27NRU, f5, ComposableLambdaKt.composableLambda(composer, -448649404, true, new AnonymousClass2(this.$state, this.$autoSwitchToMinute)), composer, 432, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TimePickerColors timePickerColors, List<Integer> list, TimePickerState timePickerState, boolean z4) {
            super(2);
            this.$colors = timePickerColors;
            this.$screen = list;
            this.$state = timePickerState;
            this.$autoSwitchToMinute = z4;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.m Composer composer, int i5) {
            if ((i5 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1385633737, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1355)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(this.$colors.m2456clockDialContentColorvNxB06k$material3_release(false))), ComposableLambdaKt.composableLambda(composer, -2018362505, true, new C00701(this.$screen, this.$state, this.$autoSwitchToMinute)), composer, 0 | ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockFace$2(TimePickerState timePickerState, boolean z4, TimePickerColors timePickerColors) {
        super(3);
        this.$state = timePickerState;
        this.$autoSwitchToMinute = z4;
        this.$colors = timePickerColors;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(List<? extends Integer> list, Composer composer, Integer num) {
        invoke((List<Integer>) list, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.l List<Integer> list, @p4.m Composer composer, int i5) {
        Modifier drawSelector;
        float f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1628166511, i5, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1348)");
        }
        drawSelector = TimePickerKt.drawSelector(SizeKt.m602size3ABfNKs(Modifier.Companion.then(new ClockDialModifier(this.$state, this.$autoSwitchToMinute)), TimePickerTokens.INSTANCE.m3161getClockDialContainerSizeD9Ej5fM()), this.$state, this.$colors);
        f5 = TimePickerKt.OuterCircleSizeRadius;
        TimePickerKt.m2478CircularLayoutuFdPcIQ(drawSelector, f5, ComposableLambdaKt.composableLambda(composer, -1385633737, true, new AnonymousClass1(this.$colors, list, this.$state, this.$autoSwitchToMinute)), composer, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
