package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0099\u0001\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aj\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001ae\u0010\u001e\u001a\u00020\u00032\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001ag\u0010\"\u001a\u00020\u00032\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0003ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001d\"\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%\"\u0014\u0010'\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%\"\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%\"\u0014\u0010)\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%\"\u0014\u0010*\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010%\"\u0014\u0010+\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010%\"\u0014\u0010,\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "action", "dismissAction", "", "actionOnNewLine", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "actionContentColor", "dismissActionContentColor", "content", "Snackbar-eQBnUkQ", "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;ZLandroidx/compose/ui/graphics/Shape;JJJJLv3/p;Landroidx/compose/runtime/Composer;II)V", "Snackbar", "Landroidx/compose/material3/SnackbarData;", "snackbarData", "actionColor", "Snackbar-sDKtq54", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJLandroidx/compose/runtime/Composer;II)V", "text", "Landroidx/compose/ui/text/TextStyle;", "actionTextStyle", "NewLineButtonSnackbar-kKq0p4A", "(Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V", "NewLineButtonSnackbar", "actionTextColor", "dismissActionColor", "OneRowSnackbar-kKq0p4A", "OneRowSnackbar", "Landroidx/compose/ui/unit/Dp;", "ContainerMaxWidth", "F", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "SeparateButtonExtraY", "SnackbarVerticalPadding", "TextEndExtraSpacing", "LongButtonVerticalOffset", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,437:1\n154#2:438\n154#2:514\n154#2:601\n154#2:760\n154#2:761\n154#2:762\n154#2:763\n154#2:764\n154#2:765\n154#2:766\n154#2:767\n74#3,6:439\n80#3:473\n84#3:600\n78#4,11:445\n78#4,11:480\n91#4:512\n78#4,11:521\n78#4,11:557\n91#4:589\n91#4:594\n91#4:599\n78#4,11:608\n78#4,11:642\n91#4:674\n78#4,11:682\n91#4:714\n78#4,11:722\n91#4:754\n91#4:759\n456#5,8:456\n464#5,3:470\n456#5,8:491\n464#5,3:505\n467#5,3:509\n456#5,8:532\n464#5,3:546\n456#5,8:568\n464#5,3:582\n467#5,3:586\n467#5,3:591\n467#5,3:596\n456#5,8:619\n464#5,3:633\n456#5,8:653\n464#5,3:667\n467#5,3:671\n456#5,8:693\n464#5,3:707\n467#5,3:711\n456#5,8:733\n464#5,3:747\n467#5,3:751\n467#5,3:756\n3737#6,6:464\n3737#6,6:499\n3737#6,6:540\n3737#6,6:576\n3737#6,6:627\n3737#6,6:661\n3737#6,6:701\n3737#6,6:741\n68#7,6:474\n74#7:508\n78#7:513\n68#7,6:515\n74#7:549\n78#7:595\n68#7,6:636\n74#7:670\n78#7:675\n68#7,6:676\n74#7:710\n78#7:715\n68#7,6:716\n74#7:750\n78#7:755\n86#8,7:550\n93#8:585\n97#8:590\n1116#9,6:602\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n*L\n240#1:438\n279#1:514\n333#1:601\n429#1:760\n430#1:761\n431#1:762\n432#1:763\n433#1:764\n434#1:765\n435#1:766\n436#1:767\n262#1:439,6\n262#1:473\n262#1:600\n262#1:445,11\n272#1:480,11\n272#1:512\n277#1:521,11\n281#1:557,11\n281#1:589\n277#1:594\n262#1:599\n310#1:608,11\n312#1:642,11\n312#1:674\n314#1:682,11\n314#1:714\n323#1:722,11\n323#1:754\n310#1:759\n262#1:456,8\n262#1:470,3\n272#1:491,8\n272#1:505,3\n272#1:509,3\n277#1:532,8\n277#1:546,3\n281#1:568,8\n281#1:582,3\n281#1:586,3\n277#1:591,3\n262#1:596,3\n310#1:619,8\n310#1:633,3\n312#1:653,8\n312#1:667,3\n312#1:671,3\n314#1:693,8\n314#1:707,3\n314#1:711,3\n323#1:733,8\n323#1:747,3\n323#1:751,3\n310#1:756,3\n262#1:464,6\n272#1:499,6\n277#1:540,6\n281#1:576,6\n310#1:627,6\n312#1:661,6\n314#1:701,6\n323#1:741,6\n272#1:474,6\n272#1:508\n272#1:513\n277#1:515,6\n277#1:549\n277#1:595\n312#1:636,6\n312#1:670\n312#1:675\n314#1:676,6\n314#1:710\n314#1:715\n323#1:716,6\n323#1:750\n323#1:755\n281#1:550,7\n281#1:585\n281#1:590\n335#1:602,6\n*E\n"})
/* loaded from: classes.dex */
public final class SnackbarKt {
    private static final float HorizontalSpacingButtonSide;
    private static final float TextEndExtraSpacing;
    private static final float ContainerMaxWidth = Dp.m6044constructorimpl(600);
    private static final float HeightToFirstLine = Dp.m6044constructorimpl(30);
    private static final float HorizontalSpacing = Dp.m6044constructorimpl(16);
    private static final float SeparateButtonExtraY = Dp.m6044constructorimpl(2);
    private static final float SnackbarVerticalPadding = Dp.m6044constructorimpl(6);
    private static final float LongButtonVerticalOffset = Dp.m6044constructorimpl(12);

    static {
        float f5 = 8;
        HorizontalSpacingButtonSide = Dp.m6044constructorimpl(f5);
        TextEndExtraSpacing = Dp.m6044constructorimpl(f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NewLineButtonSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m2218NewLineButtonSnackbarkKq0p4A(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, TextStyle textStyle, long j5, long j6, Composer composer, int i5) {
        int i6;
        float m6044constructorimpl;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1332496681);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i6 = i12 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i6 |= i11;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i6 |= i10;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i6 |= i9;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changed(j5)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i6 |= i8;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changed(j6)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i6 |= i7;
        }
        if ((74899 & i6) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1332496681, i6, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:260)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m609widthInVpY3zN4$default(companion, 0.0f, ContainerMaxWidth, 1, null), 0.0f, 1, null), HorizontalSpacing, 0.0f, 0.0f, SeparateButtonExtraY, 6, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
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
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier m436paddingFromBaselineVpY3zN4 = AlignmentLineKt.m436paddingFromBaselineVpY3zN4(companion, HeightToFirstLine, LongButtonVerticalOffset);
            float f5 = HorizontalSpacingButtonSide;
            Modifier m557paddingqDBjuR0$default2 = PaddingKt.m557paddingqDBjuR0$default(m436paddingFromBaselineVpY3zN4, 0.0f, 0.0f, f5, 0.0f, 11, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default2);
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
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
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
            if (pVar3 == null) {
                m6044constructorimpl = f5;
            } else {
                m6044constructorimpl = Dp.m6044constructorimpl(0);
            }
            Modifier m557paddingqDBjuR0$default3 = PaddingKt.m557paddingqDBjuR0$default(align, 0.0f, 0.0f, m6044constructorimpl, 0.0f, 11, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default3);
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
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl3.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor4 = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl4 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl4, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl4.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(j5)), TextKt.getLocalTextStyle().provides(textStyle)}, pVar2, startRestartGroup, i6 & 112);
            startRestartGroup.startReplaceableGroup(302367084);
            if (pVar3 != null) {
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(j6)), pVar3, startRestartGroup, ((i6 >> 3) & 112) | ProvidedValue.$stable | 0);
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
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
            endRestartGroup.updateScope(new SnackbarKt$NewLineButtonSnackbar$2(pVar, pVar2, pVar3, textStyle, j5, j6, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: OneRowSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m2219OneRowSnackbarkKq0p4A(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, TextStyle textStyle, long j5, long j6, Composer composer, int i5) {
        int i6;
        float m6044constructorimpl;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-903235475);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i6 = i12 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i6 |= i11;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i6 |= i10;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i6 |= i9;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changed(j5)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i6 |= i8;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changed(j6)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i6 |= i7;
        }
        if ((74899 & i6) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903235475, i6, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:305)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = HorizontalSpacing;
            if (pVar3 == null) {
                m6044constructorimpl = HorizontalSpacingButtonSide;
            } else {
                m6044constructorimpl = Dp.m6044constructorimpl(0);
            }
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(companion, f5, 0.0f, m6044constructorimpl, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(44739392);
            Object rememberedValue = startRestartGroup.rememberedValue();
            final String str = "text";
            final String str2 = "action";
            final String str3 = "dismissAction";
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1

                    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1$4, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass4 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
                        final /* synthetic */ int $actionButtonPlaceX;
                        final /* synthetic */ int $actionButtonPlaceY;
                        final /* synthetic */ Placeable $actionButtonPlaceable;
                        final /* synthetic */ int $dismissButtonPlaceX;
                        final /* synthetic */ int $dismissButtonPlaceY;
                        final /* synthetic */ Placeable $dismissButtonPlaceable;
                        final /* synthetic */ int $textPlaceY;
                        final /* synthetic */ Placeable $textPlaceable;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass4(Placeable placeable, int i5, Placeable placeable2, int i6, int i7, Placeable placeable3, int i8, int i9) {
                            super(1);
                            this.$textPlaceable = placeable;
                            this.$textPlaceY = i5;
                            this.$dismissButtonPlaceable = placeable2;
                            this.$dismissButtonPlaceX = i6;
                            this.$dismissButtonPlaceY = i7;
                            this.$actionButtonPlaceable = placeable3;
                            this.$actionButtonPlaceX = i8;
                            this.$actionButtonPlaceY = i9;
                        }

                        @Override // v3.l
                        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                            Placeable.PlacementScope.placeRelative$default(placementScope, this.$textPlaceable, 0, this.$textPlaceY, 0.0f, 4, null);
                            Placeable placeable = this.$dismissButtonPlaceable;
                            if (placeable != null) {
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, this.$dismissButtonPlaceX, this.$dismissButtonPlaceY, 0.0f, 4, null);
                            }
                            Placeable placeable2 = this.$actionButtonPlaceable;
                            if (placeable2 != null) {
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, this.$actionButtonPlaceX, this.$actionButtonPlaceY, 0.0f, 4, null);
                            }
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j7) {
                        float f6;
                        Placeable placeable;
                        Measurable measurable;
                        Placeable placeable2;
                        Measurable measurable2;
                        int i13;
                        int i14;
                        int i15;
                        int i16;
                        int i17;
                        int u4;
                        boolean z4;
                        boolean z5;
                        float f7;
                        int max;
                        int i18;
                        int i19;
                        int i20;
                        int i21;
                        int i22;
                        int i23;
                        float f8;
                        int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j7);
                        f6 = SnackbarKt.ContainerMaxWidth;
                        int min = Math.min(m6000getMaxWidthimpl, measureScope.mo298roundToPx0680j_4(f6));
                        String str4 = str2;
                        int size = list.size();
                        int i24 = 0;
                        while (true) {
                            placeable = null;
                            if (i24 < size) {
                                measurable = list.get(i24);
                                if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable), str4)) {
                                    break;
                                }
                                i24++;
                            } else {
                                measurable = null;
                                break;
                            }
                        }
                        Measurable measurable3 = measurable;
                        if (measurable3 != null) {
                            placeable2 = measurable3.mo4998measureBRTryo0(j7);
                        } else {
                            placeable2 = null;
                        }
                        String str5 = str3;
                        int size2 = list.size();
                        int i25 = 0;
                        while (true) {
                            if (i25 < size2) {
                                measurable2 = list.get(i25);
                                if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable2), str5)) {
                                    break;
                                }
                                i25++;
                            } else {
                                measurable2 = null;
                                break;
                            }
                        }
                        Measurable measurable4 = measurable2;
                        if (measurable4 != null) {
                            placeable = measurable4.mo4998measureBRTryo0(j7);
                        }
                        Placeable placeable3 = placeable;
                        if (placeable2 != null) {
                            i13 = placeable2.getWidth();
                        } else {
                            i13 = 0;
                        }
                        if (placeable2 != null) {
                            i14 = placeable2.getHeight();
                        } else {
                            i14 = 0;
                        }
                        if (placeable3 != null) {
                            i15 = placeable3.getWidth();
                        } else {
                            i15 = 0;
                        }
                        if (placeable3 != null) {
                            i16 = placeable3.getHeight();
                        } else {
                            i16 = 0;
                        }
                        if (i15 == 0) {
                            f8 = SnackbarKt.TextEndExtraSpacing;
                            i17 = measureScope.mo298roundToPx0680j_4(f8);
                        } else {
                            i17 = 0;
                        }
                        u4 = kotlin.ranges.u.u(((min - i13) - i15) - i17, Constraints.m6002getMinWidthimpl(j7));
                        String str6 = str;
                        int size3 = list.size();
                        int i26 = 0;
                        while (i26 < size3) {
                            Measurable measurable5 = list.get(i26);
                            if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable5), str6)) {
                                int i27 = i16;
                                Placeable mo4998measureBRTryo0 = measurable5.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j7, 0, u4, 0, 0, 9, null));
                                int i28 = mo4998measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                                boolean z6 = true;
                                if (i28 != Integer.MIN_VALUE) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    int i29 = mo4998measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                                    if (i29 != Integer.MIN_VALUE) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        if (i28 != i29) {
                                            z6 = false;
                                        }
                                        int i30 = min - i15;
                                        int i31 = i30 - i13;
                                        if (z6) {
                                            int max2 = Math.max(measureScope.mo298roundToPx0680j_4(SnackbarTokens.INSTANCE.m3126getSingleLineContainerHeightD9Ej5fM()), Math.max(i14, i27));
                                            int height = (max2 - mo4998measureBRTryo0.getHeight()) / 2;
                                            if (placeable2 != null && (i23 = placeable2.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline())) != Integer.MIN_VALUE) {
                                                i22 = (i28 + height) - i23;
                                            } else {
                                                i22 = 0;
                                            }
                                            i20 = i22;
                                            i19 = height;
                                            max = max2;
                                        } else {
                                            f7 = SnackbarKt.HeightToFirstLine;
                                            int mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(f7) - i28;
                                            max = Math.max(measureScope.mo298roundToPx0680j_4(SnackbarTokens.INSTANCE.m3127getTwoLinesContainerHeightD9Ej5fM()), mo4998measureBRTryo0.getHeight() + mo298roundToPx0680j_4);
                                            if (placeable2 != null) {
                                                i18 = (max - placeable2.getHeight()) / 2;
                                            } else {
                                                i18 = 0;
                                            }
                                            i19 = mo298roundToPx0680j_4;
                                            i20 = i18;
                                        }
                                        if (placeable3 != null) {
                                            i21 = (max - placeable3.getHeight()) / 2;
                                        } else {
                                            i21 = 0;
                                        }
                                        return MeasureScope.layout$default(measureScope, min, max, null, new AnonymousClass4(mo4998measureBRTryo0, i19, placeable3, i30, i21, placeable2, i31, i20), 4, null);
                                    }
                                    throw new IllegalArgumentException("No baselines for text".toString());
                                }
                                throw new IllegalArgumentException("No baselines for text".toString());
                            }
                            i26++;
                            i16 = i16;
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
            v3.a<ComposeUiNode> constructor = companion2.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
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
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
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
            v3.a<ComposeUiNode> constructor2 = companion2.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
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
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
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
            startRestartGroup.startReplaceableGroup(-167734260);
            if (pVar2 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(companion, "action");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor3 = companion2.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(layoutId);
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
                v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (m3264constructorimpl3.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(j5)), TextKt.getLocalTextStyle().provides(textStyle)}, pVar2, startRestartGroup, i6 & 112);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(44738899);
            if (pVar3 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(companion, "dismissAction");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor4 = companion2.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(layoutId2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3264constructorimpl4 = Updater.m3264constructorimpl(startRestartGroup);
                Updater.m3271setimpl(m3264constructorimpl4, rememberBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                if (m3264constructorimpl4.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(j6)), pVar3, startRestartGroup, ((i6 >> 3) & 112) | ProvidedValue.$stable | 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
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
            endRestartGroup.updateScope(new SnackbarKt$OneRowSnackbar$3(pVar, pVar2, pVar3, textStyle, j5, j6, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0195  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Snackbar-eQBnUkQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2220SnackbareQBnUkQ(@p4.m androidx.compose.ui.Modifier r25, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r26, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r27, boolean r28, @p4.m androidx.compose.ui.graphics.Shape r29, long r30, long r32, long r34, long r36, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, @p4.m androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.m2220SnackbareQBnUkQ(androidx.compose.ui.Modifier, v3.p, v3.p, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f8  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Snackbar-sDKtq54, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2221SnackbarsDKtq54(@p4.l androidx.compose.material3.SnackbarData r39, @p4.m androidx.compose.ui.Modifier r40, boolean r41, @p4.m androidx.compose.ui.graphics.Shape r42, long r43, long r45, long r47, long r49, long r51, @p4.m androidx.compose.runtime.Composer r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.m2221SnackbarsDKtq54(androidx.compose.material3.SnackbarData, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, long, androidx.compose.runtime.Composer, int, int):void");
    }
}
