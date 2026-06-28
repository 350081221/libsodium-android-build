.class public final Lcom/android/dex/EncodedValueCodec;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static readSignedInt(Lcom/android/dex/util/ByteInput;I)I
    .locals 3

    const/4 v0, 0x0

    move v1, p1

    :goto_0
    if-ltz v1, :cond_0

    ushr-int/lit8 v0, v0, 0x8

    invoke-interface {p0}, Lcom/android/dex/util/ByteInput;->readByte()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x18

    or-int/2addr v0, v2

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    rsub-int/lit8 p0, p1, 0x3

    mul-int/lit8 p0, p0, 0x8

    shr-int p0, v0, p0

    return p0
.end method

.method public static readSignedLong(Lcom/android/dex/util/ByteInput;I)J
    .locals 7

    const-wide/16 v0, 0x0

    move v2, p1

    :goto_0
    const/16 v3, 0x8

    if-ltz v2, :cond_0

    ushr-long/2addr v0, v3

    invoke-interface {p0}, Lcom/android/dex/util/ByteInput;->readByte()B

    move-result v3

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    const/16 v5, 0x38

    shl-long/2addr v3, v5

    or-long/2addr v0, v3

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    rsub-int/lit8 p0, p1, 0x7

    mul-int/2addr p0, v3

    shr-long p0, v0, p0

    return-wide p0
.end method

.method public static readUnsignedInt(Lcom/android/dex/util/ByteInput;IZ)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_1

    .line 3
    .line 4
    move p2, p1

    .line 5
    :goto_0
    if-ltz p2, :cond_0

    .line 6
    .line 7
    ushr-int/lit8 v0, v0, 0x8

    .line 8
    .line 9
    invoke-interface {p0}, Lcom/android/dex/util/ByteInput;->readByte()B

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    and-int/lit16 v1, v1, 0xff

    .line 14
    .line 15
    shl-int/lit8 v1, v1, 0x18

    .line 16
    .line 17
    or-int/2addr v0, v1

    .line 18
    add-int/lit8 p2, p2, -0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    rsub-int/lit8 p0, p1, 0x3

    .line 22
    .line 23
    mul-int/lit8 p0, p0, 0x8

    .line 24
    .line 25
    ushr-int p0, v0, p0

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    :goto_1
    if-ltz p1, :cond_2

    .line 29
    .line 30
    ushr-int/lit8 p2, v0, 0x8

    .line 31
    .line 32
    invoke-interface {p0}, Lcom/android/dex/util/ByteInput;->readByte()B

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    and-int/lit16 v0, v0, 0xff

    .line 37
    .line 38
    shl-int/lit8 v0, v0, 0x18

    .line 39
    .line 40
    or-int/2addr v0, p2

    .line 41
    add-int/lit8 p1, p1, -0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move p0, v0

    .line 45
    :goto_2
    return p0
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public static readUnsignedLong(Lcom/android/dex/util/ByteInput;IZ)J
    .locals 8

    .line 1
    const/16 v0, 0x38

    .line 2
    .line 3
    const-wide/16 v1, 0xff

    .line 4
    .line 5
    const/16 v3, 0x8

    .line 6
    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    if-nez p2, :cond_1

    .line 10
    .line 11
    move p2, p1

    .line 12
    :goto_0
    if-ltz p2, :cond_0

    .line 13
    .line 14
    ushr-long/2addr v4, v3

    .line 15
    invoke-interface {p0}, Lcom/android/dex/util/ByteInput;->readByte()B

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    int-to-long v6, v6

    .line 20
    and-long/2addr v6, v1

    .line 21
    shl-long/2addr v6, v0

    .line 22
    or-long/2addr v4, v6

    .line 23
    add-int/lit8 p2, p2, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    rsub-int/lit8 p0, p1, 0x7

    .line 27
    .line 28
    mul-int/2addr p0, v3

    .line 29
    ushr-long p0, v4, p0

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    :goto_1
    if-ltz p1, :cond_2

    .line 33
    .line 34
    ushr-long/2addr v4, v3

    .line 35
    invoke-interface {p0}, Lcom/android/dex/util/ByteInput;->readByte()B

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    int-to-long v6, p2

    .line 40
    and-long/2addr v6, v1

    .line 41
    shl-long/2addr v6, v0

    .line 42
    or-long/2addr v4, v6

    .line 43
    add-int/lit8 p1, p1, -0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-wide p0, v4

    .line 47
    :goto_2
    return-wide p0
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public static writeRightZeroExtendedValue(Lcom/android/dex/util/ByteOutput;IJ)V
    .locals 2

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    rsub-int/lit8 v0, v0, 0x40

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    :cond_0
    add-int/lit8 v0, v0, 0x7

    .line 11
    .line 12
    shr-int/lit8 v0, v0, 0x3

    .line 13
    .line 14
    mul-int/lit8 v1, v0, 0x8

    .line 15
    .line 16
    rsub-int/lit8 v1, v1, 0x40

    .line 17
    .line 18
    shr-long/2addr p2, v1

    .line 19
    add-int/lit8 v1, v0, -0x1

    .line 20
    .line 21
    shl-int/lit8 v1, v1, 0x5

    .line 22
    .line 23
    or-int/2addr p1, v1

    .line 24
    invoke-interface {p0, p1}, Lcom/android/dex/util/ByteOutput;->writeByte(I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    if-lez v0, :cond_1

    .line 28
    .line 29
    long-to-int p1, p2

    .line 30
    int-to-byte p1, p1

    .line 31
    invoke-interface {p0, p1}, Lcom/android/dex/util/ByteOutput;->writeByte(I)V

    .line 32
    .line 33
    .line 34
    const/16 p1, 0x8

    .line 35
    .line 36
    shr-long/2addr p2, p1

    .line 37
    add-int/lit8 v0, v0, -0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public static writeSignedIntegralValue(Lcom/android/dex/util/ByteOutput;IJ)V
    .locals 2

    .line 1
    const/16 v0, 0x3f

    .line 2
    .line 3
    shr-long v0, p2, v0

    .line 4
    .line 5
    xor-long/2addr v0, p2

    .line 6
    invoke-static {v0, v1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    rsub-int/lit8 v0, v0, 0x41

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x7

    .line 13
    .line 14
    shr-int/lit8 v0, v0, 0x3

    .line 15
    .line 16
    add-int/lit8 v1, v0, -0x1

    .line 17
    .line 18
    shl-int/lit8 v1, v1, 0x5

    .line 19
    .line 20
    or-int/2addr p1, v1

    .line 21
    invoke-interface {p0, p1}, Lcom/android/dex/util/ByteOutput;->writeByte(I)V

    .line 22
    .line 23
    .line 24
    :goto_0
    if-lez v0, :cond_0

    .line 25
    .line 26
    long-to-int p1, p2

    .line 27
    int-to-byte p1, p1

    .line 28
    invoke-interface {p0, p1}, Lcom/android/dex/util/ByteOutput;->writeByte(I)V

    .line 29
    .line 30
    .line 31
    const/16 p1, 0x8

    .line 32
    .line 33
    shr-long/2addr p2, p1

    .line 34
    add-int/lit8 v0, v0, -0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public static writeUnsignedIntegralValue(Lcom/android/dex/util/ByteOutput;IJ)V
    .locals 2

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    rsub-int/lit8 v0, v0, 0x40

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    :cond_0
    add-int/lit8 v0, v0, 0x7

    .line 11
    .line 12
    shr-int/lit8 v0, v0, 0x3

    .line 13
    .line 14
    add-int/lit8 v1, v0, -0x1

    .line 15
    .line 16
    shl-int/lit8 v1, v1, 0x5

    .line 17
    .line 18
    or-int/2addr p1, v1

    .line 19
    invoke-interface {p0, p1}, Lcom/android/dex/util/ByteOutput;->writeByte(I)V

    .line 20
    .line 21
    .line 22
    :goto_0
    if-lez v0, :cond_1

    .line 23
    .line 24
    long-to-int p1, p2

    .line 25
    int-to-byte p1, p1

    .line 26
    invoke-interface {p0, p1}, Lcom/android/dex/util/ByteOutput;->writeByte(I)V

    .line 27
    .line 28
    .line 29
    const/16 p1, 0x8

    .line 30
    .line 31
    shr-long/2addr p2, p1

    .line 32
    add-int/lit8 v0, v0, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method
