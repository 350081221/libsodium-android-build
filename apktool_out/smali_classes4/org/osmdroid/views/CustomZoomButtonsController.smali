.class public Lorg/osmdroid/views/CustomZoomButtonsController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;,
        Lorg/osmdroid/views/CustomZoomButtonsController$OnZoomListener;
    }
.end annotation


# instance fields
.field private detached:Z

.field private mAlpha01:F

.field private mDisplay:Lorg/osmdroid/views/CustomZoomButtonsDisplay;

.field private final mFadeOutAnimation:Landroid/animation/ValueAnimator;

.field private mFadeOutAnimationDurationInMillis:I

.field private mJustActivated:Z

.field private mLatestActivation:J

.field private mListener:Lorg/osmdroid/views/CustomZoomButtonsController$OnZoomListener;

.field private final mMapView:Lorg/osmdroid/views/MapView;

.field private final mRunnable:Ljava/lang/Runnable;

.field private mShowDelayInMillis:I

.field private mThread:Ljava/lang/Thread;

.field private final mThreadSync:Ljava/lang/Object;

.field private mVisibility:Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;

.field private mZoomInEnabled:Z

.field private mZoomOutEnabled:Z


# direct methods
.method public constructor <init>(Lorg/osmdroid/views/MapView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mThreadSync:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v0, Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;->NEVER:Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;

    .line 12
    .line 13
    iput-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mVisibility:Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;

    .line 14
    .line 15
    const/16 v0, 0x1f4

    .line 16
    .line 17
    iput v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mFadeOutAnimationDurationInMillis:I

    .line 18
    .line 19
    const/16 v0, 0xdac

    .line 20
    .line 21
    iput v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mShowDelayInMillis:I

    .line 22
    .line 23
    iput-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 24
    .line 25
    new-instance v0, Lorg/osmdroid/views/CustomZoomButtonsDisplay;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;-><init>(Lorg/osmdroid/views/MapView;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mDisplay:Lorg/osmdroid/views/CustomZoomButtonsDisplay;

    .line 31
    .line 32
    const/4 p1, 0x2

    .line 33
    new-array p1, p1, [F

    .line 34
    .line 35
    fill-array-data p1, :array_0

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mFadeOutAnimation:Landroid/animation/ValueAnimator;

    .line 43
    .line 44
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    .line 45
    .line 46
    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 50
    .line 51
    .line 52
    iget v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mFadeOutAnimationDurationInMillis:I

    .line 53
    .line 54
    int-to-long v0, v0

    .line 55
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 56
    .line 57
    .line 58
    new-instance v0, Lorg/osmdroid/views/CustomZoomButtonsController$1;

    .line 59
    .line 60
    invoke-direct {v0, p0}, Lorg/osmdroid/views/CustomZoomButtonsController$1;-><init>(Lorg/osmdroid/views/CustomZoomButtonsController;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 64
    .line 65
    .line 66
    new-instance p1, Lorg/osmdroid/views/CustomZoomButtonsController$2;

    .line 67
    .line 68
    invoke-direct {p1, p0}, Lorg/osmdroid/views/CustomZoomButtonsController$2;-><init>(Lorg/osmdroid/views/CustomZoomButtonsController;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mRunnable:Ljava/lang/Runnable;

    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
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

.method static synthetic access$000(Lorg/osmdroid/views/CustomZoomButtonsController;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->detached:Z

    return p0
.end method

.method static synthetic access$100(Lorg/osmdroid/views/CustomZoomButtonsController;)Landroid/animation/ValueAnimator;
    .locals 0

    iget-object p0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mFadeOutAnimation:Landroid/animation/ValueAnimator;

    return-object p0
.end method

.method static synthetic access$202(Lorg/osmdroid/views/CustomZoomButtonsController;F)F
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mAlpha01:F

    return p1
.end method

.method static synthetic access$300(Lorg/osmdroid/views/CustomZoomButtonsController;)V
    .locals 0

    invoke-direct {p0}, Lorg/osmdroid/views/CustomZoomButtonsController;->invalidate()V

    return-void
.end method

.method static synthetic access$400(Lorg/osmdroid/views/CustomZoomButtonsController;)J
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mLatestActivation:J

    return-wide v0
.end method

.method static synthetic access$500(Lorg/osmdroid/views/CustomZoomButtonsController;)I
    .locals 0

    iget p0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mShowDelayInMillis:I

    return p0
.end method

.method static synthetic access$600(Lorg/osmdroid/views/CustomZoomButtonsController;)J
    .locals 2

    invoke-direct {p0}, Lorg/osmdroid/views/CustomZoomButtonsController;->nowInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic access$700(Lorg/osmdroid/views/CustomZoomButtonsController;)V
    .locals 0

    invoke-direct {p0}, Lorg/osmdroid/views/CustomZoomButtonsController;->startFadeOut()V

    return-void
.end method

.method private checkJustActivated()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mJustActivated:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mJustActivated:Z

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    return v1
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
.end method

.method private invalidate()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->detached:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method private nowInMillis()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private startFadeOut()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->detached:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mFadeOutAnimation:Landroid/animation/ValueAnimator;

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 14
    .line 15
    new-instance v1, Lorg/osmdroid/views/CustomZoomButtonsController$3;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lorg/osmdroid/views/CustomZoomButtonsController$3;-><init>(Lorg/osmdroid/views/CustomZoomButtonsController;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
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
.end method

.method private stopFadeOut()V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mFadeOutAnimation:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    return-void
.end method


# virtual methods
.method public activate()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->detached:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mVisibility:Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;

    .line 7
    .line 8
    sget-object v1, Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;->SHOW_AND_FADEOUT:Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;

    .line 9
    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    iget v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mAlpha01:F

    .line 14
    .line 15
    iget-boolean v1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mJustActivated:Z

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_3

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    cmpl-float v0, v0, v1

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    :cond_2
    iput-boolean v2, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mJustActivated:Z

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iput-boolean v2, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mJustActivated:Z

    .line 30
    .line 31
    :goto_0
    invoke-direct {p0}, Lorg/osmdroid/views/CustomZoomButtonsController;->stopFadeOut()V

    .line 32
    .line 33
    .line 34
    const/high16 v0, 0x3f800000    # 1.0f

    .line 35
    .line 36
    iput v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mAlpha01:F

    .line 37
    .line 38
    invoke-direct {p0}, Lorg/osmdroid/views/CustomZoomButtonsController;->nowInMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iput-wide v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mLatestActivation:J

    .line 43
    .line 44
    invoke-direct {p0}, Lorg/osmdroid/views/CustomZoomButtonsController;->invalidate()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mThread:Ljava/lang/Thread;

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sget-object v1, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    .line 56
    .line 57
    if-ne v0, v1, :cond_7

    .line 58
    .line 59
    :cond_4
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mThreadSync:Ljava/lang/Object;

    .line 60
    .line 61
    monitor-enter v0

    .line 62
    :try_start_0
    iget-object v1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mThread:Ljava/lang/Thread;

    .line 63
    .line 64
    if-eqz v1, :cond_5

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    sget-object v2, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    .line 71
    .line 72
    if-ne v1, v2, :cond_6

    .line 73
    .line 74
    :cond_5
    new-instance v1, Ljava/lang/Thread;

    .line 75
    .line 76
    iget-object v2, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mRunnable:Ljava/lang/Runnable;

    .line 77
    .line 78
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 79
    .line 80
    .line 81
    iput-object v1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mThread:Ljava/lang/Thread;

    .line 82
    .line 83
    new-instance v2, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v3, "#active"

    .line 100
    .line 101
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mThread:Ljava/lang/Thread;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 114
    .line 115
    .line 116
    :cond_6
    monitor-exit v0

    .line 117
    :cond_7
    return-void

    .line 118
    :catchall_0
    move-exception v1

    .line 119
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    throw v1
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
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 4

    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mDisplay:Lorg/osmdroid/views/CustomZoomButtonsDisplay;

    iget v1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mAlpha01:F

    iget-boolean v2, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mZoomInEnabled:Z

    iget-boolean v3, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mZoomOutEnabled:Z

    invoke-virtual {v0, p1, v1, v2, v3}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->draw(Landroid/graphics/Canvas;FZZ)V

    return-void
.end method

.method public getDisplay()Lorg/osmdroid/views/CustomZoomButtonsDisplay;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mDisplay:Lorg/osmdroid/views/CustomZoomButtonsDisplay;

    return-object v0
.end method

.method public isTouched(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    iget v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mAlpha01:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpl-float v0, v0, v1

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return v1

    .line 10
    :cond_0
    invoke-direct {p0}, Lorg/osmdroid/views/CustomZoomButtonsController;->checkJustActivated()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return v1

    .line 17
    :cond_1
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mListener:Lorg/osmdroid/views/CustomZoomButtonsController$OnZoomListener;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-ne v0, v2, :cond_2

    .line 27
    .line 28
    move v0, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move v0, v1

    .line 31
    :goto_0
    iget-object v3, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mDisplay:Lorg/osmdroid/views/CustomZoomButtonsDisplay;

    .line 32
    .line 33
    invoke-virtual {v3, p1, v2}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->isTouched(Landroid/view/MotionEvent;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_4

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iget-boolean p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mZoomInEnabled:Z

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    iget-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mListener:Lorg/osmdroid/views/CustomZoomButtonsController$OnZoomListener;

    .line 46
    .line 47
    invoke-interface {p1, v2}, Lorg/osmdroid/views/CustomZoomButtonsController$OnZoomListener;->onZoom(Z)V

    .line 48
    .line 49
    .line 50
    :cond_3
    return v2

    .line 51
    :cond_4
    iget-object v3, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mDisplay:Lorg/osmdroid/views/CustomZoomButtonsDisplay;

    .line 52
    .line 53
    invoke-virtual {v3, p1, v1}, Lorg/osmdroid/views/CustomZoomButtonsDisplay;->isTouched(Landroid/view/MotionEvent;Z)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_6

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    iget-boolean p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mZoomOutEnabled:Z

    .line 62
    .line 63
    if-eqz p1, :cond_5

    .line 64
    .line 65
    iget-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mListener:Lorg/osmdroid/views/CustomZoomButtonsController$OnZoomListener;

    .line 66
    .line 67
    invoke-interface {p1, v1}, Lorg/osmdroid/views/CustomZoomButtonsController$OnZoomListener;->onZoom(Z)V

    .line 68
    .line 69
    .line 70
    :cond_5
    return v2

    .line 71
    :cond_6
    return v1
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
.end method

.method public onDetach()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->detached:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lorg/osmdroid/views/CustomZoomButtonsController;->stopFadeOut()V

    .line 5
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
.end method

.method public onLongPress(Landroid/view/MotionEvent;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lorg/osmdroid/views/CustomZoomButtonsController;->isTouched(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lorg/osmdroid/views/CustomZoomButtonsController;->isTouched(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setOnZoomListener(Lorg/osmdroid/views/CustomZoomButtonsController$OnZoomListener;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mListener:Lorg/osmdroid/views/CustomZoomButtonsController$OnZoomListener;

    return-void
.end method

.method public setShowFadeOutDelays(II)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mShowDelayInMillis:I

    .line 2
    .line 3
    iput p2, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mFadeOutAnimationDurationInMillis:I

    .line 4
    .line 5
    return-void
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

.method public setVisibility(Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mVisibility:Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;

    .line 2
    .line 3
    sget-object v0, Lorg/osmdroid/views/CustomZoomButtonsController$4;->$SwitchMap$org$osmdroid$views$CustomZoomButtonsController$Visibility:[I

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    aget p1, v0, p1

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    if-eq p1, v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    if-eq p1, v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    iput p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mAlpha01:F

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 26
    .line 27
    iput p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mAlpha01:F

    .line 28
    .line 29
    :goto_0
    return-void
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

.method public setZoomInEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mZoomInEnabled:Z

    return-void
.end method

.method public setZoomOutEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController;->mZoomOutEnabled:Z

    return-void
.end method
