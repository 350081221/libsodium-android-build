package androidx.compose.material.icons;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a*\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0087\b\u001a4\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0086\b\u001aN\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0002¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0015\u001a\u00020\n8\u0000X\u0081T¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"", "name", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "Lkotlin/u;", "block", "Landroidx/compose/ui/graphics/vector/ImageVector;", "materialIcon", "", "autoMirror", "", "fillAlpha", "strokeAlpha", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "Lkotlin/r2;", "pathBuilder", "materialPath-YwgOQQI", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;FFILv3/l;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "materialPath", "MaterialIconDimension", "F", "getMaterialIconDimension$annotations", "()V", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nIcons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 4 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,258:1\n223#1:259\n216#1,3:260\n219#1,4:264\n174#2:263\n174#2:268\n174#2:269\n174#2:270\n174#2:271\n705#3,2:272\n717#3,2:274\n719#3,11:280\n717#3,13:291\n72#4,4:276\n*S KotlinDebug\n*F\n+ 1 Icons.kt\nandroidx/compose/material/icons/IconsKt\n*L\n201#1:259\n201#1:260,3\n201#1:264,4\n201#1:263\n218#1:268\n219#1:269\n218#1:270\n219#1:271\n242#1:272,2\n242#1:274,2\n242#1:280,11\n242#1:291,13\n242#1:276,4\n*E\n"})
/* loaded from: classes.dex */
public final class IconsKt {
    public static final float MaterialIconDimension = 24.0f;

    @a1
    public static /* synthetic */ void getMaterialIconDimension$annotations() {
    }

    @l
    public static final ImageVector materialIcon(@l String str, boolean z4, @l v3.l<? super ImageVector.Builder, ImageVector.Builder> lVar) {
        return lVar.invoke(new ImageVector.Builder(str, Dp.m6044constructorimpl(24.0f), Dp.m6044constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, z4, 96, null)).build();
    }

    public static /* synthetic */ ImageVector materialIcon$default(String str, boolean z4, v3.l lVar, int i5, Object obj) {
        boolean z5;
        if ((i5 & 2) != 0) {
            z5 = false;
        } else {
            z5 = z4;
        }
        return ((ImageVector.Builder) lVar.invoke(new ImageVector.Builder(str, Dp.m6044constructorimpl(24.0f), Dp.m6044constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, z5, 96, null))).build();
    }

    @l
    /* renamed from: materialPath-YwgOQQI, reason: not valid java name */
    public static final ImageVector.Builder m1518materialPathYwgOQQI(@l ImageVector.Builder builder, float f5, float f6, int i5, @l v3.l<? super PathBuilder, r2> lVar) {
        SolidColor solidColor = new SolidColor(Color.Companion.m3760getBlack0d7_KjU(), null);
        int m4085getButtKaPHkGw = StrokeCap.Companion.m4085getButtKaPHkGw();
        int m4095getBevelLxFBmk8 = StrokeJoin.Companion.m4095getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return ImageVector.Builder.m4361addPathoIyEayM$default(builder, pathBuilder.getNodes(), i5, "", solidColor, f5, null, f6, 1.0f, m4085getButtKaPHkGw, m4095getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* renamed from: materialPath-YwgOQQI$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m1519materialPathYwgOQQI$default(ImageVector.Builder builder, float f5, float f6, int i5, v3.l lVar, int i6, Object obj) {
        float f7;
        float f8;
        int i7;
        if ((i6 & 1) != 0) {
            f7 = 1.0f;
        } else {
            f7 = f5;
        }
        if ((i6 & 2) != 0) {
            f8 = 1.0f;
        } else {
            f8 = f6;
        }
        if ((i6 & 4) != 0) {
            i7 = VectorKt.getDefaultFillType();
        } else {
            i7 = i5;
        }
        SolidColor solidColor = new SolidColor(Color.Companion.m3760getBlack0d7_KjU(), null);
        int m4085getButtKaPHkGw = StrokeCap.Companion.m4085getButtKaPHkGw();
        int m4095getBevelLxFBmk8 = StrokeJoin.Companion.m4095getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return ImageVector.Builder.m4361addPathoIyEayM$default(builder, pathBuilder.getNodes(), i7, "", solidColor, f7, null, f8, 1.0f, m4085getButtKaPHkGw, m4095getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }
}
