package androidx.compose.material;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import v3.a;
import v3.l;
import v3.p;
import v3.q;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u001ax\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a`\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\"\u0010\u0018\u001a\u00020\u00032\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001b\u001a\u00020\u00032\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a5\u0010\u001d\u001a\u00020\u00032\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f\"\u0014\u0010!\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f\"\u0014\u0010\"\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001f\"\u0014\u0010#\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001f\"\u0014\u0010$\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001f\"\u0014\u0010%\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001f\"\u0014\u0010&\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001f\"\u0014\u0010'\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "action", "", "actionOnNewLine", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "content", "Snackbar-7zSek6w", "(Landroidx/compose/ui/Modifier;Lv3/p;ZLandroidx/compose/ui/graphics/Shape;JJFLv3/p;Landroidx/compose/runtime/Composer;II)V", "Snackbar", "Landroidx/compose/material/SnackbarData;", "snackbarData", "actionColor", "Snackbar-sPrSdHI", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFLandroidx/compose/runtime/Composer;II)V", "TextOnlySnackbar", "(Lv3/p;Landroidx/compose/runtime/Composer;I)V", "text", "NewLineButtonSnackbar", "(Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "OneRowSnackbar", "HeightToFirstLine", "F", "HorizontalSpacing", "HorizontalSpacingButtonSide", "SeparateButtonExtraY", "SnackbarVerticalPadding", "TextEndExtraSpacing", "LongButtonVerticalOffset", "SnackbarMinHeightOneLine", "SnackbarMinHeightTwoLines", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,366:1\n154#2:367\n154#2:368\n154#2:369\n154#2:683\n154#2:684\n154#2:685\n154#2:686\n154#2:687\n154#2:688\n154#2:689\n154#2:690\n154#2:691\n76#3,14:370\n79#3,11:407\n92#3:439\n92#3:444\n79#3,11:451\n79#3,11:486\n92#3:518\n79#3,11:526\n92#3:558\n92#3:563\n79#3,11:571\n79#3,11:605\n92#3:637\n79#3,11:645\n92#3:677\n92#3:682\n456#4,8:384\n464#4,3:398\n456#4,8:418\n464#4,3:432\n467#4,3:436\n467#4,3:441\n456#4,8:462\n464#4,3:476\n456#4,8:497\n464#4,3:511\n467#4,3:515\n456#4,8:537\n464#4,3:551\n467#4,3:555\n467#4,3:560\n456#4,8:582\n464#4,3:596\n456#4,8:616\n464#4,3:630\n467#4,3:634\n456#4,8:656\n464#4,3:670\n467#4,3:674\n467#4,3:679\n3737#5,6:392\n3737#5,6:426\n3737#5,6:470\n3737#5,6:505\n3737#5,6:545\n3737#5,6:590\n3737#5,6:624\n3737#5,6:664\n68#6,6:401\n74#6:435\n78#6:440\n68#6,6:480\n74#6:514\n78#6:519\n68#6,6:520\n74#6:554\n78#6:559\n68#6,6:599\n74#6:633\n78#6:638\n68#6,6:639\n74#6:673\n78#6:678\n74#7,6:445\n80#7:479\n84#7:564\n1116#8,6:565\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n*L\n89#1:367\n161#1:368\n176#1:369\n357#1:683\n358#1:684\n359#1:685\n360#1:686\n361#1:687\n362#1:688\n363#1:689\n364#1:690\n365#1:691\n238#1:370,14\n239#1:407,11\n239#1:439\n238#1:444\n276#1:451,11\n284#1:486,11\n284#1:518\n288#1:526,11\n288#1:558\n276#1:563\n299#1:571,11\n301#1:605,11\n301#1:637\n302#1:645,11\n302#1:677\n299#1:682\n238#1:384,8\n238#1:398,3\n239#1:418,8\n239#1:432,3\n239#1:436,3\n238#1:441,3\n276#1:462,8\n276#1:476,3\n284#1:497,8\n284#1:511,3\n284#1:515,3\n288#1:537,8\n288#1:551,3\n288#1:555,3\n276#1:560,3\n299#1:582,8\n299#1:596,3\n301#1:616,8\n301#1:630,3\n301#1:634,3\n302#1:656,8\n302#1:670,3\n302#1:674,3\n299#1:679,3\n238#1:392,6\n239#1:426,6\n276#1:470,6\n284#1:505,6\n288#1:545,6\n299#1:590,6\n301#1:624,6\n302#1:664,6\n239#1:401,6\n239#1:435\n239#1:440\n284#1:480,6\n284#1:514\n284#1:519\n288#1:520,6\n288#1:554\n288#1:559\n301#1:599,6\n301#1:633\n301#1:638\n302#1:639,6\n302#1:673\n302#1:678\n276#1:445,6\n276#1:479\n276#1:564\n308#1:565,6\n*E\n"})
/* loaded from: classes.dex */
public final class SnackbarKt {
    private static final float HorizontalSpacingButtonSide;
    private static final float TextEndExtraSpacing;
    private static final float HeightToFirstLine = Dp.m6044constructorimpl(30);
    private static final float HorizontalSpacing = Dp.m6044constructorimpl(16);
    private static final float SeparateButtonExtraY = Dp.m6044constructorimpl(2);
    private static final float SnackbarVerticalPadding = Dp.m6044constructorimpl(6);
    private static final float LongButtonVerticalOffset = Dp.m6044constructorimpl(12);
    private static final float SnackbarMinHeightOneLine = Dp.m6044constructorimpl(48);
    private static final float SnackbarMinHeightTwoLines = Dp.m6044constructorimpl(68);

    static {
        float f5 = 8;
        HorizontalSpacingButtonSide = Dp.m6044constructorimpl(f5);
        TextEndExtraSpacing = Dp.m6044constructorimpl(f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NewLineButtonSnackbar(p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1229075900);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1229075900, i6, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:274)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f5 = HorizontalSpacing;
            float f6 = HorizontalSpacingButtonSide;
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(fillMaxWidth$default, f5, 0.0f, f6, SeparateButtonExtraY, 2, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier m557paddingqDBjuR0$default2 = PaddingKt.m557paddingqDBjuR0$default(AlignmentLineKt.m436paddingFromBaselineVpY3zN4(companion, HeightToFirstLine, LongButtonVerticalOffset), 0.0f, 0.0f, f6, 0.0f, 11, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            a<ComposeUiNode> constructor2 = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf(i6 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier align = columnScopeInstance.align(companion, companion2.getEnd());
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            a<ComposeUiNode> constructor3 = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(align);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl3 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            pVar2.invoke(startRestartGroup, Integer.valueOf((i6 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SnackbarKt$NewLineButtonSnackbar$2(pVar, pVar2, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OneRowSnackbar(p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-534813202);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-534813202, i6, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:295)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(companion, HorizontalSpacing, 0.0f, HorizontalSpacingButtonSide, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(-1696415923);
            final String str = "action";
            final String str2 = "text";
            boolean changed = startRestartGroup.changed("action") | startRestartGroup.changed("text");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1

                    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1$4, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass4 extends n0 implements l<Placeable.PlacementScope, r2> {
                        final /* synthetic */ int $buttonPlaceX;
                        final /* synthetic */ int $buttonPlaceY;
                        final /* synthetic */ Placeable $buttonPlaceable;
                        final /* synthetic */ int $textPlaceY;
                        final /* synthetic */ Placeable $textPlaceable;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass4(Placeable placeable, int i5, Placeable placeable2, int i6, int i7) {
                            super(1);
                            this.$textPlaceable = placeable;
                            this.$textPlaceY = i5;
                            this.$buttonPlaceable = placeable2;
                            this.$buttonPlaceX = i6;
                            this.$buttonPlaceY = i7;
                        }

                        @Override // v3.l
                        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                            Placeable.PlacementScope.placeRelative$default(placementScope, this.$textPlaceable, 0, this.$textPlaceY, 0.0f, 4, null);
                            Placeable.PlacementScope.placeRelative$default(placementScope, this.$buttonPlaceable, this.$buttonPlaceX, this.$buttonPlaceY, 0.0f, 4, null);
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                        float f5;
                        int u4;
                        boolean z4;
                        boolean z5;
                        float f6;
                        float f7;
                        int i9;
                        int i10;
                        int height;
                        float f8;
                        String str3 = str;
                        int size = list.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            Measurable measurable = list.get(i12);
                            if (l0.g(LayoutIdKt.getLayoutId(measurable), str3)) {
                                Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
                                int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5) - mo4998measureBRTryo0.getWidth();
                                f5 = SnackbarKt.TextEndExtraSpacing;
                                u4 = u.u(m6000getMaxWidthimpl - measureScope.mo298roundToPx0680j_4(f5), Constraints.m6002getMinWidthimpl(j5));
                                String str4 = str2;
                                int size2 = list.size();
                                for (int i13 = 0; i13 < size2; i13++) {
                                    Measurable measurable2 = list.get(i13);
                                    if (l0.g(LayoutIdKt.getLayoutId(measurable2), str4)) {
                                        Placeable mo4998measureBRTryo02 = measurable2.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, u4, 0, 0, 9, null));
                                        int i14 = mo4998measureBRTryo02.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                                        boolean z6 = true;
                                        if (i14 != Integer.MIN_VALUE) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4) {
                                            int i15 = mo4998measureBRTryo02.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                                            if (i15 != Integer.MIN_VALUE) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z5) {
                                                if (i14 != i15) {
                                                    z6 = false;
                                                }
                                                int m6000getMaxWidthimpl2 = Constraints.m6000getMaxWidthimpl(j5) - mo4998measureBRTryo0.getWidth();
                                                if (z6) {
                                                    f8 = SnackbarKt.SnackbarMinHeightOneLine;
                                                    i9 = Math.max(measureScope.mo298roundToPx0680j_4(f8), mo4998measureBRTryo0.getHeight());
                                                    int height2 = (i9 - mo4998measureBRTryo02.getHeight()) / 2;
                                                    int i16 = mo4998measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                                                    if (i16 != Integer.MIN_VALUE) {
                                                        i11 = (i14 + height2) - i16;
                                                    }
                                                    height = i11;
                                                    i10 = height2;
                                                } else {
                                                    f6 = SnackbarKt.HeightToFirstLine;
                                                    int mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(f6) - i14;
                                                    f7 = SnackbarKt.SnackbarMinHeightTwoLines;
                                                    int max = Math.max(measureScope.mo298roundToPx0680j_4(f7), mo4998measureBRTryo02.getHeight() + mo298roundToPx0680j_4);
                                                    i9 = max;
                                                    i10 = mo298roundToPx0680j_4;
                                                    height = (max - mo4998measureBRTryo0.getHeight()) / 2;
                                                }
                                                return MeasureScope.layout$default(measureScope, Constraints.m6000getMaxWidthimpl(j5), i9, null, new AnonymousClass4(mo4998measureBRTryo02, i10, mo4998measureBRTryo0, m6000getMaxWidthimpl2, height), 4, null);
                                            }
                                            throw new IllegalArgumentException("No baselines for text".toString());
                                        }
                                        throw new IllegalArgumentException("No baselines for text".toString());
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            a<ComposeUiNode> constructor2 = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf(i6 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier layoutId = LayoutIdKt.layoutId(companion, "action");
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            a<ComposeUiNode> constructor3 = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(layoutId);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl3 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl3, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            pVar2.invoke(startRestartGroup, Integer.valueOf((i6 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SnackbarKt$OneRowSnackbar$3(pVar, pVar2, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00e1  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Snackbar-7zSek6w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1436Snackbar7zSek6w(@p4.m androidx.compose.ui.Modifier r27, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, boolean r29, @p4.m androidx.compose.ui.graphics.Shape r30, long r31, long r33, float r35, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r36, @p4.m androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.m1436Snackbar7zSek6w(androidx.compose.ui.Modifier, v3.p, boolean, androidx.compose.ui.graphics.Shape, long, long, float, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0181  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Snackbar-sPrSdHI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1437SnackbarsPrSdHI(@p4.l androidx.compose.material.SnackbarData r29, @p4.m androidx.compose.ui.Modifier r30, boolean r31, @p4.m androidx.compose.ui.graphics.Shape r32, long r33, long r35, long r37, float r39, @p4.m androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.m1437SnackbarsPrSdHI(androidx.compose.material.SnackbarData, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TextOnlySnackbar(p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(917397959);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
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
                ComposerKt.traceEventStart(917397959, i6, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:236)");
            }
            SnackbarKt$TextOnlySnackbar$2 snackbarKt$TextOnlySnackbar$2 = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2

                @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2$4, reason: invalid class name */
                /* loaded from: classes.dex */
                static final class AnonymousClass4 extends n0 implements l<Placeable.PlacementScope, r2> {
                    final /* synthetic */ int $containerHeight;
                    final /* synthetic */ Placeable $textPlaceable;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass4(int i5, Placeable placeable) {
                        super(1);
                        this.$containerHeight = i5;
                        this.$textPlaceable = placeable;
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                        Placeable.PlacementScope.placeRelative$default(placementScope, this.$textPlaceable, 0, (this.$containerHeight - this.$textPlaceable.getHeight()) / 2, 0.0f, 4, null);
                    }
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @p4.l
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                    boolean z4;
                    Object y22;
                    boolean z5;
                    float f5;
                    boolean z6 = false;
                    if (list.size() == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        y22 = e0.y2(list);
                        Placeable mo4998measureBRTryo0 = ((Measurable) y22).mo4998measureBRTryo0(j5);
                        int i8 = mo4998measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                        int i9 = mo4998measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                        if (i8 != Integer.MIN_VALUE) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (i9 != Integer.MIN_VALUE) {
                                z6 = true;
                            }
                            if (z6) {
                                if (i8 == i9) {
                                    f5 = SnackbarKt.SnackbarMinHeightOneLine;
                                } else {
                                    f5 = SnackbarKt.SnackbarMinHeightTwoLines;
                                }
                                int max = Math.max(measureScope.mo298roundToPx0680j_4(f5), mo4998measureBRTryo0.getHeight());
                                return MeasureScope.layout$default(measureScope, Constraints.m6000getMaxWidthimpl(j5), max, null, new AnonymousClass4(max, mo4998measureBRTryo0), 4, null);
                            }
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                        throw new IllegalArgumentException("No baselines for text".toString());
                    }
                    throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, snackbarKt$TextOnlySnackbar$2, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            Modifier m554paddingVpY3zN4 = PaddingKt.m554paddingVpY3zN4(companion, HorizontalSpacing, SnackbarVerticalPadding);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            a<ComposeUiNode> constructor2 = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m554paddingVpY3zN4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf(i6 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SnackbarKt$TextOnlySnackbar$3(pVar, i5));
        }
    }
}
