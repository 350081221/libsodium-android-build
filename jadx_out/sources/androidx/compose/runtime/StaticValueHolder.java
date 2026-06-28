package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 2)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0003\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/StaticValueHolder;", "T", "Landroidx/compose/runtime/State;", b.f22420d, "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Landroidx/compose/runtime/StaticValueHolder;", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StaticValueHolder<T> implements State<T> {
    public static final int $stable = 0;
    private final T value;

    public StaticValueHolder(T t5) {
        this.value = t5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StaticValueHolder copy$default(StaticValueHolder staticValueHolder, Object obj, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            obj = staticValueHolder.value;
        }
        return staticValueHolder.copy(obj);
    }

    public final T component1() {
        return this.value;
    }

    @l
    public final StaticValueHolder<T> copy(T t5) {
        return new StaticValueHolder<>(t5);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StaticValueHolder) && l0.g(this.value, ((StaticValueHolder) obj).value);
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t5 = this.value;
        if (t5 == null) {
            return 0;
        }
        return t5.hashCode();
    }

    @l
    public String toString() {
        return "StaticValueHolder(value=" + this.value + ')';
    }
}
