.class final Lorg/burnoutcrew/reorderable/a$a$a$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/burnoutcrew/reorderable/a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lv3/p<",
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "org.burnoutcrew.reorderable.DetectReorderKt$detectReorder$1$1$1"
    f = "DetectReorder.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x1e,
        0x22
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitPointerEventScope",
        "$this$awaitPointerEventScope",
        "down",
        "overSlop"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
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

.field L$2:Ljava/lang/Object;

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
            "Lorg/burnoutcrew/reorderable/a$a$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/burnoutcrew/reorderable/a$a$a$a;->$state:Lorg/burnoutcrew/reorderable/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/d;)V

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

    new-instance v0, Lorg/burnoutcrew/reorderable/a$a$a$a;

    iget-object v1, p0, Lorg/burnoutcrew/reorderable/a$a$a$a;->$state:Lorg/burnoutcrew/reorderable/l;

    invoke-direct {v0, v1, p2}, Lorg/burnoutcrew/reorderable/a$a$a$a;-><init>(Lorg/burnoutcrew/reorderable/l;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Lorg/burnoutcrew/reorderable/a$a$a$a;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
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
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lorg/burnoutcrew/reorderable/a$a$a$a;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lorg/burnoutcrew/reorderable/a$a$a$a;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lorg/burnoutcrew/reorderable/a$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lorg/burnoutcrew/reorderable/a$a$a$a;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
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
    iget v1, p0, Lorg/burnoutcrew/reorderable/a$a$a$a;->label:I

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
    iget-object v1, p0, Lorg/burnoutcrew/reorderable/a$a$a$a;->L$2:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lkotlin/jvm/internal/k1$g;

    .line 18
    .line 19
    iget-object v3, p0, Lorg/burnoutcrew/reorderable/a$a$a$a;->L$1:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 22
    .line 23
    iget-object v4, p0, Lorg/burnoutcrew/reorderable/a$a$a$a;->L$0:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object v10, p0

    .line 31
    goto :goto_2

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    iget-object v1, p0, Lorg/burnoutcrew/reorderable/a$a$a$a;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lorg/burnoutcrew/reorderable/a$a$a$a;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v1, p1

    .line 54
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 55
    .line 56
    iput-object v1, p0, Lorg/burnoutcrew/reorderable/a$a$a$a;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    iput v3, p0, Lorg/burnoutcrew/reorderable/a$a$a$a;->label:I

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    invoke-static {v1, p1, p0}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlin/coroutines/d;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v0, :cond_3

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_3
    :goto_0
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 69
    .line 70
    new-instance v3, Lkotlin/jvm/internal/k1$g;

    .line 71
    .line 72
    invoke-direct {v3}, Lkotlin/jvm/internal/k1$g;-><init>()V

    .line 73
    .line 74
    .line 75
    sget-object v4, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 76
    .line 77
    invoke-virtual {v4}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    iput-wide v4, v3, Lkotlin/jvm/internal/k1$g;->element:J

    .line 82
    .line 83
    move-object v10, p0

    .line 84
    move-object v11, v3

    .line 85
    move-object v3, p1

    .line 86
    move-object p1, v1

    .line 87
    move-object v1, v11

    .line 88
    :goto_1
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 89
    .line 90
    .line 91
    move-result-wide v5

    .line 92
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    new-instance v8, Lorg/burnoutcrew/reorderable/a$a$a$a$a;

    .line 97
    .line 98
    invoke-direct {v8, v1}, Lorg/burnoutcrew/reorderable/a$a$a$a$a;-><init>(Lkotlin/jvm/internal/k1$g;)V

    .line 99
    .line 100
    .line 101
    iput-object p1, v10, Lorg/burnoutcrew/reorderable/a$a$a$a;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object v3, v10, Lorg/burnoutcrew/reorderable/a$a$a$a;->L$1:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v1, v10, Lorg/burnoutcrew/reorderable/a$a$a$a;->L$2:Ljava/lang/Object;

    .line 106
    .line 107
    iput v2, v10, Lorg/burnoutcrew/reorderable/a$a$a$a;->label:I

    .line 108
    .line 109
    move-object v4, p1

    .line 110
    move-object v9, v10

    .line 111
    invoke-static/range {v4 .. v9}, Lorg/burnoutcrew/reorderable/c;->c(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    if-ne v4, v0, :cond_4

    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_4
    move-object v11, v4

    .line 119
    move-object v4, p1

    .line 120
    move-object p1, v11

    .line 121
    :goto_2
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 122
    .line 123
    if-eqz p1, :cond_6

    .line 124
    .line 125
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-eqz v5, :cond_5

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_5
    move-object p1, v4

    .line 133
    goto :goto_1

    .line 134
    :cond_6
    :goto_3
    if-eqz p1, :cond_7

    .line 135
    .line 136
    iget-object p1, v10, Lorg/burnoutcrew/reorderable/a$a$a$a;->$state:Lorg/burnoutcrew/reorderable/l;

    .line 137
    .line 138
    invoke-virtual {p1}, Lorg/burnoutcrew/reorderable/l;->w()Lkotlinx/coroutines/channels/l;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    new-instance v0, Lorg/burnoutcrew/reorderable/n;

    .line 143
    .line 144
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 145
    .line 146
    .line 147
    move-result-wide v2

    .line 148
    iget-wide v4, v1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 149
    .line 150
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    const/4 v4, 0x0

    .line 155
    invoke-direct {v0, v2, v3, v1, v4}, Lorg/burnoutcrew/reorderable/n;-><init>(JLandroidx/compose/ui/geometry/Offset;Lkotlin/jvm/internal/w;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {p1, v0}, Lkotlinx/coroutines/channels/h0;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    :cond_7
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 162
    .line 163
    return-object p1
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
