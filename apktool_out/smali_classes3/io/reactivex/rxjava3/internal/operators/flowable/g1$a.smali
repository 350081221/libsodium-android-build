.class final Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;
.super Lio/reactivex/rxjava3/internal/subscriptions/c;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/g1;
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
        "Lio/reactivex/rxjava3/internal/subscriptions/c<",
        "TR;>;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x2af733f1e9031a6bL


# instance fields
.field volatile cancelled:Z

.field consumed:I

.field current:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "+TR;>;"
        }
    .end annotation
.end field

.field volatile done:Z

.field final downstream:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TR;>;"
        }
    .end annotation
.end field

.field final error:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field fusionMode:I

.field final limit:I

.field final mapper:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-TT;+",
            "Ljava/lang/Iterable<",
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

.field upstream:Lorg/reactivestreams/q;


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
            "Ljava/lang/Iterable<",
            "+TR;>;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/internal/subscriptions/c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->downstream:Lorg/reactivestreams/p;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->mapper:Lm3/o;

    .line 7
    .line 8
    iput p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->prefetch:I

    .line 9
    .line 10
    shr-int/lit8 p1, p3, 0x2

    .line 11
    .line 12
    sub-int/2addr p3, p1

    .line 13
    iput p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->limit:I

    .line 14
    .line 15
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    .line 22
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 28
    .line 29
    return-void
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
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->cancelled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->cancelled:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->upstream:Lorg/reactivestreams/q;

    .line 9
    .line 10
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

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

.method checkTerminated(ZZLorg/reactivestreams/p;Lio/reactivex/rxjava3/internal/fuseable/q;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lorg/reactivestreams/p<",
            "*>;",
            "Lio/reactivex/rxjava3/internal/fuseable/q<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->cancelled:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->current:Ljava/util/Iterator;

    .line 8
    .line 9
    invoke-interface {p4}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 10
    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    if-eqz p1, :cond_2

    .line 14
    .line 15
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ljava/lang/Throwable;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 26
    .line 27
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/k;->f(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->current:Ljava/util/Iterator;

    .line 32
    .line 33
    invoke-interface {p4}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 34
    .line 35
    .line 36
    invoke-interface {p3, p1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return v2

    .line 40
    :cond_1
    if-eqz p2, :cond_2

    .line 41
    .line 42
    invoke-interface {p3}, Lorg/reactivestreams/p;->onComplete()V

    .line 43
    .line 44
    .line 45
    return v2

    .line 46
    :cond_2
    const/4 p1, 0x0

    .line 47
    return p1
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

.method public clear()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->current:Ljava/util/Iterator;

    .line 3
    .line 4
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 5
    .line 6
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

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
.end method

.method consumedOne(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->consumed:I

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->limit:I

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->consumed:I

    .line 13
    .line 14
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->upstream:Lorg/reactivestreams/q;

    .line 15
    .line 16
    int-to-long v1, p1

    .line 17
    invoke-interface {v0, v1, v2}, Lorg/reactivestreams/q;->request(J)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iput p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->consumed:I

    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method drain()V
    .locals 18

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
    iget-object v2, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->downstream:Lorg/reactivestreams/p;

    .line 11
    .line 12
    iget-object v3, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 13
    .line 14
    iget v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->fusionMode:I

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    if-eq v0, v5, :cond_1

    .line 19
    .line 20
    move v0, v5

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move v0, v4

    .line 23
    :goto_0
    iget-object v6, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->current:Ljava/util/Iterator;

    .line 24
    .line 25
    move v7, v5

    .line 26
    :goto_1
    const/4 v8, 0x0

    .line 27
    if-nez v6, :cond_5

    .line 28
    .line 29
    iget-boolean v9, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->done:Z

    .line 30
    .line 31
    :try_start_0
    invoke-interface {v3}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 35
    if-nez v10, :cond_2

    .line 36
    .line 37
    move v11, v5

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move v11, v4

    .line 40
    :goto_2
    invoke-virtual {v1, v9, v11, v2, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->checkTerminated(ZZLorg/reactivestreams/p;Lio/reactivex/rxjava3/internal/fuseable/q;)Z

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    if-eqz v9, :cond_3

    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    if-eqz v10, :cond_5

    .line 48
    .line 49
    :try_start_1
    iget-object v6, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->mapper:Lm3/o;

    .line 50
    .line 51
    invoke-interface {v6, v10}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Ljava/lang/Iterable;

    .line 56
    .line 57
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    if-nez v9, :cond_4

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->consumedOne(Z)V

    .line 68
    .line 69
    .line 70
    move-object v6, v8

    .line 71
    goto :goto_1

    .line 72
    :cond_4
    iput-object v6, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->current:Ljava/util/Iterator;

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    iget-object v3, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->upstream:Lorg/reactivestreams/q;

    .line 80
    .line 81
    invoke-interface {v3}, Lorg/reactivestreams/q;->cancel()V

    .line 82
    .line 83
    .line 84
    iget-object v3, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 85
    .line 86
    invoke-static {v3, v0}, Lio/reactivex/rxjava3/internal/util/k;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 87
    .line 88
    .line 89
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 90
    .line 91
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/k;->f(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-interface {v2, v0}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    move-object v4, v0

    .line 101
    invoke-static {v4}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->upstream:Lorg/reactivestreams/q;

    .line 105
    .line 106
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 107
    .line 108
    .line 109
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 110
    .line 111
    invoke-static {v0, v4}, Lio/reactivex/rxjava3/internal/util/k;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 112
    .line 113
    .line 114
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 115
    .line 116
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/k;->f(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iput-object v8, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->current:Ljava/util/Iterator;

    .line 121
    .line 122
    invoke-interface {v3}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 123
    .line 124
    .line 125
    invoke-interface {v2, v0}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_5
    :goto_3
    if-eqz v6, :cond_d

    .line 130
    .line 131
    iget-object v9, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 132
    .line 133
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 134
    .line 135
    .line 136
    move-result-wide v9

    .line 137
    const-wide/16 v11, 0x0

    .line 138
    .line 139
    move-wide v13, v11

    .line 140
    :goto_4
    cmp-long v15, v13, v9

    .line 141
    .line 142
    if-eqz v15, :cond_9

    .line 143
    .line 144
    iget-boolean v15, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->done:Z

    .line 145
    .line 146
    invoke-virtual {v1, v15, v4, v2, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->checkTerminated(ZZLorg/reactivestreams/p;Lio/reactivex/rxjava3/internal/fuseable/q;)Z

    .line 147
    .line 148
    .line 149
    move-result v15

    .line 150
    if-eqz v15, :cond_6

    .line 151
    .line 152
    return-void

    .line 153
    :cond_6
    :try_start_2
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v15

    .line 157
    const-string v5, "The iterator returned a null value"

    .line 158
    .line 159
    invoke-static {v15, v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 160
    .line 161
    .line 162
    invoke-interface {v2, v15}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iget-boolean v5, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->done:Z

    .line 166
    .line 167
    invoke-virtual {v1, v5, v4, v2, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->checkTerminated(ZZLorg/reactivestreams/p;Lio/reactivex/rxjava3/internal/fuseable/q;)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_7

    .line 172
    .line 173
    return-void

    .line 174
    :cond_7
    const-wide/16 v16, 0x1

    .line 175
    .line 176
    add-long v13, v13, v16

    .line 177
    .line 178
    :try_start_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 182
    if-nez v5, :cond_8

    .line 183
    .line 184
    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->consumedOne(Z)V

    .line 185
    .line 186
    .line 187
    iput-object v8, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->current:Ljava/util/Iterator;

    .line 188
    .line 189
    move-object v6, v8

    .line 190
    goto :goto_5

    .line 191
    :cond_8
    const/4 v5, 0x1

    .line 192
    goto :goto_4

    .line 193
    :catchall_2
    move-exception v0

    .line 194
    move-object v3, v0

    .line 195
    invoke-static {v3}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    iput-object v8, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->current:Ljava/util/Iterator;

    .line 199
    .line 200
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->upstream:Lorg/reactivestreams/q;

    .line 201
    .line 202
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 203
    .line 204
    .line 205
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 206
    .line 207
    invoke-static {v0, v3}, Lio/reactivex/rxjava3/internal/util/k;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 208
    .line 209
    .line 210
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 211
    .line 212
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/k;->f(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-interface {v2, v0}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :catchall_3
    move-exception v0

    .line 221
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    iput-object v8, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->current:Ljava/util/Iterator;

    .line 225
    .line 226
    iget-object v3, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->upstream:Lorg/reactivestreams/q;

    .line 227
    .line 228
    invoke-interface {v3}, Lorg/reactivestreams/q;->cancel()V

    .line 229
    .line 230
    .line 231
    iget-object v3, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 232
    .line 233
    invoke-static {v3, v0}, Lio/reactivex/rxjava3/internal/util/k;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 234
    .line 235
    .line 236
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 237
    .line 238
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/k;->f(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-interface {v2, v0}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :cond_9
    :goto_5
    cmp-long v5, v13, v9

    .line 247
    .line 248
    if-nez v5, :cond_b

    .line 249
    .line 250
    iget-boolean v5, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->done:Z

    .line 251
    .line 252
    invoke-interface {v3}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    if-eqz v8, :cond_a

    .line 257
    .line 258
    if-nez v6, :cond_a

    .line 259
    .line 260
    const/4 v8, 0x1

    .line 261
    goto :goto_6

    .line 262
    :cond_a
    move v8, v4

    .line 263
    :goto_6
    invoke-virtual {v1, v5, v8, v2, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->checkTerminated(ZZLorg/reactivestreams/p;Lio/reactivex/rxjava3/internal/fuseable/q;)Z

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    if-eqz v5, :cond_b

    .line 268
    .line 269
    return-void

    .line 270
    :cond_b
    cmp-long v5, v13, v11

    .line 271
    .line 272
    if-eqz v5, :cond_c

    .line 273
    .line 274
    const-wide v11, 0x7fffffffffffffffL

    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    cmp-long v5, v9, v11

    .line 280
    .line 281
    if-eqz v5, :cond_c

    .line 282
    .line 283
    iget-object v5, v1, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 284
    .line 285
    neg-long v8, v13

    .line 286
    invoke-virtual {v5, v8, v9}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 287
    .line 288
    .line 289
    :cond_c
    if-nez v6, :cond_d

    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_d
    neg-int v5, v7

    .line 293
    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 294
    .line 295
    .line 296
    move-result v7

    .line 297
    if-nez v7, :cond_e

    .line 298
    .line 299
    return-void

    .line 300
    :cond_e
    :goto_7
    const/4 v5, 0x1

    .line 301
    goto/16 :goto_1
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

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->current:Ljava/util/Iterator;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->done:Z

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
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->done:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->drain()V

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
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->done:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/util/k;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->done:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->drain()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->done:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->fusionMode:I

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    new-instance p1, Lio/reactivex/rxjava3/exceptions/c;

    .line 19
    .line 20
    const-string v0, "Queue is full?!"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Lio/reactivex/rxjava3/exceptions/c;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->onError(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->drain()V

    .line 30
    .line 31
    .line 32
    return-void
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

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->upstream:Lorg/reactivestreams/q;

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
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->upstream:Lorg/reactivestreams/q;

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
    const/4 v1, 0x3

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
    iput v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->fusionMode:I

    .line 27
    .line 28
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 29
    .line 30
    iput-boolean v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->done:Z

    .line 31
    .line 32
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->downstream:Lorg/reactivestreams/p;

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
    iput v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->fusionMode:I

    .line 42
    .line 43
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 44
    .line 45
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->downstream:Lorg/reactivestreams/p;

    .line 46
    .line 47
    invoke-interface {v0, p0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 48
    .line 49
    .line 50
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->prefetch:I

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
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->prefetch:I

    .line 60
    .line 61
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/queue/b;-><init>(I)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 65
    .line 66
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->downstream:Lorg/reactivestreams/p;

    .line 67
    .line 68
    invoke-interface {v0, p0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 69
    .line 70
    .line 71
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->prefetch:I

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

.method public poll()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Ll3/g;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->current:Ljava/util/Iterator;

    .line 2
    .line 3
    :goto_0
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 7
    .line 8
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->mapper:Lm3/o;

    .line 16
    .line 17
    invoke-interface {v2, v0}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/Iterable;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    move-object v0, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->current:Ljava/util/Iterator;

    .line 36
    .line 37
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v3, "The iterator returned a null value"

    .line 42
    .line 43
    invoke-static {v2, v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->current:Ljava/util/Iterator;

    .line 53
    .line 54
    :cond_3
    return-object v2
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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 8
    .line 9
    invoke-static {v0, p1, p2}, Lio/reactivex/rxjava3/internal/util/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->drain()V

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

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    iget p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/g1$a;->fusionMode:I

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
