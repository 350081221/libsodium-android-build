.class final Lcom/zzhoujay/richtext/cache/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zzhoujay/richtext/cache/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zzhoujay/richtext/cache/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/zzhoujay/richtext/cache/b<",
        "Ljava/io/InputStream;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/jakewharton/disklrucache/a;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_1

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p2, p1}, Lcom/jakewharton/disklrucache/a;->P(Ljava/lang/String;)Lcom/jakewharton/disklrucache/a$e;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    :cond_0
    return v0

    .line 12
    :catch_0
    move-exception p1

    .line 13
    invoke-static {p1}, Lcom/zzhoujay/richtext/ext/c;->a(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return v0
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

.method public bridge synthetic b(Ljava/lang/String;Ljava/lang/Object;Lcom/jakewharton/disklrucache/a;)V
    .locals 0

    check-cast p2, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zzhoujay/richtext/cache/b$b;->e(Ljava/lang/String;Ljava/io/InputStream;Lcom/jakewharton/disklrucache/a;)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/String;Lcom/jakewharton/disklrucache/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/zzhoujay/richtext/cache/b$b;->d(Ljava/lang/String;Lcom/jakewharton/disklrucache/a;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;Lcom/jakewharton/disklrucache/a;)Ljava/io/InputStream;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_1

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p2, p1}, Lcom/jakewharton/disklrucache/a;->P(Ljava/lang/String;)Lcom/jakewharton/disklrucache/a$e;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    invoke-static {p1}, Lcom/zzhoujay/richtext/ext/c;->a(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    move-object p1, v0

    .line 14
    :goto_0
    if-nez p1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/4 p2, 0x0

    .line 18
    invoke-virtual {p1, p2}, Lcom/jakewharton/disklrucache/a$e;->b(I)Ljava/io/InputStream;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    :goto_1
    return-object v0
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

.method public e(Ljava/lang/String;Ljava/io/InputStream;Lcom/jakewharton/disklrucache/a;)V
    .locals 4

    .line 1
    if-eqz p3, :cond_2

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p3, p1}, Lcom/jakewharton/disklrucache/a;->M(Ljava/lang/String;)Lcom/jakewharton/disklrucache/a$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 p3, 0x0

    .line 11
    invoke-virtual {p1, p3}, Lcom/jakewharton/disklrucache/a$c;->i(I)Ljava/io/OutputStream;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/16 v1, 0x400

    .line 16
    .line 17
    new-array v1, v1, [B

    .line 18
    .line 19
    :goto_0
    invoke-virtual {p2, v1}, Ljava/io/InputStream;->read([B)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, -0x1

    .line 24
    if-eq v2, v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, v1, p3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/jakewharton/disklrucache/a$c;->f()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catch_0
    move-exception p1

    .line 44
    invoke-static {p1}, Lcom/zzhoujay/richtext/ext/c;->a(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_1
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method
