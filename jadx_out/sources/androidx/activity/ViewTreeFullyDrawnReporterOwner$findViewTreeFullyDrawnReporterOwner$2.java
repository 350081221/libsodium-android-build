package androidx.activity;

import android.view.View;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/activity/FullyDrawnReporterOwner;", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2 extends n0 implements v3.l<View, FullyDrawnReporterOwner> {
    public static final ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2 INSTANCE = new ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2();

    ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2() {
        super(1);
    }

    @Override // v3.l
    @p4.m
    public final FullyDrawnReporterOwner invoke(@p4.l View it) {
        l0.p(it, "it");
        Object tag = it.getTag(R.id.report_drawn);
        if (tag instanceof FullyDrawnReporterOwner) {
            return (FullyDrawnReporterOwner) tag;
        }
        return null;
    }
}
