.class public final Lokio/b0;
.super Lokio/w;
.source "SourceFile"

# interfaces
.implements Lokio/l1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokio/b0$a;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0017\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tB\u0017\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cB\u001f\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000eH\u0007\u00a2\u0006\u0002\u0008\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0010\u001a\u00020\u000e8G\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lokio/HashingSink;",
        "Lokio/ForwardingSink;",
        "Lokio/Sink;",
        "sink",
        "digest",
        "Ljava/security/MessageDigest;",
        "(Lokio/Sink;Ljava/security/MessageDigest;)V",
        "algorithm",
        "",
        "(Lokio/Sink;Ljava/lang/String;)V",
        "mac",
        "Ljavax/crypto/Mac;",
        "(Lokio/Sink;Ljavax/crypto/Mac;)V",
        "key",
        "Lokio/ByteString;",
        "(Lokio/Sink;Lokio/ByteString;Ljava/lang/String;)V",
        "hash",
        "()Lokio/ByteString;",
        "messageDigest",
        "-deprecated_hash",
        "write",
        "",
        "source",
        "Lokio/Buffer;",
        "byteCount",
        "",
        "Companion",
        "okio"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nHashingSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n86#2:149\n*S KotlinDebug\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n*L\n75#1:149\n*E\n"
    }
.end annotation


# static fields
.field public static final c:Lokio/b0$a;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final a:Ljava/security/MessageDigest;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final b:Ljavax/crypto/Mac;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lokio/b0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lokio/b0$a;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Lokio/b0;->c:Lokio/b0$a;

    return-void
.end method

.method public constructor <init>(Lokio/l1;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lokio/l1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "algorithm"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {p2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p2

    const-string v0, "getInstance(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lokio/b0;-><init>(Lokio/l1;Ljava/security/MessageDigest;)V

    return-void
.end method

.method public constructor <init>(Lokio/l1;Ljava/security/MessageDigest;)V
    .locals 1
    .param p1    # Lokio/l1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/security/MessageDigest;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "digest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lokio/w;-><init>(Lokio/l1;)V

    .line 2
    iput-object p2, p0, Lokio/b0;->a:Ljava/security/MessageDigest;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lokio/b0;->b:Ljavax/crypto/Mac;

    return-void
.end method

.method public constructor <init>(Lokio/l1;Ljavax/crypto/Mac;)V
    .locals 1
    .param p1    # Lokio/l1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljavax/crypto/Mac;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mac"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p1}, Lokio/w;-><init>(Lokio/l1;)V

    .line 6
    iput-object p2, p0, Lokio/b0;->b:Ljavax/crypto/Mac;

    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lokio/b0;->a:Ljava/security/MessageDigest;

    return-void
.end method

.method public constructor <init>(Lokio/l1;Lokio/n;Ljava/lang/String;)V
    .locals 2
    .param p1    # Lokio/l1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lokio/n;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "algorithm"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    :try_start_0
    invoke-static {p3}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v0

    .line 9
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {p2}, Lokio/n;->toByteArray()[B

    move-result-object p2

    invoke-direct {v1, p2, p3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 10
    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 12
    invoke-direct {p0, p1, v0}, Lokio/b0;-><init>(Lokio/l1;Ljavax/crypto/Mac;)V

    return-void

    :catch_0
    move-exception p1

    .line 13
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static final c(Lokio/l1;Lokio/n;)Lokio/b0;
    .locals 1
    .param p0    # Lokio/l1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lokio/n;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Lokio/b0;->c:Lokio/b0$a;

    invoke-virtual {v0, p0, p1}, Lokio/b0$a;->a(Lokio/l1;Lokio/n;)Lokio/b0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lokio/l1;Lokio/n;)Lokio/b0;
    .locals 1
    .param p0    # Lokio/l1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lokio/n;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Lokio/b0;->c:Lokio/b0$a;

    invoke-virtual {v0, p0, p1}, Lokio/b0$a;->b(Lokio/l1;Lokio/n;)Lokio/b0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lokio/l1;Lokio/n;)Lokio/b0;
    .locals 1
    .param p0    # Lokio/l1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lokio/n;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Lokio/b0;->c:Lokio/b0$a;

    invoke-virtual {v0, p0, p1}, Lokio/b0$a;->c(Lokio/l1;Lokio/n;)Lokio/b0;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lokio/l1;)Lokio/b0;
    .locals 1
    .param p0    # Lokio/l1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Lokio/b0;->c:Lokio/b0$a;

    invoke-virtual {v0, p0}, Lokio/b0$a;->d(Lokio/l1;)Lokio/b0;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lokio/l1;)Lokio/b0;
    .locals 1
    .param p0    # Lokio/l1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Lokio/b0;->c:Lokio/b0$a;

    invoke-virtual {v0, p0}, Lokio/b0$a;->e(Lokio/l1;)Lokio/b0;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lokio/l1;)Lokio/b0;
    .locals 1
    .param p0    # Lokio/l1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Lokio/b0;->c:Lokio/b0$a;

    invoke-virtual {v0, p0}, Lokio/b0$a;->f(Lokio/l1;)Lokio/b0;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lokio/l1;)Lokio/b0;
    .locals 1
    .param p0    # Lokio/l1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Lokio/b0;->c:Lokio/b0$a;

    invoke-virtual {v0, p0}, Lokio/b0$a;->g(Lokio/l1;)Lokio/b0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lokio/n;
    .locals 1
    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->ERROR:Lkotlin/m;
        message = "moved to val"
        replaceWith = .subannotation Lkotlin/b1;
            expression = "hash"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/h;
        name = "-deprecated_hash"
    .end annotation

    invoke-virtual {p0}, Lokio/b0;->b()Lokio/n;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lokio/n;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/h;
        name = "hash"
    .end annotation

    .line 1
    iget-object v0, p0, Lokio/b0;->a:Ljava/security/MessageDigest;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lokio/b0;->b:Ljavax/crypto/Mac;

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljavax/crypto/Mac;->doFinal()[B

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    new-instance v1, Lokio/n;

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, v0}, Lokio/n;-><init>([B)V

    .line 25
    .line 26
    .line 27
    return-object v1
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
.end method

.method public write(Lokio/l;J)V
    .locals 7
    .param p1    # Lokio/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lokio/l;->M0()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    move-wide v5, p2

    .line 13
    invoke-static/range {v1 .. v6}, Lokio/i;->e(JJJ)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p1, Lokio/l;->a:Lokio/i1;

    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const-wide/16 v1, 0x0

    .line 22
    .line 23
    :goto_0
    cmp-long v3, v1, p2

    .line 24
    .line 25
    if-gez v3, :cond_1

    .line 26
    .line 27
    sub-long v3, p2, v1

    .line 28
    .line 29
    iget v5, v0, Lokio/i1;->c:I

    .line 30
    .line 31
    iget v6, v0, Lokio/i1;->b:I

    .line 32
    .line 33
    sub-int/2addr v5, v6

    .line 34
    int-to-long v5, v5

    .line 35
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    long-to-int v3, v3

    .line 40
    iget-object v4, p0, Lokio/b0;->a:Ljava/security/MessageDigest;

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    iget-object v5, v0, Lokio/i1;->a:[B

    .line 45
    .line 46
    iget v6, v0, Lokio/i1;->b:I

    .line 47
    .line 48
    invoke-virtual {v4, v5, v6, v3}, Ljava/security/MessageDigest;->update([BII)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    iget-object v4, p0, Lokio/b0;->b:Ljavax/crypto/Mac;

    .line 53
    .line 54
    invoke-static {v4}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v5, v0, Lokio/i1;->a:[B

    .line 58
    .line 59
    iget v6, v0, Lokio/i1;->b:I

    .line 60
    .line 61
    invoke-virtual {v4, v5, v6, v3}, Ljavax/crypto/Mac;->update([BII)V

    .line 62
    .line 63
    .line 64
    :goto_1
    int-to-long v3, v3

    .line 65
    add-long/2addr v1, v3

    .line 66
    iget-object v0, v0, Lokio/i1;->f:Lokio/i1;

    .line 67
    .line 68
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-super {p0, p1, p2, p3}, Lokio/w;->write(Lokio/l;J)V

    .line 73
    .line 74
    .line 75
    return-void
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
.end method
