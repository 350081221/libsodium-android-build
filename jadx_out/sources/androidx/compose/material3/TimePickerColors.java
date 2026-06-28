package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@ExperimentalMaterial3Api
@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\u009c\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017J\u001d\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0017J\u001d\u0010 \u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0017J\u0013\u0010\"\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010$\u001a\u00020#H\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b(\u0010'R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b)\u0010'R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b*\u0010'R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b+\u0010'R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b,\u0010'R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b-\u0010'R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b.\u0010'R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b/\u0010'R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b0\u0010'R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b1\u0010'R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b2\u0010'R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b3\u0010'R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b4\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00067"}, d2 = {"Landroidx/compose/material3/TimePickerColors;", "", "Landroidx/compose/ui/graphics/Color;", "clockDialColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "copy-dVHXu7A", "(JJJJJJJJJJJJJJ)Landroidx/compose/material3/TimePickerColors;", "copy", "", "selected", "periodSelectorContainerColor-vNxB06k$material3_release", "(Z)J", "periodSelectorContainerColor", "periodSelectorContentColor-vNxB06k$material3_release", "periodSelectorContentColor", "timeSelectorContainerColor-vNxB06k$material3_release", "timeSelectorContainerColor", "timeSelectorContentColor-vNxB06k$material3_release", "timeSelectorContentColor", "clockDialContentColor-vNxB06k$material3_release", "clockDialContentColor", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "getClockDialColor-0d7_KjU", "()J", "getSelectorColor-0d7_KjU", "getContainerColor-0d7_KjU", "getPeriodSelectorBorderColor-0d7_KjU", "getClockDialSelectedContentColor-0d7_KjU", "getClockDialUnselectedContentColor-0d7_KjU", "getPeriodSelectorSelectedContainerColor-0d7_KjU", "getPeriodSelectorUnselectedContainerColor-0d7_KjU", "getPeriodSelectorSelectedContentColor-0d7_KjU", "getPeriodSelectorUnselectedContentColor-0d7_KjU", "getTimeSelectorSelectedContainerColor-0d7_KjU", "getTimeSelectorUnselectedContainerColor-0d7_KjU", "getTimeSelectorSelectedContentColor-0d7_KjU", "getTimeSelectorUnselectedContentColor-0d7_KjU", "<init>", "(JJJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1843:1\n658#2:1844\n646#2:1845\n658#2:1846\n646#2:1847\n658#2:1848\n646#2:1849\n658#2:1850\n646#2:1851\n658#2:1852\n646#2:1853\n658#2:1854\n646#2:1855\n658#2:1856\n646#2:1857\n658#2:1858\n646#2:1859\n658#2:1860\n646#2:1861\n658#2:1862\n646#2:1863\n658#2:1864\n646#2:1865\n658#2:1866\n646#2:1867\n658#2:1868\n646#2:1869\n658#2:1870\n646#2:1871\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerColors\n*L\n432#1:1844\n432#1:1845\n433#1:1846\n433#1:1847\n434#1:1848\n434#1:1849\n435#1:1850\n435#1:1851\n436#1:1852\n436#1:1853\n437#1:1854\n437#1:1855\n439#1:1856\n439#1:1857\n441#1:1858\n441#1:1859\n442#1:1860\n442#1:1861\n444#1:1862\n444#1:1863\n445#1:1864\n445#1:1865\n447#1:1866\n447#1:1867\n448#1:1868\n448#1:1869\n449#1:1870\n449#1:1871\n*E\n"})
/* loaded from: classes.dex */
public final class TimePickerColors {
    public static final int $stable = 0;
    private final long clockDialColor;
    private final long clockDialSelectedContentColor;
    private final long clockDialUnselectedContentColor;
    private final long containerColor;
    private final long periodSelectorBorderColor;
    private final long periodSelectorSelectedContainerColor;
    private final long periodSelectorSelectedContentColor;
    private final long periodSelectorUnselectedContainerColor;
    private final long periodSelectorUnselectedContentColor;
    private final long selectorColor;
    private final long timeSelectorSelectedContainerColor;
    private final long timeSelectorSelectedContentColor;
    private final long timeSelectorUnselectedContainerColor;
    private final long timeSelectorUnselectedContentColor;

    private TimePickerColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.clockDialColor = j5;
        this.selectorColor = j6;
        this.containerColor = j7;
        this.periodSelectorBorderColor = j8;
        this.clockDialSelectedContentColor = j9;
        this.clockDialUnselectedContentColor = j10;
        this.periodSelectorSelectedContainerColor = j11;
        this.periodSelectorUnselectedContainerColor = j12;
        this.periodSelectorSelectedContentColor = j13;
        this.periodSelectorUnselectedContentColor = j14;
        this.timeSelectorSelectedContainerColor = j15;
        this.timeSelectorUnselectedContainerColor = j16;
        this.timeSelectorSelectedContentColor = j17;
        this.timeSelectorUnselectedContentColor = j18;
    }

    public /* synthetic */ TimePickerColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18);
    }

    /* renamed from: copy-dVHXu7A$default, reason: not valid java name */
    public static /* synthetic */ TimePickerColors m2455copydVHXu7A$default(TimePickerColors timePickerColors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, int i5, Object obj) {
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
        long j29;
        long j30;
        long j31;
        long j32;
        if ((i5 & 1) != 0) {
            j19 = timePickerColors.containerColor;
        } else {
            j19 = j5;
        }
        if ((i5 & 2) != 0) {
            j20 = timePickerColors.selectorColor;
        } else {
            j20 = j6;
        }
        if ((i5 & 4) != 0) {
            j21 = timePickerColors.containerColor;
        } else {
            j21 = j7;
        }
        if ((i5 & 8) != 0) {
            j22 = timePickerColors.periodSelectorBorderColor;
        } else {
            j22 = j8;
        }
        if ((i5 & 16) != 0) {
            j23 = timePickerColors.clockDialSelectedContentColor;
        } else {
            j23 = j9;
        }
        if ((i5 & 32) != 0) {
            j24 = timePickerColors.clockDialUnselectedContentColor;
        } else {
            j24 = j10;
        }
        if ((i5 & 64) != 0) {
            j25 = timePickerColors.periodSelectorSelectedContainerColor;
        } else {
            j25 = j11;
        }
        long j33 = j25;
        if ((i5 & 128) != 0) {
            j26 = timePickerColors.periodSelectorUnselectedContainerColor;
        } else {
            j26 = j12;
        }
        long j34 = j26;
        if ((i5 & 256) != 0) {
            j27 = timePickerColors.periodSelectorSelectedContentColor;
        } else {
            j27 = j13;
        }
        long j35 = j27;
        if ((i5 & 512) != 0) {
            j28 = timePickerColors.periodSelectorUnselectedContentColor;
        } else {
            j28 = j14;
        }
        long j36 = j28;
        if ((i5 & 1024) != 0) {
            j29 = timePickerColors.timeSelectorSelectedContainerColor;
        } else {
            j29 = j15;
        }
        long j37 = j29;
        if ((i5 & 2048) != 0) {
            j30 = timePickerColors.timeSelectorUnselectedContainerColor;
        } else {
            j30 = j16;
        }
        long j38 = j30;
        if ((i5 & 4096) != 0) {
            j31 = timePickerColors.timeSelectorSelectedContentColor;
        } else {
            j31 = j17;
        }
        long j39 = j31;
        if ((i5 & 8192) != 0) {
            j32 = timePickerColors.timeSelectorUnselectedContentColor;
        } else {
            j32 = j18;
        }
        return timePickerColors.m2457copydVHXu7A(j19, j20, j21, j22, j23, j24, j33, j34, j35, j36, j37, j38, j39, j32);
    }

    @Stable
    /* renamed from: clockDialContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2456clockDialContentColorvNxB06k$material3_release(boolean z4) {
        if (z4) {
            return this.clockDialSelectedContentColor;
        }
        return this.clockDialUnselectedContentColor;
    }

    @p4.l
    /* renamed from: copy-dVHXu7A, reason: not valid java name */
    public final TimePickerColors m2457copydVHXu7A(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        boolean z4;
        long j19;
        boolean z5;
        long j20;
        boolean z6;
        long j21;
        boolean z7;
        long j22;
        boolean z8;
        long j23;
        boolean z9;
        long j24;
        boolean z10;
        long j25;
        boolean z11;
        long j26;
        boolean z12;
        long j27;
        boolean z13;
        long j28;
        boolean z14;
        long j29;
        boolean z15;
        long j30;
        boolean z16;
        long j31;
        long j32;
        Color.Companion companion = Color.Companion;
        boolean z17 = true;
        if (j5 != companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            j19 = j5;
        } else {
            j19 = this.clockDialColor;
        }
        if (j6 != companion.m3770getUnspecified0d7_KjU()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            j20 = j6;
        } else {
            j20 = this.selectorColor;
        }
        if (j7 != companion.m3770getUnspecified0d7_KjU()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            j21 = j7;
        } else {
            j21 = this.containerColor;
        }
        if (j8 != companion.m3770getUnspecified0d7_KjU()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            j22 = j8;
        } else {
            j22 = this.periodSelectorBorderColor;
        }
        if (j9 != companion.m3770getUnspecified0d7_KjU()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            j23 = j9;
        } else {
            j23 = this.clockDialSelectedContentColor;
        }
        if (j10 != companion.m3770getUnspecified0d7_KjU()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            j24 = j10;
        } else {
            j24 = this.clockDialUnselectedContentColor;
        }
        if (j11 != companion.m3770getUnspecified0d7_KjU()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j25 = j11;
        } else {
            j25 = this.periodSelectorSelectedContainerColor;
        }
        if (j12 != companion.m3770getUnspecified0d7_KjU()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            j26 = j12;
        } else {
            j26 = this.periodSelectorUnselectedContainerColor;
        }
        if (j13 != companion.m3770getUnspecified0d7_KjU()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            j27 = j13;
        } else {
            j27 = this.periodSelectorSelectedContentColor;
        }
        if (j14 != companion.m3770getUnspecified0d7_KjU()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            j28 = j14;
        } else {
            j28 = this.periodSelectorUnselectedContentColor;
        }
        if (j15 != companion.m3770getUnspecified0d7_KjU()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            j29 = j15;
        } else {
            j29 = this.timeSelectorSelectedContainerColor;
        }
        if (j16 != companion.m3770getUnspecified0d7_KjU()) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15) {
            j30 = j16;
        } else {
            j30 = this.timeSelectorUnselectedContainerColor;
        }
        if (j17 != companion.m3770getUnspecified0d7_KjU()) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16) {
            j31 = j17;
        } else {
            j31 = this.timeSelectorSelectedContentColor;
        }
        if (j18 == companion.m3770getUnspecified0d7_KjU()) {
            z17 = false;
        }
        if (z17) {
            j32 = j18;
        } else {
            j32 = this.timeSelectorUnselectedContentColor;
        }
        return new TimePickerColors(j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TimePickerColors.class != obj.getClass()) {
            return false;
        }
        TimePickerColors timePickerColors = (TimePickerColors) obj;
        if (Color.m3735equalsimpl0(this.clockDialColor, timePickerColors.clockDialColor) && Color.m3735equalsimpl0(this.selectorColor, timePickerColors.selectorColor) && Color.m3735equalsimpl0(this.containerColor, timePickerColors.containerColor) && Color.m3735equalsimpl0(this.periodSelectorBorderColor, timePickerColors.periodSelectorBorderColor) && Color.m3735equalsimpl0(this.periodSelectorSelectedContainerColor, timePickerColors.periodSelectorSelectedContainerColor) && Color.m3735equalsimpl0(this.periodSelectorUnselectedContainerColor, timePickerColors.periodSelectorUnselectedContainerColor) && Color.m3735equalsimpl0(this.periodSelectorSelectedContentColor, timePickerColors.periodSelectorSelectedContentColor) && Color.m3735equalsimpl0(this.periodSelectorUnselectedContentColor, timePickerColors.periodSelectorUnselectedContentColor) && Color.m3735equalsimpl0(this.timeSelectorSelectedContainerColor, timePickerColors.timeSelectorSelectedContainerColor) && Color.m3735equalsimpl0(this.timeSelectorUnselectedContainerColor, timePickerColors.timeSelectorUnselectedContainerColor) && Color.m3735equalsimpl0(this.timeSelectorSelectedContentColor, timePickerColors.timeSelectorSelectedContentColor) && Color.m3735equalsimpl0(this.timeSelectorUnselectedContentColor, timePickerColors.timeSelectorUnselectedContentColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getClockDialColor-0d7_KjU, reason: not valid java name */
    public final long m2458getClockDialColor0d7_KjU() {
        return this.clockDialColor;
    }

    /* renamed from: getClockDialSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2459getClockDialSelectedContentColor0d7_KjU() {
        return this.clockDialSelectedContentColor;
    }

    /* renamed from: getClockDialUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2460getClockDialUnselectedContentColor0d7_KjU() {
        return this.clockDialUnselectedContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2461getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getPeriodSelectorBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2462getPeriodSelectorBorderColor0d7_KjU() {
        return this.periodSelectorBorderColor;
    }

    /* renamed from: getPeriodSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2463getPeriodSelectorSelectedContainerColor0d7_KjU() {
        return this.periodSelectorSelectedContainerColor;
    }

    /* renamed from: getPeriodSelectorSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2464getPeriodSelectorSelectedContentColor0d7_KjU() {
        return this.periodSelectorSelectedContentColor;
    }

    /* renamed from: getPeriodSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2465getPeriodSelectorUnselectedContainerColor0d7_KjU() {
        return this.periodSelectorUnselectedContainerColor;
    }

    /* renamed from: getPeriodSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2466getPeriodSelectorUnselectedContentColor0d7_KjU() {
        return this.periodSelectorUnselectedContentColor;
    }

    /* renamed from: getSelectorColor-0d7_KjU, reason: not valid java name */
    public final long m2467getSelectorColor0d7_KjU() {
        return this.selectorColor;
    }

    /* renamed from: getTimeSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2468getTimeSelectorSelectedContainerColor0d7_KjU() {
        return this.timeSelectorSelectedContainerColor;
    }

    /* renamed from: getTimeSelectorSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2469getTimeSelectorSelectedContentColor0d7_KjU() {
        return this.timeSelectorSelectedContentColor;
    }

    /* renamed from: getTimeSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2470getTimeSelectorUnselectedContainerColor0d7_KjU() {
        return this.timeSelectorUnselectedContainerColor;
    }

    /* renamed from: getTimeSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2471getTimeSelectorUnselectedContentColor0d7_KjU() {
        return this.timeSelectorUnselectedContentColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m3741hashCodeimpl(this.clockDialColor) * 31) + Color.m3741hashCodeimpl(this.selectorColor)) * 31) + Color.m3741hashCodeimpl(this.containerColor)) * 31) + Color.m3741hashCodeimpl(this.periodSelectorBorderColor)) * 31) + Color.m3741hashCodeimpl(this.periodSelectorSelectedContainerColor)) * 31) + Color.m3741hashCodeimpl(this.periodSelectorUnselectedContainerColor)) * 31) + Color.m3741hashCodeimpl(this.periodSelectorSelectedContentColor)) * 31) + Color.m3741hashCodeimpl(this.periodSelectorUnselectedContentColor)) * 31) + Color.m3741hashCodeimpl(this.timeSelectorSelectedContainerColor)) * 31) + Color.m3741hashCodeimpl(this.timeSelectorUnselectedContainerColor)) * 31) + Color.m3741hashCodeimpl(this.timeSelectorSelectedContentColor)) * 31) + Color.m3741hashCodeimpl(this.timeSelectorUnselectedContentColor);
    }

    @Stable
    /* renamed from: periodSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2472periodSelectorContainerColorvNxB06k$material3_release(boolean z4) {
        if (z4) {
            return this.periodSelectorSelectedContainerColor;
        }
        return this.periodSelectorUnselectedContainerColor;
    }

    @Stable
    /* renamed from: periodSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2473periodSelectorContentColorvNxB06k$material3_release(boolean z4) {
        if (z4) {
            return this.periodSelectorSelectedContentColor;
        }
        return this.periodSelectorUnselectedContentColor;
    }

    @Stable
    /* renamed from: timeSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2474timeSelectorContainerColorvNxB06k$material3_release(boolean z4) {
        if (z4) {
            return this.timeSelectorSelectedContainerColor;
        }
        return this.timeSelectorUnselectedContainerColor;
    }

    @Stable
    /* renamed from: timeSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2475timeSelectorContentColorvNxB06k$material3_release(boolean z4) {
        if (z4) {
            return this.timeSelectorSelectedContentColor;
        }
        return this.timeSelectorUnselectedContentColor;
    }
}
