package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.Locale;

@kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/text/input/TextFieldValue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DateInputKt$DateInputTextField$text$2$1 extends kotlin.jvm.internal.n0 implements v3.a<MutableState<TextFieldValue>> {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DateInputFormat $dateInputFormat;
    final /* synthetic */ Long $initialDateMillis;
    final /* synthetic */ Locale $locale;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateInputKt$DateInputTextField$text$2$1(Long l5, CalendarModel calendarModel, DateInputFormat dateInputFormat, Locale locale) {
        super(0);
        this.$initialDateMillis = l5;
        this.$calendarModel = calendarModel;
        this.$dateInputFormat = dateInputFormat;
        this.$locale = locale;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0 == null) goto L6;
     */
    @Override // v3.a
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> invoke() {
        /*
            r8 = this;
            java.lang.Long r0 = r8.$initialDateMillis
            if (r0 == 0) goto L18
            androidx.compose.material3.CalendarModel r1 = r8.$calendarModel
            androidx.compose.material3.DateInputFormat r2 = r8.$dateInputFormat
            java.util.Locale r3 = r8.$locale
            long r4 = r0.longValue()
            java.lang.String r0 = r2.getPatternWithoutDelimiters()
            java.lang.String r0 = r1.formatWithPattern(r4, r0, r3)
            if (r0 != 0) goto L1a
        L18:
            java.lang.String r0 = ""
        L1a:
            r2 = r0
            r0 = 0
            long r3 = androidx.compose.ui.text.TextRangeKt.TextRange(r0, r0)
            r5 = 0
            r6 = 4
            r7 = 0
            androidx.compose.ui.text.input.TextFieldValue r0 = new androidx.compose.ui.text.input.TextFieldValue
            r1 = r0
            r1.<init>(r2, r3, r5, r6, r7)
            r1 = 2
            r2 = 0
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r0, r2, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputKt$DateInputTextField$text$2$1.invoke():androidx.compose.runtime.MutableState");
    }
}
