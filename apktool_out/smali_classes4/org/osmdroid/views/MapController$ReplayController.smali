.class Lorg/osmdroid/views/MapController$ReplayController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/osmdroid/views/MapController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ReplayController"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;
    }
.end annotation


# instance fields
.field private mReplayList:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lorg/osmdroid/views/MapController;


# direct methods
.method private constructor <init>(Lorg/osmdroid/views/MapController;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/osmdroid/views/MapController$ReplayController;->this$0:Lorg/osmdroid/views/MapController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lorg/osmdroid/views/MapController$ReplayController;->mReplayList:Ljava/util/LinkedList;

    return-void
.end method

.method synthetic constructor <init>(Lorg/osmdroid/views/MapController;Lorg/osmdroid/views/MapController$1;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lorg/osmdroid/views/MapController$ReplayController;-><init>(Lorg/osmdroid/views/MapController;)V

    return-void
.end method


# virtual methods
.method public animateTo(II)V
    .locals 4

    .line 2
    iget-object v0, p0, Lorg/osmdroid/views/MapController$ReplayController;->mReplayList:Ljava/util/LinkedList;

    new-instance v1, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;

    sget-object v2, Lorg/osmdroid/views/MapController$ReplayType;->AnimateToPoint:Lorg/osmdroid/views/MapController$ReplayType;

    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3, p1, p2}, Landroid/graphics/Point;-><init>(II)V

    const/4 p1, 0x0

    invoke-direct {v1, p0, v2, v3, p1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;-><init>(Lorg/osmdroid/views/MapController$ReplayController;Lorg/osmdroid/views/MapController$ReplayType;Landroid/graphics/Point;Lorg/osmdroid/api/IGeoPoint;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public animateTo(Lorg/osmdroid/api/IGeoPoint;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Boolean;)V
    .locals 12

    move-object v9, p0

    .line 1
    iget-object v10, v9, Lorg/osmdroid/views/MapController$ReplayController;->mReplayList:Ljava/util/LinkedList;

    new-instance v11, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;

    sget-object v2, Lorg/osmdroid/views/MapController$ReplayType;->AnimateToGeoPoint:Lorg/osmdroid/views/MapController$ReplayType;

    const/4 v3, 0x0

    move-object v0, v11

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    invoke-direct/range {v0 .. v8}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;-><init>(Lorg/osmdroid/views/MapController$ReplayController;Lorg/osmdroid/views/MapController$ReplayType;Landroid/graphics/Point;Lorg/osmdroid/api/IGeoPoint;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Boolean;)V

    invoke-virtual {v10, v11}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public replayCalls()V
    .locals 9

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapController$ReplayController;->mReplayList:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_5

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;

    .line 18
    .line 19
    sget-object v2, Lorg/osmdroid/views/MapController$1;->$SwitchMap$org$osmdroid$views$MapController$ReplayType:[I

    .line 20
    .line 21
    invoke-static {v1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;->access$100(Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;)Lorg/osmdroid/views/MapController$ReplayType;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    aget v2, v2, v3

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eq v2, v3, :cond_4

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    if-eq v2, v3, :cond_3

    .line 36
    .line 37
    const/4 v3, 0x3

    .line 38
    if-eq v2, v3, :cond_2

    .line 39
    .line 40
    const/4 v3, 0x4

    .line 41
    if-eq v2, v3, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {v1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;->access$700(Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;)Landroid/graphics/Point;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    iget-object v2, p0, Lorg/osmdroid/views/MapController$ReplayController;->this$0:Lorg/osmdroid/views/MapController;

    .line 51
    .line 52
    invoke-static {v1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;->access$700(Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;)Landroid/graphics/Point;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget v3, v3, Landroid/graphics/Point;->x:I

    .line 57
    .line 58
    invoke-static {v1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;->access$700(Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;)Landroid/graphics/Point;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 63
    .line 64
    invoke-virtual {v2, v3, v1}, Lorg/osmdroid/views/MapController;->zoomToSpan(II)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-static {v1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;->access$200(Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;)Lorg/osmdroid/api/IGeoPoint;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-eqz v2, :cond_0

    .line 73
    .line 74
    iget-object v2, p0, Lorg/osmdroid/views/MapController$ReplayController;->this$0:Lorg/osmdroid/views/MapController;

    .line 75
    .line 76
    invoke-static {v1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;->access$200(Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;)Lorg/osmdroid/api/IGeoPoint;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v2, v1}, Lorg/osmdroid/views/MapController;->setCenter(Lorg/osmdroid/api/IGeoPoint;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    invoke-static {v1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;->access$700(Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;)Landroid/graphics/Point;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-eqz v2, :cond_0

    .line 89
    .line 90
    iget-object v2, p0, Lorg/osmdroid/views/MapController$ReplayController;->this$0:Lorg/osmdroid/views/MapController;

    .line 91
    .line 92
    invoke-static {v1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;->access$700(Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;)Landroid/graphics/Point;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    iget v3, v3, Landroid/graphics/Point;->x:I

    .line 97
    .line 98
    invoke-static {v1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;->access$700(Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;)Landroid/graphics/Point;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 103
    .line 104
    invoke-virtual {v2, v3, v1}, Lorg/osmdroid/views/MapController;->animateTo(II)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    invoke-static {v1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;->access$200(Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;)Lorg/osmdroid/api/IGeoPoint;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    if-eqz v2, :cond_0

    .line 113
    .line 114
    iget-object v3, p0, Lorg/osmdroid/views/MapController$ReplayController;->this$0:Lorg/osmdroid/views/MapController;

    .line 115
    .line 116
    invoke-static {v1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;->access$200(Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;)Lorg/osmdroid/api/IGeoPoint;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-static {v1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;->access$300(Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;)Ljava/lang/Double;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-static {v1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;->access$400(Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;)Ljava/lang/Long;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-static {v1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;->access$500(Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;)Ljava/lang/Float;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    invoke-static {v1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;->access$600(Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-virtual/range {v3 .. v8}, Lorg/osmdroid/views/MapController;->animateTo(Lorg/osmdroid/api/IGeoPoint;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Boolean;)V

    .line 137
    .line 138
    .line 139
    goto/16 :goto_0

    .line 140
    .line 141
    :cond_5
    iget-object v0, p0, Lorg/osmdroid/views/MapController$ReplayController;->mReplayList:Ljava/util/LinkedList;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 144
    .line 145
    .line 146
    return-void
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

.method public setCenter(Lorg/osmdroid/api/IGeoPoint;)V
    .locals 4

    iget-object v0, p0, Lorg/osmdroid/views/MapController$ReplayController;->mReplayList:Ljava/util/LinkedList;

    new-instance v1, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;

    sget-object v2, Lorg/osmdroid/views/MapController$ReplayType;->SetCenterPoint:Lorg/osmdroid/views/MapController$ReplayType;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3, p1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;-><init>(Lorg/osmdroid/views/MapController$ReplayController;Lorg/osmdroid/views/MapController$ReplayType;Landroid/graphics/Point;Lorg/osmdroid/api/IGeoPoint;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public zoomToSpan(DD)V
    .locals 6

    .line 2
    iget-object v0, p0, Lorg/osmdroid/views/MapController$ReplayController;->mReplayList:Ljava/util/LinkedList;

    new-instance v1, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;

    sget-object v2, Lorg/osmdroid/views/MapController$ReplayType;->ZoomToSpanPoint:Lorg/osmdroid/views/MapController$ReplayType;

    new-instance v3, Landroid/graphics/Point;

    const-wide v4, 0x412e848000000000L    # 1000000.0

    mul-double/2addr p1, v4

    double-to-int p1, p1

    mul-double/2addr p3, v4

    double-to-int p2, p3

    invoke-direct {v3, p1, p2}, Landroid/graphics/Point;-><init>(II)V

    const/4 p1, 0x0

    invoke-direct {v1, p0, v2, v3, p1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;-><init>(Lorg/osmdroid/views/MapController$ReplayController;Lorg/osmdroid/views/MapController$ReplayType;Landroid/graphics/Point;Lorg/osmdroid/api/IGeoPoint;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public zoomToSpan(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapController$ReplayController;->mReplayList:Ljava/util/LinkedList;

    new-instance v1, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;

    sget-object v2, Lorg/osmdroid/views/MapController$ReplayType;->ZoomToSpanPoint:Lorg/osmdroid/views/MapController$ReplayType;

    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3, p1, p2}, Landroid/graphics/Point;-><init>(II)V

    const/4 p1, 0x0

    invoke-direct {v1, p0, v2, v3, p1}, Lorg/osmdroid/views/MapController$ReplayController$ReplayClass;-><init>(Lorg/osmdroid/views/MapController$ReplayController;Lorg/osmdroid/views/MapController$ReplayType;Landroid/graphics/Point;Lorg/osmdroid/api/IGeoPoint;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void
.end method
