package com.lody.virtual.helper.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    MapCollections<K, V> mCollections;

    public ArrayMap() {
    }

    private MapCollections<K, V> getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new MapCollections<K, V>() { // from class: com.lody.virtual.helper.collection.ArrayMap.1
                @Override // com.lody.virtual.helper.collection.MapCollections
                protected void colClear() {
                    ArrayMap.this.clear();
                }

                @Override // com.lody.virtual.helper.collection.MapCollections
                protected Object colGetEntry(int i5, int i6) {
                    return ArrayMap.this.mArray[(i5 << 1) + i6];
                }

                @Override // com.lody.virtual.helper.collection.MapCollections
                protected Map<K, V> colGetMap() {
                    return ArrayMap.this;
                }

                @Override // com.lody.virtual.helper.collection.MapCollections
                protected int colGetSize() {
                    return ArrayMap.this.mSize;
                }

                @Override // com.lody.virtual.helper.collection.MapCollections
                protected int colIndexOfKey(Object obj) {
                    return ArrayMap.this.indexOfKey(obj);
                }

                @Override // com.lody.virtual.helper.collection.MapCollections
                protected int colIndexOfValue(Object obj) {
                    return ArrayMap.this.indexOfValue(obj);
                }

                @Override // com.lody.virtual.helper.collection.MapCollections
                protected void colPut(K k5, V v4) {
                    ArrayMap.this.put(k5, v4);
                }

                @Override // com.lody.virtual.helper.collection.MapCollections
                protected void colRemoveAt(int i5) {
                    ArrayMap.this.removeAt(i5);
                }

                @Override // com.lody.virtual.helper.collection.MapCollections
                protected V colSetValue(int i5, V v4) {
                    return ArrayMap.this.setValueAt(i5, v4);
                }
            };
        }
        return this.mCollections;
    }

    public boolean containsAll(Collection<?> collection) {
        return MapCollections.containsAllHelper(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return getCollection().getEntrySet();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return getCollection().getKeySet();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        ensureCapacity(this.mSize + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean removeAll(Collection<?> collection) {
        return MapCollections.removeAllHelper(this, collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return MapCollections.retainAllHelper(this, collection);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return getCollection().getValues();
    }

    public ArrayMap(int i5) {
        super(i5);
    }

    public ArrayMap(SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }
}
