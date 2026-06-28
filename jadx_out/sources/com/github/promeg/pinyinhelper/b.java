package com.github.promeg.pinyinhelper;

import com.github.promeg.pinyinhelper.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    static final a.C0145a f6903a = new a.C0145a();

    @Override // com.github.promeg.pinyinhelper.j
    public List<org.ahocorasick.trie.a> a(Collection<org.ahocorasick.trie.a> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList<org.ahocorasick.trie.a> arrayList = new ArrayList(collection);
        Collections.sort(arrayList, f6903a);
        TreeSet treeSet = new TreeSet();
        int i5 = -1;
        for (org.ahocorasick.trie.a aVar : arrayList) {
            if (aVar.getStart() > i5 && aVar.getEnd() > i5) {
                i5 = aVar.getEnd();
            } else {
                treeSet.add(aVar);
            }
        }
        arrayList.removeAll(treeSet);
        return arrayList;
    }
}
