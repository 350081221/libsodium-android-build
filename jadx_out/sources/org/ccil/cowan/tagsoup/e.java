package org.ccil.cowan.tagsoup;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private String f21144a;

    /* renamed from: b, reason: collision with root package name */
    private String f21145b;

    /* renamed from: c, reason: collision with root package name */
    private String f21146c;

    /* renamed from: d, reason: collision with root package name */
    private int f21147d;

    /* renamed from: e, reason: collision with root package name */
    private int f21148e;

    /* renamed from: f, reason: collision with root package name */
    private int f21149f;

    /* renamed from: g, reason: collision with root package name */
    private a f21150g = new a();

    /* renamed from: h, reason: collision with root package name */
    private e f21151h;

    /* renamed from: i, reason: collision with root package name */
    private o f21152i;

    public e(String str, int i5, int i6, int i7, o oVar) {
        this.f21144a = str;
        this.f21147d = i5;
        this.f21148e = i6;
        this.f21149f = i7;
        this.f21152i = oVar;
        this.f21145b = j(str, false);
        this.f21146c = e(str);
    }

    public static String k(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        if (trim.indexOf("  ") == -1) {
            return trim;
        }
        int length = trim.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        boolean z4 = false;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = trim.charAt(i5);
            if (charAt == ' ') {
                if (!z4) {
                    stringBuffer.append(charAt);
                }
                z4 = true;
            } else {
                stringBuffer.append(charAt);
                z4 = false;
            }
        }
        return stringBuffer.toString();
    }

    public a a() {
        return this.f21150g;
    }

    public boolean b(e eVar) {
        return (eVar.f21148e & this.f21147d) != 0;
    }

    public int c() {
        return this.f21149f;
    }

    public String d() {
        return this.f21146c;
    }

    public String e(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            return str;
        }
        return str.substring(indexOf + 1).intern();
    }

    public int f() {
        return this.f21148e;
    }

    public int g() {
        return this.f21147d;
    }

    public String h() {
        return this.f21144a;
    }

    public String i() {
        return this.f21145b;
    }

    public String j(String str, boolean z4) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            if (z4) {
                return "";
            }
            return this.f21152i.g();
        }
        String substring = str.substring(0, indexOf);
        if (substring.equals("xml")) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("urn:x-prefix:");
        stringBuffer.append(substring);
        return stringBuffer.toString().intern();
    }

    public e l() {
        return this.f21151h;
    }

    public o m() {
        return this.f21152i;
    }

    public void n(String str, String str2, String str3) {
        o(this.f21150g, str, str2, str3);
    }

    public void o(a aVar, String str, String str2, String str3) {
        String str4;
        if (!str.equals("xmlns") && !str.startsWith("xmlns:")) {
            String j5 = j(str, true);
            String e5 = e(str);
            int index = aVar.getIndex(str);
            if (index == -1) {
                String intern = str.intern();
                if (str2 == null) {
                    str4 = "CDATA";
                } else {
                    str4 = str2;
                }
                if (!str4.equals("CDATA")) {
                    str3 = k(str3);
                }
                aVar.a(j5, e5, intern, str4, str3);
                return;
            }
            if (str2 == null) {
                str2 = aVar.getType(index);
            }
            String str5 = str2;
            if (!str5.equals("CDATA")) {
                str3 = k(str3);
            }
            aVar.f(index, j5, e5, str, str5, str3);
        }
    }

    public void p(int i5) {
        this.f21149f = i5;
    }

    public void q(int i5) {
        this.f21148e = i5;
    }

    public void r(int i5) {
        this.f21147d = i5;
    }

    public void s(e eVar) {
        this.f21151h = eVar;
    }
}
