package org.ccil.cowan.tagsoup;

import com.android.multidex.ClassPathElement;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.text.k0;
import okio.q1;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes4.dex */
public class l extends DefaultHandler implements m, XMLReader, LexicalHandler {
    private static boolean F = true;
    private static boolean G = false;
    private static boolean H = false;
    private static boolean I = true;
    private static boolean J = true;
    private static boolean K = false;
    private static boolean L = true;
    private static boolean M = false;
    private static boolean N = true;
    public static final String O = "http://xml.org/sax/features/namespaces";
    public static final String P = "http://xml.org/sax/features/namespace-prefixes";
    public static final String Q = "http://xml.org/sax/features/external-general-entities";
    public static final String R = "http://xml.org/sax/features/external-parameter-entities";
    public static final String S = "http://xml.org/sax/features/is-standalone";
    public static final String T = "http://xml.org/sax/features/lexical-handler/parameter-entities";
    public static final String U = "http://xml.org/sax/features/resolve-dtd-uris";
    public static final String V = "http://xml.org/sax/features/string-interning";
    public static final String W = "http://xml.org/sax/features/use-attributes2";
    public static final String X = "http://xml.org/sax/features/use-locator2";
    public static final String Y = "http://xml.org/sax/features/use-entity-resolver2";
    public static final String Z = "http://xml.org/sax/features/validation";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f21238a0 = "http://xml.org/sax/features/unicode-normalization-checking";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f21239b0 = "http://xml.org/sax/features/xmlns-uris";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f21240c0 = "http://xml.org/sax/features/xml-1.1";

    /* renamed from: d0, reason: collision with root package name */
    public static final String f21241d0 = "http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons";

    /* renamed from: e0, reason: collision with root package name */
    public static final String f21242e0 = "http://www.ccil.org/~cowan/tagsoup/features/bogons-empty";

    /* renamed from: f0, reason: collision with root package name */
    public static final String f21243f0 = "http://www.ccil.org/~cowan/tagsoup/features/root-bogons";

    /* renamed from: g0, reason: collision with root package name */
    public static final String f21244g0 = "http://www.ccil.org/~cowan/tagsoup/features/default-attributes";

    /* renamed from: h0, reason: collision with root package name */
    public static final String f21245h0 = "http://www.ccil.org/~cowan/tagsoup/features/translate-colons";

    /* renamed from: i0, reason: collision with root package name */
    public static final String f21246i0 = "http://www.ccil.org/~cowan/tagsoup/features/restart-elements";

    /* renamed from: j0, reason: collision with root package name */
    public static final String f21247j0 = "http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace";

    /* renamed from: k0, reason: collision with root package name */
    public static final String f21248k0 = "http://www.ccil.org/~cowan/tagsoup/features/cdata-elements";

    /* renamed from: l0, reason: collision with root package name */
    public static final String f21249l0 = "http://xml.org/sax/properties/lexical-handler";

    /* renamed from: m0, reason: collision with root package name */
    public static final String f21250m0 = "http://www.ccil.org/~cowan/tagsoup/properties/scanner";

    /* renamed from: n0, reason: collision with root package name */
    public static final String f21251n0 = "http://www.ccil.org/~cowan/tagsoup/properties/schema";

    /* renamed from: o0, reason: collision with root package name */
    public static final String f21252o0 = "http://www.ccil.org/~cowan/tagsoup/properties/auto-detector";

    /* renamed from: p0, reason: collision with root package name */
    private static char[] f21253p0 = {k0.f19768e, ClassPathElement.SEPARATOR_CHAR, k0.f19769f};

    /* renamed from: q0, reason: collision with root package name */
    private static String f21254q0 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-'()+,./:=?;!*#@$_%";
    private d A;
    private d B;
    private int C;
    private boolean D;
    private char[] E;

    /* renamed from: f, reason: collision with root package name */
    private o f21260f;

    /* renamed from: g, reason: collision with root package name */
    private n f21261g;

    /* renamed from: h, reason: collision with root package name */
    private b f21262h;

    /* renamed from: r, reason: collision with root package name */
    private HashMap f21272r;

    /* renamed from: s, reason: collision with root package name */
    private d f21273s;

    /* renamed from: t, reason: collision with root package name */
    private String f21274t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f21275u;

    /* renamed from: v, reason: collision with root package name */
    private String f21276v;

    /* renamed from: w, reason: collision with root package name */
    private String f21277w;

    /* renamed from: x, reason: collision with root package name */
    private String f21278x;

    /* renamed from: y, reason: collision with root package name */
    private String f21279y;

    /* renamed from: z, reason: collision with root package name */
    private d f21280z;

    /* renamed from: a, reason: collision with root package name */
    private ContentHandler f21255a = this;

    /* renamed from: b, reason: collision with root package name */
    private LexicalHandler f21256b = this;

    /* renamed from: c, reason: collision with root package name */
    private DTDHandler f21257c = this;

    /* renamed from: d, reason: collision with root package name */
    private ErrorHandler f21258d = this;

    /* renamed from: e, reason: collision with root package name */
    private EntityResolver f21259e = this;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21263i = F;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21264j = G;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21265k = H;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21266l = I;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21267m = J;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21268n = K;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21269o = L;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21270p = M;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21271q = N;

    public l() {
        HashMap hashMap = new HashMap();
        this.f21272r = hashMap;
        hashMap.put(O, I(F));
        HashMap hashMap2 = this.f21272r;
        Boolean bool = Boolean.FALSE;
        hashMap2.put(P, bool);
        this.f21272r.put(Q, bool);
        this.f21272r.put(R, bool);
        this.f21272r.put(S, bool);
        this.f21272r.put(T, bool);
        HashMap hashMap3 = this.f21272r;
        Boolean bool2 = Boolean.TRUE;
        hashMap3.put(U, bool2);
        this.f21272r.put(V, bool2);
        this.f21272r.put(W, bool);
        this.f21272r.put(X, bool);
        this.f21272r.put(Y, bool);
        this.f21272r.put(Z, bool);
        this.f21272r.put(f21239b0, bool);
        this.f21272r.put(f21239b0, bool);
        this.f21272r.put(f21240c0, bool);
        this.f21272r.put(f21241d0, I(G));
        this.f21272r.put(f21242e0, I(H));
        this.f21272r.put(f21243f0, I(I));
        this.f21272r.put(f21244g0, I(J));
        this.f21272r.put(f21245h0, I(K));
        this.f21272r.put(f21246i0, I(L));
        this.f21272r.put(f21247j0, I(M));
        this.f21272r.put(f21248k0, I(N));
        this.f21273s = null;
        this.f21274t = null;
        this.f21275u = false;
        this.f21276v = null;
        this.f21277w = null;
        this.f21278x = null;
        this.f21279y = null;
        this.f21280z = null;
        this.A = null;
        this.B = null;
        this.C = 0;
        this.D = true;
        this.E = new char[2000];
    }

    private String A(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        return "";
    }

    private void B(d dVar) throws SAXException {
        String j5 = dVar.j();
        String g5 = dVar.g();
        String k5 = dVar.k();
        String A = A(j5);
        dVar.d();
        if (!this.f21263i) {
            g5 = "";
            k5 = "";
        }
        if (this.D && g5.equalsIgnoreCase(this.f21278x)) {
            try {
                this.f21259e.resolveEntity(this.f21276v, this.f21277w);
            } catch (IOException unused) {
            }
        }
        if (u(A, k5)) {
            this.f21255a.startPrefixMapping(A, k5);
        }
        a b5 = dVar.b();
        int length = b5.getLength();
        for (int i5 = 0; i5 < length; i5++) {
            String uri = b5.getURI(i5);
            String A2 = A(b5.getQName(i5));
            if (u(A2, uri)) {
                this.f21255a.startPrefixMapping(A2, uri);
            }
        }
        this.f21255a.startElement(k5, g5, j5, dVar.b());
        dVar.p(this.f21280z);
        this.f21280z = dVar;
        this.D = false;
        if (this.f21271q && (dVar.e() & 2) != 0) {
            this.f21261g.startCDATA();
        }
    }

    private void C(d dVar) throws SAXException {
        d dVar2;
        e m5;
        while (true) {
            dVar2 = this.f21280z;
            while (dVar2 != null && !dVar2.c(dVar)) {
                dVar2 = dVar2.l();
            }
            if (dVar2 == null && (m5 = dVar.m()) != null) {
                d dVar3 = new d(m5, this.f21267m);
                dVar3.p(dVar);
                dVar = dVar3;
            }
        }
        if (dVar2 == null) {
            return;
        }
        while (true) {
            d dVar4 = this.f21280z;
            if (dVar4 == dVar2 || dVar4 == null || dVar4.l() == null || this.f21280z.l().l() == null) {
                break;
            } else {
                E();
            }
        }
        while (dVar != null) {
            d l5 = dVar.l();
            if (!dVar.j().equals("<pcdata>")) {
                B(dVar);
            }
            D(l5);
            dVar = l5;
        }
        this.f21273s = null;
    }

    private void D(d dVar) throws SAXException {
        while (true) {
            d dVar2 = this.A;
            if (dVar2 != null && this.f21280z.c(dVar2)) {
                if (dVar == null || this.A.c(dVar)) {
                    d l5 = this.A.l();
                    B(this.A);
                    this.A = l5;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void E() throws SAXException {
        d dVar = this.f21280z;
        z();
        if (this.f21269o && (dVar.e() & 1) != 0) {
            dVar.a();
            dVar.p(this.A);
            this.A = dVar;
        }
    }

    private void F() {
        if (this.f21260f == null) {
            this.f21260f = new h();
        }
        if (this.f21261g == null) {
            this.f21261g = new g();
        }
        if (this.f21262h == null) {
            this.f21262h = new k(this);
        }
        this.f21280z = new d(this.f21260f.d("<root>"), this.f21267m);
        this.B = new d(this.f21260f.d("<pcdata>"), this.f21267m);
        this.f21273s = null;
        this.f21274t = null;
        this.f21279y = null;
        this.A = null;
        this.C = 0;
        this.D = true;
        this.f21277w = null;
        this.f21276v = null;
        this.f21278x = null;
    }

    private static String[] G(String str) throws IllegalArgumentException {
        String trim = str.trim();
        if (trim.length() == 0) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        int length = trim.length();
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        char c5 = 0;
        boolean z5 = false;
        while (i5 < length) {
            char charAt = trim.charAt(i5);
            if (!z4 && charAt == '\'' && c5 != '\\') {
                z5 = !z5;
                if (i6 >= 0) {
                    i5++;
                    c5 = charAt;
                }
                i6 = i5;
                i5++;
                c5 = charAt;
            } else if (!z5 && charAt == '\"' && c5 != '\\') {
                z4 = !z4;
                if (i6 >= 0) {
                    i5++;
                    c5 = charAt;
                }
                i6 = i5;
                i5++;
                c5 = charAt;
            } else {
                if (!z5 && !z4) {
                    if (Character.isWhitespace(charAt)) {
                        if (i6 >= 0) {
                            arrayList.add(trim.substring(i6, i5));
                        }
                        i6 = -1;
                    } else if (i6 < 0) {
                        if (charAt == ' ') {
                        }
                        i6 = i5;
                    }
                }
                i5++;
                c5 = charAt;
            }
        }
        arrayList.add(trim.substring(i6, i5));
        return (String[]) arrayList.toArray(new String[0]);
    }

    private static String H(String str) {
        if (str == null) {
            return str;
        }
        int length = str.length();
        if (length == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if (charAt == str.charAt(length - 1)) {
            if (charAt == '\'' || charAt == '\"') {
                return str.substring(1, str.length() - 1);
            }
            return str;
        }
        return str;
    }

    private static Boolean I(boolean z4) {
        return z4 ? Boolean.TRUE : Boolean.FALSE;
    }

    private String q(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        boolean z4 = true;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (f21254q0.indexOf(charAt) != -1) {
                stringBuffer.append(charAt);
                z4 = false;
            } else if (!z4) {
                stringBuffer.append(' ');
                z4 = true;
            }
        }
        return stringBuffer.toString().trim();
    }

    private String t(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        int i5 = -1;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            int i8 = i6 + 1;
            cArr[i6] = charAt;
            if (charAt == '&' && i5 == -1) {
                i6 = i8;
                i5 = i6;
            } else {
                if (i5 != -1 && !Character.isLetter(charAt) && !Character.isDigit(charAt) && charAt != '#') {
                    if (charAt == ';') {
                        int x4 = x(cArr, i5, (i8 - i5) - 1);
                        if (x4 > 65535) {
                            int i9 = x4 - 65536;
                            cArr[i5 - 1] = (char) ((i9 >> 10) + 55296);
                            cArr[i5] = (char) ((i9 & 1023) + q1.f21025e);
                            i5++;
                        } else if (x4 != 0) {
                            cArr[i5 - 1] = (char) x4;
                        } else {
                            i5 = i8;
                        }
                        i6 = i5;
                        i5 = -1;
                    } else {
                        i5 = -1;
                    }
                }
                i6 = i8;
            }
        }
        return new String(cArr, 0, i6);
    }

    private boolean u(String str, String str2) {
        if (!str.equals("") && !str2.equals("") && !str2.equals(this.f21260f.g())) {
            return true;
        }
        return false;
    }

    private InputStream v(String str, String str2) throws IOException, SAXException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(System.getProperty("user.dir"));
        stringBuffer.append("/.");
        return new URL(new URL("file", "", stringBuffer.toString()), str2).openConnection().getInputStream();
    }

    private Reader w(InputSource inputSource) throws SAXException, IOException {
        Reader characterStream = inputSource.getCharacterStream();
        InputStream byteStream = inputSource.getByteStream();
        String encoding = inputSource.getEncoding();
        String publicId = inputSource.getPublicId();
        String systemId = inputSource.getSystemId();
        if (characterStream == null) {
            if (byteStream == null) {
                byteStream = v(publicId, systemId);
            }
            if (encoding == null) {
                return this.f21262h.a(byteStream);
            }
            try {
                return new InputStreamReader(byteStream, encoding);
            } catch (UnsupportedEncodingException unused) {
                return new InputStreamReader(byteStream);
            }
        }
        return characterStream;
    }

    private int x(char[] cArr, int i5, int i6) {
        char c5;
        if (i6 < 1) {
            return 0;
        }
        if (cArr[i5] == '#') {
            if (i6 > 1 && ((c5 = cArr[i5 + 1]) == 'x' || c5 == 'X')) {
                try {
                    return Integer.parseInt(new String(cArr, i5 + 2, i6 - 2), 16);
                } catch (NumberFormatException unused) {
                    return 0;
                }
            }
            try {
                return Integer.parseInt(new String(cArr, i5 + 1, i6 - 1), 10);
            } catch (NumberFormatException unused2) {
                return 0;
            }
        }
        return this.f21260f.e(new String(cArr, i5, i6));
    }

    private String y(char[] cArr, int i5, int i6) {
        StringBuffer stringBuffer = new StringBuffer(i6 + 2);
        boolean z4 = false;
        boolean z5 = true;
        while (true) {
            int i7 = i6 - 1;
            char c5 = '_';
            if (i6 <= 0) {
                break;
            }
            char c6 = cArr[i5];
            if (!Character.isLetter(c6) && c6 != '_') {
                if (!Character.isDigit(c6) && c6 != '-' && c6 != '.') {
                    if (c6 == ':' && !z4) {
                        if (z5) {
                            stringBuffer.append('_');
                        }
                        if (!this.f21268n) {
                            c5 = c6;
                        }
                        stringBuffer.append(c5);
                        z5 = true;
                        z4 = true;
                    }
                    i5++;
                    i6 = i7;
                } else {
                    if (z5) {
                        stringBuffer.append('_');
                    }
                    stringBuffer.append(c6);
                }
            } else {
                stringBuffer.append(c6);
            }
            z5 = false;
            i5++;
            i6 = i7;
        }
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == ':') {
            stringBuffer.append('_');
        }
        return stringBuffer.toString().intern();
    }

    private void z() throws SAXException {
        d dVar = this.f21280z;
        if (dVar == null) {
            return;
        }
        String j5 = dVar.j();
        String g5 = this.f21280z.g();
        String k5 = this.f21280z.k();
        String A = A(j5);
        if (!this.f21263i) {
            g5 = "";
            k5 = "";
        }
        this.f21255a.endElement(k5, g5, j5);
        if (u(A, k5)) {
            this.f21255a.endPrefixMapping(A);
        }
        a b5 = this.f21280z.b();
        for (int length = b5.getLength() - 1; length >= 0; length--) {
            String uri = b5.getURI(length);
            String A2 = A(b5.getQName(length));
            if (u(A2, uri)) {
                this.f21255a.endPrefixMapping(A2);
            }
        }
        this.f21280z = this.f21280z.l();
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void a(char[] cArr, int i5, int i6) throws SAXException {
        if (this.f21273s != null) {
            return;
        }
        this.f21279y = y(cArr, i5, i6).replace(':', '_');
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void b(char[] cArr, int i5, int i6) throws SAXException {
        this.C = x(cArr, i5, i6);
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void c(char[] cArr, int i5, int i6) throws SAXException {
        this.f21256b.startCDATA();
        g(cArr, i5, i6);
        this.f21256b.endCDATA();
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void comment(char[] cArr, int i5, int i6) throws SAXException {
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void d(char[] cArr, int i5, int i6) throws SAXException {
        String str;
        d dVar = this.f21273s;
        if (dVar != null && (str = this.f21274t) != null) {
            dVar.o(str, null, str);
            this.f21274t = null;
        }
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void e(char[] cArr, int i5, int i6) throws SAXException {
        if (this.f21273s != null && this.f21274t != null) {
            this.f21273s.o(this.f21274t, null, t(new String(cArr, i5, i6)));
            this.f21274t = null;
        }
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endCDATA() throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endDTD() throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endEntity(String str) throws SAXException {
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void f(char[] cArr, int i5, int i6) throws SAXException {
        String y4;
        int i7;
        if (this.f21273s != null || (y4 = y(cArr, i5, i6)) == null) {
            return;
        }
        e d5 = this.f21260f.d(y4);
        if (d5 == null) {
            if (this.f21264j) {
                return;
            }
            int i8 = -1;
            if (this.f21265k) {
                i7 = 0;
            } else {
                i7 = -1;
            }
            if (!this.f21266l) {
                i8 = Integer.MAX_VALUE;
            }
            this.f21260f.b(y4, i7, i8, 0);
            if (!this.f21266l) {
                o oVar = this.f21260f;
                oVar.h(y4, oVar.i().h());
            }
            d5 = this.f21260f.d(y4);
        }
        this.f21273s = new d(d5, this.f21267m);
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void g(char[] cArr, int i5, int i6) throws SAXException {
        if (i6 == 0) {
            return;
        }
        boolean z4 = true;
        for (int i7 = 0; i7 < i6; i7++) {
            if (!Character.isWhitespace(cArr[i5 + i7])) {
                z4 = false;
            }
        }
        if (z4 && !this.f21280z.c(this.B)) {
            if (this.f21270p) {
                this.f21255a.ignorableWhitespace(cArr, i5, i6);
            }
        } else {
            C(this.B);
            this.f21255a.characters(cArr, i5, i6);
        }
    }

    @Override // org.xml.sax.XMLReader
    public ContentHandler getContentHandler() {
        ContentHandler contentHandler = this.f21255a;
        if (contentHandler == this) {
            return null;
        }
        return contentHandler;
    }

    @Override // org.xml.sax.XMLReader
    public DTDHandler getDTDHandler() {
        DTDHandler dTDHandler = this.f21257c;
        if (dTDHandler == this) {
            return null;
        }
        return dTDHandler;
    }

    @Override // org.xml.sax.XMLReader
    public EntityResolver getEntityResolver() {
        EntityResolver entityResolver = this.f21259e;
        if (entityResolver == this) {
            return null;
        }
        return entityResolver;
    }

    @Override // org.xml.sax.XMLReader
    public ErrorHandler getErrorHandler() {
        ErrorHandler errorHandler = this.f21258d;
        if (errorHandler == this) {
            return null;
        }
        return errorHandler;
    }

    @Override // org.xml.sax.XMLReader
    public boolean getFeature(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        Boolean bool = (Boolean) this.f21272r.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unknown feature ");
        stringBuffer.append(str);
        throw new SAXNotRecognizedException(stringBuffer.toString());
    }

    @Override // org.xml.sax.XMLReader
    public Object getProperty(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (str.equals(f21249l0)) {
            LexicalHandler lexicalHandler = this.f21256b;
            if (lexicalHandler == this) {
                return null;
            }
            return lexicalHandler;
        }
        if (str.equals(f21250m0)) {
            return this.f21261g;
        }
        if (str.equals(f21251n0)) {
            return this.f21260f;
        }
        if (str.equals(f21252o0)) {
            return this.f21262h;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unknown property ");
        stringBuffer.append(str);
        throw new SAXNotRecognizedException(stringBuffer.toString());
    }

    @Override // org.ccil.cowan.tagsoup.m
    public int h() {
        return this.C;
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void i(char[] cArr, int i5, int i6) throws SAXException {
        d dVar = this.f21273s;
        if (dVar == null) {
            return;
        }
        C(dVar);
        r(cArr, i5, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // org.ccil.cowan.tagsoup.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(char[] r5, int r6, int r7) throws org.xml.sax.SAXException {
        /*
            r4 = this;
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r6, r7)
            java.lang.String[] r5 = G(r0)
            int r6 = r5.length
            r7 = 0
            if (r6 <= 0) goto L52
            r6 = 0
            r6 = r5[r6]
            java.lang.String r0 = "DOCTYPE"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 == 0) goto L52
            boolean r6 = r4.f21275u
            if (r6 == 0) goto L1d
            return
        L1d:
            r6 = 1
            r4.f21275u = r6
            int r0 = r5.length
            if (r0 <= r6) goto L52
            r6 = r5[r6]
            int r0 = r5.length
            r1 = 2
            r2 = 3
            if (r0 <= r2) goto L37
            java.lang.String r0 = "SYSTEM"
            r3 = r5[r1]
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L37
            r5 = r5[r2]
            goto L54
        L37:
            int r0 = r5.length
            if (r0 <= r2) goto L50
            java.lang.String r0 = "PUBLIC"
            r1 = r5[r1]
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
            r7 = r5[r2]
            int r0 = r5.length
            r1 = 4
            if (r0 <= r1) goto L4d
            r5 = r5[r1]
            goto L54
        L4d:
            java.lang.String r5 = ""
            goto L54
        L50:
            r5 = r7
            goto L54
        L52:
            r5 = r7
            r6 = r5
        L54:
            java.lang.String r7 = H(r7)
            java.lang.String r5 = H(r5)
            if (r6 == 0) goto L90
            java.lang.String r7 = r4.q(r7)
            org.xml.sax.ext.LexicalHandler r0 = r4.f21256b
            r0.startDTD(r6, r7, r5)
            org.xml.sax.ext.LexicalHandler r0 = r4.f21256b
            r0.endDTD()
            r4.f21278x = r6
            r4.f21276v = r7
            org.ccil.cowan.tagsoup.n r6 = r4.f21261g
            boolean r7 = r6 instanceof org.xml.sax.Locator
            if (r7 == 0) goto L90
            org.xml.sax.Locator r6 = (org.xml.sax.Locator) r6
            java.lang.String r6 = r6.getSystemId()
            r4.f21277w = r6
            java.net.URL r6 = new java.net.URL     // Catch: java.lang.Exception -> L90
            java.net.URL r7 = new java.net.URL     // Catch: java.lang.Exception -> L90
            java.lang.String r0 = r4.f21277w     // Catch: java.lang.Exception -> L90
            r7.<init>(r0)     // Catch: java.lang.Exception -> L90
            r6.<init>(r7, r5)     // Catch: java.lang.Exception -> L90
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Exception -> L90
            r4.f21277w = r5     // Catch: java.lang.Exception -> L90
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.ccil.cowan.tagsoup.l.j(char[], int, int):void");
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void k(char[] cArr, int i5, int i6) throws SAXException {
        if (this.D) {
            C(this.B);
        }
        while (this.f21280z.l() != null) {
            z();
        }
        if (!this.f21260f.g().equals("")) {
            this.f21255a.endPrefixMapping(this.f21260f.f());
        }
        this.f21255a.endDocument();
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void l(char[] cArr, int i5, int i6) throws SAXException {
        String str;
        if (this.f21273s != null || (str = this.f21279y) == null || "xml".equalsIgnoreCase(str)) {
            return;
        }
        if (i6 > 0 && cArr[i6 - 1] == '?') {
            i6--;
        }
        this.f21255a.processingInstruction(this.f21279y, new String(cArr, i5, i6));
        this.f21279y = null;
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void m(char[] cArr, int i5, int i6) throws SAXException {
        if (s(cArr, i5, i6)) {
            return;
        }
        r(cArr, i5, i6);
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void n(char[] cArr, int i5, int i6) throws SAXException {
        this.f21256b.comment(cArr, i5, i6);
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void o(char[] cArr, int i5, int i6) throws SAXException {
        if (this.f21273s == null) {
            return;
        }
        this.f21274t = y(cArr, i5, i6).toLowerCase();
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void p(char[] cArr, int i5, int i6) throws SAXException {
        d dVar = this.f21273s;
        if (dVar == null) {
            return;
        }
        C(dVar);
        if (this.f21280z.i() == 0) {
            r(cArr, i5, i6);
        }
    }

    @Override // org.xml.sax.XMLReader
    public void parse(InputSource inputSource) throws IOException, SAXException {
        F();
        Reader w4 = w(inputSource);
        this.f21255a.startDocument();
        this.f21261g.b(inputSource.getPublicId(), inputSource.getSystemId());
        n nVar = this.f21261g;
        if (nVar instanceof Locator) {
            this.f21255a.setDocumentLocator((Locator) nVar);
        }
        if (!this.f21260f.g().equals("")) {
            this.f21255a.startPrefixMapping(this.f21260f.f(), this.f21260f.g());
        }
        this.f21261g.a(w4, this);
    }

    public void r(char[] cArr, int i5, int i6) throws SAXException {
        String j5;
        this.f21273s = null;
        if (i6 != 0) {
            e d5 = this.f21260f.d(y(cArr, i5, i6));
            if (d5 == null) {
                return;
            } else {
                j5 = d5.h();
            }
        } else {
            j5 = this.f21280z.j();
        }
        d dVar = this.f21280z;
        boolean z4 = false;
        while (dVar != null && !dVar.j().equals(j5)) {
            if ((dVar.e() & 4) != 0) {
                z4 = true;
            }
            dVar = dVar.l();
        }
        if (dVar != null && dVar.l() != null && dVar.l().l() != null) {
            if (z4) {
                dVar.n();
            } else {
                while (this.f21280z != dVar) {
                    E();
                }
                z();
            }
            while (this.f21280z.f()) {
                z();
            }
            D(null);
        }
    }

    public boolean s(char[] cArr, int i5, int i6) throws SAXException {
        boolean z4;
        String j5 = this.f21280z.j();
        if (this.f21271q && (this.f21280z.e() & 2) != 0) {
            if (i6 == j5.length()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i6) {
                        break;
                    }
                    if (Character.toLowerCase(cArr[i5 + i7]) != Character.toLowerCase(j5.charAt(i7))) {
                        z4 = false;
                        break;
                    }
                    i7++;
                }
            }
            if (!z4) {
                this.f21255a.characters(f21253p0, 0, 2);
                this.f21255a.characters(cArr, i5, i6);
                this.f21255a.characters(f21253p0, 2, 1);
                this.f21261g.startCDATA();
                return true;
            }
        }
        return false;
    }

    @Override // org.xml.sax.XMLReader
    public void setContentHandler(ContentHandler contentHandler) {
        if (contentHandler == null) {
            contentHandler = this;
        }
        this.f21255a = contentHandler;
    }

    @Override // org.xml.sax.XMLReader
    public void setDTDHandler(DTDHandler dTDHandler) {
        if (dTDHandler == null) {
            dTDHandler = this;
        }
        this.f21257c = dTDHandler;
    }

    @Override // org.xml.sax.XMLReader
    public void setEntityResolver(EntityResolver entityResolver) {
        if (entityResolver == null) {
            entityResolver = this;
        }
        this.f21259e = entityResolver;
    }

    @Override // org.xml.sax.XMLReader
    public void setErrorHandler(ErrorHandler errorHandler) {
        if (errorHandler == null) {
            errorHandler = this;
        }
        this.f21258d = errorHandler;
    }

    @Override // org.xml.sax.XMLReader
    public void setFeature(String str, boolean z4) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (((Boolean) this.f21272r.get(str)) != null) {
            if (z4) {
                this.f21272r.put(str, Boolean.TRUE);
            } else {
                this.f21272r.put(str, Boolean.FALSE);
            }
            if (str.equals(O)) {
                this.f21263i = z4;
                return;
            }
            if (str.equals(f21241d0)) {
                this.f21264j = z4;
                return;
            }
            if (str.equals(f21242e0)) {
                this.f21265k = z4;
                return;
            }
            if (str.equals(f21243f0)) {
                this.f21266l = z4;
                return;
            }
            if (str.equals(f21244g0)) {
                this.f21267m = z4;
                return;
            }
            if (str.equals(f21245h0)) {
                this.f21268n = z4;
                return;
            }
            if (str.equals(f21246i0)) {
                this.f21269o = z4;
                return;
            } else if (str.equals(f21247j0)) {
                this.f21270p = z4;
                return;
            } else {
                if (str.equals(f21248k0)) {
                    this.f21271q = z4;
                    return;
                }
                return;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unknown feature ");
        stringBuffer.append(str);
        throw new SAXNotRecognizedException(stringBuffer.toString());
    }

    @Override // org.xml.sax.XMLReader
    public void setProperty(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (str.equals(f21249l0)) {
            if (obj == null) {
                this.f21256b = this;
                return;
            } else {
                if (obj instanceof LexicalHandler) {
                    this.f21256b = (LexicalHandler) obj;
                    return;
                }
                throw new SAXNotSupportedException("Your lexical handler is not a LexicalHandler");
            }
        }
        if (str.equals(f21250m0)) {
            if (obj instanceof n) {
                this.f21261g = (n) obj;
                return;
            }
            throw new SAXNotSupportedException("Your scanner is not a Scanner");
        }
        if (str.equals(f21251n0)) {
            if (obj instanceof o) {
                this.f21260f = (o) obj;
                return;
            }
            throw new SAXNotSupportedException("Your schema is not a Schema");
        }
        if (str.equals(f21252o0)) {
            if (obj instanceof b) {
                this.f21262h = (b) obj;
                return;
            }
            throw new SAXNotSupportedException("Your auto-detector is not an AutoDetector");
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unknown property ");
        stringBuffer.append(str);
        throw new SAXNotRecognizedException(stringBuffer.toString());
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startCDATA() throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startDTD(String str, String str2, String str3) throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startEntity(String str) throws SAXException {
    }

    @Override // org.xml.sax.XMLReader
    public void parse(String str) throws IOException, SAXException {
        parse(new InputSource(str));
    }
}
