package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a8\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a8\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000e\u001a8\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0011\u001a\u0014\u0010\u0012\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u0016\u0010\u0017\u001a\u00020\u0014*\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "imageVector", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "tint", "Lkotlin/r2;", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Icon", "Landroidx/compose/ui/graphics/ImageBitmap;", "bitmap", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "defaultSizeFor", "Landroidx/compose/ui/geometry/Size;", "", "isInfinite-uvyYCjk", "(J)Z", "isInfinite", "DefaultIconSizeModifier", "Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,171:1\n74#2:172\n74#2:173\n74#2:181\n36#3:174\n36#3:182\n1116#4,6:175\n1116#4,6:183\n1116#4,6:189\n154#5:195\n*S KotlinDebug\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n*L\n66#1:172\n100#1:173\n134#1:181\n102#1:174\n136#1:182\n102#1:175,6\n136#1:183,6\n140#1:189,6\n170#1:195\n*E\n"})
/* loaded from: classes.dex */
public final class IconKt {

    @l
    private static final Modifier DefaultIconSizeModifier = SizeKt.m602size3ABfNKs(Modifier.Companion, Dp.m6044constructorimpl(24));

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1365Iconww6aTOc(@l ImageVector imageVector, @m String str, @m Modifier modifier, long j5, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-800853103);
        Modifier modifier2 = (i6 & 4) != 0 ? Modifier.Companion : modifier;
        long m3733copywmQWz5c$default = (i6 & 8) != 0 ? Color.m3733copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-800853103, i5, -1, "androidx.compose.material.Icon (Icon.kt:66)");
        }
        m1364Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composer, i5 & 14), str, modifier2, m3733copywmQWz5c$default, composer, VectorPainter.$stable | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        Modifier modifier2;
        if (!Size.m3558equalsimpl0(painter.mo4347getIntrinsicSizeNHjbRc(), Size.Companion.m3570getUnspecifiedNHjbRc()) && !m1366isInfiniteuvyYCjk(painter.mo4347getIntrinsicSizeNHjbRc())) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = DefaultIconSizeModifier;
        }
        return modifier.then(modifier2);
    }

    /* renamed from: isInfinite-uvyYCjk, reason: not valid java name */
    private static final boolean m1366isInfiniteuvyYCjk(long j5) {
        return Float.isInfinite(Size.m3562getWidthimpl(j5)) && Float.isInfinite(Size.m3559getHeightimpl(j5));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1363Iconww6aTOc(@l ImageBitmap imageBitmap, @m String str, @m Modifier modifier, long j5, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-554892675);
        Modifier modifier2 = (i6 & 4) != 0 ? Modifier.Companion : modifier;
        long m3733copywmQWz5c$default = (i6 & 8) != 0 ? Color.m3733copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554892675, i5, -1, "androidx.compose.material.Icon (Icon.kt:100)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(imageBitmap);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new BitmapPainter(imageBitmap, 0L, 0L, 6, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        m1364Iconww6aTOc((BitmapPainter) rememberedValue, str, modifier2, m3733copywmQWz5c$default, composer, (i5 & 112) | 8 | (i5 & 896) | (i5 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1364Iconww6aTOc(@l Painter painter, @m String str, @m Modifier modifier, long j5, @m Composer composer, int i5, int i6) {
        long j6;
        int i7;
        Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(-1142959010);
        Modifier modifier3 = (i6 & 4) != 0 ? Modifier.Companion : modifier;
        if ((i6 & 8) != 0) {
            j6 = Color.m3733copywmQWz5c$default(((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl(), ((Number) startRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            i7 = i5 & (-7169);
        } else {
            j6 = j5;
            i7 = i5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1142959010, i7, -1, "androidx.compose.material.Icon (Icon.kt:134)");
        }
        Color m3724boximpl = Color.m3724boximpl(j6);
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(m3724boximpl);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = Color.m3735equalsimpl0(j6, Color.Companion.m3770getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m3775tintxETnrds$default(ColorFilter.Companion, j6, 0, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        ColorFilter colorFilter = (ColorFilter) rememberedValue;
        if (str != null) {
            Modifier.Companion companion = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(-1822880901);
            boolean changed2 = startRestartGroup.changed(str);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new IconKt$Icon$semantics$1$1(str);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            modifier2 = SemanticsModifierKt.semantics$default(companion, false, (v3.l) rememberedValue2, 1, null);
        } else {
            modifier2 = Modifier.Companion;
        }
        BoxKt.Box(PainterModifierKt.paint$default(defaultSizeFor(GraphicsLayerModifierKt.toolingGraphicsLayer(modifier3), painter), painter, false, null, ContentScale.Companion.getFit(), 0.0f, colorFilter, 22, null).then(modifier2), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new IconKt$Icon$1(painter, str, modifier3, j6, i5, i6));
        }
    }
}
