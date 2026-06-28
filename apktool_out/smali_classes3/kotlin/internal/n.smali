.class public final Lkotlin/internal/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0006\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a \u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0001\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0001\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "differenceModulo",
        "",
        "a",
        "b",
        "c",
        "",
        "getProgressionLastElement",
        "start",
        "end",
        "step",
        "mod",
        "kotlin-stdlib"
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
.method private static final a(III)I
    .locals 0

    invoke-static {p0, p2}, Lkotlin/internal/n;->e(II)I

    move-result p0

    invoke-static {p1, p2}, Lkotlin/internal/n;->e(II)I

    move-result p1

    sub-int/2addr p0, p1

    invoke-static {p0, p2}, Lkotlin/internal/n;->e(II)I

    move-result p0

    return p0
.end method

.method private static final b(JJJ)J
    .locals 0

    invoke-static {p0, p1, p4, p5}, Lkotlin/internal/n;->f(JJ)J

    move-result-wide p0

    invoke-static {p2, p3, p4, p5}, Lkotlin/internal/n;->f(JJ)J

    move-result-wide p2

    sub-long/2addr p0, p2

    invoke-static {p0, p1, p4, p5}, Lkotlin/internal/n;->f(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final c(III)I
    .locals 0
    .annotation build Lkotlin/a1;
    .end annotation

    .line 1
    if-lez p2, :cond_1

    .line 2
    .line 3
    if-lt p0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1, p0, p2}, Lkotlin/internal/n;->a(III)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    sub-int/2addr p1, p0

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    if-gez p2, :cond_3

    .line 13
    .line 14
    if-gt p0, p1, :cond_2

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_2
    neg-int p2, p2

    .line 18
    invoke-static {p0, p1, p2}, Lkotlin/internal/n;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p1, p0

    .line 23
    :goto_0
    return p1

    .line 24
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    const-string p1, "Step is zero."

    .line 27
    .line 28
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
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
.end method

.method public static final d(JJJ)J
    .locals 7
    .annotation build Lkotlin/a1;
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p4, v0

    .line 4
    .line 5
    if-lez v0, :cond_1

    .line 6
    .line 7
    cmp-long v0, p0, p2

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v0, p2

    .line 13
    move-wide v2, p0

    .line 14
    move-wide v4, p4

    .line 15
    invoke-static/range {v0 .. v5}, Lkotlin/internal/n;->b(JJJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    sub-long/2addr p2, p0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    if-gez v0, :cond_3

    .line 22
    .line 23
    cmp-long v0, p0, p2

    .line 24
    .line 25
    if-gtz v0, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    neg-long v5, p4

    .line 29
    move-wide v1, p0

    .line 30
    move-wide v3, p2

    .line 31
    invoke-static/range {v1 .. v6}, Lkotlin/internal/n;->b(JJJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide p0

    .line 35
    add-long/2addr p2, p0

    .line 36
    :goto_0
    return-wide p2

    .line 37
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    const-string p1, "Step is zero."

    .line 40
    .line 41
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p0
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
.end method

.method private static final e(II)I
    .locals 0

    rem-int/2addr p0, p1

    if-ltz p0, :cond_0

    goto :goto_0

    :cond_0
    add-int/2addr p0, p1

    :goto_0
    return p0
.end method

.method private static final f(JJ)J
    .locals 2

    rem-long/2addr p0, p2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    add-long/2addr p0, p2

    :goto_0
    return-wide p0
.end method
