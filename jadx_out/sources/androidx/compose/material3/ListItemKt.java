package androidx.compose.material3;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ListItemType;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a©\u0001\u0010\u0011\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001av\u0010\u0017\u001a\u00020\u00012\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a`\u0010)\u001a\u00020&*\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a`\u0010.\u001a\u00020&*\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010+\u001a\u00020*2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001af\u00104\u001a\u000203*\u00020\u00192\u0006\u0010/\u001a\u00020&2\u0006\u00100\u001a\u00020&2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u00102\u001a\u0002012\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002\u001a5\u0010<\u001a\u00020\u00012\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0011\u00109\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b:\u0010;\" \u0010=\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@\" \u0010C\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bC\u0010>\u0012\u0004\bE\u0010B\u001a\u0004\bD\u0010@\" \u0010F\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bF\u0010>\u0012\u0004\bH\u0010B\u001a\u0004\bG\u0010@\" \u0010I\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bI\u0010>\u0012\u0004\bK\u0010B\u001a\u0004\bJ\u0010@\" \u0010L\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bL\u0010>\u0012\u0004\bN\u0010B\u001a\u0004\bM\u0010@\" \u0010O\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bO\u0010>\u0012\u0004\bQ\u0010B\u001a\u0004\bP\u0010@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006R"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "headlineContent", "Landroidx/compose/ui/Modifier;", "modifier", "overlineContent", "supportingContent", "leadingContent", "trailingContent", "Landroidx/compose/material3/ListItemColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "ListItem-HXNGIdc", "(Lv3/p;Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/material3/ListItemColors;FFLandroidx/compose/runtime/Composer;II)V", "ListItem", "leading", "trailing", "headline", "overline", "supporting", "ListItemLayout", "(Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "leadingPlaceable", "trailingPlaceable", "headlinePlaceable", "overlinePlaceable", "supportingPlaceable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "calculateWidth-xygx4p4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/layout/PaddingValues;J)I", "calculateWidth", "Landroidx/compose/material3/ListItemType;", "listItemType", "calculateHeight-N4Jib3Y", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ILandroidx/compose/foundation/layout/PaddingValues;J)I", "calculateHeight", "width", "height", "", "isThreeLine", "Landroidx/compose/ui/layout/MeasureResult;", "place", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "textToken", "content", "ProvideTextStyleFromToken-3J-VO9M", "(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "ProvideTextStyleFromToken", "ListItemVerticalPadding", "F", "getListItemVerticalPadding", "()F", "getListItemVerticalPadding$annotations", "()V", "ListItemThreeLineVerticalPadding", "getListItemThreeLineVerticalPadding", "getListItemThreeLineVerticalPadding$annotations", "ListItemStartPadding", "getListItemStartPadding", "getListItemStartPadding$annotations", "ListItemEndPadding", "getListItemEndPadding", "getListItemEndPadding$annotations", "LeadingContentEndPadding", "getLeadingContentEndPadding", "getLeadingContentEndPadding$annotations", "TrailingContentStartPadding", "getTrailingContentStartPadding", "getTrailingContentStartPadding$annotations", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,581:1\n74#2:582\n1116#3,6:583\n1116#3,6:597\n166#4,7:589\n78#4,11:603\n91#4:634\n174#4:635\n36#5:596\n456#5,8:614\n464#5,6:628\n3737#6,6:622\n51#7:636\n51#7:637\n154#8:638\n154#8:639\n154#8:640\n154#8:641\n154#8:642\n154#8:643\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt\n*L\n169#1:582\n178#1:583,6\n170#1:597,6\n170#1:589,7\n170#1:603,11\n170#1:634\n170#1:635\n170#1:596\n170#1:614,8\n170#1:628,6\n170#1:622,6\n289#1:636\n320#1:637\n561#1:638\n564#1:639\n567#1:640\n570#1:641\n575#1:642\n580#1:643\n*E\n"})
/* loaded from: classes.dex */
public final class ListItemKt {
    private static final float LeadingContentEndPadding;
    private static final float ListItemEndPadding;
    private static final float ListItemStartPadding;
    private static final float TrailingContentStartPadding;
    private static final float ListItemVerticalPadding = Dp.m6044constructorimpl(8);
    private static final float ListItemThreeLineVerticalPadding = Dp.m6044constructorimpl(12);

    static {
        float f5 = 16;
        ListItemStartPadding = Dp.m6044constructorimpl(f5);
        ListItemEndPadding = Dp.m6044constructorimpl(f5);
        LeadingContentEndPadding = Dp.m6044constructorimpl(f5);
        TrailingContentStartPadding = Dp.m6044constructorimpl(f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a3  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ListItem-HXNGIdc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1966ListItemHXNGIdc(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, @p4.m androidx.compose.ui.Modifier r39, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r40, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r41, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r42, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r43, @p4.m androidx.compose.material3.ListItemColors r44, float r45, float r46, @p4.m androidx.compose.runtime.Composer r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.m1966ListItemHXNGIdc(v3.p, androidx.compose.ui.Modifier, v3.p, v3.p, v3.p, v3.p, androidx.compose.material3.ListItemColors, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    public static final void ListItemLayout(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, v3.p<? super Composer, ? super Integer, r2> pVar5, Composer composer, int i5) {
        int i6;
        v3.p<? super Composer, ? super Integer, r2> pVar6;
        v3.p<? super Composer, ? super Integer, r2> pVar7;
        v3.p<? super Composer, ? super Integer, r2> pVar8;
        v3.p<? super Composer, ? super Integer, r2> pVar9;
        List L;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(2052297037);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i6 = i11 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i6 |= i10;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i6 |= i9;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(pVar4)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i6 |= i8;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(pVar5)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i6 |= i7;
        }
        if ((i6 & 9363) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2052297037, i6, -1, "androidx.compose.material3.ListItemLayout (ListItem.kt:167)");
            }
            final LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            v3.p[] pVarArr = new v3.p[5];
            pVarArr[0] = pVar3;
            if (pVar4 == null) {
                pVar6 = ComposableSingletons$ListItemKt.INSTANCE.m1749getLambda1$material3_release();
            } else {
                pVar6 = pVar4;
            }
            pVarArr[1] = pVar6;
            if (pVar5 == null) {
                pVar7 = ComposableSingletons$ListItemKt.INSTANCE.m1750getLambda2$material3_release();
            } else {
                pVar7 = pVar5;
            }
            pVarArr[2] = pVar7;
            if (pVar == null) {
                pVar8 = ComposableSingletons$ListItemKt.INSTANCE.m1751getLambda3$material3_release();
            } else {
                pVar8 = pVar;
            }
            pVarArr[3] = pVar8;
            if (pVar2 == null) {
                pVar9 = ComposableSingletons$ListItemKt.INSTANCE.m1752getLambda4$material3_release();
            } else {
                pVar9 = pVar2;
            }
            pVarArr[4] = pVar9;
            L = kotlin.collections.w.L(pVarArr);
            startRestartGroup.startReplaceableGroup(1361340338);
            boolean changed = startRestartGroup.changed(layoutDirection);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.ListItemKt$ListItemLayout$1$1
                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s, reason: not valid java name */
                    public final MeasureResult mo1973measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends List<? extends Measurable>> list, long j5) {
                        Object D2;
                        Placeable placeable;
                        Object D22;
                        Placeable placeable2;
                        Object D23;
                        Placeable placeable3;
                        Object D24;
                        Placeable placeable4;
                        boolean z4;
                        Object D25;
                        Placeable placeable5;
                        boolean z5;
                        float listItemVerticalPadding;
                        float listItemVerticalPadding2;
                        int m1972calculateWidthxygx4p4;
                        int m1971calculateHeightN4Jib3Y;
                        MeasureResult place;
                        boolean z6 = false;
                        List<? extends Measurable> list2 = list.get(0);
                        List<? extends Measurable> list3 = list.get(1);
                        List<? extends Measurable> list4 = list.get(2);
                        List<? extends Measurable> list5 = list.get(3);
                        List<? extends Measurable> list6 = list.get(4);
                        long m6016offsetNN6EwU = ConstraintsKt.m6016offsetNN6EwU(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null), -measureScope.mo298roundToPx0680j_4(Dp.m6044constructorimpl(ListItemKt.getListItemStartPadding() + ListItemKt.getListItemEndPadding())), -measureScope.mo298roundToPx0680j_4(Dp.m6044constructorimpl(ListItemKt.getListItemVerticalPadding() * 2)));
                        D2 = kotlin.collections.e0.D2(list5);
                        Measurable measurable = (Measurable) D2;
                        if (measurable != null) {
                            placeable = measurable.mo4998measureBRTryo0(m6016offsetNN6EwU);
                        } else {
                            placeable = null;
                        }
                        int widthOrZero = TextFieldImplKt.widthOrZero(placeable) + 0;
                        D22 = kotlin.collections.e0.D2(list6);
                        Measurable measurable2 = (Measurable) D22;
                        if (measurable2 != null) {
                            placeable2 = measurable2.mo4998measureBRTryo0(ConstraintsKt.m6017offsetNN6EwU$default(m6016offsetNN6EwU, -widthOrZero, 0, 2, null));
                        } else {
                            placeable2 = null;
                        }
                        int widthOrZero2 = widthOrZero + TextFieldImplKt.widthOrZero(placeable2);
                        D23 = kotlin.collections.e0.D2(list2);
                        Measurable measurable3 = (Measurable) D23;
                        if (measurable3 != null) {
                            placeable3 = measurable3.mo4998measureBRTryo0(ConstraintsKt.m6017offsetNN6EwU$default(m6016offsetNN6EwU, -widthOrZero2, 0, 2, null));
                        } else {
                            placeable3 = null;
                        }
                        int heightOrZero = TextFieldImplKt.heightOrZero(placeable3) + 0;
                        D24 = kotlin.collections.e0.D2(list4);
                        Measurable measurable4 = (Measurable) D24;
                        if (measurable4 != null) {
                            placeable4 = measurable4.mo4998measureBRTryo0(ConstraintsKt.m6016offsetNN6EwU(m6016offsetNN6EwU, -widthOrZero2, -heightOrZero));
                        } else {
                            placeable4 = null;
                        }
                        int heightOrZero2 = heightOrZero + TextFieldImplKt.heightOrZero(placeable4);
                        if (placeable4 != null && placeable4.get(AlignmentLineKt.getFirstBaseline()) != placeable4.get(AlignmentLineKt.getLastBaseline())) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        D25 = kotlin.collections.e0.D2(list3);
                        Measurable measurable5 = (Measurable) D25;
                        if (measurable5 != null) {
                            placeable5 = measurable5.mo4998measureBRTryo0(ConstraintsKt.m6016offsetNN6EwU(m6016offsetNN6EwU, -widthOrZero2, -heightOrZero2));
                        } else {
                            placeable5 = null;
                        }
                        ListItemType.Companion companion = ListItemType.Companion;
                        if (placeable5 != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (placeable4 != null) {
                            z6 = true;
                        }
                        int m1983getListItemTypeZLSjz4$material3_release = companion.m1983getListItemTypeZLSjz4$material3_release(z5, z6, z4);
                        boolean m1978equalsimpl0 = ListItemType.m1978equalsimpl0(m1983getListItemTypeZLSjz4$material3_release, companion.m1985getThreeLineAlXitO8());
                        float listItemStartPadding = ListItemKt.getListItemStartPadding();
                        float listItemEndPadding = ListItemKt.getListItemEndPadding();
                        if (m1978equalsimpl0) {
                            listItemVerticalPadding = ListItemKt.getListItemThreeLineVerticalPadding();
                        } else {
                            listItemVerticalPadding = ListItemKt.getListItemVerticalPadding();
                        }
                        if (m1978equalsimpl0) {
                            listItemVerticalPadding2 = ListItemKt.getListItemThreeLineVerticalPadding();
                        } else {
                            listItemVerticalPadding2 = ListItemKt.getListItemVerticalPadding();
                        }
                        PaddingValues m549PaddingValuesa9UjIt4 = PaddingKt.m549PaddingValuesa9UjIt4(listItemStartPadding, listItemVerticalPadding, listItemEndPadding, listItemVerticalPadding2);
                        Placeable placeable6 = placeable;
                        Placeable placeable7 = placeable2;
                        Placeable placeable8 = placeable3;
                        Placeable placeable9 = placeable5;
                        Placeable placeable10 = placeable4;
                        m1972calculateWidthxygx4p4 = ListItemKt.m1972calculateWidthxygx4p4(measureScope, placeable6, placeable7, placeable8, placeable9, placeable10, LayoutDirection.this, m549PaddingValuesa9UjIt4, j5);
                        m1971calculateHeightN4Jib3Y = ListItemKt.m1971calculateHeightN4Jib3Y(measureScope, placeable6, placeable7, placeable8, placeable9, placeable10, m1983getListItemTypeZLSjz4$material3_release, m549PaddingValuesa9UjIt4, j5);
                        place = ListItemKt.place(measureScope, m1972calculateWidthxygx4p4, m1971calculateHeightN4Jib3Y, placeable, placeable2, placeable3, placeable5, placeable4, m1978equalsimpl0, LayoutDirection.this, m549PaddingValuesa9UjIt4);
                        return place;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1399185516);
            Modifier.Companion companion = Modifier.Companion;
            v3.p<Composer, Integer, r2> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(L);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(multiContentMeasurePolicy);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion2.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ListItemKt$ListItemLayout$2(pVar, pVar2, pVar3, pVar4, pVar5, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: ProvideTextStyleFromToken-3J-VO9M, reason: not valid java name */
    public static final void m1967ProvideTextStyleFromToken3JVO9M(long j5, TypographyKeyTokens typographyKeyTokens, v3.p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1133967795);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(j5)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(typographyKeyTokens)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
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
                ComposerKt.traceEventStart(1133967795, i6, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:518)");
            }
            ProvideContentColorTextStyleKt.m2091ProvideContentColorTextStyle3JVO9M(j5, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), typographyKeyTokens), pVar, startRestartGroup, (i6 & 14) | (i6 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ListItemKt$ProvideTextStyleFromToken$1(j5, typographyKeyTokens, pVar, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-N4Jib3Y, reason: not valid java name */
    public static final int m1971calculateHeightN4Jib3Y(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, int i5, PaddingValues paddingValues, long j5) {
        float m2940getListItemThreeLineContainerHeightD9Ej5fM;
        int B;
        ListItemType.Companion companion = ListItemType.Companion;
        if (ListItemType.m1978equalsimpl0(i5, companion.m1984getOneLineAlXitO8())) {
            m2940getListItemThreeLineContainerHeightD9Ej5fM = ListTokens.INSTANCE.m2938getListItemOneLineContainerHeightD9Ej5fM();
        } else if (ListItemType.m1978equalsimpl0(i5, companion.m1986getTwoLineAlXitO8())) {
            m2940getListItemThreeLineContainerHeightD9Ej5fM = ListTokens.INSTANCE.m2942getListItemTwoLineContainerHeightD9Ej5fM();
        } else {
            m2940getListItemThreeLineContainerHeightD9Ej5fM = ListTokens.INSTANCE.m2940getListItemThreeLineContainerHeightD9Ej5fM();
        }
        B = kotlin.ranges.u.B(Math.max(Math.max(Constraints.m6001getMinHeightimpl(j5), measureScope.mo298roundToPx0680j_4(m2940getListItemThreeLineContainerHeightD9Ej5fM)), measureScope.mo298roundToPx0680j_4(Dp.m6044constructorimpl(paddingValues.mo506calculateTopPaddingD9Ej5fM() + paddingValues.mo503calculateBottomPaddingD9Ej5fM())) + Math.max(TextFieldImplKt.heightOrZero(placeable), Math.max(TextFieldImplKt.heightOrZero(placeable3) + TextFieldImplKt.heightOrZero(placeable4) + TextFieldImplKt.heightOrZero(placeable5), TextFieldImplKt.heightOrZero(placeable2)))), Constraints.m5999getMaxHeightimpl(j5));
        return B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-xygx4p4, reason: not valid java name */
    public static final int m1972calculateWidthxygx4p4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, LayoutDirection layoutDirection, PaddingValues paddingValues, long j5) {
        if (Constraints.m5996getHasBoundedWidthimpl(j5)) {
            return Constraints.m6000getMaxWidthimpl(j5);
        }
        int mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(Dp.m6044constructorimpl(paddingValues.mo504calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo505calculateRightPaddingu2uoSUM(layoutDirection)));
        return mo298roundToPx0680j_4 + TextFieldImplKt.widthOrZero(placeable) + Math.max(TextFieldImplKt.widthOrZero(placeable3), Math.max(TextFieldImplKt.widthOrZero(placeable4), TextFieldImplKt.widthOrZero(placeable5))) + TextFieldImplKt.widthOrZero(placeable2);
    }

    public static final float getLeadingContentEndPadding() {
        return LeadingContentEndPadding;
    }

    @VisibleForTesting
    public static /* synthetic */ void getLeadingContentEndPadding$annotations() {
    }

    public static final float getListItemEndPadding() {
        return ListItemEndPadding;
    }

    @VisibleForTesting
    public static /* synthetic */ void getListItemEndPadding$annotations() {
    }

    public static final float getListItemStartPadding() {
        return ListItemStartPadding;
    }

    @VisibleForTesting
    public static /* synthetic */ void getListItemStartPadding$annotations() {
    }

    public static final float getListItemThreeLineVerticalPadding() {
        return ListItemThreeLineVerticalPadding;
    }

    @VisibleForTesting
    public static /* synthetic */ void getListItemThreeLineVerticalPadding$annotations() {
    }

    public static final float getListItemVerticalPadding() {
        return ListItemVerticalPadding;
    }

    @VisibleForTesting
    public static /* synthetic */ void getListItemVerticalPadding$annotations() {
    }

    public static final float getTrailingContentStartPadding() {
        return TrailingContentStartPadding;
    }

    @VisibleForTesting
    public static /* synthetic */ void getTrailingContentStartPadding$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult place(MeasureScope measureScope, int i5, int i6, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z4, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        return MeasureScope.layout$default(measureScope, i5, i6, null, new ListItemKt$place$1(measureScope, paddingValues, layoutDirection, placeable, placeable2, z4, placeable3, placeable4, placeable5, i6, i5), 4, null);
    }
}
