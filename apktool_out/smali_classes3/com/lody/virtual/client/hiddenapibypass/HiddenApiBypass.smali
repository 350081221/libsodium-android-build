.class public final Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final TAG:Ljava/lang/String; = "HiddenApiBypass"

.field private static final artOffset:J

.field private static final bias:J

.field private static final infoOffset:J

.field private static final memberOffset:J

.field private static final methodsOffset:J

.field private static final signaturePrefixes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final size:J

.field private static final unsafe:Lsun/misc/Unsafe;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const-class v0, Lcom/lody/virtual/client/hiddenapibypass/Helper$NeverCall;

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    .line 8
    sput-object v1, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->signaturePrefixes:Ljava/util/Set;

    .line 9
    .line 10
    :try_start_0
    const-class v1, Lsun/misc/Unsafe;

    .line 11
    .line 12
    const-string v2, "getUnsafe"

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    new-array v4, v3, [Ljava/lang/Class;

    .line 16
    .line 17
    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-array v2, v3, [Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-virtual {v1, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lsun/misc/Unsafe;

    .line 29
    .line 30
    sput-object v1, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->unsafe:Lsun/misc/Unsafe;

    .line 31
    .line 32
    const-class v2, Lcom/lody/virtual/client/hiddenapibypass/Helper$MethodHandle;

    .line 33
    .line 34
    const-string v4, "artFieldOrMethod"

    .line 35
    .line 36
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    sput-wide v4, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->artOffset:J

    .line 45
    .line 46
    const-class v2, Lcom/lody/virtual/client/hiddenapibypass/Helper$MethodHandleImpl;

    .line 47
    .line 48
    const-string v6, "info"

    .line 49
    .line 50
    invoke-virtual {v2, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v6

    .line 58
    sput-wide v6, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->infoOffset:J

    .line 59
    .line 60
    const-class v2, Lcom/lody/virtual/client/hiddenapibypass/Helper$Class;

    .line 61
    .line 62
    const-string v6, "methods"

    .line 63
    .line 64
    invoke-virtual {v2, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v6

    .line 72
    sput-wide v6, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->methodsOffset:J

    .line 73
    .line 74
    const-class v2, Lcom/lody/virtual/client/hiddenapibypass/Helper$HandleInfo;

    .line 75
    .line 76
    const-string v8, "member"

    .line 77
    .line 78
    invoke-virtual {v2, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 83
    .line 84
    .line 85
    move-result-wide v8

    .line 86
    sput-wide v8, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->memberOffset:J

    .line 87
    .line 88
    invoke-static {}, Lcom/lody/virtual/client/hiddenapibypass/b;->a()Ljava/lang/invoke/MethodHandles$Lookup;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    const-string v8, "a"

    .line 93
    .line 94
    new-array v9, v3, [Ljava/lang/Class;

    .line 95
    .line 96
    invoke-virtual {v0, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    invoke-static {v2, v8}, Lcom/lody/virtual/client/hiddenapibypass/c;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-static {}, Lcom/lody/virtual/client/hiddenapibypass/b;->a()Ljava/lang/invoke/MethodHandles$Lookup;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    const-string v9, "b"

    .line 109
    .line 110
    new-array v3, v3, [Ljava/lang/Class;

    .line 111
    .line 112
    invoke-virtual {v0, v9, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-static {v8, v3}, Lcom/lody/virtual/client/hiddenapibypass/c;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v1, v2, v4, v5}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 121
    .line 122
    .line 123
    move-result-wide v8

    .line 124
    invoke-virtual {v1, v3, v4, v5}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 125
    .line 126
    .line 127
    move-result-wide v2

    .line 128
    invoke-virtual {v1, v0, v6, v7}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 129
    .line 130
    .line 131
    move-result-wide v0

    .line 132
    sub-long/2addr v2, v8

    .line 133
    sput-wide v2, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->size:J

    .line 134
    .line 135
    sub-long/2addr v8, v0

    .line 136
    sub-long/2addr v8, v2

    .line 137
    sput-wide v8, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->bias:J
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    .line 139
    return-void

    .line 140
    :catch_0
    move-exception v0

    .line 141
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    .line 142
    .line 143
    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    throw v1
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
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/reflect/Executable;)Z
    .locals 0

    invoke-static {p0}, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->lambda$setHiddenApiExemptions$1(Ljava/lang/reflect/Executable;)Z

    move-result p0

    return p0
.end method

.method public static varargs addHiddenApiExemptions([Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->signaturePrefixes:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {v0, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    new-array p0, p0, [Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {v0, p0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->setHiddenApiExemptions([Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static synthetic b(Ljava/lang/reflect/Executable;)Z
    .locals 0

    invoke-static {p0}, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->lambda$setHiddenApiExemptions$0(Ljava/lang/reflect/Executable;)Z

    move-result p0

    return p0
.end method

.method public static clearHiddenApiExemptions()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->signaturePrefixes:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    new-array v0, v0, [Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->setHiddenApiExemptions([Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static getDeclaredMethods(Ljava/lang/Class;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Executable;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/hiddenapibypass/b;->a()Ljava/lang/invoke/MethodHandles$Lookup;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-class v2, Lcom/lody/virtual/client/hiddenapibypass/Helper$NeverCall;

    .line 24
    .line 25
    const-string v3, "a"

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    new-array v5, v4, [Ljava/lang/Class;

    .line 29
    .line 30
    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v1, v2}, Lcom/lody/virtual/client/hiddenapibypass/c;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;

    .line 35
    .line 36
    .line 37
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    sget-object v2, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->unsafe:Lsun/misc/Unsafe;

    .line 39
    .line 40
    sget-wide v5, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->methodsOffset:J

    .line 41
    .line 42
    invoke-virtual {v2, p0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v11

    .line 46
    invoke-virtual {v2, v11, v12}, Lsun/misc/Unsafe;->getInt(J)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    :goto_0
    if-ge v4, p0, :cond_1

    .line 51
    .line 52
    int-to-long v2, v4

    .line 53
    sget-wide v5, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->size:J

    .line 54
    .line 55
    mul-long/2addr v2, v5

    .line 56
    add-long/2addr v2, v11

    .line 57
    sget-wide v5, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->bias:J

    .line 58
    .line 59
    add-long v9, v2, v5

    .line 60
    .line 61
    sget-object v2, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->unsafe:Lsun/misc/Unsafe;

    .line 62
    .line 63
    sget-wide v7, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->artOffset:J

    .line 64
    .line 65
    move-object v5, v2

    .line 66
    move-object v6, v1

    .line 67
    invoke-virtual/range {v5 .. v10}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 68
    .line 69
    .line 70
    sget-wide v5, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->infoOffset:J

    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    invoke-virtual {v2, v1, v5, v6, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :try_start_1
    invoke-static {}, Lcom/lody/virtual/client/hiddenapibypass/b;->a()Ljava/lang/invoke/MethodHandles$Lookup;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-static {v2, v1}, Lcom/lody/virtual/client/hiddenapibypass/d;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandleInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    .line 83
    :catchall_0
    sget-object v2, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->unsafe:Lsun/misc/Unsafe;

    .line 84
    .line 85
    sget-wide v5, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->infoOffset:J

    .line 86
    .line 87
    invoke-virtual {v2, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Ljava/lang/invoke/MethodHandleInfo;

    .line 92
    .line 93
    sget-wide v5, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->memberOffset:J

    .line 94
    .line 95
    invoke-virtual {v2, v3, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Ljava/lang/reflect/Executable;

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    add-int/lit8 v4, v4, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catch_0
    :cond_1
    :goto_1
    return-object v0
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
.end method

.method private static synthetic lambda$setHiddenApiExemptions$0(Ljava/lang/reflect/Executable;)Z
    .locals 1

    invoke-static {p0}, Lcom/lody/virtual/client/hiddenapibypass/e;->a(Ljava/lang/reflect/Executable;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "getRuntime"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static synthetic lambda$setHiddenApiExemptions$1(Ljava/lang/reflect/Executable;)Z
    .locals 1

    invoke-static {p0}, Lcom/lody/virtual/client/hiddenapibypass/e;->a(Ljava/lang/reflect/Executable;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "setHiddenApiExemptions"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static varargs setHiddenApiExemptions([Ljava/lang/String;)Z
    .locals 6

    .line 1
    const-class v0, Ldalvik/system/VMRuntime;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/client/hiddenapibypass/HiddenApiBypass;->getDeclaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Lcom/lody/virtual/client/hiddenapibypass/f;

    .line 12
    .line 13
    invoke-direct {v2}, Lcom/lody/virtual/client/hiddenapibypass/f;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v2, Lcom/lody/virtual/client/hiddenapibypass/g;

    .line 29
    .line 30
    invoke-direct {v2}, Lcom/lody/virtual/client/hiddenapibypass/g;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v1}, Ljava/util/Optional;->isPresent()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/4 v3, 0x0

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/lang/reflect/Executable;

    .line 59
    .line 60
    const/4 v4, 0x1

    .line 61
    invoke-static {v2, v4}, Lcom/lody/virtual/client/hiddenapibypass/a;->a(Ljava/lang/reflect/Executable;Z)V

    .line 62
    .line 63
    .line 64
    :try_start_0
    invoke-virtual {v1}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/lang/reflect/Method;

    .line 69
    .line 70
    new-array v2, v3, [Ljava/lang/Object;

    .line 71
    .line 72
    const/4 v5, 0x0

    .line 73
    invoke-virtual {v1, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Ljava/lang/reflect/Executable;

    .line 82
    .line 83
    invoke-static {v2, v4}, Lcom/lody/virtual/client/hiddenapibypass/a;->a(Ljava/lang/reflect/Executable;Z)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Ljava/lang/reflect/Method;

    .line 91
    .line 92
    new-array v2, v4, [Ljava/lang/Object;

    .line 93
    .line 94
    aput-object p0, v2, v3

    .line 95
    .line 96
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    .line 98
    .line 99
    return v4

    .line 100
    :catch_0
    move-exception p0

    .line 101
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 102
    .line 103
    .line 104
    :cond_0
    return v3
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
.end method
