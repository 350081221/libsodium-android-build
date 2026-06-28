package org.ahocorasick.trie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private g f21081a;

    /* renamed from: b, reason: collision with root package name */
    private d f21082b;

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private g f21083a;

        /* renamed from: b, reason: collision with root package name */
        private f f21084b;

        public b a(String str) {
            this.f21084b.d(str);
            return this;
        }

        public f b() {
            this.f21084b.f();
            return this.f21084b;
        }

        public b c() {
            this.f21083a.g(true);
            return this;
        }

        public b d() {
            this.f21083a.h(true);
            return this;
        }

        public b e() {
            this.f21083a.i(true);
            return this;
        }

        public b f() {
            this.f21083a.f(false);
            return this;
        }

        public b g() {
            this.f21084b.f21081a.j(true);
            return this;
        }

        private b() {
            g gVar = new g();
            this.f21083a = gVar;
            this.f21084b = new f(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (str != null && str.length() != 0) {
            d dVar = this.f21082b;
            for (char c5 : str.toCharArray()) {
                Character valueOf = Character.valueOf(c5);
                if (this.f21081a.b()) {
                    valueOf = Character.valueOf(Character.toLowerCase(valueOf.charValue()));
                }
                dVar = dVar.c(valueOf);
            }
            if (this.f21081a.b()) {
                str = str.toLowerCase();
            }
            dVar.a(str);
        }
    }

    public static b e() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        for (d dVar : this.f21082b.g()) {
            dVar.l(this.f21082b);
            linkedBlockingDeque.add(dVar);
        }
        while (!linkedBlockingDeque.isEmpty()) {
            d dVar2 = (d) linkedBlockingDeque.remove();
            for (Character ch : dVar2.h()) {
                d i5 = dVar2.i(ch);
                linkedBlockingDeque.add(i5);
                d e5 = dVar2.e();
                while (e5.i(ch) == null) {
                    e5 = e5.e();
                }
                d i6 = e5.i(ch);
                i5.l(i6);
                i5.b(i6.d());
            }
        }
    }

    private e h(org.ahocorasick.trie.a aVar, String str, int i5) {
        return new org.ahocorasick.trie.b(str.substring(i5 + 1, aVar == null ? str.length() : aVar.getStart()));
    }

    private e i(org.ahocorasick.trie.a aVar, String str) {
        return new c(str.substring(aVar.getStart(), aVar.getEnd() + 1), aVar);
    }

    private d k(d dVar, Character ch) {
        d i5 = dVar.i(ch);
        while (i5 == null) {
            dVar = dVar.e();
            i5 = dVar.i(ch);
        }
        return i5;
    }

    private boolean l(CharSequence charSequence, org.ahocorasick.trie.a aVar) {
        if (aVar.getStart() != 0 && Character.isAlphabetic(charSequence.charAt(aVar.getStart() - 1))) {
            return true;
        }
        if (aVar.getEnd() + 1 != charSequence.length() && Character.isAlphabetic(charSequence.charAt(aVar.getEnd() + 1))) {
            return true;
        }
        return false;
    }

    private void o(CharSequence charSequence, List<org.ahocorasick.trie.a> list) {
        ArrayList arrayList = new ArrayList();
        for (org.ahocorasick.trie.a aVar : list) {
            if (l(charSequence, aVar)) {
                arrayList.add(aVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list.remove((org.ahocorasick.trie.a) it.next());
        }
    }

    private void p(CharSequence charSequence, List<org.ahocorasick.trie.a> list) {
        long length = charSequence.length();
        ArrayList arrayList = new ArrayList();
        for (org.ahocorasick.trie.a aVar : list) {
            if ((aVar.getStart() != 0 && !Character.isWhitespace(charSequence.charAt(aVar.getStart() - 1))) || (aVar.getEnd() + 1 != length && !Character.isWhitespace(charSequence.charAt(aVar.getEnd() + 1)))) {
                arrayList.add(aVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list.remove((org.ahocorasick.trie.a) it.next());
        }
    }

    private boolean q(int i5, d dVar, k4.b bVar) {
        Collection<String> d5 = dVar.d();
        boolean z4 = false;
        if (d5 != null && !d5.isEmpty()) {
            for (String str : d5) {
                bVar.a(new org.ahocorasick.trie.a((i5 - str.length()) + 1, i5, str));
                z4 = true;
            }
        }
        return z4;
    }

    public boolean g(CharSequence charSequence) {
        return j(charSequence) != null;
    }

    public org.ahocorasick.trie.a j(CharSequence charSequence) {
        if (!this.f21081a.a()) {
            Collection<org.ahocorasick.trie.a> m5 = m(charSequence);
            if (m5 != null && !m5.isEmpty()) {
                return m5.iterator().next();
            }
            return null;
        }
        d dVar = this.f21082b;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            Character valueOf = Character.valueOf(charSequence.charAt(i5));
            if (this.f21081a.b()) {
                valueOf = Character.valueOf(Character.toLowerCase(valueOf.charValue()));
            }
            dVar = k(dVar, valueOf);
            Collection<String> d5 = dVar.d();
            if (d5 != null && !d5.isEmpty()) {
                for (String str : d5) {
                    org.ahocorasick.trie.a aVar = new org.ahocorasick.trie.a((i5 - str.length()) + 1, i5, str);
                    if (!this.f21081a.c() || !l(charSequence, aVar)) {
                        return aVar;
                    }
                }
            }
        }
        return null;
    }

    public Collection<org.ahocorasick.trie.a> m(CharSequence charSequence) {
        k4.a aVar = new k4.a();
        n(charSequence, aVar);
        List<org.ahocorasick.trie.a> b5 = aVar.b();
        if (this.f21081a.c()) {
            o(charSequence, b5);
        }
        if (this.f21081a.d()) {
            p(charSequence, b5);
        }
        if (!this.f21081a.a()) {
            new org.ahocorasick.interval.c(b5).b(b5);
        }
        return b5;
    }

    public void n(CharSequence charSequence, k4.b bVar) {
        d dVar = this.f21082b;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            Character valueOf = Character.valueOf(charSequence.charAt(i5));
            if (this.f21081a.b()) {
                valueOf = Character.valueOf(Character.toLowerCase(valueOf.charValue()));
            }
            dVar = k(dVar, valueOf);
            if (q(i5, dVar, bVar) && this.f21081a.e()) {
                return;
            }
        }
    }

    public Collection<e> r(String str) {
        ArrayList arrayList = new ArrayList();
        int i5 = -1;
        for (org.ahocorasick.trie.a aVar : m(str)) {
            if (aVar.getStart() - i5 > 1) {
                arrayList.add(h(aVar, str, i5));
            }
            arrayList.add(i(aVar, str));
            i5 = aVar.getEnd();
        }
        if (str.length() - i5 > 1) {
            arrayList.add(h(null, str, i5));
        }
        return arrayList;
    }

    private f(g gVar) {
        this.f21081a = gVar;
        this.f21082b = new d();
    }
}
