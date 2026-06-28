package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aP\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "Lkotlin/u;", "content", "BoxWithConstraints", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLv3/q;Landroidx/compose/runtime/Composer;II)V", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,124:1\n1116#2,6:125\n*S KotlinDebug\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n*L\n67#1:125,6\n*E\n"})
/* loaded from: classes.dex */
public final class BoxWithConstraintsKt {
    @Composable
    @UiComposable
    public static final void BoxWithConstraints(@m Modifier modifier, @m Alignment alignment, boolean z4, @l q<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, r2> qVar, @m Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1781813501);
        int i12 = i6 & 1;
        if (i12 != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            i7 = i5;
        }
        int i13 = i6 & 2;
        if (i13 != 0) {
            i7 |= 48;
        } else if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(alignment)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        int i14 = i6 & 4;
        if (i14 != 0) {
            i7 |= 384;
        } else if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(z4)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i7 |= i10;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i5 & 7168) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i7 |= i11;
        }
        if ((i7 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i12 != 0) {
                modifier = Modifier.Companion;
            }
            if (i13 != 0) {
                alignment = Alignment.Companion.getTopStart();
            }
            if (i14 != 0) {
                z4 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1781813501, i7, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            int i15 = i7 >> 3;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignment, z4, startRestartGroup, (i15 & 112) | (i15 & 14));
            startRestartGroup.startReplaceableGroup(1021372304);
            boolean changedInstance = startRestartGroup.changedInstance(qVar) | startRestartGroup.changed(rememberBoxMeasurePolicy);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BoxWithConstraintsKt$BoxWithConstraints$1$1(rememberBoxMeasurePolicy, qVar);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (p) rememberedValue, startRestartGroup, i7 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        Alignment alignment2 = alignment;
        boolean z5 = z4;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BoxWithConstraintsKt$BoxWithConstraints$2(modifier2, alignment2, z5, qVar, i5, i6));
        }
    }
}
