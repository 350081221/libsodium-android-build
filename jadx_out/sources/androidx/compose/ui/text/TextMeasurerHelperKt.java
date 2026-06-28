package androidx.compose.ui.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DefaultCacheSize", "", "rememberTextMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", "cacheSize", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextMeasurer;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextMeasurerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,55:1\n74#2:56\n74#2:57\n74#2:58\n83#3,3:59\n1116#4,6:62\n*S KotlinDebug\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n*L\n47#1:56\n48#1:57\n49#1:58\n51#1:59,3\n51#1:62,6\n*E\n"})
/* loaded from: classes.dex */
public final class TextMeasurerHelperKt {
    private static final int DefaultCacheSize = 8;

    @l
    @Composable
    public static final TextMeasurer rememberTextMeasurer(int i5, @m Composer composer, int i6, int i7) {
        composer.startReplaceableGroup(1538166871);
        if ((i7 & 1) != 0) {
            i5 = DefaultCacheSize;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1538166871, i6, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:45)");
        }
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        Object[] objArr = {resolver, density, layoutDirection, Integer.valueOf(i5)};
        composer.startReplaceableGroup(-568225417);
        boolean z4 = false;
        for (int i8 = 0; i8 < 4; i8++) {
            z4 |= composer.changed(objArr[i8]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextMeasurer(resolver, density, layoutDirection, i5);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextMeasurer textMeasurer = (TextMeasurer) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textMeasurer;
    }
}
