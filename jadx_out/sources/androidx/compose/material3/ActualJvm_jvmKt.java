package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002\u001a*\u0010\n\u001a\u00020\u0002*\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0000\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*\n\u0010\u000b\"\u00020\f2\u00020\f*\u001e\b\u0000\u0010\r\u001a\u0004\b\u0000\u0010\u000e\"\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\b\u0012\u0004\u0012\u0002H\u000e0\u000f¨\u0006\u0010"}, d2 = {"cachedFormatters", "Ljava/util/WeakHashMap;", "", "Ljava/text/NumberFormat;", "getCachedDateTimeFormatter", "minDigits", "", "maxDigits", "isGroupingUsed", "", "toLocalString", "CalendarLocale", "Ljava/util/Locale;", "InternalAtomicReference", "V", "Ljava/util/concurrent/atomic/AtomicReference;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nActualJvm.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/material3/ActualJvm_jvmKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,70:1\n361#2,7:71\n*S KotlinDebug\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/material3/ActualJvm_jvmKt\n*L\n62#1:71,7\n*E\n"})
/* loaded from: classes.dex */
public final class ActualJvm_jvmKt {

    @p4.l
    private static final WeakHashMap<String, NumberFormat> cachedFormatters = new WeakHashMap<>();

    public static /* synthetic */ void InternalAtomicReference$annotations() {
    }

    private static final NumberFormat getCachedDateTimeFormatter(int i5, int i6, boolean z4) {
        String str = i5 + external.org.apache.commons.lang3.d.f15957a + i6 + external.org.apache.commons.lang3.d.f15957a + z4 + external.org.apache.commons.lang3.d.f15957a + Locale.getDefault().toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = cachedFormatters;
        NumberFormat numberFormat = weakHashMap.get(str);
        if (numberFormat == null) {
            numberFormat = NumberFormat.getIntegerInstance();
            numberFormat.setGroupingUsed(z4);
            numberFormat.setMinimumIntegerDigits(i5);
            numberFormat.setMaximumIntegerDigits(i6);
            weakHashMap.put(str, numberFormat);
        }
        return numberFormat;
    }

    @p4.l
    public static final String toLocalString(int i5, int i6, int i7, boolean z4) {
        return getCachedDateTimeFormatter(i6, i7, z4).format(Integer.valueOf(i5));
    }

    public static /* synthetic */ String toLocalString$default(int i5, int i6, int i7, boolean z4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = 1;
        }
        if ((i8 & 2) != 0) {
            i7 = 40;
        }
        if ((i8 & 4) != 0) {
            z4 = false;
        }
        return toLocalString(i5, i6, i7, z4);
    }
}
