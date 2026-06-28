package kotlin.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlin/io/LineReader;", "", "()V", "BUFFER_SIZE", "", "byteBuf", "Ljava/nio/ByteBuffer;", "bytes", "", "charBuf", "Ljava/nio/CharBuffer;", "chars", "", "decoder", "Ljava/nio/charset/CharsetDecoder;", "directEOL", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "compactBytes", "decode", "endOfInput", "decodeEndOfInput", "nBytes", "nChars", "readLine", "", "inputStream", "Ljava/io/InputStream;", "charset", "Ljava/nio/charset/Charset;", "resetAll", "", "trimStringBuilder", "updateCharset", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final r f19361a = new r();

    /* renamed from: b, reason: collision with root package name */
    private static final int f19362b = 32;

    /* renamed from: c, reason: collision with root package name */
    private static CharsetDecoder f19363c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f19364d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private static final byte[] f19365e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final char[] f19366f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private static final ByteBuffer f19367g;

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private static final CharBuffer f19368h;

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private static final StringBuilder f19369i;

    static {
        byte[] bArr = new byte[32];
        f19365e = bArr;
        char[] cArr = new char[32];
        f19366f = cArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        l0.o(wrap, "wrap(bytes)");
        f19367g = wrap;
        CharBuffer wrap2 = CharBuffer.wrap(cArr);
        l0.o(wrap2, "wrap(chars)");
        f19368h = wrap2;
        f19369i = new StringBuilder();
    }

    private r() {
    }

    private final int a() {
        ByteBuffer byteBuffer = f19367g;
        byteBuffer.compact();
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    private final int b(boolean z4) {
        while (true) {
            CharsetDecoder charsetDecoder = f19363c;
            if (charsetDecoder == null) {
                l0.S("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = f19367g;
            CharBuffer charBuffer = f19368h;
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z4);
            l0.o(decode, "decoder.decode(byteBuf, charBuf, endOfInput)");
            if (decode.isError()) {
                e();
                decode.throwException();
            }
            int position = charBuffer.position();
            if (!decode.isOverflow()) {
                return position;
            }
            StringBuilder sb = f19369i;
            char[] cArr = f19366f;
            int i5 = position - 1;
            sb.append(cArr, 0, i5);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i5]);
        }
    }

    private final int c(int i5, int i6) {
        ByteBuffer byteBuffer = f19367g;
        byteBuffer.limit(i5);
        f19368h.position(i6);
        int b5 = b(true);
        CharsetDecoder charsetDecoder = f19363c;
        if (charsetDecoder == null) {
            l0.S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return b5;
    }

    private final void e() {
        CharsetDecoder charsetDecoder = f19363c;
        if (charsetDecoder == null) {
            l0.S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        f19367g.position(0);
        f19369i.setLength(0);
    }

    private final void f() {
        StringBuilder sb = f19369i;
        sb.setLength(32);
        sb.trimToSize();
    }

    private final void g(Charset charset) {
        CharsetDecoder newDecoder = charset.newDecoder();
        l0.o(newDecoder, "charset.newDecoder()");
        f19363c = newDecoder;
        ByteBuffer byteBuffer = f19367g;
        byteBuffer.clear();
        CharBuffer charBuffer = f19368h;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = f19363c;
        if (charsetDecoder == null) {
            l0.S("decoder");
            charsetDecoder = null;
        }
        boolean z4 = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z4 = true;
        }
        f19364d = z4;
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (kotlin.jvm.internal.l0.g(r0.charset(), r12) == false) goto L9;
     */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String d(@p4.l java.io.InputStream r11, @p4.l java.nio.charset.Charset r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "inputStream"
            kotlin.jvm.internal.l0.p(r11, r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.l0.p(r12, r0)     // Catch: java.lang.Throwable -> Lc9
            java.nio.charset.CharsetDecoder r0 = kotlin.io.r.f19363c     // Catch: java.lang.Throwable -> Lc9
            r1 = 0
            if (r0 == 0) goto L22
            if (r0 != 0) goto L18
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.l0.S(r0)     // Catch: java.lang.Throwable -> Lc9
            r0 = r1
        L18:
            java.nio.charset.Charset r0 = r0.charset()     // Catch: java.lang.Throwable -> Lc9
            boolean r0 = kotlin.jvm.internal.l0.g(r0, r12)     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto L25
        L22:
            r10.g(r12)     // Catch: java.lang.Throwable -> Lc9
        L25:
            r12 = 0
            r0 = r12
            r2 = r0
        L28:
            int r3 = r11.read()     // Catch: java.lang.Throwable -> Lc9
            r4 = 32
            r5 = 10
            r6 = -1
            r7 = 1
            if (r3 != r6) goto L4c
            java.lang.StringBuilder r11 = kotlin.io.r.f19369i     // Catch: java.lang.Throwable -> Lc9
            int r11 = r11.length()     // Catch: java.lang.Throwable -> Lc9
            if (r11 != 0) goto L3e
            r11 = r7
            goto L3f
        L3e:
            r11 = r12
        L3f:
            if (r11 == 0) goto L47
            if (r0 != 0) goto L47
            if (r2 != 0) goto L47
            monitor-exit(r10)
            return r1
        L47:
            int r11 = r10.c(r0, r2)     // Catch: java.lang.Throwable -> Lc9
            goto L7a
        L4c:
            byte[] r6 = kotlin.io.r.f19365e     // Catch: java.lang.Throwable -> Lc9
            int r8 = r0 + 1
            byte r9 = (byte) r3     // Catch: java.lang.Throwable -> Lc9
            r6[r0] = r9     // Catch: java.lang.Throwable -> Lc9
            if (r3 == r5) goto L5e
            if (r8 == r4) goto L5e
            boolean r0 = kotlin.io.r.f19364d     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto L5c
            goto L5e
        L5c:
            r0 = r8
            goto L28
        L5e:
            java.nio.ByteBuffer r0 = kotlin.io.r.f19367g     // Catch: java.lang.Throwable -> Lc9
            r0.limit(r8)     // Catch: java.lang.Throwable -> Lc9
            java.nio.CharBuffer r3 = kotlin.io.r.f19368h     // Catch: java.lang.Throwable -> Lc9
            r3.position(r2)     // Catch: java.lang.Throwable -> Lc9
            int r2 = r10.b(r12)     // Catch: java.lang.Throwable -> Lc9
            if (r2 <= 0) goto Lc3
            char[] r3 = kotlin.io.r.f19366f     // Catch: java.lang.Throwable -> Lc9
            int r6 = r2 + (-1)
            char r3 = r3[r6]     // Catch: java.lang.Throwable -> Lc9
            if (r3 != r5) goto Lc3
            r0.position(r12)     // Catch: java.lang.Throwable -> Lc9
            r11 = r2
        L7a:
            if (r11 <= 0) goto L92
            char[] r0 = kotlin.io.r.f19366f     // Catch: java.lang.Throwable -> Lc9
            int r1 = r11 + (-1)
            char r1 = r0[r1]     // Catch: java.lang.Throwable -> Lc9
            if (r1 != r5) goto L92
            int r11 = r11 + (-1)
            if (r11 <= 0) goto L92
            int r1 = r11 + (-1)
            char r0 = r0[r1]     // Catch: java.lang.Throwable -> Lc9
            r1 = 13
            if (r0 != r1) goto L92
            int r11 = r11 + (-1)
        L92:
            java.lang.StringBuilder r0 = kotlin.io.r.f19369i     // Catch: java.lang.Throwable -> Lc9
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lc9
            if (r1 != 0) goto L9b
            goto L9c
        L9b:
            r7 = r12
        L9c:
            if (r7 == 0) goto La7
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Lc9
            char[] r1 = kotlin.io.r.f19366f     // Catch: java.lang.Throwable -> Lc9
            r0.<init>(r1, r12, r11)     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r10)
            return r0
        La7:
            char[] r1 = kotlin.io.r.f19366f     // Catch: java.lang.Throwable -> Lc9
            r0.append(r1, r12, r11)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = "sb.toString()"
            kotlin.jvm.internal.l0.o(r11, r1)     // Catch: java.lang.Throwable -> Lc9
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lc9
            if (r1 <= r4) goto Lbe
            r10.f()     // Catch: java.lang.Throwable -> Lc9
        Lbe:
            r0.setLength(r12)     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r10)
            return r11
        Lc3:
            int r0 = r10.a()     // Catch: java.lang.Throwable -> Lc9
            goto L28
        Lc9:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.r.d(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }
}
