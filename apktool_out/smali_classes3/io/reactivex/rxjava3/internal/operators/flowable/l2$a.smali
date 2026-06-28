.class final Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;
.implements Lorg/reactivestreams/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/l2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/l2$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;",
        "Lorg/reactivestreams/q;"
    }
.end annotation


# static fields
.field static final OTHER_STATE_CONSUMED_OR_EMPTY:I = 0x2

.field static final OTHER_STATE_HAS_VALUE:I = 0x1

.field private static final serialVersionUID:J = -0x3fbd8a98db8e76f7L


# instance fields
.field volatile cancelled:Z

.field consumed:I

.field final downstream:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TT;>;"
        }
    .end annotation
.end field

.field emitted:J

.field final errors:Lio/reactivex/rxjava3/internal/util/c;

.field final limit:I

.field volatile mainDone:Z

.field final mainSubscription:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lorg/reactivestreams/q;",
            ">;"
        }
    .end annotation
.end field

.field final otherObserver:Lio/reactivex/rxjava3/internal/operators/flowable/l2$a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/flowable/l2$a$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field volatile otherState:I

.field final prefetch:I

.field volatile queue:Lio/reactivex/rxjava3/internal/fuseable/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/fuseable/p<",
            "TT;>;"
        }
    .end annotation
.end field

.field final requested:Ljava/util/concurrent/atomic/AtomicLong;

.field singleItem:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->downstream:Lorg/reactivestreams/p;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->mainSubscription:Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    new-instance p1, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a$a;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a$a;-><init>(Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->otherObserver:Lio/reactivex/rxjava3/internal/operators/flowable/l2$a$a;

    .line 19
    .line 20
    new-instance p1, Lio/reactivex/rxjava3/internal/util/c;

    .line 21
    .line 22
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 26
    .line 27
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 33
    .line 34
    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iput p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->prefetch:I

    .line 39
    .line 40
    shr-int/lit8 v0, p1, 0x2

    .line 41
    .line 42
    sub-int/2addr p1, v0

    .line 43
    iput p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->limit:I

    .line 44
    .line 45
    return-void
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


# virtual methods
.method public cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->cancelled:Z

    .line 3
    .line 4
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->mainSubscription:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/subscriptions/j;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->otherObserver:Lio/reactivex/rxjava3/internal/operators/flowable/l2$a$a;

    .line 10
    .line 11
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 15
    .line 16
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateAndReport()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 27
    .line 28
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->singleItem:Ljava/lang/Object;

    .line 29
    .line 30
    :cond_0
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

.method drain()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->drainLoop()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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

.method drainLoop()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->downstream:Lorg/reactivestreams/p;

    .line 4
    .line 5
    iget-wide v2, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->emitted:J

    .line 6
    .line 7
    iget v4, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->consumed:I

    .line 8
    .line 9
    iget v5, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->limit:I

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    move v7, v6

    .line 13
    :goto_0
    iget-object v8, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 14
    .line 15
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 16
    .line 17
    .line 18
    move-result-wide v8

    .line 19
    :goto_1
    cmp-long v10, v2, v8

    .line 20
    .line 21
    const/4 v12, 0x2

    .line 22
    const/4 v13, 0x0

    .line 23
    if-eqz v10, :cond_8

    .line 24
    .line 25
    iget-boolean v14, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->cancelled:Z

    .line 26
    .line 27
    if-eqz v14, :cond_0

    .line 28
    .line 29
    iput-object v13, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->singleItem:Ljava/lang/Object;

    .line 30
    .line 31
    iput-object v13, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget-object v14, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 35
    .line 36
    invoke-virtual {v14}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v14

    .line 40
    if-eqz v14, :cond_1

    .line 41
    .line 42
    iput-object v13, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->singleItem:Ljava/lang/Object;

    .line 43
    .line 44
    iput-object v13, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 45
    .line 46
    iget-object v1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 47
    .line 48
    iget-object v2, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->downstream:Lorg/reactivestreams/p;

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    iget v14, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->otherState:I

    .line 55
    .line 56
    const-wide/16 v15, 0x1

    .line 57
    .line 58
    if-ne v14, v6, :cond_2

    .line 59
    .line 60
    iget-object v10, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->singleItem:Ljava/lang/Object;

    .line 61
    .line 62
    iput-object v13, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->singleItem:Ljava/lang/Object;

    .line 63
    .line 64
    iput v12, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->otherState:I

    .line 65
    .line 66
    invoke-interface {v1, v10}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    add-long/2addr v2, v15

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    iget-boolean v6, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->mainDone:Z

    .line 72
    .line 73
    iget-object v11, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 74
    .line 75
    if-eqz v11, :cond_3

    .line 76
    .line 77
    invoke-interface {v11}, Lio/reactivex/rxjava3/internal/fuseable/p;->poll()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    move-object v11, v13

    .line 83
    :goto_2
    if-nez v11, :cond_4

    .line 84
    .line 85
    const/16 v17, 0x1

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    const/16 v17, 0x0

    .line 89
    .line 90
    :goto_3
    if-eqz v6, :cond_5

    .line 91
    .line 92
    if-eqz v17, :cond_5

    .line 93
    .line 94
    if-ne v14, v12, :cond_5

    .line 95
    .line 96
    iput-object v13, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 97
    .line 98
    invoke-interface {v1}, Lorg/reactivestreams/p;->onComplete()V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_5
    if-eqz v17, :cond_6

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_6
    invoke-interface {v1, v11}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    add-long/2addr v2, v15

    .line 109
    add-int/lit8 v4, v4, 0x1

    .line 110
    .line 111
    if-ne v4, v5, :cond_7

    .line 112
    .line 113
    iget-object v4, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->mainSubscription:Ljava/util/concurrent/atomic/AtomicReference;

    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, Lorg/reactivestreams/q;

    .line 120
    .line 121
    int-to-long v10, v5

    .line 122
    invoke-interface {v4, v10, v11}, Lorg/reactivestreams/q;->request(J)V

    .line 123
    .line 124
    .line 125
    const/4 v4, 0x0

    .line 126
    :cond_7
    const/4 v6, 0x1

    .line 127
    goto :goto_1

    .line 128
    :cond_8
    :goto_4
    if-nez v10, :cond_d

    .line 129
    .line 130
    iget-boolean v6, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->cancelled:Z

    .line 131
    .line 132
    if-eqz v6, :cond_9

    .line 133
    .line 134
    iput-object v13, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->singleItem:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object v13, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 137
    .line 138
    return-void

    .line 139
    :cond_9
    iget-object v6, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 140
    .line 141
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    if-eqz v6, :cond_a

    .line 146
    .line 147
    iput-object v13, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->singleItem:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v13, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 150
    .line 151
    iget-object v1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 152
    .line 153
    iget-object v2, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->downstream:Lorg/reactivestreams/p;

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_a
    iget-boolean v6, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->mainDone:Z

    .line 160
    .line 161
    iget-object v8, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 162
    .line 163
    if-eqz v8, :cond_c

    .line 164
    .line 165
    invoke-interface {v8}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-eqz v8, :cond_b

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_b
    const/4 v11, 0x0

    .line 173
    goto :goto_6

    .line 174
    :cond_c
    :goto_5
    const/4 v11, 0x1

    .line 175
    :goto_6
    if-eqz v6, :cond_d

    .line 176
    .line 177
    if-eqz v11, :cond_d

    .line 178
    .line 179
    iget v6, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->otherState:I

    .line 180
    .line 181
    if-ne v6, v12, :cond_d

    .line 182
    .line 183
    iput-object v13, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 184
    .line 185
    invoke-interface {v1}, Lorg/reactivestreams/p;->onComplete()V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_d
    iput-wide v2, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->emitted:J

    .line 190
    .line 191
    iput v4, v0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->consumed:I

    .line 192
    .line 193
    neg-int v6, v7

    .line 194
    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-nez v7, :cond_e

    .line 199
    .line 200
    return-void

    .line 201
    :cond_e
    const/4 v6, 0x1

    .line 202
    goto/16 :goto_0
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

.method getOrCreateQueue()Lio/reactivex/rxjava3/internal/fuseable/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/internal/fuseable/p<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lio/reactivex/rxjava3/internal/queue/b;

    .line 6
    .line 7
    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/queue/b;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 15
    .line 16
    :cond_0
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onComplete()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->mainDone:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->drain()V

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
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

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
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->otherObserver:Lio/reactivex/rxjava3/internal/operators/flowable/l2$a$a;

    .line 10
    .line 11
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->drain()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
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

.method public onNext(Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-eqz v2, :cond_4

    .line 8
    .line 9
    iget-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->emitted:J

    .line 10
    .line 11
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    cmp-long v4, v4, v2

    .line 18
    .line 19
    if-eqz v4, :cond_3

    .line 20
    .line 21
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    invoke-interface {v4}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {v4, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    const-wide/16 v4, 0x1

    .line 37
    .line 38
    add-long/2addr v2, v4

    .line 39
    iput-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->emitted:J

    .line 40
    .line 41
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->downstream:Lorg/reactivestreams/p;

    .line 42
    .line 43
    invoke-interface {v2, p1}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->consumed:I

    .line 47
    .line 48
    add-int/2addr p1, v1

    .line 49
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->limit:I

    .line 50
    .line 51
    if-ne p1, v1, :cond_2

    .line 52
    .line 53
    iput v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->consumed:I

    .line 54
    .line 55
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->mainSubscription:Ljava/util/concurrent/atomic/AtomicReference;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lorg/reactivestreams/q;

    .line 62
    .line 63
    int-to-long v1, p1

    .line 64
    invoke-interface {v0, v1, v2}, Lorg/reactivestreams/q;->request(J)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    iput p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->consumed:I

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->getOrCreateQueue()Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    return-void

    .line 85
    :cond_4
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->getOrCreateQueue()Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    return-void

    .line 99
    :cond_5
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->drainLoop()V

    .line 100
    .line 101
    .line 102
    return-void
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

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 3

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->mainSubscription:Ljava/util/concurrent/atomic/AtomicReference;

    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->prefetch:I

    int-to-long v1, v1

    invoke-static {v0, p1, v1, v2}, Lio/reactivex/rxjava3/internal/subscriptions/j;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lorg/reactivestreams/q;J)Z

    return-void
.end method

.method otherError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

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
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->mainSubscription:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/subscriptions/j;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->drain()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
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

.method otherSuccess(Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->emitted:J

    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    cmp-long v0, v4, v2

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const-wide/16 v0, 0x1

    .line 22
    .line 23
    add-long/2addr v2, v0

    .line 24
    iput-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->emitted:J

    .line 25
    .line 26
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->downstream:Lorg/reactivestreams/p;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x2

    .line 32
    iput p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->otherState:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->singleItem:Ljava/lang/Object;

    .line 36
    .line 37
    iput v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->otherState:I

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->singleItem:Ljava/lang/Object;

    .line 47
    .line 48
    iput v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->otherState:I

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->drainLoop()V

    .line 58
    .line 59
    .line 60
    return-void
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

.method public request(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lio/reactivex/rxjava3/internal/util/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/l2$a;->drain()V

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
