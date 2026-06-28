.class public Lorg/osmdroid/views/CustomZoomButtonsDisplay;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/CustomZoomButtonsDisplay$HorizontalPosition;,
        Lorg/osmdroid/views/CustomZoomButtonsDisplay$VerticalPosition;
    }
.end annotation


# instance fields
.field private mAdditionalPixelMarginBottom:F

.field private mAdditionalPixelMarginLeft:F

.field private mAdditionalPixelMarginRight:F

.field private mAdditionalPixelMarginTop:F

.field private mAlphaPaint:Landroid/graphics/Paint;

.field private mBitmapSize:I

.field private mHorizontalOrVertical:Z

.field private mHorizontalPosition:Lorg/osmdroid/views/CustomZoomButtonsDisplay$HorizontalPosition;

.field private final mMapView:Lorg/osmdroid/views/MapView;

.field private mMargin:F

.field private mPadding:F

.field private mPixelMarginBottom:F

.field private mPixelMarginLeft:F

.field private mPixelMarginRight:F

.field private mPixelMarginTop:F

.field private final mUnrotatedPoint:Landroid/graphics/Point;

.field private mVerticalPosition:Lorg/osmdroid/views/CustomZoomButtonsDisplay$VerticalPosition;

.field private mZoomInBitmapDisabled:Landroid/graphics/Bitmap;

.field private mZoomInBitmapEnabled:Landroid/graphics/Bitmap;

.field private mZoomOutBitmapDisabled:Landroid/graphics/Bitmap;

.field private mZoomOutBitmapEnabled:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Lorg/osmdroid/views/MapView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Point;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mUnrotatedPoint:Landroid/graphics/Point;

    .line 10
    .line 11
    iput-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mMapView:Lorg/osmdroid/views/MapView;

    .line 12
    .line 13
    sget-object p1, Lorg/osmdroid/views/CustomZoomButtonsDisplay$HorizontalPosition;->CENTER:Lorg/osmdroid/views/CustomZoomButtonsDisplay$HorizontalPosition;

    .line 14
    .line 15
    sget-object v0, Lorg/osmdroid/views/CustomZoomButtonsDisplay$VerticalPosition;->BOTTOM:Lorg/osmdroid/views/CustomZoomButtonsDisplay$VerticalPosition;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {p0, v1, p1, v0}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->setPositions(ZLorg/osmdroid/views/CustomZoomButtonsDisplay$HorizontalPosition;Lorg/osmdroid/views/CustomZoomButtonsDisplay$VerticalPosition;)V

    .line 19
    .line 20
    .line 21
    const/high16 p1, 0x3f000000    # 0.5f

    .line 22
    .line 23
    invoke-virtual {p0, p1, p1}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->setMarginPadding(FF)V

    .line 24
    .line 25
    .line 26
    return-void
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
.end method

.method private getBitmap(ZZ)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mZoomInBitmapEnabled:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0, v0}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->getZoomBitmap(ZZ)Landroid/graphics/Bitmap;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {p0, v0, v2}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->getZoomBitmap(ZZ)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {p0, v2, v0}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->getZoomBitmap(ZZ)Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v2, v2}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->getZoomBitmap(ZZ)Landroid/graphics/Bitmap;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p0, v1, v3, v0, v2}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->setBitmaps(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    if-eqz p1, :cond_2

    .line 27
    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mZoomInBitmapEnabled:Landroid/graphics/Bitmap;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mZoomInBitmapDisabled:Landroid/graphics/Bitmap;

    .line 34
    .line 35
    :goto_0
    return-object p1

    .line 36
    :cond_2
    if-eqz p2, :cond_3

    .line 37
    .line 38
    iget-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mZoomOutBitmapEnabled:Landroid/graphics/Bitmap;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    iget-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mZoomOutBitmapDisabled:Landroid/graphics/Bitmap;

    .line 42
    .line 43
    :goto_1
    return-object p1
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
.end method

.method private getFirstLeft(I)F
    .locals 4

    .line 1
    sget-object v0, Lorg/osmdroid/views/CustomZoomButtonsDisplay$1;->$SwitchMap$org$osmdroid$views$CustomZoomButtonsDisplay$HorizontalPosition:[I

    .line 2
    .line 3
    iget-object v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mHorizontalPosition:Lorg/osmdroid/views/CustomZoomButtonsDisplay$HorizontalPosition;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_4

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    int-to-float p1, p1

    .line 21
    const/high16 v0, 0x40000000    # 2.0f

    .line 22
    .line 23
    div-float/2addr p1, v0

    .line 24
    iget-boolean v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mHorizontalOrVertical:Z

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mPadding:F

    .line 29
    .line 30
    iget v2, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mBitmapSize:I

    .line 31
    .line 32
    int-to-float v3, v2

    .line 33
    mul-float/2addr v1, v3

    .line 34
    div-float/2addr v1, v0

    .line 35
    int-to-float v0, v2

    .line 36
    add-float/2addr v1, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mBitmapSize:I

    .line 39
    .line 40
    int-to-float v1, v1

    .line 41
    div-float/2addr v1, v0

    .line 42
    :goto_0
    sub-float/2addr p1, v1

    .line 43
    return p1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    int-to-float p1, p1

    .line 51
    iget v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mPixelMarginRight:F

    .line 52
    .line 53
    sub-float/2addr p1, v0

    .line 54
    iget v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mBitmapSize:I

    .line 55
    .line 56
    int-to-float v1, v0

    .line 57
    sub-float/2addr p1, v1

    .line 58
    iget-boolean v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mHorizontalOrVertical:Z

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    iget v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mPadding:F

    .line 63
    .line 64
    int-to-float v2, v0

    .line 65
    mul-float/2addr v1, v2

    .line 66
    int-to-float v0, v0

    .line 67
    add-float/2addr v1, v0

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    const/4 v1, 0x0

    .line 70
    :goto_1
    sub-float/2addr p1, v1

    .line 71
    return p1

    .line 72
    :cond_4
    iget p1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mPixelMarginLeft:F

    .line 73
    .line 74
    return p1
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
.end method

.method private getFirstTop(I)F
    .locals 4

    .line 1
    sget-object v0, Lorg/osmdroid/views/CustomZoomButtonsDisplay$1;->$SwitchMap$org$osmdroid$views$CustomZoomButtonsDisplay$VerticalPosition:[I

    .line 2
    .line 3
    iget-object v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mVerticalPosition:Lorg/osmdroid/views/CustomZoomButtonsDisplay$VerticalPosition;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_4

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    int-to-float p1, p1

    .line 21
    const/high16 v0, 0x40000000    # 2.0f

    .line 22
    .line 23
    div-float/2addr p1, v0

    .line 24
    iget-boolean v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mHorizontalOrVertical:Z

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mBitmapSize:I

    .line 29
    .line 30
    int-to-float v1, v1

    .line 31
    div-float/2addr v1, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mPadding:F

    .line 34
    .line 35
    iget v2, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mBitmapSize:I

    .line 36
    .line 37
    int-to-float v3, v2

    .line 38
    mul-float/2addr v1, v3

    .line 39
    div-float/2addr v1, v0

    .line 40
    int-to-float v0, v2

    .line 41
    add-float/2addr v1, v0

    .line 42
    :goto_0
    sub-float/2addr p1, v1

    .line 43
    return p1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    int-to-float p1, p1

    .line 51
    iget v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mPixelMarginBottom:F

    .line 52
    .line 53
    sub-float/2addr p1, v0

    .line 54
    iget v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mBitmapSize:I

    .line 55
    .line 56
    int-to-float v1, v0

    .line 57
    sub-float/2addr p1, v1

    .line 58
    iget-boolean v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mHorizontalOrVertical:Z

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    iget v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mPadding:F

    .line 65
    .line 66
    int-to-float v2, v0

    .line 67
    mul-float/2addr v1, v2

    .line 68
    int-to-float v0, v0

    .line 69
    add-float/2addr v0, v1

    .line 70
    :goto_1
    sub-float/2addr p1, v0

    .line 71
    return p1

    .line 72
    :cond_4
    iget p1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mPixelMarginTop:F

    .line 73
    .line 74
    return p1
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
.end method

.method private getTopLeft(ZZ)F
    .locals 1

    .line 1
    if-eqz p2, :cond_2

    .line 2
    .line 3
    iget-object p2, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mMapView:Lorg/osmdroid/views/MapView;

    .line 4
    .line 5
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-direct {p0, p2}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->getFirstLeft(I)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget-boolean v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mHorizontalOrVertical:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return p2

    .line 18
    :cond_0
    if-nez p1, :cond_1

    .line 19
    .line 20
    return p2

    .line 21
    :cond_1
    iget p1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mBitmapSize:I

    .line 22
    .line 23
    int-to-float v0, p1

    .line 24
    add-float/2addr p2, v0

    .line 25
    iget v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mPadding:F

    .line 26
    .line 27
    :goto_0
    int-to-float p1, p1

    .line 28
    mul-float/2addr v0, p1

    .line 29
    add-float/2addr p2, v0

    .line 30
    return p2

    .line 31
    :cond_2
    iget-object p2, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mMapView:Lorg/osmdroid/views/MapView;

    .line 32
    .line 33
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-direct {p0, p2}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->getFirstTop(I)F

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    iget-boolean v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mHorizontalOrVertical:Z

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    return p2

    .line 46
    :cond_3
    if-eqz p1, :cond_4

    .line 47
    .line 48
    return p2

    .line 49
    :cond_4
    iget p1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mBitmapSize:I

    .line 50
    .line 51
    int-to-float v0, p1

    .line 52
    add-float/2addr p2, v0

    .line 53
    iget v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mPadding:F

    .line 54
    .line 55
    goto :goto_0
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
.end method

.method private isTouched(IIZ)Z
    .locals 2

    int-to-float p1, p1

    const/4 v0, 0x1

    .line 3
    invoke-direct {p0, p3, v0, p1}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->isTouched(ZZF)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    int-to-float p1, p2

    .line 4
    invoke-direct {p0, p3, v1, p1}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->isTouched(ZZF)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    return v0
.end method

.method private isTouched(ZZF)Z
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->getTopLeft(ZZ)F

    move-result p1

    cmpl-float p2, p3, p1

    if-ltz p2, :cond_0

    .line 6
    iget p2, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mBitmapSize:I

    int-to-float p2, p2

    add-float/2addr p1, p2

    cmpg-float p1, p3, p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private refreshPixelMargins()V
    .locals 2

    .line 1
    iget v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mMargin:F

    .line 2
    .line 3
    iget v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mBitmapSize:I

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    mul-float/2addr v0, v1

    .line 7
    iget v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mAdditionalPixelMarginLeft:F

    .line 8
    .line 9
    add-float/2addr v1, v0

    .line 10
    iput v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mPixelMarginLeft:F

    .line 11
    .line 12
    iget v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mAdditionalPixelMarginTop:F

    .line 13
    .line 14
    add-float/2addr v1, v0

    .line 15
    iput v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mPixelMarginTop:F

    .line 16
    .line 17
    iget v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mAdditionalPixelMarginRight:F

    .line 18
    .line 19
    add-float/2addr v1, v0

    .line 20
    iput v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mPixelMarginRight:F

    .line 21
    .line 22
    iget v1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mAdditionalPixelMarginBottom:F

    .line 23
    .line 24
    add-float/2addr v0, v1

    .line 25
    iput v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mPixelMarginBottom:F

    .line 26
    .line 27
    return-void
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
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;FZZ)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p2, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpl-float v0, p2, v0

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mAlphaPaint:Landroid/graphics/Paint;

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    new-instance v0, Landroid/graphics/Paint;

    .line 20
    .line 21
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mAlphaPaint:Landroid/graphics/Paint;

    .line 25
    .line 26
    :cond_2
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mAlphaPaint:Landroid/graphics/Paint;

    .line 27
    .line 28
    const/high16 v1, 0x437f0000    # 255.0f

    .line 29
    .line 30
    mul-float/2addr p2, v1

    .line 31
    float-to-int p2, p2

    .line 32
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mAlphaPaint:Landroid/graphics/Paint;

    .line 36
    .line 37
    :goto_0
    const/4 v0, 0x1

    .line 38
    invoke-direct {p0, v0, p3}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->getBitmap(ZZ)Landroid/graphics/Bitmap;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-direct {p0, v0, v0}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->getTopLeft(ZZ)F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-direct {p0, v0, v2}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->getTopLeft(ZZ)F

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-virtual {p1, p3, v1, v3, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, v2, p4}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->getBitmap(ZZ)Landroid/graphics/Bitmap;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    invoke-direct {p0, v2, v0}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->getTopLeft(ZZ)F

    .line 59
    .line 60
    .line 61
    move-result p4

    .line 62
    invoke-direct {p0, v2, v2}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->getTopLeft(ZZ)F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p1, p3, p4, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 67
    .line 68
    .line 69
    return-void
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
.end method

.method protected getIcon(Z)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget p1, Lorg/osmdroid/library/R$drawable;->u:I

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget p1, Lorg/osmdroid/library/R$drawable;->v:I

    .line 7
    .line 8
    :goto_0
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mMapView:Lorg/osmdroid/views/MapView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
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
.end method

.method protected getZoomBitmap(ZZ)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->getIcon(Z)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mBitmapSize:I

    .line 10
    .line 11
    invoke-direct {p0}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->refreshPixelMargins()V

    .line 12
    .line 13
    .line 14
    iget v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mBitmapSize:I

    .line 15
    .line 16
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 17
    .line 18
    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v7, Landroid/graphics/Canvas;

    .line 23
    .line 24
    invoke-direct {v7, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 25
    .line 26
    .line 27
    new-instance v6, Landroid/graphics/Paint;

    .line 28
    .line 29
    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 30
    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    const/4 p2, -0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const p2, -0x333334

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {v6, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 40
    .line 41
    .line 42
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 43
    .line 44
    invoke-virtual {v6, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    iget p2, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mBitmapSize:I

    .line 50
    .line 51
    add-int/lit8 v1, p2, -0x1

    .line 52
    .line 53
    int-to-float v4, v1

    .line 54
    add-int/lit8 p2, p2, -0x1

    .line 55
    .line 56
    int-to-float v5, p2

    .line 57
    move-object v1, v7

    .line 58
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 59
    .line 60
    .line 61
    const/4 p2, 0x0

    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-virtual {v7, p1, v1, v1, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 64
    .line 65
    .line 66
    return-object v0
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
.end method

.method public isTouched(Landroid/view/MotionEvent;Z)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 2
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    invoke-direct {p0, v0, p1, p2}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->isTouched(IIZ)Z

    move-result p1

    return p1
.end method

.method public isTouchedRotated(Landroid/view/MotionEvent;Z)Z
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mMapView:Lorg/osmdroid/views/MapView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    cmpl-float v0, v0, v1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mUnrotatedPoint:Landroid/graphics/Point;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    float-to-int v1, v1

    .line 19
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    float-to-int p1, p1

    .line 24
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Point;->set(II)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mMapView:Lorg/osmdroid/views/MapView;

    .line 29
    .line 30
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    float-to-int v1, v1

    .line 39
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    float-to-int p1, p1

    .line 44
    iget-object v2, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mUnrotatedPoint:Landroid/graphics/Point;

    .line 45
    .line 46
    invoke-virtual {v0, v1, p1, v2}, Lorg/osmdroid/views/Projection;->rotateAndScalePoint(IILandroid/graphics/Point;)Landroid/graphics/Point;

    .line 47
    .line 48
    .line 49
    :goto_0
    iget-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mUnrotatedPoint:Landroid/graphics/Point;

    .line 50
    .line 51
    iget v0, p1, Landroid/graphics/Point;->x:I

    .line 52
    .line 53
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 54
    .line 55
    invoke-direct {p0, v0, p1, p2}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->isTouched(IIZ)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    return p1
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
.end method

.method public setAdditionalPixelMargins(FFFF)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mAdditionalPixelMarginLeft:F

    .line 2
    .line 3
    iput p2, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mAdditionalPixelMarginTop:F

    .line 4
    .line 5
    iput p3, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mAdditionalPixelMarginRight:F

    .line 6
    .line 7
    iput p4, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mAdditionalPixelMarginBottom:F

    .line 8
    .line 9
    invoke-direct {p0}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->refreshPixelMargins()V

    .line 10
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
.end method

.method public setBitmaps(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mZoomInBitmapEnabled:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mZoomInBitmapDisabled:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iput-object p3, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mZoomOutBitmapEnabled:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    iput-object p4, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mZoomOutBitmapDisabled:Landroid/graphics/Bitmap;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iput p1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mBitmapSize:I

    .line 14
    .line 15
    invoke-direct {p0}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->refreshPixelMargins()V

    .line 16
    .line 17
    .line 18
    return-void
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
.end method

.method public setMarginPadding(FF)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mMargin:F

    .line 2
    .line 3
    iput p2, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mPadding:F

    .line 4
    .line 5
    invoke-direct {p0}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->refreshPixelMargins()V

    .line 6
    .line 7
    .line 8
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
.end method

.method public setPositions(ZLorg/osmdroid/views/CustomZoomButtonsDisplay$HorizontalPosition;Lorg/osmdroid/views/CustomZoomButtonsDisplay$VerticalPosition;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mHorizontalOrVertical:Z

    .line 2
    .line 3
    iput-object p2, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mHorizontalPosition:Lorg/osmdroid/views/CustomZoomButtonsDisplay$HorizontalPosition;

    .line 4
    .line 5
    iput-object p3, p0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->mVerticalPosition:Lorg/osmdroid/views/CustomZoomButtonsDisplay$VerticalPosition;

    .line 6
    .line 7
    return-void
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
.end method
