package androidx.compose.material3;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;

@kotlin.i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/material3/DateRangePickerStateImpl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DateRangePickerStateImpl$Companion$Saver$1 extends kotlin.jvm.internal.n0 implements v3.p<SaverScope, DateRangePickerStateImpl, List<? extends Object>> {
    public static final DateRangePickerStateImpl$Companion$Saver$1 INSTANCE = new DateRangePickerStateImpl$Companion$Saver$1();

    DateRangePickerStateImpl$Companion$Saver$1() {
        super(2);
    }

    @Override // v3.p
    @p4.l
    public final List<Object> invoke(@p4.l SaverScope saverScope, @p4.l DateRangePickerStateImpl dateRangePickerStateImpl) {
        List<Object> L;
        L = kotlin.collections.w.L(dateRangePickerStateImpl.getSelectedStartDateMillis(), dateRangePickerStateImpl.getSelectedEndDateMillis(), Long.valueOf(dateRangePickerStateImpl.getDisplayedMonthMillis()), Integer.valueOf(dateRangePickerStateImpl.getYearRange().e()), Integer.valueOf(dateRangePickerStateImpl.getYearRange().g()), Integer.valueOf(dateRangePickerStateImpl.mo1831getDisplayModejFl4v0()));
        return L;
    }
}
