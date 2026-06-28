.class public Lcom/yuanqi/group/widgets/h$a;
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
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Landroid/view/View;

.field private c:F

.field private d:I

.field private e:Ljava/lang/Long;

.field private f:Lcom/yuanqi/group/widgets/h$b;

.field private g:I

.field private h:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/yuanqi/group/widgets/h$a;->c:F

    .line 6
    .line 7
    invoke-static {}, Lcom/yuanqi/group/widgets/h;->b()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lcom/yuanqi/group/widgets/h$a;->d:I

    .line 12
    .line 13
    const/high16 v0, 0x10a0000

    .line 14
    .line 15
    iput v0, p0, Lcom/yuanqi/group/widgets/h$a;->g:I

    .line 16
    .line 17
    const v0, 0x10a0001

    .line 18
    .line 19
    .line 20
    iput v0, p0, Lcom/yuanqi/group/widgets/h$a;->h:I

    .line 21
    .line 22
    iput-object p1, p0, Lcom/yuanqi/group/widgets/h$a;->a:Landroid/app/Activity;

    .line 23
    .line 24
    iput-object p2, p0, Lcom/yuanqi/group/widgets/h$a;->b:Landroid/view/View;

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
.end method

.method static synthetic a(Lcom/yuanqi/group/widgets/h$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/group/widgets/h$a;->h()V

    return-void
.end method

.method static synthetic b(Lcom/yuanqi/group/widgets/h$a;)I
    .locals 0

    iget p0, p0, Lcom/yuanqi/group/widgets/h$a;->g:I

    return p0
.end method

.method static synthetic c(Lcom/yuanqi/group/widgets/h$a;)I
    .locals 0

    iget p0, p0, Lcom/yuanqi/group/widgets/h$a;->h:I

    return p0
.end method

.method static synthetic d(Lcom/yuanqi/group/widgets/h$a;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/group/widgets/h$a;->a:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic e(Lcom/yuanqi/group/widgets/h$a;)F
    .locals 0

    iget p0, p0, Lcom/yuanqi/group/widgets/h$a;->c:F

    return p0
.end method

.method static synthetic f(Lcom/yuanqi/group/widgets/h$a;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/group/widgets/h$a;->b:Landroid/view/View;

    return-object p0
.end method

.method private h()V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/h$a;->f:Lcom/yuanqi/group/widgets/h$b;

    invoke-interface {v0}, Lcom/yuanqi/group/widgets/h$b;->onAnimationEnd()V

    return-void
.end method


# virtual methods
.method public g(I)Lcom/yuanqi/group/widgets/h$a;
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/h$a;->d:I

    return-object p0
.end method

.method public i(J)Lcom/yuanqi/group/widgets/h$a;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/yuanqi/group/widgets/h$a;->e:Ljava/lang/Long;

    return-object p0
.end method

.method public j(Lcom/yuanqi/group/widgets/h$b;)V
    .locals 12

    .line 1
    iput-object p1, p0, Lcom/yuanqi/group/widgets/h$a;->f:Lcom/yuanqi/group/widgets/h$b;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    new-array v0, p1, [I

    .line 5
    .line 6
    iget-object v1, p0, Lcom/yuanqi/group/widgets/h$a;->b:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    aget v1, v0, v1

    .line 13
    .line 14
    iget-object v2, p0, Lcom/yuanqi/group/widgets/h$a;->b:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    div-int/2addr v2, p1

    .line 21
    add-int v6, v1, v2

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    aget v0, v0, v1

    .line 25
    .line 26
    iget-object v2, p0, Lcom/yuanqi/group/widgets/h$a;->b:Landroid/view/View;

    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    div-int/2addr v2, p1

    .line 33
    add-int v7, v0, v2

    .line 34
    .line 35
    new-instance v5, Landroid/widget/ImageView;

    .line 36
    .line 37
    iget-object p1, p0, Lcom/yuanqi/group/widgets/h$a;->a:Landroid/app/Activity;

    .line 38
    .line 39
    invoke-direct {v5, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 43
    .line 44
    invoke-virtual {v5, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 45
    .line 46
    .line 47
    iget p1, p0, Lcom/yuanqi/group/widgets/h$a;->d:I

    .line 48
    .line 49
    invoke-virtual {v5, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/yuanqi/group/widgets/h$a;->a:Landroid/app/Activity;

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    move-object v11, p1

    .line 63
    check-cast v11, Landroid/view/ViewGroup;

    .line 64
    .line 65
    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {v11, v5, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 74
    .line 75
    .line 76
    sub-int v2, p1, v6

    .line 77
    .line 78
    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    sub-int v3, v0, v7

    .line 83
    .line 84
    invoke-static {v7, v3}, Ljava/lang/Math;->max(II)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    mul-int/2addr v2, v2

    .line 89
    mul-int/2addr v3, v3

    .line 90
    add-int/2addr v2, v3

    .line 91
    int-to-double v2, v2

    .line 92
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 93
    .line 94
    .line 95
    move-result-wide v2

    .line 96
    double-to-int v2, v2

    .line 97
    add-int/lit8 v8, v2, 0x1

    .line 98
    .line 99
    :try_start_0
    iget v2, p0, Lcom/yuanqi/group/widgets/h$a;->c:F

    .line 100
    .line 101
    int-to-float v3, v8

    .line 102
    invoke-static {v5, v6, v7, v2, v3}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    mul-int/2addr p1, p1

    .line 107
    mul-int/2addr v0, v0

    .line 108
    add-int/2addr p1, v0

    .line 109
    int-to-double v3, p1

    .line 110
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 111
    .line 112
    .line 113
    move-result-wide v3

    .line 114
    double-to-int p1, v3

    .line 115
    add-int/2addr p1, v1

    .line 116
    iget-object v0, p0, Lcom/yuanqi/group/widgets/h$a;->e:Ljava/lang/Long;

    .line 117
    .line 118
    if-nez v0, :cond_0

    .line 119
    .line 120
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 121
    .line 122
    int-to-double v3, v8

    .line 123
    mul-double/2addr v3, v0

    .line 124
    int-to-double v0, p1

    .line 125
    div-double/2addr v3, v0

    .line 126
    invoke-static {}, Lcom/yuanqi/group/widgets/h;->c()J

    .line 127
    .line 128
    .line 129
    move-result-wide v0

    .line 130
    long-to-double v0, v0

    .line 131
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 132
    .line 133
    .line 134
    move-result-wide v3

    .line 135
    mul-double/2addr v0, v3

    .line 136
    double-to-long v0, v0

    .line 137
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput-object p1, p0, Lcom/yuanqi/group/widgets/h$a;->e:Ljava/lang/Long;

    .line 142
    .line 143
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/group/widgets/h$a;->e:Ljava/lang/Long;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 146
    .line 147
    .line 148
    move-result-wide v9

    .line 149
    long-to-double v0, v9

    .line 150
    const-wide v3, 0x3feccccccccccccdL    # 0.9

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    mul-double/2addr v0, v3

    .line 156
    double-to-long v0, v0

    .line 157
    invoke-virtual {v2, v0, v1}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 158
    .line 159
    .line 160
    new-instance p1, Lcom/yuanqi/group/widgets/h$a$a;

    .line 161
    .line 162
    move-object v3, p1

    .line 163
    move-object v4, p0

    .line 164
    invoke-direct/range {v3 .. v11}, Lcom/yuanqi/group/widgets/h$a$a;-><init>(Lcom/yuanqi/group/widgets/h$a;Landroid/widget/ImageView;IIIJLandroid/view/ViewGroup;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Landroid/animation/Animator;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    .line 172
    .line 173
    goto :goto_0

    .line 174
    :catch_0
    move-exception p1

    .line 175
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 176
    .line 177
    .line 178
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/h$a;->h()V

    .line 179
    .line 180
    .line 181
    :goto_0
    return-void
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

.method public k(II)Lcom/yuanqi/group/widgets/h$a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/yuanqi/group/widgets/h$a;->g:I

    .line 2
    .line 3
    iput p2, p0, Lcom/yuanqi/group/widgets/h$a;->h:I

    .line 4
    .line 5
    return-object p0
    .line 6
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
.end method

.method public l(F)Lcom/yuanqi/group/widgets/h$a;
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/h$a;->c:F

    return-object p0
.end method
