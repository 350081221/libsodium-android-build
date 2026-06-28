.class public Lcom/yuanqi/group/widgets/h$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/group/widgets/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/view/View;

.field private c:Ljava/lang/Float;

.field private d:Ljava/lang/Float;

.field private e:J

.field private f:Z

.field private g:Lcom/yuanqi/group/widgets/h$b;


# direct methods
.method public constructor <init>(Landroid/view/View;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/yuanqi/group/widgets/h;->a()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iput-wide v0, p0, Lcom/yuanqi/group/widgets/h$c;->e:J

    .line 9
    .line 10
    iput-object p1, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 11
    .line 12
    iput-boolean p2, p0, Lcom/yuanqi/group/widgets/h$c;->f:Z

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iput-object p1, p0, Lcom/yuanqi/group/widgets/h$c;->c:Ljava/lang/Float;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object p1, p0, Lcom/yuanqi/group/widgets/h$c;->d:Ljava/lang/Float;

    .line 25
    .line 26
    :goto_0
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
.end method

.method static synthetic a(Lcom/yuanqi/group/widgets/h$c;)V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/group/widgets/h$c;->b()V

    return-void
.end method

.method private b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/h$c;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    :goto_0
    iget-object v0, p0, Lcom/yuanqi/group/widgets/h$c;->g:Lcom/yuanqi/group/widgets/h$b;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Lcom/yuanqi/group/widgets/h$b;->onAnimationEnd()V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
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
.end method


# virtual methods
.method public c(J)Lcom/yuanqi/group/widgets/h$c;
    .locals 0

    iput-wide p1, p0, Lcom/yuanqi/group/widgets/h$c;->e:J

    return-object p0
.end method

.method public d(F)Lcom/yuanqi/group/widgets/h$c;
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lcom/yuanqi/group/widgets/h$c;->d:Ljava/lang/Float;

    return-object p0
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/yuanqi/group/widgets/h$c;->f(Lcom/yuanqi/group/widgets/h$b;)V

    return-void
.end method

.method public f(Lcom/yuanqi/group/widgets/h$b;)V
    .locals 7

    .line 1
    iput-object p1, p0, Lcom/yuanqi/group/widgets/h$c;->g:Lcom/yuanqi/group/widgets/h$b;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/yuanqi/group/widgets/h$c;->b:Landroid/view/View;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x2

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-array v3, v2, [I

    .line 11
    .line 12
    invoke-virtual {p1, v3}, Landroid/view/View;->getLocationInWindow([I)V

    .line 13
    .line 14
    .line 15
    aget p1, v3, v0

    .line 16
    .line 17
    iget-object v4, p0, Lcom/yuanqi/group/widgets/h$c;->b:Landroid/view/View;

    .line 18
    .line 19
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    div-int/2addr v4, v2

    .line 24
    add-int/2addr p1, v4

    .line 25
    aget v3, v3, v1

    .line 26
    .line 27
    iget-object v4, p0, Lcom/yuanqi/group/widgets/h$c;->b:Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    div-int/2addr v4, v2

    .line 34
    add-int/2addr v3, v4

    .line 35
    new-array v2, v2, [I

    .line 36
    .line 37
    iget-object v4, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 38
    .line 39
    invoke-virtual {v4, v2}, Landroid/view/View;->getLocationInWindow([I)V

    .line 40
    .line 41
    .line 42
    aget v4, v2, v0

    .line 43
    .line 44
    aget v2, v2, v1

    .line 45
    .line 46
    invoke-static {v4, p1}, Ljava/lang/Math;->max(II)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iget-object v5, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 51
    .line 52
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    add-int/2addr v5, v4

    .line 57
    invoke-static {p1, v5}, Ljava/lang/Math;->min(II)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    iget-object v5, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 66
    .line 67
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    add-int/2addr v5, v2

    .line 72
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    iget-object v5, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 77
    .line 78
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    iget-object v6, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 83
    .line 84
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    sub-int/2addr p1, v4

    .line 89
    sub-int/2addr v3, v2

    .line 90
    sub-int/2addr v5, p1

    .line 91
    invoke-static {p1, v5}, Ljava/lang/Math;->max(II)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    sub-int/2addr v6, v3

    .line 96
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    mul-int/2addr v2, v2

    .line 101
    mul-int/2addr v4, v4

    .line 102
    add-int/2addr v2, v4

    .line 103
    int-to-double v4, v2

    .line 104
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 105
    .line 106
    .line 107
    move-result-wide v4

    .line 108
    goto :goto_0

    .line 109
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 110
    .line 111
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    iget-object v3, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 116
    .line 117
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    add-int/2addr p1, v3

    .line 122
    div-int/2addr p1, v2

    .line 123
    iget-object v3, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 124
    .line 125
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    iget-object v4, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 130
    .line 131
    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    add-int/2addr v3, v4

    .line 136
    div-int/2addr v3, v2

    .line 137
    iget-object v2, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 138
    .line 139
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    iget-object v4, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 144
    .line 145
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    mul-int/2addr v2, v2

    .line 150
    mul-int/2addr v4, v4

    .line 151
    add-int/2addr v2, v4

    .line 152
    int-to-double v4, v2

    .line 153
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 154
    .line 155
    .line 156
    move-result-wide v4

    .line 157
    :goto_0
    double-to-int v2, v4

    .line 158
    add-int/2addr v2, v1

    .line 159
    iget-boolean v1, p0, Lcom/yuanqi/group/widgets/h$c;->f:Z

    .line 160
    .line 161
    const/4 v4, 0x0

    .line 162
    if-eqz v1, :cond_1

    .line 163
    .line 164
    iget-object v5, p0, Lcom/yuanqi/group/widgets/h$c;->d:Ljava/lang/Float;

    .line 165
    .line 166
    if-nez v5, :cond_1

    .line 167
    .line 168
    int-to-float v1, v2

    .line 169
    add-float/2addr v1, v4

    .line 170
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    iput-object v1, p0, Lcom/yuanqi/group/widgets/h$c;->d:Ljava/lang/Float;

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_1
    if-nez v1, :cond_2

    .line 178
    .line 179
    iget-object v1, p0, Lcom/yuanqi/group/widgets/h$c;->c:Ljava/lang/Float;

    .line 180
    .line 181
    if-nez v1, :cond_2

    .line 182
    .line 183
    int-to-float v1, v2

    .line 184
    add-float/2addr v1, v4

    .line 185
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    iput-object v1, p0, Lcom/yuanqi/group/widgets/h$c;->c:Ljava/lang/Float;

    .line 190
    .line 191
    :cond_2
    :goto_1
    :try_start_0
    iget-object v1, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 192
    .line 193
    iget-object v2, p0, Lcom/yuanqi/group/widgets/h$c;->c:Ljava/lang/Float;

    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    iget-object v4, p0, Lcom/yuanqi/group/widgets/h$c;->d:Ljava/lang/Float;

    .line 200
    .line 201
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    invoke-static {v1, p1, v3, v2, v4}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    iget-object v1, p0, Lcom/yuanqi/group/widgets/h$c;->a:Landroid/view/View;

    .line 210
    .line 211
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 212
    .line 213
    .line 214
    iget-wide v0, p0, Lcom/yuanqi/group/widgets/h$c;->e:J

    .line 215
    .line 216
    invoke-virtual {p1, v0, v1}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 217
    .line 218
    .line 219
    new-instance v0, Lcom/yuanqi/group/widgets/h$c$a;

    .line 220
    .line 221
    invoke-direct {v0, p0}, Lcom/yuanqi/group/widgets/h$c$a;-><init>(Lcom/yuanqi/group/widgets/h$c;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1}, Landroid/animation/Animator;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 228
    .line 229
    .line 230
    goto :goto_2

    .line 231
    :catch_0
    move-exception p1

    .line 232
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 233
    .line 234
    .line 235
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/h$c;->b()V

    .line 236
    .line 237
    .line 238
    :goto_2
    return-void
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

.method public g(Lcom/yuanqi/group/widgets/h$b;)Lcom/yuanqi/group/widgets/h$c;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/group/widgets/h$c;->g:Lcom/yuanqi/group/widgets/h$b;

    return-object p0
.end method

.method public h(F)Lcom/yuanqi/group/widgets/h$c;
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lcom/yuanqi/group/widgets/h$c;->c:Ljava/lang/Float;

    return-object p0
.end method

.method public i(Landroid/view/View;)Lcom/yuanqi/group/widgets/h$c;
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/h$c;->b:Landroid/view/View;

    return-object p0
.end method
