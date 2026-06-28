.class final Lkotlinx/coroutines/flow/internal/m$c;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/flow/internal/m;->b(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/q;)Lkotlinx/coroutines/flow/i;
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
    c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1"
    f = "Combine.kt"
    i = {
        0x0
    }
    l = {
        0x7e
    }
    m = "invokeSuspend"
    n = {
        "second"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0004\u0008\u0002\u0010\u0002*\u00020\u0003H\u008a@"
    }
    d2 = {
        "T1",
        "T2",
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
.field final synthetic $flow:Lkotlinx/coroutines/flow/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/i<",
            "TT1;>;"
        }
    .end annotation
.end field

.field final synthetic $flow2:Lkotlinx/coroutines/flow/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/i<",
            "TT2;>;"
        }
    .end annotation
.end field

.field final synthetic $this_unsafeFlow:Lkotlinx/coroutines/flow/j;
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
            "TT1;TT2;",
            "Lkotlin/coroutines/d<",
            "-TR;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/q;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/j<",
            "-TR;>;",
            "Lkotlinx/coroutines/flow/i<",
            "+TT2;>;",
            "Lkotlinx/coroutines/flow/i<",
            "+TT1;>;",
            "Lv3/q<",
            "-TT1;-TT2;-",
            "Lkotlin/coroutines/d<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlinx/coroutines/flow/internal/m$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/flow/internal/m$c;->$this_unsafeFlow:Lkotlinx/coroutines/flow/j;

    iput-object p2, p0, Lkotlinx/coroutines/flow/internal/m$c;->$flow2:Lkotlinx/coroutines/flow/i;

    iput-object p3, p0, Lkotlinx/coroutines/flow/internal/m$c;->$flow:Lkotlinx/coroutines/flow/i;

    iput-object p4, p0, Lkotlinx/coroutines/flow/internal/m$c;->$transform:Lv3/q;

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

    new-instance v6, Lkotlinx/coroutines/flow/internal/m$c;

    iget-object v1, p0, Lkotlinx/coroutines/flow/internal/m$c;->$this_unsafeFlow:Lkotlinx/coroutines/flow/j;

    iget-object v2, p0, Lkotlinx/coroutines/flow/internal/m$c;->$flow2:Lkotlinx/coroutines/flow/i;

    iget-object v3, p0, Lkotlinx/coroutines/flow/internal/m$c;->$flow:Lkotlinx/coroutines/flow/i;

    iget-object v4, p0, Lkotlinx/coroutines/flow/internal/m$c;->$transform:Lv3/q;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lkotlinx/coroutines/flow/internal/m$c;-><init>(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/q;Lkotlin/coroutines/d;)V

    iput-object p1, v6, Lkotlinx/coroutines/flow/internal/m$c;->L$0:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/flow/internal/m$c;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/flow/internal/m$c;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/flow/internal/m$c;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lkotlinx/coroutines/flow/internal/m$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, v8, Lkotlinx/coroutines/flow/internal/m$c;->label:I

    .line 8
    .line 9
    const/4 v9, 0x1

    .line 10
    const/4 v10, 0x0

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v9, :cond_0

    .line 14
    .line 15
    iget-object v0, v8, Lkotlinx/coroutines/flow/internal/m$c;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, Lkotlinx/coroutines/channels/g0;

    .line 19
    .line 20
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/a; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto/16 :goto_5

    .line 27
    .line 28
    :catch_0
    move-exception v0

    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, v8, Lkotlinx/coroutines/flow/internal/m$c;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lkotlinx/coroutines/s0;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    new-instance v5, Lkotlinx/coroutines/flow/internal/m$c$c;

    .line 49
    .line 50
    iget-object v2, v8, Lkotlinx/coroutines/flow/internal/m$c;->$flow2:Lkotlinx/coroutines/flow/i;

    .line 51
    .line 52
    invoke-direct {v5, v2, v10}, Lkotlinx/coroutines/flow/internal/m$c$c;-><init>(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)V

    .line 53
    .line 54
    .line 55
    const/4 v6, 0x3

    .line 56
    const/4 v7, 0x0

    .line 57
    move-object v2, v1

    .line 58
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/channels/c0;->h(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;ILv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/channels/g0;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-static {v10, v9, v10}, Lkotlinx/coroutines/p2;->c(Lkotlinx/coroutines/l2;ILjava/lang/Object;)Lkotlinx/coroutines/b0;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>"

    .line 67
    .line 68
    invoke-static {v7, v3}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    move-object v3, v7

    .line 72
    check-cast v3, Lkotlinx/coroutines/channels/h0;

    .line 73
    .line 74
    new-instance v4, Lkotlinx/coroutines/flow/internal/m$c$a;

    .line 75
    .line 76
    iget-object v5, v8, Lkotlinx/coroutines/flow/internal/m$c;->$this_unsafeFlow:Lkotlinx/coroutines/flow/j;

    .line 77
    .line 78
    invoke-direct {v4, v2, v5}, Lkotlinx/coroutines/flow/internal/m$c$a;-><init>(Lkotlinx/coroutines/b0;Lkotlinx/coroutines/flow/j;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v3, v4}, Lkotlinx/coroutines/channels/h0;->I(Lv3/l;)V

    .line 82
    .line 83
    .line 84
    :try_start_1
    invoke-interface {v1}, Lkotlinx/coroutines/s0;->getCoroutineContext()Lkotlin/coroutines/g;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    invoke-static {v13}, Lkotlinx/coroutines/internal/z0;->b(Lkotlin/coroutines/g;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v14

    .line 92
    invoke-interface {v1}, Lkotlinx/coroutines/s0;->getCoroutineContext()Lkotlin/coroutines/g;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {v1, v2}, Lkotlin/coroutines/g;->plus(Lkotlin/coroutines/g;)Lkotlin/coroutines/g;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    sget-object v2, Lkotlin/r2;->a:Lkotlin/r2;

    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    new-instance v4, Lkotlinx/coroutines/flow/internal/m$c$b;

    .line 104
    .line 105
    iget-object v12, v8, Lkotlinx/coroutines/flow/internal/m$c;->$flow:Lkotlinx/coroutines/flow/i;

    .line 106
    .line 107
    iget-object v5, v8, Lkotlinx/coroutines/flow/internal/m$c;->$this_unsafeFlow:Lkotlinx/coroutines/flow/j;

    .line 108
    .line 109
    iget-object v6, v8, Lkotlinx/coroutines/flow/internal/m$c;->$transform:Lv3/q;

    .line 110
    .line 111
    const/16 v18, 0x0

    .line 112
    .line 113
    move-object v11, v4

    .line 114
    move-object v15, v7

    .line 115
    move-object/from16 v16, v5

    .line 116
    .line 117
    move-object/from16 v17, v6

    .line 118
    .line 119
    invoke-direct/range {v11 .. v18}, Lkotlinx/coroutines/flow/internal/m$c$b;-><init>(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;Ljava/lang/Object;Lkotlinx/coroutines/channels/g0;Lkotlinx/coroutines/flow/j;Lv3/q;Lkotlin/coroutines/d;)V

    .line 120
    .line 121
    .line 122
    const/4 v6, 0x4

    .line 123
    const/4 v11, 0x0

    .line 124
    iput-object v7, v8, Lkotlinx/coroutines/flow/internal/m$c;->L$0:Ljava/lang/Object;

    .line 125
    .line 126
    iput v9, v8, Lkotlinx/coroutines/flow/internal/m$c;->label:I
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/a; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 127
    .line 128
    move-object/from16 v5, p0

    .line 129
    .line 130
    move-object v12, v7

    .line 131
    move-object v7, v11

    .line 132
    :try_start_2
    invoke-static/range {v1 .. v7}, Lkotlinx/coroutines/flow/internal/f;->d(Lkotlin/coroutines/g;Ljava/lang/Object;Ljava/lang/Object;Lv3/p;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1
    :try_end_2
    .catch Lkotlinx/coroutines/flow/internal/a; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 136
    if-ne v1, v0, :cond_2

    .line 137
    .line 138
    return-object v0

    .line 139
    :cond_2
    move-object v1, v12

    .line 140
    :goto_0
    invoke-static {v1, v10, v9, v10}, Lkotlinx/coroutines/channels/g0$a;->b(Lkotlinx/coroutines/channels/g0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :catchall_1
    move-exception v0

    .line 145
    goto :goto_1

    .line 146
    :catch_1
    move-exception v0

    .line 147
    goto :goto_2

    .line 148
    :catchall_2
    move-exception v0

    .line 149
    move-object v12, v7

    .line 150
    :goto_1
    move-object v1, v12

    .line 151
    goto :goto_5

    .line 152
    :catch_2
    move-exception v0

    .line 153
    move-object v12, v7

    .line 154
    :goto_2
    move-object v1, v12

    .line 155
    :goto_3
    :try_start_3
    iget-object v2, v8, Lkotlinx/coroutines/flow/internal/m$c;->$this_unsafeFlow:Lkotlinx/coroutines/flow/j;

    .line 156
    .line 157
    invoke-static {v0, v2}, Lkotlinx/coroutines/flow/internal/q;->b(Lkotlinx/coroutines/flow/internal/a;Lkotlinx/coroutines/flow/j;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :goto_4
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 162
    .line 163
    return-object v0

    .line 164
    :goto_5
    invoke-static {v1, v10, v9, v10}, Lkotlinx/coroutines/channels/g0$a;->b(Lkotlinx/coroutines/channels/g0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    throw v0
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
