package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Stable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import t0.b;
import u3.f;

@Stable
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0003¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/StableValue;", "T", "", b.f22420d, "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "equals", "", "other", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(Ljava/lang/Object;)I", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
final class StableValue<T> {
    private final T value;

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ StableValue(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StableValue m731boximpl(Object obj) {
        return new StableValue(obj);
    }

    @l
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m732constructorimpl(T t5) {
        return t5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m733equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof StableValue) && l0.g(obj, ((StableValue) obj2).m737unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m734equalsimpl0(Object obj, Object obj2) {
        return l0.g(obj, obj2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m735hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m736toStringimpl(Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m733equalsimpl(this.value, obj);
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        return m735hashCodeimpl(this.value);
    }

    public String toString() {
        return m736toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m737unboximpl() {
        return this.value;
    }
}
