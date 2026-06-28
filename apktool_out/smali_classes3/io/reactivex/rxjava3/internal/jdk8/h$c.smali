.class final Lio/reactivex/rxjava3/internal/jdk8/h$c;
.super Lio/reactivex/rxjava3/internal/jdk8/h$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/jdk8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/jdk8/h$a<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x7e0d232dac4fd48dL


# instance fields
.field final downstream:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;Ljava/util/Iterator;Ljava/lang/AutoCloseable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;",
            "Ljava/util/Iterator<",
            "TT;>;",
            "Ljava/lang/AutoCloseable;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2, p3}, Lio/reactivex/rxjava3/internal/jdk8/h$a;-><init>(Ljava/util/Iterator;Ljava/lang/AutoCloseable;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/h$c;->downstream:Lorg/reactivestreams/p;

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
.method public run(J)V
    .locals 9

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/h$a;->iterator:Ljava/util/Iterator;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/jdk8/h$c;->downstream:Lorg/reactivestreams/p;

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    move-wide v4, v2

    .line 8
    :cond_0
    :goto_0
    iget-boolean v6, p0, Lio/reactivex/rxjava3/internal/jdk8/h$a;->cancelled:Z

    .line 9
    .line 10
    if-eqz v6, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/jdk8/h$a;->clear()V

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    const/4 v6, 0x1

    .line 17
    :try_start_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    const-string v8, "The Stream\'s Iterator returned a null value"

    .line 22
    .line 23
    invoke-static {v7, v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    .line 26
    invoke-interface {v1, v7}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-boolean v7, p0, Lio/reactivex/rxjava3/internal/jdk8/h$a;->cancelled:Z

    .line 30
    .line 31
    if-eqz v7, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    :try_start_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-nez v7, :cond_3

    .line 39
    .line 40
    invoke-interface {v1}, Lorg/reactivestreams/p;->onComplete()V

    .line 41
    .line 42
    .line 43
    iput-boolean v6, p0, Lio/reactivex/rxjava3/internal/jdk8/h$a;->cancelled:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    const-wide/16 v6, 0x1

    .line 47
    .line 48
    add-long/2addr v4, v6

    .line 49
    cmp-long v6, v4, p1

    .line 50
    .line 51
    if-eqz v6, :cond_4

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 55
    .line 56
    .line 57
    move-result-wide p1

    .line 58
    cmp-long v6, v4, p1

    .line 59
    .line 60
    if-nez v6, :cond_0

    .line 61
    .line 62
    invoke-virtual {p0, p1, p2, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    :goto_1
    return-void

    .line 69
    :cond_5
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 70
    .line 71
    .line 72
    move-result-wide p1

    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v7

    .line 75
    invoke-static {v7}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v1, v7}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    iput-boolean v6, p0, Lio/reactivex/rxjava3/internal/jdk8/h$a;->cancelled:Z

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catchall_1
    move-exception v7

    .line 85
    invoke-static {v7}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v1, v7}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    iput-boolean v6, p0, Lio/reactivex/rxjava3/internal/jdk8/h$a;->cancelled:Z

    .line 92
    .line 93
    goto :goto_0
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
