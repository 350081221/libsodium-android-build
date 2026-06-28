package androidx.compose.runtime.internal;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.d;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/internal/IntRef;", "", "element", "", "(I)V", "getElement", "()I", "setElement", "toString", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntRef {
    public static final int $stable = 8;
    private int element;

    public IntRef() {
        this(0, 1, null);
    }

    public IntRef(int i5) {
        this.element = i5;
    }

    public final int getElement() {
        return this.element;
    }

    public final void setElement(int i5) {
        this.element = i5;
    }

    @l
    public String toString() {
        int a5;
        StringBuilder sb = new StringBuilder();
        sb.append("IntRef(element = ");
        sb.append(this.element);
        sb.append(")@");
        int hashCode = hashCode();
        a5 = d.a(16);
        String num = Integer.toString(hashCode, a5);
        l0.o(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    public /* synthetic */ IntRef(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 0 : i5);
    }
}
