.class public Lcom/bytedance/mtesttools/b/j;
.super Lcom/bytedance/mtesttools/b/h;
.source "SourceFile"


# instance fields
.field private a:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

.field private b:Lcom/bytedance/mtesttools/b/b;

.field private c:Z

.field private d:Ljava/lang/String;

.field private e:Landroid/os/Bundle;

.field private f:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;

.field private g:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bytedance/mtesttools/b/h;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/mtesttools/b/j$b;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/bytedance/mtesttools/b/j$b;-><init>(Lcom/bytedance/mtesttools/b/j;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/mtesttools/b/j;->f:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;

    .line 10
    .line 11
    new-instance v0, Lcom/bytedance/mtesttools/b/j$c;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/bytedance/mtesttools/b/j$c;-><init>(Lcom/bytedance/mtesttools/b/j;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/bytedance/mtesttools/b/j;->g:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method static synthetic k(Lcom/bytedance/mtesttools/b/j;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/j;->e:Landroid/os/Bundle;

    return-object p1
.end method

.method static synthetic l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;
    .locals 0

    iget-object p0, p0, Lcom/bytedance/mtesttools/b/j;->b:Lcom/bytedance/mtesttools/b/b;

    return-object p0
.end method

.method static synthetic m(Lcom/bytedance/mtesttools/b/j;Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;)Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/j;->a:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    return-object p1
.end method

.method static synthetic n(Lcom/bytedance/mtesttools/b/j;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/mtesttools/b/j;->c:Z

    return p1
.end method

.method static synthetic o(Lcom/bytedance/mtesttools/b/j;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/bytedance/mtesttools/b/j;->d:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic p(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;
    .locals 0

    iget-object p0, p0, Lcom/bytedance/mtesttools/b/j;->a:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    return-object p0
.end method

.method static synthetic q(Lcom/bytedance/mtesttools/b/j;)Landroid/os/Bundle;
    .locals 0

    iget-object p0, p0, Lcom/bytedance/mtesttools/b/j;->e:Landroid/os/Bundle;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j;->a:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationRewardManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationBaseManager;->getShowEcpm()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->getSlotId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public b(Landroid/app/Activity;Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/bytedance/mtesttools/b/j;->a:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j;->f:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;

    .line 6
    .line 7
    invoke-interface {p2, v0}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->setRewardAdInteractionListener(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;)V

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lcom/bytedance/mtesttools/b/j;->a:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j;->g:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;

    .line 13
    .line 14
    invoke-interface {p2, v0}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->setRewardPlayAgainInteractionListener(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, Lcom/bytedance/mtesttools/b/j;->a:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 18
    .line 19
    invoke-interface {p2, p1}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->showRewardVideoAd(Landroid/app/Activity;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public c(Landroid/app/Activity;Lj1/f;IILcom/bytedance/mtesttools/b/b;)V
    .locals 2

    .line 1
    iput-object p5, p0, Lcom/bytedance/mtesttools/b/j;->b:Lcom/bytedance/mtesttools/b/b;

    .line 2
    .line 3
    invoke-virtual {p2}, Lj1/f;->d()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    iput-object p3, p0, Lcom/bytedance/mtesttools/b/j;->d:Ljava/lang/String;

    .line 8
    .line 9
    new-instance p3, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    .line 10
    .line 11
    invoke-direct {p3}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object p4, p0, Lcom/bytedance/mtesttools/b/j;->d:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p3, p4}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setCodeId(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    const-string p4, "test tools"

    .line 21
    .line 22
    invoke-virtual {p3, p4}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setUserID(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    const/16 p5, 0x7b

    .line 27
    .line 28
    invoke-virtual {p3, p5}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setRewardAmount(I)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    const-string p5, "rewardName"

    .line 33
    .line 34
    invoke-virtual {p3, p5}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setRewardName(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    new-instance p5, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;

    .line 39
    .line 40
    invoke-direct {p5}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v1, "gm_test_slot_"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Lj1/f;->i()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    const-string v0, "testToolSlotId"

    .line 65
    .line 66
    invoke-virtual {p5, v0, p2}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;->setExtraObject(Ljava/lang/String;Ljava/lang/Object;)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2, p4}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;->setScenarioId(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    const/4 p4, 0x0

    .line 75
    invoke-virtual {p2, p4}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;->setUseSurfaceView(Z)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    const/4 p4, 0x1

    .line 80
    invoke-virtual {p2, p4}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;->setMuted(Z)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {p2, p4}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;->setBidNotify(Z)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    const-string p4, "pangle"

    .line 89
    .line 90
    const-string p5, "pangle reward custom data"

    .line 91
    .line 92
    invoke-virtual {p2, p4, p5}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;->setExtraObject(Ljava/lang/String;Ljava/lang/Object;)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    const-string p4, "sigmob"

    .line 97
    .line 98
    const-string p5, "sigmob reward custom data"

    .line 99
    .line 100
    invoke-virtual {p2, p4, p5}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;->setExtraObject(Ljava/lang/String;Ljava/lang/Object;)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    const-string p4, "ks"

    .line 105
    .line 106
    const-string p5, "ks reward custom data"

    .line 107
    .line 108
    invoke-virtual {p2, p4, p5}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;->setExtraObject(Ljava/lang/String;Ljava/lang/Object;)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    const-string p4, "gdt"

    .line 113
    .line 114
    const-string p5, "gdt reward custom data"

    .line 115
    .line 116
    invoke-virtual {p2, p4, p5}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;->setExtraObject(Ljava/lang/String;Ljava/lang/Object;)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot$Builder;->build()Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-virtual {p3, p2}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setMediationAdSlot(Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->build()Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->getAdManager()Lcom/bytedance/sdk/openadsdk/TTAdManager;

    .line 133
    .line 134
    .line 135
    move-result-object p3

    .line 136
    invoke-interface {p3, p1}, Lcom/bytedance/sdk/openadsdk/TTAdManager;->createAdNative(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/TTAdNative;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    new-instance p3, Lcom/bytedance/mtesttools/b/j$a;

    .line 141
    .line 142
    invoke-direct {p3, p0}, Lcom/bytedance/mtesttools/b/j$a;-><init>(Lcom/bytedance/mtesttools/b/j;)V

    .line 143
    .line 144
    .line 145
    invoke-interface {p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/TTAdNative;->loadRewardVideoAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;)V

    .line 146
    .line 147
    .line 148
    return-void
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
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j;->d:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j;->a:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationRewardManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationBaseManager;->getShowEcpm()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j;->a:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationRewardManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationBaseManager;->getShowEcpm()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->getEcpm()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public h()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j;->e:Landroid/os/Bundle;

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/mtesttools/b/j;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j;->a:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationRewardManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationBaseManager;->isReady()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
