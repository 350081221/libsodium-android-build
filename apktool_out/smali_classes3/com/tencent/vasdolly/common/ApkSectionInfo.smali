.class public Lcom/tencent/vasdolly/common/ApkSectionInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static COPY_CONTENT_MAX_SIZE:I = 0x20000000


# instance fields
.field public apkSigningBlock:Lcom/tencent/vasdolly/common/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tencent/vasdolly/common/Pair<",
            "Ljava/nio/ByteBuffer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public apkSize:J

.field public centralDir:Lcom/tencent/vasdolly/common/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tencent/vasdolly/common/Pair<",
            "Ljava/nio/ByteBuffer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public contentEntry:Lcom/tencent/vasdolly/common/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tencent/vasdolly/common/Pair<",
            "Ljava/nio/ByteBuffer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public eocd:Lcom/tencent/vasdolly/common/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tencent/vasdolly/common/Pair<",
            "Ljava/nio/ByteBuffer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public lowMemory:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->lowMemory:Z

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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


# virtual methods
.method public checkEocdCentralDirOffset()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->eocd:Lcom/tencent/vasdolly/common/Pair;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getFirst()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->eocd:Lcom/tencent/vasdolly/common/Pair;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/tencent/vasdolly/common/Pair;->getSecond()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Long;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-static {v0, v1, v2}, Lcom/tencent/vasdolly/common/apk/ApkSigningBlockUtils;->getCentralDirOffset(Ljava/nio/ByteBuffer;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    iget-object v2, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->centralDir:Lcom/tencent/vasdolly/common/Pair;

    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/tencent/vasdolly/common/Pair;->getSecond()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/Long;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    cmp-long v2, v0, v2

    .line 38
    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    new-instance v2, Ljava/lang/RuntimeException;

    .line 43
    .line 44
    new-instance v3, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v4, "CentralDirOffset mismatch , EocdCentralDirOffset : "

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v0, ", centralDirOffset : "

    .line 58
    .line 59
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->centralDir:Lcom/tencent/vasdolly/common/Pair;

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getSecond()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v2
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

.method public checkParamters()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/vasdolly/common/apk/SignatureNotFoundException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->lowMemory:Z

    .line 2
    .line 3
    const-string v1, "ApkSectionInfo paramters is not valid : "

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->contentEntry:Lcom/tencent/vasdolly/common/Pair;

    .line 8
    .line 9
    if-eqz v2, :cond_4

    .line 10
    .line 11
    :cond_0
    iget-object v2, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->apkSigningBlock:Lcom/tencent/vasdolly/common/Pair;

    .line 12
    .line 13
    if-eqz v2, :cond_4

    .line 14
    .line 15
    iget-object v2, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->centralDir:Lcom/tencent/vasdolly/common/Pair;

    .line 16
    .line 17
    if-eqz v2, :cond_4

    .line 18
    .line 19
    iget-object v2, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->eocd:Lcom/tencent/vasdolly/common/Pair;

    .line 20
    .line 21
    if-eqz v2, :cond_4

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->contentEntry:Lcom/tencent/vasdolly/common/Pair;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getSecond()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Long;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    const-wide/16 v4, 0x0

    .line 38
    .line 39
    cmp-long v0, v2, v4

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->contentEntry:Lcom/tencent/vasdolly/common/Pair;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getFirst()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    int-to-long v2, v0

    .line 56
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->apkSigningBlock:Lcom/tencent/vasdolly/common/Pair;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getSecond()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/Long;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 65
    .line 66
    .line 67
    move-result-wide v4

    .line 68
    cmp-long v0, v2, v4

    .line 69
    .line 70
    if-nez v0, :cond_2

    .line 71
    .line 72
    :cond_1
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->apkSigningBlock:Lcom/tencent/vasdolly/common/Pair;

    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getFirst()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    int-to-long v2, v0

    .line 85
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->apkSigningBlock:Lcom/tencent/vasdolly/common/Pair;

    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getSecond()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Ljava/lang/Long;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    add-long/2addr v2, v4

    .line 98
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->centralDir:Lcom/tencent/vasdolly/common/Pair;

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getSecond()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Ljava/lang/Long;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 107
    .line 108
    .line 109
    move-result-wide v4

    .line 110
    cmp-long v0, v2, v4

    .line 111
    .line 112
    if-nez v0, :cond_2

    .line 113
    .line 114
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->centralDir:Lcom/tencent/vasdolly/common/Pair;

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getFirst()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    int-to-long v2, v0

    .line 127
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->centralDir:Lcom/tencent/vasdolly/common/Pair;

    .line 128
    .line 129
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getSecond()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Ljava/lang/Long;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 136
    .line 137
    .line 138
    move-result-wide v4

    .line 139
    add-long/2addr v2, v4

    .line 140
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->eocd:Lcom/tencent/vasdolly/common/Pair;

    .line 141
    .line 142
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getSecond()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, Ljava/lang/Long;

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 149
    .line 150
    .line 151
    move-result-wide v4

    .line 152
    cmp-long v0, v2, v4

    .line 153
    .line 154
    if-nez v0, :cond_2

    .line 155
    .line 156
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->eocd:Lcom/tencent/vasdolly/common/Pair;

    .line 157
    .line 158
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getFirst()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    int-to-long v2, v0

    .line 169
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->eocd:Lcom/tencent/vasdolly/common/Pair;

    .line 170
    .line 171
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getSecond()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, Ljava/lang/Long;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 178
    .line 179
    .line 180
    move-result-wide v4

    .line 181
    add-long/2addr v2, v4

    .line 182
    iget-wide v4, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->apkSize:J

    .line 183
    .line 184
    cmp-long v0, v2, v4

    .line 185
    .line 186
    if-nez v0, :cond_2

    .line 187
    .line 188
    const/4 v0, 0x1

    .line 189
    goto :goto_0

    .line 190
    :cond_2
    const/4 v0, 0x0

    .line 191
    :goto_0
    if-eqz v0, :cond_3

    .line 192
    .line 193
    invoke-virtual {p0}, Lcom/tencent/vasdolly/common/ApkSectionInfo;->checkEocdCentralDirOffset()V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    .line 198
    .line 199
    new-instance v2, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, Lcom/tencent/vasdolly/common/ApkSectionInfo;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v0

    .line 222
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    .line 223
    .line 224
    new-instance v2, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0}, Lcom/tencent/vasdolly/common/ApkSectionInfo;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw v0
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method public rewind()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->contentEntry:Lcom/tencent/vasdolly/common/Pair;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getFirst()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->apkSigningBlock:Lcom/tencent/vasdolly/common/Pair;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getFirst()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->centralDir:Lcom/tencent/vasdolly/common/Pair;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getFirst()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->eocd:Lcom/tencent/vasdolly/common/Pair;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/tencent/vasdolly/common/Pair;->getFirst()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
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

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "lowMemory : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->lowMemory:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\n apkSize : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->apkSize:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "\n contentEntry : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->contentEntry:Lcom/tencent/vasdolly/common/Pair;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n schemeV2Block : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->apkSigningBlock:Lcom/tencent/vasdolly/common/Pair;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n centralDir : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->centralDir:Lcom/tencent/vasdolly/common/Pair;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n eocd : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/vasdolly/common/ApkSectionInfo;->eocd:Lcom/tencent/vasdolly/common/Pair;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
