package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_shoppingCart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ShoppingCart", "Landroidx/compose/material/icons/Icons$TwoTone;", "getShoppingCart", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nShoppingCart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingCart.kt\nandroidx/compose/material/icons/twotone/ShoppingCartKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,80:1\n212#2,12:81\n233#2,18:94\n253#2:131\n233#2,18:132\n253#2:169\n174#3:93\n705#4,2:112\n717#4,2:114\n719#4,11:120\n705#4,2:150\n717#4,2:152\n719#4,11:158\n72#5,4:116\n72#5,4:154\n*S KotlinDebug\n*F\n+ 1 ShoppingCart.kt\nandroidx/compose/material/icons/twotone/ShoppingCartKt\n*L\n29#1:81,12\n30#1:94,18\n30#1:131\n37#1:132,18\n37#1:169\n29#1:93\n30#1:112,2\n30#1:114,2\n30#1:120,11\n37#1:150,2\n37#1:152,2\n37#1:158,11\n30#1:116,4\n37#1:154,4\n*E\n"})
/* loaded from: classes.dex */
public final class ShoppingCartKt {

    @m
    private static ImageVector _shoppingCart;

    @l
    public static final ImageVector getShoppingCart(@l Icons.TwoTone twoTone) {
        ImageVector imageVector = _shoppingCart;
        if (imageVector != null) {
            l0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ShoppingCart", Dp.m6044constructorimpl(24.0f), Dp.m6044constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m3760getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m4085getButtKaPHkGw = companion2.m4085getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m4095getBevelLxFBmk8 = companion3.m4095getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.55f, 11.0f);
        pathBuilder.lineToRelative(2.76f, -5.0f);
        pathBuilder.horizontalLineTo(6.16f);
        pathBuilder.lineToRelative(2.37f, 5.0f);
        pathBuilder.close();
        ImageVector.Builder.m4361addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m4085getButtKaPHkGw, m4095getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m3760getBlack0d7_KjU(), null);
        int m4085getButtKaPHkGw2 = companion2.m4085getButtKaPHkGw();
        int m4095getBevelLxFBmk82 = companion3.m4095getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.55f, 13.0f);
        pathBuilder2.curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
        pathBuilder2.lineToRelative(3.58f, -6.49f);
        pathBuilder2.curveToRelative(0.37f, -0.66f, -0.11f, -1.48f, -0.87f, -1.48f);
        pathBuilder2.lineTo(5.21f, 4.0f);
        pathBuilder2.lineToRelative(-0.94f, -2.0f);
        pathBuilder2.lineTo(1.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.lineToRelative(3.6f, 7.59f);
        pathBuilder2.lineToRelative(-1.35f, 2.44f);
        pathBuilder2.curveTo(4.52f, 15.37f, 5.48f, 17.0f, 7.0f, 17.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.lineTo(7.0f, 15.0f);
        pathBuilder2.lineToRelative(1.1f, -2.0f);
        pathBuilder2.horizontalLineToRelative(7.45f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.16f, 6.0f);
        pathBuilder2.horizontalLineToRelative(12.15f);
        pathBuilder2.lineToRelative(-2.76f, 5.0f);
        pathBuilder2.lineTo(8.53f, 11.0f);
        pathBuilder2.lineTo(6.16f, 6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.0f, 18.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder2.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 18.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m4361addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m4085getButtKaPHkGw2, m4095getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shoppingCart = build;
        l0.m(build);
        return build;
    }
}
