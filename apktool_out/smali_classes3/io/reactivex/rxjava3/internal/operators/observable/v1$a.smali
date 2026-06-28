.class final Lio/reactivex/rxjava3/internal/operators/observable/v1$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/disposables/e;
.implements Lio/reactivex/rxjava3/internal/operators/observable/o1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T",
        "Left:Ljava/lang/Object;",
        "TRight:",
        "Ljava/lang/Object;",
        "T",
        "LeftEnd:Ljava/lang/Object;",
        "TRightEnd:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/rxjava3/disposables/e;",
        "Lio/reactivex/rxjava3/internal/operators/observable/o1$b;"
    }
.end annotation


# static fields
.field static final LEFT_CLOSE:Ljava/lang/Integer;

.field static final LEFT_VALUE:Ljava/lang/Integer;

.field static final RIGHT_CLOSE:Ljava/lang/Integer;

.field static final RIGHT_VALUE:Ljava/lang/Integer;

.field private static final serialVersionUID:J = -0x54414b546f40e739L


# instance fields
.field final active:Ljava/util/concurrent/atomic/AtomicInteger;

.field volatile cancelled:Z

.field final disposables:Lio/reactivex/rxjava3/disposables/c;

.field final downstream:Lio/reactivex/rxjava3/core/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/p0<",
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

.field final leftEnd:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-TT",
            "Left;",
            "+",
            "Lio/reactivex/rxjava3/core/n0<",
            "TT",
            "LeftEnd;",
            ">;>;"
        }
    .end annotation
.end field

.field leftIndex:I

.field final lefts:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "TT",
            "Left;",
            ">;"
        }
    .end annotation
.end field

.field final queue:Lio/reactivex/rxjava3/internal/queue/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/queue/c<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final resultSelector:Lm3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/c<",
            "-TT",
            "Left;",
            "-TTRight;+TR;>;"
        }
    .end annotation
.end field

.field final rightEnd:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-TTRight;+",
            "Lio/reactivex/rxjava3/core/n0<",
            "TTRightEnd;>;>;"
        }
    .end annotation
.end field

.field rightIndex:I

.field final rights:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "TTRight;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->LEFT_VALUE:Ljava/lang/Integer;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->RIGHT_VALUE:Ljava/lang/Integer;

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->LEFT_CLOSE:Ljava/lang/Integer;

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->RIGHT_CLOSE:Ljava/lang/Integer;

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

.method constructor <init>(Lio/reactivex/rxjava3/core/p0;Lm3/o;Lm3/o;Lm3/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TR;>;",
            "Lm3/o<",
            "-TT",
            "Left;",
            "+",
            "Lio/reactivex/rxjava3/core/n0<",
            "TT",
            "LeftEnd;",
            ">;>;",
            "Lm3/o<",
            "-TTRight;+",
            "Lio/reactivex/rxjava3/core/n0<",
            "TTRightEnd;>;>;",
            "Lm3/c<",
            "-TT",
            "Left;",
            "-TTRight;+TR;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 5
    .line 6
    new-instance p1, Lio/reactivex/rxjava3/disposables/c;

    .line 7
    .line 8
    invoke-direct {p1}, Lio/reactivex/rxjava3/disposables/c;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

    .line 12
    .line 13
    new-instance p1, Lio/reactivex/rxjava3/internal/queue/c;

    .line 14
    .line 15
    invoke-static {}, Lio/reactivex/rxjava3/core/i0;->Z()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-direct {p1, v0}, Lio/reactivex/rxjava3/internal/queue/c;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->queue:Lio/reactivex/rxjava3/internal/queue/c;

    .line 23
    .line 24
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->lefts:Ljava/util/Map;

    .line 30
    .line 31
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->rights:Ljava/util/Map;

    .line 37
    .line 38
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 44
    .line 45
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->leftEnd:Lm3/o;

    .line 46
    .line 47
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->rightEnd:Lm3/o;

    .line 48
    .line 49
    iput-object p4, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->resultSelector:Lm3/c;

    .line 50
    .line 51
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 52
    .line 53
    const/4 p2, 0x2

    .line 54
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->active:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 58
    .line 59
    return-void
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
.method cancelAll()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->dispose()V

    return-void
.end method

.method public dispose()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->cancelled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->cancelled:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->cancelAll()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->queue:Lio/reactivex/rxjava3/internal/queue/c;

    .line 18
    .line 19
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->clear()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
    .line 23
.end method

.method drain()V
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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->queue:Lio/reactivex/rxjava3/internal/queue/c;

    .line 9
    .line 10
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    move v3, v2

    .line 14
    :cond_1
    :goto_0
    iget-boolean v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->cancelled:Z

    .line 15
    .line 16
    if-eqz v4, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->clear()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_2
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Ljava/lang/Throwable;

    .line 29
    .line 30
    if-eqz v4, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->clear()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->cancelAll()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->errorAll(Lio/reactivex/rxjava3/core/p0;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_3
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->active:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    const/4 v5, 0x0

    .line 49
    if-nez v4, :cond_4

    .line 50
    .line 51
    move v4, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_4
    move v4, v5

    .line 54
    :goto_1
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->poll()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Ljava/lang/Integer;

    .line 59
    .line 60
    if-nez v6, :cond_5

    .line 61
    .line 62
    move v7, v2

    .line 63
    goto :goto_2

    .line 64
    :cond_5
    move v7, v5

    .line 65
    :goto_2
    if-eqz v4, :cond_6

    .line 66
    .line 67
    if-eqz v7, :cond_6

    .line 68
    .line 69
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->lefts:Ljava/util/Map;

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->rights:Ljava/util/Map;

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

    .line 80
    .line 81
    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->dispose()V

    .line 82
    .line 83
    .line 84
    invoke-interface {v1}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_6
    if-eqz v7, :cond_7

    .line 89
    .line 90
    neg-int v3, v3

    .line 91
    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-nez v3, :cond_1

    .line 96
    .line 97
    return-void

    .line 98
    :cond_7
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->poll()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    sget-object v7, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->LEFT_VALUE:Ljava/lang/Integer;

    .line 103
    .line 104
    const-string v8, "The resultSelector returned a null value"

    .line 105
    .line 106
    if-ne v6, v7, :cond_9

    .line 107
    .line 108
    iget v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->leftIndex:I

    .line 109
    .line 110
    add-int/lit8 v6, v5, 0x1

    .line 111
    .line 112
    iput v6, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->leftIndex:I

    .line 113
    .line 114
    iget-object v6, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->lefts:Ljava/util/Map;

    .line 115
    .line 116
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-interface {v6, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    :try_start_0
    iget-object v6, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->leftEnd:Lm3/o;

    .line 124
    .line 125
    invoke-interface {v6, v4}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    const-string v7, "The leftEnd returned a null ObservableSource"

    .line 130
    .line 131
    invoke-static {v6, v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    check-cast v6, Lio/reactivex/rxjava3/core/n0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 135
    .line 136
    new-instance v7, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;

    .line 137
    .line 138
    invoke-direct {v7, p0, v2, v5}, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;-><init>(Lio/reactivex/rxjava3/internal/operators/observable/o1$b;ZI)V

    .line 139
    .line 140
    .line 141
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

    .line 142
    .line 143
    invoke-virtual {v5, v7}, Lio/reactivex/rxjava3/disposables/c;->b(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 144
    .line 145
    .line 146
    invoke-interface {v6, v7}, Lio/reactivex/rxjava3/core/n0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    .line 147
    .line 148
    .line 149
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 150
    .line 151
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    check-cast v5, Ljava/lang/Throwable;

    .line 156
    .line 157
    if-eqz v5, :cond_8

    .line 158
    .line 159
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->clear()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->cancelAll()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, v1}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->errorAll(Lio/reactivex/rxjava3/core/p0;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_8
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->rights:Ljava/util/Map;

    .line 170
    .line 171
    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    if-eqz v6, :cond_1

    .line 184
    .line 185
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    :try_start_1
    iget-object v7, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->resultSelector:Lm3/c;

    .line 190
    .line 191
    invoke-interface {v7, v4, v6}, Lm3/c;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-static {v6, v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 196
    .line 197
    .line 198
    invoke-interface {v1, v6}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :catchall_0
    move-exception v2

    .line 203
    invoke-virtual {p0, v2, v1, v0}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->fail(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/p0;Lio/reactivex/rxjava3/internal/queue/c;)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :catchall_1
    move-exception v2

    .line 208
    invoke-virtual {p0, v2, v1, v0}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->fail(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/p0;Lio/reactivex/rxjava3/internal/queue/c;)V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_9
    sget-object v7, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->RIGHT_VALUE:Ljava/lang/Integer;

    .line 213
    .line 214
    if-ne v6, v7, :cond_b

    .line 215
    .line 216
    iget v6, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->rightIndex:I

    .line 217
    .line 218
    add-int/lit8 v7, v6, 0x1

    .line 219
    .line 220
    iput v7, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->rightIndex:I

    .line 221
    .line 222
    iget-object v7, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->rights:Ljava/util/Map;

    .line 223
    .line 224
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v9

    .line 228
    invoke-interface {v7, v9, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    :try_start_2
    iget-object v7, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->rightEnd:Lm3/o;

    .line 232
    .line 233
    invoke-interface {v7, v4}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    const-string v9, "The rightEnd returned a null ObservableSource"

    .line 238
    .line 239
    invoke-static {v7, v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    check-cast v7, Lio/reactivex/rxjava3/core/n0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 243
    .line 244
    new-instance v9, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;

    .line 245
    .line 246
    invoke-direct {v9, p0, v5, v6}, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;-><init>(Lio/reactivex/rxjava3/internal/operators/observable/o1$b;ZI)V

    .line 247
    .line 248
    .line 249
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

    .line 250
    .line 251
    invoke-virtual {v5, v9}, Lio/reactivex/rxjava3/disposables/c;->b(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 252
    .line 253
    .line 254
    invoke-interface {v7, v9}, Lio/reactivex/rxjava3/core/n0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    .line 255
    .line 256
    .line 257
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 258
    .line 259
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    check-cast v5, Ljava/lang/Throwable;

    .line 264
    .line 265
    if-eqz v5, :cond_a

    .line 266
    .line 267
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->clear()V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->cancelAll()V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0, v1}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->errorAll(Lio/reactivex/rxjava3/core/p0;)V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :cond_a
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->lefts:Ljava/util/Map;

    .line 278
    .line 279
    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    if-eqz v6, :cond_1

    .line 292
    .line 293
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    :try_start_3
    iget-object v7, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->resultSelector:Lm3/c;

    .line 298
    .line 299
    invoke-interface {v7, v6, v4}, Lm3/c;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    invoke-static {v6, v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 304
    .line 305
    .line 306
    invoke-interface {v1, v6}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    goto :goto_4

    .line 310
    :catchall_2
    move-exception v2

    .line 311
    invoke-virtual {p0, v2, v1, v0}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->fail(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/p0;Lio/reactivex/rxjava3/internal/queue/c;)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :catchall_3
    move-exception v2

    .line 316
    invoke-virtual {p0, v2, v1, v0}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->fail(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/p0;Lio/reactivex/rxjava3/internal/queue/c;)V

    .line 317
    .line 318
    .line 319
    return-void

    .line 320
    :cond_b
    sget-object v5, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->LEFT_CLOSE:Ljava/lang/Integer;

    .line 321
    .line 322
    if-ne v6, v5, :cond_c

    .line 323
    .line 324
    check-cast v4, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;

    .line 325
    .line 326
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->lefts:Ljava/util/Map;

    .line 327
    .line 328
    iget v6, v4, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;->index:I

    .line 329
    .line 330
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 331
    .line 332
    .line 333
    move-result-object v6

    .line 334
    invoke-interface {v5, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

    .line 338
    .line 339
    invoke-virtual {v5, v4}, Lio/reactivex/rxjava3/disposables/c;->a(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 340
    .line 341
    .line 342
    goto/16 :goto_0

    .line 343
    .line 344
    :cond_c
    check-cast v4, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;

    .line 345
    .line 346
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->rights:Ljava/util/Map;

    .line 347
    .line 348
    iget v6, v4, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;->index:I

    .line 349
    .line 350
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    invoke-interface {v5, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

    .line 358
    .line 359
    invoke-virtual {v5, v4}, Lio/reactivex/rxjava3/disposables/c;->a(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 360
    .line 361
    .line 362
    goto/16 :goto_0
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

.method errorAll(Lio/reactivex/rxjava3/core/p0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/k;->f(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->lefts:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->rights:Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method fail(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/p0;Lio/reactivex/rxjava3/internal/queue/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/rxjava3/core/p0<",
            "*>;",
            "Lio/reactivex/rxjava3/internal/queue/c<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/util/k;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3}, Lio/reactivex/rxjava3/internal/queue/c;->clear()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->cancelAll()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p2}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->errorAll(Lio/reactivex/rxjava3/core/p0;)V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public innerClose(ZLio/reactivex/rxjava3/internal/operators/observable/o1$c;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->queue:Lio/reactivex/rxjava3/internal/queue/c;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->LEFT_CLOSE:Ljava/lang/Integer;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object p1, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->RIGHT_CLOSE:Ljava/lang/Integer;

    .line 10
    .line 11
    :goto_0
    invoke-virtual {v0, p1, p2}, Lio/reactivex/rxjava3/internal/queue/c;->offer(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->drain()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
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

.method public innerCloseError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/util/k;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->drain()V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    :goto_0
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

.method public innerComplete(Lio/reactivex/rxjava3/internal/operators/observable/o1$d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/disposables/c;->c(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->active:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->drain()V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public innerError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/util/k;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->active:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->drain()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public innerValue(ZLjava/lang/Object;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->queue:Lio/reactivex/rxjava3/internal/queue/c;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->LEFT_VALUE:Ljava/lang/Integer;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object p1, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->RIGHT_VALUE:Ljava/lang/Integer;

    .line 10
    .line 11
    :goto_0
    invoke-virtual {v0, p1, p2}, Lio/reactivex/rxjava3/internal/queue/c;->offer(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->drain()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
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

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v1$a;->cancelled:Z

    return v0
.end method
