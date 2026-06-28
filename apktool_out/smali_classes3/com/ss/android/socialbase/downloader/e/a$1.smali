.class Lcom/ss/android/socialbase/downloader/e/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/socialbase/downloader/e/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/downloader/e/a;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/e/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 4
    .line 5
    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x1

    .line 8
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 9
    .line 10
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/e/a;->a(Lcom/ss/android/socialbase/downloader/e/a;)Lcom/ss/android/socialbase/downloader/f/a;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 15
    .line 16
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/e/a;->b(Lcom/ss/android/socialbase/downloader/e/a;)Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v4, v2, Lcom/ss/android/socialbase/downloader/f/a;->a:[B

    .line 21
    .line 22
    invoke-virtual {v3, v4}, Ljava/io/InputStream;->read([B)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    iput v3, v2, Lcom/ss/android/socialbase/downloader/f/a;->c:I

    .line 27
    .line 28
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 29
    .line 30
    invoke-static {v3, v2}, Lcom/ss/android/socialbase/downloader/e/a;->a(Lcom/ss/android/socialbase/downloader/e/a;Lcom/ss/android/socialbase/downloader/f/a;)V

    .line 31
    .line 32
    .line 33
    iget v2, v2, Lcom/ss/android/socialbase/downloader/f/a;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 34
    .line 35
    const/4 v3, -0x1

    .line 36
    if-ne v2, v3, :cond_0

    .line 37
    .line 38
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 39
    .line 40
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/e/a;->c(Lcom/ss/android/socialbase/downloader/e/a;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    monitor-enter v2

    .line 45
    :try_start_1
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 46
    .line 47
    invoke-static {v3, v1}, Lcom/ss/android/socialbase/downloader/e/a;->a(Lcom/ss/android/socialbase/downloader/e/a;Z)Z

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 51
    .line 52
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/e/a;->c(Lcom/ss/android/socialbase/downloader/e/a;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Ljava/lang/Object;->notify()V

    .line 57
    .line 58
    .line 59
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    new-array v1, v1, [Ljava/io/Closeable;

    .line 61
    .line 62
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 63
    .line 64
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/e/a;->b(Lcom/ss/android/socialbase/downloader/e/a;)Ljava/io/InputStream;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    aput-object v2, v1, v0

    .line 69
    .line 70
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    throw v0

    .line 77
    :catchall_1
    move-exception v2

    .line 78
    :try_start_3
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 79
    .line 80
    invoke-static {v3, v2}, Lcom/ss/android/socialbase/downloader/e/a;->a(Lcom/ss/android/socialbase/downloader/e/a;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 84
    .line 85
    .line 86
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 87
    .line 88
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/e/a;->c(Lcom/ss/android/socialbase/downloader/e/a;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    monitor-enter v2

    .line 93
    :try_start_4
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 94
    .line 95
    invoke-static {v3, v1}, Lcom/ss/android/socialbase/downloader/e/a;->a(Lcom/ss/android/socialbase/downloader/e/a;Z)Z

    .line 96
    .line 97
    .line 98
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 99
    .line 100
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/e/a;->c(Lcom/ss/android/socialbase/downloader/e/a;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v3}, Ljava/lang/Object;->notify()V

    .line 105
    .line 106
    .line 107
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 108
    new-array v1, v1, [Ljava/io/Closeable;

    .line 109
    .line 110
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 111
    .line 112
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/e/a;->b(Lcom/ss/android/socialbase/downloader/e/a;)Ljava/io/InputStream;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    aput-object v2, v1, v0

    .line 117
    .line 118
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 119
    .line 120
    .line 121
    :goto_0
    return-void

    .line 122
    :catchall_2
    move-exception v0

    .line 123
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 124
    throw v0

    .line 125
    :catchall_3
    move-exception v2

    .line 126
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 127
    .line 128
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/e/a;->c(Lcom/ss/android/socialbase/downloader/e/a;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    monitor-enter v3

    .line 133
    :try_start_6
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 134
    .line 135
    invoke-static {v4, v1}, Lcom/ss/android/socialbase/downloader/e/a;->a(Lcom/ss/android/socialbase/downloader/e/a;Z)Z

    .line 136
    .line 137
    .line 138
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 139
    .line 140
    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/e/a;->c(Lcom/ss/android/socialbase/downloader/e/a;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v4}, Ljava/lang/Object;->notify()V

    .line 145
    .line 146
    .line 147
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 148
    new-array v1, v1, [Ljava/io/Closeable;

    .line 149
    .line 150
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/e/a$1;->a:Lcom/ss/android/socialbase/downloader/e/a;

    .line 151
    .line 152
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/e/a;->b(Lcom/ss/android/socialbase/downloader/e/a;)Ljava/io/InputStream;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    aput-object v3, v1, v0

    .line 157
    .line 158
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 159
    .line 160
    .line 161
    throw v2

    .line 162
    :catchall_4
    move-exception v0

    .line 163
    :try_start_7
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 164
    throw v0
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
