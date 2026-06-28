package org.ccil.cowan.tagsoup;

import com.umeng.analytics.pro.o;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PushbackReader;
import java.lang.reflect.Array;
import okio.q1;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* loaded from: classes4.dex */
public class g implements n, Locator {
    private static final int A = 16;
    private static final int B = 17;
    private static final int C = 18;
    private static final int D = 19;
    static short[][] D0 = null;
    private static final int E = 20;
    static int E0 = 0;
    private static final int F = 21;
    private static final int G = 22;
    private static final int H = 23;
    private static final int I = 24;
    private static final int J = 25;
    private static final int K = 26;
    private static final int L = 27;
    private static final int M = 28;
    private static final int N = 29;
    private static final int O = 30;
    private static final int P = 31;
    private static final int Q = 32;
    private static final int R = 33;
    private static final int S = 34;
    private static final int T = 35;
    private static final int U = 1;
    private static final int V = 2;
    private static final int W = 3;
    private static final int X = 4;
    private static final int Y = 5;
    private static final int Z = 6;

    /* renamed from: a0, reason: collision with root package name */
    private static final int f21175a0 = 7;

    /* renamed from: b0, reason: collision with root package name */
    private static final int f21176b0 = 8;

    /* renamed from: c0, reason: collision with root package name */
    private static final int f21177c0 = 9;

    /* renamed from: d0, reason: collision with root package name */
    private static final int f21178d0 = 10;

    /* renamed from: e0, reason: collision with root package name */
    private static final int f21179e0 = 11;

    /* renamed from: f0, reason: collision with root package name */
    private static final int f21180f0 = 12;

    /* renamed from: g0, reason: collision with root package name */
    private static final int f21181g0 = 13;

    /* renamed from: h0, reason: collision with root package name */
    private static final int f21182h0 = 14;

    /* renamed from: i0, reason: collision with root package name */
    private static final int f21183i0 = 15;

    /* renamed from: j0, reason: collision with root package name */
    private static final int f21184j0 = 16;

    /* renamed from: k0, reason: collision with root package name */
    private static final int f21185k0 = 17;

    /* renamed from: l, reason: collision with root package name */
    private static final int f21186l = 1;

    /* renamed from: l0, reason: collision with root package name */
    private static final int f21187l0 = 18;

    /* renamed from: m, reason: collision with root package name */
    private static final int f21188m = 2;

    /* renamed from: m0, reason: collision with root package name */
    private static final int f21189m0 = 19;

    /* renamed from: n, reason: collision with root package name */
    private static final int f21190n = 3;

    /* renamed from: n0, reason: collision with root package name */
    private static final int f21191n0 = 20;

    /* renamed from: o, reason: collision with root package name */
    private static final int f21192o = 4;

    /* renamed from: o0, reason: collision with root package name */
    private static final int f21193o0 = 21;

    /* renamed from: p, reason: collision with root package name */
    private static final int f21194p = 5;

    /* renamed from: p0, reason: collision with root package name */
    private static final int f21195p0 = 22;

    /* renamed from: q, reason: collision with root package name */
    private static final int f21196q = 6;

    /* renamed from: q0, reason: collision with root package name */
    private static final int f21197q0 = 23;

    /* renamed from: r, reason: collision with root package name */
    private static final int f21198r = 7;

    /* renamed from: r0, reason: collision with root package name */
    private static final int f21199r0 = 24;

    /* renamed from: s, reason: collision with root package name */
    private static final int f21200s = 8;

    /* renamed from: s0, reason: collision with root package name */
    private static final int f21201s0 = 25;

    /* renamed from: t, reason: collision with root package name */
    private static final int f21202t = 9;

    /* renamed from: t0, reason: collision with root package name */
    private static final int f21203t0 = 26;

    /* renamed from: u, reason: collision with root package name */
    private static final int f21204u = 10;

    /* renamed from: u0, reason: collision with root package name */
    private static final int f21205u0 = 27;

    /* renamed from: v, reason: collision with root package name */
    private static final int f21206v = 11;

    /* renamed from: v0, reason: collision with root package name */
    private static final int f21207v0 = 28;

    /* renamed from: w, reason: collision with root package name */
    private static final int f21208w = 12;

    /* renamed from: w0, reason: collision with root package name */
    private static final int f21209w0 = 29;

    /* renamed from: x, reason: collision with root package name */
    private static final int f21210x = 13;

    /* renamed from: x0, reason: collision with root package name */
    private static final int f21211x0 = 30;

    /* renamed from: y, reason: collision with root package name */
    private static final int f21212y = 14;

    /* renamed from: y0, reason: collision with root package name */
    private static final int f21213y0 = 31;

    /* renamed from: z, reason: collision with root package name */
    private static final int f21214z = 15;

    /* renamed from: z0, reason: collision with root package name */
    private static final int f21215z0 = 32;

    /* renamed from: a, reason: collision with root package name */
    private String f21216a;

    /* renamed from: b, reason: collision with root package name */
    private String f21217b;

    /* renamed from: c, reason: collision with root package name */
    private int f21218c;

    /* renamed from: d, reason: collision with root package name */
    private int f21219d;

    /* renamed from: e, reason: collision with root package name */
    private int f21220e;

    /* renamed from: f, reason: collision with root package name */
    private int f21221f;

    /* renamed from: g, reason: collision with root package name */
    int f21222g;

    /* renamed from: h, reason: collision with root package name */
    int f21223h;

    /* renamed from: j, reason: collision with root package name */
    int f21225j;
    private static int[] A0 = {1, 47, 5, 22, 1, 61, 4, 3, 1, 62, 6, 28, 1, 0, 27, 1, 1, -1, 6, 21, 1, 32, 4, 24, 1, 10, 4, 24, 1, 9, 4, 24, 2, 39, 7, 34, 2, 0, 27, 2, 2, -1, 8, 21, 2, 32, 29, 2, 2, 10, 29, 2, 2, 9, 29, 2, 3, 34, 28, 31, 3, 39, 28, 2, 3, 62, 8, 28, 3, 0, 27, 32, 3, -1, 8, 21, 3, 32, 28, 3, 3, 10, 28, 3, 3, 9, 28, 3, 4, 67, 28, 5, 4, 0, 28, 19, 4, -1, 28, 21, 5, 68, 28, 6, 5, 0, 28, 19, 5, -1, 28, 21, 6, 65, 28, 7, 6, 0, 28, 19, 6, -1, 28, 21, 7, 84, 28, 8, 7, 0, 28, 19, 7, -1, 28, 21, 8, 65, 28, 9, 8, 0, 28, 19, 8, -1, 28, 21, 9, 91, 28, 12, 9, 0, 28, 19, 9, -1, 28, 21, 10, 60, 27, 11, 10, 0, 27, 10, 10, -1, 23, 21, 11, 47, 32, 25, 11, 0, 27, 10, 11, -1, 32, 21, 12, 93, 27, 13, 12, 0, 27, 12, 12, -1, 28, 21, 13, 93, 27, 14, 13, 0, 27, 12, 13, -1, 28, 21, 14, 62, 9, 28, 14, 93, 27, 14, 14, 0, 27, 12, 14, -1, 28, 21, 15, 45, 28, 16, 15, 0, 27, 16, 15, -1, 10, 21, 16, 45, 28, 17, 16, 0, 27, 16, 16, -1, 10, 21, 17, 45, 28, 18, 17, 0, 20, 16, 17, -1, 10, 21, 18, 45, 22, 18, 18, 62, 10, 28, 18, 0, 21, 16, 18, -1, 10, 21, 19, 45, 28, 15, 19, 62, 28, 28, 19, 91, 28, 4, 19, 0, 27, 20, 19, -1, 28, 21, 20, 62, 11, 28, 20, 0, 27, 20, 20, -1, 28, 21, 22, 62, 12, 28, 22, 0, 27, 1, 22, 32, 28, 34, 22, 10, 28, 34, 22, 9, 28, 34, 23, 0, 13, 23, 23, -1, 13, 21, 24, 61, 28, 3, 24, 62, 3, 28, 24, 0, 2, 1, 24, -1, 3, 21, 24, 32, 28, 24, 24, 10, 28, 24, 24, 9, 28, 24, 25, 62, 15, 28, 25, 0, 27, 25, 25, -1, 15, 21, 25, 32, 28, 25, 25, 10, 28, 25, 25, 9, 28, 25, 26, 47, 28, 22, 26, 62, 17, 28, 26, 0, 27, 26, 26, -1, 28, 21, 26, 32, 16, 34, 26, 10, 16, 34, 26, 9, 16, 34, 27, 0, 13, 27, 27, -1, 13, 21, 28, 38, 14, 23, 28, 60, 23, 33, 28, 0, 27, 28, 28, -1, 23, 21, 29, 62, 24, 28, 29, 0, 27, 29, 29, -1, 24, 21, 30, 62, 26, 28, 30, 0, 27, 30, 30, -1, 26, 21, 30, 32, 25, 29, 30, 10, 25, 29, 30, 9, 25, 29, 31, 34, 7, 34, 31, 0, 27, 31, 31, -1, 8, 21, 31, 32, 29, 31, 31, 10, 29, 31, 31, 9, 29, 31, 32, 62, 8, 28, 32, 0, 27, 32, 32, -1, 8, 21, 32, 32, 7, 34, 32, 10, 7, 34, 32, 9, 7, 34, 33, 33, 28, 19, 33, 47, 28, 25, 33, 60, 27, 33, 33, 63, 28, 30, 33, 0, 27, 26, 33, -1, 19, 21, 33, 32, 18, 28, 33, 10, 18, 28, 33, 9, 18, 28, 34, 47, 28, 22, 34, 62, 30, 28, 34, 0, 27, 1, 34, -1, 30, 21, 34, 32, 28, 34, 34, 10, 28, 34, 34, 9, 28, 34, 35, 0, 13, 35, 35, -1, 13, 21};
    private static final String[] B0 = {"", "A_ADUP", "A_ADUP_SAVE", "A_ADUP_STAGC", "A_ANAME", "A_ANAME_ADUP", "A_ANAME_ADUP_STAGC", "A_AVAL", "A_AVAL_STAGC", "A_CDATA", "A_CMNT", "A_DECL", "A_EMPTYTAG", "A_ENTITY", "A_ENTITY_START", "A_ETAG", "A_GI", "A_GI_STAGC", "A_LT", "A_LT_PCDATA", "A_MINUS", "A_MINUS2", "A_MINUS3", "A_PCDATA", "A_PI", "A_PITARGET", "A_PITARGET_PI", "A_SAVE", "A_SKIP", "A_SP", "A_STAGC", "A_UNGET", "A_UNSAVE_PCDATA"};
    private static final String[] C0 = {"", "S_ANAME", "S_APOS", "S_AVAL", "S_BB", "S_BBC", "S_BBCD", "S_BBCDA", "S_BBCDAT", "S_BBCDATA", "S_CDATA", "S_CDATA2", "S_CDSECT", "S_CDSECT1", "S_CDSECT2", "S_COM", "S_COM2", "S_COM3", "S_COM4", "S_DECL", "S_DECL2", "S_DONE", "S_EMPTYTAG", "S_ENT", "S_EQ", "S_ETAG", "S_GI", "S_NCR", "S_PCDATA", "S_PI", "S_PITARGET", "S_QUOT", "S_STAGC", "S_TAG", "S_TAGWS", "S_XNCR"};

    /* renamed from: i, reason: collision with root package name */
    char[] f21224i = new char[200];

    /* renamed from: k, reason: collision with root package name */
    int[] f21226k = {8364, q1.f21023c, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, q1.f21023c, 381, q1.f21023c, q1.f21023c, 8216, 8217, 8220, 8221, 8226, o.a.C, o.a.D, 732, 8482, 353, 8250, 339, q1.f21023c, 382, 376};

    static {
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        while (true) {
            int[] iArr = A0;
            if (i7 >= iArr.length) {
                break;
            }
            int i8 = iArr[i7];
            if (i8 > i6) {
                i6 = i8;
            }
            int i9 = iArr[i7 + 1];
            if (i9 > i5) {
                i5 = i9;
            }
            i7 += 4;
        }
        E0 = i5 + 1;
        D0 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i6 + 1, i5 + 3);
        for (int i10 = 0; i10 <= i6; i10++) {
            for (int i11 = -2; i11 <= i5; i11++) {
                int i12 = -1;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int[] iArr2 = A0;
                    if (i13 >= iArr2.length) {
                        break;
                    }
                    if (i10 != iArr2[i13]) {
                        if (i14 != 0) {
                            break;
                        }
                    } else {
                        int i15 = iArr2[i13 + 1];
                        if (i15 == 0) {
                            i14 = iArr2[i13 + 2];
                            i12 = i13;
                        } else if (i15 == i11) {
                            int i16 = iArr2[i13 + 2];
                            break;
                        }
                    }
                    i13 += 4;
                }
                i13 = i12;
                D0[i10][i11 + 2] = (short) i13;
            }
        }
    }

    public static void c(String[] strArr) throws IOException, SAXException {
        g gVar = new g();
        InputStreamReader inputStreamReader = new InputStreamReader(System.in, "UTF-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out, "UTF-8");
        gVar.a(inputStreamReader, new j(outputStreamWriter));
        outputStreamWriter.close();
    }

    private void d() {
        this.f21219d = this.f21221f;
        this.f21218c = this.f21220e;
    }

    private static String e(int i5) {
        if (i5 == 10) {
            return "\\n";
        }
        if (i5 < 32) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("0x");
            stringBuffer.append(Integer.toHexString(i5));
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("'");
        stringBuffer2.append((char) i5);
        stringBuffer2.append("'");
        return stringBuffer2.toString();
    }

    private void f(int i5, m mVar) throws IOException, SAXException {
        int i6 = this.f21225j;
        char[] cArr = this.f21224i;
        if (i6 >= cArr.length - 20) {
            int i7 = this.f21222g;
            if (i7 != 28 && i7 != 10) {
                char[] cArr2 = new char[cArr.length * 2];
                System.arraycopy(cArr, 0, cArr2, 0, i6 + 1);
                this.f21224i = cArr2;
            } else {
                mVar.g(cArr, 0, i6);
                this.f21225j = 0;
            }
        }
        char[] cArr3 = this.f21224i;
        int i8 = this.f21225j;
        this.f21225j = i8 + 1;
        cArr3[i8] = (char) i5;
    }

    private void g(PushbackReader pushbackReader, int i5) throws IOException {
        if (i5 != -1) {
            pushbackReader.unread(i5);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r1 >= org.ccil.cowan.tagsoup.g.E0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0099. Please report as an issue. */
    @Override // org.ccil.cowan.tagsoup.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.io.Reader r17, org.ccil.cowan.tagsoup.m r18) throws java.io.IOException, org.xml.sax.SAXException {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.ccil.cowan.tagsoup.g.a(java.io.Reader, org.ccil.cowan.tagsoup.m):void");
    }

    @Override // org.ccil.cowan.tagsoup.n
    public void b(String str, String str2) {
        this.f21216a = str;
        this.f21217b = str2;
        this.f21221f = 0;
        this.f21220e = 0;
        this.f21219d = 0;
        this.f21218c = 0;
    }

    @Override // org.xml.sax.Locator
    public int getColumnNumber() {
        return this.f21219d;
    }

    @Override // org.xml.sax.Locator
    public int getLineNumber() {
        return this.f21218c;
    }

    @Override // org.xml.sax.Locator
    public String getPublicId() {
        return this.f21216a;
    }

    @Override // org.xml.sax.Locator
    public String getSystemId() {
        return this.f21217b;
    }

    @Override // org.ccil.cowan.tagsoup.n
    public void startCDATA() {
        this.f21223h = 10;
    }
}
