package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Selection;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1843:1\n86#2,7:1844\n93#2:1879\n97#2:1884\n78#3,11:1851\n91#3:1883\n456#4,8:1862\n464#4,3:1876\n467#4,3:1880\n3737#5,6:1870\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1\n*L\n967#1:1844,7\n967#1:1879\n967#1:1884\n967#1:1851,11\n967#1:1883\n967#1:1862,8\n967#1:1876,3\n967#1:1880,3\n967#1:1870,6\n*E\n"})
/* loaded from: classes.dex */
public final class TimePickerKt$ClockDisplayNumbers$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockDisplayNumbers$1(TimePickerState timePickerState, TimePickerColors timePickerColors) {
        super(2);
        this.$state = timePickerState;
        this.$colors = timePickerColors;
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
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-477913269, i5, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:966)");
        }
        TimePickerState timePickerState = this.$state;
        TimePickerColors timePickerColors = this.$colors;
        composer.startReplaceableGroup(693286680);
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion2.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
        Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
        Modifier m604sizeVpY3zN4 = SizeKt.m604sizeVpY3zN4(companion, timePickerTokens.m3173getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m3172getTimeSelectorContainerHeightD9Ej5fM());
        int hourForDisplay$material3_release = timePickerState.getHourForDisplay$material3_release();
        Selection.Companion companion3 = Selection.Companion;
        TimePickerKt.m2481TimeSelectoruXwN82Y(m604sizeVpY3zN4, hourForDisplay$material3_release, timePickerState, companion3.m2176getHourJiIwxys(), timePickerColors, composer, 3078);
        f5 = TimePickerKt.DisplaySeparatorWidth;
        TimePickerKt.DisplaySeparator(SizeKt.m604sizeVpY3zN4(companion, f5, timePickerTokens.m3169getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer, 6);
        TimePickerKt.m2481TimeSelectoruXwN82Y(SizeKt.m604sizeVpY3zN4(companion, timePickerTokens.m3173getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m3172getTimeSelectorContainerHeightD9Ej5fM()), timePickerState.getMinute(), timePickerState, companion3.m2177getMinuteJiIwxys(), timePickerColors, composer, 3078);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
