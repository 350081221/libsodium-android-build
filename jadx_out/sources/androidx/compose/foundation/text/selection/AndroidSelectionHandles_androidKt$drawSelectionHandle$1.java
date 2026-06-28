package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,327:1\n74#2:328\n1116#3,6:329\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n*L\n111#1:328\n112#1:329,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1 extends n0 implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ v3.a<Boolean> $iconVisible;
    final /* synthetic */ boolean $isLeft;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$drawSelectionHandle$1(v3.a<Boolean> aVar, boolean z4) {
        super(3);
        this.$iconVisible = aVar;
        this.$isLeft = z4;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @l
    @Composable
    public final Modifier invoke(@l Modifier modifier, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-196777734);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-196777734, i5, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:110)");
        }
        long m1059getHandleColor0d7_KjU = ((TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m1059getHandleColor0d7_KjU();
        composer.startReplaceableGroup(442417347);
        boolean changed = composer.changed(m1059getHandleColor0d7_KjU) | composer.changedInstance(this.$iconVisible) | composer.changed(this.$isLeft);
        v3.a<Boolean> aVar = this.$iconVisible;
        boolean z4 = this.$isLeft;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1(m1059getHandleColor0d7_KjU, aVar, z4);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier drawWithCache = DrawModifierKt.drawWithCache(modifier, (v3.l) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return drawWithCache;
    }
}
