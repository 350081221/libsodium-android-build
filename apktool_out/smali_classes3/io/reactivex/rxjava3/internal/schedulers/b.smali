.class public final Lio/reactivex/rxjava3/internal/schedulers/b;
.super Lio/reactivex/rxjava3/core/q0;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/schedulers/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/schedulers/b$c;,
        Lio/reactivex/rxjava3/internal/schedulers/b$a;,
        Lio/reactivex/rxjava3/internal/schedulers/b$b;
    }
.end annotation


# static fields
.field static final d:Lio/reactivex/rxjava3/internal/schedulers/b$b;

.field private static final e:Ljava/lang/String; = "RxComputationThreadPool"

.field static final f:Lio/reactivex/rxjava3/internal/schedulers/k;

.field static final g:Ljava/lang/String; = "rx3.computation-threads"

.field static final h:I

.field static final i:Lio/reactivex/rxjava3/internal/schedulers/b$c;

.field private static final j:Ljava/lang/String; = "rx3.computation-priority"


# instance fields
.field final b:Ljava/util/concurrent/ThreadFactory;

.field final c:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/rxjava3/internal/schedulers/b$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "rx3.computation-threads"

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v1, v2}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v0, v1}, Lio/reactivex/rxjava3/internal/schedulers/b;->t(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sput v0, Lio/reactivex/rxjava3/internal/schedulers/b;->h:I

    .line 25
    .line 26
    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/b$c;

    .line 27
    .line 28
    new-instance v1, Lio/reactivex/rxjava3/internal/schedulers/k;

    .line 29
    .line 30
    const-string v3, "RxComputationShutdown"

    .line 31
    .line 32
    invoke-direct {v1, v3}, Lio/reactivex/rxjava3/internal/schedulers/k;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/schedulers/b$c;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lio/reactivex/rxjava3/internal/schedulers/b;->i:Lio/reactivex/rxjava3/internal/schedulers/b$c;

    .line 39
    .line 40
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/schedulers/i;->dispose()V

    .line 41
    .line 42
    .line 43
    const-string v0, "rx3.computation-priority"

    .line 44
    .line 45
    const/4 v1, 0x5

    .line 46
    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/16 v1, 0xa

    .line 55
    .line 56
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const/4 v1, 0x1

    .line 61
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    new-instance v3, Lio/reactivex/rxjava3/internal/schedulers/k;

    .line 66
    .line 67
    const-string v4, "RxComputationThreadPool"

    .line 68
    .line 69
    invoke-direct {v3, v4, v0, v1}, Lio/reactivex/rxjava3/internal/schedulers/k;-><init>(Ljava/lang/String;IZ)V

    .line 70
    .line 71
    .line 72
    sput-object v3, Lio/reactivex/rxjava3/internal/schedulers/b;->f:Lio/reactivex/rxjava3/internal/schedulers/k;

    .line 73
    .line 74
    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/b$b;

    .line 75
    .line 76
    invoke-direct {v0, v2, v3}, Lio/reactivex/rxjava3/internal/schedulers/b$b;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lio/reactivex/rxjava3/internal/schedulers/b;->d:Lio/reactivex/rxjava3/internal/schedulers/b$b;

    .line 80
    .line 81
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/schedulers/b$b;->c()V

    .line 82
    .line 83
    .line 84
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lio/reactivex/rxjava3/internal/schedulers/b;->f:Lio/reactivex/rxjava3/internal/schedulers/k;

    invoke-direct {p0, v0}, Lio/reactivex/rxjava3/internal/schedulers/b;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ThreadFactory;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/q0;-><init>()V

    .line 3
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/b;->b:Ljava/util/concurrent/ThreadFactory;

    .line 4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lio/reactivex/rxjava3/internal/schedulers/b;->d:Lio/reactivex/rxjava3/internal/schedulers/b$b;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/schedulers/b;->r()V

    return-void
.end method

.method static t(II)I
    .locals 0

    if-lez p1, :cond_1

    if-le p1, p0, :cond_0

    goto :goto_0

    :cond_0
    move p0, p1

    :cond_1
    :goto_0
    return p0
.end method


# virtual methods
.method public a(ILio/reactivex/rxjava3/internal/schedulers/o$a;)V
    .locals 1

    .line 1
    const-string v0, "number > 0 required"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lio/reactivex/rxjava3/internal/schedulers/b$b;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p2}, Lio/reactivex/rxjava3/internal/schedulers/b$b;->a(ILio/reactivex/rxjava3/internal/schedulers/o$a;)V

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

.method public c()Lio/reactivex/rxjava3/core/q0$c;
    .locals 2
    .annotation build Ll3/f;
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/b$a;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/schedulers/b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/reactivex/rxjava3/internal/schedulers/b$b;

    invoke-virtual {v1}, Lio/reactivex/rxjava3/internal/schedulers/b$b;->b()Lio/reactivex/rxjava3/internal/schedulers/b$c;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/schedulers/b$a;-><init>(Lio/reactivex/rxjava3/internal/schedulers/b$c;)V

    return-object v0
.end method

.method public g(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/disposables/e;
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation build Ll3/f;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/reactivex/rxjava3/internal/schedulers/b$b;

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/schedulers/b$b;->b()Lio/reactivex/rxjava3/internal/schedulers/b$c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1, p2, p3, p4}, Lio/reactivex/rxjava3/internal/schedulers/i;->g(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/disposables/e;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public o(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/disposables/e;
    .locals 8
    .param p1    # Ljava/lang/Runnable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation build Ll3/f;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/reactivex/rxjava3/internal/schedulers/b$b;

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/schedulers/b$b;->b()Lio/reactivex/rxjava3/internal/schedulers/b$c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    move-object v2, p1

    .line 14
    move-wide v3, p2

    .line 15
    move-wide v5, p4

    .line 16
    move-object v7, p6

    .line 17
    invoke-virtual/range {v1 .. v7}, Lio/reactivex/rxjava3/internal/schedulers/i;->o(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/disposables/e;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
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

.method public q()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    sget-object v1, Lio/reactivex/rxjava3/internal/schedulers/b;->d:Lio/reactivex/rxjava3/internal/schedulers/b$b;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lio/reactivex/rxjava3/internal/schedulers/b$b;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/schedulers/b$b;->c()V

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

.method public r()V
    .locals 3

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/b$b;

    .line 2
    .line 3
    sget v1, Lio/reactivex/rxjava3/internal/schedulers/b;->h:I

    .line 4
    .line 5
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/schedulers/b;->b:Ljava/util/concurrent/ThreadFactory;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lio/reactivex/rxjava3/internal/schedulers/b$b;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/schedulers/b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    sget-object v2, Lio/reactivex/rxjava3/internal/schedulers/b;->d:Lio/reactivex/rxjava3/internal/schedulers/b$b;

    .line 13
    .line 14
    invoke-static {v1, v2, v0}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/schedulers/b$b;->c()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
