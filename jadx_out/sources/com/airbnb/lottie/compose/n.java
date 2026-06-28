package com.airbnb.lottie.compose;

import android.graphics.Typeface;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.unit.IntSizeKt;
import com.airbnb.lottie.j1;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0097\u0001\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\"\u0010\u0018\u001a\u00020\u0019*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"rememberLottiePainter", "Lcom/airbnb/lottie/compose/LottiePainter;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", "", "outlineMasksAndMattes", "", "applyOpacityToLayers", "enableMergePaths", "renderMode", "Lcom/airbnb/lottie/RenderMode;", "maintainOriginalImageBounds", "dynamicProperties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "clipToCompositionBounds", "clipTextToBoundingBox", "fontMap", "", "", "Landroid/graphics/Typeface;", "asyncUpdates", "Lcom/airbnb/lottie/AsyncUpdates;", "(Lcom/airbnb/lottie/LottieComposition;FZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;III)Lcom/airbnb/lottie/compose/LottiePainter;", "times", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/geometry/Size;", "scale", "Landroidx/compose/ui/layout/ScaleFactor;", "times-UQTWf7w", "(JJ)J", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nLottiePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottiePainter.kt\ncom/airbnb/lottie/compose/LottiePainterKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,133:1\n25#2:134\n1097#3,6:135\n*S KotlinDebug\n*F\n+ 1 LottiePainter.kt\ncom/airbnb/lottie/compose/LottiePainterKt\n*L\n42#1:134\n42#1:135,6\n*E\n"})
/* loaded from: classes2.dex */
public final class n {
    @p4.l
    @Composable
    public static final LottiePainter a(@p4.m com.airbnb.lottie.k kVar, float f5, boolean z4, boolean z5, boolean z6, @p4.m j1 j1Var, boolean z7, @p4.m k kVar2, boolean z8, boolean z9, @p4.m Map<String, ? extends Typeface> map, @p4.m com.airbnb.lottie.a aVar, @p4.m Composer composer, int i5, int i6, int i7) {
        com.airbnb.lottie.a aVar2;
        composer.startReplaceableGroup(-1760390310);
        com.airbnb.lottie.k kVar3 = (i7 & 1) != 0 ? null : kVar;
        float f6 = (i7 & 2) != 0 ? 0.0f : f5;
        boolean z10 = (i7 & 4) != 0 ? false : z4;
        boolean z11 = (i7 & 8) != 0 ? false : z5;
        boolean z12 = (i7 & 16) != 0 ? false : z6;
        j1 j1Var2 = (i7 & 32) != 0 ? j1.AUTOMATIC : j1Var;
        boolean z13 = (i7 & 64) != 0 ? false : z7;
        k kVar4 = (i7 & 128) != 0 ? null : kVar2;
        boolean z14 = (i7 & 256) != 0 ? true : z8;
        boolean z15 = (i7 & 512) == 0 ? z9 : false;
        Map<String, ? extends Typeface> map2 = (i7 & 1024) == 0 ? map : null;
        com.airbnb.lottie.a aVar3 = (i7 & 2048) != 0 ? com.airbnb.lottie.a.AUTOMATIC : aVar;
        if (ComposerKt.isTraceInProgress()) {
            aVar2 = aVar3;
            ComposerKt.traceEventStart(-1760390310, i5, i6, "com.airbnb.lottie.compose.rememberLottiePainter (LottiePainter.kt:40)");
        } else {
            aVar2 = aVar3;
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LottiePainter(null, 0.0f, false, false, false, null, false, null, false, false, null, null, 4095, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LottiePainter lottiePainter = (LottiePainter) rememberedValue;
        lottiePainter.q(kVar3);
        lottiePainter.w(f6);
        lottiePainter.v(z10);
        lottiePainter.m(z11);
        lottiePainter.s(z12);
        lottiePainter.x(j1Var2);
        lottiePainter.u(z13);
        lottiePainter.r(kVar4);
        lottiePainter.p(z14);
        lottiePainter.o(z15);
        lottiePainter.t(map2);
        lottiePainter.n(aVar2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottiePainter;
    }

    private static final long b(long j5, long j6) {
        return IntSizeKt.IntSize((int) (Size.m3562getWidthimpl(j5) * ScaleFactor.m5068getScaleXimpl(j6)), (int) (Size.m3559getHeightimpl(j5) * ScaleFactor.m5069getScaleYimpl(j6)));
    }
}
