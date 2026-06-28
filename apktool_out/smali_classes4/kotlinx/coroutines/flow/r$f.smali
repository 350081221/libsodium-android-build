.class final Lkotlinx/coroutines/flow/r$f;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/flow/r;->k(Lkotlinx/coroutines/flow/i;J)Lkotlinx/coroutines/flow/i;
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
    c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1"
    f = "Delay.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x19e
    }
    m = "invokeSuspend"
    n = {
        "downStream",
        "values"
    }
    s = {
        "L$0",
        "L$1"
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
        "downStream",
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
        "SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n+ 2 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 3 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,405:1\n31#2:406\n32#2:415\n55#3,8:407\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n*L\n391#1:406\n391#1:415\n391#1:407,8\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $this_timeoutInternal:Lkotlinx/coroutines/flow/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $timeout:J

.field J$0:J

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(JLkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlinx/coroutines/flow/i<",
            "+TT;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlinx/coroutines/flow/r$f;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lkotlinx/coroutines/flow/r$f;->$timeout:J

    iput-object p3, p0, Lkotlinx/coroutines/flow/r$f;->$this_timeoutInternal:Lkotlinx/coroutines/flow/i;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlinx/coroutines/flow/j;

    check-cast p3, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/flow/r$f;->invoke(Lkotlinx/coroutines/s0;Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/s0;Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 4
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

    new-instance v0, Lkotlinx/coroutines/flow/r$f;

    iget-wide v1, p0, Lkotlinx/coroutines/flow/r$f;->$timeout:J

    iget-object v3, p0, Lkotlinx/coroutines/flow/r$f;->$this_timeoutInternal:Lkotlinx/coroutines/flow/i;

    invoke-direct {v0, v1, v2, v3, p3}, Lkotlinx/coroutines/flow/r$f;-><init>(JLkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Lkotlinx/coroutines/flow/r$f;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lkotlinx/coroutines/flow/r$f;->L$1:Ljava/lang/Object;

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/flow/r$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lkotlinx/coroutines/flow/r$f;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-wide v4, p0, Lkotlinx/coroutines/flow/r$f;->J$0:J

    .line 14
    .line 15
    iget-object v1, p0, Lkotlinx/coroutines/flow/r$f;->L$1:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lkotlinx/coroutines/channels/g0;

    .line 18
    .line 19
    iget-object v6, p0, Lkotlinx/coroutines/flow/r$f;->L$0:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v6, Lkotlinx/coroutines/flow/j;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object v7, v6

    .line 27
    move-wide v5, v4

    .line 28
    move-object v4, v1

    .line 29
    move-object v1, v0

    .line 30
    move-object v0, p0

    .line 31
    goto :goto_1

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
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lkotlinx/coroutines/flow/r$f;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lkotlinx/coroutines/s0;

    .line 46
    .line 47
    iget-object v1, p0, Lkotlinx/coroutines/flow/r$f;->L$1:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lkotlinx/coroutines/flow/j;

    .line 50
    .line 51
    iget-wide v4, p0, Lkotlinx/coroutines/flow/r$f;->$timeout:J

    .line 52
    .line 53
    sget-object v6, Lkotlin/time/e;->b:Lkotlin/time/e$a;

    .line 54
    .line 55
    invoke-virtual {v6}, Lkotlin/time/e$a;->W()J

    .line 56
    .line 57
    .line 58
    move-result-wide v6

    .line 59
    invoke-static {v4, v5, v6, v7}, Lkotlin/time/e;->l(JJ)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-lez v4, :cond_4

    .line 64
    .line 65
    iget-object v4, p0, Lkotlinx/coroutines/flow/r$f;->$this_timeoutInternal:Lkotlinx/coroutines/flow/i;

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x2

    .line 69
    invoke-static {v4, v5, v3, v6, v3}, Lkotlinx/coroutines/flow/k;->q(Lkotlinx/coroutines/flow/i;ILkotlinx/coroutines/channels/i;ILjava/lang/Object;)Lkotlinx/coroutines/flow/i;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {v4, p1}, Lkotlinx/coroutines/flow/k;->o1(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/s0;)Lkotlinx/coroutines/channels/g0;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-wide v4, p0, Lkotlinx/coroutines/flow/r$f;->$timeout:J

    .line 78
    .line 79
    move-object v6, v1

    .line 80
    move-object v1, p1

    .line 81
    move-object p1, p0

    .line 82
    :goto_0
    new-instance v7, Lkotlinx/coroutines/selects/l;

    .line 83
    .line 84
    invoke-interface {p1}, Lkotlin/coroutines/d;->getContext()Lkotlin/coroutines/g;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-direct {v7, v8}, Lkotlinx/coroutines/selects/l;-><init>(Lkotlin/coroutines/g;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v1}, Lkotlinx/coroutines/channels/g0;->s()Lkotlinx/coroutines/selects/g;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    new-instance v9, Lkotlinx/coroutines/flow/r$f$a;

    .line 96
    .line 97
    invoke-direct {v9, v6, v3}, Lkotlinx/coroutines/flow/r$f$a;-><init>(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v7, v8, v9}, Lkotlinx/coroutines/selects/c;->c(Lkotlinx/coroutines/selects/g;Lv3/p;)V

    .line 101
    .line 102
    .line 103
    new-instance v8, Lkotlinx/coroutines/flow/r$f$b;

    .line 104
    .line 105
    invoke-direct {v8, v4, v5, v3}, Lkotlinx/coroutines/flow/r$f$b;-><init>(JLkotlin/coroutines/d;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v7, v4, v5, v8}, Lkotlinx/coroutines/selects/b;->b(Lkotlinx/coroutines/selects/c;JLv3/l;)V

    .line 109
    .line 110
    .line 111
    iput-object v6, p1, Lkotlinx/coroutines/flow/r$f;->L$0:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v1, p1, Lkotlinx/coroutines/flow/r$f;->L$1:Ljava/lang/Object;

    .line 114
    .line 115
    iput-wide v4, p1, Lkotlinx/coroutines/flow/r$f;->J$0:J

    .line 116
    .line 117
    iput v2, p1, Lkotlinx/coroutines/flow/r$f;->label:I

    .line 118
    .line 119
    invoke-virtual {v7, p1}, Lkotlinx/coroutines/selects/l;->w(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    if-ne v7, v0, :cond_2

    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_2
    move-object v10, v0

    .line 127
    move-object v0, p1

    .line 128
    move-object p1, v7

    .line 129
    move-object v7, v6

    .line 130
    move-wide v5, v4

    .line 131
    move-object v4, v1

    .line 132
    move-object v1, v10

    .line 133
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-nez p1, :cond_3

    .line 140
    .line 141
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 142
    .line 143
    return-object p1

    .line 144
    :cond_3
    move-object p1, v0

    .line 145
    move-object v0, v1

    .line 146
    move-object v1, v4

    .line 147
    move-wide v4, v5

    .line 148
    move-object v6, v7

    .line 149
    goto :goto_0

    .line 150
    :cond_4
    new-instance p1, Lkotlinx/coroutines/t3;

    .line 151
    .line 152
    const-string v0, "Timed out immediately"

    .line 153
    .line 154
    invoke-direct {p1, v0}, Lkotlinx/coroutines/t3;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p1
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
