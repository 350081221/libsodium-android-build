package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\u0002R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/ValueElementSequence;", "Lkotlin/sequences/m;", "Landroidx/compose/ui/platform/ValueElement;", "", "iterator", "", "name", "", t0.b.f22420d, "Lkotlin/r2;", "set", "", "elements", "Ljava/util/List;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ValueElementSequence implements kotlin.sequences.m<ValueElement> {
    public static final int $stable = 8;

    @p4.l
    private final List<ValueElement> elements = new ArrayList();

    @Override // kotlin.sequences.m
    @p4.l
    public Iterator<ValueElement> iterator() {
        return this.elements.iterator();
    }

    public final void set(@p4.l String str, @p4.m Object obj) {
        this.elements.add(new ValueElement(str, obj));
    }
}
