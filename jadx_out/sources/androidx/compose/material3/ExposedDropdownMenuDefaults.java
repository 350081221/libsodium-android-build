package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.tokens.FilledAutocompleteTokens;
import androidx.compose.material3.tokens.OutlinedAutocompleteTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@kotlin.i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0098\u0003\u00103\u001a\u0002002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0098\u0003\u00109\u001a\u0002002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00102J\u0084\u0003\u00103\u001a\u0002002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010:\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u0084\u0003\u00109\u001a\u0002002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010:\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b=\u0010<J\u0082\u0002\u00103\u001a\u0002002\b\b\u0002\u0010>\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010:\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0082\u0002\u00109\u001a\u0002002\b\b\u0002\u0010>\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010:\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\bB\u0010AR\u0017\u0010D\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuDefaults;", "", "", "expanded", "Lkotlin/r2;", "TrailingIcon", "(ZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "Landroidx/compose/material3/TextFieldColors;", "textFieldColors-FD9MK7s", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-FD9MK7s", "outlinedTextFieldColors", "containerColor", "textFieldColors-tN0la-I", "(JJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldColors-tN0la-I", "textColor", "placeholderColor", "textFieldColors-St-qZLY", "(JJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldColors-St-qZLY", "Landroidx/compose/foundation/layout/PaddingValues;", "ItemContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getItemContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1091:1\n74#2:1092\n74#2:1093\n74#2:1094\n74#2:1095\n74#2:1096\n74#2:1097\n154#3:1098\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuDefaults\n*L\n392#1:1092\n546#1:1093\n659#1:1094\n765#1:1095\n866#1:1096\n956#1:1097\n644#1:1098\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    @p4.l
    private static final PaddingValues ItemContentPadding;

    static {
        float f5;
        f5 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuItemHorizontalPadding;
        ItemContentPadding = PaddingKt.m547PaddingValuesYgX7TsA(f5, Dp.m6044constructorimpl(0));
    }

    private ExposedDropdownMenuDefaults() {
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    public final void TrailingIcon(boolean z4, @p4.m Composer composer, int i5) {
        int i6;
        float f5;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-473088613);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(z4)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-473088613, i6, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:322)");
            }
            ImageVector arrowDropDown = ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE);
            Modifier.Companion companion = Modifier.Companion;
            if (z4) {
                f5 = 180.0f;
            } else {
                f5 = 0.0f;
            }
            IconKt.m1925Iconww6aTOc(arrowDropDown, (String) null, RotateKt.rotate(companion, f5), 0L, startRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ExposedDropdownMenuDefaults$TrailingIcon$1(this, z4, i5));
        }
    }

    @p4.l
    public final PaddingValues getItemContentPadding() {
        return ItemContentPadding;
    }

    @p4.l
    @Composable
    /* renamed from: outlinedTextFieldColors-FD9MK7s, reason: not valid java name */
    public final TextFieldColors m1869outlinedTextFieldColorsFD9MK7s(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, @p4.m TextSelectionColors textSelectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, @p4.m Composer composer, int i5, int i6, int i7, int i8, int i9, int i10) {
        composer.startReplaceableGroup(-1567195085);
        long value = (i9 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j5;
        long value2 = (i9 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j6;
        long m3733copywmQWz5c$default = (i9 & 4) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long value3 = (i9 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j8;
        long m3769getTransparent0d7_KjU = (i9 & 16) != 0 ? Color.Companion.m3769getTransparent0d7_KjU() : j9;
        long m3769getTransparent0d7_KjU2 = (i9 & 32) != 0 ? Color.Companion.m3769getTransparent0d7_KjU() : j10;
        long m3769getTransparent0d7_KjU3 = (i9 & 64) != 0 ? Color.Companion.m3769getTransparent0d7_KjU() : j11;
        long m3769getTransparent0d7_KjU4 = (i9 & 128) != 0 ? Color.Companion.m3769getTransparent0d7_KjU() : j12;
        long value4 = (i9 & 256) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j13;
        long value5 = (i9 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j14;
        TextSelectionColors textSelectionColors2 = (i9 & 1024) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value6 = (i9 & 2048) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6) : j15;
        long value7 = (i9 & 4096) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6) : j16;
        long m3733copywmQWz5c$default2 = (i9 & 8192) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long value8 = (i9 & 16384) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6) : j18;
        long value9 = (32768 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j19;
        long value10 = (65536 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j20;
        long m3733copywmQWz5c$default3 = (131072 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long value11 = (262144 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j22;
        long value12 = (524288 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j23;
        long value13 = (1048576 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j24;
        long m3733copywmQWz5c$default4 = (2097152 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long value14 = (4194304 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j26;
        long value15 = (8388608 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j27;
        long value16 = (16777216 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j28;
        long m3733copywmQWz5c$default5 = (33554432 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long value17 = (67108864 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j30;
        long value18 = (134217728 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j31;
        long value19 = (268435456 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j32;
        long m3733copywmQWz5c$default6 = (536870912 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j33;
        long value20 = (i9 & 1073741824) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j34;
        long value21 = (i10 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j35;
        long value22 = (i10 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j36;
        long m3733copywmQWz5c$default7 = (i10 & 4) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j37;
        long value23 = (i10 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j38;
        long value24 = (i10 & 16) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j39;
        long value25 = (i10 & 32) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j40;
        long m3733copywmQWz5c$default8 = (i10 & 64) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j41;
        long value26 = (i10 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j42;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1567195085, i5, i6, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:595)");
        }
        int i11 = i8 << 12;
        int i12 = i8 >> 18;
        TextFieldColors m2054colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2054colors0hiis_0(value, value2, m3733copywmQWz5c$default, value3, m3769getTransparent0d7_KjU, m3769getTransparent0d7_KjU2, m3769getTransparent0d7_KjU3, m3769getTransparent0d7_KjU4, value4, value5, textSelectionColors2, value6, value7, m3733copywmQWz5c$default2, value8, value9, value10, m3733copywmQWz5c$default3, value11, value12, value13, m3733copywmQWz5c$default4, value14, value15, value16, m3733copywmQWz5c$default5, value17, value18, value19, m3733copywmQWz5c$default6, value20, 0L, 0L, 0L, 0L, value21, value22, m3733copywmQWz5c$default7, value23, value24, value25, m3733copywmQWz5c$default8, value26, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | (i6 & 1879048192), (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), (i8 & 14) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), (i12 & 14) | 3072 | (i12 & 112) | (i12 & 896), 0, 15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2054colors0hiis_0;
    }

    @Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: outlinedTextFieldColors-St-qZLY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1870outlinedTextFieldColorsStqZLY(long j5, long j6, long j7, long j8, long j9, TextSelectionColors textSelectionColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, Composer composer, int i5, int i6, int i7, int i8) {
        composer.startReplaceableGroup(-836383316);
        long value = (i8 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j5;
        long m3733copywmQWz5c$default = (i8 & 2) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m3769getTransparent0d7_KjU = (i8 & 4) != 0 ? Color.Companion.m3769getTransparent0d7_KjU() : j7;
        long value2 = (i8 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j8;
        long value3 = (i8 & 16) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j9;
        TextSelectionColors textSelectionColors2 = (i8 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value4 = (i8 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6) : j10;
        long value5 = (i8 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6) : j11;
        long m3733copywmQWz5c$default2 = (i8 & 256) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long value6 = (i8 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6) : j13;
        long value7 = (i8 & 1024) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j14;
        long value8 = (i8 & 2048) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j15;
        long m3733copywmQWz5c$default3 = (i8 & 4096) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long value9 = (i8 & 8192) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j17;
        long value10 = (i8 & 16384) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j18;
        long value11 = (32768 & i8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j19;
        long m3733copywmQWz5c$default4 = (65536 & i8) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long value12 = (131072 & i8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j21;
        long value13 = (262144 & i8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j22;
        long value14 = (524288 & i8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j23;
        long m3733copywmQWz5c$default5 = (1048576 & i8) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long value15 = (2097152 & i8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j25;
        long value16 = (4194304 & i8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j26;
        long m3733copywmQWz5c$default6 = (i8 & 8388608) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-836383316, i5, i6, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:989)");
        }
        OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
        long value17 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value18 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long m3733copywmQWz5c$default7 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long value19 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value20 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value21 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long m3733copywmQWz5c$default8 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long value22 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        int i9 = i5 << 3;
        int i10 = (i5 & 14) | (i9 & 112) | (i9 & 896);
        int i11 = i5 << 9;
        int i12 = i10 | (i11 & 7168) | ((i5 << 6) & 57344) | (i11 & 458752) | ((i5 << 12) & 3670016);
        int i13 = i5 << 15;
        int i14 = i12 | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192);
        int i15 = i5 >> 15;
        int i16 = i6 << 15;
        int i17 = (i15 & 57344) | (i15 & 14) | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i6 >> 15;
        int i19 = i7 << 15;
        int i20 = i7 << 18;
        TextFieldColors m1869outlinedTextFieldColorsFD9MK7s = m1869outlinedTextFieldColorsFD9MK7s(value, value, m3733copywmQWz5c$default, value, m3769getTransparent0d7_KjU, m3769getTransparent0d7_KjU, m3769getTransparent0d7_KjU, m3769getTransparent0d7_KjU, value2, value3, textSelectionColors2, value4, value5, m3733copywmQWz5c$default2, value6, value7, value8, m3733copywmQWz5c$default3, value9, value10, value11, m3733copywmQWz5c$default4, value12, value13, value14, m3733copywmQWz5c$default5, value15, value16, value16, m3733copywmQWz5c$default6, value16, value17, value18, m3733copywmQWz5c$default7, value19, value20, value21, m3733copywmQWz5c$default8, value22, composer, i14, i17, (i18 & 57344) | (i18 & 14) | (i18 & 112) | (i18 & 896) | (i18 & 7168) | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), ((i7 >> 6) & 14) | (i19 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1869outlinedTextFieldColorsFD9MK7s;
    }

    @Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: outlinedTextFieldColors-tN0la-I, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1871outlinedTextFieldColorstN0laI(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, TextSelectionColors textSelectionColors, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, Composer composer, int i5, int i6, int i7, int i8, int i9, int i10) {
        composer.startReplaceableGroup(-388128543);
        long value = (i9 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j5;
        long value2 = (i9 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j6;
        long m3733copywmQWz5c$default = (i9 & 4) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long value3 = (i9 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j8;
        long m3769getTransparent0d7_KjU = (i9 & 16) != 0 ? Color.Companion.m3769getTransparent0d7_KjU() : j9;
        long m3769getTransparent0d7_KjU2 = (i9 & 32) != 0 ? Color.Companion.m3769getTransparent0d7_KjU() : j10;
        long value4 = (i9 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j11;
        long value5 = (i9 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j12;
        TextSelectionColors textSelectionColors2 = (i9 & 256) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value6 = (i9 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6) : j13;
        long value7 = (i9 & 1024) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6) : j14;
        long m3733copywmQWz5c$default2 = (i9 & 2048) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long value8 = (i9 & 4096) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6) : j16;
        long value9 = (i9 & 8192) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j17;
        long value10 = (i9 & 16384) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j18;
        long m3733copywmQWz5c$default3 = (32768 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long value11 = (65536 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j20;
        long value12 = (131072 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j21;
        long value13 = (262144 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j22;
        long m3733copywmQWz5c$default4 = (524288 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long value14 = (1048576 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j24;
        long value15 = (2097152 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j25;
        long value16 = (4194304 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j26;
        long m3733copywmQWz5c$default5 = (8388608 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long value17 = (16777216 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j28;
        long value18 = (33554432 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j29;
        long value19 = (67108864 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j30;
        long m3733copywmQWz5c$default6 = (134217728 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j31;
        long value20 = (268435456 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j32;
        long value21 = (536870912 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j33;
        long value22 = (i9 & 1073741824) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j34;
        long m3733copywmQWz5c$default7 = (i10 & 1) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j35;
        long value23 = (i10 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j36;
        long value24 = (i10 & 4) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j37;
        long value25 = (i10 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j38;
        long m3733copywmQWz5c$default8 = (i10 & 16) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j39;
        long value26 = (i10 & 32) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j40;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-388128543, i5, i6, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:814)");
        }
        int i11 = i5 << 6;
        int i12 = i5 >> 24;
        int i13 = i6 << 6;
        int i14 = (i12 & 112) | (i12 & 14) | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192);
        int i15 = i6 >> 24;
        int i16 = i7 << 6;
        int i17 = (i15 & 112) | (i15 & 14) | (i16 & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i7 >> 24;
        int i19 = i8 << 6;
        TextFieldColors m1869outlinedTextFieldColorsFD9MK7s = m1869outlinedTextFieldColorsFD9MK7s(value, value2, m3733copywmQWz5c$default, value3, m3769getTransparent0d7_KjU, m3769getTransparent0d7_KjU, m3769getTransparent0d7_KjU, m3769getTransparent0d7_KjU2, value4, value5, textSelectionColors2, value6, value7, m3733copywmQWz5c$default2, value8, value9, value10, m3733copywmQWz5c$default3, value11, value12, value13, m3733copywmQWz5c$default4, value14, value15, value16, m3733copywmQWz5c$default5, value17, value18, value19, m3733copywmQWz5c$default6, value20, value21, value22, m3733copywmQWz5c$default7, value23, value24, value25, m3733copywmQWz5c$default8, value26, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | ((i5 << 3) & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), i14, i17, (i18 & 112) | (i18 & 14) | (i19 & 896) | (i19 & 7168) | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | (i19 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1869outlinedTextFieldColorsFD9MK7s;
    }

    @p4.l
    @Composable
    /* renamed from: textFieldColors-FD9MK7s, reason: not valid java name */
    public final TextFieldColors m1872textFieldColorsFD9MK7s(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, @p4.m TextSelectionColors textSelectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, @p4.m Composer composer, int i5, int i6, int i7, int i8, int i9, int i10) {
        composer.startReplaceableGroup(768358577);
        long value = (i9 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j5;
        long value2 = (i9 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j6;
        long m3733copywmQWz5c$default = (i9 & 4) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long value3 = (i9 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j8;
        long value4 = (i9 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j9;
        long value5 = (i9 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j10;
        long value6 = (i9 & 64) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j11;
        long value7 = (i9 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j12;
        long value8 = (i9 & 256) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j13;
        long value9 = (i9 & 512) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j14;
        TextSelectionColors textSelectionColors2 = (i9 & 1024) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value10 = (i9 & 2048) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6) : j15;
        long value11 = (i9 & 4096) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6) : j16;
        long m3733copywmQWz5c$default2 = (i9 & 8192) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long value12 = (i9 & 16384) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6) : j18;
        long value13 = (32768 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j19;
        long value14 = (65536 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j20;
        long m3733copywmQWz5c$default3 = (131072 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long value15 = (262144 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j22;
        long value16 = (524288 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j23;
        long value17 = (1048576 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j24;
        long m3733copywmQWz5c$default4 = (2097152 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long value18 = (4194304 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j26;
        long value19 = (8388608 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j27;
        long value20 = (16777216 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j28;
        long value21 = (33554432 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6) : j29;
        long value22 = (67108864 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j30;
        long value23 = (134217728 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j31;
        long value24 = (268435456 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j32;
        long m3733copywmQWz5c$default5 = (536870912 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j33;
        long value25 = (i9 & 1073741824) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j34;
        long value26 = (i10 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j35;
        long value27 = (i10 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j36;
        long m3733copywmQWz5c$default6 = (i10 & 4) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j37;
        long value28 = (i10 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j38;
        long value29 = (i10 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j39;
        long value30 = (i10 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j40;
        long m3733copywmQWz5c$default7 = (i10 & 64) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j41;
        long value31 = (i10 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j42;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(768358577, i5, i6, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:442)");
        }
        int i11 = i8 << 12;
        int i12 = i8 >> 18;
        TextFieldColors m2422colors0hiis_0 = TextFieldDefaults.INSTANCE.m2422colors0hiis_0(value, value2, m3733copywmQWz5c$default, value3, value4, value5, value6, value7, value8, value9, textSelectionColors2, value10, value11, m3733copywmQWz5c$default2, value12, value13, value14, m3733copywmQWz5c$default3, value15, value16, value17, m3733copywmQWz5c$default4, value18, value19, value20, value21, value22, value23, value24, m3733copywmQWz5c$default5, value25, 0L, 0L, 0L, 0L, value26, value27, m3733copywmQWz5c$default6, value28, value29, value30, m3733copywmQWz5c$default7, value31, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | (i6 & 1879048192), (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), (i8 & 14) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), (i12 & 14) | 3072 | (i12 & 112) | (i12 & 896), 0, 15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2422colors0hiis_0;
    }

    @Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: textFieldColors-St-qZLY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1873textFieldColorsStqZLY(long j5, long j6, long j7, long j8, long j9, TextSelectionColors textSelectionColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, Composer composer, int i5, int i6, int i7, int i8) {
        composer.startReplaceableGroup(-1343678550);
        long value = (i8 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j5;
        long m3733copywmQWz5c$default = (i8 & 2) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long value2 = (i8 & 4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j7;
        long value3 = (i8 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j8;
        long value4 = (i8 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j9;
        TextSelectionColors textSelectionColors2 = (i8 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value5 = (i8 & 64) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6) : j10;
        long value6 = (i8 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6) : j11;
        long m3733copywmQWz5c$default2 = (i8 & 256) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long value7 = (i8 & 512) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6) : j13;
        long value8 = (i8 & 1024) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j14;
        long value9 = (i8 & 2048) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j15;
        long m3733copywmQWz5c$default3 = (i8 & 4096) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long value10 = (i8 & 8192) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j17;
        long value11 = (i8 & 16384) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j18;
        long value12 = (32768 & i8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j19;
        long m3733copywmQWz5c$default4 = (65536 & i8) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long value13 = (131072 & i8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j21;
        long value14 = (262144 & i8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j22;
        long value15 = (524288 & i8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j23;
        long value16 = (1048576 & i8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6) : j24;
        long value17 = (2097152 & i8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j25;
        long value18 = (4194304 & i8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j26;
        long m3733copywmQWz5c$default5 = (i8 & 8388608) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1343678550, i5, i6, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:901)");
        }
        OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
        long value19 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value20 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long m3733copywmQWz5c$default6 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long value21 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value22 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value23 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long m3733copywmQWz5c$default7 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long value24 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        int i9 = i5 << 3;
        int i10 = (i5 & 14) | (i9 & 112) | (i9 & 896);
        int i11 = i5 << 9;
        int i12 = i10 | (i11 & 7168) | ((i5 << 6) & 57344) | (i11 & 458752) | ((i5 << 12) & 3670016);
        int i13 = i5 << 15;
        int i14 = i12 | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192);
        int i15 = i5 >> 15;
        int i16 = i6 << 15;
        int i17 = (i15 & 57344) | (i15 & 14) | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i6 >> 15;
        int i19 = i7 << 15;
        int i20 = i7 << 18;
        TextFieldColors m1872textFieldColorsFD9MK7s = m1872textFieldColorsFD9MK7s(value, value, m3733copywmQWz5c$default, value, value2, value2, value2, value2, value3, value4, textSelectionColors2, value5, value6, m3733copywmQWz5c$default2, value7, value8, value9, m3733copywmQWz5c$default3, value10, value11, value12, m3733copywmQWz5c$default4, value13, value14, value15, value16, value17, value18, value18, m3733copywmQWz5c$default5, value18, value19, value20, m3733copywmQWz5c$default6, value21, value22, value23, m3733copywmQWz5c$default7, value24, composer, i14, i17, (i18 & 57344) | (i18 & 14) | (i18 & 112) | (i18 & 896) | (i18 & 7168) | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), ((i7 >> 6) & 14) | (i19 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1872textFieldColorsFD9MK7s;
    }

    @Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: textFieldColors-tN0la-I, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1874textFieldColorstN0laI(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, TextSelectionColors textSelectionColors, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, Composer composer, int i5, int i6, int i7, int i8, int i9, int i10) {
        composer.startReplaceableGroup(611690079);
        long value = (i9 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j5;
        long value2 = (i9 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j6;
        long m3733copywmQWz5c$default = (i9 & 4) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long value3 = (i9 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j8;
        long value4 = (i9 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j9;
        long value5 = (i9 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j10;
        long value6 = (i9 & 64) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j11;
        long value7 = (i9 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j12;
        TextSelectionColors textSelectionColors2 = (i9 & 256) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value8 = (i9 & 512) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6) : j13;
        long value9 = (i9 & 1024) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6) : j14;
        long m3733copywmQWz5c$default2 = (i9 & 2048) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long value10 = (i9 & 4096) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6) : j16;
        long value11 = (i9 & 8192) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j17;
        long value12 = (i9 & 16384) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j18;
        long m3733copywmQWz5c$default3 = (32768 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long value13 = (65536 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j20;
        long value14 = (131072 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j21;
        long value15 = (262144 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j22;
        long m3733copywmQWz5c$default4 = (524288 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long value16 = (1048576 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j24;
        long value17 = (2097152 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j25;
        long value18 = (4194304 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j26;
        long value19 = (8388608 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6) : j27;
        long value20 = (16777216 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j28;
        long value21 = (33554432 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j29;
        long value22 = (67108864 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j30;
        long m3733copywmQWz5c$default5 = (134217728 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j31;
        long value23 = (268435456 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j32;
        long value24 = (536870912 & i9) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j33;
        long value25 = (i9 & 1073741824) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j34;
        long m3733copywmQWz5c$default6 = (i10 & 1) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j35;
        long value26 = (i10 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j36;
        long value27 = (i10 & 4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j37;
        long value28 = (i10 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j38;
        long m3733copywmQWz5c$default7 = (i10 & 16) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j39;
        long value29 = (i10 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j40;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611690079, i5, i6, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:709)");
        }
        int i11 = i5 << 6;
        int i12 = i5 >> 24;
        int i13 = i6 << 6;
        int i14 = (i12 & 112) | (i12 & 14) | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192);
        int i15 = i6 >> 24;
        int i16 = i7 << 6;
        int i17 = (i15 & 112) | (i15 & 14) | (i16 & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i7 >> 24;
        int i19 = i8 << 6;
        TextFieldColors m1872textFieldColorsFD9MK7s = m1872textFieldColorsFD9MK7s(value, value2, m3733copywmQWz5c$default, value3, value4, value4, value4, value5, value6, value7, textSelectionColors2, value8, value9, m3733copywmQWz5c$default2, value10, value11, value12, m3733copywmQWz5c$default3, value13, value14, value15, m3733copywmQWz5c$default4, value16, value17, value18, value19, value20, value21, value22, m3733copywmQWz5c$default5, value23, value24, value25, m3733copywmQWz5c$default6, value26, value27, value28, m3733copywmQWz5c$default7, value29, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | ((i5 << 3) & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), i14, i17, (i18 & 112) | (i18 & 14) | (i19 & 896) | (i19 & 7168) | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | (i19 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1872textFieldColorsFD9MK7s;
    }
}
