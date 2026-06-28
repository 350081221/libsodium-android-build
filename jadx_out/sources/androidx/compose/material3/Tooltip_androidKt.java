package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aq\u0010\u0013\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a@\u0010\u001e\u001a\u00020\u001b*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/CaretScope;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/CaretProperties;", "caretProperties", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "contentColor", "containerColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "PlainTooltip-Fg7CxbU", "(Landroidx/compose/material3/CaretScope;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/CaretProperties;Landroidx/compose/ui/graphics/Shape;JJFFLv3/p;Landroidx/compose/runtime/Composer;II)V", "PlainTooltip", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/unit/Density;", "density", "Landroid/content/res/Configuration;", "configuration", "Landroidx/compose/ui/layout/LayoutCoordinates;", "anchorLayoutCoordinates", "Landroidx/compose/ui/draw/DrawResult;", "drawCaretWithPath-Bx497Mc", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JLandroidx/compose/material3/CaretProperties;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;", "drawCaretWithPath", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,185:1\n154#2:186\n154#2:195\n74#3:187\n74#3:188\n1116#4,6:189\n*S KotlinDebug\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt\n*L\n185#1:186\n129#1:195\n71#1:187\n72#1:188\n73#1:189,6\n*E\n"})
/* loaded from: classes.dex */
public final class Tooltip_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: PlainTooltip-Fg7CxbU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2596PlainTooltipFg7CxbU(@p4.l androidx.compose.material3.CaretScope r31, @p4.m androidx.compose.ui.Modifier r32, @p4.m androidx.compose.material3.CaretProperties r33, @p4.m androidx.compose.ui.graphics.Shape r34, long r35, long r37, float r39, float r40, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r41, @p4.m androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Tooltip_androidKt.m2596PlainTooltipFg7CxbU(androidx.compose.material3.CaretScope, androidx.compose.ui.Modifier, androidx.compose.material3.CaretProperties, androidx.compose.ui.graphics.Shape, long, long, float, float, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalMaterial3Api
    /* renamed from: drawCaretWithPath-Bx497Mc, reason: not valid java name */
    public static final DrawResult m2598drawCaretWithPathBx497Mc(CacheDrawScope cacheDrawScope, Density density, Configuration configuration, long j5, CaretProperties caretProperties, LayoutCoordinates layoutCoordinates) {
        boolean z4;
        long Offset;
        Path Path = AndroidPath_androidKt.Path();
        if (layoutCoordinates != null) {
            int mo298roundToPx0680j_4 = density.mo298roundToPx0680j_4(caretProperties.m1626getCaretHeightD9Ej5fM());
            int mo298roundToPx0680j_42 = density.mo298roundToPx0680j_4(caretProperties.m1627getCaretWidthD9Ej5fM());
            int mo298roundToPx0680j_43 = density.mo298roundToPx0680j_4(Dp.m6044constructorimpl(configuration.screenWidthDp));
            int mo298roundToPx0680j_44 = density.mo298roundToPx0680j_4(TooltipKt.getSpacingBetweenTooltipAndAnchor());
            Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
            float left = boundsInWindow.getLeft();
            float right = boundsInWindow.getRight();
            float top = boundsInWindow.getTop();
            float f5 = 2;
            float f6 = (right + left) / f5;
            float f7 = right - left;
            float m3562getWidthimpl = Size.m3562getWidthimpl(cacheDrawScope.m3400getSizeNHjbRc());
            float m3559getHeightimpl = Size.m3559getHeightimpl(cacheDrawScope.m3400getSizeNHjbRc());
            if ((top - m3559getHeightimpl) - mo298roundToPx0680j_44 < 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                m3559getHeightimpl = 0.0f;
            }
            float f8 = mo298roundToPx0680j_43;
            if ((m3562getWidthimpl / f5) + f6 > f8) {
                Offset = OffsetKt.Offset(m3562getWidthimpl - (f8 - f6), m3559getHeightimpl);
            } else {
                Offset = OffsetKt.Offset(f6 - Math.max(left - ((Size.m3562getWidthimpl(cacheDrawScope.m3400getSizeNHjbRc()) / f5) - (f7 / f5)), 0.0f), m3559getHeightimpl);
            }
            if (z4) {
                Path.moveTo(Offset.m3493getXimpl(Offset), Offset.m3494getYimpl(Offset));
                float f9 = mo298roundToPx0680j_42 / 2;
                Path.lineTo(Offset.m3493getXimpl(Offset) + f9, Offset.m3494getYimpl(Offset));
                Path.lineTo(Offset.m3493getXimpl(Offset), Offset.m3494getYimpl(Offset) - mo298roundToPx0680j_4);
                Path.lineTo(Offset.m3493getXimpl(Offset) - f9, Offset.m3494getYimpl(Offset));
                Path.close();
            } else {
                Path.moveTo(Offset.m3493getXimpl(Offset), Offset.m3494getYimpl(Offset));
                float f10 = mo298roundToPx0680j_42 / 2;
                Path.lineTo(Offset.m3493getXimpl(Offset) + f10, Offset.m3494getYimpl(Offset));
                Path.lineTo(Offset.m3493getXimpl(Offset), Offset.m3494getYimpl(Offset) + mo298roundToPx0680j_4);
                Path.lineTo(Offset.m3493getXimpl(Offset) - f10, Offset.m3494getYimpl(Offset));
                Path.close();
            }
        }
        return cacheDrawScope.onDrawWithContent(new Tooltip_androidKt$drawCaretWithPath$4(layoutCoordinates, Path, j5));
    }
}
