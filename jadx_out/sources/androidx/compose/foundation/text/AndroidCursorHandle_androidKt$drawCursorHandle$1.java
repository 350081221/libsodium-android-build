package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
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

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,82:1\n74#2:83\n1116#3,6:84\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n*L\n63#1:83\n65#1:84,6\n*E\n"})
/* loaded from: classes.dex */
final class AndroidCursorHandle_androidKt$drawCursorHandle$1 extends n0 implements q<Modifier, Composer, Integer, Modifier> {
    public static final AndroidCursorHandle_androidKt$drawCursorHandle$1 INSTANCE = new AndroidCursorHandle_androidKt$drawCursorHandle$1();

    AndroidCursorHandle_androidKt$drawCursorHandle$1() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @l
    @Composable
    public final Modifier invoke(@l Modifier modifier, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-2126899193);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126899193, i5, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:62)");
        }
        long m1059getHandleColor0d7_KjU = ((TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m1059getHandleColor0d7_KjU();
        Modifier.Companion companion = Modifier.Companion;
        composer.startReplaceableGroup(-1739374137);
        boolean changed = composer.changed(m1059getHandleColor0d7_KjU);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1(m1059getHandleColor0d7_KjU);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier then = modifier.then(DrawModifierKt.drawWithCache(companion, (v3.l) rememberedValue));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
