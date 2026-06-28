.class public Lcom/huawei/secure/android/common/detect/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "XpsDetect"

.field private static final b:Ljava/lang/String; = "64652e726f62762e616e64726f69642e78706f7365642e696e7374616c6c6572"

.field private static final c:Ljava/lang/String; = "64652e726f62762e616e64726f69642e78706f7365642e58706f736564427269646765"

.field private static final d:Ljava/lang/String; = "58706f7365644272696467652e6a6172"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a()Z
    .locals 9

    .line 1
    const-string v0, "XpsDetect"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Ljava/lang/SecurityException;

    .line 4
    .line 5
    const-string v2, "Xps detect exception"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    throw v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :catch_0
    move-exception v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    array-length v2, v1

    .line 17
    const/4 v3, 0x0

    .line 18
    move v4, v3

    .line 19
    :goto_0
    if-ge v4, v2, :cond_1

    .line 20
    .line 21
    aget-object v5, v1, v4

    .line 22
    .line 23
    const-string v6, "64652e726f62762e616e64726f69642e78706f7365642e58706f736564427269646765"

    .line 24
    .line 25
    invoke-static {v6}, Lz1/a;->c(Ljava/lang/String;)[B

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    :try_start_1
    new-instance v7, Ljava/lang/String;

    .line 30
    .line 31
    const-string v8, "UTF-8"

    .line 32
    .line 33
    invoke-direct {v7, v6, v8}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_0

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    const-string v6, "main"

    .line 51
    .line 52
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    const-string v5, "find Xps Bridge by exception class name"

    .line 59
    .line 60
    invoke-static {v0, v5}, Lz1/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    .line 61
    .line 62
    .line 63
    const/4 v3, 0x1

    .line 64
    goto :goto_1

    .line 65
    :catch_1
    const-string v5, "UnsupportedEncodingException"

    .line 66
    .line 67
    invoke-static {v0, v5}, Lz1/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    :goto_1
    return v3
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

.method private static b()Z
    .locals 8

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    const-string v1, "XpsDetect"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v4, "/proc/"

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v4, "/maps"

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v4, "58706f7365644272696467652e6a6172"

    .line 33
    .line 34
    invoke-static {v4}, Lz1/a;->c(Ljava/lang/String;)[B

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    new-instance v5, Ljava/lang/String;

    .line 39
    .line 40
    invoke-direct {v5, v4, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v4, Ljava/io/FileInputStream;

    .line 44
    .line 45
    invoke-direct {v4, v3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 46
    .line 47
    .line 48
    :try_start_1
    new-instance v3, Ljava/io/InputStreamReader;

    .line 49
    .line 50
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {v3, v4, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 55
    .line 56
    .line 57
    :try_start_2
    new-instance v0, Ljava/io/BufferedReader;

    .line 58
    .line 59
    invoke-direct {v0, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 60
    .line 61
    .line 62
    :cond_0
    :try_start_3
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-eqz v2, :cond_1

    .line 67
    .line 68
    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_0

    .line 73
    .line 74
    const-string v2, "Xps JAR found: "

    .line 75
    .line 76
    invoke-static {v1, v2}, Lz1/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, Lz1/b;->i(Ljava/io/Reader;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v3}, Lz1/b;->i(Ljava/io/Reader;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v4}, Lz1/b;->g(Ljava/io/InputStream;)V

    .line 86
    .line 87
    .line 88
    const/4 v0, 0x1

    .line 89
    return v0

    .line 90
    :cond_1
    invoke-static {v0}, Lz1/b;->i(Ljava/io/Reader;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v3}, Lz1/b;->i(Ljava/io/Reader;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v4}, Lz1/b;->g(Ljava/io/InputStream;)V

    .line 97
    .line 98
    .line 99
    goto/16 :goto_3

    .line 100
    .line 101
    :catchall_0
    move-exception v1

    .line 102
    goto :goto_1

    .line 103
    :catch_0
    move-exception v2

    .line 104
    move-object v7, v4

    .line 105
    move-object v4, v2

    .line 106
    goto :goto_0

    .line 107
    :catchall_1
    move-exception v0

    .line 108
    move-object v1, v0

    .line 109
    move-object v0, v2

    .line 110
    goto :goto_1

    .line 111
    :catch_1
    move-exception v0

    .line 112
    move-object v7, v4

    .line 113
    move-object v4, v0

    .line 114
    move-object v0, v2

    .line 115
    :goto_0
    move-object v2, v7

    .line 116
    goto :goto_2

    .line 117
    :catchall_2
    move-exception v0

    .line 118
    move-object v1, v0

    .line 119
    move-object v0, v2

    .line 120
    move-object v3, v0

    .line 121
    :goto_1
    move-object v2, v4

    .line 122
    goto :goto_4

    .line 123
    :catch_2
    move-exception v0

    .line 124
    move-object v3, v2

    .line 125
    move-object v2, v4

    .line 126
    move-object v4, v0

    .line 127
    move-object v0, v3

    .line 128
    goto :goto_2

    .line 129
    :catchall_3
    move-exception v0

    .line 130
    move-object v1, v0

    .line 131
    move-object v0, v2

    .line 132
    move-object v3, v0

    .line 133
    goto :goto_4

    .line 134
    :catch_3
    move-exception v0

    .line 135
    move-object v4, v0

    .line 136
    move-object v0, v2

    .line 137
    move-object v3, v0

    .line 138
    :goto_2
    :try_start_4
    new-instance v5, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    const-string v6, "Xps Jar Check "

    .line 144
    .line 145
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-static {v1, v4}, Lz1/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 160
    .line 161
    .line 162
    invoke-static {v0}, Lz1/b;->i(Ljava/io/Reader;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v3}, Lz1/b;->i(Ljava/io/Reader;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v2}, Lz1/b;->g(Ljava/io/InputStream;)V

    .line 169
    .line 170
    .line 171
    :goto_3
    const/4 v0, 0x0

    .line 172
    return v0

    .line 173
    :catchall_4
    move-exception v1

    .line 174
    :goto_4
    invoke-static {v0}, Lz1/b;->i(Ljava/io/Reader;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v3}, Lz1/b;->i(Ljava/io/Reader;)V

    .line 178
    .line 179
    .line 180
    invoke-static {v2}, Lz1/b;->g(Ljava/io/InputStream;)V

    .line 181
    .line 182
    .line 183
    throw v1
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

.method public static c(Landroid/content/Context;)Z
    .locals 0

    invoke-static {}, Lcom/huawei/secure/android/common/detect/d;->a()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/huawei/secure/android/common/detect/d;->b()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
