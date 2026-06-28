package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import p4.m;
import v3.a;
import v3.p;

@i0(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u001a-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\t2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0093\u0001\u0010$\u001a\u00020\u00102\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00100 ¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0093\u0001\u0010'\u001a\u00020\u00102\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00100 ¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a \u0010,\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020(H\u0002\u001a0\u00102\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u001c2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100 2\u0006\u0010/\u001a\u00020\u0005H\u0003ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a>\u00108\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00052\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100 2\f\u00105\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u0010-\u001a\u00020\u001cH\u0003ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a\u0014\u0010<\u001a\u00020;2\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0002\"\u0014\u0010=\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>\"\u0014\u0010?\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>\"\u0014\u0010@\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>\"\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020(0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C\"\u0014\u0010D\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010>\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006F²\u0006\f\u0010E\u001a\u00020(8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/BottomDrawerValue;", "initialValue", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/BottomDrawerState;", "BottomDrawerState", "Landroidx/compose/material/DrawerValue;", "Landroidx/compose/material/DrawerState;", "rememberDrawerState", "(Landroidx/compose/material/DrawerValue;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DrawerState;", "rememberBottomDrawerState", "(Landroidx/compose/material/BottomDrawerValue;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "drawerContent", "Landroidx/compose/ui/Modifier;", "modifier", "drawerState", "gesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "scrimColor", "Lkotlin/Function0;", "content", "ModalDrawer-Gs3lGvM", "(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/material/DrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLv3/p;Landroidx/compose/runtime/Composer;II)V", "ModalDrawer", "BottomDrawer-Gs3lGvM", "(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomDrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLv3/p;Landroidx/compose/runtime/Composer;II)V", "BottomDrawer", "", bi.ay, "b", "pos", "calculateFraction", TypedValues.Custom.S_COLOR, "onDismiss", "visible", "BottomDrawerScrim-3J-VO9M", "(JLv3/a;ZLandroidx/compose/runtime/Composer;I)V", "BottomDrawerScrim", "open", "onClose", "fraction", "Scrim-Bx497Mc", "(ZLv3/a;Lv3/a;JLandroidx/compose/runtime/Composer;I)V", "Scrim", "Landroidx/compose/material/AnchoredDraggableState;", "state", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "EndDrawerPadding", "F", "DrawerPositionalThreshold", "DrawerVelocityThreshold", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "BottomDrawerOpenFraction", "alpha", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,915:1\n1116#2,6:916\n1116#2,6:923\n1116#2,3:934\n1119#2,3:940\n1116#2,3:950\n1119#2,3:956\n1116#2,6:961\n1116#2,6:967\n1116#2,6:973\n1116#2,6:979\n1116#2,6:985\n1116#2,6:991\n74#3:922\n74#3:944\n487#4,4:929\n491#4,2:937\n495#4:943\n487#4,4:945\n491#4,2:953\n495#4:959\n25#5:933\n25#5:949\n487#6:939\n487#6:955\n646#7:960\n81#8:997\n154#9:998\n154#9:999\n154#9:1000\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n*L\n450#1:916,6\n468#1:923,6\n516#1:934,3\n516#1:940,3\n655#1:950,3\n655#1:956,3\n801#1:961,6\n804#1:967,6\n816#1:973,6\n832#1:979,6\n833#1:985,6\n845#1:991,6\n467#1:922\n651#1:944\n516#1:929,4\n516#1:937,2\n516#1:943\n655#1:945,4\n655#1:953,2\n655#1:959\n516#1:933\n655#1:949\n516#1:939\n655#1:955\n793#1:960\n794#1:997\n850#1:998\n851#1:999\n852#1:1000\n*E\n"})
/* loaded from: classes.dex */
public final class DrawerKt {
    private static final float BottomDrawerOpenFraction = 0.5f;
    private static final float DrawerPositionalThreshold;
    private static final float EndDrawerPadding;
    private static final float DrawerVelocityThreshold = Dp.m6044constructorimpl(400);

    @l
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    static {
        float f5 = 56;
        EndDrawerPadding = Dp.m6044constructorimpl(f5);
        DrawerPositionalThreshold = Dp.m6044constructorimpl(f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomDrawer-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1322BottomDrawerGs3lGvM(@p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, @p4.m androidx.compose.ui.Modifier r35, @p4.m androidx.compose.material.BottomDrawerState r36, boolean r37, @p4.m androidx.compose.ui.graphics.Shape r38, float r39, long r40, long r42, long r44, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r46, @p4.m androidx.compose.runtime.Composer r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m1322BottomDrawerGs3lGvM(v3.q, androidx.compose.ui.Modifier, androidx.compose.material.BottomDrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: BottomDrawerScrim-3J-VO9M, reason: not valid java name */
    public static final void m1323BottomDrawerScrim3JVO9M(long j5, a<r2> aVar, boolean z4, Composer composer, int i5) {
        int i6;
        boolean z5;
        float f5;
        Modifier modifier;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-513067266);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(j5)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(z4)) {
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
                ComposerKt.traceEventStart(-513067266, i6, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:791)");
            }
            if (j5 != Color.Companion.m3770getUnspecified0d7_KjU()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (z4) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f5, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                String m1452getString4foXLRw = Strings_androidKt.m1452getString4foXLRw(Strings.Companion.m1445getCloseDrawerUdPEhr4(), startRestartGroup, 6);
                if (z4) {
                    Modifier.Companion companion = Modifier.Companion;
                    startRestartGroup.startReplaceableGroup(463511548);
                    boolean changedInstance = startRestartGroup.changedInstance(aVar);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(aVar, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, aVar, (p<? super PointerInputScope, ? super d<? super r2>, ? extends Object>) rememberedValue);
                    startRestartGroup.startReplaceableGroup(463511674);
                    boolean changed = startRestartGroup.changed(m1452getString4foXLRw) | startRestartGroup.changedInstance(aVar);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new DrawerKt$BottomDrawerScrim$dismissModifier$2$1(m1452getString4foXLRw, aVar);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    modifier = SemanticsModifierKt.semantics(pointerInput, true, (v3.l) rememberedValue2);
                } else {
                    modifier = Modifier.Companion;
                }
                Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier);
                startRestartGroup.startReplaceableGroup(463511963);
                boolean changed2 = startRestartGroup.changed(j5) | startRestartGroup.changed(animateFloatAsState);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new DrawerKt$BottomDrawerScrim$1$1(j5, animateFloatAsState);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(then, (v3.l) rememberedValue3, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DrawerKt$BottomDrawerScrim$2(j5, aVar, z4, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BottomDrawerScrim_3J_VO9M$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    @l
    @ExperimentalMaterialApi
    public static final BottomDrawerState BottomDrawerState(@l BottomDrawerValue bottomDrawerValue, @l Density density, @l v3.l<? super BottomDrawerValue, Boolean> lVar) {
        BottomDrawerState bottomDrawerState = new BottomDrawerState(bottomDrawerValue, lVar);
        bottomDrawerState.setDensity$material_release(density);
        return bottomDrawerState;
    }

    public static /* synthetic */ BottomDrawerState BottomDrawerState$default(BottomDrawerValue bottomDrawerValue, Density density, v3.l lVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            lVar = DrawerKt$BottomDrawerState$1.INSTANCE;
        }
        return BottomDrawerState(bottomDrawerValue, density, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState) {
        return new DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalDrawer-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1324ModalDrawerGs3lGvM(@p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, @p4.m androidx.compose.ui.Modifier r35, @p4.m androidx.compose.material.DrawerState r36, boolean r37, @p4.m androidx.compose.ui.graphics.Shape r38, float r39, long r40, long r42, long r44, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r46, @p4.m androidx.compose.runtime.Composer r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m1324ModalDrawerGs3lGvM(v3.q, androidx.compose.ui.Modifier, androidx.compose.material.DrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-Bx497Mc, reason: not valid java name */
    public static final void m1325ScrimBx497Mc(boolean z4, a<r2> aVar, a<Float> aVar2, long j5, Composer composer, int i5) {
        int i6;
        Modifier modifier;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1983403750);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(z4)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i6 = i10 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i6 |= i9;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changedInstance(aVar2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i6 |= i8;
        }
        if ((i5 & 7168) == 0) {
            if (startRestartGroup.changed(j5)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i6 |= i7;
        }
        if ((i6 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983403750, i6, -1, "androidx.compose.material.Scrim (Drawer.kt:827)");
            }
            String m1452getString4foXLRw = Strings_androidKt.m1452getString4foXLRw(Strings.Companion.m1445getCloseDrawerUdPEhr4(), startRestartGroup, 6);
            if (z4) {
                Modifier.Companion companion = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(463512299);
                boolean changedInstance = startRestartGroup.changedInstance(aVar);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new DrawerKt$Scrim$dismissDrawer$1$1(aVar, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, aVar, (p<? super PointerInputScope, ? super d<? super r2>, ? extends Object>) rememberedValue);
                startRestartGroup.startReplaceableGroup(463512383);
                boolean changed = startRestartGroup.changed(m1452getString4foXLRw) | startRestartGroup.changedInstance(aVar);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new DrawerKt$Scrim$dismissDrawer$2$1(m1452getString4foXLRw, aVar);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                modifier = SemanticsModifierKt.semantics(pointerInput, true, (v3.l) rememberedValue2);
            } else {
                modifier = Modifier.Companion;
            }
            Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier);
            startRestartGroup.startReplaceableGroup(463512624);
            boolean changed2 = startRestartGroup.changed(j5) | startRestartGroup.changedInstance(aVar2);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DrawerKt$Scrim$1$1(j5, aVar2);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(then, (v3.l) rememberedValue3, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DrawerKt$Scrim$2(z4, aVar, aVar2, j5, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f5, float f6, float f7) {
        float H;
        H = u.H((f7 - f5) / (f6 - f5), 0.0f, 1.0f);
        return H;
    }

    @l
    @Composable
    @ExperimentalMaterialApi
    public static final BottomDrawerState rememberBottomDrawerState(@l BottomDrawerValue bottomDrawerValue, @m v3.l<? super BottomDrawerValue, Boolean> lVar, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-598115156);
        if ((i6 & 2) != 0) {
            lVar = DrawerKt$rememberBottomDrawerState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-598115156, i5, -1, "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:465)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {density};
        Saver<BottomDrawerState, BottomDrawerValue> Saver = BottomDrawerState.Companion.Saver(density, lVar);
        composer.startReplaceableGroup(463497536);
        boolean changed = composer.changed(bottomDrawerValue) | composer.changed(density) | composer.changedInstance(lVar);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DrawerKt$rememberBottomDrawerState$2$1(bottomDrawerValue, density, lVar);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BottomDrawerState bottomDrawerState = (BottomDrawerState) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) Saver, (String) null, (a) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomDrawerState;
    }

    @l
    @Composable
    public static final DrawerState rememberDrawerState(@l DrawerValue drawerValue, @m v3.l<? super DrawerValue, Boolean> lVar, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-1435874229);
        if ((i6 & 2) != 0) {
            lVar = DrawerKt$rememberDrawerState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1435874229, i5, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:448)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.Companion.Saver(lVar);
        composer.startReplaceableGroup(463496927);
        boolean changed = composer.changed(drawerValue) | composer.changedInstance(lVar);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DrawerKt$rememberDrawerState$2$1(drawerValue, lVar);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) Saver, (String) null, (a) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return drawerState;
    }
}
