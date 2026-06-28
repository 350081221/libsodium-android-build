.class final Lio/reactivex/rxjava3/internal/operators/parallel/i$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/parallel/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x3e0ae1f3a0d08e59L


# instance fields
.field volatile cancelled:Z

.field volatile done:Z

.field final emissions:[J

.field error:Ljava/lang/Throwable;

.field index:I

.field final limit:I

.field final prefetch:I

.field produced:I

.field queue:Lio/reactivex/rxjava3/internal/fuseable/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/fuseable/q<",
            "TT;>;"
        }
    .end annotation
.end field

.field final requests:Ljava/util/concurrent/atomic/AtomicLongArray;

.field sourceMode:I

.field final subscriberCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field final subscribers:[Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lorg/reactivestreams/p<",
            "-TT;>;"
        }
    .end annotation
.end field

.field upstream:Lorg/reactivestreams/q;


# direct methods
.method constructor <init>([Lorg/reactivestreams/p;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/reactivestreams/p<",
            "-TT;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->subscriberCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->subscribers:[Lorg/reactivestreams/p;

    .line 12
    .line 13
    iput p2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->prefetch:I

    .line 14
    .line 15
    shr-int/lit8 v0, p2, 0x2

    .line 16
    .line 17
    sub-int/2addr p2, v0

    .line 18
    iput p2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->limit:I

    .line 19
    .line 20
    array-length p1, p1

    .line 21
    new-instance p2, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 22
    .line 23
    add-int v0, p1, p1

    .line 24
    .line 25
    add-int/lit8 v1, v0, 0x1

    .line 26
    .line 27
    invoke-direct {p2, v1}, Ljava/util/concurrent/atomic/AtomicLongArray;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->requests:Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 31
    .line 32
    int-to-long v1, p1

    .line 33
    invoke-virtual {p2, v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongArray;->lazySet(IJ)V

    .line 34
    .line 35
    .line 36
    new-array p1, p1, [J

    .line 37
    .line 38
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->emissions:[J

    .line 39
    .line 40
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
.end method


# virtual methods
.method cancel(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->requests:Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicLongArray;->decrementAndGet(I)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long p1, v0, v2

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->cancelled:Z

    .line 15
    .line 16
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->upstream:Lorg/reactivestreams/q;

    .line 17
    .line 18
    invoke-interface {p1}, Lorg/reactivestreams/q;->cancel()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 28
    .line 29
    invoke-interface {p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 30
    .line 31
    .line 32
    :cond_0
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
.end method

.method drain()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->sourceMode:I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->drainSync()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->drainAsync()V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method drainAsync()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 4
    .line 5
    iget-object v2, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->subscribers:[Lorg/reactivestreams/p;

    .line 6
    .line 7
    iget-object v3, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->requests:Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 8
    .line 9
    iget-object v4, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->emissions:[J

    .line 10
    .line 11
    array-length v5, v4

    .line 12
    iget v6, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->index:I

    .line 13
    .line 14
    iget v7, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->produced:I

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    move v9, v8

    .line 18
    :cond_0
    :goto_0
    const/4 v10, 0x0

    .line 19
    move v11, v10

    .line 20
    :cond_1
    iget-boolean v12, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->cancelled:Z

    .line 21
    .line 22
    if-eqz v12, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_2
    iget-boolean v12, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->done:Z

    .line 29
    .line 30
    if-eqz v12, :cond_4

    .line 31
    .line 32
    iget-object v13, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->error:Ljava/lang/Throwable;

    .line 33
    .line 34
    if-eqz v13, :cond_4

    .line 35
    .line 36
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 37
    .line 38
    .line 39
    array-length v0, v2

    .line 40
    :goto_1
    if-ge v10, v0, :cond_3

    .line 41
    .line 42
    aget-object v3, v2, v10

    .line 43
    .line 44
    invoke-interface {v3, v13}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v10, v10, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    return-void

    .line 51
    :cond_4
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v13

    .line 55
    if-eqz v12, :cond_6

    .line 56
    .line 57
    if-eqz v13, :cond_6

    .line 58
    .line 59
    array-length v0, v2

    .line 60
    :goto_2
    if-ge v10, v0, :cond_5

    .line 61
    .line 62
    aget-object v3, v2, v10

    .line 63
    .line 64
    invoke-interface {v3}, Lorg/reactivestreams/p;->onComplete()V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v10, v10, 0x1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    return-void

    .line 71
    :cond_6
    if-eqz v13, :cond_7

    .line 72
    .line 73
    goto :goto_5

    .line 74
    :cond_7
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicLongArray;->get(I)J

    .line 75
    .line 76
    .line 77
    move-result-wide v12

    .line 78
    aget-wide v14, v4, v6

    .line 79
    .line 80
    cmp-long v12, v12, v14

    .line 81
    .line 82
    if-eqz v12, :cond_b

    .line 83
    .line 84
    add-int v12, v5, v6

    .line 85
    .line 86
    invoke-virtual {v3, v12}, Ljava/util/concurrent/atomic/AtomicLongArray;->get(I)J

    .line 87
    .line 88
    .line 89
    move-result-wide v12

    .line 90
    const-wide/16 v16, 0x0

    .line 91
    .line 92
    cmp-long v12, v12, v16

    .line 93
    .line 94
    if-nez v12, :cond_b

    .line 95
    .line 96
    :try_start_0
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    if-nez v11, :cond_8

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_8
    aget-object v12, v2, v6

    .line 104
    .line 105
    invoke-interface {v12, v11}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    const-wide/16 v11, 0x1

    .line 109
    .line 110
    add-long/2addr v14, v11

    .line 111
    aput-wide v14, v4, v6

    .line 112
    .line 113
    add-int/lit8 v7, v7, 0x1

    .line 114
    .line 115
    iget v11, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->limit:I

    .line 116
    .line 117
    if-ne v7, v11, :cond_9

    .line 118
    .line 119
    iget-object v11, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->upstream:Lorg/reactivestreams/q;

    .line 120
    .line 121
    int-to-long v12, v7

    .line 122
    invoke-interface {v11, v12, v13}, Lorg/reactivestreams/q;->request(J)V

    .line 123
    .line 124
    .line 125
    move v7, v10

    .line 126
    :cond_9
    move v11, v10

    .line 127
    goto :goto_4

    .line 128
    :catchall_0
    move-exception v0

    .line 129
    move-object v3, v0

    .line 130
    invoke-static {v3}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->upstream:Lorg/reactivestreams/q;

    .line 134
    .line 135
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 136
    .line 137
    .line 138
    array-length v0, v2

    .line 139
    :goto_3
    if-ge v10, v0, :cond_a

    .line 140
    .line 141
    aget-object v4, v2, v10

    .line 142
    .line 143
    invoke-interface {v4, v3}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    add-int/lit8 v10, v10, 0x1

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_a
    return-void

    .line 150
    :cond_b
    add-int/2addr v11, v8

    .line 151
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 152
    .line 153
    if-ne v6, v5, :cond_c

    .line 154
    .line 155
    move v6, v10

    .line 156
    :cond_c
    if-ne v11, v5, :cond_1

    .line 157
    .line 158
    :goto_5
    invoke-virtual/range {p0 .. p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-ne v10, v9, :cond_d

    .line 163
    .line 164
    iput v6, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->index:I

    .line 165
    .line 166
    iput v7, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->produced:I

    .line 167
    .line 168
    neg-int v9, v9

    .line 169
    invoke-virtual {v1, v9}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    if-nez v9, :cond_0

    .line 174
    .line 175
    return-void

    .line 176
    :cond_d
    move v9, v10

    .line 177
    goto/16 :goto_0
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

.method drainSync()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 4
    .line 5
    iget-object v2, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->subscribers:[Lorg/reactivestreams/p;

    .line 6
    .line 7
    iget-object v3, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->requests:Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 8
    .line 9
    iget-object v4, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->emissions:[J

    .line 10
    .line 11
    array-length v5, v4

    .line 12
    iget v6, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->index:I

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    move v8, v7

    .line 16
    :cond_0
    :goto_0
    const/4 v9, 0x0

    .line 17
    move v10, v9

    .line 18
    :cond_1
    iget-boolean v11, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->cancelled:Z

    .line 19
    .line 20
    if-eqz v11, :cond_2

    .line 21
    .line 22
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v11

    .line 30
    if-eqz v11, :cond_4

    .line 31
    .line 32
    array-length v0, v2

    .line 33
    :goto_1
    if-ge v9, v0, :cond_3

    .line 34
    .line 35
    aget-object v3, v2, v9

    .line 36
    .line 37
    invoke-interface {v3}, Lorg/reactivestreams/p;->onComplete()V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v9, v9, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    return-void

    .line 44
    :cond_4
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicLongArray;->get(I)J

    .line 45
    .line 46
    .line 47
    move-result-wide v11

    .line 48
    aget-wide v13, v4, v6

    .line 49
    .line 50
    cmp-long v11, v11, v13

    .line 51
    .line 52
    if-eqz v11, :cond_8

    .line 53
    .line 54
    add-int v11, v5, v6

    .line 55
    .line 56
    invoke-virtual {v3, v11}, Ljava/util/concurrent/atomic/AtomicLongArray;->get(I)J

    .line 57
    .line 58
    .line 59
    move-result-wide v11

    .line 60
    const-wide/16 v15, 0x0

    .line 61
    .line 62
    cmp-long v11, v11, v15

    .line 63
    .line 64
    if-nez v11, :cond_8

    .line 65
    .line 66
    :try_start_0
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    if-nez v10, :cond_6

    .line 71
    .line 72
    array-length v0, v2

    .line 73
    :goto_2
    if-ge v9, v0, :cond_5

    .line 74
    .line 75
    aget-object v3, v2, v9

    .line 76
    .line 77
    invoke-interface {v3}, Lorg/reactivestreams/p;->onComplete()V

    .line 78
    .line 79
    .line 80
    add-int/lit8 v9, v9, 0x1

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    return-void

    .line 84
    :cond_6
    aget-object v11, v2, v6

    .line 85
    .line 86
    invoke-interface {v11, v10}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    const-wide/16 v10, 0x1

    .line 90
    .line 91
    add-long/2addr v13, v10

    .line 92
    aput-wide v13, v4, v6

    .line 93
    .line 94
    move v10, v9

    .line 95
    goto :goto_4

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    move-object v3, v0

    .line 98
    invoke-static {v3}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->upstream:Lorg/reactivestreams/q;

    .line 102
    .line 103
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 104
    .line 105
    .line 106
    array-length v0, v2

    .line 107
    :goto_3
    if-ge v9, v0, :cond_7

    .line 108
    .line 109
    aget-object v4, v2, v9

    .line 110
    .line 111
    invoke-interface {v4, v3}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v9, v9, 0x1

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_7
    return-void

    .line 118
    :cond_8
    add-int/2addr v10, v7

    .line 119
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 120
    .line 121
    if-ne v6, v5, :cond_9

    .line 122
    .line 123
    move v6, v9

    .line 124
    :cond_9
    if-ne v10, v5, :cond_1

    .line 125
    .line 126
    invoke-virtual/range {p0 .. p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-ne v9, v8, :cond_a

    .line 131
    .line 132
    iput v6, v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->index:I

    .line 133
    .line 134
    neg-int v8, v8

    .line 135
    invoke-virtual {v1, v8}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    if-nez v8, :cond_0

    .line 140
    .line 141
    return-void

    .line 142
    :cond_a
    move v8, v9

    .line 143
    goto :goto_0
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

.method public onComplete()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->done:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->drain()V

    .line 5
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

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->error:Ljava/lang/Throwable;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->done:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->drain()V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->sourceMode:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->upstream:Lorg/reactivestreams/q;

    .line 14
    .line 15
    invoke-interface {p1}, Lorg/reactivestreams/q;->cancel()V

    .line 16
    .line 17
    .line 18
    new-instance p1, Lio/reactivex/rxjava3/exceptions/c;

    .line 19
    .line 20
    const-string v0, "Queue is full?"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Lio/reactivex/rxjava3/exceptions/c;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->onError(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->drain()V

    .line 30
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
.end method

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->upstream:Lorg/reactivestreams/q;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/j;->validate(Lorg/reactivestreams/q;Lorg/reactivestreams/q;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->upstream:Lorg/reactivestreams/q;

    .line 10
    .line 11
    instance-of v0, p1, Lio/reactivex/rxjava3/internal/fuseable/n;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    move-object v0, p1

    .line 16
    check-cast v0, Lio/reactivex/rxjava3/internal/fuseable/n;

    .line 17
    .line 18
    const/4 v1, 0x7

    .line 19
    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/internal/fuseable/m;->requestFusion(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x1

    .line 24
    if-ne v1, v2, :cond_0

    .line 25
    .line 26
    iput v1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->sourceMode:I

    .line 27
    .line 28
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 29
    .line 30
    iput-boolean v2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->done:Z

    .line 31
    .line 32
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->setupSubscribers()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->drain()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    const/4 v2, 0x2

    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    iput v1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->sourceMode:I

    .line 43
    .line 44
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 45
    .line 46
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->setupSubscribers()V

    .line 47
    .line 48
    .line 49
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->prefetch:I

    .line 50
    .line 51
    int-to-long v0, v0

    .line 52
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    new-instance v0, Lio/reactivex/rxjava3/internal/queue/b;

    .line 57
    .line 58
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->prefetch:I

    .line 59
    .line 60
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/queue/b;-><init>(I)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 64
    .line 65
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->setupSubscribers()V

    .line 66
    .line 67
    .line 68
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->prefetch:I

    .line 69
    .line 70
    int-to-long v0, v0

    .line 71
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 72
    .line 73
    .line 74
    :cond_2
    return-void
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

.method setupSubscribers()V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->subscribers:[Lorg/reactivestreams/p;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->subscriberCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    add-int/lit8 v4, v2, 0x1

    .line 10
    .line 11
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->lazySet(I)V

    .line 12
    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    new-instance v5, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;

    .line 17
    .line 18
    invoke-direct {v5, p0, v2, v1}, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;-><init>(Lio/reactivex/rxjava3/internal/operators/parallel/i$a;II)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v3, v5}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 22
    .line 23
    .line 24
    move v2, v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
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
.end method
