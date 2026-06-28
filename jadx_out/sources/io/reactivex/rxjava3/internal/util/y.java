package io.reactivex.rxjava3.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class y<T> extends AtomicInteger implements List<T>, RandomAccess {
    private static final long serialVersionUID = 3972397474470203923L;
    final ArrayList<T> list;

    public y() {
        this.list = new ArrayList<>();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t5) {
        boolean add = this.list.add(t5);
        lazySet(this.list.size());
        return add;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@l3.f Collection<? extends T> collection) {
        boolean addAll = this.list.addAll(collection);
        lazySet(this.list.size());
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.list.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.list.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@l3.f Collection<?> collection) {
        return this.list.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.list.equals(((y) obj).list);
        }
        return this.list.equals(obj);
    }

    @Override // java.util.List
    public T get(int i5) {
        return this.list.get(i5);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.list.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.list.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.list.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.list.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return this.list.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        boolean remove = this.list.remove(obj);
        lazySet(this.list.size());
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@l3.f Collection<?> collection) {
        boolean removeAll = this.list.removeAll(collection);
        lazySet(this.list.size());
        return removeAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@l3.f Collection<?> collection) {
        boolean retainAll = this.list.retainAll(collection);
        lazySet(this.list.size());
        return retainAll;
    }

    @Override // java.util.List
    public T set(int i5, T t5) {
        return this.list.set(i5, t5);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return get();
    }

    @Override // java.util.List
    public List<T> subList(int i5, int i6) {
        return this.list.subList(i5, i6);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.list.toArray();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.list.toString();
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i5) {
        return this.list.listIterator(i5);
    }

    @Override // java.util.List, java.util.Collection
    public <E> E[] toArray(@l3.f E[] eArr) {
        return (E[]) this.list.toArray(eArr);
    }

    public y(int i5) {
        this.list = new ArrayList<>(i5);
    }

    @Override // java.util.List
    public void add(int i5, T t5) {
        this.list.add(i5, t5);
        lazySet(this.list.size());
    }

    @Override // java.util.List
    public boolean addAll(int i5, @l3.f Collection<? extends T> collection) {
        boolean addAll = this.list.addAll(i5, collection);
        lazySet(this.list.size());
        return addAll;
    }

    @Override // java.util.List
    public T remove(int i5) {
        T remove = this.list.remove(i5);
        lazySet(this.list.size());
        return remove;
    }
}
