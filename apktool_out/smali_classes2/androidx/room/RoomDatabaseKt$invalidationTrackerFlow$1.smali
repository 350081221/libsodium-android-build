.class final Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/RoomDatabaseKt;->invalidationTrackerFlow(Landroidx/room/RoomDatabase;[Ljava/lang/String;Z)Lkotlinx/coroutines/flow/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Lkotlinx/coroutines/channels/e0<",
        "-",
        "Ljava/util/Set<",
        "+",
        "Ljava/lang/String;",
        ">;>;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1"
    f = "RoomDatabaseExt.kt"
    i = {}
    l = {
        0xeb
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/channels/e0;",
        "",
        "",
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
.field final synthetic $emitInitialState:Z

.field final synthetic $tables:[Ljava/lang/String;

.field final synthetic $this_invalidationTrackerFlow:Landroidx/room/RoomDatabase;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(ZLandroidx/room/RoomDatabase;[Ljava/lang/String;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/room/RoomDatabase;",
            "[",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->$emitInitialState:Z

    iput-object p2, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->$this_invalidationTrackerFlow:Landroidx/room/RoomDatabase;

    iput-object p3, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->$tables:[Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 4
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

    new-instance v0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;

    iget-boolean v1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->$emitInitialState:Z

    iget-object v2, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->$this_invalidationTrackerFlow:Landroidx/room/RoomDatabase;

    iget-object v3, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->$tables:[Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;-><init>(ZLandroidx/room/RoomDatabase;[Ljava/lang/String;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/channels/e0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->invoke(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/channels/e0;
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
            "Lkotlinx/coroutines/channels/e0<",
            "-",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13
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
    iget v1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lkotlinx/coroutines/channels/e0;

    .line 30
    .line 31
    new-instance v9, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    .line 33
    iget-boolean v1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->$emitInitialState:Z

    .line 34
    .line 35
    invoke-direct {v9, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 36
    .line 37
    .line 38
    new-instance v5, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$observer$1;

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->$tables:[Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct {v5, v1, v9, p1}, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$observer$1;-><init>([Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Lkotlinx/coroutines/channels/e0;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Lkotlinx/coroutines/s0;->getCoroutineContext()Lkotlin/coroutines/g;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sget-object v3, Landroidx/room/TransactionElement;->Key:Landroidx/room/TransactionElement$Key;

    .line 50
    .line 51
    invoke-interface {v1, v3}, Lkotlin/coroutines/g;->get(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Landroidx/room/TransactionElement;

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/room/TransactionElement;->getTransactionDispatcher$room_ktx_release()Lkotlin/coroutines/e;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-nez v1, :cond_3

    .line 64
    .line 65
    :cond_2
    iget-object v1, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->$this_invalidationTrackerFlow:Landroidx/room/RoomDatabase;

    .line 66
    .line 67
    invoke-static {v1}, Landroidx/room/CoroutinesRoomKt;->getQueryDispatcher(Landroidx/room/RoomDatabase;)Lkotlinx/coroutines/n0;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    :cond_3
    const/4 v11, 0x0

    .line 72
    new-instance v12, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;

    .line 73
    .line 74
    iget-object v4, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->$this_invalidationTrackerFlow:Landroidx/room/RoomDatabase;

    .line 75
    .line 76
    iget-boolean v6, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->$emitInitialState:Z

    .line 77
    .line 78
    iget-object v8, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->$tables:[Ljava/lang/String;

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    move-object v3, v12

    .line 82
    move-object v7, p1

    .line 83
    invoke-direct/range {v3 .. v10}, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$job$1;-><init>(Landroidx/room/RoomDatabase;Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$observer$1;ZLkotlinx/coroutines/channels/e0;[Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Lkotlin/coroutines/d;)V

    .line 84
    .line 85
    .line 86
    const/4 v7, 0x2

    .line 87
    const/4 v8, 0x0

    .line 88
    move-object v3, p1

    .line 89
    move-object v4, v1

    .line 90
    move-object v5, v11

    .line 91
    move-object v6, v12

    .line 92
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    new-instance v3, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$1;

    .line 97
    .line 98
    invoke-direct {v3, v1}, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$1;-><init>(Lkotlinx/coroutines/l2;)V

    .line 99
    .line 100
    .line 101
    iput v2, p0, Landroidx/room/RoomDatabaseKt$invalidationTrackerFlow$1;->label:I

    .line 102
    .line 103
    invoke-static {p1, v3, p0}, Lkotlinx/coroutines/channels/c0;->a(Lkotlinx/coroutines/channels/e0;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v0, :cond_4

    .line 108
    .line 109
    return-object v0

    .line 110
    :cond_4
    :goto_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 111
    .line 112
    return-object p1
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
