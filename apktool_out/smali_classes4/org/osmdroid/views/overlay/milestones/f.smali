.class public Lorg/osmdroid/views/overlay/milestones/f;
.super Lorg/osmdroid/views/overlay/milestones/d;
.source "SourceFile"


# instance fields
.field private final e:D

.field private f:D

.field private g:I

.field private final h:[D

.field private i:I

.field private j:D

.field private k:Z

.field private l:D

.field private m:J

.field private n:J

.field private o:D


# direct methods
.method public constructor <init>(D)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/milestones/d;-><init>()V

    const-wide v0, 0x3ee4f8b588e368f1L    # 1.0E-5

    .line 2
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/milestones/f;->l:D

    .line 3
    iput-wide p1, p0, Lorg/osmdroid/views/overlay/milestones/f;->e:D

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lorg/osmdroid/views/overlay/milestones/f;->h:[D

    return-void
.end method

.method public constructor <init>([D)V
    .locals 2

    .line 5
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/milestones/d;-><init>()V

    const-wide v0, 0x3ee4f8b588e368f1L    # 1.0E-5

    .line 6
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/milestones/f;->l:D

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/milestones/f;->e:D

    .line 8
    iput-object p1, p0, Lorg/osmdroid/views/overlay/milestones/f;->h:[D

    return-void
.end method

.method private g(JJD)V
    .locals 9

    new-instance v8, Lorg/osmdroid/views/overlay/milestones/k;

    iget-wide v0, p0, Lorg/osmdroid/views/overlay/milestones/f;->f:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    move-object v0, v8

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    invoke-direct/range {v0 .. v7}, Lorg/osmdroid/views/overlay/milestones/k;-><init>(JJDLjava/lang/Object;)V

    invoke-virtual {p0, v8}, Lorg/osmdroid/views/overlay/milestones/d;->b(Lorg/osmdroid/views/overlay/milestones/k;)V

    return-void
.end method

.method private h()D
    .locals 8

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/f;->h:[D

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lorg/osmdroid/views/overlay/milestones/f;->e:D

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    iget v1, p0, Lorg/osmdroid/views/overlay/milestones/f;->i:I

    .line 9
    .line 10
    array-length v2, v0

    .line 11
    if-lt v1, v2, :cond_1

    .line 12
    .line 13
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 14
    .line 15
    return-wide v0

    .line 16
    :cond_1
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    move-wide v4, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_2
    add-int/lit8 v4, v1, -0x1

    .line 23
    .line 24
    aget-wide v4, v0, v4

    .line 25
    .line 26
    :goto_0
    add-int/lit8 v6, v1, 0x1

    .line 27
    .line 28
    iput v6, p0, Lorg/osmdroid/views/overlay/milestones/f;->i:I

    .line 29
    .line 30
    aget-wide v6, v0, v1

    .line 31
    .line 32
    sub-double/2addr v6, v4

    .line 33
    cmpg-double v0, v6, v2

    .line 34
    .line 35
    if-ltz v0, :cond_3

    .line 36
    .line 37
    return-wide v6

    .line 38
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 41
    .line 42
    .line 43
    throw v0
    .line 44
    .line 45
.end method


# virtual methods
.method protected a(JJJJ)V
    .locals 25

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-wide/from16 v8, p5

    .line 4
    .line 5
    move-wide/from16 v10, p7

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, v7, Lorg/osmdroid/views/overlay/milestones/f;->k:Z

    .line 9
    .line 10
    iget-wide v0, v7, Lorg/osmdroid/views/overlay/milestones/f;->j:D

    .line 11
    .line 12
    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    .line 13
    .line 14
    cmpl-double v0, v0, v12

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget v0, v7, Lorg/osmdroid/views/overlay/milestones/f;->g:I

    .line 20
    .line 21
    const/4 v14, 0x1

    .line 22
    add-int/2addr v0, v14

    .line 23
    iput v0, v7, Lorg/osmdroid/views/overlay/milestones/f;->g:I

    .line 24
    .line 25
    invoke-virtual {v7, v0}, Lorg/osmdroid/views/overlay/milestones/d;->c(I)D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    cmpl-double v2, v0, v2

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    move-wide/from16 v2, p1

    .line 37
    .line 38
    long-to-double v4, v2

    .line 39
    move-wide/from16 v12, p3

    .line 40
    .line 41
    long-to-double v14, v12

    .line 42
    long-to-double v2, v8

    .line 43
    long-to-double v12, v10

    .line 44
    move-wide/from16 v23, v14

    .line 45
    .line 46
    move-wide v15, v4

    .line 47
    move-wide/from16 v17, v23

    .line 48
    .line 49
    move-wide/from16 v19, v2

    .line 50
    .line 51
    move-wide/from16 v21, v12

    .line 52
    .line 53
    invoke-static/range {v15 .. v22}, Lorg/osmdroid/util/Distance;->getSquaredDistanceToPoint(DDDD)D

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    div-double v12, v2, v0

    .line 62
    .line 63
    invoke-static/range {p1 .. p8}, Lorg/osmdroid/views/overlay/milestones/d;->e(JJJJ)D

    .line 64
    .line 65
    .line 66
    move-result-wide v14

    .line 67
    :goto_0
    iget-wide v2, v7, Lorg/osmdroid/views/overlay/milestones/f;->j:D

    .line 68
    .line 69
    cmpg-double v6, v0, v2

    .line 70
    .line 71
    if-gez v6, :cond_2

    .line 72
    .line 73
    iget-wide v4, v7, Lorg/osmdroid/views/overlay/milestones/f;->f:D

    .line 74
    .line 75
    add-double/2addr v4, v0

    .line 76
    iput-wide v4, v7, Lorg/osmdroid/views/overlay/milestones/f;->f:D

    .line 77
    .line 78
    sub-double/2addr v2, v0

    .line 79
    iput-wide v2, v7, Lorg/osmdroid/views/overlay/milestones/f;->j:D

    .line 80
    .line 81
    const/4 v6, 0x1

    .line 82
    iput-boolean v6, v7, Lorg/osmdroid/views/overlay/milestones/f;->k:Z

    .line 83
    .line 84
    iput-wide v8, v7, Lorg/osmdroid/views/overlay/milestones/f;->m:J

    .line 85
    .line 86
    iput-wide v10, v7, Lorg/osmdroid/views/overlay/milestones/f;->n:J

    .line 87
    .line 88
    iput-wide v14, v7, Lorg/osmdroid/views/overlay/milestones/f;->o:D

    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    const/4 v6, 0x1

    .line 92
    iget-wide v8, v7, Lorg/osmdroid/views/overlay/milestones/f;->f:D

    .line 93
    .line 94
    add-double/2addr v8, v2

    .line 95
    iput-wide v8, v7, Lorg/osmdroid/views/overlay/milestones/f;->f:D

    .line 96
    .line 97
    sub-double v8, v0, v2

    .line 98
    .line 99
    const-wide v0, 0x3f91df46a2529d39L    # 0.017453292519943295

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    mul-double/2addr v0, v14

    .line 105
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 106
    .line 107
    .line 108
    move-result-wide v16

    .line 109
    mul-double v2, v2, v16

    .line 110
    .line 111
    mul-double/2addr v2, v12

    .line 112
    add-double v3, v4, v2

    .line 113
    .line 114
    iget-wide v5, v7, Lorg/osmdroid/views/overlay/milestones/f;->j:D

    .line 115
    .line 116
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 117
    .line 118
    .line 119
    move-result-wide v0

    .line 120
    mul-double/2addr v5, v0

    .line 121
    mul-double/2addr v5, v12

    .line 122
    add-double v5, v23, v5

    .line 123
    .line 124
    double-to-long v1, v3

    .line 125
    move-wide/from16 p1, v3

    .line 126
    .line 127
    double-to-long v3, v5

    .line 128
    move-object/from16 v0, p0

    .line 129
    .line 130
    move-wide/from16 v16, p1

    .line 131
    .line 132
    move-wide/from16 v23, v5

    .line 133
    .line 134
    const/16 v18, 0x1

    .line 135
    .line 136
    move-wide v5, v14

    .line 137
    invoke-direct/range {v0 .. v6}, Lorg/osmdroid/views/overlay/milestones/f;->g(JJD)V

    .line 138
    .line 139
    .line 140
    invoke-direct/range {p0 .. p0}, Lorg/osmdroid/views/overlay/milestones/f;->h()D

    .line 141
    .line 142
    .line 143
    move-result-wide v0

    .line 144
    iput-wide v0, v7, Lorg/osmdroid/views/overlay/milestones/f;->j:D

    .line 145
    .line 146
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    .line 147
    .line 148
    cmpl-double v0, v0, v2

    .line 149
    .line 150
    if-nez v0, :cond_3

    .line 151
    .line 152
    return-void

    .line 153
    :cond_3
    move-wide v0, v8

    .line 154
    move-wide/from16 v4, v16

    .line 155
    .line 156
    move-wide/from16 v8, p5

    .line 157
    .line 158
    goto :goto_0
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
.end method

.method public end()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/milestones/f;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lorg/osmdroid/views/overlay/milestones/f;->j:D

    .line 6
    .line 7
    iget-wide v2, p0, Lorg/osmdroid/views/overlay/milestones/f;->l:D

    .line 8
    .line 9
    cmpg-double v0, v0, v2

    .line 10
    .line 11
    if-gez v0, :cond_0

    .line 12
    .line 13
    iget-wide v2, p0, Lorg/osmdroid/views/overlay/milestones/f;->m:J

    .line 14
    .line 15
    iget-wide v4, p0, Lorg/osmdroid/views/overlay/milestones/f;->n:J

    .line 16
    .line 17
    iget-wide v6, p0, Lorg/osmdroid/views/overlay/milestones/f;->o:D

    .line 18
    .line 19
    move-object v1, p0

    .line 20
    invoke-direct/range {v1 .. v7}, Lorg/osmdroid/views/overlay/milestones/f;->g(JJD)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-super {p0}, Lorg/osmdroid/views/overlay/milestones/d;->end()V

    .line 24
    .line 25
    .line 26
    return-void
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
.end method

.method public i(D)V
    .locals 0

    iput-wide p1, p0, Lorg/osmdroid/views/overlay/milestones/f;->l:D

    return-void
.end method

.method public init()V
    .locals 3

    .line 1
    invoke-super {p0}, Lorg/osmdroid/views/overlay/milestones/d;->init()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/milestones/f;->f:D

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lorg/osmdroid/views/overlay/milestones/f;->g:I

    .line 10
    .line 11
    iget-object v1, p0, Lorg/osmdroid/views/overlay/milestones/f;->h:[D

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iput v0, p0, Lorg/osmdroid/views/overlay/milestones/f;->i:I

    .line 16
    .line 17
    :cond_0
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/milestones/f;->h()D

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    iput-wide v1, p0, Lorg/osmdroid/views/overlay/milestones/f;->j:D

    .line 22
    .line 23
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/milestones/f;->k:Z

    .line 24
    .line 25
    return-void
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
.end method
