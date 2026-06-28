.class public abstract Lorg/greenrobot/greendao/database/b;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/greenrobot/greendao/database/b$a;
    }
.end annotation


# instance fields
.field private final context:Landroid/content/Context;

.field private encryptedHelper:Lorg/greenrobot/greendao/database/b$a;

.field private loadSQLCipherNativeLibs:Z

.field private final name:Ljava/lang/String;

.field private final version:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0, p3}, Lorg/greenrobot/greendao/database/b;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    const/4 p3, 0x1

    .line 3
    iput-boolean p3, p0, Lorg/greenrobot/greendao/database/b;->loadSQLCipherNativeLibs:Z

    .line 4
    iput-object p1, p0, Lorg/greenrobot/greendao/database/b;->context:Landroid/content/Context;

    .line 5
    iput-object p2, p0, Lorg/greenrobot/greendao/database/b;->name:Ljava/lang/String;

    .line 6
    iput p4, p0, Lorg/greenrobot/greendao/database/b;->version:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 7
    invoke-direct/range {p0 .. p5}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)V

    const/4 p3, 0x1

    .line 8
    iput-boolean p3, p0, Lorg/greenrobot/greendao/database/b;->loadSQLCipherNativeLibs:Z

    .line 9
    iput-object p1, p0, Lorg/greenrobot/greendao/database/b;->context:Landroid/content/Context;

    .line 10
    iput-object p2, p0, Lorg/greenrobot/greendao/database/b;->name:Ljava/lang/String;

    .line 11
    iput p4, p0, Lorg/greenrobot/greendao/database/b;->version:I

    return-void
.end method

.method private checkEncryptedHelper()Lorg/greenrobot/greendao/database/b$a;
    .locals 9

    .line 1
    iget-object v0, p0, Lorg/greenrobot/greendao/database/b;->encryptedHelper:Lorg/greenrobot/greendao/database/b$a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    const-string v0, "net.sqlcipher.database.SQLiteOpenHelper"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 8
    .line 9
    .line 10
    :try_start_1
    const-string v0, "org.greenrobot.greendao.database.SqlCipherEncryptedHelper"

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x5

    .line 17
    new-array v2, v1, [Ljava/lang/Class;

    .line 18
    .line 19
    const-class v3, Lorg/greenrobot/greendao/database/b;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    aput-object v3, v2, v4

    .line 23
    .line 24
    const-class v3, Landroid/content/Context;

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    aput-object v3, v2, v5

    .line 28
    .line 29
    const-class v3, Ljava/lang/String;

    .line 30
    .line 31
    const/4 v6, 0x2

    .line 32
    aput-object v3, v2, v6

    .line 33
    .line 34
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    const/4 v7, 0x3

    .line 37
    aput-object v3, v2, v7

    .line 38
    .line 39
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    const/4 v8, 0x4

    .line 42
    aput-object v3, v2, v8

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-array v1, v1, [Ljava/lang/Object;

    .line 49
    .line 50
    aput-object p0, v1, v4

    .line 51
    .line 52
    iget-object v2, p0, Lorg/greenrobot/greendao/database/b;->context:Landroid/content/Context;

    .line 53
    .line 54
    aput-object v2, v1, v5

    .line 55
    .line 56
    iget-object v2, p0, Lorg/greenrobot/greendao/database/b;->name:Ljava/lang/String;

    .line 57
    .line 58
    aput-object v2, v1, v6

    .line 59
    .line 60
    iget v2, p0, Lorg/greenrobot/greendao/database/b;->version:I

    .line 61
    .line 62
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    aput-object v2, v1, v7

    .line 67
    .line 68
    iget-boolean v2, p0, Lorg/greenrobot/greendao/database/b;->loadSQLCipherNativeLibs:Z

    .line 69
    .line 70
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    aput-object v2, v1, v8

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Lorg/greenrobot/greendao/database/b$a;

    .line 81
    .line 82
    iput-object v0, p0, Lorg/greenrobot/greendao/database/b;->encryptedHelper:Lorg/greenrobot/greendao/database/b$a;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catch_0
    move-exception v0

    .line 86
    new-instance v1, Lorg/greenrobot/greendao/d;

    .line 87
    .line 88
    invoke-direct {v1, v0}, Lorg/greenrobot/greendao/d;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    throw v1

    .line 92
    :catch_1
    new-instance v0, Lorg/greenrobot/greendao/d;

    .line 93
    .line 94
    const-string v1, "Using an encrypted database requires SQLCipher, make sure to add it to dependencies: https://greenrobot.org/greendao/documentation/database-encryption/"

    .line 95
    .line 96
    invoke-direct {v0, v1}, Lorg/greenrobot/greendao/d;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/greenrobot/greendao/database/b;->encryptedHelper:Lorg/greenrobot/greendao/database/b$a;

    .line 101
    .line 102
    return-object v0
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


# virtual methods
.method public getEncryptedReadableDb(Ljava/lang/String;)Lorg/greenrobot/greendao/database/a;
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/greenrobot/greendao/database/b;->checkEncryptedHelper()Lorg/greenrobot/greendao/database/b$a;

    move-result-object v0

    .line 2
    invoke-interface {v0, p1}, Lorg/greenrobot/greendao/database/b$a;->a(Ljava/lang/String;)Lorg/greenrobot/greendao/database/a;

    move-result-object p1

    return-object p1
.end method

.method public getEncryptedReadableDb([C)Lorg/greenrobot/greendao/database/a;
    .locals 1

    .line 3
    invoke-direct {p0}, Lorg/greenrobot/greendao/database/b;->checkEncryptedHelper()Lorg/greenrobot/greendao/database/b$a;

    move-result-object v0

    .line 4
    invoke-interface {v0, p1}, Lorg/greenrobot/greendao/database/b$a;->c([C)Lorg/greenrobot/greendao/database/a;

    move-result-object p1

    return-object p1
.end method

.method public getEncryptedWritableDb(Ljava/lang/String;)Lorg/greenrobot/greendao/database/a;
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/greenrobot/greendao/database/b;->checkEncryptedHelper()Lorg/greenrobot/greendao/database/b$a;

    move-result-object v0

    .line 2
    invoke-interface {v0, p1}, Lorg/greenrobot/greendao/database/b$a;->b(Ljava/lang/String;)Lorg/greenrobot/greendao/database/a;

    move-result-object p1

    return-object p1
.end method

.method public getEncryptedWritableDb([C)Lorg/greenrobot/greendao/database/a;
    .locals 1

    .line 3
    invoke-direct {p0}, Lorg/greenrobot/greendao/database/b;->checkEncryptedHelper()Lorg/greenrobot/greendao/database/b$a;

    move-result-object v0

    .line 4
    invoke-interface {v0, p1}, Lorg/greenrobot/greendao/database/b$a;->d([C)Lorg/greenrobot/greendao/database/a;

    move-result-object p1

    return-object p1
.end method

.method public getReadableDb()Lorg/greenrobot/greendao/database/a;
    .locals 1

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/database/b;->wrap(Landroid/database/sqlite/SQLiteDatabase;)Lorg/greenrobot/greendao/database/a;

    move-result-object v0

    return-object v0
.end method

.method public getWritableDb()Lorg/greenrobot/greendao/database/a;
    .locals 1

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/database/b;->wrap(Landroid/database/sqlite/SQLiteDatabase;)Lorg/greenrobot/greendao/database/a;

    move-result-object v0

    return-object v0
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    invoke-virtual {p0, p1}, Lorg/greenrobot/greendao/database/b;->wrap(Landroid/database/sqlite/SQLiteDatabase;)Lorg/greenrobot/greendao/database/a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/greenrobot/greendao/database/b;->onCreate(Lorg/greenrobot/greendao/database/a;)V

    return-void
.end method

.method public onCreate(Lorg/greenrobot/greendao/database/a;)V
    .locals 0

    return-void
.end method

.method public onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    invoke-virtual {p0, p1}, Lorg/greenrobot/greendao/database/b;->wrap(Landroid/database/sqlite/SQLiteDatabase;)Lorg/greenrobot/greendao/database/a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/greenrobot/greendao/database/b;->onOpen(Lorg/greenrobot/greendao/database/a;)V

    return-void
.end method

.method public onOpen(Lorg/greenrobot/greendao/database/a;)V
    .locals 0

    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    invoke-virtual {p0, p1}, Lorg/greenrobot/greendao/database/b;->wrap(Landroid/database/sqlite/SQLiteDatabase;)Lorg/greenrobot/greendao/database/a;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3}, Lorg/greenrobot/greendao/database/b;->onUpgrade(Lorg/greenrobot/greendao/database/a;II)V

    return-void
.end method

.method public onUpgrade(Lorg/greenrobot/greendao/database/a;II)V
    .locals 0

    return-void
.end method

.method public setLoadSQLCipherNativeLibs(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/greenrobot/greendao/database/b;->loadSQLCipherNativeLibs:Z

    return-void
.end method

.method protected wrap(Landroid/database/sqlite/SQLiteDatabase;)Lorg/greenrobot/greendao/database/a;
    .locals 1

    new-instance v0, Lorg/greenrobot/greendao/database/f;

    invoke-direct {v0, p1}, Lorg/greenrobot/greendao/database/f;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    return-object v0
.end method
