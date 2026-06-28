package androidx.compose.foundation;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a0\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "Lkotlin/u;", "onDraw", "Canvas", "(Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/runtime/Composer;I)V", "", "contentDescription", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nCanvas.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Canvas.kt\nandroidx/compose/foundation/CanvasKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,65:1\n1116#2,6:66\n*S KotlinDebug\n*F\n+ 1 Canvas.kt\nandroidx/compose/foundation/CanvasKt\n*L\n64#1:66,6\n*E\n"})
/* loaded from: classes.dex */
public final class CanvasKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Canvas(@p4.l Modifier modifier, @p4.l v3.l<? super DrawScope, r2> lVar, @p4.m Composer composer, int i5) {
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-932836462);
        if ((i5 & 14) == 0) {
            i6 = (startRestartGroup.changed(modifier) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            i6 |= startRestartGroup.changedInstance(lVar) ? 32 : 16;
        }
        if ((i6 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-932836462, i6, -1, "androidx.compose.foundation.Canvas (Canvas.kt:42)");
            }
            SpacerKt.Spacer(DrawModifierKt.drawBehind(modifier, lVar), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CanvasKt$Canvas$1(modifier, lVar, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Canvas(@p4.l Modifier modifier, @p4.l String str, @p4.l v3.l<? super DrawScope, r2> lVar, @p4.m Composer composer, int i5) {
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1162737955);
        if ((i5 & 14) == 0) {
            i6 = (startRestartGroup.changed(modifier) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            i6 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i6 |= startRestartGroup.changedInstance(lVar) ? 256 : 128;
        }
        if ((i6 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162737955, i6, -1, "androidx.compose.foundation.Canvas (Canvas.kt:63)");
            }
            Modifier drawBehind = DrawModifierKt.drawBehind(modifier, lVar);
            startRestartGroup.startReplaceableGroup(-403028284);
            boolean changed = startRestartGroup.changed(str);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new CanvasKt$Canvas$2$1(str);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(SemanticsModifierKt.semantics$default(drawBehind, false, (v3.l) rememberedValue, 1, null), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CanvasKt$Canvas$3(modifier, str, lVar, i5));
        }
    }
}
