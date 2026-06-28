package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;
import v3.a;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/semantics/ScrollAxisRange;", "", "", "toString", "Lkotlin/Function0;", "", b.f22420d, "Lv3/a;", "getValue", "()Lv3/a;", "maxValue", "getMaxValue", "", "reverseScrolling", "Z", "getReverseScrolling", "()Z", "<init>", "(Lv3/a;Lv3/a;Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollAxisRange {
    public static final int $stable = 0;

    @l
    private final a<Float> maxValue;
    private final boolean reverseScrolling;

    @l
    private final a<Float> value;

    public ScrollAxisRange(@l a<Float> aVar, @l a<Float> aVar2, boolean z4) {
        this.value = aVar;
        this.maxValue = aVar2;
        this.reverseScrolling = z4;
    }

    @l
    public final a<Float> getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    @l
    public final a<Float> getValue() {
        return this.value;
    }

    @l
    public String toString() {
        return "ScrollAxisRange(value=" + this.value.invoke().floatValue() + ", maxValue=" + this.maxValue.invoke().floatValue() + ", reverseScrolling=" + this.reverseScrolling + ')';
    }

    public /* synthetic */ ScrollAxisRange(a aVar, a aVar2, boolean z4, int i5, w wVar) {
        this(aVar, aVar2, (i5 & 4) != 0 ? false : z4);
    }
}
