.class public final Lokio/internal/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "commonAsUtf8ToByteArray",
        "",
        "",
        "commonToUtf8String",
        "beginIndex",
        "",
        "endIndex",
        "okio"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n+ 2 Utf8.kt\nokio/Utf8\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,60:1\n260#2,16:61\n277#2:78\n397#2,9:79\n127#2:88\n406#2,20:90\n279#2,3:110\n440#2,4:113\n127#2:117\n446#2,10:118\n127#2:128\n456#2,5:129\n127#2:134\n461#2,24:135\n283#2,3:159\n500#2,3:162\n286#2,12:165\n503#2:177\n127#2:178\n506#2,2:179\n127#2:181\n510#2,10:182\n127#2:192\n520#2,5:193\n127#2:198\n525#2,5:199\n127#2:204\n530#2,28:205\n302#2,6:233\n138#2,67:239\n68#3:77\n74#3:89\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n*L\n34#1:61,16\n34#1:78\n34#1:79,9\n34#1:88\n34#1:90,20\n34#1:110,3\n34#1:113,4\n34#1:117\n34#1:118,10\n34#1:128\n34#1:129,5\n34#1:134\n34#1:135,24\n34#1:159,3\n34#1:162,3\n34#1:165,12\n34#1:177\n34#1:178\n34#1:179,2\n34#1:181\n34#1:182,10\n34#1:192\n34#1:193,5\n34#1:198\n34#1:199,5\n34#1:204\n34#1:205,28\n34#1:233,6\n50#1:239,67\n34#1:77\n34#1:89\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;)[B
    .locals 14
    .param p0    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    mul-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    :goto_0
    const-string v4, "copyOf(this, newSize)"

    .line 21
    .line 22
    if-ge v3, v1, :cond_a

    .line 23
    .line 24
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const/16 v6, 0x80

    .line 29
    .line 30
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l0;->t(II)I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-ltz v7, :cond_9

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    move v5, v3

    .line 41
    :cond_0
    :goto_1
    if-ge v3, v1, :cond_8

    .line 42
    .line 43
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-static {v7, v6}, Lkotlin/jvm/internal/l0;->t(II)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-gez v8, :cond_1

    .line 52
    .line 53
    int-to-byte v7, v7

    .line 54
    add-int/lit8 v8, v5, 0x1

    .line 55
    .line 56
    aput-byte v7, v0, v5

    .line 57
    .line 58
    add-int/lit8 v3, v3, 0x1

    .line 59
    .line 60
    :goto_2
    move v5, v8

    .line 61
    if-ge v3, v1, :cond_0

    .line 62
    .line 63
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    invoke-static {v7, v6}, Lkotlin/jvm/internal/l0;->t(II)I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-gez v7, :cond_0

    .line 72
    .line 73
    add-int/lit8 v7, v3, 0x1

    .line 74
    .line 75
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    int-to-byte v3, v3

    .line 80
    add-int/lit8 v8, v5, 0x1

    .line 81
    .line 82
    aput-byte v3, v0, v5

    .line 83
    .line 84
    move v3, v7

    .line 85
    goto :goto_2

    .line 86
    :cond_1
    const/16 v8, 0x800

    .line 87
    .line 88
    invoke-static {v7, v8}, Lkotlin/jvm/internal/l0;->t(II)I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-gez v8, :cond_2

    .line 93
    .line 94
    shr-int/lit8 v8, v7, 0x6

    .line 95
    .line 96
    or-int/lit16 v8, v8, 0xc0

    .line 97
    .line 98
    int-to-byte v8, v8

    .line 99
    add-int/lit8 v9, v5, 0x1

    .line 100
    .line 101
    aput-byte v8, v0, v5

    .line 102
    .line 103
    and-int/lit8 v5, v7, 0x3f

    .line 104
    .line 105
    or-int/2addr v5, v6

    .line 106
    int-to-byte v5, v5

    .line 107
    add-int/lit8 v7, v9, 0x1

    .line 108
    .line 109
    aput-byte v5, v0, v9

    .line 110
    .line 111
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    :goto_4
    move v5, v7

    .line 114
    goto :goto_1

    .line 115
    :cond_2
    const v8, 0xd800

    .line 116
    .line 117
    .line 118
    const v9, 0xe000

    .line 119
    .line 120
    .line 121
    const/4 v10, 0x1

    .line 122
    if-gt v8, v7, :cond_3

    .line 123
    .line 124
    if-ge v7, v9, :cond_3

    .line 125
    .line 126
    move v8, v10

    .line 127
    goto :goto_5

    .line 128
    :cond_3
    move v8, v2

    .line 129
    :goto_5
    const/16 v11, 0x3f

    .line 130
    .line 131
    if-nez v8, :cond_4

    .line 132
    .line 133
    shr-int/lit8 v8, v7, 0xc

    .line 134
    .line 135
    or-int/lit16 v8, v8, 0xe0

    .line 136
    .line 137
    int-to-byte v8, v8

    .line 138
    add-int/lit8 v9, v5, 0x1

    .line 139
    .line 140
    aput-byte v8, v0, v5

    .line 141
    .line 142
    shr-int/lit8 v5, v7, 0x6

    .line 143
    .line 144
    and-int/2addr v5, v11

    .line 145
    or-int/2addr v5, v6

    .line 146
    int-to-byte v5, v5

    .line 147
    add-int/lit8 v8, v9, 0x1

    .line 148
    .line 149
    aput-byte v5, v0, v9

    .line 150
    .line 151
    and-int/lit8 v5, v7, 0x3f

    .line 152
    .line 153
    or-int/2addr v5, v6

    .line 154
    int-to-byte v5, v5

    .line 155
    add-int/lit8 v7, v8, 0x1

    .line 156
    .line 157
    aput-byte v5, v0, v8

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_4
    const v8, 0xdbff

    .line 161
    .line 162
    .line 163
    invoke-static {v7, v8}, Lkotlin/jvm/internal/l0;->t(II)I

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    if-gtz v8, :cond_7

    .line 168
    .line 169
    add-int/lit8 v8, v3, 0x1

    .line 170
    .line 171
    if-le v1, v8, :cond_7

    .line 172
    .line 173
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    const v13, 0xdc00

    .line 178
    .line 179
    .line 180
    if-gt v13, v12, :cond_5

    .line 181
    .line 182
    if-ge v12, v9, :cond_5

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_5
    move v10, v2

    .line 186
    :goto_6
    if-nez v10, :cond_6

    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_6
    shl-int/lit8 v7, v7, 0xa

    .line 190
    .line 191
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    add-int/2addr v7, v8

    .line 196
    const v8, -0x35fdc00

    .line 197
    .line 198
    .line 199
    add-int/2addr v7, v8

    .line 200
    shr-int/lit8 v8, v7, 0x12

    .line 201
    .line 202
    or-int/lit16 v8, v8, 0xf0

    .line 203
    .line 204
    int-to-byte v8, v8

    .line 205
    add-int/lit8 v9, v5, 0x1

    .line 206
    .line 207
    aput-byte v8, v0, v5

    .line 208
    .line 209
    shr-int/lit8 v5, v7, 0xc

    .line 210
    .line 211
    and-int/2addr v5, v11

    .line 212
    or-int/2addr v5, v6

    .line 213
    int-to-byte v5, v5

    .line 214
    add-int/lit8 v8, v9, 0x1

    .line 215
    .line 216
    aput-byte v5, v0, v9

    .line 217
    .line 218
    shr-int/lit8 v5, v7, 0x6

    .line 219
    .line 220
    and-int/2addr v5, v11

    .line 221
    or-int/2addr v5, v6

    .line 222
    int-to-byte v5, v5

    .line 223
    add-int/lit8 v9, v8, 0x1

    .line 224
    .line 225
    aput-byte v5, v0, v8

    .line 226
    .line 227
    and-int/lit8 v5, v7, 0x3f

    .line 228
    .line 229
    or-int/2addr v5, v6

    .line 230
    int-to-byte v5, v5

    .line 231
    add-int/lit8 v7, v9, 0x1

    .line 232
    .line 233
    aput-byte v5, v0, v9

    .line 234
    .line 235
    add-int/lit8 v3, v3, 0x2

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_7
    :goto_7
    add-int/lit8 v7, v5, 0x1

    .line 239
    .line 240
    aput-byte v11, v0, v5

    .line 241
    .line 242
    goto/16 :goto_3

    .line 243
    .line 244
    :cond_8
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-static {p0, v4}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    return-object p0

    .line 252
    :cond_9
    int-to-byte v4, v5

    .line 253
    aput-byte v4, v0, v3

    .line 254
    .line 255
    add-int/lit8 v3, v3, 0x1

    .line 256
    .line 257
    goto/16 :goto_0

    .line 258
    .line 259
    :cond_a
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 260
    .line 261
    .line 262
    move-result p0

    .line 263
    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-static {p0, v4}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    return-object p0
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
.end method

.method public static final b([BII)Ljava/lang/String;
    .locals 16
    .param p0    # [B
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "<this>"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    if-ltz v1, :cond_27

    .line 13
    .line 14
    array-length v3, v0

    .line 15
    if-gt v2, v3, :cond_27

    .line 16
    .line 17
    if-gt v1, v2, :cond_27

    .line 18
    .line 19
    sub-int v3, v2, v1

    .line 20
    .line 21
    new-array v3, v3, [C

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    move v5, v4

    .line 25
    :cond_0
    :goto_0
    if-ge v1, v2, :cond_26

    .line 26
    .line 27
    aget-byte v6, v0, v1

    .line 28
    .line 29
    if-ltz v6, :cond_1

    .line 30
    .line 31
    int-to-char v6, v6

    .line 32
    add-int/lit8 v7, v5, 0x1

    .line 33
    .line 34
    aput-char v6, v3, v5

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    :goto_1
    move v5, v7

    .line 39
    if-ge v1, v2, :cond_0

    .line 40
    .line 41
    aget-byte v6, v0, v1

    .line 42
    .line 43
    if-ltz v6, :cond_0

    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    int-to-char v6, v6

    .line 48
    add-int/lit8 v7, v5, 0x1

    .line 49
    .line 50
    aput-char v6, v3, v5

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    shr-int/lit8 v7, v6, 0x5

    .line 54
    .line 55
    const/4 v8, -0x2

    .line 56
    const/16 v10, 0x80

    .line 57
    .line 58
    const v11, 0xfffd

    .line 59
    .line 60
    .line 61
    if-ne v7, v8, :cond_8

    .line 62
    .line 63
    add-int/lit8 v7, v1, 0x1

    .line 64
    .line 65
    if-gt v2, v7, :cond_3

    .line 66
    .line 67
    int-to-char v6, v11

    .line 68
    add-int/lit8 v7, v5, 0x1

    .line 69
    .line 70
    aput-char v6, v3, v5

    .line 71
    .line 72
    :goto_2
    sget-object v5, Lkotlin/r2;->a:Lkotlin/r2;

    .line 73
    .line 74
    :cond_2
    :goto_3
    move v5, v7

    .line 75
    :goto_4
    const/4 v9, 0x1

    .line 76
    goto :goto_9

    .line 77
    :cond_3
    aget-byte v7, v0, v7

    .line 78
    .line 79
    and-int/lit16 v8, v7, 0xc0

    .line 80
    .line 81
    if-ne v8, v10, :cond_4

    .line 82
    .line 83
    const/4 v8, 0x1

    .line 84
    goto :goto_5

    .line 85
    :cond_4
    move v8, v4

    .line 86
    :goto_5
    if-nez v8, :cond_5

    .line 87
    .line 88
    int-to-char v6, v11

    .line 89
    add-int/lit8 v7, v5, 0x1

    .line 90
    .line 91
    aput-char v6, v3, v5

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    xor-int/lit16 v7, v7, 0xf80

    .line 95
    .line 96
    shl-int/lit8 v6, v6, 0x6

    .line 97
    .line 98
    xor-int/2addr v6, v7

    .line 99
    if-ge v6, v10, :cond_6

    .line 100
    .line 101
    int-to-char v6, v11

    .line 102
    add-int/lit8 v7, v5, 0x1

    .line 103
    .line 104
    aput-char v6, v3, v5

    .line 105
    .line 106
    goto :goto_6

    .line 107
    :cond_6
    int-to-char v6, v6

    .line 108
    add-int/lit8 v7, v5, 0x1

    .line 109
    .line 110
    aput-char v6, v3, v5

    .line 111
    .line 112
    :goto_6
    sget-object v5, Lkotlin/r2;->a:Lkotlin/r2;

    .line 113
    .line 114
    :cond_7
    :goto_7
    move v5, v7

    .line 115
    :goto_8
    const/4 v9, 0x2

    .line 116
    :goto_9
    add-int/2addr v1, v9

    .line 117
    goto :goto_0

    .line 118
    :cond_8
    shr-int/lit8 v7, v6, 0x4

    .line 119
    .line 120
    const v13, 0xe000

    .line 121
    .line 122
    .line 123
    const v14, 0xd800

    .line 124
    .line 125
    .line 126
    const/4 v15, 0x3

    .line 127
    if-ne v7, v8, :cond_12

    .line 128
    .line 129
    add-int/lit8 v7, v1, 0x2

    .line 130
    .line 131
    if-gt v2, v7, :cond_a

    .line 132
    .line 133
    int-to-char v6, v11

    .line 134
    add-int/lit8 v7, v5, 0x1

    .line 135
    .line 136
    aput-char v6, v3, v5

    .line 137
    .line 138
    sget-object v5, Lkotlin/r2;->a:Lkotlin/r2;

    .line 139
    .line 140
    add-int/lit8 v5, v1, 0x1

    .line 141
    .line 142
    if-le v2, v5, :cond_2

    .line 143
    .line 144
    aget-byte v5, v0, v5

    .line 145
    .line 146
    and-int/lit16 v5, v5, 0xc0

    .line 147
    .line 148
    if-ne v5, v10, :cond_9

    .line 149
    .line 150
    const/4 v5, 0x1

    .line 151
    goto :goto_a

    .line 152
    :cond_9
    move v5, v4

    .line 153
    :goto_a
    if-nez v5, :cond_7

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_a
    add-int/lit8 v8, v1, 0x1

    .line 157
    .line 158
    aget-byte v8, v0, v8

    .line 159
    .line 160
    and-int/lit16 v9, v8, 0xc0

    .line 161
    .line 162
    if-ne v9, v10, :cond_b

    .line 163
    .line 164
    const/4 v9, 0x1

    .line 165
    goto :goto_b

    .line 166
    :cond_b
    move v9, v4

    .line 167
    :goto_b
    if-nez v9, :cond_c

    .line 168
    .line 169
    int-to-char v6, v11

    .line 170
    add-int/lit8 v7, v5, 0x1

    .line 171
    .line 172
    aput-char v6, v3, v5

    .line 173
    .line 174
    sget-object v5, Lkotlin/r2;->a:Lkotlin/r2;

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_c
    aget-byte v7, v0, v7

    .line 178
    .line 179
    and-int/lit16 v9, v7, 0xc0

    .line 180
    .line 181
    if-ne v9, v10, :cond_d

    .line 182
    .line 183
    const/4 v9, 0x1

    .line 184
    goto :goto_c

    .line 185
    :cond_d
    move v9, v4

    .line 186
    :goto_c
    if-nez v9, :cond_e

    .line 187
    .line 188
    int-to-char v6, v11

    .line 189
    add-int/lit8 v7, v5, 0x1

    .line 190
    .line 191
    aput-char v6, v3, v5

    .line 192
    .line 193
    sget-object v5, Lkotlin/r2;->a:Lkotlin/r2;

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_e
    const v9, -0x1e080

    .line 197
    .line 198
    .line 199
    xor-int/2addr v7, v9

    .line 200
    shl-int/lit8 v8, v8, 0x6

    .line 201
    .line 202
    xor-int/2addr v7, v8

    .line 203
    shl-int/lit8 v6, v6, 0xc

    .line 204
    .line 205
    xor-int/2addr v6, v7

    .line 206
    const/16 v7, 0x800

    .line 207
    .line 208
    if-ge v6, v7, :cond_f

    .line 209
    .line 210
    int-to-char v6, v11

    .line 211
    add-int/lit8 v7, v5, 0x1

    .line 212
    .line 213
    aput-char v6, v3, v5

    .line 214
    .line 215
    :goto_d
    sget-object v5, Lkotlin/r2;->a:Lkotlin/r2;

    .line 216
    .line 217
    goto :goto_f

    .line 218
    :cond_f
    if-gt v14, v6, :cond_10

    .line 219
    .line 220
    if-ge v6, v13, :cond_10

    .line 221
    .line 222
    const/4 v12, 0x1

    .line 223
    goto :goto_e

    .line 224
    :cond_10
    move v12, v4

    .line 225
    :goto_e
    if-eqz v12, :cond_11

    .line 226
    .line 227
    int-to-char v6, v11

    .line 228
    add-int/lit8 v7, v5, 0x1

    .line 229
    .line 230
    aput-char v6, v3, v5

    .line 231
    .line 232
    goto :goto_d

    .line 233
    :cond_11
    int-to-char v6, v6

    .line 234
    add-int/lit8 v7, v5, 0x1

    .line 235
    .line 236
    aput-char v6, v3, v5

    .line 237
    .line 238
    goto :goto_d

    .line 239
    :goto_f
    move v5, v7

    .line 240
    :goto_10
    move v9, v15

    .line 241
    goto :goto_9

    .line 242
    :cond_12
    shr-int/lit8 v7, v6, 0x3

    .line 243
    .line 244
    if-ne v7, v8, :cond_25

    .line 245
    .line 246
    add-int/lit8 v7, v1, 0x3

    .line 247
    .line 248
    if-gt v2, v7, :cond_19

    .line 249
    .line 250
    add-int/lit8 v6, v5, 0x1

    .line 251
    .line 252
    aput-char v11, v3, v5

    .line 253
    .line 254
    sget-object v5, Lkotlin/r2;->a:Lkotlin/r2;

    .line 255
    .line 256
    add-int/lit8 v5, v1, 0x1

    .line 257
    .line 258
    if-le v2, v5, :cond_18

    .line 259
    .line 260
    aget-byte v5, v0, v5

    .line 261
    .line 262
    and-int/lit16 v5, v5, 0xc0

    .line 263
    .line 264
    if-ne v5, v10, :cond_13

    .line 265
    .line 266
    const/4 v5, 0x1

    .line 267
    goto :goto_11

    .line 268
    :cond_13
    move v5, v4

    .line 269
    :goto_11
    if-nez v5, :cond_14

    .line 270
    .line 271
    goto :goto_15

    .line 272
    :cond_14
    add-int/lit8 v5, v1, 0x2

    .line 273
    .line 274
    if-le v2, v5, :cond_17

    .line 275
    .line 276
    aget-byte v5, v0, v5

    .line 277
    .line 278
    and-int/lit16 v5, v5, 0xc0

    .line 279
    .line 280
    if-ne v5, v10, :cond_15

    .line 281
    .line 282
    const/4 v12, 0x1

    .line 283
    goto :goto_12

    .line 284
    :cond_15
    move v12, v4

    .line 285
    :goto_12
    if-nez v12, :cond_16

    .line 286
    .line 287
    goto :goto_14

    .line 288
    :cond_16
    :goto_13
    move v5, v6

    .line 289
    goto :goto_10

    .line 290
    :cond_17
    :goto_14
    move v5, v6

    .line 291
    goto/16 :goto_8

    .line 292
    .line 293
    :cond_18
    :goto_15
    move v5, v6

    .line 294
    goto/16 :goto_4

    .line 295
    .line 296
    :cond_19
    add-int/lit8 v8, v1, 0x1

    .line 297
    .line 298
    aget-byte v8, v0, v8

    .line 299
    .line 300
    and-int/lit16 v9, v8, 0xc0

    .line 301
    .line 302
    if-ne v9, v10, :cond_1a

    .line 303
    .line 304
    const/4 v9, 0x1

    .line 305
    goto :goto_16

    .line 306
    :cond_1a
    move v9, v4

    .line 307
    :goto_16
    if-nez v9, :cond_1b

    .line 308
    .line 309
    add-int/lit8 v6, v5, 0x1

    .line 310
    .line 311
    aput-char v11, v3, v5

    .line 312
    .line 313
    sget-object v5, Lkotlin/r2;->a:Lkotlin/r2;

    .line 314
    .line 315
    goto :goto_15

    .line 316
    :cond_1b
    add-int/lit8 v9, v1, 0x2

    .line 317
    .line 318
    aget-byte v9, v0, v9

    .line 319
    .line 320
    and-int/lit16 v12, v9, 0xc0

    .line 321
    .line 322
    if-ne v12, v10, :cond_1c

    .line 323
    .line 324
    const/4 v12, 0x1

    .line 325
    goto :goto_17

    .line 326
    :cond_1c
    move v12, v4

    .line 327
    :goto_17
    if-nez v12, :cond_1d

    .line 328
    .line 329
    add-int/lit8 v6, v5, 0x1

    .line 330
    .line 331
    aput-char v11, v3, v5

    .line 332
    .line 333
    sget-object v5, Lkotlin/r2;->a:Lkotlin/r2;

    .line 334
    .line 335
    goto :goto_14

    .line 336
    :cond_1d
    aget-byte v7, v0, v7

    .line 337
    .line 338
    and-int/lit16 v12, v7, 0xc0

    .line 339
    .line 340
    if-ne v12, v10, :cond_1e

    .line 341
    .line 342
    const/4 v10, 0x1

    .line 343
    goto :goto_18

    .line 344
    :cond_1e
    move v10, v4

    .line 345
    :goto_18
    if-nez v10, :cond_1f

    .line 346
    .line 347
    add-int/lit8 v6, v5, 0x1

    .line 348
    .line 349
    aput-char v11, v3, v5

    .line 350
    .line 351
    sget-object v5, Lkotlin/r2;->a:Lkotlin/r2;

    .line 352
    .line 353
    goto :goto_13

    .line 354
    :cond_1f
    const v10, 0x381f80

    .line 355
    .line 356
    .line 357
    xor-int/2addr v7, v10

    .line 358
    shl-int/lit8 v9, v9, 0x6

    .line 359
    .line 360
    xor-int/2addr v7, v9

    .line 361
    shl-int/lit8 v8, v8, 0xc

    .line 362
    .line 363
    xor-int/2addr v7, v8

    .line 364
    shl-int/lit8 v6, v6, 0x12

    .line 365
    .line 366
    xor-int/2addr v6, v7

    .line 367
    const v7, 0x10ffff

    .line 368
    .line 369
    .line 370
    if-le v6, v7, :cond_20

    .line 371
    .line 372
    add-int/lit8 v6, v5, 0x1

    .line 373
    .line 374
    aput-char v11, v3, v5

    .line 375
    .line 376
    :goto_19
    sget-object v5, Lkotlin/r2;->a:Lkotlin/r2;

    .line 377
    .line 378
    goto :goto_1b

    .line 379
    :cond_20
    if-gt v14, v6, :cond_21

    .line 380
    .line 381
    if-ge v6, v13, :cond_21

    .line 382
    .line 383
    const/4 v12, 0x1

    .line 384
    goto :goto_1a

    .line 385
    :cond_21
    move v12, v4

    .line 386
    :goto_1a
    if-eqz v12, :cond_22

    .line 387
    .line 388
    add-int/lit8 v6, v5, 0x1

    .line 389
    .line 390
    aput-char v11, v3, v5

    .line 391
    .line 392
    goto :goto_19

    .line 393
    :cond_22
    const/high16 v7, 0x10000

    .line 394
    .line 395
    if-ge v6, v7, :cond_23

    .line 396
    .line 397
    add-int/lit8 v6, v5, 0x1

    .line 398
    .line 399
    aput-char v11, v3, v5

    .line 400
    .line 401
    goto :goto_19

    .line 402
    :cond_23
    if-eq v6, v11, :cond_24

    .line 403
    .line 404
    ushr-int/lit8 v7, v6, 0xa

    .line 405
    .line 406
    const v8, 0xd7c0

    .line 407
    .line 408
    .line 409
    add-int/2addr v7, v8

    .line 410
    int-to-char v7, v7

    .line 411
    add-int/lit8 v8, v5, 0x1

    .line 412
    .line 413
    aput-char v7, v3, v5

    .line 414
    .line 415
    and-int/lit16 v5, v6, 0x3ff

    .line 416
    .line 417
    const v6, 0xdc00

    .line 418
    .line 419
    .line 420
    add-int/2addr v5, v6

    .line 421
    int-to-char v5, v5

    .line 422
    add-int/lit8 v6, v8, 0x1

    .line 423
    .line 424
    aput-char v5, v3, v8

    .line 425
    .line 426
    goto :goto_19

    .line 427
    :cond_24
    add-int/lit8 v6, v5, 0x1

    .line 428
    .line 429
    aput-char v11, v3, v5

    .line 430
    .line 431
    goto :goto_19

    .line 432
    :goto_1b
    const/4 v9, 0x4

    .line 433
    move v5, v6

    .line 434
    goto/16 :goto_9

    .line 435
    .line 436
    :cond_25
    add-int/lit8 v6, v5, 0x1

    .line 437
    .line 438
    aput-char v11, v3, v5

    .line 439
    .line 440
    add-int/lit8 v1, v1, 0x1

    .line 441
    .line 442
    move v5, v6

    .line 443
    goto/16 :goto_0

    .line 444
    .line 445
    :cond_26
    invoke-static {v3, v4, v5}, Lkotlin/text/v;->u1([CII)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    return-object v0

    .line 450
    :cond_27
    new-instance v3, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 451
    .line 452
    new-instance v4, Ljava/lang/StringBuilder;

    .line 453
    .line 454
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 455
    .line 456
    .line 457
    const-string v5, "size="

    .line 458
    .line 459
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    array-length v0, v0

    .line 463
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    const-string v0, " beginIndex="

    .line 467
    .line 468
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    const-string v0, " endIndex="

    .line 475
    .line 476
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    invoke-direct {v3, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    throw v3
.end method

.method public static synthetic c([BIIILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    array-length p2, p0

    :cond_1
    invoke-static {p0, p1, p2}, Lokio/internal/m;->b([BII)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
