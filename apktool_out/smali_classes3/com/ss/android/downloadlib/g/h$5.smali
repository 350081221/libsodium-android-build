.class final Lcom/ss/android/downloadlib/g/h$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/g/h;->e(Landroid/content/Context;Lcom/ss/android/downloadlib/addownload/b/e;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/ss/android/downloadlib/addownload/b/e;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/b/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/g/h$5;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/ss/android/downloadlib/g/h$5;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/ss/android/downloadlib/g/h$5;->c:Lcom/ss/android/downloadlib/addownload/b/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/g/h$5;->a:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "market://details?id="

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lcom/ss/android/downloadlib/g/h$5;->b:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/g/h;->a(Landroid/content/Context;Landroid/net/Uri;)Lcom/ss/android/downloadlib/addownload/b/g;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/ss/android/downloadlib/g/h$5;->c:Lcom/ss/android/downloadlib/addownload/b/e;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-static {v0, v1, v3}, Lcom/ss/android/downloadlib/b/a;->a(Lcom/ss/android/downloadlib/addownload/b/g;Lcom/ss/android/downloadlib/addownload/b/e;Z)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lorg/json/JSONObject;

    .line 37
    .line 38
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x2

    .line 42
    :try_start_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const-string v5, "m2_delay_millis"

    .line 47
    .line 48
    const/16 v6, 0x3e8

    .line 49
    .line 50
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    int-to-long v5, v5

    .line 55
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lcom/ss/android/downloadlib/a/a/a;->a()Lcom/ss/android/downloadlib/a/a/a;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    iget-object v6, p0, Lcom/ss/android/downloadlib/g/h$5;->a:Landroid/content/Context;

    .line 63
    .line 64
    invoke-virtual {v5, v6, v3}, Lcom/ss/android/downloadlib/a/a/a;->a(Landroid/content/Context;Z)Z

    .line 65
    .line 66
    .line 67
    new-instance v5, Lcom/ss/android/downloadlib/a/a/b;

    .line 68
    .line 69
    invoke-direct {v5}, Lcom/ss/android/downloadlib/a/a/b;-><init>()V

    .line 70
    .line 71
    .line 72
    iput v3, v5, Lcom/ss/android/downloadlib/a/a/b;->a:I

    .line 73
    .line 74
    const/4 v6, 0x0

    .line 75
    iput v6, v5, Lcom/ss/android/downloadlib/a/a/b;->b:I

    .line 76
    .line 77
    const-string v7, "s"

    .line 78
    .line 79
    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    const-string v8, "v"

    .line 84
    .line 85
    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-static {v4, v7}, Lcom/ss/android/socialbase/appdownloader/f/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    new-array v7, v3, [Ljava/lang/Object;

    .line 94
    .line 95
    iget-object v8, p0, Lcom/ss/android/downloadlib/g/h$5;->b:Ljava/lang/String;

    .line 96
    .line 97
    aput-object v8, v7, v6

    .line 98
    .line 99
    invoke-static {v4, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    iput-object v7, v5, Lcom/ss/android/downloadlib/a/a/b;->c:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {}, Lcom/ss/android/downloadlib/a/a/a;->a()Lcom/ss/android/downloadlib/a/a/a;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    const/4 v8, 0x0

    .line 110
    invoke-virtual {v7, v5, v8}, Lcom/ss/android/downloadlib/a/a/a;->a(Lcom/ss/android/downloadlib/a/a/b;Lcom/ss/android/downloadlib/a/a/d;)V

    .line 111
    .line 112
    .line 113
    invoke-static {}, Lcom/ss/android/downloadlib/a/a/a;->a()Lcom/ss/android/downloadlib/a/a/a;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v5}, Lcom/ss/android/downloadlib/a/a/a;->b()V

    .line 118
    .line 119
    .line 120
    iget-object v5, p0, Lcom/ss/android/downloadlib/g/h$5;->c:Lcom/ss/android/downloadlib/addownload/b/e;

    .line 121
    .line 122
    new-array v7, v3, [Ljava/lang/Object;

    .line 123
    .line 124
    iget-object v8, p0, Lcom/ss/android/downloadlib/g/h$5;->b:Ljava/lang/String;

    .line 125
    .line 126
    aput-object v8, v7, v6

    .line 127
    .line 128
    invoke-static {v4, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    const/4 v6, -0x1

    .line 133
    invoke-static {v5, v0, v6, v1, v4}, Lcom/ss/android/downloadlib/g/h;->a(Lcom/ss/android/downloadlib/addownload/b/e;Lorg/json/JSONObject;IILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :catchall_0
    move-exception v4

    .line 138
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 139
    .line 140
    .line 141
    iget-object v4, p0, Lcom/ss/android/downloadlib/g/h$5;->c:Lcom/ss/android/downloadlib/addownload/b/e;

    .line 142
    .line 143
    new-instance v5, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    iget-object v2, p0, Lcom/ss/android/downloadlib/g/h$5;->b:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-static {v4, v0, v3, v1, v2}, Lcom/ss/android/downloadlib/g/h;->a(Lcom/ss/android/downloadlib/addownload/b/e;Lorg/json/JSONObject;IILjava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :goto_0
    return-void
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
