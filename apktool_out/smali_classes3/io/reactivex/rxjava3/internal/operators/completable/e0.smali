.class public final Lio/reactivex/rxjava3/internal/operators/completable/e0;
.super Lio/reactivex/rxjava3/core/c;
.source "SourceFile"


# instance fields
.field final a:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "+",
            "Lio/reactivex/rxjava3/core/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/reactivex/rxjava3/core/i;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/e0;->a:Ljava/lang/Iterable;

    .line 5
    .line 6
    return-void
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
.end method


# virtual methods
.method public Y0(Lio/reactivex/rxjava3/core/f;)V
    .locals 6

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/disposables/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/reactivex/rxjava3/disposables/c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/f;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/completable/e0;->a:Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "The source iterator returned is null"

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    check-cast v1, Ljava/util/Iterator;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 21
    .line 22
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 26
    .line 27
    .line 28
    new-instance v3, Lio/reactivex/rxjava3/internal/util/c;

    .line 29
    .line 30
    invoke-direct {v3}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v4, Lio/reactivex/rxjava3/internal/operators/completable/d0$b;

    .line 34
    .line 35
    invoke-direct {v4, v3}, Lio/reactivex/rxjava3/internal/operators/completable/d0$b;-><init>(Lio/reactivex/rxjava3/internal/util/c;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v4}, Lio/reactivex/rxjava3/disposables/c;->b(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->isDisposed()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    :try_start_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 52
    if-nez v4, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->isDisposed()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    :try_start_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    const-string v5, "The iterator returned a null CompletableSource"

    .line 67
    .line 68
    invoke-static {v4, v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    check-cast v4, Lio/reactivex/rxjava3/core/i;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 72
    .line 73
    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->isDisposed()Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_3

    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 81
    .line 82
    .line 83
    new-instance v5, Lio/reactivex/rxjava3/internal/operators/completable/d0$a;

    .line 84
    .line 85
    invoke-direct {v5, p1, v0, v3, v2}, Lio/reactivex/rxjava3/internal/operators/completable/d0$a;-><init>(Lio/reactivex/rxjava3/core/f;Lio/reactivex/rxjava3/disposables/c;Lio/reactivex/rxjava3/internal/util/c;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v4, v5}, Lio/reactivex/rxjava3/core/i;->a(Lio/reactivex/rxjava3/core/f;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :catchall_1
    move-exception v0

    .line 101
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 105
    .line 106
    .line 107
    :goto_1
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_4

    .line 112
    .line 113
    invoke-virtual {v3, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/f;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    return-void

    .line 117
    :catchall_2
    move-exception v0

    .line 118
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/f;->onError(Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    return-void
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
