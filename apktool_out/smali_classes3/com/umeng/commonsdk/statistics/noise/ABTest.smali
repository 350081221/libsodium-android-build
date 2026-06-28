.class public Lcom/umeng/commonsdk/statistics/noise/ABTest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/commonsdk/statistics/internal/d;


# static fields
.field private static instance:Lcom/umeng/commonsdk/statistics/noise/ABTest;


# instance fields
.field private context:Landroid/content/Context;

.field private isInTest:Z

.field private mGroup:I

.field private mInterval:I

.field private mPoli:Ljava/lang/String;

.field private mPolicy:I

.field private mProb07:F

.field private mProb13:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->isInTest:Z

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mPolicy:I

    .line 9
    .line 10
    iput v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mInterval:I

    .line 11
    .line 12
    iput v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mGroup:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mProb13:F

    .line 16
    .line 17
    iput v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mProb07:F

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mPoli:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->context:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {p0, p2, p3}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->onExperimentChanged(Ljava/lang/String;I)V

    .line 25
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
.end method

.method public static declared-synchronized getService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/noise/ABTest;
    .locals 4

    .line 1
    const-class v0, Lcom/umeng/commonsdk/statistics/noise/ABTest;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/umeng/commonsdk/statistics/noise/ABTest;->instance:Lcom/umeng/commonsdk/statistics/noise/ABTest;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string v1, "client_test"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {p0, v1, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "test_report_interval"

    .line 16
    .line 17
    const-string v3, "0"

    .line 18
    .line 19
    invoke-static {p0, v2, v3}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    new-instance v3, Lcom/umeng/commonsdk/statistics/noise/ABTest;

    .line 32
    .line 33
    invoke-direct {v3, p0, v1, v2}, Lcom/umeng/commonsdk/statistics/noise/ABTest;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    sput-object v3, Lcom/umeng/commonsdk/statistics/noise/ABTest;->instance:Lcom/umeng/commonsdk/statistics/noise/ABTest;

    .line 37
    .line 38
    :cond_0
    sget-object p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->instance:Lcom/umeng/commonsdk/statistics/noise/ABTest;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    monitor-exit v0

    .line 41
    return-object p0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    monitor-exit v0

    .line 44
    throw p0
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

.method private parseFIXED(Ljava/lang/String;)V
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string v0, "\\|"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x2

    .line 11
    aget-object v0, p1, v0

    .line 12
    .line 13
    const-string v1, "SIG13"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    aget-object v0, p1, v0

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :goto_0
    iget v1, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mProb13:F

    .line 35
    .line 36
    cmpl-float v0, v1, v0

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    if-lez v0, :cond_2

    .line 40
    .line 41
    iput-boolean v1, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->isInTest:Z

    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    aget-object v0, p1, v1

    .line 45
    .line 46
    const-string v2, "FIXED"

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v2, -0x1

    .line 53
    const/4 v3, 0x1

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    aget-object v0, p1, v3

    .line 57
    .line 58
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    move v0, v2

    .line 68
    :goto_1
    const/4 v4, 0x4

    .line 69
    aget-object v5, p1, v4

    .line 70
    .line 71
    const-string v6, "RPT"

    .line 72
    .line 73
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    const-string v7, ","

    .line 78
    .line 79
    const/4 v8, 0x5

    .line 80
    if-eqz v5, :cond_4

    .line 81
    .line 82
    iput-object v6, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mPoli:Ljava/lang/String;

    .line 83
    .line 84
    aget-object p1, p1, v8

    .line 85
    .line 86
    invoke-virtual {p1, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    array-length v4, p1

    .line 91
    new-array v4, v4, [I

    .line 92
    .line 93
    move v5, v1

    .line 94
    :goto_2
    array-length v6, p1

    .line 95
    if-ge v5, v6, :cond_6

    .line 96
    .line 97
    aget-object v6, p1, v5

    .line 98
    .line 99
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    aput v6, v4, v5

    .line 108
    .line 109
    add-int/lit8 v5, v5, 0x1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    aget-object v4, p1, v4

    .line 113
    .line 114
    const-string v5, "DOM"

    .line 115
    .line 116
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    const/4 v6, 0x0

    .line 121
    if-eqz v4, :cond_5

    .line 122
    .line 123
    iput-object v5, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mPoli:Ljava/lang/String;

    .line 124
    .line 125
    iput-boolean v3, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->isInTest:Z

    .line 126
    .line 127
    :try_start_0
    aget-object p1, p1, v8

    .line 128
    .line 129
    invoke-virtual {p1, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    array-length v4, p1

    .line 134
    new-array v4, v4, [I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    .line 136
    move v5, v1

    .line 137
    :goto_3
    :try_start_1
    array-length v6, p1

    .line 138
    if-ge v5, v6, :cond_6

    .line 139
    .line 140
    aget-object v6, p1, v5

    .line 141
    .line 142
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    aput v6, v4, v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 151
    .line 152
    add-int/lit8 v5, v5, 0x1

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :catch_0
    :cond_5
    move-object v4, v6

    .line 156
    :catch_1
    :cond_6
    if-eq v0, v2, :cond_7

    .line 157
    .line 158
    iput-boolean v3, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->isInTest:Z

    .line 159
    .line 160
    iput v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mGroup:I

    .line 161
    .line 162
    if-eqz v4, :cond_8

    .line 163
    .line 164
    sub-int/2addr v0, v3

    .line 165
    aget p1, v4, v0

    .line 166
    .line 167
    iput p1, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mPolicy:I

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_7
    iput-boolean v1, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->isInTest:Z

    .line 171
    .line 172
    :cond_8
    :goto_4
    return-void
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

.method private parseSig7(Ljava/lang/String;)V
    .locals 10

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string v0, "\\|"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x2

    .line 11
    aget-object v0, p1, v0

    .line 12
    .line 13
    const-string v1, "SIG13"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    aget-object v0, p1, v0

    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v0, v1

    .line 35
    :goto_0
    iget v2, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mProb13:F

    .line 36
    .line 37
    cmpl-float v0, v2, v0

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    if-lez v0, :cond_2

    .line 41
    .line 42
    iput-boolean v2, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->isInTest:Z

    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    aget-object v0, p1, v2

    .line 46
    .line 47
    const-string v3, "SIG7"

    .line 48
    .line 49
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v3, 0x0

    .line 54
    const-string v4, ","

    .line 55
    .line 56
    const/4 v5, 0x1

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    aget-object v0, p1, v5

    .line 60
    .line 61
    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    array-length v6, v0

    .line 66
    new-array v6, v6, [F

    .line 67
    .line 68
    move v7, v2

    .line 69
    :goto_1
    array-length v8, v0

    .line 70
    if-ge v7, v8, :cond_4

    .line 71
    .line 72
    aget-object v8, v0, v7

    .line 73
    .line 74
    invoke-static {v8}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    aput v8, v6, v7

    .line 83
    .line 84
    add-int/lit8 v7, v7, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move-object v6, v3

    .line 88
    :cond_4
    const/4 v0, 0x4

    .line 89
    aget-object v7, p1, v0

    .line 90
    .line 91
    const-string v8, "RPT"

    .line 92
    .line 93
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    const/4 v9, 0x5

    .line 98
    if-eqz v7, :cond_5

    .line 99
    .line 100
    iput-object v8, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mPoli:Ljava/lang/String;

    .line 101
    .line 102
    aget-object p1, p1, v9

    .line 103
    .line 104
    invoke-virtual {p1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    array-length v0, p1

    .line 109
    new-array v3, v0, [I

    .line 110
    .line 111
    move v0, v2

    .line 112
    :goto_2
    array-length v4, p1

    .line 113
    if-ge v0, v4, :cond_6

    .line 114
    .line 115
    aget-object v4, p1, v0

    .line 116
    .line 117
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    aput v4, v3, v0

    .line 126
    .line 127
    add-int/lit8 v0, v0, 0x1

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    aget-object v0, p1, v0

    .line 131
    .line 132
    const-string v7, "DOM"

    .line 133
    .line 134
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_6

    .line 139
    .line 140
    iput-boolean v5, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->isInTest:Z

    .line 141
    .line 142
    iput-object v7, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mPoli:Ljava/lang/String;

    .line 143
    .line 144
    :try_start_0
    aget-object p1, p1, v9

    .line 145
    .line 146
    invoke-virtual {p1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    array-length v0, p1

    .line 151
    new-array v3, v0, [I

    .line 152
    .line 153
    move v0, v2

    .line 154
    :goto_3
    array-length v4, p1

    .line 155
    if-ge v0, v4, :cond_6

    .line 156
    .line 157
    aget-object v4, p1, v0

    .line 158
    .line 159
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    aput v4, v3, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    .line 169
    add-int/lit8 v0, v0, 0x1

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :catch_0
    :cond_6
    move p1, v2

    .line 173
    :goto_4
    array-length v0, v6

    .line 174
    const/4 v4, -0x1

    .line 175
    if-ge p1, v0, :cond_8

    .line 176
    .line 177
    aget v0, v6, p1

    .line 178
    .line 179
    add-float/2addr v1, v0

    .line 180
    iget v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mProb07:F

    .line 181
    .line 182
    cmpg-float v0, v0, v1

    .line 183
    .line 184
    if-gez v0, :cond_7

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_7
    add-int/lit8 p1, p1, 0x1

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_8
    move p1, v4

    .line 191
    :goto_5
    if-eq p1, v4, :cond_9

    .line 192
    .line 193
    iput-boolean v5, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->isInTest:Z

    .line 194
    .line 195
    add-int/lit8 v0, p1, 0x1

    .line 196
    .line 197
    iput v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mGroup:I

    .line 198
    .line 199
    if-eqz v3, :cond_a

    .line 200
    .line 201
    aget p1, v3, p1

    .line 202
    .line 203
    iput p1, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mPolicy:I

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_9
    iput-boolean v2, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->isInTest:Z

    .line 207
    .line 208
    :cond_a
    :goto_6
    return-void
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

.method private prob(Ljava/lang/String;I)F
    .locals 1

    mul-int/lit8 p2, p2, 0x2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    add-int/lit8 v0, p2, 0x5

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0x10

    invoke-static {p1, p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-float p1, p1

    const/high16 p2, 0x49800000    # 1048576.0f

    div-float/2addr p1, p2

    return p1
.end method

.method public static validate(Ljava/lang/String;)Z
    .locals 6

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const-string v0, "\\|"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    array-length v0, p0

    .line 16
    const/4 v2, 0x6

    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    aget-object v0, p0, v1

    .line 21
    .line 22
    const-string v2, "SIG7"

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v2, 0x5

    .line 29
    const-string v3, ","

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    aget-object v0, p0, v4

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    array-length v0, v0

    .line 41
    aget-object v5, p0, v2

    .line 42
    .line 43
    invoke-virtual {v5, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    array-length v5, v5

    .line 48
    if-ne v0, v5, :cond_2

    .line 49
    .line 50
    return v4

    .line 51
    :cond_2
    aget-object v0, p0, v1

    .line 52
    .line 53
    const-string v5, "FIXED"

    .line 54
    .line 55
    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    aget-object v0, p0, v2

    .line 62
    .line 63
    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    array-length v0, v0

    .line 68
    aget-object p0, p0, v4

    .line 69
    .line 70
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-lt v0, p0, :cond_3

    .line 75
    .line 76
    if-lt p0, v4, :cond_3

    .line 77
    .line 78
    return v4

    .line 79
    :cond_3
    return v1
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method


# virtual methods
.method public getGroup()I
    .locals 1

    iget v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mGroup:I

    return v0
.end method

.method public getGroupInfo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->isInTest:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "error"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mGroup:I

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getTestInterval()I
    .locals 1

    iget v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mInterval:I

    return v0
.end method

.method public getTestName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mPoli:Ljava/lang/String;

    return-object v0
.end method

.method public getTestPolicy()I
    .locals 1

    iget v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mPolicy:I

    return v0
.end method

.method public isInTest()Z
    .locals 1

    iget-boolean v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->isInTest:Z

    return v0
.end method

.method public onExperimentChanged(Ljava/lang/String;I)V
    .locals 2

    .line 1
    iput p2, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mInterval:I

    .line 2
    .line 3
    iget-object p2, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->context:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {p2}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->getSignature(Landroid/content/Context;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const/16 v0, 0xc

    .line 24
    .line 25
    :try_start_0
    invoke-direct {p0, p2, v0}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->prob(Ljava/lang/String;I)F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mProb13:F

    .line 30
    .line 31
    const/4 v0, 0x6

    .line 32
    invoke-direct {p0, p2, v0}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->prob(Ljava/lang/String;I)F

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    iput p2, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mProb07:F

    .line 37
    .line 38
    const-string p2, "SIG7"

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->parseSig7(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const-string p2, "FIXED"

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->parseFIXED(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_0
    move-exception p2

    .line 63
    iput-boolean v1, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->isInTest:Z

    .line 64
    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v1, "v:"

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/statistics/common/MLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    :goto_0
    return-void

    .line 86
    :cond_3
    :goto_1
    iput-boolean v1, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->isInTest:Z

    .line 87
    .line 88
    return-void
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
.end method

.method public onImprintChanged(Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;)V
    .locals 3

    .line 1
    const-string v0, "client_test"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "test_report_interval"

    .line 9
    .line 10
    const-string v2, "0"

    .line 11
    .line 12
    invoke-virtual {p1, v1, v2}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0, v0, p1}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->onExperimentChanged(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, " p13:"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mProb13:F

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, " p07:"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget v1, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mProb07:F

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, " policy:"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget v1, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mPolicy:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, " interval:"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget v1, p0, Lcom/umeng/commonsdk/statistics/noise/ABTest;->mInterval:I

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
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
