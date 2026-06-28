.class public final Lcom/uyumao/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 1
    sget-object v0, Lcom/uyumao/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    sget-object v1, Lcom/uyumao/o;->a:Lcom/uyumao/o;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    const-class v1, Lcom/uyumao/o;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    sget-object v2, Lcom/uyumao/o;->a:Lcom/uyumao/o;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lcom/uyumao/o;

    .line 15
    .line 16
    invoke-direct {v2, v0}, Lcom/uyumao/o;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, Lcom/uyumao/o;->a:Lcom/uyumao/o;

    .line 20
    .line 21
    :cond_0
    monitor-exit v1

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v0

    .line 26
    :cond_1
    :goto_0
    sget-object v0, Lcom/uyumao/o;->a:Lcom/uyumao/o;

    .line 27
    .line 28
    iget-object v1, v0, Lcom/uyumao/o;->b:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {v1}, Lcom/uyumao/n;->c(Landroid/content/Context;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    invoke-virtual {v0}, Lcom/uyumao/o;->a()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    iget-object v3, v0, Lcom/uyumao/o;->c:Lcom/uyumao/o$a;

    .line 42
    .line 43
    const-wide/16 v4, 0x1

    .line 44
    .line 45
    add-long/2addr v1, v4

    .line 46
    const-string v4, "smart_lc"

    .line 47
    .line 48
    invoke-virtual {v3, v4, v1, v2}, Lcom/uyumao/o$a;->b(Ljava/lang/String;J)V

    .line 49
    .line 50
    .line 51
    :goto_1
    iget-object v1, v0, Lcom/uyumao/o;->c:Lcom/uyumao/o$a;

    .line 52
    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    iget-object v1, v1, Lcom/uyumao/o$a;->a:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, "smart_lt"

    .line 64
    .line 65
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const/4 v2, 0x0

    .line 73
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    :try_start_1
    sget-object v4, Lcom/uyumao/e;->a:Landroid/content/Context;

    .line 78
    .line 79
    invoke-static {v4}, Lcom/uyumao/n;->c(Landroid/content/Context;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_3

    .line 84
    .line 85
    invoke-static {}, Lcom/uyumao/m;->a()Lcom/uyumao/m;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    iget-object v4, v4, Lcom/uyumao/m;->b:Landroid/content/SharedPreferences;

    .line 90
    .line 91
    invoke-interface {v4, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    goto :goto_2

    .line 96
    :catchall_1
    move-exception v0

    .line 97
    goto/16 :goto_5

    .line 98
    .line 99
    :catch_0
    move-exception v1

    .line 100
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 101
    .line 102
    .line 103
    :cond_3
    :goto_2
    :try_start_3
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 107
    goto :goto_3

    .line 108
    :catch_1
    move v1, v2

    .line 109
    :goto_3
    invoke-virtual {v0}, Lcom/uyumao/o;->a()J

    .line 110
    .line 111
    .line 112
    move-result-wide v3

    .line 113
    int-to-long v5, v1

    .line 114
    cmp-long v1, v3, v5

    .line 115
    .line 116
    if-gez v1, :cond_4

    .line 117
    .line 118
    return-void

    .line 119
    :cond_4
    const-string v1, "smart_"

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Lcom/uyumao/o;->a(Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_5

    .line 126
    .line 127
    return-void

    .line 128
    :cond_5
    :try_start_4
    sget-object v5, Lcom/uyumao/e;->a:Landroid/content/Context;

    .line 129
    .line 130
    invoke-static {v5}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppkey(Landroid/content/Context;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    new-instance v1, Lorg/json/JSONObject;

    .line 135
    .line 136
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 137
    .line 138
    .line 139
    const-string v3, "zid"

    .line 140
    .line 141
    :try_start_5
    invoke-static {v5}, Lcom/umeng/commonsdk/utils/UMUtils;->getZid(Landroid/content/Context;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 146
    .line 147
    .line 148
    const-string v3, "imei"

    .line 149
    .line 150
    :try_start_6
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getImeiNew(Landroid/content/Context;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 155
    .line 156
    .line 157
    const-string v3, "oaid"

    .line 158
    .line 159
    :try_start_7
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getOaid(Landroid/content/Context;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 164
    .line 165
    .line 166
    :catchall_2
    const-string v3, "idfa"

    .line 167
    .line 168
    :try_start_8
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getIdfa(Landroid/content/Context;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 173
    .line 174
    .line 175
    :catchall_3
    const-string v3, "umid"

    .line 176
    .line 177
    :try_start_9
    invoke-static {v5}, Lcom/umeng/commonsdk/utils/UMUtils;->getUMId(Landroid/content/Context;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 182
    .line 183
    .line 184
    const-string v3, "android_id"

    .line 185
    .line 186
    :try_start_a
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAndroidId(Landroid/content/Context;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 191
    .line 192
    .line 193
    const-string v3, "sdk_v"

    .line 194
    .line 195
    const-string v4, "1.1.2"

    .line 196
    .line 197
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 198
    .line 199
    .line 200
    const-string v3, "os_v"

    .line 201
    .line 202
    :try_start_b
    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 205
    .line 206
    .line 207
    const-string v3, "lvl"

    .line 208
    .line 209
    :try_start_c
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 210
    .line 211
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 212
    .line 213
    .line 214
    invoke-static {v5}, Lcom/umeng/commonsdk/utils/UMUtils;->getNetworkAccessMode(Landroid/content/Context;)[Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    aget-object v4, v3, v2

    .line 219
    .line 220
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    if-eqz v4, :cond_6

    .line 225
    .line 226
    const-string v4, "Unknown"

    .line 227
    .line 228
    aput-object v4, v3, v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 229
    .line 230
    :cond_6
    const-string v4, "net"

    .line 231
    .line 232
    :try_start_d
    aget-object v3, v3, v2

    .line 233
    .line 234
    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 235
    .line 236
    .line 237
    const-string v3, "brand"

    .line 238
    .line 239
    :try_start_e
    invoke-static {}, Lcom/uyumao/n;->b()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 244
    .line 245
    .line 246
    iget-object v3, v0, Lcom/uyumao/o;->c:Lcom/uyumao/o$a;

    .line 247
    .line 248
    const-string v4, "smart_ts"

    .line 249
    .line 250
    const-wide/16 v6, 0x0

    .line 251
    .line 252
    invoke-virtual {v3, v4, v6, v7}, Lcom/uyumao/o$a;->a(Ljava/lang/String;J)J

    .line 253
    .line 254
    .line 255
    move-result-wide v3

    .line 256
    cmp-long v9, v3, v6

    .line 257
    .line 258
    if-lez v9, :cond_7

    .line 259
    .line 260
    const-string v9, "last"

    .line 261
    .line 262
    invoke-virtual {v1, v9, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 263
    .line 264
    .line 265
    :cond_7
    :try_start_f
    const-string v3, "https://ccs.umeng.com/ra"

    .line 266
    .line 267
    invoke-static {v1, v3, v8, v2}, Lcom/uyumao/e;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 268
    .line 269
    .line 270
    move-result-object v1
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_2
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 271
    goto :goto_4

    .line 272
    :catch_2
    const/4 v1, 0x0

    .line 273
    :goto_4
    const-wide/16 v2, 0x1c20

    .line 274
    .line 275
    if-nez v1, :cond_8

    .line 276
    .line 277
    :try_start_10
    invoke-virtual {v0, v2, v3}, Lcom/uyumao/o;->a(J)V

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :cond_8
    const-string v4, "data"

    .line 282
    .line 283
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    if-nez v1, :cond_9

    .line 288
    .line 289
    invoke-virtual {v0, v2, v3}, Lcom/uyumao/o;->a(J)V

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :cond_9
    const-string v2, "aa"

    .line 294
    .line 295
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    if-nez v2, :cond_a

    .line 300
    .line 301
    new-instance v2, Lorg/json/JSONObject;

    .line 302
    .line 303
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 304
    .line 305
    .line 306
    :cond_a
    const-string v3, "launch"

    .line 307
    .line 308
    const/4 v4, 0x5

    .line 309
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    iget-object v4, v0, Lcom/uyumao/o;->c:Lcom/uyumao/o$a;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 314
    .line 315
    const-string v9, "smart_lt"

    .line 316
    .line 317
    :try_start_11
    new-instance v10, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 320
    .line 321
    .line 322
    iget-object v11, v4, Lcom/uyumao/o$a;->a:Ljava/lang/String;

    .line 323
    .line 324
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v9

    .line 334
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v10

    .line 338
    invoke-virtual {v4, v9, v10}, Lcom/uyumao/o$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0}, Lcom/uyumao/o;->a()J

    .line 342
    .line 343
    .line 344
    move-result-wide v9

    .line 345
    int-to-long v3, v3

    .line 346
    cmp-long v3, v9, v3

    .line 347
    .line 348
    if-gez v3, :cond_b

    .line 349
    .line 350
    return-void

    .line 351
    :cond_b
    const-string v3, "ttl"

    .line 352
    .line 353
    const-wide/32 v9, 0x15180

    .line 354
    .line 355
    .line 356
    invoke-virtual {v1, v3, v9, v10}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 357
    .line 358
    .line 359
    move-result-wide v3

    .line 360
    invoke-virtual {v0, v3, v4}, Lcom/uyumao/o;->a(J)V

    .line 361
    .line 362
    .line 363
    const-string v0, "id"

    .line 364
    .line 365
    const-wide/16 v3, -0x1

    .line 366
    .line 367
    invoke-virtual {v1, v0, v3, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 368
    .line 369
    .line 370
    move-result-wide v9

    .line 371
    cmp-long v0, v9, v6

    .line 372
    .line 373
    if-gtz v0, :cond_c

    .line 374
    .line 375
    return-void

    .line 376
    :cond_c
    const-string v0, "batch"

    .line 377
    .line 378
    const/16 v1, 0x12c

    .line 379
    .line 380
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    const/16 v1, 0x64

    .line 385
    .line 386
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 387
    .line 388
    .line 389
    move-result v7

    .line 390
    const-string v0, "action"

    .line 391
    .line 392
    const/4 v1, 0x1

    .line 393
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 394
    .line 395
    .line 396
    move-result v6

    .line 397
    const-string v0, "delay"

    .line 398
    .line 399
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    if-eq v6, v1, :cond_d

    .line 404
    .line 405
    const/4 v1, 0x2

    .line 406
    if-eq v6, v1, :cond_d

    .line 407
    .line 408
    return-void

    .line 409
    :cond_d
    new-instance v1, Lcom/uyumao/q$a;

    .line 410
    .line 411
    move-object v3, v1

    .line 412
    move-object v4, p0

    .line 413
    invoke-direct/range {v3 .. v10}, Lcom/uyumao/q$a;-><init>(Lcom/uyumao/q;Landroid/content/Context;IILjava/lang/String;J)V

    .line 414
    .line 415
    .line 416
    int-to-long v2, v0

    .line 417
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 418
    .line 419
    invoke-static {v1, v2, v3, v0}, Lcom/uyumao/s;->a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 420
    .line 421
    .line 422
    :catchall_4
    return-void

    .line 423
    :goto_5
    throw v0
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
