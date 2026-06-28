package org.ahocorasick.interval;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private b f21072a;

    public c(List<d> list) {
        this.f21072a = null;
        this.f21072a = new b(list);
    }

    public List<d> a(d dVar) {
        return this.f21072a.g(dVar);
    }

    public List<d> b(List<d> list) {
        Collections.sort(list, new f());
        TreeSet treeSet = new TreeSet();
        for (d dVar : list) {
            if (!treeSet.contains(dVar)) {
                treeSet.addAll(a(dVar));
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            list.remove((d) it.next());
        }
        Collections.sort(list, new e());
        return list;
    }
}
