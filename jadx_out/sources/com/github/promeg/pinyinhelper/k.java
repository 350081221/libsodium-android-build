package com.github.promeg.pinyinhelper;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.ahocorasick.trie.f;

/* loaded from: classes2.dex */
final class k {
    private k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static org.ahocorasick.trie.f a(List<h> list) {
        TreeSet treeSet = new TreeSet();
        f.b e5 = org.ahocorasick.trie.f.e();
        if (list != null) {
            for (h hVar : list) {
                if (hVar != null && hVar.a() != null) {
                    treeSet.addAll(hVar.a());
                }
            }
            if (treeSet.size() > 0) {
                Iterator it = treeSet.iterator();
                while (it.hasNext()) {
                    e5.a((String) it.next());
                }
                return e5.b();
            }
            return null;
        }
        return null;
    }
}
