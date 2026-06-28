.class public final Lmirror/RefClass;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static REF_TYPES:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Constructor<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 1
    const-class v0, Lmirror/RefConstructor;

    .line 2
    .line 3
    const-class v1, Lmirror/RefStaticMethod;

    .line 4
    .line 5
    const-class v2, Lmirror/RefStaticInt;

    .line 6
    .line 7
    const-class v3, Lmirror/RefStaticObject;

    .line 8
    .line 9
    const-class v4, Lmirror/RefBoolean;

    .line 10
    .line 11
    const-class v5, Lmirror/RefDouble;

    .line 12
    .line 13
    const-class v6, Lmirror/RefFloat;

    .line 14
    .line 15
    const-class v7, Lmirror/RefLong;

    .line 16
    .line 17
    const-class v8, Lmirror/RefInt;

    .line 18
    .line 19
    const-class v9, Lmirror/RefMethod;

    .line 20
    .line 21
    const-class v10, Lmirror/RefObject;

    .line 22
    .line 23
    const-class v11, Ljava/lang/reflect/Field;

    .line 24
    .line 25
    const-class v12, Ljava/lang/Class;

    .line 26
    .line 27
    new-instance v13, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v13, Lmirror/RefClass;->REF_TYPES:Ljava/util/HashMap;

    .line 33
    .line 34
    const/4 v14, 0x2

    .line 35
    :try_start_0
    new-array v15, v14, [Ljava/lang/Class;

    .line 36
    .line 37
    const/16 v16, 0x0

    .line 38
    .line 39
    aput-object v12, v15, v16

    .line 40
    .line 41
    const/16 v17, 0x1

    .line 42
    .line 43
    aput-object v11, v15, v17

    .line 44
    .line 45
    invoke-virtual {v10, v15}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 46
    .line 47
    .line 48
    move-result-object v15

    .line 49
    invoke-virtual {v13, v10, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    sget-object v10, Lmirror/RefClass;->REF_TYPES:Ljava/util/HashMap;

    .line 53
    .line 54
    new-array v13, v14, [Ljava/lang/Class;

    .line 55
    .line 56
    aput-object v12, v13, v16

    .line 57
    .line 58
    aput-object v11, v13, v17

    .line 59
    .line 60
    invoke-virtual {v9, v13}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    invoke-virtual {v10, v9, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    sget-object v9, Lmirror/RefClass;->REF_TYPES:Ljava/util/HashMap;

    .line 68
    .line 69
    new-array v10, v14, [Ljava/lang/Class;

    .line 70
    .line 71
    aput-object v12, v10, v16

    .line 72
    .line 73
    aput-object v11, v10, v17

    .line 74
    .line 75
    invoke-virtual {v8, v10}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    invoke-virtual {v9, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    sget-object v8, Lmirror/RefClass;->REF_TYPES:Ljava/util/HashMap;

    .line 83
    .line 84
    new-array v9, v14, [Ljava/lang/Class;

    .line 85
    .line 86
    aput-object v12, v9, v16

    .line 87
    .line 88
    aput-object v11, v9, v17

    .line 89
    .line 90
    invoke-virtual {v7, v9}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    invoke-virtual {v8, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    sget-object v7, Lmirror/RefClass;->REF_TYPES:Ljava/util/HashMap;

    .line 98
    .line 99
    new-array v8, v14, [Ljava/lang/Class;

    .line 100
    .line 101
    aput-object v12, v8, v16

    .line 102
    .line 103
    aput-object v11, v8, v17

    .line 104
    .line 105
    invoke-virtual {v6, v8}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    invoke-virtual {v7, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    sget-object v6, Lmirror/RefClass;->REF_TYPES:Ljava/util/HashMap;

    .line 113
    .line 114
    new-array v7, v14, [Ljava/lang/Class;

    .line 115
    .line 116
    aput-object v12, v7, v16

    .line 117
    .line 118
    aput-object v11, v7, v17

    .line 119
    .line 120
    invoke-virtual {v5, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-virtual {v6, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    sget-object v5, Lmirror/RefClass;->REF_TYPES:Ljava/util/HashMap;

    .line 128
    .line 129
    new-array v6, v14, [Ljava/lang/Class;

    .line 130
    .line 131
    aput-object v12, v6, v16

    .line 132
    .line 133
    aput-object v11, v6, v17

    .line 134
    .line 135
    invoke-virtual {v4, v6}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-virtual {v5, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    sget-object v4, Lmirror/RefClass;->REF_TYPES:Ljava/util/HashMap;

    .line 143
    .line 144
    new-array v5, v14, [Ljava/lang/Class;

    .line 145
    .line 146
    aput-object v12, v5, v16

    .line 147
    .line 148
    aput-object v11, v5, v17

    .line 149
    .line 150
    invoke-virtual {v3, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {v4, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    sget-object v3, Lmirror/RefClass;->REF_TYPES:Ljava/util/HashMap;

    .line 158
    .line 159
    new-array v4, v14, [Ljava/lang/Class;

    .line 160
    .line 161
    aput-object v12, v4, v16

    .line 162
    .line 163
    aput-object v11, v4, v17

    .line 164
    .line 165
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {v3, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    sget-object v2, Lmirror/RefClass;->REF_TYPES:Ljava/util/HashMap;

    .line 173
    .line 174
    new-array v3, v14, [Ljava/lang/Class;

    .line 175
    .line 176
    aput-object v12, v3, v16

    .line 177
    .line 178
    aput-object v11, v3, v17

    .line 179
    .line 180
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    sget-object v1, Lmirror/RefClass;->REF_TYPES:Ljava/util/HashMap;

    .line 188
    .line 189
    new-array v2, v14, [Ljava/lang/Class;

    .line 190
    .line 191
    aput-object v12, v2, v16

    .line 192
    .line 193
    aput-object v11, v2, v17

    .line 194
    .line 195
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 200
    .line 201
    .line 202
    goto :goto_0

    .line 203
    :catch_0
    move-exception v0

    .line 204
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 205
    .line 206
    .line 207
    :goto_0
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static load(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Class;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object p0

    .line 3
    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    .line 4
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v4

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 5
    sget-object v4, Lmirror/RefClass;->REF_TYPES:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Constructor;

    if-eqz v4, :cond_0

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p1, v5, v1

    const/4 v6, 0x1

    aput-object v3, v5, v6

    .line 6
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method public static load(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    invoke-static {p0, p1}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method
