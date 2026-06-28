.class final Lkotlinx/coroutines/channels/v$k;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/channels/v;->n(Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/g;Lv3/p;)Lkotlinx/coroutines/channels/g0;
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
    c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1"
    f = "Deprecated.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x2
    }
    l = {
        0xc6,
        0xc7,
        0xc7
    }
    m = "invokeSuspend"
    n = {
        "$this$produce",
        "$this$produce",
        "e",
        "$this$produce"
    }
    s = {
        "L$0",
        "L$0",
        "L$2",
        "L$0"
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
.field final synthetic $predicate:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "TE;",
            "Lkotlin/coroutines/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $this_filter:Lkotlinx/coroutines/channels/g0;
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
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlinx/coroutines/channels/v$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/channels/v$k;->$this_filter:Lkotlinx/coroutines/channels/g0;

    iput-object p2, p0, Lkotlinx/coroutines/channels/v$k;->$predicate:Lv3/p;

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

    new-instance v0, Lkotlinx/coroutines/channels/v$k;

    iget-object v1, p0, Lkotlinx/coroutines/channels/v$k;->$this_filter:Lkotlinx/coroutines/channels/g0;

    iget-object v2, p0, Lkotlinx/coroutines/channels/v$k;->$predicate:Lv3/p;

    invoke-direct {v0, v1, v2, p2}, Lkotlinx/coroutines/channels/v$k;-><init>(Lkotlinx/coroutines/channels/g0;Lv3/p;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Lkotlinx/coroutines/channels/v$k;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/channels/e0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/v$k;->invoke(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/v$k;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/channels/v$k;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lkotlinx/coroutines/channels/v$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
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
    iget v1, p0, Lkotlinx/coroutines/channels/v$k;->label:I

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
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$k;->L$1:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lkotlinx/coroutines/channels/n;

    .line 22
    .line 23
    iget-object v6, p0, Lkotlinx/coroutines/channels/v$k;->L$0:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v6, Lkotlinx/coroutines/channels/e0;

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$k;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    iget-object v6, p0, Lkotlinx/coroutines/channels/v$k;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v6, Lkotlinx/coroutines/channels/n;

    .line 44
    .line 45
    iget-object v7, p0, Lkotlinx/coroutines/channels/v$k;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v7, Lkotlinx/coroutines/channels/e0;

    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v8, v7

    .line 53
    move-object v7, v1

    .line 54
    move-object v1, v0

    .line 55
    move-object v0, p0

    .line 56
    goto :goto_3

    .line 57
    :cond_2
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$k;->L$1:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Lkotlinx/coroutines/channels/n;

    .line 60
    .line 61
    iget-object v6, p0, Lkotlinx/coroutines/channels/v$k;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v6, Lkotlinx/coroutines/channels/e0;

    .line 64
    .line 65
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v7, v6

    .line 69
    move-object v6, v1

    .line 70
    move-object v1, v0

    .line 71
    move-object v0, p0

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lkotlinx/coroutines/channels/v$k;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, Lkotlinx/coroutines/channels/e0;

    .line 79
    .line 80
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$k;->$this_filter:Lkotlinx/coroutines/channels/g0;

    .line 81
    .line 82
    invoke-interface {v1}, Lkotlinx/coroutines/channels/g0;->iterator()Lkotlinx/coroutines/channels/n;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    move-object v6, p1

    .line 87
    :goto_0
    move-object p1, p0

    .line 88
    :goto_1
    iput-object v6, p1, Lkotlinx/coroutines/channels/v$k;->L$0:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object v1, p1, Lkotlinx/coroutines/channels/v$k;->L$1:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v2, p1, Lkotlinx/coroutines/channels/v$k;->L$2:Ljava/lang/Object;

    .line 93
    .line 94
    iput v5, p1, Lkotlinx/coroutines/channels/v$k;->label:I

    .line 95
    .line 96
    invoke-interface {v1, p1}, Lkotlinx/coroutines/channels/n;->c(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    if-ne v7, v0, :cond_4

    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_4
    move-object v9, v0

    .line 104
    move-object v0, p1

    .line 105
    move-object p1, v7

    .line 106
    move-object v7, v6

    .line 107
    move-object v6, v1

    .line 108
    move-object v1, v9

    .line 109
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_7

    .line 116
    .line 117
    invoke-interface {v6}, Lkotlinx/coroutines/channels/n;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-object v8, v0, Lkotlinx/coroutines/channels/v$k;->$predicate:Lv3/p;

    .line 122
    .line 123
    iput-object v7, v0, Lkotlinx/coroutines/channels/v$k;->L$0:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object v6, v0, Lkotlinx/coroutines/channels/v$k;->L$1:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object p1, v0, Lkotlinx/coroutines/channels/v$k;->L$2:Ljava/lang/Object;

    .line 128
    .line 129
    iput v4, v0, Lkotlinx/coroutines/channels/v$k;->label:I

    .line 130
    .line 131
    invoke-interface {v8, p1, v0}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    if-ne v8, v1, :cond_5

    .line 136
    .line 137
    return-object v1

    .line 138
    :cond_5
    move-object v9, v7

    .line 139
    move-object v7, p1

    .line 140
    move-object p1, v8

    .line 141
    move-object v8, v9

    .line 142
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_6

    .line 149
    .line 150
    iput-object v8, v0, Lkotlinx/coroutines/channels/v$k;->L$0:Ljava/lang/Object;

    .line 151
    .line 152
    iput-object v6, v0, Lkotlinx/coroutines/channels/v$k;->L$1:Ljava/lang/Object;

    .line 153
    .line 154
    iput-object v2, v0, Lkotlinx/coroutines/channels/v$k;->L$2:Ljava/lang/Object;

    .line 155
    .line 156
    iput v3, v0, Lkotlinx/coroutines/channels/v$k;->label:I

    .line 157
    .line 158
    invoke-interface {v8, v7, v0}, Lkotlinx/coroutines/channels/h0;->F(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    if-ne p1, v1, :cond_6

    .line 163
    .line 164
    return-object v1

    .line 165
    :cond_6
    move-object p1, v0

    .line 166
    move-object v0, v1

    .line 167
    move-object v1, v6

    .line 168
    move-object v6, v8

    .line 169
    goto :goto_1

    .line 170
    :cond_7
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 171
    .line 172
    return-object p1
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
