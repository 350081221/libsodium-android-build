.class public final Lio/reactivex/rxjava3/internal/schedulers/d;
.super Lio/reactivex/rxjava3/core/q0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/schedulers/d$a;,
        Lio/reactivex/rxjava3/internal/schedulers/d$b;,
        Lio/reactivex/rxjava3/internal/schedulers/d$c;
    }
.end annotation


# static fields
.field static final e:Lio/reactivex/rxjava3/core/q0;


# instance fields
.field final b:Z

.field final c:Z

.field final d:Ljava/util/concurrent/Executor;
    .annotation build Ll3/f;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lio/reactivex/rxjava3/schedulers/b;->h()Lio/reactivex/rxjava3/core/q0;

    move-result-object v0

    sput-object v0, Lio/reactivex/rxjava3/internal/schedulers/d;->e:Lio/reactivex/rxjava3/core/q0;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;ZZ)V
    .locals 0
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Ll3/f;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/q0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/d;->d:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-boolean p2, p0, Lio/reactivex/rxjava3/internal/schedulers/d;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lio/reactivex/rxjava3/internal/schedulers/d;->c:Z

    .line 9
    .line 10
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
.method public c()Lio/reactivex/rxjava3/core/q0$c;
    .locals 4
    .annotation build Ll3/f;
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/d$c;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/schedulers/d;->d:Ljava/util/concurrent/Executor;

    iget-boolean v2, p0, Lio/reactivex/rxjava3/internal/schedulers/d;->b:Z

    iget-boolean v3, p0, Lio/reactivex/rxjava3/internal/schedulers/d;->c:Z

    invoke-direct {v0, v1, v2, v3}, Lio/reactivex/rxjava3/internal/schedulers/d$c;-><init>(Ljava/util/concurrent/Executor;ZZ)V

    return-object v0
.end method

.method public e(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/e;
    .locals 2
    .param p1    # Ljava/lang/Runnable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation build Ll3/f;
    .end annotation

    .line 1
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->b0(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/d;->d:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    instance-of v0, v0, Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/m;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/schedulers/m;-><init>(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/d;->d:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 19
    .line 20
    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/schedulers/a;->setFuture(Ljava/util/concurrent/Future;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/schedulers/d;->b:Z

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {v0, p1, v1}, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;-><init>(Ljava/lang/Runnable;Lio/reactivex/rxjava3/disposables/f;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/d;->d:Ljava/util/concurrent/Executor;

    .line 39
    .line 40
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_1
    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/d$c$a;

    .line 45
    .line 46
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/schedulers/d$c$a;-><init>(Ljava/lang/Runnable;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/d;->d:Ljava/util/concurrent/Executor;

    .line 50
    .line 51
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :catch_0
    move-exception p1

    .line 56
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    sget-object p1, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    .line 60
    .line 61
    return-object p1
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

.method public g(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/disposables/e;
    .locals 2
    .param p1    # Ljava/lang/Runnable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation build Ll3/f;
    .end annotation

    .line 1
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->b0(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/d;->d:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    instance-of v0, v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    :try_start_0
    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/m;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/schedulers/m;-><init>(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/d;->d:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 19
    .line 20
    invoke-interface {p1, v0, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/schedulers/a;->setFuture(Ljava/util/concurrent/Future;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :catch_0
    move-exception p1

    .line 29
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/d$b;

    .line 36
    .line 37
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/schedulers/d$b;-><init>(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    sget-object p1, Lio/reactivex/rxjava3/internal/schedulers/d;->e:Lio/reactivex/rxjava3/core/q0;

    .line 41
    .line 42
    new-instance v1, Lio/reactivex/rxjava3/internal/schedulers/d$a;

    .line 43
    .line 44
    invoke-direct {v1, p0, v0}, Lio/reactivex/rxjava3/internal/schedulers/d$a;-><init>(Lio/reactivex/rxjava3/internal/schedulers/d;Lio/reactivex/rxjava3/internal/schedulers/d$b;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v1, p2, p3, p4}, Lio/reactivex/rxjava3/core/q0;->g(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/disposables/e;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object p2, v0, Lio/reactivex/rxjava3/internal/schedulers/d$b;->timed:Lio/reactivex/rxjava3/internal/disposables/f;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Lio/reactivex/rxjava3/internal/disposables/f;->replace(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 54
    .line 55
    .line 56
    return-object v0
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

.method public o(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/disposables/e;
    .locals 8
    .param p1    # Ljava/lang/Runnable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation build Ll3/f;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/d;->d:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    instance-of v0, v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->b0(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :try_start_0
    new-instance v7, Lio/reactivex/rxjava3/internal/schedulers/l;

    .line 12
    .line 13
    invoke-direct {v7, p1}, Lio/reactivex/rxjava3/internal/schedulers/l;-><init>(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/d;->d:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    move-object v0, p1

    .line 19
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 20
    .line 21
    move-object v1, v7

    .line 22
    move-wide v2, p2

    .line 23
    move-wide v4, p4

    .line 24
    move-object v6, p6

    .line 25
    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v7, p1}, Lio/reactivex/rxjava3/internal/schedulers/a;->setFuture(Ljava/util/concurrent/Future;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    return-object v7

    .line 33
    :catch_0
    move-exception p1

    .line 34
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    sget-object p1, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_0
    invoke-super/range {p0 .. p6}, Lio/reactivex/rxjava3/core/q0;->o(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/disposables/e;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1
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
