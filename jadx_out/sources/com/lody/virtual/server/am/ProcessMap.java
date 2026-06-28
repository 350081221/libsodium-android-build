package com.lody.virtual.server.am;

import com.lody.virtual.helper.collection.ArrayMap;
import com.lody.virtual.helper.collection.SparseArray;

/* loaded from: classes3.dex */
class ProcessMap<E> {
    private final ArrayMap<String, SparseArray<E>> mMap = new ArrayMap<>();

    ProcessMap() {
    }

    public E get(String str, int i5) {
        SparseArray<E> sparseArray = this.mMap.get(str);
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i5);
    }

    public ArrayMap<String, SparseArray<E>> getMap() {
        return this.mMap;
    }

    public E put(String str, int i5, E e5) {
        SparseArray<E> sparseArray = this.mMap.get(str);
        if (sparseArray == null) {
            sparseArray = new SparseArray<>(2);
            this.mMap.put(str, sparseArray);
        }
        sparseArray.put(i5, e5);
        return e5;
    }

    public E remove(String str, int i5) {
        SparseArray<E> sparseArray = this.mMap.get(str);
        if (sparseArray != null) {
            E removeReturnOld = sparseArray.removeReturnOld(i5);
            if (sparseArray.size() == 0) {
                this.mMap.remove(str);
            }
            return removeReturnOld;
        }
        return null;
    }
}
