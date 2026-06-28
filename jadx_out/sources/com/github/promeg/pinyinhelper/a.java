package com.github.promeg.pinyinhelper;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    static final C0145a f6902a = new C0145a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.promeg.pinyinhelper.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0145a implements Comparator<org.ahocorasick.trie.a> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(org.ahocorasick.trie.a aVar, org.ahocorasick.trie.a aVar2) {
            if (aVar.getStart() == aVar2.getStart()) {
                if (aVar.size() < aVar2.size()) {
                    return 1;
                }
                if (aVar.size() == aVar2.size()) {
                    return 0;
                }
                return -1;
            }
            if (aVar.getStart() < aVar2.getStart()) {
                return -1;
            }
            if (aVar.getStart() == aVar2.getStart()) {
                return 0;
            }
            return 1;
        }
    }

    private a() {
    }

    static String[] a(String str, List<h> list) {
        if (list != null) {
            for (h hVar : list) {
                if (hVar != null && hVar.a() != null && hVar.a().contains(str)) {
                    return hVar.b(str);
                }
            }
        }
        throw new IllegalArgumentException("No pinyin dict contains word: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str, org.ahocorasick.trie.f fVar, List<h> list, String str2, j jVar) {
        if (str != null && str.length() != 0) {
            if (fVar != null && jVar != null) {
                List<org.ahocorasick.trie.a> a5 = jVar.a(fVar.m(str));
                Collections.sort(a5, f6902a);
                StringBuffer stringBuffer = new StringBuffer();
                int i5 = 0;
                int i6 = 0;
                while (i5 < str.length()) {
                    if (i6 < a5.size() && i5 == a5.get(i6).getStart()) {
                        String[] a6 = a(a5.get(i6).f(), list);
                        for (int i7 = 0; i7 < a6.length; i7++) {
                            stringBuffer.append(a6[i7].toUpperCase());
                            if (i7 != a6.length - 1) {
                                stringBuffer.append(str2);
                            }
                        }
                        i5 += a5.get(i6).size();
                        i6++;
                    } else {
                        stringBuffer.append(c.g(str.charAt(i5)));
                        i5++;
                    }
                    if (i5 != str.length()) {
                        stringBuffer.append(str2);
                    }
                }
                return stringBuffer.toString();
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int i8 = 0; i8 < str.length(); i8++) {
                stringBuffer2.append(c.g(str.charAt(i8)));
                if (i8 != str.length() - 1) {
                    stringBuffer2.append(str2);
                }
            }
            return stringBuffer2.toString();
        }
        return str;
    }
}
