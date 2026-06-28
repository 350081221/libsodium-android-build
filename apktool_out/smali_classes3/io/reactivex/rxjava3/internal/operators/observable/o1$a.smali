.class final Lio/reactivex/rxjava3/internal/operators/observable/o1$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/disposables/e;
.implements Lio/reactivex/rxjava3/internal/operators/observable/o1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/o1;
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
            "Lio/reactivex/rxjava3/subjects/j<",
            "TTRight;>;>;"
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
            "-",
            "Lio/reactivex/rxjava3/core/i0<",
            "TTRight;>;+TR;>;"
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
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->LEFT_VALUE:Ljava/lang/Integer;

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
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->RIGHT_VALUE:Ljava/lang/Integer;

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
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->LEFT_CLOSE:Ljava/lang/Integer;

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
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->RIGHT_CLOSE:Ljava/lang/Integer;

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
            "-",
            "Lio/reactivex/rxjava3/core/i0<",
            "TTRight;>;+TR;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 5
    .line 6
    new-instance p1, Lio/reactivex/rxjava3/disposables/c;

    .line 7
    .line 8
    invoke-direct {p1}, Lio/reactivex/rxjava3/disposables/c;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

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
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->queue:Lio/reactivex/rxjava3/internal/queue/c;

    .line 23
    .line 24
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->lefts:Ljava/util/Map;

    .line 30
    .line 31
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->rights:Ljava/util/Map;

    .line 37
    .line 38
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 44
    .line 45
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->leftEnd:Lm3/o;

    .line 46
    .line 47
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->rightEnd:Lm3/o;

    .line 48
    .line 49
    iput-object p4, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->resultSelector:Lm3/c;

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
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->active:Ljava/util/concurrent/atomic/AtomicInteger;

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

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->dispose()V

    return-void
.end method

.method public dispose()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->cancelled:Z

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
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->cancelled:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->cancelAll()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->queue:Lio/reactivex/rxjava3/internal/queue/c;

    .line 19
    .line 20
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->clear()V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method drain()V
    .locals 9

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->queue:Lio/reactivex/rxjava3/internal/queue/c;

    .line 9
    .line 10
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    move v3, v2

    .line 14
    :cond_1
    :goto_0
    iget-boolean v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->cancelled:Z

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
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

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
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->cancelAll()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->errorAll(Lio/reactivex/rxjava3/core/p0;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_3
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->active:Ljava/util/concurrent/atomic/AtomicInteger;

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
    if-eqz v4, :cond_7

    .line 66
    .line 67
    if-eqz v7, :cond_7

    .line 68
    .line 69
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->lefts:Ljava/util/Map;

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_6

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Lio/reactivex/rxjava3/subjects/j;

    .line 90
    .line 91
    invoke-virtual {v2}, Lio/reactivex/rxjava3/subjects/j;->onComplete()V

    .line 92
    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->lefts:Ljava/util/Map;

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->rights:Ljava/util/Map;

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

    .line 106
    .line 107
    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->dispose()V

    .line 108
    .line 109
    .line 110
    invoke-interface {v1}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_7
    if-eqz v7, :cond_8

    .line 115
    .line 116
    neg-int v3, v3

    .line 117
    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-nez v3, :cond_1

    .line 122
    .line 123
    return-void

    .line 124
    :cond_8
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->poll()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    sget-object v7, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->LEFT_VALUE:Ljava/lang/Integer;

    .line 129
    .line 130
    if-ne v6, v7, :cond_a

    .line 131
    .line 132
    invoke-static {}, Lio/reactivex/rxjava3/subjects/j;->N8()Lio/reactivex/rxjava3/subjects/j;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    iget v6, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->leftIndex:I

    .line 137
    .line 138
    add-int/lit8 v7, v6, 0x1

    .line 139
    .line 140
    iput v7, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->leftIndex:I

    .line 141
    .line 142
    iget-object v7, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->lefts:Ljava/util/Map;

    .line 143
    .line 144
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    invoke-interface {v7, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    :try_start_0
    iget-object v7, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->leftEnd:Lm3/o;

    .line 152
    .line 153
    invoke-interface {v7, v4}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    const-string v8, "The leftEnd returned a null ObservableSource"

    .line 158
    .line 159
    invoke-static {v7, v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    check-cast v7, Lio/reactivex/rxjava3/core/n0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 163
    .line 164
    new-instance v8, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;

    .line 165
    .line 166
    invoke-direct {v8, p0, v2, v6}, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;-><init>(Lio/reactivex/rxjava3/internal/operators/observable/o1$b;ZI)V

    .line 167
    .line 168
    .line 169
    iget-object v6, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

    .line 170
    .line 171
    invoke-virtual {v6, v8}, Lio/reactivex/rxjava3/disposables/c;->b(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 172
    .line 173
    .line 174
    invoke-interface {v7, v8}, Lio/reactivex/rxjava3/core/n0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    .line 175
    .line 176
    .line 177
    iget-object v6, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 178
    .line 179
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    check-cast v6, Ljava/lang/Throwable;

    .line 184
    .line 185
    if-eqz v6, :cond_9

    .line 186
    .line 187
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->clear()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->cancelAll()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, v1}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->errorAll(Lio/reactivex/rxjava3/core/p0;)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :cond_9
    :try_start_1
    iget-object v6, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->resultSelector:Lm3/c;

    .line 198
    .line 199
    invoke-interface {v6, v4, v5}, Lm3/c;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    const-string v6, "The resultSelector returned a null value"

    .line 204
    .line 205
    invoke-static {v4, v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 206
    .line 207
    .line 208
    invoke-interface {v1, v4}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->rights:Ljava/util/Map;

    .line 212
    .line 213
    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    if-eqz v6, :cond_1

    .line 226
    .line 227
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-virtual {v5, v6}, Lio/reactivex/rxjava3/subjects/j;->onNext(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :catchall_0
    move-exception v2

    .line 236
    invoke-virtual {p0, v2, v1, v0}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->fail(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/p0;Lio/reactivex/rxjava3/internal/queue/c;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :catchall_1
    move-exception v2

    .line 241
    invoke-virtual {p0, v2, v1, v0}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->fail(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/p0;Lio/reactivex/rxjava3/internal/queue/c;)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_a
    sget-object v7, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->RIGHT_VALUE:Ljava/lang/Integer;

    .line 246
    .line 247
    if-ne v6, v7, :cond_c

    .line 248
    .line 249
    iget v6, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->rightIndex:I

    .line 250
    .line 251
    add-int/lit8 v7, v6, 0x1

    .line 252
    .line 253
    iput v7, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->rightIndex:I

    .line 254
    .line 255
    iget-object v7, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->rights:Ljava/util/Map;

    .line 256
    .line 257
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    invoke-interface {v7, v8, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    :try_start_2
    iget-object v7, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->rightEnd:Lm3/o;

    .line 265
    .line 266
    invoke-interface {v7, v4}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    const-string v8, "The rightEnd returned a null ObservableSource"

    .line 271
    .line 272
    invoke-static {v7, v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    check-cast v7, Lio/reactivex/rxjava3/core/n0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 276
    .line 277
    new-instance v8, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;

    .line 278
    .line 279
    invoke-direct {v8, p0, v5, v6}, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;-><init>(Lio/reactivex/rxjava3/internal/operators/observable/o1$b;ZI)V

    .line 280
    .line 281
    .line 282
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

    .line 283
    .line 284
    invoke-virtual {v5, v8}, Lio/reactivex/rxjava3/disposables/c;->b(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 285
    .line 286
    .line 287
    invoke-interface {v7, v8}, Lio/reactivex/rxjava3/core/n0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    .line 288
    .line 289
    .line 290
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 291
    .line 292
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    check-cast v5, Ljava/lang/Throwable;

    .line 297
    .line 298
    if-eqz v5, :cond_b

    .line 299
    .line 300
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->clear()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->cancelAll()V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0, v1}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->errorAll(Lio/reactivex/rxjava3/core/p0;)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :cond_b
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->lefts:Ljava/util/Map;

    .line 311
    .line 312
    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 321
    .line 322
    .line 323
    move-result v6

    .line 324
    if-eqz v6, :cond_1

    .line 325
    .line 326
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    check-cast v6, Lio/reactivex/rxjava3/subjects/j;

    .line 331
    .line 332
    invoke-virtual {v6, v4}, Lio/reactivex/rxjava3/subjects/j;->onNext(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    goto :goto_5

    .line 336
    :catchall_2
    move-exception v2

    .line 337
    invoke-virtual {p0, v2, v1, v0}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->fail(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/p0;Lio/reactivex/rxjava3/internal/queue/c;)V

    .line 338
    .line 339
    .line 340
    return-void

    .line 341
    :cond_c
    sget-object v5, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->LEFT_CLOSE:Ljava/lang/Integer;

    .line 342
    .line 343
    if-ne v6, v5, :cond_d

    .line 344
    .line 345
    check-cast v4, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;

    .line 346
    .line 347
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->lefts:Ljava/util/Map;

    .line 348
    .line 349
    iget v6, v4, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;->index:I

    .line 350
    .line 351
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    invoke-interface {v5, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    check-cast v5, Lio/reactivex/rxjava3/subjects/j;

    .line 360
    .line 361
    iget-object v6, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

    .line 362
    .line 363
    invoke-virtual {v6, v4}, Lio/reactivex/rxjava3/disposables/c;->a(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 364
    .line 365
    .line 366
    if-eqz v5, :cond_1

    .line 367
    .line 368
    invoke-virtual {v5}, Lio/reactivex/rxjava3/subjects/j;->onComplete()V

    .line 369
    .line 370
    .line 371
    goto/16 :goto_0

    .line 372
    .line 373
    :cond_d
    check-cast v4, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;

    .line 374
    .line 375
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->rights:Ljava/util/Map;

    .line 376
    .line 377
    iget v6, v4, Lio/reactivex/rxjava3/internal/operators/observable/o1$c;->index:I

    .line 378
    .line 379
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    invoke-interface {v5, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

    .line 387
    .line 388
    invoke-virtual {v5, v4}, Lio/reactivex/rxjava3/disposables/c;->a(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 389
    .line 390
    .line 391
    goto/16 :goto_0
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
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/k;->f(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->lefts:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lio/reactivex/rxjava3/subjects/j;

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Lio/reactivex/rxjava3/subjects/j;->onError(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->lefts:Ljava/util/Map;

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->rights:Ljava/util/Map;

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    return-void
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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

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
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->cancelAll()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p2}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->errorAll(Lio/reactivex/rxjava3/core/p0;)V

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->queue:Lio/reactivex/rxjava3/internal/queue/c;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->LEFT_CLOSE:Ljava/lang/Integer;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object p1, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->RIGHT_CLOSE:Ljava/lang/Integer;

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
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->drain()V

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

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
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->drain()V

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->disposables:Lio/reactivex/rxjava3/disposables/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/disposables/c;->c(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->active:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->drain()V

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->error:Ljava/util/concurrent/atomic/AtomicReference;

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
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->active:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->drain()V

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->queue:Lio/reactivex/rxjava3/internal/queue/c;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->LEFT_VALUE:Ljava/lang/Integer;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object p1, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->RIGHT_VALUE:Ljava/lang/Integer;

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
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->drain()V

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

    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/o1$a;->cancelled:Z

    return v0
.end method
