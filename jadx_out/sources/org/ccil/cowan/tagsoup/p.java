package org.ccil.cowan.tagsoup;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import kotlin.text.k0;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.NamespaceSupport;
import org.xml.sax.helpers.XMLFilterImpl;

/* loaded from: classes4.dex */
public class p extends XMLFilterImpl implements LexicalHandler {
    public static final String A = "method";
    public static final String B = "omit-xml-declaration";
    public static final String C = "standalone";
    public static final String D = "version";

    /* renamed from: u, reason: collision with root package name */
    public static final String f21285u = "cdata-section-elements";

    /* renamed from: v, reason: collision with root package name */
    public static final String f21286v = "doctype-public";

    /* renamed from: w, reason: collision with root package name */
    public static final String f21287w = "doctype-system";

    /* renamed from: x, reason: collision with root package name */
    public static final String f21288x = "encoding";

    /* renamed from: y, reason: collision with root package name */
    public static final String f21289y = "indent";

    /* renamed from: z, reason: collision with root package name */
    public static final String f21290z = "media-type";

    /* renamed from: a, reason: collision with root package name */
    private String[] f21291a;

    /* renamed from: b, reason: collision with root package name */
    private final Attributes f21292b;

    /* renamed from: c, reason: collision with root package name */
    private Hashtable f21293c;

    /* renamed from: d, reason: collision with root package name */
    private Hashtable f21294d;

    /* renamed from: e, reason: collision with root package name */
    private Hashtable f21295e;

    /* renamed from: f, reason: collision with root package name */
    private int f21296f;

    /* renamed from: g, reason: collision with root package name */
    private Writer f21297g;

    /* renamed from: h, reason: collision with root package name */
    private NamespaceSupport f21298h;

    /* renamed from: i, reason: collision with root package name */
    private int f21299i;

    /* renamed from: j, reason: collision with root package name */
    private Properties f21300j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21301k;

    /* renamed from: l, reason: collision with root package name */
    private String f21302l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21303m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21304n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21305o;

    /* renamed from: p, reason: collision with root package name */
    private String f21306p;

    /* renamed from: q, reason: collision with root package name */
    private String f21307q;

    /* renamed from: r, reason: collision with root package name */
    private String f21308r;

    /* renamed from: s, reason: collision with root package name */
    private String f21309s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21310t;

    public p() {
        this.f21291a = new String[]{"checked", "compact", "declare", "defer", "disabled", "ismap", "multiple", "nohref", "noresize", "noshade", "nowrap", "readonly", "selected"};
        this.f21292b = new AttributesImpl();
        this.f21296f = 0;
        this.f21299i = 0;
        this.f21301k = false;
        this.f21302l = "";
        this.f21303m = false;
        this.f21304n = false;
        this.f21305o = false;
        this.f21306p = null;
        this.f21307q = null;
        this.f21308r = null;
        this.f21309s = null;
        this.f21310t = false;
        r(null);
    }

    private void A(Attributes attributes) throws SAXException {
        int length = attributes.getLength();
        for (int i5 = 0; i5 < length; i5++) {
            char[] charArray = attributes.getValue(i5).toCharArray();
            y(' ');
            D(attributes.getURI(i5), attributes.getLocalName(i5), attributes.getQName(i5), false);
            if (!this.f21303m || !a(attributes.getLocalName(i5), attributes.getQName(i5), attributes.getValue(i5))) {
                z("=\"");
                B(charArray, 0, charArray.length, true);
                y(k0.f19765b);
            } else {
                return;
            }
        }
    }

    private void B(char[] cArr, int i5, int i6, boolean z4) throws SAXException {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            char c5 = cArr[i7];
            if (c5 != '\"') {
                if (c5 != '&') {
                    if (c5 != '<') {
                        if (c5 != '>') {
                            if (!this.f21301k && c5 > 127) {
                                z("&#");
                                z(Integer.toString(cArr[i7]));
                                y(';');
                            } else {
                                y(c5);
                            }
                        } else {
                            z("&gt;");
                        }
                    } else {
                        z("&lt;");
                    }
                } else {
                    z("&amp;");
                }
            } else if (z4) {
                z("&quot;");
            } else {
                y(k0.f19765b);
            }
        }
    }

    private void C() throws SAXException {
        Enumeration declaredPrefixes = this.f21298h.getDeclaredPrefixes();
        while (declaredPrefixes.hasMoreElements()) {
            String str = (String) declaredPrefixes.nextElement();
            String uri = this.f21298h.getURI(str);
            if (uri == null) {
                uri = "";
            }
            char[] charArray = uri.toCharArray();
            y(' ');
            if ("".equals(str)) {
                z("xmlns=\"");
            } else {
                z("xmlns:");
                z(str);
                z("=\"");
            }
            B(charArray, 0, charArray.length, true);
            y(k0.f19765b);
        }
    }

    private void D(String str, String str2, String str3, boolean z4) throws SAXException {
        String f5 = f(str, str3, z4);
        if (f5 != null && !"".equals(f5)) {
            z(f5);
            y(':');
        }
        if (str2 != null && !"".equals(str2)) {
            z(str2);
        } else {
            z(str3.substring(str3.indexOf(58) + 1, str3.length()));
        }
    }

    private boolean a(String str, String str2, String str3) {
        int indexOf;
        if (str == null && (indexOf = str2.indexOf(58)) != -1) {
            str = str2.substring(indexOf + 1, str2.length());
        }
        if (!str.equals(str3)) {
            return false;
        }
        int i5 = 0;
        while (true) {
            String[] strArr = this.f21291a;
            if (i5 >= strArr.length) {
                return false;
            }
            if (str.equals(strArr[i5])) {
                return true;
            }
            i5++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r0 == null) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String f(java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            org.xml.sax.helpers.NamespaceSupport r0 = r5.f21298h
            java.lang.String r1 = ""
            java.lang.String r0 = r0.getURI(r1)
            boolean r2 = r1.equals(r6)
            r3 = 0
            if (r2 == 0) goto L19
            if (r8 == 0) goto L18
            if (r0 == 0) goto L18
            org.xml.sax.helpers.NamespaceSupport r6 = r5.f21298h
            r6.declarePrefix(r1, r1)
        L18:
            return r3
        L19:
            if (r8 == 0) goto L25
            if (r0 == 0) goto L25
            boolean r2 = r6.equals(r0)
            if (r2 == 0) goto L25
            r2 = r1
            goto L2b
        L25:
            org.xml.sax.helpers.NamespaceSupport r2 = r5.f21298h
            java.lang.String r2 = r2.getPrefix(r6)
        L2b:
            if (r2 == 0) goto L2e
            return r2
        L2e:
            java.util.Hashtable r2 = r5.f21295e
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L4b
            if (r8 == 0) goto L3c
            if (r0 == 0) goto L42
        L3c:
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto L4a
        L42:
            org.xml.sax.helpers.NamespaceSupport r4 = r5.f21298h
            java.lang.String r4 = r4.getURI(r2)
            if (r4 == 0) goto L4b
        L4a:
            r2 = r3
        L4b:
            if (r2 != 0) goto L6a
            java.util.Hashtable r2 = r5.f21293c
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L6a
            if (r8 == 0) goto L5b
            if (r0 == 0) goto L61
        L5b:
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto L6b
        L61:
            org.xml.sax.helpers.NamespaceSupport r4 = r5.f21298h
            java.lang.String r4 = r4.getURI(r2)
            if (r4 == 0) goto L6a
            goto L6b
        L6a:
            r3 = r2
        L6b:
            if (r3 != 0) goto L89
            if (r7 == 0) goto L89
            boolean r2 = r1.equals(r7)
            if (r2 != 0) goto L89
            r2 = 58
            int r2 = r7.indexOf(r2)
            r4 = -1
            if (r2 != r4) goto L83
            if (r8 == 0) goto L89
            if (r0 != 0) goto L89
            goto L8a
        L83:
            r8 = 0
            java.lang.String r1 = r7.substring(r8, r2)
            goto L8a
        L89:
            r1 = r3
        L8a:
            if (r1 == 0) goto La0
            org.xml.sax.helpers.NamespaceSupport r7 = r5.f21298h
            java.lang.String r7 = r7.getURI(r1)
            if (r7 == 0) goto L95
            goto La0
        L95:
            org.xml.sax.helpers.NamespaceSupport r7 = r5.f21298h
            r7.declarePrefix(r1, r6)
            java.util.Hashtable r7 = r5.f21295e
            r7.put(r6, r1)
            return r1
        La0:
            java.lang.StringBuffer r7 = new java.lang.StringBuffer
            r7.<init>()
            java.lang.String r8 = "__NS"
            r7.append(r8)
            int r8 = r5.f21299i
            int r8 = r8 + 1
            r5.f21299i = r8
            r7.append(r8)
            java.lang.String r1 = r7.toString()
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.ccil.cowan.tagsoup.p.f(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    private void o() {
        Enumeration keys = this.f21294d.keys();
        while (keys.hasMoreElements()) {
            f((String) keys.nextElement(), null, true);
        }
    }

    private void r(Writer writer) {
        t(writer);
        this.f21298h = new NamespaceSupport();
        this.f21293c = new Hashtable();
        this.f21294d = new Hashtable();
        this.f21295e = new Hashtable();
        this.f21300j = new Properties();
    }

    private void y(char c5) throws SAXException {
        try {
            this.f21297g.write(c5);
        } catch (IOException e5) {
            throw new SAXException(e5);
        }
    }

    private void z(String str) throws SAXException {
        try {
            this.f21297g.write(str);
        } catch (IOException e5) {
            throw new SAXException(e5);
        }
    }

    public void b(String str) throws SAXException {
        char[] charArray = str.toCharArray();
        characters(charArray, 0, charArray.length);
    }

    public void c(String str, String str2) throws SAXException {
        e("", str, "", this.f21292b, str2);
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i5, int i6) throws SAXException {
        if (!this.f21310t) {
            B(cArr, i5, i6, false);
        } else {
            for (int i7 = i5; i7 < i5 + i6; i7++) {
                y(cArr[i7]);
            }
        }
        super.characters(cArr, i5, i6);
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void comment(char[] cArr, int i5, int i6) throws SAXException {
        int i7;
        z("<!--");
        int i8 = i5;
        while (true) {
            int i9 = i5 + i6;
            if (i8 < i9) {
                y(cArr[i8]);
                if (cArr[i8] == '-' && (i7 = i8 + 1) <= i9 && cArr[i7] == '-') {
                    y(' ');
                }
                i8++;
            } else {
                z("-->");
                return;
            }
        }
    }

    public void d(String str, String str2, String str3) throws SAXException {
        e(str, str2, "", this.f21292b, str3);
    }

    public void e(String str, String str2, String str3, Attributes attributes, String str4) throws SAXException {
        startElement(str, str2, str3, attributes);
        b(str4);
        endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endCDATA() throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endDTD() throws SAXException {
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        y('\n');
        super.endDocument();
        try {
            l();
        } catch (IOException e5) {
            throw new SAXException(e5);
        }
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        if (!this.f21303m || ((!str.equals("http://www.w3.org/1999/xhtml") && !str.equals("")) || (!str3.equals("area") && !str3.equals("base") && !str3.equals("basefont") && !str3.equals("br") && !str3.equals("col") && !str3.equals(TypedValues.AttributesType.S_FRAME) && !str3.equals("hr") && !str3.equals("img") && !str3.equals("input") && !str3.equals("isindex") && !str3.equals("link") && !str3.equals(TTDownloadField.TT_META) && !str3.equals("param")))) {
            z("</");
            D(str, str2, str3, true);
            y(k0.f19769f);
        }
        this.f21310t = false;
        super.endElement(str, str2, str3);
        this.f21298h.popContext();
        this.f21296f--;
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endEntity(String str) throws SAXException {
    }

    public void g(String str) throws SAXException {
        i("", str, "", this.f21292b);
    }

    public void h(String str, String str2) throws SAXException {
        i(str, str2, "", this.f21292b);
    }

    public void i(String str, String str2, String str3, Attributes attributes) throws SAXException {
        this.f21298h.pushContext();
        y(k0.f19768e);
        D(str, str2, str3, true);
        A(attributes);
        if (this.f21296f == 1) {
            o();
        }
        C();
        z("/>");
        super.startElement(str, str2, str3, attributes);
        super.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i5, int i6) throws SAXException {
        B(cArr, i5, i6, false);
        super.ignorableWhitespace(cArr, i5, i6);
    }

    public void j(String str) throws SAXException {
        endElement("", str, "");
    }

    public void k(String str, String str2) throws SAXException {
        endElement(str, str2, "");
    }

    public void l() throws IOException {
        this.f21297g.flush();
    }

    public void m(String str) {
        this.f21294d.put(str, Boolean.TRUE);
    }

    public void n(String str, String str2) {
        v(str, str2);
        m(str);
    }

    public String p(String str) {
        return this.f21300j.getProperty(str);
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
        z("<?");
        z(str);
        y(' ');
        z(str2);
        z("?>");
        if (this.f21296f < 1) {
            y('\n');
        }
        super.processingInstruction(str, str2);
    }

    public String q(String str) {
        return (String) this.f21293c.get(str);
    }

    public void s() {
        this.f21296f = 0;
        this.f21299i = 0;
        this.f21298h.reset();
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startCDATA() throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startDTD(String str, String str2, String str3) throws SAXException {
        char c5;
        if (str == null || this.f21305o) {
            return;
        }
        this.f21305o = true;
        z("<!DOCTYPE ");
        z(str);
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.f21307q;
        if (str4 != null) {
            str3 = str4;
        }
        char c6 = k0.f19765b;
        if (str3.indexOf(34) != -1) {
            c5 = '\'';
        } else {
            c5 = '\"';
        }
        String str5 = this.f21306p;
        if (str5 != null) {
            str2 = str5;
        }
        if (str2 != null && !"".equals(str2)) {
            if (str2.indexOf(34) != -1) {
                c6 = '\'';
            }
            z(" PUBLIC ");
            y(c6);
            z(str2);
            y(c6);
            y(' ');
        } else {
            z(" SYSTEM ");
        }
        y(c5);
        z(str3);
        y(c5);
        z(">\n");
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        s();
        if (!"yes".equals(this.f21300j.getProperty(B, "no"))) {
            z("<?xml");
            if (this.f21308r == null) {
                z(" version=\"1.0\"");
            } else {
                z(" version=\"");
                z(this.f21308r);
                z("\"");
            }
            String str = this.f21302l;
            if (str != null && str != "") {
                z(" encoding=\"");
                z(this.f21302l);
                z("\"");
            }
            if (this.f21309s == null) {
                z(" standalone=\"yes\"?>\n");
            } else {
                z(" standalone=\"");
                z(this.f21309s);
                z("\"");
            }
        }
        super.startDocument();
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        String str4;
        this.f21296f++;
        this.f21298h.pushContext();
        if (this.f21304n && !this.f21305o) {
            if (str2 == null) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            startDTD(str4, "", "");
        }
        y(k0.f19768e);
        D(str, str2, str3, true);
        A(attributes);
        if (this.f21296f == 1) {
            o();
        }
        C();
        y(k0.f19769f);
        if (this.f21303m && (str3.equals("script") || str3.equals("style"))) {
            this.f21310t = true;
        }
        super.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startEntity(String str) throws SAXException {
    }

    public void t(Writer writer) {
        if (writer == null) {
            this.f21297g = new OutputStreamWriter(System.out);
        } else {
            this.f21297g = writer;
        }
    }

    public void u(String str, String str2) {
        this.f21300j.setProperty(str, str2);
        if (str.equals(f21288x)) {
            this.f21302l = str2;
            this.f21301k = str2.substring(0, 3).equalsIgnoreCase("utf");
            return;
        }
        if (str.equals("method")) {
            this.f21303m = str2.equals("html");
            return;
        }
        if (str.equals(f21286v)) {
            this.f21306p = str2;
            this.f21304n = true;
        } else if (str.equals(f21287w)) {
            this.f21307q = str2;
            this.f21304n = true;
        } else if (str.equals("version")) {
            this.f21308r = str2;
        } else if (str.equals(C)) {
            this.f21309s = str2;
        }
    }

    public void v(String str, String str2) {
        this.f21293c.put(str, str2);
    }

    public void w(String str) throws SAXException {
        startElement("", str, "", this.f21292b);
    }

    public void x(String str, String str2) throws SAXException {
        startElement(str, str2, "", this.f21292b);
    }

    public p(Writer writer) {
        this.f21291a = new String[]{"checked", "compact", "declare", "defer", "disabled", "ismap", "multiple", "nohref", "noresize", "noshade", "nowrap", "readonly", "selected"};
        this.f21292b = new AttributesImpl();
        this.f21296f = 0;
        this.f21299i = 0;
        this.f21301k = false;
        this.f21302l = "";
        this.f21303m = false;
        this.f21304n = false;
        this.f21305o = false;
        this.f21306p = null;
        this.f21307q = null;
        this.f21308r = null;
        this.f21309s = null;
        this.f21310t = false;
        r(writer);
    }

    public p(XMLReader xMLReader) {
        super(xMLReader);
        this.f21291a = new String[]{"checked", "compact", "declare", "defer", "disabled", "ismap", "multiple", "nohref", "noresize", "noshade", "nowrap", "readonly", "selected"};
        this.f21292b = new AttributesImpl();
        this.f21296f = 0;
        this.f21299i = 0;
        this.f21301k = false;
        this.f21302l = "";
        this.f21303m = false;
        this.f21304n = false;
        this.f21305o = false;
        this.f21306p = null;
        this.f21307q = null;
        this.f21308r = null;
        this.f21309s = null;
        this.f21310t = false;
        r(null);
    }

    public p(XMLReader xMLReader, Writer writer) {
        super(xMLReader);
        this.f21291a = new String[]{"checked", "compact", "declare", "defer", "disabled", "ismap", "multiple", "nohref", "noresize", "noshade", "nowrap", "readonly", "selected"};
        this.f21292b = new AttributesImpl();
        this.f21296f = 0;
        this.f21299i = 0;
        this.f21301k = false;
        this.f21302l = "";
        this.f21303m = false;
        this.f21304n = false;
        this.f21305o = false;
        this.f21306p = null;
        this.f21307q = null;
        this.f21308r = null;
        this.f21309s = null;
        this.f21310t = false;
        r(writer);
    }
}
