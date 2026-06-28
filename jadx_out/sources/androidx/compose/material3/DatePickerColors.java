package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@ExperimentalMaterial3Api
@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\bW\u0010XJ\u008c\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010$\u001a\u00020\u001b*\u0004\u0018\u00010\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0 H\u0000¢\u0006\u0004\b\"\u0010#J5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0001¢\u0006\u0004\b+\u0010,J-\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u0010'\u001a\u00020%2\u0006\u0010)\u001a\u00020%2\u0006\u0010-\u001a\u00020%H\u0001¢\u0006\u0004\b.\u0010/J-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u00101\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0001¢\u0006\u0004\b2\u0010/J%\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u0010'\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0001¢\u0006\u0004\b3\u00104J\u0013\u00107\u001a\u00020%2\b\u00106\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00109\u001a\u000208H\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b=\u0010<R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b>\u0010<R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b?\u0010<R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b@\u0010<R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\bA\u0010<R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\bB\u0010<R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\bC\u0010<R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\bD\u0010<R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\bE\u0010<R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\bF\u0010<R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bG\u0010<R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bH\u0010<R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\bI\u0010<R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\bJ\u0010<R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\bK\u0010<R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\bL\u0010<R\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\bM\u0010<R\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\bN\u0010<R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010:\u001a\u0004\bO\u0010<R\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010:\u001a\u0004\bP\u0010<R\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010:\u001a\u0004\bQ\u0010<R\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010:\u001a\u0004\bR\u0010<R\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010:\u001a\u0004\bS\u0010<R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010T\u001a\u0004\bU\u0010V\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/material3/DatePickerColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContainerColor", "dayInSelectionRangeContentColor", "dividerColor", "Landroidx/compose/material3/TextFieldColors;", "dateTextFieldColors", "copy-tNwlRmA", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;)Landroidx/compose/material3/DatePickerColors;", "copy", "Lkotlin/Function0;", "block", "takeOrElse$material3_release", "(Landroidx/compose/material3/TextFieldColors;Lv3/a;)Landroidx/compose/material3/TextFieldColors;", "takeOrElse", "", "isToday", "selected", "inRange", "enabled", "Landroidx/compose/runtime/State;", "dayContentColor$material3_release", "(ZZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animate", "dayContainerColor$material3_release", "(ZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "dayContainerColor", "currentYear", "yearContentColor$material3_release", "yearContainerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "yearContainerColor", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "getContainerColor-0d7_KjU", "()J", "getTitleContentColor-0d7_KjU", "getHeadlineContentColor-0d7_KjU", "getWeekdayContentColor-0d7_KjU", "getSubheadContentColor-0d7_KjU", "getNavigationContentColor-0d7_KjU", "getYearContentColor-0d7_KjU", "getDisabledYearContentColor-0d7_KjU", "getCurrentYearContentColor-0d7_KjU", "getSelectedYearContentColor-0d7_KjU", "getDisabledSelectedYearContentColor-0d7_KjU", "getSelectedYearContainerColor-0d7_KjU", "getDisabledSelectedYearContainerColor-0d7_KjU", "getDayContentColor-0d7_KjU", "getDisabledDayContentColor-0d7_KjU", "getSelectedDayContentColor-0d7_KjU", "getDisabledSelectedDayContentColor-0d7_KjU", "getSelectedDayContainerColor-0d7_KjU", "getDisabledSelectedDayContainerColor-0d7_KjU", "getTodayContentColor-0d7_KjU", "getTodayDateBorderColor-0d7_KjU", "getDayInSelectionRangeContainerColor-0d7_KjU", "getDayInSelectionRangeContentColor-0d7_KjU", "getDividerColor-0d7_KjU", "Landroidx/compose/material3/TextFieldColors;", "getDateTextFieldColors", "()Landroidx/compose/material3/TextFieldColors;", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;Lkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2268:1\n658#2:2269\n646#2:2270\n658#2:2271\n646#2:2272\n658#2:2273\n646#2:2274\n658#2:2275\n646#2:2276\n658#2:2277\n646#2:2278\n658#2:2279\n646#2:2280\n658#2:2281\n646#2:2282\n658#2:2283\n646#2:2284\n658#2:2285\n646#2:2286\n658#2:2287\n646#2:2288\n658#2:2289\n646#2:2290\n658#2:2291\n646#2:2292\n658#2:2293\n646#2:2294\n658#2:2295\n646#2:2296\n658#2:2297\n646#2:2298\n658#2:2299\n646#2:2300\n658#2:2301\n646#2:2302\n658#2:2303\n646#2:2304\n658#2:2305\n646#2:2306\n658#2:2307\n646#2:2308\n658#2:2309\n646#2:2310\n658#2:2311\n646#2:2312\n658#2:2313\n646#2:2314\n658#2:2315\n646#2:2316\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerColors\n*L\n847#1:2269\n847#1:2270\n848#1:2271\n848#1:2272\n849#1:2273\n849#1:2274\n850#1:2275\n850#1:2276\n851#1:2277\n851#1:2278\n852#1:2279\n852#1:2280\n853#1:2281\n853#1:2282\n854#1:2283\n854#1:2284\n855#1:2285\n855#1:2286\n856#1:2287\n856#1:2288\n857#1:2289\n857#1:2290\n858#1:2291\n858#1:2292\n859#1:2293\n859#1:2294\n860#1:2295\n860#1:2296\n861#1:2297\n861#1:2298\n862#1:2299\n862#1:2300\n863#1:2301\n863#1:2302\n864#1:2303\n864#1:2304\n865#1:2305\n865#1:2306\n866#1:2307\n866#1:2308\n867#1:2309\n867#1:2310\n868#1:2311\n868#1:2312\n869#1:2313\n869#1:2314\n870#1:2315\n870#1:2316\n*E\n"})
/* loaded from: classes.dex */
public final class DatePickerColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long currentYearContentColor;

    @p4.l
    private final TextFieldColors dateTextFieldColors;
    private final long dayContentColor;
    private final long dayInSelectionRangeContainerColor;
    private final long dayInSelectionRangeContentColor;
    private final long disabledDayContentColor;
    private final long disabledSelectedDayContainerColor;
    private final long disabledSelectedDayContentColor;
    private final long disabledSelectedYearContainerColor;
    private final long disabledSelectedYearContentColor;
    private final long disabledYearContentColor;
    private final long dividerColor;
    private final long headlineContentColor;
    private final long navigationContentColor;
    private final long selectedDayContainerColor;
    private final long selectedDayContentColor;
    private final long selectedYearContainerColor;
    private final long selectedYearContentColor;
    private final long subheadContentColor;
    private final long titleContentColor;
    private final long todayContentColor;
    private final long todayDateBorderColor;
    private final long weekdayContentColor;
    private final long yearContentColor;

    private DatePickerColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, TextFieldColors textFieldColors) {
        this.containerColor = j5;
        this.titleContentColor = j6;
        this.headlineContentColor = j7;
        this.weekdayContentColor = j8;
        this.subheadContentColor = j9;
        this.navigationContentColor = j10;
        this.yearContentColor = j11;
        this.disabledYearContentColor = j12;
        this.currentYearContentColor = j13;
        this.selectedYearContentColor = j14;
        this.disabledSelectedYearContentColor = j15;
        this.selectedYearContainerColor = j16;
        this.disabledSelectedYearContainerColor = j17;
        this.dayContentColor = j18;
        this.disabledDayContentColor = j19;
        this.selectedDayContentColor = j20;
        this.disabledSelectedDayContentColor = j21;
        this.selectedDayContainerColor = j22;
        this.disabledSelectedDayContainerColor = j23;
        this.todayContentColor = j24;
        this.todayDateBorderColor = j25;
        this.dayInSelectionRangeContainerColor = j26;
        this.dayInSelectionRangeContentColor = j27;
        this.dividerColor = j28;
        this.dateTextFieldColors = textFieldColors;
    }

    public /* synthetic */ DatePickerColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, TextFieldColors textFieldColors, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, textFieldColors);
    }

    @p4.l
    /* renamed from: copy-tNwlRmA, reason: not valid java name */
    public final DatePickerColors m1776copytNwlRmA(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, @p4.m TextFieldColors textFieldColors) {
        Color.Companion companion = Color.Companion;
        return new DatePickerColors((j5 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j5 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j5 : this.containerColor, (j6 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j6 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j6 : this.titleContentColor, (j7 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j7 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j7 : this.headlineContentColor, (j8 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j8 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j8 : this.weekdayContentColor, (j9 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j9 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j9 : this.subheadContentColor, (j10 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j10 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j10 : this.navigationContentColor, (j11 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j11 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j11 : this.yearContentColor, (j12 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j12 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j12 : this.disabledYearContentColor, (j13 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j13 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j13 : this.currentYearContentColor, (j14 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j14 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j14 : this.selectedYearContentColor, (j15 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j15 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j15 : this.disabledSelectedYearContentColor, (j16 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j16 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j16 : this.selectedYearContainerColor, (j17 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j17 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j17 : this.disabledSelectedYearContainerColor, (j18 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j18 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j18 : this.dayContentColor, (j19 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j19 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j19 : this.disabledDayContentColor, (j20 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j20 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j20 : this.selectedDayContentColor, (j21 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j21 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j21 : this.disabledSelectedDayContentColor, (j22 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j22 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j22 : this.selectedDayContainerColor, (j23 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j23 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j23 : this.disabledSelectedDayContainerColor, (j24 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j24 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j24 : this.todayContentColor, (j25 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j25 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j25 : this.todayDateBorderColor, (j26 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j26 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j26 : this.dayInSelectionRangeContainerColor, (j27 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j27 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j27 : this.dayInSelectionRangeContentColor, j28 != companion.m3770getUnspecified0d7_KjU() ? j28 : this.dividerColor, takeOrElse$material3_release(textFieldColors, new DatePickerColors$copy$25(this)), null);
    }

    @p4.l
    @Composable
    public final State<Color> dayContainerColor$material3_release(boolean z4, boolean z5, boolean z6, @p4.m Composer composer, int i5) {
        long m3769getTransparent0d7_KjU;
        State<Color> rememberUpdatedState;
        composer.startReplaceableGroup(-1240482658);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1240482658, i5, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:924)");
        }
        if (z4) {
            if (z5) {
                m3769getTransparent0d7_KjU = this.selectedDayContainerColor;
            } else {
                m3769getTransparent0d7_KjU = this.disabledSelectedDayContainerColor;
            }
        } else {
            m3769getTransparent0d7_KjU = Color.Companion.m3769getTransparent0d7_KjU();
        }
        long j5 = m3769getTransparent0d7_KjU;
        if (z6) {
            composer.startReplaceableGroup(1577421952);
            rememberUpdatedState = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(j5, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1577422116);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @p4.l
    @Composable
    public final State<Color> dayContentColor$material3_release(boolean z4, boolean z5, boolean z6, boolean z7, @p4.m Composer composer, int i5) {
        long j5;
        State<Color> m96animateColorAsStateeuL9pac;
        composer.startReplaceableGroup(-1233694918);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1233694918, i5, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:890)");
        }
        if (z5 && z7) {
            j5 = this.selectedDayContentColor;
        } else if (z5 && !z7) {
            j5 = this.disabledSelectedDayContentColor;
        } else if (z6 && z7) {
            j5 = this.dayInSelectionRangeContentColor;
        } else if (z6 && !z7) {
            j5 = this.disabledDayContentColor;
        } else if (z4) {
            j5 = this.todayContentColor;
        } else if (z7) {
            j5 = this.dayContentColor;
        } else {
            j5 = this.disabledDayContentColor;
        }
        long j6 = j5;
        if (z6) {
            composer.startReplaceableGroup(379022200);
            m96animateColorAsStateeuL9pac = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j6), composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(379022258);
            m96animateColorAsStateeuL9pac = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(j6, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m96animateColorAsStateeuL9pac;
    }

    public boolean equals(@p4.m Object obj) {
        if (!(obj instanceof DatePickerColors)) {
            return false;
        }
        DatePickerColors datePickerColors = (DatePickerColors) obj;
        if (!Color.m3735equalsimpl0(this.containerColor, datePickerColors.containerColor) || !Color.m3735equalsimpl0(this.titleContentColor, datePickerColors.titleContentColor) || !Color.m3735equalsimpl0(this.headlineContentColor, datePickerColors.headlineContentColor) || !Color.m3735equalsimpl0(this.weekdayContentColor, datePickerColors.weekdayContentColor) || !Color.m3735equalsimpl0(this.subheadContentColor, datePickerColors.subheadContentColor) || !Color.m3735equalsimpl0(this.yearContentColor, datePickerColors.yearContentColor) || !Color.m3735equalsimpl0(this.disabledYearContentColor, datePickerColors.disabledYearContentColor) || !Color.m3735equalsimpl0(this.currentYearContentColor, datePickerColors.currentYearContentColor) || !Color.m3735equalsimpl0(this.selectedYearContentColor, datePickerColors.selectedYearContentColor) || !Color.m3735equalsimpl0(this.disabledSelectedYearContentColor, datePickerColors.disabledSelectedYearContentColor) || !Color.m3735equalsimpl0(this.selectedYearContainerColor, datePickerColors.selectedYearContainerColor) || !Color.m3735equalsimpl0(this.disabledSelectedYearContainerColor, datePickerColors.disabledSelectedYearContainerColor) || !Color.m3735equalsimpl0(this.dayContentColor, datePickerColors.dayContentColor) || !Color.m3735equalsimpl0(this.disabledDayContentColor, datePickerColors.disabledDayContentColor) || !Color.m3735equalsimpl0(this.selectedDayContentColor, datePickerColors.selectedDayContentColor) || !Color.m3735equalsimpl0(this.disabledSelectedDayContentColor, datePickerColors.disabledSelectedDayContentColor) || !Color.m3735equalsimpl0(this.selectedDayContainerColor, datePickerColors.selectedDayContainerColor) || !Color.m3735equalsimpl0(this.disabledSelectedDayContainerColor, datePickerColors.disabledSelectedDayContainerColor) || !Color.m3735equalsimpl0(this.todayContentColor, datePickerColors.todayContentColor) || !Color.m3735equalsimpl0(this.todayDateBorderColor, datePickerColors.todayDateBorderColor) || !Color.m3735equalsimpl0(this.dayInSelectionRangeContainerColor, datePickerColors.dayInSelectionRangeContainerColor) || !Color.m3735equalsimpl0(this.dayInSelectionRangeContentColor, datePickerColors.dayInSelectionRangeContentColor)) {
            return false;
        }
        return true;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1777getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getCurrentYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m1778getCurrentYearContentColor0d7_KjU() {
        return this.currentYearContentColor;
    }

    @p4.l
    public final TextFieldColors getDateTextFieldColors() {
        return this.dateTextFieldColors;
    }

    /* renamed from: getDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m1779getDayContentColor0d7_KjU() {
        return this.dayContentColor;
    }

    /* renamed from: getDayInSelectionRangeContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1780getDayInSelectionRangeContainerColor0d7_KjU() {
        return this.dayInSelectionRangeContainerColor;
    }

    /* renamed from: getDayInSelectionRangeContentColor-0d7_KjU, reason: not valid java name */
    public final long m1781getDayInSelectionRangeContentColor0d7_KjU() {
        return this.dayInSelectionRangeContentColor;
    }

    /* renamed from: getDisabledDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m1782getDisabledDayContentColor0d7_KjU() {
        return this.disabledDayContentColor;
    }

    /* renamed from: getDisabledSelectedDayContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1783getDisabledSelectedDayContainerColor0d7_KjU() {
        return this.disabledSelectedDayContainerColor;
    }

    /* renamed from: getDisabledSelectedDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m1784getDisabledSelectedDayContentColor0d7_KjU() {
        return this.disabledSelectedDayContentColor;
    }

    /* renamed from: getDisabledSelectedYearContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1785getDisabledSelectedYearContainerColor0d7_KjU() {
        return this.disabledSelectedYearContainerColor;
    }

    /* renamed from: getDisabledSelectedYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m1786getDisabledSelectedYearContentColor0d7_KjU() {
        return this.disabledSelectedYearContentColor;
    }

    /* renamed from: getDisabledYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m1787getDisabledYearContentColor0d7_KjU() {
        return this.disabledYearContentColor;
    }

    /* renamed from: getDividerColor-0d7_KjU, reason: not valid java name */
    public final long m1788getDividerColor0d7_KjU() {
        return this.dividerColor;
    }

    /* renamed from: getHeadlineContentColor-0d7_KjU, reason: not valid java name */
    public final long m1789getHeadlineContentColor0d7_KjU() {
        return this.headlineContentColor;
    }

    /* renamed from: getNavigationContentColor-0d7_KjU, reason: not valid java name */
    public final long m1790getNavigationContentColor0d7_KjU() {
        return this.navigationContentColor;
    }

    /* renamed from: getSelectedDayContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1791getSelectedDayContainerColor0d7_KjU() {
        return this.selectedDayContainerColor;
    }

    /* renamed from: getSelectedDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m1792getSelectedDayContentColor0d7_KjU() {
        return this.selectedDayContentColor;
    }

    /* renamed from: getSelectedYearContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1793getSelectedYearContainerColor0d7_KjU() {
        return this.selectedYearContainerColor;
    }

    /* renamed from: getSelectedYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m1794getSelectedYearContentColor0d7_KjU() {
        return this.selectedYearContentColor;
    }

    /* renamed from: getSubheadContentColor-0d7_KjU, reason: not valid java name */
    public final long m1795getSubheadContentColor0d7_KjU() {
        return this.subheadContentColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m1796getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    /* renamed from: getTodayContentColor-0d7_KjU, reason: not valid java name */
    public final long m1797getTodayContentColor0d7_KjU() {
        return this.todayContentColor;
    }

    /* renamed from: getTodayDateBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1798getTodayDateBorderColor0d7_KjU() {
        return this.todayDateBorderColor;
    }

    /* renamed from: getWeekdayContentColor-0d7_KjU, reason: not valid java name */
    public final long m1799getWeekdayContentColor0d7_KjU() {
        return this.weekdayContentColor;
    }

    /* renamed from: getYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m1800getYearContentColor0d7_KjU() {
        return this.yearContentColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Color.m3741hashCodeimpl(this.containerColor) * 31) + Color.m3741hashCodeimpl(this.titleContentColor)) * 31) + Color.m3741hashCodeimpl(this.headlineContentColor)) * 31) + Color.m3741hashCodeimpl(this.weekdayContentColor)) * 31) + Color.m3741hashCodeimpl(this.subheadContentColor)) * 31) + Color.m3741hashCodeimpl(this.yearContentColor)) * 31) + Color.m3741hashCodeimpl(this.disabledYearContentColor)) * 31) + Color.m3741hashCodeimpl(this.currentYearContentColor)) * 31) + Color.m3741hashCodeimpl(this.selectedYearContentColor)) * 31) + Color.m3741hashCodeimpl(this.disabledSelectedYearContentColor)) * 31) + Color.m3741hashCodeimpl(this.selectedYearContainerColor)) * 31) + Color.m3741hashCodeimpl(this.disabledSelectedYearContainerColor)) * 31) + Color.m3741hashCodeimpl(this.dayContentColor)) * 31) + Color.m3741hashCodeimpl(this.disabledDayContentColor)) * 31) + Color.m3741hashCodeimpl(this.selectedDayContentColor)) * 31) + Color.m3741hashCodeimpl(this.disabledSelectedDayContentColor)) * 31) + Color.m3741hashCodeimpl(this.selectedDayContainerColor)) * 31) + Color.m3741hashCodeimpl(this.disabledSelectedDayContainerColor)) * 31) + Color.m3741hashCodeimpl(this.todayContentColor)) * 31) + Color.m3741hashCodeimpl(this.todayDateBorderColor)) * 31) + Color.m3741hashCodeimpl(this.dayInSelectionRangeContainerColor)) * 31) + Color.m3741hashCodeimpl(this.dayInSelectionRangeContentColor);
    }

    @p4.l
    public final TextFieldColors takeOrElse$material3_release(@p4.m TextFieldColors textFieldColors, @p4.l v3.a<TextFieldColors> aVar) {
        return textFieldColors == null ? aVar.invoke() : textFieldColors;
    }

    @p4.l
    @Composable
    public final State<Color> yearContainerColor$material3_release(boolean z4, boolean z5, @p4.m Composer composer, int i5) {
        long m3769getTransparent0d7_KjU;
        composer.startReplaceableGroup(-1306331107);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1306331107, i5, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:974)");
        }
        if (z4) {
            if (z5) {
                m3769getTransparent0d7_KjU = this.selectedYearContainerColor;
            } else {
                m3769getTransparent0d7_KjU = this.disabledSelectedYearContainerColor;
            }
        } else {
            m3769getTransparent0d7_KjU = Color.Companion.m3769getTransparent0d7_KjU();
        }
        State<Color> m96animateColorAsStateeuL9pac = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(m3769getTransparent0d7_KjU, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m96animateColorAsStateeuL9pac;
    }

    @p4.l
    @Composable
    public final State<Color> yearContentColor$material3_release(boolean z4, boolean z5, boolean z6, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(874111097);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(874111097, i5, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:952)");
        }
        if (z5 && z6) {
            j5 = this.selectedYearContentColor;
        } else if (z5 && !z6) {
            j5 = this.disabledSelectedYearContentColor;
        } else if (z4) {
            j5 = this.currentYearContentColor;
        } else if (z6) {
            j5 = this.yearContentColor;
        } else {
            j5 = this.disabledYearContentColor;
        }
        State<Color> m96animateColorAsStateeuL9pac = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(j5, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m96animateColorAsStateeuL9pac;
    }
}
