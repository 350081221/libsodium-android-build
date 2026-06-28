.class abstract Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/graphics/drawable/DrawableContainerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "DrawableContainerState"
.end annotation


# instance fields
.field mAutoMirrored:Z

.field mCanConstantState:Z

.field mChangingConfigurations:I

.field mCheckedConstantSize:Z

.field mCheckedConstantState:Z

.field mCheckedOpacity:Z

.field mCheckedPadding:Z

.field mCheckedStateful:Z

.field mChildrenChangingConfigurations:I

.field mColorFilter:Landroid/graphics/ColorFilter;

.field mConstantHeight:I

.field mConstantMinimumHeight:I

.field mConstantMinimumWidth:I

.field mConstantPadding:Landroid/graphics/Rect;

.field mConstantSize:Z

.field mConstantWidth:I

.field mDensity:I

.field mDither:Z

.field mDrawableFutures:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;"
        }
    .end annotation
.end field

.field mDrawables:[Landroid/graphics/drawable/Drawable;

.field mEnterFadeDuration:I

.field mExitFadeDuration:I

.field mHasColorFilter:Z

.field mHasTintList:Z

.field mHasTintMode:Z

.field mLayoutDirection:I

.field mMutated:Z

.field mNumChildren:I

.field mOpacity:I

.field final mOwner:Landroidx/appcompat/graphics/drawable/DrawableContainerCompat;

.field mSourceRes:Landroid/content/res/Resources;

.field mStateful:Z

.field mTintList:Landroid/content/res/ColorStateList;

.field mTintMode:Landroid/graphics/PorterDuff$Mode;

.field mVariablePadding:Z


# direct methods
.method constructor <init>(Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;Landroidx/appcompat/graphics/drawable/DrawableContainerCompat;Landroid/content/res/Resources;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mVariablePadding:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantSize:Z

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDither:Z

    .line 11
    .line 12
    iput v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mEnterFadeDuration:I

    .line 13
    .line 14
    iput v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mExitFadeDuration:I

    .line 15
    .line 16
    iput-object p2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mOwner:Landroidx/appcompat/graphics/drawable/DrawableContainerCompat;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    move-object v2, p3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mSourceRes:Landroid/content/res/Resources;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v2, p2

    .line 29
    :goto_0
    iput-object v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mSourceRes:Landroid/content/res/Resources;

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    iget v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDensity:I

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v2, v0

    .line 37
    :goto_1
    invoke-static {p3, v2}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat;->resolveDensity(Landroid/content/res/Resources;I)I

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    iput p3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDensity:I

    .line 42
    .line 43
    if-eqz p1, :cond_b

    .line 44
    .line 45
    iget v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mChangingConfigurations:I

    .line 46
    .line 47
    iput v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mChangingConfigurations:I

    .line 48
    .line 49
    iget v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mChildrenChangingConfigurations:I

    .line 50
    .line 51
    iput v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mChildrenChangingConfigurations:I

    .line 52
    .line 53
    iput-boolean v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedConstantState:Z

    .line 54
    .line 55
    iput-boolean v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCanConstantState:Z

    .line 56
    .line 57
    iget-boolean v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mVariablePadding:Z

    .line 58
    .line 59
    iput-boolean v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mVariablePadding:Z

    .line 60
    .line 61
    iget-boolean v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantSize:Z

    .line 62
    .line 63
    iput-boolean v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantSize:Z

    .line 64
    .line 65
    iget-boolean v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDither:Z

    .line 66
    .line 67
    iput-boolean v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDither:Z

    .line 68
    .line 69
    iget-boolean v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mMutated:Z

    .line 70
    .line 71
    iput-boolean v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mMutated:Z

    .line 72
    .line 73
    iget v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mLayoutDirection:I

    .line 74
    .line 75
    iput v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mLayoutDirection:I

    .line 76
    .line 77
    iget v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mEnterFadeDuration:I

    .line 78
    .line 79
    iput v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mEnterFadeDuration:I

    .line 80
    .line 81
    iget v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mExitFadeDuration:I

    .line 82
    .line 83
    iput v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mExitFadeDuration:I

    .line 84
    .line 85
    iget-boolean v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mAutoMirrored:Z

    .line 86
    .line 87
    iput-boolean v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mAutoMirrored:Z

    .line 88
    .line 89
    iget-object v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mColorFilter:Landroid/graphics/ColorFilter;

    .line 90
    .line 91
    iput-object v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mColorFilter:Landroid/graphics/ColorFilter;

    .line 92
    .line 93
    iget-boolean v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mHasColorFilter:Z

    .line 94
    .line 95
    iput-boolean v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mHasColorFilter:Z

    .line 96
    .line 97
    iget-object v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mTintList:Landroid/content/res/ColorStateList;

    .line 98
    .line 99
    iput-object v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mTintList:Landroid/content/res/ColorStateList;

    .line 100
    .line 101
    iget-object v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mTintMode:Landroid/graphics/PorterDuff$Mode;

    .line 102
    .line 103
    iput-object v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mTintMode:Landroid/graphics/PorterDuff$Mode;

    .line 104
    .line 105
    iget-boolean v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mHasTintList:Z

    .line 106
    .line 107
    iput-boolean v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mHasTintList:Z

    .line 108
    .line 109
    iget-boolean v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mHasTintMode:Z

    .line 110
    .line 111
    iput-boolean v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mHasTintMode:Z

    .line 112
    .line 113
    iget v2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDensity:I

    .line 114
    .line 115
    if-ne v2, p3, :cond_5

    .line 116
    .line 117
    iget-boolean p3, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedPadding:Z

    .line 118
    .line 119
    if-eqz p3, :cond_4

    .line 120
    .line 121
    iget-object p3, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantPadding:Landroid/graphics/Rect;

    .line 122
    .line 123
    if-eqz p3, :cond_3

    .line 124
    .line 125
    new-instance p2, Landroid/graphics/Rect;

    .line 126
    .line 127
    iget-object p3, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantPadding:Landroid/graphics/Rect;

    .line 128
    .line 129
    invoke-direct {p2, p3}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    iput-object p2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantPadding:Landroid/graphics/Rect;

    .line 133
    .line 134
    iput-boolean v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedPadding:Z

    .line 135
    .line 136
    :cond_4
    iget-boolean p2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedConstantSize:Z

    .line 137
    .line 138
    if-eqz p2, :cond_5

    .line 139
    .line 140
    iget p2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantWidth:I

    .line 141
    .line 142
    iput p2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantWidth:I

    .line 143
    .line 144
    iget p2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantHeight:I

    .line 145
    .line 146
    iput p2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantHeight:I

    .line 147
    .line 148
    iget p2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantMinimumWidth:I

    .line 149
    .line 150
    iput p2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantMinimumWidth:I

    .line 151
    .line 152
    iget p2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantMinimumHeight:I

    .line 153
    .line 154
    iput p2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantMinimumHeight:I

    .line 155
    .line 156
    iput-boolean v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedConstantSize:Z

    .line 157
    .line 158
    :cond_5
    iget-boolean p2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedOpacity:Z

    .line 159
    .line 160
    if-eqz p2, :cond_6

    .line 161
    .line 162
    iget p2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mOpacity:I

    .line 163
    .line 164
    iput p2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mOpacity:I

    .line 165
    .line 166
    iput-boolean v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedOpacity:Z

    .line 167
    .line 168
    :cond_6
    iget-boolean p2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedStateful:Z

    .line 169
    .line 170
    if-eqz p2, :cond_7

    .line 171
    .line 172
    iget-boolean p2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mStateful:Z

    .line 173
    .line 174
    iput-boolean p2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mStateful:Z

    .line 175
    .line 176
    iput-boolean v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedStateful:Z

    .line 177
    .line 178
    :cond_7
    iget-object p2, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 179
    .line 180
    array-length p3, p2

    .line 181
    new-array p3, p3, [Landroid/graphics/drawable/Drawable;

    .line 182
    .line 183
    iput-object p3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 184
    .line 185
    iget p3, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 186
    .line 187
    iput p3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 188
    .line 189
    iget-object p1, p1, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawableFutures:Landroid/util/SparseArray;

    .line 190
    .line 191
    if-eqz p1, :cond_8

    .line 192
    .line 193
    invoke-virtual {p1}, Landroid/util/SparseArray;->clone()Landroid/util/SparseArray;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iput-object p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawableFutures:Landroid/util/SparseArray;

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_8
    new-instance p1, Landroid/util/SparseArray;

    .line 201
    .line 202
    iget p3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 203
    .line 204
    invoke-direct {p1, p3}, Landroid/util/SparseArray;-><init>(I)V

    .line 205
    .line 206
    .line 207
    iput-object p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawableFutures:Landroid/util/SparseArray;

    .line 208
    .line 209
    :goto_2
    iget p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 210
    .line 211
    :goto_3
    if-ge v0, p1, :cond_c

    .line 212
    .line 213
    aget-object p3, p2, v0

    .line 214
    .line 215
    if-eqz p3, :cond_a

    .line 216
    .line 217
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 218
    .line 219
    .line 220
    move-result-object p3

    .line 221
    if-eqz p3, :cond_9

    .line 222
    .line 223
    iget-object v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawableFutures:Landroid/util/SparseArray;

    .line 224
    .line 225
    invoke-virtual {v1, v0, p3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_9
    iget-object p3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 230
    .line 231
    aget-object v1, p2, v0

    .line 232
    .line 233
    aput-object v1, p3, v0

    .line 234
    .line 235
    :cond_a
    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_b
    const/16 p1, 0xa

    .line 239
    .line 240
    new-array p1, p1, [Landroid/graphics/drawable/Drawable;

    .line 241
    .line 242
    iput-object p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 243
    .line 244
    iput v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 245
    .line 246
    :cond_c
    return-void
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
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
.end method

.method private createAllFutures()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawableFutures:Landroid/util/SparseArray;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, v0, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawableFutures:Landroid/util/SparseArray;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawableFutures:Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 25
    .line 26
    iget-object v4, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    iget-object v5, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mSourceRes:Landroid/content/res/Resources;

    .line 29
    .line 30
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-direct {p0, v3}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->prepareDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    aput-object v3, v4, v2

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawableFutures:Landroid/util/SparseArray;

    .line 45
    .line 46
    :cond_1
    return-void
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
.end method

.method private prepareDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mLayoutDirection:I

    .line 2
    .line 3
    invoke-static {p1, v0}, Landroidx/core/graphics/drawable/DrawableCompat;->setLayoutDirection(Landroid/graphics/drawable/Drawable;I)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mOwner:Landroidx/appcompat/graphics/drawable/DrawableContainerCompat;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 13
    .line 14
    .line 15
    return-object p1
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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method public final addChild(Landroid/graphics/drawable/Drawable;)I
    .locals 4

    .line 1
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    add-int/lit8 v1, v0, 0xa

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->growArray(II)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {p1, v1, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 19
    .line 20
    .line 21
    iget-object v3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mOwner:Landroidx/appcompat/graphics/drawable/DrawableContainerCompat;

    .line 22
    .line 23
    invoke-virtual {p1, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 24
    .line 25
    .line 26
    iget-object v3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    aput-object p1, v3, v0

    .line 29
    .line 30
    iget v3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 31
    .line 32
    add-int/2addr v3, v2

    .line 33
    iput v3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 34
    .line 35
    iget v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mChildrenChangingConfigurations:I

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    or-int/2addr p1, v2

    .line 42
    iput p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mChildrenChangingConfigurations:I

    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->invalidateCache()V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    iput-object p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantPadding:Landroid/graphics/Rect;

    .line 49
    .line 50
    iput-boolean v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedPadding:Z

    .line 51
    .line 52
    iput-boolean v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedConstantSize:Z

    .line 53
    .line 54
    iput-boolean v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedConstantState:Z

    .line 55
    .line 56
    return v0
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
.end method

.method final applyTheme(Landroid/content/res/Resources$Theme;)V
    .locals 5
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x15
    .end annotation

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->createAllFutures()V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v0, :cond_1

    .line 12
    .line 13
    aget-object v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-static {v3}, Landroidx/core/graphics/drawable/DrawableCompat;->canApplyTheme(Landroid/graphics/drawable/Drawable;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    aget-object v3, v1, v2

    .line 24
    .line 25
    invoke-static {v3, p1}, Landroidx/core/graphics/drawable/DrawableCompat;->applyTheme(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources$Theme;)V

    .line 26
    .line 27
    .line 28
    iget v3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mChildrenChangingConfigurations:I

    .line 29
    .line 30
    aget-object v4, v1, v2

    .line 31
    .line 32
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    or-int/2addr v3, v4

    .line 37
    iput v3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mChildrenChangingConfigurations:I

    .line 38
    .line 39
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-static {p1}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$Api21Impl;->getResources(Landroid/content/res/Resources$Theme;)Landroid/content/res/Resources;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->updateDensity(Landroid/content/res/Resources;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void
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
.end method

.method public canApplyTheme()Z
    .locals 6
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x15
    .end annotation

    .line 1
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v3, v0, :cond_2

    .line 8
    .line 9
    aget-object v4, v1, v3

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    invoke-static {v4}, Landroidx/core/graphics/drawable/DrawableCompat;->canApplyTheme(Landroid/graphics/drawable/Drawable;)Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    return v5

    .line 21
    :cond_0
    iget-object v4, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawableFutures:Landroid/util/SparseArray;

    .line 22
    .line 23
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    invoke-static {v4}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$Api21Impl;->canApplyTheme(Landroid/graphics/drawable/Drawable$ConstantState;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    return v5

    .line 38
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return v2
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
.end method

.method public canConstantState()Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedConstantState:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCanConstantState:Z

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    invoke-direct {p0}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->createAllFutures()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedConstantState:Z

    .line 13
    .line 14
    iget v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 15
    .line 16
    iget-object v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-ge v4, v1, :cond_2

    .line 21
    .line 22
    aget-object v5, v2, v4

    .line 23
    .line 24
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    if-nez v5, :cond_1

    .line 29
    .line 30
    iput-boolean v3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCanConstantState:Z

    .line 31
    .line 32
    return v3

    .line 33
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    iput-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCanConstantState:Z

    .line 37
    .line 38
    return v0
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
.end method

.method final clearMutated()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mMutated:Z

    return-void
.end method

.method protected computeConstantSize()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedConstantSize:Z

    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->createAllFutures()V

    .line 5
    .line 6
    .line 7
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    iput v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantHeight:I

    .line 13
    .line 14
    iput v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantWidth:I

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantMinimumHeight:I

    .line 18
    .line 19
    iput v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantMinimumWidth:I

    .line 20
    .line 21
    :goto_0
    if-ge v2, v0, :cond_4

    .line 22
    .line 23
    aget-object v3, v1, v2

    .line 24
    .line 25
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget v5, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantWidth:I

    .line 30
    .line 31
    if-le v4, v5, :cond_0

    .line 32
    .line 33
    iput v4, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantWidth:I

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    iget v5, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantHeight:I

    .line 40
    .line 41
    if-le v4, v5, :cond_1

    .line 42
    .line 43
    iput v4, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantHeight:I

    .line 44
    .line 45
    :cond_1
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    iget v5, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantMinimumWidth:I

    .line 50
    .line 51
    if-le v4, v5, :cond_2

    .line 52
    .line 53
    iput v4, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantMinimumWidth:I

    .line 54
    .line 55
    :cond_2
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    iget v4, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantMinimumHeight:I

    .line 60
    .line 61
    if-le v3, v4, :cond_3

    .line 62
    .line 63
    iput v3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantMinimumHeight:I

    .line 64
    .line 65
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    return-void
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
.end method

.method final getCapacity()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    array-length v0, v0

    return v0
.end method

.method public getChangingConfigurations()I
    .locals 2

    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mChangingConfigurations:I

    iget v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mChildrenChangingConfigurations:I

    or-int/2addr v0, v1

    return v0
.end method

.method public final getChild(I)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawableFutures:Landroid/util/SparseArray;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ltz v0, :cond_2

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawableFutures:Landroid/util/SparseArray;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 26
    .line 27
    iget-object v3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mSourceRes:Landroid/content/res/Resources;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-direct {p0, v2}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->prepareDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    aput-object v2, v3, p1

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawableFutures:Landroid/util/SparseArray;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->removeAt(I)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawableFutures:Landroid/util/SparseArray;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    iput-object v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawableFutures:Landroid/util/SparseArray;

    .line 55
    .line 56
    :cond_1
    return-object v2

    .line 57
    :cond_2
    return-object v1
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
.end method

.method public final getChildCount()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    return v0
.end method

.method public final getConstantHeight()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedConstantSize:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->computeConstantSize()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantHeight:I

    .line 9
    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final getConstantMinimumHeight()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedConstantSize:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->computeConstantSize()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantMinimumHeight:I

    .line 9
    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final getConstantMinimumWidth()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedConstantSize:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->computeConstantSize()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantMinimumWidth:I

    .line 9
    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final getConstantPadding()Landroid/graphics/Rect;
    .locals 8

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mVariablePadding:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantPadding:Landroid/graphics/Rect;

    .line 8
    .line 9
    if-nez v0, :cond_8

    .line 10
    .line 11
    iget-boolean v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedPadding:Z

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    invoke-direct {p0}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->createAllFutures()V

    .line 17
    .line 18
    .line 19
    new-instance v0, Landroid/graphics/Rect;

    .line 20
    .line 21
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 22
    .line 23
    .line 24
    iget v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 25
    .line 26
    iget-object v3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    move v5, v4

    .line 30
    :goto_0
    if-ge v5, v2, :cond_7

    .line 31
    .line 32
    aget-object v6, v3, v5

    .line 33
    .line 34
    invoke-virtual {v6, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_6

    .line 39
    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    new-instance v1, Landroid/graphics/Rect;

    .line 43
    .line 44
    invoke-direct {v1, v4, v4, v4, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iget v6, v0, Landroid/graphics/Rect;->left:I

    .line 48
    .line 49
    iget v7, v1, Landroid/graphics/Rect;->left:I

    .line 50
    .line 51
    if-le v6, v7, :cond_3

    .line 52
    .line 53
    iput v6, v1, Landroid/graphics/Rect;->left:I

    .line 54
    .line 55
    :cond_3
    iget v6, v0, Landroid/graphics/Rect;->top:I

    .line 56
    .line 57
    iget v7, v1, Landroid/graphics/Rect;->top:I

    .line 58
    .line 59
    if-le v6, v7, :cond_4

    .line 60
    .line 61
    iput v6, v1, Landroid/graphics/Rect;->top:I

    .line 62
    .line 63
    :cond_4
    iget v6, v0, Landroid/graphics/Rect;->right:I

    .line 64
    .line 65
    iget v7, v1, Landroid/graphics/Rect;->right:I

    .line 66
    .line 67
    if-le v6, v7, :cond_5

    .line 68
    .line 69
    iput v6, v1, Landroid/graphics/Rect;->right:I

    .line 70
    .line 71
    :cond_5
    iget v6, v0, Landroid/graphics/Rect;->bottom:I

    .line 72
    .line 73
    iget v7, v1, Landroid/graphics/Rect;->bottom:I

    .line 74
    .line 75
    if-le v6, v7, :cond_6

    .line 76
    .line 77
    iput v6, v1, Landroid/graphics/Rect;->bottom:I

    .line 78
    .line 79
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_7
    const/4 v0, 0x1

    .line 83
    iput-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedPadding:Z

    .line 84
    .line 85
    iput-object v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantPadding:Landroid/graphics/Rect;

    .line 86
    .line 87
    return-object v1

    .line 88
    :cond_8
    :goto_1
    return-object v0
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

.method public final getConstantWidth()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedConstantSize:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->computeConstantSize()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantWidth:I

    .line 9
    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final getEnterFadeDuration()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mEnterFadeDuration:I

    return v0
.end method

.method public final getExitFadeDuration()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mExitFadeDuration:I

    return v0
.end method

.method public final getOpacity()I
    .locals 6

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedOpacity:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mOpacity:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    invoke-direct {p0}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->createAllFutures()V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    if-lez v0, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    aget-object v2, v1, v2

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v2, -0x2

    .line 26
    :goto_0
    const/4 v3, 0x1

    .line 27
    move v4, v3

    .line 28
    :goto_1
    if-ge v4, v0, :cond_2

    .line 29
    .line 30
    aget-object v5, v1, v4

    .line 31
    .line 32
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-static {v2, v5}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iput v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mOpacity:I

    .line 44
    .line 45
    iput-boolean v3, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedOpacity:Z

    .line 46
    .line 47
    return v2
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
.end method

.method public growArray(II)V
    .locals 2

    .line 1
    new-array p2, p2, [Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1, p2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iput-object p2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    return-void
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
.end method

.method invalidateCache()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedOpacity:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedStateful:Z

    .line 5
    .line 6
    return-void
    .line 7
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
.end method

.method public final isConstantSize()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantSize:Z

    return v0
.end method

.method public final isStateful()Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedStateful:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mStateful:Z

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    invoke-direct {p0}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->createAllFutures()V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    const/4 v4, 0x1

    .line 18
    if-ge v3, v0, :cond_2

    .line 19
    .line 20
    aget-object v5, v1, v3

    .line 21
    .line 22
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_1

    .line 27
    .line 28
    move v2, v4

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    :goto_1
    iput-boolean v2, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mStateful:Z

    .line 34
    .line 35
    iput-boolean v4, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedStateful:Z

    .line 36
    .line 37
    return v2
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
.end method

.method mutate()V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    if-ge v2, v0, :cond_1

    .line 7
    .line 8
    aget-object v3, v1, v2

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mMutated:Z

    .line 20
    .line 21
    return-void
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
.end method

.method public final setConstantSize(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mConstantSize:Z

    return-void
.end method

.method public final setEnterFadeDuration(I)V
    .locals 0

    iput p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mEnterFadeDuration:I

    return-void
.end method

.method public final setExitFadeDuration(I)V
    .locals 0

    iput p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mExitFadeDuration:I

    return-void
.end method

.method final setLayoutDirection(II)Z
    .locals 5

    .line 1
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mNumChildren:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDrawables:[Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    aget-object v4, v1, v2

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    invoke-static {v4, p1}, Landroidx/core/graphics/drawable/DrawableCompat;->setLayoutDirection(Landroid/graphics/drawable/Drawable;I)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-ne v2, p2, :cond_0

    .line 18
    .line 19
    move v3, v4

    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iput p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mLayoutDirection:I

    .line 24
    .line 25
    return v3
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
.end method

.method public final setVariablePadding(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mVariablePadding:Z

    return-void
.end method

.method final updateDensity(Landroid/content/res/Resources;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mSourceRes:Landroid/content/res/Resources;

    .line 4
    .line 5
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDensity:I

    .line 6
    .line 7
    invoke-static {p1, v0}, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat;->resolveDensity(Landroid/content/res/Resources;I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget v0, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDensity:I

    .line 12
    .line 13
    iput p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mDensity:I

    .line 14
    .line 15
    if-eq v0, p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedConstantSize:Z

    .line 19
    .line 20
    iput-boolean p1, p0, Landroidx/appcompat/graphics/drawable/DrawableContainerCompat$DrawableContainerState;->mCheckedPadding:Z

    .line 21
    .line 22
    :cond_0
    return-void
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
.end method
