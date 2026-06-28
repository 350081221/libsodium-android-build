package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a±\u0001\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0013\b\u0002\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0087\u0001\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00042\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0087\u0001\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00042\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001a\u001a\u0087\u0001\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00042\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001a\"1\u0010*\u001a\u00020 2\u0006\u0010!\u001a\u00020 8G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\"\"\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "topBar", "bottomBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material3/FabPosition;", "floatingActionButtonPosition", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Lv3/p;IJJLandroidx/compose/foundation/layout/WindowInsets;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "Scaffold", "fabPosition", "snackbar", "fab", "ScaffoldLayout-FMILGgc", "(ILv3/p;Lv3/q;Lv3/p;Lv3/p;Landroidx/compose/foundation/layout/WindowInsets;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "ScaffoldLayout", "ScaffoldLayoutWithMeasureFix-FMILGgc", "ScaffoldLayoutWithMeasureFix", "LegacyScaffoldLayout-FMILGgc", "LegacyScaffoldLayout", "", "<set-?>", "ScaffoldSubcomposeInMeasureFix$delegate", "Landroidx/compose/runtime/MutableState;", "getScaffoldSubcomposeInMeasureFix", "()Z", "setScaffoldSubcomposeInMeasureFix", "(Z)V", "getScaffoldSubcomposeInMeasureFix$annotations", "()V", "ScaffoldSubcomposeInMeasureFix", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/FabPlacement;", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/unit/Dp;", "FabSpacing", "F", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,598:1\n1116#2,6:599\n1116#2,6:605\n1116#2,6:611\n1116#2,6:617\n81#3:623\n107#3,2:624\n154#4:626\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n*L\n98#1:599,6\n102#1:605,6\n179#1:611,6\n349#1:617,6\n572#1:623\n572#1:624,2\n595#1:626\n*E\n"})
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final float FabSpacing;

    @p4.l
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement;

    @p4.l
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
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: LegacyScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m2106LegacyScaffoldLayoutFMILGgc(int i5, v3.p<? super Composer, ? super Integer, r2> pVar, v3.q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, WindowInsets windowInsets, v3.p<? super Composer, ? super Integer, r2> pVar4, Composer composer, int i6) {
        int i7;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(1307205667);
        if ((i6 & 6) == 0) {
            if (startRestartGroup.changed(i5)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i7 = i15 | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i7 |= i14;
        }
        if ((i6 & 384) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i7 |= i13;
        }
        if ((i6 & 3072) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i7 |= i12;
        }
        if ((i6 & 24576) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i7 |= i11;
        }
        if ((196608 & i6) == 0) {
            if (startRestartGroup.changed(windowInsets)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i7 |= i10;
        }
        if ((i6 & 1572864) == 0) {
            if (startRestartGroup.changedInstance(pVar4)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i7 |= i9;
        }
        if ((i7 & 599187) == 599186 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1307205667, i7, -1, "androidx.compose.material3.LegacyScaffoldLayout (Scaffold.kt:347)");
            }
            startRestartGroup.startReplaceableGroup(1646578117);
            if ((i7 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i7 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = z4 | z5;
            if ((458752 & i7) == 131072) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z12 = z11 | z6;
            if ((57344 & i7) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z13 = z12 | z7;
            if ((i7 & 14) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z14 = z13 | z8;
            if ((3670016 & i7) == 1048576) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z15 = z14 | z9;
            if ((i7 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z16 = z15 | z10;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (!z16 && rememberedValue != Composer.Companion.getEmpty()) {
                i8 = 0;
            } else {
                i8 = 0;
                rememberedValue = new ScaffoldKt$LegacyScaffoldLayout$1$1(pVar, pVar2, pVar3, i5, windowInsets, pVar4, qVar);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (v3.p) rememberedValue, startRestartGroup, i8, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ScaffoldKt$LegacyScaffoldLayout$2(i5, pVar, qVar, pVar2, pVar3, windowInsets, pVar4, i6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0272  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2107ScaffoldTvnljyQ(@p4.m androidx.compose.ui.Modifier r29, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r30, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r31, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r32, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r33, int r34, long r35, long r37, @p4.m androidx.compose.foundation.layout.WindowInsets r39, @p4.l v3.q<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r40, @p4.m androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ScaffoldKt.m2107ScaffoldTvnljyQ(androidx.compose.ui.Modifier, v3.p, v3.p, v3.p, v3.p, int, long, long, androidx.compose.foundation.layout.WindowInsets, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m2108ScaffoldLayoutFMILGgc(int i5, v3.p<? super Composer, ? super Integer, r2> pVar, v3.q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, WindowInsets windowInsets, v3.p<? super Composer, ? super Integer, r2> pVar4, Composer composer, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-975511942);
        if ((i6 & 6) == 0) {
            if (startRestartGroup.changed(i5)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i7 = i14 | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i7 |= i13;
        }
        if ((i6 & 384) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i7 |= i12;
        }
        if ((i6 & 3072) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i7 |= i11;
        }
        if ((i6 & 24576) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i7 |= i10;
        }
        if ((196608 & i6) == 0) {
            if (startRestartGroup.changed(windowInsets)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i7 |= i9;
        }
        if ((1572864 & i6) == 0) {
            if (startRestartGroup.changedInstance(pVar4)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i7 |= i8;
        }
        if ((599187 & i7) == 599186 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i7, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:141)");
            }
            if (getScaffoldSubcomposeInMeasureFix()) {
                startRestartGroup.startReplaceableGroup(-915303637);
                m2109ScaffoldLayoutWithMeasureFixFMILGgc(i5, pVar, qVar, pVar2, pVar3, windowInsets, pVar4, startRestartGroup, (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (i7 & 3670016));
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-915303332);
                m2106LegacyScaffoldLayoutFMILGgc(i5, pVar, qVar, pVar2, pVar3, windowInsets, pVar4, startRestartGroup, (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (i7 & 3670016));
                startRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ScaffoldKt$ScaffoldLayout$1(i5, pVar, qVar, pVar2, pVar3, windowInsets, pVar4, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: ScaffoldLayoutWithMeasureFix-FMILGgc, reason: not valid java name */
    public static final void m2109ScaffoldLayoutWithMeasureFixFMILGgc(int i5, v3.p<? super Composer, ? super Integer, r2> pVar, v3.q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, WindowInsets windowInsets, v3.p<? super Composer, ? super Integer, r2> pVar4, Composer composer, int i6) {
        int i7;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-2037614249);
        if ((i6 & 6) == 0) {
            if (startRestartGroup.changed(i5)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i7 = i15 | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i7 |= i14;
        }
        if ((i6 & 384) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i7 |= i13;
        }
        if ((i6 & 3072) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i7 |= i12;
        }
        if ((i6 & 24576) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i7 |= i11;
        }
        if ((196608 & i6) == 0) {
            if (startRestartGroup.changed(windowInsets)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i7 |= i10;
        }
        if ((i6 & 1572864) == 0) {
            if (startRestartGroup.changedInstance(pVar4)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i7 |= i9;
        }
        if ((i7 & 599187) == 599186 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2037614249, i7, -1, "androidx.compose.material3.ScaffoldLayoutWithMeasureFix (Scaffold.kt:177)");
            }
            startRestartGroup.startReplaceableGroup(-273325894);
            if ((i7 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i7 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = z4 | z5;
            if ((458752 & i7) == 131072) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z12 = z11 | z6;
            if ((57344 & i7) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z13 = z12 | z7;
            if ((i7 & 14) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z14 = z13 | z8;
            if ((3670016 & i7) == 1048576) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z15 = z14 | z9;
            if ((i7 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z16 = z15 | z10;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (!z16 && rememberedValue != Composer.Companion.getEmpty()) {
                i8 = 0;
            } else {
                i8 = 0;
                rememberedValue = new ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1(pVar, pVar2, pVar3, i5, windowInsets, pVar4, qVar);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (v3.p) rememberedValue, startRestartGroup, i8, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ScaffoldKt$ScaffoldLayoutWithMeasureFix$2(i5, pVar, qVar, pVar2, pVar3, windowInsets, pVar4, i6));
        }
    }

    @p4.l
    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalMaterial3Api
    public static final boolean getScaffoldSubcomposeInMeasureFix() {
        return ((Boolean) ScaffoldSubcomposeInMeasureFix$delegate.getValue()).booleanValue();
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getScaffoldSubcomposeInMeasureFix$annotations() {
    }

    @ExperimentalMaterial3Api
    public static final void setScaffoldSubcomposeInMeasureFix(boolean z4) {
        ScaffoldSubcomposeInMeasureFix$delegate.setValue(Boolean.valueOf(z4));
    }
}
