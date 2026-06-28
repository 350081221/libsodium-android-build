package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.p;
import v3.r;
import v3.s;

@i0(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0083\u0001\u0010\"\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a'\u0010#\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b#\u0010$\u001aÒ\u0001\u0010'\u001a\u00020\u0013\"\u0004\b\u0000\u0010%*\u00020\u00122\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2%\b\n\u0010,\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020+\u0018\u00010\u00112%\b\u0006\u0010-\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0006\u0012\u0004\u0018\u00010+0\u00112%\b\n\u0010/\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020.\u0018\u00010\u001123\b\u0004\u00103\u001a-\u0012\u0004\u0012\u000201\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u001300¢\u0006\u0002\b2¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b'\u00104\u001a¦\u0002\u00108\u001a\u00020\u0013\"\u0004\b\u0000\u0010%*\u00020\u00122\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2:\b\n\u0010,\u001a4\u0012\u0013\u0012\u001105¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020+\u0018\u0001002:\b\u0006\u0010-\u001a4\u0012\u0013\u0012\u001105¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0006\u0012\u0004\u0018\u00010+002:\b\n\u0010/\u001a4\u0012\u0013\u0012\u001105¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020.\u0018\u0001002H\b\u0004\u00103\u001aB\u0012\u0004\u0012\u000201\u0012\u0013\u0012\u001105¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u001307¢\u0006\u0002\b2¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b8\u00109\u001aÒ\u0001\u0010'\u001a\u00020\u0013\"\u0004\b\u0000\u0010%*\u00020\u00122\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000:2%\b\n\u0010,\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020+\u0018\u00010\u00112%\b\u0006\u0010-\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0006\u0012\u0004\u0018\u00010+0\u00112%\b\n\u0010/\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020.\u0018\u00010\u001123\b\u0004\u00103\u001a-\u0012\u0004\u0012\u000201\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u001300¢\u0006\u0002\b2¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b'\u0010;\u001a¦\u0002\u00108\u001a\u00020\u0013\"\u0004\b\u0000\u0010%*\u00020\u00122\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000:2:\b\n\u0010,\u001a4\u0012\u0013\u0012\u001105¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020+\u0018\u0001002:\b\u0006\u0010-\u001a4\u0012\u0013\u0012\u001105¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0006\u0012\u0004\u0018\u00010+002:\b\n\u0010/\u001a4\u0012\u0013\u0012\u001105¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020.\u0018\u0001002H\b\u0004\u00103\u001aB\u0012\u0004\u0012\u000201\u0012\u0013\u0012\u001105¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u001307¢\u0006\u0002\b2¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b8\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "columns", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/ui/unit/Dp;", "verticalItemSpacing", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/r2;", "Lkotlin/u;", "content", "LazyVerticalStaggeredGrid-zadm560", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLv3/l;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalStaggeredGrid", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "rememberColumnSlots", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "rows", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "horizontalItemSpacing", "LazyHorizontalStaggeredGrid-cJHQLPU", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLv3/l;Landroidx/compose/runtime/Composer;II)V", "LazyHorizontalStaggeredGrid", "rememberRowSlots", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "T", "", "items", "Lkotlin/v0;", "name", "item", "", DatabaseFileArchive.COLUMN_KEY, "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "itemContent", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lv3/l;Lv3/l;Lv3/l;Lv3/r;)V", "", "index", "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lv3/p;Lv3/p;Lv3/p;Lv3/s;)V", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lv3/l;Lv3/l;Lv3/l;Lv3/r;)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lv3/p;Lv3/p;Lv3/p;Lv3/s;)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,463:1\n154#2:464\n154#2:465\n154#2:466\n154#2:477\n154#2:478\n154#2:479\n67#3,3:467\n66#3:470\n67#3,3:480\n66#3:483\n1116#4,6:471\n1116#4,6:484\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n*L\n66#1:464\n68#1:465\n69#1:466\n156#1:477\n158#1:478\n159#1:479\n95#1:467,3\n95#1:470\n185#1:480,3\n185#1:483\n95#1:471,6\n185#1:484,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m739LazyHorizontalStaggeredGridcJHQLPU(@p4.l androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, @p4.m androidx.compose.ui.Modifier r29, @p4.m androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, @p4.m androidx.compose.foundation.layout.PaddingValues r31, boolean r32, @p4.m androidx.compose.foundation.layout.Arrangement.Vertical r33, float r34, @p4.m androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, @p4.l v3.l<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.r2> r37, @p4.m androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m739LazyHorizontalStaggeredGridcJHQLPU(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, v3.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m740LazyVerticalStaggeredGridzadm560(@p4.l androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, @p4.m androidx.compose.ui.Modifier r29, @p4.m androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, @p4.m androidx.compose.foundation.layout.PaddingValues r31, boolean r32, float r33, @p4.m androidx.compose.foundation.layout.Arrangement.Horizontal r34, @p4.m androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, @p4.l v3.l<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.r2> r37, @p4.m androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m740LazyVerticalStaggeredGridzadm560(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, v3.l, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@l LazyStaggeredGridScope lazyStaggeredGridScope, @l List<? extends T> list, @m v3.l<? super T, ? extends Object> lVar, @l v3.l<? super T, ? extends Object> lVar2, @m v3.l<? super T, StaggeredGridItemSpan> lVar3, @l r<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, r2> rVar) {
        lazyStaggeredGridScope.items(list.size(), lVar != null ? new LazyStaggeredGridDslKt$items$2$1(lVar, list) : null, new LazyStaggeredGridDslKt$items$3(lVar2, list), lVar3 != null ? new LazyStaggeredGridDslKt$items$4$1(lVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new LazyStaggeredGridDslKt$items$5(rVar, list)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, v3.l lVar, v3.l lVar2, v3.l lVar3, r rVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        if ((i5 & 4) != 0) {
            lVar2 = LazyStaggeredGridDslKt$items$1.INSTANCE;
        }
        if ((i5 & 8) != 0) {
            lVar3 = null;
        }
        lazyStaggeredGridScope.items(list.size(), lVar != null ? new LazyStaggeredGridDslKt$items$2$1(lVar, list) : null, new LazyStaggeredGridDslKt$items$3(lVar2, list), lVar3 != null ? new LazyStaggeredGridDslKt$items$4$1(lVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new LazyStaggeredGridDslKt$items$5(rVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@l LazyStaggeredGridScope lazyStaggeredGridScope, @l List<? extends T> list, @m p<? super Integer, ? super T, ? extends Object> pVar, @l p<? super Integer, ? super T, ? extends Object> pVar2, @m p<? super Integer, ? super T, StaggeredGridItemSpan> pVar3, @l s<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, r2> sVar) {
        lazyStaggeredGridScope.items(list.size(), pVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(pVar, list) : null, new LazyStaggeredGridDslKt$itemsIndexed$3(pVar2, list), pVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(pVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new LazyStaggeredGridDslKt$itemsIndexed$5(sVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, p pVar, p pVar2, p pVar3, s sVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            pVar = null;
        }
        if ((i5 & 4) != 0) {
            pVar2 = LazyStaggeredGridDslKt$itemsIndexed$1.INSTANCE;
        }
        if ((i5 & 8) != 0) {
            pVar3 = null;
        }
        lazyStaggeredGridScope.items(list.size(), pVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(pVar, list) : null, new LazyStaggeredGridDslKt$itemsIndexed$3(pVar2, list), pVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(pVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new LazyStaggeredGridDslKt$itemsIndexed$5(sVar, list)));
    }

    @Composable
    private static final LazyGridStaggeredGridSlotsProvider rememberColumnSlots(StaggeredGridCells staggeredGridCells, Arrangement.Horizontal horizontal, PaddingValues paddingValues, Composer composer, int i5) {
        composer.startReplaceableGroup(-1267076841);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1267076841, i5, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:94)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(staggeredGridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridSlotCache(new LazyStaggeredGridDslKt$rememberColumnSlots$1$1(paddingValues, staggeredGridCells, horizontal));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyGridStaggeredGridSlotsProvider;
    }

    @Composable
    private static final LazyGridStaggeredGridSlotsProvider rememberRowSlots(StaggeredGridCells staggeredGridCells, Arrangement.Vertical vertical, PaddingValues paddingValues, Composer composer, int i5) {
        composer.startReplaceableGroup(-1532383053);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1532383053, i5, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:184)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(staggeredGridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridSlotCache(new LazyStaggeredGridDslKt$rememberRowSlots$1$1(paddingValues, staggeredGridCells, vertical));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyGridStaggeredGridSlotsProvider;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@l LazyStaggeredGridScope lazyStaggeredGridScope, @l T[] tArr, @m v3.l<? super T, ? extends Object> lVar, @l v3.l<? super T, ? extends Object> lVar2, @m v3.l<? super T, StaggeredGridItemSpan> lVar3, @l r<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, r2> rVar) {
        lazyStaggeredGridScope.items(tArr.length, lVar != null ? new LazyStaggeredGridDslKt$items$7$1(lVar, tArr) : null, new LazyStaggeredGridDslKt$items$8(lVar2, tArr), lVar3 != null ? new LazyStaggeredGridDslKt$items$9$1(lVar3, tArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new LazyStaggeredGridDslKt$items$10(rVar, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@l LazyStaggeredGridScope lazyStaggeredGridScope, @l T[] tArr, @m p<? super Integer, ? super T, ? extends Object> pVar, @l p<? super Integer, ? super T, ? extends Object> pVar2, @m p<? super Integer, ? super T, StaggeredGridItemSpan> pVar3, @l s<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, r2> sVar) {
        lazyStaggeredGridScope.items(tArr.length, pVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(pVar, tArr) : null, new LazyStaggeredGridDslKt$itemsIndexed$8(pVar2, tArr), pVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(pVar3, tArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new LazyStaggeredGridDslKt$itemsIndexed$10(sVar, tArr)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, v3.l lVar, v3.l lVar2, v3.l lVar3, r rVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        if ((i5 & 4) != 0) {
            lVar2 = LazyStaggeredGridDslKt$items$6.INSTANCE;
        }
        if ((i5 & 8) != 0) {
            lVar3 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, lVar != null ? new LazyStaggeredGridDslKt$items$7$1(lVar, objArr) : null, new LazyStaggeredGridDslKt$items$8(lVar2, objArr), lVar3 != null ? new LazyStaggeredGridDslKt$items$9$1(lVar3, objArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new LazyStaggeredGridDslKt$items$10(rVar, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, p pVar, p pVar2, p pVar3, s sVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            pVar = null;
        }
        if ((i5 & 4) != 0) {
            pVar2 = LazyStaggeredGridDslKt$itemsIndexed$6.INSTANCE;
        }
        if ((i5 & 8) != 0) {
            pVar3 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, pVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(pVar, objArr) : null, new LazyStaggeredGridDslKt$itemsIndexed$8(pVar2, objArr), pVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(pVar3, objArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new LazyStaggeredGridDslKt$itemsIndexed$10(sVar, objArr)));
    }
}
