package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.alipay.sdk.m.x.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a{\u0010\u000f\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u0011\u001a\u00020\u0001*\u00020\u00102\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f\"\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "buttons", "Landroidx/compose/ui/Modifier;", "modifier", d.f3030v, "text", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "AlertDialogContent-WMdw5o4", "(Lv3/p;Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V", "AlertDialogContent", "Landroidx/compose/foundation/layout/ColumnScope;", "AlertDialogBaselineLayout", "(Landroidx/compose/foundation/layout/ColumnScope;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "content", "AlertDialogFlowRow-ixp7dh8", "(FFLv3/p;Landroidx/compose/runtime/Composer;I)V", "AlertDialogFlowRow", "TitlePadding", "Landroidx/compose/ui/Modifier;", "TextPadding", "Landroidx/compose/ui/unit/TextUnit;", "TitleBaselineDistanceFromTop", "J", "TextBaselineDistanceFromTitle", "TextBaselineDistanceFromTop", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,295:1\n79#2,11:296\n79#2,11:330\n92#2:362\n79#2,11:370\n92#2:402\n92#2:407\n76#2,14:414\n92#2:448\n456#3,8:307\n464#3,3:321\n456#3,8:341\n464#3,3:355\n467#3,3:359\n456#3,8:381\n464#3,3:395\n467#3,3:399\n467#3,3:404\n456#3,8:428\n464#3,6:442\n3737#4,6:315\n3737#4,6:349\n3737#4,6:389\n3737#4,6:436\n68#5,6:324\n74#5:358\n78#5:363\n68#5,6:364\n74#5:398\n78#5:403\n1116#6,6:408\n154#7:449\n154#7:450\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n*L\n99#1:296,11\n102#1:330,11\n102#1:362\n107#1:370,11\n107#1:402\n99#1:407\n195#1:414,14\n195#1:448\n99#1:307,8\n99#1:321,3\n102#1:341,8\n102#1:355,3\n102#1:359,3\n107#1:381,8\n107#1:395,3\n107#1:399,3\n99#1:404,3\n195#1:428,8\n195#1:442,6\n99#1:315,6\n102#1:349,6\n107#1:389,6\n195#1:436,6\n102#1:324,6\n102#1:358\n102#1:363\n107#1:364,6\n107#1:398\n107#1:403\n195#1:408,6\n286#1:449\n287#1:450\n*E\n"})
/* loaded from: classes.dex */
public final class AlertDialogKt {
    private static final long TextBaselineDistanceFromTitle;
    private static final long TextBaselineDistanceFromTop;

    @l
    private static final Modifier TextPadding;
    private static final long TitleBaselineDistanceFromTop;

    @l
    private static final Modifier TitlePadding;

    static {
        Modifier.Companion companion = Modifier.Companion;
        float f5 = 24;
        TitlePadding = PaddingKt.m557paddingqDBjuR0$default(companion, Dp.m6044constructorimpl(f5), 0.0f, Dp.m6044constructorimpl(f5), 0.0f, 10, null);
        TextPadding = PaddingKt.m557paddingqDBjuR0$default(companion, Dp.m6044constructorimpl(f5), 0.0f, Dp.m6044constructorimpl(f5), Dp.m6044constructorimpl(28), 2, null);
        TitleBaselineDistanceFromTop = TextUnitKt.getSp(40);
        TextBaselineDistanceFromTitle = TextUnitKt.getSp(36);
        TextBaselineDistanceFromTop = TextUnitKt.getSp(38);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void AlertDialogBaselineLayout(@l ColumnScope columnScope, @m p<? super Composer, ? super Integer, r2> pVar, @m p<? super Composer, ? super Integer, r2> pVar2, @m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-555573207);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(columnScope)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-555573207, i6, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:97)");
            }
            Modifier weight = columnScope.weight(Modifier.Companion, 1.0f, false);
            AlertDialogKt$AlertDialogBaselineLayout$2 alertDialogKt$AlertDialogBaselineLayout$2 = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2

                @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                static final class AnonymousClass1 extends n0 implements v3.l<Placeable.PlacementScope, r2> {
                    final /* synthetic */ Placeable $textPlaceable;
                    final /* synthetic */ int $textPositionY;
                    final /* synthetic */ Placeable $titlePlaceable;
                    final /* synthetic */ int $titlePositionY;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Placeable placeable, int i5, Placeable placeable2, int i6) {
                        super(1);
                        this.$titlePlaceable = placeable;
                        this.$titlePositionY = i5;
                        this.$textPlaceable = placeable2;
                        this.$textPositionY = i6;
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@l Placeable.PlacementScope placementScope) {
                        Placeable placeable = this.$titlePlaceable;
                        if (placeable != null) {
                            Placeable.PlacementScope.place$default(placementScope, placeable, 0, this.$titlePositionY, 0.0f, 4, null);
                        }
                        Placeable placeable2 = this.$textPlaceable;
                        if (placeable2 != null) {
                            Placeable.PlacementScope.place$default(placementScope, placeable2, 0, this.$textPositionY, 0.0f, 4, null);
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00f2  */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                @p4.l
                /* renamed from: measure-3p2s80s */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final androidx.compose.ui.layout.MeasureResult mo30measure3p2s80s(@p4.l androidx.compose.ui.layout.MeasureScope r17, @p4.l java.util.List<? extends androidx.compose.ui.layout.Measurable> r18, long r19) {
                    /*
                        Method dump skipped, instructions count: 321
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2.mo30measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(weight);
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
            Updater.m3271setimpl(m3264constructorimpl, alertDialogKt$AlertDialogBaselineLayout$2, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1160646114);
            if (pVar != null) {
                Modifier layoutId = LayoutIdKt.layoutId(TitlePadding, d.f3030v);
                Alignment.Companion companion2 = Alignment.Companion;
                Modifier align = columnScope.align(layoutId, companion2.getStart());
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                a<ComposeUiNode> constructor2 = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(align);
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
                Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
                if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                pVar.invoke(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1735756505);
            if (pVar2 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(TextPadding, "text");
                Alignment.Companion companion3 = Alignment.Companion;
                Modifier align2 = columnScope.align(layoutId2, companion3.getStart());
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                a<ComposeUiNode> constructor3 = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(align2);
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
                Updater.m3271setimpl(m3264constructorimpl3, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
                if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                pVar2.invoke(startRestartGroup, 0);
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
            endRestartGroup.updateScope(new AlertDialogKt$AlertDialogBaselineLayout$3(columnScope, pVar, pVar2, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00af  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogContent-WMdw5o4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1191AlertDialogContentWMdw5o4(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r25, @p4.m androidx.compose.ui.Modifier r26, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r27, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.m androidx.compose.ui.graphics.Shape r29, long r30, long r32, @p4.m androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt.m1191AlertDialogContentWMdw5o4(v3.p, androidx.compose.ui.Modifier, v3.p, v3.p, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m1192AlertDialogFlowRowixp7dh8(final float f5, final float f6, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(73434452);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(f5)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(f6)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(73434452, i6, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:193)");
            }
            startRestartGroup.startReplaceableGroup(-2007963684);
            boolean changed = startRestartGroup.changed(f5) | startRestartGroup.changed(f6);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1

                    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @r1({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,295:1\n69#2,4:296\n69#2,6:300\n74#2:306\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2\n*L\n263#1:296,4\n275#1:300,6\n263#1:306\n*E\n"})
                    /* renamed from: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1$2, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass2 extends n0 implements v3.l<Placeable.PlacementScope, r2> {
                        final /* synthetic */ List<Integer> $crossAxisPositions;
                        final /* synthetic */ int $mainAxisLayoutSize;
                        final /* synthetic */ float $mainAxisSpacing;
                        final /* synthetic */ List<List<Placeable>> $sequences;
                        final /* synthetic */ MeasureScope $this_Layout;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(List<List<Placeable>> list, MeasureScope measureScope, float f5, int i5, List<Integer> list2) {
                            super(1);
                            this.$sequences = list;
                            this.$this_Layout = measureScope;
                            this.$mainAxisSpacing = f5;
                            this.$mainAxisLayoutSize = i5;
                            this.$crossAxisPositions = list2;
                        }

                        @Override // v3.l
                        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@l Placeable.PlacementScope placementScope) {
                            int G;
                            List<List<Placeable>> list = this.$sequences;
                            MeasureScope measureScope = this.$this_Layout;
                            float f5 = this.$mainAxisSpacing;
                            int i5 = this.$mainAxisLayoutSize;
                            List<Integer> list2 = this.$crossAxisPositions;
                            int size = list.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                List<Placeable> list3 = list.get(i6);
                                int size2 = list3.size();
                                int[] iArr = new int[size2];
                                int i7 = 0;
                                while (i7 < size2) {
                                    int width = list3.get(i7).getWidth();
                                    G = w.G(list3);
                                    iArr[i7] = width + (i7 < G ? measureScope.mo298roundToPx0680j_4(f5) : 0);
                                    i7++;
                                }
                                Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
                                int[] iArr2 = new int[size2];
                                for (int i8 = 0; i8 < size2; i8++) {
                                    iArr2[i8] = 0;
                                }
                                bottom.arrange(measureScope, i5, iArr, iArr2);
                                int size3 = list3.size();
                                for (int i9 = 0; i9 < size3; i9++) {
                                    Placeable.PlacementScope.place$default(placementScope, list3.get(i9), iArr2[i9], list2.get(i6).intValue(), 0.0f, 4, null);
                                }
                            }
                        }
                    }

                    private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, k1.f fVar, MeasureScope measureScope, float f7, long j5, Placeable placeable) {
                        if (!list.isEmpty() && fVar.element + measureScope.mo298roundToPx0680j_4(f7) + placeable.getWidth() > Constraints.m6000getMaxWidthimpl(j5)) {
                            return false;
                        }
                        return true;
                    }

                    private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, k1.f fVar, MeasureScope measureScope, float f7, List<Placeable> list2, List<Integer> list3, k1.f fVar2, List<Integer> list4, k1.f fVar3, k1.f fVar4) {
                        List<Placeable> S5;
                        if (!list.isEmpty()) {
                            fVar.element += measureScope.mo298roundToPx0680j_4(f7);
                        }
                        S5 = e0.S5(list2);
                        list.add(0, S5);
                        list3.add(Integer.valueOf(fVar2.element));
                        list4.add(Integer.valueOf(fVar.element));
                        fVar.element += fVar2.element;
                        fVar3.element = Math.max(fVar3.element, fVar4.element);
                        list2.clear();
                        fVar4.element = 0;
                        fVar2.element = 0;
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
                        AlertDialogKt$AlertDialogFlowRow$1$1 alertDialogKt$AlertDialogFlowRow$1$1;
                        int max;
                        k1.f fVar;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        k1.f fVar2;
                        k1.f fVar3;
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        k1.f fVar4 = new k1.f();
                        k1.f fVar5 = new k1.f();
                        ArrayList arrayList6 = new ArrayList();
                        k1.f fVar6 = new k1.f();
                        k1.f fVar7 = new k1.f();
                        long Constraints$default = ConstraintsKt.Constraints$default(0, Constraints.m6000getMaxWidthimpl(j5), 0, 0, 13, null);
                        float f7 = f5;
                        float f8 = f6;
                        int size = list.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Placeable mo4998measureBRTryo0 = list.get(i10).mo4998measureBRTryo0(Constraints$default);
                            int i11 = i10;
                            int i12 = size;
                            float f9 = f8;
                            long j6 = Constraints$default;
                            float f10 = f7;
                            if (!measure_3p2s80s$canAddToCurrentSequence(arrayList6, fVar6, measureScope, f7, j5, mo4998measureBRTryo0)) {
                                arrayList2 = arrayList4;
                                fVar2 = fVar7;
                                fVar = fVar6;
                                arrayList = arrayList6;
                                measure_3p2s80s$startNewSequence(arrayList3, fVar5, measureScope, f9, arrayList6, arrayList4, fVar7, arrayList5, fVar4, fVar);
                            } else {
                                fVar = fVar6;
                                arrayList = arrayList6;
                                arrayList2 = arrayList4;
                                fVar2 = fVar7;
                            }
                            if (!arrayList.isEmpty()) {
                                fVar3 = fVar;
                                fVar3.element += measureScope.mo298roundToPx0680j_4(f10);
                            } else {
                                fVar3 = fVar;
                            }
                            ArrayList arrayList7 = arrayList;
                            arrayList7.add(mo4998measureBRTryo0);
                            fVar3.element += mo4998measureBRTryo0.getWidth();
                            fVar2.element = Math.max(fVar2.element, mo4998measureBRTryo0.getHeight());
                            i10 = i11 + 1;
                            f7 = f10;
                            fVar6 = fVar3;
                            fVar7 = fVar2;
                            size = i12;
                            f8 = f9;
                            arrayList4 = arrayList2;
                            arrayList6 = arrayList7;
                            Constraints$default = j6;
                        }
                        ArrayList arrayList8 = arrayList6;
                        ArrayList arrayList9 = arrayList4;
                        k1.f fVar8 = fVar7;
                        k1.f fVar9 = fVar6;
                        if (!arrayList8.isEmpty()) {
                            alertDialogKt$AlertDialogFlowRow$1$1 = this;
                            measure_3p2s80s$startNewSequence(arrayList3, fVar5, measureScope, f6, arrayList8, arrayList9, fVar8, arrayList5, fVar4, fVar9);
                        } else {
                            alertDialogKt$AlertDialogFlowRow$1$1 = this;
                        }
                        if (Constraints.m6000getMaxWidthimpl(j5) != Integer.MAX_VALUE) {
                            max = Constraints.m6000getMaxWidthimpl(j5);
                        } else {
                            max = Math.max(fVar4.element, Constraints.m6002getMinWidthimpl(j5));
                        }
                        int i13 = max;
                        return MeasureScope.layout$default(measureScope, i13, Math.max(fVar5.element, Constraints.m6001getMinHeightimpl(j5)), null, new AnonymousClass2(arrayList3, measureScope, f5, i13, arrayList5), 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            int i10 = (i6 >> 6) & 14;
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            int i11 = ((i10 << 9) & 7168) | 6;
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
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i11 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            pVar.invoke(startRestartGroup, Integer.valueOf((i11 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AlertDialogKt$AlertDialogFlowRow$2(f5, f6, pVar, i5));
        }
    }
}
