package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017JV\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/OneLine;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "icon", "text", "trailing", "ListItem", "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "MinHeight", "F", "MinHeightWithIcon", "IconMinPaddedWidth", "IconLeftPadding", "IconVerticalPadding", "ContentLeftPadding", "ContentRightPadding", "TrailingRightPadding", "<init>", "()V", "material_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/OneLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n87#2,6:437\n93#2:471\n97#2:595\n79#3,11:443\n79#3,11:478\n92#3:510\n79#3,11:517\n92#3:549\n79#3,11:557\n92#3:589\n92#3:594\n456#4,8:454\n464#4,3:468\n456#4,8:489\n464#4,3:503\n467#4,3:507\n456#4,8:528\n464#4,3:542\n467#4,3:546\n456#4,8:568\n464#4,3:582\n467#4,3:586\n467#4,3:591\n3737#5,6:462\n3737#5,6:497\n3737#5,6:536\n3737#5,6:576\n51#6:472\n69#7,5:473\n74#7:506\n78#7:511\n69#7,5:512\n74#7:545\n78#7:550\n68#7,6:551\n74#7:585\n78#7:590\n154#8:596\n154#8:597\n154#8:598\n154#8:599\n154#8:600\n154#8:601\n154#8:602\n154#8:603\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/OneLine\n*L\n146#1:437,6\n146#1:471\n146#1:595\n146#1:443,11\n148#1:478,11\n148#1:510\n159#1:517,11\n159#1:549\n166#1:557,11\n166#1:589\n146#1:594\n146#1:454,8\n146#1:468,3\n148#1:489,8\n148#1:503,3\n148#1:507,3\n159#1:528,8\n159#1:542,3\n159#1:546,3\n166#1:568,8\n166#1:582,3\n166#1:586,3\n146#1:591,3\n146#1:462,6\n148#1:497,6\n159#1:536,6\n166#1:576,6\n150#1:472\n148#1:473,5\n148#1:506\n148#1:511\n159#1:512,5\n159#1:545\n159#1:550\n166#1:551,6\n166#1:585\n166#1:590\n123#1:596\n124#1:597\n127#1:598\n128#1:599\n129#1:600\n132#1:601\n133#1:602\n136#1:603\n*E\n"})
/* loaded from: classes.dex */
public final class OneLine {
    private static final float ContentLeftPadding;
    private static final float ContentRightPadding;
    private static final float IconLeftPadding;
    private static final float TrailingRightPadding;

    @l
    public static final OneLine INSTANCE = new OneLine();
    private static final float MinHeight = Dp.m6044constructorimpl(48);
    private static final float MinHeightWithIcon = Dp.m6044constructorimpl(56);
    private static final float IconMinPaddedWidth = Dp.m6044constructorimpl(40);
    private static final float IconVerticalPadding = Dp.m6044constructorimpl(8);

    static {
        float f5 = 16;
        IconLeftPadding = Dp.m6044constructorimpl(f5);
        ContentLeftPadding = Dp.m6044constructorimpl(f5);
        ContentRightPadding = Dp.m6044constructorimpl(f5);
        TrailingRightPadding = Dp.m6044constructorimpl(f5);
    }

    private OneLine() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00be  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ListItem(@p4.m androidx.compose.ui.Modifier r26, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r27, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OneLine.ListItem(androidx.compose.ui.Modifier, v3.p, v3.p, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
