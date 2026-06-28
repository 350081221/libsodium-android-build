.class public Lcom/bytedance/pangle/res/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/pangle/res/a/a$a;
    }
.end annotation


# static fields
.field private static final f:Ljava/util/logging/Logger;


# instance fields
.field private final a:[B

.field private final b:Lcom/bytedance/pangle/res/a/h;

.field private final c:Lcom/bytedance/pangle/res/a/g;

.field private final d:Lcom/bytedance/pangle/res/a/e;

.field private e:Lcom/bytedance/pangle/res/a/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/bytedance/pangle/res/a/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/bytedance/pangle/res/a/a;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>([BLcom/bytedance/pangle/res/a/h;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/pangle/res/a/e;

    .line 5
    .line 6
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/bytedance/pangle/res/a/e;-><init>(Ljava/io/InputStream;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/bytedance/pangle/res/a/a;->d:Lcom/bytedance/pangle/res/a/e;

    .line 15
    .line 16
    new-instance v1, Lcom/bytedance/pangle/res/a/g;

    .line 17
    .line 18
    new-instance v2, Lcom/bytedance/pangle/res/a/i;

    .line 19
    .line 20
    invoke-direct {v2, v0}, Lcom/bytedance/pangle/res/a/i;-><init>(Lcom/bytedance/pangle/res/a/e;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2}, Lcom/bytedance/pangle/res/a/g;-><init>(Lcom/bytedance/pangle/res/a/i;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 27
    .line 28
    iput-object p1, p0, Lcom/bytedance/pangle/res/a/a;->a:[B

    .line 29
    .line 30
    iput-object p2, p0, Lcom/bytedance/pangle/res/a/a;->b:Lcom/bytedance/pangle/res/a/h;

    .line 31
    .line 32
    return-void
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

.method private a(I)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    :goto_0
    add-int/lit8 v1, p1, -0x1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {p1}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    move-result p1

    int-to-short p1, p1

    if-eqz p1, :cond_0

    int-to-char p1, p1

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move p1, v1

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {p1, v1}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private b()V
    .locals 4

    const/16 v0, 0x203

    .line 1
    invoke-direct {p0, v0}, Lcom/bytedance/pangle/res/a/a;->b(I)V

    .line 2
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 4
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    const/16 v3, 0x100

    invoke-virtual {v2, v3}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 5
    :cond_0
    :goto_1
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->j()Lcom/bytedance/pangle/res/a/a$a;

    move-result-object v0

    iget-short v0, v0, Lcom/bytedance/pangle/res/a/a$a;->a:S

    const/16 v1, 0x201

    if-ne v0, v1, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->c()V

    goto :goto_1

    :cond_1
    return-void
.end method

.method private b(I)V
    .locals 3

    .line 7
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->e:Lcom/bytedance/pangle/res/a/a$a;

    iget-short v0, v0, Lcom/bytedance/pangle/res/a/a$a;->a:S

    if-ne v0, p1, :cond_0

    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    iget-object p1, p0, Lcom/bytedance/pangle/res/a/a;->e:Lcom/bytedance/pangle/res/a/a$a;

    iget-short p1, p1, Lcom/bytedance/pangle/res/a/a$a;->a:S

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string p1, "Invalid chunk type: expected=0x%08x, got=0x%08x"

    .line 10
    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private c()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->d()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->j()Lcom/bytedance/pangle/res/a/a$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-short v0, v0, Lcom/bytedance/pangle/res/a/a$a;->a:S

    .line 9
    .line 10
    :goto_0
    const/16 v1, 0x202

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->d()V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->j()Lcom/bytedance/pangle/res/a/a$a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-short v0, v0, Lcom/bytedance/pangle/res/a/a$a;->a:S

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :goto_1
    const/16 v1, 0x201

    .line 25
    .line 26
    if-ne v0, v1, :cond_2

    .line 27
    .line 28
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->e()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->d:Lcom/bytedance/pangle/res/a/e;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/e;->a()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->e:Lcom/bytedance/pangle/res/a/a$a;

    .line 38
    .line 39
    iget v1, v1, Lcom/bytedance/pangle/res/a/a$a;->e:I

    .line 40
    .line 41
    if-ge v0, v1, :cond_1

    .line 42
    .line 43
    sget-object v0, Lcom/bytedance/pangle/res/a/a;->f:Ljava/util/logging/Logger;

    .line 44
    .line 45
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v2, "Unknown data detected. Skipping: "

    .line 48
    .line 49
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->e:Lcom/bytedance/pangle/res/a/a$a;

    .line 53
    .line 54
    iget v2, v2, Lcom/bytedance/pangle/res/a/a$a;->e:I

    .line 55
    .line 56
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->d:Lcom/bytedance/pangle/res/a/e;

    .line 57
    .line 58
    invoke-virtual {v3}, Lcom/bytedance/pangle/res/a/e;->a()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    sub-int/2addr v2, v3

    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v2, " byte(s)"

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->d:Lcom/bytedance/pangle/res/a/e;

    .line 79
    .line 80
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->e:Lcom/bytedance/pangle/res/a/a$a;

    .line 81
    .line 82
    iget v1, v1, Lcom/bytedance/pangle/res/a/a$a;->e:I

    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/e;->a()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    sub-int/2addr v1, v2

    .line 89
    int-to-long v1, v1

    .line 90
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/pangle/res/a/e;->skip(J)J

    .line 91
    .line 92
    .line 93
    :cond_1
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->j()Lcom/bytedance/pangle/res/a/a$a;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-short v0, v0, Lcom/bytedance/pangle/res/a/a$a;->a:S

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    return-void
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
.end method

.method private d()V
    .locals 2

    .line 1
    const/16 v0, 0x202

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/bytedance/pangle/res/a/a;->b(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readUnsignedByte()I

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    invoke-virtual {v0, v1}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 24
    .line 25
    mul-int/lit8 v0, v0, 0x4

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 28
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
.end method

.method private e()V
    .locals 6

    .line 1
    const/16 v0, 0x201

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/bytedance/pangle/res/a/a;->b(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readUnsignedByte()I

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    invoke-virtual {v0, v1}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->i()V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->e:Lcom/bytedance/pangle/res/a/a$a;

    .line 38
    .line 39
    iget v2, v2, Lcom/bytedance/pangle/res/a/a$a;->d:I

    .line 40
    .line 41
    add-int/2addr v2, v1

    .line 42
    mul-int/lit8 v1, v0, 0x4

    .line 43
    .line 44
    sub-int/2addr v2, v1

    .line 45
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->d:Lcom/bytedance/pangle/res/a/e;

    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/bytedance/pangle/res/a/e;->a()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eq v2, v1, :cond_0

    .line 52
    .line 53
    sget-object v1, Lcom/bytedance/pangle/res/a/a;->f:Ljava/util/logging/Logger;

    .line 54
    .line 55
    new-instance v3, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v4, "Invalid data detected. Skipping: "

    .line 58
    .line 59
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iget-object v4, p0, Lcom/bytedance/pangle/res/a/a;->d:Lcom/bytedance/pangle/res/a/e;

    .line 63
    .line 64
    invoke-virtual {v4}, Lcom/bytedance/pangle/res/a/e;->a()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    sub-int v4, v2, v4

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v4, " byte(s)"

    .line 74
    .line 75
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v1, v3}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 86
    .line 87
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->d:Lcom/bytedance/pangle/res/a/e;

    .line 88
    .line 89
    invoke-virtual {v3}, Lcom/bytedance/pangle/res/a/e;->a()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    sub-int/2addr v2, v3

    .line 94
    invoke-virtual {v1, v2}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 95
    .line 96
    .line 97
    :cond_0
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 98
    .line 99
    invoke-virtual {v1, v0}, Lcom/bytedance/pangle/res/a/g;->a(I)[I

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v1, Ljava/util/HashSet;

    .line 104
    .line 105
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 106
    .line 107
    .line 108
    array-length v2, v0

    .line 109
    const/4 v3, 0x0

    .line 110
    :goto_0
    if-ge v3, v2, :cond_2

    .line 111
    .line 112
    aget v4, v0, v3

    .line 113
    .line 114
    const/4 v5, -0x1

    .line 115
    if-eq v4, v5, :cond_1

    .line 116
    .line 117
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-nez v5, :cond_1

    .line 126
    .line 127
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->f()V

    .line 128
    .line 129
    .line 130
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_2
    return-void
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
.end method

.method private f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readShort()S

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ltz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readShort()S

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 18
    .line 19
    .line 20
    and-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->h()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->g()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 33
    .line 34
    const-string v1, "Entry size is under 0 bytes."

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0
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
.end method

.method private g()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/pangle/res/a/k;->a(Lcom/bytedance/pangle/res/a/g;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->a:[B

    .line 14
    .line 15
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->b:Lcom/bytedance/pangle/res/a/h;

    .line 16
    .line 17
    invoke-static {v2, v1, v0, v3}, Lcom/bytedance/pangle/res/a/k;->a([BIILcom/bytedance/pangle/res/a/h;)I

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    :goto_0
    if-ge v1, v0, :cond_0

    .line 28
    .line 29
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 30
    .line 31
    invoke-static {v2}, Lcom/bytedance/pangle/res/a/k;->a(Lcom/bytedance/pangle/res/a/g;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    iget-object v4, p0, Lcom/bytedance/pangle/res/a/a;->a:[B

    .line 42
    .line 43
    iget-object v5, p0, Lcom/bytedance/pangle/res/a/a;->b:Lcom/bytedance/pangle/res/a/h;

    .line 44
    .line 45
    invoke-static {v4, v3, v2, v5}, Lcom/bytedance/pangle/res/a/k;->a([BIILcom/bytedance/pangle/res/a/h;)I

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->h()V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    return-void
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
.end method

.method private h()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/g;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/g;->b()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 18
    .line 19
    invoke-static {v1}, Lcom/bytedance/pangle/res/a/k;->a(Lcom/bytedance/pangle/res/a/g;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x1

    .line 30
    if-ne v0, v3, :cond_0

    .line 31
    .line 32
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->a:[B

    .line 33
    .line 34
    iget-object v4, p0, Lcom/bytedance/pangle/res/a/a;->b:Lcom/bytedance/pangle/res/a/h;

    .line 35
    .line 36
    invoke-static {v3, v2, v1, v4}, Lcom/bytedance/pangle/res/a/k;->a([BIILcom/bytedance/pangle/res/a/h;)I

    .line 37
    .line 38
    .line 39
    :cond_0
    const/4 v3, 0x2

    .line 40
    if-ne v0, v3, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->a:[B

    .line 43
    .line 44
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->b:Lcom/bytedance/pangle/res/a/h;

    .line 45
    .line 46
    invoke-static {v0, v2, v1, v3}, Lcom/bytedance/pangle/res/a/k;->a([BIILcom/bytedance/pangle/res/a/h;)I

    .line 47
    .line 48
    .line 49
    :cond_1
    return-void
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
.end method

.method private i()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1c

    .line 8
    .line 9
    if-lt v0, v1, :cond_8

    .line 10
    .line 11
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readShort()S

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readShort()S

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 42
    .line 43
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readUnsignedShort()I

    .line 54
    .line 55
    .line 56
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 57
    .line 58
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 59
    .line 60
    .line 61
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 62
    .line 63
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 64
    .line 65
    .line 66
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 67
    .line 68
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 69
    .line 70
    .line 71
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 72
    .line 73
    const/4 v3, 0x1

    .line 74
    invoke-virtual {v2, v3}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 78
    .line 79
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readShort()S

    .line 80
    .line 81
    .line 82
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 83
    .line 84
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readShort()S

    .line 85
    .line 86
    .line 87
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 88
    .line 89
    invoke-virtual {v2}, Lcom/bytedance/pangle/res/a/f;->readShort()S

    .line 90
    .line 91
    .line 92
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 93
    .line 94
    const/4 v4, 0x2

    .line 95
    invoke-virtual {v2, v4}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 96
    .line 97
    .line 98
    const/16 v2, 0x20

    .line 99
    .line 100
    if-lt v0, v2, :cond_0

    .line 101
    .line 102
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 103
    .line 104
    invoke-virtual {v1}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 108
    .line 109
    invoke-virtual {v1}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 110
    .line 111
    .line 112
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 113
    .line 114
    invoke-virtual {v1}, Lcom/bytedance/pangle/res/a/f;->readShort()S

    .line 115
    .line 116
    .line 117
    move v1, v2

    .line 118
    :cond_0
    const/16 v2, 0x24

    .line 119
    .line 120
    if-lt v0, v2, :cond_1

    .line 121
    .line 122
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 123
    .line 124
    invoke-virtual {v1}, Lcom/bytedance/pangle/res/a/f;->readShort()S

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 128
    .line 129
    invoke-virtual {v1}, Lcom/bytedance/pangle/res/a/f;->readShort()S

    .line 130
    .line 131
    .line 132
    move v1, v2

    .line 133
    :cond_1
    const/4 v2, 0x4

    .line 134
    const/16 v5, 0x30

    .line 135
    .line 136
    if-lt v0, v5, :cond_2

    .line 137
    .line 138
    invoke-direct {p0, v2}, Lcom/bytedance/pangle/res/a/a;->a(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    .line 143
    .line 144
    .line 145
    const/16 v1, 0x8

    .line 146
    .line 147
    invoke-direct {p0, v1}, Lcom/bytedance/pangle/res/a/a;->a(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    .line 152
    .line 153
    .line 154
    move v1, v5

    .line 155
    :cond_2
    const/16 v5, 0x34

    .line 156
    .line 157
    if-lt v0, v5, :cond_3

    .line 158
    .line 159
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 160
    .line 161
    invoke-virtual {v1}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 162
    .line 163
    .line 164
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 165
    .line 166
    invoke-virtual {v1}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 167
    .line 168
    .line 169
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 170
    .line 171
    invoke-virtual {v1, v4}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 172
    .line 173
    .line 174
    move v1, v5

    .line 175
    :cond_3
    const/16 v5, 0x38

    .line 176
    .line 177
    if-lt v0, v5, :cond_4

    .line 178
    .line 179
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 180
    .line 181
    invoke-virtual {v1, v2}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 182
    .line 183
    .line 184
    move v1, v5

    .line 185
    :cond_4
    add-int/lit8 v2, v0, -0x38

    .line 186
    .line 187
    if-lez v2, :cond_6

    .line 188
    .line 189
    new-array v6, v2, [B

    .line 190
    .line 191
    add-int/2addr v1, v2

    .line 192
    iget-object v2, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 193
    .line 194
    invoke-virtual {v2, v6}, Lcom/bytedance/pangle/res/a/f;->readFully([B)V

    .line 195
    .line 196
    .line 197
    new-instance v2, Ljava/math/BigInteger;

    .line 198
    .line 199
    invoke-direct {v2, v3, v6}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 200
    .line 201
    .line 202
    sget-object v6, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 203
    .line 204
    invoke-virtual {v2, v6}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    const/4 v7, 0x0

    .line 209
    if-eqz v6, :cond_5

    .line 210
    .line 211
    sget-object v2, Lcom/bytedance/pangle/res/a/a;->f:Ljava/util/logging/Logger;

    .line 212
    .line 213
    new-array v3, v3, [Ljava/lang/Object;

    .line 214
    .line 215
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    aput-object v4, v3, v7

    .line 220
    .line 221
    const-string v4, "Config flags size > %d, but exceeding bytes are all zero, so it should be ok."

    .line 222
    .line 223
    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    goto :goto_0

    .line 231
    :cond_5
    sget-object v6, Lcom/bytedance/pangle/res/a/a;->f:Ljava/util/logging/Logger;

    .line 232
    .line 233
    const/4 v8, 0x3

    .line 234
    new-array v8, v8, [Ljava/lang/Object;

    .line 235
    .line 236
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    aput-object v5, v8, v7

    .line 241
    .line 242
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    aput-object v5, v8, v3

    .line 247
    .line 248
    aput-object v2, v8, v4

    .line 249
    .line 250
    const-string v2, "Config flags size > %d. Size = %d. Exceeding bytes: 0x%X."

    .line 251
    .line 252
    invoke-static {v2, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-virtual {v6, v2}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    :cond_6
    :goto_0
    sub-int/2addr v0, v1

    .line 260
    if-lez v0, :cond_7

    .line 261
    .line 262
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 263
    .line 264
    invoke-virtual {v1, v0}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 265
    .line 266
    .line 267
    :cond_7
    return-void

    .line 268
    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    .line 269
    .line 270
    const-string v1, "Config size < 28"

    .line 271
    .line 272
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v0
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
.end method

.method private j()Lcom/bytedance/pangle/res/a/a$a;
    .locals 2

    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->d:Lcom/bytedance/pangle/res/a/e;

    invoke-static {v0, v1}, Lcom/bytedance/pangle/res/a/a$a;->a(Lcom/bytedance/pangle/res/a/g;Lcom/bytedance/pangle/res/a/e;)Lcom/bytedance/pangle/res/a/a$a;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/pangle/res/a/a;->e:Lcom/bytedance/pangle/res/a/a$a;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 6
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->j()Lcom/bytedance/pangle/res/a/a$a;

    const/4 v0, 0x2

    .line 7
    invoke-direct {p0, v0}, Lcom/bytedance/pangle/res/a/a;->b(I)V

    .line 8
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    move-result v0

    .line 9
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-static {v1}, Lcom/bytedance/pangle/res/a/l;->a(Lcom/bytedance/pangle/res/a/g;)V

    .line 10
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->j()Lcom/bytedance/pangle/res/a/a$a;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_5

    const/16 v3, 0x200

    .line 11
    invoke-direct {p0, v3}, Lcom/bytedance/pangle/res/a/a;->b(I)V

    .line 12
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v3}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 13
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    const/16 v4, 0x100

    invoke-virtual {v3, v4}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 14
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    const/4 v4, 0x4

    .line 15
    invoke-virtual {v3, v4}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 16
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 17
    invoke-virtual {v3, v4}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 18
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 19
    invoke-virtual {v3, v4}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 20
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    .line 21
    invoke-virtual {v3, v4}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 22
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->e:Lcom/bytedance/pangle/res/a/a$a;

    iget v3, v3, Lcom/bytedance/pangle/res/a/a$a;->b:I

    const/16 v4, 0x120

    if-ne v3, v4, :cond_1

    .line 23
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v3}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    move-result v3

    if-gtz v3, :cond_0

    goto :goto_1

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "don\'t support"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 25
    :cond_1
    :goto_1
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-static {v3}, Lcom/bytedance/pangle/res/a/l;->a(Lcom/bytedance/pangle/res/a/g;)V

    .line 26
    iget-object v3, p0, Lcom/bytedance/pangle/res/a/a;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-static {v3}, Lcom/bytedance/pangle/res/a/l;->a(Lcom/bytedance/pangle/res/a/g;)V

    .line 27
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->j()Lcom/bytedance/pangle/res/a/a$a;

    const/4 v3, 0x1

    :goto_2
    if-eqz v3, :cond_4

    .line 28
    iget-object v4, p0, Lcom/bytedance/pangle/res/a/a;->e:Lcom/bytedance/pangle/res/a/a$a;

    iget-short v4, v4, Lcom/bytedance/pangle/res/a/a$a;->a:S

    const/16 v5, 0x202

    if-eq v4, v5, :cond_3

    const/16 v5, 0x203

    if-eq v4, v5, :cond_2

    move v3, v1

    goto :goto_2

    .line 29
    :cond_2
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->b()V

    goto :goto_2

    .line 30
    :cond_3
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/a;->c()V

    goto :goto_2

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method
