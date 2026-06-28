package androidx.compose.material.icons.filled;

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

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_locationOn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocationOn", "Landroidx/compose/material/icons/Icons$Filled;", "getLocationOn", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLocationOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationOn.kt\nandroidx/compose/material/icons/filled/LocationOnKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,49:1\n212#2,12:50\n233#2,18:63\n253#2:100\n174#3:62\n705#4,2:81\n717#4,2:83\n719#4,11:89\n72#5,4:85\n*S KotlinDebug\n*F\n+ 1 LocationOn.kt\nandroidx/compose/material/icons/filled/LocationOnKt\n*L\n29#1:50,12\n30#1:63,18\n30#1:100\n29#1:62\n30#1:81,2\n30#1:83,2\n30#1:89,11\n30#1:85,4\n*E\n"})
/* loaded from: classes.dex */
public final class LocationOnKt {

    @m
    private static ImageVector _locationOn;

    @l
    public static final ImageVector getLocationOn(@l Icons.Filled filled) {
        ImageVector imageVector = _locationOn;
        if (imageVector != null) {
            l0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LocationOn", Dp.m6044constructorimpl(24.0f), Dp.m6044constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3760getBlack0d7_KjU(), null);
        int m4085getButtKaPHkGw = StrokeCap.Companion.m4085getButtKaPHkGw();
        int m4095getBevelLxFBmk8 = StrokeJoin.Companion.m4095getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(8.13f, 2.0f, 5.0f, 5.13f, 5.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        pathBuilder.reflectiveCurveToRelative(7.0f, -7.75f, 7.0f, -13.0f);
        pathBuilder.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 11.5f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m4361addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m4085getButtKaPHkGw, m4095getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _locationOn = build;
        l0.m(build);
        return build;
    }
}
