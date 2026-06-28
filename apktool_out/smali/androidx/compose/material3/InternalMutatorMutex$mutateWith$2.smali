.class final Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/InternalMutatorMutex;->mutateWith(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;
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
        "-TR;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.material3.InternalMutatorMutex$mutateWith$2"
    f = "InternalMutatorMutex.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0xb1,
        0x8a
    }
    m = "invokeSuspend"
    n = {
        "mutator",
        "$this$withLock_u24default$iv",
        "mutator",
        "$this$withLock_u24default$iv"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "T",
        "R",
        "Lkotlinx/coroutines/s0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material3/InternalMutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,171:1\n120#2,10:172\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material3/InternalMutatorMutex$mutateWith$2\n*L\n136#1:172,10\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $block:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "TT;",
            "Lkotlin/coroutines/d<",
            "-TR;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $priority:Landroidx/compose/foundation/MutatePriority;

.field final synthetic $receiver:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/material3/InternalMutatorMutex;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/MutatePriority;Landroidx/compose/material3/InternalMutatorMutex;Lv3/p;Ljava/lang/Object;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/MutatePriority;",
            "Landroidx/compose/material3/InternalMutatorMutex;",
            "Lv3/p<",
            "-TT;-",
            "Lkotlin/coroutines/d<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;TT;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->$priority:Landroidx/compose/foundation/MutatePriority;

    iput-object p2, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->this$0:Landroidx/compose/material3/InternalMutatorMutex;

    iput-object p3, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->$block:Lv3/p;

    iput-object p4, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->$receiver:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

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

    new-instance v6, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;

    iget-object v1, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->$priority:Landroidx/compose/foundation/MutatePriority;

    iget-object v2, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->this$0:Landroidx/compose/material3/InternalMutatorMutex;

    iget-object v3, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->$block:Lv3/p;

    iget-object v4, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->$receiver:Ljava/lang/Object;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;-><init>(Landroidx/compose/foundation/MutatePriority;Landroidx/compose/material3/InternalMutatorMutex;Lv3/p;Ljava/lang/Object;Lkotlin/coroutines/d;)V

    iput-object p1, v6, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$0:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
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
    iget v1, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$2:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Landroidx/compose/material3/InternalMutatorMutex;

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$1:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lkotlinx/coroutines/sync/a;

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Landroidx/compose/material3/InternalMutatorMutex$Mutator;

    .line 27
    .line 28
    :try_start_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_1

    .line 32
    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    iget-object v1, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$4:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Landroidx/compose/material3/InternalMutatorMutex;

    .line 47
    .line 48
    iget-object v3, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$3:Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v5, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$2:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v5, Lv3/p;

    .line 53
    .line 54
    iget-object v6, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$1:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v6, Lkotlinx/coroutines/sync/a;

    .line 57
    .line 58
    iget-object v7, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v7, Landroidx/compose/material3/InternalMutatorMutex$Mutator;

    .line 61
    .line 62
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object p1, v6

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$0:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Lkotlinx/coroutines/s0;

    .line 73
    .line 74
    new-instance v1, Landroidx/compose/material3/InternalMutatorMutex$Mutator;

    .line 75
    .line 76
    iget-object v5, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->$priority:Landroidx/compose/foundation/MutatePriority;

    .line 77
    .line 78
    invoke-interface {p1}, Lkotlinx/coroutines/s0;->getCoroutineContext()Lkotlin/coroutines/g;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    sget-object v6, Lkotlinx/coroutines/l2;->U:Lkotlinx/coroutines/l2$b;

    .line 83
    .line 84
    invoke-interface {p1, v6}, Lkotlin/coroutines/g;->get(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    check-cast p1, Lkotlinx/coroutines/l2;

    .line 92
    .line 93
    invoke-direct {v1, v5, p1}, Landroidx/compose/material3/InternalMutatorMutex$Mutator;-><init>(Landroidx/compose/foundation/MutatePriority;Lkotlinx/coroutines/l2;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->this$0:Landroidx/compose/material3/InternalMutatorMutex;

    .line 97
    .line 98
    invoke-static {p1, v1}, Landroidx/compose/material3/InternalMutatorMutex;->access$tryMutateOrCancel(Landroidx/compose/material3/InternalMutatorMutex;Landroidx/compose/material3/InternalMutatorMutex$Mutator;)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->this$0:Landroidx/compose/material3/InternalMutatorMutex;

    .line 102
    .line 103
    invoke-static {p1}, Landroidx/compose/material3/InternalMutatorMutex;->access$getMutex$p(Landroidx/compose/material3/InternalMutatorMutex;)Lkotlinx/coroutines/sync/a;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iget-object v5, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->$block:Lv3/p;

    .line 108
    .line 109
    iget-object v6, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->$receiver:Ljava/lang/Object;

    .line 110
    .line 111
    iget-object v7, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->this$0:Landroidx/compose/material3/InternalMutatorMutex;

    .line 112
    .line 113
    iput-object v1, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object p1, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$1:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v5, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$2:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v6, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$3:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v7, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$4:Ljava/lang/Object;

    .line 122
    .line 123
    iput v3, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->label:I

    .line 124
    .line 125
    invoke-interface {p1, v4, p0}, Lkotlinx/coroutines/sync/a;->f(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    if-ne v3, v0, :cond_3

    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_3
    move-object v3, v6

    .line 133
    move-object v8, v7

    .line 134
    move-object v7, v1

    .line 135
    move-object v1, v8

    .line 136
    :goto_0
    :try_start_1
    iput-object v7, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$0:Ljava/lang/Object;

    .line 137
    .line 138
    iput-object p1, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$1:Ljava/lang/Object;

    .line 139
    .line 140
    iput-object v1, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$2:Ljava/lang/Object;

    .line 141
    .line 142
    iput-object v4, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$3:Ljava/lang/Object;

    .line 143
    .line 144
    iput-object v4, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->L$4:Ljava/lang/Object;

    .line 145
    .line 146
    iput v2, p0, Landroidx/compose/material3/InternalMutatorMutex$mutateWith$2;->label:I

    .line 147
    .line 148
    invoke-interface {v5, v3, p0}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 152
    if-ne v2, v0, :cond_4

    .line 153
    .line 154
    return-object v0

    .line 155
    :cond_4
    move-object v0, v1

    .line 156
    move-object v1, p1

    .line 157
    move-object p1, v2

    .line 158
    move-object v2, v7

    .line 159
    :goto_1
    :try_start_2
    invoke-static {v0}, Landroidx/compose/material3/InternalMutatorMutex;->access$getCurrentMutator$p(Landroidx/compose/material3/InternalMutatorMutex;)Ljava/util/concurrent/atomic/AtomicReference;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0, v2, v4}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 164
    .line 165
    .line 166
    invoke-interface {v1, v4}, Lkotlinx/coroutines/sync/a;->g(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    return-object p1

    .line 170
    :catchall_1
    move-exception v0

    .line 171
    move-object v2, v7

    .line 172
    move-object v8, v1

    .line 173
    move-object v1, p1

    .line 174
    move-object p1, v0

    .line 175
    move-object v0, v8

    .line 176
    :goto_2
    :try_start_3
    invoke-static {v0}, Landroidx/compose/material3/InternalMutatorMutex;->access$getCurrentMutator$p(Landroidx/compose/material3/InternalMutatorMutex;)Ljava/util/concurrent/atomic/AtomicReference;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0, v2, v4}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 184
    :catchall_2
    move-exception p1

    .line 185
    invoke-interface {v1, v4}, Lkotlinx/coroutines/sync/a;->g(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    throw p1
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
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
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
.end method
