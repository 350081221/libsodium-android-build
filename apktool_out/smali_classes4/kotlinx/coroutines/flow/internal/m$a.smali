.class final Lkotlinx/coroutines/flow/internal/m$a;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/flow/internal/m;->a(Lkotlinx/coroutines/flow/j;[Lkotlinx/coroutines/flow/i;Lv3/a;Lv3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;
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
    c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2"
    f = "Combine.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x36,
        0x4c,
        0x4f
    }
    m = "invokeSuspend"
    n = {
        "latestValues",
        "resultChannel",
        "lastReceivedEpoch",
        "remainingAbsentValues",
        "currentEpoch",
        "latestValues",
        "resultChannel",
        "lastReceivedEpoch",
        "remainingAbsentValues",
        "currentEpoch",
        "latestValues",
        "resultChannel",
        "lastReceivedEpoch",
        "remainingAbsentValues",
        "currentEpoch"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "I$0",
        "I$1",
        "L$0",
        "L$1",
        "L$2",
        "I$0",
        "I$1",
        "L$0",
        "L$1",
        "L$2",
        "I$0",
        "I$1"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "R",
        "T",
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
.field final synthetic $arrayFactory:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "[TT;>;"
        }
    .end annotation
.end field

.field final synthetic $flows:[Lkotlinx/coroutines/flow/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlinx/coroutines/flow/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $this_combineInternal:Lkotlinx/coroutines/flow/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/j<",
            "TR;>;"
        }
    .end annotation
.end field

.field final synthetic $transform:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Lkotlinx/coroutines/flow/j<",
            "-TR;>;[TT;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field I$0:I

.field I$1:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>([Lkotlinx/coroutines/flow/i;Lv3/a;Lv3/q;Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lkotlinx/coroutines/flow/i<",
            "+TT;>;",
            "Lv3/a<",
            "[TT;>;",
            "Lv3/q<",
            "-",
            "Lkotlinx/coroutines/flow/j<",
            "-TR;>;-[TT;-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlinx/coroutines/flow/j<",
            "-TR;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlinx/coroutines/flow/internal/m$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/flow/internal/m$a;->$flows:[Lkotlinx/coroutines/flow/i;

    iput-object p2, p0, Lkotlinx/coroutines/flow/internal/m$a;->$arrayFactory:Lv3/a;

    iput-object p3, p0, Lkotlinx/coroutines/flow/internal/m$a;->$transform:Lv3/q;

    iput-object p4, p0, Lkotlinx/coroutines/flow/internal/m$a;->$this_combineInternal:Lkotlinx/coroutines/flow/j;

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

    new-instance v6, Lkotlinx/coroutines/flow/internal/m$a;

    iget-object v1, p0, Lkotlinx/coroutines/flow/internal/m$a;->$flows:[Lkotlinx/coroutines/flow/i;

    iget-object v2, p0, Lkotlinx/coroutines/flow/internal/m$a;->$arrayFactory:Lv3/a;

    iget-object v3, p0, Lkotlinx/coroutines/flow/internal/m$a;->$transform:Lv3/q;

    iget-object v4, p0, Lkotlinx/coroutines/flow/internal/m$a;->$this_combineInternal:Lkotlinx/coroutines/flow/j;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lkotlinx/coroutines/flow/internal/m$a;-><init>([Lkotlinx/coroutines/flow/i;Lv3/a;Lv3/q;Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)V

    iput-object p1, v6, Lkotlinx/coroutines/flow/internal/m$a;->L$0:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/flow/internal/m$a;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/flow/internal/m$a;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/flow/internal/m$a;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lkotlinx/coroutines/flow/internal/m$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lkotlinx/coroutines/flow/internal/m$a;->label:I

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    if-eq v2, v5, :cond_2

    .line 15
    .line 16
    if-eq v2, v4, :cond_1

    .line 17
    .line 18
    if-ne v2, v3, :cond_0

    .line 19
    .line 20
    iget v2, v0, Lkotlinx/coroutines/flow/internal/m$a;->I$1:I

    .line 21
    .line 22
    iget v6, v0, Lkotlinx/coroutines/flow/internal/m$a;->I$0:I

    .line 23
    .line 24
    iget-object v7, v0, Lkotlinx/coroutines/flow/internal/m$a;->L$2:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v7, [B

    .line 27
    .line 28
    iget-object v8, v0, Lkotlinx/coroutines/flow/internal/m$a;->L$1:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v8, Lkotlinx/coroutines/channels/l;

    .line 31
    .line 32
    iget-object v9, v0, Lkotlinx/coroutines/flow/internal/m$a;->L$0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v9, [Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move/from16 v21, v2

    .line 40
    .line 41
    move-object v2, v7

    .line 42
    move-object v7, v8

    .line 43
    move-object v13, v9

    .line 44
    move-object v8, v0

    .line 45
    goto/16 :goto_3

    .line 46
    .line 47
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_1
    iget v2, v0, Lkotlinx/coroutines/flow/internal/m$a;->I$1:I

    .line 56
    .line 57
    iget v6, v0, Lkotlinx/coroutines/flow/internal/m$a;->I$0:I

    .line 58
    .line 59
    iget-object v7, v0, Lkotlinx/coroutines/flow/internal/m$a;->L$2:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v7, [B

    .line 62
    .line 63
    iget-object v8, v0, Lkotlinx/coroutines/flow/internal/m$a;->L$1:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v8, Lkotlinx/coroutines/channels/l;

    .line 66
    .line 67
    iget-object v9, v0, Lkotlinx/coroutines/flow/internal/m$a;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v9, [Ljava/lang/Object;

    .line 70
    .line 71
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    move/from16 v21, v2

    .line 75
    .line 76
    move-object v2, v7

    .line 77
    move-object v7, v8

    .line 78
    move-object v13, v9

    .line 79
    move-object v8, v0

    .line 80
    goto/16 :goto_1

    .line 81
    .line 82
    :cond_2
    iget v2, v0, Lkotlinx/coroutines/flow/internal/m$a;->I$1:I

    .line 83
    .line 84
    iget v6, v0, Lkotlinx/coroutines/flow/internal/m$a;->I$0:I

    .line 85
    .line 86
    iget-object v7, v0, Lkotlinx/coroutines/flow/internal/m$a;->L$2:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v7, [B

    .line 89
    .line 90
    iget-object v8, v0, Lkotlinx/coroutines/flow/internal/m$a;->L$1:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v8, Lkotlinx/coroutines/channels/l;

    .line 93
    .line 94
    iget-object v9, v0, Lkotlinx/coroutines/flow/internal/m$a;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v9, [Ljava/lang/Object;

    .line 97
    .line 98
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    move-object/from16 v10, p1

    .line 102
    .line 103
    check-cast v10, Lkotlinx/coroutines/channels/p;

    .line 104
    .line 105
    invoke-virtual {v10}, Lkotlinx/coroutines/channels/p;->o()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    move v15, v2

    .line 110
    move-object v2, v7

    .line 111
    move-object v7, v8

    .line 112
    move-object v8, v0

    .line 113
    goto/16 :goto_2

    .line 114
    .line 115
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget-object v2, v0, Lkotlinx/coroutines/flow/internal/m$a;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Lkotlinx/coroutines/s0;

    .line 121
    .line 122
    iget-object v6, v0, Lkotlinx/coroutines/flow/internal/m$a;->$flows:[Lkotlinx/coroutines/flow/i;

    .line 123
    .line 124
    array-length v12, v6

    .line 125
    if-nez v12, :cond_4

    .line 126
    .line 127
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_4
    new-array v13, v12, [Ljava/lang/Object;

    .line 131
    .line 132
    sget-object v7, Lkotlinx/coroutines/flow/internal/u;->b:Lkotlinx/coroutines/internal/t0;

    .line 133
    .line 134
    const/4 v8, 0x0

    .line 135
    const/4 v9, 0x0

    .line 136
    const/4 v10, 0x6

    .line 137
    const/4 v11, 0x0

    .line 138
    move-object v6, v13

    .line 139
    invoke-static/range {v6 .. v11}, Lkotlin/collections/l;->V1([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    const/4 v6, 0x6

    .line 143
    const/4 v7, 0x0

    .line 144
    invoke-static {v12, v7, v7, v6, v7}, Lkotlinx/coroutines/channels/o;->d(ILkotlinx/coroutines/channels/i;Lv3/l;ILjava/lang/Object;)Lkotlinx/coroutines/channels/l;

    .line 145
    .line 146
    .line 147
    move-result-object v20

    .line 148
    new-instance v11, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 149
    .line 150
    invoke-direct {v11, v12}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 151
    .line 152
    .line 153
    const/16 v21, 0x0

    .line 154
    .line 155
    move/from16 v10, v21

    .line 156
    .line 157
    :goto_0
    if-ge v10, v12, :cond_5

    .line 158
    .line 159
    const/4 v7, 0x0

    .line 160
    const/4 v8, 0x0

    .line 161
    new-instance v9, Lkotlinx/coroutines/flow/internal/m$a$a;

    .line 162
    .line 163
    iget-object v15, v0, Lkotlinx/coroutines/flow/internal/m$a;->$flows:[Lkotlinx/coroutines/flow/i;

    .line 164
    .line 165
    const/16 v19, 0x0

    .line 166
    .line 167
    move-object v14, v9

    .line 168
    move/from16 v16, v10

    .line 169
    .line 170
    move-object/from16 v17, v11

    .line 171
    .line 172
    move-object/from16 v18, v20

    .line 173
    .line 174
    invoke-direct/range {v14 .. v19}, Lkotlinx/coroutines/flow/internal/m$a$a;-><init>([Lkotlinx/coroutines/flow/i;ILjava/util/concurrent/atomic/AtomicInteger;Lkotlinx/coroutines/channels/l;Lkotlin/coroutines/d;)V

    .line 175
    .line 176
    .line 177
    const/4 v14, 0x3

    .line 178
    const/4 v15, 0x0

    .line 179
    move-object v6, v2

    .line 180
    move v10, v14

    .line 181
    move-object v14, v11

    .line 182
    move-object v11, v15

    .line 183
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 184
    .line 185
    .line 186
    add-int/lit8 v10, v16, 0x1

    .line 187
    .line 188
    move-object v11, v14

    .line 189
    goto :goto_0

    .line 190
    :cond_5
    new-array v2, v12, [B

    .line 191
    .line 192
    move-object v8, v0

    .line 193
    move v6, v12

    .line 194
    move-object/from16 v7, v20

    .line 195
    .line 196
    :goto_1
    add-int/lit8 v9, v21, 0x1

    .line 197
    .line 198
    int-to-byte v9, v9

    .line 199
    iput-object v13, v8, Lkotlinx/coroutines/flow/internal/m$a;->L$0:Ljava/lang/Object;

    .line 200
    .line 201
    iput-object v7, v8, Lkotlinx/coroutines/flow/internal/m$a;->L$1:Ljava/lang/Object;

    .line 202
    .line 203
    iput-object v2, v8, Lkotlinx/coroutines/flow/internal/m$a;->L$2:Ljava/lang/Object;

    .line 204
    .line 205
    iput v6, v8, Lkotlinx/coroutines/flow/internal/m$a;->I$0:I

    .line 206
    .line 207
    iput v9, v8, Lkotlinx/coroutines/flow/internal/m$a;->I$1:I

    .line 208
    .line 209
    iput v5, v8, Lkotlinx/coroutines/flow/internal/m$a;->label:I

    .line 210
    .line 211
    invoke-interface {v7, v8}, Lkotlinx/coroutines/channels/g0;->x(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    if-ne v10, v1, :cond_6

    .line 216
    .line 217
    return-object v1

    .line 218
    :cond_6
    move v15, v9

    .line 219
    move-object v9, v13

    .line 220
    :goto_2
    invoke-static {v10}, Lkotlinx/coroutines/channels/p;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v10

    .line 224
    check-cast v10, Lkotlin/collections/p0;

    .line 225
    .line 226
    if-nez v10, :cond_7

    .line 227
    .line 228
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 229
    .line 230
    return-object v1

    .line 231
    :cond_7
    invoke-virtual {v10}, Lkotlin/collections/p0;->e()I

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    aget-object v12, v9, v11

    .line 236
    .line 237
    invoke-virtual {v10}, Lkotlin/collections/p0;->f()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    aput-object v10, v9, v11

    .line 242
    .line 243
    sget-object v10, Lkotlinx/coroutines/flow/internal/u;->b:Lkotlinx/coroutines/internal/t0;

    .line 244
    .line 245
    if-ne v12, v10, :cond_8

    .line 246
    .line 247
    add-int/lit8 v6, v6, -0x1

    .line 248
    .line 249
    :cond_8
    aget-byte v10, v2, v11

    .line 250
    .line 251
    if-eq v10, v15, :cond_9

    .line 252
    .line 253
    int-to-byte v10, v15

    .line 254
    aput-byte v10, v2, v11

    .line 255
    .line 256
    invoke-interface {v7}, Lkotlinx/coroutines/channels/g0;->v()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    invoke-static {v10}, Lkotlinx/coroutines/channels/p;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v10

    .line 264
    check-cast v10, Lkotlin/collections/p0;

    .line 265
    .line 266
    if-nez v10, :cond_7

    .line 267
    .line 268
    :cond_9
    if-nez v6, :cond_c

    .line 269
    .line 270
    iget-object v10, v8, Lkotlinx/coroutines/flow/internal/m$a;->$arrayFactory:Lv3/a;

    .line 271
    .line 272
    invoke-interface {v10}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    check-cast v10, [Ljava/lang/Object;

    .line 277
    .line 278
    if-nez v10, :cond_b

    .line 279
    .line 280
    iget-object v10, v8, Lkotlinx/coroutines/flow/internal/m$a;->$transform:Lv3/q;

    .line 281
    .line 282
    iget-object v11, v8, Lkotlinx/coroutines/flow/internal/m$a;->$this_combineInternal:Lkotlinx/coroutines/flow/j;

    .line 283
    .line 284
    iput-object v9, v8, Lkotlinx/coroutines/flow/internal/m$a;->L$0:Ljava/lang/Object;

    .line 285
    .line 286
    iput-object v7, v8, Lkotlinx/coroutines/flow/internal/m$a;->L$1:Ljava/lang/Object;

    .line 287
    .line 288
    iput-object v2, v8, Lkotlinx/coroutines/flow/internal/m$a;->L$2:Ljava/lang/Object;

    .line 289
    .line 290
    iput v6, v8, Lkotlinx/coroutines/flow/internal/m$a;->I$0:I

    .line 291
    .line 292
    iput v15, v8, Lkotlinx/coroutines/flow/internal/m$a;->I$1:I

    .line 293
    .line 294
    iput v4, v8, Lkotlinx/coroutines/flow/internal/m$a;->label:I

    .line 295
    .line 296
    invoke-interface {v10, v11, v9, v8}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    if-ne v10, v1, :cond_a

    .line 301
    .line 302
    return-object v1

    .line 303
    :cond_a
    move-object v13, v9

    .line 304
    move/from16 v21, v15

    .line 305
    .line 306
    goto :goto_1

    .line 307
    :cond_b
    const/4 v13, 0x0

    .line 308
    const/4 v14, 0x0

    .line 309
    const/16 v16, 0x0

    .line 310
    .line 311
    const/16 v17, 0xe

    .line 312
    .line 313
    const/16 v18, 0x0

    .line 314
    .line 315
    move-object v11, v9

    .line 316
    move-object v12, v10

    .line 317
    move v4, v15

    .line 318
    move/from16 v15, v16

    .line 319
    .line 320
    move/from16 v16, v17

    .line 321
    .line 322
    move-object/from16 v17, v18

    .line 323
    .line 324
    invoke-static/range {v11 .. v17}, Lkotlin/collections/l;->K0([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    iget-object v11, v8, Lkotlinx/coroutines/flow/internal/m$a;->$transform:Lv3/q;

    .line 328
    .line 329
    iget-object v12, v8, Lkotlinx/coroutines/flow/internal/m$a;->$this_combineInternal:Lkotlinx/coroutines/flow/j;

    .line 330
    .line 331
    iput-object v9, v8, Lkotlinx/coroutines/flow/internal/m$a;->L$0:Ljava/lang/Object;

    .line 332
    .line 333
    iput-object v7, v8, Lkotlinx/coroutines/flow/internal/m$a;->L$1:Ljava/lang/Object;

    .line 334
    .line 335
    iput-object v2, v8, Lkotlinx/coroutines/flow/internal/m$a;->L$2:Ljava/lang/Object;

    .line 336
    .line 337
    iput v6, v8, Lkotlinx/coroutines/flow/internal/m$a;->I$0:I

    .line 338
    .line 339
    iput v4, v8, Lkotlinx/coroutines/flow/internal/m$a;->I$1:I

    .line 340
    .line 341
    iput v3, v8, Lkotlinx/coroutines/flow/internal/m$a;->label:I

    .line 342
    .line 343
    invoke-interface {v11, v12, v10, v8}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v10

    .line 347
    if-ne v10, v1, :cond_d

    .line 348
    .line 349
    return-object v1

    .line 350
    :goto_3
    const/4 v4, 0x2

    .line 351
    goto/16 :goto_1

    .line 352
    .line 353
    :cond_c
    move v4, v15

    .line 354
    :cond_d
    move/from16 v21, v4

    .line 355
    .line 356
    move-object v13, v9

    .line 357
    goto :goto_3
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
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
.end method
