package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.p;
import v3.q;
import v3.r;
import v3.s;

@i0(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0080\u0001\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0080\u0001\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a&\u0010%\u001a\b\u0012\u0004\u0012\u00020 0$2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 H\u0002\u001aÝ\u0001\u0010'\u001a\u00020\u0013\"\u0004\b\u0000\u0010&*\u00020\u00122\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$2%\b\n\u0010,\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020+\u0018\u00010\u001120\b\n\u00100\u001a*\u0012\u0004\u0012\u00020.\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020/\u0018\u00010-¢\u0006\u0002\b\u00142%\b\n\u00101\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0006\u0012\u0004\u0018\u00010+0\u001123\b\u0004\u00104\u001a-\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00130-¢\u0006\u0002\b3¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b'\u00105\u001a±\u0002\u00108\u001a\u00020\u0013\"\u0004\b\u0000\u0010&*\u00020\u00122\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$2:\b\n\u0010,\u001a4\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020+\u0018\u00010-2E\b\n\u00100\u001a?\u0012\u0004\u0012\u00020.\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020/\u0018\u000107¢\u0006\u0002\b\u00142:\b\u0006\u00101\u001a4\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0006\u0012\u0004\u0018\u00010+0-2H\b\u0004\u00104\u001aB\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u001307¢\u0006\u0002\b3¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b8\u00109\u001aÝ\u0001\u0010'\u001a\u00020\u0013\"\u0004\b\u0000\u0010&*\u00020\u00122\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000:2%\b\n\u0010,\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020+\u0018\u00010\u001120\b\n\u00100\u001a*\u0012\u0004\u0012\u00020.\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020/\u0018\u00010-¢\u0006\u0002\b\u00142%\b\n\u00101\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0006\u0012\u0004\u0018\u00010+0\u001123\b\u0004\u00104\u001a-\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00130-¢\u0006\u0002\b3¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b'\u0010;\u001a±\u0002\u00108\u001a\u00020\u0013\"\u0004\b\u0000\u0010&*\u00020\u00122\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000:2:\b\n\u0010,\u001a4\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020+\u0018\u00010-2E\b\n\u00100\u001a?\u0012\u0004\u0012\u00020.\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020/\u0018\u000107¢\u0006\u0002\b\u00142:\b\u0006\u00101\u001a4\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0006\u0012\u0004\u0018\u00010+0-2H\b\u0004\u00104\u001aB\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u001307¢\u0006\u0002\b3¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b8\u0010<¨\u0006="}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells;", "columns", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/r2;", "Lkotlin/u;", "content", "LazyVerticalGrid", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLv3/l;Landroidx/compose/runtime/Composer;II)V", "rows", "LazyHorizontalGrid", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLv3/l;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "rememberColumnWidthSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "rememberRowHeightSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "", "gridSize", "slotCount", "spacing", "", "calculateCellsCrossAxisSizeImpl", "T", "items", "Lkotlin/v0;", "name", "item", "", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "itemContent", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lv3/l;Lv3/p;Lv3/l;Lv3/r;)V", "index", "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lv3/p;Lv3/q;Lv3/p;Lv3/s;)V", "", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lv3/l;Lv3/p;Lv3/l;Lv3/r;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lv3/p;Lv3/q;Lv3/p;Lv3/s;)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,563:1\n154#2:564\n154#2:565\n67#3,3:566\n66#3:569\n67#3,3:576\n66#3:579\n1116#4,6:570\n1116#4,6:580\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n66#1:564\n119#1:565\n149#1:566,3\n149#1:569\n182#1:576,3\n182#1:579\n149#1:570,6\n182#1:580,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyHorizontalGrid(@p4.l androidx.compose.foundation.lazy.grid.GridCells r28, @p4.m androidx.compose.ui.Modifier r29, @p4.m androidx.compose.foundation.lazy.grid.LazyGridState r30, @p4.m androidx.compose.foundation.layout.PaddingValues r31, boolean r32, @p4.m androidx.compose.foundation.layout.Arrangement.Horizontal r33, @p4.m androidx.compose.foundation.layout.Arrangement.Vertical r34, @p4.m androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, @p4.l v3.l<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.r2> r37, @p4.m androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, v3.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyVerticalGrid(@p4.l androidx.compose.foundation.lazy.grid.GridCells r28, @p4.m androidx.compose.ui.Modifier r29, @p4.m androidx.compose.foundation.lazy.grid.LazyGridState r30, @p4.m androidx.compose.foundation.layout.PaddingValues r31, boolean r32, @p4.m androidx.compose.foundation.layout.Arrangement.Vertical r33, @p4.m androidx.compose.foundation.layout.Arrangement.Horizontal r34, @p4.m androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, @p4.l v3.l<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.r2> r37, @p4.m androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, v3.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i5, int i6, int i7) {
        int i8;
        int i9 = i5 - (i7 * (i6 - 1));
        int i10 = i9 / i6;
        int i11 = i9 % i6;
        ArrayList arrayList = new ArrayList(i6);
        for (int i12 = 0; i12 < i6; i12++) {
            if (i12 < i11) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            arrayList.add(Integer.valueOf(i8 + i10));
        }
        return arrayList;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@l LazyGridScope lazyGridScope, @l List<? extends T> list, @m v3.l<? super T, ? extends Object> lVar, @m p<? super LazyGridItemSpanScope, ? super T, GridItemSpan> pVar, @l v3.l<? super T, ? extends Object> lVar2, @l r<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, r2> rVar) {
        lazyGridScope.items(list.size(), lVar != null ? new LazyGridDslKt$items$2(lVar, list) : null, pVar != null ? new LazyGridDslKt$items$3(pVar, list) : null, new LazyGridDslKt$items$4(lVar2, list), ComposableLambdaKt.composableLambdaInstance(699646206, true, new LazyGridDslKt$items$5(rVar, list)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List list, v3.l lVar, p pVar, v3.l lVar2, r rVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        if ((i5 & 4) != 0) {
            pVar = null;
        }
        if ((i5 & 8) != 0) {
            lVar2 = LazyGridDslKt$items$1.INSTANCE;
        }
        lazyGridScope.items(list.size(), lVar != null ? new LazyGridDslKt$items$2(lVar, list) : null, pVar != null ? new LazyGridDslKt$items$3(pVar, list) : null, new LazyGridDslKt$items$4(lVar2, list), ComposableLambdaKt.composableLambdaInstance(699646206, true, new LazyGridDslKt$items$5(rVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@l LazyGridScope lazyGridScope, @l List<? extends T> list, @m p<? super Integer, ? super T, ? extends Object> pVar, @m q<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> qVar, @l p<? super Integer, ? super T, ? extends Object> pVar2, @l s<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, r2> sVar) {
        lazyGridScope.items(list.size(), pVar != null ? new LazyGridDslKt$itemsIndexed$2(pVar, list) : null, qVar != null ? new LazyGridDslKt$itemsIndexed$3(qVar, list) : null, new LazyGridDslKt$itemsIndexed$4(pVar2, list), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new LazyGridDslKt$itemsIndexed$5(sVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List list, p pVar, q qVar, p pVar2, s sVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            pVar = null;
        }
        if ((i5 & 4) != 0) {
            qVar = null;
        }
        if ((i5 & 8) != 0) {
            pVar2 = LazyGridDslKt$itemsIndexed$1.INSTANCE;
        }
        lazyGridScope.items(list.size(), pVar != null ? new LazyGridDslKt$itemsIndexed$2(pVar, list) : null, qVar != null ? new LazyGridDslKt$itemsIndexed$3(qVar, list) : null, new LazyGridDslKt$itemsIndexed$4(pVar2, list), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new LazyGridDslKt$itemsIndexed$5(sVar, list)));
    }

    @Composable
    private static final LazyGridSlotsProvider rememberColumnWidthSums(GridCells gridCells, Arrangement.Horizontal horizontal, PaddingValues paddingValues, Composer composer, int i5) {
        composer.startReplaceableGroup(1632454918);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1632454918, i5, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(gridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new GridSlotCache(new LazyGridDslKt$rememberColumnWidthSums$1$1(paddingValues, gridCells, horizontal));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyGridSlotsProvider;
    }

    @Composable
    private static final LazyGridSlotsProvider rememberRowHeightSums(GridCells gridCells, Arrangement.Vertical vertical, PaddingValues paddingValues, Composer composer, int i5) {
        composer.startReplaceableGroup(-741512409);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-741512409, i5, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:181)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(gridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new GridSlotCache(new LazyGridDslKt$rememberRowHeightSums$1$1(paddingValues, gridCells, vertical));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyGridSlotsProvider;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@l LazyGridScope lazyGridScope, @l T[] tArr, @m v3.l<? super T, ? extends Object> lVar, @m p<? super LazyGridItemSpanScope, ? super T, GridItemSpan> pVar, @l v3.l<? super T, ? extends Object> lVar2, @l r<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, r2> rVar) {
        lazyGridScope.items(tArr.length, lVar != null ? new LazyGridDslKt$items$7(lVar, tArr) : null, pVar != null ? new LazyGridDslKt$items$8(pVar, tArr) : null, new LazyGridDslKt$items$9(lVar2, tArr), ComposableLambdaKt.composableLambdaInstance(407562193, true, new LazyGridDslKt$items$10(rVar, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@l LazyGridScope lazyGridScope, @l T[] tArr, @m p<? super Integer, ? super T, ? extends Object> pVar, @m q<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> qVar, @l p<? super Integer, ? super T, ? extends Object> pVar2, @l s<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, r2> sVar) {
        lazyGridScope.items(tArr.length, pVar != null ? new LazyGridDslKt$itemsIndexed$7(pVar, tArr) : null, qVar != null ? new LazyGridDslKt$itemsIndexed$8(qVar, tArr) : null, new LazyGridDslKt$itemsIndexed$9(pVar2, tArr), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new LazyGridDslKt$itemsIndexed$10(sVar, tArr)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] objArr, v3.l lVar, p pVar, v3.l lVar2, r rVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        if ((i5 & 4) != 0) {
            pVar = null;
        }
        if ((i5 & 8) != 0) {
            lVar2 = LazyGridDslKt$items$6.INSTANCE;
        }
        lazyGridScope.items(objArr.length, lVar != null ? new LazyGridDslKt$items$7(lVar, objArr) : null, pVar != null ? new LazyGridDslKt$items$8(pVar, objArr) : null, new LazyGridDslKt$items$9(lVar2, objArr), ComposableLambdaKt.composableLambdaInstance(407562193, true, new LazyGridDslKt$items$10(rVar, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] objArr, p pVar, q qVar, p pVar2, s sVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            pVar = null;
        }
        if ((i5 & 4) != 0) {
            qVar = null;
        }
        if ((i5 & 8) != 0) {
            pVar2 = LazyGridDslKt$itemsIndexed$6.INSTANCE;
        }
        lazyGridScope.items(objArr.length, pVar != null ? new LazyGridDslKt$itemsIndexed$7(pVar, objArr) : null, qVar != null ? new LazyGridDslKt$itemsIndexed$8(qVar, objArr) : null, new LazyGridDslKt$itemsIndexed$9(pVar2, objArr), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new LazyGridDslKt$itemsIndexed$10(sVar, objArr)));
    }
}
