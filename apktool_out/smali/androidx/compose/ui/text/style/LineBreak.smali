.class public final Landroidx/compose/ui/text/style/LineBreak;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Immutable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/text/style/LineBreak$Companion;,
        Landroidx/compose/ui/text/style/LineBreak$Strategy;,
        Landroidx/compose/ui/text/style/LineBreak$Strictness;,
        Landroidx/compose/ui/text/style/LineBreak$WordBreak;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0087@\u0018\u0000 \u001e2\u00020\u0001:\u0004\u001e\u001f !B!\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tB\u0011\u0008\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0008\u0010\u000cJ.\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u000cJ\u000f\u0010\u001a\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u000e\u0010\n\u001a\u00020\u000bX\u0080\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\u00020\u00038F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000cR\u0017\u0010\u0004\u001a\u00020\u00058F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000cR\u0017\u0010\u0006\u001a\u00020\u00078F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u000c\u0088\u0001\n\u0092\u0001\u00020\u000b\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\""
    }
    d2 = {
        "Landroidx/compose/ui/text/style/LineBreak;",
        "",
        "strategy",
        "Landroidx/compose/ui/text/style/LineBreak$Strategy;",
        "strictness",
        "Landroidx/compose/ui/text/style/LineBreak$Strictness;",
        "wordBreak",
        "Landroidx/compose/ui/text/style/LineBreak$WordBreak;",
        "constructor-impl",
        "(III)I",
        "mask",
        "",
        "(I)I",
        "getStrategy-fcGXIks",
        "getStrictness-usljTpc",
        "getWordBreak-jp8hJ3c",
        "copy",
        "copy-gijOMQM",
        "(IIII)I",
        "equals",
        "",
        "other",
        "equals-impl",
        "(ILjava/lang/Object;)Z",
        "hashCode",
        "hashCode-impl",
        "toString",
        "",
        "toString-impl",
        "(I)Ljava/lang/String;",
        "Companion",
        "Strategy",
        "Strictness",
        "WordBreak",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lu3/f;
.end annotation


# static fields
.field public static final Companion:Landroidx/compose/ui/text/style/LineBreak$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Heading:I

.field private static final Paragraph:I

.field private static final Simple:I

.field private static final Unspecified:I


# instance fields
.field private final mask:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Landroidx/compose/ui/text/style/LineBreak$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/ui/text/style/LineBreak$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/ui/text/style/LineBreak;->Companion:Landroidx/compose/ui/text/style/LineBreak$Companion;

    .line 8
    .line 9
    sget-object v0, Landroidx/compose/ui/text/style/LineBreak$Strategy;->Companion:Landroidx/compose/ui/text/style/LineBreak$Strategy$Companion;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/ui/text/style/LineBreak$Strategy$Companion;->getSimple-fcGXIks()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    sget-object v2, Landroidx/compose/ui/text/style/LineBreak$Strictness;->Companion:Landroidx/compose/ui/text/style/LineBreak$Strictness$Companion;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroidx/compose/ui/text/style/LineBreak$Strictness$Companion;->getNormal-usljTpc()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    sget-object v4, Landroidx/compose/ui/text/style/LineBreak$WordBreak;->Companion:Landroidx/compose/ui/text/style/LineBreak$WordBreak$Companion;

    .line 22
    .line 23
    invoke-virtual {v4}, Landroidx/compose/ui/text/style/LineBreak$WordBreak$Companion;->getDefault-jp8hJ3c()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-static {v1, v3, v5}, Landroidx/compose/ui/text/style/LineBreak_androidKt;->access$packBytes(III)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v1}, Landroidx/compose/ui/text/style/LineBreak;->constructor-impl(I)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    sput v1, Landroidx/compose/ui/text/style/LineBreak;->Simple:I

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/compose/ui/text/style/LineBreak$Strategy$Companion;->getBalanced-fcGXIks()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {v2}, Landroidx/compose/ui/text/style/LineBreak$Strictness$Companion;->getLoose-usljTpc()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {v4}, Landroidx/compose/ui/text/style/LineBreak$WordBreak$Companion;->getPhrase-jp8hJ3c()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    invoke-static {v1, v3, v5}, Landroidx/compose/ui/text/style/LineBreak_androidKt;->access$packBytes(III)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {v1}, Landroidx/compose/ui/text/style/LineBreak;->constructor-impl(I)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    sput v1, Landroidx/compose/ui/text/style/LineBreak;->Heading:I

    .line 58
    .line 59
    invoke-virtual {v0}, Landroidx/compose/ui/text/style/LineBreak$Strategy$Companion;->getHighQuality-fcGXIks()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-virtual {v2}, Landroidx/compose/ui/text/style/LineBreak$Strictness$Companion;->getStrict-usljTpc()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {v4}, Landroidx/compose/ui/text/style/LineBreak$WordBreak$Companion;->getDefault-jp8hJ3c()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-static {v0, v1, v2}, Landroidx/compose/ui/text/style/LineBreak_androidKt;->access$packBytes(III)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-static {v0}, Landroidx/compose/ui/text/style/LineBreak;->constructor-impl(I)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    sput v0, Landroidx/compose/ui/text/style/LineBreak;->Paragraph:I

    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    invoke-static {v0}, Landroidx/compose/ui/text/style/LineBreak;->constructor-impl(I)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    sput v0, Landroidx/compose/ui/text/style/LineBreak;->Unspecified:I

    .line 87
    .line 88
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method private synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/ui/text/style/LineBreak;->mask:I

    return-void
.end method

.method public static final synthetic access$getHeading$cp()I
    .locals 1

    sget v0, Landroidx/compose/ui/text/style/LineBreak;->Heading:I

    return v0
.end method

.method public static final synthetic access$getParagraph$cp()I
    .locals 1

    sget v0, Landroidx/compose/ui/text/style/LineBreak;->Paragraph:I

    return v0
.end method

.method public static final synthetic access$getSimple$cp()I
    .locals 1

    sget v0, Landroidx/compose/ui/text/style/LineBreak;->Simple:I

    return v0
.end method

.method public static final synthetic access$getUnspecified$cp()I
    .locals 1

    sget v0, Landroidx/compose/ui/text/style/LineBreak;->Unspecified:I

    return v0
.end method

.method public static final synthetic box-impl(I)Landroidx/compose/ui/text/style/LineBreak;
    .locals 1

    new-instance v0, Landroidx/compose/ui/text/style/LineBreak;

    invoke-direct {v0, p0}, Landroidx/compose/ui/text/style/LineBreak;-><init>(I)V

    return-object v0
.end method

.method private static constructor-impl(I)I
    .locals 0

    return p0
.end method

.method public static constructor-impl(III)I
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/ui/text/style/LineBreak_androidKt;->access$packBytes(III)I

    move-result p0

    invoke-static {p0}, Landroidx/compose/ui/text/style/LineBreak;->constructor-impl(I)I

    move-result p0

    return p0
.end method

.method public static final copy-gijOMQM(IIII)I
    .locals 0

    invoke-static {p1, p2, p3}, Landroidx/compose/ui/text/style/LineBreak;->constructor-impl(III)I

    move-result p0

    return p0
.end method

.method public static synthetic copy-gijOMQM$default(IIIIILjava/lang/Object;)I
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Landroidx/compose/ui/text/style/LineBreak;->getStrategy-fcGXIks(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 10
    .line 11
    if-eqz p5, :cond_1

    .line 12
    .line 13
    invoke-static {p0}, Landroidx/compose/ui/text/style/LineBreak;->getStrictness-usljTpc(I)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 18
    .line 19
    if-eqz p4, :cond_2

    .line 20
    .line 21
    invoke-static {p0}, Landroidx/compose/ui/text/style/LineBreak;->getWordBreak-jp8hJ3c(I)I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    :cond_2
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/text/style/LineBreak;->copy-gijOMQM(IIII)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
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
    .line 465
    .line 466
    .line 467
    .line 468
.end method

.method public static equals-impl(ILjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Landroidx/compose/ui/text/style/LineBreak;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Landroidx/compose/ui/text/style/LineBreak;

    invoke-virtual {p1}, Landroidx/compose/ui/text/style/LineBreak;->unbox-impl()I

    move-result p1

    if-eq p0, p1, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final equals-impl0(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final getStrategy-fcGXIks(I)I
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/text/style/LineBreak_androidKt;->access$unpackByte1(I)I

    move-result p0

    invoke-static {p0}, Landroidx/compose/ui/text/style/LineBreak$Strategy;->constructor-impl(I)I

    move-result p0

    return p0
.end method

.method public static final getStrictness-usljTpc(I)I
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/text/style/LineBreak_androidKt;->access$unpackByte2(I)I

    move-result p0

    invoke-static {p0}, Landroidx/compose/ui/text/style/LineBreak$Strictness;->constructor-impl(I)I

    move-result p0

    return p0
.end method

.method public static final getWordBreak-jp8hJ3c(I)I
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/text/style/LineBreak_androidKt;->access$unpackByte3(I)I

    move-result p0

    invoke-static {p0}, Landroidx/compose/ui/text/style/LineBreak$WordBreak;->constructor-impl(I)I

    move-result p0

    return p0
.end method

.method public static hashCode-impl(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    return p0
.end method

.method public static toString-impl(I)Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LineBreak(strategy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Landroidx/compose/ui/text/style/LineBreak;->getStrategy-fcGXIks(I)I

    move-result v1

    invoke-static {v1}, Landroidx/compose/ui/text/style/LineBreak$Strategy;->toString-impl(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", strictness="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Landroidx/compose/ui/text/style/LineBreak;->getStrictness-usljTpc(I)I

    move-result v1

    invoke-static {v1}, Landroidx/compose/ui/text/style/LineBreak$Strictness;->toString-impl(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", wordBreak="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Landroidx/compose/ui/text/style/LineBreak;->getWordBreak-jp8hJ3c(I)I

    move-result p0

    invoke-static {p0}, Landroidx/compose/ui/text/style/LineBreak$WordBreak;->toString-impl(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Landroidx/compose/ui/text/style/LineBreak;->mask:I

    invoke-static {v0, p1}, Landroidx/compose/ui/text/style/LineBreak;->equals-impl(ILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/text/style/LineBreak;->mask:I

    invoke-static {v0}, Landroidx/compose/ui/text/style/LineBreak;->hashCode-impl(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget v0, p0, Landroidx/compose/ui/text/style/LineBreak;->mask:I

    invoke-static {v0}, Landroidx/compose/ui/text/style/LineBreak;->toString-impl(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic unbox-impl()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/text/style/LineBreak;->mask:I

    return v0
.end method
