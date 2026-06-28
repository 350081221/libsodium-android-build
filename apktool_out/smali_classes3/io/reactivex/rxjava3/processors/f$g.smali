.class final Lio/reactivex/rxjava3/processors/f$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/processors/f$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/processors/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/rxjava3/processors/f$b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field b:Ljava/lang/Throwable;

.field volatile c:Z

.field volatile d:I


# direct methods
.method constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/reactivex/rxjava3/processors/f$g;->a:Ljava/util/List;

    .line 10
    .line 11
    return-void
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
.method public a(Lio/reactivex/rxjava3/processors/f$c;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/processors/f$c<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

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
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/f$g;->a:Ljava/util/List;

    .line 9
    .line 10
    iget-object v1, p1, Lio/reactivex/rxjava3/processors/f$c;->downstream:Lorg/reactivestreams/p;

    .line 11
    .line 12
    iget-object v2, p1, Lio/reactivex/rxjava3/processors/f$c;->index:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Integer;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v2, 0x0

    .line 24
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iput-object v3, p1, Lio/reactivex/rxjava3/processors/f$c;->index:Ljava/lang/Object;

    .line 29
    .line 30
    :goto_0
    iget-wide v3, p1, Lio/reactivex/rxjava3/processors/f$c;->emitted:J

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    move v6, v5

    .line 34
    :cond_2
    iget-object v7, p1, Lio/reactivex/rxjava3/processors/f$c;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 35
    .line 36
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    :goto_1
    cmp-long v9, v3, v7

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    if-eqz v9, :cond_7

    .line 44
    .line 45
    iget-boolean v11, p1, Lio/reactivex/rxjava3/processors/f$c;->cancelled:Z

    .line 46
    .line 47
    if-eqz v11, :cond_3

    .line 48
    .line 49
    iput-object v10, p1, Lio/reactivex/rxjava3/processors/f$c;->index:Ljava/lang/Object;

    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    iget-boolean v11, p0, Lio/reactivex/rxjava3/processors/f$g;->c:Z

    .line 53
    .line 54
    iget v12, p0, Lio/reactivex/rxjava3/processors/f$g;->d:I

    .line 55
    .line 56
    if-eqz v11, :cond_5

    .line 57
    .line 58
    if-ne v2, v12, :cond_5

    .line 59
    .line 60
    iput-object v10, p1, Lio/reactivex/rxjava3/processors/f$c;->index:Ljava/lang/Object;

    .line 61
    .line 62
    iput-boolean v5, p1, Lio/reactivex/rxjava3/processors/f$c;->cancelled:Z

    .line 63
    .line 64
    iget-object p1, p0, Lio/reactivex/rxjava3/processors/f$g;->b:Ljava/lang/Throwable;

    .line 65
    .line 66
    if-nez p1, :cond_4

    .line 67
    .line 68
    invoke-interface {v1}, Lorg/reactivestreams/p;->onComplete()V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    invoke-interface {v1, p1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    :goto_2
    return-void

    .line 76
    :cond_5
    if-ne v2, v12, :cond_6

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_6
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-interface {v1, v9}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    const-wide/16 v9, 0x1

    .line 89
    .line 90
    add-long/2addr v3, v9

    .line 91
    goto :goto_1

    .line 92
    :cond_7
    :goto_3
    if-nez v9, :cond_a

    .line 93
    .line 94
    iget-boolean v7, p1, Lio/reactivex/rxjava3/processors/f$c;->cancelled:Z

    .line 95
    .line 96
    if-eqz v7, :cond_8

    .line 97
    .line 98
    iput-object v10, p1, Lio/reactivex/rxjava3/processors/f$c;->index:Ljava/lang/Object;

    .line 99
    .line 100
    return-void

    .line 101
    :cond_8
    iget-boolean v7, p0, Lio/reactivex/rxjava3/processors/f$g;->c:Z

    .line 102
    .line 103
    iget v8, p0, Lio/reactivex/rxjava3/processors/f$g;->d:I

    .line 104
    .line 105
    if-eqz v7, :cond_a

    .line 106
    .line 107
    if-ne v2, v8, :cond_a

    .line 108
    .line 109
    iput-object v10, p1, Lio/reactivex/rxjava3/processors/f$c;->index:Ljava/lang/Object;

    .line 110
    .line 111
    iput-boolean v5, p1, Lio/reactivex/rxjava3/processors/f$c;->cancelled:Z

    .line 112
    .line 113
    iget-object p1, p0, Lio/reactivex/rxjava3/processors/f$g;->b:Ljava/lang/Throwable;

    .line 114
    .line 115
    if-nez p1, :cond_9

    .line 116
    .line 117
    invoke-interface {v1}, Lorg/reactivestreams/p;->onComplete()V

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_9
    invoke-interface {v1, p1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    :goto_4
    return-void

    .line 125
    :cond_a
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    iput-object v7, p1, Lio/reactivex/rxjava3/processors/f$c;->index:Ljava/lang/Object;

    .line 130
    .line 131
    iput-wide v3, p1, Lio/reactivex/rxjava3/processors/f$c;->emitted:J

    .line 132
    .line 133
    neg-int v6, v6

    .line 134
    invoke-virtual {p1, v6}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    if-nez v6, :cond_2

    .line 139
    .line 140
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
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method public complete()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/rxjava3/processors/f$g;->c:Z

    return-void
.end method

.method public error(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/reactivex/rxjava3/processors/f$g;->b:Ljava/lang/Throwable;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lio/reactivex/rxjava3/processors/f$g;->c:Z

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

.method public getError()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/processors/f$g;->b:Ljava/lang/Throwable;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Ll3/g;
    .end annotation

    .line 1
    iget v0, p0, Lio/reactivex/rxjava3/processors/f$g;->d:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v1, p0, Lio/reactivex/rxjava3/processors/f$g;->a:Ljava/util/List;

    .line 8
    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getValues([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)[TT;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lio/reactivex/rxjava3/processors/f$g;->d:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    aput-object v1, p1, v2

    .line 11
    .line 12
    :cond_0
    return-object p1

    .line 13
    :cond_1
    iget-object v3, p0, Lio/reactivex/rxjava3/processors/f$g;->a:Ljava/util/List;

    .line 14
    .line 15
    array-length v4, p1

    .line 16
    if-ge v4, v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, [Ljava/lang/Object;

    .line 31
    .line 32
    :cond_2
    :goto_0
    if-ge v2, v0, :cond_3

    .line 33
    .line 34
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    aput-object v4, p1, v2

    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    array-length v2, p1

    .line 44
    if-le v2, v0, :cond_4

    .line 45
    .line 46
    aput-object v1, p1, v0

    .line 47
    .line 48
    :cond_4
    return-object p1
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

.method public isDone()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/rxjava3/processors/f$g;->c:Z

    return v0
.end method

.method public next(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/f$g;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget p1, p0, Lio/reactivex/rxjava3/processors/f$g;->d:I

    .line 7
    .line 8
    add-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lio/reactivex/rxjava3/processors/f$g;->d:I

    .line 11
    .line 12
    return-void
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

.method public size()I
    .locals 1

    iget v0, p0, Lio/reactivex/rxjava3/processors/f$g;->d:I

    return v0
.end method

.method public trimHead()V
    .locals 0

    return-void
.end method
