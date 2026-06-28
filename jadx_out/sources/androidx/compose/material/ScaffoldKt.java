package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a§\u0002\u0010*\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u0013\b\u0002\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162 \b\u0002\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u009f\u0002\u0010*\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u0013\b\u0002\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162 \b\u0002\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a¨\u0001\u00104\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00142\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b/2\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b/2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b/2\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b/2\u0006\u0010\b\u001a\u00020\u00072\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b/H\u0003ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a¨\u0001\u00106\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00142\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b/2\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b/2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b/2\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b/2\u0006\u0010\b\u001a\u00020\u00072\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b/H\u0003ø\u0001\u0000¢\u0006\u0004\b5\u00103\u001a¨\u0001\u00108\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00142\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b/2\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b/2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b/2\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b/2\u0006\u0010\b\u001a\u00020\u00072\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b/H\u0003ø\u0001\u0000¢\u0006\u0004\b7\u00103\"1\u0010B\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u00168G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b@\u0010A\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?\"\"\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010D0C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0014\u0010I\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006K"}, d2 = {"Landroidx/compose/material/DrawerState;", "drawerState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/ScaffoldState;", "rememberScaffoldState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "topBar", "bottomBar", "Lkotlin/Function1;", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "", "isFloatingActionButtonDocked", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/u;", "drawerContent", "drawerGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Scaffold-u4IkXBM", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lv3/p;Lv3/p;Lv3/q;Lv3/p;IZLv3/q;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLv3/q;Landroidx/compose/runtime/Composer;III)V", "Scaffold", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lv3/p;Lv3/p;Lv3/q;Lv3/p;IZLv3/q;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLv3/q;Landroidx/compose/runtime/Composer;III)V", "isFabDocked", "fabPosition", "Landroidx/compose/ui/UiComposable;", "snackbar", "fab", "ScaffoldLayout-i1QSOvI", "(ZILv3/p;Lv3/q;Lv3/p;Lv3/p;Landroidx/compose/foundation/layout/WindowInsets;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "ScaffoldLayout", "ScaffoldLayoutWithMeasureFix-i1QSOvI", "ScaffoldLayoutWithMeasureFix", "LegacyScaffoldLayout-i1QSOvI", "LegacyScaffoldLayout", "<set-?>", "ScaffoldSubcomposeInMeasureFix$delegate", "Landroidx/compose/runtime/MutableState;", "getScaffoldSubcomposeInMeasureFix", "()Z", "setScaffoldSubcomposeInMeasureFix", "(Z)V", "getScaffoldSubcomposeInMeasureFix$annotations", "()V", "ScaffoldSubcomposeInMeasureFix", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "FabSpacing", "F", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,818:1\n25#2:819\n25#2:826\n36#2:833\n1116#3,6:820\n1116#3,6:827\n1116#3,6:834\n1116#3,6:844\n1116#3,6:850\n154#4:840\n154#4:856\n81#5:841\n107#5,2:842\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n*L\n76#1:819\n77#1:826\n206#1:833\n76#1:820,6\n77#1:827,6\n206#1:834,6\n451#1:844,6\n629#1:850,6\n335#1:840\n815#1:856\n383#1:841\n383#1:842,2\n*E\n"})
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final float FabSpacing;

    @l
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement;

    @l
    private static final MutableState ScaffoldSubcomposeInMeasureFix$delegate;

    static {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        ScaffoldSubcomposeInMeasureFix$delegate = mutableStateOf$default;
        LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(ScaffoldKt$LocalFabPlacement$1.INSTANCE);
        FabSpacing = Dp.m6044constructorimpl(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @UiComposable
    /* renamed from: LegacyScaffoldLayout-i1QSOvI, reason: not valid java name */
    public static final void m1419LegacyScaffoldLayouti1QSOvI(boolean z4, int i5, p<? super Composer, ? super Integer, r2> pVar, q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, WindowInsets windowInsets, p<? super Composer, ? super Integer, r2> pVar4, Composer composer, int i6) {
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
        Composer startRestartGroup = composer.startRestartGroup(141059468);
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changed(z4)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i7 = i15 | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 112) == 0) {
            if (startRestartGroup.changed(i5)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i7 |= i14;
        }
        if ((i6 & 896) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i7 |= i13;
        }
        if ((i6 & 7168) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i7 |= i12;
        }
        if ((57344 & i6) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i7 |= i11;
        }
        if ((458752 & i6) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i7 |= i10;
        }
        if ((3670016 & i6) == 0) {
            if (startRestartGroup.changed(windowInsets)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i7 |= i9;
        }
        if ((29360128 & i6) == 0) {
            if (startRestartGroup.changedInstance(pVar4)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i7 |= i8;
        }
        if ((23967451 & i7) == 4793490 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(141059468, i7, -1, "androidx.compose.material.LegacyScaffoldLayout (Scaffold.kt:627)");
            }
            startRestartGroup.startReplaceableGroup(-757553268);
            boolean changedInstance = startRestartGroup.changedInstance(pVar) | startRestartGroup.changedInstance(pVar2) | startRestartGroup.changed(windowInsets) | startRestartGroup.changedInstance(pVar3) | startRestartGroup.changed(i5) | startRestartGroup.changed(z4) | startRestartGroup.changedInstance(pVar4) | startRestartGroup.changedInstance(qVar);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance && rememberedValue != Composer.Companion.getEmpty()) {
                composer2 = startRestartGroup;
            } else {
                composer2 = startRestartGroup;
                ScaffoldKt$LegacyScaffoldLayout$1$1 scaffoldKt$LegacyScaffoldLayout$1$1 = new ScaffoldKt$LegacyScaffoldLayout$1$1(pVar, pVar2, pVar3, i5, z4, windowInsets, pVar4, qVar);
                composer2.updateRememberedValue(scaffoldKt$LegacyScaffoldLayout$1$1);
                rememberedValue = scaffoldKt$LegacyScaffoldLayout$1$1;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (p) rememberedValue, composer2, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ScaffoldKt$LegacyScaffoldLayout$2(z4, i5, pVar, qVar, pVar2, pVar3, windowInsets, pVar4, i6));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b1, code lost:
    
        if (r0.changed(r71) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01cb, code lost:
    
        if (r0.changed(r73) == false) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0236  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Scaffold-27mzLpw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1420Scaffold27mzLpw(@p4.m androidx.compose.ui.Modifier r57, @p4.m androidx.compose.material.ScaffoldState r58, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r59, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r60, @p4.m v3.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r61, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r62, int r63, boolean r64, @p4.m v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r65, boolean r66, @p4.m androidx.compose.ui.graphics.Shape r67, float r68, long r69, long r71, long r73, long r75, long r77, @p4.l v3.q<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r79, @p4.m androidx.compose.runtime.Composer r80, int r81, int r82, int r83) {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.m1420Scaffold27mzLpw(androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, v3.p, v3.p, v3.q, v3.p, int, boolean, v3.q, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, v3.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cd, code lost:
    
        if (r0.changed(r54) == false) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0254  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Scaffold-u4IkXBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1421Scaffoldu4IkXBM(@p4.l androidx.compose.foundation.layout.WindowInsets r39, @p4.m androidx.compose.ui.Modifier r40, @p4.m androidx.compose.material.ScaffoldState r41, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r42, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r43, @p4.m v3.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r44, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r45, int r46, boolean r47, @p4.m v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r48, boolean r49, @p4.m androidx.compose.ui.graphics.Shape r50, float r51, long r52, long r54, long r56, long r58, long r60, @p4.l v3.q<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r62, @p4.m androidx.compose.runtime.Composer r63, int r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.m1421Scaffoldu4IkXBM(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, v3.p, v3.p, v3.q, v3.p, int, boolean, v3.q, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, v3.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @UiComposable
    /* renamed from: ScaffoldLayout-i1QSOvI, reason: not valid java name */
    public static final void m1422ScaffoldLayouti1QSOvI(boolean z4, int i5, p<? super Composer, ? super Integer, r2> pVar, q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, WindowInsets windowInsets, p<? super Composer, ? super Integer, r2> pVar4, Composer composer, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-468424875);
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changed(z4)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i7 = i15 | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 112) == 0) {
            if (startRestartGroup.changed(i5)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i7 |= i14;
        }
        if ((i6 & 896) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i7 |= i13;
        }
        if ((i6 & 7168) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i7 |= i12;
        }
        if ((i6 & 57344) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i7 |= i11;
        }
        if ((i6 & 458752) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i7 |= i10;
        }
        if ((i6 & 3670016) == 0) {
            if (startRestartGroup.changed(windowInsets)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i7 |= i9;
        }
        if ((i6 & 29360128) == 0) {
            if (startRestartGroup.changedInstance(pVar4)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i7 |= i8;
        }
        if ((i7 & 23967451) == 4793490 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-468424875, i7, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:409)");
            }
            if (getScaffoldSubcomposeInMeasureFix()) {
                startRestartGroup.startReplaceableGroup(-2103098080);
                m1423ScaffoldLayoutWithMeasureFixi1QSOvI(z4, i5, pVar, qVar, pVar2, pVar3, windowInsets, pVar4, startRestartGroup, (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (i7 & 458752) | (3670016 & i7) | (i7 & 29360128));
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-2103097736);
                m1419LegacyScaffoldLayouti1QSOvI(z4, i5, pVar, qVar, pVar2, pVar3, windowInsets, pVar4, startRestartGroup, (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (i7 & 458752) | (3670016 & i7) | (i7 & 29360128));
                startRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ScaffoldKt$ScaffoldLayout$1(z4, i5, pVar, qVar, pVar2, pVar3, windowInsets, pVar4, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @UiComposable
    /* renamed from: ScaffoldLayoutWithMeasureFix-i1QSOvI, reason: not valid java name */
    public static final void m1423ScaffoldLayoutWithMeasureFixi1QSOvI(boolean z4, int i5, p<? super Composer, ? super Integer, r2> pVar, q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, WindowInsets windowInsets, p<? super Composer, ? super Integer, r2> pVar4, Composer composer, int i6) {
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
        Composer startRestartGroup = composer.startRestartGroup(1285900760);
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changed(z4)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i7 = i15 | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 112) == 0) {
            if (startRestartGroup.changed(i5)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i7 |= i14;
        }
        if ((i6 & 896) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i7 |= i13;
        }
        if ((i6 & 7168) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i7 |= i12;
        }
        if ((57344 & i6) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i7 |= i11;
        }
        if ((458752 & i6) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i7 |= i10;
        }
        if ((3670016 & i6) == 0) {
            if (startRestartGroup.changed(windowInsets)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i7 |= i9;
        }
        if ((29360128 & i6) == 0) {
            if (startRestartGroup.changedInstance(pVar4)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i7 |= i8;
        }
        if ((23967451 & i7) == 4793490 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1285900760, i7, -1, "androidx.compose.material.ScaffoldLayoutWithMeasureFix (Scaffold.kt:449)");
            }
            startRestartGroup.startReplaceableGroup(-757560492);
            boolean changedInstance = startRestartGroup.changedInstance(pVar) | startRestartGroup.changedInstance(pVar2) | startRestartGroup.changed(windowInsets) | startRestartGroup.changedInstance(pVar3) | startRestartGroup.changed(i5) | startRestartGroup.changed(z4) | startRestartGroup.changedInstance(pVar4) | startRestartGroup.changedInstance(qVar);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance && rememberedValue != Composer.Companion.getEmpty()) {
                composer2 = startRestartGroup;
            } else {
                composer2 = startRestartGroup;
                ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1 scaffoldKt$ScaffoldLayoutWithMeasureFix$1$1 = new ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1(pVar, pVar2, pVar3, i5, z4, windowInsets, pVar4, qVar);
                composer2.updateRememberedValue(scaffoldKt$ScaffoldLayoutWithMeasureFix$1$1);
                rememberedValue = scaffoldKt$ScaffoldLayoutWithMeasureFix$1$1;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (p) rememberedValue, composer2, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ScaffoldKt$ScaffoldLayoutWithMeasureFix$2(z4, i5, pVar, qVar, pVar2, pVar3, windowInsets, pVar4, i6));
        }
    }

    @l
    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalMaterialApi
    public static final boolean getScaffoldSubcomposeInMeasureFix() {
        return ((Boolean) ScaffoldSubcomposeInMeasureFix$delegate.getValue()).booleanValue();
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getScaffoldSubcomposeInMeasureFix$annotations() {
    }

    @l
    @Composable
    public static final ScaffoldState rememberScaffoldState(@m DrawerState drawerState, @m SnackbarHostState snackbarHostState, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(1569641925);
        if ((i6 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
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
            ComposerKt.traceEventStart(1569641925, i5, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:76)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ScaffoldState scaffoldState = (ScaffoldState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scaffoldState;
    }

    @ExperimentalMaterialApi
    public static final void setScaffoldSubcomposeInMeasureFix(boolean z4) {
        ScaffoldSubcomposeInMeasureFix$delegate.setValue(Boolean.valueOf(z4));
    }
}
