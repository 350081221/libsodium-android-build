package org.ahocorasick.interval;

import java.util.Comparator;

/* loaded from: classes4.dex */
public class f implements Comparator<d> {
    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(d dVar, d dVar2) {
        int size = dVar2.size() - dVar.size();
        if (size == 0) {
            return dVar.getStart() - dVar2.getStart();
        }
        return size;
    }
}
