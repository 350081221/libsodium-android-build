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

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_edit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Edit", "Landroidx/compose/material/icons/Icons$TwoTone;", "getEdit", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nEdit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Edit.kt\nandroidx/compose/material/icons/twotone/EditKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n233#2,18:120\n253#2:157\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n705#4,2:138\n717#4,2:140\n719#4,11:146\n72#5,4:104\n72#5,4:142\n*S KotlinDebug\n*F\n+ 1 Edit.kt\nandroidx/compose/material/icons/twotone/EditKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n38#1:120,18\n38#1:157\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n38#1:138,2\n38#1:140,2\n38#1:146,11\n30#1:104,4\n38#1:142,4\n*E\n"})
/* loaded from: classes.dex */
public final class EditKt {

    @m
    private static ImageVector _edit;

    @l
    public static final ImageVector getEdit(@l Icons.TwoTone twoTone) {
        ImageVector imageVector = _edit;
        if (imageVector != null) {
            l0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Edit", Dp.m6044constructorimpl(24.0f), Dp.m6044constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m3760getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m4085getButtKaPHkGw = companion2.m4085getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m4095getBevelLxFBmk8 = companion3.m4095getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 18.08f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(0.92f);
        pathBuilder.lineToRelative(9.06f, -9.06f);
        pathBuilder.lineToRelative(-0.92f, -0.92f);
        pathBuilder.close();
        ImageVector.Builder.m4361addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m4085getButtKaPHkGw, m4095getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m3760getBlack0d7_KjU(), null);
        int m4085getButtKaPHkGw2 = companion2.m4085getButtKaPHkGw();
        int m4095getBevelLxFBmk82 = companion3.m4095getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.71f, 7.04f);
        pathBuilder2.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder2.lineToRelative(-2.34f, -2.34f);
        pathBuilder2.curveToRelative(-0.2f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f);
        pathBuilder2.reflectiveCurveToRelative(-0.51f, 0.1f, -0.7f, 0.29f);
        pathBuilder2.lineToRelative(-1.83f, 1.83f);
        pathBuilder2.lineToRelative(3.75f, 3.75f);
        pathBuilder2.lineToRelative(1.83f, -1.83f);
        pathBuilder2.close();
        pathBuilder2.moveTo(3.0f, 17.25f);
        pathBuilder2.verticalLineTo(21.0f);
        pathBuilder2.horizontalLineToRelative(3.75f);
        pathBuilder2.lineTo(17.81f, 9.94f);
        pathBuilder2.lineToRelative(-3.75f, -3.75f);
        pathBuilder2.lineTo(3.0f, 17.25f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.92f, 19.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.verticalLineToRelative(-0.92f);
        pathBuilder2.lineToRelative(9.06f, -9.06f);
        pathBuilder2.lineToRelative(0.92f, 0.92f);
        pathBuilder2.lineTo(5.92f, 19.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m4361addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m4085getButtKaPHkGw2, m4095getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _edit = build;
        l0.m(build);
        return build;
    }
}
