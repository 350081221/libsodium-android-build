package com.huawei.agconnect.apms.collect.model.event;

import com.huawei.agconnect.apms.collect.model.event.Event;
import com.huawei.agconnect.apms.collect.type.CollectableArray;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class Events<T extends Event> extends CollectableArray {
    public final Collection<T> events = new CopyOnWriteArrayList();

    public synchronized void add(T t5) {
        this.events.add(t5);
    }

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        for (T t5 : this.events) {
            if (t5 != null) {
                jSONArray.put(t5.asJsonArray());
            }
        }
        return jSONArray;
    }

    public void clear() {
        this.events.clear();
    }

    public int count() {
        return this.events.size();
    }

    public Collection<T> getEvents() {
        return this.events;
    }

    public synchronized void remove(T t5) {
        this.events.remove(t5);
    }
}
