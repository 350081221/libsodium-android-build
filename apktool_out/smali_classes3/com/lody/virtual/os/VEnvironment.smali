.class public Lcom/lody/virtual/os/VEnvironment;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DATA_APP_DIRECTORY:Ljava/io/File;

.field private static final DATA_APP_DIRECTORY_EXT:Ljava/io/File;

.field private static final DATA_APP_SYSTEM_DIRECTORY:Ljava/io/File;

.field private static final DATA_DIRECTORY:Ljava/io/File;

.field private static final DATA_DIRECTORY_EXT:Ljava/io/File;

.field private static final DATA_USER_DE_DIRECTORY:Ljava/io/File;

.field private static final DATA_USER_DE_DIRECTORY_EXT:Ljava/io/File;

.field private static final DATA_USER_DIRECTORY:Ljava/io/File;

.field private static final DATA_USER_DIRECTORY_EXT:Ljava/io/File;

.field private static final FRAMEWORK_DIRECTORY:Ljava/io/File;

.field private static final FRAMEWORK_DIRECTORY_EXT:Ljava/io/File;

.field public static OUTSIDE_APP_UID:I = 0x2328

.field private static final ROOT:Ljava/io/File;

.field private static final ROOT_DATA_USER:Ljava/io/File;

.field private static final ROOT_EXT:Ljava/io/File;

.field private static final ROOT_EXT_DATA_USER:Ljava/io/File;

.field public static SYSTEM_UID:I = 0x3e8

.field private static final TAG:Ljava/lang/String; = "VEnvironment"

.field public static UNKNOWN_APP_UID:I = 0x2329


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget v1, Lcom/lody/virtual/os/VEnvironment;->OUTSIDE_APP_UID:I

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/lody/virtual/os/VUserHandle;->getUid(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sput v0, Lcom/lody/virtual/os/VEnvironment;->OUTSIDE_APP_UID:I

    .line 12
    .line 13
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sget v1, Lcom/lody/virtual/os/VEnvironment;->UNKNOWN_APP_UID:I

    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/lody/virtual/os/VUserHandle;->getUid(II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, Lcom/lody/virtual/os/VEnvironment;->UNKNOWN_APP_UID:I

    .line 24
    .line 25
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sget v1, Lcom/lody/virtual/os/VEnvironment;->SYSTEM_UID:I

    .line 30
    .line 31
    invoke-static {v0, v1}, Lcom/lody/virtual/os/VUserHandle;->getUid(II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    sput v0, Lcom/lody/virtual/os/VEnvironment;->SYSTEM_UID:I

    .line 36
    .line 37
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 38
    .line 39
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 57
    .line 58
    .line 59
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    goto :goto_0

    .line 61
    :catch_0
    new-instance v0, Ljava/io/File;

    .line 62
    .line 63
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->getContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 72
    .line 73
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :goto_0
    new-instance v1, Ljava/io/File;

    .line 81
    .line 82
    sget-object v2, Lcom/lody/virtual/client/stub/StubManifest;->PACKAGE_NAME:Ljava/lang/String;

    .line 83
    .line 84
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const-string v2, "virtual"

    .line 88
    .line 89
    filled-new-array {v2}, [Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-static {v1, v3}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    sput-object v3, Lcom/lody/virtual/os/VEnvironment;->ROOT:Ljava/io/File;

    .line 98
    .line 99
    new-instance v4, Ljava/io/File;

    .line 100
    .line 101
    new-instance v5, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v6, "/data/user/"

    .line 107
    .line 108
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v7, "/"

    .line 119
    .line 120
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    sget-object v8, Lcom/lody/virtual/client/stub/StubManifest;->PACKAGE_NAME:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    filled-new-array {v2}, [Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-static {v4, v5}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    sput-object v4, Lcom/lody/virtual/os/VEnvironment;->ROOT_DATA_USER:Ljava/io/File;

    .line 144
    .line 145
    const-string v4, "framework"

    .line 146
    .line 147
    filled-new-array {v4}, [Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-static {v3, v5}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    sput-object v5, Lcom/lody/virtual/os/VEnvironment;->FRAMEWORK_DIRECTORY:Ljava/io/File;

    .line 156
    .line 157
    const-string v5, "data"

    .line 158
    .line 159
    filled-new-array {v5}, [Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    invoke-static {v3, v8}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    sput-object v3, Lcom/lody/virtual/os/VEnvironment;->DATA_DIRECTORY:Ljava/io/File;

    .line 168
    .line 169
    const-string v8, "user"

    .line 170
    .line 171
    filled-new-array {v8}, [Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    invoke-static {v3, v9}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    sput-object v9, Lcom/lody/virtual/os/VEnvironment;->DATA_USER_DIRECTORY:Ljava/io/File;

    .line 180
    .line 181
    const-string v9, "user_de"

    .line 182
    .line 183
    filled-new-array {v9}, [Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    invoke-static {v3, v10}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    sput-object v10, Lcom/lody/virtual/os/VEnvironment;->DATA_USER_DE_DIRECTORY:Ljava/io/File;

    .line 192
    .line 193
    const-string v10, "app"

    .line 194
    .line 195
    filled-new-array {v10}, [Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    invoke-static {v3, v11}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    sput-object v3, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_DIRECTORY:Ljava/io/File;

    .line 204
    .line 205
    const-string v11, "system"

    .line 206
    .line 207
    filled-new-array {v11}, [Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    invoke-static {v3, v11}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    sput-object v3, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_SYSTEM_DIRECTORY:Ljava/io/File;

    .line 216
    .line 217
    new-instance v3, Ljava/io/File;

    .line 218
    .line 219
    sget-object v11, Lcom/lody/virtual/client/stub/StubManifest;->EXT_PACKAGE_NAME:Ljava/lang/String;

    .line 220
    .line 221
    invoke-direct {v3, v0, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isSharedUserId()Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_0

    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_0
    move-object v1, v3

    .line 236
    :goto_1
    filled-new-array {v2}, [Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-static {v1, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    sput-object v0, Lcom/lody/virtual/os/VEnvironment;->ROOT_EXT:Ljava/io/File;

    .line 245
    .line 246
    new-instance v1, Ljava/io/File;

    .line 247
    .line 248
    new-instance v3, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    sget-object v6, Lcom/lody/virtual/client/stub/StubManifest;->EXT_PACKAGE_NAME:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    filled-new-array {v2}, [Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-static {v1, v2}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    sput-object v1, Lcom/lody/virtual/os/VEnvironment;->ROOT_EXT_DATA_USER:Ljava/io/File;

    .line 287
    .line 288
    filled-new-array {v5}, [Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    sput-object v1, Lcom/lody/virtual/os/VEnvironment;->DATA_DIRECTORY_EXT:Ljava/io/File;

    .line 297
    .line 298
    filled-new-array {v8}, [Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    invoke-static {v1, v2}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    sput-object v2, Lcom/lody/virtual/os/VEnvironment;->DATA_USER_DIRECTORY_EXT:Ljava/io/File;

    .line 307
    .line 308
    filled-new-array {v10}, [Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-static {v1, v2}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    sput-object v2, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_DIRECTORY_EXT:Ljava/io/File;

    .line 317
    .line 318
    filled-new-array {v9}, [Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    invoke-static {v1, v2}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    sput-object v1, Lcom/lody/virtual/os/VEnvironment;->DATA_USER_DE_DIRECTORY_EXT:Ljava/io/File;

    .line 327
    .line 328
    filled-new-array {v4}, [Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    sput-object v0, Lcom/lody/virtual/os/VEnvironment;->FRAMEWORK_DIRECTORY_EXT:Ljava/io/File;

    .line 337
    .line 338
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    new-instance p0, Ljava/io/File;

    .line 10
    .line 11
    invoke-direct {p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    new-instance v3, Ljava/io/File;

    .line 16
    .line 17
    invoke-direct {v3, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    move-object p0, v3

    .line 21
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return-object p0
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

.method public static chmodPackageDictionary(Ljava/io/File;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/lody/virtual/helper/utils/FileUtils;->isSymlink(Ljava/io/File;)Z

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
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/16 v1, 0x1ed

    .line 17
    .line 18
    invoke-static {v0, v1}, Lcom/lody/virtual/helper/utils/FileUtils;->chmod(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0, v1}, Lcom/lody/virtual/helper/utils/FileUtils;->chmod(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void
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

.method public static enableMediaRedirect()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static getAccountConfigFile()Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_SYSTEM_DIRECTORY:Ljava/io/File;

    const-string v2, "account-list.ini"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getAccountVisibilityConfigFile()Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_SYSTEM_DIRECTORY:Ljava/io/File;

    const-string v2, "account-visibility-list.ini"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getBakUidListFile()Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_SYSTEM_DIRECTORY:Ljava/io/File;

    const-string v2, "uid-list.ini.bak"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private static getContext()Landroid/content/Context;
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public static getDataAppDirectory()Ljava/io/File;
    .locals 1

    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_DIRECTORY:Ljava/io/File;

    return-object v0
.end method

.method public static getDataAppDirectoryExt()Ljava/io/File;
    .locals 1

    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_DIRECTORY_EXT:Ljava/io/File;

    return-object v0
.end method

.method public static getDataAppLibDirectory(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataAppPackageDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    const-string v0, "lib"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDataAppLibDirectoryExt(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataAppPackageDirectoryExt(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    const-string v0, "lib"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDataAppLibDirectoryExt_DataUser(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 1
    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->ROOT_EXT_DATA_USER:Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "data"

    .line 4
    .line 5
    filled-new-array {v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "app"

    .line 14
    .line 15
    filled-new-array {v1}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x1

    .line 24
    new-array v1, v1, [Ljava/lang/String;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    aput-object p0, v1, v2

    .line 28
    .line 29
    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string v0, "lib"

    .line 34
    .line 35
    filled-new-array {v0}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
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

.method public static getDataAppLibDirectory_DataUser(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 1
    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->ROOT_DATA_USER:Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "data"

    .line 4
    .line 5
    filled-new-array {v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "app"

    .line 14
    .line 15
    filled-new-array {v1}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x1

    .line 24
    new-array v1, v1, [Ljava/lang/String;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    aput-object p0, v1, v2

    .line 28
    .line 29
    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string v0, "lib"

    .line 34
    .line 35
    filled-new-array {v0}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
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

.method public static getDataAppPackageDirectory(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_DIRECTORY:Ljava/io/File;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDataAppPackageDirectoryExt(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_DIRECTORY_EXT:Ljava/io/File;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDataDirectory()Ljava/io/File;
    .locals 1

    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_DIRECTORY:Ljava/io/File;

    return-object v0
.end method

.method public static getDataSystemDirectory(I)Ljava/io/File;
    .locals 1

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataUserDirectory(I)Ljava/io/File;

    move-result-object p0

    const-string v0, "system"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDataSystemDirectoryExt(I)Ljava/io/File;
    .locals 1

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataUserDirectoryExt(I)Ljava/io/File;

    move-result-object p0

    const-string v0, "system"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDataUserDeDirectory()Ljava/io/File;
    .locals 1

    .line 1
    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_USER_DE_DIRECTORY:Ljava/io/File;

    return-object v0
.end method

.method public static getDataUserDeDirectory(I)Ljava/io/File;
    .locals 3

    .line 2
    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_USER_DE_DIRECTORY:Ljava/io/File;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDataUserDirectory()Ljava/io/File;
    .locals 1

    .line 1
    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_USER_DIRECTORY:Ljava/io/File;

    return-object v0
.end method

.method public static getDataUserDirectory(I)Ljava/io/File;
    .locals 3

    .line 2
    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_USER_DIRECTORY:Ljava/io/File;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDataUserDirectoryExt()Ljava/io/File;
    .locals 1

    .line 1
    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_USER_DIRECTORY_EXT:Ljava/io/File;

    return-object v0
.end method

.method public static getDataUserDirectoryExt(I)Ljava/io/File;
    .locals 3

    .line 2
    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_USER_DIRECTORY_EXT:Ljava/io/File;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDataUserPackageDirectory(ILjava/lang/String;)Ljava/io/File;
    .locals 2

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataUserDirectory(I)Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDataUserPackageDirectoryExt(ILjava/lang/String;)Ljava/io/File;
    .locals 2

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataUserDirectoryExt(I)Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDataUserPackageDirectoryExt_DataUser(ILjava/lang/String;)Ljava/io/File;
    .locals 4

    .line 1
    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->ROOT_EXT_DATA_USER:Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "data"

    .line 4
    .line 5
    filled-new-array {v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "user"

    .line 14
    .line 15
    filled-new-array {v1}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x1

    .line 24
    new-array v2, v1, [Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/4 v3, 0x0

    .line 31
    aput-object p0, v2, v3

    .line 32
    .line 33
    invoke-static {v0, v2}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    new-array v0, v1, [Ljava/lang/String;

    .line 38
    .line 39
    aput-object p1, v0, v3

    .line 40
    .line 41
    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static getDataUserPackageDirectory_DataUser(ILjava/lang/String;)Ljava/io/File;
    .locals 4

    .line 1
    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->ROOT_DATA_USER:Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "data"

    .line 4
    .line 5
    filled-new-array {v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "user"

    .line 14
    .line 15
    filled-new-array {v1}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x1

    .line 24
    new-array v2, v1, [Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/4 v3, 0x0

    .line 31
    aput-object p0, v2, v3

    .line 32
    .line 33
    invoke-static {v0, v2}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    new-array v0, v1, [Ljava/lang/String;

    .line 38
    .line 39
    aput-object p1, v0, v3

    .line 40
    .line 41
    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static getDeDataUserDirectoryExt()Ljava/io/File;
    .locals 1

    .line 1
    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_USER_DE_DIRECTORY_EXT:Ljava/io/File;

    return-object v0
.end method

.method public static getDeDataUserDirectoryExt(I)Ljava/io/File;
    .locals 3

    .line 2
    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_USER_DE_DIRECTORY_EXT:Ljava/io/File;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDeDataUserPackageDirectory(ILjava/lang/String;)Ljava/io/File;
    .locals 2

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataUserDeDirectory(I)Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDeDataUserPackageDirectoryExt(ILjava/lang/String;)Ljava/io/File;
    .locals 2

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDeDataUserDirectoryExt(I)Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDeDataUserPackageDirectoryExtRoot(I)Ljava/io/File;
    .locals 1

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDeDataUserDirectoryExt(I)Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDeDataUserPackageDirectoryRoot(I)Ljava/io/File;
    .locals 1

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataUserDeDirectory(I)Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getDeviceInfoFile()Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_SYSTEM_DIRECTORY:Ljava/io/File;

    const-string v2, "device-config.ini"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getFrameworkDirectory()Ljava/io/File;
    .locals 1

    .line 2
    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->FRAMEWORK_DIRECTORY:Ljava/io/File;

    return-object v0
.end method

.method public static getFrameworkDirectory(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 1
    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->FRAMEWORK_DIRECTORY:Ljava/io/File;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getFrameworkDirectoryExt()Ljava/io/File;
    .locals 1

    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->FRAMEWORK_DIRECTORY_EXT:Ljava/io/File;

    return-object v0
.end method

.method public static getFrameworkFile(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getFrameworkDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    const-string v1, "extracted.jar"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getJobConfigFile()Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_SYSTEM_DIRECTORY:Ljava/io/File;

    const-string v2, "job-list.ini"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getNativeCacheDir(Z)Ljava/io/File;
    .locals 1

    if-eqz p0, :cond_0

    sget-object p0, Lcom/lody/virtual/os/VEnvironment;->ROOT_EXT:Ljava/io/File;

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/lody/virtual/os/VEnvironment;->ROOT:Ljava/io/File;

    :goto_0
    const-string v0, ".native"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getOatDirectory(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataAppPackageDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    const-string v0, "oat"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getOatDirectoryExt(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataAppPackageDirectoryExt(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    const-string v0, "oat"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getOatFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getOatDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    const-string v1, "base.odex"

    aput-object v1, v0, p1

    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getOatFileExt(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getOatDirectoryExt(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    const-string v1, "base.odex"

    aput-object v1, v0, p1

    invoke-static {p0, v0}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getOptimizedFrameworkFile(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getFrameworkDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    const-string v1, "classes.dex"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getPackageCacheFile(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataAppPackageDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    const-string v1, "package.ini"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getPackageFile(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataAppPackageDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    const-string v1, "YmFzZS5hcGs="

    invoke-static {v1}, Lcom/lody/virtual/helper/utils/EncodeUtils;->decodeBase64(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getPackageFileExt(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataAppPackageDirectoryExt(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    const-string v1, "YmFzZS5hcGs="

    invoke-static {v1}, Lcom/lody/virtual/helper/utils/EncodeUtils;->decodeBase64(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getPackageFileStub(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isOreo()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, "L2RhdGEvYXBwLyVzLSVzL2Jhc2UuYXBr"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/EncodeUtils;->decodeBase64(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v3, 0x2

    .line 16
    new-array v3, v3, [Ljava/lang/Object;

    .line 17
    .line 18
    aput-object p0, v3, v1

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/16 v1, 0xa

    .line 25
    .line 26
    invoke-static {p0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    aput-object p0, v3, v2

    .line 31
    .line 32
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_0
    const-string v0, "L2RhdGEvYXBwLyVzLTEvYmFzZS5hcGs="

    .line 38
    .line 39
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/EncodeUtils;->decodeBase64(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-array v2, v2, [Ljava/lang/Object;

    .line 44
    .line 45
    aput-object p0, v2, v1

    .line 46
    .line 47
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
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

.method public static getPackageInstallerStageDir()Ljava/io/File;
    .locals 2

    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_SYSTEM_DIRECTORY:Ljava/io/File;

    const-string v1, ".session_dir"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public static getPackageListFile()Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_SYSTEM_DIRECTORY:Ljava/io/File;

    const-string v2, "packages.ini"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getRoot()Ljava/io/File;
    .locals 1

    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->ROOT:Ljava/io/File;

    return-object v0
.end method

.method public static getRootExt()Ljava/io/File;
    .locals 1

    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->ROOT_EXT:Ljava/io/File;

    return-object v0
.end method

.method public static getSignatureFile(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataAppPackageDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    const-string v1, "signature.ini"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getSplitFileName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "split_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".apk"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getSplitPackageFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 1

    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataAppPackageDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    invoke-static {p1}, Lcom/lody/virtual/os/VEnvironment;->getSplitFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getSplitPackageFileExt(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 1

    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataAppPackageDirectoryExt(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    invoke-static {p1}, Lcom/lody/virtual/os/VEnvironment;->getSplitFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getSyncDirectory()Ljava/io/File;
    .locals 2

    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_SYSTEM_DIRECTORY:Ljava/io/File;

    const-string v1, "sync"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/lody/virtual/os/VEnvironment;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public static getSystemSettingsFile(I)Ljava/io/File;
    .locals 2

    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataSystemDirectory(I)Ljava/io/File;

    move-result-object p0

    const-string v1, "settings.ini"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getUidListFile()Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_SYSTEM_DIRECTORY:Ljava/io/File;

    const-string v2, "uid-list.ini"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getUserAppLibDirectory(ILjava/lang/String;)Ljava/io/File;
    .locals 1

    new-instance v0, Ljava/io/File;

    invoke-static {p0, p1}, Lcom/lody/virtual/os/VEnvironment;->getDataUserPackageDirectory(ILjava/lang/String;)Ljava/io/File;

    move-result-object p0

    const-string p1, "lib"

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getUserAppLibDirectoryExt(ILjava/lang/String;)Ljava/io/File;
    .locals 1

    new-instance v0, Ljava/io/File;

    invoke-static {p0, p1}, Lcom/lody/virtual/os/VEnvironment;->getDataUserPackageDirectoryExt(ILjava/lang/String;)Ljava/io/File;

    move-result-object p0

    const-string p1, "lib"

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getVSConfigFile()Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_SYSTEM_DIRECTORY:Ljava/io/File;

    const-string v2, "vss.ini"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getVirtualLocationFile()Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_SYSTEM_DIRECTORY:Ljava/io/File;

    const-string v2, "virtual-loc.ini"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getWifiMacFile(IZ)Ljava/io/File;
    .locals 1

    .line 1
    const-string v0, "wifiMacAddress"

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    new-instance p1, Ljava/io/File;

    .line 6
    .line 7
    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataSystemDirectoryExt(I)Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {p1, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance p1, Ljava/io/File;

    .line 16
    .line 17
    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getDataSystemDirectory(I)Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {p1, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object p1
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

.method public static systemReady()V
    .locals 4

    .line 1
    sget-object v0, Lcom/lody/virtual/os/VEnvironment;->DATA_DIRECTORY:Ljava/io/File;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_DIRECTORY:Ljava/io/File;

    .line 7
    .line 8
    invoke-static {v1}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 9
    .line 10
    .line 11
    sget-object v2, Lcom/lody/virtual/os/VEnvironment;->DATA_APP_SYSTEM_DIRECTORY:Ljava/io/File;

    .line 12
    .line 13
    invoke-static {v2}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 14
    .line 15
    .line 16
    sget-object v2, Lcom/lody/virtual/os/VEnvironment;->DATA_USER_DIRECTORY:Ljava/io/File;

    .line 17
    .line 18
    invoke-static {v2}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 19
    .line 20
    .line 21
    sget-object v2, Lcom/lody/virtual/os/VEnvironment;->DATA_USER_DE_DIRECTORY:Ljava/io/File;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 24
    .line 25
    .line 26
    sget-object v2, Lcom/lody/virtual/os/VEnvironment;->FRAMEWORK_DIRECTORY:Ljava/io/File;

    .line 27
    .line 28
    invoke-static {v2}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 29
    .line 30
    .line 31
    sget-object v2, Lcom/lody/virtual/os/VEnvironment;->ROOT:Ljava/io/File;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const/16 v3, 0x1ed

    .line 38
    .line 39
    invoke-static {v2, v3}, Lcom/lody/virtual/helper/utils/FileUtils;->chmod(Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0, v3}, Lcom/lody/virtual/helper/utils/FileUtils;->chmod(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0, v3}, Lcom/lody/virtual/helper/utils/FileUtils;->chmod(Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    return-void
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
