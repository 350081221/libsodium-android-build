.class final Lorg/burnoutcrew/reorderable/g$d$a;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/burnoutcrew/reorderable/g$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Landroidx/compose/ui/input/pointer/PointerInputScope;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "org.burnoutcrew.reorderable.ReorderableKt$reorderable$1$1"
    f = "Reorderable.kt"
    i = {
        0x0,
        0x1,
        0x1
    }
    l = {
        0x23,
        0x24,
        0x2b
    }
    m = "invokeSuspend"
    n = {
        "$this$forEachGesture",
        "$this$forEachGesture",
        "dragStart"
    }
    s = {
        "L$0",
        "L$0",
        "L$1"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/PointerInputScope;",
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
.field final synthetic $state:Lorg/burnoutcrew/reorderable/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/burnoutcrew/reorderable/l<",
            "*>;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lorg/burnoutcrew/reorderable/l;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/burnoutcrew/reorderable/l<",
            "*>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lorg/burnoutcrew/reorderable/g$d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/burnoutcrew/reorderable/g$d$a;->$state:Lorg/burnoutcrew/reorderable/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

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

    new-instance v0, Lorg/burnoutcrew/reorderable/g$d$a;

    iget-object v1, p0, Lorg/burnoutcrew/reorderable/g$d$a;->$state:Lorg/burnoutcrew/reorderable/l;

    invoke-direct {v0, v1, p2}, Lorg/burnoutcrew/reorderable/g$d$a;-><init>(Lorg/burnoutcrew/reorderable/l;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Lorg/burnoutcrew/reorderable/g$d$a;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroidx/compose/ui/input/pointer/PointerInputScope;
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
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lorg/burnoutcrew/reorderable/g$d$a;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lorg/burnoutcrew/reorderable/g$d$a;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lorg/burnoutcrew/reorderable/g$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lorg/burnoutcrew/reorderable/g$d$a;->invoke(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14
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
    iget v1, p0, Lorg/burnoutcrew/reorderable/g$d$a;->label:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v4, :cond_2

    .line 14
    .line 15
    if-eq v1, v3, :cond_1

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
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
    iget-object v1, p0, Lorg/burnoutcrew/reorderable/g$d$a;->L$1:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lorg/burnoutcrew/reorderable/n;

    .line 35
    .line 36
    iget-object v3, p0, Lorg/burnoutcrew/reorderable/g$d$a;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object v6, v3

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    iget-object v1, p0, Lorg/burnoutcrew/reorderable/g$d$a;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lorg/burnoutcrew/reorderable/g$d$a;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 59
    .line 60
    iget-object v1, p0, Lorg/burnoutcrew/reorderable/g$d$a;->$state:Lorg/burnoutcrew/reorderable/l;

    .line 61
    .line 62
    invoke-virtual {v1}, Lorg/burnoutcrew/reorderable/l;->w()Lkotlinx/coroutines/channels/l;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iput-object p1, p0, Lorg/burnoutcrew/reorderable/g$d$a;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    iput v4, p0, Lorg/burnoutcrew/reorderable/g$d$a;->label:I

    .line 69
    .line 70
    invoke-interface {v1, p0}, Lkotlinx/coroutines/channels/g0;->D(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-ne v1, v0, :cond_4

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_4
    move-object v13, v1

    .line 78
    move-object v1, p1

    .line 79
    move-object p1, v13

    .line 80
    :goto_0
    check-cast p1, Lorg/burnoutcrew/reorderable/n;

    .line 81
    .line 82
    new-instance v4, Lorg/burnoutcrew/reorderable/g$d$a$d;

    .line 83
    .line 84
    invoke-direct {v4, p1, v5}, Lorg/burnoutcrew/reorderable/g$d$a$d;-><init>(Lorg/burnoutcrew/reorderable/n;Lkotlin/coroutines/d;)V

    .line 85
    .line 86
    .line 87
    iput-object v1, p0, Lorg/burnoutcrew/reorderable/g$d$a;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object p1, p0, Lorg/burnoutcrew/reorderable/g$d$a;->L$1:Ljava/lang/Object;

    .line 90
    .line 91
    iput v3, p0, Lorg/burnoutcrew/reorderable/g$d$a;->label:I

    .line 92
    .line 93
    invoke-interface {v1, v4, p0}, Landroidx/compose/ui/input/pointer/PointerInputScope;->awaitPointerEventScope(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    if-ne v3, v0, :cond_5

    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_5
    move-object v6, v1

    .line 101
    move-object v1, p1

    .line 102
    move-object p1, v3

    .line 103
    :goto_1
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 104
    .line 105
    if-eqz p1, :cond_7

    .line 106
    .line 107
    iget-object v3, p0, Lorg/burnoutcrew/reorderable/g$d$a;->$state:Lorg/burnoutcrew/reorderable/l;

    .line 108
    .line 109
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 110
    .line 111
    .line 112
    move-result-wide v7

    .line 113
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    float-to-int v4, v4

    .line 118
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 119
    .line 120
    .line 121
    move-result-wide v7

    .line 122
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    float-to-int v7, v7

    .line 127
    invoke-virtual {v3, v4, v7}, Lorg/burnoutcrew/reorderable/l;->L(II)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_7

    .line 132
    .line 133
    invoke-virtual {v1}, Lorg/burnoutcrew/reorderable/n;->f()Landroidx/compose/ui/geometry/Offset;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    if-eqz v1, :cond_6

    .line 138
    .line 139
    iget-object v3, p0, Lorg/burnoutcrew/reorderable/g$d$a;->$state:Lorg/burnoutcrew/reorderable/l;

    .line 140
    .line 141
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 142
    .line 143
    .line 144
    move-result-wide v7

    .line 145
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    float-to-int v1, v1

    .line 150
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    float-to-int v4, v4

    .line 155
    invoke-virtual {v3, v1, v4}, Lorg/burnoutcrew/reorderable/l;->J(II)V

    .line 156
    .line 157
    .line 158
    :cond_6
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 159
    .line 160
    .line 161
    move-result-wide v7

    .line 162
    new-instance v9, Lorg/burnoutcrew/reorderable/g$d$a$a;

    .line 163
    .line 164
    iget-object p1, p0, Lorg/burnoutcrew/reorderable/g$d$a;->$state:Lorg/burnoutcrew/reorderable/l;

    .line 165
    .line 166
    invoke-direct {v9, p1}, Lorg/burnoutcrew/reorderable/g$d$a$a;-><init>(Lorg/burnoutcrew/reorderable/l;)V

    .line 167
    .line 168
    .line 169
    new-instance v10, Lorg/burnoutcrew/reorderable/g$d$a$b;

    .line 170
    .line 171
    iget-object p1, p0, Lorg/burnoutcrew/reorderable/g$d$a;->$state:Lorg/burnoutcrew/reorderable/l;

    .line 172
    .line 173
    invoke-direct {v10, p1}, Lorg/burnoutcrew/reorderable/g$d$a$b;-><init>(Lorg/burnoutcrew/reorderable/l;)V

    .line 174
    .line 175
    .line 176
    new-instance v11, Lorg/burnoutcrew/reorderable/g$d$a$c;

    .line 177
    .line 178
    iget-object p1, p0, Lorg/burnoutcrew/reorderable/g$d$a;->$state:Lorg/burnoutcrew/reorderable/l;

    .line 179
    .line 180
    invoke-direct {v11, p1}, Lorg/burnoutcrew/reorderable/g$d$a$c;-><init>(Lorg/burnoutcrew/reorderable/l;)V

    .line 181
    .line 182
    .line 183
    iput-object v5, p0, Lorg/burnoutcrew/reorderable/g$d$a;->L$0:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object v5, p0, Lorg/burnoutcrew/reorderable/g$d$a;->L$1:Ljava/lang/Object;

    .line 186
    .line 187
    iput v2, p0, Lorg/burnoutcrew/reorderable/g$d$a;->label:I

    .line 188
    .line 189
    move-object v12, p0

    .line 190
    invoke-static/range {v6 .. v12}, Lorg/burnoutcrew/reorderable/g;->a(Landroidx/compose/ui/input/pointer/PointerInputScope;JLv3/a;Lv3/a;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    if-ne p1, v0, :cond_7

    .line 195
    .line 196
    return-object v0

    .line 197
    :cond_7
    :goto_2
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 198
    .line 199
    return-object p1
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
