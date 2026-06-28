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

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_send", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Send", "Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;", "getSend", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/automirrored/filled/SendKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,44:1\n223#2:45\n216#2,3:46\n219#2,4:50\n233#2,18:54\n253#2:91\n174#3:49\n705#4,2:72\n717#4,2:74\n719#4,11:80\n72#5,4:76\n*S KotlinDebug\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/automirrored/filled/SendKt\n*L\n29#1:45\n29#1:46,3\n29#1:50,4\n30#1:54,18\n30#1:91\n29#1:49\n30#1:72,2\n30#1:74,2\n30#1:80,11\n30#1:76,4\n*E\n"})
/* loaded from: classes.dex */
public final class SendKt {

    @m
    private static ImageVector _send;

    @l
    public static final ImageVector getSend(@l Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _send;
        if (imageVector != null) {
            l0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.Send", Dp.m6044constructorimpl(24.0f), Dp.m6044constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3760getBlack0d7_KjU(), null);
        int m4085getButtKaPHkGw = StrokeCap.Companion.m4085getButtKaPHkGw();
        int m4095getBevelLxFBmk8 = StrokeJoin.Companion.m4095getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.01f, 21.0f);
        pathBuilder.lineTo(23.0f, 12.0f);
        pathBuilder.lineTo(2.01f, 3.0f);
        pathBuilder.lineTo(2.0f, 10.0f);
        pathBuilder.lineToRelative(15.0f, 2.0f);
        pathBuilder.lineToRelative(-15.0f, 2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m4361addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m4085getButtKaPHkGw, m4095getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _send = build;
        l0.m(build);
        return build;
    }
}
