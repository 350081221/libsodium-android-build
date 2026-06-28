package androidx.activity;

import android.view.View;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1 extends n0 implements v3.l<View, View> {
    public static final ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1 INSTANCE = new ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1();

    ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1() {
        super(1);
    }

    @Override // v3.l
    @p4.m
    public final View invoke(@p4.l View it) {
        l0.p(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
