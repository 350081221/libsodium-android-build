.class public final Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J=\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\u001b\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0016R\u001c\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006!"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;",
        "",
        "",
        "offset",
        "",
        "fromSource",
        "Landroidx/compose/ui/text/TextRange;",
        "map-fzxv0v0",
        "(IZ)J",
        "map",
        "opOffset",
        "untransformedLen",
        "transformedLen",
        "mapStep-C6u-MEY",
        "(IIIIZ)J",
        "mapStep",
        "sourceStart",
        "sourceEnd",
        "newLength",
        "Lkotlin/r2;",
        "recordEditOperation",
        "mapFromSource--jx7JFs",
        "(I)J",
        "mapFromSource",
        "mapFromDest--jx7JFs",
        "mapFromDest",
        "Landroidx/compose/foundation/text2/input/internal/OpArray;",
        "ops",
        "[I",
        "opsSize",
        "I",
        "<init>",
        "()V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nOffsetMappingCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text2/input/internal/OpArray\n*L\n1#1,416:1\n1#2:417\n390#3,21:418\n*S KotlinDebug\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator\n*L\n298#1:418,21\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private ops:[I
    .annotation build Lp4/l;
    .end annotation
.end field

.field private opsSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/OpArray;->constructor-impl(I)[I

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->ops:[I

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
.end method

.method private final map-fzxv0v0(IZ)J
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->ops:[I

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->opsSize:I

    .line 4
    .line 5
    xor-int/lit8 v2, p2, 0x1

    .line 6
    .line 7
    if-ltz v1, :cond_3

    .line 8
    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    move v3, p1

    .line 14
    :goto_0
    const/4 v2, -0x1

    .line 15
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    mul-int/lit8 v2, v1, 0x3

    .line 18
    .line 19
    aget v8, v0, v2

    .line 20
    .line 21
    add-int/lit8 v4, v2, 0x1

    .line 22
    .line 23
    aget v9, v0, v4

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x2

    .line 26
    .line 27
    aget v10, v0, v2

    .line 28
    .line 29
    move-object v2, p0

    .line 30
    move v4, v8

    .line 31
    move v5, v9

    .line 32
    move v6, v10

    .line 33
    move v7, p2

    .line 34
    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->mapStep-C6u-MEY(IIIIZ)J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    move-object v4, p0

    .line 39
    move v5, p1

    .line 40
    move v6, v8

    .line 41
    move v7, v9

    .line 42
    move v8, v10

    .line 43
    move v9, p2

    .line 44
    invoke-direct/range {v4 .. v9}, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->mapStep-C6u-MEY(IIIIZ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v4

    .line 48
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-static {p1, v6}, Ljava/lang/Math;->min(II)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    add-int/lit8 v1, v1, -0x1

    .line 73
    .line 74
    move v3, p1

    .line 75
    move p1, v2

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    move p2, p1

    .line 78
    move p1, v3

    .line 79
    goto :goto_2

    .line 80
    :cond_1
    const/4 v2, 0x0

    .line 81
    move v4, p1

    .line 82
    :goto_1
    if-ge v2, v1, :cond_2

    .line 83
    .line 84
    mul-int/lit8 v3, v2, 0x3

    .line 85
    .line 86
    aget v9, v0, v3

    .line 87
    .line 88
    add-int/lit8 v5, v3, 0x1

    .line 89
    .line 90
    aget v10, v0, v5

    .line 91
    .line 92
    add-int/lit8 v3, v3, 0x2

    .line 93
    .line 94
    aget v11, v0, v3

    .line 95
    .line 96
    move-object v3, p0

    .line 97
    move v5, v9

    .line 98
    move v6, v10

    .line 99
    move v7, v11

    .line 100
    move v8, p2

    .line 101
    invoke-direct/range {v3 .. v8}, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->mapStep-C6u-MEY(IIIIZ)J

    .line 102
    .line 103
    .line 104
    move-result-wide v3

    .line 105
    move-object v5, p0

    .line 106
    move v6, p1

    .line 107
    move v7, v9

    .line 108
    move v8, v10

    .line 109
    move v9, v11

    .line 110
    move v10, p2

    .line 111
    invoke-direct/range {v5 .. v10}, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->mapStep-C6u-MEY(IIIIZ)J

    .line 112
    .line 113
    .line 114
    move-result-wide v5

    .line 115
    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-static {p1, v7}, Ljava/lang/Math;->min(II)I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    add-int/lit8 v2, v2, 0x1

    .line 140
    .line 141
    move v4, p1

    .line 142
    move p1, v3

    .line 143
    goto :goto_1

    .line 144
    :cond_2
    move p2, p1

    .line 145
    move p1, v4

    .line 146
    goto :goto_2

    .line 147
    :cond_3
    move p2, p1

    .line 148
    :goto_2
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    .line 149
    .line 150
    .line 151
    move-result-wide p1

    .line 152
    return-wide p1
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
.end method

.method private final mapStep-C6u-MEY(IIIIZ)J
    .locals 1

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    move v0, p3

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    move v0, p4

    .line 6
    :goto_0
    if-eqz p5, :cond_1

    .line 7
    .line 8
    move p3, p4

    .line 9
    :cond_1
    if-ge p1, p2, :cond_2

    .line 10
    .line 11
    invoke-static {p1}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    goto :goto_1

    .line 16
    :cond_2
    if-ne p1, p2, :cond_4

    .line 17
    .line 18
    if-nez v0, :cond_3

    .line 19
    .line 20
    add-int/2addr p3, p2

    .line 21
    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    goto :goto_1

    .line 26
    :cond_3
    invoke-static {p2}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    goto :goto_1

    .line 31
    :cond_4
    add-int p4, p2, v0

    .line 32
    .line 33
    if-ge p1, p4, :cond_6

    .line 34
    .line 35
    if-nez p3, :cond_5

    .line 36
    .line 37
    invoke-static {p2}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    goto :goto_1

    .line 42
    :cond_5
    add-int/2addr p3, p2

    .line 43
    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    .line 44
    .line 45
    .line 46
    move-result-wide p1

    .line 47
    goto :goto_1

    .line 48
    :cond_6
    sub-int/2addr p1, v0

    .line 49
    add-int/2addr p1, p3

    .line 50
    invoke-static {p1}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    :goto_1
    return-wide p1
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
.end method


# virtual methods
.method public final mapFromDest--jx7JFs(I)J
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->map-fzxv0v0(IZ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final mapFromSource--jx7JFs(I)J
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->map-fzxv0v0(IZ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final recordEditOperation(III)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ltz p3, :cond_0

    .line 3
    .line 4
    move v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    :goto_0
    if-eqz v1, :cond_3

    .line 8
    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    sub-int/2addr p2, p1

    .line 18
    const/4 v1, 0x2

    .line 19
    if-ge p2, v1, :cond_1

    .line 20
    .line 21
    if-ne p2, p3, :cond_1

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget v2, p0, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->opsSize:I

    .line 25
    .line 26
    add-int/2addr v2, v0

    .line 27
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->ops:[I

    .line 28
    .line 29
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/OpArray;->getSize-impl([I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-le v2, v0, :cond_2

    .line 34
    .line 35
    mul-int/lit8 v0, v2, 0x2

    .line 36
    .line 37
    iget-object v3, p0, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->ops:[I

    .line 38
    .line 39
    invoke-static {v3}, Landroidx/compose/foundation/text2/input/internal/OpArray;->getSize-impl([I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    mul-int/2addr v3, v1

    .line 44
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->ops:[I

    .line 49
    .line 50
    invoke-static {v1, v0}, Landroidx/compose/foundation/text2/input/internal/OpArray;->copyOf-S4-kM8k([II)[I

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->ops:[I

    .line 55
    .line 56
    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->ops:[I

    .line 57
    .line 58
    iget v1, p0, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->opsSize:I

    .line 59
    .line 60
    invoke-static {v0, v1, p1, p2, p3}, Landroidx/compose/foundation/text2/input/internal/OpArray;->set-impl([IIIII)V

    .line 61
    .line 62
    .line 63
    iput v2, p0, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->opsSize:I

    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string p2, "Expected newLen to be \u2265 0, was "

    .line 72
    .line 73
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p2
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
.end method
