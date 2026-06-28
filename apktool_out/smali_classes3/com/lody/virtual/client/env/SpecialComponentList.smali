.class public final Lcom/lody/virtual/client/env/SpecialComponentList;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ACTION_BLACK_LIST:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final BROADCAST_START_WHITE_LIST:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final GMS_BLOCK_ACTION_LIST:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final GMS_BLOCK_COMPONENT:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/ComponentName;",
            ">;"
        }
    .end annotation
.end field

.field private static final INSTRUMENTATION_CONFLICTING:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final PRE_INSTALL_PACKAGES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final PROTECTED_ACTION_MAP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final PROTECT_ACTION_PREFIX:Ljava/lang/String; = "_VA_protected_"

.field private static final SPEC_SYSTEM_APP_LIST:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final SYSTEM_BROADCAST_ACTION:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final WHITE_PERMISSION:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [Landroid/content/ComponentName;

    .line 3
    .line 4
    new-instance v2, Landroid/content/ComponentName;

    .line 5
    .line 6
    const-string v3, "com.google.android.gms"

    .line 7
    .line 8
    const-string v4, "com.google.android.gms.update.SystemUpdateService"

    .line 9
    .line 10
    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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
    const-string v3, "com.google.android.gsf"

    .line 19
    .line 20
    const-string v4, "com.google.android.gsf.update.SystemUpdateService"

    .line 21
    .line 22
    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    aput-object v2, v1, v3

    .line 27
    .line 28
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sput-object v1, Lcom/lody/virtual/client/env/SpecialComponentList;->GMS_BLOCK_COMPONENT:Ljava/util/List;

    .line 33
    .line 34
    const-string v1, "com.google.android.gms.update.START_SERVICE"

    .line 35
    .line 36
    filled-new-array {v1}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sput-object v1, Lcom/lody/virtual/client/env/SpecialComponentList;->GMS_BLOCK_ACTION_LIST:Ljava/util/List;

    .line 45
    .line 46
    new-instance v1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    .line 50
    .line 51
    sput-object v1, Lcom/lody/virtual/client/env/SpecialComponentList;->ACTION_BLACK_LIST:Ljava/util/List;

    .line 52
    .line 53
    new-instance v2, Ljava/util/HashMap;

    .line 54
    .line 55
    const/4 v3, 0x5

    .line 56
    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 57
    .line 58
    .line 59
    sput-object v2, Lcom/lody/virtual/client/env/SpecialComponentList;->PROTECTED_ACTION_MAP:Ljava/util/Map;

    .line 60
    .line 61
    new-instance v3, Ljava/util/HashSet;

    .line 62
    .line 63
    const/4 v4, 0x3

    .line 64
    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(I)V

    .line 65
    .line 66
    .line 67
    sput-object v3, Lcom/lody/virtual/client/env/SpecialComponentList;->WHITE_PERMISSION:Ljava/util/HashSet;

    .line 68
    .line 69
    new-instance v5, Ljava/util/HashSet;

    .line 70
    .line 71
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 72
    .line 73
    .line 74
    sput-object v5, Lcom/lody/virtual/client/env/SpecialComponentList;->BROADCAST_START_WHITE_LIST:Ljava/util/HashSet;

    .line 75
    .line 76
    new-instance v5, Ljava/util/HashSet;

    .line 77
    .line 78
    invoke-direct {v5, v0}, Ljava/util/HashSet;-><init>(I)V

    .line 79
    .line 80
    .line 81
    sput-object v5, Lcom/lody/virtual/client/env/SpecialComponentList;->INSTRUMENTATION_CONFLICTING:Ljava/util/HashSet;

    .line 82
    .line 83
    new-instance v0, Ljava/util/HashSet;

    .line 84
    .line 85
    invoke-direct {v0, v4}, Ljava/util/HashSet;-><init>(I)V

    .line 86
    .line 87
    .line 88
    sput-object v0, Lcom/lody/virtual/client/env/SpecialComponentList;->SPEC_SYSTEM_APP_LIST:Ljava/util/HashSet;

    .line 89
    .line 90
    new-instance v4, Ljava/util/HashSet;

    .line 91
    .line 92
    const/4 v6, 0x7

    .line 93
    invoke-direct {v4, v6}, Ljava/util/HashSet;-><init>(I)V

    .line 94
    .line 95
    .line 96
    sput-object v4, Lcom/lody/virtual/client/env/SpecialComponentList;->SYSTEM_BROADCAST_ACTION:Ljava/util/Set;

    .line 97
    .line 98
    new-instance v7, Ljava/util/HashSet;

    .line 99
    .line 100
    invoke-direct {v7, v6}, Ljava/util/HashSet;-><init>(I)V

    .line 101
    .line 102
    .line 103
    sput-object v7, Lcom/lody/virtual/client/env/SpecialComponentList;->PRE_INSTALL_PACKAGES:Ljava/util/Set;

    .line 104
    .line 105
    const-string v6, "android.intent.action.SCREEN_ON"

    .line 106
    .line 107
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    const-string v6, "android.intent.action.SCREEN_OFF"

    .line 111
    .line 112
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    const-string v6, "android.intent.action.NEW_OUTGOING_CALL"

    .line 116
    .line 117
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    const-string v6, "android.intent.action.TIME_TICK"

    .line 121
    .line 122
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    const-string v6, "android.intent.action.TIME_SET"

    .line 126
    .line 127
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    const-string v6, "android.intent.action.TIMEZONE_CHANGED"

    .line 131
    .line 132
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    const-string v6, "android.intent.action.BATTERY_CHANGED"

    .line 136
    .line 137
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    const-string v6, "android.intent.action.BATTERY_LOW"

    .line 141
    .line 142
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    const-string v6, "android.intent.action.BATTERY_OKAY"

    .line 146
    .line 147
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    const-string v6, "android.intent.action.ACTION_POWER_CONNECTED"

    .line 151
    .line 152
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    const-string v6, "android.intent.action.ACTION_POWER_DISCONNECTED"

    .line 156
    .line 157
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    const-string v6, "android.intent.action.USER_PRESENT"

    .line 161
    .line 162
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    const-string v6, "android.provider.Telephony.SMS_RECEIVED"

    .line 166
    .line 167
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    const-string v6, "android.provider.Telephony.SMS_DELIVER"

    .line 171
    .line 172
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    const-string v6, "android.net.wifi.STATE_CHANGE"

    .line 176
    .line 177
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    const-string v6, "android.net.wifi.SCAN_RESULTS"

    .line 181
    .line 182
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    const-string v6, "android.net.wifi.WIFI_STATE_CHANGED"

    .line 186
    .line 187
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    const-string v6, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 191
    .line 192
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    const-string v6, "android.intent.action.ANY_DATA_STATE"

    .line 196
    .line 197
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    const-string v6, "android.intent.action.SIM_STATE_CHANGED"

    .line 201
    .line 202
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    const-string v6, "android.location.PROVIDERS_CHANGED"

    .line 206
    .line 207
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    const-string v6, "android.location.MODE_CHANGED"

    .line 211
    .line 212
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    const-string v6, "android.intent.action.HEADSET_PLUG"

    .line 216
    .line 217
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    const-string v6, "android.media.VOLUME_CHANGED_ACTION"

    .line 221
    .line 222
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    const-string v6, "android.intent.action.CONFIGURATION_CHANGED"

    .line 226
    .line 227
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    const-string v6, "android.intent.action.DYNAMIC_SENSOR_CHANGED"

    .line 231
    .line 232
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    const-string v6, "dynamic_sensor_change"

    .line 236
    .line 237
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    const-string v4, "android.appwidget.action.APPWIDGET_UPDATE"

    .line 241
    .line 242
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    const-string v4, "android.appwidget.action.APPWIDGET_CONFIGURE"

    .line 246
    .line 247
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    const-string v1, "com.google.android.gms.settings.SECURITY_SETTINGS"

    .line 251
    .line 252
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    const-string v1, "com.google.android.apps.plus.PRIVACY_SETTINGS"

    .line 256
    .line 257
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    const-string v1, "android.permission.ACCOUNT_MANAGER"

    .line 261
    .line 262
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    const-string v1, "android.intent.action.PACKAGE_ADDED"

    .line 266
    .line 267
    const-string v3, "virtual.android.intent.action.PACKAGE_ADDED"

    .line 268
    .line 269
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    const-string v1, "android.intent.action.PACKAGE_REMOVED"

    .line 273
    .line 274
    const-string v3, "virtual.android.intent.action.PACKAGE_REMOVED"

    .line 275
    .line 276
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    const-string v1, "android.intent.action.PACKAGE_CHANGED"

    .line 280
    .line 281
    const-string v3, "virtual.android.intent.action.PACKAGE_CHANGED"

    .line 282
    .line 283
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    const-string v1, "android.intent.action.USER_ADDED"

    .line 287
    .line 288
    const-string v3, "virtual.android.intent.action.USER_ADDED"

    .line 289
    .line 290
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    const-string v1, "android.intent.action.USER_REMOVED"

    .line 294
    .line 295
    const-string v3, "virtual.android.intent.action.USER_REMOVED"

    .line 296
    .line 297
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    const-string v1, "android.intent.action.MEDIA_SCANNER_SCAN_FILE"

    .line 301
    .line 302
    invoke-interface {v2, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    const-string v1, "com.qihoo.magic"

    .line 306
    .line 307
    invoke-virtual {v5, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    const-string v1, "com.qihoo.magic_mutiple"

    .line 311
    .line 312
    invoke-virtual {v5, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    const-string v1, "com.facebook.katana"

    .line 316
    .line 317
    invoke-virtual {v5, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    const-string v1, "android"

    .line 321
    .line 322
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    const-string v1, "com.google.android.webview"

    .line 326
    .line 327
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    const-string v1, "com.android.providers.downloads"

    .line 331
    .line 332
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    const-string v1, "FelipeLeite.Sober.appicon"

    .line 336
    .line 337
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    const-string v0, "com.huawei.hwid"

    .line 341
    .line 342
    invoke-interface {v7, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    const-string v0, "com.hihonor.id"

    .line 346
    .line 347
    invoke-interface {v7, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    const-string v0, "com.vivo.sdkplugin"

    .line 351
    .line 352
    invoke-interface {v7, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    const-string v0, "com.xiaomi.gamecenter.sdk.service"

    .line 356
    .line 357
    invoke-interface {v7, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->enableMediaRedirect()Z

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    if-eqz v0, :cond_0

    .line 365
    .line 366
    const-string v0, "com.yqtech.multiapp.media.module"

    .line 367
    .line 368
    invoke-interface {v7, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    :cond_0
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addBlackAction(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/env/SpecialComponentList;->ACTION_BLACK_LIST:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static addStaticBroadCastWhiteList(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/env/SpecialComponentList;->BROADCAST_START_WHITE_LIST:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static allowedStartFromBroadcast(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/env/SpecialComponentList;->BROADCAST_START_WHITE_LIST:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static getPreInstallPackages()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/lody/virtual/client/env/SpecialComponentList;->PRE_INSTALL_PACKAGES:Ljava/util/Set;

    return-object v0
.end method

.method public static getProtectActionPrefix()Ljava/lang/String;
    .locals 1

    const-string v0, "_VA_protected_"

    return-object v0
.end method

.method public static isActionInBlackList(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/env/SpecialComponentList;->ACTION_BLACK_LIST:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isConflictingInstrumentation(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/env/SpecialComponentList;->INSTRUMENTATION_CONFLICTING:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isSpecSystemPackage(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/env/SpecialComponentList;->SPEC_SYSTEM_APP_LIST:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isWhitePermission(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/env/SpecialComponentList;->WHITE_PERMISSION:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static protectAction(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p0}, Lcom/lody/virtual/client/core/SettingConfig;->isUnProtectAction(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    invoke-static {}, Lcom/lody/virtual/client/env/SpecialComponentList;->getProtectActionPrefix()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    sget-object v0, Lcom/lody/virtual/client/env/SpecialComponentList;->PROTECTED_ACTION_MAP:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/String;

    .line 34
    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lcom/lody/virtual/client/env/SpecialComponentList;->getProtectActionPrefix()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :cond_3
    return-object v0
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

.method public static protectIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/lody/virtual/client/env/SpecialComponentList;->protectAction(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    :cond_0
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

.method public static protectIntentFilter(Landroid/content/IntentFilter;)V
    .locals 4

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isUpsideDownCake()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lmirror/android/content/IntentFilterU;->mActions:Lmirror/RefObject;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/util/Collection;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, Lmirror/android/content/IntentFilter;->mActions:Lmirror/RefObject;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/util/Collection;

    .line 25
    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v2}, Lcom/lody/virtual/client/env/SpecialComponentList;->isActionInBlackList(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-static {v2}, Lcom/lody/virtual/client/env/SpecialComponentList;->protectAction(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-interface {p0, v1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 71
    .line 72
    .line 73
    :cond_4
    return-void
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

.method public static shouldBlockIntent(Landroid/content/Intent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v2, Lcom/lody/virtual/client/env/SpecialComponentList;->GMS_BLOCK_COMPONENT:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    sget-object v0, Lcom/lody/virtual/client/env/SpecialComponentList;->GMS_BLOCK_ACTION_LIST:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    return v1

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return p0
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

.method public static unprotectAction(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-static {}, Lcom/lody/virtual/client/env/SpecialComponentList;->getProtectActionPrefix()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-static {}, Lcom/lody/virtual/client/env/SpecialComponentList;->getProtectActionPrefix()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    sget-object v1, Lcom/lody/virtual/client/env/SpecialComponentList;->PROTECTED_ACTION_MAP:Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/util/Map$Entry;

    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, Ljava/lang/String;

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_3
    return-object v0
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

.method public static unprotectIntent(ILandroid/content/Intent;)Landroid/content/Intent;
    .locals 3

    .line 1
    new-instance v0, Lcom/lody/virtual/remote/BroadcastIntentData;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/lody/virtual/remote/BroadcastIntentData;-><init>(Landroid/content/Intent;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lcom/lody/virtual/remote/BroadcastIntentData;->intent:Landroid/content/Intent;

    .line 7
    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    iget v0, v0, Lcom/lody/virtual/remote/BroadcastIntentData;->userId:I

    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    if-ne v0, p0, :cond_2

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lcom/lody/virtual/client/env/SpecialComponentList;->unprotectAction(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    :cond_1
    move-object p1, v1

    .line 31
    :cond_2
    return-object p1
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
