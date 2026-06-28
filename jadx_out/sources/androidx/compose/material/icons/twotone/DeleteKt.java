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

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_delete", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Delete", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDelete", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDelete.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delete.kt\nandroidx/compose/material/icons/twotone/DeleteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,67:1\n212#2,12:68\n233#2,18:81\n253#2:118\n233#2,18:119\n253#2:156\n174#3:80\n705#4,2:99\n717#4,2:101\n719#4,11:107\n705#4,2:137\n717#4,2:139\n719#4,11:145\n72#5,4:103\n72#5,4:141\n*S KotlinDebug\n*F\n+ 1 Delete.kt\nandroidx/compose/material/icons/twotone/DeleteKt\n*L\n29#1:68,12\n30#1:81,18\n30#1:118\n37#1:119,18\n37#1:156\n29#1:80\n30#1:99,2\n30#1:101,2\n30#1:107,11\n37#1:137,2\n37#1:139,2\n37#1:145,11\n30#1:103,4\n37#1:141,4\n*E\n"})
/* loaded from: classes.dex */
public final class DeleteKt {

    @m
    private static ImageVector _delete;

    @l
    public static final ImageVector getDelete(@l Icons.TwoTone twoTone) {
        ImageVector imageVector = _delete;
        if (imageVector != null) {
            l0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Delete", Dp.m6044constructorimpl(24.0f), Dp.m6044constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m3760getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m4085getButtKaPHkGw = companion2.m4085getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m4095getBevelLxFBmk8 = companion3.m4095getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.close();
        ImageVector.Builder.m4361addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m4085getButtKaPHkGw, m4095getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m3760getBlack0d7_KjU(), null);
        int m4085getButtKaPHkGw2 = companion2.m4085getButtKaPHkGw();
        int m4095getBevelLxFBmk82 = companion3.m4095getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.5f, 4.0f);
        pathBuilder2.lineToRelative(-1.0f, -1.0f);
        pathBuilder2.horizontalLineToRelative(-5.0f);
        pathBuilder2.lineToRelative(-1.0f, 1.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.verticalLineTo(4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.0f, 19.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.0f, 9.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineToRelative(10.0f);
        pathBuilder2.horizontalLineTo(8.0f);
        pathBuilder2.verticalLineTo(9.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m4361addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m4085getButtKaPHkGw2, m4095getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _delete = build;
        l0.m(build);
        return build;
    }
}
