package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u008a\u0002\u0010!\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010%\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u0019H\u0007¢\u0006\u0004\b%\u0010&\u001a9\u0010+\u001a\u00020\"2\b\b\u0002\u0010(\u001a\u00020'2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u00002\b\b\u0002\u0010*\u001a\u00020\u0016H\u0007¢\u0006\u0004\b+\u0010,\u001a¶\u0001\u0010;\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\"2'\u00103\u001a#\u0012\u0013\u0012\u00110.¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\n\u0012\b\u0012\u0004\u0012\u00020'020\u00002\u0006\u00104\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00105\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0013\u00108\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001aÀ\u0001\u0010F\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032&\u0010=\u001a\"\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032&\u0010@\u001a\"\u0012\u0013\u0012\u00110>¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0002\b\u00032\u0006\u0010\u000b\u001a\u00020\n2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00142\u0006\u0010C\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/BottomSheetScaffoldState;", "scaffoldState", "Landroidx/compose/ui/unit/Dp;", "sheetPeekHeight", "sheetMaxWidth", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/graphics/Color;", "sheetContainerColor", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "Lkotlin/Function0;", "sheetDragHandle", "", "sheetSwipeEnabled", "topBar", "Landroidx/compose/material3/SnackbarHostState;", "snackbarHost", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "BottomSheetScaffold-sdMYb0k", "(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLv3/p;ZLv3/p;Lv3/q;JJLv3/q;Landroidx/compose/runtime/Composer;III)V", "BottomSheetScaffold", "Landroidx/compose/material3/SheetState;", "bottomSheetState", "snackbarHostState", "rememberBottomSheetScaffoldState", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;", "Landroidx/compose/material3/SheetValue;", "initialValue", "confirmValueChange", "skipHiddenState", "rememberStandardBottomSheetState", "(Landroidx/compose/material3/SheetValue;Lv3/l;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "state", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/v0;", "name", "sheetSize", "Landroidx/compose/material3/DraggableAnchors;", "calculateAnchors", "peekHeight", "shape", "tonalElevation", "shadowElevation", "dragHandle", "StandardBottomSheet-XcniZvE", "(Landroidx/compose/material3/SheetState;Lv3/l;FFZLandroidx/compose/ui/graphics/Shape;JJFFLv3/p;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "StandardBottomSheet", "innerPadding", "body", "", "layoutHeight", "bottomSheet", "", "sheetOffset", "sheetState", "BottomSheetScaffoldLayout-PxNyym8", "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/q;Lv3/q;Lv3/p;FLv3/a;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V", "BottomSheetScaffoldLayout", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,386:1\n74#2:387\n74#2:433\n1116#3,6:388\n1116#3,6:394\n1116#3,6:400\n1116#3,3:411\n1119#3,3:417\n1116#3,6:421\n1116#3,6:427\n1116#3,6:434\n1116#3,6:440\n487#4,4:406\n491#4,2:414\n495#4:420\n25#5:410\n487#6:416\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n*L\n120#1:387\n335#1:433\n131#1:388,6\n191#1:394,6\n193#1:400,6\n233#1:411,3\n233#1:417,3\n243#1:421,6\n256#1:427,6\n336#1:434,6\n339#1:440,6\n233#1:406,4\n233#1:414,2\n233#1:420\n233#1:410\n233#1:416\n*E\n"})
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomSheetScaffold-sdMYb0k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1578BottomSheetScaffoldsdMYb0k(@p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m androidx.compose.ui.Modifier r30, @p4.m androidx.compose.material3.BottomSheetScaffoldState r31, float r32, float r33, @p4.m androidx.compose.ui.graphics.Shape r34, long r35, long r37, float r39, float r40, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r41, boolean r42, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r43, @p4.m v3.q<? super androidx.compose.material3.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r44, long r45, long r47, @p4.l v3.q<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r49, @p4.m androidx.compose.runtime.Composer r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt.m1578BottomSheetScaffoldsdMYb0k(v3.q, androidx.compose.ui.Modifier, androidx.compose.material3.BottomSheetScaffoldState, float, float, androidx.compose.ui.graphics.Shape, long, long, float, float, v3.p, boolean, v3.p, v3.q, long, long, v3.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_]]")
    /* renamed from: BottomSheetScaffoldLayout-PxNyym8, reason: not valid java name */
    public static final void m1579BottomSheetScaffoldLayoutPxNyym8(Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar, v3.q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, v3.q<? super Integer, ? super Composer, ? super Integer, r2> qVar2, v3.p<? super Composer, ? super Integer, r2> pVar2, float f5, v3.a<Float> aVar, SheetState sheetState, long j5, long j6, Composer composer, int i5) {
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(-1120561936);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i6 = i17 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i6 |= i16;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i6 |= i15;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(qVar2)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i6 |= i14;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i6 |= i13;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changed(f5)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i6 |= i12;
        }
        if ((i5 & 1572864) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i6 |= i11;
        }
        if ((i5 & 12582912) == 0) {
            if (startRestartGroup.changed(sheetState)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i6 |= i10;
        }
        if ((i5 & 100663296) == 0) {
            if (startRestartGroup.changed(j5)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i6 |= i9;
        }
        if ((i5 & 805306368) == 0) {
            if (startRestartGroup.changed(j6)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i6 |= i8;
        }
        if ((i6 & 306783379) == 306783378 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1120561936, i6, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:332)");
            }
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            startRestartGroup.startReplaceableGroup(-99158096);
            int i18 = 29360128 & i6;
            if (i18 == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean changed = z4 | startRestartGroup.changed(density);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(sheetState, density);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((v3.a) rememberedValue, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-99158030);
            if ((i6 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i6 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z15 = z5 | z6;
            if ((i6 & 14) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z16 = z15 | z7;
            if ((234881024 & i6) == 67108864) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z17 = z16 | z8;
            if ((1879048192 & i6) == 536870912) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z18 = z17 | z9;
            if ((i6 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z19 = z18 | z10;
            if ((458752 & i6) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z20 = z19 | z11;
            if ((57344 & i6) == 16384) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z21 = z20 | z12;
            if ((i6 & 3670016) == 1048576) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z22 = z21 | z13;
            if (i18 == 8388608) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z23 = z22 | z14;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z23 && rememberedValue2 != Composer.Companion.getEmpty()) {
                i7 = 1;
            } else {
                i7 = 1;
                BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1 bottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1 = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1(pVar, pVar2, qVar2, modifier, j5, j6, qVar, f5, aVar, sheetState);
                startRestartGroup.updateRememberedValue(bottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1);
                rememberedValue2 = bottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (v3.p) rememberedValue2, startRestartGroup, 0, i7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3(modifier, pVar, qVar, qVar2, pVar2, f5, aVar, sheetState, j5, j6, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: StandardBottomSheet-XcniZvE, reason: not valid java name */
    public static final void m1580StandardBottomSheetXcniZvE(SheetState sheetState, v3.l<? super IntSize, ? extends DraggableAnchors<SheetValue>> lVar, float f5, float f6, boolean z4, Shape shape, long j5, long j6, float f7, float f8, v3.p<? super Composer, ? super Integer, r2> pVar, v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, Composer composer, int i5, int i6) {
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(424459667);
        if ((i5 & 6) == 0) {
            i7 = (startRestartGroup.changed(sheetState) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= startRestartGroup.changedInstance(lVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= startRestartGroup.changed(f5) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= startRestartGroup.changed(f6) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= startRestartGroup.changed(z4) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= startRestartGroup.changed(shape) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i7 |= startRestartGroup.changed(j5) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= startRestartGroup.changed(j6) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= startRestartGroup.changed(f7) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= startRestartGroup.changed(f8) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (startRestartGroup.changedInstance(pVar) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= startRestartGroup.changedInstance(qVar) ? 32 : 16;
        }
        int i9 = i8;
        if ((i7 & 306783379) == 306783378 && (i9 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(424459667, i7, i9, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:231)");
            }
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.i.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            Orientation orientation = Orientation.Vertical;
            Modifier m593requiredHeightInVpY3zN4$default = SizeKt.m593requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m609widthInVpY3zN4$default(Modifier.Companion, 0.0f, f6, 1, null), 0.0f, 1, null), f5, 0.0f, 2, null);
            AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release = sheetState.getAnchoredDraggableState$material3_release();
            startRestartGroup.startReplaceableGroup(1603483798);
            boolean changed = startRestartGroup.changed(anchoredDraggableState$material3_release);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState, orientation, new BottomSheetScaffoldKt$StandardBottomSheet$1$1(coroutineScope, sheetState));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(NestedScrollModifierKt.nestedScroll$default(m593requiredHeightInVpY3zN4$default, (NestedScrollConnection) rememberedValue2, null, 2, null), sheetState.getAnchoredDraggableState$material3_release(), orientation, z4, false, null, 24, null);
            startRestartGroup.startReplaceableGroup(1603484353);
            boolean z5 = ((i7 & 112) == 32) | ((i7 & 14) == 4);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new BottomSheetScaffoldKt$StandardBottomSheet$2$1(lVar, sheetState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            int i10 = i7 >> 12;
            SurfaceKt.m2304SurfaceT9BRK9s(OnRemeasuredModifierKt.onSizeChanged(anchoredDraggable$default, (v3.l) rememberedValue3), shape, j5, j6, f7, f8, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1070542936, true, new BottomSheetScaffoldKt$StandardBottomSheet$3(pVar, sheetState, z4, coroutineScope, qVar)), startRestartGroup, (i10 & 112) | 12582912 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (i10 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BottomSheetScaffoldKt$StandardBottomSheet$4(sheetState, lVar, f5, f6, z4, shape, j5, j6, f7, f8, pVar, qVar, i5, i6));
        }
    }

    @p4.l
    @Composable
    @ExperimentalMaterial3Api
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@p4.m SheetState sheetState, @p4.m SnackbarHostState snackbarHostState, @p4.m Composer composer, int i5, int i6) {
        boolean z4;
        composer.startReplaceableGroup(-1474606134);
        if ((i6 & 1) != 0) {
            sheetState = rememberStandardBottomSheetState(null, null, false, composer, 0, 7);
        }
        if ((i6 & 2) != 0) {
            composer.startReplaceableGroup(667326536);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            snackbarHostState = (SnackbarHostState) rememberedValue;
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1474606134, i5, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:191)");
        }
        composer.startReplaceableGroup(667326610);
        boolean z5 = false;
        if ((((i5 & 14) ^ 6) > 4 && composer.changed(sheetState)) || (i5 & 6) == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((((i5 & 112) ^ 48) > 32 && composer.changed(snackbarHostState)) || (i5 & 48) == 32) {
            z5 = true;
        }
        boolean z6 = z4 | z5;
        Object rememberedValue2 = composer.rememberedValue();
        if (z6 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(sheetState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) rememberedValue2;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    @p4.l
    @Composable
    @ExperimentalMaterial3Api
    public static final SheetState rememberStandardBottomSheetState(@p4.m SheetValue sheetValue, @p4.m v3.l<? super SheetValue, Boolean> lVar, boolean z4, @p4.m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(678511581);
        if ((i6 & 1) != 0) {
            sheetValue = SheetValue.PartiallyExpanded;
        }
        SheetValue sheetValue2 = sheetValue;
        if ((i6 & 2) != 0) {
            lVar = BottomSheetScaffoldKt$rememberStandardBottomSheetState$1.INSTANCE;
        }
        v3.l<? super SheetValue, Boolean> lVar2 = lVar;
        if ((i6 & 4) != 0) {
            z4 = true;
        }
        boolean z5 = z4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(678511581, i5, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:214)");
        }
        SheetState rememberSheetState = SheetDefaultsKt.rememberSheetState(false, lVar2, sheetValue2, z5, composer, (i5 & 112) | 6 | ((i5 << 6) & 896) | ((i5 << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSheetState;
    }
}
