package com.github.promeg.pinyinhelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.y1;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    static org.ahocorasick.trie.f f6904a;

    /* renamed from: b, reason: collision with root package name */
    static j f6905b;

    /* renamed from: c, reason: collision with root package name */
    static List<h> f6906c;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        j f6907a;

        /* renamed from: b, reason: collision with root package name */
        List<h> f6908b;

        List<h> a() {
            return this.f6908b;
        }

        j b() {
            return this.f6907a;
        }

        boolean c() {
            return (a() == null || b() == null) ? false : true;
        }

        public b d(h hVar) {
            if (hVar != null) {
                List<h> list = this.f6908b;
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f6908b = arrayList;
                    arrayList.add(hVar);
                } else if (!list.contains(hVar)) {
                    this.f6908b.add(hVar);
                }
            }
            return this;
        }

        private b(List<h> list) {
            if (list != null) {
                this.f6908b = new ArrayList(list);
            }
            this.f6907a = new com.github.promeg.pinyinhelper.b();
        }
    }

    private c() {
    }

    public static void a(h hVar) {
        if (hVar != null && hVar.a() != null && hVar.a().size() != 0) {
            d(new b(f6906c).d(hVar));
        }
    }

    private static short b(byte[] bArr, byte[] bArr2, int i5) {
        int i6 = i5 % 8;
        short s5 = (short) (bArr2[i5] & y1.f19838d);
        if ((bArr[i5 / 8] & g.f6921g[i6]) != 0) {
            return (short) (s5 | 256);
        }
        return s5;
    }

    private static int c(char c5) {
        int i5 = c5 - 19968;
        if (i5 >= 0 && i5 < 7000) {
            return b(d.f6909a, d.f6910b, i5);
        }
        if (7000 <= i5 && i5 < 14000) {
            return b(e.f6911a, e.f6912b, i5 - 7000);
        }
        return b(f.f6913a, f.f6914b, i5 - 14000);
    }

    public static void d(b bVar) {
        if (bVar == null) {
            f6906c = null;
            f6904a = null;
            f6905b = null;
        } else {
            if (!bVar.c()) {
                return;
            }
            f6906c = Collections.unmodifiableList(bVar.a());
            f6904a = k.a(bVar.a());
            f6905b = bVar.b();
        }
    }

    public static boolean e(char c5) {
        return (19968 <= c5 && c5 <= 40869 && c(c5) > 0) || 12295 == c5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b f() {
        return new b(null);
    }

    public static String g(char c5) {
        if (e(c5)) {
            if (c5 == 12295) {
                return "LING";
            }
            return g.f6923i[c(c5)];
        }
        return String.valueOf(c5);
    }

    public static String h(String str, String str2) {
        return com.github.promeg.pinyinhelper.a.b(str, f6904a, f6906c, str2, f6905b);
    }
}
