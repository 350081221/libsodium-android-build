.class public Lcom/umeng/analytics/process/UMProcessDBDatasSender;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/commonsdk/framework/UMLogDataProtocol;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/process/UMProcessDBDatasSender$ReplaceCallback;,
        Lcom/umeng/analytics/process/UMProcessDBDatasSender$ConstructMessageCallback;
    }
.end annotation


# static fields
.field public static final UM_PROCESS_CONSTRUCTMESSAGE:I = 0x9052

.field public static final UM_PROCESS_EVENT_KEY:I = 0x9051

.field private static executor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field private static mInstance:Lcom/umeng/analytics/process/UMProcessDBDatasSender;


# instance fields
.field private mContext:Landroid/content/Context;

.field private mGeneralBodyIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mLockUtil:Lcom/umeng/commonsdk/utils/FileLockUtil;

.field private mPolicySelector:Lcom/umeng/analytics/pro/o$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    sput-object v0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->executor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/umeng/commonsdk/utils/FileLockUtil;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/umeng/commonsdk/utils/FileLockUtil;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mLockUtil:Lcom/umeng/commonsdk/utils/FileLockUtil;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method static synthetic access$000(Lcom/umeng/analytics/process/UMProcessDBDatasSender;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method private constructMessage()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->defconProcesserHandler()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mLockUtil:Lcom/umeng/commonsdk/utils/FileLockUtil;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 11
    .line 12
    const-string v2, ""

    .line 13
    .line 14
    invoke-static {v1, v2}, Lcom/umeng/analytics/process/b;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Lcom/umeng/analytics/process/UMProcessDBDatasSender$ConstructMessageCallback;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v2, p0, v3}, Lcom/umeng/analytics/process/UMProcessDBDatasSender$ConstructMessageCallback;-><init>(Lcom/umeng/analytics/process/UMProcessDBDatasSender;Lcom/umeng/analytics/process/UMProcessDBDatasSender$1;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lcom/umeng/commonsdk/utils/FileLockUtil;->doFileOperateion(Ljava/lang/String;Lcom/umeng/commonsdk/utils/FileLockCallback;)V

    .line 25
    .line 26
    .line 27
    return-void
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

.method private defconProcesserHandler()I
    .locals 4

    .line 1
    invoke-static {}, Lcom/umeng/analytics/pro/r;->a()Lcom/umeng/analytics/pro/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/r;->a(Landroid/content/Context;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :try_start_0
    iget-object v2, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {v2}, Lcom/umeng/analytics/process/b;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v3, Lcom/umeng/analytics/process/UMProcessDBDatasSender$ReplaceCallback;

    .line 21
    .line 22
    invoke-direct {v3, p0, v1}, Lcom/umeng/analytics/process/UMProcessDBDatasSender$ReplaceCallback;-><init>(Lcom/umeng/analytics/process/UMProcessDBDatasSender;Lcom/umeng/analytics/process/UMProcessDBDatasSender$1;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v3, v1}, Lcom/umeng/analytics/process/DBFileTraversalUtil;->traverseDBFiles(Ljava/lang/String;Lcom/umeng/commonsdk/utils/FileLockCallback;Lcom/umeng/analytics/process/DBFileTraversalUtil$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    :catch_0
    iget-object v2, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {v2}, Lcom/umeng/analytics/process/UMProcessDBHelper;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/process/UMProcessDBHelper;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, "_main_"

    .line 35
    .line 36
    invoke-virtual {v2, v3, v1, v1}, Lcom/umeng/analytics/process/UMProcessDBHelper;->deleteEventDatas(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return v0
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

.method private generalBody()Lorg/json/JSONObject;
    .locals 7

    .line 1
    const-string v0, "userlevel"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mGeneralBodyIds:Ljava/util/List;

    .line 5
    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mGeneralBodyIds:Ljava/util/List;

    .line 14
    .line 15
    :cond_0
    iget-object v2, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 16
    .line 17
    invoke-static {v2}, Lcom/umeng/analytics/process/UMProcessDBHelper;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/process/UMProcessDBHelper;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {v3}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->maxDataSpace(Landroid/content/Context;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    const-wide/16 v5, 0x7d0

    .line 28
    .line 29
    sub-long/2addr v3, v5

    .line 30
    iget-object v5, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mGeneralBodyIds:Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {v2, v3, v4, v5}, Lcom/umeng/analytics/process/UMProcessDBHelper;->readMainEvents(JLjava/util/List;)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v2, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 37
    .line 38
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    const-string v3, ""

    .line 45
    .line 46
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_1

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 57
    .line 58
    .line 59
    :cond_1
    iget-object v0, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 60
    .line 61
    invoke-static {v0}, Lcom/umeng/analytics/c;->a(Landroid/content/Context;)[Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    aget-object v3, v0, v2

    .line 69
    .line 70
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_2

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    aget-object v4, v0, v3

    .line 78
    .line 79
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-nez v4, :cond_2

    .line 84
    .line 85
    new-instance v4, Lorg/json/JSONObject;

    .line 86
    .line 87
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v5, "provider"

    .line 91
    .line 92
    aget-object v2, v0, v2

    .line 93
    .line 94
    invoke-virtual {v4, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    const-string v2, "puid"

    .line 98
    .line 99
    aget-object v0, v0, v3

    .line 100
    .line 101
    invoke-virtual {v4, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Lorg/json/JSONObject;->length()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-lez v0, :cond_2

    .line 109
    .line 110
    const-string v0, "active_user"

    .line 111
    .line 112
    invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    .line 114
    .line 115
    :cond_2
    iget-object v0, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 116
    .line 117
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->getService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/noise/ABTest;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->isInTest()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_3

    .line 126
    .line 127
    new-instance v0, Lorg/json/JSONObject;

    .line 128
    .line 129
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 130
    .line 131
    .line 132
    iget-object v2, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 133
    .line 134
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->getService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/noise/ABTest;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v2}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->getTestName()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    iget-object v3, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 143
    .line 144
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->getService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/noise/ABTest;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v3}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->getGroupInfo()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 153
    .line 154
    .line 155
    const-string v2, "group_info"

    .line 156
    .line 157
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    .line 159
    .line 160
    :catchall_0
    :cond_3
    return-object v1
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

.method private generalHeader()Lorg/json/JSONObject;
    .locals 8

    .line 1
    const-string v0, "$ud_da"

    .line 2
    .line 3
    const-string v1, "$pr_ve"

    .line 4
    .line 5
    const-string v2, "pr_ve"

    .line 6
    .line 7
    new-instance v3, Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    sget-object v4, Lcom/umeng/analytics/AnalyticsConfig;->mWrapperType:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    sget-object v4, Lcom/umeng/analytics/AnalyticsConfig;->mWrapperVersion:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    const-string v5, "wrapper_version"

    .line 21
    .line 22
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    const-string v4, "wrapper_type"

    .line 26
    .line 27
    sget-object v5, Lcom/umeng/analytics/AnalyticsConfig;->mWrapperType:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v4, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 33
    .line 34
    invoke-static {v4}, Lcom/umeng/analytics/AnalyticsConfig;->getVerticalType(Landroid/content/Context;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "vertical_type"

    .line 39
    .line 40
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    iget-object v4, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 44
    .line 45
    invoke-static {v4}, Lcom/umeng/analytics/AnalyticsConfig;->getVerticalType(Landroid/content/Context;)I

    .line 46
    .line 47
    .line 48
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    const/4 v5, 0x1

    .line 50
    const-string v6, "9.6.5"

    .line 51
    .line 52
    const-string v7, "sdk_version"

    .line 53
    .line 54
    if-ne v4, v5, :cond_2

    .line 55
    .line 56
    :try_start_1
    iget-object v4, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 57
    .line 58
    invoke-static {v4}, Lcom/umeng/analytics/AnalyticsConfig;->getGameSdkVersion(Landroid/content/Context;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    move-object v6, v4

    .line 70
    :goto_0
    invoke-virtual {v3, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-virtual {v3, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 75
    .line 76
    .line 77
    :goto_1
    iget-object v4, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mGeneralBodyIds:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-lez v4, :cond_3

    .line 84
    .line 85
    iget-object v4, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 86
    .line 87
    invoke-static {v4}, Lcom/umeng/analytics/process/UMProcessDBHelper;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/process/UMProcessDBHelper;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    iget-object v5, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mGeneralBodyIds:Ljava/util/List;

    .line 92
    .line 93
    const/4 v6, 0x0

    .line 94
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Ljava/lang/Integer;

    .line 99
    .line 100
    invoke-virtual {v4, v5}, Lcom/umeng/analytics/process/UMProcessDBHelper;->readVersionInfoFromColumId(Ljava/lang/Integer;)Lorg/json/JSONObject;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    if-eqz v4, :cond_3

    .line 105
    .line 106
    const-string v5, "__av"

    .line 107
    .line 108
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const-string v6, "__vc"

    .line 113
    .line 114
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    goto :goto_2

    .line 119
    :cond_3
    const-string v5, ""

    .line 120
    .line 121
    move-object v4, v5

    .line 122
    :goto_2
    :try_start_2
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    const-string v7, "app_version"

    .line 127
    .line 128
    if-eqz v6, :cond_4

    .line 129
    .line 130
    :try_start_3
    iget-object v5, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 131
    .line 132
    invoke-static {v5}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v3, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_4
    invoke-virtual {v3, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 141
    .line 142
    .line 143
    :goto_3
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 147
    const-string v6, "version_code"

    .line 148
    .line 149
    if-eqz v5, :cond_5

    .line 150
    .line 151
    :try_start_4
    iget-object v4, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 152
    .line 153
    invoke-static {v4}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppVersionCode(Landroid/content/Context;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-virtual {v3, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_5
    invoke-virtual {v3, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 162
    .line 163
    .line 164
    :goto_4
    iget-object v4, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 165
    .line 166
    invoke-static {v4}, Lcom/umeng/analytics/AnalyticsConfig;->getSecretKey(Landroid/content/Context;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->MD5(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-nez v5, :cond_6

    .line 179
    .line 180
    const-string v5, "secret"

    .line 181
    .line 182
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 183
    .line 184
    .line 185
    :cond_6
    iget-object v4, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 186
    .line 187
    const/4 v5, 0x0

    .line 188
    invoke-static {v4, v2, v5}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    iget-object v6, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 193
    .line 194
    invoke-static {v6}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    iget-object v7, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 199
    .line 200
    invoke-static {v7, v2, v5}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-virtual {v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 205
    .line 206
    .line 207
    iget-object v2, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 208
    .line 209
    const-string v7, "ud_da"

    .line 210
    .line 211
    invoke-static {v2, v7, v5}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v3, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 216
    .line 217
    .line 218
    const-string v2, "pro_ver"

    .line 219
    .line 220
    const-string v5, "1.0.0"

    .line 221
    .line 222
    invoke-virtual {v3, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 223
    .line 224
    .line 225
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-eqz v2, :cond_7

    .line 230
    .line 231
    const-string v2, "vers_pre_version"

    .line 232
    .line 233
    const-string v4, "0"

    .line 234
    .line 235
    invoke-interface {v6, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-virtual {v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 240
    .line 241
    .line 242
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 243
    .line 244
    const-string v2, "yyyy-MM-dd"

    .line 245
    .line 246
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-direct {v1, v2, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 251
    .line 252
    .line 253
    new-instance v2, Ljava/util/Date;

    .line 254
    .line 255
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 256
    .line 257
    .line 258
    move-result-wide v4

    .line 259
    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    const-string v2, "vers_date"

    .line 267
    .line 268
    invoke-interface {v6, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 273
    .line 274
    .line 275
    goto :goto_5

    .line 276
    :catchall_0
    move-exception v0

    .line 277
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 278
    .line 279
    .line 280
    :cond_7
    :goto_5
    return-object v3
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

.method public static getInstance(Landroid/content/Context;)Lcom/umeng/analytics/process/UMProcessDBDatasSender;
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mInstance:Lcom/umeng/analytics/process/UMProcessDBDatasSender;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mInstance:Lcom/umeng/analytics/process/UMProcessDBDatasSender;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/umeng/analytics/process/UMProcessDBDatasSender;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/umeng/analytics/process/UMProcessDBDatasSender;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mInstance:Lcom/umeng/analytics/process/UMProcessDBDatasSender;

    .line 18
    .line 19
    :cond_0
    monitor-exit v0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p0

    .line 24
    :cond_1
    :goto_0
    sget-object v0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mInstance:Lcom/umeng/analytics/process/UMProcessDBDatasSender;

    .line 25
    .line 26
    iput-object p0, v0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 27
    .line 28
    return-object v0
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
.end method


# virtual methods
.method public removeCacheData(Ljava/lang/Object;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mGeneralBodyIds:Ljava/util/List;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    check-cast p1, Lorg/json/JSONObject;

    .line 15
    .line 16
    const-string v0, "analytics"

    .line 17
    .line 18
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-lez v0, :cond_1

    .line 43
    .line 44
    const-string v0, "ekv"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    iget-object p1, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 53
    .line 54
    invoke-static {p1}, Lcom/umeng/analytics/process/UMProcessDBHelper;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/process/UMProcessDBHelper;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v0, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mGeneralBodyIds:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Lcom/umeng/analytics/process/UMProcessDBHelper;->deleteMainProcessEventDatasByIds(Ljava/util/List;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mGeneralBodyIds:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 66
    .line 67
    .line 68
    :cond_1
    :goto_0
    return-void
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

.method public setupReportData(J)Lorg/json/JSONObject;
    .locals 6

    .line 1
    invoke-static {}, Lcom/umeng/analytics/pro/r;->a()Lcom/umeng/analytics/pro/r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Lcom/umeng/analytics/pro/r;->a(Landroid/content/Context;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-direct {p0}, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->generalBody()Lorg/json/JSONObject;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Lorg/json/JSONObject;->length()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-gtz v0, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    invoke-direct {p0}, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->generalHeader()Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v2, Lorg/json/JSONObject;

    .line 28
    .line 29
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 30
    .line 31
    .line 32
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    .line 33
    .line 34
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    const/4 v4, 0x3

    .line 38
    const-string v5, "analytics"

    .line 39
    .line 40
    if-ne p1, v4, :cond_1

    .line 41
    .line 42
    :try_start_1
    new-instance p1, Lorg/json/JSONObject;

    .line 43
    .line 44
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v5, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {p2}, Lorg/json/JSONObject;->length()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-lez p1, :cond_2

    .line 56
    .line 57
    invoke-virtual {v3, v5, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-lez p1, :cond_3

    .line 67
    .line 68
    const-string p1, "header"

    .line 69
    .line 70
    invoke-virtual {v2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-virtual {v3}, Lorg/json/JSONObject;->length()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-lez p1, :cond_7

    .line 78
    .line 79
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_6

    .line 84
    .line 85
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    .line 90
    .line 91
    .line 92
    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    const/4 v0, 0x1

    .line 94
    const-string v4, "userlevel"

    .line 95
    .line 96
    const-string v5, "active_user"

    .line 97
    .line 98
    if-ne p2, v0, :cond_5

    .line 99
    .line 100
    :try_start_2
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    if-eqz p2, :cond_4

    .line 105
    .line 106
    return-object v1

    .line 107
    :cond_4
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    if-nez p2, :cond_5

    .line 116
    .line 117
    return-object v1

    .line 118
    :cond_5
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    const/4 v0, 0x2

    .line 123
    if-ne p2, v0, :cond_6

    .line 124
    .line 125
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    if-eqz p2, :cond_6

    .line 130
    .line 131
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-nez p1, :cond_6

    .line 140
    .line 141
    return-object v1

    .line 142
    :cond_6
    const-string p1, "content"

    .line 143
    .line 144
    invoke-virtual {v2, p1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 145
    .line 146
    .line 147
    :catchall_0
    :cond_7
    return-object v2
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
.end method

.method public workEvent(Ljava/lang/Object;I)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->mContext:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-static {}, Lcom/umeng/commonsdk/utils/c;->a()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    packed-switch p2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_0
    const-string p1, "MobclickRT"

    .line 22
    .line 23
    const-string p2, "--->>> recv UM_PROCESS_CONSTRUCTMESSAGE msg."

    .line 24
    .line 25
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->constructMessage()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_1
    sget-object p1, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->executor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 33
    .line 34
    new-instance p2, Lcom/umeng/analytics/process/UMProcessDBDatasSender$1;

    .line 35
    .line 36
    invoke-direct {p2, p0}, Lcom/umeng/analytics/process/UMProcessDBDatasSender$1;-><init>(Lcom/umeng/analytics/process/UMProcessDBDatasSender;)V

    .line 37
    .line 38
    .line 39
    const-wide/16 v0, 0x5

    .line 40
    .line 41
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 42
    .line 43
    invoke-virtual {p1, p2, v0, v1, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 44
    .line 45
    .line 46
    :goto_0
    return-void

    .line 47
    :pswitch_data_0
    .packed-switch 0x9051
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 48
    .line 49
    .line 50
.end method
