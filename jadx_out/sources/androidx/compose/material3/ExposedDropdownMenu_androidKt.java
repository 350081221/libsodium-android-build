package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000`\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aS\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a2\u0010\u0018\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002\u001a\"\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u001a\f\u0010\u001f\u001a\u00020\u0019*\u00020\rH\u0002\u001a\u000e\u0010!\u001a\u00020\u0019*\u0004\u0018\u00010 H\u0002\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006(²\u0006\u0010\u0010%\u001a\u0004\u0018\u00010 8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010&\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010'\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "expanded", "Lkotlin/Function1;", "Lkotlin/r2;", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "ExposedDropdownMenuBox", "(ZLv3/l;Landroidx/compose/ui/Modifier;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "Landroid/view/View;", "view", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function0;", "onKeyboardVisibilityChange", "SoftKeyboardListener", "(Landroid/view/View;Landroidx/compose/ui/unit/Density;Lv3/a;Landroidx/compose/runtime/Composer;I)V", "", "expandedDescription", "collapsedDescription", "expandable", "Landroidx/compose/ui/geometry/Rect;", "windowBounds", "anchorBounds", "", "verticalMargin", "calculateMaxHeight", "getWindowBounds", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getAnchorBounds", "Landroidx/compose/ui/unit/Dp;", "ExposedDropdownMenuItemHorizontalPadding", "F", "anchorCoordinates", "anchorWidth", "menuMaxHeight", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1091:1\n74#2:1092\n74#2:1093\n74#2:1094\n1#3:1095\n1116#4,6:1096\n1116#4,6:1102\n1116#4,6:1108\n1116#4,6:1114\n1116#4,6:1122\n1116#4,6:1168\n1116#4,6:1174\n1116#4,6:1180\n56#5:1120\n58#5:1121\n68#6,6:1128\n74#6:1162\n78#6:1167\n78#7,11:1134\n91#7:1166\n456#8,8:1145\n464#8,3:1159\n467#8,3:1163\n3737#9,6:1153\n81#10:1186\n107#10,2:1187\n75#11:1189\n108#11,2:1190\n75#11:1192\n108#11,2:1193\n154#12:1195\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt\n*L\n117#1:1092\n118#1:1093\n119#1:1094\n123#1:1096,6\n124#1:1102,6\n125#1:1108,6\n127#1:1114,6\n131#1:1122,6\n172#1:1168,6\n181#1:1174,6\n194#1:1180,6\n128#1:1120\n129#1:1121\n167#1:1128,6\n167#1:1162\n167#1:1167\n167#1:1134,11\n167#1:1166\n167#1:1145,8\n167#1:1159,3\n167#1:1163,3\n167#1:1153,6\n123#1:1186\n123#1:1187,2\n124#1:1189\n124#1:1190,2\n125#1:1192\n125#1:1193,2\n1090#1:1195\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt {
    private static final float ExposedDropdownMenuItemHorizontalPadding = Dp.m6044constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0066  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ExposedDropdownMenuBox(final boolean r26, @p4.l final v3.l<? super java.lang.Boolean, kotlin.r2> r27, @p4.m androidx.compose.ui.Modifier r28, @p4.l v3.q<? super androidx.compose.material3.ExposedDropdownMenuBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(boolean, v3.l, androidx.compose.ui.Modifier, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates ExposedDropdownMenuBox$lambda$2(MutableState<LayoutCoordinates> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void SoftKeyboardListener(View view, Density density, v3.a<r2> aVar, Composer composer, int i5) {
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1319522472);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changedInstance(view)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(density)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1319522472, i6, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:190)");
            }
            startRestartGroup.startReplaceableGroup(-491766155);
            boolean changedInstance = startRestartGroup.changedInstance(view);
            if ((i6 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = changedInstance | z4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1(view, aVar);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(view, density, (v3.l) rememberedValue, startRestartGroup, (i6 & 14) | (i6 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ExposedDropdownMenu_androidKt$SoftKeyboardListener$2(view, density, aVar, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateMaxHeight(Rect rect, Rect rect2, int i5) {
        int L0;
        if (rect2 == null) {
            return 0;
        }
        float f5 = i5;
        float top = rect.getTop() + f5;
        float bottom = rect.getBottom() - f5;
        if (rect2.getTop() <= rect.getBottom() && rect2.getBottom() >= rect.getTop()) {
            L0 = kotlin.math.d.L0(Math.max(rect2.getTop() - top, bottom - rect2.getBottom()));
        } else {
            L0 = kotlin.math.d.L0(bottom - top);
        }
        return Math.max(L0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier expandable(Modifier modifier, boolean z4, v3.a<r2> aVar, String str, String str2) {
        return SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifier, aVar, new ExposedDropdownMenu_androidKt$expandable$1(aVar, null)), false, new ExposedDropdownMenu_androidKt$expandable$2(z4, str, str2, aVar), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getAnchorBounds(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates == null ? Rect.Companion.getZero() : RectKt.m3533Recttz77jQw(LayoutCoordinatesKt.positionInWindow(layoutCoordinates), IntSizeKt.m6224toSizeozmzZPI(layoutCoordinates.mo5005getSizeYbymL2g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getWindowBounds(View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return RectHelper_androidKt.toComposeRect(rect);
    }
}
