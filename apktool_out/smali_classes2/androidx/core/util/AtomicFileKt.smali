.class public final Landroidx/core/util/AtomicFileKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a0\u0010\u0008\u001a\u00020\u0006*\u00020\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u0003\u0012\u0008\u0008\u0004\u0012\u0004\u0008\u0008(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\u0086\u0008\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u001a\r\u0010\u0011\u001a\u00020\t*\u00020\u0000H\u0086\u0008\u001a\u0014\u0010\u0012\u001a\u00020\u000c*\u00020\u00002\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroid/util/AtomicFile;",
        "Lkotlin/Function1;",
        "Ljava/io/FileOutputStream;",
        "Lkotlin/v0;",
        "name",
        "out",
        "Lkotlin/r2;",
        "block",
        "tryWrite",
        "",
        "array",
        "writeBytes",
        "",
        "text",
        "Ljava/nio/charset/Charset;",
        "charset",
        "writeText",
        "readBytes",
        "readText",
        "core-ktx_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nAtomicFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n1#1,76:1\n30#1,13:77\n*S KotlinDebug\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n48#1:77,13\n*E\n"
    }
.end annotation


# direct methods
.method public static final readBytes(Landroid/util/AtomicFile;)[B
    .locals 0
    .param p0    # Landroid/util/AtomicFile;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-virtual {p0}, Landroid/util/AtomicFile;->readFully()[B

    move-result-object p0

    return-object p0
.end method

.method public static final readText(Landroid/util/AtomicFile;Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1
    .param p0    # Landroid/util/AtomicFile;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/nio/charset/Charset;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/util/AtomicFile;->readFully()[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 8
    .line 9
    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static synthetic readText$default(Landroid/util/AtomicFile;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lkotlin/text/f;->b:Ljava/nio/charset/Charset;

    :cond_0
    invoke-static {p0, p1}, Landroidx/core/util/AtomicFileKt;->readText(Landroid/util/AtomicFile;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final tryWrite(Landroid/util/AtomicFile;Lv3/l;)V
    .locals 2
    .param p0    # Landroid/util/AtomicFile;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/AtomicFile;",
            "Lv3/l<",
            "-",
            "Ljava/io/FileOutputStream;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/util/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    :try_start_0
    invoke-interface {p1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Lkotlin/jvm/internal/i0;->d(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/util/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lkotlin/jvm/internal/i0;->c(I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    invoke-static {v1}, Lkotlin/jvm/internal/i0;->d(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/util/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Lkotlin/jvm/internal/i0;->c(I)V

    .line 27
    .line 28
    .line 29
    throw p1
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static final writeBytes(Landroid/util/AtomicFile;[B)V
    .locals 1
    .param p0    # Landroid/util/AtomicFile;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # [B
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/util/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/util/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    invoke-virtual {p0, v0}, Landroid/util/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V

    .line 14
    .line 15
    .line 16
    throw p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static final writeText(Landroid/util/AtomicFile;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    .locals 0
    .param p0    # Landroid/util/AtomicFile;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/nio/charset/Charset;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string/jumbo p2, "this as java.lang.String).getBytes(charset)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Landroidx/core/util/AtomicFileKt;->writeBytes(Landroid/util/AtomicFile;[B)V

    return-void
.end method

.method public static synthetic writeText$default(Landroid/util/AtomicFile;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lkotlin/text/f;->b:Ljava/nio/charset/Charset;

    :cond_0
    invoke-static {p0, p1, p2}, Landroidx/core/util/AtomicFileKt;->writeText(Landroid/util/AtomicFile;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    return-void
.end method
