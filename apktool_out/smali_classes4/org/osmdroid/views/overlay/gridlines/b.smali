.class public Lorg/osmdroid/views/overlay/gridlines/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field static final a:Ljava/text/DecimalFormat;

.field public static b:I

.field public static c:I

.field public static d:S

.field public static e:I

.field public static f:F

.field public static g:Z

.field public static h:Z

.field private static i:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/text/DecimalFormat;

    .line 2
    .line 3
    const-string v1, "#.#####"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/osmdroid/views/overlay/gridlines/b;->a:Ljava/text/DecimalFormat;

    .line 9
    .line 10
    const/high16 v0, -0x1000000

    .line 11
    .line 12
    sput v0, Lorg/osmdroid/views/overlay/gridlines/b;->b:I

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    sput v1, Lorg/osmdroid/views/overlay/gridlines/b;->c:I

    .line 16
    .line 17
    const/16 v1, 0x18

    .line 18
    .line 19
    sput-short v1, Lorg/osmdroid/views/overlay/gridlines/b;->d:S

    .line 20
    .line 21
    sput v0, Lorg/osmdroid/views/overlay/gridlines/b;->e:I

    .line 22
    .line 23
    const/high16 v0, 0x3f800000    # 1.0f

    .line 24
    .line 25
    sput v0, Lorg/osmdroid/views/overlay/gridlines/b;->f:F

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    sput-boolean v1, Lorg/osmdroid/views/overlay/gridlines/b;->g:Z

    .line 29
    .line 30
    sput-boolean v1, Lorg/osmdroid/views/overlay/gridlines/b;->h:Z

    .line 31
    .line 32
    sput v0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 33
    .line 34
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lorg/osmdroid/views/overlay/Marker;)V
    .locals 1

    .line 1
    sget v0, Lorg/osmdroid/views/overlay/gridlines/b;->e:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/Marker;->setTextLabelBackgroundColor(I)V

    .line 4
    .line 5
    .line 6
    sget-short v0, Lorg/osmdroid/views/overlay/gridlines/b;->d:S

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/Marker;->setTextLabelFontSize(I)V

    .line 9
    .line 10
    .line 11
    sget v0, Lorg/osmdroid/views/overlay/gridlines/b;->c:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/Marker;->setTextLabelForegroundColor(I)V

    .line 14
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
.end method

.method private static b(I)D
    .locals 4

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 5
    .line 6
    float-to-double v0, p0

    .line 7
    const-wide v2, 0x3ef999999999999aL    # 2.44140625E-5

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :goto_0
    mul-double/2addr v0, v2

    .line 13
    return-wide v0

    .line 14
    :pswitch_0
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 15
    .line 16
    float-to-double v0, p0

    .line 17
    const-wide v2, 0x3f0999999999999aL    # 4.8828125E-5

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :pswitch_1
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 24
    .line 25
    float-to-double v0, p0

    .line 26
    const-wide v2, 0x3f1999999999999aL    # 9.765625E-5

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_2
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 33
    .line 34
    float-to-double v0, p0

    .line 35
    const-wide v2, 0x3f2999999999999aL    # 1.953125E-4

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_3
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 42
    .line 43
    float-to-double v0, p0

    .line 44
    const-wide v2, 0x3f3999999999999aL    # 3.90625E-4

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_4
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 51
    .line 52
    float-to-double v0, p0

    .line 53
    const-wide v2, 0x3f4999999999999aL    # 7.8125E-4

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_5
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 60
    .line 61
    float-to-double v0, p0

    .line 62
    const-wide v2, 0x3f5999999999999aL    # 0.0015625

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :pswitch_6
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 69
    .line 70
    float-to-double v0, p0

    .line 71
    const-wide v2, 0x3f6999999999999aL    # 0.003125

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_7
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 78
    .line 79
    float-to-double v0, p0

    .line 80
    const-wide v2, 0x3f7999999999999aL    # 0.00625

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_8
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 87
    .line 88
    float-to-double v0, p0

    .line 89
    const-wide v2, 0x3f8999999999999aL    # 0.0125

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_9
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 96
    .line 97
    float-to-double v0, p0

    .line 98
    const-wide v2, 0x3f9999999999999aL    # 0.025

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :pswitch_a
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 105
    .line 106
    float-to-double v0, p0

    .line 107
    const-wide v2, 0x3fa999999999999aL    # 0.05

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :pswitch_b
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 114
    .line 115
    float-to-double v0, p0

    .line 116
    const-wide v2, 0x3fb999999999999aL    # 0.1

    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :pswitch_c
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 123
    .line 124
    float-to-double v0, p0

    .line 125
    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :pswitch_d
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 129
    .line 130
    float-to-double v0, p0

    .line 131
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :pswitch_e
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 135
    .line 136
    float-to-double v0, p0

    .line 137
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :pswitch_f
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 141
    .line 142
    float-to-double v0, p0

    .line 143
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 144
    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :pswitch_10
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 148
    .line 149
    float-to-double v0, p0

    .line 150
    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :pswitch_11
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 155
    .line 156
    float-to-double v0, p0

    .line 157
    const-wide/high16 v2, 0x4018000000000000L    # 6.0

    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :pswitch_12
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 162
    .line 163
    float-to-double v0, p0

    .line 164
    const-wide/high16 v2, 0x4022000000000000L    # 9.0

    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :pswitch_13
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 169
    .line 170
    float-to-double v0, p0

    .line 171
    const-wide/high16 v2, 0x402e000000000000L    # 15.0

    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :pswitch_14
    sget p0, Lorg/osmdroid/views/overlay/gridlines/b;->i:F

    .line 176
    .line 177
    float-to-double v0, p0

    .line 178
    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static c(Landroid/content/Context;Lorg/osmdroid/views/MapView;)Lorg/osmdroid/views/overlay/FolderOverlay;
    .locals 27

    move-object/from16 v0, p1

    .line 1
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/MapView;->getBoundingBox()Lorg/osmdroid/util/BoundingBox;

    move-result-object v1

    .line 2
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/MapView;->getZoomLevel()I

    move-result v2

    .line 3
    sget-boolean v3, Lorg/osmdroid/views/overlay/gridlines/b;->g:Z

    if-eqz v3, :cond_0

    .line 4
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v4, "######### getLatLonGrid "

    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 5
    :cond_0
    new-instance v3, Lorg/osmdroid/views/overlay/FolderOverlay;

    invoke-direct {v3}, Lorg/osmdroid/views/overlay/FolderOverlay;-><init>()V

    const/4 v4, 0x2

    if-ge v2, v4, :cond_1

    goto/16 :goto_e

    .line 6
    :cond_1
    invoke-virtual {v1}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    move-result-wide v4

    .line 7
    invoke-virtual {v1}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    move-result-wide v6

    .line 8
    invoke-virtual {v1}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    move-result-wide v8

    .line 9
    invoke-virtual {v1}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    move-result-wide v10

    cmpg-double v1, v4, v6

    if-gez v1, :cond_2

    return-object v3

    .line 10
    :cond_2
    sget-boolean v1, Lorg/osmdroid/views/overlay/gridlines/b;->g:Z

    const-wide/16 v12, 0x0

    if-eqz v1, :cond_3

    .line 11
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "N "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v15, " S "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v15, ", "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1, v14}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_3
    cmpg-double v1, v8, v12

    if-gez v1, :cond_4

    cmpl-double v1, v10, v12

    if-lez v1, :cond_4

    const/4 v1, 0x1

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    .line 12
    :goto_0
    sget-boolean v16, Lorg/osmdroid/views/overlay/gridlines/b;->g:Z

    if-eqz v16, :cond_5

    .line 13
    sget-object v14, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v17, v1

    const-string v1, "delta "

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    move/from16 v17, v1

    .line 14
    :goto_1
    invoke-static {v2}, Lorg/osmdroid/views/overlay/gridlines/b;->b(I)D

    move-result-wide v14

    .line 15
    invoke-static {v4, v5, v6, v7, v2}, Lorg/osmdroid/views/overlay/gridlines/b;->d(DDI)[D

    move-result-object v1

    const/16 v16, 0x0

    .line 16
    aget-wide v18, v1, v16

    const/16 v20, 0x1

    .line 17
    aget-wide v21, v1, v20

    move-wide/from16 v12, v18

    :goto_2
    cmpg-double v1, v12, v21

    move-wide/from16 v18, v6

    const-string v6, ", zoom "

    const-string v7, " to "

    move-wide/from16 v23, v4

    const-string v4, ","

    if-gtz v1, :cond_8

    .line 18
    new-instance v1, Lorg/osmdroid/views/overlay/Polyline;

    invoke-direct {v1}, Lorg/osmdroid/views/overlay/Polyline;-><init>()V

    .line 19
    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getOutlinePaint()Landroid/graphics/Paint;

    move-result-object v5

    move-wide/from16 v25, v14

    sget v14, Lorg/osmdroid/views/overlay/gridlines/b;->f:F

    invoke-virtual {v5, v14}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 20
    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getOutlinePaint()Landroid/graphics/Paint;

    move-result-object v5

    sget v14, Lorg/osmdroid/views/overlay/gridlines/b;->b:I

    invoke-virtual {v5, v14}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 22
    new-instance v14, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v14, v12, v13, v8, v9}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 23
    invoke-interface {v5, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    new-instance v14, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v14, v12, v13, v10, v11}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 25
    invoke-interface {v5, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    sget-boolean v14, Lorg/osmdroid/views/overlay/gridlines/b;->g:Z

    if-eqz v14, :cond_6

    .line 27
    sget-object v14, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "drawing NS "

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 28
    :cond_6
    invoke-virtual {v1, v5}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->setPoints(Ljava/util/List;)V

    .line 29
    invoke-virtual {v3, v1}, Lorg/osmdroid/views/overlay/FolderOverlay;->add(Lorg/osmdroid/views/overlay/Overlay;)Z

    .line 30
    new-instance v0, Lorg/osmdroid/views/overlay/Marker;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lorg/osmdroid/views/overlay/Marker;-><init>(Lorg/osmdroid/views/MapView;)V

    .line 31
    invoke-static {v0}, Lorg/osmdroid/views/overlay/gridlines/b;->a(Lorg/osmdroid/views/overlay/Marker;)V

    .line 32
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lorg/osmdroid/views/overlay/gridlines/b;->a:Ljava/text/DecimalFormat;

    invoke-virtual {v5, v12, v13}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/16 v5, 0x0

    cmpl-double v7, v12, v5

    if-lez v7, :cond_7

    const-string v5, "N"

    goto :goto_3

    :cond_7
    const-string v5, "S"

    :goto_3
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 33
    invoke-virtual {v0, v4}, Lorg/osmdroid/views/overlay/OverlayWithIW;->setTitle(Ljava/lang/String;)V

    .line 34
    invoke-virtual {v0, v4}, Lorg/osmdroid/views/overlay/Marker;->setTextIcon(Ljava/lang/String;)V

    .line 35
    new-instance v4, Lorg/osmdroid/util/GeoPoint;

    add-double v14, v10, v25

    invoke-direct {v4, v12, v13, v14, v15}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {v0, v4}, Lorg/osmdroid/views/overlay/Marker;->setPosition(Lorg/osmdroid/util/GeoPoint;)V

    .line 36
    invoke-virtual {v3, v0}, Lorg/osmdroid/views/overlay/FolderOverlay;->add(Lorg/osmdroid/views/overlay/Overlay;)Z

    add-double v12, v12, v25

    move-object v0, v1

    move-wide/from16 v6, v18

    move-wide/from16 v4, v23

    move-wide/from16 v14, v25

    goto/16 :goto_2

    :cond_8
    move-object v1, v0

    move-wide/from16 v25, v14

    .line 37
    invoke-static {v10, v11, v8, v9, v2}, Lorg/osmdroid/views/overlay/gridlines/b;->e(DDI)[D

    move-result-object v0

    const/4 v5, 0x1

    .line 38
    aget-wide v8, v0, v5

    const/4 v5, 0x0

    .line 39
    aget-wide v10, v0, v5

    move-wide v12, v8

    :goto_4
    cmpg-double v0, v12, v10

    const-string v5, "E"

    const-string v14, "W"

    if-gtz v0, :cond_b

    .line 40
    new-instance v0, Lorg/osmdroid/views/overlay/Polyline;

    invoke-direct {v0}, Lorg/osmdroid/views/overlay/Polyline;-><init>()V

    .line 41
    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getOutlinePaint()Landroid/graphics/Paint;

    move-result-object v15

    move-object/from16 v16, v5

    sget v5, Lorg/osmdroid/views/overlay/gridlines/b;->f:F

    invoke-virtual {v15, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 42
    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getOutlinePaint()Landroid/graphics/Paint;

    move-result-object v5

    sget v15, Lorg/osmdroid/views/overlay/gridlines/b;->b:I

    invoke-virtual {v5, v15}, Landroid/graphics/Paint;->setColor(I)V

    .line 43
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 44
    new-instance v15, Lorg/osmdroid/util/GeoPoint;

    move-wide/from16 v20, v10

    move-wide/from16 v10, v23

    invoke-direct {v15, v10, v11, v12, v13}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 45
    invoke-interface {v5, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    new-instance v15, Lorg/osmdroid/util/GeoPoint;

    move-wide/from16 v23, v8

    move-wide/from16 v8, v18

    invoke-direct {v15, v8, v9, v12, v13}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 47
    invoke-interface {v5, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    invoke-virtual {v0, v5}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->setPoints(Ljava/util/List;)V

    .line 49
    sget-boolean v5, Lorg/osmdroid/views/overlay/gridlines/b;->g:Z

    if-eqz v5, :cond_9

    .line 50
    sget-object v5, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v18, v14

    const-string v14, "drawing EW "

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v5, v14}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_5

    :cond_9
    move-object/from16 v18, v14

    .line 51
    :goto_5
    invoke-virtual {v3, v0}, Lorg/osmdroid/views/overlay/FolderOverlay;->add(Lorg/osmdroid/views/overlay/Overlay;)Z

    .line 52
    new-instance v0, Lorg/osmdroid/views/overlay/Marker;

    invoke-direct {v0, v1}, Lorg/osmdroid/views/overlay/Marker;-><init>(Lorg/osmdroid/views/MapView;)V

    .line 53
    invoke-static {v0}, Lorg/osmdroid/views/overlay/gridlines/b;->a(Lorg/osmdroid/views/overlay/Marker;)V

    const/high16 v5, -0x3d4c0000    # -90.0f

    .line 54
    invoke-virtual {v0, v5}, Lorg/osmdroid/views/overlay/Marker;->setRotation(F)V

    .line 55
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v14, Lorg/osmdroid/views/overlay/gridlines/b;->a:Ljava/text/DecimalFormat;

    invoke-virtual {v14, v12, v13}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/16 v14, 0x0

    cmpl-double v19, v12, v14

    if-lez v19, :cond_a

    move-object/from16 v14, v16

    goto :goto_6

    :cond_a
    move-object/from16 v14, v18

    :goto_6
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 56
    invoke-virtual {v0, v5}, Lorg/osmdroid/views/overlay/OverlayWithIW;->setTitle(Ljava/lang/String;)V

    .line 57
    invoke-virtual {v0, v5}, Lorg/osmdroid/views/overlay/Marker;->setTextIcon(Ljava/lang/String;)V

    .line 58
    new-instance v5, Lorg/osmdroid/util/GeoPoint;

    add-double v14, v8, v25

    invoke-direct {v5, v14, v15, v12, v13}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {v0, v5}, Lorg/osmdroid/views/overlay/Marker;->setPosition(Lorg/osmdroid/util/GeoPoint;)V

    .line 59
    invoke-virtual {v3, v0}, Lorg/osmdroid/views/overlay/FolderOverlay;->add(Lorg/osmdroid/views/overlay/Overlay;)Z

    add-double v12, v12, v25

    move-wide/from16 v18, v8

    move-wide/from16 v8, v23

    move-wide/from16 v23, v10

    move-wide/from16 v10, v20

    goto/16 :goto_4

    :cond_b
    move-object/from16 v16, v5

    move-wide/from16 v20, v10

    move-wide/from16 v10, v23

    move-wide/from16 v23, v8

    move-wide/from16 v8, v18

    move-object/from16 v18, v14

    if-eqz v17, :cond_13

    .line 60
    sget-boolean v0, Lorg/osmdroid/views/overlay/gridlines/b;->g:Z

    if-eqz v0, :cond_c

    .line 61
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "DATELINE zoom "

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v12, " "

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v13, v23

    invoke-virtual {v5, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v12, v20

    invoke-virtual {v5, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_7

    :cond_c
    move-wide/from16 v12, v20

    :goto_7
    move-wide/from16 v14, v23

    :goto_8
    const-wide v19, 0x4066800000000000L    # 180.0

    cmpg-double v0, v14, v19

    if-gtz v0, :cond_e

    .line 62
    new-instance v0, Lorg/osmdroid/views/overlay/Polyline;

    invoke-direct {v0}, Lorg/osmdroid/views/overlay/Polyline;-><init>()V

    .line 63
    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getOutlinePaint()Landroid/graphics/Paint;

    move-result-object v5

    sget v1, Lorg/osmdroid/views/overlay/gridlines/b;->f:F

    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 64
    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getOutlinePaint()Landroid/graphics/Paint;

    move-result-object v1

    sget v5, Lorg/osmdroid/views/overlay/gridlines/b;->b:I

    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 65
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 66
    new-instance v5, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v5, v10, v11, v14, v15}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 67
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    new-instance v5, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v5, v8, v9, v14, v15}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 69
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    invoke-virtual {v0, v1}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->setPoints(Ljava/util/List;)V

    .line 71
    sget-boolean v1, Lorg/osmdroid/views/overlay/gridlines/b;->h:Z

    if-eqz v1, :cond_d

    .line 72
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v21, v12

    const-string v12, "DATELINE drawing NS"

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_9

    :cond_d
    move-wide/from16 v21, v12

    .line 73
    :goto_9
    invoke-virtual {v3, v0}, Lorg/osmdroid/views/overlay/FolderOverlay;->add(Lorg/osmdroid/views/overlay/Overlay;)Z

    add-double v14, v14, v25

    move-object/from16 v1, p1

    move-wide/from16 v12, v21

    goto :goto_8

    :cond_e
    move-wide/from16 v21, v12

    const-wide v0, -0x3f99800000000000L    # -180.0

    :goto_a
    cmpg-double v5, v0, v21

    if-gtz v5, :cond_11

    .line 74
    new-instance v5, Lorg/osmdroid/views/overlay/Polyline;

    invoke-direct {v5}, Lorg/osmdroid/views/overlay/Polyline;-><init>()V

    .line 75
    invoke-virtual {v5}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getOutlinePaint()Landroid/graphics/Paint;

    move-result-object v12

    sget v13, Lorg/osmdroid/views/overlay/gridlines/b;->f:F

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 76
    invoke-virtual {v5}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getOutlinePaint()Landroid/graphics/Paint;

    move-result-object v12

    sget v13, Lorg/osmdroid/views/overlay/gridlines/b;->b:I

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 77
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 78
    new-instance v13, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v13, v10, v11, v0, v1}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 79
    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    new-instance v13, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v13, v8, v9, v0, v1}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 81
    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    invoke-virtual {v5, v12}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->setPoints(Ljava/util/List;)V

    .line 83
    sget-boolean v12, Lorg/osmdroid/views/overlay/gridlines/b;->h:Z

    if-eqz v12, :cond_f

    .line 84
    sget-object v12, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "DATELINE drawing EW"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 85
    :cond_f
    invoke-virtual {v3, v5}, Lorg/osmdroid/views/overlay/FolderOverlay;->add(Lorg/osmdroid/views/overlay/Overlay;)Z

    .line 86
    new-instance v5, Lorg/osmdroid/views/overlay/Marker;

    move-object/from16 v12, p1

    invoke-direct {v5, v12}, Lorg/osmdroid/views/overlay/Marker;-><init>(Lorg/osmdroid/views/MapView;)V

    .line 87
    invoke-static {v5}, Lorg/osmdroid/views/overlay/gridlines/b;->a(Lorg/osmdroid/views/overlay/Marker;)V

    const/high16 v13, -0x3d4c0000    # -90.0f

    .line 88
    invoke-virtual {v5, v13}, Lorg/osmdroid/views/overlay/Marker;->setRotation(F)V

    .line 89
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v14, Lorg/osmdroid/views/overlay/gridlines/b;->a:Ljava/text/DecimalFormat;

    invoke-virtual {v14, v0, v1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/16 v14, 0x0

    cmpl-double v17, v0, v14

    if-lez v17, :cond_10

    move-object/from16 v14, v16

    goto :goto_b

    :cond_10
    move-object/from16 v14, v18

    :goto_b
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 90
    invoke-virtual {v5, v13}, Lorg/osmdroid/views/overlay/OverlayWithIW;->setTitle(Ljava/lang/String;)V

    .line 91
    invoke-virtual {v5, v13}, Lorg/osmdroid/views/overlay/Marker;->setTextIcon(Ljava/lang/String;)V

    .line 92
    new-instance v13, Lorg/osmdroid/util/GeoPoint;

    add-double v14, v8, v25

    invoke-direct {v13, v14, v15, v0, v1}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {v5, v13}, Lorg/osmdroid/views/overlay/Marker;->setPosition(Lorg/osmdroid/util/GeoPoint;)V

    .line 93
    invoke-virtual {v3, v5}, Lorg/osmdroid/views/overlay/FolderOverlay;->add(Lorg/osmdroid/views/overlay/Overlay;)Z

    add-double v0, v0, v25

    goto/16 :goto_a

    :cond_11
    move-object/from16 v12, p1

    move-wide/from16 v0, v23

    :goto_c
    cmpg-double v2, v0, v19

    if-gez v2, :cond_13

    .line 94
    new-instance v2, Lorg/osmdroid/views/overlay/Marker;

    invoke-direct {v2, v12}, Lorg/osmdroid/views/overlay/Marker;-><init>(Lorg/osmdroid/views/MapView;)V

    .line 95
    invoke-static {v2}, Lorg/osmdroid/views/overlay/gridlines/b;->a(Lorg/osmdroid/views/overlay/Marker;)V

    const/high16 v4, -0x3d4c0000    # -90.0f

    .line 96
    invoke-virtual {v2, v4}, Lorg/osmdroid/views/overlay/Marker;->setRotation(F)V

    .line 97
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lorg/osmdroid/views/overlay/gridlines/b;->a:Ljava/text/DecimalFormat;

    invoke-virtual {v6, v0, v1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/16 v6, 0x0

    cmpl-double v10, v0, v6

    if-lez v10, :cond_12

    move-object/from16 v10, v16

    goto :goto_d

    :cond_12
    move-object/from16 v10, v18

    :goto_d
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 98
    invoke-virtual {v2, v5}, Lorg/osmdroid/views/overlay/OverlayWithIW;->setTitle(Ljava/lang/String;)V

    .line 99
    invoke-virtual {v2, v5}, Lorg/osmdroid/views/overlay/Marker;->setTextIcon(Ljava/lang/String;)V

    .line 100
    new-instance v5, Lorg/osmdroid/util/GeoPoint;

    add-double v10, v8, v25

    invoke-direct {v5, v10, v11, v0, v1}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {v2, v5}, Lorg/osmdroid/views/overlay/Marker;->setPosition(Lorg/osmdroid/util/GeoPoint;)V

    .line 101
    invoke-virtual {v3, v2}, Lorg/osmdroid/views/overlay/FolderOverlay;->add(Lorg/osmdroid/views/overlay/Overlay;)Z

    add-double v0, v0, v25

    goto :goto_c

    :cond_13
    :goto_e
    return-object v3
.end method

.method private static d(DDI)[D
    .locals 16

    .line 1
    move/from16 v0, p4

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x2

    .line 8
    const-wide v5, 0x4056800000000000L    # 90.0

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const-wide v7, -0x3fa9800000000000L    # -90.0

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-ge v0, v1, :cond_4

    .line 19
    .line 20
    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->floor(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v9

    .line 24
    invoke-static/range {p4 .. p4}, Lorg/osmdroid/views/overlay/gridlines/b;->b(I)D

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    move-wide v11, v7

    .line 29
    :goto_0
    cmpg-double v13, v11, v9

    .line 30
    .line 31
    if-gez v13, :cond_0

    .line 32
    .line 33
    add-double/2addr v11, v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static/range {p0 .. p1}, Ljava/lang/Math;->ceil(D)D

    .line 36
    .line 37
    .line 38
    move-result-wide v9

    .line 39
    move-wide v13, v5

    .line 40
    :goto_1
    cmpl-double v15, v13, v9

    .line 41
    .line 42
    if-lez v15, :cond_1

    .line 43
    .line 44
    sub-double/2addr v13, v0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    cmpl-double v0, v13, v5

    .line 47
    .line 48
    if-lez v0, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move-wide v5, v13

    .line 52
    :goto_2
    cmpg-double v0, v11, v7

    .line 53
    .line 54
    if-gez v0, :cond_3

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    move-wide v7, v11

    .line 58
    :goto_3
    new-array v0, v4, [D

    .line 59
    .line 60
    aput-wide v7, v0, v2

    .line 61
    .line 62
    aput-wide v5, v0, v3

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_4
    const-wide/16 v9, 0x0

    .line 66
    .line 67
    cmpl-double v1, p2, v9

    .line 68
    .line 69
    if-lez v1, :cond_5

    .line 70
    .line 71
    move-wide v7, v9

    .line 72
    :cond_5
    cmpg-double v1, p0, v9

    .line 73
    .line 74
    if-gez v1, :cond_6

    .line 75
    .line 76
    move-wide v5, v9

    .line 77
    :cond_6
    move v1, v4

    .line 78
    :goto_4
    if-gt v1, v0, :cond_a

    .line 79
    .line 80
    invoke-static {v1}, Lorg/osmdroid/views/overlay/gridlines/b;->b(I)D

    .line 81
    .line 82
    .line 83
    move-result-wide v9

    .line 84
    :cond_7
    :goto_5
    sub-double v11, p2, v9

    .line 85
    .line 86
    cmpg-double v11, v7, v11

    .line 87
    .line 88
    if-gez v11, :cond_8

    .line 89
    .line 90
    add-double/2addr v7, v9

    .line 91
    sget-boolean v11, Lorg/osmdroid/views/overlay/gridlines/b;->g:Z

    .line 92
    .line 93
    if-eqz v11, :cond_7

    .line 94
    .line 95
    sget-object v11, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 96
    .line 97
    new-instance v12, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v13, "south "

    .line 103
    .line 104
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    invoke-virtual {v11, v12}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_8
    :goto_6
    add-double v11, p0, v9

    .line 119
    .line 120
    cmpl-double v11, v5, v11

    .line 121
    .line 122
    if-lez v11, :cond_9

    .line 123
    .line 124
    sub-double/2addr v5, v9

    .line 125
    sget-boolean v11, Lorg/osmdroid/views/overlay/gridlines/b;->g:Z

    .line 126
    .line 127
    if-eqz v11, :cond_8

    .line 128
    .line 129
    sget-object v11, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 130
    .line 131
    new-instance v12, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    const-string v13, "north "

    .line 137
    .line 138
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    invoke-virtual {v11, v12}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_a
    new-array v0, v4, [D

    .line 156
    .line 157
    aput-wide v7, v0, v2

    .line 158
    .line 159
    aput-wide v5, v0, v3

    .line 160
    .line 161
    return-object v0
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

.method private static e(DDI)[D
    .locals 17

    .line 1
    move/from16 v0, p4

    .line 2
    .line 3
    invoke-static/range {p4 .. p4}, Lorg/osmdroid/views/overlay/gridlines/b;->b(I)D

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    const/16 v3, 0xa

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x2

    .line 12
    const-wide v7, 0x4066800000000000L    # 180.0

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const-wide v9, -0x3f99800000000000L    # -180.0

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    if-ge v0, v3, :cond_4

    .line 23
    .line 24
    invoke-static/range {p0 .. p1}, Ljava/lang/Math;->floor(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v11

    .line 28
    move-wide v13, v7

    .line 29
    :goto_0
    cmpl-double v0, v13, v11

    .line 30
    .line 31
    if-lez v0, :cond_0

    .line 32
    .line 33
    sub-double/2addr v13, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->ceil(D)D

    .line 36
    .line 37
    .line 38
    move-result-wide v11

    .line 39
    move-wide v15, v9

    .line 40
    :goto_1
    cmpg-double v0, v15, v11

    .line 41
    .line 42
    if-gez v0, :cond_1

    .line 43
    .line 44
    add-double/2addr v15, v1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    cmpg-double v0, v13, v9

    .line 47
    .line 48
    if-gez v0, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move-wide v9, v13

    .line 52
    :goto_2
    cmpl-double v0, v11, v7

    .line 53
    .line 54
    if-lez v0, :cond_3

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    move-wide v7, v11

    .line 58
    :goto_3
    new-array v0, v6, [D

    .line 59
    .line 60
    aput-wide v7, v0, v4

    .line 61
    .line 62
    aput-wide v9, v0, v5

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_4
    const-wide/16 v1, 0x0

    .line 66
    .line 67
    cmpl-double v3, p0, v1

    .line 68
    .line 69
    if-lez v3, :cond_5

    .line 70
    .line 71
    move-wide v9, v1

    .line 72
    :cond_5
    cmpg-double v3, p2, v1

    .line 73
    .line 74
    if-gez v3, :cond_6

    .line 75
    .line 76
    move-wide v7, v1

    .line 77
    :cond_6
    move v1, v6

    .line 78
    :goto_4
    if-gt v1, v0, :cond_9

    .line 79
    .line 80
    invoke-static {v1}, Lorg/osmdroid/views/overlay/gridlines/b;->b(I)D

    .line 81
    .line 82
    .line 83
    move-result-wide v2

    .line 84
    :goto_5
    add-double v11, p2, v2

    .line 85
    .line 86
    cmpl-double v11, v7, v11

    .line 87
    .line 88
    if-lez v11, :cond_7

    .line 89
    .line 90
    sub-double/2addr v7, v2

    .line 91
    goto :goto_5

    .line 92
    :cond_7
    :goto_6
    sub-double v11, p0, v2

    .line 93
    .line 94
    cmpg-double v11, v9, v11

    .line 95
    .line 96
    if-gez v11, :cond_8

    .line 97
    .line 98
    add-double/2addr v9, v2

    .line 99
    sget-boolean v11, Lorg/osmdroid/views/overlay/gridlines/b;->g:Z

    .line 100
    .line 101
    if-eqz v11, :cond_7

    .line 102
    .line 103
    sget-object v11, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 104
    .line 105
    new-instance v12, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    const-string v13, "west "

    .line 111
    .line 112
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    invoke-virtual {v11, v12}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_9
    sget-boolean v0, Lorg/osmdroid/views/overlay/gridlines/b;->g:Z

    .line 130
    .line 131
    if-eqz v0, :cond_a

    .line 132
    .line 133
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 134
    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    const-string v2, "return EW set as "

    .line 141
    .line 142
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v2, " "

    .line 149
    .line 150
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :cond_a
    new-array v0, v6, [D

    .line 164
    .line 165
    aput-wide v7, v0, v4

    .line 166
    .line 167
    aput-wide v9, v0, v5

    .line 168
    .line 169
    return-object v0
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

.method public static f()V
    .locals 2

    .line 1
    const/high16 v0, -0x1000000

    .line 2
    .line 3
    sput v0, Lorg/osmdroid/views/overlay/gridlines/b;->b:I

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    sput v1, Lorg/osmdroid/views/overlay/gridlines/b;->c:I

    .line 7
    .line 8
    sput v0, Lorg/osmdroid/views/overlay/gridlines/b;->e:I

    .line 9
    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    sput v0, Lorg/osmdroid/views/overlay/gridlines/b;->f:F

    .line 13
    .line 14
    const/16 v0, 0x20

    .line 15
    .line 16
    sput-short v0, Lorg/osmdroid/views/overlay/gridlines/b;->d:S

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    sput-boolean v0, Lorg/osmdroid/views/overlay/gridlines/b;->g:Z

    .line 20
    .line 21
    sput-boolean v0, Lorg/osmdroid/views/overlay/gridlines/b;->h:Z

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
