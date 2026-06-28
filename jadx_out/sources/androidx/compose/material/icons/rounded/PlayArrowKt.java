package androidx.compose.material.icons.rounded;

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

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_playArrow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PlayArrow", "Landroidx/compose/material/icons/Icons$Rounded;", "getPlayArrow", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPlayArrow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayArrow.kt\nandroidx/compose/material/icons/rounded/PlayArrowKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,45:1\n212#2,12:46\n233#2,18:59\n253#2:96\n174#3:58\n705#4,2:77\n717#4,2:79\n719#4,11:85\n72#5,4:81\n*S KotlinDebug\n*F\n+ 1 PlayArrow.kt\nandroidx/compose/material/icons/rounded/PlayArrowKt\n*L\n29#1:46,12\n30#1:59,18\n30#1:96\n29#1:58\n30#1:77,2\n30#1:79,2\n30#1:85,11\n30#1:81,4\n*E\n"})
/* loaded from: classes.dex */
public final class PlayArrowKt {

    @m
    private static ImageVector _playArrow;

    @l
    public static final ImageVector getPlayArrow(@l Icons.Rounded rounded) {
        ImageVector imageVector = _playArrow;
        if (imageVector != null) {
            l0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PlayArrow", Dp.m6044constructorimpl(24.0f), Dp.m6044constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3760getBlack0d7_KjU(), null);
        int m4085getButtKaPHkGw = StrokeCap.Companion.m4085getButtKaPHkGw();
        int m4095getBevelLxFBmk8 = StrokeJoin.Companion.m4095getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.0f, 6.82f);
        pathBuilder.verticalLineToRelative(10.36f);
        pathBuilder.curveToRelative(0.0f, 0.79f, 0.87f, 1.27f, 1.54f, 0.84f);
        pathBuilder.lineToRelative(8.14f, -5.18f);
        pathBuilder.curveToRelative(0.62f, -0.39f, 0.62f, -1.29f, 0.0f, -1.69f);
        pathBuilder.lineTo(9.54f, 5.98f);
        pathBuilder.curveTo(8.87f, 5.55f, 8.0f, 6.03f, 8.0f, 6.82f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m4361addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m4085getButtKaPHkGw, m4095getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playArrow = build;
        l0.m(build);
        return build;
    }
}
