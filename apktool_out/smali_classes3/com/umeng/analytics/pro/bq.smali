.class public Lcom/umeng/analytics/pro/bq;
.super Lcom/umeng/analytics/pro/bx;
.source "SourceFile"


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static final d:I = 0x3

.field public static final e:I = 0x4

.field public static final f:I = 0x5

.field public static final g:I = 0x6

.field public static final h:I = 0x7

.field private static final j:Lcom/umeng/analytics/pro/cv;

.field private static final k:Lcom/umeng/analytics/pro/cl;

.field private static final l:Lcom/umeng/analytics/pro/cl;

.field private static final m:J = 0x1L


# instance fields
.field protected i:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/cv;

    .line 2
    .line 3
    const-string v1, "TApplicationException"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/cv;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/umeng/analytics/pro/bq;->j:Lcom/umeng/analytics/pro/cv;

    .line 9
    .line 10
    new-instance v0, Lcom/umeng/analytics/pro/cl;

    .line 11
    .line 12
    const/16 v1, 0xb

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const-string v3, "message"

    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2}, Lcom/umeng/analytics/pro/cl;-><init>(Ljava/lang/String;BS)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/umeng/analytics/pro/bq;->k:Lcom/umeng/analytics/pro/cl;

    .line 21
    .line 22
    new-instance v0, Lcom/umeng/analytics/pro/cl;

    .line 23
    .line 24
    const/16 v1, 0x8

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    const-string v3, "type"

    .line 28
    .line 29
    invoke-direct {v0, v3, v1, v2}, Lcom/umeng/analytics/pro/cl;-><init>(Ljava/lang/String;BS)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/umeng/analytics/pro/bq;->l:Lcom/umeng/analytics/pro/cl;

    .line 33
    .line 34
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/pro/bx;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/umeng/analytics/pro/bq;->i:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/umeng/analytics/pro/bx;-><init>()V

    .line 4
    iput p1, p0, Lcom/umeng/analytics/pro/bq;->i:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0, p2}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/String;)V

    .line 6
    iput p1, p0, Lcom/umeng/analytics/pro/bq;->i:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lcom/umeng/analytics/pro/bq;->i:I

    return-void
.end method

.method public static a(Lcom/umeng/analytics/pro/cq;)Lcom/umeng/analytics/pro/bq;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cq;->j()Lcom/umeng/analytics/pro/cv;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cq;->l()Lcom/umeng/analytics/pro/cl;

    move-result-object v2

    .line 4
    iget-byte v3, v2, Lcom/umeng/analytics/pro/cl;->b:B

    if-nez v3, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cq;->k()V

    .line 6
    new-instance p0, Lcom/umeng/analytics/pro/bq;

    invoke-direct {p0, v1, v0}, Lcom/umeng/analytics/pro/bq;-><init>(ILjava/lang/String;)V

    return-object p0

    .line 7
    :cond_0
    iget-short v2, v2, Lcom/umeng/analytics/pro/cl;->c:S

    const/4 v4, 0x1

    if-eq v2, v4, :cond_3

    const/4 v4, 0x2

    if-eq v2, v4, :cond_1

    .line 8
    invoke-static {p0, v3}, Lcom/umeng/analytics/pro/ct;->a(Lcom/umeng/analytics/pro/cq;B)V

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    if-ne v3, v2, :cond_2

    .line 9
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cq;->w()I

    move-result v1

    goto :goto_1

    .line 10
    :cond_2
    invoke-static {p0, v3}, Lcom/umeng/analytics/pro/ct;->a(Lcom/umeng/analytics/pro/cq;B)V

    goto :goto_1

    :cond_3
    const/16 v2, 0xb

    if-ne v3, v2, :cond_4

    .line 11
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cq;->z()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 12
    :cond_4
    invoke-static {p0, v3}, Lcom/umeng/analytics/pro/ct;->a(Lcom/umeng/analytics/pro/cq;B)V

    .line 13
    :goto_1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cq;->m()V

    goto :goto_0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/umeng/analytics/pro/bq;->i:I

    return v0
.end method

.method public b(Lcom/umeng/analytics/pro/cq;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bq;->j:Lcom/umeng/analytics/pro/cv;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cq;->a(Lcom/umeng/analytics/pro/cv;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/umeng/analytics/pro/bq;->k:Lcom/umeng/analytics/pro/cl;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cq;->a(Lcom/umeng/analytics/pro/cl;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cq;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->c()V

    .line 25
    .line 26
    .line 27
    :cond_0
    sget-object v0, Lcom/umeng/analytics/pro/bq;->l:Lcom/umeng/analytics/pro/cl;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cq;->a(Lcom/umeng/analytics/pro/cl;)V

    .line 30
    .line 31
    .line 32
    iget v0, p0, Lcom/umeng/analytics/pro/bq;->i:I

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cq;->a(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->c()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->d()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->b()V

    .line 44
    .line 45
    .line 46
    return-void
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
.end method
