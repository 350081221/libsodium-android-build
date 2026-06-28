package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.unit.Constraints;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0007\u001a\u00020\u00022!\u0010\u0006\u001a\u001d\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\u0014\u001a\u00020\t*\u00020\t2A\u0010\u0013\u001a=\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\n¢\u0006\u0002\b\u0005H\u0007¨\u0006\u0015"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/layout/LookaheadScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "Lkotlin/u;", "content", "LookaheadScope", "(Lv3/q;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntermediateMeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Lkotlin/v0;", "name", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure", "intermediateLayout", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLookaheadScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,192:1\n25#2:193\n365#2,11:200\n1116#3,6:194\n*S KotlinDebug\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n*L\n50#1:193\n51#1:200,11\n50#1:194,6\n*E\n"})
/* loaded from: classes.dex */
public final class LookaheadScopeKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @UiComposable
    public static final void LookaheadScope(@l q<? super LookaheadScope, ? super Composer, ? super Integer, r2> qVar, @m Composer composer, int i5) {
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1078066484);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1078066484, i6, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:48)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LookaheadScopeImpl(null, 1, 0 == true ? 1 : 0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            LookaheadScopeImpl lookaheadScopeImpl = (LookaheadScopeImpl) rememberedValue;
            LookaheadScopeKt$LookaheadScope$1 lookaheadScopeKt$LookaheadScope$1 = LookaheadScopeKt$LookaheadScope$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(-692256719);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(lookaheadScopeKt$LookaheadScope$1);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3268initimpl(m3264constructorimpl, LookaheadScopeKt$LookaheadScope$2$1.INSTANCE);
            Updater.m3271setimpl(m3264constructorimpl, lookaheadScopeImpl, LookaheadScopeKt$LookaheadScope$2$2.INSTANCE);
            qVar.invoke(lookaheadScopeImpl, startRestartGroup, Integer.valueOf(((i6 << 3) & 112) | 8));
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LookaheadScopeKt$LookaheadScope$4(qVar, i5));
        }
    }

    @l
    @ExperimentalComposeUiApi
    public static final Modifier intermediateLayout(@l Modifier modifier, @l q<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        return modifier.then(new IntermediateLayoutElement(qVar));
    }
}
