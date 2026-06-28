package org.ahocorasick.trie;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f21075a;

    /* renamed from: b, reason: collision with root package name */
    private final d f21076b;

    /* renamed from: c, reason: collision with root package name */
    private Map<Character, d> f21077c;

    /* renamed from: d, reason: collision with root package name */
    private d f21078d;

    /* renamed from: e, reason: collision with root package name */
    private Set<String> f21079e;

    public d() {
        this(0);
    }

    private d j(Character ch, boolean z4) {
        d dVar;
        d dVar2 = this.f21077c.get(ch);
        if (!z4 && dVar2 == null && (dVar = this.f21076b) != null) {
            return dVar;
        }
        return dVar2;
    }

    public void a(String str) {
        if (this.f21079e == null) {
            this.f21079e = new TreeSet();
        }
        this.f21079e.add(str);
    }

    public void b(Collection<String> collection) {
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public d c(Character ch) {
        d k5 = k(ch);
        if (k5 == null) {
            d dVar = new d(this.f21075a + 1);
            this.f21077c.put(ch, dVar);
            return dVar;
        }
        return k5;
    }

    public Collection<String> d() {
        Set<String> set = this.f21079e;
        return set == null ? Collections.emptyList() : set;
    }

    public d e() {
        return this.f21078d;
    }

    public int f() {
        return this.f21075a;
    }

    public Collection<d> g() {
        return this.f21077c.values();
    }

    public Collection<Character> h() {
        return this.f21077c.keySet();
    }

    public d i(Character ch) {
        return j(ch, false);
    }

    public d k(Character ch) {
        return j(ch, true);
    }

    public void l(d dVar) {
        this.f21078d = dVar;
    }

    public d(int i5) {
        this.f21077c = new HashMap();
        this.f21078d = null;
        this.f21079e = null;
        this.f21075a = i5;
        this.f21076b = i5 == 0 ? this : null;
    }
}
