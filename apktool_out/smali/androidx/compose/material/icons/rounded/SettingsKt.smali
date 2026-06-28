.class public final Landroidx/compose/material/icons/rounded/SettingsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_settings",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Settings",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSettings",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/rounded/SettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n72#5,4:119\n*S KotlinDebug\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/rounded/SettingsKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n30#1:119,4\n*E\n"
    }
.end annotation


# static fields
.field private static _settings:Landroidx/compose/ui/graphics/vector/ImageVector;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettings(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 30
    .param p0    # Landroidx/compose/material/icons/Icons$Rounded;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SettingsKt;->_settings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    const-string v2, "Rounded.Settings"

    .line 10
    .line 11
    const/4 v10, 0x0

    .line 12
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 13
    .line 14
    move-object v13, v1

    .line 15
    const/high16 v0, 0x41c00000    # 24.0f

    .line 16
    .line 17
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/high16 v5, 0x41c00000    # 24.0f

    .line 26
    .line 27
    const/high16 v6, 0x41c00000    # 24.0f

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const/16 v11, 0x60

    .line 33
    .line 34
    const/4 v12, 0x0

    .line 35
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/w;)V

    .line 36
    .line 37
    .line 38
    const/high16 v18, 0x3f800000    # 1.0f

    .line 39
    .line 40
    const/high16 v20, 0x3f800000    # 1.0f

    .line 41
    .line 42
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 43
    .line 44
    .line 45
    move-result v15

    .line 46
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 47
    .line 48
    move-object/from16 v17, v0

    .line 49
    .line 50
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 51
    .line 52
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 53
    .line 54
    .line 55
    move-result-wide v1

    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/w;)V

    .line 58
    .line 59
    .line 60
    const/16 v19, 0x0

    .line 61
    .line 62
    const/high16 v21, 0x3f800000    # 1.0f

    .line 63
    .line 64
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 65
    .line 66
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 67
    .line 68
    .line 69
    move-result v22

    .line 70
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 73
    .line 74
    .line 75
    move-result v23

    .line 76
    const/high16 v24, 0x3f800000    # 1.0f

    .line 77
    .line 78
    const-string v16, ""

    .line 79
    .line 80
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    invoke-direct {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    const/high16 v0, 0x419c0000    # 19.5f

    .line 86
    .line 87
    const/high16 v1, 0x41400000    # 12.0f

    .line 88
    .line 89
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/4 v1, 0x0

    .line 93
    const v2, -0x41947ae1    # -0.23f

    .line 94
    .line 95
    .line 96
    const v3, -0x43dc28f6    # -0.01f

    .line 97
    .line 98
    .line 99
    const v4, -0x4119999a    # -0.45f

    .line 100
    .line 101
    .line 102
    const v5, -0x430a3d71    # -0.03f

    .line 103
    .line 104
    .line 105
    const v6, -0x40d1eb85    # -0.68f

    .line 106
    .line 107
    .line 108
    move-object v0, v7

    .line 109
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v8, 0x3fee147b    # 1.86f

    .line 113
    .line 114
    .line 115
    const v9, -0x404b851f    # -1.41f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v1, 0x3ecccccd    # 0.4f

    .line 122
    .line 123
    .line 124
    const v2, -0x41666666    # -0.3f

    .line 125
    .line 126
    .line 127
    const v3, 0x3f028f5c    # 0.51f

    .line 128
    .line 129
    .line 130
    const v4, -0x40a3d70a    # -0.86f

    .line 131
    .line 132
    .line 133
    const v5, 0x3e851eb8    # 0.26f

    .line 134
    .line 135
    .line 136
    const v6, -0x4059999a    # -1.3f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, -0x4010a3d7    # -1.87f

    .line 143
    .line 144
    .line 145
    const v10, -0x3fb147ae    # -3.23f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7, v0, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v1, -0x41800000    # -0.25f

    .line 152
    .line 153
    const v2, -0x411eb852    # -0.44f

    .line 154
    .line 155
    .line 156
    const v3, -0x40b5c28f    # -0.79f

    .line 157
    .line 158
    .line 159
    const v4, -0x40e147ae    # -0.62f

    .line 160
    .line 161
    .line 162
    const/high16 v5, -0x40600000    # -1.25f

    .line 163
    .line 164
    const v6, -0x4128f5c3    # -0.42f

    .line 165
    .line 166
    .line 167
    move-object v0, v7

    .line 168
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v0, -0x3ff66666    # -2.15f

    .line 172
    .line 173
    .line 174
    const v11, 0x3f68f5c3    # 0.91f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v7, v0, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v1, -0x41428f5c    # -0.37f

    .line 181
    .line 182
    .line 183
    const v2, -0x417ae148    # -0.26f

    .line 184
    .line 185
    .line 186
    const v3, -0x40bd70a4    # -0.76f

    .line 187
    .line 188
    .line 189
    const v4, -0x41051eb8    # -0.49f

    .line 190
    .line 191
    .line 192
    const v5, -0x406a3d71    # -1.17f

    .line 193
    .line 194
    .line 195
    const v6, -0x40d1eb85    # -0.68f

    .line 196
    .line 197
    .line 198
    move-object v0, v7

    .line 199
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, -0x416b851f    # -0.29f

    .line 203
    .line 204
    .line 205
    const v12, -0x3fec28f6    # -2.31f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v7, v0, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v1, 0x416ccccd    # 14.8f

    .line 212
    .line 213
    .line 214
    const v2, 0x401851ec    # 2.38f

    .line 215
    .line 216
    .line 217
    const v3, 0x4165eb85    # 14.37f

    .line 218
    .line 219
    .line 220
    const/high16 v4, 0x40000000    # 2.0f

    .line 221
    .line 222
    const v5, 0x415deb85    # 13.87f

    .line 223
    .line 224
    .line 225
    const/high16 v6, 0x40000000    # 2.0f

    .line 226
    .line 227
    move-object v0, v7

    .line 228
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, -0x3f9147ae    # -3.73f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v1, 0x411a147b    # 9.63f

    .line 238
    .line 239
    .line 240
    const/high16 v2, 0x40000000    # 2.0f

    .line 241
    .line 242
    const v3, 0x41133333    # 9.2f

    .line 243
    .line 244
    .line 245
    const v4, 0x401851ec    # 2.38f

    .line 246
    .line 247
    .line 248
    const v5, 0x41123d71    # 9.14f

    .line 249
    .line 250
    .line 251
    const v6, 0x403851ec    # 2.88f

    .line 252
    .line 253
    .line 254
    move-object v0, v7

    .line 255
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, 0x410d999a    # 8.85f

    .line 259
    .line 260
    .line 261
    const v1, 0x40a6147b    # 5.19f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v1, -0x412e147b    # -0.41f

    .line 268
    .line 269
    .line 270
    const v2, 0x3e428f5c    # 0.19f

    .line 271
    .line 272
    .line 273
    const v3, -0x40b33333    # -0.8f

    .line 274
    .line 275
    .line 276
    const v4, 0x3ed70a3d    # 0.42f

    .line 277
    .line 278
    .line 279
    const v5, -0x406a3d71    # -1.17f

    .line 280
    .line 281
    .line 282
    const v6, 0x3f2e147b    # 0.68f

    .line 283
    .line 284
    .line 285
    move-object v0, v7

    .line 286
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, 0x40b0f5c3    # 5.53f

    .line 290
    .line 291
    .line 292
    const v1, 0x409eb852    # 4.96f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v1, -0x41147ae1    # -0.46f

    .line 299
    .line 300
    .line 301
    const v2, -0x41b33333    # -0.2f

    .line 302
    .line 303
    .line 304
    const/high16 v3, -0x40800000    # -1.0f

    .line 305
    .line 306
    const v4, -0x435c28f6    # -0.02f

    .line 307
    .line 308
    .line 309
    const/high16 v5, -0x40600000    # -1.25f

    .line 310
    .line 311
    const v6, 0x3ed70a3d    # 0.42f

    .line 312
    .line 313
    .line 314
    move-object v0, v7

    .line 315
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x401a3d71    # 2.41f

    .line 319
    .line 320
    .line 321
    const v1, 0x4109eb85    # 8.62f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v1, -0x41800000    # -0.25f

    .line 328
    .line 329
    const v2, 0x3ee147ae    # 0.44f

    .line 330
    .line 331
    .line 332
    const v3, -0x41f0a3d7    # -0.14f

    .line 333
    .line 334
    .line 335
    const v4, 0x3f7d70a4    # 0.99f

    .line 336
    .line 337
    .line 338
    const v5, 0x3e851eb8    # 0.26f

    .line 339
    .line 340
    .line 341
    const v6, 0x3fa66666    # 1.3f

    .line 342
    .line 343
    .line 344
    move-object v0, v7

    .line 345
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v14, 0x3fb47ae1    # 1.41f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v7, v8, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v1, 0x409051ec    # 4.51f

    .line 355
    .line 356
    .line 357
    const v2, 0x4138cccd    # 11.55f

    .line 358
    .line 359
    .line 360
    const/high16 v3, 0x40900000    # 4.5f

    .line 361
    .line 362
    const v4, 0x413c51ec    # 11.77f

    .line 363
    .line 364
    .line 365
    const/high16 v5, 0x40900000    # 4.5f

    .line 366
    .line 367
    const/high16 v6, 0x41400000    # 12.0f

    .line 368
    .line 369
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x3cf5c28f    # 0.03f

    .line 373
    .line 374
    .line 375
    const v1, 0x3f2e147b    # 0.68f

    .line 376
    .line 377
    .line 378
    const v2, 0x3c23d70a    # 0.01f

    .line 379
    .line 380
    .line 381
    const v3, 0x3ee66666    # 0.45f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v7, v2, v3, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v8, -0x4011eb85    # -1.86f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v7, v8, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v1, -0x41333333    # -0.4f

    .line 394
    .line 395
    .line 396
    const v2, 0x3e99999a    # 0.3f

    .line 397
    .line 398
    .line 399
    const v3, -0x40fd70a4    # -0.51f

    .line 400
    .line 401
    .line 402
    const v4, 0x3f5c28f6    # 0.86f

    .line 403
    .line 404
    .line 405
    const v5, -0x417ae148    # -0.26f

    .line 406
    .line 407
    .line 408
    const v6, 0x3fa66666    # 1.3f

    .line 409
    .line 410
    .line 411
    move-object v0, v7

    .line 412
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, 0x404eb852    # 3.23f

    .line 416
    .line 417
    .line 418
    const v14, 0x3fef5c29    # 1.87f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v7, v14, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v1, 0x3e800000    # 0.25f

    .line 425
    .line 426
    const v2, 0x3ee147ae    # 0.44f

    .line 427
    .line 428
    .line 429
    const v3, 0x3f4a3d71    # 0.79f

    .line 430
    .line 431
    .line 432
    const v4, 0x3f1eb852    # 0.62f

    .line 433
    .line 434
    .line 435
    const/high16 v5, 0x3fa00000    # 1.25f

    .line 436
    .line 437
    const v6, 0x3ed70a3d    # 0.42f

    .line 438
    .line 439
    .line 440
    move-object v0, v7

    .line 441
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, -0x40970a3d    # -0.91f

    .line 445
    .line 446
    .line 447
    const v6, 0x4009999a    # 2.15f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v7, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v1, 0x3ebd70a4    # 0.37f

    .line 454
    .line 455
    .line 456
    const v2, 0x3e851eb8    # 0.26f

    .line 457
    .line 458
    .line 459
    const v3, 0x3f428f5c    # 0.76f

    .line 460
    .line 461
    .line 462
    const v4, 0x3efae148    # 0.49f

    .line 463
    .line 464
    .line 465
    const v5, 0x3f95c28f    # 1.17f

    .line 466
    .line 467
    .line 468
    const v25, 0x3f2e147b    # 0.68f

    .line 469
    .line 470
    .line 471
    move-object v0, v7

    .line 472
    move v8, v6

    .line 473
    move/from16 v6, v25

    .line 474
    .line 475
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v0, 0x4013d70a    # 2.31f

    .line 479
    .line 480
    .line 481
    const v6, 0x3e947ae1    # 0.29f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v7, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v1, 0x41133333    # 9.2f

    .line 488
    .line 489
    .line 490
    const v2, 0x41acf5c3    # 21.62f

    .line 491
    .line 492
    .line 493
    const v3, 0x411a147b    # 9.63f

    .line 494
    .line 495
    .line 496
    const/high16 v4, 0x41b00000    # 22.0f

    .line 497
    .line 498
    const v5, 0x4122147b    # 10.13f

    .line 499
    .line 500
    .line 501
    const/high16 v25, 0x41b00000    # 22.0f

    .line 502
    .line 503
    move-object v0, v7

    .line 504
    move v9, v6

    .line 505
    move/from16 v6, v25

    .line 506
    .line 507
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, 0x406eb852    # 3.73f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v1, 0x3f000000    # 0.5f

    .line 517
    .line 518
    const/4 v2, 0x0

    .line 519
    const v3, 0x3f6e147b    # 0.93f

    .line 520
    .line 521
    .line 522
    const v4, -0x413d70a4    # -0.38f

    .line 523
    .line 524
    .line 525
    const v5, 0x3f7d70a4    # 0.99f

    .line 526
    .line 527
    .line 528
    const v6, -0x409eb852    # -0.88f

    .line 529
    .line 530
    .line 531
    move-object v0, v7

    .line 532
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v7, v9, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v1, 0x3ed1eb85    # 0.41f

    .line 539
    .line 540
    .line 541
    const v2, -0x41bd70a4    # -0.19f

    .line 542
    .line 543
    .line 544
    const v3, 0x3f4ccccd    # 0.8f

    .line 545
    .line 546
    .line 547
    const v4, -0x4128f5c3    # -0.42f

    .line 548
    .line 549
    .line 550
    const v5, 0x3f95c28f    # 1.17f

    .line 551
    .line 552
    .line 553
    const v6, -0x40d1eb85    # -0.68f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v7, v8, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v1, 0x3eeb851f    # 0.46f

    .line 563
    .line 564
    .line 565
    const v2, 0x3e4ccccd    # 0.2f

    .line 566
    .line 567
    .line 568
    const/high16 v3, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const v4, 0x3ca3d70a    # 0.02f

    .line 571
    .line 572
    .line 573
    const/high16 v5, 0x3fa00000    # 1.25f

    .line 574
    .line 575
    const v6, -0x4128f5c3    # -0.42f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v7, v14, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v1, 0x3e800000    # 0.25f

    .line 585
    .line 586
    const v2, -0x411eb852    # -0.44f

    .line 587
    .line 588
    .line 589
    const v3, 0x3e0f5c29    # 0.14f

    .line 590
    .line 591
    .line 592
    const v4, -0x40828f5c    # -0.99f

    .line 593
    .line 594
    .line 595
    const v5, -0x417ae148    # -0.26f

    .line 596
    .line 597
    .line 598
    const v6, -0x4059999a    # -1.3f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v0, -0x4011eb85    # -1.86f

    .line 605
    .line 606
    .line 607
    const v1, -0x404b851f    # -1.41f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v1, 0x419beb85    # 19.49f

    .line 614
    .line 615
    .line 616
    const v2, 0x41473333    # 12.45f

    .line 617
    .line 618
    .line 619
    const/high16 v3, 0x419c0000    # 19.5f

    .line 620
    .line 621
    const v4, 0x4143ae14    # 12.23f

    .line 622
    .line 623
    .line 624
    const/high16 v5, 0x419c0000    # 19.5f

    .line 625
    .line 626
    const/high16 v6, 0x41400000    # 12.0f

    .line 627
    .line 628
    move-object v0, v7

    .line 629
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v8, 0x4140a3d7    # 12.04f

    .line 636
    .line 637
    .line 638
    const/high16 v9, 0x41780000    # 15.5f

    .line 639
    .line 640
    invoke-virtual {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v1, -0x4008f5c3    # -1.93f

    .line 644
    .line 645
    .line 646
    const/4 v2, 0x0

    .line 647
    const/high16 v3, -0x3fa00000    # -3.5f

    .line 648
    .line 649
    const v4, -0x40370a3d    # -1.57f

    .line 650
    .line 651
    .line 652
    const/high16 v5, -0x3fa00000    # -3.5f

    .line 653
    .line 654
    const/high16 v6, -0x3fa00000    # -3.5f

    .line 655
    .line 656
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v0, 0x3fc8f5c3    # 1.57f

    .line 660
    .line 661
    .line 662
    const/high16 v1, -0x3fa00000    # -3.5f

    .line 663
    .line 664
    const/high16 v2, 0x40600000    # 3.5f

    .line 665
    .line 666
    invoke-virtual {v7, v0, v1, v2, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v7, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v0, 0x415f851f    # 13.97f

    .line 673
    .line 674
    .line 675
    invoke-virtual {v7, v0, v9, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 682
    .line 683
    .line 684
    move-result-object v14

    .line 685
    const/16 v25, 0x0

    .line 686
    .line 687
    const/16 v26, 0x0

    .line 688
    .line 689
    const/16 v27, 0x0

    .line 690
    .line 691
    const/16 v28, 0x3800

    .line 692
    .line 693
    const/16 v29, 0x0

    .line 694
    .line 695
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    sput-object v0, Landroidx/compose/material/icons/rounded/SettingsKt;->_settings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 704
    .line 705
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    return-object v0
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
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
.end method
