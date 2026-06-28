.class public final Lcom/android/dx/util/Bits;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static anyInRange([III)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/android/dx/util/Bits;->findFirst([II)I

    move-result p0

    if-ltz p0, :cond_0

    if-ge p0, p2, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static bitCount([I)I
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v1, v0, :cond_0

    .line 5
    .line 6
    aget v3, p0, v1

    .line 7
    .line 8
    invoke-static {v3}, Ljava/lang/Integer;->bitCount(I)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    add-int/2addr v2, v3

    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return v2
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static clear([II)V
    .locals 2

    shr-int/lit8 v0, p1, 0x5

    and-int/lit8 p1, p1, 0x1f

    const/4 v1, 0x1

    shl-int p1, v1, p1

    aget v1, p0, v0

    not-int p1, p1

    and-int/2addr p1, v1

    aput p1, p0, v0

    return-void
.end method

.method public static findFirst(II)I
    .locals 1

    const/4 v0, 0x1

    shl-int p1, v0, p1

    sub-int/2addr p1, v0

    not-int p1, p1

    and-int/2addr p0, p1

    .line 4
    invoke-static {p0}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result p0

    const/16 p1, 0x20

    if-ne p0, p1, :cond_0

    const/4 p0, -0x1

    :cond_0
    return p0
.end method

.method public static findFirst([II)I
    .locals 3

    .line 1
    array-length v0, p0

    and-int/lit8 v1, p1, 0x1f

    shr-int/lit8 p1, p1, 0x5

    :goto_0
    if-ge p1, v0, :cond_1

    .line 2
    aget v2, p0, p1

    if-eqz v2, :cond_0

    .line 3
    invoke-static {v2, v1}, Lcom/android/dx/util/Bits;->findFirst(II)I

    move-result v1

    if-ltz v1, :cond_0

    shl-int/lit8 p0, p1, 0x5

    add-int/2addr p0, v1

    return p0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static get([II)Z
    .locals 2

    shr-int/lit8 v0, p1, 0x5

    and-int/lit8 p1, p1, 0x1f

    const/4 v1, 0x1

    shl-int p1, v1, p1

    aget p0, p0, v0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static getMax([I)I
    .locals 0

    array-length p0, p0

    mul-int/lit8 p0, p0, 0x20

    return p0
.end method

.method public static isEmpty([I)Z
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget v3, p0, v2

    .line 7
    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 p0, 0x1

    .line 15
    return p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static makeBitSet(I)[I
    .locals 0

    add-int/lit8 p0, p0, 0x1f

    shr-int/lit8 p0, p0, 0x5

    new-array p0, p0, [I

    return-object p0
.end method

.method public static or([I[I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_0

    .line 4
    .line 5
    aget v1, p0, v0

    .line 6
    .line 7
    aget v2, p1, v0

    .line 8
    .line 9
    or-int/2addr v1, v2

    .line 10
    aput v1, p0, v0

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
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

.method public static set([II)V
    .locals 2

    shr-int/lit8 v0, p1, 0x5

    and-int/lit8 p1, p1, 0x1f

    const/4 v1, 0x1

    shl-int p1, v1, p1

    .line 3
    aget v1, p0, v0

    or-int/2addr p1, v1

    aput p1, p0, v0

    return-void
.end method

.method public static set([IIZ)V
    .locals 2

    shr-int/lit8 v0, p1, 0x5

    and-int/lit8 p1, p1, 0x1f

    const/4 v1, 0x1

    shl-int p1, v1, p1

    if-eqz p2, :cond_0

    .line 1
    aget p2, p0, v0

    or-int/2addr p1, p2

    aput p1, p0, v0

    goto :goto_0

    .line 2
    :cond_0
    aget p2, p0, v0

    not-int p1, p1

    and-int/2addr p1, p2

    aput p1, p0, v0

    :goto_0
    return-void
.end method

.method public static toHuman([I)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x7b

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    array-length v1, p0

    .line 12
    mul-int/lit8 v1, v1, 0x20

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v2, v1, :cond_2

    .line 17
    .line 18
    invoke-static {p0, v2}, Lcom/android/dx/util/Bits;->get([II)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/16 v3, 0x2c

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/16 p0, 0x7d

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
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
.end method
