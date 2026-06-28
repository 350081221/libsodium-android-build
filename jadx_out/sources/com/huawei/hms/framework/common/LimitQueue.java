package com.huawei.hms.framework.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes3.dex */
public class LimitQueue<E> extends ConcurrentLinkedQueue<E> {
    private static final String TAG = "LimitQueue";
    private static final long serialVersionUID = -4636313759149307798L;
    private boolean deduplication;
    private int limit;

    public LimitQueue(int i5) {
        this.deduplication = false;
        this.limit = i5;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e5) {
        if (this.deduplication) {
            super.remove(e5);
        }
        if (super.size() >= this.limit) {
            super.poll();
        }
        return super.add(e5);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.size() > this.limit) {
            return false;
        }
        if (this.deduplication) {
            super.removeAll(collection);
        }
        for (int size = (collection.size() + super.size()) - this.limit; size > 0; size--) {
            super.poll();
        }
        return super.addAll(collection);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        super.clear();
    }

    public E get(int i5) {
        Iterator<E> it = iterator();
        E e5 = null;
        for (int i6 = 0; i6 <= i5 && it.hasNext(); i6++) {
            e5 = it.next();
        }
        return e5;
    }

    public int getLimit() {
        return this.limit;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public boolean offer(E e5) {
        if (this.deduplication) {
            super.remove(e5);
        }
        if (super.size() >= this.limit) {
            super.poll();
        }
        return super.offer(e5);
    }

    public E peekLast() {
        Iterator<E> it = iterator();
        E e5 = null;
        while (it.hasNext()) {
            e5 = it.next();
        }
        return e5;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public E poll() {
        return (E) super.poll();
    }

    @Override // java.util.AbstractQueue, java.util.Queue
    public E remove() {
        try {
            return (E) super.remove();
        } catch (NoSuchElementException unused) {
            Logger.w(TAG, "remove failed, limitQueue is empty");
            return null;
        }
    }

    public LimitQueue(int i5, boolean z4) {
        this.limit = i5;
        this.deduplication = z4;
    }

    public LimitQueue(Collection<? extends E> collection, boolean z4) {
        this(collection.size(), z4);
        addAll(collection);
    }
}
