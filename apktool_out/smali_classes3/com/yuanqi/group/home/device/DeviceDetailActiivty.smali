.class public Lcom/yuanqi/group/home/device/DeviceDetailActiivty;
.super Lcom/yuanqi/group/abs/ui/VActivity;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation


# static fields
.field private static final v:Ljava/lang/String; = "DeviceData"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:Lcom/lody/virtual/remote/VDeviceConfig;

.field private f:Landroid/telephony/TelephonyManager;

.field private g:Landroid/net/wifi/WifiManager;

.field private h:Landroid/widget/EditText;

.field private i:Landroid/widget/EditText;

.field private j:Landroid/widget/EditText;

.field private k:Landroid/widget/EditText;

.field private l:Landroid/widget/EditText;

.field private m:Landroid/widget/EditText;

.field private n:Landroid/widget/EditText;

.field private o:Landroid/widget/EditText;

.field private p:Landroid/widget/EditText;

.field private q:Landroid/widget/EditText;

.field private r:Landroid/widget/EditText;

.field private s:Landroid/widget/EditText;

.field private t:Landroid/widget/EditText;

.field private u:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/group/abs/ui/VActivity;-><init>()V

    return-void
.end method

.method public static synthetic H(Lcom/yuanqi/group/home/device/DeviceDetailActiivty;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->N(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic I(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->O(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method private J()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->l:Landroid/widget/EditText;

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->L(Landroid/widget/EditText;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "BRAND"

    .line 10
    .line 11
    invoke-virtual {v0, v2, v1}, Lcom/lody/virtual/remote/VDeviceConfig;->setProp(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->m:Landroid/widget/EditText;

    .line 17
    .line 18
    invoke-direct {p0, v1}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->L(Landroid/widget/EditText;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "MODEL"

    .line 23
    .line 24
    invoke-virtual {v0, v2, v1}, Lcom/lody/virtual/remote/VDeviceConfig;->setProp(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->n:Landroid/widget/EditText;

    .line 30
    .line 31
    invoke-direct {p0, v1}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->L(Landroid/widget/EditText;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "PRODUCT"

    .line 36
    .line 37
    invoke-virtual {v0, v2, v1}, Lcom/lody/virtual/remote/VDeviceConfig;->setProp(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->o:Landroid/widget/EditText;

    .line 43
    .line 44
    invoke-direct {p0, v1}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->L(Landroid/widget/EditText;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const-string v2, "DEVICE"

    .line 49
    .line 50
    invoke-virtual {v0, v2, v1}, Lcom/lody/virtual/remote/VDeviceConfig;->setProp(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 54
    .line 55
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->p:Landroid/widget/EditText;

    .line 56
    .line 57
    invoke-direct {p0, v1}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->L(Landroid/widget/EditText;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-string v2, "BOARD"

    .line 62
    .line 63
    invoke-virtual {v0, v2, v1}, Lcom/lody/virtual/remote/VDeviceConfig;->setProp(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 67
    .line 68
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->q:Landroid/widget/EditText;

    .line 69
    .line 70
    invoke-direct {p0, v1}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->L(Landroid/widget/EditText;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-string v2, "DISPLAY"

    .line 75
    .line 76
    invoke-virtual {v0, v2, v1}, Lcom/lody/virtual/remote/VDeviceConfig;->setProp(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 80
    .line 81
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->r:Landroid/widget/EditText;

    .line 82
    .line 83
    invoke-direct {p0, v1}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->L(Landroid/widget/EditText;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const-string v2, "ID"

    .line 88
    .line 89
    invoke-virtual {v0, v2, v1}, Lcom/lody/virtual/remote/VDeviceConfig;->setProp(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 93
    .line 94
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->t:Landroid/widget/EditText;

    .line 95
    .line 96
    invoke-direct {p0, v1}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->L(Landroid/widget/EditText;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v2, "MANUFACTURER"

    .line 101
    .line 102
    invoke-virtual {v0, v2, v1}, Lcom/lody/virtual/remote/VDeviceConfig;->setProp(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 106
    .line 107
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->u:Landroid/widget/EditText;

    .line 108
    .line 109
    invoke-direct {p0, v1}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->L(Landroid/widget/EditText;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const-string v2, "FINGERPRINT"

    .line 114
    .line 115
    invoke-virtual {v0, v2, v1}, Lcom/lody/virtual/remote/VDeviceConfig;->setProp(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 119
    .line 120
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->s:Landroid/widget/EditText;

    .line 121
    .line 122
    invoke-direct {p0, v1}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->L(Landroid/widget/EditText;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iput-object v1, v0, Lcom/lody/virtual/remote/VDeviceConfig;->serial:Ljava/lang/String;

    .line 127
    .line 128
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 129
    .line 130
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->i:Landroid/widget/EditText;

    .line 131
    .line 132
    invoke-direct {p0, v1}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->L(Landroid/widget/EditText;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    iput-object v1, v0, Lcom/lody/virtual/remote/VDeviceConfig;->deviceId:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 139
    .line 140
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->j:Landroid/widget/EditText;

    .line 141
    .line 142
    invoke-direct {p0, v1}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->L(Landroid/widget/EditText;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iput-object v1, v0, Lcom/lody/virtual/remote/VDeviceConfig;->iccId:Ljava/lang/String;

    .line 147
    .line 148
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 149
    .line 150
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->k:Landroid/widget/EditText;

    .line 151
    .line 152
    invoke-direct {p0, v1}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->L(Landroid/widget/EditText;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iput-object v1, v0, Lcom/lody/virtual/remote/VDeviceConfig;->wifiMac:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 159
    .line 160
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->h:Landroid/widget/EditText;

    .line 161
    .line 162
    invoke-direct {p0, v1}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->L(Landroid/widget/EditText;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    iput-object v1, v0, Lcom/lody/virtual/remote/VDeviceConfig;->androidId:Ljava/lang/String;

    .line 167
    .line 168
    return-void
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

.method private K()Ljava/lang/String;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HardwareIds"
        }
    .end annotation

    .line 1
    const-string v0, "/sys/class/net/eth0/address"

    .line 2
    .line 3
    const-string v1, "/sys/class/net/wifi/address"

    .line 4
    .line 5
    const-string v2, "/sys/class/net/wlan0/address"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->g:Landroid/net/wifi/WifiManager;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    const/4 v3, 0x3

    .line 29
    if-ge v2, v3, :cond_1

    .line 30
    .line 31
    aget-object v3, v0, v2

    .line 32
    .line 33
    :try_start_0
    invoke-direct {p0, v3}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->Q(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    goto :goto_1

    .line 38
    :catch_0
    move-exception v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_2
    return-object v1
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

.method private L(Landroid/widget/EditText;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private M()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->a:Ljava/lang/String;

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
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->killAllApps()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget v2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->c:I

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lcom/lody/virtual/client/core/VirtualCore;->killApp(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    :goto_0
    return-void
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

.method private synthetic N(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    iput-boolean p2, p1, Lcom/lody/virtual/remote/VDeviceConfig;->enable:Z

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/lody/virtual/remote/VDeviceConfig;->clear()V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/lody/virtual/client/ipc/VDeviceManager;->get()Lcom/lody/virtual/client/ipc/VDeviceManager;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget p2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->c:I

    .line 14
    .line 15
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 16
    .line 17
    invoke-virtual {p1, p2, v0}, Lcom/lody/virtual/client/ipc/VDeviceManager;->updateDeviceConfig(ILcom/lody/virtual/remote/VDeviceConfig;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Landroid/content/Intent;

    .line 21
    .line 22
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string p2, "pkg"

    .line 26
    .line 27
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    const-string p2, "user"

    .line 33
    .line 34
    iget v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->c:I

    .line 35
    .line 36
    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    const-string p2, "pos"

    .line 40
    .line 41
    iget v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->d:I

    .line 42
    .line 43
    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 44
    .line 45
    .line 46
    const-string p2, "result"

    .line 47
    .line 48
    const-string v0, "reset"

    .line 49
    .line 50
    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    const/4 p2, -0x1

    .line 54
    invoke-virtual {p0, p2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->M()V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->S()V

    .line 61
    .line 62
    .line 63
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
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
.end method

.method private static synthetic O(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public static P(Landroidx/fragment/app/Fragment;Lcom/yuanqi/group/home/models/e;I)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-class v2, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p1, Lcom/yuanqi/group/home/models/j;->c:Ljava/lang/String;

    .line 13
    .line 14
    const-string v2, "title"

    .line 15
    .line 16
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    const-string v1, "pkg"

    .line 20
    .line 21
    iget-object v2, p1, Lcom/yuanqi/group/home/models/j;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    const-string v1, "user"

    .line 27
    .line 28
    iget p1, p1, Lcom/yuanqi/group/home/models/j;->b:I

    .line 29
    .line 30
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    const-string p1, "pos"

    .line 34
    .line 35
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    const/16 p1, 0x3e9

    .line 39
    .line 40
    invoke-virtual {p0, v0, p1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 41
    .line 42
    .line 43
    return-void
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
.end method

.method private Q(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x3e8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/io/BufferedReader;

    .line 9
    .line 10
    new-instance v2, Ljava/io/FileReader;

    .line 11
    .line 12
    invoke-direct {v2, p1}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 16
    .line 17
    .line 18
    const/16 p1, 0x400

    .line 19
    .line 20
    new-array p1, p1, [C

    .line 21
    .line 22
    :goto_0
    invoke-virtual {v1, p1}, Ljava/io/Reader;->read([C)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, -0x1

    .line 27
    if-eq v2, v3, :cond_0

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static {p1, v3, v2}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1
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

.method private R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
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
.end method

.method private S()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HardwareIds",
            "MissingPermission"
        }
    .end annotation

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->l:Landroid/widget/EditText;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 6
    .line 7
    const-string v3, "BRAND"

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Lcom/lody/virtual/remote/VDeviceConfig;->getProp(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {p0, v1, v2, v3}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->m:Landroid/widget/EditText;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 21
    .line 22
    const-string v3, "MODEL"

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Lcom/lody/virtual/remote/VDeviceConfig;->getProp(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 29
    .line 30
    invoke-direct {p0, v1, v2, v3}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->n:Landroid/widget/EditText;

    .line 34
    .line 35
    iget-object v2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 36
    .line 37
    const-string v3, "PRODUCT"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Lcom/lody/virtual/remote/VDeviceConfig;->getProp(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget-object v3, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {p0, v1, v2, v3}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->o:Landroid/widget/EditText;

    .line 49
    .line 50
    iget-object v2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 51
    .line 52
    const-string v3, "DEVICE"

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Lcom/lody/virtual/remote/VDeviceConfig;->getProp(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    sget-object v3, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 59
    .line 60
    invoke-direct {p0, v1, v2, v3}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->p:Landroid/widget/EditText;

    .line 64
    .line 65
    iget-object v2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 66
    .line 67
    const-string v3, "BOARD"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Lcom/lody/virtual/remote/VDeviceConfig;->getProp(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    sget-object v3, Landroid/os/Build;->BOARD:Ljava/lang/String;

    .line 74
    .line 75
    invoke-direct {p0, v1, v2, v3}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->q:Landroid/widget/EditText;

    .line 79
    .line 80
    iget-object v2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 81
    .line 82
    const-string v3, "DISPLAY"

    .line 83
    .line 84
    invoke-virtual {v2, v3}, Lcom/lody/virtual/remote/VDeviceConfig;->getProp(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    sget-object v3, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 89
    .line 90
    invoke-direct {p0, v1, v2, v3}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->r:Landroid/widget/EditText;

    .line 94
    .line 95
    iget-object v2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 96
    .line 97
    const-string v3, "ID"

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Lcom/lody/virtual/remote/VDeviceConfig;->getProp(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    sget-object v3, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 104
    .line 105
    invoke-direct {p0, v1, v2, v3}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->t:Landroid/widget/EditText;

    .line 109
    .line 110
    iget-object v2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 111
    .line 112
    const-string v3, "MANUFACTURER"

    .line 113
    .line 114
    invoke-virtual {v2, v3}, Lcom/lody/virtual/remote/VDeviceConfig;->getProp(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 119
    .line 120
    invoke-direct {p0, v1, v2, v3}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->u:Landroid/widget/EditText;

    .line 124
    .line 125
    iget-object v2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 126
    .line 127
    const-string v3, "FINGERPRINT"

    .line 128
    .line 129
    invoke-virtual {v2, v3}, Lcom/lody/virtual/remote/VDeviceConfig;->getProp(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    sget-object v3, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct {p0, v1, v2, v3}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->s:Landroid/widget/EditText;

    .line 139
    .line 140
    iget-object v2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 141
    .line 142
    iget-object v2, v2, Lcom/lody/virtual/remote/VDeviceConfig;->serial:Ljava/lang/String;

    .line 143
    .line 144
    sget-object v3, Landroid/os/Build;->SERIAL:Ljava/lang/String;

    .line 145
    .line 146
    invoke-direct {p0, v1, v2, v3}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :try_start_0
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->i:Landroid/widget/EditText;

    .line 150
    .line 151
    iget-object v2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 152
    .line 153
    iget-object v2, v2, Lcom/lody/virtual/remote/VDeviceConfig;->deviceId:Ljava/lang/String;

    .line 154
    .line 155
    iget-object v3, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->f:Landroid/telephony/TelephonyManager;

    .line 156
    .line 157
    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-direct {p0, v1, v2, v3}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :catchall_0
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->i:Landroid/widget/EditText;

    .line 166
    .line 167
    iget-object v2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 168
    .line 169
    iget-object v2, v2, Lcom/lody/virtual/remote/VDeviceConfig;->deviceId:Ljava/lang/String;

    .line 170
    .line 171
    invoke-direct {p0, v1, v2, v0}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    :goto_0
    :try_start_1
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->j:Landroid/widget/EditText;

    .line 175
    .line 176
    iget-object v2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 177
    .line 178
    iget-object v2, v2, Lcom/lody/virtual/remote/VDeviceConfig;->iccId:Ljava/lang/String;

    .line 179
    .line 180
    iget-object v3, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->f:Landroid/telephony/TelephonyManager;

    .line 181
    .line 182
    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-direct {p0, v1, v2, v3}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :catchall_1
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->j:Landroid/widget/EditText;

    .line 191
    .line 192
    iget-object v2, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 193
    .line 194
    iget-object v2, v2, Lcom/lody/virtual/remote/VDeviceConfig;->iccId:Ljava/lang/String;

    .line 195
    .line 196
    invoke-direct {p0, v1, v2, v0}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :goto_1
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->k:Landroid/widget/EditText;

    .line 200
    .line 201
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 202
    .line 203
    iget-object v1, v1, Lcom/lody/virtual/remote/VDeviceConfig;->wifiMac:Ljava/lang/String;

    .line 204
    .line 205
    invoke-direct {p0}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->K()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-direct {p0, v0, v1, v2}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->h:Landroid/widget/EditText;

    .line 213
    .line 214
    iget-object v1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 215
    .line 216
    iget-object v1, v1, Lcom/lody/virtual/remote/VDeviceConfig;->androidId:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    const-string v3, "android_id"

    .line 223
    .line 224
    invoke-static {v2, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-direct {p0, v0, v1, v2}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->R(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    return-void
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


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->startActivityTrace(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    .line 17
    .line 18
    .line 19
    const v0, 0x7f0c0026

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 23
    .line 24
    .line 25
    const v0, 0x7f09034b

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/yuanqi/group/abs/ui/VActivity;->C(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/yuanqi/group/abs/ui/VActivity;->E()V

    .line 38
    .line 39
    .line 40
    const v0, 0x7f090134

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Landroid/widget/EditText;

    .line 48
    .line 49
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->h:Landroid/widget/EditText;

    .line 50
    .line 51
    const v0, 0x7f09013b

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Landroid/widget/EditText;

    .line 59
    .line 60
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->i:Landroid/widget/EditText;

    .line 61
    .line 62
    const v0, 0x7f09013c

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Landroid/widget/EditText;

    .line 70
    .line 71
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->j:Landroid/widget/EditText;

    .line 72
    .line 73
    const v0, 0x7f09013f

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Landroid/widget/EditText;

    .line 81
    .line 82
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->k:Landroid/widget/EditText;

    .line 83
    .line 84
    const v0, 0x7f090136

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Landroid/widget/EditText;

    .line 92
    .line 93
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->l:Landroid/widget/EditText;

    .line 94
    .line 95
    const v0, 0x7f090141

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Landroid/widget/EditText;

    .line 103
    .line 104
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->m:Landroid/widget/EditText;

    .line 105
    .line 106
    const v0, 0x7f090142

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Landroid/widget/EditText;

    .line 114
    .line 115
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->n:Landroid/widget/EditText;

    .line 116
    .line 117
    const v0, 0x7f090137

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Landroid/widget/EditText;

    .line 125
    .line 126
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->o:Landroid/widget/EditText;

    .line 127
    .line 128
    const v0, 0x7f090135

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Landroid/widget/EditText;

    .line 136
    .line 137
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->p:Landroid/widget/EditText;

    .line 138
    .line 139
    const v0, 0x7f090138

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, Landroid/widget/EditText;

    .line 147
    .line 148
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->q:Landroid/widget/EditText;

    .line 149
    .line 150
    const v0, 0x7f09013a

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Landroid/widget/EditText;

    .line 158
    .line 159
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->r:Landroid/widget/EditText;

    .line 160
    .line 161
    const v0, 0x7f090143

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Landroid/widget/EditText;

    .line 169
    .line 170
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->s:Landroid/widget/EditText;

    .line 171
    .line 172
    const v0, 0x7f090140

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, Landroid/widget/EditText;

    .line 180
    .line 181
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->t:Landroid/widget/EditText;

    .line 182
    .line 183
    const v0, 0x7f090139

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, Landroid/widget/EditText;

    .line 191
    .line 192
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->u:Landroid/widget/EditText;

    .line 193
    .line 194
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    const-string v1, "wifi"

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 205
    .line 206
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->g:Landroid/net/wifi/WifiManager;

    .line 207
    .line 208
    const-string v0, "phone"

    .line 209
    .line 210
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 215
    .line 216
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->f:Landroid/telephony/TelephonyManager;

    .line 217
    .line 218
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->b:Ljava/lang/String;

    .line 219
    .line 220
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_0

    .line 225
    .line 226
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    const-string v1, "pkg"

    .line 231
    .line 232
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->a:Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    const-string v1, "user"

    .line 243
    .line 244
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    iput p1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->c:I

    .line 249
    .line 250
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    const-string v0, "title"

    .line 255
    .line 256
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    iput-object p1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->b:Ljava/lang/String;

    .line 261
    .line 262
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->b:Ljava/lang/String;

    .line 263
    .line 264
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 265
    .line 266
    .line 267
    invoke-static {}, Lcom/lody/virtual/client/ipc/VDeviceManager;->get()Lcom/lody/virtual/client/ipc/VDeviceManager;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    iget v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->c:I

    .line 272
    .line 273
    invoke-virtual {p1, v0}, Lcom/lody/virtual/client/ipc/VDeviceManager;->getDeviceConfig(I)Lcom/lody/virtual/remote/VDeviceConfig;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    iput-object p1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 278
    .line 279
    invoke-direct {p0}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->S()V

    .line 280
    .line 281
    .line 282
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 283
    .line 284
    .line 285
    return-void
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

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const/high16 v1, 0x7f0e0000

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const/4 p1, 0x1

    return p1
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "pkg"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->a:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "user"

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->c:I

    .line 20
    .line 21
    const-string v0, "title"

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->b:Ljava/lang/String;

    .line 28
    .line 29
    const-string v0, "pos"

    .line 30
    .line 31
    const/4 v1, -0x1

    .line 32
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iput p1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->d:I

    .line 37
    .line 38
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
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 4

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Lcom/yuanqi/group/abs/ui/VActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :pswitch_0
    iget-object p1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 16
    .line 17
    iput-boolean v1, p1, Lcom/lody/virtual/remote/VDeviceConfig;->enable:Z

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->J()V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->S()V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lcom/lody/virtual/client/ipc/VDeviceManager;->get()Lcom/lody/virtual/client/ipc/VDeviceManager;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->c:I

    .line 30
    .line 31
    iget-object v3, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->e:Lcom/lody/virtual/remote/VDeviceConfig;

    .line 32
    .line 33
    invoke-virtual {p1, v0, v3}, Lcom/lody/virtual/client/ipc/VDeviceManager;->updateDeviceConfig(ILcom/lody/virtual/remote/VDeviceConfig;)V

    .line 34
    .line 35
    .line 36
    new-instance p1, Landroid/content/Intent;

    .line 37
    .line 38
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v0, "pkg"

    .line 42
    .line 43
    iget-object v3, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    const-string v0, "user"

    .line 49
    .line 50
    iget v3, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->c:I

    .line 51
    .line 52
    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    const-string v0, "pos"

    .line 56
    .line 57
    iget v3, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->d:I

    .line 58
    .line 59
    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    const-string v0, "result"

    .line 63
    .line 64
    const-string v3, "save"

    .line 65
    .line 66
    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 67
    .line 68
    .line 69
    const/4 v0, -0x1

    .line 70
    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->a:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_0

    .line 80
    .line 81
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, Lcom/lody/virtual/client/core/VirtualCore;->killAllApps()V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->a:Ljava/lang/String;

    .line 94
    .line 95
    iget v3, p0, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->c:I

    .line 96
    .line 97
    invoke-virtual {p1, v0, v3}, Lcom/lody/virtual/client/core/VirtualCore;->killApp(Ljava/lang/String;I)V

    .line 98
    .line 99
    .line 100
    :goto_0
    invoke-direct {p0}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->M()V

    .line 101
    .line 102
    .line 103
    const-string p1, "\u4fdd\u5b58\u6210\u529f"

    .line 104
    .line 105
    invoke-static {p0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :pswitch_1
    new-instance p1, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 114
    .line 115
    const v0, 0x7f130156

    .line 116
    .line 117
    .line 118
    invoke-direct {p1, p0, v0}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 119
    .line 120
    .line 121
    const v0, 0x7f1200f3

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(I)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    new-instance v0, Lcom/yuanqi/group/home/device/a;

    .line 129
    .line 130
    invoke-direct {v0, p0}, Lcom/yuanqi/group/home/device/a;-><init>(Lcom/yuanqi/group/home/device/DeviceDetailActiivty;)V

    .line 131
    .line 132
    .line 133
    const v3, 0x104000a

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v3, v0}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    new-instance v0, Lcom/yuanqi/group/home/device/b;

    .line 141
    .line 142
    invoke-direct {v0}, Lcom/yuanqi/group/home/device/b;-><init>()V

    .line 143
    .line 144
    .line 145
    const/high16 v3, 0x1040000

    .line 146
    .line 147
    invoke-virtual {p1, v3, v0}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setCancelable(Z)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1}, Landroidx/appcompat/app/AlertDialog$Builder;->show()Landroidx/appcompat/app/AlertDialog;

    .line 156
    .line 157
    .line 158
    :goto_1
    return v1

    .line 159
    :pswitch_data_0
    .packed-switch 0x7f09004b
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method protected onRestart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartEnd()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeEnd()V

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/yuanqi/group/abs/ui/VActivity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method
