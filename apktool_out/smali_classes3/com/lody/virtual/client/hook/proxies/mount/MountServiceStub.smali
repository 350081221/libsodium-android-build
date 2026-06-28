.class public Lcom/lody/virtual/client/hook/proxies/mount/MountServiceStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation runtime Lcom/lody/virtual/client/hook/annotations/Inject;
    value = Lcom/lody/virtual/client/hook/proxies/mount/MethodProxies;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/hook/proxies/mount/MountServiceStub;->getInterfaceMethod()Lmirror/RefStaticMethod;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "mount"

    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/os/IInterface;

    .line 21
    .line 22
    :try_start_0
    const-class v1, Landroid/os/storage/StorageManager;

    .line 23
    .line 24
    invoke-static {v1}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Class;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "sStorageManager"

    .line 29
    .line 30
    invoke-virtual {v1, v2, v0}, Lcom/lody/virtual/helper/utils/Reflect;->set(Ljava/lang/String;Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void
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

.method static synthetic access$000(Lcom/lody/virtual/client/hook/proxies/mount/MountServiceStub;Ljava/lang/String;I)Landroid/app/usage/StorageStats;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/client/hook/proxies/mount/MountServiceStub;->queryStatsForPackage(Ljava/lang/String;I)Landroid/app/usage/StorageStats;

    move-result-object p0

    return-object p0
.end method

.method private static getInterfaceMethod()Lmirror/RefStaticMethod;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmirror/RefStaticMethod<",
            "Landroid/os/IInterface;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isOreo()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lmirror/android/os/storage/IStorageManager$Stub;->asInterface:Lmirror/RefStaticMethod;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v0, Lmirror/android/os/mount/IMountService$Stub;->asInterface:Lmirror/RefStaticMethod;

    .line 11
    .line 12
    return-object v0
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

.method private queryStatsForPackage(Ljava/lang/String;I)Landroid/app/usage/StorageStats;
    .locals 2

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1, p2}, Lcom/lody/virtual/client/ipc/VPackageManager;->getApplicationInfo(Ljava/lang/String;II)Landroid/content/pm/ApplicationInfo;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    sget-object p1, Lmirror/android/app/usage/StorageStats;->ctor:Lmirror/RefConstructor;

    .line 13
    .line 14
    invoke-virtual {p1}, Lmirror/RefConstructor;->newInstance()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroid/app/usage/StorageStats;

    .line 19
    .line 20
    sget-object p2, Lmirror/android/app/usage/StorageStats;->cacheBytes:Lmirror/RefLong;

    .line 21
    .line 22
    const-wide/16 v0, 0x0

    .line 23
    .line 24
    invoke-virtual {p2, p1, v0, v1}, Lmirror/RefLong;->set(Ljava/lang/Object;J)V

    .line 25
    .line 26
    .line 27
    sget-object p2, Lmirror/android/app/usage/StorageStats;->codeBytes:Lmirror/RefLong;

    .line 28
    .line 29
    invoke-virtual {p2, p1, v0, v1}, Lmirror/RefLong;->set(Ljava/lang/Object;J)V

    .line 30
    .line 31
    .line 32
    sget-object p2, Lmirror/android/app/usage/StorageStats;->dataBytes:Lmirror/RefLong;

    .line 33
    .line 34
    invoke-virtual {p2, p1, v0, v1}, Lmirror/RefLong;->set(Ljava/lang/Object;J)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_0
    new-instance p2, Landroid/os/ParcelableException;

    .line 39
    .line 40
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 41
    .line 42
    invoke-direct {v0, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p2, v0}, Landroid/os/ParcelableException;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    throw p2
    .line 49
    .line 50
.end method


# virtual methods
.method protected onBindMethods()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 5
    .line 6
    const-string v1, "isQuotaSupported"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 15
    .line 16
    const-string v1, "isReservedSupported"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 22
    .line 23
    .line 24
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 25
    .line 26
    const-string v1, "getTotalBytes"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 35
    .line 36
    const-string v1, "getFreeBytes"

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 42
    .line 43
    .line 44
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 45
    .line 46
    const-string v1, "getCacheBytes"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 52
    .line 53
    .line 54
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastCallingPkgAndLastUserIdMethodProxy;

    .line 55
    .line 56
    const-string v1, "getCacheQuotaBytes"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 62
    .line 63
    .line 64
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastCallingPkgAndLastUserIdMethodProxy;

    .line 65
    .line 66
    const-string v1, "queryStatsForUid"

    .line 67
    .line 68
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 72
    .line 73
    .line 74
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastCallingPkgAndLastUserIdMethodProxy;

    .line 75
    .line 76
    const-string v1, "queryStatsForUser"

    .line 77
    .line 78
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 82
    .line 83
    .line 84
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastCallingPkgAndLastUserIdMethodProxy;

    .line 85
    .line 86
    const-string v1, "queryExternalStatsForUser"

    .line 87
    .line 88
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 92
    .line 93
    .line 94
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastCallingPkgAndLastUserIdMethodProxy;

    .line 95
    .line 96
    const-string v1, "queryCratesForPackage"

    .line 97
    .line 98
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 102
    .line 103
    .line 104
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastCallingPkgAndLastUserIdMethodProxy;

    .line 105
    .line 106
    const-string v1, "queryCratesForUid"

    .line 107
    .line 108
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 112
    .line 113
    .line 114
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastCallingPkgAndLastUserIdMethodProxy;

    .line 115
    .line 116
    const-string v1, "queryCratesForUser"

    .line 117
    .line 118
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 122
    .line 123
    .line 124
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/mount/MountServiceStub$1;

    .line 125
    .line 126
    const-string v1, "fixupAppDir"

    .line 127
    .line 128
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/mount/MountServiceStub$1;-><init>(Lcom/lody/virtual/client/hook/proxies/mount/MountServiceStub;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 132
    .line 133
    .line 134
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/mount/MountServiceStub$2;

    .line 135
    .line 136
    const-string v1, "queryStatsForPackage"

    .line 137
    .line 138
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/mount/MountServiceStub$2;-><init>(Lcom/lody/virtual/client/hook/proxies/mount/MountServiceStub;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 142
    .line 143
    .line 144
    return-void
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
