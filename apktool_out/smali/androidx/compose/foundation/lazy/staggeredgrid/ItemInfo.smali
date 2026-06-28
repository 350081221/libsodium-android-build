.class final Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000f\u001a\u00020\u0008\u0012\u0006\u0010\u0012\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\t\u001a\u00020\u00088\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00088\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\n\u001a\u0004\u0008\u0010\u0010\u000c\"\u0004\u0008\u0011\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00088\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\n\u001a\u0004\u0008\u0013\u0010\u000c\"\u0004\u0008\u0014\u0010\u000eR4\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;",
        "",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
        "positionedItem",
        "Lkotlinx/coroutines/s0;",
        "coroutineScope",
        "Lkotlin/r2;",
        "updateAnimation",
        "",
        "lane",
        "I",
        "getLane",
        "()I",
        "setLane",
        "(I)V",
        "span",
        "getSpan",
        "setSpan",
        "crossAxisOffset",
        "getCrossAxisOffset",
        "setCrossAxisOffset",
        "",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;",
        "<set-?>",
        "animations",
        "[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;",
        "getAnimations",
        "()[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;",
        "<init>",
        "(III)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private animations:[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private crossAxisOffset:I

.field private lane:I

.field private span:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->lane:I

    .line 5
    .line 6
    iput p2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->span:I

    .line 7
    .line 8
    iput p3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->crossAxisOffset:I

    .line 9
    .line 10
    invoke-static {}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimatorKt;->access$getEmptyArray$p()[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->animations:[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;

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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
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
.end method


# virtual methods
.method public final getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->animations:[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;

    return-object v0
.end method

.method public final getCrossAxisOffset()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->crossAxisOffset:I

    return v0
.end method

.method public final getLane()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->lane:I

    return v0
.end method

.method public final getSpan()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->span:I

    return v0
.end method

.method public final setCrossAxisOffset(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->crossAxisOffset:I

    return-void
.end method

.method public final setLane(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->lane:I

    return-void
.end method

.method public final setSpan(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->span:I

    return-void
.end method

.method public final updateAnimation(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;Lkotlinx/coroutines/s0;)V
    .locals 5
    .param p1    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getPlaceablesCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->animations:[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;

    .line 6
    .line 7
    array-length v1, v1

    .line 8
    :goto_0
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->animations:[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;

    .line 11
    .line 12
    aget-object v2, v2, v0

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;->stopAnimations()V

    .line 17
    .line 18
    .line 19
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->animations:[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;

    .line 23
    .line 24
    array-length v0, v0

    .line 25
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getPlaceablesCount()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eq v0, v1, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->animations:[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getPlaceablesCount()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, "copyOf(this, newSize)"

    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    check-cast v0, [Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;

    .line 47
    .line 48
    iput-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->animations:[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;

    .line 49
    .line 50
    :cond_2
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getPlaceablesCount()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x0

    .line 55
    :goto_1
    if-ge v1, v0, :cond_6

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getParentData(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimatorKt;->access$getSpecs(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    iget-object v2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->animations:[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;

    .line 68
    .line 69
    aget-object v2, v2, v1

    .line 70
    .line 71
    if-eqz v2, :cond_3

    .line 72
    .line 73
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;->stopAnimations()V

    .line 74
    .line 75
    .line 76
    :cond_3
    iget-object v2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->animations:[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    aput-object v3, v2, v1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    iget-object v3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->animations:[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;

    .line 83
    .line 84
    aget-object v3, v3, v1

    .line 85
    .line 86
    if-nez v3, :cond_5

    .line 87
    .line 88
    new-instance v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;

    .line 89
    .line 90
    invoke-direct {v3, p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;-><init>(Lkotlinx/coroutines/s0;)V

    .line 91
    .line 92
    .line 93
    iget-object v4, p0, Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;->animations:[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;

    .line 94
    .line 95
    aput-object v3, v4, v1

    .line 96
    .line 97
    :cond_5
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;->getAppearanceSpec()Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v3, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;->setAppearanceSpec(Landroidx/compose/animation/core/FiniteAnimationSpec;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;->getPlacementSpec()Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v3, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;->setPlacementSpec(Landroidx/compose/animation/core/FiniteAnimationSpec;)V

    .line 109
    .line 110
    .line 111
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_6
    return-void
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
.end method
