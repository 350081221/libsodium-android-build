.class public Lcom/tencent/vasdolly/common/V2SchemeUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final APK_SIGNATURE_SCHEME_V2_BLOCK_ID:I = 0x7109871a


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static containV2Signature(Ljava/io/File;)Z
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/tencent/vasdolly/common/V2SchemeUtil;->getApkSigningBlock(Ljava/io/File;)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/tencent/vasdolly/common/V2SchemeUtil;->getAllIdValue(Ljava/nio/ByteBuffer;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x7109871a

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :catch_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "APK : "

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, " not have apk v2 signature block"

    .line 44
    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_1
    move-exception p0

    .line 57
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 58
    .line 59
    .line 60
    :cond_0
    :goto_0
    const/4 p0, 0x0

    .line 61
    return p0
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

.method public static findCentralDir(Ljava/io/RandomAccessFile;JI)Lcom/tencent/vasdolly/common/Pair;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/RandomAccessFile;",
            "JI)",
            "Lcom/tencent/vasdolly/common/Pair<",
            "Ljava/nio/ByteBuffer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/tencent/vasdolly/common/V2SchemeUtil;->getByteBuffer(Ljava/io/RandomAccessFile;JI)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p0, p1}, Lcom/tencent/vasdolly/common/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Lcom/tencent/vasdolly/common/Pair;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
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
.end method

.method public static findContentEntry(Ljava/io/RandomAccessFile;I)Lcom/tencent/vasdolly/common/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/RandomAccessFile;",
            "I)",
            "Lcom/tencent/vasdolly/common/Pair<",
            "Ljava/nio/ByteBuffer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {p0, v0, v1, p1}, Lcom/tencent/vasdolly/common/V2SchemeUtil;->getByteBuffer(Ljava/io/RandomAccessFile;JI)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p0, p1}, Lcom/tencent/vasdolly/common/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Lcom/tencent/vasdolly/common/Pair;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
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

.method public static generateApkSigningBlock(Ljava/util/Map;)Ljava/nio/ByteBuffer;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/nio/ByteBuffer;",
            ">;)",
            "Ljava/nio/ByteBuffer;"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_5

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-wide/16 v1, 0x18

    .line 18
    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/16 v4, 0xc

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    add-int/2addr v3, v4

    .line 44
    int-to-long v3, v3

    .line 45
    add-long/2addr v1, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const v0, 0x42726577

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-interface {p0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 59
    .line 60
    new-instance v6, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v7, "generateApkSigningBlock , needPadding = "

    .line 66
    .line 67
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-wide/16 v5, 0x8

    .line 81
    .line 82
    if-eqz v3, :cond_2

    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    add-int/2addr v3, v4

    .line 99
    int-to-long v7, v3

    .line 100
    sub-long/2addr v1, v7

    .line 101
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-interface {p0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    add-long v7, v1, v5

    .line 109
    .line 110
    const-wide/16 v9, 0x1000

    .line 111
    .line 112
    rem-long/2addr v7, v9

    .line 113
    long-to-int v3, v7

    .line 114
    if-eqz v3, :cond_2

    .line 115
    .line 116
    rsub-int v3, v3, 0x1000

    .line 117
    .line 118
    if-ge v3, v4, :cond_1

    .line 119
    .line 120
    add-int/lit16 v3, v3, 0x1000

    .line 121
    .line 122
    :cond_1
    int-to-long v7, v3

    .line 123
    add-long/2addr v1, v7

    .line 124
    add-int/lit8 v4, v3, -0x8

    .line 125
    .line 126
    add-int/lit8 v4, v4, -0x4

    .line 127
    .line 128
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    sget-object v8, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 133
    .line 134
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-interface {p0, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 146
    .line 147
    new-instance v7, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    const-string v8, "generateApkSigningBlock , final length = "

    .line 153
    .line 154
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v7, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v8, " padding = "

    .line 161
    .line 162
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v3, " bufferSize = "

    .line 169
    .line 170
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-virtual {v0, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    :cond_2
    add-long/2addr v5, v1

    .line 184
    long-to-int v0, v5

    .line 185
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 190
    .line 191
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 195
    .line 196
    .line 197
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-eqz v3, :cond_3

    .line 210
    .line 211
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    check-cast v3, Ljava/util/Map$Entry;

    .line 216
    .line 217
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    check-cast v4, Ljava/nio/ByteBuffer;

    .line 222
    .line 223
    invoke-virtual {v4}, Ljava/nio/Buffer;->remaining()I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    add-int/lit8 v5, v5, 0x4

    .line 228
    .line 229
    int-to-long v5, v5

    .line 230
    invoke-virtual {v0, v5, v6}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 231
    .line 232
    .line 233
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    check-cast v3, Ljava/lang/Integer;

    .line 238
    .line 239
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->array()[B

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    add-int/2addr v5, v6

    .line 259
    invoke-virtual {v4}, Ljava/nio/Buffer;->remaining()I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    invoke-virtual {v0, v3, v5, v4}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 264
    .line 265
    .line 266
    goto :goto_1

    .line 267
    :cond_3
    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 268
    .line 269
    .line 270
    const-wide v1, 0x20676953204b5041L

    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 276
    .line 277
    .line 278
    const-wide v1, 0x3234206b636f6c42L    # 7.465385175170059E-67

    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 287
    .line 288
    .line 289
    move-result p0

    .line 290
    if-gtz p0, :cond_4

    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 293
    .line 294
    .line 295
    return-object v0

    .line 296
    :cond_4
    new-instance p0, Ljava/lang/RuntimeException;

    .line 297
    .line 298
    const-string v0, "generateNewApkV2SchemeBlock error"

    .line 299
    .line 300
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw p0

    .line 304
    :cond_5
    new-instance p0, Ljava/lang/RuntimeException;

    .line 305
    .line 306
    const-string v0, "getNewApkV2SchemeBlock , id value pair is empty"

    .line 307
    .line 308
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw p0
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
.end method

.method public static getAllIdValue(Ljava/nio/ByteBuffer;)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/tencent/vasdolly/common/apk/ApkSigningBlockUtils;->checkByteOrderLittleEndian(Ljava/nio/ByteBuffer;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/nio/Buffer;->capacity()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    add-int/lit8 v0, v0, -0x18

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    invoke-static {p0, v1, v0}, Lcom/tencent/vasdolly/common/apk/ApkSigningBlockUtils;->sliceFromTo(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_3

    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-lt v3, v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    const-wide/16 v5, 0x4

    .line 41
    .line 42
    cmp-long v5, v3, v5

    .line 43
    .line 44
    const-string v6, " size out of range: "

    .line 45
    .line 46
    const-string v7, "APK Signing Block entry #"

    .line 47
    .line 48
    if-ltz v5, :cond_1

    .line 49
    .line 50
    const-wide/32 v8, 0x7fffffff

    .line 51
    .line 52
    .line 53
    cmp-long v5, v3, v8

    .line 54
    .line 55
    if-gtz v5, :cond_1

    .line 56
    .line 57
    long-to-int v3, v3

    .line 58
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    add-int/2addr v4, v3

    .line 63
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-gt v3, v5, :cond_0

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    add-int/lit8 v3, v3, -0x4

    .line 78
    .line 79
    invoke-static {p0, v3}, Lcom/tencent/vasdolly/common/apk/ApkSigningBlockUtils;->getByteBuffer(Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-interface {v0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    new-instance v0, Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;

    .line 91
    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v2, ", available: "

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-direct {v0, p0}, Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :cond_1
    new-instance p0, Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;

    .line 130
    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-direct {p0, v0}, Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p0

    .line 156
    :cond_2
    new-instance p0, Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;

    .line 157
    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string v1, "Insufficient data to read size of APK Signing Block entry #"

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-direct {p0, v0}, Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p0

    .line 179
    :cond_3
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    if-nez p0, :cond_4

    .line 184
    .line 185
    return-object v0

    .line 186
    :cond_4
    new-instance p0, Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;

    .line 187
    .line 188
    new-instance v0, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    const-string v1, "not have Id-Value Pair in APK Signing Block entry #"

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-direct {p0, v0}, Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p0
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
.end method

.method public static getApkSectionInfo(Ljava/io/File;Z)Lcom/tencent/vasdolly/common/ApkSectionInfo;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/RandomAccessFile;

    .line 3
    .line 4
    const-string v2, "r"

    .line 5
    .line 6
    invoke-direct {v1, p0, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    .line 8
    .line 9
    :try_start_1
    invoke-static {v1}, Lcom/tencent/vasdolly/common/apk/ApkSigningBlockUtils;->getEocd(Ljava/io/RandomAccessFile;)Lcom/tencent/vasdolly/common/Pair;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getFirst()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getSecond()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/Long;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    invoke-static {v1, v3, v4}, Lcom/tencent/vasdolly/common/apk/ZipUtils;->isZip64EndOfCentralDirectoryLocatorPresent(Ljava/io/RandomAccessFile;J)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_2

    .line 34
    .line 35
    invoke-static {v2, v3, v4}, Lcom/tencent/vasdolly/common/apk/ApkSigningBlockUtils;->getCentralDirOffset(Ljava/nio/ByteBuffer;J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    invoke-static {v1, v5, v6}, Lcom/tencent/vasdolly/common/apk/ApkSigningBlockUtils;->findApkSigningBlock(Ljava/io/RandomAccessFile;J)Lcom/tencent/vasdolly/common/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sub-long/2addr v3, v5

    .line 44
    long-to-int v3, v3

    .line 45
    invoke-static {v1, v5, v6, v3}, Lcom/tencent/vasdolly/common/V2SchemeUtil;->findCentralDir(Ljava/io/RandomAccessFile;JI)Lcom/tencent/vasdolly/common/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    new-instance v4, Lcom/tencent/vasdolly/common/ApkSectionInfo;

    .line 50
    .line 51
    invoke-direct {v4}, Lcom/tencent/vasdolly/common/ApkSectionInfo;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 55
    .line 56
    .line 57
    move-result-wide v5

    .line 58
    iput-wide v5, v4, Lcom/tencent/vasdolly/common/ApkSectionInfo;->apkSize:J

    .line 59
    .line 60
    iput-boolean p1, v4, Lcom/tencent/vasdolly/common/ApkSectionInfo;->lowMemory:Z

    .line 61
    .line 62
    sget p1, Lcom/tencent/vasdolly/common/ApkSectionInfo;->COPY_CONTENT_MAX_SIZE:I

    .line 63
    .line 64
    int-to-long v7, p1

    .line 65
    cmp-long p1, v5, v7

    .line 66
    .line 67
    if-lez p1, :cond_0

    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    iput-boolean p1, v4, Lcom/tencent/vasdolly/common/ApkSectionInfo;->lowMemory:Z

    .line 71
    .line 72
    :cond_0
    iget-boolean p1, v4, Lcom/tencent/vasdolly/common/ApkSectionInfo;->lowMemory:Z

    .line 73
    .line 74
    if-nez p1, :cond_1

    .line 75
    .line 76
    invoke-virtual {v2}, Lcom/tencent/vasdolly/common/Pair;->getSecond()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Ljava/lang/Long;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    long-to-int p1, v5

    .line 87
    invoke-static {v1, p1}, Lcom/tencent/vasdolly/common/V2SchemeUtil;->findContentEntry(Ljava/io/RandomAccessFile;I)Lcom/tencent/vasdolly/common/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, v4, Lcom/tencent/vasdolly/common/ApkSectionInfo;->contentEntry:Lcom/tencent/vasdolly/common/Pair;

    .line 92
    .line 93
    :cond_1
    iput-object v2, v4, Lcom/tencent/vasdolly/common/ApkSectionInfo;->apkSigningBlock:Lcom/tencent/vasdolly/common/Pair;

    .line 94
    .line 95
    iput-object v3, v4, Lcom/tencent/vasdolly/common/ApkSectionInfo;->centralDir:Lcom/tencent/vasdolly/common/Pair;

    .line 96
    .line 97
    iput-object v0, v4, Lcom/tencent/vasdolly/common/ApkSectionInfo;->eocd:Lcom/tencent/vasdolly/common/Pair;

    .line 98
    .line 99
    invoke-virtual {v4}, Lcom/tencent/vasdolly/common/ApkSectionInfo;->checkParamters()V

    .line 100
    .line 101
    .line 102
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 103
    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v2, "baseApk : "

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p0, "\nApkSectionInfo = "

    .line 122
    .line 123
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 137
    .line 138
    .line 139
    return-object v4

    .line 140
    :cond_2
    :try_start_2
    new-instance p0, Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;

    .line 141
    .line 142
    const-string p1, "ZIP64 APK not supported"

    .line 143
    .line 144
    invoke-direct {p0, p1}, Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 148
    :catchall_0
    move-exception p0

    .line 149
    move-object v0, v1

    .line 150
    goto :goto_0

    .line 151
    :catchall_1
    move-exception p0

    .line 152
    :goto_0
    if-eqz v0, :cond_3

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    .line 155
    .line 156
    .line 157
    :cond_3
    throw p0
.end method

.method public static getApkSigningBlock(Ljava/io/File;)Ljava/nio/ByteBuffer;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :try_start_0
    new-instance v1, Ljava/io/RandomAccessFile;

    .line 18
    .line 19
    const-string v2, "r"

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 22
    .line 23
    .line 24
    :try_start_1
    invoke-static {v1}, Lcom/tencent/vasdolly/common/apk/ApkSigningBlockUtils;->getEocd(Ljava/io/RandomAccessFile;)Lcom/tencent/vasdolly/common/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Lcom/tencent/vasdolly/common/Pair;->getFirst()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/tencent/vasdolly/common/Pair;->getSecond()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/lang/Long;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    invoke-static {v1, v2, v3}, Lcom/tencent/vasdolly/common/apk/ZipUtils;->isZip64EndOfCentralDirectoryLocatorPresent(Ljava/io/RandomAccessFile;J)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    invoke-static {v0, v2, v3}, Lcom/tencent/vasdolly/common/apk/ApkSigningBlockUtils;->getCentralDirOffset(Ljava/nio/ByteBuffer;J)J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    invoke-static {v1, v2, v3}, Lcom/tencent/vasdolly/common/apk/ApkSigningBlockUtils;->findApkSigningBlock(Ljava/io/RandomAccessFile;J)Lcom/tencent/vasdolly/common/Pair;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Lcom/tencent/vasdolly/common/Pair;->getFirst()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Ljava/nio/ByteBuffer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 65
    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_1
    :try_start_2
    new-instance p0, Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;

    .line 69
    .line 70
    const-string v0, "ZIP64 APK not supported"

    .line 71
    .line 72
    invoke-direct {p0, v0}, Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    move-object v0, v1

    .line 78
    goto :goto_0

    .line 79
    :catchall_1
    move-exception p0

    .line 80
    :goto_0
    if-eqz v0, :cond_2

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    .line 83
    .line 84
    .line 85
    :cond_2
    throw p0

    .line 86
    :cond_3
    :goto_1
    return-object v0
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
.end method

.method private static getByteBuffer(Ljava/io/RandomAccessFile;JI)Ljava/nio/ByteBuffer;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    invoke-virtual {p3, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-virtual {p3}, Ljava/nio/Buffer;->capacity()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p0, p1, p2, v0}, Ljava/io/RandomAccessFile;->readFully([BII)V

    .line 26
    .line 27
    .line 28
    return-object p3
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
.end method
