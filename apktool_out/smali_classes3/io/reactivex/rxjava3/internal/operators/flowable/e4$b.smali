.class final Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;
.implements Lorg/reactivestreams/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/e4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
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
.field static final CANCELLED:Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/flowable/e4$a<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = -0x3072c973d405526bL


# instance fields
.field final active:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/rxjava3/internal/operators/flowable/e4$a<",
            "TT;TR;>;>;"
        }
    .end annotation
.end field

.field final bufferSize:I

.field volatile cancelled:Z

.field final delayErrors:Z

.field volatile done:Z

.field final downstream:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TR;>;"
        }
    .end annotation
.end field

.field final errors:Lio/reactivex/rxjava3/internal/util/c;

.field final mapper:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-TT;+",
            "Lorg/reactivestreams/o<",
            "+TR;>;>;"
        }
    .end annotation
.end field

.field final requested:Ljava/util/concurrent/atomic/AtomicLong;

.field volatile unique:J

.field upstream:Lorg/reactivestreams/q;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    invoke-direct {v0, v4, v1, v2, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;-><init>(Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;JI)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->CANCELLED:Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;

    .line 11
    .line 12
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->cancel()V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method constructor <init>(Lorg/reactivestreams/p;Lm3/o;IZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TR;>;",
            "Lm3/o<",
            "-TT;+",
            "Lorg/reactivestreams/o<",
            "+TR;>;>;IZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 17
    .line 18
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->downstream:Lorg/reactivestreams/p;

    .line 19
    .line 20
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->mapper:Lm3/o;

    .line 21
    .line 22
    iput p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->bufferSize:I

    .line 23
    .line 24
    iput-boolean p4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->delayErrors:Z

    .line 25
    .line 26
    new-instance p1, Lio/reactivex/rxjava3/internal/util/c;

    .line 27
    .line 28
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

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
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->cancelled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->cancelled:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->upstream:Lorg/reactivestreams/q;

    .line 9
    .line 10
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->disposeInner()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 17
    .line 18
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateAndReport()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
.end method

.method disposeInner()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->CANCELLED:Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->cancel()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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
    iget-object v2, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->downstream:Lorg/reactivestreams/p;

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    :cond_1
    :goto_0
    iget-boolean v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->cancelled:Z

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 19
    .line 20
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    iget-boolean v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->done:Z

    .line 25
    .line 26
    if-eqz v0, :cond_5

    .line 27
    .line 28
    iget-boolean v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->delayErrors:Z

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_5

    .line 39
    .line 40
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_3
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/Throwable;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-virtual/range {p0 .. p0}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->disposeInner()V

    .line 57
    .line 58
    .line 59
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_4
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-nez v0, :cond_5

    .line 72
    .line 73
    invoke-interface {v2}, Lorg/reactivestreams/p;->onComplete()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_5
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    move-object v6, v0

    .line 84
    check-cast v6, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;

    .line 85
    .line 86
    if-eqz v6, :cond_6

    .line 87
    .line 88
    iget-object v0, v6, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 89
    .line 90
    move-object v7, v0

    .line 91
    goto :goto_1

    .line 92
    :cond_6
    move-object v7, v5

    .line 93
    :goto_1
    if-eqz v7, :cond_14

    .line 94
    .line 95
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 98
    .line 99
    .line 100
    move-result-wide v8

    .line 101
    const-wide/16 v10, 0x0

    .line 102
    .line 103
    move-wide v12, v10

    .line 104
    :goto_2
    cmp-long v14, v12, v8

    .line 105
    .line 106
    if-eqz v14, :cond_e

    .line 107
    .line 108
    iget-boolean v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->cancelled:Z

    .line 109
    .line 110
    if-eqz v0, :cond_7

    .line 111
    .line 112
    return-void

    .line 113
    :cond_7
    iget-boolean v0, v6, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->done:Z

    .line 114
    .line 115
    :try_start_0
    invoke-interface {v7}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    move-object/from16 v3, v16

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    move-object/from16 v16, v0

    .line 124
    .line 125
    invoke-static/range {v16 .. v16}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->cancel()V

    .line 129
    .line 130
    .line 131
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 132
    .line 133
    move-object/from16 v3, v16

    .line 134
    .line 135
    invoke-virtual {v0, v3}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 136
    .line 137
    .line 138
    move-object v3, v5

    .line 139
    const/4 v0, 0x1

    .line 140
    :goto_3
    if-nez v3, :cond_8

    .line 141
    .line 142
    const/16 v16, 0x1

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_8
    const/16 v16, 0x0

    .line 146
    .line 147
    :goto_4
    iget-object v15, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 148
    .line 149
    invoke-virtual {v15}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v15

    .line 153
    if-eq v6, v15, :cond_9

    .line 154
    .line 155
    :goto_5
    const/4 v15, 0x1

    .line 156
    goto :goto_7

    .line 157
    :cond_9
    if-eqz v0, :cond_c

    .line 158
    .line 159
    iget-boolean v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->delayErrors:Z

    .line 160
    .line 161
    if-nez v0, :cond_b

    .line 162
    .line 163
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Ljava/lang/Throwable;

    .line 170
    .line 171
    if-eqz v0, :cond_a

    .line 172
    .line 173
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 174
    .line 175
    invoke-virtual {v0, v2}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_a
    if-eqz v16, :cond_c

    .line 180
    .line 181
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 182
    .line 183
    invoke-static {v0, v6, v5}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_b
    if-eqz v16, :cond_c

    .line 188
    .line 189
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 190
    .line 191
    invoke-static {v0, v6, v5}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_c
    if-eqz v16, :cond_d

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_d
    invoke-interface {v2, v3}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    const-wide/16 v14, 0x1

    .line 202
    .line 203
    add-long/2addr v12, v14

    .line 204
    goto :goto_2

    .line 205
    :cond_e
    :goto_6
    const/4 v15, 0x0

    .line 206
    :goto_7
    if-nez v14, :cond_11

    .line 207
    .line 208
    iget-boolean v0, v6, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->done:Z

    .line 209
    .line 210
    if-eqz v0, :cond_11

    .line 211
    .line 212
    iget-boolean v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->delayErrors:Z

    .line 213
    .line 214
    if-nez v0, :cond_10

    .line 215
    .line 216
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, Ljava/lang/Throwable;

    .line 223
    .line 224
    if-eqz v0, :cond_f

    .line 225
    .line 226
    invoke-virtual/range {p0 .. p0}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->disposeInner()V

    .line 227
    .line 228
    .line 229
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 230
    .line 231
    invoke-virtual {v0, v2}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_f
    invoke-interface {v7}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-eqz v0, :cond_11

    .line 240
    .line 241
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 242
    .line 243
    invoke-static {v0, v6, v5}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    goto/16 :goto_0

    .line 247
    .line 248
    :cond_10
    invoke-interface {v7}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_11

    .line 253
    .line 254
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 255
    .line 256
    invoke-static {v0, v6, v5}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    goto/16 :goto_0

    .line 260
    .line 261
    :cond_11
    cmp-long v0, v12, v10

    .line 262
    .line 263
    if-eqz v0, :cond_13

    .line 264
    .line 265
    iget-boolean v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->cancelled:Z

    .line 266
    .line 267
    if-nez v0, :cond_13

    .line 268
    .line 269
    const-wide v10, 0x7fffffffffffffffL

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    cmp-long v0, v8, v10

    .line 275
    .line 276
    if-eqz v0, :cond_12

    .line 277
    .line 278
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 279
    .line 280
    neg-long v7, v12

    .line 281
    invoke-virtual {v0, v7, v8}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 282
    .line 283
    .line 284
    :cond_12
    invoke-virtual {v6, v12, v13}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->request(J)V

    .line 285
    .line 286
    .line 287
    :cond_13
    if-eqz v15, :cond_14

    .line 288
    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :cond_14
    neg-int v0, v4

    .line 292
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    if-nez v4, :cond_1

    .line 297
    .line 298
    return-void
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
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->done:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->done:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->drain()V

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

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->done:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowable(Ljava/lang/Throwable;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->delayErrors:Z

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->disposeInner()V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->done:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->drain()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void
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
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->done:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->unique:J

    .line 7
    .line 8
    const-wide/16 v2, 0x1

    .line 9
    .line 10
    add-long/2addr v0, v2

    .line 11
    iput-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->unique:J

    .line 12
    .line 13
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v2}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->cancel()V

    .line 24
    .line 25
    .line 26
    :cond_1
    :try_start_0
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->mapper:Lm3/o;

    .line 27
    .line 28
    invoke-interface {v2, p1}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v2, "The publisher returned is null"

    .line 33
    .line 34
    invoke-static {p1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    check-cast p1, Lorg/reactivestreams/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    new-instance v2, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;

    .line 40
    .line 41
    iget v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->bufferSize:I

    .line 42
    .line 43
    invoke-direct {v2, p0, v0, v1, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;-><init>(Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;JI)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;

    .line 53
    .line 54
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->CANCELLED:Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;

    .line 55
    .line 56
    if-ne v0, v1, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 60
    .line 61
    invoke-static {v1, v0, v2}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-interface {p1, v2}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    return-void

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->upstream:Lorg/reactivestreams/q;

    .line 76
    .line 77
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->onError(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    return-void
    .line 84
    .line 85
.end method

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->upstream:Lorg/reactivestreams/q;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/j;->validate(Lorg/reactivestreams/q;Lorg/reactivestreams/q;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->upstream:Lorg/reactivestreams/q;

    .line 10
    .line 11
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->downstream:Lorg/reactivestreams/p;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
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

.method public request(J)V
    .locals 2

    .line 1
    invoke-static {p1, p2}, Lio/reactivex/rxjava3/internal/subscriptions/j;->validate(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 8
    .line 9
    invoke-static {v0, p1, p2}, Lio/reactivex/rxjava3/internal/util/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 10
    .line 11
    .line 12
    iget-wide p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->unique:J

    .line 13
    .line 14
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    cmp-long p1, p1, v0

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->upstream:Lorg/reactivestreams/q;

    .line 21
    .line 22
    const-wide v0, 0x7fffffffffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->drain()V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
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
