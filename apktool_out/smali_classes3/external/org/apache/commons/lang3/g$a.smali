.class Lexternal/org/apache/commons/lang3/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexternal/org/apache/commons/lang3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static final a:Ljava/lang/Throwable;

.field private static final b:Ljava/lang/reflect/Method;

.field private static final c:Ljava/util/regex/Pattern;

.field private static final d:Ljava/lang/Throwable;

.field private static final e:Ljava/lang/reflect/Method;

.field private static final f:Ljava/lang/Object;

.field private static final g:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const-string v0, "\\p{InCombiningDiacriticalMarks}+"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lexternal/org/apache/commons/lang3/g$a;->c:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    sput-object v0, Lexternal/org/apache/commons/lang3/g$a;->g:Ljava/util/regex/Pattern;

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const-string v5, "java.text.Normalizer$Form"

    .line 24
    .line 25
    invoke-virtual {v4, v5}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v5, "NFD"

    .line 30
    .line 31
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 39
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v6}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    const-string v7, "java.text.Normalizer"

    .line 48
    .line 49
    invoke-virtual {v6, v7}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    const-string v7, "normalize"

    .line 54
    .line 55
    new-array v8, v0, [Ljava/lang/Class;

    .line 56
    .line 57
    const-class v9, Ljava/lang/CharSequence;

    .line 58
    .line 59
    aput-object v9, v8, v2

    .line 60
    .line 61
    aput-object v4, v8, v1

    .line 62
    .line 63
    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    move-object v1, v3

    .line 68
    move-object v2, v1

    .line 69
    goto :goto_2

    .line 70
    :catch_0
    move-exception v4

    .line 71
    goto :goto_0

    .line 72
    :catch_1
    move-exception v4

    .line 73
    move-object v5, v3

    .line 74
    :goto_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v6}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    const-string v7, "sun.text.Normalizer"

    .line 83
    .line 84
    invoke-virtual {v6, v7}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    const-string v7, "decompose"

    .line 89
    .line 90
    const/4 v8, 0x3

    .line 91
    new-array v8, v8, [Ljava/lang/Class;

    .line 92
    .line 93
    const-class v9, Ljava/lang/String;

    .line 94
    .line 95
    aput-object v9, v8, v2

    .line 96
    .line 97
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 98
    .line 99
    aput-object v2, v8, v1

    .line 100
    .line 101
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 102
    .line 103
    aput-object v1, v8, v0

    .line 104
    .line 105
    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 106
    .line 107
    .line 108
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 109
    move-object v2, v0

    .line 110
    move-object v0, v3

    .line 111
    move-object v1, v0

    .line 112
    goto :goto_1

    .line 113
    :catch_2
    move-exception v0

    .line 114
    move-object v1, v0

    .line 115
    move-object v0, v3

    .line 116
    move-object v2, v0

    .line 117
    :goto_1
    move-object v3, v4

    .line 118
    :goto_2
    sput-object v3, Lexternal/org/apache/commons/lang3/g$a;->d:Ljava/lang/Throwable;

    .line 119
    .line 120
    sput-object v5, Lexternal/org/apache/commons/lang3/g$a;->f:Ljava/lang/Object;

    .line 121
    .line 122
    sput-object v0, Lexternal/org/apache/commons/lang3/g$a;->e:Ljava/lang/reflect/Method;

    .line 123
    .line 124
    sput-object v1, Lexternal/org/apache/commons/lang3/g$a;->a:Ljava/lang/Throwable;

    .line 125
    .line 126
    sput-object v2, Lexternal/org/apache/commons/lang3/g$a;->b:Ljava/lang/reflect/Method;

    .line 127
    .line 128
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Ljava/lang/reflect/Method;
    .locals 1

    sget-object v0, Lexternal/org/apache/commons/lang3/g$a;->e:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method static synthetic b()Ljava/lang/reflect/Method;
    .locals 1

    sget-object v0, Lexternal/org/apache/commons/lang3/g$a;->b:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method static synthetic c()Ljava/lang/Throwable;
    .locals 1

    sget-object v0, Lexternal/org/apache/commons/lang3/g$a;->d:Ljava/lang/Throwable;

    return-object v0
.end method

.method static synthetic d()Ljava/lang/Throwable;
    .locals 1

    sget-object v0, Lexternal/org/apache/commons/lang3/g$a;->a:Ljava/lang/Throwable;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lexternal/org/apache/commons/lang3/g$a;->f:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic f()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lexternal/org/apache/commons/lang3/g$a;->g:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method static synthetic g()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lexternal/org/apache/commons/lang3/g$a;->c:Ljava/util/regex/Pattern;

    return-object v0
.end method
