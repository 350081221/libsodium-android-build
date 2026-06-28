package org.greenrobot.greendao.query;

import android.database.Cursor;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public class i<E> implements List<E>, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final org.greenrobot.greendao.g<E> f21417a;

    /* renamed from: b, reason: collision with root package name */
    private final Cursor f21418b;

    /* renamed from: c, reason: collision with root package name */
    private final List<E> f21419c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21420d;

    /* renamed from: e, reason: collision with root package name */
    private final ReentrantLock f21421e;

    /* renamed from: f, reason: collision with root package name */
    private volatile int f21422f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public class a implements d<E> {

        /* renamed from: a, reason: collision with root package name */
        private int f21423a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f21424b;

        public a(int i5, boolean z4) {
            this.f21423a = i5;
            this.f21424b = z4;
        }

        @Override // java.util.ListIterator
        public void add(E e5) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            i.this.close();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f21423a < i.this.f21420d;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f21423a > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.f21423a < i.this.f21420d) {
                E e5 = (E) i.this.get(this.f21423a);
                int i5 = this.f21423a + 1;
                this.f21423a = i5;
                if (i5 == i.this.f21420d && this.f21424b) {
                    close();
                }
                return e5;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f21423a;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i5 = this.f21423a;
            if (i5 > 0) {
                int i6 = i5 - 1;
                this.f21423a = i6;
                return (E) i.this.get(i6);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f21423a - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void set(E e5) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(org.greenrobot.greendao.g<E> gVar, Cursor cursor, boolean z4) {
        this.f21418b = cursor;
        this.f21417a = gVar;
        int count = cursor.getCount();
        this.f21420d = count;
        if (z4) {
            this.f21419c = new ArrayList(count);
            for (int i5 = 0; i5 < this.f21420d; i5++) {
                this.f21419c.add(null);
            }
        } else {
            this.f21419c = null;
        }
        if (this.f21420d == 0) {
            cursor.close();
        }
        this.f21421e = new ReentrantLock();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    protected void c() {
        if (this.f21419c != null) {
        } else {
            throw new org.greenrobot.greendao.d("This operation only works with cached lazy lists");
        }
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21418b.close();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        q();
        return this.f21419c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        q();
        return this.f21419c.containsAll(collection);
    }

    @Override // java.util.List
    public E get(int i5) {
        List<E> list = this.f21419c;
        if (list != null) {
            E e5 = list.get(i5);
            if (e5 == null) {
                this.f21421e.lock();
                try {
                    e5 = this.f21419c.get(i5);
                    if (e5 == null) {
                        e5 = p(i5);
                        this.f21419c.set(i5, e5);
                        this.f21422f++;
                        if (this.f21422f == this.f21420d) {
                            this.f21418b.close();
                        }
                    }
                } finally {
                }
            }
            return e5;
        }
        this.f21421e.lock();
        try {
            return p(i5);
        } finally {
        }
    }

    public int h() {
        return this.f21422f;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        q();
        return this.f21419c.indexOf(obj);
    }

    public boolean isClosed() {
        return this.f21418b.isClosed();
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f21420d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a(0, false);
    }

    public boolean j() {
        return this.f21422f == this.f21420d;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        q();
        return this.f21419c.lastIndexOf(obj);
    }

    @Override // java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public d<E> listIterator() {
        return new a(0, false);
    }

    public d<E> o() {
        return new a(0, true);
    }

    protected E p(int i5) {
        if (this.f21418b.moveToPosition(i5)) {
            E d5 = this.f21417a.d(this.f21418b, 0, true);
            if (d5 != null) {
                return d5;
            }
            throw new org.greenrobot.greendao.d("Loading of entity failed (null) at position " + i5);
        }
        throw new org.greenrobot.greendao.d("Could not move to cursor location " + i5);
    }

    public void q() {
        c();
        int size = this.f21419c.size();
        for (int i5 = 0; i5 < size; i5++) {
            get(i5);
        }
    }

    @Override // java.util.List
    public E remove(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public E set(int i5, E e5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f21420d;
    }

    @Override // java.util.List
    public List<E> subList(int i5, int i6) {
        c();
        for (int i7 = i5; i7 < i6; i7++) {
            get(i7);
        }
        return this.f21419c.subList(i5, i6);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        q();
        return this.f21419c.toArray();
    }

    public E y(int i5) {
        List<E> list = this.f21419c;
        if (list != null) {
            return list.get(i5);
        }
        return null;
    }

    @Override // java.util.List
    public void add(int i5, E e5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public boolean addAll(int i5, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i5) {
        return new a(i5, false);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        q();
        return (T[]) this.f21419c.toArray(tArr);
    }
}
