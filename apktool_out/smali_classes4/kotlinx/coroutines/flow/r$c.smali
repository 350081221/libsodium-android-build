.class final Lkotlinx/coroutines/flow/r$c;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/flow/r;->e(Lkotlinx/coroutines/flow/i;Lv3/l;)Lkotlinx/coroutines/flow/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/q<",
        "Lkotlinx/coroutines/s0;",
        "Lkotlinx/coroutines/flow/j<",
        "-TT;>;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1"
    f = "Delay.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0xdd,
        0x1a0
    }
    m = "invokeSuspend"
    n = {
        "downstream",
        "values",
        "lastValue",
        "timeoutMillis",
        "downstream",
        "values",
        "lastValue"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"
    }
    d2 = {
        "T",
        "Lkotlinx/coroutines/s0;",
        "Lkotlinx/coroutines/flow/j;",
        "downstream",
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,405:1\n18#2:406\n18#2:408\n1#3:407\n55#4,8:409\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n*L\n218#1:406\n221#1:408\n228#1:409,8\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $this_debounceInternal:Lkotlinx/coroutines/flow/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $timeoutMillisSelector:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "TT;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lv3/l;Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-TT;",
            "Ljava/lang/Long;",
            ">;",
            "Lkotlinx/coroutines/flow/i<",
            "+TT;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlinx/coroutines/flow/r$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/flow/r$c;->$timeoutMillisSelector:Lv3/l;

    iput-object p2, p0, Lkotlinx/coroutines/flow/r$c;->$this_debounceInternal:Lkotlinx/coroutines/flow/i;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlinx/coroutines/flow/j;

    check-cast p3, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/flow/r$c;->invoke(Lkotlinx/coroutines/s0;Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/s0;Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/flow/j;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/s0;",
            "Lkotlinx/coroutines/flow/j<",
            "-TT;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    new-instance v0, Lkotlinx/coroutines/flow/r$c;

    iget-object v1, p0, Lkotlinx/coroutines/flow/r$c;->$timeoutMillisSelector:Lv3/l;

    iget-object v2, p0, Lkotlinx/coroutines/flow/r$c;->$this_debounceInternal:Lkotlinx/coroutines/flow/i;

    invoke-direct {v0, v1, v2, p3}, Lkotlinx/coroutines/flow/r$c;-><init>(Lv3/l;Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Lkotlinx/coroutines/flow/r$c;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lkotlinx/coroutines/flow/r$c;->L$1:Ljava/lang/Object;

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/flow/r$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17
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
    iget v2, v0, Lkotlinx/coroutines/flow/r$c;->label:I

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    if-eq v2, v4, :cond_1

    .line 15
    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    iget-object v2, v0, Lkotlinx/coroutines/flow/r$c;->L$2:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lkotlin/jvm/internal/k1$h;

    .line 21
    .line 22
    iget-object v6, v0, Lkotlinx/coroutines/flow/r$c;->L$1:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v6, Lkotlinx/coroutines/channels/g0;

    .line 25
    .line 26
    iget-object v7, v0, Lkotlinx/coroutines/flow/r$c;->L$0:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v7, Lkotlinx/coroutines/flow/j;

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object v8, v7

    .line 34
    move-object v7, v6

    .line 35
    move-object v6, v2

    .line 36
    move-object v2, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v1

    .line 46
    :cond_1
    iget-object v2, v0, Lkotlinx/coroutines/flow/r$c;->L$3:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lkotlin/jvm/internal/k1$g;

    .line 49
    .line 50
    iget-object v6, v0, Lkotlinx/coroutines/flow/r$c;->L$2:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v6, Lkotlin/jvm/internal/k1$h;

    .line 53
    .line 54
    iget-object v7, v0, Lkotlinx/coroutines/flow/r$c;->L$1:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v7, Lkotlinx/coroutines/channels/g0;

    .line 57
    .line 58
    iget-object v8, v0, Lkotlinx/coroutines/flow/r$c;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v8, Lkotlinx/coroutines/flow/j;

    .line 61
    .line 62
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object v9, v2

    .line 66
    move-object v2, v0

    .line 67
    goto/16 :goto_2

    .line 68
    .line 69
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v2, v0, Lkotlinx/coroutines/flow/r$c;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v6, v2

    .line 75
    check-cast v6, Lkotlinx/coroutines/s0;

    .line 76
    .line 77
    iget-object v2, v0, Lkotlinx/coroutines/flow/r$c;->L$1:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, Lkotlinx/coroutines/flow/j;

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v8, 0x0

    .line 83
    new-instance v9, Lkotlinx/coroutines/flow/r$c$c;

    .line 84
    .line 85
    iget-object v10, v0, Lkotlinx/coroutines/flow/r$c;->$this_debounceInternal:Lkotlinx/coroutines/flow/i;

    .line 86
    .line 87
    invoke-direct {v9, v10, v5}, Lkotlinx/coroutines/flow/r$c$c;-><init>(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)V

    .line 88
    .line 89
    .line 90
    const/4 v10, 0x3

    .line 91
    const/4 v11, 0x0

    .line 92
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/channels/c0;->h(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;ILv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/channels/g0;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    new-instance v7, Lkotlin/jvm/internal/k1$h;

    .line 97
    .line 98
    invoke-direct {v7}, Lkotlin/jvm/internal/k1$h;-><init>()V

    .line 99
    .line 100
    .line 101
    move-object v8, v2

    .line 102
    move-object v2, v0

    .line 103
    move-object/from16 v16, v7

    .line 104
    .line 105
    move-object v7, v6

    .line 106
    move-object/from16 v6, v16

    .line 107
    .line 108
    :goto_0
    iget-object v9, v6, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 109
    .line 110
    sget-object v10, Lkotlinx/coroutines/flow/internal/u;->c:Lkotlinx/coroutines/internal/t0;

    .line 111
    .line 112
    if-eq v9, v10, :cond_b

    .line 113
    .line 114
    new-instance v9, Lkotlin/jvm/internal/k1$g;

    .line 115
    .line 116
    invoke-direct {v9}, Lkotlin/jvm/internal/k1$g;-><init>()V

    .line 117
    .line 118
    .line 119
    iget-object v10, v6, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 120
    .line 121
    if-eqz v10, :cond_7

    .line 122
    .line 123
    iget-object v11, v2, Lkotlinx/coroutines/flow/r$c;->$timeoutMillisSelector:Lv3/l;

    .line 124
    .line 125
    sget-object v12, Lkotlinx/coroutines/flow/internal/u;->a:Lkotlinx/coroutines/internal/t0;

    .line 126
    .line 127
    if-ne v10, v12, :cond_3

    .line 128
    .line 129
    move-object v10, v5

    .line 130
    :cond_3
    invoke-interface {v11, v10}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    check-cast v10, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    .line 137
    .line 138
    .line 139
    move-result-wide v10

    .line 140
    iput-wide v10, v9, Lkotlin/jvm/internal/k1$g;->element:J

    .line 141
    .line 142
    const-wide/16 v13, 0x0

    .line 143
    .line 144
    cmp-long v15, v10, v13

    .line 145
    .line 146
    if-ltz v15, :cond_4

    .line 147
    .line 148
    move v15, v4

    .line 149
    goto :goto_1

    .line 150
    :cond_4
    const/4 v15, 0x0

    .line 151
    :goto_1
    if-eqz v15, :cond_8

    .line 152
    .line 153
    cmp-long v10, v10, v13

    .line 154
    .line 155
    if-nez v10, :cond_7

    .line 156
    .line 157
    iget-object v10, v6, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 158
    .line 159
    if-ne v10, v12, :cond_5

    .line 160
    .line 161
    move-object v10, v5

    .line 162
    :cond_5
    iput-object v8, v2, Lkotlinx/coroutines/flow/r$c;->L$0:Ljava/lang/Object;

    .line 163
    .line 164
    iput-object v7, v2, Lkotlinx/coroutines/flow/r$c;->L$1:Ljava/lang/Object;

    .line 165
    .line 166
    iput-object v6, v2, Lkotlinx/coroutines/flow/r$c;->L$2:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object v9, v2, Lkotlinx/coroutines/flow/r$c;->L$3:Ljava/lang/Object;

    .line 169
    .line 170
    iput v4, v2, Lkotlinx/coroutines/flow/r$c;->label:I

    .line 171
    .line 172
    invoke-interface {v8, v10, v2}, Lkotlinx/coroutines/flow/j;->emit(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    if-ne v10, v1, :cond_6

    .line 177
    .line 178
    return-object v1

    .line 179
    :cond_6
    :goto_2
    iput-object v5, v6, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 180
    .line 181
    :cond_7
    move-object/from16 v16, v6

    .line 182
    .line 183
    move-object v6, v2

    .line 184
    move-object/from16 v2, v16

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 188
    .line 189
    const-string v2, "Debounce timeout should not be negative"

    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v1

    .line 199
    :goto_3
    new-instance v10, Lkotlinx/coroutines/selects/l;

    .line 200
    .line 201
    invoke-interface {v6}, Lkotlin/coroutines/d;->getContext()Lkotlin/coroutines/g;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    invoke-direct {v10, v11}, Lkotlinx/coroutines/selects/l;-><init>(Lkotlin/coroutines/g;)V

    .line 206
    .line 207
    .line 208
    iget-object v11, v2, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 209
    .line 210
    if-eqz v11, :cond_9

    .line 211
    .line 212
    iget-wide v11, v9, Lkotlin/jvm/internal/k1$g;->element:J

    .line 213
    .line 214
    new-instance v9, Lkotlinx/coroutines/flow/r$c$a;

    .line 215
    .line 216
    invoke-direct {v9, v8, v2, v5}, Lkotlinx/coroutines/flow/r$c$a;-><init>(Lkotlinx/coroutines/flow/j;Lkotlin/jvm/internal/k1$h;Lkotlin/coroutines/d;)V

    .line 217
    .line 218
    .line 219
    invoke-static {v10, v11, v12, v9}, Lkotlinx/coroutines/selects/b;->a(Lkotlinx/coroutines/selects/c;JLv3/l;)V

    .line 220
    .line 221
    .line 222
    :cond_9
    invoke-interface {v7}, Lkotlinx/coroutines/channels/g0;->s()Lkotlinx/coroutines/selects/g;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    new-instance v11, Lkotlinx/coroutines/flow/r$c$b;

    .line 227
    .line 228
    invoke-direct {v11, v2, v8, v5}, Lkotlinx/coroutines/flow/r$c$b;-><init>(Lkotlin/jvm/internal/k1$h;Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)V

    .line 229
    .line 230
    .line 231
    invoke-interface {v10, v9, v11}, Lkotlinx/coroutines/selects/c;->c(Lkotlinx/coroutines/selects/g;Lv3/p;)V

    .line 232
    .line 233
    .line 234
    iput-object v8, v6, Lkotlinx/coroutines/flow/r$c;->L$0:Ljava/lang/Object;

    .line 235
    .line 236
    iput-object v7, v6, Lkotlinx/coroutines/flow/r$c;->L$1:Ljava/lang/Object;

    .line 237
    .line 238
    iput-object v2, v6, Lkotlinx/coroutines/flow/r$c;->L$2:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v5, v6, Lkotlinx/coroutines/flow/r$c;->L$3:Ljava/lang/Object;

    .line 241
    .line 242
    iput v3, v6, Lkotlinx/coroutines/flow/r$c;->label:I

    .line 243
    .line 244
    invoke-virtual {v10, v6}, Lkotlinx/coroutines/selects/l;->w(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v9

    .line 248
    if-ne v9, v1, :cond_a

    .line 249
    .line 250
    return-object v1

    .line 251
    :cond_a
    move-object/from16 v16, v6

    .line 252
    .line 253
    move-object v6, v2

    .line 254
    move-object/from16 v2, v16

    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_b
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 259
    .line 260
    return-object v1
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
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
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
