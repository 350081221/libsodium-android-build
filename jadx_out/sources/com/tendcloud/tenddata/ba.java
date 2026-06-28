package com.tendcloud.tenddata;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ba {

    /* renamed from: a, reason: collision with root package name */
    private int f11460a;

    /* renamed from: b, reason: collision with root package name */
    private long f11461b;

    /* renamed from: c, reason: collision with root package name */
    private List<ax> f11462c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, ax> f11463d;

    public int a() {
        return this.f11460a;
    }

    public long b() {
        return this.f11461b;
    }

    public List<ax> c() {
        return this.f11462c;
    }

    public ba d() {
        ba baVar = new ba();
        baVar.setTimestamp(this.f11460a);
        baVar.setPoiId(this.f11461b);
        LinkedList linkedList = new LinkedList();
        Iterator<ax> it = this.f11462c.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().f());
        }
        baVar.setBsslist(linkedList);
        return baVar;
    }

    public void setBsslist(List<ax> list) {
        this.f11462c = list;
    }

    public void setPoiId(long j5) {
        this.f11461b = j5;
    }

    public void setTimestamp(int i5) {
        this.f11460a = i5;
    }

    public Map<String, ax> a(boolean z4) {
        if (this.f11463d == null || z4) {
            this.f11463d = new HashMap();
            for (ax axVar : this.f11462c) {
                this.f11463d.put(axVar.b(), axVar);
            }
        }
        return this.f11463d;
    }
}
