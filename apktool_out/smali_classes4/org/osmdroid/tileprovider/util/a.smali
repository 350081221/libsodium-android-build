.class public Lorg/osmdroid/tileprovider/util/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z = false

.field private static final b:Ljava/lang/String; = "CLOUDMADE_KEY"

.field private static final c:Ljava/lang/String; = "CLOUDMADE_ID"

.field private static final d:Ljava/lang/String; = "CLOUDMADE_TOKEN"

.field private static e:Ljava/lang/String; = "android_id"

.field private static f:Ljava/lang/String; = ""

.field private static g:Ljava/lang/String; = ""

.field private static h:Landroid/content/SharedPreferences$Editor;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lorg/osmdroid/tileprovider/util/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public static b()Ljava/lang/String;
    .locals 10

    .line 1
    sget-object v0, Lorg/osmdroid/tileprovider/util/a;->g:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_c

    .line 8
    .line 9
    sget-object v0, Lorg/osmdroid/tileprovider/util/a;->g:Ljava/lang/String;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, Lorg/osmdroid/tileprovider/util/a;->g:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_b

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v2, "https://auth.cloudmade.com/token/"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    sget-object v2, Lorg/osmdroid/tileprovider/util/a;->f:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, "?userid="

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    sget-object v2, Lorg/osmdroid/tileprovider/util/a;->e:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 49
    const/4 v2, 0x0

    .line 50
    :try_start_1
    new-instance v3, Ljava/net/URL;

    .line 51
    .line 52
    invoke-direct {v3, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Ljava/net/HttpURLConnection;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    :try_start_2
    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 63
    .line 64
    .line 65
    const-string v3, "POST"

    .line 66
    .line 67
    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v3, "Content-Type"

    .line 71
    .line 72
    const-string v4, "application/x-www-form-urlencoded"

    .line 73
    .line 74
    invoke-virtual {v1, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-interface {v3}, Lorg/osmdroid/config/c;->r()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-interface {v4}, Lorg/osmdroid/config/c;->w()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v1, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-interface {v3}, Lorg/osmdroid/config/c;->n()Ljava/util/Map;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_0

    .line 117
    .line 118
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    check-cast v4, Ljava/util/Map$Entry;

    .line 123
    .line 124
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    check-cast v5, Ljava/lang/String;

    .line 129
    .line 130
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    check-cast v4, Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v1, v5, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_0
    invoke-virtual {v1}, Ljava/net/URLConnection;->connect()V

    .line 141
    .line 142
    .line 143
    sget-boolean v3, Lorg/osmdroid/tileprovider/util/a;->a:Z

    .line 144
    .line 145
    if-eqz v3, :cond_1

    .line 146
    .line 147
    const-string v3, "OsmDroid"

    .line 148
    .line 149
    new-instance v4, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    const-string v5, "Response from Cloudmade auth: "

    .line 155
    .line 156
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    :cond_1
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    const/16 v4, 0xc8

    .line 178
    .line 179
    if-ne v3, v4, :cond_4

    .line 180
    .line 181
    new-instance v3, Ljava/io/InputStreamReader;

    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    const-string v5, "UTF-8"

    .line 188
    .line 189
    invoke-direct {v3, v4, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 190
    .line 191
    .line 192
    :try_start_3
    new-instance v4, Ljava/io/BufferedReader;

    .line 193
    .line 194
    const/16 v5, 0x2000

    .line 195
    .line 196
    invoke-direct {v4, v3, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 197
    .line 198
    .line 199
    :try_start_4
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    sget-boolean v6, Lorg/osmdroid/tileprovider/util/a;->a:Z

    .line 204
    .line 205
    if-eqz v6, :cond_2

    .line 206
    .line 207
    const-string v6, "OsmDroid"

    .line 208
    .line 209
    new-instance v7, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    const-string v8, "First line from Cloudmade auth: "

    .line 215
    .line 216
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    :cond_2
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    sput-object v5, Lorg/osmdroid/tileprovider/util/a;->g:Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    if-lez v5, :cond_3

    .line 240
    .line 241
    sget-object v5, Lorg/osmdroid/tileprovider/util/a;->h:Landroid/content/SharedPreferences$Editor;

    .line 242
    .line 243
    const-string v6, "CLOUDMADE_TOKEN"

    .line 244
    .line 245
    sget-object v7, Lorg/osmdroid/tileprovider/util/a;->g:Ljava/lang/String;

    .line 246
    .line 247
    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 248
    .line 249
    .line 250
    sget-object v5, Lorg/osmdroid/tileprovider/util/a;->h:Landroid/content/SharedPreferences$Editor;

    .line 251
    .line 252
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 253
    .line 254
    .line 255
    sput-object v2, Lorg/osmdroid/tileprovider/util/a;->h:Landroid/content/SharedPreferences$Editor;

    .line 256
    .line 257
    goto :goto_1

    .line 258
    :cond_3
    const-string v2, "OsmDroid"

    .line 259
    .line 260
    const-string v5, "No authorization token received from Cloudmade"

    .line 261
    .line 262
    invoke-static {v2, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 263
    .line 264
    .line 265
    :goto_1
    move-object v2, v4

    .line 266
    goto :goto_2

    .line 267
    :catchall_0
    move-exception v2

    .line 268
    move-object v9, v2

    .line 269
    move-object v2, v1

    .line 270
    move-object v1, v9

    .line 271
    goto/16 :goto_7

    .line 272
    .line 273
    :catch_0
    move-exception v2

    .line 274
    move-object v9, v2

    .line 275
    move-object v2, v1

    .line 276
    move-object v1, v9

    .line 277
    goto :goto_6

    .line 278
    :catchall_1
    move-exception v4

    .line 279
    move-object v9, v2

    .line 280
    move-object v2, v1

    .line 281
    move-object v1, v4

    .line 282
    move-object v4, v9

    .line 283
    goto :goto_7

    .line 284
    :catch_1
    move-exception v4

    .line 285
    move-object v9, v2

    .line 286
    move-object v2, v1

    .line 287
    move-object v1, v4

    .line 288
    move-object v4, v9

    .line 289
    goto :goto_6

    .line 290
    :cond_4
    move-object v3, v2

    .line 291
    :goto_2
    :try_start_5
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 292
    .line 293
    .line 294
    :catch_2
    if-eqz v2, :cond_5

    .line 295
    .line 296
    :try_start_6
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 297
    .line 298
    .line 299
    :catch_3
    :cond_5
    if-eqz v3, :cond_b

    .line 300
    .line 301
    :goto_3
    :try_start_7
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_b
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 302
    .line 303
    .line 304
    goto :goto_8

    .line 305
    :catchall_2
    move-exception v3

    .line 306
    move-object v4, v2

    .line 307
    move-object v2, v1

    .line 308
    goto :goto_4

    .line 309
    :catch_4
    move-exception v3

    .line 310
    move-object v4, v2

    .line 311
    move-object v2, v1

    .line 312
    goto :goto_5

    .line 313
    :catchall_3
    move-exception v3

    .line 314
    move-object v4, v2

    .line 315
    :goto_4
    move-object v1, v3

    .line 316
    move-object v3, v4

    .line 317
    goto :goto_7

    .line 318
    :catch_5
    move-exception v3

    .line 319
    move-object v4, v2

    .line 320
    :goto_5
    move-object v1, v3

    .line 321
    move-object v3, v4

    .line 322
    :goto_6
    :try_start_8
    const-string v5, "OsmDroid"

    .line 323
    .line 324
    new-instance v6, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 327
    .line 328
    .line 329
    const-string v7, "No authorization token received from Cloudmade: "

    .line 330
    .line 331
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    invoke-static {v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 342
    .line 343
    .line 344
    if-eqz v2, :cond_6

    .line 345
    .line 346
    :try_start_9
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 347
    .line 348
    .line 349
    :catch_6
    :cond_6
    if-eqz v4, :cond_7

    .line 350
    .line 351
    :try_start_a
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 352
    .line 353
    .line 354
    :catch_7
    :cond_7
    if-eqz v3, :cond_b

    .line 355
    .line 356
    goto :goto_3

    .line 357
    :catchall_4
    move-exception v1

    .line 358
    :goto_7
    if-eqz v2, :cond_8

    .line 359
    .line 360
    :try_start_b
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 361
    .line 362
    .line 363
    :catch_8
    :cond_8
    if-eqz v4, :cond_9

    .line 364
    .line 365
    :try_start_c
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_9
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 366
    .line 367
    .line 368
    :catch_9
    :cond_9
    if-eqz v3, :cond_a

    .line 369
    .line 370
    :try_start_d
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_a
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 371
    .line 372
    .line 373
    :catch_a
    :cond_a
    :try_start_e
    throw v1

    .line 374
    :catch_b
    :cond_b
    :goto_8
    monitor-exit v0

    .line 375
    goto :goto_9

    .line 376
    :catchall_5
    move-exception v1

    .line 377
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 378
    throw v1

    .line 379
    :cond_c
    :goto_9
    sget-object v0, Lorg/osmdroid/tileprovider/util/a;->g:Ljava/lang/String;

    .line 380
    .line 381
    return-object v0
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
    .line 461
    .line 462
    .line 463
    .line 464
.end method

.method public static c(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "android_id"

    .line 6
    .line 7
    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lorg/osmdroid/tileprovider/util/a;->e:Ljava/lang/String;

    .line 12
    .line 13
    const-string v0, "CLOUDMADE_KEY"

    .line 14
    .line 15
    invoke-static {p0, v0}, Lorg/osmdroid/tileprovider/util/ManifestUtil;->retrieveKey(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lorg/osmdroid/tileprovider/util/a;->f:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lorg/osmdroid/tileprovider/util/a;->h:Landroid/content/SharedPreferences$Editor;

    .line 30
    .line 31
    const-string v0, "CLOUDMADE_ID"

    .line 32
    .line 33
    const-string v1, ""

    .line 34
    .line 35
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    sget-object v3, Lorg/osmdroid/tileprovider/util/a;->e:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    const-string v0, "CLOUDMADE_TOKEN"

    .line 48
    .line 49
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    sput-object p0, Lorg/osmdroid/tileprovider/util/a;->g:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-lez p0, :cond_1

    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    sput-object p0, Lorg/osmdroid/tileprovider/util/a;->h:Landroid/content/SharedPreferences$Editor;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    sget-object p0, Lorg/osmdroid/tileprovider/util/a;->h:Landroid/content/SharedPreferences$Editor;

    .line 66
    .line 67
    sget-object v1, Lorg/osmdroid/tileprovider/util/a;->e:Ljava/lang/String;

    .line 68
    .line 69
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 70
    .line 71
    .line 72
    sget-object p0, Lorg/osmdroid/tileprovider/util/a;->h:Landroid/content/SharedPreferences$Editor;

    .line 73
    .line 74
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_0
    return-void
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
.end method

.method public static d(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lorg/osmdroid/tileprovider/util/a;->f:Ljava/lang/String;

    return-void
.end method
