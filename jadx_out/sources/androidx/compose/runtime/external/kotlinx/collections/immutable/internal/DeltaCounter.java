package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "", "", "that", "Lkotlin/r2;", "plusAssign", "component1", "count", "copy", "", "toString", TTDownloadField.TT_HASHCODE, "other", "", "equals", "I", "getCount", "()I", "setCount", "(I)V", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DeltaCounter {
    public static final int $stable = 8;
    private int count;

    public DeltaCounter() {
        this(0, 1, null);
    }

    public DeltaCounter(int i5) {
        this.count = i5;
    }

    public static /* synthetic */ DeltaCounter copy$default(DeltaCounter deltaCounter, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = deltaCounter.count;
        }
        return deltaCounter.copy(i5);
    }

    public final int component1() {
        return this.count;
    }

    @l
    public final DeltaCounter copy(int i5) {
        return new DeltaCounter(i5);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeltaCounter) && this.count == ((DeltaCounter) obj).count;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return Integer.hashCode(this.count);
    }

    public final void plusAssign(int i5) {
        this.count += i5;
    }

    public final void setCount(int i5) {
        this.count = i5;
    }

    @l
    public String toString() {
        return "DeltaCounter(count=" + this.count + ')';
    }

    public /* synthetic */ DeltaCounter(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 0 : i5);
    }
}
