package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Locale;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u0082\u0001\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001af\u0010\u0012\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0098\u0001\u0010&\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\n\u0010#\u001a\u00060!j\u0002`\"2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\"\u001a\u0010(\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061²\u0006\u000e\u00100\u001a\u00020/8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "selectedDateMillis", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "dateInMillis", "Lkotlin/r2;", "onDateSelectionChange", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "Lkotlin/ranges/l;", "yearRange", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Landroidx/compose/material3/DatePickerColors;", "colors", "DateInputContent", "(Ljava/lang/Long;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "initialDateMillis", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", TTDownloadField.TT_LABEL, "placeholder", "Landroidx/compose/material3/InputIdentifier;", "inputIdentifier", "Landroidx/compose/material3/DateInputValidator;", "dateInputValidator", "Landroidx/compose/material3/DateInputFormat;", "dateInputFormat", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "DateInputTextField-tQNruF0", "(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lv3/l;Landroidx/compose/material3/CalendarModel;Lv3/p;Lv3/p;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "DateInputTextField", "Landroidx/compose/foundation/layout/PaddingValues;", "InputTextFieldPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getInputTextFieldPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/Dp;", "InputTextNonErroneousBottomPadding", "F", "Landroidx/compose/ui/text/input/TextFieldValue;", "text", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,377:1\n1116#2,6:378\n1116#2,6:387\n1116#2,6:394\n1116#2,6:400\n1116#2,6:407\n101#3:384\n103#3:385\n99#3:386\n93#3:393\n154#4:406\n154#4:416\n154#4:417\n154#4:418\n154#4:419\n81#5:413\n107#5,2:414\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n*L\n59#1:378,6\n65#1:387,6\n119#1:394,6\n136#1:400,6\n179#1:407,6\n62#1:384\n63#1:385\n64#1:386\n78#1:393\n174#1:406\n369#1:416\n370#1:417\n371#1:418\n376#1:419\n119#1:413\n119#1:414,2\n*E\n"})
/* loaded from: classes.dex */
public final class DateInputKt {

    @p4.l
    private static final PaddingValues InputTextFieldPadding;
    private static final float InputTextNonErroneousBottomPadding = Dp.m6044constructorimpl(16);

    static {
        float f5 = 24;
        InputTextFieldPadding = PaddingKt.m550PaddingValuesa9UjIt4$default(Dp.m6044constructorimpl(f5), Dp.m6044constructorimpl(10), Dp.m6044constructorimpl(f5), 0.0f, 8, null);
    }

    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DateInputContent(@p4.m Long l5, @p4.l v3.l<? super Long, r2> lVar, @p4.l CalendarModel calendarModel, @p4.l kotlin.ranges.l lVar2, @p4.l DatePickerFormatter datePickerFormatter, @p4.l SelectableDates selectableDates, @p4.l DatePickerColors datePickerColors, @p4.m Composer composer, int i5) {
        int i6;
        boolean z4;
        DateInputFormat dateInputFormat;
        Locale locale;
        int i7;
        ?? r13;
        Composer composer2;
        Composer composer3;
        int i8;
        int i9;
        boolean changedInstance;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(643325609);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(l5)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i6 = i14 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i6 |= i13;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(calendarModel)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i6 |= i12;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(lVar2)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i6 |= i11;
        }
        if ((i5 & 24576) == 0) {
            if ((i5 & 32768) == 0) {
                changedInstance = startRestartGroup.changed(datePickerFormatter);
            } else {
                changedInstance = startRestartGroup.changedInstance(datePickerFormatter);
            }
            if (changedInstance) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i6 |= i10;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changed(selectableDates)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i6 |= i9;
        }
        if ((1572864 & i5) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i6 |= i8;
        }
        int i15 = i6;
        if ((599187 & i15) == 599186 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(643325609, i15, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:55)");
            }
            Locale defaultLocale = ActualAndroid_androidKt.defaultLocale(startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-356766397);
            boolean changed = startRestartGroup.changed(defaultLocale);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = calendarModel.getDateInputFormat(defaultLocale);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            DateInputFormat dateInputFormat2 = (DateInputFormat) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            Strings.Companion companion = Strings.Companion;
            String m2294getStringNWtq28 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_input_invalid_for_pattern), startRestartGroup, 0);
            String m2294getStringNWtq282 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_input_invalid_year_range), startRestartGroup, 0);
            String m2294getStringNWtq283 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_input_invalid_not_allowed), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-356766049);
            boolean changed2 = startRestartGroup.changed(dateInputFormat2);
            if ((i15 & 57344) != 16384 && ((i15 & 32768) == 0 || !startRestartGroup.changed(datePickerFormatter))) {
                z4 = false;
            } else {
                z4 = true;
            }
            boolean z5 = changed2 | z4;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z5 && rememberedValue2 != Composer.Companion.getEmpty()) {
                dateInputFormat = dateInputFormat2;
                locale = defaultLocale;
                i7 = i15;
                r13 = 1;
                composer2 = startRestartGroup;
            } else {
                dateInputFormat = dateInputFormat2;
                locale = defaultLocale;
                i7 = i15;
                r13 = 1;
                DateInputValidator dateInputValidator = new DateInputValidator(lVar2, selectableDates, dateInputFormat, datePickerFormatter, m2294getStringNWtq28, m2294getStringNWtq282, m2294getStringNWtq283, "", null, null, 768, null);
                composer2 = startRestartGroup;
                composer2.updateRememberedValue(dateInputValidator);
                rememberedValue2 = dateInputValidator;
            }
            DateInputValidator dateInputValidator2 = (DateInputValidator) rememberedValue2;
            composer2.endReplaceableGroup();
            String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String m2294getStringNWtq284 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_input_label), composer2, 0);
            Modifier padding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, r13, null), InputTextFieldPadding);
            int m1947getSingleDateInputJ2x2o4M = InputIdentifier.Companion.m1947getSingleDateInputJ2x2o4M();
            dateInputValidator2.setCurrentStartDateMillis$material3_release(l5);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -1819015125, r13, new DateInputKt$DateInputContent$2(m2294getStringNWtq284, upperCase));
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -564233108, r13, new DateInputKt$DateInputContent$3(upperCase));
            int i16 = i7 << 3;
            composer3 = composer2;
            m1773DateInputTextFieldtQNruF0(padding, l5, lVar, calendarModel, composableLambda, composableLambda2, m1947getSingleDateInputJ2x2o4M, dateInputValidator2, dateInputFormat, locale, datePickerColors, composer2, (i16 & 112) | 1794054 | (i16 & 896) | (i16 & 7168), (i7 >> 18) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DateInputKt$DateInputContent$4(l5, lVar, calendarModel, lVar2, datePickerFormatter, selectableDates, datePickerColors, i5));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DateInputTextField-tQNruF0, reason: not valid java name */
    public static final void m1773DateInputTextFieldtQNruF0(@p4.l Modifier modifier, @p4.m Long l5, @p4.l v3.l<? super Long, r2> lVar, @p4.l CalendarModel calendarModel, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar2, int i5, @p4.l DateInputValidator dateInputValidator, @p4.l DateInputFormat dateInputFormat, @p4.l Locale locale, @p4.l DatePickerColors datePickerColors, @p4.m Composer composer, int i6, int i7) {
        int i8;
        int i9;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i10;
        boolean S1;
        float f5;
        boolean S12;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Composer startRestartGroup = composer.startRestartGroup(-857008589);
        int i21 = 4;
        if ((i6 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i8 = i20 | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            if (startRestartGroup.changed(l5)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i8 |= i19;
        }
        if ((i6 & 384) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i8 |= i18;
        }
        if ((i6 & 3072) == 0) {
            if (startRestartGroup.changedInstance(calendarModel)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i8 |= i17;
        }
        if ((i6 & 24576) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i8 |= i16;
        }
        if ((196608 & i6) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i8 |= i15;
        }
        if ((i6 & 1572864) == 0) {
            if (startRestartGroup.changed(i5)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i8 |= i14;
        }
        if ((i6 & 12582912) == 0) {
            if (startRestartGroup.changed(dateInputValidator)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i8 |= i13;
        }
        if ((i6 & 100663296) == 0) {
            if (startRestartGroup.changed(dateInputFormat)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i8 |= i12;
        }
        if ((i6 & 805306368) == 0) {
            if (startRestartGroup.changedInstance(locale)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i8 |= i11;
        }
        if ((i7 & 6) == 0) {
            if (!startRestartGroup.changed(datePickerColors)) {
                i21 = 2;
            }
            i9 = i7 | i21;
        } else {
            i9 = i7;
        }
        if ((i8 & 306783379) == 306783378 && (i9 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-857008589, i8, i9, "androidx.compose.material3.DateInputTextField (DateInput.kt:116)");
            }
            int i22 = i8;
            MutableState mutableState = (MutableState) RememberSaveableKt.m3351rememberSaveable(new Object[0], (Saver) null, (String) null, (v3.a) DateInputKt$DateInputTextField$errorText$1.INSTANCE, startRestartGroup, 3072, 6);
            Object[] objArr = new Object[0];
            Saver<TextFieldValue, Object> saver = TextFieldValue.Companion.getSaver();
            startRestartGroup.startReplaceableGroup(1947288557);
            if ((i22 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean changedInstance = z4 | startRestartGroup.changedInstance(calendarModel);
            int i23 = 234881024 & i22;
            if (i23 == 67108864) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean changedInstance2 = changedInstance | z5 | startRestartGroup.changedInstance(locale);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DateInputKt$DateInputTextField$text$2$1(l5, calendarModel, dateInputFormat, locale);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState rememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (v3.a) rememberedValue, startRestartGroup, 0, 4);
            TextFieldValue DateInputTextField_tQNruF0$lambda$4 = DateInputTextField_tQNruF0$lambda$4(rememberSaveable);
            startRestartGroup.startReplaceableGroup(1947289016);
            if (i23 == 67108864) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean changed = startRestartGroup.changed(rememberSaveable) | z6 | startRestartGroup.changed(mutableState);
            if ((i22 & 896) == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean changedInstance3 = changed | z7 | startRestartGroup.changedInstance(calendarModel);
            if ((i22 & 29360128) == 8388608) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z10 = changedInstance3 | z8;
            if ((i22 & 3670016) == 1048576) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean changedInstance4 = z10 | z9 | startRestartGroup.changedInstance(locale);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance4 && rememberedValue2 != Composer.Companion.getEmpty()) {
                i10 = i22;
            } else {
                i10 = i22;
                Object dateInputKt$DateInputTextField$1$1 = new DateInputKt$DateInputTextField$1$1(dateInputFormat, mutableState, lVar, calendarModel, dateInputValidator, i5, locale, rememberSaveable);
                startRestartGroup.updateRememberedValue(dateInputKt$DateInputTextField$1$1);
                rememberedValue2 = dateInputKt$DateInputTextField$1$1;
            }
            v3.l lVar2 = (v3.l) rememberedValue2;
            startRestartGroup.endReplaceableGroup();
            S1 = kotlin.text.e0.S1((CharSequence) mutableState.getValue());
            if (!S1) {
                f5 = Dp.m6044constructorimpl(0);
            } else {
                f5 = InputTextNonErroneousBottomPadding;
            }
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, f5, 7, null);
            startRestartGroup.startReplaceableGroup(1947290848);
            boolean changed2 = startRestartGroup.changed(mutableState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DateInputKt$DateInputTextField$2$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier semantics$default = SemanticsModifierKt.semantics$default(m557paddingqDBjuR0$default, false, (v3.l) rememberedValue3, 1, null);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -591991974, true, new DateInputKt$DateInputTextField$3(mutableState));
            S12 = kotlin.text.e0.S1((CharSequence) mutableState.getValue());
            int i24 = i10 << 6;
            OutlinedTextFieldKt.OutlinedTextField(DateInputTextField_tQNruF0$lambda$4, (v3.l<? super TextFieldValue, r2>) lVar2, semantics$default, false, false, (TextStyle) null, pVar, pVar2, (v3.p<? super Composer, ? super Integer, r2>) null, (v3.p<? super Composer, ? super Integer, r2>) null, (v3.p<? super Composer, ? super Integer, r2>) null, (v3.p<? super Composer, ? super Integer, r2>) null, (v3.p<? super Composer, ? super Integer, r2>) composableLambda, !S12, (VisualTransformation) new DateVisualTransformation(dateInputFormat), new KeyboardOptions(0, false, KeyboardType.Companion.m5772getNumberPjHm6EE(), ImeAction.Companion.m5722getDoneeUduSuo(), null, 17, null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, datePickerColors.getDateTextFieldColors(), startRestartGroup, (i24 & 3670016) | (i24 & 29360128), 12779904, 0, 4001592);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DateInputKt$DateInputTextField$4(modifier, l5, lVar, calendarModel, pVar, pVar2, i5, dateInputValidator, dateInputFormat, locale, datePickerColors, i6, i7));
        }
    }

    private static final TextFieldValue DateInputTextField_tQNruF0$lambda$4(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    @p4.l
    public static final PaddingValues getInputTextFieldPadding() {
        return InputTextFieldPadding;
    }
}
