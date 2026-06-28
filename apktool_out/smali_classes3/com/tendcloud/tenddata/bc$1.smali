.class Lcom/tendcloud/tenddata/bc$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/bc;->getShortUrl(Lcom/tendcloud/tenddata/TDGenerateUrl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/bc;

.field final synthetic val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;


# direct methods
.method constructor <init>(Lcom/tendcloud/tenddata/bc;Lcom/tendcloud/tenddata/TDGenerateUrl;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    iput-object p2, p0, Lcom/tendcloud/tenddata/bc$1;->val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 3
    .line 4
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    .line 8
    .line 9
    invoke-static {v2}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;)Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Ljava/lang/String;

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v2}, Lcom/tendcloud/tenddata/u;->a([B)[B

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iget-object v4, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    .line 68
    .line 69
    invoke-static {v4, v1, v3}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    new-instance v4, Ljava/net/URL;

    .line 74
    .line 75
    new-instance v5, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v6, "https://api.talkingdata.com/adt/openapi/rest/socialSharing/getShortUrl/v2?sign="

    .line 81
    .line 82
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, "&nonce="

    .line 89
    .line 90
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-direct {v4, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const/4 v1, 0x1

    .line 104
    new-array v3, v1, [Ljava/lang/String;

    .line 105
    .line 106
    new-instance v5, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    const-string v6, "Short url serve: "

    .line 112
    .line 113
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    const/4 v6, 0x0

    .line 124
    aput-object v5, v3, v6

    .line 125
    .line 126
    invoke-static {v3}, Lcom/tendcloud/tenddata/h;->dForInternal([Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    check-cast v3, Ljava/net/HttpURLConnection;

    .line 134
    .line 135
    const/16 v4, 0xbb8

    .line 136
    .line 137
    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 138
    .line 139
    .line 140
    const/16 v4, 0x3a98

    .line 141
    .line 142
    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3, v1}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, v1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 149
    .line 150
    .line 151
    const-string v4, "POST"

    .line 152
    .line 153
    invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v6}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 157
    .line 158
    .line 159
    const-string v4, "Content-Type"

    .line 160
    .line 161
    sget-object v5, Lcom/tendcloud/tenddata/an$a;->UNIVERSAL_STREAM:Lcom/tendcloud/tenddata/an$a;

    .line 162
    .line 163
    invoke-virtual {v5}, Lcom/tendcloud/tenddata/an$a;->getName()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-virtual {v3, v4, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const-string v4, "Content-Length"

    .line 171
    .line 172
    array-length v5, v2

    .line 173
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-virtual {v3, v4, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 181
    .line 182
    .line 183
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 184
    :try_start_1
    invoke-virtual {v4, v2}, Ljava/io/OutputStream;->write([B)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    const/16 v5, 0xc8

    .line 192
    .line 193
    if-ne v2, v5, :cond_3

    .line 194
    .line 195
    invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 196
    .line 197
    .line 198
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 199
    :try_start_2
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 200
    .line 201
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 202
    .line 203
    .line 204
    const/16 v7, 0x400

    .line 205
    .line 206
    :try_start_3
    new-array v7, v7, [B

    .line 207
    .line 208
    :goto_1
    invoke-virtual {v2, v7}, Ljava/io/InputStream;->read([B)I

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    if-lez v8, :cond_1

    .line 213
    .line 214
    invoke-virtual {v3, v7, v6, v8}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 215
    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_1
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    invoke-static {v7}, Lcom/tendcloud/tenddata/u;->b([B)[B

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    new-instance v8, Ljava/lang/String;

    .line 230
    .line 231
    const-string v9, "UTF-8"

    .line 232
    .line 233
    invoke-static {v9}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    invoke-direct {v8, v7, v9}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 238
    .line 239
    .line 240
    const/4 v7, 0x2

    .line 241
    new-array v9, v7, [Ljava/lang/String;

    .line 242
    .line 243
    const-string v10, "TD getShortUrl success:"

    .line 244
    .line 245
    aput-object v10, v9, v6

    .line 246
    .line 247
    aput-object v8, v9, v1

    .line 248
    .line 249
    invoke-static {v9}, Lcom/tendcloud/tenddata/h;->dForInternal([Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    new-instance v9, Lorg/json/JSONObject;

    .line 253
    .line 254
    invoke-direct {v9, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    const-string v10, "code"

    .line 258
    .line 259
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    if-eq v10, v5, :cond_2

    .line 264
    .line 265
    new-array v5, v7, [Ljava/lang/String;

    .line 266
    .line 267
    const-string v7, "TD getShortUrl Error:"

    .line 268
    .line 269
    aput-object v7, v5, v6

    .line 270
    .line 271
    aput-object v8, v5, v1

    .line 272
    .line 273
    invoke-static {v5}, Lcom/tendcloud/tenddata/h;->eForInternal([Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;

    .line 277
    .line 278
    invoke-interface {v1, v0}, Lcom/tendcloud/tenddata/TDGenerateUrl;->callback(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    goto :goto_2

    .line 282
    :cond_2
    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;

    .line 283
    .line 284
    const-string v5, "result"

    .line 285
    .line 286
    invoke-virtual {v9, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    invoke-interface {v1, v5}, Lcom/tendcloud/tenddata/TDGenerateUrl;->callback(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 291
    .line 292
    .line 293
    :goto_2
    move-object v0, v2

    .line 294
    goto :goto_3

    .line 295
    :catchall_0
    move-exception v1

    .line 296
    goto :goto_4

    .line 297
    :catchall_1
    move-exception v1

    .line 298
    move-object v3, v0

    .line 299
    goto :goto_4

    .line 300
    :cond_3
    :try_start_4
    new-array v1, v1, [Ljava/lang/String;

    .line 301
    .line 302
    new-instance v3, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 305
    .line 306
    .line 307
    const-string v5, "TD getShortUrl Http Error:"

    .line 308
    .line 309
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    aput-object v2, v1, v6

    .line 320
    .line 321
    invoke-static {v1}, Lcom/tendcloud/tenddata/h;->eForInternal([Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;

    .line 325
    .line 326
    invoke-interface {v1, v0}, Lcom/tendcloud/tenddata/TDGenerateUrl;->callback(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 327
    .line 328
    .line 329
    move-object v3, v0

    .line 330
    :goto_3
    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    .line 331
    .line 332
    invoke-static {v1, v4}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    .line 333
    .line 334
    .line 335
    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    .line 336
    .line 337
    invoke-static {v1, v0}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    .line 338
    .line 339
    .line 340
    goto :goto_5

    .line 341
    :catchall_2
    move-exception v1

    .line 342
    move-object v2, v0

    .line 343
    move-object v3, v2

    .line 344
    goto :goto_4

    .line 345
    :catchall_3
    move-exception v1

    .line 346
    move-object v2, v0

    .line 347
    move-object v3, v2

    .line 348
    move-object v4, v3

    .line 349
    :goto_4
    :try_start_5
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 350
    .line 351
    .line 352
    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;

    .line 353
    .line 354
    invoke-interface {v1, v0}, Lcom/tendcloud/tenddata/TDGenerateUrl;->callback(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 355
    .line 356
    .line 357
    iget-object v0, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    .line 358
    .line 359
    invoke-static {v0, v4}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    .line 360
    .line 361
    .line 362
    iget-object v0, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    .line 363
    .line 364
    invoke-static {v0, v2}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    .line 365
    .line 366
    .line 367
    :goto_5
    iget-object v0, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    .line 368
    .line 369
    invoke-static {v0, v3}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    .line 370
    .line 371
    .line 372
    return-void

    .line 373
    :catchall_4
    move-exception v0

    .line 374
    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    .line 375
    .line 376
    invoke-static {v1, v4}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    .line 377
    .line 378
    .line 379
    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    .line 380
    .line 381
    invoke-static {v1, v2}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    .line 382
    .line 383
    .line 384
    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    .line 385
    .line 386
    invoke-static {v1, v3}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    .line 387
    .line 388
    .line 389
    throw v0
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
