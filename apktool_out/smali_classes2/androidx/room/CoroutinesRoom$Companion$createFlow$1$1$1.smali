.class final Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1"
    f = "CoroutinesRoom.kt"
    i = {}
    l = {
        0x80,
        0x82
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\u008a@"
    }
    d2 = {
        "R",
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
.field final synthetic $callable:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "TR;>;"
        }
    .end annotation
.end field

.field final synthetic $db:Landroidx/room/RoomDatabase;

.field final synthetic $observer:Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$observer$1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$observer$1;"
        }
    .end annotation
.end field

.field final synthetic $observerChannel:Lkotlinx/coroutines/channels/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/l<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $resultChannel:Lkotlinx/coroutines/channels/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/l<",
            "TR;>;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroidx/room/RoomDatabase;Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$observer$1;Lkotlinx/coroutines/channels/l;Ljava/util/concurrent/Callable;Lkotlinx/coroutines/channels/l;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/RoomDatabase;",
            "Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$observer$1;",
            "Lkotlinx/coroutines/channels/l<",
            "Lkotlin/r2;",
            ">;",
            "Ljava/util/concurrent/Callable<",
            "TR;>;",
            "Lkotlinx/coroutines/channels/l<",
            "TR;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$db:Landroidx/room/RoomDatabase;

    iput-object p2, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$observer:Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$observer$1;

    iput-object p3, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$observerChannel:Lkotlinx/coroutines/channels/l;

    iput-object p4, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$callable:Ljava/util/concurrent/Callable;

    iput-object p5, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$resultChannel:Lkotlinx/coroutines/channels/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 7
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

    new-instance p1, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;

    iget-object v1, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$db:Landroidx/room/RoomDatabase;

    iget-object v2, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$observer:Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$observer$1;

    iget-object v3, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$observerChannel:Lkotlinx/coroutines/channels/l;

    iget-object v4, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$callable:Ljava/util/concurrent/Callable;

    iget-object v5, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$resultChannel:Lkotlinx/coroutines/channels/l;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;-><init>(Landroidx/room/RoomDatabase;Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$observer$1;Lkotlinx/coroutines/channels/l;Ljava/util/concurrent/Callable;Lkotlinx/coroutines/channels/l;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
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
    iget v1, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lkotlinx/coroutines/channels/n;

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    .line 21
    .line 22
    move-object p1, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    iget-object v1, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->L$0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lkotlinx/coroutines/channels/n;

    .line 35
    .line 36
    :try_start_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    .line 39
    move-object v4, v1

    .line 40
    move-object v1, p0

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$db:Landroidx/room/RoomDatabase;

    .line 46
    .line 47
    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->getInvalidationTracker()Landroidx/room/InvalidationTracker;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object v1, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$observer:Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$observer$1;

    .line 52
    .line 53
    invoke-virtual {p1, v1}, Landroidx/room/InvalidationTracker;->addObserver(Landroidx/room/InvalidationTracker$Observer;)V

    .line 54
    .line 55
    .line 56
    :try_start_2
    iget-object p1, p0, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$observerChannel:Lkotlinx/coroutines/channels/l;

    .line 57
    .line 58
    invoke-interface {p1}, Lkotlinx/coroutines/channels/g0;->iterator()Lkotlinx/coroutines/channels/n;

    .line 59
    .line 60
    .line 61
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 62
    :goto_0
    move-object v1, p0

    .line 63
    :goto_1
    :try_start_3
    iput-object p1, v1, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    iput v3, v1, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->label:I

    .line 66
    .line 67
    invoke-interface {p1, v1}, Lkotlinx/coroutines/channels/n;->c(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    if-ne v4, v0, :cond_3

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_3
    move-object v6, v4

    .line 75
    move-object v4, p1

    .line 76
    move-object p1, v6

    .line 77
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_5

    .line 84
    .line 85
    invoke-interface {v4}, Lkotlinx/coroutines/channels/n;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    iget-object p1, v1, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$callable:Ljava/util/concurrent/Callable;

    .line 89
    .line 90
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget-object v5, v1, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$resultChannel:Lkotlinx/coroutines/channels/l;

    .line 95
    .line 96
    iput-object v4, v1, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->L$0:Ljava/lang/Object;

    .line 97
    .line 98
    iput v2, v1, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->label:I

    .line 99
    .line 100
    invoke-interface {v5, p1, v1}, Lkotlinx/coroutines/channels/h0;->F(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 104
    if-ne p1, v0, :cond_4

    .line 105
    .line 106
    return-object v0

    .line 107
    :cond_4
    move-object p1, v4

    .line 108
    goto :goto_1

    .line 109
    :cond_5
    iget-object p1, v1, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$db:Landroidx/room/RoomDatabase;

    .line 110
    .line 111
    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->getInvalidationTracker()Landroidx/room/InvalidationTracker;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iget-object v0, v1, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$observer:Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$observer$1;

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Landroidx/room/InvalidationTracker;->removeObserver(Landroidx/room/InvalidationTracker$Observer;)V

    .line 118
    .line 119
    .line 120
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 121
    .line 122
    return-object p1

    .line 123
    :catchall_0
    move-exception p1

    .line 124
    goto :goto_3

    .line 125
    :catchall_1
    move-exception p1

    .line 126
    move-object v1, p0

    .line 127
    :goto_3
    iget-object v0, v1, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$db:Landroidx/room/RoomDatabase;

    .line 128
    .line 129
    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->getInvalidationTracker()Landroidx/room/InvalidationTracker;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iget-object v1, v1, Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$1;->$observer:Landroidx/room/CoroutinesRoom$Companion$createFlow$1$1$observer$1;

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Landroidx/room/InvalidationTracker;->removeObserver(Landroidx/room/InvalidationTracker$Observer;)V

    .line 136
    .line 137
    .line 138
    throw p1
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
