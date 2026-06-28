.class final Lcom/tendcloud/tenddata/at;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(D)I
    .locals 2

    .line 9
    :try_start_0
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "######0"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v0, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static a([[D)I
    .locals 11

    const/4 v0, 0x4

    new-array v1, v0, [[D

    new-array v2, v0, [D

    const/4 v3, 0x0

    .line 4
    aget-object v4, p0, v3

    aget-wide v5, v4, v3

    aput-wide v5, v2, v3

    const/4 v5, 0x1

    aget-wide v6, v4, v5

    aput-wide v6, v2, v5

    const/4 v6, 0x2

    aget-wide v7, v4, v6

    aput-wide v7, v2, v6

    const/4 v7, 0x3

    aget-wide v8, v4, v7

    aput-wide v8, v2, v7

    aput-object v2, v1, v3

    new-array v2, v0, [D

    aget-object v4, p0, v5

    aget-wide v8, v4, v3

    aput-wide v8, v2, v3

    aget-wide v8, v4, v5

    aput-wide v8, v2, v5

    aget-wide v8, v4, v6

    aput-wide v8, v2, v6

    aget-wide v8, v4, v7

    aput-wide v8, v2, v7

    aput-object v2, v1, v5

    new-array v2, v0, [D

    aget-object v4, p0, v6

    aget-wide v8, v4, v3

    aput-wide v8, v2, v3

    aget-wide v8, v4, v5

    aput-wide v8, v2, v5

    aget-wide v8, v4, v6

    aput-wide v8, v2, v6

    aget-wide v8, v4, v7

    aput-wide v8, v2, v7

    aput-object v2, v1, v6

    new-array v2, v0, [D

    aget-object v4, p0, v7

    aget-wide v8, v4, v3

    aput-wide v8, v2, v3

    aget-wide v8, v4, v5

    aput-wide v8, v2, v5

    aget-wide v8, v4, v6

    aput-wide v8, v2, v6

    aget-wide v8, v4, v7

    aput-wide v8, v2, v7

    aput-object v2, v1, v7

    new-array v2, v0, [[D

    new-array v4, v0, [D

    .line 5
    aget-object v8, p0, v3

    aget-wide v9, v8, v3

    aput-wide v9, v4, v3

    aget-wide v9, v8, v5

    aput-wide v9, v4, v5

    aget-wide v9, v8, v6

    aput-wide v9, v4, v6

    aget-wide v9, v8, v0

    aput-wide v9, v4, v7

    aput-object v4, v2, v3

    new-array v4, v0, [D

    aget-object v8, p0, v5

    aget-wide v9, v8, v3

    aput-wide v9, v4, v3

    aget-wide v9, v8, v5

    aput-wide v9, v4, v5

    aget-wide v9, v8, v6

    aput-wide v9, v4, v6

    aget-wide v9, v8, v0

    aput-wide v9, v4, v7

    aput-object v4, v2, v5

    new-array v4, v0, [D

    aget-object v8, p0, v6

    aget-wide v9, v8, v3

    aput-wide v9, v4, v3

    aget-wide v9, v8, v5

    aput-wide v9, v4, v5

    aget-wide v9, v8, v6

    aput-wide v9, v4, v6

    aget-wide v9, v8, v0

    aput-wide v9, v4, v7

    aput-object v4, v2, v6

    new-array v4, v0, [D

    aget-object p0, p0, v7

    aget-wide v8, p0, v3

    aput-wide v8, v4, v3

    aget-wide v8, p0, v5

    aput-wide v8, v4, v5

    aget-wide v8, p0, v6

    aput-wide v8, v4, v6

    aget-wide v5, p0, v0

    aput-wide v5, v4, v7

    aput-object v4, v2, v7

    .line 6
    invoke-static {v1}, Lcom/tendcloud/tenddata/at;->b([[D)D

    move-result-wide v0

    const-wide/16 v4, 0x0

    cmpl-double p0, v0, v4

    if-nez p0, :cond_0

    return v3

    .line 7
    :cond_0
    invoke-static {v2}, Lcom/tendcloud/tenddata/at;->b([[D)D

    move-result-wide v2

    div-double/2addr v2, v0

    .line 8
    invoke-static {v2, v3}, Lcom/tendcloud/tenddata/at;->a(D)I

    move-result p0

    return p0
.end method

.method static a([[I)I
    .locals 14

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 1
    :try_start_0
    array-length v1, p0

    const/4 v2, 0x4

    if-ge v1, v2, :cond_0

    goto/16 :goto_0

    :cond_0
    new-array v1, v2, [[D

    const/4 v3, 0x5

    new-array v4, v3, [D

    .line 2
    aget-object v5, p0, v0

    aget v6, v5, v0

    mul-int v7, v6, v6

    mul-int/2addr v7, v6

    int-to-double v7, v7

    aput-wide v7, v4, v0

    mul-int v7, v6, v6

    int-to-double v7, v7

    const/4 v9, 0x1

    aput-wide v7, v4, v9

    int-to-double v6, v6

    const/4 v8, 0x2

    aput-wide v6, v4, v8

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    const/4 v10, 0x3

    aput-wide v6, v4, v10

    aget v5, v5, v9

    int-to-double v11, v5

    aput-wide v11, v4, v2

    aput-object v4, v1, v0

    new-array v4, v3, [D

    aget-object v5, p0, v9

    aget v11, v5, v0

    mul-int v12, v11, v11

    mul-int/2addr v12, v11

    int-to-double v12, v12

    aput-wide v12, v4, v0

    mul-int v12, v11, v11

    int-to-double v12, v12

    aput-wide v12, v4, v9

    int-to-double v11, v11

    aput-wide v11, v4, v8

    aput-wide v6, v4, v10

    aget v5, v5, v9

    int-to-double v11, v5

    aput-wide v11, v4, v2

    aput-object v4, v1, v9

    new-array v4, v3, [D

    aget-object v5, p0, v8

    aget v11, v5, v0

    mul-int v12, v11, v11

    mul-int/2addr v12, v11

    int-to-double v12, v12

    aput-wide v12, v4, v0

    mul-int v12, v11, v11

    int-to-double v12, v12

    aput-wide v12, v4, v9

    int-to-double v11, v11

    aput-wide v11, v4, v8

    aput-wide v6, v4, v10

    aget v5, v5, v9

    int-to-double v11, v5

    aput-wide v11, v4, v2

    aput-object v4, v1, v8

    new-array v3, v3, [D

    aget-object p0, p0, v10

    aget v4, p0, v0

    mul-int v5, v4, v4

    mul-int/2addr v5, v4

    int-to-double v11, v5

    aput-wide v11, v3, v0

    mul-int v5, v4, v4

    int-to-double v11, v5

    aput-wide v11, v3, v9

    int-to-double v4, v4

    aput-wide v4, v3, v8

    aput-wide v6, v3, v10

    aget p0, p0, v9

    int-to-double v4, p0

    aput-wide v4, v3, v2

    aput-object v3, v1, v10

    .line 3
    invoke-static {v1}, Lcom/tendcloud/tenddata/at;->a([[D)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    :cond_1
    :goto_0
    return v0
.end method

.method private static b([[D)D
    .locals 15

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v1, v0, [[D

    .line 3
    .line 4
    new-array v2, v0, [D

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    aget-object v4, p0, v3

    .line 8
    .line 9
    aget-wide v5, v4, v3

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    aput-wide v5, v2, v7

    .line 13
    .line 14
    const/4 v5, 0x2

    .line 15
    aget-wide v8, v4, v5

    .line 16
    .line 17
    aput-wide v8, v2, v3

    .line 18
    .line 19
    aget-wide v8, v4, v0

    .line 20
    .line 21
    aput-wide v8, v2, v5

    .line 22
    .line 23
    aput-object v2, v1, v7

    .line 24
    .line 25
    new-array v2, v0, [D

    .line 26
    .line 27
    aget-object v4, p0, v5

    .line 28
    .line 29
    aget-wide v8, v4, v3

    .line 30
    .line 31
    aput-wide v8, v2, v7

    .line 32
    .line 33
    aget-wide v8, v4, v5

    .line 34
    .line 35
    aput-wide v8, v2, v3

    .line 36
    .line 37
    aget-wide v8, v4, v0

    .line 38
    .line 39
    aput-wide v8, v2, v5

    .line 40
    .line 41
    aput-object v2, v1, v3

    .line 42
    .line 43
    new-array v2, v0, [D

    .line 44
    .line 45
    aget-object v4, p0, v0

    .line 46
    .line 47
    aget-wide v8, v4, v3

    .line 48
    .line 49
    aput-wide v8, v2, v7

    .line 50
    .line 51
    aget-wide v8, v4, v5

    .line 52
    .line 53
    aput-wide v8, v2, v3

    .line 54
    .line 55
    aget-wide v8, v4, v0

    .line 56
    .line 57
    aput-wide v8, v2, v5

    .line 58
    .line 59
    aput-object v2, v1, v5

    .line 60
    .line 61
    new-array v2, v0, [[D

    .line 62
    .line 63
    new-array v6, v0, [D

    .line 64
    .line 65
    aget-object v10, p0, v3

    .line 66
    .line 67
    aget-wide v11, v10, v7

    .line 68
    .line 69
    aput-wide v11, v6, v7

    .line 70
    .line 71
    aget-wide v11, v10, v5

    .line 72
    .line 73
    aput-wide v11, v6, v3

    .line 74
    .line 75
    aget-wide v11, v10, v0

    .line 76
    .line 77
    aput-wide v11, v6, v5

    .line 78
    .line 79
    aput-object v6, v2, v7

    .line 80
    .line 81
    new-array v6, v0, [D

    .line 82
    .line 83
    aget-object v10, p0, v5

    .line 84
    .line 85
    aget-wide v11, v10, v7

    .line 86
    .line 87
    aput-wide v11, v6, v7

    .line 88
    .line 89
    aget-wide v11, v10, v5

    .line 90
    .line 91
    aput-wide v11, v6, v3

    .line 92
    .line 93
    aget-wide v11, v10, v0

    .line 94
    .line 95
    aput-wide v11, v6, v5

    .line 96
    .line 97
    aput-object v6, v2, v3

    .line 98
    .line 99
    new-array v6, v0, [D

    .line 100
    .line 101
    aget-wide v10, v4, v7

    .line 102
    .line 103
    aput-wide v10, v6, v7

    .line 104
    .line 105
    aget-wide v10, v4, v5

    .line 106
    .line 107
    aput-wide v10, v6, v3

    .line 108
    .line 109
    aput-wide v8, v6, v5

    .line 110
    .line 111
    aput-object v6, v2, v5

    .line 112
    .line 113
    new-array v6, v0, [[D

    .line 114
    .line 115
    new-array v10, v0, [D

    .line 116
    .line 117
    aget-object v11, p0, v3

    .line 118
    .line 119
    aget-wide v12, v11, v7

    .line 120
    .line 121
    aput-wide v12, v10, v7

    .line 122
    .line 123
    aget-wide v12, v11, v3

    .line 124
    .line 125
    aput-wide v12, v10, v3

    .line 126
    .line 127
    aget-wide v12, v11, v0

    .line 128
    .line 129
    aput-wide v12, v10, v5

    .line 130
    .line 131
    aput-object v10, v6, v7

    .line 132
    .line 133
    new-array v10, v0, [D

    .line 134
    .line 135
    aget-object v11, p0, v5

    .line 136
    .line 137
    aget-wide v12, v11, v7

    .line 138
    .line 139
    aput-wide v12, v10, v7

    .line 140
    .line 141
    aget-wide v12, v11, v3

    .line 142
    .line 143
    aput-wide v12, v10, v3

    .line 144
    .line 145
    aget-wide v12, v11, v0

    .line 146
    .line 147
    aput-wide v12, v10, v5

    .line 148
    .line 149
    aput-object v10, v6, v3

    .line 150
    .line 151
    new-array v10, v0, [D

    .line 152
    .line 153
    aget-wide v11, v4, v7

    .line 154
    .line 155
    aput-wide v11, v10, v7

    .line 156
    .line 157
    aget-wide v11, v4, v3

    .line 158
    .line 159
    aput-wide v11, v10, v3

    .line 160
    .line 161
    aput-wide v8, v10, v5

    .line 162
    .line 163
    aput-object v10, v6, v5

    .line 164
    .line 165
    new-array v8, v0, [[D

    .line 166
    .line 167
    new-array v9, v0, [D

    .line 168
    .line 169
    aget-object v10, p0, v3

    .line 170
    .line 171
    aget-wide v11, v10, v7

    .line 172
    .line 173
    aput-wide v11, v9, v7

    .line 174
    .line 175
    aget-wide v11, v10, v3

    .line 176
    .line 177
    aput-wide v11, v9, v3

    .line 178
    .line 179
    aget-wide v11, v10, v5

    .line 180
    .line 181
    aput-wide v11, v9, v5

    .line 182
    .line 183
    aput-object v9, v8, v7

    .line 184
    .line 185
    new-array v9, v0, [D

    .line 186
    .line 187
    aget-object v10, p0, v5

    .line 188
    .line 189
    aget-wide v11, v10, v7

    .line 190
    .line 191
    aput-wide v11, v9, v7

    .line 192
    .line 193
    aget-wide v11, v10, v3

    .line 194
    .line 195
    aput-wide v11, v9, v3

    .line 196
    .line 197
    aget-wide v11, v10, v5

    .line 198
    .line 199
    aput-wide v11, v9, v5

    .line 200
    .line 201
    aput-object v9, v8, v3

    .line 202
    .line 203
    new-array v9, v0, [D

    .line 204
    .line 205
    aget-wide v10, v4, v7

    .line 206
    .line 207
    aput-wide v10, v9, v7

    .line 208
    .line 209
    aget-wide v10, v4, v3

    .line 210
    .line 211
    aput-wide v10, v9, v3

    .line 212
    .line 213
    aget-wide v10, v4, v5

    .line 214
    .line 215
    aput-wide v10, v9, v5

    .line 216
    .line 217
    aput-object v9, v8, v5

    .line 218
    .line 219
    const-wide/16 v9, 0x0

    .line 220
    .line 221
    const-wide/high16 v11, -0x4010000000000000L    # -1.0

    .line 222
    .line 223
    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 224
    .line 225
    .line 226
    move-result-wide v9

    .line 227
    aget-object v4, p0, v7

    .line 228
    .line 229
    aget-wide v13, v4, v7

    .line 230
    .line 231
    mul-double/2addr v9, v13

    .line 232
    invoke-static {v1}, Lcom/tendcloud/tenddata/at;->c([[D)D

    .line 233
    .line 234
    .line 235
    move-result-wide v13

    .line 236
    mul-double/2addr v9, v13

    .line 237
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    .line 238
    .line 239
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 240
    .line 241
    .line 242
    move-result-wide v13

    .line 243
    aget-object v1, p0, v7

    .line 244
    .line 245
    aget-wide v3, v1, v3

    .line 246
    .line 247
    mul-double/2addr v13, v3

    .line 248
    invoke-static {v2}, Lcom/tendcloud/tenddata/at;->c([[D)D

    .line 249
    .line 250
    .line 251
    move-result-wide v1

    .line 252
    mul-double/2addr v13, v1

    .line 253
    add-double/2addr v9, v13

    .line 254
    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    .line 255
    .line 256
    invoke-static {v11, v12, v1, v2}, Ljava/lang/Math;->pow(DD)D

    .line 257
    .line 258
    .line 259
    move-result-wide v1

    .line 260
    aget-object v3, p0, v7

    .line 261
    .line 262
    aget-wide v4, v3, v5

    .line 263
    .line 264
    mul-double/2addr v1, v4

    .line 265
    invoke-static {v6}, Lcom/tendcloud/tenddata/at;->c([[D)D

    .line 266
    .line 267
    .line 268
    move-result-wide v3

    .line 269
    mul-double/2addr v1, v3

    .line 270
    add-double/2addr v9, v1

    .line 271
    const-wide/high16 v1, 0x4008000000000000L    # 3.0

    .line 272
    .line 273
    invoke-static {v11, v12, v1, v2}, Ljava/lang/Math;->pow(DD)D

    .line 274
    .line 275
    .line 276
    move-result-wide v1

    .line 277
    aget-object p0, p0, v7

    .line 278
    .line 279
    aget-wide v3, p0, v0

    .line 280
    .line 281
    mul-double/2addr v1, v3

    .line 282
    invoke-static {v8}, Lcom/tendcloud/tenddata/at;->c([[D)D

    .line 283
    .line 284
    .line 285
    move-result-wide v3

    .line 286
    mul-double/2addr v1, v3

    .line 287
    add-double/2addr v9, v1

    .line 288
    return-wide v9
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

.method private static c([[D)D
    .locals 24

    const/4 v0, 0x0

    aget-object v1, p0, v0

    aget-wide v2, v1, v0

    const/4 v4, 0x1

    aget-object v5, p0, v4

    aget-wide v6, v5, v4

    mul-double v8, v2, v6

    const/4 v10, 0x2

    aget-object v11, p0, v10

    aget-wide v12, v11, v10

    mul-double/2addr v8, v12

    aget-wide v14, v1, v4

    aget-wide v16, v5, v10

    mul-double v18, v14, v16

    aget-wide v20, v11, v0

    mul-double v18, v18, v20

    add-double v8, v8, v18

    move-wide/from16 v18, v2

    aget-wide v2, v1, v10

    aget-wide v0, v5, v0

    mul-double v22, v2, v0

    aget-wide v4, v11, v4

    mul-double v22, v22, v4

    add-double v8, v8, v22

    neg-double v2, v2

    mul-double/2addr v2, v6

    mul-double v2, v2, v20

    add-double/2addr v8, v2

    mul-double/2addr v14, v0

    mul-double/2addr v14, v12

    sub-double/2addr v8, v14

    mul-double v2, v18, v4

    mul-double v2, v2, v16

    sub-double/2addr v8, v2

    return-wide v8
.end method
