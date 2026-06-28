.class public Lcom/umeng/commonsdk/statistics/proto/Response;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/br;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/commonsdk/statistics/proto/Response$c;,
        Lcom/umeng/commonsdk/statistics/proto/Response$d;,
        Lcom/umeng/commonsdk/statistics/proto/Response$a;,
        Lcom/umeng/commonsdk/statistics/proto/Response$b;,
        Lcom/umeng/commonsdk/statistics/proto/Response$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/umeng/analytics/pro/br<",
        "Lcom/umeng/commonsdk/statistics/proto/Response;",
        "Lcom/umeng/commonsdk/statistics/proto/Response$e;",
        ">;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field private static final IMPRINT_FIELD_DESC:Lcom/umeng/analytics/pro/cl;

.field private static final MSG_FIELD_DESC:Lcom/umeng/analytics/pro/cl;

.field private static final RESP_CODE_FIELD_DESC:Lcom/umeng/analytics/pro/cl;

.field private static final STRUCT_DESC:Lcom/umeng/analytics/pro/cv;

.field private static final __RESP_CODE_ISSET_ID:I = 0x0

.field public static final metaDataMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/umeng/commonsdk/statistics/proto/Response$e;",
            "Lcom/umeng/analytics/pro/cd;",
            ">;"
        }
    .end annotation
.end field

.field private static final schemes:Ljava/util/Map;
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

.field private static final serialVersionUID:J = -0x3f22482b0751777fL


# instance fields
.field private __isset_bitfield:B

.field public imprint:Lcom/umeng/commonsdk/statistics/proto/d;

.field public msg:Ljava/lang/String;

.field private optionals:[Lcom/umeng/commonsdk/statistics/proto/Response$e;

.field public resp_code:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/cv;

    .line 2
    .line 3
    const-string v1, "Response"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/cv;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/Response;->STRUCT_DESC:Lcom/umeng/analytics/pro/cv;

    .line 9
    .line 10
    new-instance v0, Lcom/umeng/analytics/pro/cl;

    .line 11
    .line 12
    const-string v1, "resp_code"

    .line 13
    .line 14
    const/16 v2, 0x8

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v0, v1, v2, v3}, Lcom/umeng/analytics/pro/cl;-><init>(Ljava/lang/String;BS)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/Response;->RESP_CODE_FIELD_DESC:Lcom/umeng/analytics/pro/cl;

    .line 21
    .line 22
    new-instance v0, Lcom/umeng/analytics/pro/cl;

    .line 23
    .line 24
    const-string v4, "msg"

    .line 25
    .line 26
    const/16 v5, 0xb

    .line 27
    .line 28
    const/4 v6, 0x2

    .line 29
    invoke-direct {v0, v4, v5, v6}, Lcom/umeng/analytics/pro/cl;-><init>(Ljava/lang/String;BS)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/Response;->MSG_FIELD_DESC:Lcom/umeng/analytics/pro/cl;

    .line 33
    .line 34
    new-instance v0, Lcom/umeng/analytics/pro/cl;

    .line 35
    .line 36
    const/4 v7, 0x3

    .line 37
    const-string v8, "imprint"

    .line 38
    .line 39
    const/16 v9, 0xc

    .line 40
    .line 41
    invoke-direct {v0, v8, v9, v7}, Lcom/umeng/analytics/pro/cl;-><init>(Ljava/lang/String;BS)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/Response;->IMPRINT_FIELD_DESC:Lcom/umeng/analytics/pro/cl;

    .line 45
    .line 46
    new-instance v0, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/Response;->schemes:Ljava/util/Map;

    .line 52
    .line 53
    new-instance v7, Lcom/umeng/commonsdk/statistics/proto/Response$b;

    .line 54
    .line 55
    const/4 v10, 0x0

    .line 56
    invoke-direct {v7, v10}, Lcom/umeng/commonsdk/statistics/proto/Response$b;-><init>(Lcom/umeng/commonsdk/statistics/proto/Response$1;)V

    .line 57
    .line 58
    .line 59
    const-class v11, Lcom/umeng/analytics/pro/da;

    .line 60
    .line 61
    invoke-interface {v0, v11, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    new-instance v7, Lcom/umeng/commonsdk/statistics/proto/Response$d;

    .line 65
    .line 66
    invoke-direct {v7, v10}, Lcom/umeng/commonsdk/statistics/proto/Response$d;-><init>(Lcom/umeng/commonsdk/statistics/proto/Response$1;)V

    .line 67
    .line 68
    .line 69
    const-class v10, Lcom/umeng/analytics/pro/db;

    .line 70
    .line 71
    invoke-interface {v0, v10, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    new-instance v0, Ljava/util/EnumMap;

    .line 75
    .line 76
    const-class v7, Lcom/umeng/commonsdk/statistics/proto/Response$e;

    .line 77
    .line 78
    invoke-direct {v0, v7}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 79
    .line 80
    .line 81
    sget-object v7, Lcom/umeng/commonsdk/statistics/proto/Response$e;->a:Lcom/umeng/commonsdk/statistics/proto/Response$e;

    .line 82
    .line 83
    new-instance v10, Lcom/umeng/analytics/pro/cd;

    .line 84
    .line 85
    new-instance v11, Lcom/umeng/analytics/pro/ce;

    .line 86
    .line 87
    invoke-direct {v11, v2}, Lcom/umeng/analytics/pro/ce;-><init>(B)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v10, v1, v3, v11}, Lcom/umeng/analytics/pro/cd;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ce;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v0, v7, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/Response$e;->b:Lcom/umeng/commonsdk/statistics/proto/Response$e;

    .line 97
    .line 98
    new-instance v2, Lcom/umeng/analytics/pro/cd;

    .line 99
    .line 100
    new-instance v3, Lcom/umeng/analytics/pro/ce;

    .line 101
    .line 102
    invoke-direct {v3, v5}, Lcom/umeng/analytics/pro/ce;-><init>(B)V

    .line 103
    .line 104
    .line 105
    invoke-direct {v2, v4, v6, v3}, Lcom/umeng/analytics/pro/cd;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ce;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/Response$e;->c:Lcom/umeng/commonsdk/statistics/proto/Response$e;

    .line 112
    .line 113
    new-instance v2, Lcom/umeng/analytics/pro/cd;

    .line 114
    .line 115
    new-instance v3, Lcom/umeng/analytics/pro/ci;

    .line 116
    .line 117
    const-class v4, Lcom/umeng/commonsdk/statistics/proto/d;

    .line 118
    .line 119
    invoke-direct {v3, v9, v4}, Lcom/umeng/analytics/pro/ci;-><init>(BLjava/lang/Class;)V

    .line 120
    .line 121
    .line 122
    invoke-direct {v2, v8, v6, v3}, Lcom/umeng/analytics/pro/cd;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ce;)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/Response;->metaDataMap:Ljava/util/Map;

    .line 133
    .line 134
    const-class v1, Lcom/umeng/commonsdk/statistics/proto/Response;

    .line 135
    .line 136
    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/cd;->a(Ljava/lang/Class;Ljava/util/Map;)V

    .line 137
    .line 138
    .line 139
    return-void
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

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->__isset_bitfield:B

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/umeng/commonsdk/statistics/proto/Response$e;

    .line 3
    sget-object v2, Lcom/umeng/commonsdk/statistics/proto/Response$e;->b:Lcom/umeng/commonsdk/statistics/proto/Response$e;

    aput-object v2, v1, v0

    const/4 v0, 0x1

    sget-object v2, Lcom/umeng/commonsdk/statistics/proto/Response$e;->c:Lcom/umeng/commonsdk/statistics/proto/Response$e;

    aput-object v2, v1, v0

    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->optionals:[Lcom/umeng/commonsdk/statistics/proto/Response$e;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/Response;-><init>()V

    .line 5
    iput p1, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->resp_code:I

    const/4 p1, 0x1

    .line 6
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/Response;->setResp_codeIsSet(Z)V

    return-void
.end method

.method public constructor <init>(Lcom/umeng/commonsdk/statistics/proto/Response;)V
    .locals 3

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->__isset_bitfield:B

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/umeng/commonsdk/statistics/proto/Response$e;

    .line 9
    sget-object v2, Lcom/umeng/commonsdk/statistics/proto/Response$e;->b:Lcom/umeng/commonsdk/statistics/proto/Response$e;

    aput-object v2, v1, v0

    const/4 v0, 0x1

    sget-object v2, Lcom/umeng/commonsdk/statistics/proto/Response$e;->c:Lcom/umeng/commonsdk/statistics/proto/Response$e;

    aput-object v2, v1, v0

    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->optionals:[Lcom/umeng/commonsdk/statistics/proto/Response$e;

    .line 10
    iget-byte v0, p1, Lcom/umeng/commonsdk/statistics/proto/Response;->__isset_bitfield:B

    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->__isset_bitfield:B

    .line 11
    iget v0, p1, Lcom/umeng/commonsdk/statistics/proto/Response;->resp_code:I

    iput v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->resp_code:I

    .line 12
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/Response;->isSetMsg()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 13
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/Response;->msg:Ljava/lang/String;

    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->msg:Ljava/lang/String;

    .line 14
    :cond_0
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/Response;->isSetImprint()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 15
    new-instance v0, Lcom/umeng/commonsdk/statistics/proto/d;

    iget-object p1, p1, Lcom/umeng/commonsdk/statistics/proto/Response;->imprint:Lcom/umeng/commonsdk/statistics/proto/d;

    invoke-direct {v0, p1}, Lcom/umeng/commonsdk/statistics/proto/d;-><init>(Lcom/umeng/commonsdk/statistics/proto/d;)V

    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->imprint:Lcom/umeng/commonsdk/statistics/proto/d;

    :cond_1
    return-void
.end method

.method static synthetic access$300()Lcom/umeng/analytics/pro/cv;
    .locals 1

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/Response;->STRUCT_DESC:Lcom/umeng/analytics/pro/cv;

    return-object v0
.end method

.method static synthetic access$400()Lcom/umeng/analytics/pro/cl;
    .locals 1

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/Response;->RESP_CODE_FIELD_DESC:Lcom/umeng/analytics/pro/cl;

    return-object v0
.end method

.method static synthetic access$500()Lcom/umeng/analytics/pro/cl;
    .locals 1

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/Response;->MSG_FIELD_DESC:Lcom/umeng/analytics/pro/cl;

    return-object v0
.end method

.method static synthetic access$600()Lcom/umeng/analytics/pro/cl;
    .locals 1

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/Response;->IMPRINT_FIELD_DESC:Lcom/umeng/analytics/pro/cl;

    return-object v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->__isset_bitfield:B

    .line 3
    .line 4
    new-instance v0, Lcom/umeng/analytics/pro/ck;

    .line 5
    .line 6
    new-instance v1, Lcom/umeng/analytics/pro/dc;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lcom/umeng/analytics/pro/dc;-><init>(Ljava/io/InputStream;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/ck;-><init>(Lcom/umeng/analytics/pro/de;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/umeng/commonsdk/statistics/proto/Response;->read(Lcom/umeng/analytics/pro/cq;)V
    :try_end_0
    .catch Lcom/umeng/analytics/pro/bx; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catch_0
    move-exception p1

    .line 19
    new-instance v0, Ljava/io/IOException;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
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
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lcom/umeng/analytics/pro/ck;

    .line 2
    .line 3
    new-instance v1, Lcom/umeng/analytics/pro/dc;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lcom/umeng/analytics/pro/dc;-><init>(Ljava/io/OutputStream;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/ck;-><init>(Lcom/umeng/analytics/pro/de;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/umeng/commonsdk/statistics/proto/Response;->write(Lcom/umeng/analytics/pro/cq;)V
    :try_end_0
    .catch Lcom/umeng/analytics/pro/bx; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p1

    .line 16
    new-instance v0, Ljava/io/IOException;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
    .line 26
    .line 27
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/umeng/commonsdk/statistics/proto/Response;->setResp_codeIsSet(Z)V

    .line 3
    .line 4
    .line 5
    iput v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->resp_code:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->msg:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->imprint:Lcom/umeng/commonsdk/statistics/proto/d;

    .line 11
    .line 12
    return-void
    .line 13
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

.method public bridge synthetic deepCopy()Lcom/umeng/analytics/pro/br;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/Response;->deepCopy()Lcom/umeng/commonsdk/statistics/proto/Response;

    move-result-object v0

    return-object v0
.end method

.method public deepCopy()Lcom/umeng/commonsdk/statistics/proto/Response;
    .locals 1

    .line 2
    new-instance v0, Lcom/umeng/commonsdk/statistics/proto/Response;

    invoke-direct {v0, p0}, Lcom/umeng/commonsdk/statistics/proto/Response;-><init>(Lcom/umeng/commonsdk/statistics/proto/Response;)V

    return-object v0
.end method

.method public bridge synthetic fieldForId(I)Lcom/umeng/analytics/pro/by;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/Response;->fieldForId(I)Lcom/umeng/commonsdk/statistics/proto/Response$e;

    move-result-object p1

    return-object p1
.end method

.method public fieldForId(I)Lcom/umeng/commonsdk/statistics/proto/Response$e;
    .locals 0

    .line 2
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/proto/Response$e;->a(I)Lcom/umeng/commonsdk/statistics/proto/Response$e;

    move-result-object p1

    return-object p1
.end method

.method public getImprint()Lcom/umeng/commonsdk/statistics/proto/d;
    .locals 1

    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->imprint:Lcom/umeng/commonsdk/statistics/proto/d;

    return-object v0
.end method

.method public getMsg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->msg:Ljava/lang/String;

    return-object v0
.end method

.method public getResp_code()I
    .locals 1

    iget v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->resp_code:I

    return v0
.end method

.method public isSetImprint()Z
    .locals 1

    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->imprint:Lcom/umeng/commonsdk/statistics/proto/d;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isSetMsg()Z
    .locals 1

    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->msg:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isSetResp_code()Z
    .locals 2

    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->__isset_bitfield:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/bo;->a(BI)Z

    move-result v0

    return v0
.end method

.method public read(Lcom/umeng/analytics/pro/cq;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/Response;->schemes:Ljava/util/Map;

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

.method public setImprint(Lcom/umeng/commonsdk/statistics/proto/d;)Lcom/umeng/commonsdk/statistics/proto/Response;
    .locals 0

    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->imprint:Lcom/umeng/commonsdk/statistics/proto/d;

    return-object p0
.end method

.method public setImprintIsSet(Z)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->imprint:Lcom/umeng/commonsdk/statistics/proto/d;

    :cond_0
    return-void
.end method

.method public setMsg(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/Response;
    .locals 0

    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->msg:Ljava/lang/String;

    return-object p0
.end method

.method public setMsgIsSet(Z)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->msg:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public setResp_code(I)Lcom/umeng/commonsdk/statistics/proto/Response;
    .locals 0

    .line 1
    iput p1, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->resp_code:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/Response;->setResp_codeIsSet(Z)V

    .line 5
    .line 6
    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setResp_codeIsSet(Z)V
    .locals 2

    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->__isset_bitfield:B

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lcom/umeng/analytics/pro/bo;->a(BIZ)B

    move-result p1

    iput-byte p1, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->__isset_bitfield:B

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Response("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "resp_code:"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget v1, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->resp_code:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/Response;->isSetMsg()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const-string v2, "null"

    .line 23
    .line 24
    const-string v3, ", "

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, "msg:"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->msg:Ljava/lang/String;

    .line 37
    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/Response;->isSetImprint()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, "imprint:"

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->imprint:Lcom/umeng/commonsdk/statistics/proto/d;

    .line 62
    .line 63
    if-nez v1, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_1
    const-string v1, ")"

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0
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

.method public unsetImprint()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->imprint:Lcom/umeng/commonsdk/statistics/proto/d;

    return-void
.end method

.method public unsetMsg()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->msg:Ljava/lang/String;

    return-void
.end method

.method public unsetResp_code()V
    .locals 2

    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->__isset_bitfield:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/bo;->b(BI)B

    move-result v0

    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->__isset_bitfield:B

    return-void
.end method

.method public validate()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/Response;->imprint:Lcom/umeng/commonsdk/statistics/proto/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/umeng/commonsdk/statistics/proto/d;->l()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
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

.method public write(Lcom/umeng/analytics/pro/cq;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/Response;->schemes:Ljava/util/Map;

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
