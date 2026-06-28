package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0088\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0088\u0001\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u001c\u0010\u0016\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001a\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0014\u0010\u001b\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0000\" \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0015\u0010#\u001a\u00020\u0000*\u00020\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "primaryVariant", "secondary", "secondaryVariant", ForeAndBackgroundEvent.BACKGROUND, "surface", d.U, "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "Landroidx/compose/material/Colors;", "lightColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "darkColors-2qZNXz8", "darkColors", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "other", "Lkotlin/r2;", "updateColorsFrom", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "primarySurface", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,337:1\n658#2:338\n646#2:339\n74#3:340\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n*L\n297#1:338\n297#1:339\n297#1:340\n*E\n"})
/* loaded from: classes.dex */
public final class ColorsKt {

    @l
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(ColorsKt$LocalColors$1.INSTANCE);

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m1292contentColorFor4WTKRHQ(@l Colors colors, long j5) {
        if (Color.m3735equalsimpl0(j5, colors.m1275getPrimary0d7_KjU())) {
            return colors.m1272getOnPrimary0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colors.m1276getPrimaryVariant0d7_KjU())) {
            return colors.m1272getOnPrimary0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colors.m1277getSecondary0d7_KjU())) {
            return colors.m1273getOnSecondary0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colors.m1278getSecondaryVariant0d7_KjU())) {
            return colors.m1273getOnSecondary0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colors.m1268getBackground0d7_KjU())) {
            return colors.m1270getOnBackground0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colors.m1279getSurface0d7_KjU())) {
            return colors.m1274getOnSurface0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colors.m1269getError0d7_KjU())) {
            return colors.m1271getOnError0d7_KjU();
        }
        return Color.Companion.m3770getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m1293contentColorForek8zF_U(long j5, @m Composer composer, int i5) {
        boolean z4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441849991, i5, -1, "androidx.compose.material.contentColorFor (Colors.kt:296)");
        }
        long m1292contentColorFor4WTKRHQ = m1292contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j5);
        if (m1292contentColorFor4WTKRHQ != Color.Companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            m1292contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1292contentColorFor4WTKRHQ;
    }

    @l
    /* renamed from: darkColors-2qZNXz8, reason: not valid java name */
    public static final Colors m1294darkColors2qZNXz8(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        return new Colors(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, false, null);
    }

    /* renamed from: darkColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m1295darkColors2qZNXz8$default(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i5, Object obj) {
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        if ((i5 & 1) != 0) {
            j17 = ColorKt.Color(4290479868L);
        } else {
            j17 = j5;
        }
        if ((i5 & 2) != 0) {
            j18 = ColorKt.Color(4281794739L);
        } else {
            j18 = j6;
        }
        if ((i5 & 4) != 0) {
            j19 = ColorKt.Color(4278442694L);
        } else {
            j19 = j7;
        }
        if ((i5 & 8) != 0) {
            j20 = j19;
        } else {
            j20 = j8;
        }
        if ((i5 & 16) != 0) {
            j21 = ColorKt.Color(4279374354L);
        } else {
            j21 = j9;
        }
        if ((i5 & 32) != 0) {
            j22 = ColorKt.Color(4279374354L);
        } else {
            j22 = j10;
        }
        if ((i5 & 64) != 0) {
            j23 = ColorKt.Color(4291782265L);
        } else {
            j23 = j11;
        }
        if ((i5 & 128) != 0) {
            j24 = Color.Companion.m3760getBlack0d7_KjU();
        } else {
            j24 = j12;
        }
        if ((i5 & 256) != 0) {
            j25 = Color.Companion.m3760getBlack0d7_KjU();
        } else {
            j25 = j13;
        }
        if ((i5 & 512) != 0) {
            j26 = Color.Companion.m3771getWhite0d7_KjU();
        } else {
            j26 = j14;
        }
        if ((i5 & 1024) != 0) {
            j27 = Color.Companion.m3771getWhite0d7_KjU();
        } else {
            j27 = j15;
        }
        if ((i5 & 2048) != 0) {
            j28 = Color.Companion.m3760getBlack0d7_KjU();
        } else {
            j28 = j16;
        }
        return m1294darkColors2qZNXz8(j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28);
    }

    @l
    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }

    public static final long getPrimarySurface(@l Colors colors) {
        return colors.isLight() ? colors.m1275getPrimary0d7_KjU() : colors.m1279getSurface0d7_KjU();
    }

    @l
    /* renamed from: lightColors-2qZNXz8, reason: not valid java name */
    public static final Colors m1296lightColors2qZNXz8(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        return new Colors(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, true, null);
    }

    /* renamed from: lightColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m1297lightColors2qZNXz8$default(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i5, Object obj) {
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        if ((i5 & 1) != 0) {
            j17 = ColorKt.Color(4284612846L);
        } else {
            j17 = j5;
        }
        if ((i5 & 2) != 0) {
            j18 = ColorKt.Color(4281794739L);
        } else {
            j18 = j6;
        }
        if ((i5 & 4) != 0) {
            j19 = ColorKt.Color(4278442694L);
        } else {
            j19 = j7;
        }
        if ((i5 & 8) != 0) {
            j20 = ColorKt.Color(4278290310L);
        } else {
            j20 = j8;
        }
        if ((i5 & 16) != 0) {
            j21 = Color.Companion.m3771getWhite0d7_KjU();
        } else {
            j21 = j9;
        }
        if ((i5 & 32) != 0) {
            j22 = Color.Companion.m3771getWhite0d7_KjU();
        } else {
            j22 = j10;
        }
        if ((i5 & 64) != 0) {
            j23 = ColorKt.Color(4289724448L);
        } else {
            j23 = j11;
        }
        if ((i5 & 128) != 0) {
            j24 = Color.Companion.m3771getWhite0d7_KjU();
        } else {
            j24 = j12;
        }
        long j29 = j24;
        if ((i5 & 256) != 0) {
            j25 = Color.Companion.m3760getBlack0d7_KjU();
        } else {
            j25 = j13;
        }
        long j30 = j25;
        if ((i5 & 512) != 0) {
            j26 = Color.Companion.m3760getBlack0d7_KjU();
        } else {
            j26 = j14;
        }
        long j31 = j26;
        if ((i5 & 1024) != 0) {
            j27 = Color.Companion.m3760getBlack0d7_KjU();
        } else {
            j27 = j15;
        }
        if ((i5 & 2048) != 0) {
            j28 = Color.Companion.m3771getWhite0d7_KjU();
        } else {
            j28 = j16;
        }
        return m1296lightColors2qZNXz8(j17, j18, j19, j20, j21, j22, j23, j29, j30, j31, j27, j28);
    }

    public static final void updateColorsFrom(@l Colors colors, @l Colors colors2) {
        colors.m1287setPrimary8_81llA$material_release(colors2.m1275getPrimary0d7_KjU());
        colors.m1288setPrimaryVariant8_81llA$material_release(colors2.m1276getPrimaryVariant0d7_KjU());
        colors.m1289setSecondary8_81llA$material_release(colors2.m1277getSecondary0d7_KjU());
        colors.m1290setSecondaryVariant8_81llA$material_release(colors2.m1278getSecondaryVariant0d7_KjU());
        colors.m1280setBackground8_81llA$material_release(colors2.m1268getBackground0d7_KjU());
        colors.m1291setSurface8_81llA$material_release(colors2.m1279getSurface0d7_KjU());
        colors.m1281setError8_81llA$material_release(colors2.m1269getError0d7_KjU());
        colors.m1284setOnPrimary8_81llA$material_release(colors2.m1272getOnPrimary0d7_KjU());
        colors.m1285setOnSecondary8_81llA$material_release(colors2.m1273getOnSecondary0d7_KjU());
        colors.m1282setOnBackground8_81llA$material_release(colors2.m1270getOnBackground0d7_KjU());
        colors.m1286setOnSurface8_81llA$material_release(colors2.m1274getOnSurface0d7_KjU());
        colors.m1283setOnError8_81llA$material_release(colors2.m1271getOnError0d7_KjU());
        colors.setLight$material_release(colors2.isLight());
    }
}
