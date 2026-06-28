.class public Lcom/umeng/analytics/pro/ck;
.super Lcom/umeng/analytics/pro/cq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/ck$b;,
        Lcom/umeng/analytics/pro/ck$a;
    }
.end annotation


# static fields
.field private static final d:Lcom/umeng/analytics/pro/cv;

.field private static final e:Lcom/umeng/analytics/pro/cl;

.field private static final f:[B

.field private static final h:B = -0x7et

.field private static final i:B = 0x1t

.field private static final j:B = 0x1ft

.field private static final k:B = -0x20t

.field private static final l:I = 0x5


# instance fields
.field a:[B

.field b:[B

.field c:[B

.field private m:Lcom/umeng/analytics/pro/bp;

.field private n:S

.field private o:Lcom/umeng/analytics/pro/cl;

.field private p:Ljava/lang/Boolean;

.field private final q:J

.field private r:[B


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/cv;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/cv;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/umeng/analytics/pro/ck;->d:Lcom/umeng/analytics/pro/cv;

    .line 9
    .line 10
    new-instance v0, Lcom/umeng/analytics/pro/cl;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2, v2}, Lcom/umeng/analytics/pro/cl;-><init>(Ljava/lang/String;BS)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lcom/umeng/analytics/pro/ck;->e:Lcom/umeng/analytics/pro/cl;

    .line 17
    .line 18
    const/16 v0, 0x10

    .line 19
    .line 20
    new-array v0, v0, [B

    .line 21
    .line 22
    sput-object v0, Lcom/umeng/analytics/pro/ck;->f:[B

    .line 23
    .line 24
    aput-byte v2, v0, v2

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    const/4 v2, 0x1

    .line 28
    aput-byte v2, v0, v1

    .line 29
    .line 30
    const/4 v1, 0x3

    .line 31
    aput-byte v1, v0, v1

    .line 32
    .line 33
    const/4 v1, 0x6

    .line 34
    const/4 v2, 0x4

    .line 35
    aput-byte v2, v0, v1

    .line 36
    .line 37
    const/4 v3, 0x5

    .line 38
    const/16 v4, 0x8

    .line 39
    .line 40
    aput-byte v3, v0, v4

    .line 41
    .line 42
    const/16 v3, 0xa

    .line 43
    .line 44
    aput-byte v1, v0, v3

    .line 45
    .line 46
    const/4 v1, 0x7

    .line 47
    aput-byte v1, v0, v2

    .line 48
    .line 49
    const/16 v1, 0xb

    .line 50
    .line 51
    aput-byte v4, v0, v1

    .line 52
    .line 53
    const/16 v2, 0xf

    .line 54
    .line 55
    const/16 v4, 0x9

    .line 56
    .line 57
    aput-byte v4, v0, v2

    .line 58
    .line 59
    const/16 v2, 0xe

    .line 60
    .line 61
    aput-byte v3, v0, v2

    .line 62
    .line 63
    const/16 v2, 0xd

    .line 64
    .line 65
    aput-byte v1, v0, v2

    .line 66
    .line 67
    const/16 v1, 0xc

    .line 68
    .line 69
    aput-byte v1, v0, v1

    .line 70
    .line 71
    return-void
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

.method public constructor <init>(Lcom/umeng/analytics/pro/de;)V
    .locals 2

    const-wide/16 v0, -0x1

    .line 11
    invoke-direct {p0, p1, v0, v1}, Lcom/umeng/analytics/pro/ck;-><init>(Lcom/umeng/analytics/pro/de;J)V

    return-void
.end method

.method public constructor <init>(Lcom/umeng/analytics/pro/de;J)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/cq;-><init>(Lcom/umeng/analytics/pro/de;)V

    .line 2
    new-instance p1, Lcom/umeng/analytics/pro/bp;

    const/16 v0, 0xf

    invoke-direct {p1, v0}, Lcom/umeng/analytics/pro/bp;-><init>(I)V

    iput-object p1, p0, Lcom/umeng/analytics/pro/ck;->m:Lcom/umeng/analytics/pro/bp;

    const/4 p1, 0x0

    .line 3
    iput-short p1, p0, Lcom/umeng/analytics/pro/ck;->n:S

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/analytics/pro/ck;->o:Lcom/umeng/analytics/pro/cl;

    .line 5
    iput-object p1, p0, Lcom/umeng/analytics/pro/ck;->p:Ljava/lang/Boolean;

    const/4 p1, 0x5

    new-array p1, p1, [B

    .line 6
    iput-object p1, p0, Lcom/umeng/analytics/pro/ck;->a:[B

    const/16 p1, 0xa

    new-array p1, p1, [B

    .line 7
    iput-object p1, p0, Lcom/umeng/analytics/pro/ck;->b:[B

    const/4 p1, 0x1

    new-array v0, p1, [B

    .line 8
    iput-object v0, p0, Lcom/umeng/analytics/pro/ck;->r:[B

    new-array p1, p1, [B

    .line 9
    iput-object p1, p0, Lcom/umeng/analytics/pro/ck;->c:[B

    .line 10
    iput-wide p2, p0, Lcom/umeng/analytics/pro/ck;->q:J

    return-void
.end method

.method private E()I
    .locals 8
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
    const/4 v1, 0x5

    .line 8
    const/16 v2, 0x80

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-lt v0, v1, :cond_1

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
    move v4, v3

    .line 26
    move v5, v4

    .line 27
    :goto_0
    add-int v6, v1, v3

    .line 28
    .line 29
    aget-byte v6, v0, v6

    .line 30
    .line 31
    and-int/lit8 v7, v6, 0x7f

    .line 32
    .line 33
    shl-int/2addr v7, v5

    .line 34
    or-int/2addr v4, v7

    .line 35
    and-int/2addr v6, v2

    .line 36
    if-eq v6, v2, :cond_0

    .line 37
    .line 38
    iget-object v0, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 39
    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Lcom/umeng/analytics/pro/de;->a(I)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_0
    add-int/lit8 v5, v5, 0x7

    .line 47
    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v0, v3

    .line 52
    :goto_1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/ck;->u()B

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    and-int/lit8 v4, v1, 0x7f

    .line 57
    .line 58
    shl-int/2addr v4, v0

    .line 59
    or-int/2addr v3, v4

    .line 60
    and-int/2addr v1, v2

    .line 61
    if-eq v1, v2, :cond_2

    .line 62
    .line 63
    move v4, v3

    .line 64
    :goto_2
    return v4

    .line 65
    :cond_2
    add-int/lit8 v0, v0, 0x7

    .line 66
    .line 67
    goto :goto_1
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

.method private F()J
    .locals 10
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
    const/16 v1, 0xa

    .line 8
    .line 9
    const/16 v2, 0x80

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    if-lt v0, v1, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/de;->f()[B

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/umeng/analytics/pro/de;->g()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    move-wide v5, v4

    .line 29
    move v4, v3

    .line 30
    :goto_0
    add-int v7, v1, v3

    .line 31
    .line 32
    aget-byte v7, v0, v7

    .line 33
    .line 34
    and-int/lit8 v8, v7, 0x7f

    .line 35
    .line 36
    int-to-long v8, v8

    .line 37
    shl-long/2addr v8, v4

    .line 38
    or-long/2addr v5, v8

    .line 39
    and-int/2addr v7, v2

    .line 40
    if-eq v7, v2, :cond_0

    .line 41
    .line 42
    iget-object v0, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Lcom/umeng/analytics/pro/de;->a(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_0
    add-int/lit8 v4, v4, 0x7

    .line 51
    .line 52
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/ck;->u()B

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    and-int/lit8 v1, v0, 0x7f

    .line 60
    .line 61
    int-to-long v6, v1

    .line 62
    shl-long/2addr v6, v3

    .line 63
    or-long/2addr v4, v6

    .line 64
    and-int/2addr v0, v2

    .line 65
    if-eq v0, v2, :cond_2

    .line 66
    .line 67
    move-wide v5, v4

    .line 68
    :goto_2
    return-wide v5

    .line 69
    :cond_2
    add-int/lit8 v3, v3, 0x7

    .line 70
    .line 71
    goto :goto_1
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

.method private a([B)J
    .locals 7

    const/4 v0, 0x7

    .line 51
    aget-byte v0, p1, v0

    int-to-long v0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    const/16 v4, 0x38

    shl-long/2addr v0, v4

    const/4 v4, 0x6

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x30

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    const/4 v4, 0x5

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x28

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    const/4 v4, 0x4

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x20

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    const/4 v4, 0x3

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x18

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    const/4 v4, 0x2

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x10

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    const/4 v4, 0x1

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x8

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    const/4 v4, 0x0

    aget-byte p1, p1, v4

    int-to-long v4, p1

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method private a(J[BI)V
    .locals 5

    add-int/lit8 v0, p4, 0x0

    const-wide/16 v1, 0xff

    and-long v3, p1, v1

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 43
    aput-byte v3, p3, v0

    add-int/lit8 v0, p4, 0x1

    const/16 v3, 0x8

    shr-long v3, p1, v3

    and-long/2addr v3, v1

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 44
    aput-byte v3, p3, v0

    add-int/lit8 v0, p4, 0x2

    const/16 v3, 0x10

    shr-long v3, p1, v3

    and-long/2addr v3, v1

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 45
    aput-byte v3, p3, v0

    add-int/lit8 v0, p4, 0x3

    const/16 v3, 0x18

    shr-long v3, p1, v3

    and-long/2addr v3, v1

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 46
    aput-byte v3, p3, v0

    add-int/lit8 v0, p4, 0x4

    const/16 v3, 0x20

    shr-long v3, p1, v3

    and-long/2addr v3, v1

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 47
    aput-byte v3, p3, v0

    add-int/lit8 v0, p4, 0x5

    const/16 v3, 0x28

    shr-long v3, p1, v3

    and-long/2addr v3, v1

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 48
    aput-byte v3, p3, v0

    add-int/lit8 v0, p4, 0x6

    const/16 v3, 0x30

    shr-long v3, p1, v3

    and-long/2addr v3, v1

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 49
    aput-byte v3, p3, v0

    add-int/lit8 p4, p4, 0x7

    const/16 v0, 0x38

    shr-long/2addr p1, v0

    and-long/2addr p1, v1

    long-to-int p1, p1

    int-to-byte p1, p1

    .line 50
    aput-byte p1, p3, p4

    return-void
.end method

.method private a(Lcom/umeng/analytics/pro/cl;B)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 10
    iget-byte p2, p1, Lcom/umeng/analytics/pro/cl;->b:B

    invoke-direct {p0, p2}, Lcom/umeng/analytics/pro/ck;->e(B)B

    move-result p2

    .line 11
    :cond_0
    iget-short v0, p1, Lcom/umeng/analytics/pro/cl;->c:S

    iget-short v1, p0, Lcom/umeng/analytics/pro/ck;->n:S

    if-le v0, v1, :cond_1

    sub-int v2, v0, v1

    const/16 v3, 0xf

    if-gt v2, v3, :cond_1

    sub-int/2addr v0, v1

    shl-int/lit8 v0, v0, 0x4

    or-int/2addr p2, v0

    .line 12
    invoke-direct {p0, p2}, Lcom/umeng/analytics/pro/ck;->d(I)V

    goto :goto_0

    .line 13
    :cond_1
    invoke-direct {p0, p2}, Lcom/umeng/analytics/pro/ck;->b(B)V

    .line 14
    iget-short p2, p1, Lcom/umeng/analytics/pro/cl;->c:S

    invoke-virtual {p0, p2}, Lcom/umeng/analytics/pro/ck;->a(S)V

    .line 15
    :goto_0
    iget-short p1, p1, Lcom/umeng/analytics/pro/cl;->c:S

    iput-short p1, p0, Lcom/umeng/analytics/pro/ck;->n:S

    return-void
.end method

.method private a([BII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 38
    invoke-direct {p0, p3}, Lcom/umeng/analytics/pro/ck;->b(I)V

    .line 39
    iget-object v0, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    invoke-virtual {v0, p1, p2, p3}, Lcom/umeng/analytics/pro/de;->b([BII)V

    return-void
.end method

.method private b(B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/umeng/analytics/pro/ck;->r:[B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    .line 9
    iget-object p1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/de;->b([B)V

    return-void
.end method

.method private b(I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    and-int/lit8 v2, p1, -0x80

    if-nez v2, :cond_0

    .line 2
    iget-object v2, p0, Lcom/umeng/analytics/pro/ck;->a:[B

    add-int/lit8 v3, v1, 0x1

    int-to-byte p1, p1

    aput-byte p1, v2, v1

    .line 3
    iget-object p1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    invoke-virtual {p1, v2, v0, v3}, Lcom/umeng/analytics/pro/de;->b([BII)V

    return-void

    .line 4
    :cond_0
    iget-object v2, p0, Lcom/umeng/analytics/pro/ck;->a:[B

    add-int/lit8 v3, v1, 0x1

    and-int/lit8 v4, p1, 0x7f

    or-int/lit16 v4, v4, 0x80

    int-to-byte v4, v4

    aput-byte v4, v2, v1

    ushr-int/lit8 p1, p1, 0x7

    move v1, v3

    goto :goto_0
.end method

.method private b(J)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const-wide/16 v2, -0x80

    and-long/2addr v2, p1

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    .line 5
    iget-object v2, p0, Lcom/umeng/analytics/pro/ck;->b:[B

    add-int/lit8 v3, v1, 0x1

    long-to-int p1, p1

    int-to-byte p1, p1

    aput-byte p1, v2, v1

    .line 6
    iget-object p1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    invoke-virtual {p1, v2, v0, v3}, Lcom/umeng/analytics/pro/de;->b([BII)V

    return-void

    .line 7
    :cond_0
    iget-object v2, p0, Lcom/umeng/analytics/pro/ck;->b:[B

    add-int/lit8 v3, v1, 0x1

    const-wide/16 v4, 0x7f

    and-long/2addr v4, p1

    const-wide/16 v6, 0x80

    or-long/2addr v4, v6

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v2, v1

    const/4 v1, 0x7

    ushr-long/2addr p1, v1

    move v1, v3

    goto :goto_0
.end method

.method private c(I)I
    .locals 1

    shl-int/lit8 v0, p1, 0x1

    shr-int/lit8 p1, p1, 0x1f

    xor-int/2addr p1, v0

    return p1
.end method

.method private c(J)J
    .locals 3

    const/4 v0, 0x1

    shl-long v0, p1, v0

    const/16 v2, 0x3f

    shr-long/2addr p1, v2

    xor-long/2addr p1, v0

    return-wide p1
.end method

.method private c(B)Z
    .locals 2

    and-int/lit8 p1, p1, 0xf

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method private d(B)B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cr;
        }
    .end annotation

    const/16 v0, 0xf

    and-int/2addr p1, v0

    int-to-byte p1, p1

    packed-switch p1, :pswitch_data_0

    .line 3
    new-instance v0, Lcom/umeng/analytics/pro/cr;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "don\'t know what type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/umeng/analytics/pro/cr;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/16 p1, 0xc

    return p1

    :pswitch_1
    const/16 p1, 0xd

    return p1

    :pswitch_2
    const/16 p1, 0xe

    return p1

    :pswitch_3
    return v0

    :pswitch_4
    const/16 p1, 0xb

    return p1

    :pswitch_5
    const/4 p1, 0x4

    return p1

    :pswitch_6
    const/16 p1, 0xa

    return p1

    :pswitch_7
    const/16 p1, 0x8

    return p1

    :pswitch_8
    const/4 p1, 0x6

    return p1

    :pswitch_9
    const/4 p1, 0x3

    return p1

    :pswitch_a
    const/4 p1, 0x2

    return p1

    :pswitch_b
    const/4 p1, 0x0

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private d(J)J
    .locals 4

    const/4 v0, 0x1

    ushr-long v0, p1, v0

    const-wide/16 v2, 0x1

    and-long/2addr p1, v2

    neg-long p1, p1

    xor-long/2addr p1, v0

    return-wide p1
.end method

.method private d(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    int-to-byte p1, p1

    .line 2
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ck;->b(B)V

    return-void
.end method

.method private e(B)B
    .locals 1

    .line 3
    sget-object v0, Lcom/umeng/analytics/pro/ck;->f:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method private e(I)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    new-array p1, v0, [B

    return-object p1

    .line 1
    :cond_0
    new-array v1, p1, [B

    .line 2
    iget-object v2, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    invoke-virtual {v2, v1, v0, p1}, Lcom/umeng/analytics/pro/de;->d([BII)I

    return-object v1
.end method

.method private f(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cr;
        }
    .end annotation

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/umeng/analytics/pro/ck;->q:J

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    int-to-long v2, p1

    .line 12
    cmp-long v0, v2, v0

    .line 13
    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Lcom/umeng/analytics/pro/cr;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "Length exceeded max allowed: "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {v0, p1}, Lcom/umeng/analytics/pro/cr;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    :goto_0
    return-void

    .line 41
    :cond_2
    new-instance v0, Lcom/umeng/analytics/pro/cr;

    .line 42
    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v2, "Negative length: "

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {v0, p1}, Lcom/umeng/analytics/pro/cr;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
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
.end method

.method private g(I)I
    .locals 1

    ushr-int/lit8 v0, p1, 0x1

    and-int/lit8 p1, p1, 0x1

    neg-int p1, p1

    xor-int/2addr p1, v0

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
    invoke-direct {p0}, Lcom/umeng/analytics/pro/ck;->E()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/ck;->f(I)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-array v0, v1, [B

    .line 12
    .line 13
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    new-array v2, v0, [B

    .line 19
    .line 20
    iget-object v3, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 21
    .line 22
    invoke-virtual {v3, v2, v1, v0}, Lcom/umeng/analytics/pro/de;->d([BII)I

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
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

.method public B()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/ck;->m:Lcom/umeng/analytics/pro/bp;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/bp;->c()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-short v0, p0, Lcom/umeng/analytics/pro/ck;->n:S

    .line 8
    .line 9
    return-void
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
.end method

.method public a()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    return-void
.end method

.method public a(B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 26
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ck;->b(B)V

    return-void
.end method

.method protected a(BI)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/16 v0, 0xe

    if-gt p2, v0, :cond_0

    shl-int/lit8 p2, p2, 0x4

    .line 40
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ck;->e(B)B

    move-result p1

    or-int/2addr p1, p2

    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ck;->d(I)V

    goto :goto_0

    .line 41
    :cond_0
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ck;->e(B)B

    move-result p1

    or-int/lit16 p1, p1, 0xf0

    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ck;->d(I)V

    .line 42
    invoke-direct {p0, p2}, Lcom/umeng/analytics/pro/ck;->b(I)V

    :goto_0
    return-void
.end method

.method public a(D)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/16 v0, 0x8

    new-array v0, v0, [B

    .line 30
    fill-array-data v0, :array_0

    .line 31
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/umeng/analytics/pro/ck;->a(J[BI)V

    .line 32
    iget-object p1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/de;->b([B)V

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public a(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 28
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ck;->c(I)I

    move-result p1

    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ck;->b(I)V

    return-void
.end method

.method public a(J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 29
    invoke-direct {p0, p1, p2}, Lcom/umeng/analytics/pro/ck;->c(J)J

    move-result-wide p1

    invoke-direct {p0, p1, p2}, Lcom/umeng/analytics/pro/ck;->b(J)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/cl;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 7
    iget-byte v0, p1, Lcom/umeng/analytics/pro/cl;->b:B

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 8
    iput-object p1, p0, Lcom/umeng/analytics/pro/ck;->o:Lcom/umeng/analytics/pro/cl;

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    .line 9
    invoke-direct {p0, p1, v0}, Lcom/umeng/analytics/pro/ck;->a(Lcom/umeng/analytics/pro/cl;B)V

    :goto_0
    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/cm;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 20
    iget-byte v0, p1, Lcom/umeng/analytics/pro/cm;->a:B

    iget p1, p1, Lcom/umeng/analytics/pro/cm;->b:I

    invoke-virtual {p0, v0, p1}, Lcom/umeng/analytics/pro/ck;->a(BI)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/cn;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 16
    iget v0, p1, Lcom/umeng/analytics/pro/cn;->c:I

    if-nez v0, :cond_0

    const/4 p1, 0x0

    .line 17
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ck;->d(I)V

    goto :goto_0

    .line 18
    :cond_0
    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/ck;->b(I)V

    .line 19
    iget-byte v0, p1, Lcom/umeng/analytics/pro/cn;->a:B

    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/ck;->e(B)B

    move-result v0

    shl-int/lit8 v0, v0, 0x4

    iget-byte p1, p1, Lcom/umeng/analytics/pro/cn;->b:B

    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ck;->e(B)B

    move-result p1

    or-int/2addr p1, v0

    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ck;->d(I)V

    :goto_0
    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/co;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/16 v0, -0x7e

    .line 1
    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/ck;->b(B)V

    .line 2
    iget-byte v0, p1, Lcom/umeng/analytics/pro/co;->b:B

    shl-int/lit8 v0, v0, 0x5

    and-int/lit8 v0, v0, -0x20

    or-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/ck;->d(I)V

    .line 3
    iget v0, p1, Lcom/umeng/analytics/pro/co;->c:I

    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/ck;->b(I)V

    .line 4
    iget-object p1, p1, Lcom/umeng/analytics/pro/co;->a:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/ck;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/cu;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 21
    iget-byte v0, p1, Lcom/umeng/analytics/pro/cu;->a:B

    iget p1, p1, Lcom/umeng/analytics/pro/cu;->b:I

    invoke-virtual {p0, v0, p1}, Lcom/umeng/analytics/pro/ck;->a(BI)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/cv;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 5
    iget-object p1, p0, Lcom/umeng/analytics/pro/ck;->m:Lcom/umeng/analytics/pro/bp;

    iget-short v0, p0, Lcom/umeng/analytics/pro/ck;->n:S

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bp;->a(S)V

    const/4 p1, 0x0

    .line 6
    iput-short p1, p0, Lcom/umeng/analytics/pro/ck;->n:S

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    :try_start_0
    const-string v0, "UTF-8"

    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    .line 34
    array-length v0, p1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lcom/umeng/analytics/pro/ck;->a([BII)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 35
    :catch_0
    new-instance p1, Lcom/umeng/analytics/pro/bx;

    const-string v0, "UTF-8 not supported!"

    invoke-direct {p1, v0}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/nio/ByteBuffer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 36
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    sub-int/2addr v0, v1

    .line 37
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p1

    add-int/2addr v2, p1

    invoke-direct {p0, v1, v2, v0}, Lcom/umeng/analytics/pro/ck;->a([BII)V

    return-void
.end method

.method public a(S)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ck;->c(I)I

    move-result p1

    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ck;->b(I)V

    return-void
.end method

.method public a(Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/umeng/analytics/pro/ck;->o:Lcom/umeng/analytics/pro/cl;

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    .line 23
    :goto_0
    invoke-direct {p0, v0, v1}, Lcom/umeng/analytics/pro/ck;->a(Lcom/umeng/analytics/pro/cl;B)V

    const/4 p1, 0x0

    .line 24
    iput-object p1, p0, Lcom/umeng/analytics/pro/ck;->o:Lcom/umeng/analytics/pro/cl;

    goto :goto_2

    :cond_1
    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    .line 25
    :goto_1
    invoke-direct {p0, v1}, Lcom/umeng/analytics/pro/ck;->b(B)V

    :goto_2
    return-void
.end method

.method public b()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/ck;->m:Lcom/umeng/analytics/pro/bp;

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/bp;->a()S

    move-result v0

    iput-short v0, p0, Lcom/umeng/analytics/pro/ck;->n:S

    return-void
.end method

.method public c()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    return-void
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
    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/ck;->b(B)V

    return-void
.end method

.method public e()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    return-void
.end method

.method public f()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    return-void
.end method

.method public g()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    return-void
.end method

.method public h()Lcom/umeng/analytics/pro/co;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/ck;->u()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, -0x7e

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/ck;->u()B

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit8 v1, v0, 0x1f

    .line 14
    .line 15
    int-to-byte v1, v1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    shr-int/lit8 v0, v0, 0x5

    .line 20
    .line 21
    and-int/lit8 v0, v0, 0x3

    .line 22
    .line 23
    int-to-byte v0, v0

    .line 24
    invoke-direct {p0}, Lcom/umeng/analytics/pro/ck;->E()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/ck;->z()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    new-instance v3, Lcom/umeng/analytics/pro/co;

    .line 33
    .line 34
    invoke-direct {v3, v2, v0, v1}, Lcom/umeng/analytics/pro/co;-><init>(Ljava/lang/String;BI)V

    .line 35
    .line 36
    .line 37
    return-object v3

    .line 38
    :cond_0
    new-instance v0, Lcom/umeng/analytics/pro/cr;

    .line 39
    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v3, "Expected version 1 but got "

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/cr;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_1
    new-instance v2, Lcom/umeng/analytics/pro/cr;

    .line 62
    .line 63
    new-instance v3, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v4, "Expected protocol id "

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, " but got "

    .line 81
    .line 82
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-direct {v2, v0}, Lcom/umeng/analytics/pro/cr;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v2
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
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    return-void
.end method

.method public j()Lcom/umeng/analytics/pro/cv;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/ck;->m:Lcom/umeng/analytics/pro/bp;

    .line 2
    .line 3
    iget-short v1, p0, Lcom/umeng/analytics/pro/ck;->n:S

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/bp;->a(S)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-short v0, p0, Lcom/umeng/analytics/pro/ck;->n:S

    .line 10
    .line 11
    sget-object v0, Lcom/umeng/analytics/pro/ck;->d:Lcom/umeng/analytics/pro/cv;

    .line 12
    .line 13
    return-object v0
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
.end method

.method public k()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    iget-object v0, p0, Lcom/umeng/analytics/pro/ck;->m:Lcom/umeng/analytics/pro/bp;

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/bp;->a()S

    move-result v0

    iput-short v0, p0, Lcom/umeng/analytics/pro/ck;->n:S

    return-void
.end method

.method public l()Lcom/umeng/analytics/pro/cl;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/ck;->u()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/umeng/analytics/pro/ck;->e:Lcom/umeng/analytics/pro/cl;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    and-int/lit16 v1, v0, 0xf0

    .line 11
    .line 12
    shr-int/lit8 v1, v1, 0x4

    .line 13
    .line 14
    int-to-short v1, v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/ck;->v()S

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-short v2, p0, Lcom/umeng/analytics/pro/ck;->n:S

    .line 23
    .line 24
    add-int/2addr v2, v1

    .line 25
    int-to-short v1, v2

    .line 26
    :goto_0
    new-instance v2, Lcom/umeng/analytics/pro/cl;

    .line 27
    .line 28
    and-int/lit8 v3, v0, 0xf

    .line 29
    .line 30
    int-to-byte v3, v3

    .line 31
    invoke-direct {p0, v3}, Lcom/umeng/analytics/pro/ck;->d(B)B

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const-string v5, ""

    .line 36
    .line 37
    invoke-direct {v2, v5, v4, v1}, Lcom/umeng/analytics/pro/cl;-><init>(Ljava/lang/String;BS)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/ck;->c(B)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    if-ne v3, v0, :cond_2

    .line 48
    .line 49
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 53
    .line 54
    :goto_1
    iput-object v0, p0, Lcom/umeng/analytics/pro/ck;->p:Ljava/lang/Boolean;

    .line 55
    .line 56
    :cond_3
    iget-short v0, v2, Lcom/umeng/analytics/pro/cl;->c:S

    .line 57
    .line 58
    iput-short v0, p0, Lcom/umeng/analytics/pro/ck;->n:S

    .line 59
    .line 60
    return-object v2
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

.method public m()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    return-void
.end method

.method public n()Lcom/umeng/analytics/pro/cn;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/pro/ck;->E()I

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
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/ck;->u()B

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    :goto_0
    new-instance v2, Lcom/umeng/analytics/pro/cn;

    .line 14
    .line 15
    shr-int/lit8 v3, v1, 0x4

    .line 16
    .line 17
    int-to-byte v3, v3

    .line 18
    invoke-direct {p0, v3}, Lcom/umeng/analytics/pro/ck;->d(B)B

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    and-int/lit8 v1, v1, 0xf

    .line 23
    .line 24
    int-to-byte v1, v1

    .line 25
    invoke-direct {p0, v1}, Lcom/umeng/analytics/pro/ck;->d(B)B

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-direct {v2, v3, v1, v0}, Lcom/umeng/analytics/pro/cn;-><init>(BBI)V

    .line 30
    .line 31
    .line 32
    return-object v2
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

.method public o()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    return-void
.end method

.method public p()Lcom/umeng/analytics/pro/cm;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/ck;->u()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shr-int/lit8 v1, v0, 0x4

    .line 6
    .line 7
    const/16 v2, 0xf

    .line 8
    .line 9
    and-int/2addr v1, v2

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/umeng/analytics/pro/ck;->E()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    :cond_0
    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/ck;->d(B)B

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    new-instance v2, Lcom/umeng/analytics/pro/cm;

    .line 21
    .line 22
    invoke-direct {v2, v0, v1}, Lcom/umeng/analytics/pro/cm;-><init>(BI)V

    .line 23
    .line 24
    .line 25
    return-object v2
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

.method public q()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    return-void
.end method

.method public r()Lcom/umeng/analytics/pro/cu;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    new-instance v0, Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/ck;->p()Lcom/umeng/analytics/pro/cm;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/cu;-><init>(Lcom/umeng/analytics/pro/cm;)V

    return-object v0
.end method

.method public s()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    return-void
.end method

.method public t()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/ck;->p:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    iput-object v1, p0, Lcom/umeng/analytics/pro/ck;->p:Ljava/lang/Boolean;

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/ck;->u()B

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v1, 0x0

    .line 22
    :goto_0
    return v1
    .line 23
.end method

.method public u()B
    .locals 4
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
    if-lez v0, :cond_0

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
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 31
    .line 32
    iget-object v2, p0, Lcom/umeng/analytics/pro/ck;->c:[B

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-virtual {v0, v2, v3, v1}, Lcom/umeng/analytics/pro/de;->d([BII)I

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/umeng/analytics/pro/ck;->c:[B

    .line 39
    .line 40
    aget-byte v0, v0, v3

    .line 41
    .line 42
    :goto_0
    return v0
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
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    invoke-direct {p0}, Lcom/umeng/analytics/pro/ck;->E()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/ck;->g(I)I

    move-result v0

    int-to-short v0, v0

    return v0
.end method

.method public w()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    invoke-direct {p0}, Lcom/umeng/analytics/pro/ck;->E()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/ck;->g(I)I

    move-result v0

    return v0
.end method

.method public x()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    invoke-direct {p0}, Lcom/umeng/analytics/pro/ck;->F()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/umeng/analytics/pro/ck;->d(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public y()D
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    iget-object v2, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-virtual {v2, v1, v3, v0}, Lcom/umeng/analytics/pro/de;->d([BII)I

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v1}, Lcom/umeng/analytics/pro/ck;->a([B)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    return-wide v0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public z()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/pro/ck;->E()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/ck;->f(I)V

    .line 6
    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, ""

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/umeng/analytics/pro/de;->h()I

    .line 16
    .line 17
    .line 18
    move-result v1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    const-string v2, "UTF-8"

    .line 20
    .line 21
    if-lt v1, v0, :cond_1

    .line 22
    .line 23
    :try_start_1
    new-instance v1, Ljava/lang/String;

    .line 24
    .line 25
    iget-object v3, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 26
    .line 27
    invoke-virtual {v3}, Lcom/umeng/analytics/pro/de;->f()[B

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v4, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 32
    .line 33
    invoke-virtual {v4}, Lcom/umeng/analytics/pro/de;->g()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-direct {v1, v3, v4, v0, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Lcom/umeng/analytics/pro/cq;->g:Lcom/umeng/analytics/pro/de;

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Lcom/umeng/analytics/pro/de;->a(I)V

    .line 43
    .line 44
    .line 45
    return-object v1

    .line 46
    :cond_1
    new-instance v1, Ljava/lang/String;

    .line 47
    .line 48
    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/ck;->e(I)[B

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    :catch_0
    new-instance v0, Lcom/umeng/analytics/pro/bx;

    .line 57
    .line 58
    const-string v1, "UTF-8 not supported!"

    .line 59
    .line 60
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
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
