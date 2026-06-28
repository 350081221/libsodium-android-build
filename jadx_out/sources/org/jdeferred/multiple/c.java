package org.jdeferred.multiple;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class c implements Iterable<f> {

    /* renamed from: a, reason: collision with root package name */
    private final List<f> f21613a;

    public c(int i5) {
        this.f21613a = new CopyOnWriteArrayList(new f[i5]);
    }

    public f a(int i5) {
        return this.f21613a.get(i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i5, f fVar) {
        this.f21613a.set(i5, fVar);
    }

    @Override // java.lang.Iterable
    public Iterator<f> iterator() {
        return this.f21613a.iterator();
    }

    public int size() {
        return this.f21613a.size();
    }

    public String toString() {
        return "MultipleResults [results=" + this.f21613a + "]";
    }
}
