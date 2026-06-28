.class Lcom/tendcloud/tenddata/cr$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/cr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field private callback:Lcom/tendcloud/tenddata/cs;

.field private features:Lcom/tendcloud/tenddata/a;

.field private mFolderPath:Ljava/lang/String;

.field private final mOperation:Lcom/tendcloud/tenddata/cq;

.field private final opm:Lcom/tendcloud/tenddata/cr;

.field final synthetic this$0:Lcom/tendcloud/tenddata/cr;


# direct methods
.method private constructor <init>(Lcom/tendcloud/tenddata/cr;Lcom/tendcloud/tenddata/cq;Lcom/tendcloud/tenddata/bv;Lcom/tendcloud/tenddata/cr;)V
    .locals 2

    .line 2
    iput-object p1, p0, Lcom/tendcloud/tenddata/cr$c;->this$0:Lcom/tendcloud/tenddata/cr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    .line 4
    iput-object p4, p0, Lcom/tendcloud/tenddata/cr$c;->opm:Lcom/tendcloud/tenddata/cr;

    .line 5
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p3, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/a;->getDataFolder()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p0, Lcom/tendcloud/tenddata/cr$c;->mFolderPath:Ljava/lang/String;

    .line 6
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p3, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->getRootFolder()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p3, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    .line 7
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->getDataFolder()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/cr$c;->mFolderPath:Ljava/lang/String;

    .line 8
    iput-object p2, p0, Lcom/tendcloud/tenddata/cr$c;->mOperation:Lcom/tendcloud/tenddata/cq;

    .line 9
    iget-object p1, p3, Lcom/tendcloud/tenddata/bv;->f:Lcom/tendcloud/tenddata/cs;

    iput-object p1, p0, Lcom/tendcloud/tenddata/cr$c;->callback:Lcom/tendcloud/tenddata/cs;

    .line 10
    iget-object p1, p3, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    iput-object p1, p0, Lcom/tendcloud/tenddata/cr$c;->features:Lcom/tendcloud/tenddata/a;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tendcloud/tenddata/cr;Lcom/tendcloud/tenddata/cq;Lcom/tendcloud/tenddata/bv;Lcom/tendcloud/tenddata/cr;Lcom/tendcloud/tenddata/cr$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tendcloud/tenddata/cr$c;-><init>(Lcom/tendcloud/tenddata/cr;Lcom/tendcloud/tenddata/cq;Lcom/tendcloud/tenddata/bv;Lcom/tendcloud/tenddata/cr;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/tendcloud/tenddata/cr$c;->opm:Lcom/tendcloud/tenddata/cr;

    .line 3
    .line 4
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 5
    :try_start_1
    new-instance v2, Ljava/io/File;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/tendcloud/tenddata/cr$c;->mFolderPath:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    monitor-exit v1

    .line 31
    return-void

    .line 32
    :cond_0
    iget-object v3, p0, Lcom/tendcloud/tenddata/cr$c;->this$0:Lcom/tendcloud/tenddata/cr;

    .line 33
    .line 34
    iget-object v4, p0, Lcom/tendcloud/tenddata/cr$c;->features:Lcom/tendcloud/tenddata/a;

    .line 35
    .line 36
    invoke-static {v3, v2, v4}, Lcom/tendcloud/tenddata/cr;->a(Lcom/tendcloud/tenddata/cr;Ljava/io/File;Lcom/tendcloud/tenddata/a;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v3, p0, Lcom/tendcloud/tenddata/cr$c;->mFolderPath:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-object v3, p0, Lcom/tendcloud/tenddata/cr$c;->mOperation:Lcom/tendcloud/tenddata/cq;

    .line 55
    .line 56
    invoke-virtual {v3}, Lcom/tendcloud/tenddata/cq;->b()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    new-instance v3, Ljava/io/File;

    .line 68
    .line 69
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_1

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_1

    .line 83
    .line 84
    monitor-exit v1

    .line 85
    return-void

    .line 86
    :cond_1
    new-instance v2, Ljava/io/RandomAccessFile;

    .line 87
    .line 88
    const-string v4, "rw"

    .line 89
    .line 90
    invoke-direct {v2, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 91
    .line 92
    .line 93
    :try_start_2
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    .line 98
    .line 99
    .line 100
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 101
    const-wide/16 v4, 0x1

    .line 102
    .line 103
    :try_start_3
    invoke-virtual {v2, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 104
    .line 105
    .line 106
    iget-object v4, p0, Lcom/tendcloud/tenddata/cr$c;->mOperation:Lcom/tendcloud/tenddata/cq;

    .line 107
    .line 108
    invoke-virtual {v4}, Lcom/tendcloud/tenddata/cq;->d()I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    invoke-virtual {v2, v4}, Ljava/io/RandomAccessFile;->writeInt(I)V

    .line 113
    .line 114
    .line 115
    iget-object v4, p0, Lcom/tendcloud/tenddata/cr$c;->mOperation:Lcom/tendcloud/tenddata/cq;

    .line 116
    .line 117
    invoke-virtual {v4}, Lcom/tendcloud/tenddata/cq;->e()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    invoke-virtual {v2, v4}, Ljava/io/RandomAccessFile;->writeInt(I)V

    .line 122
    .line 123
    .line 124
    iget-object v4, p0, Lcom/tendcloud/tenddata/cr$c;->mOperation:Lcom/tendcloud/tenddata/cq;

    .line 125
    .line 126
    invoke-virtual {v4}, Lcom/tendcloud/tenddata/cq;->c()[B

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v2, v4}, Ljava/io/RandomAccessFile;->write([B)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v4}, Ljava/io/FileDescriptor;->sync()V

    .line 138
    .line 139
    .line 140
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 141
    if-eqz v3, :cond_2

    .line 142
    .line 143
    :try_start_4
    invoke-virtual {v3}, Ljava/nio/channels/FileLock;->release()V

    .line 144
    .line 145
    .line 146
    :cond_2
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lcom/tendcloud/tenddata/cr$c;->callback:Lcom/tendcloud/tenddata/cs;

    .line 150
    .line 151
    if-eqz v0, :cond_5

    .line 152
    .line 153
    :goto_0
    invoke-interface {v0}, Lcom/tendcloud/tenddata/cs;->onStoreSuccess()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :catchall_0
    move-exception v4

    .line 158
    move-object v6, v3

    .line 159
    move-object v3, v2

    .line 160
    move-object v2, v4

    .line 161
    move-object v4, v6

    .line 162
    goto :goto_1

    .line 163
    :catchall_1
    move-exception v3

    .line 164
    move-object v4, v0

    .line 165
    move-object v6, v3

    .line 166
    move-object v3, v2

    .line 167
    move-object v2, v6

    .line 168
    goto :goto_1

    .line 169
    :catchall_2
    move-exception v2

    .line 170
    move-object v3, v0

    .line 171
    move-object v4, v3

    .line 172
    :goto_1
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 173
    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 174
    :catchall_3
    move-exception v2

    .line 175
    goto :goto_1

    .line 176
    :catchall_4
    move-object v3, v0

    .line 177
    move-object v4, v3

    .line 178
    :catchall_5
    :try_start_7
    iget-object v1, p0, Lcom/tendcloud/tenddata/cr$c;->callback:Lcom/tendcloud/tenddata/cs;

    .line 179
    .line 180
    if-eqz v1, :cond_3

    .line 181
    .line 182
    invoke-interface {v1}, Lcom/tendcloud/tenddata/cs;->onStoreFailed()V

    .line 183
    .line 184
    .line 185
    iput-object v0, p0, Lcom/tendcloud/tenddata/cr$c;->callback:Lcom/tendcloud/tenddata/cs;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 186
    .line 187
    :cond_3
    if-eqz v4, :cond_4

    .line 188
    .line 189
    :try_start_8
    invoke-virtual {v4}, Ljava/nio/channels/FileLock;->release()V

    .line 190
    .line 191
    .line 192
    :cond_4
    if-eqz v3, :cond_5

    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V

    .line 195
    .line 196
    .line 197
    iget-object v0, p0, Lcom/tendcloud/tenddata/cr$c;->callback:Lcom/tendcloud/tenddata/cs;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 198
    .line 199
    if-eqz v0, :cond_5

    .line 200
    .line 201
    goto :goto_0

    .line 202
    :catchall_6
    :cond_5
    :goto_2
    return-void

    .line 203
    :catchall_7
    move-exception v0

    .line 204
    if-eqz v4, :cond_6

    .line 205
    .line 206
    :try_start_9
    invoke-virtual {v4}, Ljava/nio/channels/FileLock;->release()V

    .line 207
    .line 208
    .line 209
    :cond_6
    if-eqz v3, :cond_7

    .line 210
    .line 211
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V

    .line 212
    .line 213
    .line 214
    iget-object v1, p0, Lcom/tendcloud/tenddata/cr$c;->callback:Lcom/tendcloud/tenddata/cs;

    .line 215
    .line 216
    if-eqz v1, :cond_7

    .line 217
    .line 218
    invoke-interface {v1}, Lcom/tendcloud/tenddata/cs;->onStoreSuccess()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 219
    .line 220
    .line 221
    :catchall_8
    :cond_7
    throw v0
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
