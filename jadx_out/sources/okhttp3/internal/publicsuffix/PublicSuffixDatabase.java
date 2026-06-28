package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.e0;
import kotlin.collections.v;
import kotlin.i0;
import kotlin.io.c;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.sequences.u;
import kotlin.text.f0;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.a0;
import okio.y0;
import org.apache.http.cookie.ClientCookie;
import org.slf4j.d;
import p4.l;
import p4.m;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", ClientCookie.DOMAIN_ATTR, "", "splitDomain", "domainLabels", "findMatchingRule", "Lkotlin/r2;", "readTheListUninterruptibly", "readTheList", "getEffectiveTldPlusOne", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "setListBytes", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "[B", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';

    @l
    private static final List<String> PREVAILING_RULE;

    @l
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";

    @l
    private static final PublicSuffixDatabase instance;
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final byte[] WILDCARD_LABEL = {42};

    @l
    private final AtomicBoolean listRead = new AtomicBoolean(false);

    @l
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    @i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "()V", "EXCEPTION_MARKER", "", "PREVAILING_RULE", "", "", "PUBLIC_SUFFIX_RESOURCE", "WILDCARD_LABEL", "", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "binarySearch", "labels", "", "labelIndex", "", "([B[[BI)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i5) {
            int i6;
            boolean z4;
            int and;
            int and2;
            int length = bArr.length;
            int i7 = 0;
            while (i7 < length) {
                int i8 = (i7 + length) / 2;
                while (i8 > -1 && bArr[i8] != 10) {
                    i8--;
                }
                int i9 = i8 + 1;
                int i10 = 1;
                while (true) {
                    i6 = i9 + i10;
                    if (bArr[i6] == 10) {
                        break;
                    }
                    i10++;
                }
                int i11 = i6 - i9;
                int i12 = i5;
                boolean z5 = false;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (z5) {
                        and = 46;
                        z4 = false;
                    } else {
                        z4 = z5;
                        and = Util.and(bArr2[i12][i13], 255);
                    }
                    and2 = and - Util.and(bArr[i9 + i14], 255);
                    if (and2 != 0) {
                        break;
                    }
                    i14++;
                    i13++;
                    if (i14 == i11) {
                        break;
                    }
                    if (bArr2[i12].length == i13) {
                        if (i12 == bArr2.length - 1) {
                            break;
                        }
                        i12++;
                        i13 = -1;
                        z5 = true;
                    } else {
                        z5 = z4;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i15 = i11 - i14;
                        int length2 = bArr2[i12].length - i13;
                        int length3 = bArr2.length;
                        for (int i16 = i12 + 1; i16 < length3; i16++) {
                            length2 += bArr2[i16].length;
                        }
                        if (length2 >= i15) {
                            if (length2 <= i15) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                l0.o(UTF_8, "UTF_8");
                                return new String(bArr, i9, i11, UTF_8);
                            }
                        }
                    }
                    i7 = i6 + 1;
                }
                length = i9 - 1;
            }
            return null;
        }

        @l
        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }
    }

    static {
        List<String> k5;
        k5 = v.k(d.ANY_MARKER);
        PREVAILING_RULE = k5;
        instance = new PublicSuffixDatabase();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00de, code lost:
    
        r4 = kotlin.text.f0.Q4(r8, new char[]{external.org.apache.commons.lang3.d.f15957a}, false, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f4, code lost:
    
        r1 = kotlin.text.f0.Q4(r5, new char[]{external.org.apache.commons.lang3.d.f15957a}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<java.lang.String> findMatchingRule(java.util.List<java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.findMatchingRule(java.util.List):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [byte[], T] */
    /* JADX WARN: Type inference failed for: r3v7, types: [byte[], T] */
    private final void readTheList() throws IOException {
        try {
            k1.h hVar = new k1.h();
            k1.h hVar2 = new k1.h();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream == null) {
                return;
            }
            BufferedSource e5 = y0.e(new a0(y0.u(resourceAsStream)));
            try {
                hVar.element = e5.N(e5.readInt());
                hVar2.element = e5.N(e5.readInt());
                r2 r2Var = r2.f19517a;
                c.a(e5, null);
                synchronized (this) {
                    T t5 = hVar.element;
                    l0.m(t5);
                    this.publicSuffixListBytes = (byte[]) t5;
                    T t6 = hVar2.element;
                    l0.m(t6);
                    this.publicSuffixExceptionListBytes = (byte[]) t6;
                }
            } finally {
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z4 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z4 = true;
                } catch (IOException e5) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e5);
                    if (z4) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> splitDomain(String str) {
        List<String> Q4;
        Object m32;
        List<String> a22;
        Q4 = f0.Q4(str, new char[]{external.org.apache.commons.lang3.d.f15957a}, false, 0, 6, null);
        m32 = e0.m3(Q4);
        if (l0.g(m32, "")) {
            a22 = e0.a2(Q4, 1);
            return a22;
        }
        return Q4;
    }

    @m
    public final String getEffectiveTldPlusOne(@l String domain) {
        int size;
        int size2;
        kotlin.sequences.m x12;
        kotlin.sequences.m k02;
        String e12;
        l0.p(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        l0.o(unicodeDomain, "unicodeDomain");
        List<String> splitDomain = splitDomain(unicodeDomain);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        x12 = e0.x1(splitDomain(domain));
        k02 = u.k0(x12, size - size2);
        e12 = u.e1(k02, ".", null, null, 0, null, null, 62, null);
        return e12;
    }

    public final void setListBytes(@l byte[] publicSuffixListBytes, @l byte[] publicSuffixExceptionListBytes) {
        l0.p(publicSuffixListBytes, "publicSuffixListBytes");
        l0.p(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
