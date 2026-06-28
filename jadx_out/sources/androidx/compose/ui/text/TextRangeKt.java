package androidx.compose.ui.text;

import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.s;
import p4.l;

@i0(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0004\u001a\u0013\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u001a\u001b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a$\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"TextRange", "Landroidx/compose/ui/text/TextRange;", "index", "", "(I)J", "start", "end", "(II)J", "packWithCheck", "", "coerceIn", "minimumValue", "maximumValue", "coerceIn-8ffj60Q", "(JII)J", "substring", "", "", "range", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,129:1\n48#2:130\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n127#1:130\n*E\n"})
/* loaded from: classes.dex */
public final class TextRangeKt {
    public static final long TextRange(int i5, int i6) {
        return TextRange.m5534constructorimpl(packWithCheck(i5, i6));
    }

    /* renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m5551coerceIn8ffj60Q(long j5, int i5, int i6) {
        int I = s.I(TextRange.m5545getStartimpl(j5), i5, i6);
        int I2 = s.I(TextRange.m5540getEndimpl(j5), i5, i6);
        if (I == TextRange.m5545getStartimpl(j5) && I2 == TextRange.m5540getEndimpl(j5)) {
            return j5;
        }
        return TextRange(I, I2);
    }

    private static final long packWithCheck(int i5, int i6) {
        boolean z4;
        boolean z5 = true;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i6 < 0) {
                z5 = false;
            }
            if (z5) {
                return (i6 & 4294967295L) | (i5 << 32);
            }
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i5 + ", end: " + i6 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i5 + ", end: " + i6 + ']').toString());
    }

    @l
    /* renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m5552substringFDrldGo(@l CharSequence charSequence, long j5) {
        return charSequence.subSequence(TextRange.m5543getMinimpl(j5), TextRange.m5542getMaximpl(j5)).toString();
    }

    public static final long TextRange(int i5) {
        return TextRange(i5, i5);
    }
}
