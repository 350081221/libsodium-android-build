.class public Lcom/umeng/commonsdk/internal/utils/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/commonsdk/internal/utils/d$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/umeng/commonsdk/internal/utils/d$a;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    new-instance v2, Lcom/umeng/commonsdk/internal/utils/d$a;

    .line 4
    .line 5
    invoke-direct {v2}, Lcom/umeng/commonsdk/internal/utils/d$a;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 6
    .line 7
    .line 8
    :try_start_1
    new-instance v3, Ljava/io/FileReader;

    .line 9
    .line 10
    const-string v4, "/proc/cpuinfo"

    .line 11
    .line 12
    invoke-direct {v3, v4}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 13
    .line 14
    .line 15
    :try_start_2
    new-instance v4, Ljava/io/BufferedReader;

    .line 16
    .line 17
    invoke-direct {v4, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 18
    .line 19
    .line 20
    :try_start_3
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 24
    const/4 v5, 0x1

    .line 25
    move v6, v1

    .line 26
    move v8, v6

    .line 27
    move v7, v5

    .line 28
    :goto_0
    :try_start_4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    if-nez v9, :cond_d

    .line 33
    .line 34
    add-int/2addr v6, v5

    .line 35
    const/16 v9, 0x1e

    .line 36
    .line 37
    if-lt v6, v9, :cond_0

    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :cond_0
    const-string v9, ":\\s+"

    .line 42
    .line 43
    const/4 v10, 0x2

    .line 44
    invoke-virtual {v0, v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v7, :cond_1

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    array-length v9, v0

    .line 53
    if-le v9, v5, :cond_1

    .line 54
    .line 55
    aget-object v7, v0, v5

    .line 56
    .line 57
    iput-object v7, v2, Lcom/umeng/commonsdk/internal/utils/d$a;->a:Ljava/lang/String;

    .line 58
    .line 59
    move v7, v1

    .line 60
    :cond_1
    if-eqz v0, :cond_2

    .line 61
    .line 62
    array-length v9, v0

    .line 63
    if-le v9, v5, :cond_2

    .line 64
    .line 65
    aget-object v9, v0, v1

    .line 66
    .line 67
    const-string v10, "processor"

    .line 68
    .line 69
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    if-eqz v9, :cond_2

    .line 74
    .line 75
    add-int/lit8 v8, v8, 0x1

    .line 76
    .line 77
    :cond_2
    if-eqz v0, :cond_3

    .line 78
    .line 79
    array-length v9, v0

    .line 80
    if-le v9, v5, :cond_3

    .line 81
    .line 82
    aget-object v9, v0, v1

    .line 83
    .line 84
    const-string v10, "Features"

    .line 85
    .line 86
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-eqz v9, :cond_3

    .line 91
    .line 92
    aget-object v9, v0, v5

    .line 93
    .line 94
    iput-object v9, v2, Lcom/umeng/commonsdk/internal/utils/d$a;->d:Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 95
    .line 96
    :cond_3
    const-string v9, "implementer"

    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    :try_start_5
    array-length v10, v0

    .line 101
    if-le v10, v5, :cond_4

    .line 102
    .line 103
    aget-object v10, v0, v1

    .line 104
    .line 105
    invoke-virtual {v10, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-eqz v10, :cond_4

    .line 110
    .line 111
    aget-object v10, v0, v5

    .line 112
    .line 113
    iput-object v10, v2, Lcom/umeng/commonsdk/internal/utils/d$a;->e:Ljava/lang/String;

    .line 114
    .line 115
    :cond_4
    if-eqz v0, :cond_5

    .line 116
    .line 117
    array-length v10, v0

    .line 118
    if-le v10, v5, :cond_5

    .line 119
    .line 120
    aget-object v10, v0, v1

    .line 121
    .line 122
    const-string v11, "architecture"

    .line 123
    .line 124
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    if-eqz v10, :cond_5

    .line 129
    .line 130
    aget-object v10, v0, v5

    .line 131
    .line 132
    iput-object v10, v2, Lcom/umeng/commonsdk/internal/utils/d$a;->f:Ljava/lang/String;

    .line 133
    .line 134
    :cond_5
    if-eqz v0, :cond_6

    .line 135
    .line 136
    array-length v10, v0

    .line 137
    if-le v10, v5, :cond_6

    .line 138
    .line 139
    aget-object v10, v0, v1

    .line 140
    .line 141
    const-string v11, "variant"

    .line 142
    .line 143
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-eqz v10, :cond_6

    .line 148
    .line 149
    aget-object v10, v0, v5

    .line 150
    .line 151
    iput-object v10, v2, Lcom/umeng/commonsdk/internal/utils/d$a;->g:Ljava/lang/String;

    .line 152
    .line 153
    :cond_6
    if-eqz v0, :cond_7

    .line 154
    .line 155
    array-length v10, v0

    .line 156
    if-le v10, v5, :cond_7

    .line 157
    .line 158
    aget-object v10, v0, v1

    .line 159
    .line 160
    const-string v11, "part"

    .line 161
    .line 162
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    if-eqz v10, :cond_7

    .line 167
    .line 168
    aget-object v10, v0, v5

    .line 169
    .line 170
    iput-object v10, v2, Lcom/umeng/commonsdk/internal/utils/d$a;->h:Ljava/lang/String;

    .line 171
    .line 172
    :cond_7
    if-eqz v0, :cond_8

    .line 173
    .line 174
    array-length v10, v0

    .line 175
    if-le v10, v5, :cond_8

    .line 176
    .line 177
    aget-object v10, v0, v1

    .line 178
    .line 179
    const-string v11, "revision"

    .line 180
    .line 181
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    if-eqz v10, :cond_8

    .line 186
    .line 187
    aget-object v10, v0, v5

    .line 188
    .line 189
    iput-object v10, v2, Lcom/umeng/commonsdk/internal/utils/d$a;->i:Ljava/lang/String;

    .line 190
    .line 191
    :cond_8
    if-eqz v0, :cond_9

    .line 192
    .line 193
    array-length v10, v0

    .line 194
    if-le v10, v5, :cond_9

    .line 195
    .line 196
    aget-object v10, v0, v1

    .line 197
    .line 198
    const-string v11, "Hardware"

    .line 199
    .line 200
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 201
    .line 202
    .line 203
    move-result v10

    .line 204
    if-eqz v10, :cond_9

    .line 205
    .line 206
    aget-object v10, v0, v5

    .line 207
    .line 208
    iput-object v10, v2, Lcom/umeng/commonsdk/internal/utils/d$a;->j:Ljava/lang/String;

    .line 209
    .line 210
    :cond_9
    if-eqz v0, :cond_a

    .line 211
    .line 212
    array-length v10, v0

    .line 213
    if-le v10, v5, :cond_a

    .line 214
    .line 215
    aget-object v10, v0, v1

    .line 216
    .line 217
    const-string v11, "Revision"

    .line 218
    .line 219
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 220
    .line 221
    .line 222
    move-result v10

    .line 223
    if-eqz v10, :cond_a

    .line 224
    .line 225
    aget-object v10, v0, v5

    .line 226
    .line 227
    iput-object v10, v2, Lcom/umeng/commonsdk/internal/utils/d$a;->k:Ljava/lang/String;

    .line 228
    .line 229
    :cond_a
    if-eqz v0, :cond_b

    .line 230
    .line 231
    array-length v10, v0

    .line 232
    if-le v10, v5, :cond_b

    .line 233
    .line 234
    aget-object v10, v0, v1

    .line 235
    .line 236
    const-string v11, "Serial"

    .line 237
    .line 238
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    if-eqz v10, :cond_b

    .line 243
    .line 244
    aget-object v10, v0, v5

    .line 245
    .line 246
    iput-object v10, v2, Lcom/umeng/commonsdk/internal/utils/d$a;->l:Ljava/lang/String;

    .line 247
    .line 248
    :cond_b
    if-eqz v0, :cond_c

    .line 249
    .line 250
    array-length v10, v0

    .line 251
    if-le v10, v5, :cond_c

    .line 252
    .line 253
    aget-object v10, v0, v1

    .line 254
    .line 255
    invoke-virtual {v10, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 256
    .line 257
    .line 258
    move-result v9

    .line 259
    if-eqz v9, :cond_c

    .line 260
    .line 261
    aget-object v0, v0, v5

    .line 262
    .line 263
    iput-object v0, v2, Lcom/umeng/commonsdk/internal/utils/d$a;->e:Ljava/lang/String;

    .line 264
    .line 265
    :cond_c
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 269
    goto/16 :goto_0

    .line 270
    .line 271
    :cond_d
    :goto_1
    :try_start_6
    invoke-virtual {v3}, Ljava/io/Reader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    .line 272
    .line 273
    .line 274
    :catch_0
    :try_start_7
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_a

    .line 275
    .line 276
    .line 277
    goto :goto_5

    .line 278
    :catch_1
    move-object v0, v3

    .line 279
    move v1, v8

    .line 280
    goto :goto_4

    .line 281
    :catchall_0
    move-exception v0

    .line 282
    goto :goto_3

    .line 283
    :catchall_1
    move-exception v1

    .line 284
    move-object v4, v0

    .line 285
    goto :goto_2

    .line 286
    :catch_2
    move-object v4, v0

    .line 287
    :catch_3
    move-object v0, v3

    .line 288
    goto :goto_4

    .line 289
    :catch_4
    move-object v4, v0

    .line 290
    goto :goto_4

    .line 291
    :catchall_2
    move-exception v1

    .line 292
    move-object v3, v0

    .line 293
    move-object v4, v3

    .line 294
    :goto_2
    move-object v0, v1

    .line 295
    :goto_3
    if-eqz v3, :cond_e

    .line 296
    .line 297
    :try_start_8
    invoke-virtual {v3}, Ljava/io/Reader;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    .line 298
    .line 299
    .line 300
    :catch_5
    :cond_e
    if-eqz v4, :cond_f

    .line 301
    .line 302
    :try_start_9
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    .line 303
    .line 304
    .line 305
    :catch_6
    :cond_f
    throw v0

    .line 306
    :catch_7
    move-object v2, v0

    .line 307
    move-object v4, v2

    .line 308
    :goto_4
    if-eqz v0, :cond_10

    .line 309
    .line 310
    :try_start_a
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8

    .line 311
    .line 312
    .line 313
    :catch_8
    :cond_10
    if-eqz v4, :cond_11

    .line 314
    .line 315
    :try_start_b
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_9

    .line 316
    .line 317
    .line 318
    :catch_9
    :cond_11
    move v8, v1

    .line 319
    :catch_a
    :goto_5
    iput v8, v2, Lcom/umeng/commonsdk/internal/utils/d$a;->c:I

    .line 320
    .line 321
    return-object v2
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

.method public static b()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    const-string v1, "/system/bin/cat"

    .line 4
    .line 5
    const-string v2, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"

    .line 6
    .line 7
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Ljava/lang/ProcessBuilder;

    .line 12
    .line 13
    invoke-direct {v2, v1}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/16 v2, 0x18

    .line 25
    .line 26
    new-array v2, v2, [B

    .line 27
    .line 28
    :goto_0
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/4 v4, -0x1

    .line 33
    if-eq v3, v4, :cond_0

    .line 34
    .line 35
    new-instance v3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    new-instance v4, Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {v4, v2}, Ljava/lang/String;-><init>([B)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    :catch_0
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0
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

.method public static c()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    const-string v1, "/system/bin/cat"

    .line 4
    .line 5
    const-string v2, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"

    .line 6
    .line 7
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Ljava/lang/ProcessBuilder;

    .line 12
    .line 13
    invoke-direct {v2, v1}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/16 v2, 0x18

    .line 25
    .line 26
    new-array v2, v2, [B

    .line 27
    .line 28
    :goto_0
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/4 v4, -0x1

    .line 33
    if-eq v3, v4, :cond_0

    .line 34
    .line 35
    new-instance v3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    new-instance v4, Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {v4, v2}, Ljava/lang/String;-><init>([B)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    :catch_0
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0
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

.method public static d()Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/FileReader;

    .line 3
    .line 4
    const-string v2, "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"

    .line 5
    .line 6
    invoke-direct {v1, v2}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Ljava/io/BufferedReader;

    .line 10
    .line 11
    invoke-direct {v2, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    .line 14
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-object v0, v2

    .line 29
    goto :goto_1

    .line 30
    :catchall_1
    move-exception v1

    .line 31
    move-object v2, v0

    .line 32
    move-object v0, v1

    .line 33
    :goto_0
    if-eqz v2, :cond_0

    .line 34
    .line 35
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 36
    .line 37
    .line 38
    :catchall_2
    :cond_0
    throw v0

    .line 39
    :catch_1
    :goto_1
    if-eqz v0, :cond_1

    .line 40
    .line 41
    :try_start_4
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 42
    .line 43
    .line 44
    :catchall_3
    :cond_1
    const-string v0, ""

    .line 45
    .line 46
    :catchall_4
    :goto_2
    return-object v0
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
