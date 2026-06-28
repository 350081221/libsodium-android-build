.class final Lio/reactivex/rxjava3/internal/operators/observable/r3$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/r3;
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
        "Lio/reactivex/rxjava3/core/p0<",
        "TT;>;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# static fields
.field static final CANCELLED:Lio/reactivex/rxjava3/internal/operators/observable/r3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/observable/r3$a<",
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
            "Lio/reactivex/rxjava3/internal/operators/observable/r3$a<",
            "TT;TR;>;>;"
        }
    .end annotation
.end field

.field final bufferSize:I

.field volatile cancelled:Z

.field final delayErrors:Z

.field volatile done:Z

.field final downstream:Lio/reactivex/rxjava3/core/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/p0<",
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
            "Lio/reactivex/rxjava3/core/n0<",
            "+TR;>;>;"
        }
    .end annotation
.end field

.field volatile unique:J

.field upstream:Lio/reactivex/rxjava3/disposables/e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    invoke-direct {v0, v4, v1, v2, v3}, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;-><init>(Lio/reactivex/rxjava3/internal/operators/observable/r3$b;JI)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->CANCELLED:Lio/reactivex/rxjava3/internal/operators/observable/r3$a;

    .line 11
    .line 12
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->cancel()V

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

.method constructor <init>(Lio/reactivex/rxjava3/core/p0;Lm3/o;IZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TR;>;",
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/n0<",
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
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 12
    .line 13
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->mapper:Lm3/o;

    .line 14
    .line 15
    iput p3, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->bufferSize:I

    .line 16
    .line 17
    iput-boolean p4, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->delayErrors:Z

    .line 18
    .line 19
    new-instance p1, Lio/reactivex/rxjava3/internal/util/c;

    .line 20
    .line 21
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 25
    .line 26
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
.method public dispose()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->cancelled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->cancelled:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 9
    .line 10
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->disposeInner()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->CANCELLED:Lio/reactivex/rxjava3/internal/operators/observable/r3$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->cancel()V

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
.end method

.method drain()V
    .locals 13

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 9
    .line 10
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    iget-boolean v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->delayErrors:Z

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    move v4, v3

    .line 16
    :cond_1
    :goto_0
    iget-boolean v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->cancelled:Z

    .line 17
    .line 18
    if-eqz v5, :cond_2

    .line 19
    .line 20
    return-void

    .line 21
    :cond_2
    iget-boolean v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->done:Z

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    if-eqz v5, :cond_7

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    if-nez v5, :cond_3

    .line 31
    .line 32
    move v5, v3

    .line 33
    goto :goto_1

    .line 34
    :cond_3
    move v5, v6

    .line 35
    :goto_1
    if-eqz v2, :cond_5

    .line 36
    .line 37
    if-eqz v5, :cond_7

    .line 38
    .line 39
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/lang/Throwable;

    .line 46
    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    invoke-interface {v0}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    .line 54
    .line 55
    .line 56
    :goto_2
    return-void

    .line 57
    :cond_5
    iget-object v7, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    check-cast v7, Ljava/lang/Throwable;

    .line 64
    .line 65
    if-eqz v7, :cond_6

    .line 66
    .line 67
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 68
    .line 69
    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/p0;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_6
    if-eqz v5, :cond_7

    .line 74
    .line 75
    invoke-interface {v0}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_7
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    check-cast v5, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;

    .line 84
    .line 85
    if-eqz v5, :cond_f

    .line 86
    .line 87
    iget-object v7, v5, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 88
    .line 89
    if-eqz v7, :cond_f

    .line 90
    .line 91
    move v8, v6

    .line 92
    :goto_3
    iget-boolean v9, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->cancelled:Z

    .line 93
    .line 94
    if-eqz v9, :cond_8

    .line 95
    .line 96
    return-void

    .line 97
    :cond_8
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    if-eq v5, v9, :cond_9

    .line 102
    .line 103
    :goto_4
    move v8, v3

    .line 104
    goto :goto_8

    .line 105
    :cond_9
    if-nez v2, :cond_a

    .line 106
    .line 107
    iget-object v9, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 108
    .line 109
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    check-cast v9, Ljava/lang/Throwable;

    .line 114
    .line 115
    if-eqz v9, :cond_a

    .line 116
    .line 117
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 118
    .line 119
    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/p0;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_a
    iget-boolean v9, v5, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->done:Z

    .line 124
    .line 125
    const/4 v10, 0x0

    .line 126
    :try_start_0
    invoke-interface {v7}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    goto :goto_6

    .line 131
    :catchall_0
    move-exception v8

    .line 132
    invoke-static {v8}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    iget-object v11, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 136
    .line 137
    invoke-virtual {v11, v8}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 138
    .line 139
    .line 140
    invoke-static {v1, v5, v10}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    if-nez v2, :cond_b

    .line 144
    .line 145
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->disposeInner()V

    .line 146
    .line 147
    .line 148
    iget-object v8, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 149
    .line 150
    invoke-interface {v8}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 151
    .line 152
    .line 153
    iput-boolean v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->done:Z

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_b
    invoke-virtual {v5}, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->cancel()V

    .line 157
    .line 158
    .line 159
    :goto_5
    move v8, v3

    .line 160
    move-object v11, v10

    .line 161
    :goto_6
    if-nez v11, :cond_c

    .line 162
    .line 163
    move v12, v3

    .line 164
    goto :goto_7

    .line 165
    :cond_c
    move v12, v6

    .line 166
    :goto_7
    if-eqz v9, :cond_d

    .line 167
    .line 168
    if-eqz v12, :cond_d

    .line 169
    .line 170
    invoke-static {v1, v5, v10}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_d
    if-eqz v12, :cond_e

    .line 175
    .line 176
    :goto_8
    if-eqz v8, :cond_f

    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_e
    invoke-interface {v0, v11}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_f
    neg-int v4, v4

    .line 185
    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    if-nez v4, :cond_1

    .line 190
    .line 191
    return-void
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

.method innerError(Lio/reactivex/rxjava3/internal/operators/observable/r3$a;Ljava/lang/Throwable;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/observable/r3$a<",
            "TT;TR;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    iget-wide v0, p1, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->index:J

    .line 2
    .line 3
    iget-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->unique:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowable(Ljava/lang/Throwable;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-boolean p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->delayErrors:Z

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 23
    .line 24
    invoke-interface {p2}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 25
    .line 26
    .line 27
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->done:Z

    .line 28
    .line 29
    :cond_0
    iput-boolean v0, p1, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->done:Z

    .line 30
    .line 31
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->drain()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {p2}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void
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

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->cancelled:Z

    return v0
.end method

.method public onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->done:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->done:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->drain()V

    .line 9
    .line 10
    .line 11
    :cond_0
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
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->done:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

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
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->delayErrors:Z

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->disposeInner()V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->done:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->drain()V

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
    iget-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->unique:J

    .line 2
    .line 3
    const-wide/16 v2, 0x1

    .line 4
    .line 5
    add-long/2addr v0, v2

    .line 6
    iput-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->unique:J

    .line 7
    .line 8
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v2}, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->cancel()V

    .line 19
    .line 20
    .line 21
    :cond_0
    :try_start_0
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->mapper:Lm3/o;

    .line 22
    .line 23
    invoke-interface {v2, p1}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v2, "The ObservableSource returned is null"

    .line 28
    .line 29
    invoke-static {p1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    check-cast p1, Lio/reactivex/rxjava3/core/n0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    new-instance v2, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;

    .line 35
    .line 36
    iget v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->bufferSize:I

    .line 37
    .line 38
    invoke-direct {v2, p0, v0, v1, v3}, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;-><init>(Lio/reactivex/rxjava3/internal/operators/observable/r3$b;JI)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;

    .line 48
    .line 49
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->CANCELLED:Lio/reactivex/rxjava3/internal/operators/observable/r3$a;

    .line 50
    .line 51
    if-ne v0, v1, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->active:Ljava/util/concurrent/atomic/AtomicReference;

    .line 55
    .line 56
    invoke-static {v1, v0, v2}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    invoke-interface {p1, v2}, Lio/reactivex/rxjava3/core/n0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    .line 63
    .line 64
    .line 65
    :goto_0
    return-void

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 71
    .line 72
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->onError(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->validate(Lio/reactivex/rxjava3/disposables/e;Lio/reactivex/rxjava3/disposables/e;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 10
    .line 11
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

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
