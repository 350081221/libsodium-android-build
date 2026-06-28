.class public final Lkotlin/u2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u001a\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001\u001a\"\u0010\u000c\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\"\u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u000e\u001a\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\tH\u0001\u001a\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0013H\u0001\u001a\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\"\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0016\u001a\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0013H\u0001\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0013H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\tH\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "doubleToUInt",
        "Lkotlin/UInt;",
        "v",
        "",
        "(D)I",
        "doubleToULong",
        "Lkotlin/ULong;",
        "(D)J",
        "uintCompare",
        "",
        "v1",
        "v2",
        "uintDivide",
        "uintDivide-J1ME1BU",
        "(II)I",
        "uintRemainder",
        "uintRemainder-J1ME1BU",
        "uintToDouble",
        "ulongCompare",
        "",
        "ulongDivide",
        "ulongDivide-eb3DHEI",
        "(JJ)J",
        "ulongRemainder",
        "ulongRemainder-eb3DHEI",
        "ulongToDouble",
        "ulongToString",
        "",
        "base",
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

.annotation build Lu3/h;
    name = "UnsignedKt"
.end annotation


# direct methods
.method public static final a(D)I
    .locals 4
    .annotation build Lkotlin/a1;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {v1}, Lkotlin/u2;->f(I)D

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    cmpg-double v0, p0, v2

    .line 14
    .line 15
    if-gtz v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v1, -0x1

    .line 19
    invoke-static {v1}, Lkotlin/u2;->f(I)D

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    cmpl-double v0, p0, v2

    .line 24
    .line 25
    if-ltz v0, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const-wide v0, 0x41dfffffffc00000L    # 2.147483647E9

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    cmpg-double v0, p0, v0

    .line 34
    .line 35
    if-gtz v0, :cond_3

    .line 36
    .line 37
    double-to-int p0, p0

    .line 38
    invoke-static {p0}, Lkotlin/c2;->l(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_0

    .line 43
    :cond_3
    const v0, 0x7fffffff

    .line 44
    .line 45
    .line 46
    int-to-double v1, v0

    .line 47
    sub-double/2addr p0, v1

    .line 48
    double-to-int p0, p0

    .line 49
    invoke-static {p0}, Lkotlin/c2;->l(I)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {v0}, Lkotlin/c2;->l(I)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    add-int/2addr p0, p1

    .line 58
    invoke-static {p0}, Lkotlin/c2;->l(I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    :goto_0
    return v1
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

.method public static final b(D)J
    .locals 5
    .annotation build Lkotlin/a1;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {v1, v2}, Lkotlin/u2;->j(J)D

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    cmpg-double v0, p0, v3

    .line 15
    .line 16
    if-gtz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const-wide/16 v1, -0x1

    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/u2;->j(J)D

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    cmpl-double v0, p0, v3

    .line 26
    .line 27
    if-ltz v0, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const-wide/high16 v0, 0x43e0000000000000L    # 9.223372036854776E18

    .line 31
    .line 32
    cmpg-double v2, p0, v0

    .line 33
    .line 34
    if-gez v2, :cond_3

    .line 35
    .line 36
    double-to-long p0, p0

    .line 37
    invoke-static {p0, p1}, Lkotlin/g2;->l(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    goto :goto_0

    .line 42
    :cond_3
    sub-double/2addr p0, v0

    .line 43
    double-to-long p0, p0

    .line 44
    invoke-static {p0, p1}, Lkotlin/g2;->l(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide p0

    .line 48
    const-wide/high16 v0, -0x8000000000000000L

    .line 49
    .line 50
    add-long/2addr p0, v0

    .line 51
    invoke-static {p0, p1}, Lkotlin/g2;->l(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    :goto_0
    return-wide v1
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

.method public static final c(II)I
    .locals 1
    .annotation build Lkotlin/a1;
    .end annotation

    const/high16 v0, -0x80000000

    xor-int/2addr p0, v0

    xor-int/2addr p1, v0

    invoke-static {p0, p1}, Lkotlin/jvm/internal/l0;->t(II)I

    move-result p0

    return p0
.end method

.method public static final d(II)I
    .locals 4
    .annotation build Lkotlin/a1;
    .end annotation

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    int-to-long p0, p1

    and-long/2addr p0, v2

    div-long/2addr v0, p0

    long-to-int p0, v0

    invoke-static {p0}, Lkotlin/c2;->l(I)I

    move-result p0

    return p0
.end method

.method public static final e(II)I
    .locals 4
    .annotation build Lkotlin/a1;
    .end annotation

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    int-to-long p0, p1

    and-long/2addr p0, v2

    rem-long/2addr v0, p0

    long-to-int p0, v0

    invoke-static {p0}, Lkotlin/c2;->l(I)I

    move-result p0

    return p0
.end method

.method public static final f(I)D
    .locals 6
    .annotation build Lkotlin/a1;
    .end annotation

    const v0, 0x7fffffff

    and-int/2addr v0, p0

    int-to-double v0, v0

    ushr-int/lit8 p0, p0, 0x1f

    shl-int/lit8 p0, p0, 0x1e

    int-to-double v2, p0

    const/4 p0, 0x2

    int-to-double v4, p0

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    return-wide v0
.end method

.method public static final g(JJ)I
    .locals 2
    .annotation build Lkotlin/a1;
    .end annotation

    const-wide/high16 v0, -0x8000000000000000L

    xor-long/2addr p0, v0

    xor-long/2addr p2, v0

    invoke-static {p0, p1, p2, p3}, Lkotlin/jvm/internal/l0;->u(JJ)I

    move-result p0

    return p0
.end method

.method public static final h(JJ)J
    .locals 5
    .annotation build Lkotlin/a1;
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p2, v0

    .line 4
    .line 5
    if-gez v2, :cond_1

    .line 6
    .line 7
    invoke-static {p0, p1, p2, p3}, Landroidx/collection/a;->a(JJ)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-gez p0, :cond_0

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/g2;->l(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-wide/16 p0, 0x1

    .line 19
    .line 20
    invoke-static {p0, p1}, Lkotlin/g2;->l(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    :goto_0
    return-wide p0

    .line 25
    :cond_1
    cmp-long v0, p0, v0

    .line 26
    .line 27
    if-ltz v0, :cond_2

    .line 28
    .line 29
    div-long/2addr p0, p2

    .line 30
    invoke-static {p0, p1}, Lkotlin/g2;->l(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    return-wide p0

    .line 35
    :cond_2
    const/4 v0, 0x1

    .line 36
    ushr-long v1, p0, v0

    .line 37
    .line 38
    div-long/2addr v1, p2

    .line 39
    shl-long/2addr v1, v0

    .line 40
    mul-long v3, v1, p2

    .line 41
    .line 42
    sub-long/2addr p0, v3

    .line 43
    invoke-static {p0, p1}, Lkotlin/g2;->l(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide p0

    .line 47
    invoke-static {p2, p3}, Lkotlin/g2;->l(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p2

    .line 51
    invoke-static {p0, p1, p2, p3}, Landroidx/collection/a;->a(JJ)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-ltz p0, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    const/4 v0, 0x0

    .line 59
    :goto_1
    int-to-long p0, v0

    .line 60
    add-long/2addr v1, p0

    .line 61
    invoke-static {v1, v2}, Lkotlin/g2;->l(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide p0

    .line 65
    return-wide p0
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
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
.end method

.method public static final i(JJ)J
    .locals 6
    .annotation build Lkotlin/a1;
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p2, v0

    .line 4
    .line 5
    if-gez v2, :cond_1

    .line 6
    .line 7
    invoke-static {p0, p1, p2, p3}, Landroidx/collection/a;->a(JJ)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-gez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sub-long/2addr p0, p2

    .line 15
    invoke-static {p0, p1}, Lkotlin/g2;->l(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    :goto_0
    return-wide p0

    .line 20
    :cond_1
    cmp-long v2, p0, v0

    .line 21
    .line 22
    if-ltz v2, :cond_2

    .line 23
    .line 24
    rem-long/2addr p0, p2

    .line 25
    invoke-static {p0, p1}, Lkotlin/g2;->l(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide p0

    .line 29
    return-wide p0

    .line 30
    :cond_2
    const/4 v2, 0x1

    .line 31
    ushr-long v3, p0, v2

    .line 32
    .line 33
    div-long/2addr v3, p2

    .line 34
    shl-long v2, v3, v2

    .line 35
    .line 36
    mul-long/2addr v2, p2

    .line 37
    sub-long/2addr p0, v2

    .line 38
    invoke-static {p0, p1}, Lkotlin/g2;->l(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    invoke-static {p2, p3}, Lkotlin/g2;->l(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    invoke-static {v2, v3, v4, v5}, Landroidx/collection/a;->a(JJ)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-ltz v2, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move-wide p2, v0

    .line 54
    :goto_1
    sub-long/2addr p0, p2

    .line 55
    invoke-static {p0, p1}, Lkotlin/g2;->l(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide p0

    .line 59
    return-wide p0
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
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
.end method

.method public static final j(J)D
    .locals 4
    .annotation build Lkotlin/a1;
    .end annotation

    const/16 v0, 0xb

    ushr-long v0, p0, v0

    long-to-double v0, v0

    const/16 v2, 0x800

    int-to-double v2, v2

    mul-double/2addr v0, v2

    const-wide/16 v2, 0x7ff

    and-long/2addr p0, v2

    long-to-double p0, p0

    add-double/2addr v0, p0

    return-wide v0
.end method

.method public static final k(J)Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    const/16 v0, 0xa

    invoke-static {p0, p1, v0}, Lkotlin/u2;->l(JI)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final l(JI)Ljava/lang/String;
    .locals 8
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    const-string v1, "toString(this, checkRadix(radix))"

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p2}, Lkotlin/text/c;->a(I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-static {p0, p1, p2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    ushr-long v2, p0, v0

    .line 23
    .line 24
    int-to-long v4, p2

    .line 25
    div-long/2addr v2, v4

    .line 26
    shl-long/2addr v2, v0

    .line 27
    mul-long v6, v2, v4

    .line 28
    .line 29
    sub-long/2addr p0, v6

    .line 30
    cmp-long v0, p0, v4

    .line 31
    .line 32
    if-ltz v0, :cond_1

    .line 33
    .line 34
    sub-long/2addr p0, v4

    .line 35
    const-wide/16 v4, 0x1

    .line 36
    .line 37
    add-long/2addr v2, v4

    .line 38
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-static {p2}, Lkotlin/text/c;->a(I)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-static {v2, v3, v4}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-static {p2}, Lkotlin/text/c;->a(I)I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-static {p0, p1, p2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
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
.end method
