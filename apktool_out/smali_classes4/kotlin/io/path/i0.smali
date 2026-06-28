.class public final Lkotlin/io/path/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u00a2\u0006\u0002\u0010\u0007\u001a\u000c\u0010\u0008\u001a\u00020\t*\u00020\nH\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "keyOf",
        "",
        "path",
        "Ljava/nio/file/Path;",
        "linkOptions",
        "",
        "Ljava/nio/file/LinkOption;",
        "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;",
        "createsCycle",
        "",
        "Lkotlin/io/path/PathNode;",
        "kotlin-stdlib-jdk7"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Lkotlin/io/path/v;)Z
    .locals 0

    invoke-static {p0}, Lkotlin/io/path/i0;->c(Lkotlin/io/path/v;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/io/path/i0;->d(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lkotlin/io/path/v;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lkotlin/io/path/v;->c()Lkotlin/io/path/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Lkotlin/io/path/v;->b()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lkotlin/io/path/v;->b()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Lkotlin/io/path/v;->b()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0}, Lkotlin/io/path/v;->b()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    return v2

    .line 35
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lkotlin/io/path/v;->d()Ljava/nio/file/Path;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p0}, Lkotlin/io/path/v;->d()Ljava/nio/file/Path;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v1, v3}, Lkotlin/io/path/g0;->a(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z

    .line 44
    .line 45
    .line 46
    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    return v2

    .line 50
    :catch_0
    :cond_1
    invoke-virtual {v0}, Lkotlin/io/path/v;->c()Lkotlin/io/path/v;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const/4 p0, 0x0

    .line 56
    return p0
    .line 57
    .line 58
.end method

.method private static final d(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;
    .locals 2

    :try_start_0
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/nio/file/LinkOption;

    const-class v0, Ljava/nio/file/attribute/BasicFileAttributes;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/nio/file/LinkOption;

    invoke-static {p0, v0, p1}, Lkotlin/io/path/h0;->a(Ljava/nio/file/Path;Ljava/lang/Class;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;

    move-result-object p0

    const-string p1, "readAttributes(this, A::class.java, *options)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/io/path/g;->a(Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
