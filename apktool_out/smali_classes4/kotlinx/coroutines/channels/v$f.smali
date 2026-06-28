.class final Lkotlinx/coroutines/channels/v$f;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/channels/v;->f(Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/g;Lv3/p;)Lkotlinx/coroutines/channels/g0;
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
        "-TE;>;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1"
    f = "Deprecated.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x183,
        0x184,
        0x186
    }
    m = "invokeSuspend"
    n = {
        "$this$produce",
        "keys",
        "$this$produce",
        "keys",
        "e",
        "$this$produce",
        "keys",
        "k"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$3",
        "L$0",
        "L$1",
        "L$3"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"
    }
    d2 = {
        "E",
        "K",
        "Lkotlinx/coroutines/channels/e0;",
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
.field final synthetic $selector:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "TE;",
            "Lkotlin/coroutines/d<",
            "-TK;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $this_distinctBy:Lkotlinx/coroutines/channels/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/g0<",
            "TE;>;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlinx/coroutines/channels/g0;Lv3/p;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/g0<",
            "+TE;>;",
            "Lv3/p<",
            "-TE;-",
            "Lkotlin/coroutines/d<",
            "-TK;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlinx/coroutines/channels/v$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/channels/v$f;->$this_distinctBy:Lkotlinx/coroutines/channels/g0;

    iput-object p2, p0, Lkotlinx/coroutines/channels/v$f;->$selector:Lv3/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 3
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

    new-instance v0, Lkotlinx/coroutines/channels/v$f;

    iget-object v1, p0, Lkotlinx/coroutines/channels/v$f;->$this_distinctBy:Lkotlinx/coroutines/channels/g0;

    iget-object v2, p0, Lkotlinx/coroutines/channels/v$f;->$selector:Lv3/p;

    invoke-direct {v0, v1, v2, p2}, Lkotlinx/coroutines/channels/v$f;-><init>(Lkotlinx/coroutines/channels/g0;Lv3/p;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Lkotlinx/coroutines/channels/v$f;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/channels/e0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/v$f;->invoke(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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
            "-TE;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/v$f;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/channels/v$f;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lkotlinx/coroutines/channels/v$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
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
    iget v1, p0, Lkotlinx/coroutines/channels/v$f;->label:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$f;->L$3:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v5, p0, Lkotlinx/coroutines/channels/v$f;->L$2:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Lkotlinx/coroutines/channels/n;

    .line 23
    .line 24
    iget-object v6, p0, Lkotlinx/coroutines/channels/v$f;->L$1:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v6, Ljava/util/HashSet;

    .line 27
    .line 28
    iget-object v7, p0, Lkotlinx/coroutines/channels/v$f;->L$0:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v7, Lkotlinx/coroutines/channels/e0;

    .line 31
    .line 32
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object p1, p0

    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_1
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$f;->L$3:Ljava/lang/Object;

    .line 47
    .line 48
    iget-object v5, p0, Lkotlinx/coroutines/channels/v$f;->L$2:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v5, Lkotlinx/coroutines/channels/n;

    .line 51
    .line 52
    iget-object v6, p0, Lkotlinx/coroutines/channels/v$f;->L$1:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, Ljava/util/HashSet;

    .line 55
    .line 56
    iget-object v7, p0, Lkotlinx/coroutines/channels/v$f;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v7, Lkotlinx/coroutines/channels/e0;

    .line 59
    .line 60
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v8, v7

    .line 64
    move-object v7, v6

    .line 65
    move-object v6, v1

    .line 66
    move-object v1, v0

    .line 67
    move-object v0, p0

    .line 68
    goto/16 :goto_2

    .line 69
    .line 70
    :cond_2
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$f;->L$2:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, Lkotlinx/coroutines/channels/n;

    .line 73
    .line 74
    iget-object v5, p0, Lkotlinx/coroutines/channels/v$f;->L$1:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v5, Ljava/util/HashSet;

    .line 77
    .line 78
    iget-object v6, p0, Lkotlinx/coroutines/channels/v$f;->L$0:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v6, Lkotlinx/coroutines/channels/e0;

    .line 81
    .line 82
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move-object v7, v6

    .line 86
    move-object v6, v5

    .line 87
    move-object v5, v1

    .line 88
    move-object v1, v0

    .line 89
    move-object v0, p0

    .line 90
    goto :goto_1

    .line 91
    :cond_3
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lkotlinx/coroutines/channels/v$f;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p1, Lkotlinx/coroutines/channels/e0;

    .line 97
    .line 98
    new-instance v1, Ljava/util/HashSet;

    .line 99
    .line 100
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 101
    .line 102
    .line 103
    iget-object v5, p0, Lkotlinx/coroutines/channels/v$f;->$this_distinctBy:Lkotlinx/coroutines/channels/g0;

    .line 104
    .line 105
    invoke-interface {v5}, Lkotlinx/coroutines/channels/g0;->iterator()Lkotlinx/coroutines/channels/n;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    move-object v6, p1

    .line 110
    move-object p1, p0

    .line 111
    move-object v10, v5

    .line 112
    move-object v5, v1

    .line 113
    move-object v1, v10

    .line 114
    :goto_0
    iput-object v6, p1, Lkotlinx/coroutines/channels/v$f;->L$0:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v5, p1, Lkotlinx/coroutines/channels/v$f;->L$1:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v1, p1, Lkotlinx/coroutines/channels/v$f;->L$2:Ljava/lang/Object;

    .line 119
    .line 120
    const/4 v7, 0x0

    .line 121
    iput-object v7, p1, Lkotlinx/coroutines/channels/v$f;->L$3:Ljava/lang/Object;

    .line 122
    .line 123
    iput v4, p1, Lkotlinx/coroutines/channels/v$f;->label:I

    .line 124
    .line 125
    invoke-interface {v1, p1}, Lkotlinx/coroutines/channels/n;->c(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    if-ne v7, v0, :cond_4

    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_4
    move-object v10, v0

    .line 133
    move-object v0, p1

    .line 134
    move-object p1, v7

    .line 135
    move-object v7, v6

    .line 136
    move-object v6, v5

    .line 137
    move-object v5, v1

    .line 138
    move-object v1, v10

    .line 139
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_8

    .line 146
    .line 147
    invoke-interface {v5}, Lkotlinx/coroutines/channels/n;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iget-object v8, v0, Lkotlinx/coroutines/channels/v$f;->$selector:Lv3/p;

    .line 152
    .line 153
    iput-object v7, v0, Lkotlinx/coroutines/channels/v$f;->L$0:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v6, v0, Lkotlinx/coroutines/channels/v$f;->L$1:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v5, v0, Lkotlinx/coroutines/channels/v$f;->L$2:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object p1, v0, Lkotlinx/coroutines/channels/v$f;->L$3:Ljava/lang/Object;

    .line 160
    .line 161
    iput v3, v0, Lkotlinx/coroutines/channels/v$f;->label:I

    .line 162
    .line 163
    invoke-interface {v8, p1, v0}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    if-ne v8, v1, :cond_5

    .line 168
    .line 169
    return-object v1

    .line 170
    :cond_5
    move-object v10, v6

    .line 171
    move-object v6, p1

    .line 172
    move-object p1, v8

    .line 173
    move-object v8, v7

    .line 174
    move-object v7, v10

    .line 175
    :goto_2
    invoke-virtual {v7, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v9

    .line 179
    if-nez v9, :cond_7

    .line 180
    .line 181
    iput-object v8, v0, Lkotlinx/coroutines/channels/v$f;->L$0:Ljava/lang/Object;

    .line 182
    .line 183
    iput-object v7, v0, Lkotlinx/coroutines/channels/v$f;->L$1:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object v5, v0, Lkotlinx/coroutines/channels/v$f;->L$2:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object p1, v0, Lkotlinx/coroutines/channels/v$f;->L$3:Ljava/lang/Object;

    .line 188
    .line 189
    iput v2, v0, Lkotlinx/coroutines/channels/v$f;->label:I

    .line 190
    .line 191
    invoke-interface {v8, v6, v0}, Lkotlinx/coroutines/channels/h0;->F(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    if-ne v6, v1, :cond_6

    .line 196
    .line 197
    return-object v1

    .line 198
    :cond_6
    move-object v6, v7

    .line 199
    move-object v7, v8

    .line 200
    move-object v10, v1

    .line 201
    move-object v1, p1

    .line 202
    move-object p1, v0

    .line 203
    move-object v0, v10

    .line 204
    :goto_3
    invoke-interface {v6, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-object v1, v5

    .line 208
    move-object v5, v6

    .line 209
    move-object v6, v7

    .line 210
    goto :goto_0

    .line 211
    :cond_7
    move-object p1, v0

    .line 212
    move-object v0, v1

    .line 213
    move-object v1, v5

    .line 214
    move-object v5, v7

    .line 215
    move-object v6, v8

    .line 216
    goto :goto_0

    .line 217
    :cond_8
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 218
    .line 219
    return-object p1
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
