package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001aL\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0011\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "Row", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurePolicy", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "DefaultRowMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultRowMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultRowMeasurePolicy$annotations", "()V", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,264:1\n79#2,11:265\n92#2:296\n456#3,8:276\n464#3,6:290\n50#3:297\n49#3:298\n3737#4,6:284\n1116#5,6:299\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n92#1:265,11\n92#1:296\n92#1:276,8\n92#1:290,6\n121#1:297\n121#1:298\n92#1:284,6\n121#1:299,6\n*E\n"})
/* loaded from: classes.dex */
public final class RowKt {

    @l
    private static final MeasurePolicy DefaultRowMeasurePolicy;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical vertical = null;
        DefaultRowMeasurePolicy = new RowColumnMeasurePolicy(layoutOrientation, arrangement.getStart(), vertical, arrangement.getStart().mo468getSpacingD9Ej5fM(), SizeMode.Wrap, CrossAxisAlignment.Companion.vertical$foundation_layout_release(Alignment.Companion.getTop()), null);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Row(@m Modifier modifier, @m Arrangement.Horizontal horizontal, @m Alignment.Vertical vertical, @l q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(693286680);
        if ((i6 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i6 & 2) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i6 & 4) != 0) {
            vertical = Alignment.Companion.getTop();
        }
        int i7 = i5 >> 3;
        MeasurePolicy rowMeasurePolicy = rowMeasurePolicy(horizontal, vertical, composer, (i7 & 112) | (i7 & 14));
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        int i8 = ((((i5 << 3) & 112) << 9) & 7168) | 6;
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
        Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, Integer.valueOf((i8 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        qVar.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i5 >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @l
    public static final MeasurePolicy getDefaultRowMeasurePolicy() {
        return DefaultRowMeasurePolicy;
    }

    @a1
    public static /* synthetic */ void getDefaultRowMeasurePolicy$annotations() {
    }

    @l
    @Composable
    @a1
    public static final MeasurePolicy rowMeasurePolicy(@l Arrangement.Horizontal horizontal, @l Alignment.Vertical vertical, @m Composer composer, int i5) {
        MeasurePolicy measurePolicy;
        composer.startReplaceableGroup(-837807694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-837807694, i5, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:117)");
        }
        if (l0.g(horizontal, Arrangement.INSTANCE.getStart()) && l0.g(vertical, Alignment.Companion.getTop())) {
            measurePolicy = DefaultRowMeasurePolicy;
        } else {
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(horizontal) | composer.changed(vertical);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                Arrangement.Vertical vertical2 = null;
                rememberedValue = new RowColumnMeasurePolicy(LayoutOrientation.Horizontal, horizontal, vertical2, horizontal.mo468getSpacingD9Ej5fM(), SizeMode.Wrap, CrossAxisAlignment.Companion.vertical$foundation_layout_release(vertical), null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            measurePolicy = (MeasurePolicy) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }
}
