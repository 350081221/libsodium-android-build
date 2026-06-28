.class Lcom/zzhoujay/richtext/ig/d;
.super Lcom/zzhoujay/richtext/ig/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zzhoujay/richtext/ig/a<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/zzhoujay/richtext/c;Lcom/zzhoujay/richtext/g;Landroid/widget/TextView;Lcom/zzhoujay/richtext/drawable/c;Le3/g;)V
    .locals 7

    sget-object v6, Lcom/zzhoujay/richtext/ig/o;->c:Lcom/zzhoujay/richtext/ig/o;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/zzhoujay/richtext/ig/a;-><init>(Lcom/zzhoujay/richtext/c;Lcom/zzhoujay/richtext/g;Landroid/widget/TextView;Lcom/zzhoujay/richtext/drawable/c;Le3/g;Lcom/zzhoujay/richtext/ig/o;)V

    return-void
.end method


# virtual methods
.method o(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lcom/zzhoujay/richtext/ig/a;->onFailure(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/zzhoujay/richtext/cache/a;->g()Lcom/zzhoujay/richtext/cache/a;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2, p1}, Lcom/zzhoujay/richtext/cache/a;->m(Ljava/lang/String;)Ljava/io/InputStream;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance p2, Ljava/io/BufferedInputStream;

    .line 16
    .line 17
    invoke-direct {p2, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p2}, Lcom/zzhoujay/richtext/ig/a;->d(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/io/BufferedInputStream;->close()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    new-instance p2, Lf3/f;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lf3/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2}, Lcom/zzhoujay/richtext/ig/a;->onFailure(Ljava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catch_1
    move-exception p1

    .line 41
    invoke-virtual {p0, p1}, Lcom/zzhoujay/richtext/ig/a;->onFailure(Ljava/lang/Exception;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
