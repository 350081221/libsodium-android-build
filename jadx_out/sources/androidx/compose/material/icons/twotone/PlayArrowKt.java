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

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_playArrow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PlayArrow", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPlayArrow", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPlayArrow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayArrow.kt\nandroidx/compose/material/icons/twotone/PlayArrowKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,53:1\n212#2,12:54\n233#2,18:67\n253#2:104\n233#2,18:105\n253#2:142\n174#3:66\n705#4,2:85\n717#4,2:87\n719#4,11:93\n705#4,2:123\n717#4,2:125\n719#4,11:131\n72#5,4:89\n72#5,4:127\n*S KotlinDebug\n*F\n+ 1 PlayArrow.kt\nandroidx/compose/material/icons/twotone/PlayArrowKt\n*L\n29#1:54,12\n30#1:67,18\n30#1:104\n36#1:105,18\n36#1:142\n29#1:66\n30#1:85,2\n30#1:87,2\n30#1:93,11\n36#1:123,2\n36#1:125,2\n36#1:131,11\n30#1:89,4\n36#1:127,4\n*E\n"})
/* loaded from: classes.dex */
public final class PlayArrowKt {

    @m
    private static ImageVector _playArrow;

    @l
    public static final ImageVector getPlayArrow(@l Icons.TwoTone twoTone) {
        ImageVector imageVector = _playArrow;
        if (imageVector != null) {
            l0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PlayArrow", Dp.m6044constructorimpl(24.0f), Dp.m6044constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m3760getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m4085getButtKaPHkGw = companion2.m4085getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m4095getBevelLxFBmk8 = companion3.m4095getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 8.64f);
        pathBuilder.verticalLineToRelative(6.72f);
        pathBuilder.lineTo(15.27f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m4361addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m4085getButtKaPHkGw, m4095getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m3760getBlack0d7_KjU(), null);
        int m4085getButtKaPHkGw2 = companion2.m4085getButtKaPHkGw();
        int m4095getBevelLxFBmk82 = companion3.m4095getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.0f, 19.0f);
        pathBuilder2.lineToRelative(11.0f, -7.0f);
        pathBuilder2.lineTo(8.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.0f, 8.64f);
        pathBuilder2.lineTo(15.27f, 12.0f);
        pathBuilder2.lineTo(10.0f, 15.36f);
        pathBuilder2.lineTo(10.0f, 8.64f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m4361addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m4085getButtKaPHkGw2, m4095getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playArrow = build;
        l0.m(build);
        return build;
    }
}
