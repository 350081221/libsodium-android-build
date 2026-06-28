.class final Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Lkotlinx/coroutines/s0;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$job$1"
    f = "RoomDatabaseExt.kt"
    i = {}
    l = {
        0xe6
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/s0;",
        "Lkotlin/r2;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $$this$callbackFlow:Lkotlinx/coroutines/channels/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/e0<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $emitInitialState:Z

.field final synthetic $ignoreInvalidation:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic $observer:Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$observer$1;

.field final synthetic $tables:[Ljava/lang/String;

.field final synthetic $this_invalidationTrackerFlow:Landroidx/room/RoomDatabase;

.field label:I


# direct methods
.method constructor <init>(Landroidx/room/RoomDatabase;Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$observer$1;ZLkotlinx/coroutines/channels/e0;[Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/RoomDatabase;",
            "Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$observer$1;",
            "Z",
            "Lkotlinx/coroutines/channels/e0<",
            "-",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;[",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/atomic/AtomicBoolean;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$this_invalidationTrackerFlow:Landroidx/room/RoomDatabase;

    iput-object p2, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$observer:Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$observer$1;

    iput-boolean p3, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$emitInitialState:Z

    iput-object p4, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$$this$callbackFlow:Lkotlinx/coroutines/channels/e0;

    iput-object p5, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$tables:[Ljava/lang/String;

    iput-object p6, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$ignoreInvalidation:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 8
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance p1, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;

    iget-object v1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$this_invalidationTrackerFlow:Landroidx/room/RoomDatabase;

    iget-object v2, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$observer:Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$observer$1;

    iget-boolean v3, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$emitInitialState:Z

    iget-object v4, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$$this$callbackFlow:Lkotlinx/coroutines/channels/e0;

    iget-object v5, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$tables:[Ljava/lang/String;

    iget-object v6, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$ignoreInvalidation:Ljava/util/concurrent/atomic/AtomicBoolean;

    move-object v0, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;-><init>(Landroidx/room/RoomDatabase;Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$observer$1;ZLkotlinx/coroutines/channels/e0;[Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/s0;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_0
    :try_start_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$this_invalidationTrackerFlow:Landroidx/room/RoomDatabase;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->getInvalidationTracker()Landroidx/room/InvalidationTracker;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object v1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$observer:Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$observer$1;

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Landroidx/room/InvalidationTracker;->addObserver(Landroidx/room/InvalidationTracker$Observer;)V

    .line 38
    .line 39
    .line 40
    :try_start_1
    iget-boolean p1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$emitInitialState:Z

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    iget-object p1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$$this$callbackFlow:Lkotlinx/coroutines/channels/e0;

    .line 45
    .line 46
    iget-object v1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$tables:[Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v1}, Lkotlin/collections/l;->lz([Ljava/lang/Object;)Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {p1, v1}, Lkotlinx/coroutines/channels/h0;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    :cond_2
    iget-object p1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$ignoreInvalidation:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 59
    .line 60
    .line 61
    iput v2, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->label:I

    .line 62
    .line 63
    invoke-static {p0}, Lkotlinx/coroutines/d1;->a(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v0, :cond_3

    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_3
    :goto_0
    new-instance p1, Lkotlin/y;

    .line 71
    .line 72
    invoke-direct {p1}, Lkotlin/y;-><init>()V

    .line 73
    .line 74
    .line 75
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    :goto_1
    iget-object v0, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$this_invalidationTrackerFlow:Landroidx/room/RoomDatabase;

    .line 77
    .line 78
    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->getInvalidationTracker()Landroidx/room/InvalidationTracker;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;->$observer:Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$observer$1;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroidx/room/InvalidationTracker;->removeObserver(Landroidx/room/InvalidationTracker$Observer;)V

    .line 85
    .line 86
    .line 87
    throw p1
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
.end method
