package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@kotlin.i0(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\n\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\r\u001a\u0012\u0010\u000e\u001a\u00020\u000f*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0012\u0010\u0015\u001a\u00020\u0016*\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u0012\u0010\u0015\u001a\u00020\u0016*\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a\u001a\u0012\u0010\u001b\u001a\u00020\u001c*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u0012\u0010\u001b\u001a\u00020\u001c*\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a\u001a\u0012\u0010\u001d\u001a\u00020\f*\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f\u001a\u0016\u0010 \u001a\u00020\t*\u00020\n2\b\b\u0002\u0010!\u001a\u00020\u0004H\u0007\u001a\n\u0010 \u001a\u00020\t*\u00020\"\u001a\n\u0010 \u001a\u00020\t*\u00020#\u001a#\u0010 \u001a\u00020\t*\u00020$2\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0&\"\u00020'¢\u0006\u0002\u0010(\u001a\n\u0010)\u001a\u00020\u0014*\u00020\n\u001a\n\u0010)\u001a\u00020\u0014*\u00020*\u001a\n\u0010)\u001a\u00020\u0014*\u00020#\u001a#\u0010)\u001a\u00020\u0014*\u00020$2\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0&\"\u00020'¢\u0006\u0002\u0010+\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0003\u001a\u00020\u0004*\u00060\u0005j\u0002`\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0007¨\u0006,"}, d2 = {"logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "isAndroidGetsocknameError", "", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "(Ljava/lang/AssertionError;)Z", "appendingSink", "Lokio/Sink;", "Ljava/io/File;", "asResourceFileSystem", "Lokio/FileSystem;", "Ljava/lang/ClassLoader;", "cipherSink", "Lokio/CipherSink;", "cipher", "Ljavax/crypto/Cipher;", "cipherSource", "Lokio/CipherSource;", "Lokio/Source;", "hashingSink", "Lokio/HashingSink;", "digest", "Ljava/security/MessageDigest;", "mac", "Ljavax/crypto/Mac;", "hashingSource", "Lokio/HashingSource;", "openZip", "zipPath", "Lokio/Path;", "sink", "append", "Ljava/io/OutputStream;", "Ljava/net/Socket;", "Ljava/nio/file/Path;", "options", "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "source", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "okio"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "okio/Okio")
/* loaded from: classes4.dex */
public final /* synthetic */ class z0 {

    /* renamed from: a */
    private static final Logger f21064a = Logger.getLogger("okio.Okio");

    @p4.l
    public static final l1 b(@p4.l File file) throws FileNotFoundException {
        kotlin.jvm.internal.l0.p(file, "<this>");
        return y0.p(new FileOutputStream(file, true));
    }

    @p4.l
    public static final u c(@p4.l ClassLoader classLoader) {
        kotlin.jvm.internal.l0.p(classLoader, "<this>");
        return new okio.internal.j(classLoader, true, null, 4, null);
    }

    @p4.l
    public static final o d(@p4.l l1 l1Var, @p4.l Cipher cipher) {
        kotlin.jvm.internal.l0.p(l1Var, "<this>");
        kotlin.jvm.internal.l0.p(cipher, "cipher");
        return new o(y0.d(l1Var), cipher);
    }

    @p4.l
    public static final p e(@p4.l n1 n1Var, @p4.l Cipher cipher) {
        kotlin.jvm.internal.l0.p(n1Var, "<this>");
        kotlin.jvm.internal.l0.p(cipher, "cipher");
        return new p(y0.e(n1Var), cipher);
    }

    @p4.l
    public static final b0 f(@p4.l l1 l1Var, @p4.l MessageDigest digest) {
        kotlin.jvm.internal.l0.p(l1Var, "<this>");
        kotlin.jvm.internal.l0.p(digest, "digest");
        return new b0(l1Var, digest);
    }

    @p4.l
    public static final b0 g(@p4.l l1 l1Var, @p4.l Mac mac) {
        kotlin.jvm.internal.l0.p(l1Var, "<this>");
        kotlin.jvm.internal.l0.p(mac, "mac");
        return new b0(l1Var, mac);
    }

    @p4.l
    public static final c0 h(@p4.l n1 n1Var, @p4.l MessageDigest digest) {
        kotlin.jvm.internal.l0.p(n1Var, "<this>");
        kotlin.jvm.internal.l0.p(digest, "digest");
        return new c0(n1Var, digest);
    }

    @p4.l
    public static final c0 i(@p4.l n1 n1Var, @p4.l Mac mac) {
        kotlin.jvm.internal.l0.p(n1Var, "<this>");
        kotlin.jvm.internal.l0.p(mac, "mac");
        return new c0(n1Var, mac);
    }

    public static final boolean j(@p4.l AssertionError assertionError) {
        boolean z4;
        kotlin.jvm.internal.l0.p(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z4 = kotlin.text.f0.T2(message, "getsockname failed", false, 2, null);
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        return true;
    }

    @p4.l
    public static final u k(@p4.l u uVar, @p4.l d1 zipPath) throws IOException {
        kotlin.jvm.internal.l0.p(uVar, "<this>");
        kotlin.jvm.internal.l0.p(zipPath, "zipPath");
        return okio.internal.l.e(zipPath, uVar, null, 4, null);
    }

    @p4.l
    @u3.i
    public static final l1 l(@p4.l File file) throws FileNotFoundException {
        l1 q5;
        kotlin.jvm.internal.l0.p(file, "<this>");
        q5 = q(file, false, 1, null);
        return q5;
    }

    @p4.l
    @u3.i
    public static final l1 m(@p4.l File file, boolean z4) throws FileNotFoundException {
        kotlin.jvm.internal.l0.p(file, "<this>");
        return y0.p(new FileOutputStream(file, z4));
    }

    @p4.l
    public static final l1 n(@p4.l OutputStream outputStream) {
        kotlin.jvm.internal.l0.p(outputStream, "<this>");
        return new c1(outputStream, new p1());
    }

    @p4.l
    public static final l1 o(@p4.l Socket socket2) throws IOException {
        kotlin.jvm.internal.l0.p(socket2, "<this>");
        m1 m1Var = new m1(socket2);
        OutputStream outputStream = socket2.getOutputStream();
        kotlin.jvm.internal.l0.o(outputStream, "getOutputStream(...)");
        return m1Var.sink(new c1(outputStream, m1Var));
    }

    @p4.l
    public static final l1 p(@p4.l Path path, @p4.l OpenOption... options) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.l0.o(newOutputStream, "newOutputStream(...)");
        return y0.p(newOutputStream);
    }

    public static /* synthetic */ l1 q(File file, boolean z4, int i5, Object obj) throws FileNotFoundException {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        return y0.o(file, z4);
    }

    @p4.l
    public static final n1 r(@p4.l File file) throws FileNotFoundException {
        kotlin.jvm.internal.l0.p(file, "<this>");
        return new e0(new FileInputStream(file), p1.NONE);
    }

    @p4.l
    public static final n1 s(@p4.l InputStream inputStream) {
        kotlin.jvm.internal.l0.p(inputStream, "<this>");
        return new e0(inputStream, new p1());
    }

    @p4.l
    public static final n1 t(@p4.l Socket socket2) throws IOException {
        kotlin.jvm.internal.l0.p(socket2, "<this>");
        m1 m1Var = new m1(socket2);
        InputStream inputStream = socket2.getInputStream();
        kotlin.jvm.internal.l0.o(inputStream, "getInputStream(...)");
        return m1Var.source(new e0(inputStream, m1Var));
    }

    @p4.l
    public static final n1 u(@p4.l Path path, @p4.l OpenOption... options) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.l0.o(newInputStream, "newInputStream(...)");
        return y0.u(newInputStream);
    }
}
