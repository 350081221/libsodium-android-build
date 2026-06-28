.class final synthetic Lkotlinx/coroutines/flow/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u001c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u001a\u001c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u001a\u001e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u000eH\u0007\u001a$\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0011\u001a\u00020\u0010\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0013"
    }
    d2 = {
        "T",
        "Lkotlinx/coroutines/flow/j;",
        "Lkotlinx/coroutines/channels/g0;",
        "channel",
        "Lkotlin/r2;",
        "d",
        "(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "",
        "consume",
        "e",
        "(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/channels/g0;ZLkotlin/coroutines/d;)Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/i;",
        "g",
        "c",
        "Lkotlinx/coroutines/channels/d;",
        "b",
        "Lkotlinx/coroutines/s0;",
        "scope",
        "f",
        "kotlinx-coroutines-core"
    }
    k = 0x5
    mv = {
        0x1,
        0x8,
        0x0
    }
    xs = "kotlinx/coroutines/flow/FlowKt"
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,176:1\n106#2:177\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n*L\n153#1:177\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/channels/g0;ZLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkotlinx/coroutines/flow/m;->e(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/channels/g0;ZLkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkotlinx/coroutines/channels/d;)Lkotlinx/coroutines/flow/i;
    .locals 1
    .param p0    # Lkotlinx/coroutines/channels/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/channels/d<",
            "TT;>;)",
            "Lkotlinx/coroutines/flow/i<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->ERROR:Lkotlin/m;
        message = "\'BroadcastChannel\' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow"
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lkotlinx/coroutines/flow/m$a;

    invoke-direct {v0, p0}, Lkotlinx/coroutines/flow/m$a;-><init>(Lkotlinx/coroutines/channels/d;)V

    return-object v0
.end method

.method public static final c(Lkotlinx/coroutines/channels/g0;)Lkotlinx/coroutines/flow/i;
    .locals 9
    .param p0    # Lkotlinx/coroutines/channels/g0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/channels/g0<",
            "+TT;>;)",
            "Lkotlinx/coroutines/flow/i<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v8, Lkotlinx/coroutines/flow/e;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1c

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Lkotlinx/coroutines/flow/e;-><init>(Lkotlinx/coroutines/channels/g0;ZLkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;ILkotlin/jvm/internal/w;)V

    return-object v8
.end method

.method public static final d(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .param p0    # Lkotlinx/coroutines/flow/j;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlinx/coroutines/channels/g0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/j<",
            "-TT;>;",
            "Lkotlinx/coroutines/channels/g0<",
            "+TT;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p2}, Lkotlinx/coroutines/flow/m;->e(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/channels/g0;ZLkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p0
.end method

.method private static final e(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/channels/g0;ZLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/j<",
            "-TT;>;",
            "Lkotlinx/coroutines/channels/g0<",
            "+TT;>;Z",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Lkotlinx/coroutines/flow/m$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lkotlinx/coroutines/flow/m$b;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/flow/m$b;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lkotlinx/coroutines/flow/m$b;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/flow/m$b;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lkotlinx/coroutines/flow/m$b;-><init>(Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lkotlinx/coroutines/flow/m$b;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lkotlinx/coroutines/flow/m$b;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v4, :cond_3

    .line 38
    .line 39
    if-ne v2, v3, :cond_2

    .line 40
    .line 41
    iget-boolean p2, v0, Lkotlinx/coroutines/flow/m$b;->Z$0:Z

    .line 42
    .line 43
    iget-object p0, v0, Lkotlinx/coroutines/flow/m$b;->L$2:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Lkotlinx/coroutines/channels/n;

    .line 46
    .line 47
    iget-object p1, v0, Lkotlinx/coroutines/flow/m$b;->L$1:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lkotlinx/coroutines/channels/g0;

    .line 50
    .line 51
    iget-object v2, v0, Lkotlinx/coroutines/flow/m$b;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Lkotlinx/coroutines/flow/j;

    .line 54
    .line 55
    :try_start_0
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    :cond_1
    move-object p3, p0

    .line 59
    move-object p0, v2

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p0

    .line 69
    :cond_3
    iget-boolean p2, v0, Lkotlinx/coroutines/flow/m$b;->Z$0:Z

    .line 70
    .line 71
    iget-object p0, v0, Lkotlinx/coroutines/flow/m$b;->L$2:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Lkotlinx/coroutines/channels/n;

    .line 74
    .line 75
    iget-object p1, v0, Lkotlinx/coroutines/flow/m$b;->L$1:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, Lkotlinx/coroutines/channels/g0;

    .line 78
    .line 79
    iget-object v2, v0, Lkotlinx/coroutines/flow/m$b;->L$0:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Lkotlinx/coroutines/flow/j;

    .line 82
    .line 83
    :try_start_1
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-static {p0}, Lkotlinx/coroutines/flow/k;->o0(Lkotlinx/coroutines/flow/j;)V

    .line 91
    .line 92
    .line 93
    :try_start_2
    invoke-interface {p1}, Lkotlinx/coroutines/channels/g0;->iterator()Lkotlinx/coroutines/channels/n;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    :goto_1
    iput-object p0, v0, Lkotlinx/coroutines/flow/m$b;->L$0:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object p1, v0, Lkotlinx/coroutines/flow/m$b;->L$1:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object p3, v0, Lkotlinx/coroutines/flow/m$b;->L$2:Ljava/lang/Object;

    .line 102
    .line 103
    iput-boolean p2, v0, Lkotlinx/coroutines/flow/m$b;->Z$0:Z

    .line 104
    .line 105
    iput v4, v0, Lkotlinx/coroutines/flow/m$b;->label:I

    .line 106
    .line 107
    invoke-interface {p3, v0}, Lkotlinx/coroutines/channels/n;->c(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-ne v2, v1, :cond_5

    .line 112
    .line 113
    return-object v1

    .line 114
    :cond_5
    move-object v5, v2

    .line 115
    move-object v2, p0

    .line 116
    move-object p0, p3

    .line 117
    move-object p3, v5

    .line 118
    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    .line 122
    .line 123
    move-result p3

    .line 124
    if-eqz p3, :cond_6

    .line 125
    .line 126
    invoke-interface {p0}, Lkotlinx/coroutines/channels/n;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    iput-object v2, v0, Lkotlinx/coroutines/flow/m$b;->L$0:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object p1, v0, Lkotlinx/coroutines/flow/m$b;->L$1:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object p0, v0, Lkotlinx/coroutines/flow/m$b;->L$2:Ljava/lang/Object;

    .line 135
    .line 136
    iput-boolean p2, v0, Lkotlinx/coroutines/flow/m$b;->Z$0:Z

    .line 137
    .line 138
    iput v3, v0, Lkotlinx/coroutines/flow/m$b;->label:I

    .line 139
    .line 140
    invoke-interface {v2, p3, v0}, Lkotlinx/coroutines/flow/j;->emit(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 144
    if-ne p3, v1, :cond_1

    .line 145
    .line 146
    return-object v1

    .line 147
    :cond_6
    if-eqz p2, :cond_7

    .line 148
    .line 149
    const/4 p0, 0x0

    .line 150
    invoke-static {p1, p0}, Lkotlinx/coroutines/channels/s;->b(Lkotlinx/coroutines/channels/g0;Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    :cond_7
    sget-object p0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 154
    .line 155
    return-object p0

    .line 156
    :catchall_0
    move-exception p0

    .line 157
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 158
    :catchall_1
    move-exception p3

    .line 159
    if-eqz p2, :cond_8

    .line 160
    .line 161
    invoke-static {p1, p0}, Lkotlinx/coroutines/channels/s;->b(Lkotlinx/coroutines/channels/g0;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    :cond_8
    throw p3
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
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
.end method

.method public static final f(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/s0;)Lkotlinx/coroutines/channels/g0;
    .locals 0
    .param p0    # Lkotlinx/coroutines/flow/i;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/i<",
            "+TT;>;",
            "Lkotlinx/coroutines/s0;",
            ")",
            "Lkotlinx/coroutines/channels/g0<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlinx/coroutines/flow/internal/f;->b(Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/internal/e;

    move-result-object p0

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/flow/internal/e;->m(Lkotlinx/coroutines/s0;)Lkotlinx/coroutines/channels/g0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lkotlinx/coroutines/channels/g0;)Lkotlinx/coroutines/flow/i;
    .locals 9
    .param p0    # Lkotlinx/coroutines/channels/g0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/channels/g0<",
            "+TT;>;)",
            "Lkotlinx/coroutines/flow/i<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v8, Lkotlinx/coroutines/flow/e;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1c

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Lkotlinx/coroutines/flow/e;-><init>(Lkotlinx/coroutines/channels/g0;ZLkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;ILkotlin/jvm/internal/w;)V

    return-object v8
.end method
