.class final Lkotlinx/coroutines/channels/v$f0;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/channels/v;->S(Lkotlinx/coroutines/channels/g0;ILkotlin/coroutines/g;)Lkotlinx/coroutines/channels/g0;
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
    c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1"
    f = "Deprecated.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0xfe,
        0xff
    }
    m = "invokeSuspend"
    n = {
        "$this$produce",
        "remaining",
        "$this$produce",
        "remaining"
    }
    s = {
        "L$0",
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$take$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n1#2:480\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $n:I

.field final synthetic $this_take:Lkotlinx/coroutines/channels/g0;
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

.field label:I


# direct methods
.method constructor <init>(ILkotlinx/coroutines/channels/g0;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlinx/coroutines/channels/g0<",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlinx/coroutines/channels/v$f0;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lkotlinx/coroutines/channels/v$f0;->$n:I

    iput-object p2, p0, Lkotlinx/coroutines/channels/v$f0;->$this_take:Lkotlinx/coroutines/channels/g0;

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

    new-instance v0, Lkotlinx/coroutines/channels/v$f0;

    iget v1, p0, Lkotlinx/coroutines/channels/v$f0;->$n:I

    iget-object v2, p0, Lkotlinx/coroutines/channels/v$f0;->$this_take:Lkotlinx/coroutines/channels/g0;

    invoke-direct {v0, v1, v2, p2}, Lkotlinx/coroutines/channels/v$f0;-><init>(ILkotlinx/coroutines/channels/g0;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Lkotlinx/coroutines/channels/v$f0;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/channels/e0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/v$f0;->invoke(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/v$f0;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/channels/v$f0;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lkotlinx/coroutines/channels/v$f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
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
    iget v1, p0, Lkotlinx/coroutines/channels/v$f0;->label:I

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
    iget v1, p0, Lkotlinx/coroutines/channels/v$f0;->I$0:I

    .line 16
    .line 17
    iget-object v4, p0, Lkotlinx/coroutines/channels/v$f0;->L$1:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Lkotlinx/coroutines/channels/n;

    .line 20
    .line 21
    iget-object v5, p0, Lkotlinx/coroutines/channels/v$f0;->L$0:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v5, Lkotlinx/coroutines/channels/e0;

    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    move-object p1, v5

    .line 29
    move-object v5, p0

    .line 30
    goto/16 :goto_2

    .line 31
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
    iget v1, p0, Lkotlinx/coroutines/channels/v$f0;->I$0:I

    .line 41
    .line 42
    iget-object v4, p0, Lkotlinx/coroutines/channels/v$f0;->L$1:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v4, Lkotlinx/coroutines/channels/n;

    .line 45
    .line 46
    iget-object v5, p0, Lkotlinx/coroutines/channels/v$f0;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v5, Lkotlinx/coroutines/channels/e0;

    .line 49
    .line 50
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object v6, p0

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lkotlinx/coroutines/channels/v$f0;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Lkotlinx/coroutines/channels/e0;

    .line 61
    .line 62
    iget v1, p0, Lkotlinx/coroutines/channels/v$f0;->$n:I

    .line 63
    .line 64
    if-nez v1, :cond_3

    .line 65
    .line 66
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_3
    if-ltz v1, :cond_4

    .line 70
    .line 71
    move v4, v3

    .line 72
    goto :goto_0

    .line 73
    :cond_4
    const/4 v4, 0x0

    .line 74
    :goto_0
    if-eqz v4, :cond_9

    .line 75
    .line 76
    iget-object v4, p0, Lkotlinx/coroutines/channels/v$f0;->$this_take:Lkotlinx/coroutines/channels/g0;

    .line 77
    .line 78
    invoke-interface {v4}, Lkotlinx/coroutines/channels/g0;->iterator()Lkotlinx/coroutines/channels/n;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    move-object v5, p0

    .line 83
    :cond_5
    iput-object p1, v5, Lkotlinx/coroutines/channels/v$f0;->L$0:Ljava/lang/Object;

    .line 84
    .line 85
    iput-object v4, v5, Lkotlinx/coroutines/channels/v$f0;->L$1:Ljava/lang/Object;

    .line 86
    .line 87
    iput v1, v5, Lkotlinx/coroutines/channels/v$f0;->I$0:I

    .line 88
    .line 89
    iput v3, v5, Lkotlinx/coroutines/channels/v$f0;->label:I

    .line 90
    .line 91
    invoke-interface {v4, v5}, Lkotlinx/coroutines/channels/n;->c(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    if-ne v6, v0, :cond_6

    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_6
    move-object v7, v5

    .line 99
    move-object v5, p1

    .line 100
    move-object p1, v6

    .line 101
    move-object v6, v7

    .line 102
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_8

    .line 109
    .line 110
    invoke-interface {v4}, Lkotlinx/coroutines/channels/n;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iput-object v5, v6, Lkotlinx/coroutines/channels/v$f0;->L$0:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v4, v6, Lkotlinx/coroutines/channels/v$f0;->L$1:Ljava/lang/Object;

    .line 117
    .line 118
    iput v1, v6, Lkotlinx/coroutines/channels/v$f0;->I$0:I

    .line 119
    .line 120
    iput v2, v6, Lkotlinx/coroutines/channels/v$f0;->label:I

    .line 121
    .line 122
    invoke-interface {v5, p1, v6}, Lkotlinx/coroutines/channels/h0;->F(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-ne p1, v0, :cond_7

    .line 127
    .line 128
    return-object v0

    .line 129
    :cond_7
    move-object p1, v5

    .line 130
    move-object v5, v6

    .line 131
    :goto_2
    add-int/lit8 v1, v1, -0x1

    .line 132
    .line 133
    if-nez v1, :cond_5

    .line 134
    .line 135
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 136
    .line 137
    return-object p1

    .line 138
    :cond_8
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 139
    .line 140
    return-object p1

    .line 141
    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v0, "Requested element count "

    .line 147
    .line 148
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v0, " is less than zero."

    .line 155
    .line 156
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v0
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
