package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.a;
import v3.l;

@i0(d1 = {"\u0000F\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001aS\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u001a6\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¨\u0006\u001b²\u0006\u000e\u0010\u0019\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"", "expanded", "Lkotlin/Function1;", "Lkotlin/r2;", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "ExposedDropdownMenuBox", "(ZLv3/l;Landroidx/compose/ui/Modifier;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "", "menuLabel", "expandable", "Landroid/view/View;", "view", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "verticalMarginInPx", "onHeightUpdate", "updateHeight", "width", "menuHeight", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenu_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,740:1\n74#2:741\n74#2:742\n25#3:743\n25#3:750\n25#3:758\n67#3,3:765\n66#3:768\n25#3:775\n456#3,8:805\n464#3,3:819\n467#3,3:823\n1116#4,6:744\n1116#4,6:751\n1116#4,6:759\n1116#4,6:769\n1116#4,6:776\n1116#4,6:782\n1116#4,6:828\n1#5:757\n68#6,6:788\n74#6:822\n78#6:827\n79#7,11:794\n92#7:826\n3737#8,6:813\n75#9:834\n108#9,2:835\n75#9:837\n108#9,2:838\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenu_androidKt\n*L\n97#1:741\n98#1:742\n99#1:743\n100#1:750\n102#1:758\n104#1:765,3\n104#1:768\n117#1:775\n119#1:805,8\n119#1:819,3\n119#1:823,3\n99#1:744,6\n100#1:751,6\n102#1:759,6\n104#1:769,6\n117#1:776,6\n131#1:782,6\n138#1:828,6\n119#1:788,6\n119#1:822\n119#1:827\n119#1:794,11\n119#1:826\n119#1:813,6\n99#1:834\n99#1:835,2\n100#1:837\n100#1:838,2\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0062  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ExposedDropdownMenuBox(boolean r19, @p4.l v3.l<? super java.lang.Boolean, kotlin.r2> r20, @p4.m androidx.compose.ui.Modifier r21, @p4.l v3.q<? super androidx.compose.material.ExposedDropdownMenuBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r22, @p4.m androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(boolean, v3.l, androidx.compose.ui.Modifier, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Modifier expandable(Modifier modifier, a<r2> aVar, String str) {
        return SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifier, aVar, new ExposedDropdownMenu_androidKt$expandable$1(aVar, null)), false, new ExposedDropdownMenu_androidKt$expandable$2(str, aVar), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateHeight(View view, LayoutCoordinates layoutCoordinates, int i5, l<? super Integer, r2> lVar) {
        if (layoutCoordinates == null) {
            return;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        lVar.invoke(Integer.valueOf(((int) Math.max(LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getTop() - rect.top, (rect.bottom - r1) - LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getBottom())) - i5));
    }
}
