.class public Lcom/lody/virtual/oem/OemPermissionHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static EMUI_AUTO_START_COMPONENTS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/ComponentName;",
            ">;"
        }
    .end annotation
.end field

.field private static FLYME_AUTO_START_COMPONENTS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/ComponentName;",
            ">;"
        }
    .end annotation
.end field

.field private static VIVO_AUTO_START_COMPONENTS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/ComponentName;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [Landroid/content/ComponentName;

    .line 3
    .line 4
    new-instance v2, Landroid/content/ComponentName;

    .line 5
    .line 6
    const-string v3, "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity"

    .line 7
    .line 8
    const-string v4, "com.huawei.systemmanager"

    .line 9
    .line 10
    invoke-direct {v2, v4, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aput-object v2, v1, v3

    .line 15
    .line 16
    new-instance v2, Landroid/content/ComponentName;

    .line 17
    .line 18
    const-string v5, "com.huawei.systemmanager.optimize.bootstart.BootStartActivity"

    .line 19
    .line 20
    invoke-direct {v2, v4, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    aput-object v2, v1, v5

    .line 25
    .line 26
    new-instance v2, Landroid/content/ComponentName;

    .line 27
    .line 28
    const-string v6, "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity"

    .line 29
    .line 30
    invoke-direct {v2, v4, v6}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v6, 0x2

    .line 34
    aput-object v2, v1, v6

    .line 35
    .line 36
    new-instance v2, Landroid/content/ComponentName;

    .line 37
    .line 38
    const-string v7, "com.huawei.systemmanager.startupmgr.ui.StartupAwakedAppListActivity"

    .line 39
    .line 40
    invoke-direct {v2, v4, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 v4, 0x3

    .line 44
    aput-object v2, v1, v4

    .line 45
    .line 46
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    sput-object v1, Lcom/lody/virtual/oem/OemPermissionHelper;->EMUI_AUTO_START_COMPONENTS:Ljava/util/List;

    .line 51
    .line 52
    new-array v1, v6, [Landroid/content/ComponentName;

    .line 53
    .line 54
    new-instance v2, Landroid/content/ComponentName;

    .line 55
    .line 56
    const-string v7, "com.meizu.safe.permission.SmartBGActivity"

    .line 57
    .line 58
    const-string v8, "com.meizu.safe"

    .line 59
    .line 60
    invoke-direct {v2, v8, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    aput-object v2, v1, v3

    .line 64
    .line 65
    new-instance v2, Landroid/content/ComponentName;

    .line 66
    .line 67
    const-string v7, "com.meizu.safe.security.HomeActivity"

    .line 68
    .line 69
    invoke-direct {v2, v8, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    aput-object v2, v1, v5

    .line 73
    .line 74
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    sput-object v1, Lcom/lody/virtual/oem/OemPermissionHelper;->FLYME_AUTO_START_COMPONENTS:Ljava/util/List;

    .line 79
    .line 80
    new-array v0, v0, [Landroid/content/ComponentName;

    .line 81
    .line 82
    new-instance v1, Landroid/content/ComponentName;

    .line 83
    .line 84
    const-string v2, "com.iqoo.secure"

    .line 85
    .line 86
    const-string v7, "com.iqoo.secure.ui.phoneoptimize.BgStartUpManager"

    .line 87
    .line 88
    invoke-direct {v1, v2, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    aput-object v1, v0, v3

    .line 92
    .line 93
    new-instance v1, Landroid/content/ComponentName;

    .line 94
    .line 95
    const-string v2, "com.vivo.permissionmanager.activity.PurviewTabActivity"

    .line 96
    .line 97
    const-string v3, "com.vivo.permissionmanager"

    .line 98
    .line 99
    invoke-direct {v1, v3, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    aput-object v1, v0, v5

    .line 103
    .line 104
    new-instance v1, Landroid/content/ComponentName;

    .line 105
    .line 106
    const-string v2, "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"

    .line 107
    .line 108
    invoke-direct {v1, v3, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    aput-object v1, v0, v6

    .line 112
    .line 113
    new-instance v1, Landroid/content/ComponentName;

    .line 114
    .line 115
    const-string v2, "com.vivo.permissionmanager.activity.PurviewActivity"

    .line 116
    .line 117
    invoke-direct {v1, v3, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    aput-object v1, v0, v4

    .line 121
    .line 122
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sput-object v0, Lcom/lody/virtual/oem/OemPermissionHelper;->VIVO_AUTO_START_COMPONENTS:Ljava/util/List;

    .line 127
    .line 128
    return-void
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getPermissionActivityIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 4

    .line 1
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->getROMType()Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/lody/virtual/oem/OemPermissionHelper$1;->$SwitchMap$com$lody$virtual$helper$compat$BuildCompat$ROMType:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/high16 v1, 0x10000000

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    new-instance p0, Landroid/content/Intent;

    .line 19
    .line 20
    invoke-direct {p0}, Landroid/content/Intent;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    const-string v0, "com.android.settings"

    .line 27
    .line 28
    const-string v1, "com.android.settings.Settings"

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    new-instance v0, Landroid/content/Intent;

    .line 35
    .line 36
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    const-string v1, "com.qihoo360.mobilesafe"

    .line 43
    .line 44
    const-string v2, "com.qihoo360.mobilesafe.ui.index.AppEnterActivity"

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 47
    .line 48
    .line 49
    invoke-static {p0, v0}, Lcom/lody/virtual/oem/OemPermissionHelper;->verifyIntent(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_3

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_1
    sget-object v0, Lcom/lody/virtual/oem/OemPermissionHelper;->VIVO_AUTO_START_COMPONENTS:Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Landroid/content/ComponentName;

    .line 73
    .line 74
    new-instance v3, Landroid/content/Intent;

    .line 75
    .line 76
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 83
    .line 84
    .line 85
    invoke-static {p0, v3}, Lcom/lody/virtual/oem/OemPermissionHelper;->verifyIntent(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_0

    .line 90
    .line 91
    return-object v3

    .line 92
    :pswitch_2
    new-instance v0, Landroid/content/Intent;

    .line 93
    .line 94
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 98
    .line 99
    .line 100
    const-string v1, "com.letv.android.letvsafe"

    .line 101
    .line 102
    const-string v2, "com.letv.android.letvsafe.AutobootManageActivity"

    .line 103
    .line 104
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 105
    .line 106
    .line 107
    invoke-static {p0, v0}, Lcom/lody/virtual/oem/OemPermissionHelper;->verifyIntent(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-eqz p0, :cond_3

    .line 112
    .line 113
    return-object v0

    .line 114
    :pswitch_3
    new-instance v0, Landroid/content/Intent;

    .line 115
    .line 116
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 120
    .line 121
    .line 122
    const-string v1, "com.coloros.safecenter"

    .line 123
    .line 124
    const-string v2, "com.coloros.safecenter.startupapp.StartupAppListActivity"

    .line 125
    .line 126
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 127
    .line 128
    .line 129
    invoke-static {p0, v0}, Lcom/lody/virtual/oem/OemPermissionHelper;->verifyIntent(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-eqz p0, :cond_3

    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_4
    sget-object v0, Lcom/lody/virtual/oem/OemPermissionHelper;->FLYME_AUTO_START_COMPONENTS:Ljava/util/List;

    .line 137
    .line 138
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_3

    .line 147
    .line 148
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    check-cast v2, Landroid/content/ComponentName;

    .line 153
    .line 154
    new-instance v3, Landroid/content/Intent;

    .line 155
    .line 156
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 163
    .line 164
    .line 165
    invoke-static {p0, v3}, Lcom/lody/virtual/oem/OemPermissionHelper;->verifyIntent(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_1

    .line 170
    .line 171
    return-object v3

    .line 172
    :pswitch_5
    new-instance v0, Landroid/content/Intent;

    .line 173
    .line 174
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 178
    .line 179
    .line 180
    const-string v1, "com.miui.securitycenter"

    .line 181
    .line 182
    const-string v2, "com.miui.permcenter.autostart.AutoStartManagementActivity"

    .line 183
    .line 184
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 185
    .line 186
    .line 187
    invoke-static {p0, v0}, Lcom/lody/virtual/oem/OemPermissionHelper;->verifyIntent(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 188
    .line 189
    .line 190
    move-result p0

    .line 191
    if-eqz p0, :cond_3

    .line 192
    .line 193
    return-object v0

    .line 194
    :pswitch_6
    sget-object v0, Lcom/lody/virtual/oem/OemPermissionHelper;->EMUI_AUTO_START_COMPONENTS:Ljava/util/List;

    .line 195
    .line 196
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_3

    .line 205
    .line 206
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    check-cast v2, Landroid/content/ComponentName;

    .line 211
    .line 212
    new-instance v3, Landroid/content/Intent;

    .line 213
    .line 214
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 221
    .line 222
    .line 223
    invoke-static {p0, v3}, Lcom/lody/virtual/oem/OemPermissionHelper;->verifyIntent(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-eqz v2, :cond_2

    .line 228
    .line 229
    return-object v3

    .line 230
    :cond_3
    const/4 p0, 0x0

    .line 231
    return-object p0

    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method private static verifyIntent(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget-boolean p0, p0, Landroid/content/pm/ActivityInfo;->exported:Z

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    :cond_0
    return v0
    .line 22
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
