.class final Lio/reactivex/rxjava3/internal/operators/observable/h2$a;
.super Lio/reactivex/rxjava3/internal/observers/b;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/h2;
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
        "Lio/reactivex/rxjava3/internal/observers/b<",
        "TT;>;",
        "Lio/reactivex/rxjava3/core/p0<",
        "TT;>;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x5b45d4a143741ca0L


# instance fields
.field final bufferSize:I

.field final delayError:Z

.field volatile disposed:Z

.field volatile done:Z

.field final downstream:Lio/reactivex/rxjava3/core/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;"
        }
    .end annotation
.end field

.field error:Ljava/lang/Throwable;

.field outputFused:Z

.field queue:Lio/reactivex/rxjava3/internal/fuseable/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/fuseable/q<",
            "TT;>;"
        }
    .end annotation
.end field

.field sourceMode:I

.field upstream:Lio/reactivex/rxjava3/disposables/e;

.field final worker:Lio/reactivex/rxjava3/core/q0$c;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/p0;Lio/reactivex/rxjava3/core/q0$c;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;",
            "Lio/reactivex/rxjava3/core/q0$c;",
            "ZI)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/internal/observers/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

    .line 7
    .line 8
    iput-boolean p3, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->delayError:Z

    .line 9
    .line 10
    iput p4, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->bufferSize:I

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
.method checkTerminated(ZZLio/reactivex/rxjava3/core/p0;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)Z"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->disposed:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 7
    .line 8
    invoke-interface {p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    if-eqz p1, :cond_4

    .line 13
    .line 14
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->error:Ljava/lang/Throwable;

    .line 15
    .line 16
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->delayError:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    if-eqz p2, :cond_4

    .line 21
    .line 22
    iput-boolean v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->disposed:Z

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-interface {p3, p1}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-interface {p3}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

    .line 34
    .line 35
    invoke-interface {p1}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 36
    .line 37
    .line 38
    return v1

    .line 39
    :cond_2
    if-eqz p1, :cond_3

    .line 40
    .line 41
    iput-boolean v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->disposed:Z

    .line 42
    .line 43
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 44
    .line 45
    invoke-interface {p2}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 46
    .line 47
    .line 48
    invoke-interface {p3, p1}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

    .line 52
    .line 53
    invoke-interface {p1}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 54
    .line 55
    .line 56
    return v1

    .line 57
    :cond_3
    if-eqz p2, :cond_4

    .line 58
    .line 59
    iput-boolean v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->disposed:Z

    .line 60
    .line 61
    invoke-interface {p3}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

    .line 65
    .line 66
    invoke-interface {p1}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 67
    .line 68
    .line 69
    return v1

    .line 70
    :cond_4
    const/4 p1, 0x0

    .line 71
    return p1
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

.method public clear()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    return-void
.end method

.method public dispose()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->disposed:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->disposed:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 9
    .line 10
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

    .line 14
    .line 15
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 16
    .line 17
    .line 18
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->outputFused:Z

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 29
    .line 30
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 31
    .line 32
    .line 33
    :cond_0
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
.end method

.method drainFused()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    move v1, v0

    .line 3
    :cond_0
    iget-boolean v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->disposed:Z

    .line 4
    .line 5
    if-eqz v2, :cond_1

    .line 6
    .line 7
    return-void

    .line 8
    :cond_1
    iget-boolean v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->done:Z

    .line 9
    .line 10
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->error:Ljava/lang/Throwable;

    .line 11
    .line 12
    iget-boolean v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->delayError:Z

    .line 13
    .line 14
    if-nez v4, :cond_2

    .line 15
    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->disposed:Z

    .line 21
    .line 22
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 23
    .line 24
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->error:Ljava/lang/Throwable;

    .line 25
    .line 26
    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

    .line 30
    .line 31
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-interface {v3, v4}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    if-eqz v2, :cond_4

    .line 42
    .line 43
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->disposed:Z

    .line 44
    .line 45
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->error:Ljava/lang/Throwable;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 50
    .line 51
    invoke-interface {v1, v0}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 56
    .line 57
    invoke-interface {v0}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    .line 58
    .line 59
    .line 60
    :goto_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

    .line 61
    .line 62
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_4
    neg-int v1, v1

    .line 67
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_0

    .line 72
    .line 73
    return-void
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
    .locals 7

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    move v3, v2

    .line 7
    :cond_0
    iget-boolean v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->done:Z

    .line 8
    .line 9
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    invoke-virtual {p0, v4, v5, v1}, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->checkTerminated(ZZLio/reactivex/rxjava3/core/p0;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    :goto_0
    iget-boolean v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->done:Z

    .line 21
    .line 22
    :try_start_0
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    if-nez v5, :cond_2

    .line 27
    .line 28
    move v6, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    const/4 v6, 0x0

    .line 31
    :goto_1
    invoke-virtual {p0, v4, v6, v1}, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->checkTerminated(ZZLio/reactivex/rxjava3/core/p0;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_3

    .line 36
    .line 37
    return-void

    .line 38
    :cond_3
    if-eqz v6, :cond_4

    .line 39
    .line 40
    neg-int v3, v3

    .line 41
    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_0

    .line 46
    .line 47
    return-void

    .line 48
    :cond_4
    invoke-interface {v1, v5}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v3

    .line 53
    invoke-static {v3}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    iput-boolean v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->disposed:Z

    .line 57
    .line 58
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 59
    .line 60
    invoke-interface {v2}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 64
    .line 65
    .line 66
    invoke-interface {v1, v3}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

    .line 70
    .line 71
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 72
    .line 73
    .line 74
    return-void
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

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->disposed:Z

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->done:Z

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
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->done:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->schedule()V

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
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->done:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->error:Ljava/lang/Throwable;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->done:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->schedule()V

    .line 15
    .line 16
    .line 17
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
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->done:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->sourceMode:I

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->schedule()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->validate(Lio/reactivex/rxjava3/disposables/e;Lio/reactivex/rxjava3/disposables/e;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 10
    .line 11
    instance-of v0, p1, Lio/reactivex/rxjava3/internal/fuseable/l;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p1, Lio/reactivex/rxjava3/internal/fuseable/l;

    .line 16
    .line 17
    const/4 v0, 0x7

    .line 18
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/internal/fuseable/m;->requestFusion(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x1

    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    iput v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->sourceMode:I

    .line 26
    .line 27
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 28
    .line 29
    iput-boolean v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->done:Z

    .line 30
    .line 31
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 32
    .line 33
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->schedule()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    const/4 v1, 0x2

    .line 41
    if-ne v0, v1, :cond_1

    .line 42
    .line 43
    iput v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->sourceMode:I

    .line 44
    .line 45
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 46
    .line 47
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 48
    .line 49
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    new-instance p1, Lio/reactivex/rxjava3/internal/queue/c;

    .line 54
    .line 55
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->bufferSize:I

    .line 56
    .line 57
    invoke-direct {p1, v0}, Lio/reactivex/rxjava3/internal/queue/c;-><init>(I)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 61
    .line 62
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 63
    .line 64
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void
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

.method public poll()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Ll3/g;
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public requestFusion(I)I
    .locals 1

    const/4 v0, 0x2

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->outputFused:Z

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public run()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->outputFused:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->drainFused()V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->drainNormal()V

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

.method schedule()V
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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/h2$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lio/reactivex/rxjava3/core/q0$c;->b(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/e;

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
.end method
