.class Lcom/ss/android/socialbase/appdownloader/e/c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/e/c;->a(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lcom/ss/android/socialbase/appdownloader/e/c;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/appdownloader/e/c;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/e/c$1;->c:Lcom/ss/android/socialbase/appdownloader/e/c;

    iput-object p2, p0, Lcom/ss/android/socialbase/appdownloader/e/c$1;->a:Ljava/lang/String;

    iput p3, p0, Lcom/ss/android/socialbase/appdownloader/e/c$1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x4

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x1

    .line 6
    const/4 v5, 0x0

    .line 7
    :try_start_0
    iget-object v6, p0, Lcom/ss/android/socialbase/appdownloader/e/c$1;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v4, v3, v6, v5}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(ZILjava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/i;

    .line 10
    .line 11
    .line 12
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 13
    if-nez v6, :cond_0

    .line 14
    .line 15
    new-array v2, v2, [Ljava/io/Closeable;

    .line 16
    .line 17
    aput-object v5, v2, v3

    .line 18
    .line 19
    aput-object v5, v2, v4

    .line 20
    .line 21
    aput-object v5, v2, v1

    .line 22
    .line 23
    aput-object v5, v2, v0

    .line 24
    .line 25
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    :try_start_1
    invoke-interface {v6}, Lcom/ss/android/socialbase/downloader/network/i;->a()Ljava/io/InputStream;

    .line 30
    .line 31
    .line 32
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 33
    :try_start_2
    invoke-static {v6}, Lcom/ss/android/socialbase/appdownloader/e/c;->a(Ljava/io/InputStream;)Ljava/io/ByteArrayOutputStream;

    .line 34
    .line 35
    .line 36
    move-result-object v7
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 37
    :try_start_3
    new-instance v8, Ljava/io/ByteArrayInputStream;

    .line 38
    .line 39
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    invoke-direct {v8, v9}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 44
    .line 45
    .line 46
    :try_start_4
    new-instance v9, Ljava/io/ByteArrayInputStream;

    .line 47
    .line 48
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    invoke-direct {v9, v10}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 53
    .line 54
    .line 55
    :try_start_5
    new-instance v10, Landroid/graphics/BitmapFactory$Options;

    .line 56
    .line 57
    invoke-direct {v10}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-boolean v4, v10, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 61
    .line 62
    invoke-static {v8, v5, v10}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    const/high16 v12, 0x42300000    # 44.0f

    .line 70
    .line 71
    invoke-static {v11, v12}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/content/Context;F)I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    invoke-static {v11, v11, v10}, Lcom/ss/android/socialbase/appdownloader/e/c;->a(IILandroid/graphics/BitmapFactory$Options;)I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    iput v11, v10, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 80
    .line 81
    iput-boolean v3, v10, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 82
    .line 83
    invoke-static {v9, v5, v10}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    iget-object v10, p0, Lcom/ss/android/socialbase/appdownloader/e/c$1;->c:Lcom/ss/android/socialbase/appdownloader/e/c;

    .line 88
    .line 89
    invoke-static {v10}, Lcom/ss/android/socialbase/appdownloader/e/c;->a(Lcom/ss/android/socialbase/appdownloader/e/c;)Lcom/ss/android/socialbase/appdownloader/e/c$a;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    iget v11, p0, Lcom/ss/android/socialbase/appdownloader/e/c$1;->b:I

    .line 94
    .line 95
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    invoke-virtual {v10, v11, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 100
    .line 101
    .line 102
    new-array v2, v2, [Ljava/io/Closeable;

    .line 103
    .line 104
    aput-object v6, v2, v3

    .line 105
    .line 106
    aput-object v7, v2, v4

    .line 107
    .line 108
    aput-object v8, v2, v1

    .line 109
    .line 110
    aput-object v9, v2, v0

    .line 111
    .line 112
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_1

    .line 116
    .line 117
    :catch_0
    move-exception v5

    .line 118
    goto :goto_0

    .line 119
    :catchall_0
    move-exception v9

    .line 120
    move-object v13, v9

    .line 121
    move-object v9, v5

    .line 122
    move-object v5, v13

    .line 123
    goto :goto_2

    .line 124
    :catch_1
    move-exception v9

    .line 125
    move-object v13, v9

    .line 126
    move-object v9, v5

    .line 127
    move-object v5, v13

    .line 128
    goto :goto_0

    .line 129
    :catchall_1
    move-exception v8

    .line 130
    move-object v9, v5

    .line 131
    move-object v5, v8

    .line 132
    move-object v8, v9

    .line 133
    goto :goto_2

    .line 134
    :catch_2
    move-exception v8

    .line 135
    move-object v9, v5

    .line 136
    move-object v5, v8

    .line 137
    move-object v8, v9

    .line 138
    goto :goto_0

    .line 139
    :catchall_2
    move-exception v7

    .line 140
    move-object v8, v5

    .line 141
    move-object v9, v8

    .line 142
    move-object v5, v7

    .line 143
    move-object v7, v9

    .line 144
    goto :goto_2

    .line 145
    :catch_3
    move-exception v7

    .line 146
    move-object v8, v5

    .line 147
    move-object v9, v8

    .line 148
    move-object v5, v7

    .line 149
    move-object v7, v9

    .line 150
    goto :goto_0

    .line 151
    :catchall_3
    move-exception v6

    .line 152
    move-object v7, v5

    .line 153
    move-object v8, v7

    .line 154
    move-object v9, v8

    .line 155
    move-object v5, v6

    .line 156
    move-object v6, v9

    .line 157
    goto :goto_2

    .line 158
    :catch_4
    move-exception v6

    .line 159
    move-object v7, v5

    .line 160
    move-object v8, v7

    .line 161
    move-object v9, v8

    .line 162
    move-object v5, v6

    .line 163
    move-object v6, v9

    .line 164
    :goto_0
    :try_start_6
    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 165
    .line 166
    .line 167
    new-array v2, v2, [Ljava/io/Closeable;

    .line 168
    .line 169
    aput-object v6, v2, v3

    .line 170
    .line 171
    aput-object v7, v2, v4

    .line 172
    .line 173
    aput-object v8, v2, v1

    .line 174
    .line 175
    aput-object v9, v2, v0

    .line 176
    .line 177
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 178
    .line 179
    .line 180
    :goto_1
    return-void

    .line 181
    :catchall_4
    move-exception v5

    .line 182
    :goto_2
    new-array v2, v2, [Ljava/io/Closeable;

    .line 183
    .line 184
    aput-object v6, v2, v3

    .line 185
    .line 186
    aput-object v7, v2, v4

    .line 187
    .line 188
    aput-object v8, v2, v1

    .line 189
    .line 190
    aput-object v9, v2, v0

    .line 191
    .line 192
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 193
    .line 194
    .line 195
    throw v5
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
