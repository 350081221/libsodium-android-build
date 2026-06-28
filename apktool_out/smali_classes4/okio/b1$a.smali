.class public final Lokio/b1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokio/b1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JT\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\r2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000fH\u0002J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u0016\"\u00020\u0010H\u0007\u00a2\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0018"
    }
    d2 = {
        "Lokio/Options$Companion;",
        "",
        "()V",
        "intCount",
        "",
        "Lokio/Buffer;",
        "getIntCount",
        "(Lokio/Buffer;)J",
        "buildTrieRecursive",
        "",
        "nodeOffset",
        "node",
        "byteStringOffset",
        "",
        "byteStrings",
        "",
        "Lokio/ByteString;",
        "fromIndex",
        "toIndex",
        "indexes",
        "of",
        "Lokio/Options;",
        "",
        "([Lokio/ByteString;)Lokio/Options;",
        "okio"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,236:1\n11065#2:237\n11400#2,3:238\n13374#2,3:243\n37#3,2:241\n1#4:246\n74#5:247\n74#5:248\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n43#1:237\n43#1:238,3\n44#1:243,3\n43#1:241,2\n151#1:247\n208#1:248\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Lokio/b1$a;-><init>()V

    return-void
.end method

.method private final a(JLokio/l;ILjava/util/List;IILjava/util/List;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lokio/l;",
            "I",
            "Ljava/util/List<",
            "+",
            "Lokio/n;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    move-object/from16 v10, p3

    .line 4
    .line 5
    move/from16 v11, p4

    .line 6
    .line 7
    move-object/from16 v12, p5

    .line 8
    .line 9
    move/from16 v0, p6

    .line 10
    .line 11
    move/from16 v13, p7

    .line 12
    .line 13
    move-object/from16 v14, p8

    .line 14
    .line 15
    if-ge v0, v13, :cond_0

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v3, 0x0

    .line 20
    :goto_0
    const-string v4, "Failed requirement."

    .line 21
    .line 22
    if-eqz v3, :cond_14

    .line 23
    .line 24
    move v3, v0

    .line 25
    :goto_1
    if-ge v3, v13, :cond_3

    .line 26
    .line 27
    invoke-interface {v12, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, Lokio/n;

    .line 32
    .line 33
    invoke-virtual {v5}, Lokio/n;->size()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-lt v5, v11, :cond_1

    .line 38
    .line 39
    const/4 v5, 0x1

    .line 40
    goto :goto_2

    .line 41
    :cond_1
    const/4 v5, 0x0

    .line 42
    :goto_2
    if-eqz v5, :cond_2

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :cond_3
    invoke-interface/range {p5 .. p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Lokio/n;

    .line 62
    .line 63
    add-int/lit8 v4, v13, -0x1

    .line 64
    .line 65
    invoke-interface {v12, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, Lokio/n;

    .line 70
    .line 71
    invoke-virtual {v3}, Lokio/n;->size()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    const/4 v15, -0x1

    .line 76
    if-ne v11, v5, :cond_4

    .line 77
    .line 78
    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Ljava/lang/Number;

    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    add-int/lit8 v0, v0, 0x1

    .line 89
    .line 90
    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Lokio/n;

    .line 95
    .line 96
    move v6, v0

    .line 97
    move v0, v3

    .line 98
    move-object v3, v5

    .line 99
    goto :goto_3

    .line 100
    :cond_4
    move v6, v0

    .line 101
    move v0, v15

    .line 102
    :goto_3
    invoke-virtual {v3, v11}, Lokio/n;->getByte(I)B

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    invoke-virtual {v4, v11}, Lokio/n;->getByte(I)B

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    const/4 v8, 0x2

    .line 111
    if-eq v5, v7, :cond_e

    .line 112
    .line 113
    add-int/lit8 v1, v6, 0x1

    .line 114
    .line 115
    const/4 v2, 0x1

    .line 116
    :goto_4
    if-ge v1, v13, :cond_6

    .line 117
    .line 118
    add-int/lit8 v3, v1, -0x1

    .line 119
    .line 120
    invoke-interface {v12, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, Lokio/n;

    .line 125
    .line 126
    invoke-virtual {v3, v11}, Lokio/n;->getByte(I)B

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    check-cast v4, Lokio/n;

    .line 135
    .line 136
    invoke-virtual {v4, v11}, Lokio/n;->getByte(I)B

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eq v3, v4, :cond_5

    .line 141
    .line 142
    add-int/lit8 v2, v2, 0x1

    .line 143
    .line 144
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_6
    invoke-direct {v9, v10}, Lokio/b1$a;->c(Lokio/l;)J

    .line 148
    .line 149
    .line 150
    move-result-wide v3

    .line 151
    add-long v3, p1, v3

    .line 152
    .line 153
    int-to-long v7, v8

    .line 154
    add-long/2addr v3, v7

    .line 155
    mul-int/lit8 v1, v2, 0x2

    .line 156
    .line 157
    int-to-long v7, v1

    .line 158
    add-long v16, v3, v7

    .line 159
    .line 160
    invoke-virtual {v10, v2}, Lokio/l;->Y0(I)Lokio/l;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v10, v0}, Lokio/l;->Y0(I)Lokio/l;

    .line 164
    .line 165
    .line 166
    move v0, v6

    .line 167
    :goto_5
    if-ge v0, v13, :cond_9

    .line 168
    .line 169
    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    check-cast v1, Lokio/n;

    .line 174
    .line 175
    invoke-virtual {v1, v11}, Lokio/n;->getByte(I)B

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eq v0, v6, :cond_7

    .line 180
    .line 181
    add-int/lit8 v2, v0, -0x1

    .line 182
    .line 183
    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    check-cast v2, Lokio/n;

    .line 188
    .line 189
    invoke-virtual {v2, v11}, Lokio/n;->getByte(I)B

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-eq v1, v2, :cond_8

    .line 194
    .line 195
    :cond_7
    and-int/lit16 v1, v1, 0xff

    .line 196
    .line 197
    invoke-virtual {v10, v1}, Lokio/l;->Y0(I)Lokio/l;

    .line 198
    .line 199
    .line 200
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_9
    new-instance v8, Lokio/l;

    .line 204
    .line 205
    invoke-direct {v8}, Lokio/l;-><init>()V

    .line 206
    .line 207
    .line 208
    :goto_6
    if-ge v6, v13, :cond_d

    .line 209
    .line 210
    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, Lokio/n;

    .line 215
    .line 216
    invoke-virtual {v0, v11}, Lokio/n;->getByte(I)B

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    add-int/lit8 v1, v6, 0x1

    .line 221
    .line 222
    move v2, v1

    .line 223
    :goto_7
    if-ge v2, v13, :cond_b

    .line 224
    .line 225
    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    check-cast v3, Lokio/n;

    .line 230
    .line 231
    invoke-virtual {v3, v11}, Lokio/n;->getByte(I)B

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    if-eq v0, v3, :cond_a

    .line 236
    .line 237
    move v7, v2

    .line 238
    goto :goto_8

    .line 239
    :cond_a
    add-int/lit8 v2, v2, 0x1

    .line 240
    .line 241
    goto :goto_7

    .line 242
    :cond_b
    move v7, v13

    .line 243
    :goto_8
    if-ne v1, v7, :cond_c

    .line 244
    .line 245
    add-int/lit8 v0, v11, 0x1

    .line 246
    .line 247
    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    check-cast v1, Lokio/n;

    .line 252
    .line 253
    invoke-virtual {v1}, Lokio/n;->size()I

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    if-ne v0, v1, :cond_c

    .line 258
    .line 259
    invoke-interface {v14, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    check-cast v0, Ljava/lang/Number;

    .line 264
    .line 265
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    invoke-virtual {v10, v0}, Lokio/l;->Y0(I)Lokio/l;

    .line 270
    .line 271
    .line 272
    move/from16 v18, v7

    .line 273
    .line 274
    move-object v15, v8

    .line 275
    goto :goto_9

    .line 276
    :cond_c
    invoke-direct {v9, v8}, Lokio/b1$a;->c(Lokio/l;)J

    .line 277
    .line 278
    .line 279
    move-result-wide v0

    .line 280
    add-long v0, v16, v0

    .line 281
    .line 282
    long-to-int v0, v0

    .line 283
    mul-int/2addr v0, v15

    .line 284
    invoke-virtual {v10, v0}, Lokio/l;->Y0(I)Lokio/l;

    .line 285
    .line 286
    .line 287
    add-int/lit8 v4, v11, 0x1

    .line 288
    .line 289
    move-object/from16 v0, p0

    .line 290
    .line 291
    move-wide/from16 v1, v16

    .line 292
    .line 293
    move-object v3, v8

    .line 294
    move-object/from16 v5, p5

    .line 295
    .line 296
    move/from16 v18, v7

    .line 297
    .line 298
    move-object v15, v8

    .line 299
    move-object/from16 v8, p8

    .line 300
    .line 301
    invoke-direct/range {v0 .. v8}, Lokio/b1$a;->a(JLokio/l;ILjava/util/List;IILjava/util/List;)V

    .line 302
    .line 303
    .line 304
    :goto_9
    move-object v8, v15

    .line 305
    move/from16 v6, v18

    .line 306
    .line 307
    const/4 v15, -0x1

    .line 308
    goto :goto_6

    .line 309
    :cond_d
    move-object v15, v8

    .line 310
    invoke-virtual {v10, v15}, Lokio/l;->G(Lokio/n1;)J

    .line 311
    .line 312
    .line 313
    goto/16 :goto_d

    .line 314
    .line 315
    :cond_e
    invoke-virtual {v3}, Lokio/n;->size()I

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    invoke-virtual {v4}, Lokio/n;->size()I

    .line 320
    .line 321
    .line 322
    move-result v7

    .line 323
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    move v7, v11

    .line 328
    const/4 v15, 0x0

    .line 329
    :goto_a
    if-ge v7, v5, :cond_f

    .line 330
    .line 331
    invoke-virtual {v3, v7}, Lokio/n;->getByte(I)B

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    invoke-virtual {v4, v7}, Lokio/n;->getByte(I)B

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    if-ne v1, v2, :cond_f

    .line 340
    .line 341
    add-int/lit8 v15, v15, 0x1

    .line 342
    .line 343
    add-int/lit8 v7, v7, 0x1

    .line 344
    .line 345
    goto :goto_a

    .line 346
    :cond_f
    invoke-direct {v9, v10}, Lokio/b1$a;->c(Lokio/l;)J

    .line 347
    .line 348
    .line 349
    move-result-wide v1

    .line 350
    add-long v1, p1, v1

    .line 351
    .line 352
    int-to-long v4, v8

    .line 353
    add-long/2addr v1, v4

    .line 354
    int-to-long v4, v15

    .line 355
    add-long/2addr v1, v4

    .line 356
    const-wide/16 v4, 0x1

    .line 357
    .line 358
    add-long/2addr v1, v4

    .line 359
    neg-int v4, v15

    .line 360
    invoke-virtual {v10, v4}, Lokio/l;->Y0(I)Lokio/l;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v10, v0}, Lokio/l;->Y0(I)Lokio/l;

    .line 364
    .line 365
    .line 366
    add-int v4, v11, v15

    .line 367
    .line 368
    :goto_b
    if-ge v11, v4, :cond_10

    .line 369
    .line 370
    invoke-virtual {v3, v11}, Lokio/n;->getByte(I)B

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    and-int/lit16 v0, v0, 0xff

    .line 375
    .line 376
    invoke-virtual {v10, v0}, Lokio/l;->Y0(I)Lokio/l;

    .line 377
    .line 378
    .line 379
    add-int/lit8 v11, v11, 0x1

    .line 380
    .line 381
    goto :goto_b

    .line 382
    :cond_10
    add-int/lit8 v0, v6, 0x1

    .line 383
    .line 384
    if-ne v0, v13, :cond_13

    .line 385
    .line 386
    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    check-cast v0, Lokio/n;

    .line 391
    .line 392
    invoke-virtual {v0}, Lokio/n;->size()I

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-ne v4, v0, :cond_11

    .line 397
    .line 398
    const/4 v1, 0x1

    .line 399
    goto :goto_c

    .line 400
    :cond_11
    const/4 v1, 0x0

    .line 401
    :goto_c
    if-eqz v1, :cond_12

    .line 402
    .line 403
    invoke-interface {v14, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    check-cast v0, Ljava/lang/Number;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    invoke-virtual {v10, v0}, Lokio/l;->Y0(I)Lokio/l;

    .line 414
    .line 415
    .line 416
    goto :goto_d

    .line 417
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 418
    .line 419
    const-string v1, "Check failed."

    .line 420
    .line 421
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw v0

    .line 429
    :cond_13
    new-instance v11, Lokio/l;

    .line 430
    .line 431
    invoke-direct {v11}, Lokio/l;-><init>()V

    .line 432
    .line 433
    .line 434
    invoke-direct {v9, v11}, Lokio/b1$a;->c(Lokio/l;)J

    .line 435
    .line 436
    .line 437
    move-result-wide v7

    .line 438
    add-long/2addr v7, v1

    .line 439
    long-to-int v0, v7

    .line 440
    const/4 v3, -0x1

    .line 441
    mul-int/2addr v0, v3

    .line 442
    invoke-virtual {v10, v0}, Lokio/l;->Y0(I)Lokio/l;

    .line 443
    .line 444
    .line 445
    move-object/from16 v0, p0

    .line 446
    .line 447
    move-object v3, v11

    .line 448
    move-object/from16 v5, p5

    .line 449
    .line 450
    move/from16 v7, p7

    .line 451
    .line 452
    move-object/from16 v8, p8

    .line 453
    .line 454
    invoke-direct/range {v0 .. v8}, Lokio/b1$a;->a(JLokio/l;ILjava/util/List;IILjava/util/List;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v10, v11}, Lokio/l;->G(Lokio/n1;)J

    .line 458
    .line 459
    .line 460
    :goto_d
    return-void

    .line 461
    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 462
    .line 463
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    throw v0
.end method

.method static synthetic b(Lokio/b1$a;JLokio/l;ILjava/util/List;IILjava/util/List;ILjava/lang/Object;)V
    .locals 11

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    move-wide v3, v0

    goto :goto_0

    :cond_0
    move-wide v3, p1

    :goto_0
    and-int/lit8 v0, p9, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move v6, v1

    goto :goto_1

    :cond_1
    move v6, p4

    :goto_1
    and-int/lit8 v0, p9, 0x10

    if-eqz v0, :cond_2

    move v8, v1

    goto :goto_2

    :cond_2
    move/from16 v8, p6

    :goto_2
    and-int/lit8 v0, p9, 0x20

    if-eqz v0, :cond_3

    .line 1
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->size()I

    move-result v0

    move v9, v0

    goto :goto_3

    :cond_3
    move/from16 v9, p7

    :goto_3
    move-object v2, p0

    move-object v5, p3

    move-object/from16 v7, p5

    move-object/from16 v10, p8

    .line 2
    invoke-direct/range {v2 .. v10}, Lokio/b1$a;->a(JLokio/l;ILjava/util/List;IILjava/util/List;)V

    return-void
.end method

.method private final c(Lokio/l;)J
    .locals 4

    invoke-virtual {p1}, Lokio/l;->M0()J

    move-result-wide v0

    const/4 p1, 0x4

    int-to-long v2, p1

    div-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public final varargs d([Lokio/n;)Lokio/b1;
    .locals 16
    .param p1    # [Lokio/n;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "byteStrings"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    move v1, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v1, v3

    .line 16
    :goto_0
    const/4 v4, 0x0

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    new-instance v0, Lokio/b1;

    .line 20
    .line 21
    new-array v1, v3, [Lokio/n;

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    new-array v2, v2, [I

    .line 25
    .line 26
    fill-array-data v2, :array_0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1, v2, v4}, Lokio/b1;-><init>([Lokio/n;[ILkotlin/jvm/internal/w;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/collections/l;->Ty([Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v1}, Lkotlin/collections/u;->j0(Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    new-instance v5, Ljava/util/ArrayList;

    .line 41
    .line 42
    array-length v6, v0

    .line 43
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 44
    .line 45
    .line 46
    array-length v6, v0

    .line 47
    move v7, v3

    .line 48
    :goto_1
    if-ge v7, v6, :cond_2

    .line 49
    .line 50
    aget-object v8, v0, v7

    .line 51
    .line 52
    const/4 v8, -0x1

    .line 53
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    add-int/lit8 v7, v7, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    new-array v6, v3, [Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-interface {v5, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, [Ljava/lang/Integer;

    .line 70
    .line 71
    array-length v6, v5

    .line 72
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-static {v5}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v13

    .line 80
    array-length v11, v0

    .line 81
    move v12, v3

    .line 82
    move v14, v12

    .line 83
    :goto_2
    if-ge v12, v11, :cond_3

    .line 84
    .line 85
    aget-object v6, v0, v12

    .line 86
    .line 87
    add-int/lit8 v15, v14, 0x1

    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    const/4 v8, 0x0

    .line 91
    const/4 v9, 0x6

    .line 92
    const/4 v10, 0x0

    .line 93
    move-object v5, v1

    .line 94
    invoke-static/range {v5 .. v10}, Lkotlin/collections/u;->x(Ljava/util/List;Ljava/lang/Comparable;IIILjava/lang/Object;)I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-interface {v13, v5, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    add-int/lit8 v12, v12, 0x1

    .line 106
    .line 107
    move v14, v15

    .line 108
    goto :goto_2

    .line 109
    :cond_3
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    check-cast v5, Lokio/n;

    .line 114
    .line 115
    invoke-virtual {v5}, Lokio/n;->size()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-lez v5, :cond_4

    .line 120
    .line 121
    move v5, v2

    .line 122
    goto :goto_3

    .line 123
    :cond_4
    move v5, v3

    .line 124
    :goto_3
    if-eqz v5, :cond_b

    .line 125
    .line 126
    move v5, v3

    .line 127
    :goto_4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-ge v5, v6, :cond_9

    .line 132
    .line 133
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    check-cast v6, Lokio/n;

    .line 138
    .line 139
    add-int/lit8 v7, v5, 0x1

    .line 140
    .line 141
    move v8, v7

    .line 142
    :goto_5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-ge v8, v9, :cond_8

    .line 147
    .line 148
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    check-cast v9, Lokio/n;

    .line 153
    .line 154
    invoke-virtual {v9, v6}, Lokio/n;->startsWith(Lokio/n;)Z

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-eqz v10, :cond_8

    .line 159
    .line 160
    invoke-virtual {v9}, Lokio/n;->size()I

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    invoke-virtual {v6}, Lokio/n;->size()I

    .line 165
    .line 166
    .line 167
    move-result v11

    .line 168
    if-eq v10, v11, :cond_5

    .line 169
    .line 170
    move v10, v2

    .line 171
    goto :goto_6

    .line 172
    :cond_5
    move v10, v3

    .line 173
    :goto_6
    if-eqz v10, :cond_7

    .line 174
    .line 175
    invoke-interface {v13, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    check-cast v9, Ljava/lang/Number;

    .line 180
    .line 181
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    invoke-interface {v13, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    check-cast v10, Ljava/lang/Number;

    .line 190
    .line 191
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    if-le v9, v10, :cond_6

    .line 196
    .line 197
    invoke-interface {v1, v8}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    invoke-interface {v13, v8}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_6
    add-int/lit8 v8, v8, 0x1

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 210
    .line 211
    .line 212
    const-string v1, "duplicate option: "

    .line 213
    .line 214
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw v1

    .line 234
    :cond_8
    move v5, v7

    .line 235
    goto :goto_4

    .line 236
    :cond_9
    new-instance v2, Lokio/l;

    .line 237
    .line 238
    invoke-direct {v2}, Lokio/l;-><init>()V

    .line 239
    .line 240
    .line 241
    const-wide/16 v6, 0x0

    .line 242
    .line 243
    const/4 v9, 0x0

    .line 244
    const/4 v11, 0x0

    .line 245
    const/4 v12, 0x0

    .line 246
    const/16 v14, 0x35

    .line 247
    .line 248
    const/4 v15, 0x0

    .line 249
    move-object/from16 v5, p0

    .line 250
    .line 251
    move-object v8, v2

    .line 252
    move-object v10, v1

    .line 253
    invoke-static/range {v5 .. v15}, Lokio/b1$a;->b(Lokio/b1$a;JLokio/l;ILjava/util/List;IILjava/util/List;ILjava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    move-object/from16 v1, p0

    .line 257
    .line 258
    invoke-direct {v1, v2}, Lokio/b1$a;->c(Lokio/l;)J

    .line 259
    .line 260
    .line 261
    move-result-wide v5

    .line 262
    long-to-int v5, v5

    .line 263
    new-array v5, v5, [I

    .line 264
    .line 265
    :goto_7
    invoke-virtual {v2}, Lokio/l;->e0()Z

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    if-nez v6, :cond_a

    .line 270
    .line 271
    add-int/lit8 v6, v3, 0x1

    .line 272
    .line 273
    invoke-virtual {v2}, Lokio/l;->readInt()I

    .line 274
    .line 275
    .line 276
    move-result v7

    .line 277
    aput v7, v5, v3

    .line 278
    .line 279
    move v3, v6

    .line 280
    goto :goto_7

    .line 281
    :cond_a
    new-instance v2, Lokio/b1;

    .line 282
    .line 283
    array-length v3, v0

    .line 284
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    const-string v3, "copyOf(this, size)"

    .line 289
    .line 290
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    check-cast v0, [Lokio/n;

    .line 294
    .line 295
    invoke-direct {v2, v0, v5, v4}, Lokio/b1;-><init>([Lokio/n;[ILkotlin/jvm/internal/w;)V

    .line 296
    .line 297
    .line 298
    return-object v2

    .line 299
    :cond_b
    move-object/from16 v1, p0

    .line 300
    .line 301
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 302
    .line 303
    const-string v2, "the empty byte string is not a supported option"

    .line 304
    .line 305
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw v0

    .line 313
    :array_0
    .array-data 4
        0x0
        -0x1
    .end array-data
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
.end method
