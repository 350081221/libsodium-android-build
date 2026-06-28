package androidx.compose.material3;

import kotlin.text.r;

@kotlin.i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"DaysInWeek", "", "MillisecondsIn24Hours", "", "datePatternAsInputFormat", "Landroidx/compose/material3/DateInputFormat;", "localeFormat", "", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CalendarModelKt {
    public static final int DaysInWeek = 7;
    public static final long MillisecondsIn24Hours = 86400000;

    @p4.l
    @ExperimentalMaterial3Api
    public static final DateInputFormat datePatternAsInputFormat(@p4.l String str) {
        String i22;
        String g42;
        i22 = kotlin.text.e0.i2(new r("y{1,4}").replace(new r("M{1,2}").replace(new r("d{1,2}").replace(new r("[^dMy/\\-.]").replace(str, ""), "dd"), "MM"), "yyyy"), "My", "M/y", false, 4, null);
        g42 = kotlin.text.f0.g4(i22, ".");
        kotlin.text.p find$default = r.find$default(new r("[/\\-.]"), g42, 0, 2, null);
        kotlin.jvm.internal.l0.m(find$default);
        kotlin.text.m mVar = find$default.d().get(0);
        kotlin.jvm.internal.l0.m(mVar);
        int e5 = mVar.e().e();
        String substring = g42.substring(e5, e5 + 1);
        kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new DateInputFormat(g42, substring.charAt(0));
    }
}
