package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ao\u0010\u0012\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001ao\u0010\u0014\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u001ao\u0010\u0016\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011\u001az\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u008c\u0001\u0010\u001c\u001a\u00020\u00012\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000e2\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\"\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%\"\u0014\u0010'\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%\"\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%\"\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/material3/FloatingActionButtonElevation;", "elevation", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/runtime/Composable;", "content", "FloatingActionButton-X-z6DiA", "(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "SmallFloatingActionButton-X-z6DiA", "SmallFloatingActionButton", "LargeFloatingActionButton-X-z6DiA", "LargeFloatingActionButton", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/u;", "ExtendedFloatingActionButton-X-z6DiA", "(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "ExtendedFloatingActionButton", "text", "icon", "", "expanded", "ExtendedFloatingActionButton-ElI5-7k", "(Lv3/p;Lv3/p;Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "ExtendedFabStartIconPadding", "F", "ExtendedFabEndIconPadding", "ExtendedFabTextPadding", "ExtendedFabMinimumWidth", "Landroidx/compose/animation/ExitTransition;", "ExtendedFabCollapseAnimation", "Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/animation/EnterTransition;", "ExtendedFabExpandAnimation", "Landroidx/compose/animation/EnterTransition;", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,671:1\n1116#2,6:672\n1116#2,6:678\n1116#2,6:684\n1116#2,6:690\n1116#2,6:696\n154#3:702\n154#3:703\n154#3:704\n154#3:705\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n*L\n101#1:672,6\n164#1:678,6\n216#1:684,6\n271#1:690,6\n341#1:696,6\n637#1:702\n639#1:703\n641#1:704\n643#1:705\n*E\n"})
/* loaded from: classes.dex */
public final class FloatingActionButtonKt {

    @p4.l
    private static final ExitTransition ExtendedFabCollapseAnimation;

    @p4.l
    private static final EnterTransition ExtendedFabExpandAnimation;
    private static final float ExtendedFabStartIconPadding = Dp.m6044constructorimpl(16);
    private static final float ExtendedFabEndIconPadding = Dp.m6044constructorimpl(12);
    private static final float ExtendedFabTextPadding = Dp.m6044constructorimpl(20);
    private static final float ExtendedFabMinimumWidth = Dp.m6044constructorimpl(80);

    static {
        MotionTokens motionTokens = MotionTokens.INSTANCE;
        ExitTransition fadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, motionTokens.getEasingLinearCubicBezier(), 2, null), 0.0f, 2, null);
        TweenSpec tween$default = AnimationSpecKt.tween$default(500, 0, motionTokens.getEasingEmphasizedCubicBezier(), 2, null);
        Alignment.Companion companion = Alignment.Companion;
        ExtendedFabCollapseAnimation = fadeOut$default.plus(EnterExitTransitionKt.shrinkHorizontally$default(tween$default, companion.getStart(), false, null, 12, null));
        ExtendedFabExpandAnimation = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween(200, 100, motionTokens.getEasingLinearCubicBezier()), 0.0f, 2, null).plus(EnterExitTransitionKt.expandHorizontally$default(AnimationSpecKt.tween$default(500, 0, motionTokens.getEasingEmphasizedCubicBezier(), 2, null), companion.getStart(), false, null, 12, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ExtendedFloatingActionButton-ElI5-7k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1902ExtendedFloatingActionButtonElI57k(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r30, @p4.l v3.a<kotlin.r2> r31, @p4.m androidx.compose.ui.Modifier r32, boolean r33, @p4.m androidx.compose.ui.graphics.Shape r34, long r35, long r37, @p4.m androidx.compose.material3.FloatingActionButtonElevation r39, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r40, @p4.m androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m1902ExtendedFloatingActionButtonElI57k(v3.p, v3.p, v3.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: ExtendedFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1903ExtendedFloatingActionButtonXz6DiA(@p4.l v3.a<kotlin.r2> r26, @p4.m androidx.compose.ui.Modifier r27, @p4.m androidx.compose.ui.graphics.Shape r28, long r29, long r31, @p4.m androidx.compose.material3.FloatingActionButtonElevation r33, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r34, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r35, @p4.m androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m1903ExtendedFloatingActionButtonXz6DiA(v3.a, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: FloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1904FloatingActionButtonXz6DiA(@p4.l v3.a<kotlin.r2> r30, @p4.m androidx.compose.ui.Modifier r31, @p4.m androidx.compose.ui.graphics.Shape r32, long r33, long r35, @p4.m androidx.compose.material3.FloatingActionButtonElevation r37, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r38, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r39, @p4.m androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m1904FloatingActionButtonXz6DiA(v3.a, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a0  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: LargeFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1905LargeFloatingActionButtonXz6DiA(@p4.l v3.a<kotlin.r2> r26, @p4.m androidx.compose.ui.Modifier r27, @p4.m androidx.compose.ui.graphics.Shape r28, long r29, long r31, @p4.m androidx.compose.material3.FloatingActionButtonElevation r33, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r34, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r35, @p4.m androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m1905LargeFloatingActionButtonXz6DiA(v3.a, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a0  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: SmallFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1906SmallFloatingActionButtonXz6DiA(@p4.l v3.a<kotlin.r2> r26, @p4.m androidx.compose.ui.Modifier r27, @p4.m androidx.compose.ui.graphics.Shape r28, long r29, long r31, @p4.m androidx.compose.material3.FloatingActionButtonElevation r33, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r34, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r35, @p4.m androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m1906SmallFloatingActionButtonXz6DiA(v3.a, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
