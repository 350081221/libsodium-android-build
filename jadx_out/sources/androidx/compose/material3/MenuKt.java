package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a[\u0010\u0010\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0082\u0001\u0010\u001e\u001a\u00020\f2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\f0\u0012¢\u0006\u0002\b\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012¢\u0006\u0002\b\r2\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012¢\u0006\u0002\b\r2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0000¢\u0006\u0004\b#\u0010$\"\u001a\u0010&\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'\"\u001a\u0010+\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)\"\u0014\u0010-\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010'\"\u0014\u0010.\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010'\"\u0014\u00100\u001a\u00020/8\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00102\u001a\u00020/8\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u00101¨\u00066²\u0006\f\u00104\u001a\u0002038\nX\u008a\u0084\u0002²\u0006\f\u00105\u001a\u0002038\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "", "expandedState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOriginState", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "DropdownMenuContent", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/Modifier;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "Landroidx/compose/material3/MenuItemColors;", "colors", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "DropdownMenuItemContent", "(Lv3/p;Lv3/a;Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "menuBounds", "calculateTransformOrigin", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "Landroidx/compose/ui/unit/Dp;", "MenuVerticalMargin", "F", "getMenuVerticalMargin", "()F", "DropdownMenuItemHorizontalPadding", "DropdownMenuVerticalPadding", "getDropdownMenuVerticalPadding", "DropdownMenuItemDefaultMinWidth", "DropdownMenuItemDefaultMaxWidth", "", "InTransitionDuration", "I", "OutTransitionDuration", "", "scale", "alpha", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,407:1\n1163#2,4:408\n1083#2,5:412\n1163#2,4:417\n1083#2,5:421\n1116#3,6:426\n87#4,6:432\n93#4:466\n97#4:471\n78#5,11:438\n91#5:470\n456#6,8:449\n464#6,3:463\n467#6,3:467\n3737#7,6:457\n81#8:472\n81#8:473\n154#9:474\n154#9:475\n154#9:476\n154#9:477\n154#9:478\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt\n*L\n238#1:408,4\n238#1:412,5\n258#1:417,4\n258#1:421,5\n273#1:426,6\n307#1:432,6\n307#1:466\n307#1:471\n307#1:438,11\n307#1:470\n307#1:449,8\n307#1:463,3\n307#1:467,3\n307#1:457,6\n238#1:472\n258#1:473\n398#1:474\n399#1:475\n400#1:476\n401#1:477\n402#1:478\n*E\n"})
/* loaded from: classes.dex */
public final class MenuKt {
    public static final int InTransitionDuration = 120;
    public static final int OutTransitionDuration = 75;
    private static final float MenuVerticalMargin = Dp.m6044constructorimpl(48);
    private static final float DropdownMenuItemHorizontalPadding = Dp.m6044constructorimpl(12);
    private static final float DropdownMenuVerticalPadding = Dp.m6044constructorimpl(8);
    private static final float DropdownMenuItemDefaultMinWidth = Dp.m6044constructorimpl(112);
    private static final float DropdownMenuItemDefaultMaxWidth = Dp.m6044constructorimpl(280);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0084  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DropdownMenuContent(@p4.l androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r24, @p4.l androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.TransformOrigin> r25, @p4.l androidx.compose.foundation.ScrollState r26, @p4.m androidx.compose.ui.Modifier r27, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.m androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.DropdownMenuContent(androidx.compose.animation.core.MutableTransitionState, androidx.compose.runtime.MutableState, androidx.compose.foundation.ScrollState, androidx.compose.ui.Modifier, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DropdownMenuContent$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DropdownMenuContent$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuItemContent(@p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.l v3.a<r2> aVar, @p4.l Modifier modifier, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar2, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar3, boolean z4, @p4.l MenuItemColors menuItemColors, @p4.l PaddingValues paddingValues, @p4.l MutableInteractionSource mutableInteractionSource, @p4.m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1564716777);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i6 = i15 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i6 |= i14;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i6 |= i13;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i6 |= i12;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i6 |= i11;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changed(z4)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i6 |= i10;
        }
        if ((1572864 & i5) == 0) {
            if (startRestartGroup.changed(menuItemColors)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i6 |= i9;
        }
        if ((12582912 & i5) == 0) {
            if (startRestartGroup.changed(paddingValues)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i6 |= i8;
        }
        if ((100663296 & i5) == 0) {
            if (startRestartGroup.changed(mutableInteractionSource)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i6 |= i7;
        }
        if ((38347923 & i6) == 38347922 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1564716777, i6, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:304)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(ClickableKt.m233clickableO2vRcR0$default(modifier, mutableInteractionSource, RippleKt.m1541rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6), z4, null, null, aVar, 24, null), 0.0f, 1, null);
            float f5 = DropdownMenuItemDefaultMinWidth;
            float f6 = DropdownMenuItemDefaultMaxWidth;
            MenuTokens menuTokens = MenuTokens.INSTANCE;
            Modifier padding = PaddingKt.padding(SizeKt.m606sizeInqDBjuR0$default(fillMaxWidth$default, f5, menuTokens.m2944getListItemContainerHeightD9Ej5fM(), f6, 0.0f, 8, null), paddingValues);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
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
            Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), menuTokens.getListItemLabelTextFont()), ComposableLambdaKt.composableLambda(startRestartGroup, 1065051884, true, new MenuKt$DropdownMenuItemContent$1$1(pVar2, menuItemColors, z4, pVar3, RowScopeInstance.INSTANCE, pVar)), startRestartGroup, 48);
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
            endRestartGroup.updateScope(new MenuKt$DropdownMenuItemContent$2(pVar, aVar, modifier, pVar2, pVar3, z4, menuItemColors, paddingValues, mutableInteractionSource, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long calculateTransformOrigin(@p4.l androidx.compose.ui.unit.IntRect r5, @p4.l androidx.compose.ui.unit.IntRect r6) {
        /*
            int r0 = r6.getLeft()
            int r1 = r5.getRight()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto Lf
        Ld:
            r0 = r3
            goto L49
        Lf:
            int r0 = r6.getRight()
            int r1 = r5.getLeft()
            if (r0 > r1) goto L1b
            r0 = r2
            goto L49
        L1b:
            int r0 = r6.getWidth()
            if (r0 != 0) goto L22
            goto Ld
        L22:
            int r0 = r5.getLeft()
            int r1 = r6.getLeft()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.getRight()
            int r4 = r6.getRight()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
        L49:
            int r1 = r6.getTop()
            int r4 = r5.getBottom()
            if (r1 < r4) goto L55
        L53:
            r2 = r3
            goto L8f
        L55:
            int r1 = r6.getBottom()
            int r4 = r5.getTop()
            if (r1 > r4) goto L60
            goto L8f
        L60:
            int r1 = r6.getHeight()
            if (r1 != 0) goto L67
            goto L53
        L67:
            int r1 = r5.getTop()
            int r2 = r6.getTop()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.getBottom()
            int r2 = r6.getBottom()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.getTop()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r2 = r5 / r6
        L8f:
            long r5 = androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.calculateTransformOrigin(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }
}
