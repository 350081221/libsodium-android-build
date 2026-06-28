.class final Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;
.super Lio/reactivex/rxjava3/internal/subscriptions/c;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/maybe/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/subscriptions/c<",
        "TT;>;",
        "Lio/reactivex/rxjava3/core/a0<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x92a32049d0458bbL


# instance fields
.field volatile cancelled:Z

.field consumed:J

.field final downstream:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final errors:Lio/reactivex/rxjava3/internal/util/c;

.field outputFused:Z

.field final queue:Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/maybe/z0$d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final requested:Ljava/util/concurrent/atomic/AtomicLong;

.field final set:Lio/reactivex/rxjava3/disposables/c;

.field final sourceCount:I


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;ILio/reactivex/rxjava3/internal/operators/maybe/z0$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;I",
            "Lio/reactivex/rxjava3/internal/operators/maybe/z0$d<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/internal/subscriptions/c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->downstream:Lorg/reactivestreams/p;

    .line 5
    .line 6
    iput p2, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->sourceCount:I

    .line 7
    .line 8
    new-instance p1, Lio/reactivex/rxjava3/disposables/c;

    .line 9
    .line 10
    invoke-direct {p1}, Lio/reactivex/rxjava3/disposables/c;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->set:Lio/reactivex/rxjava3/disposables/c;

    .line 14
    .line 15
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 21
    .line 22
    new-instance p1, Lio/reactivex/rxjava3/internal/util/c;

    .line 23
    .line 24
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 28
    .line 29
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->queue:Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;

    .line 30
    .line 31
    return-void
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
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->cancelled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->cancelled:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->set:Lio/reactivex/rxjava3/disposables/c;

    .line 9
    .line 10
    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->dispose()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->queue:Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;

    .line 20
    .line 21
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 22
    .line 23
    .line 24
    :cond_0
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

.method public clear()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->queue:Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;

    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    return-void
.end method

.method drain()V
    .locals 1

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
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->outputFused:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->drainFused()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->drainNormal()V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method drainFused()V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->downstream:Lorg/reactivestreams/p;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->queue:Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    move v3, v2

    .line 7
    :cond_0
    iget-boolean v4, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->cancelled:Z

    .line 8
    .line 9
    if-eqz v4, :cond_1

    .line 10
    .line 11
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Ljava/lang/Throwable;

    .line 22
    .line 23
    if-eqz v4, :cond_2

    .line 24
    .line 25
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v4}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;->producerIndex()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    iget v5, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->sourceCount:I

    .line 37
    .line 38
    if-ne v4, v5, :cond_3

    .line 39
    .line 40
    move v4, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_3
    const/4 v4, 0x0

    .line 43
    :goto_0
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-nez v5, :cond_4

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-interface {v0, v5}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_4
    if-eqz v4, :cond_5

    .line 54
    .line 55
    invoke-interface {v0}, Lorg/reactivestreams/p;->onComplete()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_5
    neg-int v3, v3

    .line 60
    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_0

    .line 65
    .line 66
    return-void
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

.method drainNormal()V
    .locals 10

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->downstream:Lorg/reactivestreams/p;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->queue:Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;

    .line 4
    .line 5
    iget-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->consumed:J

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    :cond_0
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 9
    .line 10
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 11
    .line 12
    .line 13
    move-result-wide v5

    .line 14
    :cond_1
    :goto_0
    cmp-long v7, v2, v5

    .line 15
    .line 16
    if-eqz v7, :cond_6

    .line 17
    .line 18
    iget-boolean v8, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->cancelled:Z

    .line 19
    .line 20
    if-eqz v8, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    iget-object v8, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 27
    .line 28
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    check-cast v8, Ljava/lang/Throwable;

    .line 33
    .line 34
    if-eqz v8, :cond_3

    .line 35
    .line 36
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 40
    .line 41
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->downstream:Lorg/reactivestreams/p;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;->consumerIndex()I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    iget v9, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->sourceCount:I

    .line 52
    .line 53
    if-ne v8, v9, :cond_4

    .line 54
    .line 55
    invoke-interface {v0}, Lorg/reactivestreams/p;->onComplete()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_4
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;->poll()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    if-nez v8, :cond_5

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_5
    sget-object v7, Lio/reactivex/rxjava3/internal/util/q;->COMPLETE:Lio/reactivex/rxjava3/internal/util/q;

    .line 67
    .line 68
    if-eq v8, v7, :cond_1

    .line 69
    .line 70
    invoke-interface {v0, v8}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const-wide/16 v7, 0x1

    .line 74
    .line 75
    add-long/2addr v2, v7

    .line 76
    goto :goto_0

    .line 77
    :cond_6
    :goto_1
    if-nez v7, :cond_9

    .line 78
    .line 79
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Ljava/lang/Throwable;

    .line 86
    .line 87
    if-eqz v5, :cond_7

    .line 88
    .line 89
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 93
    .line 94
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->downstream:Lorg/reactivestreams/p;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_7
    :goto_2
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;->peek()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    sget-object v6, Lio/reactivex/rxjava3/internal/util/q;->COMPLETE:Lio/reactivex/rxjava3/internal/util/q;

    .line 105
    .line 106
    if-ne v5, v6, :cond_8

    .line 107
    .line 108
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;->drop()V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_8
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;->consumerIndex()I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    iget v6, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->sourceCount:I

    .line 117
    .line 118
    if-ne v5, v6, :cond_9

    .line 119
    .line 120
    invoke-interface {v0}, Lorg/reactivestreams/p;->onComplete()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_9
    iput-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->consumed:J

    .line 125
    .line 126
    neg-int v4, v4

    .line 127
    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-nez v4, :cond_0

    .line 132
    .line 133
    return-void
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

.method isCancelled()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->cancelled:Z

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->queue:Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;

    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public onComplete()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->queue:Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;

    .line 2
    .line 3
    sget-object v1, Lio/reactivex/rxjava3/internal/util/q;->COMPLETE:Lio/reactivex/rxjava3/internal/util/q;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->drain()V

    .line 9
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
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->set:Lio/reactivex/rxjava3/disposables/c;

    .line 10
    .line 11
    invoke-virtual {p1}, Lio/reactivex/rxjava3/disposables/c;->dispose()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->queue:Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;

    .line 15
    .line 16
    sget-object v0, Lio/reactivex/rxjava3/internal/util/q;->COMPLETE:Lio/reactivex/rxjava3/internal/util/q;

    .line 17
    .line 18
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->drain()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->set:Lio/reactivex/rxjava3/disposables/c;

    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/disposables/c;->b(Lio/reactivex/rxjava3/disposables/e;)Z

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->queue:Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->drain()V

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

.method public poll()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Ll3/g;
    .end annotation

    .line 1
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->queue:Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;->poll()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lio/reactivex/rxjava3/internal/util/q;->COMPLETE:Lio/reactivex/rxjava3/internal/util/q;

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    return-object v0
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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 8
    .line 9
    invoke-static {v0, p1, p2}, Lio/reactivex/rxjava3/internal/util/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->drain()V

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

.method public requestFusion(I)I
    .locals 1

    const/4 v0, 0x2

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->outputFused:Z

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
