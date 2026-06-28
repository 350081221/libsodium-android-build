.class final Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;
.super Lio/reactivex/rxjava3/internal/subscriptions/f;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/operators/flowable/r3$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/r3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/subscriptions/f<",
        "Ljava/lang/Boolean;",
        ">;",
        "Lio/reactivex/rxjava3/internal/operators/flowable/r3$b;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x55bcb3aaa8a061f8L


# instance fields
.field final comparer:Lm3/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/d<",
            "-TT;-TT;>;"
        }
    .end annotation
.end field

.field final errors:Lio/reactivex/rxjava3/internal/util/c;

.field final first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/flowable/r3$c<",
            "TT;>;"
        }
    .end annotation
.end field

.field final second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/flowable/r3$c<",
            "TT;>;"
        }
    .end annotation
.end field

.field v1:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field v2:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final wip:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;ILm3/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-",
            "Ljava/lang/Boolean;",
            ">;I",
            "Lm3/d<",
            "-TT;-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/f;-><init>(Lorg/reactivestreams/p;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->comparer:Lm3/d;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->wip:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    new-instance p1, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 14
    .line 15
    invoke-direct {p1, p0, p2}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;-><init>(Lio/reactivex/rxjava3/internal/operators/flowable/r3$b;I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 19
    .line 20
    new-instance p1, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 21
    .line 22
    invoke-direct {p1, p0, p2}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;-><init>(Lio/reactivex/rxjava3/internal/operators/flowable/r3$b;I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 26
    .line 27
    new-instance p1, Lio/reactivex/rxjava3/internal/util/c;

    .line 28
    .line 29
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 33
    .line 34
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
    invoke-super {p0}, Lio/reactivex/rxjava3/internal/subscriptions/f;->cancel()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 5
    .line 6
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->cancel()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 10
    .line 11
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->cancel()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 15
    .line 16
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateAndReport()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->wip:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 28
    .line 29
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->clear()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 33
    .line 34
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->clear()V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
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

.method cancelAndClear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->cancel()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->cancel()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 17
    .line 18
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->clear()V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method

.method public drain()V
    .locals 10

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->wip:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

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
    const/4 v0, 0x1

    .line 11
    move v1, v0

    .line 12
    :cond_1
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 13
    .line 14
    iget-object v2, v2, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 15
    .line 16
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 17
    .line 18
    iget-object v3, v3, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 19
    .line 20
    if-eqz v2, :cond_c

    .line 21
    .line 22
    if-eqz v3, :cond_c

    .line 23
    .line 24
    :goto_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/subscriptions/f;->isCancelled()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_2

    .line 29
    .line 30
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 31
    .line 32
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->clear()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 36
    .line 37
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->clear()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Ljava/lang/Throwable;

    .line 48
    .line 49
    if-eqz v4, :cond_3

    .line 50
    .line 51
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->cancelAndClear()V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 55
    .line 56
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/subscriptions/f;->downstream:Lorg/reactivestreams/p;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 63
    .line 64
    iget-boolean v4, v4, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->done:Z

    .line 65
    .line 66
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->v1:Ljava/lang/Object;

    .line 67
    .line 68
    if-nez v5, :cond_4

    .line 69
    .line 70
    :try_start_0
    invoke-interface {v2}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    iput-object v5, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->v1:Ljava/lang/Object;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->cancelAndClear()V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 90
    .line 91
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/subscriptions/f;->downstream:Lorg/reactivestreams/p;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_4
    :goto_1
    const/4 v6, 0x0

    .line 98
    if-nez v5, :cond_5

    .line 99
    .line 100
    move v7, v0

    .line 101
    goto :goto_2

    .line 102
    :cond_5
    move v7, v6

    .line 103
    :goto_2
    iget-object v8, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 104
    .line 105
    iget-boolean v8, v8, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->done:Z

    .line 106
    .line 107
    iget-object v9, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->v2:Ljava/lang/Object;

    .line 108
    .line 109
    if-nez v9, :cond_6

    .line 110
    .line 111
    :try_start_1
    invoke-interface {v3}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 115
    iput-object v9, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->v2:Ljava/lang/Object;

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :catchall_1
    move-exception v0

    .line 119
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->cancelAndClear()V

    .line 123
    .line 124
    .line 125
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 126
    .line 127
    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 131
    .line 132
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/subscriptions/f;->downstream:Lorg/reactivestreams/p;

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_6
    :goto_3
    if-nez v9, :cond_7

    .line 139
    .line 140
    move v6, v0

    .line 141
    :cond_7
    if-eqz v4, :cond_8

    .line 142
    .line 143
    if-eqz v8, :cond_8

    .line 144
    .line 145
    if-eqz v7, :cond_8

    .line 146
    .line 147
    if-eqz v6, :cond_8

    .line 148
    .line 149
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/subscriptions/f;->complete(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_8
    if-eqz v4, :cond_9

    .line 156
    .line 157
    if-eqz v8, :cond_9

    .line 158
    .line 159
    if-eq v7, v6, :cond_9

    .line 160
    .line 161
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->cancelAndClear()V

    .line 162
    .line 163
    .line 164
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 165
    .line 166
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/subscriptions/f;->complete(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_9
    if-nez v7, :cond_e

    .line 171
    .line 172
    if-eqz v6, :cond_a

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_a
    :try_start_2
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->comparer:Lm3/d;

    .line 176
    .line 177
    invoke-interface {v4, v5, v9}, Lm3/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 181
    if-nez v4, :cond_b

    .line 182
    .line 183
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->cancelAndClear()V

    .line 184
    .line 185
    .line 186
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 187
    .line 188
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/subscriptions/f;->complete(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_b
    const/4 v4, 0x0

    .line 193
    iput-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->v1:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->v2:Ljava/lang/Object;

    .line 196
    .line 197
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 198
    .line 199
    invoke-virtual {v4}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->request()V

    .line 200
    .line 201
    .line 202
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 203
    .line 204
    invoke-virtual {v4}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->request()V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :catchall_2
    move-exception v0

    .line 210
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->cancelAndClear()V

    .line 214
    .line 215
    .line 216
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 217
    .line 218
    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 219
    .line 220
    .line 221
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 222
    .line 223
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/subscriptions/f;->downstream:Lorg/reactivestreams/p;

    .line 224
    .line 225
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :cond_c
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/subscriptions/f;->isCancelled()Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-eqz v2, :cond_d

    .line 234
    .line 235
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 236
    .line 237
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->clear()V

    .line 238
    .line 239
    .line 240
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 241
    .line 242
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->clear()V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :cond_d
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 247
    .line 248
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    check-cast v2, Ljava/lang/Throwable;

    .line 253
    .line 254
    if-eqz v2, :cond_e

    .line 255
    .line 256
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->cancelAndClear()V

    .line 257
    .line 258
    .line 259
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 260
    .line 261
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/subscriptions/f;->downstream:Lorg/reactivestreams/p;

    .line 262
    .line 263
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_e
    :goto_4
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->wip:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 268
    .line 269
    neg-int v1, v1

    .line 270
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    if-nez v1, :cond_1

    .line 275
    .line 276
    return-void
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

.method public innerError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

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
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->drain()V

    .line 10
    .line 11
    .line 12
    :cond_0
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

.method subscribe(Lorg/reactivestreams/o;Lorg/reactivestreams/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/o<",
            "+TT;>;",
            "Lorg/reactivestreams/o<",
            "+TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/r3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 7
    .line 8
    invoke-interface {p2, p1}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

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
.end method
