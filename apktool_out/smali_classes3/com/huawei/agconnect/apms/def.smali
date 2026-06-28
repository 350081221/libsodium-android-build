.class public Lcom/huawei/agconnect/apms/def;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/fgh;
.implements Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateListener;


# static fields
.field public static final jkl:Lcom/huawei/agconnect/apms/log/AgentLog;


# instance fields
.field public final abc:J

.field public final bcd:Landroid/content/Context;

.field public final cde:Lcom/huawei/agconnect/apms/ijk;

.field public final def:Lcom/huawei/agconnect/apms/efg;

.field public efg:Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;

.field public fgh:Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;

.field public ghi:Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;

.field public hij:Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

.field public ijk:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/huawei/agconnect/apms/efg;Lcom/huawei/agconnect/apms/ijk;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/def;->abc:J

    .line 9
    .line 10
    instance-of v0, p1, Landroid/app/Application;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    iput-object v0, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    .line 21
    .line 22
    iput-object p2, p0, Lcom/huawei/agconnect/apms/def;->def:Lcom/huawei/agconnect/apms/efg;

    .line 23
    .line 24
    iput-object p3, p0, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 25
    .line 26
    invoke-static {}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->getInstance()Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p2, p0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->addApplicationStateListener(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateListener;)V

    .line 31
    .line 32
    .line 33
    new-instance p2, Lcom/huawei/agconnect/apms/x0;

    .line 34
    .line 35
    invoke-direct {p2}, Lcom/huawei/agconnect/apms/x0;-><init>()V

    .line 36
    .line 37
    .line 38
    instance-of p3, v0, Landroid/app/Application;

    .line 39
    .line 40
    if-eqz p3, :cond_1

    .line 41
    .line 42
    move-object p3, v0

    .line 43
    check-cast p3, Landroid/app/Application;

    .line 44
    .line 45
    invoke-virtual {p3, p2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {p1, p2}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/huawei/agconnect/apms/def;->hij:Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    goto/16 :goto_2

    .line 56
    .line 57
    :cond_2
    new-instance p1, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    .line 58
    .line 59
    invoke-direct {p1}, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lcom/huawei/agconnect/apms/def;->hij:Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object p2, p0, Lcom/huawei/agconnect/apms/def;->hij:Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    .line 69
    .line 70
    invoke-virtual {p2, p1}, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->setPackageId(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    const/4 p3, 0x0

    .line 78
    :try_start_0
    invoke-virtual {p2, p1, p3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 79
    .line 80
    .line 81
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-lez v1, :cond_3

    .line 93
    .line 94
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 95
    .line 96
    sget-object v2, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 97
    .line 98
    new-instance v3, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v4, "using application version "

    .line 104
    .line 105
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-interface {v2, v3}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-object v3, p0, Lcom/huawei/agconnect/apms/def;->hij:Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    .line 119
    .line 120
    invoke-virtual {v3, v1}, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->setAppVersion(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 124
    .line 125
    new-instance v1, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v3, "using application versionCode "

    .line 131
    .line 132
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-interface {v2, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->hij:Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    .line 146
    .line 147
    invoke-virtual {v1, v0}, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->setVersionCode(I)V

    .line 148
    .line 149
    .line 150
    :try_start_1
    invoke-virtual {p2, p1, p3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    invoke-virtual {p2, p3}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 162
    goto :goto_1

    .line 163
    :catchall_0
    move-exception p2

    .line 164
    sget-object p3, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 165
    .line 166
    const-string v0, "failed to get appName, use packageName instead: "

    .line 167
    .line 168
    invoke-static {v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {p2, v0, p3}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 173
    .line 174
    .line 175
    :goto_1
    sget-object p2, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 176
    .line 177
    new-instance p3, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    const-string v0, "using application name "

    .line 183
    .line 184
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p3

    .line 194
    invoke-interface {p2, p3}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    iget-object p2, p0, Lcom/huawei/agconnect/apms/def;->hij:Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    .line 198
    .line 199
    invoke-virtual {p2, p1}, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->setAppName(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :goto_2
    iget-object p1, p0, Lcom/huawei/agconnect/apms/def;->def:Lcom/huawei/agconnect/apms/efg;

    .line 203
    .line 204
    iget-object p2, p0, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 205
    .line 206
    const-string p3, "apms.disabled_by_user"

    .line 207
    .line 208
    invoke-virtual {p2, p3}, Lcom/huawei/agconnect/apms/ijk;->abc(Ljava/lang/String;)Z

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    iput-boolean p2, p1, Lcom/huawei/agconnect/apms/efg;->abc:Z

    .line 213
    .line 214
    iget-object p1, p0, Lcom/huawei/agconnect/apms/def;->def:Lcom/huawei/agconnect/apms/efg;

    .line 215
    .line 216
    iget-object p2, p0, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 217
    .line 218
    const-string p3, "apms.disabled_android"

    .line 219
    .line 220
    invoke-virtual {p2, p3}, Lcom/huawei/agconnect/apms/ijk;->abc(Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    iput-boolean p2, p1, Lcom/huawei/agconnect/apms/efg;->bcd:Z

    .line 225
    .line 226
    iget-object p1, p0, Lcom/huawei/agconnect/apms/def;->def:Lcom/huawei/agconnect/apms/efg;

    .line 227
    .line 228
    iget-object p2, p0, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 229
    .line 230
    const-string p3, "apms.disabled_android_app_versions"

    .line 231
    .line 232
    invoke-virtual {p2, p3}, Lcom/huawei/agconnect/apms/ijk;->bcd(Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    iput-object p2, p1, Lcom/huawei/agconnect/apms/efg;->cde:Ljava/lang/String;

    .line 237
    .line 238
    iget-object p1, p0, Lcom/huawei/agconnect/apms/def;->def:Lcom/huawei/agconnect/apms/efg;

    .line 239
    .line 240
    iget-object p2, p0, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 241
    .line 242
    const-string p3, "apms.disabled_anr_monitor"

    .line 243
    .line 244
    invoke-virtual {p2, p3}, Lcom/huawei/agconnect/apms/ijk;->abc(Ljava/lang/String;)Z

    .line 245
    .line 246
    .line 247
    move-result p2

    .line 248
    xor-int/lit8 p2, p2, 0x1

    .line 249
    .line 250
    iput-boolean p2, p1, Lcom/huawei/agconnect/apms/efg;->efg:Z

    .line 251
    .line 252
    iget-object p1, p0, Lcom/huawei/agconnect/apms/def;->def:Lcom/huawei/agconnect/apms/efg;

    .line 253
    .line 254
    iget-object p2, p0, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 255
    .line 256
    const-string p3, "apms.cdn_header_name"

    .line 257
    .line 258
    invoke-virtual {p2, p3}, Lcom/huawei/agconnect/apms/ijk;->bcd(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    iput-object p2, p1, Lcom/huawei/agconnect/apms/efg;->def:Ljava/lang/String;

    .line 263
    .line 264
    invoke-static {}, Lcom/huawei/agconnect/apms/r1;->def()Lcom/huawei/agconnect/apms/r1;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    iget-object p2, p0, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 269
    .line 270
    const-string p3, "apms.enable.remote.config"

    .line 271
    .line 272
    invoke-virtual {p2, p3}, Lcom/huawei/agconnect/apms/ijk;->abc(Ljava/lang/String;)Z

    .line 273
    .line 274
    .line 275
    move-result p2

    .line 276
    iput-boolean p2, p1, Lcom/huawei/agconnect/apms/r1;->cde:Z

    .line 277
    .line 278
    invoke-static {}, Lcom/huawei/agconnect/apms/r1;->def()Lcom/huawei/agconnect/apms/r1;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    new-instance p2, Lcom/huawei/agconnect/apms/bcd;

    .line 283
    .line 284
    invoke-direct {p2, p0}, Lcom/huawei/agconnect/apms/bcd;-><init>(Lcom/huawei/agconnect/apms/def;)V

    .line 285
    .line 286
    .line 287
    iput-object p2, p1, Lcom/huawei/agconnect/apms/r1;->def:Lcom/huawei/agconnect/apms/r1$def;

    .line 288
    .line 289
    new-instance p1, Landroid/os/Handler;

    .line 290
    .line 291
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 292
    .line 293
    .line 294
    new-instance p2, Lcom/huawei/agconnect/apms/cde;

    .line 295
    .line 296
    invoke-direct {p2, p0}, Lcom/huawei/agconnect/apms/cde;-><init>(Lcom/huawei/agconnect/apms/def;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 300
    .line 301
    .line 302
    return-void

    .line 303
    :cond_3
    new-instance p1, Lcom/huawei/agconnect/apms/exception/APMSException;

    .line 304
    .line 305
    const-string p2, "the app doesn\'t have a version defined, ensure \'versionName\' has been defined in build.gradle or AndroidManifest.xml."

    .line 306
    .line 307
    invoke-direct {p1, p2}, Lcom/huawei/agconnect/apms/exception/APMSException;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw p1

    .line 311
    :catchall_1
    move-exception p1

    .line 312
    new-instance p2, Lcom/huawei/agconnect/apms/exception/APMSException;

    .line 313
    .line 314
    const-string p3, "could not get package version: "

    .line 315
    .line 316
    invoke-static {p3}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    move-result-object p3

    .line 320
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    invoke-direct {p2, p1}, Lcom/huawei/agconnect/apms/exception/APMSException;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    throw p2
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
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
.end method

.method public static abc(Landroid/content/Context;Lcom/huawei/agconnect/apms/efg;Lcom/huawei/agconnect/apms/ijk;)V
    .locals 4

    .line 2
    :try_start_0
    new-instance v0, Lcom/huawei/agconnect/apms/def;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/agconnect/apms/def;-><init>(Landroid/content/Context;Lcom/huawei/agconnect/apms/efg;Lcom/huawei/agconnect/apms/ijk;)V

    invoke-static {v0}, Lcom/huawei/agconnect/apms/Agent;->setImpl(Lcom/huawei/agconnect/apms/fgh;)V

    .line 3
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 4
    sget-object p0, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string p1, "APMS has been disabled by remote config."

    invoke-interface {p0, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    sget-object p2, Lcom/huawei/agconnect/apms/klm;->def:Lcom/huawei/agconnect/apms/klm;

    .line 6
    invoke-virtual {p2, p0}, Lcom/huawei/agconnect/apms/klm;->abc(Landroid/content/Context;)V

    .line 7
    iget-object v0, p2, Lcom/huawei/agconnect/apms/klm;->bcd:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_2

    goto :goto_0

    .line 9
    :cond_2
    iget-object p2, p2, Lcom/huawei/agconnect/apms/klm;->abc:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/agconnect/apms/klm$abc;

    .line 10
    sget-object v2, Lcom/huawei/agconnect/apms/klm;->fgh:Lcom/huawei/agconnect/apms/pqr;

    .line 11
    invoke-virtual {v2, v0}, Lcom/huawei/agconnect/apms/pqr;->abc(Landroid/content/Context;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v0, v2, v3}, Lcom/huawei/agconnect/apms/klm$abc;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    const-wide/16 v2, 0x7530

    .line 12
    invoke-virtual {p2, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 13
    :goto_0
    invoke-static {}, Lcom/huawei/agconnect/apms/nop;->cde()Lcom/huawei/agconnect/apms/nop;

    move-result-object p2

    .line 14
    iget-boolean v0, p1, Lcom/huawei/agconnect/apms/efg;->efg:Z

    .line 15
    invoke-virtual {p2, v0}, Lcom/huawei/agconnect/apms/nop;->abc(Z)V

    .line 16
    invoke-static {}, Lcom/huawei/agconnect/apms/anr/NativeHandler;->bcd()Lcom/huawei/agconnect/apms/anr/NativeHandler;

    move-result-object p2

    .line 17
    iget-boolean p1, p1, Lcom/huawei/agconnect/apms/efg;->efg:Z

    .line 18
    invoke-static {p0}, Lcom/huawei/agconnect/apms/x1;->abc(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 19
    sget-object v1, Lcom/huawei/agconnect/apms/klm;->fgh:Lcom/huawei/agconnect/apms/pqr;

    .line 20
    invoke-virtual {v1, p0}, Lcom/huawei/agconnect/apms/pqr;->abc(Landroid/content/Context;)Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p1, v0, p0}, Lcom/huawei/agconnect/apms/anr/NativeHandler;->abc(ZLjava/lang/String;Ljava/lang/String;)V

    .line 21
    invoke-static {}, Lcom/huawei/agconnect/apms/v1;->jkl()Lcom/huawei/agconnect/apms/v1;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/v1;->bcd(Z)V

    .line 22
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    .line 23
    sget-object p1, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string p2, "failed to init APMS: "

    invoke-static {p2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public abc()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/def;->abc:J

    return-wide v0
.end method

.method public abc(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/agconnect/apms/def;->ijk:Ljava/lang/String;

    return-void
.end method

.method public abc(Z)V
    .locals 1

    if-eqz p1, :cond_2

    .line 25
    iget-object p1, p0, Lcom/huawei/agconnect/apms/def;->ghi:Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;

    if-nez p1, :cond_0

    goto :goto_1

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    if-nez v0, :cond_1

    const-string v0, ""

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lcom/huawei/agconnect/apms/m1;->abc(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;->setDns(Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public applicationBackgrounded(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateEvent;)V
    .locals 1

    .line 1
    sget-object p1, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 2
    .line 3
    const-string v0, "APMS: application backgrounded."

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/def;->def(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    sget-object p1, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 14
    .line 15
    const-string v0, "failed to stop apms agent"

    .line 16
    .line 17
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public applicationForegrounded(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateEvent;)V
    .locals 1

    .line 1
    sget-object p1, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 2
    .line 3
    const-string v0, "APMS: application foregrounded."

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/def;->cde()V

    .line 9
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public bcd(Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 1
    sget-object v1, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v2, "APMS: enable collection by user."

    invoke-interface {v1, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->def:Lcom/huawei/agconnect/apms/efg;

    .line 3
    iput-boolean v0, v1, Lcom/huawei/agconnect/apms/efg;->abc:Z

    .line 4
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    invoke-virtual {v1, v0}, Lcom/huawei/agconnect/apms/ijk;->abc(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/def;->cde()V

    .line 6
    invoke-static {}, Lcom/huawei/agconnect/apms/e1;->cde()Lcom/huawei/agconnect/apms/e1;

    move-result-object v0

    invoke-static {}, Lcom/huawei/agconnect/apms/v1;->jkl()Lcom/huawei/agconnect/apms/v1;

    move-result-object v1

    .line 7
    iget-object v1, v1, Lcom/huawei/agconnect/apms/v1;->abc:Lcom/huawei/agconnect/apms/util/Session;

    .line 8
    invoke-static {}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->getInstance()Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->isAppInBackground()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/apms/e1;->abc(Lcom/huawei/agconnect/apms/util/Session;Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 9
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/def;->cde()V

    .line 10
    invoke-static {}, Lcom/huawei/agconnect/apms/e1;->cde()Lcom/huawei/agconnect/apms/e1;

    move-result-object v0

    invoke-static {}, Lcom/huawei/agconnect/apms/v1;->jkl()Lcom/huawei/agconnect/apms/v1;

    move-result-object v1

    .line 11
    iget-object v1, v1, Lcom/huawei/agconnect/apms/v1;->abc:Lcom/huawei/agconnect/apms/util/Session;

    .line 12
    invoke-static {}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->getInstance()Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->isAppInBackground()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/apms/e1;->abc(Lcom/huawei/agconnect/apms/util/Session;Z)V

    .line 13
    throw p1

    .line 14
    :cond_0
    sget-object v1, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v2, "APMS: disable collection by user."

    invoke-interface {v1, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 15
    :try_start_1
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->def:Lcom/huawei/agconnect/apms/efg;

    const/4 v2, 0x1

    .line 16
    iput-boolean v2, v1, Lcom/huawei/agconnect/apms/efg;->abc:Z

    .line 17
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    invoke-virtual {v1, v2}, Lcom/huawei/agconnect/apms/ijk;->abc(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 18
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/def;->def(Z)V

    .line 19
    invoke-static {}, Lcom/huawei/agconnect/apms/e1;->cde()Lcom/huawei/agconnect/apms/e1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/e1;->bcd()V

    .line 20
    :goto_0
    invoke-static {}, Lcom/huawei/agconnect/apms/r1;->def()Lcom/huawei/agconnect/apms/r1;

    move-result-object v0

    .line 21
    iput-boolean p1, v0, Lcom/huawei/agconnect/apms/r1;->cde:Z

    .line 22
    iget-object v0, p0, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    const-string v1, "apms.enable.remote.config"

    .line 23
    invoke-virtual {v0, v1, p1}, Lcom/huawei/agconnect/apms/ijk;->abc(Ljava/lang/String;Z)V

    return-void

    :catchall_1
    move-exception p1

    .line 24
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/def;->def(Z)V

    .line 25
    invoke-static {}, Lcom/huawei/agconnect/apms/e1;->cde()Lcom/huawei/agconnect/apms/e1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/e1;->bcd()V

    .line 26
    throw p1
.end method

.method public bcd()Z
    .locals 10

    .line 27
    iget-object v0, p0, Lcom/huawei/agconnect/apms/def;->def:Lcom/huawei/agconnect/apms/efg;

    .line 28
    iget-boolean v1, v0, Lcom/huawei/agconnect/apms/efg;->abc:Z

    .line 29
    iget-boolean v2, v0, Lcom/huawei/agconnect/apms/efg;->bcd:Z

    .line 30
    iget-object v0, v0, Lcom/huawei/agconnect/apms/efg;->cde:Ljava/lang/String;

    .line 31
    iget-object v3, p0, Lcom/huawei/agconnect/apms/def;->hij:Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    invoke-virtual {v3}, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->getAppVersion()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v0, :cond_2

    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_2

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_0

    goto :goto_1

    :cond_0
    const-string v6, "\u0001,"

    .line 33
    invoke-virtual {v0, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 34
    array-length v6, v0

    move v7, v5

    :goto_0
    if-ge v7, v6, :cond_2

    aget-object v8, v0, v7

    .line 35
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    move v0, v4

    goto :goto_2

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    move v0, v5

    :goto_2
    if-nez v1, :cond_4

    if-nez v2, :cond_4

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    move v4, v5

    :cond_4
    :goto_3
    return v4
.end method

.method public cde()V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/def;->bcd()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/def;->mno()V

    .line 3
    sget-object v0, Lcom/huawei/agconnect/apms/uvw;->fgh:Lcom/huawei/agconnect/apms/uvw;

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, v0, Lcom/huawei/agconnect/apms/uvw;->bcd:Lcom/huawei/agconnect/apms/zab;

    if-nez v0, :cond_1

    .line 5
    sget-object v0, Lcom/huawei/agconnect/apms/uvw;->efg:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "the collect timer is null, can not stop timer."

    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/zab;->bcd()V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/def;->def(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 8
    :catchall_0
    sget-object v0, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "failed to start apms agent"

    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public cde(Z)V
    .locals 2

    .line 9
    iget-object v0, p0, Lcom/huawei/agconnect/apms/def;->def:Lcom/huawei/agconnect/apms/efg;

    .line 10
    iput-boolean p1, v0, Lcom/huawei/agconnect/apms/efg;->efg:Z

    .line 11
    iget-object v0, p0, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    xor-int/lit8 p1, p1, 0x1

    const-string v1, "apms.disabled_anr_monitor"

    .line 12
    invoke-virtual {v0, v1, p1}, Lcom/huawei/agconnect/apms/ijk;->abc(Ljava/lang/String;Z)V

    return-void
.end method

.method public def()Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/def;->ghi:Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;

    invoke-direct {v0}, Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;-><init>()V

    .line 3
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v1

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v3}, Ljava/util/TimeZone;->getDisplayName(ZI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;->setTimeZone(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    const-string v2, ""

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    if-nez v1, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 9
    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    .line 10
    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;->setDefaultLanguage(Ljava/lang/String;)V

    goto :goto_1

    .line 13
    :cond_2
    :goto_0
    invoke-virtual {v0, v2}, Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;->setDefaultLanguage(Ljava/lang/String;)V

    .line 14
    :goto_1
    invoke-static {}, Lcom/huawei/agconnect/apms/APMS;->getInstance()Lcom/huawei/agconnect/apms/APMS;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/APMS;->isUserPrivacyAgreed()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 15
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lcom/huawei/agconnect/apms/m1;->abc(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    :goto_2
    invoke-virtual {v0, v2}, Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;->setDns(Ljava/lang/String;)V

    .line 16
    :cond_4
    iput-object v0, p0, Lcom/huawei/agconnect/apms/def;->ghi:Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;

    return-object v0
.end method

.method public final def(Z)V
    .locals 5

    .line 17
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    if-eqz p1, :cond_3

    .line 18
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    if-ne p1, v0, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 19
    sget-object p1, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v0, "collect on main thread."

    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 20
    :cond_1
    invoke-static {}, Lcom/huawei/agconnect/apms/uvw;->cde()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    .line 21
    :cond_2
    sget-object p1, Lcom/huawei/agconnect/apms/uvw;->fgh:Lcom/huawei/agconnect/apms/uvw;

    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/uvw;->abc()V

    .line 22
    sget-object p1, Lcom/huawei/agconnect/apms/uvw;->fgh:Lcom/huawei/agconnect/apms/uvw;

    .line 23
    iget-object p1, p1, Lcom/huawei/agconnect/apms/uvw;->bcd:Lcom/huawei/agconnect/apms/zab;

    .line 24
    iget-object v0, p1, Lcom/huawei/agconnect/apms/zab;->abc:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/huawei/agconnect/apms/zab$abc;

    invoke-direct {v2, p1}, Lcom/huawei/agconnect/apms/zab$abc;-><init>(Lcom/huawei/agconnect/apms/zab;)V

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x0

    invoke-interface {v0, v2, v3, v4, p1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    .line 25
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 26
    sget-object v0, Lcom/huawei/agconnect/apms/zab;->hij:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v2, "exception occurred while executing tick: "

    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1, v2, v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 27
    :cond_3
    :goto_1
    sget-object p1, Lcom/huawei/agconnect/apms/dcb;->def:Ljava/util/concurrent/Future;

    const/4 v0, 0x0

    if-nez p1, :cond_4

    goto :goto_2

    .line 28
    :cond_4
    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 29
    sput-object v0, Lcom/huawei/agconnect/apms/dcb;->def:Ljava/util/concurrent/Future;

    .line 30
    :goto_2
    invoke-static {}, Lcom/huawei/agconnect/apms/uvw;->cde()Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_3

    .line 31
    :cond_5
    invoke-static {}, Lcom/huawei/agconnect/apms/uvw;->efg()V

    .line 32
    sget-object p1, Lcom/huawei/agconnect/apms/uvw;->fgh:Lcom/huawei/agconnect/apms/uvw;

    .line 33
    iget-object v2, p1, Lcom/huawei/agconnect/apms/uvw;->bcd:Lcom/huawei/agconnect/apms/zab;

    if-eqz v2, :cond_6

    .line 34
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/zab;->abc()V

    .line 35
    iget-object v2, v2, Lcom/huawei/agconnect/apms/zab;->abc:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 36
    :cond_6
    iget-object v2, p1, Lcom/huawei/agconnect/apms/uvw;->cde:Lcom/huawei/agconnect/apms/collect/model/CollectData;

    if-eqz v2, :cond_7

    .line 37
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/collect/model/CollectData;->shutDownCollectData()V

    .line 38
    :cond_7
    iput-object v0, p1, Lcom/huawei/agconnect/apms/uvw;->bcd:Lcom/huawei/agconnect/apms/zab;

    .line 39
    iput-object v0, p1, Lcom/huawei/agconnect/apms/uvw;->abc:Lcom/huawei/agconnect/apms/zyx;

    .line 40
    iput-object v0, p1, Lcom/huawei/agconnect/apms/uvw;->cde:Lcom/huawei/agconnect/apms/collect/model/CollectData;

    .line 41
    :goto_3
    sget-object p1, Lcom/huawei/agconnect/apms/yza;->def:Ljava/util/concurrent/Future;

    if-nez p1, :cond_8

    goto :goto_4

    .line 42
    :cond_8
    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 43
    sput-object v0, Lcom/huawei/agconnect/apms/yza;->def:Ljava/util/concurrent/Future;

    :goto_4
    return-void
.end method

.method public efg()Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;
    .locals 5

    .line 1
    new-instance v0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v1}, Lcom/huawei/agconnect/apms/i1;->def(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->setDeviceCharging(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    .line 16
    .line 17
    :try_start_0
    invoke-static {v1}, Lcom/huawei/agconnect/apms/i1;->abc(Landroid/content/Context;)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const-string v2, "level"

    .line 24
    .line 25
    const/4 v3, -0x1

    .line 26
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const-string v4, "scale"

    .line 31
    .line 32
    invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 33
    .line 34
    .line 35
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    int-to-float v2, v2

    .line 37
    int-to-float v1, v1

    .line 38
    div-float/2addr v2, v1

    .line 39
    const/high16 v1, 0x42c80000    # 100.0f

    .line 40
    .line 41
    mul-float/2addr v2, v1

    .line 42
    float-to-int v1, v2

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    sget-object v2, Lcom/huawei/agconnect/apms/i1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 46
    .line 47
    const-string v3, "failed to get device battery percentage: "

    .line 48
    .line 49
    invoke-static {v3}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {v1, v3, v2}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    const/4 v1, 0x0

    .line 57
    :goto_0
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->setBatteryPercentage(I)V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    .line 61
    .line 62
    invoke-static {v1}, Lcom/huawei/agconnect/apms/m1;->cde(Landroid/content/Context;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->setNetworkWanType(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    .line 70
    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eqz v1, :cond_1

    .line 78
    .line 79
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    .line 80
    .line 81
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-eqz v1, :cond_1

    .line 90
    .line 91
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    .line 92
    .line 93
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->setOrientation(I)V

    .line 104
    .line 105
    .line 106
    :cond_1
    invoke-static {}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->getInstance()Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->isAppInBackground()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->setAppBackgrounded(Z)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/def;->ijk()Lcom/huawei/agconnect/apms/util/Session;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->addSession(Lcom/huawei/agconnect/apms/util/Session;)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    .line 125
    .line 126
    if-nez v1, :cond_2

    .line 127
    .line 128
    const-wide/16 v1, 0x0

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_2
    invoke-static {v1}, Lcom/huawei/agconnect/apms/j1;->abc(Landroid/content/Context;)J

    .line 132
    .line 133
    .line 134
    move-result-wide v1

    .line 135
    :goto_1
    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->setMemoryUsage(J)V

    .line 136
    .line 137
    .line 138
    invoke-static {}, Lcom/huawei/agconnect/apms/j1;->abc()J

    .line 139
    .line 140
    .line 141
    move-result-wide v1

    .line 142
    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->setDiskAvailable(J)V

    .line 143
    .line 144
    .line 145
    return-object v0
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

.method public fgh()Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;
    .locals 10

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/huawei/agconnect/apms/def;->fgh:Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    new-instance v1, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;

    .line 9
    .line 10
    const-string v2, ""

    .line 11
    .line 12
    invoke-direct {v1, v2, v2, v2}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v3, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    .line 16
    .line 17
    invoke-static {}, Lcom/huawei/agconnect/AGConnectInstance;->getInstance()Lcom/huawei/agconnect/AGConnectInstance;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    invoke-static {v3}, Lcom/huawei/agconnect/AGConnectInstance;->initialize(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/AGConnectInstance;->getInstance()Lcom/huawei/agconnect/AGConnectInstance;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Lcom/huawei/agconnect/AGConnectInstance;->getOptions()Lcom/huawei/agconnect/AGConnectOptions;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-string v4, "client/app_id"

    .line 35
    .line 36
    invoke-interface {v3, v4}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 40
    :try_start_1
    invoke-static {}, Lcom/huawei/agconnect/AGConnectInstance;->getInstance()Lcom/huawei/agconnect/AGConnectInstance;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4}, Lcom/huawei/agconnect/AGConnectInstance;->getOptions()Lcom/huawei/agconnect/AGConnectOptions;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const-string v5, "client/product_id"

    .line 49
    .line 50
    invoke-interface {v4, v5}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 54
    :try_start_2
    invoke-static {}, Lcom/huawei/agconnect/AGConnectInstance;->getInstance()Lcom/huawei/agconnect/AGConnectInstance;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v5}, Lcom/huawei/agconnect/AGConnectInstance;->getOptions()Lcom/huawei/agconnect/AGConnectOptions;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    const-string v6, "client/cp_id"

    .line 63
    .line 64
    invoke-interface {v5, v6}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    :try_start_3
    invoke-static {}, Lcom/huawei/agconnect/AGConnectInstance;->getInstance()Lcom/huawei/agconnect/AGConnectInstance;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v6}, Lcom/huawei/agconnect/AGConnectInstance;->getOptions()Lcom/huawei/agconnect/AGConnectOptions;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    const-string v7, "client/client_id"

    .line 77
    .line 78
    invoke-interface {v6, v7}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 82
    invoke-virtual {v1, v5}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setCpID(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v4}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setProductID(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v6}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setClientID(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v3}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setAgcAppID(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :catchall_0
    move-exception v6

    .line 96
    goto :goto_1

    .line 97
    :catchall_1
    move-exception v6

    .line 98
    move-object v5, v2

    .line 99
    goto :goto_1

    .line 100
    :catchall_2
    move-exception v6

    .line 101
    move-object v4, v2

    .line 102
    goto :goto_0

    .line 103
    :catchall_3
    move-exception v6

    .line 104
    move-object v3, v2

    .line 105
    move-object v4, v3

    .line 106
    :goto_0
    move-object v5, v4

    .line 107
    :goto_1
    :try_start_4
    sget-object v7, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 108
    .line 109
    new-instance v8, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v9, "failed to get client info from AGConnect: "

    .line 115
    .line 116
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-interface {v7, v6}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v5}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setCpID(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v4}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setProductID(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v2}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setClientID(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v3}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setAgcAppID(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :goto_2
    const-string v3, "Android"

    .line 146
    .line 147
    invoke-virtual {v1, v3}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setOsName(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v1, v3}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setOsVersion(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-static {}, Lcom/huawei/agconnect/apms/i1;->abc()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-virtual {v1, v3}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setRomName(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const-string v3, "android.os.SystemProperties"

    .line 163
    .line 164
    const-string v4, "get"

    .line 165
    .line 166
    const/4 v5, 0x2

    .line 167
    :try_start_5
    new-array v6, v5, [Ljava/lang/Class;

    .line 168
    .line 169
    const/4 v7, 0x0

    .line 170
    aput-object v0, v6, v7

    .line 171
    .line 172
    const/4 v8, 0x1

    .line 173
    aput-object v0, v6, v8

    .line 174
    .line 175
    new-array v0, v5, [Ljava/lang/Object;

    .line 176
    .line 177
    const-string v5, "ro.build.version.emui"

    .line 178
    .line 179
    aput-object v5, v0, v7

    .line 180
    .line 181
    aput-object v2, v0, v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 182
    .line 183
    :try_start_6
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-static {v3, v4, v6, v0}, Lcom/huawei/agconnect/apms/i1;->abc(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 191
    goto :goto_3

    .line 192
    :catchall_4
    move-exception v0

    .line 193
    :try_start_7
    sget-object v3, Lcom/huawei/agconnect/apms/i1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 194
    .line 195
    new-instance v4, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    const-string v5, "failed to get method: "

    .line 201
    .line 202
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-interface {v3, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    const/4 v0, 0x0

    .line 220
    :goto_3
    if-eqz v0, :cond_2

    .line 221
    .line 222
    check-cast v0, Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 223
    .line 224
    move-object v2, v0

    .line 225
    goto :goto_4

    .line 226
    :catchall_5
    move-exception v0

    .line 227
    sget-object v3, Lcom/huawei/agconnect/apms/i1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 228
    .line 229
    const-string v4, "failed to get EMUI version: "

    .line 230
    .line 231
    invoke-static {v4}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-static {v0, v4, v3}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 236
    .line 237
    .line 238
    :cond_2
    :goto_4
    invoke-virtual {v1, v2}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setRomVersion(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    iput-object v1, p0, Lcom/huawei/agconnect/apms/def;->fgh:Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;

    .line 242
    .line 243
    return-object v1

    .line 244
    :catchall_6
    move-exception v0

    .line 245
    invoke-virtual {v1, v5}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setCpID(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, v4}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setProductID(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, v2}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setClientID(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v3}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->setAgcAppID(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw v0
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

.method public ghi()Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/def;->hij:Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    return-object v0
.end method

.method public hij()Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;
    .locals 10

    .line 1
    const-string v0, ":"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const-string v2, "failed to close /proc/cpuinfo file"

    .line 6
    .line 7
    iget-object v3, p0, Lcom/huawei/agconnect/apms/def;->efg:Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    return-object v3

    .line 12
    :cond_0
    :try_start_0
    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 13
    .line 14
    :try_start_1
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 15
    .line 16
    :try_start_2
    const-string v5, "os.arch"

    .line 17
    .line 18
    invoke-static {v5}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception v5

    .line 24
    goto :goto_0

    .line 25
    :catchall_1
    move-exception v5

    .line 26
    move-object v4, v1

    .line 27
    goto :goto_0

    .line 28
    :catchall_2
    move-exception v5

    .line 29
    move-object v3, v1

    .line 30
    move-object v4, v3

    .line 31
    :goto_0
    sget-object v6, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 32
    .line 33
    const-string v7, "failed to get architecture info: "

    .line 34
    .line 35
    invoke-static {v7}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-static {v5, v7, v6}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 40
    .line 41
    .line 42
    move-object v5, v1

    .line 43
    :goto_1
    new-instance v6, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;

    .line 44
    .line 45
    invoke-direct {v6, v3, v5, v4}, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v3, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    .line 49
    .line 50
    invoke-static {v3}, Lcom/huawei/agconnect/apms/i1;->bcd(Landroid/content/Context;)F

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    float-to-double v3, v3

    .line 55
    invoke-virtual {v6, v3, v4}, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->setScreenSize(D)V

    .line 56
    .line 57
    .line 58
    iget-object v3, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    .line 59
    .line 60
    new-instance v4, Landroid/util/DisplayMetrics;

    .line 61
    .line 62
    invoke-direct {v4}, Landroid/util/DisplayMetrics;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {v3}, Lcom/huawei/agconnect/apms/i1;->cde(Landroid/content/Context;)Landroid/view/Display;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-eqz v3, :cond_1

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 72
    .line 73
    .line 74
    new-instance v3, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    iget v5, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 80
    .line 81
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v5, "x"

    .line 85
    .line 86
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 90
    .line 91
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-static {v3}, Lcom/huawei/agconnect/apms/i1;->abc(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    goto :goto_2

    .line 103
    :cond_1
    invoke-static {v1}, Lcom/huawei/agconnect/apms/i1;->abc(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    :goto_2
    invoke-virtual {v6, v3}, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->setResolution(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object v3, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    .line 111
    .line 112
    invoke-static {v3}, Lcom/huawei/agconnect/apms/i1;->cde(Landroid/content/Context;)Landroid/view/Display;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    if-nez v3, :cond_2

    .line 117
    .line 118
    const/4 v3, 0x0

    .line 119
    goto :goto_3

    .line 120
    :cond_2
    invoke-virtual {v3}, Landroid/view/Display;->getRefreshRate()F

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    :goto_3
    float-to-double v3, v3

    .line 125
    invoke-virtual {v6, v3, v4}, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->setRefreshRate(D)V

    .line 126
    .line 127
    .line 128
    iget-object v3, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    .line 129
    .line 130
    const/4 v4, 0x1

    .line 131
    if-eqz v3, :cond_7

    .line 132
    .line 133
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    if-eqz v5, :cond_7

    .line 138
    .line 139
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    if-nez v5, :cond_3

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_3
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    iget v3, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 159
    .line 160
    and-int/lit8 v3, v3, 0xf

    .line 161
    .line 162
    if-eq v3, v4, :cond_6

    .line 163
    .line 164
    const/4 v5, 0x2

    .line 165
    if-eq v3, v5, :cond_5

    .line 166
    .line 167
    const/4 v5, 0x3

    .line 168
    if-eq v3, v5, :cond_4

    .line 169
    .line 170
    if-le v3, v5, :cond_7

    .line 171
    .line 172
    const-string v3, "xlarge"

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_4
    const-string v3, "large"

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_5
    const-string v3, "normal"

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_6
    const-string v3, "small"

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_7
    :goto_4
    const-string v3, "unknown"

    .line 185
    .line 186
    :goto_5
    invoke-virtual {v6, v3}, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->setScreenType(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-static {}, Lcom/huawei/agconnect/apms/j1;->bcd()I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    invoke-virtual {v6, v3}, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->setCpuCores(I)V

    .line 194
    .line 195
    .line 196
    const-string v3, "/proc/cpuinfo"

    .line 197
    .line 198
    const/4 v5, 0x0

    .line 199
    :try_start_3
    new-instance v7, Ljava/io/FileReader;

    .line 200
    .line 201
    invoke-direct {v7, v3}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 202
    .line 203
    .line 204
    :try_start_4
    new-instance v3, Ljava/io/BufferedReader;

    .line 205
    .line 206
    invoke-direct {v3, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 207
    .line 208
    .line 209
    :cond_8
    :try_start_5
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    if-eqz v8, :cond_9

    .line 214
    .line 215
    const-string v9, "Hardware"

    .line 216
    .line 217
    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 218
    .line 219
    .line 220
    move-result v9

    .line 221
    if-eqz v9, :cond_8

    .line 222
    .line 223
    invoke-virtual {v8, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    array-length v9, v9

    .line 228
    if-le v9, v4, :cond_8

    .line 229
    .line 230
    invoke-virtual {v8, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    aget-object v1, v0, v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 235
    .line 236
    :try_start_6
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    .line 237
    .line 238
    .line 239
    goto :goto_6

    .line 240
    :catch_0
    sget-object v0, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 241
    .line 242
    invoke-interface {v0, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    :goto_6
    :try_start_7
    invoke-virtual {v7}, Ljava/io/Reader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    .line 246
    .line 247
    .line 248
    goto :goto_a

    .line 249
    :catch_1
    sget-object v0, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 250
    .line 251
    invoke-interface {v0, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    goto :goto_a

    .line 255
    :cond_9
    :try_start_8
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    .line 256
    .line 257
    .line 258
    goto :goto_9

    .line 259
    :catch_2
    sget-object v0, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 260
    .line 261
    invoke-interface {v0, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    goto :goto_9

    .line 265
    :catchall_3
    move-exception v0

    .line 266
    goto :goto_7

    .line 267
    :catchall_4
    move-exception v0

    .line 268
    move-object v3, v5

    .line 269
    goto :goto_7

    .line 270
    :catchall_5
    move-exception v0

    .line 271
    move-object v3, v5

    .line 272
    move-object v7, v3

    .line 273
    :goto_7
    :try_start_9
    sget-object v4, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 274
    .line 275
    new-instance v8, Ljava/lang/StringBuilder;

    .line 276
    .line 277
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 278
    .line 279
    .line 280
    const-string v9, "failed to open /proc/cpuinfo file: "

    .line 281
    .line 282
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-interface {v4, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 297
    .line 298
    .line 299
    if-eqz v3, :cond_a

    .line 300
    .line 301
    :try_start_a
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3

    .line 302
    .line 303
    .line 304
    goto :goto_8

    .line 305
    :catch_3
    sget-object v0, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 306
    .line 307
    invoke-interface {v0, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    :cond_a
    :goto_8
    if-eqz v7, :cond_b

    .line 311
    .line 312
    :goto_9
    :try_start_b
    invoke-virtual {v7}, Ljava/io/Reader;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_4

    .line 313
    .line 314
    .line 315
    goto :goto_a

    .line 316
    :catch_4
    sget-object v0, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 317
    .line 318
    invoke-interface {v0, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    :cond_b
    :goto_a
    invoke-virtual {v6, v1}, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->setCpuModel(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    iget-object v0, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    .line 325
    .line 326
    const-wide/16 v1, -0x1

    .line 327
    .line 328
    :try_start_c
    new-instance v3, Landroid/app/ActivityManager$MemoryInfo;

    .line 329
    .line 330
    invoke-direct {v3}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 331
    .line 332
    .line 333
    :try_start_d
    const-string v4, "activity"

    .line 334
    .line 335
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    check-cast v0, Landroid/app/ActivityManager;

    .line 340
    .line 341
    if-nez v0, :cond_c

    .line 342
    .line 343
    goto :goto_d

    .line 344
    :cond_c
    invoke-virtual {v0, v3}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 345
    .line 346
    .line 347
    goto :goto_c

    .line 348
    :catchall_6
    move-exception v0

    .line 349
    move-object v5, v3

    .line 350
    goto :goto_b

    .line 351
    :catchall_7
    move-exception v0

    .line 352
    :goto_b
    sget-object v3, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 353
    .line 354
    const-string v4, "failed to get memory info: "

    .line 355
    .line 356
    invoke-static {v4}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    invoke-static {v0, v4, v3}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 361
    .line 362
    .line 363
    move-object v3, v5

    .line 364
    :goto_c
    if-eqz v3, :cond_d

    .line 365
    .line 366
    iget-wide v3, v3, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    .line 367
    .line 368
    goto :goto_e

    .line 369
    :cond_d
    :goto_d
    move-wide v3, v1

    .line 370
    :goto_e
    invoke-virtual {v6, v3, v4}, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->setRamMemory(J)V

    .line 371
    .line 372
    .line 373
    :try_start_e
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    new-instance v3, Landroid/os/StatFs;

    .line 378
    .line 379
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-direct {v3, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockSize()I

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    int-to-long v4, v0

    .line 391
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockCount()I

    .line 392
    .line 393
    .line 394
    move-result v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 395
    int-to-long v0, v0

    .line 396
    mul-long v1, v0, v4

    .line 397
    .line 398
    :catchall_8
    invoke-virtual {v6, v1, v2}, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->setDiskSize(J)V

    .line 399
    .line 400
    .line 401
    iput-object v6, p0, Lcom/huawei/agconnect/apms/def;->efg:Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;

    .line 402
    .line 403
    return-object v6

    .line 404
    :catchall_9
    move-exception v0

    .line 405
    if-eqz v3, :cond_e

    .line 406
    .line 407
    :try_start_f
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_5

    .line 408
    .line 409
    .line 410
    goto :goto_f

    .line 411
    :catch_5
    sget-object v1, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 412
    .line 413
    invoke-interface {v1, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    :cond_e
    :goto_f
    if-eqz v7, :cond_f

    .line 417
    .line 418
    :try_start_10
    invoke-virtual {v7}, Ljava/io/Reader;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_6

    .line 419
    .line 420
    .line 421
    goto :goto_10

    .line 422
    :catch_6
    sget-object v1, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 423
    .line 424
    invoke-interface {v1, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    :cond_f
    :goto_10
    throw v0
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

.method public ijk()Lcom/huawei/agconnect/apms/util/Session;
    .locals 1

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/v1;->jkl()Lcom/huawei/agconnect/apms/v1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/huawei/agconnect/apms/v1;->abc:Lcom/huawei/agconnect/apms/util/Session;

    .line 6
    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
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

.method public jkl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/def;->ijk:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/def;->ijk:Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
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

.method public klm()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/def;->bcd:Landroid/content/Context;

    return-object v0
.end method

.method public lmn()Lcom/huawei/agconnect/apms/efg;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/def;->def:Lcom/huawei/agconnect/apms/efg;

    return-object v0
.end method

.method public final mno()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/huawei/agconnect/apms/uvw;->abc(Lcom/huawei/agconnect/apms/xyz;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/huawei/agconnect/apms/v1;->jkl()Lcom/huawei/agconnect/apms/v1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lcom/huawei/agconnect/apms/uvw;->abc(Lcom/huawei/agconnect/apms/xyz;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/huawei/agconnect/apms/def;->def:Lcom/huawei/agconnect/apms/efg;

    .line 14
    .line 15
    sget-object v1, Lcom/huawei/agconnect/apms/uvw;->fgh:Lcom/huawei/agconnect/apms/uvw;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v2, v1, Lcom/huawei/agconnect/apms/uvw;->cde:Lcom/huawei/agconnect/apms/collect/model/CollectData;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    new-instance v2, Lcom/huawei/agconnect/apms/collect/model/CollectData;

    .line 25
    .line 26
    invoke-direct {v2}, Lcom/huawei/agconnect/apms/collect/model/CollectData;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v2, v1, Lcom/huawei/agconnect/apms/uvw;->cde:Lcom/huawei/agconnect/apms/collect/model/CollectData;

    .line 30
    .line 31
    :cond_1
    iget-object v2, v1, Lcom/huawei/agconnect/apms/uvw;->abc:Lcom/huawei/agconnect/apms/zyx;

    .line 32
    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    new-instance v2, Lcom/huawei/agconnect/apms/zyx;

    .line 36
    .line 37
    invoke-direct {v2}, Lcom/huawei/agconnect/apms/zyx;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v2, v1, Lcom/huawei/agconnect/apms/uvw;->abc:Lcom/huawei/agconnect/apms/zyx;

    .line 41
    .line 42
    iget-object v3, v1, Lcom/huawei/agconnect/apms/uvw;->cde:Lcom/huawei/agconnect/apms/collect/model/CollectData;

    .line 43
    .line 44
    iput-object v3, v2, Lcom/huawei/agconnect/apms/zyx;->efg:Lcom/huawei/agconnect/apms/collect/model/CollectData;

    .line 45
    .line 46
    :cond_2
    iget-object v2, v1, Lcom/huawei/agconnect/apms/uvw;->bcd:Lcom/huawei/agconnect/apms/zab;

    .line 47
    .line 48
    if-nez v2, :cond_3

    .line 49
    .line 50
    new-instance v2, Lcom/huawei/agconnect/apms/zab;

    .line 51
    .line 52
    iget-object v3, v1, Lcom/huawei/agconnect/apms/uvw;->abc:Lcom/huawei/agconnect/apms/zyx;

    .line 53
    .line 54
    invoke-direct {v2, v3}, Lcom/huawei/agconnect/apms/zab;-><init>(Lcom/huawei/agconnect/apms/zyx;)V

    .line 55
    .line 56
    .line 57
    iput-object v2, v1, Lcom/huawei/agconnect/apms/uvw;->bcd:Lcom/huawei/agconnect/apms/zab;

    .line 58
    .line 59
    :cond_3
    iget-object v1, v1, Lcom/huawei/agconnect/apms/uvw;->abc:Lcom/huawei/agconnect/apms/zyx;

    .line 60
    .line 61
    iput-object v0, v1, Lcom/huawei/agconnect/apms/zyx;->cde:Lcom/huawei/agconnect/apms/efg;

    .line 62
    .line 63
    sget-object v0, Lcom/huawei/agconnect/apms/uvw;->fgh:Lcom/huawei/agconnect/apms/uvw;

    .line 64
    .line 65
    iget-object v0, v0, Lcom/huawei/agconnect/apms/uvw;->def:Lcom/huawei/agconnect/apms/wxy;

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Lcom/huawei/agconnect/apms/zyx;->abc(Lcom/huawei/agconnect/apms/wxy;)V

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lcom/huawei/agconnect/apms/uvw;->def()V

    .line 71
    .line 72
    .line 73
    :goto_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 74
    .line 75
    iget-object v0, v0, Lcom/huawei/agconnect/apms/ijk;->abc:Lcom/huawei/agconnect/apms/wxy;

    .line 76
    .line 77
    invoke-static {v0}, Lcom/huawei/agconnect/apms/uvw;->abc(Lcom/huawei/agconnect/apms/wxy;)V

    .line 78
    .line 79
    .line 80
    sget-object v0, Lcom/huawei/agconnect/apms/yza;->def:Ljava/util/concurrent/Future;

    .line 81
    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    sget-object v1, Lcom/huawei/agconnect/apms/yza;->bcd:Ljava/util/concurrent/ScheduledExecutorService;

    .line 86
    .line 87
    sget-object v2, Lcom/huawei/agconnect/apms/yza;->efg:Ljava/lang/Runnable;

    .line 88
    .line 89
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 90
    .line 91
    const-wide/16 v3, 0x0

    .line 92
    .line 93
    const-wide/16 v5, 0x3e8

    .line 94
    .line 95
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sput-object v0, Lcom/huawei/agconnect/apms/yza;->def:Ljava/util/concurrent/Future;

    .line 100
    .line 101
    :goto_1
    sget-object v0, Lcom/huawei/agconnect/apms/dcb;->def:Ljava/util/concurrent/Future;

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    sget-object v1, Lcom/huawei/agconnect/apms/dcb;->bcd:Ljava/util/concurrent/ScheduledExecutorService;

    .line 107
    .line 108
    sget-object v2, Lcom/huawei/agconnect/apms/dcb;->efg:Ljava/lang/Runnable;

    .line 109
    .line 110
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 111
    .line 112
    const-wide/16 v3, 0x0

    .line 113
    .line 114
    const-wide/16 v5, 0x3e8

    .line 115
    .line 116
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sput-object v0, Lcom/huawei/agconnect/apms/dcb;->def:Ljava/util/concurrent/Future;

    .line 121
    .line 122
    :goto_2
    sget-object v0, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 123
    .line 124
    const-string v1, "APMS v"

    .line 125
    .line 126
    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getVersion()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

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
