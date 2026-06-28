package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b8\u00109J°\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ%\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ%\u0010!\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u001aJ\u0013\u0010#\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010%\u001a\u00020$H\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b)\u0010(R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b*\u0010(R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b+\u0010(R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b,\u0010(R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b-\u0010(R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b.\u0010(R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b/\u0010(R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b0\u0010(R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b1\u0010(R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b2\u0010(R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b3\u0010(R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b4\u0010(R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b5\u0010(R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b6\u0010(R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b7\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Landroidx/compose/material3/SwitchColors;", "", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "copy-Q_H9qLU", "(JJJJJJJJJJJJJJJJ)Landroidx/compose/material3/SwitchColors;", "copy", "", "enabled", "checked", "thumbColor-WaAFU9c$material3_release", "(ZZ)J", "thumbColor", "trackColor-WaAFU9c$material3_release", "trackColor", "borderColor-WaAFU9c$material3_release", "borderColor", "iconColor-WaAFU9c$material3_release", "iconColor", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "getCheckedThumbColor-0d7_KjU", "()J", "getCheckedTrackColor-0d7_KjU", "getCheckedBorderColor-0d7_KjU", "getCheckedIconColor-0d7_KjU", "getUncheckedThumbColor-0d7_KjU", "getUncheckedTrackColor-0d7_KjU", "getUncheckedBorderColor-0d7_KjU", "getUncheckedIconColor-0d7_KjU", "getDisabledCheckedThumbColor-0d7_KjU", "getDisabledCheckedTrackColor-0d7_KjU", "getDisabledCheckedBorderColor-0d7_KjU", "getDisabledCheckedIconColor-0d7_KjU", "getDisabledUncheckedThumbColor-0d7_KjU", "getDisabledUncheckedTrackColor-0d7_KjU", "getDisabledUncheckedBorderColor-0d7_KjU", "getDisabledUncheckedIconColor-0d7_KjU", "<init>", "(JJJJJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,573:1\n658#2:574\n646#2:575\n658#2:576\n646#2:577\n658#2:578\n646#2:579\n658#2:580\n646#2:581\n658#2:582\n646#2:583\n658#2:584\n646#2:585\n658#2:586\n646#2:587\n658#2:588\n646#2:589\n658#2:590\n646#2:591\n658#2:592\n646#2:593\n658#2:594\n646#2:595\n658#2:596\n646#2:597\n658#2:598\n646#2:599\n658#2:600\n646#2:601\n658#2:602\n646#2:603\n658#2:604\n646#2:605\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchColors\n*L\n455#1:574\n455#1:575\n456#1:576\n456#1:577\n457#1:578\n457#1:579\n458#1:580\n458#1:581\n459#1:582\n459#1:583\n460#1:584\n460#1:585\n461#1:586\n461#1:587\n462#1:588\n462#1:589\n463#1:590\n463#1:591\n464#1:592\n464#1:593\n465#1:594\n465#1:595\n466#1:596\n466#1:597\n467#1:598\n467#1:599\n468#1:600\n468#1:601\n469#1:602\n469#1:603\n470#1:604\n470#1:605\n*E\n"})
/* loaded from: classes.dex */
public final class SwitchColors {
    public static final int $stable = 0;
    private final long checkedBorderColor;
    private final long checkedIconColor;
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedBorderColor;
    private final long disabledCheckedIconColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedIconColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final long uncheckedBorderColor;
    private final long uncheckedIconColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    private SwitchColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        this.checkedThumbColor = j5;
        this.checkedTrackColor = j6;
        this.checkedBorderColor = j7;
        this.checkedIconColor = j8;
        this.uncheckedThumbColor = j9;
        this.uncheckedTrackColor = j10;
        this.uncheckedBorderColor = j11;
        this.uncheckedIconColor = j12;
        this.disabledCheckedThumbColor = j13;
        this.disabledCheckedTrackColor = j14;
        this.disabledCheckedBorderColor = j15;
        this.disabledCheckedIconColor = j16;
        this.disabledUncheckedThumbColor = j17;
        this.disabledUncheckedTrackColor = j18;
        this.disabledUncheckedBorderColor = j19;
        this.disabledUncheckedIconColor = j20;
    }

    public /* synthetic */ SwitchColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20);
    }

    @Stable
    /* renamed from: borderColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2314borderColorWaAFU9c$material3_release(boolean z4, boolean z5) {
        if (z4) {
            if (z5) {
                return this.checkedBorderColor;
            }
            return this.uncheckedBorderColor;
        }
        if (z5) {
            return this.disabledCheckedBorderColor;
        }
        return this.disabledUncheckedBorderColor;
    }

    @p4.l
    /* renamed from: copy-Q_H9qLU, reason: not valid java name */
    public final SwitchColors m2315copyQ_H9qLU(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        boolean z4;
        long j21;
        boolean z5;
        long j22;
        boolean z6;
        long j23;
        boolean z7;
        long j24;
        boolean z8;
        long j25;
        boolean z9;
        long j26;
        boolean z10;
        long j27;
        boolean z11;
        long j28;
        boolean z12;
        long j29;
        boolean z13;
        long j30;
        boolean z14;
        long j31;
        boolean z15;
        long j32;
        boolean z16;
        long j33;
        boolean z17;
        long j34;
        boolean z18;
        long j35;
        long j36;
        Color.Companion companion = Color.Companion;
        boolean z19 = true;
        if (j5 != companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            j21 = j5;
        } else {
            j21 = this.checkedThumbColor;
        }
        if (j6 != companion.m3770getUnspecified0d7_KjU()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            j22 = j6;
        } else {
            j22 = this.checkedTrackColor;
        }
        if (j7 != companion.m3770getUnspecified0d7_KjU()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            j23 = j7;
        } else {
            j23 = this.checkedBorderColor;
        }
        if (j8 != companion.m3770getUnspecified0d7_KjU()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            j24 = j8;
        } else {
            j24 = this.checkedIconColor;
        }
        if (j9 != companion.m3770getUnspecified0d7_KjU()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            j25 = j9;
        } else {
            j25 = this.uncheckedThumbColor;
        }
        if (j10 != companion.m3770getUnspecified0d7_KjU()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            j26 = j10;
        } else {
            j26 = this.uncheckedTrackColor;
        }
        if (j11 != companion.m3770getUnspecified0d7_KjU()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j27 = j11;
        } else {
            j27 = this.uncheckedBorderColor;
        }
        if (j12 != companion.m3770getUnspecified0d7_KjU()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            j28 = j12;
        } else {
            j28 = this.uncheckedIconColor;
        }
        if (j13 != companion.m3770getUnspecified0d7_KjU()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            j29 = j13;
        } else {
            j29 = this.disabledCheckedThumbColor;
        }
        if (j14 != companion.m3770getUnspecified0d7_KjU()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            j30 = j14;
        } else {
            j30 = this.disabledCheckedTrackColor;
        }
        if (j15 != companion.m3770getUnspecified0d7_KjU()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            j31 = j15;
        } else {
            j31 = this.disabledCheckedBorderColor;
        }
        if (j16 != companion.m3770getUnspecified0d7_KjU()) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15) {
            j32 = j16;
        } else {
            j32 = this.disabledCheckedIconColor;
        }
        if (j17 != companion.m3770getUnspecified0d7_KjU()) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16) {
            j33 = j17;
        } else {
            j33 = this.disabledUncheckedThumbColor;
        }
        if (j18 != companion.m3770getUnspecified0d7_KjU()) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            j34 = j18;
        } else {
            j34 = this.disabledUncheckedTrackColor;
        }
        if (j19 != companion.m3770getUnspecified0d7_KjU()) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (z18) {
            j35 = j19;
        } else {
            j35 = this.disabledUncheckedBorderColor;
        }
        if (j20 == companion.m3770getUnspecified0d7_KjU()) {
            z19 = false;
        }
        if (z19) {
            j36 = j20;
        } else {
            j36 = this.disabledUncheckedIconColor;
        }
        return new SwitchColors(j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) obj;
        if (Color.m3735equalsimpl0(this.checkedThumbColor, switchColors.checkedThumbColor) && Color.m3735equalsimpl0(this.checkedTrackColor, switchColors.checkedTrackColor) && Color.m3735equalsimpl0(this.checkedBorderColor, switchColors.checkedBorderColor) && Color.m3735equalsimpl0(this.checkedIconColor, switchColors.checkedIconColor) && Color.m3735equalsimpl0(this.uncheckedThumbColor, switchColors.uncheckedThumbColor) && Color.m3735equalsimpl0(this.uncheckedTrackColor, switchColors.uncheckedTrackColor) && Color.m3735equalsimpl0(this.uncheckedBorderColor, switchColors.uncheckedBorderColor) && Color.m3735equalsimpl0(this.uncheckedIconColor, switchColors.uncheckedIconColor) && Color.m3735equalsimpl0(this.disabledCheckedThumbColor, switchColors.disabledCheckedThumbColor) && Color.m3735equalsimpl0(this.disabledCheckedTrackColor, switchColors.disabledCheckedTrackColor) && Color.m3735equalsimpl0(this.disabledCheckedBorderColor, switchColors.disabledCheckedBorderColor) && Color.m3735equalsimpl0(this.disabledCheckedIconColor, switchColors.disabledCheckedIconColor) && Color.m3735equalsimpl0(this.disabledUncheckedThumbColor, switchColors.disabledUncheckedThumbColor) && Color.m3735equalsimpl0(this.disabledUncheckedTrackColor, switchColors.disabledUncheckedTrackColor) && Color.m3735equalsimpl0(this.disabledUncheckedBorderColor, switchColors.disabledUncheckedBorderColor) && Color.m3735equalsimpl0(this.disabledUncheckedIconColor, switchColors.disabledUncheckedIconColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2316getCheckedBorderColor0d7_KjU() {
        return this.checkedBorderColor;
    }

    /* renamed from: getCheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2317getCheckedIconColor0d7_KjU() {
        return this.checkedIconColor;
    }

    /* renamed from: getCheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2318getCheckedThumbColor0d7_KjU() {
        return this.checkedThumbColor;
    }

    /* renamed from: getCheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2319getCheckedTrackColor0d7_KjU() {
        return this.checkedTrackColor;
    }

    /* renamed from: getDisabledCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2320getDisabledCheckedBorderColor0d7_KjU() {
        return this.disabledCheckedBorderColor;
    }

    /* renamed from: getDisabledCheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2321getDisabledCheckedIconColor0d7_KjU() {
        return this.disabledCheckedIconColor;
    }

    /* renamed from: getDisabledCheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2322getDisabledCheckedThumbColor0d7_KjU() {
        return this.disabledCheckedThumbColor;
    }

    /* renamed from: getDisabledCheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2323getDisabledCheckedTrackColor0d7_KjU() {
        return this.disabledCheckedTrackColor;
    }

    /* renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2324getDisabledUncheckedBorderColor0d7_KjU() {
        return this.disabledUncheckedBorderColor;
    }

    /* renamed from: getDisabledUncheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2325getDisabledUncheckedIconColor0d7_KjU() {
        return this.disabledUncheckedIconColor;
    }

    /* renamed from: getDisabledUncheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2326getDisabledUncheckedThumbColor0d7_KjU() {
        return this.disabledUncheckedThumbColor;
    }

    /* renamed from: getDisabledUncheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2327getDisabledUncheckedTrackColor0d7_KjU() {
        return this.disabledUncheckedTrackColor;
    }

    /* renamed from: getUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2328getUncheckedBorderColor0d7_KjU() {
        return this.uncheckedBorderColor;
    }

    /* renamed from: getUncheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2329getUncheckedIconColor0d7_KjU() {
        return this.uncheckedIconColor;
    }

    /* renamed from: getUncheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2330getUncheckedThumbColor0d7_KjU() {
        return this.uncheckedThumbColor;
    }

    /* renamed from: getUncheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2331getUncheckedTrackColor0d7_KjU() {
        return this.uncheckedTrackColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Color.m3741hashCodeimpl(this.checkedThumbColor) * 31) + Color.m3741hashCodeimpl(this.checkedTrackColor)) * 31) + Color.m3741hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m3741hashCodeimpl(this.checkedIconColor)) * 31) + Color.m3741hashCodeimpl(this.uncheckedThumbColor)) * 31) + Color.m3741hashCodeimpl(this.uncheckedTrackColor)) * 31) + Color.m3741hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m3741hashCodeimpl(this.uncheckedIconColor)) * 31) + Color.m3741hashCodeimpl(this.disabledCheckedThumbColor)) * 31) + Color.m3741hashCodeimpl(this.disabledCheckedTrackColor)) * 31) + Color.m3741hashCodeimpl(this.disabledCheckedBorderColor)) * 31) + Color.m3741hashCodeimpl(this.disabledCheckedIconColor)) * 31) + Color.m3741hashCodeimpl(this.disabledUncheckedThumbColor)) * 31) + Color.m3741hashCodeimpl(this.disabledUncheckedTrackColor)) * 31) + Color.m3741hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m3741hashCodeimpl(this.disabledUncheckedIconColor);
    }

    @Stable
    /* renamed from: iconColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2332iconColorWaAFU9c$material3_release(boolean z4, boolean z5) {
        if (z4) {
            if (z5) {
                return this.checkedIconColor;
            }
            return this.uncheckedIconColor;
        }
        if (z5) {
            return this.disabledCheckedIconColor;
        }
        return this.disabledUncheckedIconColor;
    }

    @Stable
    /* renamed from: thumbColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2333thumbColorWaAFU9c$material3_release(boolean z4, boolean z5) {
        if (z4) {
            if (z5) {
                return this.checkedThumbColor;
            }
            return this.uncheckedThumbColor;
        }
        if (z5) {
            return this.disabledCheckedThumbColor;
        }
        return this.disabledUncheckedThumbColor;
    }

    @Stable
    /* renamed from: trackColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2334trackColorWaAFU9c$material3_release(boolean z4, boolean z5) {
        if (z4) {
            if (z5) {
                return this.checkedTrackColor;
            }
            return this.uncheckedTrackColor;
        }
        if (z5) {
            return this.disabledCheckedTrackColor;
        }
        return this.disabledUncheckedTrackColor;
    }
}
