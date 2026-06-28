.class final Lio/reactivex/rxjava3/internal/operators/flowable/u$a;
.super Lio/reactivex/rxjava3/internal/subscriptions/i;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/subscriptions/i;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x71382f6d553150acL


# instance fields
.field final delayError:Z

.field final downstream:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TT;>;"
        }
    .end annotation
.end field

.field errors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field index:I

.field produced:J

.field final sources:[Lorg/reactivestreams/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lorg/reactivestreams/o<",
            "+TT;>;"
        }
    .end annotation
.end field

.field final wip:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method constructor <init>([Lorg/reactivestreams/o;ZLorg/reactivestreams/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/reactivestreams/o<",
            "+TT;>;Z",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lio/reactivex/rxjava3/internal/subscriptions/i;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->downstream:Lorg/reactivestreams/p;

    .line 6
    .line 7
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->sources:[Lorg/reactivestreams/o;

    .line 8
    .line 9
    iput-boolean p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->delayError:Z

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->wip:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    .line 18
    return-void
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


# virtual methods
.method public onComplete()V
    .locals 9

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->wip:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_8

    .line 8
    .line 9
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->sources:[Lorg/reactivestreams/o;

    .line 10
    .line 11
    array-length v1, v0

    .line 12
    iget v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->index:I

    .line 13
    .line 14
    :cond_0
    :goto_0
    const/4 v3, 0x1

    .line 15
    if-ne v2, v1, :cond_3

    .line 16
    .line 17
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->errors:Ljava/util/List;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ne v1, v3, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->downstream:Lorg/reactivestreams/p;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/lang/Throwable;

    .line 35
    .line 36
    invoke-interface {v1, v0}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->downstream:Lorg/reactivestreams/p;

    .line 41
    .line 42
    new-instance v2, Lio/reactivex/rxjava3/exceptions/a;

    .line 43
    .line 44
    invoke-direct {v2, v0}, Lio/reactivex/rxjava3/exceptions/a;-><init>(Ljava/lang/Iterable;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v1, v2}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->downstream:Lorg/reactivestreams/p;

    .line 52
    .line 53
    invoke-interface {v0}, Lorg/reactivestreams/p;->onComplete()V

    .line 54
    .line 55
    .line 56
    :goto_1
    return-void

    .line 57
    :cond_3
    aget-object v4, v0, v2

    .line 58
    .line 59
    if-nez v4, :cond_6

    .line 60
    .line 61
    new-instance v4, Ljava/lang/NullPointerException;

    .line 62
    .line 63
    const-string v5, "A Publisher entry is null"

    .line 64
    .line 65
    invoke-direct {v4, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-boolean v5, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->delayError:Z

    .line 69
    .line 70
    if-eqz v5, :cond_5

    .line 71
    .line 72
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->errors:Ljava/util/List;

    .line 73
    .line 74
    if-nez v5, :cond_4

    .line 75
    .line 76
    new-instance v5, Ljava/util/ArrayList;

    .line 77
    .line 78
    sub-int v6, v1, v2

    .line 79
    .line 80
    add-int/2addr v6, v3

    .line 81
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    iput-object v5, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->errors:Ljava/util/List;

    .line 85
    .line 86
    :cond_4
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    add-int/lit8 v2, v2, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->downstream:Lorg/reactivestreams/p;

    .line 93
    .line 94
    invoke-interface {v0, v4}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_6
    iget-wide v5, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->produced:J

    .line 99
    .line 100
    const-wide/16 v7, 0x0

    .line 101
    .line 102
    cmp-long v3, v5, v7

    .line 103
    .line 104
    if-eqz v3, :cond_7

    .line 105
    .line 106
    iput-wide v7, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->produced:J

    .line 107
    .line 108
    invoke-virtual {p0, v5, v6}, Lio/reactivex/rxjava3/internal/subscriptions/i;->produced(J)V

    .line 109
    .line 110
    .line 111
    :cond_7
    invoke-interface {v4, p0}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v2, v2, 0x1

    .line 115
    .line 116
    iput v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->index:I

    .line 117
    .line 118
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->wip:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-nez v3, :cond_0

    .line 125
    .line 126
    :cond_8
    return-void
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

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->delayError:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->errors:Ljava/util/List;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->sources:[Lorg/reactivestreams/o;

    .line 12
    .line 13
    array-length v1, v1

    .line 14
    iget v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->index:I

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->errors:Ljava/util/List;

    .line 23
    .line 24
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->onComplete()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->downstream:Lorg/reactivestreams/p;

    .line 32
    .line 33
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    return-void
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

.method public onNext(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->produced:J

    .line 2
    .line 3
    const-wide/16 v2, 0x1

    .line 4
    .line 5
    add-long/2addr v0, v2

    .line 6
    iput-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->produced:J

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u$a;->downstream:Lorg/reactivestreams/p;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 0

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/i;->setSubscription(Lorg/reactivestreams/q;)V

    return-void
.end method
