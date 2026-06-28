.class public final Lcom/android/dx/util/ByteArray;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/util/ByteArray$MyDataInputStream;,
        Lcom/android/dx/util/ByteArray$MyInputStream;,
        Lcom/android/dx/util/ByteArray$GetCursor;
    }
.end annotation


# instance fields
.field private final bytes:[B

.field private final size:I

.field private final start:I


# direct methods
.method public constructor <init>([B)V
    .locals 2

    .line 10
    array-length v0, p1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lcom/android/dx/util/ByteArray;-><init>([BII)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_3

    if-ltz p2, :cond_2

    if-lt p3, p2, :cond_1

    .line 2
    array-length v0, p1

    if-gt p3, v0, :cond_0

    .line 3
    iput-object p1, p0, Lcom/android/dx/util/ByteArray;->bytes:[B

    .line 4
    iput p2, p0, Lcom/android/dx/util/ByteArray;->start:I

    sub-int/2addr p3, p2

    .line 5
    iput p3, p0, Lcom/android/dx/util/ByteArray;->size:I

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "end > bytes.length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "end < start"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "start < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 9
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "bytes == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lcom/android/dx/util/ByteArray;)I
    .locals 0

    iget p0, p0, Lcom/android/dx/util/ByteArray;->size:I

    return p0
.end method

.method static synthetic access$100(Lcom/android/dx/util/ByteArray;I)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    move-result p0

    return p0
.end method

.method static synthetic access$200(Lcom/android/dx/util/ByteArray;)[B
    .locals 0

    iget-object p0, p0, Lcom/android/dx/util/ByteArray;->bytes:[B

    return-object p0
.end method

.method static synthetic access$300(Lcom/android/dx/util/ByteArray;)I
    .locals 0

    iget p0, p0, Lcom/android/dx/util/ByteArray;->start:I

    return p0
.end method

.method private checkOffsets(II)V
    .locals 3

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    if-lt p2, p1, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/android/dx/util/ByteArray;->size:I

    .line 6
    .line 7
    if-gt p2, v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "bad range: "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, ".."

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p1, "; actual size "

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget p1, p0, Lcom/android/dx/util/ByteArray;->size:I

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0
.end method

.method private getByte0(I)I
    .locals 2

    iget-object v0, p0, Lcom/android/dx/util/ByteArray;->bytes:[B

    iget v1, p0, Lcom/android/dx/util/ByteArray;->start:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method private getUnsignedByte0(I)I
    .locals 2

    iget-object v0, p0, Lcom/android/dx/util/ByteArray;->bytes:[B

    iget v1, p0, Lcom/android/dx/util/ByteArray;->start:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    and-int/lit16 p1, p1, 0xff

    return p1
.end method


# virtual methods
.method public getByte(I)I
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/android/dx/util/ByteArray;->checkOffsets(II)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getByte0(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
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
.end method

.method public getBytes([BI)V
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    sub-int/2addr v0, p2

    .line 3
    iget v1, p0, Lcom/android/dx/util/ByteArray;->size:I

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/android/dx/util/ByteArray;->bytes:[B

    .line 8
    .line 9
    iget v2, p0, Lcom/android/dx/util/ByteArray;->start:I

    .line 10
    .line 11
    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 16
    .line 17
    const-string p2, "(out.length - offset) < size()"

    .line 18
    .line 19
    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
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

.method public getInt(I)I
    .locals 2

    .line 1
    add-int/lit8 v0, p1, 0x4

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/android/dx/util/ByteArray;->checkOffsets(II)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getByte0(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    shl-int/lit8 v0, v0, 0x18

    .line 11
    .line 12
    add-int/lit8 v1, p1, 0x1

    .line 13
    .line 14
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    shl-int/lit8 v1, v1, 0x10

    .line 19
    .line 20
    or-int/2addr v0, v1

    .line 21
    add-int/lit8 v1, p1, 0x2

    .line 22
    .line 23
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    shl-int/lit8 v1, v1, 0x8

    .line 28
    .line 29
    or-int/2addr v0, v1

    .line 30
    add-int/lit8 p1, p1, 0x3

    .line 31
    .line 32
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    or-int/2addr p1, v0

    .line 37
    return p1
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
.end method

.method public getLong(I)J
    .locals 5

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/android/dx/util/ByteArray;->checkOffsets(II)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getByte0(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    shl-int/lit8 v0, v0, 0x18

    .line 11
    .line 12
    add-int/lit8 v1, p1, 0x1

    .line 13
    .line 14
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    shl-int/lit8 v1, v1, 0x10

    .line 19
    .line 20
    or-int/2addr v0, v1

    .line 21
    add-int/lit8 v1, p1, 0x2

    .line 22
    .line 23
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    shl-int/lit8 v1, v1, 0x8

    .line 28
    .line 29
    or-int/2addr v0, v1

    .line 30
    add-int/lit8 v1, p1, 0x3

    .line 31
    .line 32
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    or-int/2addr v0, v1

    .line 37
    add-int/lit8 v1, p1, 0x4

    .line 38
    .line 39
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArray;->getByte0(I)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    shl-int/lit8 v1, v1, 0x18

    .line 44
    .line 45
    add-int/lit8 v2, p1, 0x5

    .line 46
    .line 47
    invoke-direct {p0, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    shl-int/lit8 v2, v2, 0x10

    .line 52
    .line 53
    or-int/2addr v1, v2

    .line 54
    add-int/lit8 v2, p1, 0x6

    .line 55
    .line 56
    invoke-direct {p0, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    shl-int/lit8 v2, v2, 0x8

    .line 61
    .line 62
    or-int/2addr v1, v2

    .line 63
    add-int/lit8 p1, p1, 0x7

    .line 64
    .line 65
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    or-int/2addr p1, v1

    .line 70
    int-to-long v1, p1

    .line 71
    const-wide v3, 0xffffffffL

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    and-long/2addr v1, v3

    .line 77
    int-to-long v3, v0

    .line 78
    const/16 p1, 0x20

    .line 79
    .line 80
    shl-long/2addr v3, p1

    .line 81
    or-long v0, v1, v3

    .line 82
    .line 83
    return-wide v0
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
.end method

.method public getShort(I)I
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/android/dx/util/ByteArray;->checkOffsets(II)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getByte0(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    shl-int/lit8 v0, v0, 0x8

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    or-int/2addr p1, v0

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public getUnsignedByte(I)I
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/android/dx/util/ByteArray;->checkOffsets(II)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
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
.end method

.method public getUnsignedShort(I)I
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/android/dx/util/ByteArray;->checkOffsets(II)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    shl-int/lit8 v0, v0, 0x8

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    or-int/2addr p1, v0

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public makeDataInputStream()Lcom/android/dx/util/ByteArray$MyDataInputStream;
    .locals 2

    new-instance v0, Lcom/android/dx/util/ByteArray$MyDataInputStream;

    invoke-virtual {p0}, Lcom/android/dx/util/ByteArray;->makeInputStream()Lcom/android/dx/util/ByteArray$MyInputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/dx/util/ByteArray$MyDataInputStream;-><init>(Lcom/android/dx/util/ByteArray$MyInputStream;)V

    return-object v0
.end method

.method public makeInputStream()Lcom/android/dx/util/ByteArray$MyInputStream;
    .locals 1

    new-instance v0, Lcom/android/dx/util/ByteArray$MyInputStream;

    invoke-direct {v0, p0}, Lcom/android/dx/util/ByteArray$MyInputStream;-><init>(Lcom/android/dx/util/ByteArray;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/android/dx/util/ByteArray;->size:I

    return v0
.end method

.method public slice(II)Lcom/android/dx/util/ByteArray;
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/dx/util/ByteArray;->checkOffsets(II)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/dx/util/ByteArray;->bytes:[B

    .line 5
    .line 6
    invoke-static {v0, p1, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance p2, Lcom/android/dx/util/ByteArray;

    .line 11
    .line 12
    invoke-direct {p2, p1}, Lcom/android/dx/util/ByteArray;-><init>([B)V

    .line 13
    .line 14
    .line 15
    return-object p2
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

.method public underlyingOffset(I)I
    .locals 1

    iget v0, p0, Lcom/android/dx/util/ByteArray;->start:I

    add-int/2addr v0, p1

    return v0
.end method
