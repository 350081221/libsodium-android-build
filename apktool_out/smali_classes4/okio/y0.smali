.class public final Lokio/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "okio/Okio__JvmOkioKt",
        "okio/Okio__OkioKt"
    }
    k = 0x4
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ljava/io/File;)Lokio/l1;
    .locals 0
    .param p0    # Ljava/io/File;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lokio/z0;->b(Ljava/io/File;)Lokio/l1;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/ClassLoader;)Lokio/u;
    .locals 0
    .param p0    # Ljava/lang/ClassLoader;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lokio/z0;->c(Ljava/lang/ClassLoader;)Lokio/u;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Lokio/l1;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/h;
        name = "blackhole"
    .end annotation

    invoke-static {}, Lokio/a1;->a()Lokio/l1;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Lokio/l1;)Lokio/m;
    .locals 0
    .param p0    # Lokio/l1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lokio/a1;->b(Lokio/l1;)Lokio/m;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lokio/n1;)Lokio/BufferedSource;
    .locals 0
    .param p0    # Lokio/n1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lokio/a1;->c(Lokio/n1;)Lokio/BufferedSource;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lokio/l1;Ljavax/crypto/Cipher;)Lokio/o;
    .locals 0
    .param p0    # Lokio/l1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljavax/crypto/Cipher;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lokio/z0;->d(Lokio/l1;Ljavax/crypto/Cipher;)Lokio/o;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lokio/n1;Ljavax/crypto/Cipher;)Lokio/p;
    .locals 0
    .param p0    # Lokio/n1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljavax/crypto/Cipher;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lokio/z0;->e(Lokio/n1;Ljavax/crypto/Cipher;)Lokio/p;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lokio/l1;Ljava/security/MessageDigest;)Lokio/b0;
    .locals 0
    .param p0    # Lokio/l1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/security/MessageDigest;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lokio/z0;->f(Lokio/l1;Ljava/security/MessageDigest;)Lokio/b0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lokio/l1;Ljavax/crypto/Mac;)Lokio/b0;
    .locals 0
    .param p0    # Lokio/l1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljavax/crypto/Mac;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lokio/z0;->g(Lokio/l1;Ljavax/crypto/Mac;)Lokio/b0;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lokio/n1;Ljava/security/MessageDigest;)Lokio/c0;
    .locals 0
    .param p0    # Lokio/n1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/security/MessageDigest;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lokio/z0;->h(Lokio/n1;Ljava/security/MessageDigest;)Lokio/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lokio/n1;Ljavax/crypto/Mac;)Lokio/c0;
    .locals 0
    .param p0    # Lokio/n1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljavax/crypto/Mac;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lokio/z0;->i(Lokio/n1;Ljavax/crypto/Mac;)Lokio/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Ljava/lang/AssertionError;)Z
    .locals 0
    .param p0    # Ljava/lang/AssertionError;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0}, Lokio/z0;->j(Ljava/lang/AssertionError;)Z

    move-result p0

    return p0
.end method

.method public static final m(Lokio/u;Lokio/d1;)Lokio/u;
    .locals 0
    .param p0    # Lokio/u;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lokio/d1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lokio/z0;->k(Lokio/u;Lokio/d1;)Lokio/u;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Ljava/io/File;)Lokio/l1;
    .locals 0
    .param p0    # Ljava/io/File;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    invoke-static {p0}, Lokio/z0;->l(Ljava/io/File;)Lokio/l1;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Ljava/io/File;Z)Lokio/l1;
    .locals 0
    .param p0    # Ljava/io/File;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    invoke-static {p0, p1}, Lokio/z0;->m(Ljava/io/File;Z)Lokio/l1;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Ljava/io/OutputStream;)Lokio/l1;
    .locals 0
    .param p0    # Ljava/io/OutputStream;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lokio/z0;->n(Ljava/io/OutputStream;)Lokio/l1;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Ljava/net/Socket;)Lokio/l1;
    .locals 0
    .param p0    # Ljava/net/Socket;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lokio/z0;->o(Ljava/net/Socket;)Lokio/l1;

    move-result-object p0

    return-object p0
.end method

.method public static final varargs r(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/l1;
    .locals 0
    .param p0    # Ljava/nio/file/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # [Ljava/nio/file/OpenOption;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lokio/z0;->p(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/l1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Ljava/io/File;ZILjava/lang/Object;)Lokio/l1;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lokio/z0;->q(Ljava/io/File;ZILjava/lang/Object;)Lokio/l1;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Ljava/io/File;)Lokio/n1;
    .locals 0
    .param p0    # Ljava/io/File;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lokio/z0;->r(Ljava/io/File;)Lokio/n1;

    move-result-object p0

    return-object p0
.end method

.method public static final u(Ljava/io/InputStream;)Lokio/n1;
    .locals 0
    .param p0    # Ljava/io/InputStream;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lokio/z0;->s(Ljava/io/InputStream;)Lokio/n1;

    move-result-object p0

    return-object p0
.end method

.method public static final v(Ljava/net/Socket;)Lokio/n1;
    .locals 0
    .param p0    # Ljava/net/Socket;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lokio/z0;->t(Ljava/net/Socket;)Lokio/n1;

    move-result-object p0

    return-object p0
.end method

.method public static final varargs w(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/n1;
    .locals 0
    .param p0    # Ljava/nio/file/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # [Ljava/nio/file/OpenOption;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lokio/z0;->u(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/n1;

    move-result-object p0

    return-object p0
.end method

.method public static final x(Ljava/io/Closeable;Lv3/l;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/io/Closeable;",
            "R:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lv3/l<",
            "-TT;+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1}, Lokio/a1;->d(Ljava/io/Closeable;Lv3/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
