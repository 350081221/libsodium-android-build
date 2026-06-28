.class public Lcom/ss/android/downloadlib/addownload/c/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;


# direct methods
.method public constructor <init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/c/b;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 5
    .line 6
    return-void
    .line 7
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/c/b;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/c/b;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/b/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/downloadad/api/a/b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "cleanspace_task"

    .line 24
    .line 25
    invoke-virtual {v1, v2, v0}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lcom/ss/android/downloadad/api/a/a;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/c/b;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {v1}, Lcom/ss/android/downloadlib/g/e;->a(I)D

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 39
    .line 40
    add-double/2addr v1, v3

    .line 41
    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/c/b;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 42
    .line 43
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    long-to-double v3, v3

    .line 48
    mul-double/2addr v1, v3

    .line 49
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Ljava/lang/Double;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v1

    .line 57
    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/c/b;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 58
    .line 59
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    sub-long v9, v1, v3

    .line 64
    .line 65
    const-wide/16 v1, 0x0

    .line 66
    .line 67
    invoke-static {v1, v2}, Lcom/ss/android/downloadlib/g/m;->b(J)J

    .line 68
    .line 69
    .line 70
    move-result-wide v3

    .line 71
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->n()Lcom/ss/android/download/api/config/n;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    if-eqz v5, :cond_2

    .line 76
    .line 77
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->n()Lcom/ss/android/download/api/config/n;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-interface {v5}, Lcom/ss/android/download/api/config/n;->e()V

    .line 82
    .line 83
    .line 84
    :cond_2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/c/c;->a()V

    .line 85
    .line 86
    .line 87
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/c/c;->b()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/a/b;->s()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    invoke-static {v5}, Lcom/ss/android/downloadlib/g/e;->g(I)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-eqz v5, :cond_3

    .line 99
    .line 100
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-static {v5}, Lcom/ss/android/downloadlib/addownload/c/c;->a(Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    :cond_3
    invoke-static {v1, v2}, Lcom/ss/android/downloadlib/g/m;->b(J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v1

    .line 111
    cmp-long v5, v1, v9

    .line 112
    .line 113
    const/4 v11, 0x1

    .line 114
    const/4 v6, 0x0

    .line 115
    if-ltz v5, :cond_4

    .line 116
    .line 117
    move v5, v11

    .line 118
    goto :goto_0

    .line 119
    :cond_4
    move v5, v6

    .line 120
    :goto_0
    if-eqz v5, :cond_5

    .line 121
    .line 122
    const-string v5, "1"

    .line 123
    .line 124
    invoke-virtual {v0, v5}, Lcom/ss/android/downloadad/api/a/b;->l(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/i;->a()Lcom/ss/android/downloadlib/addownload/b/i;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {v5, v0}, Lcom/ss/android/downloadlib/addownload/b/i;->a(Lcom/ss/android/downloadad/api/a/b;)V

    .line 132
    .line 133
    .line 134
    new-instance v5, Lorg/json/JSONObject;

    .line 135
    .line 136
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 137
    .line 138
    .line 139
    :try_start_0
    const-string v6, "quite_clean_size"

    .line 140
    .line 141
    sub-long/2addr v1, v3

    .line 142
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v5, v6, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :catch_0
    move-exception v1

    .line 151
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 152
    .line 153
    .line 154
    :goto_1
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    const-string v2, "cleanspace_download_after_quite_clean"

    .line 159
    .line 160
    invoke-virtual {v1, v2, v5, v0}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    .line 161
    .line 162
    .line 163
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/c/b;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 172
    .line 173
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->restart(I)V

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_5
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->n()Lcom/ss/android/download/api/config/n;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    if-eqz v1, :cond_6

    .line 186
    .line 187
    invoke-virtual {v0, v6}, Lcom/ss/android/downloadad/api/a/b;->d(Z)V

    .line 188
    .line 189
    .line 190
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/c/d;->a()Lcom/ss/android/downloadlib/addownload/c/d;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/a/b;->a()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    new-instance v3, Lcom/ss/android/downloadlib/addownload/c/b$1;

    .line 199
    .line 200
    invoke-direct {v3, p0, v0}, Lcom/ss/android/downloadlib/addownload/c/b$1;-><init>(Lcom/ss/android/downloadlib/addownload/c/b;Lcom/ss/android/downloadad/api/a/b;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v2, v3}, Lcom/ss/android/downloadlib/addownload/c/d;->a(Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/c/e;)V

    .line 204
    .line 205
    .line 206
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->n()Lcom/ss/android/download/api/config/n;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/c/b;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 211
    .line 212
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/c/b;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 217
    .line 218
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUrl()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    const/4 v8, 0x1

    .line 223
    invoke-interface/range {v5 .. v10}, Lcom/ss/android/download/api/config/n;->a(ILjava/lang/String;ZJ)Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-eqz v1, :cond_7

    .line 228
    .line 229
    invoke-virtual {v0, v11}, Lcom/ss/android/downloadad/api/a/b;->e(Z)V

    .line 230
    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_6
    new-instance v1, Lorg/json/JSONObject;

    .line 234
    .line 235
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 236
    .line 237
    .line 238
    :try_start_1
    const-string v2, "show_dialog_result"

    .line 239
    .line 240
    const/4 v3, 0x3

    .line 241
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 246
    .line 247
    .line 248
    goto :goto_2

    .line 249
    :catch_1
    move-exception v2

    .line 250
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 251
    .line 252
    .line 253
    :goto_2
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    const-string v3, "cleanspace_window_show"

    .line 258
    .line 259
    invoke-virtual {v2, v3, v1, v0}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    .line 260
    .line 261
    .line 262
    :cond_7
    :goto_3
    return-void
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
