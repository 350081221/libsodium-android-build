.class public Lcom/yuanqi/group/widgets/k;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Paint;

.field private b:Landroid/graphics/RectF;

.field private c:I

.field private d:I

.field private e:Lcom/yuanqi/group/widgets/j;

.field private f:I

.field private g:Landroid/graphics/RectF;

.field private h:F

.field private i:F

.field private j:Landroid/graphics/PorterDuffXfermode;


# direct methods
.method public constructor <init>(Lcom/yuanqi/group/widgets/j;IFF)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/RectF;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/yuanqi/group/widgets/k;->b:Landroid/graphics/RectF;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    .line 12
    .line 13
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_OUT:Landroid/graphics/PorterDuff$Mode;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/yuanqi/group/widgets/k;->j:Landroid/graphics/PorterDuffXfermode;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/yuanqi/group/widgets/k;->e:Lcom/yuanqi/group/widgets/j;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/yuanqi/group/widgets/j;->d()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iput v0, p0, Lcom/yuanqi/group/widgets/k;->f:I

    .line 27
    .line 28
    iput p3, p0, Lcom/yuanqi/group/widgets/k;->h:F

    .line 29
    .line 30
    iput p4, p0, Lcom/yuanqi/group/widgets/k;->i:F

    .line 31
    .line 32
    new-instance p3, Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p3, p0, Lcom/yuanqi/group/widgets/k;->a:Landroid/graphics/Paint;

    .line 38
    .line 39
    const/4 p4, 0x1

    .line 40
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 41
    .line 42
    .line 43
    iget-object p3, p0, Lcom/yuanqi/group/widgets/k;->a:Landroid/graphics/Paint;

    .line 44
    .line 45
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 46
    .line 47
    .line 48
    iget-object p3, p0, Lcom/yuanqi/group/widgets/k;->a:Landroid/graphics/Paint;

    .line 49
    .line 50
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setDither(Z)V

    .line 51
    .line 52
    .line 53
    iget-object p3, p0, Lcom/yuanqi/group/widgets/k;->a:Landroid/graphics/Paint;

    .line 54
    .line 55
    sget-object p4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 56
    .line 57
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 58
    .line 59
    .line 60
    iget-object p3, p0, Lcom/yuanqi/group/widgets/k;->a:Landroid/graphics/Paint;

    .line 61
    .line 62
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, Lcom/yuanqi/group/widgets/k;->a:Landroid/graphics/Paint;

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/yuanqi/group/widgets/j;->f()I

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    int-to-float p3, p3

    .line 72
    invoke-virtual {p1}, Lcom/yuanqi/group/widgets/j;->b()I

    .line 73
    .line 74
    .line 75
    move-result p4

    .line 76
    int-to-float p4, p4

    .line 77
    invoke-virtual {p1}, Lcom/yuanqi/group/widgets/j;->c()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    int-to-float v0, v0

    .line 82
    invoke-virtual {p1}, Lcom/yuanqi/group/widgets/j;->a()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-virtual {p2, p3, p4, v0, p1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 87
    .line 88
    .line 89
    new-instance p1, Landroid/graphics/RectF;

    .line 90
    .line 91
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, Lcom/yuanqi/group/widgets/k;->g:Landroid/graphics/RectF;

    .line 95
    .line 96
    return-void
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
.end method


# virtual methods
.method public a(I)Lcom/yuanqi/group/widgets/k;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/k;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-object p0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 4
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/k;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/yuanqi/group/widgets/k;->g:Landroid/graphics/RectF;

    .line 8
    .line 9
    iget v1, p0, Lcom/yuanqi/group/widgets/k;->h:F

    .line 10
    .line 11
    iget v2, p0, Lcom/yuanqi/group/widgets/k;->i:F

    .line 12
    .line 13
    iget-object v3, p0, Lcom/yuanqi/group/widgets/k;->a:Landroid/graphics/Paint;

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/yuanqi/group/widgets/k;->a:Landroid/graphics/Paint;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/yuanqi/group/widgets/k;->j:Landroid/graphics/PorterDuffXfermode;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/yuanqi/group/widgets/k;->g:Landroid/graphics/RectF;

    .line 26
    .line 27
    iget v1, p0, Lcom/yuanqi/group/widgets/k;->h:F

    .line 28
    .line 29
    iget v2, p0, Lcom/yuanqi/group/widgets/k;->i:F

    .line 30
    .line 31
    iget-object v3, p0, Lcom/yuanqi/group/widgets/k;->a:Landroid/graphics/Paint;

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 34
    .line 35
    .line 36
    return-void
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

.method public getOpacity()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    iget v0, p1, Landroid/graphics/Rect;->right:I

    .line 5
    .line 6
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 7
    .line 8
    sub-int v2, v0, v1

    .line 9
    .line 10
    if-lez v2, :cond_4

    .line 11
    .line 12
    iget v2, p1, Landroid/graphics/Rect;->bottom:I

    .line 13
    .line 14
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 15
    .line 16
    sub-int v3, v2, p1

    .line 17
    .line 18
    if-lez v3, :cond_4

    .line 19
    .line 20
    iget-object v3, p0, Lcom/yuanqi/group/widgets/k;->b:Landroid/graphics/RectF;

    .line 21
    .line 22
    int-to-float v1, v1

    .line 23
    iput v1, v3, Landroid/graphics/RectF;->left:F

    .line 24
    .line 25
    int-to-float v0, v0

    .line 26
    iput v0, v3, Landroid/graphics/RectF;->right:F

    .line 27
    .line 28
    int-to-float p1, p1

    .line 29
    iput p1, v3, Landroid/graphics/RectF;->top:F

    .line 30
    .line 31
    int-to-float v2, v2

    .line 32
    iput v2, v3, Landroid/graphics/RectF;->bottom:F

    .line 33
    .line 34
    sub-float/2addr v0, v1

    .line 35
    float-to-int v0, v0

    .line 36
    iput v0, p0, Lcom/yuanqi/group/widgets/k;->c:I

    .line 37
    .line 38
    sub-float/2addr v2, p1

    .line 39
    float-to-int p1, v2

    .line 40
    iput p1, p0, Lcom/yuanqi/group/widgets/k;->d:I

    .line 41
    .line 42
    iget-object p1, p0, Lcom/yuanqi/group/widgets/k;->e:Lcom/yuanqi/group/widgets/j;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/yuanqi/group/widgets/j;->g()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    and-int/lit8 v0, p1, 0x1

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    const/4 v2, 0x0

    .line 52
    if-ne v0, v1, :cond_0

    .line 53
    .line 54
    iget v0, p0, Lcom/yuanqi/group/widgets/k;->f:I

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move v0, v2

    .line 58
    :goto_0
    and-int/lit8 v1, p1, 0x10

    .line 59
    .line 60
    const/16 v3, 0x10

    .line 61
    .line 62
    if-ne v1, v3, :cond_1

    .line 63
    .line 64
    iget v1, p0, Lcom/yuanqi/group/widgets/k;->f:I

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move v1, v2

    .line 68
    :goto_1
    iget v3, p0, Lcom/yuanqi/group/widgets/k;->c:I

    .line 69
    .line 70
    and-int/lit16 v4, p1, 0x100

    .line 71
    .line 72
    const/16 v5, 0x100

    .line 73
    .line 74
    if-ne v4, v5, :cond_2

    .line 75
    .line 76
    iget v4, p0, Lcom/yuanqi/group/widgets/k;->f:I

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    move v4, v2

    .line 80
    :goto_2
    sub-int/2addr v3, v4

    .line 81
    iget v4, p0, Lcom/yuanqi/group/widgets/k;->d:I

    .line 82
    .line 83
    const/16 v5, 0x1000

    .line 84
    .line 85
    and-int/2addr p1, v5

    .line 86
    if-ne p1, v5, :cond_3

    .line 87
    .line 88
    iget v2, p0, Lcom/yuanqi/group/widgets/k;->f:I

    .line 89
    .line 90
    :cond_3
    sub-int/2addr v4, v2

    .line 91
    new-instance p1, Landroid/graphics/RectF;

    .line 92
    .line 93
    int-to-float v0, v0

    .line 94
    int-to-float v1, v1

    .line 95
    int-to-float v2, v3

    .line 96
    int-to-float v3, v4

    .line 97
    invoke-direct {p1, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 98
    .line 99
    .line 100
    iput-object p1, p0, Lcom/yuanqi/group/widgets/k;->g:Landroid/graphics/RectF;

    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 103
    .line 104
    .line 105
    :cond_4
    return-void
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
.end method

.method public setAlpha(I)V
    .locals 0

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method
