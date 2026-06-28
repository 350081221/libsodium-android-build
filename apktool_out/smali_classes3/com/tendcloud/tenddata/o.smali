.class public Lcom/tendcloud/tenddata/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/o$a;,
        Lcom/tendcloud/tenddata/o$b;
    }
.end annotation


# static fields
.field static final a:Ljava/lang/String; = "www.talkingdata.net"

.field static final b:I = 0x50

.field private static c:Landroid/telephony/TelephonyManager; = null

.field private static final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:[Ljava/lang/String;

.field private static final f:[Ljava/lang/String;

.field private static g:Lcom/tendcloud/tenddata/o$a; = null

.field private static h:Z = false

.field private static final i:J = 0x493e0L

.field private static j:J

.field private static volatile k:Z

.field private static volatile l:Z

.field private static m:Lorg/json/JSONArray;

.field private static n:Lorg/json/JSONArray;

.field private static volatile o:Z

.field private static volatile p:Z

.field private static volatile q:Z

.field private static r:Lorg/json/JSONArray;

.field private static s:Lorg/json/JSONArray;

.field private static t:Lorg/json/JSONArray;

.field private static u:Z

.field private static v:Lcom/tendcloud/tenddata/o$b;

.field private static w:Lorg/json/JSONArray;

.field private static volatile x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tendcloud/tenddata/o;->d:Ljava/util/HashMap;

    .line 7
    .line 8
    const-string v1, "UNKNOWN"

    .line 9
    .line 10
    const-string v2, "GPRS"

    .line 11
    .line 12
    const-string v3, "EDGE"

    .line 13
    .line 14
    const-string v4, "UMTS"

    .line 15
    .line 16
    const-string v5, "CDMA"

    .line 17
    .line 18
    const-string v6, "EVDO_0"

    .line 19
    .line 20
    const-string v7, "EVDO_A"

    .line 21
    .line 22
    const-string v8, "1xRTT"

    .line 23
    .line 24
    const-string v9, "HSDPA"

    .line 25
    .line 26
    const-string v10, "HSUPA"

    .line 27
    .line 28
    const-string v11, "HSPA"

    .line 29
    .line 30
    const-string v12, "IDEN"

    .line 31
    .line 32
    const-string v13, "EVDO_B"

    .line 33
    .line 34
    const-string v14, "LTE"

    .line 35
    .line 36
    const-string v15, "EHRPD"

    .line 37
    .line 38
    const-string v16, "HSPAP"

    .line 39
    .line 40
    filled-new-array/range {v1 .. v16}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sput-object v1, Lcom/tendcloud/tenddata/o;->e:[Ljava/lang/String;

    .line 45
    .line 46
    const-string v1, "CDMA"

    .line 47
    .line 48
    const-string v2, "SIP"

    .line 49
    .line 50
    const-string v3, "NONE"

    .line 51
    .line 52
    const-string v4, "GSM"

    .line 53
    .line 54
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sput-object v1, Lcom/tendcloud/tenddata/o;->f:[Ljava/lang/String;

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    sput-object v1, Lcom/tendcloud/tenddata/o;->g:Lcom/tendcloud/tenddata/o$a;

    .line 62
    .line 63
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()[Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    aget-object v3, v1, v2

    .line 73
    .line 74
    const-string v4, "ip"

    .line 75
    .line 76
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    const/4 v3, 0x1

    .line 80
    aget-object v3, v1, v3

    .line 81
    .line 82
    const-string v4, "ipv6"

    .line 83
    .line 84
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    const/4 v3, 0x2

    .line 88
    aget-object v3, v1, v3

    .line 89
    .line 90
    const-string v4, "cell_ip"

    .line 91
    .line 92
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    const/4 v3, 0x3

    .line 96
    aget-object v1, v1, v3

    .line 97
    .line 98
    const-string v3, "cell_ipv6"

    .line 99
    .line 100
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 104
    .line 105
    invoke-static {v1}, Lcom/tendcloud/tenddata/o;->q(Landroid/content/Context;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    const-string v3, "bssid"

    .line 110
    .line 111
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 115
    .line 116
    invoke-static {v1}, Lcom/tendcloud/tenddata/o;->w(Landroid/content/Context;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    const-string v3, "ssid"

    .line 121
    .line 122
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    :cond_0
    sput-boolean v2, Lcom/tendcloud/tenddata/o;->h:Z

    .line 126
    .line 127
    const-wide/32 v0, -0x493e0

    .line 128
    .line 129
    .line 130
    sput-wide v0, Lcom/tendcloud/tenddata/o;->j:J

    .line 131
    .line 132
    sput-boolean v2, Lcom/tendcloud/tenddata/o;->k:Z

    .line 133
    .line 134
    sput-boolean v2, Lcom/tendcloud/tenddata/o;->l:Z

    .line 135
    .line 136
    new-instance v0, Lorg/json/JSONArray;

    .line 137
    .line 138
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 139
    .line 140
    .line 141
    sput-object v0, Lcom/tendcloud/tenddata/o;->m:Lorg/json/JSONArray;

    .line 142
    .line 143
    sput-boolean v2, Lcom/tendcloud/tenddata/o;->o:Z

    .line 144
    .line 145
    sput-boolean v2, Lcom/tendcloud/tenddata/o;->p:Z

    .line 146
    .line 147
    sput-boolean v2, Lcom/tendcloud/tenddata/o;->q:Z

    .line 148
    .line 149
    new-instance v0, Lorg/json/JSONArray;

    .line 150
    .line 151
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 152
    .line 153
    .line 154
    sput-object v0, Lcom/tendcloud/tenddata/o;->r:Lorg/json/JSONArray;

    .line 155
    .line 156
    sput-boolean v2, Lcom/tendcloud/tenddata/o;->u:Z

    .line 157
    .line 158
    new-instance v0, Lcom/tendcloud/tenddata/o$b;

    .line 159
    .line 160
    invoke-direct {v0}, Lcom/tendcloud/tenddata/o$b;-><init>()V

    .line 161
    .line 162
    .line 163
    sput-object v0, Lcom/tendcloud/tenddata/o;->v:Lcom/tendcloud/tenddata/o$b;

    .line 164
    .line 165
    new-instance v0, Lorg/json/JSONArray;

    .line 166
    .line 167
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 168
    .line 169
    .line 170
    sput-object v0, Lcom/tendcloud/tenddata/o;->w:Lorg/json/JSONArray;

    .line 171
    .line 172
    sput-boolean v2, Lcom/tendcloud/tenddata/o;->x:Z

    .line 173
    .line 174
    return-void
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

.method public static A(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/o;->w:Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gtz v0, :cond_2

    .line 8
    .line 9
    sget-boolean v0, Lcom/tendcloud/tenddata/o;->x:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string v0, "android.permission.READ_PHONE_STATE"

    .line 15
    .line 16
    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    sget-object p0, Lcom/tendcloud/tenddata/o;->w:Lorg/json/JSONArray;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->D(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lcom/tendcloud/tenddata/o;->w:Lorg/json/JSONArray;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_2
    :goto_0
    sget-object p0, Lcom/tendcloud/tenddata/o;->w:Lorg/json/JSONArray;

    .line 32
    .line 33
    return-object p0
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

.method public static B(Landroid/content/Context;)I
    .locals 1

    .line 1
    const/16 v0, 0x17

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->a(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getPhoneCount()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->A(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 28
    .line 29
    .line 30
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    const/4 p0, 0x0

    .line 33
    :goto_0
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

.method public static C(Landroid/content/Context;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->d(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_4

    .line 7
    .line 8
    :try_start_0
    sget-object p0, Lcom/tendcloud/tenddata/o;->d:Ljava/util/HashMap;

    .line 9
    .line 10
    const-string v1, "ip"

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    const/16 v1, 0x2e

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x1

    .line 27
    add-int/2addr v1, v2

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance v1, Ljava/net/DatagramPacket;

    .line 34
    .line 35
    new-array v4, v3, [B

    .line 36
    .line 37
    invoke-direct {v1, v4, v3, v3}, Ljava/net/DatagramPacket;-><init>([BII)V

    .line 38
    .line 39
    .line 40
    new-instance v3, Ljava/net/DatagramSocket;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/net/DatagramSocket;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 43
    .line 44
    .line 45
    :goto_0
    const/16 v4, 0xff

    .line 46
    .line 47
    if-ge v2, v4, :cond_1

    .line 48
    .line 49
    :try_start_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v4}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 65
    .line 66
    .line 67
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 68
    :try_start_2
    invoke-virtual {v1, v4}, Ljava/net/DatagramPacket;->setAddress(Ljava/net/InetAddress;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v1}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    .line 72
    .line 73
    .line 74
    const/16 v4, 0x7d

    .line 75
    .line 76
    if-ne v2, v4, :cond_0

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/net/DatagramSocket;->close()V

    .line 79
    .line 80
    .line 81
    new-instance v4, Ljava/net/DatagramSocket;

    .line 82
    .line 83
    invoke-direct {v4}, Ljava/net/DatagramSocket;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 84
    .line 85
    .line 86
    move-object v3, v4

    .line 87
    :catchall_0
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    :try_start_3
    invoke-virtual {v3}, Ljava/net/DatagramSocket;->close()V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    move-object v3, v0

    .line 95
    :goto_1
    const-wide/16 v1, 0x1388

    .line 96
    .line 97
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 98
    .line 99
    .line 100
    invoke-static {}, Lcom/tendcloud/tenddata/o;->c()Ljava/util/Map;

    .line 101
    .line 102
    .line 103
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 104
    if-eqz v3, :cond_3

    .line 105
    .line 106
    :try_start_4
    invoke-virtual {v3}, Ljava/net/DatagramSocket;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 107
    .line 108
    .line 109
    :catchall_1
    :cond_3
    return-object p0

    .line 110
    :catchall_2
    move-object v3, v0

    .line 111
    :catchall_3
    if-eqz v3, :cond_4

    .line 112
    .line 113
    :try_start_5
    invoke-virtual {v3}, Ljava/net/DatagramSocket;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 114
    .line 115
    .line 116
    :catchall_4
    :cond_4
    return-object v0
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

.method private static D(Landroid/content/Context;)V
    .locals 12

    .line 1
    const-string v0, "meid5"

    .line 2
    .line 3
    const-string v1, "meid"

    .line 4
    .line 5
    const-string v2, "imei5"

    .line 6
    .line 7
    sget-object v3, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    .line 8
    .line 9
    invoke-virtual {v3}, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->isIMEIAndMEIDEnabled()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 v3, 0x1

    .line 17
    :try_start_0
    const-string v4, "phone"

    .line 18
    .line 19
    invoke-virtual {p0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Landroid/telephony/TelephonyManager;

    .line 24
    .line 25
    new-instance v5, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    const/16 v6, 0x16

    .line 31
    .line 32
    invoke-static {v6}, Lcom/tendcloud/tenddata/y;->a(I)Z

    .line 33
    .line 34
    .line 35
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    .line 36
    const-string v7, "imei"

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    if-eqz v6, :cond_5

    .line 40
    .line 41
    :try_start_1
    const-string v5, "telephony_subscription_service"

    .line 42
    .line 43
    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Landroid/telephony/SubscriptionManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 48
    .line 49
    const/16 v6, 0x1a

    .line 50
    .line 51
    :try_start_2
    invoke-static {p0, v5, v8}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;Landroid/telephony/SubscriptionManager;I)Lorg/json/JSONObject;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-static {v6}, Lcom/tendcloud/tenddata/y;->a(I)Z

    .line 56
    .line 57
    .line 58
    move-result v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 59
    const-string v11, "imei1"

    .line 60
    .line 61
    if-eqz v10, :cond_1

    .line 62
    .line 63
    :try_start_3
    invoke-static {v11}, Lcom/tendcloud/tenddata/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    invoke-virtual {v9, v7, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    .line 69
    .line 70
    invoke-static {v8}, Lcom/tendcloud/tenddata/l;->b(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    invoke-virtual {v9, v2, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 75
    .line 76
    .line 77
    :catchall_0
    :try_start_4
    const-string v10, "meid1"

    .line 78
    .line 79
    invoke-static {v10}, Lcom/tendcloud/tenddata/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    invoke-virtual {v9, v1, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 84
    .line 85
    .line 86
    invoke-static {v8}, Lcom/tendcloud/tenddata/l;->c(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v9, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    :try_start_5
    invoke-static {v11}, Lcom/tendcloud/tenddata/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    invoke-virtual {v9, v7, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    .line 100
    .line 101
    invoke-static {v8}, Lcom/tendcloud/tenddata/l;->b(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-virtual {v9, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 106
    .line 107
    .line 108
    :catchall_1
    :goto_0
    invoke-virtual {v9}, Lorg/json/JSONObject;->length()I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    if-lez v8, :cond_2

    .line 113
    .line 114
    sget-object v8, Lcom/tendcloud/tenddata/o;->w:Lorg/json/JSONArray;

    .line 115
    .line 116
    invoke-virtual {v8, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 117
    .line 118
    .line 119
    :catchall_2
    :cond_2
    :try_start_6
    invoke-static {p0, v5, v3}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;Landroid/telephony/SubscriptionManager;I)Lorg/json/JSONObject;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    if-eqz v4, :cond_4

    .line 124
    .line 125
    invoke-static {v6}, Lcom/tendcloud/tenddata/y;->a(I)Z

    .line 126
    .line 127
    .line 128
    move-result v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 129
    const-string v5, "imei2"

    .line 130
    .line 131
    if-eqz v4, :cond_3

    .line 132
    .line 133
    :try_start_7
    invoke-static {v5}, Lcom/tendcloud/tenddata/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {p0, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 138
    .line 139
    .line 140
    invoke-static {v3}, Lcom/tendcloud/tenddata/l;->b(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {p0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 145
    .line 146
    .line 147
    :catchall_3
    :try_start_8
    const-string v2, "meid2"

    .line 148
    .line 149
    invoke-static {v2}, Lcom/tendcloud/tenddata/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 154
    .line 155
    .line 156
    invoke-static {v3}, Lcom/tendcloud/tenddata/l;->c(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_3
    :try_start_9
    invoke-static {v5}, Lcom/tendcloud/tenddata/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {p0, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 169
    .line 170
    .line 171
    invoke-static {v3}, Lcom/tendcloud/tenddata/l;->b(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {p0, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 176
    .line 177
    .line 178
    :catchall_4
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lorg/json/JSONObject;->length()I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-lez v0, :cond_10

    .line 183
    .line 184
    sget-object v0, Lcom/tendcloud/tenddata/o;->w:Lorg/json/JSONArray;

    .line 185
    .line 186
    invoke-virtual {v0, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 187
    .line 188
    .line 189
    goto/16 :goto_5

    .line 190
    .line 191
    :cond_5
    const-string v0, ""

    .line 192
    .line 193
    if-eqz v4, :cond_6

    .line 194
    .line 195
    :try_start_a
    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    goto :goto_2

    .line 200
    :cond_6
    move-object v1, v0

    .line 201
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-static {v2}, Lcom/tendcloud/tenddata/o;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_7

    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    invoke-static {v4, v1}, Lcom/tendcloud/tenddata/o;->a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    if-eqz v1, :cond_7

    .line 227
    .line 228
    sget-object v2, Lcom/tendcloud/tenddata/o;->w:Lorg/json/JSONArray;

    .line 229
    .line 230
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 231
    .line 232
    .line 233
    :cond_7
    :try_start_b
    const-string v1, "phone1"

    .line 234
    .line 235
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 240
    .line 241
    if-eqz v1, :cond_8

    .line 242
    .line 243
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    goto :goto_3

    .line 248
    :cond_8
    move-object v2, v0

    .line 249
    :goto_3
    if-eqz v2, :cond_9

    .line 250
    .line 251
    invoke-static {v2}, Lcom/tendcloud/tenddata/o;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    if-eqz v4, :cond_9

    .line 260
    .line 261
    invoke-interface {v5, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-nez v4, :cond_9

    .line 266
    .line 267
    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    invoke-static {v1, v2}, Lcom/tendcloud/tenddata/o;->a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    if-eqz v1, :cond_9

    .line 275
    .line 276
    sget-object v2, Lcom/tendcloud/tenddata/o;->w:Lorg/json/JSONArray;

    .line 277
    .line 278
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 279
    .line 280
    .line 281
    :catchall_5
    :cond_9
    :try_start_c
    const-string v1, "phone2"

    .line 282
    .line 283
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 288
    .line 289
    if-eqz v1, :cond_a

    .line 290
    .line 291
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    :cond_a
    if-eqz v0, :cond_b

    .line 296
    .line 297
    invoke-static {v0}, Lcom/tendcloud/tenddata/o;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-eqz v2, :cond_b

    .line 306
    .line 307
    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    if-nez v2, :cond_b

    .line 312
    .line 313
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    invoke-static {v1, v0}, Lcom/tendcloud/tenddata/o;->a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    if-eqz v0, :cond_b

    .line 321
    .line 322
    sget-object v1, Lcom/tendcloud/tenddata/o;->w:Lorg/json/JSONArray;

    .line 323
    .line 324
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 325
    .line 326
    .line 327
    :catchall_6
    :cond_b
    :try_start_d
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->H(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->G(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    if-eqz v1, :cond_c

    .line 336
    .line 337
    move-object v0, v1

    .line 338
    :cond_c
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->F(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    if-eqz v1, :cond_d

    .line 343
    .line 344
    move-object v0, v1

    .line 345
    :cond_d
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->E(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    if-eqz p0, :cond_e

    .line 350
    .line 351
    move-object v0, p0

    .line 352
    :cond_e
    if-eqz v0, :cond_10

    .line 353
    .line 354
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 355
    .line 356
    .line 357
    move-result p0

    .line 358
    if-lez p0, :cond_10

    .line 359
    .line 360
    :goto_4
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 361
    .line 362
    .line 363
    move-result p0

    .line 364
    if-ge v8, p0, :cond_10

    .line 365
    .line 366
    invoke-virtual {v0, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-interface {v5, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    if-nez v2, :cond_f

    .line 379
    .line 380
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    sget-object v1, Lcom/tendcloud/tenddata/o;->w:Lorg/json/JSONArray;

    .line 384
    .line 385
    invoke-virtual {v1, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 386
    .line 387
    .line 388
    :cond_f
    add-int/lit8 v8, v8, 0x1

    .line 389
    .line 390
    goto :goto_4

    .line 391
    :catchall_7
    :cond_10
    :goto_5
    sput-boolean v3, Lcom/tendcloud/tenddata/o;->x:Z

    .line 392
    .line 393
    return-void
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
.end method

.method private static E(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 10

    .line 1
    const-class v0, Landroid/telephony/TelephonyManager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    .line 5
    .line 6
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v3, "phone"

    .line 10
    .line 11
    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 16
    .line 17
    const-string v3, "com.android.internal.telephony.Phone"

    .line 18
    .line 19
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x1

    .line 25
    :try_start_1
    const-string v6, "GEMINI_SIM_1"

    .line 26
    .line 27
    invoke-virtual {v3, v6}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual {v6, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v6, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    check-cast v6, Ljava/lang/Integer;

    .line 39
    .line 40
    const-string v7, "GEMINI_SIM_2"

    .line 41
    .line 42
    invoke-virtual {v3, v7}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Ljava/lang/Integer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    :try_start_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    :goto_0
    const-string v7, "getDeviceIdGemini"

    .line 65
    .line 66
    new-array v8, v5, [Ljava/lang/Class;

    .line 67
    .line 68
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    aput-object v9, v8, v4

    .line 71
    .line 72
    invoke-virtual {v0, v7, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    if-eqz p0, :cond_3

    .line 77
    .line 78
    if-nez v7, :cond_0

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_0
    new-array v8, v5, [Ljava/lang/Object;

    .line 82
    .line 83
    aput-object v6, v8, v4

    .line 84
    .line 85
    invoke-virtual {v7, p0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    check-cast v8, Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    new-array v5, v5, [Ljava/lang/Object;

    .line 96
    .line 97
    aput-object v3, v5, v4

    .line 98
    .line 99
    invoke-virtual {v7, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    check-cast v4, Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-static {v8}, Lcom/tendcloud/tenddata/o;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    .line 115
    .line 116
    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 117
    const-string v7, "Gemini"

    .line 118
    .line 119
    if-eqz v5, :cond_1

    .line 120
    .line 121
    :try_start_3
    invoke-static {v0, p0, v6, v8, v7}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 126
    .line 127
    .line 128
    :cond_1
    invoke-static {v4}, Lcom/tendcloud/tenddata/o;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-eqz v5, :cond_2

    .line 137
    .line 138
    invoke-static {v0, p0, v3, v4, v7}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {v2, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 143
    .line 144
    .line 145
    :cond_2
    return-object v2

    .line 146
    :catchall_1
    :cond_3
    :goto_1
    return-object v1
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
.end method

.method private static F(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    .line 3
    .line 4
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string v2, "phone"

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 14
    .line 15
    const-string v2, "com.android.internal.telephony.Phone"

    .line 16
    .line 17
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x1

    .line 23
    :try_start_1
    const-string v5, "GEMINI_SIM_1"

    .line 24
    .line 25
    invoke-virtual {v2, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v5, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, Ljava/lang/Integer;

    .line 37
    .line 38
    const-string v6, "GEMINI_SIM_2"

    .line 39
    .line 40
    invoke-virtual {v2, v6}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/lang/Integer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    :try_start_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :goto_0
    const-class v6, Landroid/telephony/TelephonyManager;

    .line 63
    .line 64
    const-string v7, "getDefault"

    .line 65
    .line 66
    new-array v8, v4, [Ljava/lang/Class;

    .line 67
    .line 68
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    aput-object v9, v8, v3

    .line 71
    .line 72
    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    new-array v7, v4, [Ljava/lang/Object;

    .line 77
    .line 78
    aput-object v5, v7, v3

    .line 79
    .line 80
    invoke-virtual {v6, p0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    check-cast v5, Landroid/telephony/TelephonyManager;

    .line 85
    .line 86
    new-array v4, v4, [Ljava/lang/Object;

    .line 87
    .line 88
    aput-object v2, v4, v3

    .line 89
    .line 90
    invoke-virtual {v6, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 95
    .line 96
    invoke-virtual {v5}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-static {v2}, Lcom/tendcloud/tenddata/o;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_0

    .line 121
    .line 122
    invoke-static {v5, v2}, Lcom/tendcloud/tenddata/o;->a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    if-eqz v2, :cond_0

    .line 127
    .line 128
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 129
    .line 130
    .line 131
    :cond_0
    invoke-static {v3}, Lcom/tendcloud/tenddata/o;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_1

    .line 140
    .line 141
    invoke-static {p0, v3}, Lcom/tendcloud/tenddata/o;->a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-eqz p0, :cond_1

    .line 146
    .line 147
    invoke-virtual {v1, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 148
    .line 149
    .line 150
    :cond_1
    return-object v1

    .line 151
    :catchall_1
    return-object v0
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

.method private static G(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 9

    .line 1
    const-string v0, "phone"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    .line 4
    .line 5
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "com.android.internal.telephony.PhoneFactory"

    .line 9
    .line 10
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "getServiceName"

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    new-array v5, v4, [Ljava/lang/Class;

    .line 18
    .line 19
    const-class v6, Ljava/lang/String;

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    aput-object v6, v5, v7

    .line 23
    .line 24
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    const/4 v8, 0x1

    .line 27
    aput-object v6, v5, v8

    .line 28
    .line 29
    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    new-array v4, v4, [Ljava/lang/Object;

    .line 34
    .line 35
    aput-object v0, v4, v7

    .line 36
    .line 37
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    aput-object v5, v4, v8

    .line 42
    .line 43
    invoke-virtual {v3, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-static {v3}, Lcom/tendcloud/tenddata/o;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_0

    .line 86
    .line 87
    invoke-static {v0, v3}, Lcom/tendcloud/tenddata/o;->a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-eqz v0, :cond_0

    .line 92
    .line 93
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 94
    .line 95
    .line 96
    :cond_0
    invoke-static {v2}, Lcom/tendcloud/tenddata/o;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_1

    .line 105
    .line 106
    invoke-static {p0, v2}, Lcom/tendcloud/tenddata/o;->a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    if-eqz p0, :cond_1

    .line 111
    .line 112
    invoke-virtual {v1, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    :cond_1
    return-object v1

    .line 116
    :catchall_0
    const/4 p0, 0x0

    .line 117
    return-object p0
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

.method private static H(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 9

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "android.telephony.MSimTelephonyManager"

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "phone_msim"

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x1

    .line 24
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const-string v6, "getDeviceId"

    .line 29
    .line 30
    new-array v7, v4, [Ljava/lang/Class;

    .line 31
    .line 32
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    aput-object v8, v7, v2

    .line 35
    .line 36
    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    new-array v7, v4, [Ljava/lang/Object;

    .line 41
    .line 42
    aput-object v3, v7, v2

    .line 43
    .line 44
    invoke-virtual {v6, p0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    check-cast v7, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    new-array v4, v4, [Ljava/lang/Object;

    .line 55
    .line 56
    aput-object v5, v4, v2

    .line 57
    .line 58
    invoke-virtual {v6, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v7}, Lcom/tendcloud/tenddata/o;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    const-string v6, ""

    .line 77
    .line 78
    if-eqz v4, :cond_0

    .line 79
    .line 80
    :try_start_1
    invoke-static {v1, p0, v3, v7, v6}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 85
    .line 86
    .line 87
    :cond_0
    invoke-static {v2}, Lcom/tendcloud/tenddata/o;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_1

    .line 96
    .line 97
    invoke-static {v1, p0, v5, v2, v6}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {v0, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    .line 103
    .line 104
    :cond_1
    return-object v0

    .line 105
    :catchall_0
    const/4 p0, 0x0

    .line 106
    return-object p0
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

.method private static a(I)Ljava/lang/String;
    .locals 2

    if-ltz p0, :cond_0

    .line 34
    sget-object v0, Lcom/tendcloud/tenddata/o;->e:[Ljava/lang/String;

    array-length v1, v0

    if-ge p0, v1, :cond_0

    aget-object p0, v0, p0

    goto :goto_0

    .line 35
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 2
    sget-object v0, Lcom/tendcloud/tenddata/o;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static a(Landroid/content/Context;Z)Lorg/json/JSONArray;
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_1

    .line 36
    :try_start_0
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    .line 37
    :cond_1
    :goto_0
    sget-object v1, Lcom/tendcloud/tenddata/o;->m:Lorg/json/JSONArray;

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-gtz v1, :cond_8

    sget-boolean v1, Lcom/tendcloud/tenddata/o;->k:Z

    if-eqz v1, :cond_2

    goto/16 :goto_2

    .line 38
    :cond_2
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "type"

    .line 39
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->n(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "mcc"

    .line 40
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "operator"

    .line 41
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "country"

    .line 42
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    sget-object v2, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    invoke-virtual {v2}, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->isLocationEnabled()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v3, "android.permission.ACCESS_COARSE_LOCATION"

    .line 44
    invoke-static {p0, v3}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "android.permission.ACCESS_FINE_LOCATION"

    .line 45
    invoke-static {p0, v3}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const/4 v2, 0x0

    :cond_3
    if-eqz v2, :cond_7

    .line 46
    sget-object v2, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    if-nez v2, :cond_4

    .line 47
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;)V

    .line 48
    :cond_4
    sget-boolean p0, Lcom/tendcloud/tenddata/y;->c:Z

    if-nez p0, :cond_5

    if-eqz p1, :cond_7

    :cond_5
    sget-boolean p0, Lcom/tendcloud/tenddata/ab;->P:Z

    if-nez p0, :cond_7

    .line 49
    sget-object p0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;

    move-result-object p0

    .line 50
    instance-of p1, p0, Landroid/telephony/gsm/GsmCellLocation;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "basestationId"

    const-string v3, "networkId"

    const-string v4, "systemId"

    if-eqz p1, :cond_6

    .line 51
    :try_start_1
    check-cast p0, Landroid/telephony/gsm/GsmCellLocation;

    if-eqz p0, :cond_7

    .line 52
    invoke-virtual {p0}, Landroid/telephony/gsm/GsmCellLocation;->getLac()I

    move-result p1

    invoke-virtual {v1, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 53
    invoke-virtual {p0}, Landroid/telephony/gsm/GsmCellLocation;->getCid()I

    move-result p1

    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const/16 p1, 0x9

    .line 54
    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->a(I)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 55
    invoke-virtual {p0}, Landroid/telephony/gsm/GsmCellLocation;->getPsc()I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_1

    .line 56
    :cond_6
    instance-of p1, p0, Landroid/telephony/cdma/CdmaCellLocation;

    if-eqz p1, :cond_7

    .line 57
    check-cast p0, Landroid/telephony/cdma/CdmaCellLocation;

    if-eqz p0, :cond_7

    .line 58
    invoke-virtual {p0}, Landroid/telephony/cdma/CdmaCellLocation;->getSystemId()I

    move-result p1

    invoke-virtual {v1, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 59
    invoke-virtual {p0}, Landroid/telephony/cdma/CdmaCellLocation;->getNetworkId()I

    move-result p1

    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 60
    invoke-virtual {p0}, Landroid/telephony/cdma/CdmaCellLocation;->getBaseStationId()I

    move-result p1

    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p1, "location"

    .line 61
    invoke-virtual {p0}, Landroid/telephony/cdma/CdmaCellLocation;->getBaseStationLatitude()I

    move-result v2

    .line 62
    invoke-virtual {p0}, Landroid/telephony/cdma/CdmaCellLocation;->getBaseStationLongitude()I

    move-result p0

    .line 63
    invoke-static {v2, p0}, Lcom/tendcloud/tenddata/o;->a(II)Lorg/json/JSONObject;

    move-result-object p0

    .line 64
    invoke-virtual {v1, p1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 65
    sput-boolean p0, Lcom/tendcloud/tenddata/o;->k:Z

    .line 66
    sget-object p0, Lcom/tendcloud/tenddata/o;->m:Lorg/json/JSONArray;

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 67
    sget-object p0, Lcom/tendcloud/tenddata/o;->m:Lorg/json/JSONArray;

    return-object p0

    .line 68
    :cond_8
    :goto_2
    sget-object p0, Lcom/tendcloud/tenddata/o;->m:Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0

    :catchall_0
    return-object v0
.end method

.method public static a(Ljava/util/ArrayList;I)Lorg/json/JSONArray;
    .locals 2

    .line 79
    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/o$4;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/o$4;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 80
    new-instance v0, Lorg/json/JSONArray;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static a(Ljava/util/BitSet;)Lorg/json/JSONArray;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 81
    :cond_0
    invoke-virtual {p0}, Ljava/util/BitSet;->cardinality()I

    move-result v1

    const/4 v2, 0x1

    if-ge v1, v2, :cond_1

    return-object v0

    .line 82
    :cond_1
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    const/4 v1, 0x0

    .line 83
    :goto_0
    invoke-virtual {p0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v1

    if-ltz v1, :cond_2

    .line 84
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static a(Lorg/json/JSONArray;I)Lorg/json/JSONArray;
    .locals 4

    .line 69
    :try_start_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    .line 71
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 72
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 73
    :cond_0
    new-instance p0, Lcom/tendcloud/tenddata/o$2;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/o$2;-><init>()V

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 74
    new-instance p0, Lorg/json/JSONArray;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-le v2, p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_1
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(II)Lorg/json/JSONObject;
    .locals 2

    .line 75
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "lat"

    .line 76
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p0, "lng"

    .line 77
    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p0, "unit"

    const-string p1, "qd"

    .line 78
    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-object v0
.end method

.method private static a(Landroid/content/Context;Landroid/telephony/SubscriptionManager;I)Lorg/json/JSONObject;
    .locals 3

    const-string p0, ""

    .line 100
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 101
    sget-object v1, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->isIMEIAndMEIDEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    const/16 v1, 0x16

    .line 102
    :try_start_0
    invoke-static {v1}, Lcom/tendcloud/tenddata/y;->a(I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 103
    invoke-virtual {p1, p2}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoForSimSlotIndex(I)Landroid/telephony/SubscriptionInfo;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string p2, "simSerialNumber"

    .line 104
    invoke-virtual {v0, p2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "simOperator"

    .line 105
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getMcc()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getMnc()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 107
    invoke-virtual {v0, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "simOperatorName"

    .line 108
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getCarrierName()Ljava/lang/CharSequence;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v1, p0

    goto :goto_0

    .line 109
    :cond_1
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getCarrierName()Ljava/lang/CharSequence;

    move-result-object v1

    .line 110
    :goto_0
    invoke-virtual {v0, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "simCountryIso"

    .line 111
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getCountryIso()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getCountryIso()Ljava/lang/String;

    move-result-object p0

    .line 112
    :goto_1
    invoke-virtual {v0, p2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "subscriberId"

    const-string p1, "imsi"

    .line 113
    invoke-static {p1}, Lcom/tendcloud/tenddata/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_3
    return-object v0
.end method

.method private static a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 4

    .line 85
    sget-object v0, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->isIMEIAndMEIDEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 86
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "imei"

    .line 87
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "imei5"

    .line 88
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "dataState"

    .line 89
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getDataState()I

    move-result v2

    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p1, "networkType"

    .line 90
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    move-result v2

    invoke-static {v2}, Lcom/tendcloud/tenddata/o;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "networkOperator"

    .line 91
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "phoneType"

    .line 92
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getPhoneType()I

    move-result v2

    invoke-static {v2}, Lcom/tendcloud/tenddata/o;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "simOperator"

    .line 93
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, ""

    if-nez v2, :cond_1

    move-object v2, v3

    goto :goto_0

    :cond_1
    :try_start_1
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object v2

    .line 94
    :goto_0
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "simOperatorName"

    .line 95
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    move-object v2, v3

    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    move-result-object v2

    .line 97
    :goto_1
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "simCountryIso"

    .line 98
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v3

    .line 99
    :goto_2
    invoke-virtual {v0, p1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0

    :catchall_0
    return-object v1
.end method

.method private static a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    const-string v0, ""

    .line 114
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "imei"

    .line 115
    invoke-virtual {v1, v2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "imei5"

    .line 116
    invoke-static {p3}, Lcom/tendcloud/tenddata/y;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, v2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/4 p3, 0x0

    const/4 v2, 0x1

    .line 117
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getDataState"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, p3

    invoke-virtual {p0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const-string v4, "dataState"

    new-array v5, v2, [Ljava/lang/Object;

    aput-object p2, v5, p3

    .line 118
    invoke-virtual {v3, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    :catchall_0
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getNetworkType"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, p3

    invoke-virtual {p0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const-string v4, "networkType"

    new-array v5, v2, [Ljava/lang/Object;

    aput-object p2, v5, p3

    .line 120
    invoke-virtual {v3, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Lcom/tendcloud/tenddata/o;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 121
    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 122
    :catchall_1
    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getNetworkOperator"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, p3

    invoke-virtual {p0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const-string v4, "networkOperator"

    new-array v5, v2, [Ljava/lang/Object;

    aput-object p2, v5, p3

    .line 123
    invoke-virtual {v3, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 124
    :catchall_2
    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getPhoneType"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, p3

    invoke-virtual {p0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const-string v4, "phoneType"

    new-array v5, v2, [Ljava/lang/Object;

    aput-object p2, v5, p3

    .line 125
    invoke-virtual {v3, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Lcom/tendcloud/tenddata/o;->c(I)Ljava/lang/String;

    move-result-object v3

    .line 126
    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 127
    :catchall_3
    :try_start_4
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getSimOperator"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, p3

    invoke-virtual {p0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const-string v4, "simOperator"

    new-array v5, v2, [Ljava/lang/Object;

    aput-object p2, v5, p3

    .line 128
    invoke-virtual {v3, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_0

    move-object v3, v0

    goto :goto_0

    :cond_0
    new-array v5, v2, [Ljava/lang/Object;

    aput-object p2, v5, p3

    .line 129
    invoke-virtual {v3, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 130
    :goto_0
    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 131
    :catchall_4
    :try_start_5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getSimOperatorName"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    new-array v3, v2, [Ljava/lang/Class;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v3, p3

    invoke-virtual {p0, p4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    const-string p4, "simOperatorName"

    new-array v3, v2, [Ljava/lang/Object;

    aput-object p2, v3, p3

    .line 132
    invoke-virtual {p0, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    new-array v0, v2, [Ljava/lang/Object;

    aput-object p2, v0, p3

    .line 133
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 134
    :goto_1
    invoke-virtual {v1, p4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    :catchall_5
    return-object v1
.end method

.method static a(Landroid/content/Context;)V
    .locals 1

    :try_start_0
    const-string v0, "phone"

    .line 1
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/telephony/TelephonyManager;

    sput-object p0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private static a([Ljava/lang/String;)V
    .locals 7

    .line 10
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 11
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 13
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/NetworkInterface;

    .line 14
    invoke-virtual {v2}, Ljava/net/NetworkInterface;->isLoopback()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {v2}, Ljava/net/NetworkInterface;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    const-string v4, "wlan"

    .line 16
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "eth"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "dummy"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    .line 17
    :cond_3
    invoke-virtual {v2}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 18
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_0

    .line 19
    :cond_4
    invoke-static {v2}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v2

    .line 20
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 21
    :cond_5
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_6

    return-void

    .line 22
    :cond_6
    new-instance v0, Lcom/tendcloud/tenddata/o$1;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/o$1;-><init>()V

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 23
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_d

    .line 24
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 25
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x3

    const/4 v5, 0x2

    if-eqz v3, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/net/InetAddress;

    .line 26
    invoke-virtual {v3}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    move-result v6

    if-nez v6, :cond_7

    invoke-virtual {v3}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_2

    .line 27
    :cond_8
    instance-of v6, v3, Ljava/net/Inet4Address;

    if-eqz v6, :cond_9

    .line 28
    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    aput-object v3, p0, v5

    goto :goto_2

    .line 29
    :cond_9
    instance-of v5, v3, Ljava/net/Inet6Address;

    if-eqz v5, :cond_7

    .line 30
    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    const-string v5, "ff:fe"

    .line 31
    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_2

    .line 32
    :cond_a
    aput-object v3, p0, v4

    goto :goto_2

    .line 33
    :cond_b
    aget-object v2, p0, v5

    if-nez v2, :cond_d

    aget-object v2, p0, v4

    if-eqz v2, :cond_c

    goto :goto_3

    :cond_c
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_d
    :goto_3
    return-void
.end method

.method public static a()[Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    .line 3
    filled-new-array {v0, v0, v0, v0}, [Ljava/lang/String;

    move-result-object v0

    .line 4
    sget-boolean v1, Lcom/tendcloud/tenddata/ab;->R:Z

    if-eqz v1, :cond_0

    return-object v0

    .line 5
    :cond_0
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/tendcloud/tenddata/o;->i(Landroid/content/Context;)Z

    move-result v1

    .line 6
    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v2}, Lcom/tendcloud/tenddata/o;->j(Landroid/content/Context;)Z

    move-result v2

    if-nez v1, :cond_1

    if-nez v2, :cond_1

    const-string v1, "no-network"

    .line 7
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    return-object v0

    :cond_1
    if-eqz v1, :cond_2

    .line 8
    :try_start_0
    invoke-static {v0}, Lcom/tendcloud/tenddata/o;->b([Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    .line 9
    invoke-static {v0}, Lcom/tendcloud/tenddata/o;->a([Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_3
    :goto_0
    return-object v0
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 4

    .line 49
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    .line 50
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    goto :goto_0

    :cond_0
    const/16 v0, 0x30

    .line 51
    :goto_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 52
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_2

    .line 53
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v0, v3, :cond_1

    .line 54
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-object v2

    .line 55
    :catchall_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method

.method private static b(I)Ljava/lang/String;
    .locals 1

    const-string v0, "UNKNOWN"

    packed-switch p0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    :try_start_0
    const-string v0, "4G"

    goto :goto_0

    :pswitch_1
    const-string v0, "3G"

    goto :goto_0

    :pswitch_2
    const-string v0, "2G"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Lorg/json/JSONArray;I)Lorg/json/JSONArray;
    .locals 4

    .line 43
    :try_start_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    .line 45
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 46
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 47
    :cond_0
    new-instance p0, Lcom/tendcloud/tenddata/o$3;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/o$3;-><init>()V

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 48
    new-instance p0, Lorg/json/JSONArray;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-le v2, p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_1
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method private static b([Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 3
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/net/NetworkInterface;

    .line 4
    invoke-virtual {v1}, Ljava/net/NetworkInterface;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const-string v3, "wlan"

    .line 5
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v1}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 7
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 8
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/InetAddress;

    if-eqz v2, :cond_2

    .line 9
    invoke-virtual {v2}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    .line 10
    :cond_3
    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    .line 11
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    .line 12
    :cond_4
    instance-of v4, v2, Ljava/net/Inet4Address;

    const/4 v5, 0x0

    if-eqz v4, :cond_5

    .line 13
    aput-object v3, p0, v5

    goto :goto_1

    .line 14
    :cond_5
    instance-of v2, v2, Ljava/net/Inet6Address;

    if-eqz v2, :cond_2

    const-string v2, "%"

    .line 15
    invoke-virtual {v3, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_6

    .line 16
    invoke-virtual {v3, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    :cond_6
    const/4 v2, 0x1

    .line 17
    aput-object v3, p0, v2

    goto :goto_1

    :cond_7
    return-void
.end method

.method public static b()Z
    .locals 1

    const/16 v0, 0xb

    .line 39
    :try_start_0
    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "http.proxyHost"

    .line 40
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 41
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    .line 42
    :cond_0
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    xor-int/lit8 v0, v0, 0x1

    return v0

    :catchall_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 7

    :try_start_0
    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    .line 18
    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    const-string v0, "connectivity"

    .line 19
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/ConnectivityManager;

    if-eqz p0, :cond_4

    const/16 v0, 0x1d

    .line 20
    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 21
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 22
    invoke-virtual {p0, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object p0

    if-eqz p0, :cond_0

    const/16 v0, 0xc

    .line 23
    invoke-virtual {p0, v0}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1

    .line 24
    :cond_1
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 25
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p0

    return p0

    .line 26
    :cond_2
    invoke-virtual {p0, v2}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 27
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object p0

    sget-object v0, Landroid/net/NetworkInfo$State;->UNKNOWN:Landroid/net/NetworkInfo$State;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_1

    :cond_3
    return v2

    .line 28
    :cond_4
    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sget-wide v5, Lcom/tendcloud/tenddata/o;->j:J

    sub-long/2addr v3, v5

    const-wide/32 v5, 0x493e0

    cmp-long p0, v3, v5

    if-lez p0, :cond_7

    .line 29
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sput-wide v3, Lcom/tendcloud/tenddata/o;->j:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/4 p0, 0x0

    .line 30
    :try_start_1
    invoke-static {}, Lcom/tendcloud/tenddata/o;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 31
    new-instance v0, Ljava/net/Socket;

    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v4

    invoke-direct {v0, v3, v4}, Ljava/net/Socket;-><init>(Ljava/lang/String;I)V

    goto :goto_2

    .line 32
    :cond_5
    new-instance v0, Ljava/net/Socket;

    const-string v3, "www.talkingdata.net"

    const/16 v4, 0x50

    invoke-direct {v0, v3, v4}, Ljava/net/Socket;-><init>(Ljava/lang/String;I)V

    :goto_2
    move-object p0, v0

    .line 33
    sput-boolean v1, Lcom/tendcloud/tenddata/o;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    :goto_3
    :try_start_2
    invoke-virtual {p0}, Ljava/net/Socket;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    goto :goto_4

    .line 35
    :catchall_0
    :try_start_3
    sput-boolean v2, Lcom/tendcloud/tenddata/o;->h:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz p0, :cond_7

    goto :goto_3

    :catchall_1
    move-exception v0

    if-eqz p0, :cond_6

    .line 36
    :try_start_4
    invoke-virtual {p0}, Ljava/net/Socket;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 37
    :catchall_2
    :cond_6
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 38
    :catchall_3
    :cond_7
    :goto_4
    sget-boolean p0, Lcom/tendcloud/tenddata/o;->h:Z

    return p0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 3

    .line 7
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xa

    if-le v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x14

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->b(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_0

    .line 9
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 10
    :catchall_0
    :cond_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method

.method private static c(I)Ljava/lang/String;
    .locals 2

    if-ltz p0, :cond_0

    .line 5
    sget-object v0, Lcom/tendcloud/tenddata/o;->f:[Ljava/lang/String;

    array-length v1, v0

    if-ge p0, v1, :cond_0

    aget-object p0, v0, p0

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static c([Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 24
    array-length v1, p0

    const/4 v2, 0x6

    if-ge v1, v2, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    move v2, v1

    .line 25
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_2

    .line 26
    aget-object v3, p0, v2

    const-string v4, "lladdr"

    .line 27
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v1, v2, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-lez v1, :cond_3

    .line 28
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 29
    aget-object p0, p0, v1

    const-string v1, "([\\da-fA-F]{2}:){5}([\\da-fA-F]{2}){1}"

    .line 30
    invoke-virtual {p0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "00:00:00:00:00:00"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return-object p0

    :cond_3
    :goto_2
    return-object v0
.end method

.method private static c()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x1d

    .line 11
    :try_start_0
    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    invoke-static {}, Lcom/tendcloud/tenddata/o;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0

    .line 13
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/FileReader;

    new-instance v3, Ljava/io/File;

    const-string v4, "/proc/net/arp"

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 15
    :cond_1
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "[ ]+"

    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    .line 17
    aget-object v4, v2, v3

    const-string v5, "IP"

    invoke-virtual {v4, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 18
    aget-object v3, v2, v3

    const/4 v4, 0x3

    .line 19
    aget-object v2, v2, v4

    .line 20
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "00:00:00:00:00:00"

    .line 21
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 22
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 23
    :cond_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    .line 1
    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "connectivity"

    .line 2
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/ConnectivityManager;

    .line 3
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    :catchall_0
    :cond_0
    return v0
.end method

.method private static d()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 4
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    const-string v2, "ip n"

    invoke-virtual {v1, v2}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 5
    :try_start_1
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-virtual {v1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 6
    :try_start_2
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 7
    :cond_0
    :goto_0
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v4, "lladdr"

    .line 8
    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    const/4 v5, -0x1

    if-le v4, v5, :cond_0

    const-string v4, " "

    .line 9
    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 10
    array-length v4, v0

    const/4 v5, 0x5

    if-le v4, v5, :cond_0

    const/4 v4, 0x0

    .line 11
    aget-object v4, v0, v4

    .line 12
    invoke-static {v0}, Lcom/tendcloud/tenddata/o;->c([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    .line 14
    :cond_1
    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 15
    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 16
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Process;->waitFor()I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 17
    :try_start_4
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 18
    :catchall_0
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Process;->destroy()V

    goto :goto_3

    :catchall_1
    move-object v3, v0

    :catchall_2
    move-object v0, v2

    goto :goto_2

    :catchall_3
    move-object v3, v0

    goto :goto_2

    :catchall_4
    move-object v1, v0

    move-object v3, v1

    :goto_2
    if-eqz v0, :cond_3

    .line 19
    :try_start_5
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    :catchall_5
    :cond_3
    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    :goto_3
    return-object v3
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const-string v0, "wifi"

    .line 2
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/wifi/WifiManager;

    .line 3
    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimState()I

    .line 12
    .line 13
    .line 14
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 v1, 0x5

    .line 16
    if-ne p0, v1, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    :catchall_0
    :cond_1
    return v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static f(Landroid/content/Context;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    const-string v1, "connectivity"

    .line 3
    .line 4
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroid/net/ConnectivityManager;

    .line 9
    .line 10
    const-class v1, Landroid/net/ConnectivityManager;

    .line 11
    .line 12
    const-string v2, "getMobileDataEnabled"

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    new-array v4, v3, [Ljava/lang/Class;

    .line 16
    .line 17
    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 22
    .line 23
    .line 24
    new-array v2, v3, [Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    return p0

    .line 37
    :catchall_0
    return v0
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

.method public static g(Landroid/content/Context;)Z
    .locals 4

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->a(I)Z

    .line 5
    .line 6
    .line 7
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    const-string v2, "airplane_mode_on"

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0, v2, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-ne p0, v3, :cond_0

    .line 22
    .line 23
    move v1, v3

    .line 24
    :cond_0
    return v1

    .line 25
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0, v2, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 30
    .line 31
    .line 32
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    if-ne p0, v3, :cond_2

    .line 34
    .line 35
    move v1, v3

    .line 36
    :catchall_0
    :cond_2
    return v1
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

.method public static h(Landroid/content/Context;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimState()I

    .line 12
    .line 13
    .line 14
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq v1, p0, :cond_1

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    move v0, v1

    .line 21
    :catchall_0
    :cond_1
    return v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static i(Landroid/content/Context;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_1

    .line 3
    .line 4
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    return v0

    .line 10
    :cond_1
    :goto_0
    :try_start_0
    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    const-string v1, "connectivity"

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Landroid/net/ConnectivityManager;

    .line 25
    .line 26
    if-eqz p0, :cond_4

    .line 27
    .line 28
    const/16 v1, 0x1d

    .line 29
    .line 30
    invoke-static {v1}, Lcom/tendcloud/tenddata/y;->a(I)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    move v0, v2

    .line 56
    :cond_2
    return v0

    .line 57
    :cond_3
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_4

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-ne v2, v1, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 70
    .line 71
    .line 72
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    if-eqz p0, :cond_4

    .line 74
    .line 75
    move v0, v2

    .line 76
    :catchall_0
    :cond_4
    return v0
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

.method public static j(Landroid/content/Context;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_1

    .line 3
    .line 4
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    return v0

    .line 10
    :cond_1
    :goto_0
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 11
    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    :cond_2
    sget-object p0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getDataState()I

    .line 20
    .line 21
    .line 22
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    const/4 v1, 0x2

    .line 24
    if-ne p0, v1, :cond_3

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    :catchall_0
    :cond_3
    return v0
.end method

.method public static k(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->b(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p0, "OFFLINE"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->i(Landroid/content/Context;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-string p0, "WIFI"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->n(Landroid/content/Context;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->a(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static l(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->b(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p0, "offline"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->i(Landroid/content/Context;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    const-string p0, "wifi"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    const-string p0, "cellular"

    .line 20
    .line 21
    return-object p0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static m(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "UNKNOWN"

    .line 2
    .line 3
    if-nez p0, :cond_1

    .line 4
    .line 5
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-object v0

    .line 11
    :cond_1
    :goto_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->b(Landroid/content/Context;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_2
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->i(Landroid/content/Context;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    const-string p0, "WIFI"

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_3
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->n(Landroid/content/Context;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->b(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
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

.method public static n(Landroid/content/Context;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_1

    .line 3
    .line 4
    :try_start_0
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    return v0

    .line 10
    :cond_1
    :goto_0
    sget-object v1, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 11
    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    :cond_2
    sget-object p0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    .line 20
    .line 21
    .line 22
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    return p0

    .line 24
    :catchall_0
    return v0
    .line 25
    .line 26
    .line 27
.end method

.method public static o(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    return-object p0

    .line 15
    :catchall_0
    const/4 p0, 0x0

    .line 16
    return-object p0
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

.method public static p(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    return-object p0

    .line 15
    :catchall_0
    const/4 p0, 0x0

    .line 16
    return-object p0
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

.method public static q(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/ab;->Q:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->isWiFiEnable()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v2, "wifi"

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    const-string v2, "android.permission.ACCESS_WIFI_STATE"

    .line 31
    .line 32
    invoke-static {p0, v2}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :cond_2
    return-object v1
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

.method public static r(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    return-object p0

    .line 15
    :catchall_0
    const/4 p0, 0x0

    .line 16
    return-object p0
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

.method public static s(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    return-object p0

    .line 15
    :catchall_0
    const/4 p0, 0x0

    .line 16
    return-object p0
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

.method public static t(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    return-object p0

    .line 15
    :catchall_0
    const/4 p0, 0x0

    .line 16
    return-object p0
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

.method public static tryGetDoubleSimInfoReCheck(Landroid/content/Context;)V
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/o;->w:Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gtz v0, :cond_1

    .line 8
    .line 9
    sget-boolean v0, Lcom/tendcloud/tenddata/o;->x:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->D(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    invoke-static {p0}, Lcom/tendcloud/tenddata/h;->eForInternal(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    :goto_1
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static u(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 9

    .line 1
    const-string v0, "scannable"

    .line 2
    .line 3
    const-string v1, "current"

    .line 4
    .line 5
    const-string v2, "connected"

    .line 6
    .line 7
    const-string v3, "available"

    .line 8
    .line 9
    const-string v4, "type"

    .line 10
    .line 11
    new-instance v5, Lorg/json/JSONArray;

    .line 12
    .line 13
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    .line 17
    .line 18
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v7, "wifi"

    .line 22
    .line 23
    invoke-virtual {v6, v4, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->d(Landroid/content/Context;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    invoke-virtual {v6, v3, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->i(Landroid/content/Context;)Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    invoke-virtual {v6, v2, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->y(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-virtual {v6, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->z(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v6, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    .line 53
    .line 54
    const-string v7, "configured"

    .line 55
    .line 56
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->x(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    :catchall_0
    :try_start_1
    new-instance v6, Lorg/json/JSONObject;

    .line 67
    .line 68
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string v7, "cellular"

    .line 72
    .line 73
    invoke-virtual {v6, v4, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->e(Landroid/content/Context;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-virtual {v6, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->j(Landroid/content/Context;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    const/4 v2, 0x0

    .line 91
    invoke-static {p0, v2}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;Z)Lorg/json/JSONArray;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v6, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->v(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {v6, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    .line 107
    .line 108
    :catchall_1
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-lez p0, :cond_0

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_0
    const/4 v5, 0x0

    .line 116
    :goto_0
    return-object v5
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

.method public static v(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 13
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    .line 1
    const-string v0, "cdmaDbm"

    .line 2
    .line 3
    sget-object v1, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->isLocationEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-object v2

    .line 13
    :cond_0
    sget-boolean v1, Lcom/tendcloud/tenddata/ab;->P:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_1
    if-nez p0, :cond_3

    .line 19
    .line 20
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 21
    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    return-object v2

    .line 26
    :cond_3
    :goto_0
    sget-object v1, Lcom/tendcloud/tenddata/o;->n:Lorg/json/JSONArray;

    .line 27
    .line 28
    if-eqz v1, :cond_5

    .line 29
    .line 30
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-gtz v1, :cond_4

    .line 35
    .line 36
    sget-boolean v1, Lcom/tendcloud/tenddata/o;->l:Z

    .line 37
    .line 38
    if-eqz v1, :cond_5

    .line 39
    .line 40
    :cond_4
    sget-object p0, Lcom/tendcloud/tenddata/o;->n:Lorg/json/JSONArray;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_5
    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    .line 44
    .line 45
    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_6

    .line 50
    .line 51
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    .line 52
    .line 53
    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_6

    .line 58
    .line 59
    return-object v2

    .line 60
    :cond_6
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 61
    .line 62
    if-nez v1, :cond_7

    .line 63
    .line 64
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    :cond_7
    new-instance p0, Lorg/json/JSONArray;

    .line 68
    .line 69
    invoke-direct {p0}, Lorg/json/JSONArray;-><init>()V

    .line 70
    .line 71
    .line 72
    const/16 v1, 0x11

    .line 73
    .line 74
    invoke-static {v1}, Lcom/tendcloud/tenddata/y;->a(I)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_12

    .line 79
    .line 80
    sget-object v1, Lcom/tendcloud/tenddata/o;->c:Landroid/telephony/TelephonyManager;

    .line 81
    .line 82
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getAllCellInfo()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-eqz v1, :cond_12

    .line 87
    .line 88
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    :catchall_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_12

    .line 97
    .line 98
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, Landroid/telephony/CellInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 103
    .line 104
    :try_start_1
    new-instance v4, Lorg/json/JSONObject;

    .line 105
    .line 106
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v5, "registered"

    .line 110
    .line 111
    invoke-virtual {v3}, Landroid/telephony/CellInfo;->isRegistered()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 116
    .line 117
    .line 118
    const-string v5, "ts"

    .line 119
    .line 120
    invoke-virtual {v3}, Landroid/telephony/CellInfo;->getTimeStamp()J

    .line 121
    .line 122
    .line 123
    move-result-wide v6

    .line 124
    invoke-virtual {v4, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 125
    .line 126
    .line 127
    instance-of v5, v3, Landroid/telephony/CellInfoGsm;

    .line 128
    .line 129
    const/4 v6, -0x1

    .line 130
    if-eqz v5, :cond_8

    .line 131
    .line 132
    const-string v5, "GSM"

    .line 133
    .line 134
    check-cast v3, Landroid/telephony/CellInfoGsm;

    .line 135
    .line 136
    invoke-virtual {v3}, Landroid/telephony/CellInfoGsm;->getCellIdentity()Landroid/telephony/CellIdentityGsm;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    invoke-virtual {v7}, Landroid/telephony/CellIdentityGsm;->getLac()I

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    invoke-virtual {v7}, Landroid/telephony/CellIdentityGsm;->getCid()I

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    invoke-virtual {v7}, Landroid/telephony/CellIdentityGsm;->getMcc()I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    invoke-virtual {v7}, Landroid/telephony/CellIdentityGsm;->getMnc()I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    invoke-virtual {v3}, Landroid/telephony/CellInfoGsm;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthGsm;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    move v11, v10

    .line 161
    move v10, v6

    .line 162
    goto/16 :goto_2

    .line 163
    .line 164
    :cond_8
    instance-of v5, v3, Landroid/telephony/CellInfoCdma;

    .line 165
    .line 166
    if-eqz v5, :cond_9

    .line 167
    .line 168
    const-string v5, "CDMA"

    .line 169
    .line 170
    check-cast v3, Landroid/telephony/CellInfoCdma;

    .line 171
    .line 172
    invoke-virtual {v3}, Landroid/telephony/CellInfoCdma;->getCellIdentity()Landroid/telephony/CellIdentityCdma;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-virtual {v7}, Landroid/telephony/CellIdentityCdma;->getSystemId()I

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    invoke-virtual {v7}, Landroid/telephony/CellIdentityCdma;->getNetworkId()I

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    invoke-virtual {v7}, Landroid/telephony/CellIdentityCdma;->getBasestationId()I

    .line 185
    .line 186
    .line 187
    move-result v10

    .line 188
    invoke-virtual {v3}, Landroid/telephony/CellInfoCdma;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthCdma;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v3}, Landroid/telephony/CellSignalStrengthCdma;->getCdmaDbm()I

    .line 193
    .line 194
    .line 195
    move-result v11

    .line 196
    invoke-virtual {v4, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3}, Landroid/telephony/CellSignalStrengthCdma;->getCdmaDbm()I

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    invoke-virtual {v4, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 204
    .line 205
    .line 206
    const-string v11, "cdmaEcio"

    .line 207
    .line 208
    invoke-virtual {v3}, Landroid/telephony/CellSignalStrengthCdma;->getCdmaEcio()I

    .line 209
    .line 210
    .line 211
    move-result v12

    .line 212
    invoke-virtual {v4, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 213
    .line 214
    .line 215
    const-string v11, "evdoDbm"

    .line 216
    .line 217
    invoke-virtual {v3}, Landroid/telephony/CellSignalStrengthCdma;->getEvdoDbm()I

    .line 218
    .line 219
    .line 220
    move-result v12

    .line 221
    invoke-virtual {v4, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 222
    .line 223
    .line 224
    const-string v11, "evdoEcio"

    .line 225
    .line 226
    invoke-virtual {v3}, Landroid/telephony/CellSignalStrengthCdma;->getEvdoEcio()I

    .line 227
    .line 228
    .line 229
    move-result v12

    .line 230
    invoke-virtual {v4, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 231
    .line 232
    .line 233
    const-string v11, "evdoSnr"

    .line 234
    .line 235
    invoke-virtual {v3}, Landroid/telephony/CellSignalStrengthCdma;->getEvdoSnr()I

    .line 236
    .line 237
    .line 238
    move-result v12

    .line 239
    invoke-virtual {v4, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 240
    .line 241
    .line 242
    const-string v11, "location"

    .line 243
    .line 244
    invoke-virtual {v7}, Landroid/telephony/CellIdentityCdma;->getLatitude()I

    .line 245
    .line 246
    .line 247
    move-result v12

    .line 248
    invoke-virtual {v7}, Landroid/telephony/CellIdentityCdma;->getLongitude()I

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    invoke-static {v12, v7}, Lcom/tendcloud/tenddata/o;->a(II)Lorg/json/JSONObject;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    invoke-virtual {v4, v11, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 257
    .line 258
    .line 259
    move v7, v6

    .line 260
    move v11, v7

    .line 261
    goto :goto_2

    .line 262
    :cond_9
    instance-of v5, v3, Landroid/telephony/CellInfoWcdma;

    .line 263
    .line 264
    if-eqz v5, :cond_a

    .line 265
    .line 266
    const-string v5, "WCDMA"

    .line 267
    .line 268
    check-cast v3, Landroid/telephony/CellInfoWcdma;

    .line 269
    .line 270
    invoke-virtual {v3}, Landroid/telephony/CellInfoWcdma;->getCellIdentity()Landroid/telephony/CellIdentityWcdma;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    invoke-virtual {v7}, Landroid/telephony/CellIdentityWcdma;->getLac()I

    .line 275
    .line 276
    .line 277
    move-result v8

    .line 278
    invoke-virtual {v7}, Landroid/telephony/CellIdentityWcdma;->getCid()I

    .line 279
    .line 280
    .line 281
    move-result v9

    .line 282
    invoke-virtual {v7}, Landroid/telephony/CellIdentityWcdma;->getPsc()I

    .line 283
    .line 284
    .line 285
    move-result v10

    .line 286
    invoke-virtual {v7}, Landroid/telephony/CellIdentityWcdma;->getMcc()I

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    invoke-virtual {v7}, Landroid/telephony/CellIdentityWcdma;->getMnc()I

    .line 291
    .line 292
    .line 293
    move-result v7

    .line 294
    invoke-virtual {v3}, Landroid/telephony/CellInfoWcdma;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthWcdma;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    goto :goto_2

    .line 299
    :cond_a
    instance-of v5, v3, Landroid/telephony/CellInfoLte;

    .line 300
    .line 301
    if-eqz v5, :cond_b

    .line 302
    .line 303
    const-string v5, "LTE"

    .line 304
    .line 305
    check-cast v3, Landroid/telephony/CellInfoLte;

    .line 306
    .line 307
    invoke-virtual {v3}, Landroid/telephony/CellInfoLte;->getCellIdentity()Landroid/telephony/CellIdentityLte;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    invoke-virtual {v7}, Landroid/telephony/CellIdentityLte;->getTac()I

    .line 312
    .line 313
    .line 314
    move-result v8

    .line 315
    invoke-virtual {v7}, Landroid/telephony/CellIdentityLte;->getPci()I

    .line 316
    .line 317
    .line 318
    move-result v9

    .line 319
    invoke-virtual {v7}, Landroid/telephony/CellIdentityLte;->getCi()I

    .line 320
    .line 321
    .line 322
    move-result v10

    .line 323
    invoke-virtual {v7}, Landroid/telephony/CellIdentityLte;->getMcc()I

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    invoke-virtual {v7}, Landroid/telephony/CellIdentityLte;->getMnc()I

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    invoke-virtual {v3}, Landroid/telephony/CellInfoLte;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthLte;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    goto :goto_2

    .line 336
    :cond_b
    move-object v3, v2

    .line 337
    move-object v5, v3

    .line 338
    move v7, v6

    .line 339
    move v8, v7

    .line 340
    move v9, v8

    .line 341
    move v10, v9

    .line 342
    move v11, v10

    .line 343
    :goto_2
    if-eq v8, v6, :cond_c

    .line 344
    .line 345
    const-string v12, "systemId"

    .line 346
    .line 347
    invoke-virtual {v4, v12, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 348
    .line 349
    .line 350
    :cond_c
    if-eq v9, v6, :cond_d

    .line 351
    .line 352
    const-string v8, "networkId"

    .line 353
    .line 354
    invoke-virtual {v4, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 355
    .line 356
    .line 357
    :cond_d
    if-eq v10, v6, :cond_e

    .line 358
    .line 359
    const-string v8, "basestationId"

    .line 360
    .line 361
    invoke-virtual {v4, v8, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 362
    .line 363
    .line 364
    :cond_e
    if-eq v11, v6, :cond_f

    .line 365
    .line 366
    const-string v8, "mcc"

    .line 367
    .line 368
    invoke-virtual {v4, v8, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 369
    .line 370
    .line 371
    :cond_f
    if-eq v7, v6, :cond_10

    .line 372
    .line 373
    const-string v6, "mnc"

    .line 374
    .line 375
    invoke-virtual {v4, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 376
    .line 377
    .line 378
    :cond_10
    if-eqz v3, :cond_11

    .line 379
    .line 380
    const-string v6, "asuLevel"

    .line 381
    .line 382
    invoke-virtual {v3}, Landroid/telephony/CellSignalStrength;->getAsuLevel()I

    .line 383
    .line 384
    .line 385
    move-result v7

    .line 386
    invoke-virtual {v4, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 387
    .line 388
    .line 389
    const-string v6, "dbm"

    .line 390
    .line 391
    invoke-virtual {v3}, Landroid/telephony/CellSignalStrength;->getDbm()I

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    invoke-virtual {v4, v6, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 396
    .line 397
    .line 398
    :cond_11
    const-string v3, "type"

    .line 399
    .line 400
    invoke-virtual {v4, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 401
    .line 402
    .line 403
    invoke-virtual {p0, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 404
    .line 405
    .line 406
    goto/16 :goto_1

    .line 407
    .line 408
    :cond_12
    const/4 v0, 0x1

    .line 409
    :try_start_2
    sput-boolean v0, Lcom/tendcloud/tenddata/o;->l:Z

    .line 410
    .line 411
    const/16 v0, 0x14

    .line 412
    .line 413
    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/o;->a(Lorg/json/JSONArray;I)Lorg/json/JSONArray;

    .line 414
    .line 415
    .line 416
    move-result-object p0

    .line 417
    sput-object p0, Lcom/tendcloud/tenddata/o;->n:Lorg/json/JSONArray;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 418
    .line 419
    return-object p0

    .line 420
    :catchall_1
    return-object v2
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
.end method

.method public static w(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/ab;->Q:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->isWiFiEnable()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_1
    :try_start_0
    const-string v0, "android.permission.ACCESS_WIFI_STATE"

    .line 17
    .line 18
    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    const-string v0, "wifi"

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-static {p0}, Lcom/tendcloud/tenddata/o;->i(Landroid/content/Context;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-eqz p0, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    move-object v1, p0

    .line 55
    :catchall_0
    :cond_2
    return-object v1
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

.method public static x(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 6

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/ab;->Q:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->isWiFiEnable()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_1
    sget-object v0, Lcom/tendcloud/tenddata/o;->s:Lorg/json/JSONArray;

    .line 17
    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-gtz v0, :cond_2

    .line 25
    .line 26
    sget-boolean v0, Lcom/tendcloud/tenddata/o;->p:Z

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    :cond_2
    sget-object p0, Lcom/tendcloud/tenddata/o;->s:Lorg/json/JSONArray;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_3
    :try_start_0
    const-string v0, "android.permission.ACCESS_WIFI_STATE"

    .line 34
    .line 35
    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_5

    .line 40
    .line 41
    const-string v0, "wifi"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Landroid/net/wifi/WifiManager;

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->getConfiguredNetworks()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_5

    .line 54
    .line 55
    new-instance v0, Lorg/json/JSONArray;

    .line 56
    .line 57
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    :catchall_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_4

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Landroid/net/wifi/WifiConfiguration;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 75
    .line 76
    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    .line 77
    .line 78
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string v4, "networkId"

    .line 82
    .line 83
    iget v5, v2, Landroid/net/wifi/WifiConfiguration;->networkId:I

    .line 84
    .line 85
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 86
    .line 87
    .line 88
    const-string v4, "priority"

    .line 89
    .line 90
    iget v5, v2, Landroid/net/wifi/WifiConfiguration;->priority:I

    .line 91
    .line 92
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    const-string v4, "name"

    .line 96
    .line 97
    iget-object v5, v2, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 100
    .line 101
    .line 102
    const-string v4, "id"

    .line 103
    .line 104
    iget-object v2, v2, Landroid/net/wifi/WifiConfiguration;->BSSID:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_4
    const/4 p0, 0x1

    .line 114
    :try_start_2
    sput-boolean p0, Lcom/tendcloud/tenddata/o;->p:Z

    .line 115
    .line 116
    const/16 p0, 0x1e

    .line 117
    .line 118
    invoke-static {v0, p0}, Lcom/tendcloud/tenddata/o;->b(Lorg/json/JSONArray;I)Lorg/json/JSONArray;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    sput-object p0, Lcom/tendcloud/tenddata/o;->s:Lorg/json/JSONArray;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 123
    .line 124
    return-object p0

    .line 125
    :catchall_1
    :cond_5
    return-object v1
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

.method public static y(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 7

    .line 1
    const-string v0, "ip"

    .line 2
    .line 3
    sget-boolean v1, Lcom/tendcloud/tenddata/ab;->Q:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    sget-object v1, Lcom/tendcloud/tenddata/o;->r:Lorg/json/JSONArray;

    .line 10
    .line 11
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-gtz v1, :cond_4

    .line 16
    .line 17
    sget-boolean v1, Lcom/tendcloud/tenddata/o;->o:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_1
    :try_start_0
    const-string v1, "android.permission.ACCESS_WIFI_STATE"

    .line 24
    .line 25
    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    const-string v1, "wifi"

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Landroid/net/wifi/WifiManager;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    const-string v3, "bssid"

    .line 52
    .line 53
    invoke-static {v3}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    new-instance v4, Lorg/json/JSONObject;

    .line 58
    .line 59
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 60
    .line 61
    .line 62
    :try_start_1
    const-string v5, "name"

    .line 63
    .line 64
    const-string v6, "ssid"

    .line 65
    .line 66
    invoke-static {v6}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    const-string v5, "id"

    .line 74
    .line 75
    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    const-string v3, "level"

    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getRssi()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-virtual {v4, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    const-string v3, "hidden"

    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getHiddenSSID()Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    invoke-virtual {v4, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getIpAddress()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-virtual {v4, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 101
    .line 102
    .line 103
    const-string v3, "speed"

    .line 104
    .line 105
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getLinkSpeed()I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    invoke-virtual {v4, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 110
    .line 111
    .line 112
    const-string v3, "networkId"

    .line 113
    .line 114
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getNetworkId()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    invoke-virtual {v4, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->getDhcpInfo()Landroid/net/DhcpInfo;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    if-eqz p0, :cond_2

    .line 126
    .line 127
    new-instance v1, Lorg/json/JSONObject;

    .line 128
    .line 129
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 130
    .line 131
    .line 132
    const-string v3, "dns1"

    .line 133
    .line 134
    iget v5, p0, Landroid/net/DhcpInfo;->dns1:I

    .line 135
    .line 136
    invoke-virtual {v1, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    const-string v3, "dns2"

    .line 140
    .line 141
    iget v5, p0, Landroid/net/DhcpInfo;->dns2:I

    .line 142
    .line 143
    invoke-virtual {v1, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 144
    .line 145
    .line 146
    const-string v3, "gw"

    .line 147
    .line 148
    iget v5, p0, Landroid/net/DhcpInfo;->gateway:I

    .line 149
    .line 150
    invoke-virtual {v1, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 151
    .line 152
    .line 153
    iget v3, p0, Landroid/net/DhcpInfo;->ipAddress:I

    .line 154
    .line 155
    invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 156
    .line 157
    .line 158
    const-string v0, "mask"

    .line 159
    .line 160
    iget v3, p0, Landroid/net/DhcpInfo;->netmask:I

    .line 161
    .line 162
    invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 163
    .line 164
    .line 165
    const-string v0, "server"

    .line 166
    .line 167
    iget v3, p0, Landroid/net/DhcpInfo;->serverAddress:I

    .line 168
    .line 169
    invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 170
    .line 171
    .line 172
    const-string v0, "leaseDuration"

    .line 173
    .line 174
    iget p0, p0, Landroid/net/DhcpInfo;->leaseDuration:I

    .line 175
    .line 176
    invoke-virtual {v1, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 177
    .line 178
    .line 179
    const-string p0, "dhcp"

    .line 180
    .line 181
    invoke-virtual {v4, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 182
    .line 183
    .line 184
    :catchall_0
    :cond_2
    const/4 p0, 0x1

    .line 185
    :try_start_2
    sput-boolean p0, Lcom/tendcloud/tenddata/o;->o:Z

    .line 186
    .line 187
    sget-object p0, Lcom/tendcloud/tenddata/o;->r:Lorg/json/JSONArray;

    .line 188
    .line 189
    invoke-virtual {p0, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 190
    .line 191
    .line 192
    sget-object p0, Lcom/tendcloud/tenddata/o;->r:Lorg/json/JSONArray;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 193
    .line 194
    return-object p0

    .line 195
    :catchall_1
    :cond_3
    return-object v2

    .line 196
    :cond_4
    :goto_0
    sget-object p0, Lcom/tendcloud/tenddata/o;->r:Lorg/json/JSONArray;

    .line 197
    .line 198
    return-object p0
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

.method public static declared-synchronized z(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 13

    .line 1
    const-class v0, Lcom/tendcloud/tenddata/o;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/tendcloud/tenddata/y;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-object v2

    .line 11
    :cond_0
    :try_start_1
    sget-boolean v1, Lcom/tendcloud/tenddata/ab;->Q:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-object v2

    .line 17
    :cond_1
    :try_start_2
    sget-object v1, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->isWiFiEnable()Z

    .line 20
    .line 21
    .line 22
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-object v2

    .line 27
    :cond_2
    :try_start_3
    sget-object v1, Lcom/tendcloud/tenddata/o;->t:Lorg/json/JSONArray;

    .line 28
    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-gtz v1, :cond_3

    .line 36
    .line 37
    sget-boolean v1, Lcom/tendcloud/tenddata/o;->q:Z

    .line 38
    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    :cond_3
    sget-object p0, Lcom/tendcloud/tenddata/o;->t:Lorg/json/JSONArray;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 42
    .line 43
    monitor-exit v0

    .line 44
    return-object p0

    .line 45
    :cond_4
    :try_start_4
    const-string v1, "android.permission.ACCESS_WIFI_STATE"

    .line 46
    .line 47
    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_a

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string v3, "wifi"

    .line 58
    .line 59
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Landroid/net/wifi/WifiManager;

    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_5

    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->isScanAlwaysAvailable()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_a

    .line 76
    .line 77
    :cond_5
    const-string v3, "android.permission.CHANGE_WIFI_STATE"

    .line 78
    .line 79
    invoke-static {p0, v3}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    const/4 v4, 0x1

    .line 84
    if-eqz v3, :cond_6

    .line 85
    .line 86
    sget-boolean v3, Lcom/tendcloud/tenddata/o;->u:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 87
    .line 88
    if-nez v3, :cond_6

    .line 89
    .line 90
    :try_start_5
    new-instance v3, Landroid/content/IntentFilter;

    .line 91
    .line 92
    const-string v5, "android.net.wifi.SCAN_RESULTS"

    .line 93
    .line 94
    invoke-direct {v3, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    sget-object v5, Lcom/tendcloud/tenddata/o;->v:Lcom/tendcloud/tenddata/o$b;

    .line 98
    .line 99
    invoke-virtual {p0, v5, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 100
    .line 101
    .line 102
    :catchall_0
    :try_start_6
    sput-boolean v4, Lcom/tendcloud/tenddata/o;->u:Z

    .line 103
    .line 104
    :cond_6
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->startScan()Z

    .line 105
    .line 106
    .line 107
    sget-object p0, Lcom/tendcloud/tenddata/o;->v:Lcom/tendcloud/tenddata/o$b;

    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/o$b;->await()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    sget-object v1, Lcom/tendcloud/tenddata/o;->v:Lcom/tendcloud/tenddata/o$b;

    .line 117
    .line 118
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/o$b;->reset()V

    .line 119
    .line 120
    .line 121
    if-eqz p0, :cond_a

    .line 122
    .line 123
    new-instance v1, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    :catchall_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_9

    .line 137
    .line 138
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    check-cast v3, Landroid/net/wifi/ScanResult;

    .line 143
    .line 144
    iget v5, v3, Landroid/net/wifi/ScanResult;->level:I

    .line 145
    .line 146
    const/16 v6, -0x55

    .line 147
    .line 148
    if-ge v5, v6, :cond_7

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_7
    new-instance v5, Lorg/json/JSONObject;

    .line 152
    .line 153
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 154
    .line 155
    .line 156
    :try_start_7
    const-string v6, "id"

    .line 157
    .line 158
    iget-object v7, v3, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 161
    .line 162
    .line 163
    const-string v6, "name"

    .line 164
    .line 165
    iget-object v7, v3, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 168
    .line 169
    .line 170
    const-string v6, "level"

    .line 171
    .line 172
    iget v7, v3, Landroid/net/wifi/ScanResult;->level:I

    .line 173
    .line 174
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 175
    .line 176
    .line 177
    const-string v6, "freq"

    .line 178
    .line 179
    iget v7, v3, Landroid/net/wifi/ScanResult;->frequency:I

    .line 180
    .line 181
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 182
    .line 183
    .line 184
    const/16 v6, 0x11

    .line 185
    .line 186
    invoke-static {v6}, Lcom/tendcloud/tenddata/y;->a(I)Z

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    if-eqz v6, :cond_8

    .line 191
    .line 192
    const-string v6, "ts"

    .line 193
    .line 194
    iget-wide v7, v3, Landroid/net/wifi/ScanResult;->timestamp:J

    .line 195
    .line 196
    invoke-virtual {v5, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 197
    .line 198
    .line 199
    const-string v6, "scanTs"

    .line 200
    .line 201
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 202
    .line 203
    .line 204
    move-result-wide v7

    .line 205
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 206
    .line 207
    .line 208
    move-result-wide v9

    .line 209
    sub-long/2addr v7, v9

    .line 210
    iget-wide v9, v3, Landroid/net/wifi/ScanResult;->timestamp:J

    .line 211
    .line 212
    const-wide/16 v11, 0x3e8

    .line 213
    .line 214
    div-long/2addr v9, v11

    .line 215
    add-long/2addr v7, v9

    .line 216
    invoke-virtual {v5, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 217
    .line 218
    .line 219
    :cond_8
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 220
    .line 221
    .line 222
    goto :goto_0

    .line 223
    :cond_9
    :try_start_8
    sput-boolean v4, Lcom/tendcloud/tenddata/o;->q:Z

    .line 224
    .line 225
    const/16 p0, 0x14

    .line 226
    .line 227
    invoke-static {v1, p0}, Lcom/tendcloud/tenddata/o;->a(Ljava/util/ArrayList;I)Lorg/json/JSONArray;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    sput-object p0, Lcom/tendcloud/tenddata/o;->t:Lorg/json/JSONArray;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 232
    .line 233
    monitor-exit v0

    .line 234
    return-object p0

    .line 235
    :catchall_2
    :cond_a
    monitor-exit v0

    .line 236
    return-object v2

    .line 237
    :catchall_3
    move-exception p0

    .line 238
    monitor-exit v0

    .line 239
    throw p0
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
