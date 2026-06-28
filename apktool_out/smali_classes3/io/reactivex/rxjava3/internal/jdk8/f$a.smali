.class final Lio/reactivex/rxjava3/internal/jdk8/f$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;
.implements Lorg/reactivestreams/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/jdk8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;",
        "Lorg/reactivestreams/q;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x4726e10af4c777c0L


# instance fields
.field volatile cancelled:Z

.field consumed:I

.field currentCloseable:Ljava/lang/AutoCloseable;

.field currentIterator:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "+TR;>;"
        }
    .end annotation
.end field

.field final downstream:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TR;>;"
        }
    .end annotation
.end field

.field emitted:J

.field final error:Lio/reactivex/rxjava3/internal/util/c;

.field final mapper:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-TT;+",
            "Ljava/util/stream/Stream<",
            "+TR;>;>;"
        }
    .end annotation
.end field

.field final prefetch:I

.field queue:Lio/reactivex/rxjava3/internal/fuseable/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/fuseable/q<",
            "TT;>;"
        }
    .end annotation
.end field

.field final requested:Ljava/util/concurrent/atomic/AtomicLong;

.field sourceMode:I

.field upstream:Lorg/reactivestreams/q;

.field volatile upstreamDone:Z


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;Lm3/o;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TR;>;",
            "Lm3/o<",
            "-TT;+",
            "Ljava/util/stream/Stream<",
            "+TR;>;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->downstream:Lorg/reactivestreams/p;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->mapper:Lm3/o;

    .line 7
    .line 8
    iput p3, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->prefetch:I

    .line 9
    .line 10
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 16
    .line 17
    new-instance p1, Lio/reactivex/rxjava3/internal/util/c;

    .line 18
    .line 19
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->error:Lio/reactivex/rxjava3/internal/util/c;

    .line 23
    .line 24
    return-void
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
.method public cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->cancelled:Z

    .line 3
    .line 4
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->upstream:Lorg/reactivestreams/q;

    .line 5
    .line 6
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/jdk8/f$a;->drain()V

    .line 10
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
.end method

.method clearCurrentRethrowCloseError()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->currentIterator:Ljava/util/Iterator;

    .line 3
    .line 4
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->currentCloseable:Ljava/lang/AutoCloseable;

    .line 5
    .line 6
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->currentCloseable:Ljava/lang/AutoCloseable;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 11
    .line 12
    .line 13
    :cond_0
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
.end method

.method clearCurrentSuppressCloseError()V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/jdk8/f$a;->clearCurrentRethrowCloseError()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    goto :goto_0

    .line 5
    :catchall_0
    move-exception v0

    .line 6
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    :goto_0
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
.end method

.method drain()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v2, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->downstream:Lorg/reactivestreams/p;

    .line 11
    .line 12
    iget-object v3, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 13
    .line 14
    iget-object v4, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->error:Lio/reactivex/rxjava3/internal/util/c;

    .line 15
    .line 16
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->currentIterator:Ljava/util/Iterator;

    .line 17
    .line 18
    iget-object v5, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 21
    .line 22
    .line 23
    move-result-wide v5

    .line 24
    iget-wide v7, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->emitted:J

    .line 25
    .line 26
    iget v9, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->prefetch:I

    .line 27
    .line 28
    shr-int/lit8 v10, v9, 0x2

    .line 29
    .line 30
    sub-int/2addr v9, v10

    .line 31
    iget v10, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->sourceMode:I

    .line 32
    .line 33
    const/4 v11, 0x0

    .line 34
    const/4 v12, 0x1

    .line 35
    if-eq v10, v12, :cond_1

    .line 36
    .line 37
    move v10, v12

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v10, v11

    .line 40
    :goto_0
    move-wide v13, v7

    .line 41
    move v8, v12

    .line 42
    move-wide v6, v5

    .line 43
    move-object v5, v0

    .line 44
    :goto_1
    iget-boolean v0, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->cancelled:Z

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-interface {v3}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 49
    .line 50
    .line 51
    invoke-virtual/range {p0 .. p0}, Lio/reactivex/rxjava3/internal/jdk8/f$a;->clearCurrentSuppressCloseError()V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_7

    .line 55
    .line 56
    :cond_2
    iget-boolean v0, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->upstreamDone:Z

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v15

    .line 62
    if-eqz v15, :cond_3

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Ljava/lang/Throwable;

    .line 69
    .line 70
    invoke-interface {v2, v0}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    iput-boolean v12, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->cancelled:Z

    .line 74
    .line 75
    goto/16 :goto_6

    .line 76
    .line 77
    :cond_3
    if-nez v5, :cond_8

    .line 78
    .line 79
    :try_start_0
    invoke-interface {v3}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 83
    if-nez v15, :cond_4

    .line 84
    .line 85
    move/from16 v16, v12

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    move/from16 v16, v11

    .line 89
    .line 90
    :goto_2
    if-eqz v0, :cond_5

    .line 91
    .line 92
    if-eqz v16, :cond_5

    .line 93
    .line 94
    invoke-interface {v2}, Lorg/reactivestreams/p;->onComplete()V

    .line 95
    .line 96
    .line 97
    iput-boolean v12, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->cancelled:Z

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_5
    if-nez v16, :cond_8

    .line 101
    .line 102
    if-eqz v10, :cond_6

    .line 103
    .line 104
    iget v0, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->consumed:I

    .line 105
    .line 106
    add-int/2addr v0, v12

    .line 107
    iput v0, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->consumed:I

    .line 108
    .line 109
    if-ne v0, v9, :cond_6

    .line 110
    .line 111
    iput v11, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->consumed:I

    .line 112
    .line 113
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->upstream:Lorg/reactivestreams/q;

    .line 114
    .line 115
    int-to-long v11, v9

    .line 116
    invoke-interface {v0, v11, v12}, Lorg/reactivestreams/q;->request(J)V

    .line 117
    .line 118
    .line 119
    :cond_6
    :try_start_1
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->mapper:Lm3/o;

    .line 120
    .line 121
    invoke-interface {v0, v15}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const-string v11, "The mapper returned a null Stream"

    .line 126
    .line 127
    invoke-static {v0, v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    check-cast v0, Ljava/util/stream/Stream;

    .line 131
    .line 132
    invoke-interface {v0}, Ljava/util/stream/BaseStream;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    if-eqz v11, :cond_7

    .line 141
    .line 142
    iput-object v5, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->currentIterator:Ljava/util/Iterator;

    .line 143
    .line 144
    iput-object v0, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->currentCloseable:Ljava/lang/AutoCloseable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_7
    :goto_3
    const/4 v5, 0x0

    .line 148
    goto :goto_6

    .line 149
    :catchall_0
    move-exception v0

    .line 150
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v2, v0}, Lio/reactivex/rxjava3/internal/jdk8/f$a;->trySignalError(Lorg/reactivestreams/p;Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    goto :goto_6

    .line 157
    :catchall_1
    move-exception v0

    .line 158
    move-object v11, v0

    .line 159
    invoke-static {v11}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v2, v11}, Lio/reactivex/rxjava3/internal/jdk8/f$a;->trySignalError(Lorg/reactivestreams/p;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_8
    :goto_4
    if-eqz v5, :cond_a

    .line 167
    .line 168
    cmp-long v0, v13, v6

    .line 169
    .line 170
    if-eqz v0, :cond_a

    .line 171
    .line 172
    :try_start_2
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    const-string v11, "The Stream.Iterator returned a null value"

    .line 177
    .line 178
    invoke-static {v0, v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 179
    .line 180
    .line 181
    iget-boolean v11, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->cancelled:Z

    .line 182
    .line 183
    if-nez v11, :cond_9

    .line 184
    .line 185
    invoke-interface {v2, v0}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    const-wide/16 v11, 0x1

    .line 189
    .line 190
    add-long/2addr v13, v11

    .line 191
    iget-boolean v0, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->cancelled:Z

    .line 192
    .line 193
    if-nez v0, :cond_9

    .line 194
    .line 195
    :try_start_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 199
    if-nez v0, :cond_9

    .line 200
    .line 201
    :try_start_4
    invoke-virtual/range {p0 .. p0}, Lio/reactivex/rxjava3/internal/jdk8/f$a;->clearCurrentRethrowCloseError()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :catchall_2
    move-exception v0

    .line 206
    const/4 v5, 0x0

    .line 207
    goto :goto_5

    .line 208
    :catchall_3
    move-exception v0

    .line 209
    :goto_5
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v2, v0}, Lio/reactivex/rxjava3/internal/jdk8/f$a;->trySignalError(Lorg/reactivestreams/p;Ljava/lang/Throwable;)V

    .line 213
    .line 214
    .line 215
    goto :goto_6

    .line 216
    :catchall_4
    move-exception v0

    .line 217
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v2, v0}, Lio/reactivex/rxjava3/internal/jdk8/f$a;->trySignalError(Lorg/reactivestreams/p;Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    :cond_9
    :goto_6
    const/4 v11, 0x0

    .line 224
    const/4 v12, 0x1

    .line 225
    goto/16 :goto_1

    .line 226
    .line 227
    :cond_a
    :goto_7
    iput-wide v13, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->emitted:J

    .line 228
    .line 229
    neg-int v0, v8

    .line 230
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 231
    .line 232
    .line 233
    move-result v8

    .line 234
    if-nez v8, :cond_b

    .line 235
    .line 236
    return-void

    .line 237
    :cond_b
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/jdk8/f$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 240
    .line 241
    .line 242
    move-result-wide v6

    .line 243
    goto :goto_6
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
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->upstreamDone:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/jdk8/f$a;->drain()V

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
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->error:Lio/reactivex/rxjava3/internal/util/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->upstreamDone:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/jdk8/f$a;->drain()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->sourceMode:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->upstream:Lorg/reactivestreams/q;

    .line 15
    .line 16
    invoke-interface {p1}, Lorg/reactivestreams/q;->cancel()V

    .line 17
    .line 18
    .line 19
    new-instance p1, Lio/reactivex/rxjava3/exceptions/c;

    .line 20
    .line 21
    const-string v0, "Queue full?!"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Lio/reactivex/rxjava3/exceptions/c;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/jdk8/f$a;->onError(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/jdk8/f$a;->drain()V

    .line 31
    .line 32
    .line 33
    return-void
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
    .param p1    # Lorg/reactivestreams/q;
        .annotation build Ll3/f;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->upstream:Lorg/reactivestreams/q;

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
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->upstream:Lorg/reactivestreams/q;

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
    iput v1, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->sourceMode:I

    .line 27
    .line 28
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 29
    .line 30
    iput-boolean v2, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->upstreamDone:Z

    .line 31
    .line 32
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->downstream:Lorg/reactivestreams/p;

    .line 33
    .line 34
    invoke-interface {p1, p0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    const/4 v2, 0x2

    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    iput v1, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->sourceMode:I

    .line 42
    .line 43
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 44
    .line 45
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->downstream:Lorg/reactivestreams/p;

    .line 46
    .line 47
    invoke-interface {v0, p0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 48
    .line 49
    .line 50
    iget v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->prefetch:I

    .line 51
    .line 52
    int-to-long v0, v0

    .line 53
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    new-instance v0, Lio/reactivex/rxjava3/internal/queue/b;

    .line 58
    .line 59
    iget v1, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->prefetch:I

    .line 60
    .line 61
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/queue/b;-><init>(I)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 65
    .line 66
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->downstream:Lorg/reactivestreams/p;

    .line 67
    .line 68
    invoke-interface {v0, p0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 69
    .line 70
    .line 71
    iget v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->prefetch:I

    .line 72
    .line 73
    int-to-long v0, v0

    .line 74
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 75
    .line 76
    .line 77
    :cond_2
    return-void
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public request(J)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Lio/reactivex/rxjava3/internal/subscriptions/j;->validate(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 8
    .line 9
    invoke-static {v0, p1, p2}, Lio/reactivex/rxjava3/internal/util/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/jdk8/f$a;->drain()V

    .line 13
    .line 14
    .line 15
    :cond_0
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
.end method

.method trySignalError(Lorg/reactivestreams/p;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->error:Lio/reactivex/rxjava3/internal/util/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->upstream:Lorg/reactivestreams/q;

    .line 11
    .line 12
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/jdk8/f$a;->cancelled:Z

    .line 17
    .line 18
    invoke-interface {p1, p2}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {p2}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
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
.end method
