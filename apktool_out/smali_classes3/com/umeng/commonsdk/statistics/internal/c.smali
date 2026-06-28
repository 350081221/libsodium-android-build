.class public Lcom/umeng/commonsdk/statistics/internal/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Z = false

.field private static f:Z = false

.field private static g:Z = false


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:Landroid/content/Context;

.field private d:Lcom/umeng/commonsdk/statistics/internal/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "10.0.0.172"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->a:Ljava/lang/String;

    .line 7
    .line 8
    const/16 v0, 0x50

    .line 9
    .line 10
    iput v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->b:I

    .line 11
    .line 12
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method static synthetic a(Lcom/umeng/commonsdk/statistics/internal/c;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    return-object p0
.end method

.method private a()V
    .locals 4

    .line 3
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    const-string v1, "domain_p"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    const-string v3, "domain_s"

    invoke-static {v1, v3, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 6
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->DEFAULT_URL:Ljava/lang/String;

    .line 7
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 8
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->SECONDARY_URL:Ljava/lang/String;

    :cond_1
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    .line 9
    sget-object v2, Lcom/umeng/commonsdk/statistics/UMServerURL;->DEFAULT_URL:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/umeng/commonsdk/statistics/UMServerURL;->SECONDARY_URL:Ljava/lang/String;

    aput-object v2, v0, v1

    sput-object v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->APPLOG_URL_LIST:[Ljava/lang/String;

    return-void
.end method

.method private b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "domain_p"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    .line 12
    .line 13
    const-string v3, "domain_s"

    .line 14
    .line 15
    invoke-static {v1, v3, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleURL(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->DEFAULT_URL:Ljava/lang/String;

    .line 30
    .line 31
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleURL(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->SECONDARY_URL:Ljava/lang/String;

    .line 42
    .line 43
    :cond_1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    .line 44
    .line 45
    const-string v1, "oversea_domain_p"

    .line 46
    .line 47
    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    .line 52
    .line 53
    const-string v3, "oversea_domain_s"

    .line 54
    .line 55
    invoke-static {v1, v3, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_2

    .line 64
    .line 65
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleURL(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->OVERSEA_DEFAULT_URL:Ljava/lang/String;

    .line 70
    .line 71
    :cond_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_3

    .line 76
    .line 77
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleURL(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->OVERSEA_SECONDARY_URL:Ljava/lang/String;

    .line 82
    .line 83
    :cond_3
    const/4 v0, 0x2

    .line 84
    new-array v1, v0, [Ljava/lang/String;

    .line 85
    .line 86
    sget-object v2, Lcom/umeng/commonsdk/statistics/UMServerURL;->OVERSEA_DEFAULT_URL:Ljava/lang/String;

    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    aput-object v2, v1, v3

    .line 90
    .line 91
    sget-object v2, Lcom/umeng/commonsdk/statistics/UMServerURL;->OVERSEA_SECONDARY_URL:Ljava/lang/String;

    .line 92
    .line 93
    const/4 v4, 0x1

    .line 94
    aput-object v2, v1, v4

    .line 95
    .line 96
    sput-object v1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->APPLOG_URL_LIST:[Ljava/lang/String;

    .line 97
    .line 98
    sget-object v1, Lcom/umeng/commonsdk/statistics/b;->b:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_5

    .line 105
    .line 106
    sget-object v1, Lcom/umeng/commonsdk/statistics/b;->b:Ljava/lang/String;

    .line 107
    .line 108
    const-string v2, "460"

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-nez v1, :cond_4

    .line 115
    .line 116
    sget-object v1, Lcom/umeng/commonsdk/statistics/b;->b:Ljava/lang/String;

    .line 117
    .line 118
    const-string v2, "461"

    .line 119
    .line 120
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_5

    .line 125
    .line 126
    :cond_4
    new-array v0, v0, [Ljava/lang/String;

    .line 127
    .line 128
    sget-object v1, Lcom/umeng/commonsdk/statistics/UMServerURL;->DEFAULT_URL:Ljava/lang/String;

    .line 129
    .line 130
    aput-object v1, v0, v3

    .line 131
    .line 132
    sget-object v1, Lcom/umeng/commonsdk/statistics/UMServerURL;->SECONDARY_URL:Ljava/lang/String;

    .line 133
    .line 134
    aput-object v1, v0, v4

    .line 135
    .line 136
    sput-object v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->APPLOG_URL_LIST:[Ljava/lang/String;

    .line 137
    .line 138
    :cond_5
    return-void
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
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
    .line 460
.end method

.method private c()V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/internal/c;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lcom/umeng/commonsdk/statistics/internal/c$1;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/umeng/commonsdk/statistics/internal/c$1;-><init>(Lcom/umeng/commonsdk/statistics/internal/c;)V

    .line 14
    .line 15
    .line 16
    const-string v2, "cfgfd"

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->registImprintCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    sput-boolean v0, Lcom/umeng/commonsdk/statistics/internal/c;->g:Z

    .line 23
    .line 24
    :cond_0
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private d()V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/internal/c;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "MobclickRT"

    .line 6
    .line 7
    const-string v1, "--->>> \u6ce8\u518c\u96f6\u53f7\u62a5\u6587 imprint \u5e94\u7b54\u5904\u7406\u56de\u8c03\u3002"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Lcom/umeng/commonsdk/statistics/internal/c$2;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lcom/umeng/commonsdk/statistics/internal/c$2;-><init>(Lcom/umeng/commonsdk/statistics/internal/c;)V

    .line 21
    .line 22
    .line 23
    const-string v2, "iscfg"

    .line 24
    .line 25
    invoke-virtual {v0, v2, v1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->registPreProcessCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintPreProcessCallback;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Lcom/umeng/commonsdk/statistics/internal/c$3;

    .line 35
    .line 36
    invoke-direct {v1, p0}, Lcom/umeng/commonsdk/statistics/internal/c$3;-><init>(Lcom/umeng/commonsdk/statistics/internal/c;)V

    .line 37
    .line 38
    .line 39
    const-string v2, "cfgfd"

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->registImprintCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    sput-boolean v0, Lcom/umeng/commonsdk/statistics/internal/c;->f:Z

    .line 46
    .line 47
    :cond_0
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method


# virtual methods
.method public a(Lcom/umeng/commonsdk/statistics/internal/b;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->d:Lcom/umeng/commonsdk/statistics/internal/b;

    return-void
.end method

.method public a([BLjava/lang/String;)[B
    .locals 8

    const-string v0, "Content-Type"

    const-string v1, "\\|"

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 25
    :try_start_0
    iget-object v4, p0, Lcom/umeng/commonsdk/statistics/internal/c;->d:Lcom/umeng/commonsdk/statistics/internal/b;

    if-eqz v4, :cond_0

    .line 26
    invoke-interface {v4}, Lcom/umeng/commonsdk/statistics/internal/b;->onRequestStart()V

    .line 27
    :cond_0
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p2

    check-cast p2, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_0
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_0 .. :try_end_0} :catch_c
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 28
    :try_start_1
    sget-boolean v4, Lcom/umeng/commonsdk/statistics/internal/c;->e:Z

    const/4 v5, 0x1

    if-nez v4, :cond_1

    .line 29
    sget-object v4, Lorg/apache/http/conn/ssl/SSLSocketFactory;->STRICT_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-virtual {p2, v4}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    const-string v4, "TLS"

    .line 30
    invoke-static {v4}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v4

    .line 31
    new-instance v6, Ljava/security/SecureRandom;

    invoke-direct {v6}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v4, v3, v3, v6}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 32
    invoke-virtual {v4}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 33
    sput-boolean v5, Lcom/umeng/commonsdk/statistics/internal/c;->e:Z

    :cond_1
    const-string v4, "X-Umeng-UTC"

    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "X-Umeng-Sdk"

    .line 35
    iget-object v6, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v6}, Lcom/umeng/commonsdk/statistics/internal/a;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/internal/a;

    move-result-object v6

    invoke-virtual {v6}, Lcom/umeng/commonsdk/statistics/internal/a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    iget-object v4, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/internal/a;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/internal/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/umeng/commonsdk/statistics/internal/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v0, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "Msg-Type"

    const-string v6, "envelope/json"

    .line 37
    invoke-virtual {p2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "X-Umeng-Pro-Ver"

    const-string v6, "1.0.0"

    .line 38
    invoke-virtual {p2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "SM-IMP"

    const-string v6, "1"

    .line 39
    invoke-virtual {p2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "User-Agent"

    .line 40
    invoke-static {}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getCustomAgt()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0x7530

    .line 41
    invoke-virtual {p2, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 42
    invoke-virtual {p2, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const-string v4, "POST"

    .line 43
    invoke-virtual {p2, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p2, v5}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 45
    invoke-virtual {p2, v5}, Ljava/net/URLConnection;->setDoInput(Z)V

    const/4 v4, 0x0

    .line 46
    invoke-virtual {p2, v4}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 47
    invoke-virtual {p2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v6
    :try_end_1
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    :try_start_2
    invoke-virtual {v6, p1}, Ljava/io/OutputStream;->write([B)V

    .line 49
    invoke-virtual {v6}, Ljava/io/OutputStream;->flush()V

    .line 50
    invoke-virtual {p2}, Ljava/net/URLConnection;->connect()V

    .line 51
    iget-object p1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->d:Lcom/umeng/commonsdk/statistics/internal/b;

    if-eqz p1, :cond_2

    .line 52
    invoke-interface {p1}, Lcom/umeng/commonsdk/statistics/internal/b;->onRequestEnd()V

    .line 53
    :cond_2
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    .line 54
    invoke-virtual {p2, v0}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 55
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_3

    const-string v7, "application/thrift"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    move v5, v4

    .line 56
    :goto_0
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    const/16 v0, 0xc8

    if-ne p1, v0, :cond_4

    if-eqz v5, :cond_4

    .line 57
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1
    :try_end_2
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_2 .. :try_end_2} :catch_d
    .catch Ljava/net/UnknownHostException; {:try_start_2 .. :try_end_2} :catch_9
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 58
    :try_start_3
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->readStreamToByteArray(Ljava/io/InputStream;)[B

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 59
    :try_start_4
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->safeClose(Ljava/io/InputStream;)V
    :try_end_4
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_4 .. :try_end_4} :catch_d
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_9
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 60
    :try_start_5
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 61
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 62
    :goto_1
    :try_start_6
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 63
    :catch_1
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object v0

    :catchall_0
    move-exception v0

    .line 64
    :try_start_7
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->safeClose(Ljava/io/InputStream;)V

    .line 65
    throw v0
    :try_end_7
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_7 .. :try_end_7} :catch_d
    .catch Ljava/net/UnknownHostException; {:try_start_7 .. :try_end_7} :catch_9
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 66
    :cond_4
    :try_start_8
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    .line 67
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 68
    :goto_2
    :try_start_9
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3

    .line 69
    :catch_3
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object v3

    :catchall_1
    move-object v6, v3

    goto :goto_3

    :catch_4
    move-object v6, v3

    goto :goto_5

    :catch_5
    move-object v6, v3

    goto :goto_7

    :catchall_2
    move-object p2, v3

    move-object v6, p2

    :catchall_3
    :goto_3
    if-eqz v6, :cond_5

    .line 70
    :try_start_a
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6

    goto :goto_4

    :catch_6
    move-exception p1

    .line 71
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_5
    :goto_4
    if-eqz p2, :cond_6

    .line 72
    :try_start_b
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_7

    .line 73
    :catch_7
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_6
    return-object v3

    :catch_8
    move-object p2, v3

    move-object v6, p2

    :catch_9
    :goto_5
    :try_start_c
    const-string p1, "A_10200"

    .line 74
    invoke-static {p1, v2, v1}, Lcom/umeng/commonsdk/debug/UMLog;->aq(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    if-eqz v6, :cond_7

    .line 75
    :try_start_d
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_a

    goto :goto_6

    :catch_a
    move-exception p1

    .line 76
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_7
    :goto_6
    if-eqz p2, :cond_8

    .line 77
    :try_start_e
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_b

    .line 78
    :catch_b
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_8
    return-object v3

    :catch_c
    move-object p2, v3

    move-object v6, p2

    :catch_d
    :goto_7
    :try_start_f
    const-string p1, "A_10201"

    .line 79
    invoke-static {p1, v2, v1}, Lcom/umeng/commonsdk/debug/UMLog;->aq(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    if-eqz v6, :cond_9

    .line 80
    :try_start_10
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_e

    goto :goto_8

    :catch_e
    move-exception p1

    .line 81
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_9
    :goto_8
    if-eqz p2, :cond_a

    .line 82
    :try_start_11
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_f

    .line 83
    :catch_f
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_a
    return-object v3

    :catchall_4
    move-exception p1

    if-eqz v6, :cond_b

    .line 84
    :try_start_12
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_10

    goto :goto_9

    :catch_10
    move-exception v0

    .line 85
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_b
    :goto_9
    if-eqz p2, :cond_c

    .line 86
    :try_start_13
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_11

    .line 87
    :catch_11
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 88
    :cond_c
    throw p1
.end method

.method public a([BZZLjava/lang/String;)[B
    .locals 4

    .line 10
    sget v0, Lcom/umeng/commonsdk/statistics/SdkVersion;->SDK_TYPE:I

    if-nez v0, :cond_0

    .line 11
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/internal/c;->a()V

    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->OVERSEA_DEFAULT_URL:Ljava/lang/String;

    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->DEFAULT_URL:Ljava/lang/String;

    .line 13
    sget-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->OVERSEA_SECONDARY_URL:Ljava/lang/String;

    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->SECONDARY_URL:Ljava/lang/String;

    .line 14
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/internal/c;->b()V

    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 15
    :goto_1
    sget-object v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->APPLOG_URL_LIST:[Ljava/lang/String;

    array-length v3, v2

    if-ge v1, v3, :cond_4

    .line 16
    aget-object v0, v2, v1

    if-eqz p3, :cond_1

    .line 17
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/internal/c;->d()V

    goto :goto_2

    .line 18
    :cond_1
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/internal/c;->c()V

    .line 19
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 20
    invoke-virtual {p0, p1, v0}, Lcom/umeng/commonsdk/statistics/internal/c;->a([BLjava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_2

    .line 21
    iget-object p1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->d:Lcom/umeng/commonsdk/statistics/internal/b;

    if-eqz p1, :cond_4

    .line 22
    invoke-interface {p1, p2}, Lcom/umeng/commonsdk/statistics/internal/b;->onRequestSucceed(Z)V

    goto :goto_3

    .line 23
    :cond_2
    iget-object v2, p0, Lcom/umeng/commonsdk/statistics/internal/c;->d:Lcom/umeng/commonsdk/statistics/internal/b;

    if-eqz v2, :cond_3

    .line 24
    invoke-interface {v2}, Lcom/umeng/commonsdk/statistics/internal/b;->onRequestFailed()V

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    :goto_3
    return-object v0
.end method
