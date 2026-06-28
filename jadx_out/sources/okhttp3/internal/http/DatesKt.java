package okhttp3.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import okhttp3.internal.Util;
import org.apache.http.impl.cookie.DateUtils;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000+\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\n\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u0005H\u0000\u001a\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0000\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000f"}, d2 = {"BROWSER_COMPATIBLE_DATE_FORMATS", "", "Ljava/text/DateFormat;", "[Ljava/text/DateFormat;", "BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS", "", "[Ljava/lang/String;", "MAX_DATE", "", "STANDARD_DATE_FORMAT", "okhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1", "Lokhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1;", "toHttpDateOrNull", "Ljava/util/Date;", "toHttpDateString", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DatesKt {

    @l
    private static final DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS;

    @l
    private static final String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
    public static final long MAX_DATE = 253402300799999L;

    @l
    private static final DatesKt$STANDARD_DATE_FORMAT$1 STANDARD_DATE_FORMAT = new ThreadLocal<DateFormat>() { // from class: okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        @l
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(Util.UTC);
            return simpleDateFormat;
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1] */
    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", DateUtils.PATTERN_RFC1036, DateUtils.PATTERN_ASCTIME, "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = strArr;
        BROWSER_COMPATIBLE_DATE_FORMATS = new DateFormat[strArr.length];
    }

    @m
    public static final Date toHttpDateOrNull(@l String str) {
        boolean z4;
        l0.p(str, "<this>");
        if (str.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = STANDARD_DATE_FORMAT.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                DateFormat[] dateFormatArr = BROWSER_COMPATIBLE_DATE_FORMATS;
                DateFormat dateFormat = dateFormatArr[i5];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[i5], Locale.US);
                    dateFormat.setTimeZone(Util.UTC);
                    dateFormatArr[i5] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            r2 r2Var = r2.f19517a;
            return null;
        }
    }

    @l
    public static final String toHttpDateString(@l Date date) {
        l0.p(date, "<this>");
        String format = STANDARD_DATE_FORMAT.get().format(date);
        l0.o(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
