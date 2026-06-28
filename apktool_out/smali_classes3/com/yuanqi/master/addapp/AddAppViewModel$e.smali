.class public final Lcom/yuanqi/master/addapp/AddAppViewModel$e;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/AddAppViewModel;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/util/List<",
        "+",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00030\u0001j\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0003`\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "com/yuanqi/master/addapp/AddAppViewModel$hashMap$1",
        "Ljava/util/HashMap;",
        "",
        "",
        "Lkotlin/collections/HashMap;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method constructor <init>()V
    .locals 15

    .line 1
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "com.miui.securitycenter/com.miui.permcenter.autostart.AutoStartManagementActivity"

    .line 5
    .line 6
    const-string v1, "com.miui.securitycenter"

    .line 7
    .line 8
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "Xiaomi"

    .line 17
    .line 18
    invoke-virtual {p0, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const-string v2, "com.samsung.android.sm_cn/com.samsung.android.sm.ui.ram.AutoRunActivity"

    .line 22
    .line 23
    const-string v3, "com.samsung.android.sm_cn/com.samsung.android.sm.ui.appmanagement.AppManagementActivity"

    .line 24
    .line 25
    const-string v4, "com.samsung.android.sm_cn/com.samsung.android.sm.ui.cstyleboard.SmartManagerDashBoardActivity"

    .line 26
    .line 27
    const-string v5, "com.samsung.android.sm_cn/.ui.ram.RamActivity"

    .line 28
    .line 29
    const-string v6, "com.samsung.android.sm_cn/.app.dashboard.SmartManagerDashBoardActivity"

    .line 30
    .line 31
    const-string v7, "com.samsung.android.sm/com.samsung.android.sm.ui.ram.AutoRunActivity"

    .line 32
    .line 33
    const-string v8, "com.samsung.android.sm/com.samsung.android.sm.ui.appmanagement.AppManagementActivity"

    .line 34
    .line 35
    const-string v9, "com.samsung.android.sm/com.samsung.android.sm.ui.cstyleboard.SmartManagerDashBoardActivity"

    .line 36
    .line 37
    const-string v10, "com.samsung.android.sm/.ui.ram.RamActivity"

    .line 38
    .line 39
    const-string v11, "com.samsung.android.sm/.app.dashboard.SmartManagerDashBoardActivity"

    .line 40
    .line 41
    const-string v12, "com.samsung.android.lool/com.samsung.android.sm.ui.battery.BatteryActivity"

    .line 42
    .line 43
    const-string v13, "com.samsung.android.sm_cn"

    .line 44
    .line 45
    const-string v14, "com.samsung.android.sm"

    .line 46
    .line 47
    filled-new-array/range {v2 .. v14}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "samsung"

    .line 56
    .line 57
    invoke-virtual {p0, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    const-string v0, "com.huawei.systemmanager/.optimize.bootstart.BootStartActivity"

    .line 61
    .line 62
    const-string v1, "com.huawei.systemmanager"

    .line 63
    .line 64
    const-string v2, "com.huawei.systemmanager/.startupmgr.ui.StartupNormalAppListActivity"

    .line 65
    .line 66
    const-string v3, "com.huawei.systemmanager/.appcontrol.activity.StartupAppControlActivity"

    .line 67
    .line 68
    const-string v4, "com.huawei.systemmanager/.optimize.process.ProtectActivity"

    .line 69
    .line 70
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v1, "HUAWEI"

    .line 79
    .line 80
    invoke-virtual {p0, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    const-string v0, "com.iqoo.secure"

    .line 84
    .line 85
    const-string v1, "com.vivo.permissionmanager"

    .line 86
    .line 87
    const-string v2, "com.iqoo.secure/.ui.phoneoptimize.BgStartUpManager"

    .line 88
    .line 89
    const-string v3, "com.iqoo.secure/.safeguard.PurviewTabActivity"

    .line 90
    .line 91
    const-string v4, "com.vivo.permissionmanager/.activity.BgStartUpManagerActivity"

    .line 92
    .line 93
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const-string v1, "vivo"

    .line 102
    .line 103
    invoke-virtual {p0, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    const-string v0, "com.meizu.safe/.permission.PermissionMainActivity"

    .line 107
    .line 108
    const-string v1, "com.meizu.safe"

    .line 109
    .line 110
    const-string v2, "com.meizu.safe/.permission.SmartBGActivity"

    .line 111
    .line 112
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const-string v1, "Meizu"

    .line 121
    .line 122
    invoke-virtual {p0, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    const-string v2, "com.coloros.safecenter/.startupapp.StartupAppListActivity"

    .line 126
    .line 127
    const-string v3, "com.coloros.safecenter/.permission.startup.StartupAppListActivity"

    .line 128
    .line 129
    const-string v4, "com.oppo.safe/.permission.startup.StartupAppListActivity"

    .line 130
    .line 131
    const-string v5, "com.coloros.oppoguardelf/com.coloros.powermanager.fuelgaue.PowerUsageModelActivity"

    .line 132
    .line 133
    const-string v6, "com.coloros.safecenter/com.coloros.privacypermissionsentry.PermissionTopActivity"

    .line 134
    .line 135
    const-string v7, "com.coloros.safecenter"

    .line 136
    .line 137
    const-string v8, "com.oppo.safe"

    .line 138
    .line 139
    const-string v9, "com.coloros.oppoguardelf"

    .line 140
    .line 141
    filled-new-array/range {v2 .. v9}, [Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {v0}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    const-string v1, "OPPO"

    .line 150
    .line 151
    invoke-virtual {p0, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    const-string v0, "com.oneplus.security/.chainlaunch.view.ChainLaunchAppListActivity"

    .line 155
    .line 156
    const-string v1, "com.oneplus.security"

    .line 157
    .line 158
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-static {v0}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    const-string v1, "oneplus"

    .line 167
    .line 168
    invoke-virtual {p0, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    const-string v0, "com.letv.android.letvsafe/.BackgroundAppManageActivity"

    .line 172
    .line 173
    const-string v1, "com.letv.android.letvsafe"

    .line 174
    .line 175
    const-string v2, "com.letv.android.letvsafe/.AutobootManageActivity"

    .line 176
    .line 177
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v0}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    const-string v1, "letv"

    .line 186
    .line 187
    invoke-virtual {p0, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    const-string v0, "com.zte.heartyservice/.autorun.AppAutoRunManager"

    .line 191
    .line 192
    const-string v1, "com.zte.heartyservice"

    .line 193
    .line 194
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v0}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    const-string v1, "zte"

    .line 203
    .line 204
    invoke-virtual {p0, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    const-string v0, "com.gionee.softmanager/.MainActivity"

    .line 208
    .line 209
    const-string v1, "com.gionee.softmanager"

    .line 210
    .line 211
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v0}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    const-string v1, "F"

    .line 220
    .line 221
    invoke-virtual {p0, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    const-string v0, "com.smartisanos.security/.invokeHistory.InvokeHistoryActivity"

    .line 225
    .line 226
    const-string v1, "com.smartisanos.security"

    .line 227
    .line 228
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-static {v0}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    const-string v1, "smartisanos"

    .line 237
    .line 238
    invoke-virtual {p0, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    const-string v0, "com.yulong.android.coolsafe/.ui.activity.autorun.AutoRunListActivity"

    .line 242
    .line 243
    const-string v1, "com.yulong.android.coolsafe"

    .line 244
    .line 245
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-static {v2}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    const-string v3, "360"

    .line 254
    .line 255
    invoke-virtual {p0, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-static {v0}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    const-string v1, "ulong"

    .line 267
    .line 268
    invoke-virtual {p0, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    const-string v0, "com.yulong.android.security/com.yulong.android.seccenter.tabbarmain"

    .line 272
    .line 273
    const-string v1, "com.yulong.android.security"

    .line 274
    .line 275
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-static {v2}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    const-string v3, "coolpad"

    .line 284
    .line 285
    invoke-virtual {p0, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    const-string v2, "com.lenovo.security/.purebackground.PureBackgroundActivity"

    .line 289
    .line 290
    const-string v3, "com.lenovo.security"

    .line 291
    .line 292
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    invoke-static {v2}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    const-string v3, "lenovo"

    .line 301
    .line 302
    invoke-virtual {p0, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    const-string v2, "com.htc.pitroad/.landingpage.activity.LandingPageActivity"

    .line 306
    .line 307
    const-string v3, "com.htc.pitroad"

    .line 308
    .line 309
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-static {v2}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    const-string v3, "htc"

    .line 318
    .line 319
    invoke-virtual {p0, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    const-string v2, "com.asus.mobilemanager/.MainActivity"

    .line 323
    .line 324
    const-string v3, "com.asus.mobilemanager"

    .line 325
    .line 326
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-static {v2}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    const-string v3, "asus"

    .line 335
    .line 336
    invoke-virtual {p0, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    const-string v2, "com.yulong.android.softmanager/.SpeedupActivity"

    .line 340
    .line 341
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {v0}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    const-string v1, "YuLong"

    .line 350
    .line 351
    invoke-virtual {p0, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    const-string v0, "com.hihonor.systemmanager/com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity"

    .line 355
    .line 356
    const-string v1, "com.hihonor.systemmanager"

    .line 357
    .line 358
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-static {v0}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    const-string v1, "HONOR"

    .line 367
    .line 368
    invoke-virtual {p0, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    return-void
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


# virtual methods
.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/addapp/AddAppViewModel$e;->containsKey(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public bridge containsKey(Ljava/lang/String;)Z
    .locals 0

    .line 2
    invoke-super {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/util/List;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/addapp/AddAppViewModel$e;->containsValue(Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public bridge containsValue(Ljava/util/List;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 2
    invoke-super {p0, p1}, Ljava/util/HashMap;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/AddAppViewModel$e;->getEntries()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/addapp/AddAppViewModel$e;->get(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final bridge get(Ljava/lang/Object;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 2
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/addapp/AddAppViewModel$e;->get(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge get(Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 3
    invoke-super {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public bridge getEntries()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation

    invoke-super {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge getKeys()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/addapp/AddAppViewModel$e;->getOrDefault(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final bridge getOrDefault(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 2
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/addapp/AddAppViewModel$e;->getOrDefault(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge getOrDefault(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 3
    invoke-super {p0, p1, p2}, Ljava/util/HashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public bridge getSize()I
    .locals 1

    invoke-super {p0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0
.end method

.method public bridge getValues()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    invoke-super {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final bridge keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/AddAppViewModel$e;->getKeys()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/addapp/AddAppViewModel$e;->remove(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final bridge remove(Ljava/lang/Object;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 2
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/addapp/AddAppViewModel$e;->remove(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge remove(Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 3
    invoke-super {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final bridge remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 4
    instance-of v0, p1, Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p2, Ljava/util/List;

    if-nez v0, :cond_1

    return v1

    :cond_1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/addapp/AddAppViewModel$e;->remove(Ljava/lang/String;Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public bridge remove(Ljava/lang/String;Ljava/util/List;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 5
    invoke-super {p0, p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/AddAppViewModel$e;->getSize()I

    move-result v0

    return v0
.end method

.method public final bridge values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/AddAppViewModel$e;->getValues()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
