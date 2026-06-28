.class public Lc0/a;
.super La0/a;
.source "SourceFile"


# static fields
.field public static final synthetic d:Z = true


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0, p1}, La0/a;-><init>([B)V

    return-void
.end method

.method public static c(Ljava/lang/String;JLc0/b;SLc0/e;)Lc0/a;
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-static {v3}, La0/c;->c(B)[B

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    sget-boolean v5, Lc0/a;->d:Z

    .line 13
    .line 14
    if-nez v5, :cond_1

    .line 15
    .line 16
    array-length v6, v4

    .line 17
    if-ne v6, v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :cond_1
    :goto_0
    const/4 v6, 0x0

    .line 27
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-static {v7, v0}, La0/c;->e(CC)[B

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v7, 0x2

    .line 40
    if-nez v5, :cond_3

    .line 41
    .line 42
    array-length v8, v0

    .line 43
    if-ne v8, v7, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_3
    :goto_1
    invoke-static/range {p1 .. p2}, La0/c;->g(J)[B

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    const/16 v9, 0x8

    .line 57
    .line 58
    if-nez v5, :cond_5

    .line 59
    .line 60
    array-length v10, v8

    .line 61
    if-ne v10, v9, :cond_4

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    new-instance v0, Ljava/lang/AssertionError;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_5
    :goto_2
    invoke-static {}, La0/c;->k()[B

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    if-nez v5, :cond_7

    .line 75
    .line 76
    array-length v11, v10

    .line 77
    if-ne v11, v7, :cond_6

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    new-instance v0, Ljava/lang/AssertionError;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_7
    :goto_3
    invoke-virtual/range {p3 .. p3}, Lc0/b;->a()V

    .line 87
    .line 88
    .line 89
    iget-byte v11, v1, Lc0/b;->a:B

    .line 90
    .line 91
    invoke-static {v11}, La0/c;->c(B)[B

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    if-nez v5, :cond_9

    .line 96
    .line 97
    array-length v12, v11

    .line 98
    if-ne v12, v3, :cond_8

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_8
    new-instance v0, Ljava/lang/AssertionError;

    .line 102
    .line 103
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 104
    .line 105
    .line 106
    throw v0

    .line 107
    :cond_9
    :goto_4
    iget-byte v12, v1, Lc0/b;->b:B

    .line 108
    .line 109
    invoke-static {v12}, La0/c;->c(B)[B

    .line 110
    .line 111
    .line 112
    move-result-object v12

    .line 113
    if-nez v5, :cond_b

    .line 114
    .line 115
    array-length v13, v12

    .line 116
    if-ne v13, v3, :cond_a

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_a
    new-instance v0, Ljava/lang/AssertionError;

    .line 120
    .line 121
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 122
    .line 123
    .line 124
    throw v0

    .line 125
    :cond_b
    :goto_5
    iget-object v13, v1, Lc0/b;->c:[B

    .line 126
    .line 127
    invoke-virtual {v13}, [B->clone()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v13

    .line 131
    check-cast v13, [B

    .line 132
    .line 133
    if-nez v5, :cond_d

    .line 134
    .line 135
    array-length v14, v13

    .line 136
    iget-byte v1, v1, Lc0/b;->b:B

    .line 137
    .line 138
    and-int/lit16 v1, v1, 0xff

    .line 139
    .line 140
    if-ne v14, v1, :cond_c

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_c
    new-instance v0, Ljava/lang/AssertionError;

    .line 144
    .line 145
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 146
    .line 147
    .line 148
    throw v0

    .line 149
    :cond_d
    :goto_6
    invoke-static/range {p4 .. p4}, La0/c;->h(S)[B

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    if-nez v5, :cond_f

    .line 154
    .line 155
    array-length v14, v1

    .line 156
    if-ne v14, v7, :cond_e

    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_e
    new-instance v0, Ljava/lang/AssertionError;

    .line 160
    .line 161
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 162
    .line 163
    .line 164
    throw v0

    .line 165
    :cond_f
    :goto_7
    invoke-static {}, La0/c;->k()[B

    .line 166
    .line 167
    .line 168
    move-result-object v14

    .line 169
    if-nez v5, :cond_11

    .line 170
    .line 171
    array-length v15, v14

    .line 172
    if-ne v15, v7, :cond_10

    .line 173
    .line 174
    goto :goto_8

    .line 175
    :cond_10
    new-instance v0, Ljava/lang/AssertionError;

    .line 176
    .line 177
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 178
    .line 179
    .line 180
    throw v0

    .line 181
    :cond_11
    :goto_8
    invoke-virtual/range {p5 .. p5}, Lc0/e;->a()V

    .line 182
    .line 183
    .line 184
    iget-byte v15, v2, Lc0/e;->a:B

    .line 185
    .line 186
    invoke-static {v15}, La0/c;->c(B)[B

    .line 187
    .line 188
    .line 189
    move-result-object v15

    .line 190
    if-nez v5, :cond_13

    .line 191
    .line 192
    array-length v9, v15

    .line 193
    if-ne v9, v3, :cond_12

    .line 194
    .line 195
    goto :goto_9

    .line 196
    :cond_12
    new-instance v0, Ljava/lang/AssertionError;

    .line 197
    .line 198
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :cond_13
    :goto_9
    iget-object v9, v2, Lc0/e;->b:[B

    .line 203
    .line 204
    invoke-virtual {v9}, [B->clone()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    check-cast v9, [B

    .line 209
    .line 210
    if-nez v5, :cond_15

    .line 211
    .line 212
    array-length v7, v9

    .line 213
    iget-byte v2, v2, Lc0/e;->a:B

    .line 214
    .line 215
    and-int/lit16 v2, v2, 0xff

    .line 216
    .line 217
    if-ne v7, v2, :cond_14

    .line 218
    .line 219
    goto :goto_a

    .line 220
    :cond_14
    new-instance v0, Ljava/lang/AssertionError;

    .line 221
    .line 222
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 223
    .line 224
    .line 225
    throw v0

    .line 226
    :cond_15
    :goto_a
    invoke-static {}, La0/c;->l()[B

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    const/4 v7, 0x4

    .line 231
    if-nez v5, :cond_17

    .line 232
    .line 233
    array-length v5, v2

    .line 234
    if-ne v5, v7, :cond_16

    .line 235
    .line 236
    goto :goto_b

    .line 237
    :cond_16
    new-instance v0, Ljava/lang/AssertionError;

    .line 238
    .line 239
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 240
    .line 241
    .line 242
    throw v0

    .line 243
    :cond_17
    :goto_b
    new-instance v5, Lc0/a;

    .line 244
    .line 245
    const/16 v7, 0xc

    .line 246
    .line 247
    new-array v7, v7, [[B

    .line 248
    .line 249
    aput-object v4, v7, v6

    .line 250
    .line 251
    aput-object v0, v7, v3

    .line 252
    .line 253
    const/4 v0, 0x2

    .line 254
    aput-object v8, v7, v0

    .line 255
    .line 256
    const/4 v0, 0x3

    .line 257
    aput-object v10, v7, v0

    .line 258
    .line 259
    const/4 v0, 0x4

    .line 260
    aput-object v11, v7, v0

    .line 261
    .line 262
    const/4 v0, 0x5

    .line 263
    aput-object v12, v7, v0

    .line 264
    .line 265
    const/4 v0, 0x6

    .line 266
    aput-object v13, v7, v0

    .line 267
    .line 268
    const/4 v0, 0x7

    .line 269
    aput-object v1, v7, v0

    .line 270
    .line 271
    const/16 v0, 0x8

    .line 272
    .line 273
    aput-object v14, v7, v0

    .line 274
    .line 275
    const/16 v0, 0x9

    .line 276
    .line 277
    aput-object v15, v7, v0

    .line 278
    .line 279
    const/16 v0, 0xa

    .line 280
    .line 281
    aput-object v9, v7, v0

    .line 282
    .line 283
    const/16 v0, 0xb

    .line 284
    .line 285
    aput-object v2, v7, v0

    .line 286
    .line 287
    invoke-static {v7}, La0/c;->i([[B)[B

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-direct {v5, v0}, Lc0/a;-><init>([B)V

    .line 292
    .line 293
    .line 294
    return-object v5
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
.end method

.method public static d()Lc0/a;
    .locals 6

    .line 1
    const-string v0, "EX"

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    :try_start_0
    new-instance v3, Lc0/c;

    .line 6
    .line 7
    const-string v4, ""

    .line 8
    .line 9
    invoke-direct {v3, v4}, Lc0/c;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    new-instance v5, Lc0/f;

    .line 14
    .line 15
    invoke-direct {v5}, Lc0/f;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static/range {v0 .. v5}, Lc0/a;->c(Ljava/lang/String;JLc0/b;SLc0/e;)Lc0/a;

    .line 19
    .line 20
    .line 21
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    return-object v0

    .line 23
    :catch_0
    const/4 v0, 0x0

    .line 24
    return-object v0
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
.end method
