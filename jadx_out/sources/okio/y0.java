package okio;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@kotlin.i0(d1 = {"okio/Okio__JvmOkioKt", "okio/Okio__OkioKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class y0 {
    @p4.l
    public static final l1 a(@p4.l File file) throws FileNotFoundException {
        return z0.b(file);
    }

    @p4.l
    public static final u b(@p4.l ClassLoader classLoader) {
        return z0.c(classLoader);
    }

    @p4.l
    @u3.h(name = "blackhole")
    public static final l1 c() {
        return a1.a();
    }

    @p4.l
    public static final m d(@p4.l l1 l1Var) {
        return a1.b(l1Var);
    }

    @p4.l
    public static final BufferedSource e(@p4.l n1 n1Var) {
        return a1.c(n1Var);
    }

    @p4.l
    public static final o f(@p4.l l1 l1Var, @p4.l Cipher cipher) {
        return z0.d(l1Var, cipher);
    }

    @p4.l
    public static final p g(@p4.l n1 n1Var, @p4.l Cipher cipher) {
        return z0.e(n1Var, cipher);
    }

    @p4.l
    public static final b0 h(@p4.l l1 l1Var, @p4.l MessageDigest messageDigest) {
        return z0.f(l1Var, messageDigest);
    }

    @p4.l
    public static final b0 i(@p4.l l1 l1Var, @p4.l Mac mac) {
        return z0.g(l1Var, mac);
    }

    @p4.l
    public static final c0 j(@p4.l n1 n1Var, @p4.l MessageDigest messageDigest) {
        return z0.h(n1Var, messageDigest);
    }

    @p4.l
    public static final c0 k(@p4.l n1 n1Var, @p4.l Mac mac) {
        return z0.i(n1Var, mac);
    }

    public static final boolean l(@p4.l AssertionError assertionError) {
        return z0.j(assertionError);
    }

    @p4.l
    public static final u m(@p4.l u uVar, @p4.l d1 d1Var) throws IOException {
        return z0.k(uVar, d1Var);
    }

    @p4.l
    @u3.i
    public static final l1 n(@p4.l File file) throws FileNotFoundException {
        return z0.l(file);
    }

    @p4.l
    @u3.i
    public static final l1 o(@p4.l File file, boolean z4) throws FileNotFoundException {
        return z0.m(file, z4);
    }

    @p4.l
    public static final l1 p(@p4.l OutputStream outputStream) {
        return z0.n(outputStream);
    }

    @p4.l
    public static final l1 q(@p4.l Socket socket2) throws IOException {
        return z0.o(socket2);
    }

    @p4.l
    public static final l1 r(@p4.l Path path, @p4.l OpenOption... openOptionArr) throws IOException {
        return z0.p(path, openOptionArr);
    }

    @p4.l
    public static final n1 t(@p4.l File file) throws FileNotFoundException {
        return z0.r(file);
    }

    @p4.l
    public static final n1 u(@p4.l InputStream inputStream) {
        return z0.s(inputStream);
    }

    @p4.l
    public static final n1 v(@p4.l Socket socket2) throws IOException {
        return z0.t(socket2);
    }

    @p4.l
    public static final n1 w(@p4.l Path path, @p4.l OpenOption... openOptionArr) throws IOException {
        return z0.u(path, openOptionArr);
    }

    public static final <T extends Closeable, R> R x(T t5, @p4.l v3.l<? super T, ? extends R> lVar) {
        return (R) a1.d(t5, lVar);
    }
}
