.class public Lorg/osmdroid/views/overlay/milestones/g;
.super Lorg/osmdroid/views/overlay/milestones/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/overlay/milestones/g$a;
    }
.end annotation


# instance fields
.field private e:D

.field private f:D

.field private g:D

.field private h:I

.field private i:Lorg/osmdroid/views/overlay/milestones/g$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/osmdroid/views/overlay/milestones/d;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(JJJJ)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lorg/osmdroid/views/overlay/milestones/g;->i:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 4
    .line 5
    sget-object v2, Lorg/osmdroid/views/overlay/milestones/g$a;->STEP_ENDED:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 6
    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget v1, v0, Lorg/osmdroid/views/overlay/milestones/g;->h:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    iput v1, v0, Lorg/osmdroid/views/overlay/milestones/g;->h:I

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lorg/osmdroid/views/overlay/milestones/d;->c(I)D

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    const-wide/16 v5, 0x0

    .line 21
    .line 22
    cmpl-double v1, v3, v5

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    move-wide/from16 v5, p1

    .line 28
    .line 29
    long-to-double v13, v5

    .line 30
    move-wide/from16 v11, p3

    .line 31
    .line 32
    long-to-double v9, v11

    .line 33
    move-wide/from16 v7, p5

    .line 34
    .line 35
    long-to-double v5, v7

    .line 36
    move-object v15, v2

    .line 37
    move-wide/from16 v16, v3

    .line 38
    .line 39
    move-wide/from16 v1, p7

    .line 40
    .line 41
    long-to-double v3, v1

    .line 42
    move-wide v7, v13

    .line 43
    move-wide/from16 v18, v9

    .line 44
    .line 45
    move-wide v11, v5

    .line 46
    move-wide v5, v13

    .line 47
    move-wide v13, v3

    .line 48
    invoke-static/range {v7 .. v14}, Lorg/osmdroid/util/Distance;->getSquaredDistanceToPoint(DDDD)D

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    div-double v3, v3, v16

    .line 57
    .line 58
    invoke-static/range {p1 .. p8}, Lorg/osmdroid/views/overlay/milestones/d;->e(JJJJ)D

    .line 59
    .line 60
    .line 61
    move-result-wide v20

    .line 62
    iget-object v7, v0, Lorg/osmdroid/views/overlay/milestones/g;->i:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 63
    .line 64
    sget-object v8, Lorg/osmdroid/views/overlay/milestones/g$a;->STEP_INIT:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 65
    .line 66
    const-wide v22, 0x3f91df46a2529d39L    # 0.017453292519943295

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    if-ne v7, v8, :cond_4

    .line 72
    .line 73
    iget-wide v7, v0, Lorg/osmdroid/views/overlay/milestones/g;->e:D

    .line 74
    .line 75
    iget-wide v9, v0, Lorg/osmdroid/views/overlay/milestones/g;->g:D

    .line 76
    .line 77
    sub-double/2addr v7, v9

    .line 78
    cmpl-double v11, v7, v16

    .line 79
    .line 80
    if-lez v11, :cond_2

    .line 81
    .line 82
    add-double v9, v9, v16

    .line 83
    .line 84
    iput-wide v9, v0, Lorg/osmdroid/views/overlay/milestones/g;->g:D

    .line 85
    .line 86
    return-void

    .line 87
    :cond_2
    sget-object v11, Lorg/osmdroid/views/overlay/milestones/g$a;->STEP_STARTED:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 88
    .line 89
    iput-object v11, v0, Lorg/osmdroid/views/overlay/milestones/g;->i:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 90
    .line 91
    add-double/2addr v9, v7

    .line 92
    iput-wide v9, v0, Lorg/osmdroid/views/overlay/milestones/g;->g:D

    .line 93
    .line 94
    sub-double v16, v16, v7

    .line 95
    .line 96
    mul-double v9, v20, v22

    .line 97
    .line 98
    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    .line 99
    .line 100
    .line 101
    move-result-wide v11

    .line 102
    mul-double/2addr v11, v7

    .line 103
    mul-double/2addr v11, v3

    .line 104
    add-double/2addr v5, v11

    .line 105
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    .line 106
    .line 107
    .line 108
    move-result-wide v9

    .line 109
    mul-double/2addr v7, v9

    .line 110
    mul-double/2addr v7, v3

    .line 111
    add-double v12, v18, v7

    .line 112
    .line 113
    new-instance v14, Lorg/osmdroid/views/overlay/milestones/k;

    .line 114
    .line 115
    double-to-long v8, v5

    .line 116
    double-to-long v10, v12

    .line 117
    const/16 v18, 0x0

    .line 118
    .line 119
    move-object v7, v14

    .line 120
    move-wide/from16 v24, v12

    .line 121
    .line 122
    move-wide/from16 v12, v20

    .line 123
    .line 124
    move-object v1, v14

    .line 125
    move-object/from16 v14, v18

    .line 126
    .line 127
    invoke-direct/range {v7 .. v14}, Lorg/osmdroid/views/overlay/milestones/k;-><init>(JJDLjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Lorg/osmdroid/views/overlay/milestones/d;->b(Lorg/osmdroid/views/overlay/milestones/k;)V

    .line 131
    .line 132
    .line 133
    iget-wide v1, v0, Lorg/osmdroid/views/overlay/milestones/g;->e:D

    .line 134
    .line 135
    iget-wide v7, v0, Lorg/osmdroid/views/overlay/milestones/g;->f:D

    .line 136
    .line 137
    cmpl-double v1, v1, v7

    .line 138
    .line 139
    if-nez v1, :cond_3

    .line 140
    .line 141
    move-object v1, v15

    .line 142
    iput-object v1, v0, Lorg/osmdroid/views/overlay/milestones/g;->i:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 143
    .line 144
    return-void

    .line 145
    :cond_3
    move-object v1, v15

    .line 146
    move-wide v13, v5

    .line 147
    move-wide/from16 v9, v24

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_4
    move-object v1, v15

    .line 151
    move-wide v13, v5

    .line 152
    move-wide/from16 v9, v18

    .line 153
    .line 154
    :goto_0
    iget-object v2, v0, Lorg/osmdroid/views/overlay/milestones/g;->i:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 155
    .line 156
    sget-object v5, Lorg/osmdroid/views/overlay/milestones/g$a;->STEP_STARTED:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 157
    .line 158
    if-ne v2, v5, :cond_6

    .line 159
    .line 160
    iget-wide v5, v0, Lorg/osmdroid/views/overlay/milestones/g;->f:D

    .line 161
    .line 162
    iget-wide v7, v0, Lorg/osmdroid/views/overlay/milestones/g;->g:D

    .line 163
    .line 164
    sub-double/2addr v5, v7

    .line 165
    cmpl-double v2, v5, v16

    .line 166
    .line 167
    if-lez v2, :cond_5

    .line 168
    .line 169
    add-double v7, v7, v16

    .line 170
    .line 171
    iput-wide v7, v0, Lorg/osmdroid/views/overlay/milestones/g;->g:D

    .line 172
    .line 173
    new-instance v1, Lorg/osmdroid/views/overlay/milestones/k;

    .line 174
    .line 175
    const/16 v22, 0x0

    .line 176
    .line 177
    move-object v15, v1

    .line 178
    move-wide/from16 v16, p5

    .line 179
    .line 180
    move-wide/from16 v18, p7

    .line 181
    .line 182
    invoke-direct/range {v15 .. v22}, Lorg/osmdroid/views/overlay/milestones/k;-><init>(JJDLjava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v1}, Lorg/osmdroid/views/overlay/milestones/d;->b(Lorg/osmdroid/views/overlay/milestones/k;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_5
    iput-object v1, v0, Lorg/osmdroid/views/overlay/milestones/g;->i:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 190
    .line 191
    mul-double v22, v22, v20

    .line 192
    .line 193
    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->cos(D)D

    .line 194
    .line 195
    .line 196
    move-result-wide v1

    .line 197
    mul-double/2addr v1, v5

    .line 198
    mul-double/2addr v1, v3

    .line 199
    add-double/2addr v13, v1

    .line 200
    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->sin(D)D

    .line 201
    .line 202
    .line 203
    move-result-wide v1

    .line 204
    mul-double/2addr v5, v1

    .line 205
    mul-double/2addr v5, v3

    .line 206
    add-double/2addr v9, v5

    .line 207
    new-instance v1, Lorg/osmdroid/views/overlay/milestones/k;

    .line 208
    .line 209
    double-to-long v2, v13

    .line 210
    double-to-long v4, v9

    .line 211
    const/4 v6, 0x0

    .line 212
    move-object/from16 p1, v1

    .line 213
    .line 214
    move-wide/from16 p2, v2

    .line 215
    .line 216
    move-wide/from16 p4, v4

    .line 217
    .line 218
    move-wide/from16 p6, v20

    .line 219
    .line 220
    move-object/from16 p8, v6

    .line 221
    .line 222
    invoke-direct/range {p1 .. p8}, Lorg/osmdroid/views/overlay/milestones/k;-><init>(JJDLjava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v1}, Lorg/osmdroid/views/overlay/milestones/d;->b(Lorg/osmdroid/views/overlay/milestones/k;)V

    .line 226
    .line 227
    .line 228
    :cond_6
    return-void
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

.method public g(DD)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/osmdroid/views/overlay/milestones/g;->e:D

    .line 2
    .line 3
    iput-wide p3, p0, Lorg/osmdroid/views/overlay/milestones/g;->f:D

    .line 4
    .line 5
    return-void
    .line 6
    .line 7
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
.end method

.method public init()V
    .locals 2

    .line 1
    invoke-super {p0}, Lorg/osmdroid/views/overlay/milestones/d;->init()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/milestones/g;->g:D

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lorg/osmdroid/views/overlay/milestones/g;->h:I

    .line 10
    .line 11
    sget-object v0, Lorg/osmdroid/views/overlay/milestones/g$a;->STEP_INIT:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 12
    .line 13
    iput-object v0, p0, Lorg/osmdroid/views/overlay/milestones/g;->i:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 14
    .line 15
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
.end method
