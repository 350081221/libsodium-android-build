.class Lcom/ss/android/socialbase/downloader/network/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:D

.field private final b:I

.field private c:D

.field private d:I


# direct methods
.method public constructor <init>(D)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/network/d;->c:D

    .line 7
    .line 8
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/network/d;->a:D

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    cmpl-double v0, p1, v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const p1, 0x7fffffff

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 21
    .line 22
    div-double/2addr v0, p1

    .line 23
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    double-to-int p1, p1

    .line 28
    :goto_0
    iput p1, p0, Lcom/ss/android/socialbase/downloader/network/d;->b:I

    .line 29
    .line 30
    return-void
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
.end method


# virtual methods
.method public a()D
    .locals 2

    .line 7
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/network/d;->c:D

    return-wide v0
.end method

.method public a(D)V
    .locals 7

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/network/d;->a:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double v0, v2, v0

    .line 2
    iget v4, p0, Lcom/ss/android/socialbase/downloader/network/d;->d:I

    iget v5, p0, Lcom/ss/android/socialbase/downloader/network/d;->b:I

    if-le v4, v5, :cond_0

    .line 3
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/network/d;->c:D

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    mul-double/2addr v0, v2

    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/network/d;->a:D

    invoke-static {p1, p2}, Ljava/lang/Math;->log(D)D

    move-result-wide p1

    mul-double/2addr v2, p1

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide p1

    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/network/d;->c:D

    goto :goto_0

    :cond_0
    if-lez v4, :cond_1

    int-to-double v5, v4

    mul-double/2addr v0, v5

    int-to-double v4, v4

    add-double/2addr v4, v2

    div-double/2addr v0, v4

    sub-double/2addr v2, v0

    .line 4
    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/network/d;->c:D

    invoke-static {v4, v5}, Ljava/lang/Math;->log(D)D

    move-result-wide v4

    mul-double/2addr v0, v4

    invoke-static {p1, p2}, Ljava/lang/Math;->log(D)D

    move-result-wide p1

    mul-double/2addr v2, p1

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide p1

    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/network/d;->c:D

    goto :goto_0

    .line 5
    :cond_1
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/network/d;->c:D

    .line 6
    :goto_0
    iget p1, p0, Lcom/ss/android/socialbase/downloader/network/d;->d:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/ss/android/socialbase/downloader/network/d;->d:I

    return-void
.end method
