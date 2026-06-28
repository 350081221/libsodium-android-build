package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;
import com.lody.virtual.server.pm.parser.PackageParserEx;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001a\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a´\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001aø\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a´\u0002\u0010<\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b=\u00102\u001aø\u0002\u0010<\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b>\u0010;\u001a&\u0010?\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020AH\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a\u001e\u0010\u000f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001a\u0019\u0010F\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\n\u001a\u00020\fH\u0001¢\u0006\u0002\u0010G\u001a\u001e\u0010H\u001a\u00020\u000b*\u00020\u00042\u0006\u0010@\u001a\u00020AH\u0007ø\u0001\u0000¢\u0006\u0004\bI\u0010J\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006K"}, d2 = {"DisabledAlpha", "", "LocalColorScheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/ColorScheme;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTonalElevationEnabled", "", "getLocalTonalElevationEnabled", t0.b.f22420d, "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getValue", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "contentColorFor", "backgroundColor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColorScheme", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", ForeAndBackgroundEvent.BACKGROUND, "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", com.umeng.analytics.pro.d.U, "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "darkColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "darkColorScheme-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "lightColorScheme", "lightColorScheme-G1PFc-w", "lightColorScheme-C-Xl9yA", "applyTonalElevation", "elevation", "Landroidx/compose/ui/unit/Dp;", "applyTonalElevation-RFCenO8", "(Landroidx/compose/material3/ColorScheme;JFLandroidx/compose/runtime/Composer;I)J", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "fromToken", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "surfaceColorAtElevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nColorScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,947:1\n658#2:948\n646#2:949\n74#3:950\n74#3:951\n154#4:952\n*S KotlinDebug\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n*L\n824#1:948\n824#1:949\n825#1:950\n843#1:951\n863#1:952\n*E\n"})
/* loaded from: classes.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;

    @p4.l
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(ColorSchemeKt$LocalColorScheme$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<Boolean> LocalTonalElevationEnabled = CompositionLocalKt.staticCompositionLocalOf(ColorSchemeKt$LocalTonalElevationEnabled$1.INSTANCE);

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: applyTonalElevation-RFCenO8 */
    public static final long m1718applyTonalElevationRFCenO8(@p4.l ColorScheme colorScheme, long j5, float f5, @p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610977682, i5, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:841)");
        }
        boolean booleanValue = ((Boolean) composer.consume(LocalTonalElevationEnabled)).booleanValue();
        if (Color.m3735equalsimpl0(j5, colorScheme.m1706getSurface0d7_KjU()) && booleanValue) {
            j5 = m1729surfaceColorAtElevation3ABfNKs(colorScheme, f5);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j5;
    }

    @Stable
    /* renamed from: contentColorFor-4WTKRHQ */
    public static final long m1719contentColorFor4WTKRHQ(@p4.l ColorScheme colorScheme, long j5) {
        if (Color.m3735equalsimpl0(j5, colorScheme.m1701getPrimary0d7_KjU())) {
            return colorScheme.m1691getOnPrimary0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1704getSecondary0d7_KjU())) {
            return colorScheme.m1693getOnSecondary0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1716getTertiary0d7_KjU())) {
            return colorScheme.m1697getOnTertiary0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1682getBackground0d7_KjU())) {
            return colorScheme.m1688getOnBackground0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1683getError0d7_KjU())) {
            return colorScheme.m1689getOnError0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1702getPrimaryContainer0d7_KjU())) {
            return colorScheme.m1692getOnPrimaryContainer0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1705getSecondaryContainer0d7_KjU())) {
            return colorScheme.m1694getOnSecondaryContainer0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1717getTertiaryContainer0d7_KjU())) {
            return colorScheme.m1698getOnTertiaryContainer0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1684getErrorContainer0d7_KjU())) {
            return colorScheme.m1690getOnErrorContainer0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1687getInverseSurface0d7_KjU())) {
            return colorScheme.m1685getInverseOnSurface0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1706getSurface0d7_KjU())) {
            return colorScheme.m1695getOnSurface0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1715getSurfaceVariant0d7_KjU())) {
            return colorScheme.m1696getOnSurfaceVariant0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1707getSurfaceBright0d7_KjU())) {
            return colorScheme.m1695getOnSurface0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1708getSurfaceContainer0d7_KjU())) {
            return colorScheme.m1695getOnSurface0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1709getSurfaceContainerHigh0d7_KjU())) {
            return colorScheme.m1695getOnSurface0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1710getSurfaceContainerHighest0d7_KjU())) {
            return colorScheme.m1695getOnSurface0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1711getSurfaceContainerLow0d7_KjU())) {
            return colorScheme.m1695getOnSurface0d7_KjU();
        }
        if (Color.m3735equalsimpl0(j5, colorScheme.m1712getSurfaceContainerLowest0d7_KjU())) {
            return colorScheme.m1695getOnSurface0d7_KjU();
        }
        return Color.Companion.m3770getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U */
    public static final long m1720contentColorForek8zF_U(long j5, @p4.m Composer composer, int i5) {
        boolean z4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i5, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:823)");
        }
        long m1719contentColorFor4WTKRHQ = m1719contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j5);
        if (m1719contentColorFor4WTKRHQ != Color.Companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            m1719contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1719contentColorFor4WTKRHQ;
    }

    @p4.l
    /* renamed from: darkColorScheme-C-Xl9yA */
    public static final ColorScheme m1721darkColorSchemeCXl9yA(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40) {
        return new ColorScheme(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j40, j35, j36, j37, j38, j39, null);
    }

    /* renamed from: darkColorScheme-C-Xl9yA$default */
    public static /* synthetic */ ColorScheme m1722darkColorSchemeCXl9yA$default(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, int i5, int i6, Object obj) {
        long m2689getPrimary0d7_KjU = (i5 & 1) != 0 ? ColorDarkTokens.INSTANCE.m2689getPrimary0d7_KjU() : j5;
        return m1721darkColorSchemeCXl9yA(m2689getPrimary0d7_KjU, (i5 & 2) != 0 ? ColorDarkTokens.INSTANCE.m2673getOnPrimary0d7_KjU() : j6, (i5 & 4) != 0 ? ColorDarkTokens.INSTANCE.m2690getPrimaryContainer0d7_KjU() : j7, (i5 & 8) != 0 ? ColorDarkTokens.INSTANCE.m2674getOnPrimaryContainer0d7_KjU() : j8, (i5 & 16) != 0 ? ColorDarkTokens.INSTANCE.m2668getInversePrimary0d7_KjU() : j9, (i5 & 32) != 0 ? ColorDarkTokens.INSTANCE.m2694getSecondary0d7_KjU() : j10, (i5 & 64) != 0 ? ColorDarkTokens.INSTANCE.m2677getOnSecondary0d7_KjU() : j11, (i5 & 128) != 0 ? ColorDarkTokens.INSTANCE.m2695getSecondaryContainer0d7_KjU() : j12, (i5 & 256) != 0 ? ColorDarkTokens.INSTANCE.m2678getOnSecondaryContainer0d7_KjU() : j13, (i5 & 512) != 0 ? ColorDarkTokens.INSTANCE.m2708getTertiary0d7_KjU() : j14, (i5 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m2683getOnTertiary0d7_KjU() : j15, (i5 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m2709getTertiaryContainer0d7_KjU() : j16, (i5 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m2684getOnTertiaryContainer0d7_KjU() : j17, (i5 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m2664getBackground0d7_KjU() : j18, (i5 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m2670getOnBackground0d7_KjU() : j19, (i5 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m2698getSurface0d7_KjU() : j20, (i5 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m2681getOnSurface0d7_KjU() : j21, (i5 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m2707getSurfaceVariant0d7_KjU() : j22, (i5 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m2682getOnSurfaceVariant0d7_KjU() : j23, (i5 & 524288) != 0 ? m2689getPrimary0d7_KjU : j24, (i5 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m2669getInverseSurface0d7_KjU() : j25, (i5 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m2667getInverseOnSurface0d7_KjU() : j26, (i5 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m2665getError0d7_KjU() : j27, (i5 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m2671getOnError0d7_KjU() : j28, (i5 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m2666getErrorContainer0d7_KjU() : j29, (i5 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m2672getOnErrorContainer0d7_KjU() : j30, (i5 & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m2687getOutline0d7_KjU() : j31, (i5 & PackageParserEx.GET_SIGNING_CERTIFICATES) != 0 ? ColorDarkTokens.INSTANCE.m2688getOutlineVariant0d7_KjU() : j32, (i5 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m2693getScrim0d7_KjU() : j33, (i5 & 536870912) != 0 ? ColorDarkTokens.INSTANCE.m2699getSurfaceBright0d7_KjU() : j34, (i5 & 1073741824) != 0 ? ColorDarkTokens.INSTANCE.m2700getSurfaceContainer0d7_KjU() : j35, (i5 & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m2701getSurfaceContainerHigh0d7_KjU() : j36, (i6 & 1) != 0 ? ColorDarkTokens.INSTANCE.m2702getSurfaceContainerHighest0d7_KjU() : j37, (i6 & 2) != 0 ? ColorDarkTokens.INSTANCE.m2703getSurfaceContainerLow0d7_KjU() : j38, (i6 & 4) != 0 ? ColorDarkTokens.INSTANCE.m2704getSurfaceContainerLowest0d7_KjU() : j39, (i6 & 8) != 0 ? ColorDarkTokens.INSTANCE.m2705getSurfaceDim0d7_KjU() : j40);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default */
    public static /* synthetic */ ColorScheme m1724darkColorSchemeG1PFcw$default(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, int i5, Object obj) {
        long m2689getPrimary0d7_KjU = (i5 & 1) != 0 ? ColorDarkTokens.INSTANCE.m2689getPrimary0d7_KjU() : j5;
        return m1722darkColorSchemeCXl9yA$default(m2689getPrimary0d7_KjU, (i5 & 2) != 0 ? ColorDarkTokens.INSTANCE.m2673getOnPrimary0d7_KjU() : j6, (i5 & 4) != 0 ? ColorDarkTokens.INSTANCE.m2690getPrimaryContainer0d7_KjU() : j7, (i5 & 8) != 0 ? ColorDarkTokens.INSTANCE.m2674getOnPrimaryContainer0d7_KjU() : j8, (i5 & 16) != 0 ? ColorDarkTokens.INSTANCE.m2668getInversePrimary0d7_KjU() : j9, (i5 & 32) != 0 ? ColorDarkTokens.INSTANCE.m2694getSecondary0d7_KjU() : j10, (i5 & 64) != 0 ? ColorDarkTokens.INSTANCE.m2677getOnSecondary0d7_KjU() : j11, (i5 & 128) != 0 ? ColorDarkTokens.INSTANCE.m2695getSecondaryContainer0d7_KjU() : j12, (i5 & 256) != 0 ? ColorDarkTokens.INSTANCE.m2678getOnSecondaryContainer0d7_KjU() : j13, (i5 & 512) != 0 ? ColorDarkTokens.INSTANCE.m2708getTertiary0d7_KjU() : j14, (i5 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m2683getOnTertiary0d7_KjU() : j15, (i5 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m2709getTertiaryContainer0d7_KjU() : j16, (i5 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m2684getOnTertiaryContainer0d7_KjU() : j17, (i5 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m2664getBackground0d7_KjU() : j18, (i5 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m2670getOnBackground0d7_KjU() : j19, (i5 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m2698getSurface0d7_KjU() : j20, (i5 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m2681getOnSurface0d7_KjU() : j21, (i5 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m2707getSurfaceVariant0d7_KjU() : j22, (i5 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m2682getOnSurfaceVariant0d7_KjU() : j23, (i5 & 524288) != 0 ? m2689getPrimary0d7_KjU : j24, (i5 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m2669getInverseSurface0d7_KjU() : j25, (i5 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m2667getInverseOnSurface0d7_KjU() : j26, (i5 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m2665getError0d7_KjU() : j27, (i5 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m2671getOnError0d7_KjU() : j28, (i5 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m2666getErrorContainer0d7_KjU() : j29, (i5 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m2672getOnErrorContainer0d7_KjU() : j30, (i5 & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m2687getOutline0d7_KjU() : j31, (i5 & PackageParserEx.GET_SIGNING_CERTIFICATES) != 0 ? ColorDarkTokens.INSTANCE.m2688getOutlineVariant0d7_KjU() : j32, (i5 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m2693getScrim0d7_KjU() : j33, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    @Stable
    public static final long fromToken(@p4.l ColorScheme colorScheme, @p4.l ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.m1682getBackground0d7_KjU();
            case 2:
                return colorScheme.m1683getError0d7_KjU();
            case 3:
                return colorScheme.m1684getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m1685getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m1686getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m1687getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m1688getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m1689getOnError0d7_KjU();
            case 9:
                return colorScheme.m1690getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m1691getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m1692getOnPrimaryContainer0d7_KjU();
            case 12:
                return colorScheme.m1693getOnSecondary0d7_KjU();
            case 13:
                return colorScheme.m1694getOnSecondaryContainer0d7_KjU();
            case 14:
                return colorScheme.m1695getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m1696getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m1714getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m1697getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m1698getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m1699getOutline0d7_KjU();
            case 20:
                return colorScheme.m1700getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m1701getPrimary0d7_KjU();
            case 22:
                return colorScheme.m1702getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m1703getScrim0d7_KjU();
            case 24:
                return colorScheme.m1704getSecondary0d7_KjU();
            case 25:
                return colorScheme.m1705getSecondaryContainer0d7_KjU();
            case 26:
                return colorScheme.m1706getSurface0d7_KjU();
            case 27:
                return colorScheme.m1715getSurfaceVariant0d7_KjU();
            case 28:
                return colorScheme.m1707getSurfaceBright0d7_KjU();
            case 29:
                return colorScheme.m1708getSurfaceContainer0d7_KjU();
            case 30:
                return colorScheme.m1709getSurfaceContainerHigh0d7_KjU();
            case 31:
                return colorScheme.m1710getSurfaceContainerHighest0d7_KjU();
            case 32:
                return colorScheme.m1711getSurfaceContainerLow0d7_KjU();
            case 33:
                return colorScheme.m1712getSurfaceContainerLowest0d7_KjU();
            case 34:
                return colorScheme.m1713getSurfaceDim0d7_KjU();
            case 35:
                return colorScheme.m1716getTertiary0d7_KjU();
            case 36:
                return colorScheme.m1717getTertiaryContainer0d7_KjU();
            default:
                return Color.Companion.m3770getUnspecified0d7_KjU();
        }
    }

    @p4.l
    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    @p4.l
    public static final ProvidableCompositionLocal<Boolean> getLocalTonalElevationEnabled() {
        return LocalTonalElevationEnabled;
    }

    @u3.h(name = "getValue")
    @Composable
    @ReadOnlyComposable
    public static final long getValue(@p4.l ColorSchemeKeyTokens colorSchemeKeyTokens, @p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810780884, i5, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:945)");
        }
        long fromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fromToken;
    }

    @p4.l
    /* renamed from: lightColorScheme-C-Xl9yA */
    public static final ColorScheme m1725lightColorSchemeCXl9yA(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40) {
        return new ColorScheme(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j40, j35, j36, j37, j38, j39, null);
    }

    /* renamed from: lightColorScheme-C-Xl9yA$default */
    public static /* synthetic */ ColorScheme m1726lightColorSchemeCXl9yA$default(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, int i5, int i6, Object obj) {
        long m2737getPrimary0d7_KjU = (i5 & 1) != 0 ? ColorLightTokens.INSTANCE.m2737getPrimary0d7_KjU() : j5;
        return m1725lightColorSchemeCXl9yA(m2737getPrimary0d7_KjU, (i5 & 2) != 0 ? ColorLightTokens.INSTANCE.m2721getOnPrimary0d7_KjU() : j6, (i5 & 4) != 0 ? ColorLightTokens.INSTANCE.m2738getPrimaryContainer0d7_KjU() : j7, (i5 & 8) != 0 ? ColorLightTokens.INSTANCE.m2722getOnPrimaryContainer0d7_KjU() : j8, (i5 & 16) != 0 ? ColorLightTokens.INSTANCE.m2716getInversePrimary0d7_KjU() : j9, (i5 & 32) != 0 ? ColorLightTokens.INSTANCE.m2742getSecondary0d7_KjU() : j10, (i5 & 64) != 0 ? ColorLightTokens.INSTANCE.m2725getOnSecondary0d7_KjU() : j11, (i5 & 128) != 0 ? ColorLightTokens.INSTANCE.m2743getSecondaryContainer0d7_KjU() : j12, (i5 & 256) != 0 ? ColorLightTokens.INSTANCE.m2726getOnSecondaryContainer0d7_KjU() : j13, (i5 & 512) != 0 ? ColorLightTokens.INSTANCE.m2756getTertiary0d7_KjU() : j14, (i5 & 1024) != 0 ? ColorLightTokens.INSTANCE.m2731getOnTertiary0d7_KjU() : j15, (i5 & 2048) != 0 ? ColorLightTokens.INSTANCE.m2757getTertiaryContainer0d7_KjU() : j16, (i5 & 4096) != 0 ? ColorLightTokens.INSTANCE.m2732getOnTertiaryContainer0d7_KjU() : j17, (i5 & 8192) != 0 ? ColorLightTokens.INSTANCE.m2712getBackground0d7_KjU() : j18, (i5 & 16384) != 0 ? ColorLightTokens.INSTANCE.m2718getOnBackground0d7_KjU() : j19, (i5 & 32768) != 0 ? ColorLightTokens.INSTANCE.m2746getSurface0d7_KjU() : j20, (i5 & 65536) != 0 ? ColorLightTokens.INSTANCE.m2729getOnSurface0d7_KjU() : j21, (i5 & 131072) != 0 ? ColorLightTokens.INSTANCE.m2755getSurfaceVariant0d7_KjU() : j22, (i5 & 262144) != 0 ? ColorLightTokens.INSTANCE.m2730getOnSurfaceVariant0d7_KjU() : j23, (i5 & 524288) != 0 ? m2737getPrimary0d7_KjU : j24, (i5 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m2717getInverseSurface0d7_KjU() : j25, (i5 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m2715getInverseOnSurface0d7_KjU() : j26, (i5 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m2713getError0d7_KjU() : j27, (i5 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m2719getOnError0d7_KjU() : j28, (i5 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m2714getErrorContainer0d7_KjU() : j29, (i5 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m2720getOnErrorContainer0d7_KjU() : j30, (i5 & 67108864) != 0 ? ColorLightTokens.INSTANCE.m2735getOutline0d7_KjU() : j31, (i5 & PackageParserEx.GET_SIGNING_CERTIFICATES) != 0 ? ColorLightTokens.INSTANCE.m2736getOutlineVariant0d7_KjU() : j32, (i5 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m2741getScrim0d7_KjU() : j33, (i5 & 536870912) != 0 ? ColorLightTokens.INSTANCE.m2747getSurfaceBright0d7_KjU() : j34, (i5 & 1073741824) != 0 ? ColorLightTokens.INSTANCE.m2748getSurfaceContainer0d7_KjU() : j35, (i5 & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m2749getSurfaceContainerHigh0d7_KjU() : j36, (i6 & 1) != 0 ? ColorLightTokens.INSTANCE.m2750getSurfaceContainerHighest0d7_KjU() : j37, (i6 & 2) != 0 ? ColorLightTokens.INSTANCE.m2751getSurfaceContainerLow0d7_KjU() : j38, (i6 & 4) != 0 ? ColorLightTokens.INSTANCE.m2752getSurfaceContainerLowest0d7_KjU() : j39, (i6 & 8) != 0 ? ColorLightTokens.INSTANCE.m2753getSurfaceDim0d7_KjU() : j40);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default */
    public static /* synthetic */ ColorScheme m1728lightColorSchemeG1PFcw$default(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, int i5, Object obj) {
        long m2737getPrimary0d7_KjU = (i5 & 1) != 0 ? ColorLightTokens.INSTANCE.m2737getPrimary0d7_KjU() : j5;
        return m1726lightColorSchemeCXl9yA$default(m2737getPrimary0d7_KjU, (i5 & 2) != 0 ? ColorLightTokens.INSTANCE.m2721getOnPrimary0d7_KjU() : j6, (i5 & 4) != 0 ? ColorLightTokens.INSTANCE.m2738getPrimaryContainer0d7_KjU() : j7, (i5 & 8) != 0 ? ColorLightTokens.INSTANCE.m2722getOnPrimaryContainer0d7_KjU() : j8, (i5 & 16) != 0 ? ColorLightTokens.INSTANCE.m2716getInversePrimary0d7_KjU() : j9, (i5 & 32) != 0 ? ColorLightTokens.INSTANCE.m2742getSecondary0d7_KjU() : j10, (i5 & 64) != 0 ? ColorLightTokens.INSTANCE.m2725getOnSecondary0d7_KjU() : j11, (i5 & 128) != 0 ? ColorLightTokens.INSTANCE.m2743getSecondaryContainer0d7_KjU() : j12, (i5 & 256) != 0 ? ColorLightTokens.INSTANCE.m2726getOnSecondaryContainer0d7_KjU() : j13, (i5 & 512) != 0 ? ColorLightTokens.INSTANCE.m2756getTertiary0d7_KjU() : j14, (i5 & 1024) != 0 ? ColorLightTokens.INSTANCE.m2731getOnTertiary0d7_KjU() : j15, (i5 & 2048) != 0 ? ColorLightTokens.INSTANCE.m2757getTertiaryContainer0d7_KjU() : j16, (i5 & 4096) != 0 ? ColorLightTokens.INSTANCE.m2732getOnTertiaryContainer0d7_KjU() : j17, (i5 & 8192) != 0 ? ColorLightTokens.INSTANCE.m2712getBackground0d7_KjU() : j18, (i5 & 16384) != 0 ? ColorLightTokens.INSTANCE.m2718getOnBackground0d7_KjU() : j19, (i5 & 32768) != 0 ? ColorLightTokens.INSTANCE.m2746getSurface0d7_KjU() : j20, (i5 & 65536) != 0 ? ColorLightTokens.INSTANCE.m2729getOnSurface0d7_KjU() : j21, (i5 & 131072) != 0 ? ColorLightTokens.INSTANCE.m2755getSurfaceVariant0d7_KjU() : j22, (i5 & 262144) != 0 ? ColorLightTokens.INSTANCE.m2730getOnSurfaceVariant0d7_KjU() : j23, (i5 & 524288) != 0 ? m2737getPrimary0d7_KjU : j24, (i5 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m2717getInverseSurface0d7_KjU() : j25, (i5 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m2715getInverseOnSurface0d7_KjU() : j26, (i5 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m2713getError0d7_KjU() : j27, (i5 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m2719getOnError0d7_KjU() : j28, (i5 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m2714getErrorContainer0d7_KjU() : j29, (i5 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m2720getOnErrorContainer0d7_KjU() : j30, (i5 & 67108864) != 0 ? ColorLightTokens.INSTANCE.m2735getOutline0d7_KjU() : j31, (i5 & PackageParserEx.GET_SIGNING_CERTIFICATES) != 0 ? ColorLightTokens.INSTANCE.m2736getOutlineVariant0d7_KjU() : j32, (i5 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m2741getScrim0d7_KjU() : j33, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    @Stable
    /* renamed from: surfaceColorAtElevation-3ABfNKs */
    public static final long m1729surfaceColorAtElevation3ABfNKs(@p4.l ColorScheme colorScheme, float f5) {
        if (Dp.m6049equalsimpl0(f5, Dp.m6044constructorimpl(0))) {
            return colorScheme.m1706getSurface0d7_KjU();
        }
        return ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(colorScheme.m1714getSurfaceTint0d7_KjU(), ((((float) Math.log(f5 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1706getSurface0d7_KjU());
    }
}
