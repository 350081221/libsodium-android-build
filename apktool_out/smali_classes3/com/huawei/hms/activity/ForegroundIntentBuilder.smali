.class public Lcom/huawei/hms/activity/ForegroundIntentBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private activity:Landroid/app/Activity;

.field private foregroundBody:Ljava/lang/String;

.field private foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

.field private innerHeader:Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

.field private innerPkgName:Ljava/lang/String;

.field private mHostContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->activity:Landroid/app/Activity;

    .line 7
    .line 8
    new-instance p1, Lcom/huawei/hms/common/internal/RequestHeader;

    .line 9
    .line 10
    invoke-direct {p1}, Lcom/huawei/hms/common/internal/RequestHeader;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 14
    .line 15
    const v0, 0x39b294c

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/huawei/hms/common/internal/RequestHeader;->setSdkVersion(I)V

    .line 19
    .line 20
    .line 21
    const-string p1, ""

    .line 22
    .line 23
    iput-object p1, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundBody:Ljava/lang/String;

    .line 24
    .line 25
    new-instance p1, Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

    .line 26
    .line 27
    invoke-direct {p1}, Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->innerHeader:Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

    .line 31
    .line 32
    const v0, 0x1c9c380

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;->setApkVersion(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    const-string v0, "listener must not be null."

    .line 42
    .line 43
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
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
.end method

.method public static registerResponseCallback(Ljava/lang/String;Lcom/huawei/hms/activity/internal/BusResponseCallback;)V
    .locals 1

    invoke-static {}, Lcom/huawei/hms/activity/internal/ForegroundBusResponseMgr;->getInstance()Lcom/huawei/hms/activity/internal/ForegroundBusResponseMgr;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/huawei/hms/activity/internal/ForegroundBusResponseMgr;->registerObserver(Ljava/lang/String;Lcom/huawei/hms/activity/internal/BusResponseCallback;)V

    return-void
.end method

.method public static unregisterResponseCallback(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/huawei/hms/activity/internal/ForegroundBusResponseMgr;->getInstance()Lcom/huawei/hms/activity/internal/ForegroundBusResponseMgr;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hms/activity/internal/ForegroundBusResponseMgr;->unRegisterObserver(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public build()Landroid/content/Intent;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    const-class v1, Lcom/huawei/hms/activity/ForegroundBusDelegate;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lcom/huawei/hms/activity/BridgeActivity;->getIntentStartBridgeActivity(Landroid/app/Activity;Ljava/lang/String;)Landroid/content/Intent;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->mHostContext:Landroid/content/Context;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->mHostContext:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/huawei/hms/utils/Util;->getAppId(Landroid/content/Context;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->activity:Landroid/app/Activity;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->activity:Landroid/app/Activity;

    .line 35
    .line 36
    invoke-static {v2}, Lcom/huawei/hms/utils/Util;->getAppId(Landroid/content/Context;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    :goto_0
    iget-object v3, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 41
    .line 42
    invoke-virtual {v3}, Lcom/huawei/hms/common/internal/RequestHeader;->getAppID()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const-string v4, "|"

    .line 47
    .line 48
    if-nez v3, :cond_1

    .line 49
    .line 50
    iget-object v3, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 51
    .line 52
    new-instance v5, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v3, v2}, Lcom/huawei/hms/common/internal/RequestHeader;->setAppID(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    iget-object v3, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 72
    .line 73
    new-instance v5, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/huawei/hms/common/internal/RequestHeader;->getAppID()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v3, v2}, Lcom/huawei/hms/common/internal/RequestHeader;->setAppID(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :goto_1
    iget-object v2, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 101
    .line 102
    invoke-virtual {v2}, Lcom/huawei/hms/common/internal/RequestHeader;->getTransactionId()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_2

    .line 111
    .line 112
    iget-object v2, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 113
    .line 114
    invoke-virtual {v2}, Lcom/huawei/hms/common/internal/RequestHeader;->getAppID()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    const-string v4, "hub.request"

    .line 119
    .line 120
    invoke-static {v3, v4}, Lcom/huawei/hms/common/internal/TransactionIdCreater;->getId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v2, v3}, Lcom/huawei/hms/common/internal/RequestHeader;->setTransactionId(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :cond_2
    iget-object v2, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 128
    .line 129
    invoke-virtual {v2, v1}, Lcom/huawei/hms/common/internal/RequestHeader;->setPkgName(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 133
    .line 134
    invoke-virtual {v1}, Lcom/huawei/hms/common/internal/RequestHeader;->toJson()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    const-string v2, "HMS_FOREGROUND_REQ_HEADER"

    .line 139
    .line 140
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 141
    .line 142
    .line 143
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundBody:Ljava/lang/String;

    .line 144
    .line 145
    const-string v2, "HMS_FOREGROUND_REQ_BODY"

    .line 146
    .line 147
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 148
    .line 149
    .line 150
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->innerHeader:Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

    .line 151
    .line 152
    invoke-virtual {v1}, Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;->toJson()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    const-string v2, "HMS_FOREGROUND_REQ_INNER"

    .line 157
    .line 158
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 159
    .line 160
    .line 161
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->innerPkgName:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-nez v1, :cond_3

    .line 168
    .line 169
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->innerPkgName:Ljava/lang/String;

    .line 170
    .line 171
    const-string v2, "INNER_PACKAGE_NAME"

    .line 172
    .line 173
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 174
    .line 175
    .line 176
    :cond_3
    return-object v0
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

.method public setAction(Ljava/lang/String;)Lcom/huawei/hms/activity/ForegroundIntentBuilder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/common/internal/RequestHeader;->setApiName(Ljava/lang/String;)V

    return-object p0
.end method

.method public setApiLevel(I)Lcom/huawei/hms/activity/ForegroundIntentBuilder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/common/internal/RequestHeader;->setApiLevel(I)V

    return-object p0
.end method

.method public setApplicationContext(Landroid/content/Context;)Lcom/huawei/hms/activity/ForegroundIntentBuilder;
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->mHostContext:Landroid/content/Context;

    return-object p0
.end method

.method public setInnerHms()Lcom/huawei/hms/activity/ForegroundIntentBuilder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->innerPkgName:Ljava/lang/String;

    return-object p0
.end method

.method public setKitSdkVersion(I)Lcom/huawei/hms/activity/ForegroundIntentBuilder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/common/internal/RequestHeader;->setKitSdkVersion(I)V

    return-object p0
.end method

.method public setMinApkVersion(I)Lcom/huawei/hms/activity/ForegroundIntentBuilder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->innerHeader:Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;->setApkVersion(I)V

    return-object p0
.end method

.method public setRequestBody(Ljava/lang/String;)Lcom/huawei/hms/activity/ForegroundIntentBuilder;
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundBody:Ljava/lang/String;

    return-object p0
.end method

.method public setResponseCallback(Ljava/lang/String;)Lcom/huawei/hms/activity/ForegroundIntentBuilder;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->innerHeader:Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;->setResponseCallbackKey(Ljava/lang/String;)V

    return-object p0
.end method

.method public setResponseCallback(Ljava/lang/String;Lcom/huawei/hms/activity/internal/BusResponseCallback;)Lcom/huawei/hms/activity/ForegroundIntentBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->innerHeader:Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;->setResponseCallbackKey(Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/huawei/hms/activity/internal/ForegroundBusResponseMgr;->getInstance()Lcom/huawei/hms/activity/internal/ForegroundBusResponseMgr;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/hms/activity/internal/ForegroundBusResponseMgr;->registerObserver(Ljava/lang/String;Lcom/huawei/hms/activity/internal/BusResponseCallback;)V

    return-object p0
.end method

.method public setServiceName(Ljava/lang/String;)Lcom/huawei/hms/activity/ForegroundIntentBuilder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/common/internal/RequestHeader;->setSrvName(Ljava/lang/String;)V

    return-object p0
.end method

.method public setSubAppId(Ljava/lang/String;)Lcom/huawei/hms/activity/ForegroundIntentBuilder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/common/internal/RequestHeader;->setAppID(Ljava/lang/String;)V

    return-object p0
.end method

.method public setTransactionId(Ljava/lang/String;)Lcom/huawei/hms/activity/ForegroundIntentBuilder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundIntentBuilder;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/common/internal/RequestHeader;->setTransactionId(Ljava/lang/String;)V

    return-object p0
.end method
