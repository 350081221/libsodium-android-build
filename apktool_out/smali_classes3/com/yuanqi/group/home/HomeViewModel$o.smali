.class final Lcom/yuanqi/group/home/HomeViewModel$o;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeViewModel;->j0(Landroid/content/Context;Lv2/b;Lv3/a;)V
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
    c = "com.yuanqi.group.home.HomeViewModel$verifyAppPwd$1"
    f = "HomeViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $noteApp:Lv2/b;

.field final synthetic $openAction:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/yuanqi/group/home/HomeViewModel;


# direct methods
.method constructor <init>(Lv2/b;Landroid/content/Context;Lcom/yuanqi/group/home/HomeViewModel;Lv3/a;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv2/b;",
            "Landroid/content/Context;",
            "Lcom/yuanqi/group/home/HomeViewModel;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lcom/yuanqi/group/home/HomeViewModel$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel$o;->$noteApp:Lv2/b;

    iput-object p2, p0, Lcom/yuanqi/group/home/HomeViewModel$o;->$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/yuanqi/group/home/HomeViewModel$o;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    iput-object p4, p0, Lcom/yuanqi/group/home/HomeViewModel$o;->$openAction:Lv3/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 6
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

    new-instance p1, Lcom/yuanqi/group/home/HomeViewModel$o;

    iget-object v1, p0, Lcom/yuanqi/group/home/HomeViewModel$o;->$noteApp:Lv2/b;

    iget-object v2, p0, Lcom/yuanqi/group/home/HomeViewModel$o;->$context:Landroid/content/Context;

    iget-object v3, p0, Lcom/yuanqi/group/home/HomeViewModel$o;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    iget-object v4, p0, Lcom/yuanqi/group/home/HomeViewModel$o;->$openAction:Lv3/a;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/yuanqi/group/home/HomeViewModel$o;-><init>(Lv2/b;Landroid/content/Context;Lcom/yuanqi/group/home/HomeViewModel;Lv3/a;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/group/home/HomeViewModel$o;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/group/home/HomeViewModel$o;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lcom/yuanqi/group/home/HomeViewModel$o;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lcom/yuanqi/group/home/HomeViewModel$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, v0, Lcom/yuanqi/group/home/HomeViewModel$o;->label:I

    .line 7
    .line 8
    if-nez v1, :cond_7

    .line 9
    .line 10
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/yuanqi/master/mine/account/a;->k()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x1

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, v0, Lcom/yuanqi/group/home/HomeViewModel$o;->$noteApp:Lv2/b;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Lv2/b;->getAppPwd()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-lez v1, :cond_0

    .line 38
    .line 39
    move v1, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v1, v3

    .line 42
    :goto_0
    if-ne v1, v2, :cond_1

    .line 43
    .line 44
    move v1, v2

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move v1, v3

    .line 47
    :goto_1
    if-eqz v1, :cond_2

    .line 48
    .line 49
    sget-object v4, Lcom/yuanqi/master/tools/o0;->a:Lcom/yuanqi/master/tools/o0;

    .line 50
    .line 51
    iget-object v5, v0, Lcom/yuanqi/group/home/HomeViewModel$o;->$context:Landroid/content/Context;

    .line 52
    .line 53
    iget-object v1, v0, Lcom/yuanqi/group/home/HomeViewModel$o;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/yuanqi/group/home/HomeViewModel;->G()Lkotlinx/coroutines/s0;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    iget-object v1, v0, Lcom/yuanqi/group/home/HomeViewModel$o;->$noteApp:Lv2/b;

    .line 60
    .line 61
    invoke-virtual {v1}, Lv2/b;->getAppPwd()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    const/4 v8, 0x0

    .line 66
    iget-object v9, v0, Lcom/yuanqi/group/home/HomeViewModel$o;->$openAction:Lv3/a;

    .line 67
    .line 68
    invoke-virtual/range {v4 .. v9}, Lcom/yuanqi/master/tools/o0;->M0(Landroid/content/Context;Lkotlinx/coroutines/s0;Ljava/lang/String;ZLv3/a;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :cond_2
    iget-object v1, v0, Lcom/yuanqi/group/home/HomeViewModel$o;->$noteApp:Lv2/b;

    .line 74
    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    invoke-virtual {v1}, Lv2/b;->getAppPwd()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-lez v1, :cond_3

    .line 88
    .line 89
    move v1, v2

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    move v1, v3

    .line 92
    :goto_2
    if-ne v1, v2, :cond_4

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    move v2, v3

    .line 96
    :goto_3
    if-eqz v2, :cond_6

    .line 97
    .line 98
    sget-object v1, Lcom/yuanqi/master/tools/w0;->a:Lcom/yuanqi/master/tools/w0;

    .line 99
    .line 100
    const-string v2, "vip_pass"

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Lcom/yuanqi/master/tools/w0;->b(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_5

    .line 107
    .line 108
    iget-object v1, v0, Lcom/yuanqi/group/home/HomeViewModel$o;->$openAction:Lv3/a;

    .line 109
    .line 110
    invoke-interface {v1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 114
    .line 115
    return-object v1

    .line 116
    :cond_5
    sget-object v3, Lcom/yuanqi/master/tools/o0;->a:Lcom/yuanqi/master/tools/o0;

    .line 117
    .line 118
    iget-object v4, v0, Lcom/yuanqi/group/home/HomeViewModel$o;->$context:Landroid/content/Context;

    .line 119
    .line 120
    const-string v5, "\u63d0\u793a"

    .line 121
    .line 122
    const-string v6, "\u60a8\u7684VIP\u5df2\u8fc7\u671f\uff0c\u5bc6\u7801\u4fdd\u62a4\u529f\u80fd\u5df2\u5931\u6548\uff0c\u662f\u5426\u7eed\u8d39\uff1f"

    .line 123
    .line 124
    const-string v7, "\u53d6\u6d88"

    .line 125
    .line 126
    const-string v8, "\u7eed\u8d39"

    .line 127
    .line 128
    const/4 v9, 0x0

    .line 129
    const/4 v10, 0x0

    .line 130
    const/4 v11, 0x0

    .line 131
    new-instance v14, Lcom/yuanqi/group/home/HomeViewModel$o$a;

    .line 132
    .line 133
    iget-object v15, v0, Lcom/yuanqi/group/home/HomeViewModel$o;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    .line 134
    .line 135
    iget-object v13, v0, Lcom/yuanqi/group/home/HomeViewModel$o;->$openAction:Lv3/a;

    .line 136
    .line 137
    invoke-direct {v14, v15, v13}, Lcom/yuanqi/group/home/HomeViewModel$o$a;-><init>(Lcom/yuanqi/group/home/HomeViewModel;Lv3/a;)V

    .line 138
    .line 139
    .line 140
    new-instance v13, Lcom/yuanqi/group/home/HomeViewModel$o$b;

    .line 141
    .line 142
    iget-object v15, v0, Lcom/yuanqi/group/home/HomeViewModel$o;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    .line 143
    .line 144
    iget-object v12, v0, Lcom/yuanqi/group/home/HomeViewModel$o;->$context:Landroid/content/Context;

    .line 145
    .line 146
    invoke-direct {v13, v15, v12}, Lcom/yuanqi/group/home/HomeViewModel$o$b;-><init>(Lcom/yuanqi/group/home/HomeViewModel;Landroid/content/Context;)V

    .line 147
    .line 148
    .line 149
    const/16 v18, 0xbe0

    .line 150
    .line 151
    const/16 v19, 0x0

    .line 152
    .line 153
    const/4 v12, 0x0

    .line 154
    move-object/from16 v17, v13

    .line 155
    .line 156
    const/4 v13, 0x0

    .line 157
    const/4 v15, 0x0

    .line 158
    move-object/from16 v16, v17

    .line 159
    .line 160
    move/from16 v17, v18

    .line 161
    .line 162
    move-object/from16 v18, v19

    .line 163
    .line 164
    invoke-static/range {v3 .. v18}, Lcom/yuanqi/master/tools/o0;->Y(Lcom/yuanqi/master/tools/o0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLv3/a;Lv3/a;Lv3/a;Lv3/a;ILjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    const-string v3, "1"

    .line 168
    .line 169
    invoke-virtual {v1, v2, v3}, Lcom/yuanqi/master/tools/w0;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_6
    iget-object v1, v0, Lcom/yuanqi/group/home/HomeViewModel$o;->$openAction:Lv3/a;

    .line 174
    .line 175
    invoke-interface {v1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    :goto_4
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 179
    .line 180
    return-object v1

    .line 181
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 182
    .line 183
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 184
    .line 185
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw v1
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
.end method
