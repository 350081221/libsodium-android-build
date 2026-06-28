package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a4\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u001a>\u0010\r\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u001a=\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a \u0010\t\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u001a-\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0018\u001a\u0080\u0002\u00106\u001a\u00020\u001a2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0005¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u00132\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u001a\u0018\u00010!¢\u0006\u0002\b\u001b2\u0019\b\u0002\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u0005¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u001a\u0018\u00010!¢\u0006\u0002\b\u001b2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u00062\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020*2\b\b\u0002\u00100\u001a\u00020,2\b\b\u0002\u00101\u001a\u00020,2\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001a0\u0005¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aÞ\u0002\u00106\u001a\u00020\u001a2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0005¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u00132\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u001a\u0018\u00010!¢\u0006\u0002\b\u001b2\u0019\b\u0002\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u0005¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u001a\u0018\u00010!¢\u0006\u0002\b\u001b2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u00062\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020*2 \b\u0002\u00107\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0005¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001c2\b\b\u0002\u00108\u001a\u00020\u00062\b\b\u0002\u00109\u001a\u00020(2\b\b\u0002\u0010:\u001a\u00020*2\b\b\u0002\u0010;\u001a\u00020,2\b\b\u0002\u0010<\u001a\u00020,2\b\b\u0002\u0010=\u001a\u00020,2\b\b\u0002\u00100\u001a\u00020,2\b\b\u0002\u00101\u001a\u00020,2\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001a0\u0005¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a\u0093\u0001\u0010I\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00062'\u0010F\u001a#\u0012\u0013\u0012\u00110A¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000E0\u00052\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u001c\u00103\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0005¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001cH\u0003ø\u0001\u0000¢\u0006\u0004\bG\u0010H\u001aÅ\u0001\u0010S\u001a\u00020\u001a2\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u001a\u0018\u00010!¢\u0006\u0002\b\u001b2&\u0010K\u001a\"\u0012\u0013\u0012\u001102¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020\u001a0\u0005¢\u0006\u0002\b\u001b2&\u0010N\u001a\"\u0012\u0013\u0012\u00110L¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(M\u0012\u0004\u0012\u00020\u001a0\u0005¢\u0006\u0002\b\u001b2\u0013\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u001a\u0018\u00010!¢\u0006\u0002\b\u001b2\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\u001a0!¢\u0006\u0002\b\u001b2\u0006\u0010/\u001a\u00020*2\u0006\u0010&\u001a\u00020%2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030!2\u0006\u0010P\u001a\u00020\bH\u0003ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a\u001c\u0010X\u001a\u00020W2\n\u0010@\u001a\u0006\u0012\u0002\b\u00030T2\u0006\u0010V\u001a\u00020UH\u0002\"\u0014\u0010Y\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z\"\u0014\u0010[\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010Z\"\u0014\u0010\\\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010Z\"\u0014\u0010^\u001a\u00020]8\u0002X\u0082T¢\u0006\u0006\n\u0004\b^\u0010_\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006`"}, d2 = {"Landroidx/compose/material/BottomSheetValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/BottomSheetState;", "BottomSheetScaffoldState", "Landroidx/compose/ui/unit/Density;", "density", "confirmValueChange", "BottomSheetState", "rememberBottomSheetState", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "bottomSheetState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/BottomSheetScaffoldState;", "rememberBottomSheetScaffoldState", "(Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "Landroidx/compose/material/DrawerState;", "drawerState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "topBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "sheetGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/unit/Dp;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "sheetPeekHeight", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "BottomSheetScaffold-HnlDQGw", "(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lv3/p;Lv3/q;Lv3/p;IZLandroidx/compose/ui/graphics/Shape;FJJFJJLv3/q;Landroidx/compose/runtime/Composer;III)V", "BottomSheetScaffold", "drawerContent", "drawerGesturesEnabled", "drawerShape", "drawerElevation", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "BottomSheetScaffold-bGncdBI", "(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lv3/p;Lv3/q;Lv3/p;IZLandroidx/compose/ui/graphics/Shape;FJJFLv3/q;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLv3/q;Landroidx/compose/runtime/Composer;IIII)V", "state", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/v0;", "name", "sheetSize", "Landroidx/compose/material/DraggableAnchors;", "calculateAnchors", "BottomSheet-0cLKjW4", "(Landroidx/compose/material/BottomSheetState;ZLv3/l;Landroidx/compose/ui/graphics/Shape;FJJLandroidx/compose/ui/Modifier;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "BottomSheet", "innerPadding", "body", "", "layoutHeight", "bottomSheet", "sheetOffset", "sheetState", "BottomSheetScaffoldLayout-KCBPh4w", "(Lv3/p;Lv3/q;Lv3/q;Lv3/p;Lv3/p;FILv3/a;Landroidx/compose/material/BottomSheetState;Landroidx/compose/runtime/Composer;I)V", "BottomSheetScaffoldLayout", "Landroidx/compose/material/AnchoredDraggableState;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "FabSpacing", "F", "BottomSheetScaffoldPositionalThreshold", "BottomSheetScaffoldVelocityThreshold", "", "BottomSheetScaffoldWithDrawerDeprecated", "Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,812:1\n74#2:813\n74#2:836\n74#2:843\n25#3:814\n50#3:821\n49#3:822\n25#3:829\n25#3:849\n1116#4,6:815\n1116#4,6:823\n1116#4,6:830\n1116#4,6:837\n1116#4,3:850\n1119#4,3:856\n1116#4,6:860\n1116#4,6:866\n1#5:844\n487#6,4:845\n491#6,2:853\n495#6:859\n487#7:855\n154#8:872\n154#8:873\n154#8:874\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n*L\n307#1:813\n455#1:836\n460#1:843\n348#1:814\n350#1:821\n350#1:822\n388#1:829\n613#1:849\n348#1:815,6\n350#1:823,6\n388#1:830,6\n456#1:837,6\n613#1:850,3\n613#1:856,3\n621#1:860,6\n688#1:866,6\n613#1:845,4\n613#1:853,2\n613#1:859\n613#1:855\n806#1:872\n807#1:873\n808#1:874\n*E\n"})
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {

    @l
    private static final String BottomSheetScaffoldWithDrawerDeprecated = "BottomSheetScaffold with a drawer has been deprecated. To achieve the same functionality, wrap your BottomSheetScaffold in aModalDrawer. See BottomSheetScaffoldWithDrawerSample for more details.";
    private static final float FabSpacing = Dp.m6044constructorimpl(16);
    private static final float BottomSheetScaffoldPositionalThreshold = Dp.m6044constructorimpl(56);
    private static final float BottomSheetScaffoldVelocityThreshold = Dp.m6044constructorimpl(125);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0064  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomSheet-0cLKjW4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1231BottomSheet0cLKjW4(androidx.compose.material.BottomSheetState r27, boolean r28, v3.l<? super androidx.compose.ui.unit.IntSize, ? extends androidx.compose.material.DraggableAnchors<androidx.compose.material.BottomSheetValue>> r29, androidx.compose.ui.graphics.Shape r30, float r31, long r32, long r34, androidx.compose.ui.Modifier r36, v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m1231BottomSheet0cLKjW4(androidx.compose.material.BottomSheetState, boolean, v3.l, androidx.compose.ui.graphics.Shape, float, long, long, androidx.compose.ui.Modifier, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_]]")
    /* renamed from: BottomSheetScaffold-HnlDQGw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1232BottomSheetScaffoldHnlDQGw(@p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, @p4.m androidx.compose.ui.Modifier r39, @p4.m androidx.compose.material.BottomSheetScaffoldState r40, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r41, @p4.m v3.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r42, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r43, int r44, boolean r45, @p4.m androidx.compose.ui.graphics.Shape r46, float r47, long r48, long r50, float r52, long r53, long r55, @p4.l v3.q<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r57, @p4.m androidx.compose.runtime.Composer r58, int r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m1232BottomSheetScaffoldHnlDQGw(v3.q, androidx.compose.ui.Modifier, androidx.compose.material.BottomSheetScaffoldState, v3.p, v3.q, v3.p, int, boolean, androidx.compose.ui.graphics.Shape, float, long, long, float, long, long, v3.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r1.changed(r62) != false) goto L31;
     */
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.ERROR, message = androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffoldWithDrawerDeprecated)
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: BottomSheetScaffold-bGncdBI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1233BottomSheetScaffoldbGncdBI(@p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r37, @p4.m androidx.compose.ui.Modifier r38, @p4.m androidx.compose.material.BottomSheetScaffoldState r39, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r40, @p4.m v3.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r41, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r42, int r43, boolean r44, @p4.m androidx.compose.ui.graphics.Shape r45, float r46, long r47, long r49, float r51, @p4.m v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r52, boolean r53, @p4.m androidx.compose.ui.graphics.Shape r54, float r55, long r56, long r58, long r60, long r62, long r64, @p4.l v3.q<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r66, @p4.m androidx.compose.runtime.Composer r67, int r68, int r69, int r70, int r71) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m1233BottomSheetScaffoldbGncdBI(v3.q, androidx.compose.ui.Modifier, androidx.compose.material.BottomSheetScaffoldState, v3.p, v3.q, v3.p, int, boolean, androidx.compose.ui.graphics.Shape, float, long, long, float, v3.q, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, v3.q, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][_]]")
    /* renamed from: BottomSheetScaffoldLayout-KCBPh4w, reason: not valid java name */
    public static final void m1234BottomSheetScaffoldLayoutKCBPh4w(p<? super Composer, ? super Integer, r2> pVar, q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, q<? super Integer, ? super Composer, ? super Integer, r2> qVar2, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, float f5, int i5, a<Float> aVar, BottomSheetState bottomSheetState, Composer composer, int i6) {
        int i7;
        Composer composer2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(1621720523);
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i7 = i16 | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 112) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i7 |= i15;
        }
        if ((i6 & 896) == 0) {
            if (startRestartGroup.changedInstance(qVar2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i7 |= i14;
        }
        if ((i6 & 7168) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i7 |= i13;
        }
        if ((57344 & i6) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i7 |= i12;
        }
        if ((458752 & i6) == 0) {
            if (startRestartGroup.changed(f5)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i7 |= i11;
        }
        if ((3670016 & i6) == 0) {
            if (startRestartGroup.changed(i5)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i7 |= i10;
        }
        if ((29360128 & i6) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i7 |= i9;
        }
        if ((234881024 & i6) == 0) {
            if (startRestartGroup.changed(bottomSheetState)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i7 |= i8;
        }
        if ((191739611 & i7) == 38347922 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1621720523, i7, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:686)");
            }
            startRestartGroup.startReplaceableGroup(1938018646);
            boolean changedInstance = startRestartGroup.changedInstance(qVar2) | startRestartGroup.changedInstance(pVar) | startRestartGroup.changedInstance(qVar) | startRestartGroup.changed(f5) | startRestartGroup.changedInstance(pVar2) | startRestartGroup.changedInstance(pVar3) | startRestartGroup.changedInstance(aVar) | startRestartGroup.changed(i5) | startRestartGroup.changed(bottomSheetState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance && rememberedValue != Composer.Companion.getEmpty()) {
                composer2 = startRestartGroup;
            } else {
                composer2 = startRestartGroup;
                BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(pVar, pVar2, pVar3, qVar2, qVar, f5, aVar, i5, bottomSheetState);
                composer2.updateRememberedValue(bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1);
                rememberedValue = bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (p) rememberedValue, composer2, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(pVar, qVar, qVar2, pVar2, pVar3, f5, i5, aVar, bottomSheetState, i6));
        }
    }

    @l
    @k(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @b1(expression = "BottomSheetScaffoldState(initialValue, animationSpec, confirmStateChange)", imports = {}))
    @ExperimentalMaterialApi
    public static final BottomSheetState BottomSheetScaffoldState(@l BottomSheetValue bottomSheetValue, @l AnimationSpec<Float> animationSpec, @l v3.l<? super BottomSheetValue, Boolean> lVar) {
        return new BottomSheetState(bottomSheetValue, animationSpec, lVar);
    }

    public static /* synthetic */ BottomSheetState BottomSheetScaffoldState$default(BottomSheetValue bottomSheetValue, AnimationSpec animationSpec, v3.l lVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            animationSpec = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        return BottomSheetScaffoldState(bottomSheetValue, (AnimationSpec<Float>) animationSpec, (v3.l<? super BottomSheetValue, Boolean>) lVar);
    }

    @Stable
    @l
    @ExperimentalMaterialApi
    public static final BottomSheetState BottomSheetState(@l BottomSheetValue bottomSheetValue, @l Density density, @l AnimationSpec<Float> animationSpec, @l v3.l<? super BottomSheetValue, Boolean> lVar) {
        BottomSheetState bottomSheetState = new BottomSheetState(bottomSheetValue, animationSpec, lVar);
        bottomSheetState.setDensity$material_release(density);
        return bottomSheetState;
    }

    public static /* synthetic */ BottomSheetState BottomSheetState$default(BottomSheetValue bottomSheetValue, Density density, AnimationSpec animationSpec, v3.l lVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            animationSpec = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i5 & 8) != 0) {
            lVar = BottomSheetScaffoldKt$BottomSheetState$1.INSTANCE;
        }
        return BottomSheetState(bottomSheetValue, density, animationSpec, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    @l
    @Composable
    @ExperimentalMaterialApi
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@m BottomSheetState bottomSheetState, @m SnackbarHostState snackbarHostState, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-1022285988);
        if ((i6 & 1) != 0) {
            bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer, 6, 6);
        }
        if ((i6 & 2) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1022285988, i5, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:348)");
        }
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(bottomSheetState) | composer.changed(snackbarHostState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(bottomSheetState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    @l
    @Composable
    @ExperimentalMaterialApi
    public static final BottomSheetState rememberBottomSheetState(@l BottomSheetValue bottomSheetValue, @m AnimationSpec<Float> animationSpec, @m v3.l<? super BottomSheetValue, Boolean> lVar, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(1808153344);
        if ((i6 & 2) != 0) {
            animationSpec = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i6 & 4) != 0) {
            lVar = BottomSheetScaffoldKt$rememberBottomSheetState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1808153344, i5, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:305)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m3351rememberSaveable(new Object[]{animationSpec}, (Saver) BottomSheetState.Companion.Saver(animationSpec, lVar, density), (String) null, (a) new BottomSheetScaffoldKt$rememberBottomSheetState$2(bottomSheetValue, density, animationSpec, lVar), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetState;
    }

    @l
    @k(level = kotlin.m.ERROR, message = BottomSheetScaffoldWithDrawerDeprecated)
    @ExperimentalMaterialApi
    public static final BottomSheetScaffoldState BottomSheetScaffoldState(@l DrawerState drawerState, @l BottomSheetState bottomSheetState, @l SnackbarHostState snackbarHostState) {
        throw new IllegalStateException(BottomSheetScaffoldWithDrawerDeprecated.toString());
    }

    @k(level = kotlin.m.ERROR, message = BottomSheetScaffoldWithDrawerDeprecated)
    @l
    @Composable
    @ExperimentalMaterialApi
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@m DrawerState drawerState, @m BottomSheetState bottomSheetState, @m SnackbarHostState snackbarHostState, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-1353009744);
        if ((i6 & 1) != 0) {
            DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i6 & 2) != 0) {
            rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer, 6, 6);
        }
        if ((i6 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1353009744, i5, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:388)");
        }
        throw new IllegalStateException(BottomSheetScaffoldWithDrawerDeprecated.toString());
    }
}
