package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "contentColor", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "ProvideContentColorTextStyle-3J-VO9M", "(JLandroidx/compose/ui/text/TextStyle;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "ProvideContentColorTextStyle", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nProvideContentColorTextStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProvideContentColorTextStyle.kt\nandroidx/compose/material3/ProvideContentColorTextStyleKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,45:1\n74#2:46\n*S KotlinDebug\n*F\n+ 1 ProvideContentColorTextStyle.kt\nandroidx/compose/material3/ProvideContentColorTextStyleKt\n*L\n38#1:46\n*E\n"})
/* loaded from: classes.dex */
public final class ProvideContentColorTextStyleKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: ProvideContentColorTextStyle-3J-VO9M, reason: not valid java name */
    public static final void m2091ProvideContentColorTextStyle3JVO9M(long j5, @p4.l TextStyle textStyle, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1479790536);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(j5)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1479790536, i6, -1, "androidx.compose.material3.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:36)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(j5)), TextKt.getLocalTextStyle().provides(((TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle())).merge(textStyle))}, pVar, startRestartGroup, (i6 >> 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ProvideContentColorTextStyleKt$ProvideContentColorTextStyle$1(j5, textStyle, pVar, i5));
        }
    }
}
