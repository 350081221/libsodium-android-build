.class public Lcom/umeng/analytics/pro/cj;
.super Lcom/umeng/analytics/pro/cq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/cj$a;
    }
.end annotation


# static fields
.field protected static final a:I = -0x10000

.field protected static final b:I = -0x7fff0000

.field private static final h:Lcom/umeng/analytics/pro/cv;


# instance fields
.field protected c:Z

.field protected d:Z

.field protected e:I

.field protected f:Z

.field private i:[B

.field private j:[B

.field private k:[B

.field private l:[B

.field private m:[B

.field private n:[B

.field private o:[B

.field private p:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/umeng/analytics/pro/cv;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/cv;-><init>()V

    sput-object v0, Lcom/umeng/analytics/pro/cj;->h:Lcom/umeng/analytics/pro/cv;

    return-void
.end method

.method public constructor <init>(Lcom/umeng/analytics/pro/de;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lcom/umeng/analytics/pro/cj;-><init>(Lcom/umeng/analytics/pro/de;ZZ)V

    return-void
.end method

.method public constructor <init>(Lcom/umeng/analytics/pro/de;ZZ)V
    .locals 4

    .line 2
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/cq;-><init>(Lcom/umeng/analytics/pro/de;)V

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/umeng/analytics/pro/cj;->f:Z

    const/4 p1, 0x1

    new-array v0, p1, [B

    .line 4
    iput-object v0, p0, Lcom/umeng/analytics/pro/cj;->i:[B

    const/4 v0, 0x2

    new-array v1, v0, [B

    .line 5
    iput-object v1, p0, Lcom/umeng/analytics/pro/cj;->j:[B

    const/4 v1, 0x4

    new-array v2, v1, [B

    .line 6
    iput-object v2, p0, Lcom/umeng/analytics/pro/cj;->k:[B

    const/16 v2, 0x8

    new-array v3, v2, [B

    .line 7
    iput-object v3, p0, Lcom/umeng/analytics/pro/cj;->l:[B

    new-array p1, p1, [B

    .line 8
    iput-object p1, p0, Lcom/umeng/analytics/pro/cj;->m:[B

    new-array p1, v0, [B

    .line 9
    iput-object p1, p0, Lcom/umeng/analytics/pro/cj;->n:[B

    new-array p1, v1, [B

    .line 10
    iput-object p1, p0, Lcom/umeng/analytics/pro/cj;->o:[B

    new-array p1, v2, [B

    .line 11
    iput-object p1, p0, Lcom/umeng/analytics/pro/cj;->p:[B

    .line 12
    iput-boolean p2, p0, Lcom/umeng/analytics/pro/cj;->c:Z

    .line 13
    iput-boolean p3, p0, Lcom/umeng/analytics/pro/cj;->d:Z

    return-void
.end method

.method private a([BII)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 46
    invoke-virtual {p0, p3}, Lcom/umeng/analytics/pro/cj;->d(I)V

    .line 47
    iget-object v0, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    invoke-virtual {v0, p1, p2, p3}, Lcom/umeng/analytics/pro/de;->d([BII)I

    move-result p1

    return p1
.end method


# virtual methods
.method public A()Ljava/nio/ByteBuffer;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->w()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/cj;->d(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/umeng/analytics/pro/de;->h()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-lt v1, v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/umeng/analytics/pro/de;->f()[B

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/umeng/analytics/pro/de;->g()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v1, v2, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 33
    .line 34
    invoke-virtual {v2, v0}, Lcom/umeng/analytics/pro/de;->a(I)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_0
    new-array v1, v0, [B

    .line 39
    .line 40
    iget-object v2, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-virtual {v2, v1, v3, v0}, Lcom/umeng/analytics/pro/de;->d([BII)I

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public a()V
    .locals 0

    return-void
.end method

.method public a(B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/umeng/analytics/pro/cj;->i:[B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    .line 20
    iget-object p1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lcom/umeng/analytics/pro/de;->b([BII)V

    return-void
.end method

.method public a(D)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 38
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/cj;->a(J)V

    return-void
.end method

.method public a(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/umeng/analytics/pro/cj;->k:[B

    shr-int/lit8 v1, p1, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    shr-int/lit8 v1, p1, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v3, 0x1

    .line 25
    aput-byte v1, v0, v3

    shr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v3, 0x2

    .line 26
    aput-byte v1, v0, v3

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    const/4 v1, 0x3

    .line 27
    aput-byte p1, v0, v1

    .line 28
    iget-object p1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v2, v1}, Lcom/umeng/analytics/pro/de;->b([BII)V

    return-void
.end method

.method public a(J)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/umeng/analytics/pro/cj;->l:[B

    const/16 v1, 0x38

    shr-long v1, p1, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    const/16 v1, 0x30

    shr-long v5, p1, v1

    and-long/2addr v5, v3

    long-to-int v1, v5

    int-to-byte v1, v1

    const/4 v5, 0x1

    .line 30
    aput-byte v1, v0, v5

    const/16 v1, 0x28

    shr-long v5, p1, v1

    and-long/2addr v5, v3

    long-to-int v1, v5

    int-to-byte v1, v1

    const/4 v5, 0x2

    .line 31
    aput-byte v1, v0, v5

    const/16 v1, 0x20

    shr-long v5, p1, v1

    and-long/2addr v5, v3

    long-to-int v1, v5

    int-to-byte v1, v1

    const/4 v5, 0x3

    .line 32
    aput-byte v1, v0, v5

    const/16 v1, 0x18

    shr-long v5, p1, v1

    and-long/2addr v5, v3

    long-to-int v1, v5

    int-to-byte v1, v1

    const/4 v5, 0x4

    .line 33
    aput-byte v1, v0, v5

    const/16 v1, 0x10

    shr-long v5, p1, v1

    and-long/2addr v5, v3

    long-to-int v1, v5

    int-to-byte v1, v1

    const/4 v5, 0x5

    .line 34
    aput-byte v1, v0, v5

    const/16 v1, 0x8

    shr-long v5, p1, v1

    and-long/2addr v5, v3

    long-to-int v5, v5

    int-to-byte v5, v5

    const/4 v6, 0x6

    .line 35
    aput-byte v5, v0, v6

    and-long/2addr p1, v3

    long-to-int p1, p1

    int-to-byte p1, p1

    const/4 p2, 0x7

    .line 36
    aput-byte p1, v0, p2

    .line 37
    iget-object p1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    invoke-virtual {p1, v0, v2, v1}, Lcom/umeng/analytics/pro/de;->b([BII)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/cl;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 9
    iget-byte v0, p1, Lcom/umeng/analytics/pro/cl;->b:B

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/cj;->a(B)V

    .line 10
    iget-short p1, p1, Lcom/umeng/analytics/pro/cl;->c:S

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/cj;->a(S)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/cm;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 14
    iget-byte v0, p1, Lcom/umeng/analytics/pro/cm;->a:B

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/cj;->a(B)V

    .line 15
    iget p1, p1, Lcom/umeng/analytics/pro/cm;->b:I

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/cj;->a(I)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/cn;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 11
    iget-byte v0, p1, Lcom/umeng/analytics/pro/cn;->a:B

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/cj;->a(B)V

    .line 12
    iget-byte v0, p1, Lcom/umeng/analytics/pro/cn;->b:B

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/cj;->a(B)V

    .line 13
    iget p1, p1, Lcom/umeng/analytics/pro/cn;->c:I

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/cj;->a(I)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/co;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/umeng/analytics/pro/cj;->d:Z

    if-eqz v0, :cond_0

    .line 2
    iget-byte v0, p1, Lcom/umeng/analytics/pro/co;->b:B

    const/high16 v1, -0x7fff0000

    or-int/2addr v0, v1

    .line 3
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/cj;->a(I)V

    .line 4
    iget-object v0, p1, Lcom/umeng/analytics/pro/co;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/cj;->a(Ljava/lang/String;)V

    .line 5
    iget p1, p1, Lcom/umeng/analytics/pro/co;->c:I

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/cj;->a(I)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p1, Lcom/umeng/analytics/pro/co;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/cj;->a(Ljava/lang/String;)V

    .line 7
    iget-byte v0, p1, Lcom/umeng/analytics/pro/co;->b:B

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/cj;->a(B)V

    .line 8
    iget p1, p1, Lcom/umeng/analytics/pro/co;->c:I

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/cj;->a(I)V

    :goto_0
    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/cu;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 16
    iget-byte v0, p1, Lcom/umeng/analytics/pro/cu;->a:B

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/cj;->a(B)V

    .line 17
    iget p1, p1, Lcom/umeng/analytics/pro/cu;->b:I

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/cj;->a(I)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/cv;)V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    :try_start_0
    const-string v0, "UTF-8"

    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    .line 40
    array-length v0, p1

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/cj;->a(I)V

    .line 41
    iget-object v0, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Lcom/umeng/analytics/pro/de;->b([BII)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 42
    :catch_0
    new-instance p1, Lcom/umeng/analytics/pro/bx;

    const-string v0, "JVM DOES NOT SUPPORT UTF-8"

    invoke-direct {p1, v0}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/nio/ByteBuffer;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 43
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    sub-int/2addr v0, v1

    .line 44
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/cj;->a(I)V

    .line 45
    iget-object v1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p1

    add-int/2addr v3, p1

    invoke-virtual {v1, v2, v3, v0}, Lcom/umeng/analytics/pro/de;->b([BII)V

    return-void
.end method

.method public a(S)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/umeng/analytics/pro/cj;->j:[B

    shr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    const/4 v1, 0x1

    .line 22
    aput-byte p1, v0, v1

    .line 23
    iget-object p1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v2, v1}, Lcom/umeng/analytics/pro/de;->b([BII)V

    return-void
.end method

.method public a(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 18
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/cj;->a(B)V

    return-void
.end method

.method public b(I)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/cj;->d(I)V

    .line 2
    .line 3
    .line 4
    new-array v0, p1, [B

    .line 5
    .line 6
    iget-object v1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v0, v2, p1}, Lcom/umeng/analytics/pro/de;->d([BII)I

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "UTF-8"

    .line 15
    .line 16
    invoke-direct {p1, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :catch_0
    new-instance p1, Lcom/umeng/analytics/pro/bx;

    .line 21
    .line 22
    const-string v0, "JVM DOES NOT SUPPORT UTF-8"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public c(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/umeng/analytics/pro/cj;->e:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/umeng/analytics/pro/cj;->f:Z

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
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
.end method

.method public d()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/cj;->a(B)V

    return-void
.end method

.method protected d(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    if-ltz p1, :cond_2

    .line 2
    iget-boolean v0, p0, Lcom/umeng/analytics/pro/cj;->f:Z

    if-eqz v0, :cond_1

    .line 3
    iget v0, p0, Lcom/umeng/analytics/pro/cj;->e:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/umeng/analytics/pro/cj;->e:I

    if-ltz v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Lcom/umeng/analytics/pro/cr;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Message length exceeded: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/umeng/analytics/pro/cr;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void

    .line 5
    :cond_2
    new-instance v0, Lcom/umeng/analytics/pro/cr;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Negative length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/umeng/analytics/pro/cr;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public h()Lcom/umeng/analytics/pro/co;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->w()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    if-gez v0, :cond_1

    .line 7
    .line 8
    const/high16 v2, -0x10000

    .line 9
    .line 10
    and-int/2addr v2, v0

    .line 11
    const/high16 v3, -0x7fff0000

    .line 12
    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    new-instance v1, Lcom/umeng/analytics/pro/co;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->z()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    and-int/lit16 v0, v0, 0xff

    .line 22
    .line 23
    int-to-byte v0, v0

    .line 24
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->w()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-direct {v1, v2, v0, v3}, Lcom/umeng/analytics/pro/co;-><init>(Ljava/lang/String;BI)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_0
    new-instance v0, Lcom/umeng/analytics/pro/cr;

    .line 33
    .line 34
    const-string v2, "Bad version in readMessageBegin"

    .line 35
    .line 36
    invoke-direct {v0, v1, v2}, Lcom/umeng/analytics/pro/cr;-><init>(ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    iget-boolean v2, p0, Lcom/umeng/analytics/pro/cj;->c:Z

    .line 41
    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    new-instance v1, Lcom/umeng/analytics/pro/co;

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/cj;->b(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->u()B

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->w()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-direct {v1, v0, v2, v3}, Lcom/umeng/analytics/pro/co;-><init>(Ljava/lang/String;BI)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_2
    new-instance v0, Lcom/umeng/analytics/pro/cr;

    .line 63
    .line 64
    const-string v2, "Missing version in readMessageBegin, old client?"

    .line 65
    .line 66
    invoke-direct {v0, v1, v2}, Lcom/umeng/analytics/pro/cr;-><init>(ILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public i()V
    .locals 0

    return-void
.end method

.method public j()Lcom/umeng/analytics/pro/cv;
    .locals 1

    sget-object v0, Lcom/umeng/analytics/pro/cj;->h:Lcom/umeng/analytics/pro/cv;

    return-object v0
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public l()Lcom/umeng/analytics/pro/cl;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->u()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->v()S

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    :goto_0
    new-instance v2, Lcom/umeng/analytics/pro/cl;

    .line 14
    .line 15
    const-string v3, ""

    .line 16
    .line 17
    invoke-direct {v2, v3, v0, v1}, Lcom/umeng/analytics/pro/cl;-><init>(Ljava/lang/String;BS)V

    .line 18
    .line 19
    .line 20
    return-object v2
    .line 21
    .line 22
    .line 23
.end method

.method public m()V
    .locals 0

    return-void
.end method

.method public n()Lcom/umeng/analytics/pro/cn;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    new-instance v0, Lcom/umeng/analytics/pro/cn;

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->u()B

    move-result v1

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->u()B

    move-result v2

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->w()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/umeng/analytics/pro/cn;-><init>(BBI)V

    return-object v0
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public p()Lcom/umeng/analytics/pro/cm;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    new-instance v0, Lcom/umeng/analytics/pro/cm;

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->u()B

    move-result v1

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->w()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/umeng/analytics/pro/cm;-><init>(BI)V

    return-object v0
.end method

.method public q()V
    .locals 0

    return-void
.end method

.method public r()Lcom/umeng/analytics/pro/cu;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    new-instance v0, Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->u()B

    move-result v1

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->w()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/umeng/analytics/pro/cu;-><init>(BI)V

    return-object v0
.end method

.method public s()V
    .locals 0

    return-void
.end method

.method public t()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->u()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public u()B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/de;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/de;->f()[B

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v2, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/umeng/analytics/pro/de;->g()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    aget-byte v0, v0, v2

    .line 23
    .line 24
    iget-object v2, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Lcom/umeng/analytics/pro/de;->a(I)V

    .line 27
    .line 28
    .line 29
    return v0

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/cj;->m:[B

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {p0, v0, v2, v1}, Lcom/umeng/analytics/pro/cj;->a([BII)I

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/umeng/analytics/pro/cj;->m:[B

    .line 37
    .line 38
    aget-byte v0, v0, v2

    .line 39
    .line 40
    return v0
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public v()S
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/cj;->n:[B

    .line 2
    .line 3
    iget-object v1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/umeng/analytics/pro/de;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x2

    .line 10
    if-lt v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/de;->f()[B

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/umeng/analytics/pro/de;->g()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v3, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 25
    .line 26
    invoke-virtual {v3, v2}, Lcom/umeng/analytics/pro/de;->a(I)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/cj;->n:[B

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {p0, v1, v3, v2}, Lcom/umeng/analytics/pro/cj;->a([BII)I

    .line 34
    .line 35
    .line 36
    move v1, v3

    .line 37
    :goto_0
    aget-byte v2, v0, v1

    .line 38
    .line 39
    and-int/lit16 v2, v2, 0xff

    .line 40
    .line 41
    shl-int/lit8 v2, v2, 0x8

    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    aget-byte v0, v0, v1

    .line 46
    .line 47
    and-int/lit16 v0, v0, 0xff

    .line 48
    .line 49
    or-int/2addr v0, v2

    .line 50
    int-to-short v0, v0

    .line 51
    return v0
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public w()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/cj;->o:[B

    .line 2
    .line 3
    iget-object v1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/umeng/analytics/pro/de;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x4

    .line 10
    if-lt v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/de;->f()[B

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/umeng/analytics/pro/de;->g()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v3, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 25
    .line 26
    invoke-virtual {v3, v2}, Lcom/umeng/analytics/pro/de;->a(I)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/cj;->o:[B

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {p0, v1, v3, v2}, Lcom/umeng/analytics/pro/cj;->a([BII)I

    .line 34
    .line 35
    .line 36
    move v1, v3

    .line 37
    :goto_0
    aget-byte v2, v0, v1

    .line 38
    .line 39
    and-int/lit16 v2, v2, 0xff

    .line 40
    .line 41
    shl-int/lit8 v2, v2, 0x18

    .line 42
    .line 43
    add-int/lit8 v3, v1, 0x1

    .line 44
    .line 45
    aget-byte v3, v0, v3

    .line 46
    .line 47
    and-int/lit16 v3, v3, 0xff

    .line 48
    .line 49
    shl-int/lit8 v3, v3, 0x10

    .line 50
    .line 51
    or-int/2addr v2, v3

    .line 52
    add-int/lit8 v3, v1, 0x2

    .line 53
    .line 54
    aget-byte v3, v0, v3

    .line 55
    .line 56
    and-int/lit16 v3, v3, 0xff

    .line 57
    .line 58
    shl-int/lit8 v3, v3, 0x8

    .line 59
    .line 60
    or-int/2addr v2, v3

    .line 61
    add-int/lit8 v1, v1, 0x3

    .line 62
    .line 63
    aget-byte v0, v0, v1

    .line 64
    .line 65
    and-int/lit16 v0, v0, 0xff

    .line 66
    .line 67
    or-int/2addr v0, v2

    .line 68
    return v0
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public x()J
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/cj;->p:[B

    .line 2
    .line 3
    iget-object v1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/umeng/analytics/pro/de;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    if-lt v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/de;->f()[B

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/umeng/analytics/pro/de;->g()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v3, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 26
    .line 27
    invoke-virtual {v3, v2}, Lcom/umeng/analytics/pro/de;->a(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/cj;->p:[B

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-direct {p0, v1, v3, v2}, Lcom/umeng/analytics/pro/cj;->a([BII)I

    .line 35
    .line 36
    .line 37
    move v1, v3

    .line 38
    :goto_0
    aget-byte v3, v0, v1

    .line 39
    .line 40
    and-int/lit16 v3, v3, 0xff

    .line 41
    .line 42
    int-to-long v3, v3

    .line 43
    const/16 v5, 0x38

    .line 44
    .line 45
    shl-long/2addr v3, v5

    .line 46
    add-int/lit8 v5, v1, 0x1

    .line 47
    .line 48
    aget-byte v5, v0, v5

    .line 49
    .line 50
    and-int/lit16 v5, v5, 0xff

    .line 51
    .line 52
    int-to-long v5, v5

    .line 53
    const/16 v7, 0x30

    .line 54
    .line 55
    shl-long/2addr v5, v7

    .line 56
    or-long/2addr v3, v5

    .line 57
    add-int/lit8 v5, v1, 0x2

    .line 58
    .line 59
    aget-byte v5, v0, v5

    .line 60
    .line 61
    and-int/lit16 v5, v5, 0xff

    .line 62
    .line 63
    int-to-long v5, v5

    .line 64
    const/16 v7, 0x28

    .line 65
    .line 66
    shl-long/2addr v5, v7

    .line 67
    or-long/2addr v3, v5

    .line 68
    add-int/lit8 v5, v1, 0x3

    .line 69
    .line 70
    aget-byte v5, v0, v5

    .line 71
    .line 72
    and-int/lit16 v5, v5, 0xff

    .line 73
    .line 74
    int-to-long v5, v5

    .line 75
    const/16 v7, 0x20

    .line 76
    .line 77
    shl-long/2addr v5, v7

    .line 78
    or-long/2addr v3, v5

    .line 79
    add-int/lit8 v5, v1, 0x4

    .line 80
    .line 81
    aget-byte v5, v0, v5

    .line 82
    .line 83
    and-int/lit16 v5, v5, 0xff

    .line 84
    .line 85
    int-to-long v5, v5

    .line 86
    const/16 v7, 0x18

    .line 87
    .line 88
    shl-long/2addr v5, v7

    .line 89
    or-long/2addr v3, v5

    .line 90
    add-int/lit8 v5, v1, 0x5

    .line 91
    .line 92
    aget-byte v5, v0, v5

    .line 93
    .line 94
    and-int/lit16 v5, v5, 0xff

    .line 95
    .line 96
    int-to-long v5, v5

    .line 97
    const/16 v7, 0x10

    .line 98
    .line 99
    shl-long/2addr v5, v7

    .line 100
    or-long/2addr v3, v5

    .line 101
    add-int/lit8 v5, v1, 0x6

    .line 102
    .line 103
    aget-byte v5, v0, v5

    .line 104
    .line 105
    and-int/lit16 v5, v5, 0xff

    .line 106
    .line 107
    int-to-long v5, v5

    .line 108
    shl-long/2addr v5, v2

    .line 109
    or-long v2, v3, v5

    .line 110
    .line 111
    add-int/lit8 v1, v1, 0x7

    .line 112
    .line 113
    aget-byte v0, v0, v1

    .line 114
    .line 115
    and-int/lit16 v0, v0, 0xff

    .line 116
    .line 117
    int-to-long v0, v0

    .line 118
    or-long/2addr v0, v2

    .line 119
    return-wide v0
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method public y()D
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->x()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public z()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cj;->w()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/umeng/analytics/pro/de;->h()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-lt v1, v0, :cond_0

    .line 12
    .line 13
    :try_start_0
    new-instance v1, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/umeng/analytics/pro/de;->f()[B

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/umeng/analytics/pro/de;->g()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const-string v4, "UTF-8"

    .line 28
    .line 29
    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 33
    .line 34
    invoke-virtual {v2, v0}, Lcom/umeng/analytics/pro/de;->a(I)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :catch_0
    new-instance v0, Lcom/umeng/analytics/pro/bx;

    .line 39
    .line 40
    const-string v1, "JVM DOES NOT SUPPORT UTF-8"

    .line 41
    .line 42
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_0
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/cj;->b(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method
