.class public final Lio/reactivex/rxjava3/internal/operators/flowable/t;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/t$c;,
        Lio/reactivex/rxjava3/internal/operators/flowable/t$b;,
        Lio/reactivex/rxjava3/internal/operators/flowable/t$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/o<",
        "TR;>;"
    }
.end annotation


# instance fields
.field final b:[Lorg/reactivestreams/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lorg/reactivestreams/o<",
            "+TT;>;"
        }
    .end annotation

    .annotation build Ll3/g;
    .end annotation
.end field

.field final c:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "+",
            "Lorg/reactivestreams/o<",
            "+TT;>;>;"
        }
    .end annotation

    .annotation build Ll3/g;
    .end annotation
.end field

.field final d:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;"
        }
    .end annotation
.end field

.field final e:I

.field final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;Lm3/o;IZ)V
    .locals 1
    .param p1    # Ljava/lang/Iterable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p2    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lorg/reactivestreams/o<",
            "+TT;>;>;",
            "Lm3/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;IZ)V"
        }
    .end annotation

    .line 7
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t;->b:[Lorg/reactivestreams/o;

    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t;->c:Ljava/lang/Iterable;

    .line 10
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t;->d:Lm3/o;

    .line 11
    iput p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t;->e:I

    .line 12
    iput-boolean p4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t;->f:Z

    return-void
.end method

.method public constructor <init>([Lorg/reactivestreams/o;Lm3/o;IZ)V
    .locals 0
    .param p1    # [Lorg/reactivestreams/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p2    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/reactivestreams/o<",
            "+TT;>;",
            "Lm3/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;IZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    .line 2
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t;->b:[Lorg/reactivestreams/o;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t;->c:Ljava/lang/Iterable;

    .line 4
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t;->d:Lm3/o;

    .line 5
    iput p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t;->e:I

    .line 6
    iput-boolean p4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t;->f:Z

    return-void
.end method


# virtual methods
.method public O6(Lorg/reactivestreams/p;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TR;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t;->b:[Lorg/reactivestreams/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    const/16 v0, 0x8

    .line 7
    .line 8
    new-array v0, v0, [Lorg/reactivestreams/o;

    .line 9
    .line 10
    :try_start_0
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t;->c:Ljava/lang/Iterable;

    .line 11
    .line 12
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    move v3, v1

    .line 17
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_2

    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lorg/reactivestreams/o;

    .line 28
    .line 29
    array-length v5, v0

    .line 30
    if-ne v3, v5, :cond_0

    .line 31
    .line 32
    shr-int/lit8 v5, v3, 0x2

    .line 33
    .line 34
    add-int/2addr v5, v3

    .line 35
    new-array v5, v5, [Lorg/reactivestreams/o;

    .line 36
    .line 37
    invoke-static {v0, v1, v5, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    move-object v0, v5

    .line 41
    :cond_0
    add-int/lit8 v5, v3, 0x1

    .line 42
    .line 43
    const-string v6, "The Iterator returned a null Publisher"

    .line 44
    .line 45
    invoke-static {v4, v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    check-cast v4, Lorg/reactivestreams/o;

    .line 49
    .line 50
    aput-object v4, v0, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    move v3, v5

    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/g;->error(Ljava/lang/Throwable;Lorg/reactivestreams/p;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    array-length v3, v0

    .line 63
    :cond_2
    move v8, v3

    .line 64
    if-nez v8, :cond_3

    .line 65
    .line 66
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/subscriptions/g;->complete(Lorg/reactivestreams/p;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    const/4 v2, 0x1

    .line 71
    if-ne v8, v2, :cond_4

    .line 72
    .line 73
    aget-object v0, v0, v1

    .line 74
    .line 75
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/f2$b;

    .line 76
    .line 77
    new-instance v2, Lio/reactivex/rxjava3/internal/operators/flowable/t$c;

    .line 78
    .line 79
    invoke-direct {v2, p0}, Lio/reactivex/rxjava3/internal/operators/flowable/t$c;-><init>(Lio/reactivex/rxjava3/internal/operators/flowable/t;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v1, p1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/f2$b;-><init>(Lorg/reactivestreams/p;Lm3/o;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v0, v1}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_4
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/t$a;

    .line 90
    .line 91
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t;->d:Lm3/o;

    .line 92
    .line 93
    iget v6, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t;->e:I

    .line 94
    .line 95
    iget-boolean v7, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t;->f:Z

    .line 96
    .line 97
    move-object v2, v1

    .line 98
    move-object v3, p1

    .line 99
    move v5, v8

    .line 100
    invoke-direct/range {v2 .. v7}, Lio/reactivex/rxjava3/internal/operators/flowable/t$a;-><init>(Lorg/reactivestreams/p;Lm3/o;IIZ)V

    .line 101
    .line 102
    .line 103
    invoke-interface {p1, v1}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v0, v8}, Lio/reactivex/rxjava3/internal/operators/flowable/t$a;->subscribe([Lorg/reactivestreams/o;I)V

    .line 107
    .line 108
    .line 109
    return-void
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
    .line 378
    .line 379
    .line 380
    .line 381
.end method
