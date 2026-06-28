package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000(\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0001H\u0086\b\u001a%\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086\n\u001a\u001d\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0086\n¨\u0006\r"}, d2 = {"", "Landroid/text/Spannable;", "toSpannable", "Lkotlin/r2;", "clearSpans", "", "start", "end", "", "span", "set", "Lkotlin/ranges/l;", "range", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSpannableString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n31#2,4:67\n13579#3,2:71\n*S KotlinDebug\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n*L\n32#1:67,4\n32#1:71,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SpannableStringKt {
    public static final void clearSpans(@p4.l Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(@p4.l Spannable spannable, int i5, int i6, @p4.l Object obj) {
        spannable.setSpan(obj, i5, i6, 17);
    }

    @p4.l
    public static final Spannable toSpannable(@p4.l CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }

    public static final void set(@p4.l Spannable spannable, @p4.l kotlin.ranges.l lVar, @p4.l Object obj) {
        spannable.setSpan(obj, lVar.getStart().intValue(), lVar.getEndInclusive().intValue(), 17);
    }
}
