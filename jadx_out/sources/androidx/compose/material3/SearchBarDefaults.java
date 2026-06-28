package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.b1;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@kotlin.i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020!H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u008a\u0001\u0010 \u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020\u001e2\b\b\u0002\u0010%\u001a\u00020\u001e2\b\b\u0002\u0010&\u001a\u00020\u001e2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u001e2\b\b\u0002\u0010*\u001a\u00020\u001e2\b\b\u0002\u0010+\u001a\u00020\u001e2\b\b\u0002\u0010,\u001a\u00020\u001e2\b\b\u0002\u0010-\u001a\u00020\u001e2\b\b\u0002\u0010.\u001a\u00020\u001e2\b\b\u0002\u0010/\u001a\u00020\u001e2\b\b\u0002\u00100\u001a\u00020\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u009e\u0001\u0010 \u001a\u00020!2\b\b\u0002\u00103\u001a\u00020\u001e2\b\b\u0002\u00104\u001a\u00020\u001e2\b\b\u0002\u0010%\u001a\u00020\u001e2\b\b\u0002\u0010&\u001a\u00020\u001e2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u001e2\b\b\u0002\u0010*\u001a\u00020\u001e2\b\b\u0002\u0010+\u001a\u00020\u001e2\b\b\u0002\u0010,\u001a\u00020\u001e2\b\b\u0002\u0010-\u001a\u00020\u001e2\b\b\u0002\u0010.\u001a\u00020\u001e2\b\b\u0002\u00105\u001a\u00020\u001e2\b\b\u0002\u00106\u001a\u00020\u001e2\b\b\u0002\u00100\u001a\u00020\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00108R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0019\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/material3/SearchBarDefaults;", "", "()V", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM$annotations", "getElevation-D9Ej5fM", "()F", "F", "InputFieldHeight", "getInputFieldHeight-D9Ej5fM", "ShadowElevation", "getShadowElevation-D9Ej5fM", "TonalElevation", "getTonalElevation-D9Ej5fM", "dockedShape", "Landroidx/compose/ui/graphics/Shape;", "getDockedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "fullScreenShape", "getFullScreenShape", "inputFieldShape", "getInputFieldShape", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "colors", "Landroidx/compose/material3/SearchBarColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "dividerColor", "inputFieldColors", "Landroidx/compose/material3/TextFieldColors;", "colors-Klgx-Pg", "(JJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "textColor", "disabledTextColor", "cursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "placeholderColor", "disabledPlaceholderColor", "inputFieldColors--u-KgnY", "(JJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "unfocusedTextColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "inputFieldColors-ITpI4ow", "(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBarDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,741:1\n74#2:742\n74#2:743\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBarDefaults\n*L\n586#1:742\n624#1:743\n*E\n"})
/* loaded from: classes.dex */
public final class SearchBarDefaults {
    public static final int $stable = 0;
    private static final float Elevation;

    @p4.l
    public static final SearchBarDefaults INSTANCE = new SearchBarDefaults();
    private static final float InputFieldHeight;
    private static final float ShadowElevation;
    private static final float TonalElevation;

    static {
        SearchBarTokens searchBarTokens = SearchBarTokens.INSTANCE;
        float m3099getContainerElevationD9Ej5fM = searchBarTokens.m3099getContainerElevationD9Ej5fM();
        TonalElevation = m3099getContainerElevationD9Ej5fM;
        ShadowElevation = ElevationTokens.INSTANCE.m2799getLevel0D9Ej5fM();
        Elevation = m3099getContainerElevationD9Ej5fM;
        InputFieldHeight = searchBarTokens.m3100getContainerHeightD9Ej5fM();
    }

    private SearchBarDefaults() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Renamed to TonalElevation. Not to be confused with ShadowElevation.", replaceWith = @b1(expression = "TonalElevation", imports = {}))
    /* renamed from: getElevation-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2117getElevationD9Ej5fM$annotations() {
    }

    @p4.l
    @Composable
    /* renamed from: colors-Klgx-Pg, reason: not valid java name */
    public final SearchBarColors m2118colorsKlgxPg(long j5, long j6, @p4.m TextFieldColors textFieldColors, @p4.m Composer composer, int i5, int i6) {
        long j7;
        long j8;
        TextFieldColors textFieldColors2;
        composer.startReplaceableGroup(-1216168196);
        if ((i6 & 1) != 0) {
            j7 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j7 = j5;
        }
        if ((i6 & 2) != 0) {
            j8 = ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6);
        } else {
            j8 = j6;
        }
        if ((i6 & 4) != 0) {
            textFieldColors2 = m2124inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, (i5 << 3) & 57344, 16383);
        } else {
            textFieldColors2 = textFieldColors;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1216168196, i5, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:548)");
        }
        SearchBarColors searchBarColors = new SearchBarColors(j7, j8, textFieldColors2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return searchBarColors;
    }

    @p4.l
    @u3.h(name = "getDockedShape")
    @Composable
    public final Shape getDockedShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1006952150);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1006952150, i5, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.android.kt:530)");
        }
        Shape value = ShapesKt.getValue(SearchViewTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2119getElevationD9Ej5fM() {
        return Elevation;
    }

    @p4.l
    @u3.h(name = "getFullScreenShape")
    @Composable
    public final Shape getFullScreenShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1665502056);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1665502056, i5, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.android.kt:527)");
        }
        Shape value = ShapesKt.getValue(SearchViewTokens.INSTANCE.getFullScreenContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: getInputFieldHeight-D9Ej5fM, reason: not valid java name */
    public final float m2120getInputFieldHeightD9Ej5fM() {
        return InputFieldHeight;
    }

    @p4.l
    @u3.h(name = "getInputFieldShape")
    @Composable
    public final Shape getInputFieldShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-971556142);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-971556142, i5, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.android.kt:523)");
        }
        Shape value = ShapesKt.getValue(SearchBarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: getShadowElevation-D9Ej5fM, reason: not valid java name */
    public final float m2121getShadowElevationD9Ej5fM() {
        return ShadowElevation;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m2122getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    @p4.l
    @u3.h(name = "getWindowInsets")
    @Composable
    public final WindowInsets getWindowInsets(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(2112270157);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2112270157, i5, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.android.kt:533)");
        }
        WindowInsets statusBars = WindowInsets_androidKt.getStatusBars(WindowInsets.Companion, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return statusBars;
    }

    @Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: inputFieldColors--u-KgnY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m2123inputFieldColorsuKgnY(long j5, long j6, long j7, TextSelectionColors textSelectionColors, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i5, int i6, int i7) {
        long j16;
        long j17;
        long j18;
        TextSelectionColors textSelectionColors2;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        composer.startReplaceableGroup(355927049);
        if ((i7 & 1) != 0) {
            j16 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6);
        } else {
            j16 = j5;
        }
        if ((i7 & 2) != 0) {
            j17 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j17 = j6;
        }
        if ((i7 & 4) != 0) {
            j18 = ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6);
        } else {
            j18 = j7;
        }
        if ((i7 & 8) != 0) {
            textSelectionColors2 = (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        if ((i7 & 16) != 0) {
            j19 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6);
        } else {
            j19 = j8;
        }
        if ((i7 & 32) != 0) {
            j20 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6);
        } else {
            j20 = j9;
        }
        if ((i7 & 64) != 0) {
            j21 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j21 = j10;
        }
        if ((i7 & 128) != 0) {
            j22 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6);
        } else {
            j22 = j11;
        }
        if ((i7 & 256) != 0) {
            j23 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6);
        } else {
            j23 = j12;
        }
        if ((i7 & 512) != 0) {
            j24 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j24 = j13;
        }
        if ((i7 & 1024) != 0) {
            j25 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        } else {
            j25 = j14;
        }
        if ((i7 & 2048) != 0) {
            j26 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j26 = j15;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(355927049, i5, i6, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:635)");
        }
        int i8 = i5 << 3;
        int i9 = i6 << 6;
        TextFieldColors m2124inputFieldColorsITpI4ow = m2124inputFieldColorsITpI4ow(j16, j16, j17, j18, textSelectionColors2, j19, j20, j21, j22, j23, j24, j25, j25, j26, composer, (i5 & 14) | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (458752 & i8) | (3670016 & i8) | (29360128 & i8) | (234881024 & i8) | (i8 & 1879048192), ((i5 >> 27) & 14) | ((i6 << 3) & 112) | (i9 & 896) | (i9 & 7168) | (i9 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2124inputFieldColorsITpI4ow;
    }

    @p4.l
    @Composable
    /* renamed from: inputFieldColors-ITpI4ow, reason: not valid java name */
    public final TextFieldColors m2124inputFieldColorsITpI4ow(long j5, long j6, long j7, long j8, @p4.m TextSelectionColors textSelectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, @p4.m Composer composer, int i5, int i6, int i7) {
        composer.startReplaceableGroup(-602148837);
        long value = (i7 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j5;
        long value2 = (i7 & 2) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j6;
        long m3733copywmQWz5c$default = (i7 & 4) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long value3 = (i7 & 8) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j8;
        TextSelectionColors textSelectionColors2 = (i7 & 16) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value4 = (i7 & 32) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j9;
        long value5 = (i7 & 64) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j10;
        long m3733copywmQWz5c$default2 = (i7 & 128) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long value6 = (i7 & 256) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j12;
        long value7 = (i7 & 512) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j13;
        long m3733copywmQWz5c$default3 = (i7 & 1024) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long value8 = (i7 & 2048) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j15;
        long value9 = (i7 & 4096) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j16;
        long m3733copywmQWz5c$default4 = (i7 & 8192) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-602148837, i5, i6, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:599)");
        }
        int i8 = i6 << 18;
        TextFieldColors m2422colors0hiis_0 = TextFieldDefaults.INSTANCE.m2422colors0hiis_0(value, value2, m3733copywmQWz5c$default, 0L, 0L, 0L, 0L, 0L, value3, 0L, textSelectionColors2, 0L, 0L, 0L, 0L, value4, value5, m3733copywmQWz5c$default2, 0L, value6, value7, m3733copywmQWz5c$default3, 0L, 0L, 0L, 0L, 0L, value8, value9, m3733copywmQWz5c$default4, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | ((i5 << 15) & 234881024), ((i5 >> 12) & 14) | (458752 & i5) | (3670016 & i5) | (i5 & 29360128) | ((i5 << 3) & 1879048192), ((i5 >> 27) & 14) | ((i6 << 3) & 112) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192), 0, 3072, 1204058872, 4095);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2422colors0hiis_0;
    }
}
