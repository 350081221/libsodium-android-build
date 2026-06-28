.class public final Lkotlinx/coroutines/channels/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000&\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a4\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u001a1\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a1\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\r\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000f"
    }
    d2 = {
        "",
        "delayMillis",
        "initialDelayMillis",
        "Lkotlin/coroutines/g;",
        "context",
        "Lkotlinx/coroutines/channels/j0;",
        "mode",
        "Lkotlinx/coroutines/channels/g0;",
        "Lkotlin/r2;",
        "e",
        "Lkotlinx/coroutines/channels/h0;",
        "channel",
        "d",
        "(JJLkotlinx/coroutines/channels/h0;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "c",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nTickerChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TickerChannels.kt\nkotlinx/coroutines/channels/TickerChannelsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(JJLkotlinx/coroutines/channels/h0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, Lkotlinx/coroutines/channels/i0;->c(JJLkotlinx/coroutines/channels/h0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(JJLkotlinx/coroutines/channels/h0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, Lkotlinx/coroutines/channels/i0;->d(JJLkotlinx/coroutines/channels/h0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final c(JJLkotlinx/coroutines/channels/h0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lkotlinx/coroutines/channels/h0<",
            "-",
            "Lkotlin/r2;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p5, Lkotlinx/coroutines/channels/i0$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lkotlinx/coroutines/channels/i0$a;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/channels/i0$a;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lkotlinx/coroutines/channels/i0$a;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/channels/i0$a;

    .line 21
    .line 22
    invoke-direct {v0, p5}, Lkotlinx/coroutines/channels/i0$a;-><init>(Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Lkotlinx/coroutines/channels/i0$a;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lkotlinx/coroutines/channels/i0$a;->label:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_5

    .line 37
    .line 38
    if-eq v2, v5, :cond_4

    .line 39
    .line 40
    if-eq v2, v4, :cond_3

    .line 41
    .line 42
    if-ne v2, v3, :cond_2

    .line 43
    .line 44
    iget-wide p0, v0, Lkotlinx/coroutines/channels/i0$a;->J$0:J

    .line 45
    .line 46
    iget-object p2, v0, Lkotlinx/coroutines/channels/i0$a;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p2, Lkotlinx/coroutines/channels/h0;

    .line 49
    .line 50
    invoke-static {p5}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    move-object p4, p2

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0

    .line 63
    :cond_3
    iget-wide p0, v0, Lkotlinx/coroutines/channels/i0$a;->J$0:J

    .line 64
    .line 65
    iget-object p2, v0, Lkotlinx/coroutines/channels/i0$a;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p2, Lkotlinx/coroutines/channels/h0;

    .line 68
    .line 69
    invoke-static {p5}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    iget-wide p0, v0, Lkotlinx/coroutines/channels/i0$a;->J$0:J

    .line 74
    .line 75
    iget-object p2, v0, Lkotlinx/coroutines/channels/i0$a;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    move-object p4, p2

    .line 78
    check-cast p4, Lkotlinx/coroutines/channels/h0;

    .line 79
    .line 80
    invoke-static {p5}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_5
    invoke-static {p5}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iput-object p4, v0, Lkotlinx/coroutines/channels/i0$a;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    iput-wide p0, v0, Lkotlinx/coroutines/channels/i0$a;->J$0:J

    .line 90
    .line 91
    iput v5, v0, Lkotlinx/coroutines/channels/i0$a;->label:I

    .line 92
    .line 93
    invoke-static {p2, p3, v0}, Lkotlinx/coroutines/d1;->b(JLkotlin/coroutines/d;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    if-ne p2, v1, :cond_6

    .line 98
    .line 99
    return-object v1

    .line 100
    :cond_6
    :goto_1
    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    .line 101
    .line 102
    iput-object p4, v0, Lkotlinx/coroutines/channels/i0$a;->L$0:Ljava/lang/Object;

    .line 103
    .line 104
    iput-wide p0, v0, Lkotlinx/coroutines/channels/i0$a;->J$0:J

    .line 105
    .line 106
    iput v4, v0, Lkotlinx/coroutines/channels/i0$a;->label:I

    .line 107
    .line 108
    invoke-interface {p4, p2, v0}, Lkotlinx/coroutines/channels/h0;->F(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    if-ne p2, v1, :cond_7

    .line 113
    .line 114
    return-object v1

    .line 115
    :cond_7
    move-object p2, p4

    .line 116
    :goto_2
    iput-object p2, v0, Lkotlinx/coroutines/channels/i0$a;->L$0:Ljava/lang/Object;

    .line 117
    .line 118
    iput-wide p0, v0, Lkotlinx/coroutines/channels/i0$a;->J$0:J

    .line 119
    .line 120
    iput v3, v0, Lkotlinx/coroutines/channels/i0$a;->label:I

    .line 121
    .line 122
    invoke-static {p0, p1, v0}, Lkotlinx/coroutines/d1;->b(JLkotlin/coroutines/d;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    if-ne p3, v1, :cond_1

    .line 127
    .line 128
    return-object v1
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

.method private static final d(JJLkotlinx/coroutines/channels/h0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lkotlinx/coroutines/channels/h0<",
            "-",
            "Lkotlin/r2;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    instance-of v1, v0, Lkotlinx/coroutines/channels/i0$b;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lkotlinx/coroutines/channels/i0$b;

    .line 9
    .line 10
    iget v2, v1, Lkotlinx/coroutines/channels/i0$b;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lkotlinx/coroutines/channels/i0$b;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lkotlinx/coroutines/channels/i0$b;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lkotlinx/coroutines/channels/i0$b;-><init>(Lkotlin/coroutines/d;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Lkotlinx/coroutines/channels/i0$b;->result:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v3, v1, Lkotlinx/coroutines/channels/i0$b;->label:I

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    const/4 v5, 0x3

    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    if-eqz v3, :cond_7

    .line 40
    .line 41
    if-eq v3, v7, :cond_6

    .line 42
    .line 43
    if-eq v3, v6, :cond_5

    .line 44
    .line 45
    if-eq v3, v5, :cond_3

    .line 46
    .line 47
    if-ne v3, v4, :cond_2

    .line 48
    .line 49
    iget-wide v7, v1, Lkotlinx/coroutines/channels/i0$b;->J$1:J

    .line 50
    .line 51
    iget-wide v9, v1, Lkotlinx/coroutines/channels/i0$b;->J$0:J

    .line 52
    .line 53
    iget-object v3, v1, Lkotlinx/coroutines/channels/i0$b;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, Lkotlinx/coroutines/channels/h0;

    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move v11, v4

    .line 61
    move v0, v5

    .line 62
    :cond_1
    move-wide/from16 v16, v7

    .line 63
    .line 64
    move-wide v7, v9

    .line 65
    move-wide/from16 v9, v16

    .line 66
    .line 67
    goto/16 :goto_7

    .line 68
    .line 69
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_3
    iget-wide v7, v1, Lkotlinx/coroutines/channels/i0$b;->J$1:J

    .line 78
    .line 79
    iget-wide v9, v1, Lkotlinx/coroutines/channels/i0$b;->J$0:J

    .line 80
    .line 81
    iget-object v3, v1, Lkotlinx/coroutines/channels/i0$b;->L$0:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v3, Lkotlinx/coroutines/channels/h0;

    .line 84
    .line 85
    invoke-static {v0}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move v0, v5

    .line 89
    :cond_4
    move-wide/from16 v16, v7

    .line 90
    .line 91
    move-wide v7, v9

    .line 92
    move-wide/from16 v9, v16

    .line 93
    .line 94
    goto/16 :goto_6

    .line 95
    .line 96
    :cond_5
    iget-wide v7, v1, Lkotlinx/coroutines/channels/i0$b;->J$1:J

    .line 97
    .line 98
    iget-wide v9, v1, Lkotlinx/coroutines/channels/i0$b;->J$0:J

    .line 99
    .line 100
    iget-object v3, v1, Lkotlinx/coroutines/channels/i0$b;->L$0:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v3, Lkotlinx/coroutines/channels/h0;

    .line 103
    .line 104
    invoke-static {v0}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_6
    iget-wide v7, v1, Lkotlinx/coroutines/channels/i0$b;->J$1:J

    .line 109
    .line 110
    iget-wide v9, v1, Lkotlinx/coroutines/channels/i0$b;->J$0:J

    .line 111
    .line 112
    iget-object v3, v1, Lkotlinx/coroutines/channels/i0$b;->L$0:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v3, Lkotlinx/coroutines/channels/h0;

    .line 115
    .line 116
    invoke-static {v0}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    move-object v0, v3

    .line 120
    move-wide v10, v9

    .line 121
    goto :goto_2

    .line 122
    :cond_7
    invoke-static {v0}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lkotlinx/coroutines/c;->b()Lkotlinx/coroutines/b;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-eqz v0, :cond_8

    .line 130
    .line 131
    invoke-virtual {v0}, Lkotlinx/coroutines/b;->b()J

    .line 132
    .line 133
    .line 134
    move-result-wide v8

    .line 135
    goto :goto_1

    .line 136
    :cond_8
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 137
    .line 138
    .line 139
    move-result-wide v8

    .line 140
    :goto_1
    invoke-static/range {p2 .. p3}, Lkotlinx/coroutines/v1;->d(J)J

    .line 141
    .line 142
    .line 143
    move-result-wide v10

    .line 144
    add-long/2addr v8, v10

    .line 145
    move-object/from16 v0, p4

    .line 146
    .line 147
    iput-object v0, v1, Lkotlinx/coroutines/channels/i0$b;->L$0:Ljava/lang/Object;

    .line 148
    .line 149
    move-wide/from16 v10, p0

    .line 150
    .line 151
    iput-wide v10, v1, Lkotlinx/coroutines/channels/i0$b;->J$0:J

    .line 152
    .line 153
    iput-wide v8, v1, Lkotlinx/coroutines/channels/i0$b;->J$1:J

    .line 154
    .line 155
    iput v7, v1, Lkotlinx/coroutines/channels/i0$b;->label:I

    .line 156
    .line 157
    move-wide/from16 v12, p2

    .line 158
    .line 159
    invoke-static {v12, v13, v1}, Lkotlinx/coroutines/d1;->b(JLkotlin/coroutines/d;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    if-ne v3, v2, :cond_9

    .line 164
    .line 165
    return-object v2

    .line 166
    :cond_9
    move-wide v7, v8

    .line 167
    :goto_2
    invoke-static {v10, v11}, Lkotlinx/coroutines/v1;->d(J)J

    .line 168
    .line 169
    .line 170
    move-result-wide v9

    .line 171
    :goto_3
    add-long/2addr v7, v9

    .line 172
    sget-object v3, Lkotlin/r2;->a:Lkotlin/r2;

    .line 173
    .line 174
    iput-object v0, v1, Lkotlinx/coroutines/channels/i0$b;->L$0:Ljava/lang/Object;

    .line 175
    .line 176
    iput-wide v7, v1, Lkotlinx/coroutines/channels/i0$b;->J$0:J

    .line 177
    .line 178
    iput-wide v9, v1, Lkotlinx/coroutines/channels/i0$b;->J$1:J

    .line 179
    .line 180
    iput v6, v1, Lkotlinx/coroutines/channels/i0$b;->label:I

    .line 181
    .line 182
    invoke-interface {v0, v3, v1}, Lkotlinx/coroutines/channels/h0;->F(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    if-ne v3, v2, :cond_a

    .line 187
    .line 188
    return-object v2

    .line 189
    :cond_a
    move-object v3, v0

    .line 190
    move-wide/from16 v16, v7

    .line 191
    .line 192
    move-wide v7, v9

    .line 193
    move-wide/from16 v9, v16

    .line 194
    .line 195
    :goto_4
    invoke-static {}, Lkotlinx/coroutines/c;->b()Lkotlinx/coroutines/b;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    if-eqz v0, :cond_b

    .line 200
    .line 201
    invoke-virtual {v0}, Lkotlinx/coroutines/b;->b()J

    .line 202
    .line 203
    .line 204
    move-result-wide v11

    .line 205
    goto :goto_5

    .line 206
    :cond_b
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 207
    .line 208
    .line 209
    move-result-wide v11

    .line 210
    :goto_5
    sub-long v13, v9, v11

    .line 211
    .line 212
    const-wide/16 v4, 0x0

    .line 213
    .line 214
    invoke-static {v13, v14, v4, v5}, Lkotlin/ranges/s;->v(JJ)J

    .line 215
    .line 216
    .line 217
    move-result-wide v13

    .line 218
    cmp-long v15, v13, v4

    .line 219
    .line 220
    if-nez v15, :cond_c

    .line 221
    .line 222
    cmp-long v4, v7, v4

    .line 223
    .line 224
    if-eqz v4, :cond_c

    .line 225
    .line 226
    sub-long v4, v11, v9

    .line 227
    .line 228
    rem-long/2addr v4, v7

    .line 229
    sub-long v4, v7, v4

    .line 230
    .line 231
    add-long v9, v11, v4

    .line 232
    .line 233
    invoke-static {v4, v5}, Lkotlinx/coroutines/v1;->c(J)J

    .line 234
    .line 235
    .line 236
    move-result-wide v4

    .line 237
    iput-object v3, v1, Lkotlinx/coroutines/channels/i0$b;->L$0:Ljava/lang/Object;

    .line 238
    .line 239
    iput-wide v9, v1, Lkotlinx/coroutines/channels/i0$b;->J$0:J

    .line 240
    .line 241
    iput-wide v7, v1, Lkotlinx/coroutines/channels/i0$b;->J$1:J

    .line 242
    .line 243
    const/4 v0, 0x3

    .line 244
    iput v0, v1, Lkotlinx/coroutines/channels/i0$b;->label:I

    .line 245
    .line 246
    invoke-static {v4, v5, v1}, Lkotlinx/coroutines/d1;->b(JLkotlin/coroutines/d;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    if-ne v4, v2, :cond_4

    .line 251
    .line 252
    return-object v2

    .line 253
    :goto_6
    move v5, v0

    .line 254
    move-object v0, v3

    .line 255
    const/4 v4, 0x4

    .line 256
    goto :goto_3

    .line 257
    :cond_c
    const/4 v0, 0x3

    .line 258
    invoke-static {v13, v14}, Lkotlinx/coroutines/v1;->c(J)J

    .line 259
    .line 260
    .line 261
    move-result-wide v4

    .line 262
    iput-object v3, v1, Lkotlinx/coroutines/channels/i0$b;->L$0:Ljava/lang/Object;

    .line 263
    .line 264
    iput-wide v9, v1, Lkotlinx/coroutines/channels/i0$b;->J$0:J

    .line 265
    .line 266
    iput-wide v7, v1, Lkotlinx/coroutines/channels/i0$b;->J$1:J

    .line 267
    .line 268
    const/4 v11, 0x4

    .line 269
    iput v11, v1, Lkotlinx/coroutines/channels/i0$b;->label:I

    .line 270
    .line 271
    invoke-static {v4, v5, v1}, Lkotlinx/coroutines/d1;->b(JLkotlin/coroutines/d;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    if-ne v4, v2, :cond_1

    .line 276
    .line 277
    return-object v2

    .line 278
    :goto_7
    move v5, v0

    .line 279
    move-object v0, v3

    .line 280
    move v4, v11

    .line 281
    goto :goto_3
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

.method public static final e(JJLkotlin/coroutines/g;Lkotlinx/coroutines/channels/j0;)Lkotlinx/coroutines/channels/g0;
    .locals 11
    .param p4    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Lkotlinx/coroutines/channels/j0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lkotlin/coroutines/g;",
            "Lkotlinx/coroutines/channels/j0;",
            ")",
            "Lkotlinx/coroutines/channels/g0<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlinx/coroutines/c3;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    move-wide v2, p0

    .line 2
    move-wide v4, p2

    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v6, v2, v0

    .line 6
    .line 7
    const/4 v7, 0x1

    .line 8
    const/4 v8, 0x0

    .line 9
    if-ltz v6, :cond_0

    .line 10
    .line 11
    move v6, v7

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v6, v8

    .line 14
    :goto_0
    const-string v9, " ms"

    .line 15
    .line 16
    if-eqz v6, :cond_3

    .line 17
    .line 18
    cmp-long v0, v4, v0

    .line 19
    .line 20
    if-ltz v0, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v7, v8

    .line 24
    :goto_1
    if-eqz v7, :cond_2

    .line 25
    .line 26
    sget-object v7, Lkotlinx/coroutines/c2;->a:Lkotlinx/coroutines/c2;

    .line 27
    .line 28
    invoke-static {}, Lkotlinx/coroutines/k1;->g()Lkotlinx/coroutines/n0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    move-object v1, p4

    .line 33
    invoke-virtual {v0, p4}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/g;)Lkotlin/coroutines/g;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    new-instance v10, Lkotlinx/coroutines/channels/i0$c;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    move-object v0, v10

    .line 41
    move-object/from16 v1, p5

    .line 42
    .line 43
    move-wide v2, p0

    .line 44
    move-wide v4, p2

    .line 45
    invoke-direct/range {v0 .. v6}, Lkotlinx/coroutines/channels/i0$c;-><init>(Lkotlinx/coroutines/channels/j0;JJLkotlin/coroutines/d;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v7, v9, v8, v10}, Lkotlinx/coroutines/channels/c0;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;ILv3/p;)Lkotlinx/coroutines/channels/g0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v1, "Expected non-negative initial delay, but has "

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string v1, "Expected non-negative delay, but has "

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v1
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

.method public static synthetic f(JJLkotlin/coroutines/g;Lkotlinx/coroutines/channels/j0;ILjava/lang/Object;)Lkotlinx/coroutines/channels/g0;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x2

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    move-wide p2, p0

    .line 6
    :cond_0
    and-int/lit8 p7, p6, 0x4

    .line 7
    .line 8
    if-eqz p7, :cond_1

    .line 9
    .line 10
    sget-object p4, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 11
    .line 12
    :cond_1
    and-int/lit8 p6, p6, 0x8

    .line 13
    .line 14
    if-eqz p6, :cond_2

    .line 15
    .line 16
    sget-object p5, Lkotlinx/coroutines/channels/j0;->FIXED_PERIOD:Lkotlinx/coroutines/channels/j0;

    .line 17
    .line 18
    :cond_2
    invoke-static/range {p0 .. p5}, Lkotlinx/coroutines/channels/i0;->e(JJLkotlin/coroutines/g;Lkotlinx/coroutines/channels/j0;)Lkotlinx/coroutines/channels/g0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
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
.end method
