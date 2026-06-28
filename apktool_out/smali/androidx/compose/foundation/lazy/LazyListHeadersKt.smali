.class public final Landroidx/compose/foundation/lazy/LazyListHeadersKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0008H\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "findOrComposeLazyListHeader",
        "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
        "composedVisibleItems",
        "",
        "itemProvider",
        "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;",
        "headerIndexes",
        "",
        "",
        "beforeContentPadding",
        "layoutWidth",
        "layoutHeight",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nLazyListHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,95:1\n1#2:96\n69#3,6:97\n*S KotlinDebug\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n*L\n57#1:97,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final findOrComposeLazyListHeader(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;Ljava/util/List;III)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .locals 14
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;III)",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    move-object/from16 v1, p2

    .line 3
    .line 4
    move/from16 v2, p3

    .line 5
    .line 6
    invoke-static {p0}, Lkotlin/collections/u;->y2(Ljava/util/List;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    check-cast v3, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 11
    .line 12
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/4 v5, -0x1

    .line 21
    const/4 v6, 0x0

    .line 22
    move v8, v5

    .line 23
    move v9, v8

    .line 24
    move v7, v6

    .line 25
    :goto_0
    if-ge v7, v4, :cond_1

    .line 26
    .line 27
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v10

    .line 31
    check-cast v10, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    if-gt v10, v3, :cond_1

    .line 38
    .line 39
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    check-cast v8, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    add-int/lit8 v7, v7, 0x1

    .line 50
    .line 51
    if-ltz v7, :cond_0

    .line 52
    .line 53
    invoke-static/range {p2 .. p2}, Lkotlin/collections/u;->G(Ljava/util/List;)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-gt v7, v9, :cond_0

    .line 58
    .line 59
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    goto :goto_1

    .line 64
    :cond_0
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    :goto_1
    check-cast v9, Ljava/lang/Number;

    .line 69
    .line 70
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    const/high16 v3, -0x80000000

    .line 80
    .line 81
    move v7, v3

    .line 82
    move v10, v7

    .line 83
    move v11, v5

    .line 84
    move v4, v6

    .line 85
    :goto_2
    if-ge v4, v1, :cond_4

    .line 86
    .line 87
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v12

    .line 91
    check-cast v12, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 92
    .line 93
    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 94
    .line 95
    .line 96
    move-result v13

    .line 97
    if-ne v13, v8, :cond_2

    .line 98
    .line 99
    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getOffset()I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    move v11, v4

    .line 104
    goto :goto_3

    .line 105
    :cond_2
    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    if-ne v13, v9, :cond_3

    .line 110
    .line 111
    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getOffset()I

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    :cond_3
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    if-ne v8, v5, :cond_5

    .line 119
    .line 120
    const/4 v0, 0x0

    .line 121
    return-object v0

    .line 122
    :cond_5
    move-object v1, p1

    .line 123
    invoke-virtual {p1, v8}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    const/4 v4, 0x1

    .line 128
    invoke-virtual {v1, v4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->setNonScrollableItem(Z)V

    .line 129
    .line 130
    .line 131
    if-eq v7, v3, :cond_6

    .line 132
    .line 133
    neg-int v2, v2

    .line 134
    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    goto :goto_4

    .line 139
    :cond_6
    neg-int v2, v2

    .line 140
    :goto_4
    if-eq v10, v3, :cond_7

    .line 141
    .line 142
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSize()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    sub-int/2addr v10, v3

    .line 147
    invoke-static {v2, v10}, Ljava/lang/Math;->min(II)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    :cond_7
    move/from16 v3, p4

    .line 152
    .line 153
    move/from16 v4, p5

    .line 154
    .line 155
    invoke-virtual {v1, v2, v3, v4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->position(III)V

    .line 156
    .line 157
    .line 158
    if-eq v11, v5, :cond_8

    .line 159
    .line 160
    invoke-interface {p0, v11, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_8
    invoke-interface {p0, v6, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :goto_5
    return-object v1
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
