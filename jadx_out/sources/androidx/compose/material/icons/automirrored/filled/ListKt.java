package androidx.compose.material.icons.automirrored.filled;

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

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_list", "Landroidx/compose/ui/graphics/vector/ImageVector;", "List", "Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;", "getList", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 List.kt\nandroidx/compose/material/icons/automirrored/filled/ListKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n223#2:74\n216#2,3:75\n219#2,4:79\n233#2,18:83\n253#2:120\n174#3:78\n705#4,2:101\n717#4,2:103\n719#4,11:109\n72#5,4:105\n*S KotlinDebug\n*F\n+ 1 List.kt\nandroidx/compose/material/icons/automirrored/filled/ListKt\n*L\n29#1:74\n29#1:75,3\n29#1:79,4\n30#1:83,18\n30#1:120\n29#1:78\n30#1:101,2\n30#1:103,2\n30#1:109,11\n30#1:105,4\n*E\n"})
/* loaded from: classes.dex */
public final class ListKt {

    @m
    private static ImageVector _list;

    @l
    public static final ImageVector getList(@l Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _list;
        if (imageVector != null) {
            l0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.List", Dp.m6044constructorimpl(24.0f), Dp.m6044constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3760getBlack0d7_KjU(), null);
        int m4085getButtKaPHkGw = StrokeCap.Companion.m4085getButtKaPHkGw();
        int m4095getBevelLxFBmk8 = StrokeJoin.Companion.m4095getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineTo(3.0f, 11.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineTo(3.0f, 15.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(5.0f, 7.0f);
        pathBuilder.lineTo(3.0f, 7.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineTo(7.0f, 11.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineTo(7.0f, 15.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 7.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.lineTo(21.0f, 7.0f);
        pathBuilder.lineTo(7.0f, 7.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m4361addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m4085getButtKaPHkGw, m4095getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _list = build;
        l0.m(build);
        return build;
    }
}
