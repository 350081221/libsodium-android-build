package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import com.lody.virtual.server.pm.parser.PackageParserEx;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001am\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aT\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a`\u0010#\u001a\u00020\u00002\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a½\u0001\u00105\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010%\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00172:\u0010-\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00070(2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00070.2\u0006\u00102\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a²\u0001\u00106\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010%\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u00112:\u0010-\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00070(2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00070.2\u0006\u00102\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b6\u00107\u001a²\u0001\u0010:\u001a\u00020\u00072\u0006\u00109\u001a\u0002082\b\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010%\u001a\u0004\u0018\u00010\u00112:\u0010-\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00070(2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00070.2\u0006\u00102\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b:\u0010;\u001ag\u0010?\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00112\b\u0010=\u001a\u0004\u0018\u00010\u00112\b\u0010>\u001a\u0004\u0018\u00010\u00112:\u0010-\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00070(H\u0002¢\u0006\u0004\b?\u0010@\u001a&\u0010H\u001a\u00020\u0007*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0000ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a.\u0010P\u001a\b\u0012\u0004\u0012\u00020O0N2\u0006\u0010\u0001\u001a\u0002082\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020KH\u0002\"\u001a\u0010R\u001a\u00020Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0014\u0010V\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010S\"\u0014\u0010W\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010S\"\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006["}, d2 = {"Landroidx/compose/material3/DateRangePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", com.alipay.sdk.m.x.d.f3030v, "headline", "", "showModeToggle", "Landroidx/compose/material3/DatePickerColors;", "colors", "DateRangePicker", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lv3/p;Lv3/p;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/l;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "rememberDateRangePickerState-IlFM19s", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;", "rememberDateRangePickerState", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "DateRangePickerState-HVP43zI", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DateRangePickerState;", "DateRangePickerState", "selectedStartDateMillis", "selectedEndDateMillis", "displayedMonthMillis", "displayMode", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "startDateMillis", "endDateMillis", "onDatesSelectionChange", "Lkotlin/Function1;", "monthInMillis", "onDisplayedMonthChange", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "SwitchableDateEntryContent-RN-2D1Q", "(Ljava/lang/Long;Ljava/lang/Long;JILv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "SwitchableDateEntryContent", "DateRangePickerContent", "(Ljava/lang/Long;Ljava/lang/Long;JLv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "VerticalMonthsList", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Ljava/lang/Long;Lv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "dateInMillis", "currentStartDateMillis", "currentEndDateMillis", "updateDateSelection", "(JLjava/lang/Long;Ljava/lang/Long;Lv3/p;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/material3/SelectedRangeInfo;", "selectedRangeInfo", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "drawRangeBackground-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V", "drawRangeBackground", "Lkotlinx/coroutines/s0;", "coroutineScope", "", "scrollUpLabel", "scrollDownLabel", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "customScrollActions", "Landroidx/compose/foundation/layout/PaddingValues;", "CalendarMonthSubheadPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getCalendarMonthSubheadPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DateRangePickerTitlePadding", "DateRangePickerHeadlinePadding", "Landroidx/compose/ui/unit/Dp;", "HeaderHeightOffset", "F", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1099:1\n1116#2,6:1100\n1116#2,6:1106\n1116#2,6:1113\n1116#2,6:1159\n1116#2,6:1165\n58#3:1112\n74#4,6:1119\n80#4:1153\n84#4:1158\n78#5,11:1125\n91#5:1157\n456#6,8:1136\n464#6,3:1150\n467#6,3:1154\n3737#7,6:1144\n154#8:1171\n154#8:1172\n154#8:1173\n154#8:1174\n154#8:1175\n154#8:1176\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n*L\n88#1:1100,6\n108#1:1106,6\n266#1:1113,6\n772#1:1159,6\n873#1:1165,6\n127#1:1112\n736#1:1119,6\n736#1:1153\n736#1:1158\n736#1:1125,11\n736#1:1157\n736#1:1136,8\n736#1:1150,3\n736#1:1154,3\n736#1:1144,6\n904#1:1171\n905#1:1172\n906#1:1173\n1091#1:1174\n1093#1:1175\n1098#1:1176\n*E\n"})
/* loaded from: classes.dex */
public final class DateRangePickerKt {

    @p4.l
    private static final PaddingValues DateRangePickerHeadlinePadding;

    @p4.l
    private static final PaddingValues DateRangePickerTitlePadding;

    @p4.l
    private static final PaddingValues CalendarMonthSubheadPadding = PaddingKt.m550PaddingValuesa9UjIt4$default(Dp.m6044constructorimpl(24), Dp.m6044constructorimpl(20), 0.0f, Dp.m6044constructorimpl(8), 4, null);
    private static final float HeaderHeightOffset = Dp.m6044constructorimpl(60);

    static {
        float f5 = 64;
        float f6 = 12;
        DateRangePickerTitlePadding = PaddingKt.m550PaddingValuesa9UjIt4$default(Dp.m6044constructorimpl(f5), 0.0f, Dp.m6044constructorimpl(f6), 0.0f, 10, null);
        DateRangePickerHeadlinePadding = PaddingKt.m550PaddingValuesa9UjIt4$default(Dp.m6044constructorimpl(f5), 0.0f, Dp.m6044constructorimpl(f6), Dp.m6044constructorimpl(f6), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DateRangePicker(@p4.l androidx.compose.material3.DateRangePickerState r24, @p4.m androidx.compose.ui.Modifier r25, @p4.m androidx.compose.material3.DatePickerFormatter r26, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r27, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, boolean r29, @p4.m androidx.compose.material3.DatePickerColors r30, @p4.m androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt.DateRangePicker(androidx.compose.material3.DateRangePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, v3.p, v3.p, boolean, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DateRangePickerContent(Long l5, Long l6, long j5, v3.p<? super Long, ? super Long, r2> pVar, v3.l<? super Long, r2> lVar, CalendarModel calendarModel, kotlin.ranges.l lVar2, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i5) {
        int i6;
        Composer composer2;
        int i7;
        int i8;
        boolean changedInstance;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(-787063721);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(l5)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i6 = i16 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(l6)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i6 |= i15;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(j5)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i6 |= i14;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i6 |= i13;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i6 |= i12;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changedInstance(calendarModel)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i6 |= i11;
        }
        if ((1572864 & i5) == 0) {
            if (startRestartGroup.changedInstance(lVar2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i6 |= i10;
        }
        if ((12582912 & i5) == 0) {
            if ((16777216 & i5) == 0) {
                changedInstance = startRestartGroup.changed(datePickerFormatter);
            } else {
                changedInstance = startRestartGroup.changedInstance(datePickerFormatter);
            }
            if (changedInstance) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i6 |= i9;
        }
        if ((100663296 & i5) == 0) {
            if (startRestartGroup.changed(selectableDates)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i6 |= i8;
        }
        if ((i5 & 805306368) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i6 |= i7;
        }
        if ((i6 & 306783379) == 306783378 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-787063721, i6, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:731)");
            }
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(calendarModel.getMonth(j5).indexIn(lVar2), 0, startRestartGroup, 0, 2);
            Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(Modifier.Companion, DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            DatePickerKt.WeekDays(datePickerColors, calendarModel, startRestartGroup, ((i6 >> 27) & 14) | ((i6 >> 12) & 112));
            int i17 = i6 << 3;
            composer2 = startRestartGroup;
            VerticalMonthsList(rememberLazyListState, l5, l6, pVar, lVar, calendarModel, lVar2, datePickerFormatter, selectableDates, datePickerColors, composer2, (i17 & 896) | (i17 & 112) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6) | (1879048192 & i6));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DateRangePickerKt$DateRangePickerContent$2(l5, l6, j5, pVar, lVar, calendarModel, lVar2, datePickerFormatter, selectableDates, datePickerColors, i5));
        }
    }

    @p4.l
    @ExperimentalMaterial3Api
    /* renamed from: DateRangePickerState-HVP43zI, reason: not valid java name */
    public static final DateRangePickerState m1823DateRangePickerStateHVP43zI(@p4.l Locale locale, @p4.m Long l5, @p4.m Long l6, @p4.m Long l7, @p4.l kotlin.ranges.l lVar, int i5, @p4.l SelectableDates selectableDates) {
        return new DateRangePickerStateImpl(l5, l6, l7, lVar, i5, selectableDates, locale, null);
    }

    /* renamed from: DateRangePickerState-HVP43zI$default, reason: not valid java name */
    public static /* synthetic */ DateRangePickerState m1824DateRangePickerStateHVP43zI$default(Locale locale, Long l5, Long l6, Long l7, kotlin.ranges.l lVar, int i5, SelectableDates selectableDates, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            l5 = null;
        }
        if ((i6 & 4) != 0) {
            l6 = null;
        }
        if ((i6 & 8) != 0) {
            l7 = l5;
        }
        if ((i6 & 16) != 0) {
            lVar = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i6 & 32) != 0) {
            i5 = DisplayMode.Companion.m1849getPickerjFl4v0();
        }
        if ((i6 & 64) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        return m1823DateRangePickerStateHVP43zI(locale, l5, l6, l7, lVar, i5, selectableDates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: SwitchableDateEntryContent-RN-2D1Q, reason: not valid java name */
    public static final void m1825SwitchableDateEntryContentRN2D1Q(Long l5, Long l6, long j5, int i5, v3.p<? super Long, ? super Long, r2> pVar, v3.l<? super Long, r2> lVar, CalendarModel calendarModel, kotlin.ranges.l lVar2, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        boolean changedInstance;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Composer startRestartGroup = composer.startRestartGroup(-532789335);
        int i20 = 4;
        if ((i6 & 6) == 0) {
            if (startRestartGroup.changed(l5)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i8 = i19 | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            if (startRestartGroup.changed(l6)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i8 |= i18;
        }
        if ((i6 & 384) == 0) {
            if (startRestartGroup.changed(j5)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i8 |= i17;
        }
        if ((i6 & 3072) == 0) {
            if (startRestartGroup.changed(i5)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i8 |= i16;
        }
        if ((i6 & 24576) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i8 |= i15;
        }
        if ((196608 & i6) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i8 |= i14;
        }
        if ((1572864 & i6) == 0) {
            if (startRestartGroup.changedInstance(calendarModel)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i8 |= i13;
        }
        if ((12582912 & i6) == 0) {
            if (startRestartGroup.changedInstance(lVar2)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i8 |= i12;
        }
        if ((i6 & 100663296) == 0) {
            if ((i6 & PackageParserEx.GET_SIGNING_CERTIFICATES) == 0) {
                changedInstance = startRestartGroup.changed(datePickerFormatter);
            } else {
                changedInstance = startRestartGroup.changedInstance(datePickerFormatter);
            }
            if (changedInstance) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i8 |= i11;
        }
        if ((i6 & 805306368) == 0) {
            if (startRestartGroup.changed(selectableDates)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i8 |= i10;
        }
        if ((i7 & 6) == 0) {
            if (!startRestartGroup.changed(datePickerColors)) {
                i20 = 2;
            }
            i9 = i7 | i20;
        } else {
            i9 = i7;
        }
        if ((i8 & 306783379) == 306783378 && (i9 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-532789335, i8, i9, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:680)");
            }
            CrossfadeKt.Crossfade(DisplayMode.m1841boximpl(i5), SemanticsModifierKt.semantics$default(Modifier.Companion, false, DateRangePickerKt$SwitchableDateEntryContent$1.INSTANCE, 1, null), AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1026642619, true, new DateRangePickerKt$SwitchableDateEntryContent$2(l5, l6, j5, pVar, lVar, calendarModel, lVar2, datePickerFormatter, selectableDates, datePickerColors)), startRestartGroup, ((i8 >> 9) & 14) | 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DateRangePickerKt$SwitchableDateEntryContent$3(l5, l6, j5, i5, pVar, lVar, calendarModel, lVar2, datePickerFormatter, selectableDates, datePickerColors, i6, i7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VerticalMonthsList(LazyListState lazyListState, Long l5, Long l6, v3.p<? super Long, ? super Long, r2> pVar, v3.l<? super Long, r2> lVar, CalendarModel calendarModel, kotlin.ranges.l lVar2, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i5) {
        int i6;
        boolean z4;
        Composer composer2;
        int i7;
        int i8;
        boolean changedInstance;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(1257365001);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(lazyListState)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i6 = i16 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(l5)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i6 |= i15;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(l6)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i6 |= i14;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i6 |= i13;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i6 |= i12;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changedInstance(calendarModel)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i6 |= i11;
        }
        if ((1572864 & i5) == 0) {
            if (startRestartGroup.changedInstance(lVar2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i6 |= i10;
        }
        if ((12582912 & i5) == 0) {
            if ((16777216 & i5) == 0) {
                changedInstance = startRestartGroup.changed(datePickerFormatter);
            } else {
                changedInstance = startRestartGroup.changedInstance(datePickerFormatter);
            }
            if (changedInstance) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i6 |= i9;
        }
        if ((100663296 & i5) == 0) {
            if (startRestartGroup.changed(selectableDates)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i6 |= i8;
        }
        if ((805306368 & i5) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i6 |= i7;
        }
        if ((i6 & 306783379) == 306783378 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1257365001, i6, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:769)");
            }
            CalendarDate today = calendarModel.getToday();
            startRestartGroup.startReplaceableGroup(1454981403);
            boolean changed = startRestartGroup.changed(lVar2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = calendarModel.getMonth(lVar2.e(), 1);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            int i17 = i6;
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getDateLabelTextFont()), ComposableLambdaKt.composableLambda(startRestartGroup, 1090773432, true, new DateRangePickerKt$VerticalMonthsList$1(l5, l6, pVar, lazyListState, lVar2, calendarModel, (CalendarMonth) rememberedValue, datePickerFormatter, datePickerColors, today, selectableDates)), startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(1454985957);
            int i18 = i17 & 14;
            boolean z5 = false;
            if (i18 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i17 & 57344) == 16384) {
                z5 = true;
            }
            composer2 = startRestartGroup;
            boolean changedInstance2 = z4 | z5 | startRestartGroup.changedInstance(calendarModel) | composer2.changedInstance(lVar2);
            Object rememberedValue2 = composer2.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                DateRangePickerKt$VerticalMonthsList$2$1 dateRangePickerKt$VerticalMonthsList$2$1 = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState, lVar, calendarModel, lVar2, null);
                composer2.updateRememberedValue(dateRangePickerKt$VerticalMonthsList$2$1);
                rememberedValue2 = dateRangePickerKt$VerticalMonthsList$2$1;
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(lazyListState, (v3.p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue2, composer2, i18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DateRangePickerKt$VerticalMonthsList$3(lazyListState, l5, l6, pVar, lVar, calendarModel, lVar2, datePickerFormatter, selectableDates, datePickerColors, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(LazyListState lazyListState, s0 s0Var, String str, String str2) {
        List<CustomAccessibilityAction> L;
        L = kotlin.collections.w.L(new CustomAccessibilityAction(str, new DateRangePickerKt$customScrollActions$scrollUpAction$1(lazyListState, s0Var)), new CustomAccessibilityAction(str2, new DateRangePickerKt$customScrollActions$scrollDownAction$1(lazyListState, s0Var)));
        return L;
    }

    /* renamed from: drawRangeBackground-mxwnekA, reason: not valid java name */
    public static final void m1827drawRangeBackgroundmxwnekA(@p4.l ContentDrawScope contentDrawScope, @p4.l SelectedRangeInfo selectedRangeInfo, long j5) {
        float f5;
        boolean z4;
        float m3562getWidthimpl;
        float m3562getWidthimpl2;
        float mo304toPx0680j_4 = contentDrawScope.mo304toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float mo304toPx0680j_42 = contentDrawScope.mo304toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float mo304toPx0680j_43 = contentDrawScope.mo304toPx0680j_4(DatePickerModalTokens.INSTANCE.m2770getDateStateLayerHeightD9Ej5fM());
        float f6 = 2;
        float f7 = (mo304toPx0680j_42 - mo304toPx0680j_43) / f6;
        float f8 = 7;
        float m3562getWidthimpl3 = (Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc()) - (f8 * mo304toPx0680j_4)) / f8;
        long m2168getGridStartCoordinatesnOccac = selectedRangeInfo.m2168getGridStartCoordinatesnOccac();
        int m6164component1impl = IntOffset.m6164component1impl(m2168getGridStartCoordinatesnOccac);
        int m6165component2impl = IntOffset.m6165component2impl(m2168getGridStartCoordinatesnOccac);
        long m2167getGridEndCoordinatesnOccac = selectedRangeInfo.m2167getGridEndCoordinatesnOccac();
        int m6164component1impl2 = IntOffset.m6164component1impl(m2167getGridEndCoordinatesnOccac);
        int m6165component2impl2 = IntOffset.m6165component2impl(m2167getGridEndCoordinatesnOccac);
        float f9 = mo304toPx0680j_4 + m3562getWidthimpl3;
        float f10 = m6164component1impl * f9;
        if (selectedRangeInfo.getFirstIsSelectionStart()) {
            f5 = mo304toPx0680j_4 / f6;
        } else {
            f5 = 0.0f;
        }
        float f11 = m3562getWidthimpl3 / f6;
        float f12 = f10 + f5 + f11;
        float f13 = (m6165component2impl * mo304toPx0680j_42) + f7;
        float f14 = m6164component1impl2 * f9;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            mo304toPx0680j_4 /= f6;
        }
        float f15 = f14 + mo304toPx0680j_4 + f11;
        float f16 = (m6165component2impl2 * mo304toPx0680j_42) + f7;
        if (contentDrawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            f12 = Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc()) - f12;
            f15 = Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc()) - f15;
        }
        float f17 = f15;
        long Offset = OffsetKt.Offset(f12, f13);
        if (m6165component2impl == m6165component2impl2) {
            m3562getWidthimpl = f17 - f12;
        } else if (z4) {
            m3562getWidthimpl = -f12;
        } else {
            m3562getWidthimpl = Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc()) - f12;
        }
        DrawScope.m4272drawRectnJ9OG0$default(contentDrawScope, j5, Offset, SizeKt.Size(m3562getWidthimpl, mo304toPx0680j_43), 0.0f, null, null, 0, 120, null);
        if (m6165component2impl != m6165component2impl2) {
            for (int i5 = (m6165component2impl2 - m6165component2impl) - 1; i5 > 0; i5--) {
                DrawScope.m4272drawRectnJ9OG0$default(contentDrawScope, j5, OffsetKt.Offset(0.0f, f13 + (i5 * mo304toPx0680j_42)), SizeKt.Size(Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc()), mo304toPx0680j_43), 0.0f, null, null, 0, 120, null);
            }
            if (contentDrawScope.getLayoutDirection() == LayoutDirection.Ltr) {
                m3562getWidthimpl2 = 0.0f;
            } else {
                m3562getWidthimpl2 = Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc());
            }
            long Offset2 = OffsetKt.Offset(m3562getWidthimpl2, f16);
            if (z4) {
                f17 -= Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc());
            }
            DrawScope.m4272drawRectnJ9OG0$default(contentDrawScope, j5, Offset2, SizeKt.Size(f17, mo304toPx0680j_43), 0.0f, null, null, 0, 120, null);
        }
    }

    @p4.l
    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return CalendarMonthSubheadPadding;
    }

    @p4.l
    @Composable
    @ExperimentalMaterial3Api
    /* renamed from: rememberDateRangePickerState-IlFM19s, reason: not valid java name */
    public static final DateRangePickerState m1828rememberDateRangePickerStateIlFM19s(@p4.m Long l5, @p4.m Long l6, @p4.m Long l7, @p4.m kotlin.ranges.l lVar, int i5, @p4.m SelectableDates selectableDates, @p4.m Composer composer, int i6, int i7) {
        Long l8;
        Long l9;
        Long l10;
        kotlin.ranges.l lVar2;
        int i8;
        SelectableDates selectableDates2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        composer.startReplaceableGroup(-2012087461);
        if ((i7 & 1) != 0) {
            l8 = null;
        } else {
            l8 = l5;
        }
        if ((i7 & 2) != 0) {
            l9 = null;
        } else {
            l9 = l6;
        }
        if ((i7 & 4) != 0) {
            l10 = l8;
        } else {
            l10 = l7;
        }
        if ((i7 & 8) != 0) {
            lVar2 = DatePickerDefaults.INSTANCE.getYearRange();
        } else {
            lVar2 = lVar;
        }
        if ((i7 & 16) != 0) {
            i8 = DisplayMode.Companion.m1849getPickerjFl4v0();
        } else {
            i8 = i5;
        }
        if ((i7 & 32) != 0) {
            selectableDates2 = DatePickerDefaults.INSTANCE.getAllDates();
        } else {
            selectableDates2 = selectableDates;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2012087461, i6, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:261)");
        }
        Locale defaultLocale = ActualAndroid_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DateRangePickerStateImpl, Object> Saver = DateRangePickerStateImpl.Companion.Saver(selectableDates2, defaultLocale);
        composer.startReplaceableGroup(269010268);
        if ((((i6 & 14) ^ 6) > 4 && composer.changed(l8)) || (i6 & 6) == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((((i6 & 112) ^ 48) > 32 && composer.changed(l9)) || (i6 & 48) == 32) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z9 = z5 | z4;
        if ((((i6 & 896) ^ 384) > 256 && composer.changed(l10)) || (i6 & 384) == 256) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean changedInstance = z9 | z6 | composer.changedInstance(lVar2);
        if ((((57344 & i6) ^ 24576) > 16384 && composer.changed(i8)) || (i6 & 24576) == 16384) {
            z7 = true;
        } else {
            z7 = false;
        }
        boolean z10 = changedInstance | z7;
        if ((((458752 & i6) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(selectableDates2)) || (i6 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean changedInstance2 = z10 | z8 | composer.changedInstance(defaultLocale);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DateRangePickerKt$rememberDateRangePickerState$1$1(l8, l9, l10, lVar2, i8, selectableDates2, defaultLocale);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DateRangePickerStateImpl dateRangePickerStateImpl = (DateRangePickerStateImpl) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) Saver, (String) null, (v3.a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dateRangePickerStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDateSelection(long j5, Long l5, Long l6, v3.p<? super Long, ? super Long, r2> pVar) {
        if ((l5 == null && l6 == null) || (l5 != null && l6 != null)) {
            pVar.invoke(Long.valueOf(j5), null);
        } else if (l5 != null && j5 >= l5.longValue()) {
            pVar.invoke(l5, Long.valueOf(j5));
        } else {
            pVar.invoke(Long.valueOf(j5), null);
        }
    }
}
