.class final Lorg/burnoutcrew/reorderable/l$d;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/burnoutcrew/reorderable/l;->g(F)V
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
    c = "org.burnoutcrew.reorderable.ReorderableState$autoscroll$1"
    f = "ReorderableState.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0xb0
    }
    m = "invokeSuspend"
    n = {
        "scroll",
        "start"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\u008a@"
    }
    d2 = {
        "T",
        "Lkotlinx/coroutines/s0;",
        "Lkotlin/r2;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $scrollOffset:F

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lorg/burnoutcrew/reorderable/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/burnoutcrew/reorderable/l<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(FLorg/burnoutcrew/reorderable/l;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lorg/burnoutcrew/reorderable/l<",
            "TT;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lorg/burnoutcrew/reorderable/l$d;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lorg/burnoutcrew/reorderable/l$d;->$scrollOffset:F

    iput-object p2, p0, Lorg/burnoutcrew/reorderable/l$d;->this$0:Lorg/burnoutcrew/reorderable/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 2
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

    new-instance p1, Lorg/burnoutcrew/reorderable/l$d;

    iget v0, p0, Lorg/burnoutcrew/reorderable/l$d;->$scrollOffset:F

    iget-object v1, p0, Lorg/burnoutcrew/reorderable/l$d;->this$0:Lorg/burnoutcrew/reorderable/l;

    invoke-direct {p1, v0, v1, p2}, Lorg/burnoutcrew/reorderable/l$d;-><init>(FLorg/burnoutcrew/reorderable/l;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lorg/burnoutcrew/reorderable/l$d;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lorg/burnoutcrew/reorderable/l$d;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lorg/burnoutcrew/reorderable/l$d;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lorg/burnoutcrew/reorderable/l$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
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
    iget v1, p0, Lorg/burnoutcrew/reorderable/l$d;->label:I

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
    iget-object v1, p0, Lorg/burnoutcrew/reorderable/l$d;->L$1:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lkotlin/jvm/internal/k1$g;

    .line 15
    .line 16
    iget-object v3, p0, Lorg/burnoutcrew/reorderable/l$d;->L$0:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lkotlin/jvm/internal/k1$e;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    move-object p1, p0

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance p1, Lkotlin/jvm/internal/k1$e;

    .line 37
    .line 38
    invoke-direct {p1}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 39
    .line 40
    .line 41
    iget v1, p0, Lorg/burnoutcrew/reorderable/l$d;->$scrollOffset:F

    .line 42
    .line 43
    iput v1, p1, Lkotlin/jvm/internal/k1$e;->element:F

    .line 44
    .line 45
    new-instance v1, Lkotlin/jvm/internal/k1$g;

    .line 46
    .line 47
    invoke-direct {v1}, Lkotlin/jvm/internal/k1$g;-><init>()V

    .line 48
    .line 49
    .line 50
    move-object v3, p1

    .line 51
    move-object p1, p0

    .line 52
    :goto_0
    iget v4, v3, Lkotlin/jvm/internal/k1$e;->element:F

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    cmpg-float v4, v4, v5

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    if-nez v4, :cond_2

    .line 59
    .line 60
    move v4, v2

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    move v4, v5

    .line 63
    :goto_1
    if-nez v4, :cond_5

    .line 64
    .line 65
    iget-object v4, p1, Lorg/burnoutcrew/reorderable/l$d;->this$0:Lorg/burnoutcrew/reorderable/l;

    .line 66
    .line 67
    invoke-static {v4}, Lorg/burnoutcrew/reorderable/l;->b(Lorg/burnoutcrew/reorderable/l;)Lkotlinx/coroutines/l2;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    if-eqz v4, :cond_3

    .line 72
    .line 73
    invoke-interface {v4}, Lkotlinx/coroutines/l2;->isActive()Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-ne v4, v2, :cond_3

    .line 78
    .line 79
    move v5, v2

    .line 80
    :cond_3
    if-eqz v5, :cond_5

    .line 81
    .line 82
    new-instance v4, Lorg/burnoutcrew/reorderable/l$d$a;

    .line 83
    .line 84
    iget-object v5, p1, Lorg/burnoutcrew/reorderable/l$d;->this$0:Lorg/burnoutcrew/reorderable/l;

    .line 85
    .line 86
    invoke-direct {v4, v1, v3, v5}, Lorg/burnoutcrew/reorderable/l$d$a;-><init>(Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$e;Lorg/burnoutcrew/reorderable/l;)V

    .line 87
    .line 88
    .line 89
    iput-object v3, p1, Lorg/burnoutcrew/reorderable/l$d;->L$0:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v1, p1, Lorg/burnoutcrew/reorderable/l$d;->L$1:Ljava/lang/Object;

    .line 92
    .line 93
    iput v2, p1, Lorg/burnoutcrew/reorderable/l$d;->label:I

    .line 94
    .line 95
    invoke-static {v4, p1}, Landroidx/compose/runtime/MonotonicFrameClockKt;->withFrameMillis(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    if-ne v4, v0, :cond_4

    .line 100
    .line 101
    return-object v0

    .line 102
    :cond_4
    :goto_2
    iget-object v4, p1, Lorg/burnoutcrew/reorderable/l$d;->this$0:Lorg/burnoutcrew/reorderable/l;

    .line 103
    .line 104
    invoke-virtual {v4}, Lorg/burnoutcrew/reorderable/l;->B()Lkotlinx/coroutines/channels/l;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    iget v5, v3, Lkotlin/jvm/internal/k1$e;->element:F

    .line 109
    .line 110
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-interface {v4, v5}, Lkotlinx/coroutines/channels/h0;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_5
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 119
    .line 120
    return-object p1
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
