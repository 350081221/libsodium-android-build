package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0080\u0001\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u001a\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R\u001a\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/material/TwoLine;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "icon", "text", "secondaryText", "overlineText", "trailing", "ListItem", "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "MinHeight", "F", "MinHeightWithIcon", "IconMinPaddedWidth", "IconLeftPadding", "IconVerticalPadding", "ContentLeftPadding", "ContentRightPadding", "OverlineBaselineOffset", "OverlineToPrimaryBaselineOffset", "PrimaryBaselineOffsetNoIcon", "PrimaryBaselineOffsetWithIcon", "PrimaryToSecondaryBaselineOffsetNoIcon", "PrimaryToSecondaryBaselineOffsetWithIcon", "TrailingRightPadding", "<init>", "()V", "material_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n87#2,6:437\n93#2:471\n97#2:516\n79#3,11:443\n79#3,11:478\n92#3:510\n92#3:515\n456#4,8:454\n464#4,3:468\n456#4,8:489\n464#4,3:503\n467#4,3:507\n467#4,3:512\n3737#5,6:462\n3737#5,6:497\n51#6:472\n69#7,5:473\n74#7:506\n78#7:511\n154#8:517\n154#8:518\n154#8:519\n154#8:520\n154#8:521\n154#8:522\n154#8:523\n154#8:524\n154#8:525\n154#8:526\n154#8:527\n154#8:528\n154#8:529\n154#8:530\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine\n*L\n209#1:437,6\n209#1:471\n209#1:516\n209#1:443,11\n214#1:478,11\n214#1:510\n209#1:515\n209#1:454,8\n209#1:468,3\n214#1:489,8\n214#1:503,3\n214#1:507,3\n209#1:512,3\n209#1:462,6\n214#1:497,6\n217#1:472\n214#1:473,5\n214#1:506\n214#1:511\n178#1:517\n179#1:518\n182#1:519\n183#1:520\n184#1:521\n187#1:522\n188#1:523\n189#1:524\n190#1:525\n191#1:526\n192#1:527\n193#1:528\n194#1:529\n197#1:530\n*E\n"})
/* loaded from: classes.dex */
public final class TwoLine {
    private static final float ContentLeftPadding;
    private static final float ContentRightPadding;
    private static final float IconLeftPadding;
    private static final float IconVerticalPadding;
    private static final float OverlineToPrimaryBaselineOffset;
    private static final float PrimaryToSecondaryBaselineOffsetNoIcon;
    private static final float PrimaryToSecondaryBaselineOffsetWithIcon;
    private static final float TrailingRightPadding;

    @l
    public static final TwoLine INSTANCE = new TwoLine();
    private static final float MinHeight = Dp.m6044constructorimpl(64);
    private static final float MinHeightWithIcon = Dp.m6044constructorimpl(72);
    private static final float IconMinPaddedWidth = Dp.m6044constructorimpl(40);
    private static final float OverlineBaselineOffset = Dp.m6044constructorimpl(24);
    private static final float PrimaryBaselineOffsetNoIcon = Dp.m6044constructorimpl(28);
    private static final float PrimaryBaselineOffsetWithIcon = Dp.m6044constructorimpl(32);

    static {
        float f5 = 16;
        IconLeftPadding = Dp.m6044constructorimpl(f5);
        IconVerticalPadding = Dp.m6044constructorimpl(f5);
        ContentLeftPadding = Dp.m6044constructorimpl(f5);
        ContentRightPadding = Dp.m6044constructorimpl(f5);
        float f6 = 20;
        OverlineToPrimaryBaselineOffset = Dp.m6044constructorimpl(f6);
        PrimaryToSecondaryBaselineOffsetNoIcon = Dp.m6044constructorimpl(f6);
        PrimaryToSecondaryBaselineOffsetWithIcon = Dp.m6044constructorimpl(f6);
        TrailingRightPadding = Dp.m6044constructorimpl(f5);
    }

    private TwoLine() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b5  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ListItem(@p4.m androidx.compose.ui.Modifier r33, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r35, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r36, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r37, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, @p4.m androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TwoLine.ListItem(androidx.compose.ui.Modifier, v3.p, v3.p, v3.p, v3.p, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
