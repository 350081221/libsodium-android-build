.class Lorg/osmdroid/views/MapController$MapAnimatorListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/osmdroid/views/MapController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "MapAnimatorListener"
.end annotation


# instance fields
.field private final mCenter:Lorg/osmdroid/util/GeoPoint;

.field private final mCenterEnd:Lorg/osmdroid/api/IGeoPoint;

.field private final mCenterStart:Lorg/osmdroid/api/IGeoPoint;

.field private final mMapController:Lorg/osmdroid/views/MapController;

.field private final mOrientationSpan:Ljava/lang/Float;

.field private final mOrientationStart:Ljava/lang/Float;

.field private final mZoomEnd:Ljava/lang/Double;

.field private final mZoomStart:Ljava/lang/Double;


# direct methods
.method public constructor <init>(Lorg/osmdroid/views/MapController;Ljava/lang/Double;Ljava/lang/Double;Lorg/osmdroid/api/IGeoPoint;Lorg/osmdroid/api/IGeoPoint;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v1, v2}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mCenter:Lorg/osmdroid/util/GeoPoint;

    .line 12
    .line 13
    iput-object p1, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mMapController:Lorg/osmdroid/views/MapController;

    .line 14
    .line 15
    iput-object p2, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mZoomStart:Ljava/lang/Double;

    .line 16
    .line 17
    iput-object p3, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mZoomEnd:Ljava/lang/Double;

    .line 18
    .line 19
    iput-object p4, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mCenterStart:Lorg/osmdroid/api/IGeoPoint;

    .line 20
    .line 21
    iput-object p5, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mCenterEnd:Lorg/osmdroid/api/IGeoPoint;

    .line 22
    .line 23
    if-nez p7, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mOrientationStart:Ljava/lang/Float;

    .line 27
    .line 28
    iput-object p1, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mOrientationSpan:Ljava/lang/Float;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iput-object p6, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mOrientationStart:Ljava/lang/Float;

    .line 32
    .line 33
    invoke-virtual {p6}, Ljava/lang/Float;->floatValue()F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    float-to-double p1, p1

    .line 38
    invoke-virtual {p7}, Ljava/lang/Float;->floatValue()F

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    float-to-double p3, p3

    .line 43
    invoke-static {p1, p2, p3, p4, p8}, Lorg/osmdroid/util/MyMath;->getAngleDifference(DDLjava/lang/Boolean;)D

    .line 44
    .line 45
    .line 46
    move-result-wide p1

    .line 47
    double-to-float p1, p1

    .line 48
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mOrientationSpan:Ljava/lang/Float;

    .line 53
    .line 54
    :goto_0
    return-void
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
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mMapController:Lorg/osmdroid/views/MapController;

    invoke-virtual {p1}, Lorg/osmdroid/views/MapController;->onAnimationEnd()V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mMapController:Lorg/osmdroid/views/MapController;

    invoke-virtual {p1}, Lorg/osmdroid/views/MapController;->onAnimationEnd()V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mMapController:Lorg/osmdroid/views/MapController;

    invoke-virtual {p1}, Lorg/osmdroid/views/MapController;->onAnimationStart()V

    return-void
.end method

.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Float;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mZoomEnd:Ljava/lang/Double;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mZoomStart:Ljava/lang/Double;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iget-object v2, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mZoomEnd:Ljava/lang/Double;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    iget-object v4, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mZoomStart:Ljava/lang/Double;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    sub-double/2addr v2, v4

    .line 34
    float-to-double v4, p1

    .line 35
    mul-double/2addr v2, v4

    .line 36
    add-double/2addr v0, v2

    .line 37
    iget-object v2, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mMapController:Lorg/osmdroid/views/MapController;

    .line 38
    .line 39
    iget-object v2, v2, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 40
    .line 41
    invoke-virtual {v2, v0, v1}, Lorg/osmdroid/views/MapView;->setZoomLevel(D)D

    .line 42
    .line 43
    .line 44
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mOrientationSpan:Ljava/lang/Float;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mOrientationStart:Ljava/lang/Float;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v1, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mOrientationSpan:Ljava/lang/Float;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    mul-float/2addr v1, p1

    .line 61
    add-float/2addr v0, v1

    .line 62
    iget-object v1, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mMapController:Lorg/osmdroid/views/MapController;

    .line 63
    .line 64
    iget-object v1, v1, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Lorg/osmdroid/views/MapView;->setMapOrientation(F)V

    .line 67
    .line 68
    .line 69
    :cond_1
    iget-object v0, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mCenterEnd:Lorg/osmdroid/api/IGeoPoint;

    .line 70
    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    iget-object v0, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mMapController:Lorg/osmdroid/views/MapController;

    .line 74
    .line 75
    iget-object v0, v0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 76
    .line 77
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget-object v1, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mCenterStart:Lorg/osmdroid/api/IGeoPoint;

    .line 82
    .line 83
    invoke-interface {v1}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    .line 84
    .line 85
    .line 86
    move-result-wide v1

    .line 87
    invoke-virtual {v0, v1, v2}, Lorg/osmdroid/util/TileSystem;->cleanLongitude(D)D

    .line 88
    .line 89
    .line 90
    move-result-wide v1

    .line 91
    iget-object v3, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mCenterEnd:Lorg/osmdroid/api/IGeoPoint;

    .line 92
    .line 93
    invoke-interface {v3}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-virtual {v0, v3, v4}, Lorg/osmdroid/util/TileSystem;->cleanLongitude(D)D

    .line 98
    .line 99
    .line 100
    move-result-wide v3

    .line 101
    sub-double/2addr v3, v1

    .line 102
    float-to-double v5, p1

    .line 103
    mul-double/2addr v3, v5

    .line 104
    add-double/2addr v1, v3

    .line 105
    invoke-virtual {v0, v1, v2}, Lorg/osmdroid/util/TileSystem;->cleanLongitude(D)D

    .line 106
    .line 107
    .line 108
    move-result-wide v1

    .line 109
    iget-object p1, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mCenterStart:Lorg/osmdroid/api/IGeoPoint;

    .line 110
    .line 111
    invoke-interface {p1}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    .line 112
    .line 113
    .line 114
    move-result-wide v3

    .line 115
    invoke-virtual {v0, v3, v4}, Lorg/osmdroid/util/TileSystem;->cleanLatitude(D)D

    .line 116
    .line 117
    .line 118
    move-result-wide v3

    .line 119
    iget-object p1, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mCenterEnd:Lorg/osmdroid/api/IGeoPoint;

    .line 120
    .line 121
    invoke-interface {p1}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    .line 122
    .line 123
    .line 124
    move-result-wide v7

    .line 125
    invoke-virtual {v0, v7, v8}, Lorg/osmdroid/util/TileSystem;->cleanLatitude(D)D

    .line 126
    .line 127
    .line 128
    move-result-wide v7

    .line 129
    sub-double/2addr v7, v3

    .line 130
    mul-double/2addr v7, v5

    .line 131
    add-double/2addr v3, v7

    .line 132
    invoke-virtual {v0, v3, v4}, Lorg/osmdroid/util/TileSystem;->cleanLatitude(D)D

    .line 133
    .line 134
    .line 135
    move-result-wide v3

    .line 136
    iget-object p1, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mCenter:Lorg/osmdroid/util/GeoPoint;

    .line 137
    .line 138
    invoke-virtual {p1, v3, v4, v1, v2}, Lorg/osmdroid/util/GeoPoint;->setCoords(DD)V

    .line 139
    .line 140
    .line 141
    iget-object p1, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mMapController:Lorg/osmdroid/views/MapController;

    .line 142
    .line 143
    iget-object p1, p1, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 144
    .line 145
    iget-object v0, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mCenter:Lorg/osmdroid/util/GeoPoint;

    .line 146
    .line 147
    invoke-virtual {p1, v0}, Lorg/osmdroid/views/MapView;->setExpectedCenter(Lorg/osmdroid/api/IGeoPoint;)V

    .line 148
    .line 149
    .line 150
    :cond_2
    iget-object p1, p0, Lorg/osmdroid/views/MapController$MapAnimatorListener;->mMapController:Lorg/osmdroid/views/MapController;

    .line 151
    .line 152
    iget-object p1, p1, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 153
    .line 154
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 155
    .line 156
    .line 157
    return-void
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
