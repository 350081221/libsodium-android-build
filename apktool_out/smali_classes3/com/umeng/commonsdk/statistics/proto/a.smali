.class public Lcom/umeng/commonsdk/statistics/proto/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/br;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/commonsdk/statistics/proto/a$c;,
        Lcom/umeng/commonsdk/statistics/proto/a$d;,
        Lcom/umeng/commonsdk/statistics/proto/a$a;,
        Lcom/umeng/commonsdk/statistics/proto/a$b;,
        Lcom/umeng/commonsdk/statistics/proto/a$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/umeng/analytics/pro/br<",
        "Lcom/umeng/commonsdk/statistics/proto/a;",
        "Lcom/umeng/commonsdk/statistics/proto/a$e;",
        ">;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field public static final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/umeng/commonsdk/statistics/proto/a$e;",
            "Lcom/umeng/analytics/pro/cd;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:J = 0x7ebdcad047a76397L

.field private static final g:Lcom/umeng/analytics/pro/cv;

.field private static final h:Lcom/umeng/analytics/pro/cl;

.field private static final i:Lcom/umeng/analytics/pro/cl;

.field private static final j:Lcom/umeng/analytics/pro/cl;

.field private static final k:Lcom/umeng/analytics/pro/cl;

.field private static final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/umeng/analytics/pro/cy;",
            ">;",
            "Lcom/umeng/analytics/pro/cz;",
            ">;"
        }
    .end annotation
.end field

.field private static final m:I


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:J

.field private n:B

.field private o:[Lcom/umeng/commonsdk/statistics/proto/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/cv;

    .line 2
    .line 3
    const-string v1, "IdJournal"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/cv;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->g:Lcom/umeng/analytics/pro/cv;

    .line 9
    .line 10
    new-instance v0, Lcom/umeng/analytics/pro/cl;

    .line 11
    .line 12
    const-string v1, "domain"

    .line 13
    .line 14
    const/16 v2, 0xb

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v0, v1, v2, v3}, Lcom/umeng/analytics/pro/cl;-><init>(Ljava/lang/String;BS)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->h:Lcom/umeng/analytics/pro/cl;

    .line 21
    .line 22
    new-instance v0, Lcom/umeng/analytics/pro/cl;

    .line 23
    .line 24
    const-string v4, "old_id"

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    invoke-direct {v0, v4, v2, v5}, Lcom/umeng/analytics/pro/cl;-><init>(Ljava/lang/String;BS)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->i:Lcom/umeng/analytics/pro/cl;

    .line 31
    .line 32
    new-instance v0, Lcom/umeng/analytics/pro/cl;

    .line 33
    .line 34
    const/4 v6, 0x3

    .line 35
    const-string v7, "new_id"

    .line 36
    .line 37
    invoke-direct {v0, v7, v2, v6}, Lcom/umeng/analytics/pro/cl;-><init>(Ljava/lang/String;BS)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->j:Lcom/umeng/analytics/pro/cl;

    .line 41
    .line 42
    new-instance v0, Lcom/umeng/analytics/pro/cl;

    .line 43
    .line 44
    const/4 v6, 0x4

    .line 45
    const-string v8, "ts"

    .line 46
    .line 47
    const/16 v9, 0xa

    .line 48
    .line 49
    invoke-direct {v0, v8, v9, v6}, Lcom/umeng/analytics/pro/cl;-><init>(Ljava/lang/String;BS)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->k:Lcom/umeng/analytics/pro/cl;

    .line 53
    .line 54
    new-instance v0, Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->l:Ljava/util/Map;

    .line 60
    .line 61
    new-instance v6, Lcom/umeng/commonsdk/statistics/proto/a$b;

    .line 62
    .line 63
    const/4 v10, 0x0

    .line 64
    invoke-direct {v6, v10}, Lcom/umeng/commonsdk/statistics/proto/a$b;-><init>(Lcom/umeng/commonsdk/statistics/proto/a$1;)V

    .line 65
    .line 66
    .line 67
    const-class v11, Lcom/umeng/analytics/pro/da;

    .line 68
    .line 69
    invoke-interface {v0, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    new-instance v6, Lcom/umeng/commonsdk/statistics/proto/a$d;

    .line 73
    .line 74
    invoke-direct {v6, v10}, Lcom/umeng/commonsdk/statistics/proto/a$d;-><init>(Lcom/umeng/commonsdk/statistics/proto/a$1;)V

    .line 75
    .line 76
    .line 77
    const-class v10, Lcom/umeng/analytics/pro/db;

    .line 78
    .line 79
    invoke-interface {v0, v10, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    new-instance v0, Ljava/util/EnumMap;

    .line 83
    .line 84
    const-class v6, Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 85
    .line 86
    invoke-direct {v0, v6}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 87
    .line 88
    .line 89
    sget-object v6, Lcom/umeng/commonsdk/statistics/proto/a$e;->a:Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 90
    .line 91
    new-instance v10, Lcom/umeng/analytics/pro/cd;

    .line 92
    .line 93
    new-instance v11, Lcom/umeng/analytics/pro/ce;

    .line 94
    .line 95
    invoke-direct {v11, v2}, Lcom/umeng/analytics/pro/ce;-><init>(B)V

    .line 96
    .line 97
    .line 98
    invoke-direct {v10, v1, v3, v11}, Lcom/umeng/analytics/pro/cd;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ce;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v0, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/a$e;->b:Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 105
    .line 106
    new-instance v6, Lcom/umeng/analytics/pro/cd;

    .line 107
    .line 108
    new-instance v10, Lcom/umeng/analytics/pro/ce;

    .line 109
    .line 110
    invoke-direct {v10, v2}, Lcom/umeng/analytics/pro/ce;-><init>(B)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v6, v4, v5, v10}, Lcom/umeng/analytics/pro/cd;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ce;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v0, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/a$e;->c:Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 120
    .line 121
    new-instance v4, Lcom/umeng/analytics/pro/cd;

    .line 122
    .line 123
    new-instance v5, Lcom/umeng/analytics/pro/ce;

    .line 124
    .line 125
    invoke-direct {v5, v2}, Lcom/umeng/analytics/pro/ce;-><init>(B)V

    .line 126
    .line 127
    .line 128
    invoke-direct {v4, v7, v3, v5}, Lcom/umeng/analytics/pro/cd;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ce;)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/a$e;->d:Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 135
    .line 136
    new-instance v2, Lcom/umeng/analytics/pro/cd;

    .line 137
    .line 138
    new-instance v4, Lcom/umeng/analytics/pro/ce;

    .line 139
    .line 140
    invoke-direct {v4, v9}, Lcom/umeng/analytics/pro/ce;-><init>(B)V

    .line 141
    .line 142
    .line 143
    invoke-direct {v2, v8, v3, v4}, Lcom/umeng/analytics/pro/cd;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ce;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->e:Ljava/util/Map;

    .line 154
    .line 155
    const-class v1, Lcom/umeng/commonsdk/statistics/proto/a;

    .line 156
    .line 157
    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/cd;->a(Ljava/lang/Class;Ljava/util/Map;)V

    .line 158
    .line 159
    .line 160
    return-void
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
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->n:B

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 3
    sget-object v2, Lcom/umeng/commonsdk/statistics/proto/a$e;->b:Lcom/umeng/commonsdk/statistics/proto/a$e;

    aput-object v2, v1, v0

    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->o:[Lcom/umeng/commonsdk/statistics/proto/a$e;

    return-void
.end method

.method public constructor <init>(Lcom/umeng/commonsdk/statistics/proto/a;)V
    .locals 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 10
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->n:B

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 11
    sget-object v2, Lcom/umeng/commonsdk/statistics/proto/a$e;->b:Lcom/umeng/commonsdk/statistics/proto/a$e;

    aput-object v2, v1, v0

    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->o:[Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 12
    iget-byte v0, p1, Lcom/umeng/commonsdk/statistics/proto/a;->n:B

    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->n:B

    .line 13
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/a;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->a:Ljava/lang/String;

    .line 15
    :cond_0
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/a;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 16
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/a;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->b:Ljava/lang/String;

    .line 17
    :cond_1
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/a;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 18
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/a;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->c:Ljava/lang/String;

    .line 19
    :cond_2
    iget-wide v0, p1, Lcom/umeng/commonsdk/statistics/proto/a;->d:J

    iput-wide v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->d:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/a;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->a:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/umeng/commonsdk/statistics/proto/a;->c:Ljava/lang/String;

    .line 7
    iput-wide p3, p0, Lcom/umeng/commonsdk/statistics/proto/a;->d:J

    const/4 p1, 0x1

    .line 8
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/a;->d(Z)V

    return-void
.end method

.method private a(Ljava/io/ObjectInputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 9
    :try_start_0
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->n:B

    .line 10
    new-instance v0, Lcom/umeng/analytics/pro/ck;

    new-instance v1, Lcom/umeng/analytics/pro/dc;

    invoke-direct {v1, p1}, Lcom/umeng/analytics/pro/dc;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/ck;-><init>(Lcom/umeng/analytics/pro/de;)V

    invoke-virtual {p0, v0}, Lcom/umeng/commonsdk/statistics/proto/a;->read(Lcom/umeng/analytics/pro/cq;)V
    :try_end_0
    .catch Lcom/umeng/analytics/pro/bx; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 11
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(Ljava/io/ObjectOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    :try_start_0
    new-instance v0, Lcom/umeng/analytics/pro/ck;

    new-instance v1, Lcom/umeng/analytics/pro/dc;

    invoke-direct {v1, p1}, Lcom/umeng/analytics/pro/dc;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/ck;-><init>(Lcom/umeng/analytics/pro/de;)V

    invoke-virtual {p0, v0}, Lcom/umeng/commonsdk/statistics/proto/a;->write(Lcom/umeng/analytics/pro/cq;)V
    :try_end_0
    .catch Lcom/umeng/analytics/pro/bx; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 8
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic o()Lcom/umeng/analytics/pro/cv;
    .locals 1

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->g:Lcom/umeng/analytics/pro/cv;

    return-object v0
.end method

.method static synthetic p()Lcom/umeng/analytics/pro/cl;
    .locals 1

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->h:Lcom/umeng/analytics/pro/cl;

    return-object v0
.end method

.method static synthetic q()Lcom/umeng/analytics/pro/cl;
    .locals 1

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->i:Lcom/umeng/analytics/pro/cl;

    return-object v0
.end method

.method static synthetic r()Lcom/umeng/analytics/pro/cl;
    .locals 1

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->j:Lcom/umeng/analytics/pro/cl;

    return-object v0
.end method

.method static synthetic s()Lcom/umeng/analytics/pro/cl;
    .locals 1

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->k:Lcom/umeng/analytics/pro/cl;

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/umeng/commonsdk/statistics/proto/a$e;
    .locals 0

    .line 6
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/proto/a$e;->a(I)Lcom/umeng/commonsdk/statistics/proto/a$e;

    move-result-object p1

    return-object p1
.end method

.method public a()Lcom/umeng/commonsdk/statistics/proto/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/umeng/commonsdk/statistics/proto/a;

    invoke-direct {v0, p0}, Lcom/umeng/commonsdk/statistics/proto/a;-><init>(Lcom/umeng/commonsdk/statistics/proto/a;)V

    return-object v0
.end method

.method public a(J)Lcom/umeng/commonsdk/statistics/proto/a;
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->d:J

    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/a;->d(Z)V

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a(Z)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->a:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Z)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->b:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->a:Ljava/lang/String;

    return-void
.end method

.method public c(Z)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->c:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public clear()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->a:Ljava/lang/String;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->b:Ljava/lang/String;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->c:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Lcom/umeng/commonsdk/statistics/proto/a;->d(Z)V

    .line 10
    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->d:J

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public d(Z)V
    .locals 2

    .line 2
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->n:B

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lcom/umeng/analytics/pro/bo;->a(BIZ)B

    move-result p1

    iput-byte p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->n:B

    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public synthetic deepCopy()Lcom/umeng/analytics/pro/br;
    .locals 1

    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/a;->a()Lcom/umeng/commonsdk/statistics/proto/a;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic fieldForId(I)Lcom/umeng/analytics/pro/by;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/a;->a(I)Lcom/umeng/commonsdk/statistics/proto/a$e;

    move-result-object p1

    return-object p1
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public i()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->c:Ljava/lang/String;

    return-void
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k()J
    .locals 2

    iget-wide v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->d:J

    return-wide v0
.end method

.method public l()V
    .locals 2

    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->n:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/bo;->b(BI)B

    move-result v0

    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->n:B

    return-void
.end method

.method public m()Z
    .locals 2

    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->n:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/bo;->a(BI)Z

    move-result v0

    return v0
.end method

.method public n()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->c:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lcom/umeng/analytics/pro/cr;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "Required field \'new_id\' was not present! Struct: "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/a;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/cr;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_1
    new-instance v0, Lcom/umeng/analytics/pro/cr;

    .line 38
    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v2, "Required field \'domain\' was not present! Struct: "

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/a;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/cr;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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

.method public read(Lcom/umeng/analytics/pro/cq;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->l:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->D()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/analytics/pro/cz;

    invoke-interface {v0}, Lcom/umeng/analytics/pro/cz;->b()Lcom/umeng/analytics/pro/cy;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Lcom/umeng/analytics/pro/cy;->b(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/br;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "IdJournal("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "domain:"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->a:Ljava/lang/String;

    .line 14
    .line 15
    const-string v2, "null"

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/a;->g()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const-string v3, ", "

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, "old_id:"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->b:Ljava/lang/String;

    .line 43
    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, "new_id:"

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->c:Ljava/lang/String;

    .line 62
    .line 63
    if-nez v1, :cond_3

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    :goto_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, "ts:"

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-wide v1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->d:J

    .line 81
    .line 82
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ")"

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0
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

.method public write(Lcom/umeng/analytics/pro/cq;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->l:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->D()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/analytics/pro/cz;

    invoke-interface {v0}, Lcom/umeng/analytics/pro/cz;->b()Lcom/umeng/analytics/pro/cy;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Lcom/umeng/analytics/pro/cy;->a(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/br;)V

    return-void
.end method
