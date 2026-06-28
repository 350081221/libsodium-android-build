.class final Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/a0;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/maybe/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "D:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Ljava/lang/Object;",
        ">;",
        "Lio/reactivex/rxjava3/core/a0<",
        "TT;>;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x95bf75d78cfb0efL


# instance fields
.field final disposer:Lm3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/g<",
            "-TD;>;"
        }
    .end annotation
.end field

.field final downstream:Lio/reactivex/rxjava3/core/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/a0<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final eager:Z

.field upstream:Lio/reactivex/rxjava3/disposables/e;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/a0;Ljava/lang/Object;Lm3/g;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/a0<",
            "-TT;>;TD;",
            "Lm3/g<",
            "-TD;>;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->downstream:Lio/reactivex/rxjava3/core/a0;

    .line 5
    .line 6
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->disposer:Lm3/g;

    .line 7
    .line 8
    iput-boolean p4, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->eager:Z

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
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->eager:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->disposeResource()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 9
    .line 10
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 14
    .line 15
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 19
    .line 20
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 24
    .line 25
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 26
    .line 27
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->disposeResource()V

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

.method disposeResource()V
    .locals 2

    .line 1
    invoke-virtual {p0, p0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->disposer:Lm3/g;

    .line 8
    .line 9
    invoke-interface {v1, v0}, Lm3/g;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    :goto_0
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onComplete()V
    .locals 2

    .line 1
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 2
    .line 3
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 4
    .line 5
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->eager:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eq v0, p0, :cond_0

    .line 14
    .line 15
    :try_start_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->disposer:Lm3/g;

    .line 16
    .line 17
    invoke-interface {v1, v0}, Lm3/g;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->downstream:Lio/reactivex/rxjava3/core/a0;

    .line 26
    .line 27
    invoke-interface {v1, v0}, Lio/reactivex/rxjava3/core/a0;->onError(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :cond_1
    :goto_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->downstream:Lio/reactivex/rxjava3/core/a0;

    .line 32
    .line 33
    invoke-interface {v0}, Lio/reactivex/rxjava3/core/a0;->onComplete()V

    .line 34
    .line 35
    .line 36
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->eager:Z

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->disposeResource()V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
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

.method public onError(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 2
    .line 3
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 4
    .line 5
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->eager:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eq v0, p0, :cond_0

    .line 14
    .line 15
    :try_start_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->disposer:Lm3/g;

    .line 16
    .line 17
    invoke-interface {v1, v0}, Lm3/g;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lio/reactivex/rxjava3/exceptions/a;

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    new-array v2, v2, [Ljava/lang/Throwable;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    aput-object p1, v2, v3

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    aput-object v0, v2, p1

    .line 35
    .line 36
    invoke-direct {v1, v2}, Lio/reactivex/rxjava3/exceptions/a;-><init>([Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p1, v1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-void

    .line 42
    :cond_1
    :goto_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->downstream:Lio/reactivex/rxjava3/core/a0;

    .line 43
    .line 44
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/a0;->onError(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->eager:Z

    .line 48
    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->disposeResource()V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
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

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

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
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 10
    .line 11
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->downstream:Lio/reactivex/rxjava3/core/a0;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/a0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

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

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 2
    .line 3
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 4
    .line 5
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->eager:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eq v0, p0, :cond_0

    .line 14
    .line 15
    :try_start_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->disposer:Lm3/g;

    .line 16
    .line 17
    invoke-interface {v1, v0}, Lm3/g;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->downstream:Lio/reactivex/rxjava3/core/a0;

    .line 26
    .line 27
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/a0;->onError(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :cond_1
    :goto_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->downstream:Lio/reactivex/rxjava3/core/a0;

    .line 32
    .line 33
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/a0;->onSuccess(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->eager:Z

    .line 37
    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/v1$a;->disposeResource()V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
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
