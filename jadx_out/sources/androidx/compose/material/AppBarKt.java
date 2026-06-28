package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.alipay.sdk.m.x.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.u0;
import p4.l;

@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u008c\u0001\u0010\u0014\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0084\u0001\u0010\u0014\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aj\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001ab\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001av\u0010\"\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001an\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0011\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0082\b\u001a\u0019\u0010*\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0080\b\u001a,\u0010.\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0-2\u0006\u0010+\u001a\u00020%2\u0006\u0010)\u001a\u00020%2\u0006\u0010,\u001a\u00020%H\u0000\u001aj\u00102\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000bH\u0003ø\u0001\u0000¢\u0006\u0004\b0\u00101\"\u0014\u00103\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\"\u0014\u00105\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104\"\u0014\u00106\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\"\u0014\u00108\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107\"\u0014\u00109\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00104\"\u0014\u0010:\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00104\"\u0014\u0010;\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", d.f3030v, "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/ui/Modifier;", "modifier", "navigationIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/u;", "actions", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "TopAppBar-Rx1qByU", "(Lv3/p;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Lv3/p;Lv3/q;JJFLandroidx/compose/runtime/Composer;II)V", "TopAppBar", "TopAppBar-xWeB9-s", "(Lv3/p;Landroidx/compose/ui/Modifier;Lv3/p;Lv3/q;JJFLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "content", "TopAppBar-afqeVBk", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "TopAppBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Shape;", "cutoutShape", "BottomAppBar-DanWW-k", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar", "BottomAppBar-Y1yfwus", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "", "x", "square", "cutoutRadius", "verticalOffset", "calculateCutoutCircleYIntercept", "controlPointX", "radius", "Lkotlin/u0;", "calculateRoundedEdgeIntercept", "shape", "AppBar-HkEspTQ", "(JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "AppBar", "AppBarHeight", "F", "AppBarHorizontalPadding", "TitleInsetWithoutIcon", "Landroidx/compose/ui/Modifier;", "TitleIconModifier", "BottomAppBarCutoutOffset", "BottomAppBarRoundedEdgeRadius", "ZeroInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,758:1\n606#1:761\n606#1:762\n606#1:763\n606#1:764\n606#1:765\n606#1:766\n74#2:759\n74#2:760\n154#3:767\n154#3:768\n154#3:769\n154#3:771\n154#3:773\n154#3:774\n154#3:775\n58#4:770\n58#4:772\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n632#1:761\n664#1:762\n665#1:763\n667#1:764\n674#1:765\n675#1:766\n343#1:759\n411#1:760\n743#1:767\n745#1:768\n747#1:769\n750#1:771\n753#1:773\n755#1:774\n757#1:775\n747#1:770\n750#1:772\n*E\n"})
/* loaded from: classes.dex */
public final class AppBarKt {
    private static final float AppBarHeight = Dp.m6044constructorimpl(56);
    private static final float AppBarHorizontalPadding;
    private static final float BottomAppBarCutoutOffset;
    private static final float BottomAppBarRoundedEdgeRadius;

    @l
    private static final Modifier TitleIconModifier;

    @l
    private static final Modifier TitleInsetWithoutIcon;

    @l
    private static final WindowInsets ZeroInsets;

    static {
        float f5 = 4;
        float m6044constructorimpl = Dp.m6044constructorimpl(f5);
        AppBarHorizontalPadding = m6044constructorimpl;
        Modifier.Companion companion = Modifier.Companion;
        TitleInsetWithoutIcon = SizeKt.m607width3ABfNKs(companion, Dp.m6044constructorimpl(Dp.m6044constructorimpl(16) - m6044constructorimpl));
        TitleIconModifier = SizeKt.m607width3ABfNKs(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), Dp.m6044constructorimpl(Dp.m6044constructorimpl(72) - m6044constructorimpl));
        BottomAppBarCutoutOffset = Dp.m6044constructorimpl(8);
        BottomAppBarRoundedEdgeRadius = Dp.m6044constructorimpl(f5);
        ZeroInsets = WindowInsetsKt.m627WindowInsetsa9UjIt4$default(Dp.m6044constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: AppBar-HkEspTQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1199AppBarHkEspTQ(long r25, long r27, float r29, androidx.compose.foundation.layout.PaddingValues r30, androidx.compose.ui.graphics.Shape r31, androidx.compose.foundation.layout.WindowInsets r32, androidx.compose.ui.Modifier r33, v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1199AppBarHkEspTQ(long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-DanWW-k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1200BottomAppBarDanWWk(@p4.l androidx.compose.foundation.layout.WindowInsets r30, @p4.m androidx.compose.ui.Modifier r31, long r32, long r34, @p4.m androidx.compose.ui.graphics.Shape r36, float r37, @p4.m androidx.compose.foundation.layout.PaddingValues r38, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r39, @p4.m androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1200BottomAppBarDanWWk(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.graphics.Shape, float, androidx.compose.foundation.layout.PaddingValues, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a3  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-Y1yfwus, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1201BottomAppBarY1yfwus(@p4.m androidx.compose.ui.Modifier r24, long r25, long r27, @p4.m androidx.compose.ui.graphics.Shape r29, float r30, @p4.m androidx.compose.foundation.layout.PaddingValues r31, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r32, @p4.m androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1201BottomAppBarY1yfwus(androidx.compose.ui.Modifier, long, long, androidx.compose.ui.graphics.Shape, float, androidx.compose.foundation.layout.PaddingValues, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0082  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: TopAppBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1202TopAppBarHsRjFd4(@p4.m androidx.compose.ui.Modifier r23, long r24, long r26, float r28, @p4.m androidx.compose.foundation.layout.PaddingValues r29, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r30, @p4.m androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1202TopAppBarHsRjFd4(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0081  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: TopAppBar-Rx1qByU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1203TopAppBarRx1qByU(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.l androidx.compose.foundation.layout.WindowInsets r29, @p4.m androidx.compose.ui.Modifier r30, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r31, @p4.m v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r32, long r33, long r35, float r37, @p4.m androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1203TopAppBarRx1qByU(v3.p, androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, v3.p, v3.q, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0079  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: TopAppBar-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1204TopAppBarafqeVBk(@p4.l androidx.compose.foundation.layout.WindowInsets r26, @p4.m androidx.compose.ui.Modifier r27, long r28, long r30, float r32, @p4.m androidx.compose.foundation.layout.PaddingValues r33, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, @p4.m androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1204TopAppBarafqeVBk(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x004c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: TopAppBar-xWeB9-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1205TopAppBarxWeB9s(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.m androidx.compose.ui.Modifier r29, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r30, @p4.m v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r31, long r32, long r34, float r36, @p4.m androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1205TopAppBarxWeB9s(v3.p, androidx.compose.ui.Modifier, v3.p, v3.q, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float calculateCutoutCircleYIntercept(float f5, float f6) {
        return -((float) Math.sqrt((f5 * f5) - (f6 * f6)));
    }

    @l
    public static final u0<Float, Float> calculateRoundedEdgeIntercept(float f5, float f6, float f7) {
        Float valueOf;
        Float valueOf2;
        u0 a5;
        Float valueOf3;
        Float valueOf4;
        float f8 = f6 * f6;
        float f9 = f7 * f7;
        float f10 = (f5 * f5) + f8;
        float f11 = f8 * f9 * (f10 - f9);
        float f12 = f5 * f9;
        double d5 = f11;
        float sqrt = (f12 - ((float) Math.sqrt(d5))) / f10;
        float sqrt2 = (f12 + ((float) Math.sqrt(d5))) / f10;
        float sqrt3 = (float) Math.sqrt(f9 - (sqrt * sqrt));
        float sqrt4 = (float) Math.sqrt(f9 - (sqrt2 * sqrt2));
        if (f6 > 0.0f) {
            if (sqrt3 > sqrt4) {
                valueOf3 = Float.valueOf(sqrt);
                valueOf4 = Float.valueOf(sqrt3);
            } else {
                valueOf3 = Float.valueOf(sqrt2);
                valueOf4 = Float.valueOf(sqrt4);
            }
            a5 = q1.a(valueOf3, valueOf4);
        } else {
            if (sqrt3 < sqrt4) {
                valueOf = Float.valueOf(sqrt);
                valueOf2 = Float.valueOf(sqrt3);
            } else {
                valueOf = Float.valueOf(sqrt2);
                valueOf2 = Float.valueOf(sqrt4);
            }
            a5 = q1.a(valueOf, valueOf2);
        }
        float floatValue = ((Number) a5.component1()).floatValue();
        float floatValue2 = ((Number) a5.component2()).floatValue();
        if (floatValue < f5) {
            floatValue2 = -floatValue2;
        }
        return q1.a(Float.valueOf(floatValue), Float.valueOf(floatValue2));
    }

    private static final float square(float f5) {
        return f5 * f5;
    }
}
