package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0006B!\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\bJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002J\u0019\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010\u001aR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "V", "", b.f22420d, "(Ljava/lang/Object;)V", "previous", "(Ljava/lang/Object;Ljava/lang/Object;)V", "next", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "hasNext", "", "getHasNext", "()Z", "hasPrevious", "getHasPrevious", "getNext", "()Ljava/lang/Object;", "getPrevious", "getValue", "Ljava/lang/Object;", "withNext", "newNext", "withPrevious", "newPrevious", "withValue", "newValue", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LinkedValue<V> {
    public static final int $stable = 8;

    @m
    private final Object next;

    @m
    private final Object previous;
    private final V value;

    public LinkedValue(V v4, @m Object obj, @m Object obj2) {
        this.value = v4;
        this.previous = obj;
        this.next = obj2;
    }

    public final boolean getHasNext() {
        return this.next != EndOfChain.INSTANCE;
    }

    public final boolean getHasPrevious() {
        return this.previous != EndOfChain.INSTANCE;
    }

    @m
    public final Object getNext() {
        return this.next;
    }

    @m
    public final Object getPrevious() {
        return this.previous;
    }

    public final V getValue() {
        return this.value;
    }

    @l
    public final LinkedValue<V> withNext(@m Object obj) {
        return new LinkedValue<>(this.value, this.previous, obj);
    }

    @l
    public final LinkedValue<V> withPrevious(@m Object obj) {
        return new LinkedValue<>(this.value, obj, this.next);
    }

    @l
    public final LinkedValue<V> withValue(V v4) {
        return new LinkedValue<>(v4, this.previous, this.next);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LinkedValue(V r2) {
        /*
            r1 = this;
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE
            r1.<init>(r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue.<init>(java.lang.Object):void");
    }

    public LinkedValue(V v4, @m Object obj) {
        this(v4, obj, EndOfChain.INSTANCE);
    }
}
