.class final Lkotlinx/coroutines/channels/v$l;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/channels/v;->p(Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/g;Lv3/q;)Lkotlinx/coroutines/channels/g0;
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
        "Ljava/lang/Object;",
        ">;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1"
    f = "Deprecated.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2
    }
    l = {
        0xd3,
        0xd4,
        0xd4
    }
    m = "invokeSuspend"
    n = {
        "$this$produce",
        "index",
        "$this$produce",
        "e",
        "index",
        "$this$produce",
        "index"
    }
    s = {
        "L$0",
        "I$0",
        "L$0",
        "L$2",
        "I$0",
        "L$0",
        "I$0"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"
    }
    d2 = {
        "E",
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
.field final synthetic $predicate:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $this_filterIndexed:Lkotlinx/coroutines/channels/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/g0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlinx/coroutines/channels/g0;Lv3/q;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/g0<",
            "Ljava/lang/Object;",
            ">;",
            "Lv3/q<",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlinx/coroutines/channels/v$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/channels/v$l;->$this_filterIndexed:Lkotlinx/coroutines/channels/g0;

    iput-object p2, p0, Lkotlinx/coroutines/channels/v$l;->$predicate:Lv3/q;

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

    new-instance v0, Lkotlinx/coroutines/channels/v$l;

    iget-object v1, p0, Lkotlinx/coroutines/channels/v$l;->$this_filterIndexed:Lkotlinx/coroutines/channels/g0;

    iget-object v2, p0, Lkotlinx/coroutines/channels/v$l;->$predicate:Lv3/q;

    invoke-direct {v0, v1, v2, p2}, Lkotlinx/coroutines/channels/v$l;-><init>(Lkotlinx/coroutines/channels/g0;Lv3/q;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Lkotlinx/coroutines/channels/v$l;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/channels/e0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/v$l;->invoke(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/v$l;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/channels/v$l;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lkotlinx/coroutines/channels/v$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lkotlinx/coroutines/channels/v$l;->label:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v5, :cond_2

    .line 14
    .line 15
    if-eq v1, v4, :cond_1

    .line 16
    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lkotlinx/coroutines/channels/v$l;->I$0:I

    .line 20
    .line 21
    iget-object v6, p0, Lkotlinx/coroutines/channels/v$l;->L$1:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v6, Lkotlinx/coroutines/channels/n;

    .line 24
    .line 25
    iget-object v7, p0, Lkotlinx/coroutines/channels/v$l;->L$0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v7, Lkotlinx/coroutines/channels/e0;

    .line 28
    .line 29
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move-object p1, p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    iget v1, p0, Lkotlinx/coroutines/channels/v$l;->I$0:I

    .line 43
    .line 44
    iget-object v6, p0, Lkotlinx/coroutines/channels/v$l;->L$2:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object v7, p0, Lkotlinx/coroutines/channels/v$l;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v7, Lkotlinx/coroutines/channels/n;

    .line 49
    .line 50
    iget-object v8, p0, Lkotlinx/coroutines/channels/v$l;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v8, Lkotlinx/coroutines/channels/e0;

    .line 53
    .line 54
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move v10, v1

    .line 58
    move-object v1, v0

    .line 59
    move-object v0, p0

    .line 60
    move-object v11, v7

    .line 61
    move-object v7, v6

    .line 62
    :goto_0
    move-object v6, v11

    .line 63
    goto/16 :goto_3

    .line 64
    .line 65
    :cond_2
    iget v1, p0, Lkotlinx/coroutines/channels/v$l;->I$0:I

    .line 66
    .line 67
    iget-object v6, p0, Lkotlinx/coroutines/channels/v$l;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v6, Lkotlinx/coroutines/channels/n;

    .line 70
    .line 71
    iget-object v7, p0, Lkotlinx/coroutines/channels/v$l;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v7, Lkotlinx/coroutines/channels/e0;

    .line 74
    .line 75
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v8, v7

    .line 79
    move-object v7, v6

    .line 80
    move v6, v1

    .line 81
    move-object v1, v0

    .line 82
    move-object v0, p0

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lkotlinx/coroutines/channels/v$l;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Lkotlinx/coroutines/channels/e0;

    .line 90
    .line 91
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$l;->$this_filterIndexed:Lkotlinx/coroutines/channels/g0;

    .line 92
    .line 93
    invoke-interface {v1}, Lkotlinx/coroutines/channels/g0;->iterator()Lkotlinx/coroutines/channels/n;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const/4 v6, 0x0

    .line 98
    move-object v7, p1

    .line 99
    move-object p1, p0

    .line 100
    move v11, v6

    .line 101
    move-object v6, v1

    .line 102
    move v1, v11

    .line 103
    :goto_1
    iput-object v7, p1, Lkotlinx/coroutines/channels/v$l;->L$0:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v6, p1, Lkotlinx/coroutines/channels/v$l;->L$1:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object v2, p1, Lkotlinx/coroutines/channels/v$l;->L$2:Ljava/lang/Object;

    .line 108
    .line 109
    iput v1, p1, Lkotlinx/coroutines/channels/v$l;->I$0:I

    .line 110
    .line 111
    iput v5, p1, Lkotlinx/coroutines/channels/v$l;->label:I

    .line 112
    .line 113
    invoke-interface {v6, p1}, Lkotlinx/coroutines/channels/n;->c(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    if-ne v8, v0, :cond_4

    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_4
    move-object v11, v0

    .line 121
    move-object v0, p1

    .line 122
    move-object p1, v8

    .line 123
    move-object v8, v7

    .line 124
    move-object v7, v6

    .line 125
    move v6, v1

    .line 126
    move-object v1, v11

    .line 127
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-eqz p1, :cond_7

    .line 134
    .line 135
    invoke-interface {v7}, Lkotlinx/coroutines/channels/n;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iget-object v9, v0, Lkotlinx/coroutines/channels/v$l;->$predicate:Lv3/q;

    .line 140
    .line 141
    add-int/lit8 v10, v6, 0x1

    .line 142
    .line 143
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/b;->f(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    iput-object v8, v0, Lkotlinx/coroutines/channels/v$l;->L$0:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v7, v0, Lkotlinx/coroutines/channels/v$l;->L$1:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object p1, v0, Lkotlinx/coroutines/channels/v$l;->L$2:Ljava/lang/Object;

    .line 152
    .line 153
    iput v10, v0, Lkotlinx/coroutines/channels/v$l;->I$0:I

    .line 154
    .line 155
    iput v4, v0, Lkotlinx/coroutines/channels/v$l;->label:I

    .line 156
    .line 157
    invoke-interface {v9, v6, p1, v0}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    if-ne v6, v1, :cond_5

    .line 162
    .line 163
    return-object v1

    .line 164
    :cond_5
    move-object v11, v7

    .line 165
    move-object v7, p1

    .line 166
    move-object p1, v6

    .line 167
    goto :goto_0

    .line 168
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_6

    .line 175
    .line 176
    iput-object v8, v0, Lkotlinx/coroutines/channels/v$l;->L$0:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v6, v0, Lkotlinx/coroutines/channels/v$l;->L$1:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v2, v0, Lkotlinx/coroutines/channels/v$l;->L$2:Ljava/lang/Object;

    .line 181
    .line 182
    iput v10, v0, Lkotlinx/coroutines/channels/v$l;->I$0:I

    .line 183
    .line 184
    iput v3, v0, Lkotlinx/coroutines/channels/v$l;->label:I

    .line 185
    .line 186
    invoke-interface {v8, v7, v0}, Lkotlinx/coroutines/channels/h0;->F(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    if-ne p1, v1, :cond_6

    .line 191
    .line 192
    return-object v1

    .line 193
    :cond_6
    move-object p1, v0

    .line 194
    move-object v0, v1

    .line 195
    move-object v7, v8

    .line 196
    move v1, v10

    .line 197
    goto :goto_1

    .line 198
    :cond_7
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 199
    .line 200
    return-object p1
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
