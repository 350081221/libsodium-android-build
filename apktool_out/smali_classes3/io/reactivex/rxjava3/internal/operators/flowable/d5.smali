.class public final Lio/reactivex/rxjava3/internal/operators/flowable/d5;
.super Lio/reactivex/rxjava3/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/d5$a;,
        Lio/reactivex/rxjava3/internal/operators/flowable/d5$c;,
        Lio/reactivex/rxjava3/internal/operators/flowable/d5$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/operators/flowable/a<",
        "TT;TR;>;"
    }
.end annotation


# instance fields
.field final c:[Lorg/reactivestreams/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lorg/reactivestreams/o<",
            "*>;"
        }
    .end annotation

    .annotation build Ll3/g;
    .end annotation
.end field

.field final d:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "+",
            "Lorg/reactivestreams/o<",
            "*>;>;"
        }
    .end annotation

    .annotation build Ll3/g;
    .end annotation
.end field

.field final e:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-[",
            "Ljava/lang/Object;",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/o;Ljava/lang/Iterable;Lm3/o;)V
    .locals 0
    .param p1    # Lio/reactivex/rxjava3/core/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Iterable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p3    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;",
            "Ljava/lang/Iterable<",
            "+",
            "Lorg/reactivestreams/o<",
            "*>;>;",
            "Lm3/o<",
            "-[",
            "Ljava/lang/Object;",
            "TR;>;)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/a;-><init>(Lio/reactivex/rxjava3/core/o;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5;->c:[Lorg/reactivestreams/o;

    .line 7
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5;->d:Ljava/lang/Iterable;

    .line 8
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5;->e:Lm3/o;

    return-void
.end method

.method public constructor <init>(Lio/reactivex/rxjava3/core/o;[Lorg/reactivestreams/o;Lm3/o;)V
    .locals 0
    .param p1    # Lio/reactivex/rxjava3/core/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p2    # [Lorg/reactivestreams/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;[",
            "Lorg/reactivestreams/o<",
            "*>;",
            "Lm3/o<",
            "-[",
            "Ljava/lang/Object;",
            "TR;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/a;-><init>(Lio/reactivex/rxjava3/core/o;)V

    .line 2
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5;->c:[Lorg/reactivestreams/o;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5;->d:Ljava/lang/Iterable;

    .line 4
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5;->e:Lm3/o;

    return-void
.end method


# virtual methods
.method protected O6(Lorg/reactivestreams/p;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TR;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5;->c:[Lorg/reactivestreams/o;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x8

    .line 6
    .line 7
    new-array v0, v0, [Lorg/reactivestreams/o;

    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5;->d:Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lorg/reactivestreams/o;

    .line 27
    .line 28
    array-length v4, v0

    .line 29
    if-ne v2, v4, :cond_0

    .line 30
    .line 31
    shr-int/lit8 v4, v2, 0x1

    .line 32
    .line 33
    add-int/2addr v4, v2

    .line 34
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, [Lorg/reactivestreams/o;

    .line 39
    .line 40
    :cond_0
    add-int/lit8 v4, v2, 0x1

    .line 41
    .line 42
    aput-object v3, v0, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    move v2, v4

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/g;->error(Ljava/lang/Throwable;Lorg/reactivestreams/p;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    array-length v2, v0

    .line 55
    :cond_2
    if-nez v2, :cond_3

    .line 56
    .line 57
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/f2;

    .line 58
    .line 59
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a;->b:Lio/reactivex/rxjava3/core/o;

    .line 60
    .line 61
    new-instance v2, Lio/reactivex/rxjava3/internal/operators/flowable/d5$a;

    .line 62
    .line 63
    invoke-direct {v2, p0}, Lio/reactivex/rxjava3/internal/operators/flowable/d5$a;-><init>(Lio/reactivex/rxjava3/internal/operators/flowable/d5;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v0, v1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/f2;-><init>(Lio/reactivex/rxjava3/core/o;Lm3/o;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/f2;->O6(Lorg/reactivestreams/p;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/d5$b;

    .line 74
    .line 75
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5;->e:Lm3/o;

    .line 76
    .line 77
    invoke-direct {v1, p1, v3, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/d5$b;-><init>(Lorg/reactivestreams/p;Lm3/o;I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p1, v1}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v0, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/d5$b;->subscribe([Lorg/reactivestreams/o;I)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a;->b:Lio/reactivex/rxjava3/core/o;

    .line 87
    .line 88
    invoke-virtual {p1, v1}, Lio/reactivex/rxjava3/core/o;->N6(Lio/reactivex/rxjava3/core/t;)V

    .line 89
    .line 90
    .line 91
    return-void
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
