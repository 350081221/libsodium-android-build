.class final Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/disposables/e;
.implements Lio/reactivex/rxjava3/internal/operators/flowable/r3$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/s3;
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
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/rxjava3/disposables/e;",
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

.field final downstream:Lio/reactivex/rxjava3/core/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/u0<",
            "-",
            "Ljava/lang/Boolean;",
            ">;"
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


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/u0;ILm3/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/u0<",
            "-",
            "Ljava/lang/Boolean;",
            ">;I",
            "Lm3/d<",
            "-TT;-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 5
    .line 6
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->comparer:Lm3/d;

    .line 7
    .line 8
    new-instance p1, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 9
    .line 10
    invoke-direct {p1, p0, p2}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;-><init>(Lio/reactivex/rxjava3/internal/operators/flowable/r3$b;I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 14
    .line 15
    new-instance p1, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 16
    .line 17
    invoke-direct {p1, p0, p2}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;-><init>(Lio/reactivex/rxjava3/internal/operators/flowable/r3$b;I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 21
    .line 22
    new-instance p1, Lio/reactivex/rxjava3/internal/util/c;

    .line 23
    .line 24
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

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
.method cancelAndClear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->cancel()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->cancel()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

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

.method public dispose()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->cancel()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->cancel()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateAndReport()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 23
    .line 24
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->clear()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 28
    .line 29
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->clear()V

    .line 30
    .line 31
    .line 32
    :cond_0
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

.method public drain()V
    .locals 10

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
    const/4 v0, 0x1

    .line 9
    move v1, v0

    .line 10
    :cond_1
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 11
    .line 12
    iget-object v2, v2, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 13
    .line 14
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 15
    .line 16
    iget-object v3, v3, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 17
    .line 18
    if-eqz v2, :cond_c

    .line 19
    .line 20
    if-eqz v3, :cond_c

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->isDisposed()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 29
    .line 30
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->clear()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 34
    .line 35
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->clear()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Ljava/lang/Throwable;

    .line 46
    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->cancelAndClear()V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 53
    .line 54
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/u0;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 61
    .line 62
    iget-boolean v4, v4, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->done:Z

    .line 63
    .line 64
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->v1:Ljava/lang/Object;

    .line 65
    .line 66
    if-nez v5, :cond_4

    .line 67
    .line 68
    :try_start_0
    invoke-interface {v2}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    iput-object v5, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->v1:Ljava/lang/Object;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->cancelAndClear()V

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 88
    .line 89
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/u0;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_4
    :goto_1
    const/4 v6, 0x0

    .line 96
    if-nez v5, :cond_5

    .line 97
    .line 98
    move v7, v0

    .line 99
    goto :goto_2

    .line 100
    :cond_5
    move v7, v6

    .line 101
    :goto_2
    iget-object v8, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 102
    .line 103
    iget-boolean v8, v8, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->done:Z

    .line 104
    .line 105
    iget-object v9, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->v2:Ljava/lang/Object;

    .line 106
    .line 107
    if-nez v9, :cond_6

    .line 108
    .line 109
    :try_start_1
    invoke-interface {v3}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 113
    iput-object v9, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->v2:Ljava/lang/Object;

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :catchall_1
    move-exception v0

    .line 117
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->cancelAndClear()V

    .line 121
    .line 122
    .line 123
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 124
    .line 125
    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 129
    .line 130
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/u0;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_6
    :goto_3
    if-nez v9, :cond_7

    .line 137
    .line 138
    move v6, v0

    .line 139
    :cond_7
    if-eqz v4, :cond_8

    .line 140
    .line 141
    if-eqz v8, :cond_8

    .line 142
    .line 143
    if-eqz v7, :cond_8

    .line 144
    .line 145
    if-eqz v6, :cond_8

    .line 146
    .line 147
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 148
    .line 149
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/core/u0;->onSuccess(Ljava/lang/Object;)V

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
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->cancelAndClear()V

    .line 162
    .line 163
    .line 164
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 165
    .line 166
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 167
    .line 168
    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/core/u0;->onSuccess(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_9
    if-nez v7, :cond_e

    .line 173
    .line 174
    if-eqz v6, :cond_a

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_a
    :try_start_2
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->comparer:Lm3/d;

    .line 178
    .line 179
    invoke-interface {v4, v5, v9}, Lm3/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 183
    if-nez v4, :cond_b

    .line 184
    .line 185
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->cancelAndClear()V

    .line 186
    .line 187
    .line 188
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 189
    .line 190
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 191
    .line 192
    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/core/u0;->onSuccess(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_b
    const/4 v4, 0x0

    .line 197
    iput-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->v1:Ljava/lang/Object;

    .line 198
    .line 199
    iput-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->v2:Ljava/lang/Object;

    .line 200
    .line 201
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 202
    .line 203
    invoke-virtual {v4}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->request()V

    .line 204
    .line 205
    .line 206
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 207
    .line 208
    invoke-virtual {v4}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->request()V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :catchall_2
    move-exception v0

    .line 214
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->cancelAndClear()V

    .line 218
    .line 219
    .line 220
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 221
    .line 222
    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 223
    .line 224
    .line 225
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 226
    .line 227
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 228
    .line 229
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/u0;)V

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :cond_c
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->isDisposed()Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-eqz v2, :cond_d

    .line 238
    .line 239
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 240
    .line 241
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->clear()V

    .line 242
    .line 243
    .line 244
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 245
    .line 246
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;->clear()V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :cond_d
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    check-cast v2, Ljava/lang/Throwable;

    .line 257
    .line 258
    if-eqz v2, :cond_e

    .line 259
    .line 260
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->cancelAndClear()V

    .line 261
    .line 262
    .line 263
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 264
    .line 265
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 266
    .line 267
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/u0;)V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :cond_e
    :goto_4
    neg-int v1, v1

    .line 272
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-nez v1, :cond_1

    .line 277
    .line 278
    return-void
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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

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
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->drain()V

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

.method public isDisposed()Z
    .locals 2

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lio/reactivex/rxjava3/internal/subscriptions/j;->CANCELLED:Lio/reactivex/rxjava3/internal/subscriptions/j;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->first:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/s3$a;->second:Lio/reactivex/rxjava3/internal/operators/flowable/r3$c;

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
