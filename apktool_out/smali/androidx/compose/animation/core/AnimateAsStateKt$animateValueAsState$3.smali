.class final Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/core/AnimateAsStateKt;->animateValueAsState(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Ljava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
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
    c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3"
    f = "AnimateAsState.kt"
    i = {
        0x0
    }
    l = {
        0x1a3
    }
    m = "invokeSuspend"
    n = {
        "$this$LaunchedEffect"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@"
    }
    d2 = {
        "T",
        "Landroidx/compose/animation/core/AnimationVector;",
        "V",
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
.field final synthetic $animSpec$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field final synthetic $animatable:Landroidx/compose/animation/core/Animatable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Animatable<",
            "TT;TV;>;"
        }
    .end annotation
.end field

.field final synthetic $channel:Lkotlinx/coroutines/channels/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/l<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $listener$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lv3/l<",
            "TT;",
            "Lkotlin/r2;",
            ">;>;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlinx/coroutines/channels/l;Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/l<",
            "TT;>;",
            "Landroidx/compose/animation/core/Animatable<",
            "TT;TV;>;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "TT;>;>;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lv3/l<",
            "-TT;",
            "Lkotlin/r2;",
            ">;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->$channel:Lkotlinx/coroutines/channels/l;

    iput-object p2, p0, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->$animatable:Landroidx/compose/animation/core/Animatable;

    iput-object p3, p0, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->$animSpec$delegate:Landroidx/compose/runtime/State;

    iput-object p4, p0, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->$listener$delegate:Landroidx/compose/runtime/State;

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

    new-instance v6, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;

    iget-object v1, p0, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->$channel:Lkotlinx/coroutines/channels/l;

    iget-object v2, p0, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->$animatable:Landroidx/compose/animation/core/Animatable;

    iget-object v3, p0, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->$animSpec$delegate:Landroidx/compose/runtime/State;

    iget-object v4, p0, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->$listener$delegate:Landroidx/compose/runtime/State;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;-><init>(Lkotlinx/coroutines/channels/l;Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/coroutines/d;)V

    iput-object p1, v6, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->L$0:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v2, v0, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->label:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    iget-object v2, v0, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->L$1:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lkotlinx/coroutines/channels/n;

    .line 17
    .line 18
    iget-object v4, v0, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->L$0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Lkotlinx/coroutines/s0;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v6, p1

    .line 26
    .line 27
    move-object v5, v0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v2, v0, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Lkotlinx/coroutines/s0;

    .line 43
    .line 44
    iget-object v4, v0, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->$channel:Lkotlinx/coroutines/channels/l;

    .line 45
    .line 46
    invoke-interface {v4}, Lkotlinx/coroutines/channels/g0;->iterator()Lkotlinx/coroutines/channels/n;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    move-object v5, v0

    .line 51
    move-object/from16 v16, v4

    .line 52
    .line 53
    move-object v4, v2

    .line 54
    move-object/from16 v2, v16

    .line 55
    .line 56
    :goto_0
    iput-object v4, v5, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    iput-object v2, v5, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->L$1:Ljava/lang/Object;

    .line 59
    .line 60
    iput v3, v5, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->label:I

    .line 61
    .line 62
    invoke-interface {v2, v5}, Lkotlinx/coroutines/channels/n;->c(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    if-ne v6, v1, :cond_2

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_2
    :goto_1
    check-cast v6, Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_4

    .line 76
    .line 77
    invoke-interface {v2}, Lkotlinx/coroutines/channels/n;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    iget-object v7, v5, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->$channel:Lkotlinx/coroutines/channels/l;

    .line 82
    .line 83
    invoke-interface {v7}, Lkotlinx/coroutines/channels/g0;->v()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-static {v7}, Lkotlinx/coroutines/channels/p;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    if-nez v7, :cond_3

    .line 92
    .line 93
    move-object v9, v6

    .line 94
    goto :goto_2

    .line 95
    :cond_3
    move-object v9, v7

    .line 96
    :goto_2
    const/4 v6, 0x0

    .line 97
    const/4 v14, 0x0

    .line 98
    new-instance v15, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3$1;

    .line 99
    .line 100
    iget-object v10, v5, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->$animatable:Landroidx/compose/animation/core/Animatable;

    .line 101
    .line 102
    iget-object v11, v5, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->$animSpec$delegate:Landroidx/compose/runtime/State;

    .line 103
    .line 104
    iget-object v12, v5, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3;->$listener$delegate:Landroidx/compose/runtime/State;

    .line 105
    .line 106
    const/4 v13, 0x0

    .line 107
    move-object v8, v15

    .line 108
    invoke-direct/range {v8 .. v13}, Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3$1;-><init>(Ljava/lang/Object;Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/coroutines/d;)V

    .line 109
    .line 110
    .line 111
    const/4 v11, 0x3

    .line 112
    const/4 v12, 0x0

    .line 113
    move-object v7, v4

    .line 114
    move-object v8, v6

    .line 115
    move-object v9, v14

    .line 116
    move-object v10, v15

    .line 117
    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_4
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 122
    .line 123
    return-object v1
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
