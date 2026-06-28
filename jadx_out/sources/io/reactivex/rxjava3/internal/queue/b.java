package io.reactivex.rxjava3.internal.queue;

import io.reactivex.rxjava3.internal.fuseable.p;
import io.reactivex.rxjava3.internal.util.t;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import l3.g;

/* loaded from: classes3.dex */
public final class b<E> extends AtomicReferenceArray<E> implements p<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex;
    final int lookAheadStep;
    final int mask;
    final AtomicLong producerIndex;
    long producerLookAhead;

    public b(int i5) {
        super(t.b(i5));
        this.mask = length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i5 / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }

    int calcElementOffset(long j5) {
        return ((int) j5) & this.mask;
    }

    int calcElementOffset(long j5, int i5) {
        return ((int) j5) & i5;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean isEmpty() {
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    E lvElement(int i5) {
        return get(i5);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean offer(E e5) {
        if (e5 != null) {
            int i5 = this.mask;
            long j5 = this.producerIndex.get();
            int calcElementOffset = calcElementOffset(j5, i5);
            if (j5 >= this.producerLookAhead) {
                long j6 = this.lookAheadStep + j5;
                if (lvElement(calcElementOffset(j6, i5)) == null) {
                    this.producerLookAhead = j6;
                } else if (lvElement(calcElementOffset) != null) {
                    return false;
                }
            }
            soElement(calcElementOffset, e5);
            soProducerIndex(j5 + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.p, io.reactivex.rxjava3.internal.fuseable.q
    @g
    public E poll() {
        long j5 = this.consumerIndex.get();
        int calcElementOffset = calcElementOffset(j5);
        E lvElement = lvElement(calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        soConsumerIndex(j5 + 1);
        soElement(calcElementOffset, null);
        return lvElement;
    }

    void soConsumerIndex(long j5) {
        this.consumerIndex.lazySet(j5);
    }

    void soElement(int i5, E e5) {
        lazySet(i5, e5);
    }

    void soProducerIndex(long j5) {
        this.producerIndex.lazySet(j5);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean offer(E e5, E e6) {
        return offer(e5) && offer(e6);
    }
}
