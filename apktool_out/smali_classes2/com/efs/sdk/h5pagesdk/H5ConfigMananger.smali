.class public Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final TAG:Ljava/lang/String;

.field private final a:I

.field private b:Lcom/efs/sdk/base/EfsReporter;

.field private c:I

.field private d:Z

.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "H5ConfigMananger"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->TAG:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->a:I

    .line 10
    .line 11
    iput v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->c:I

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->d:Z

    .line 14
    .line 15
    iput-object p1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->mContext:Landroid/content/Context;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->b:Lcom/efs/sdk/base/EfsReporter;

    .line 18
    .line 19
    const-string p1, "apm_native_h5perf_sampling_rate"

    .line 20
    .line 21
    filled-new-array {p1}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$1;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$1;-><init>(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p1, v0}, Lcom/efs/sdk/base/EfsReporter;->getAllSdkConfig([Ljava/lang/String;Lcom/efs/sdk/base/observer/IConfigCallback;)V

    .line 31
    .line 32
    .line 33
    return-void
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

.method static synthetic a(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->c:I

    return p0
.end method

.method static synthetic a(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->c:I

    return p1
.end method

.method static synthetic a(I)Z
    .locals 3

    .line 4
    invoke-static {}, Lcom/efs/sdk/base/samplingwhitelist/SamplingWhiteListUtil;->isHitWL()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    if-eqz p0, :cond_2

    const/16 v0, 0x64

    if-ne p0, v0, :cond_1

    return v1

    .line 5
    :cond_1
    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    .line 6
    invoke-virtual {v2, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    if-gt v0, p0, :cond_2

    return v1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic a(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;Z)Z
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->d:Z

    return p1
.end method

.method static synthetic b(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;)Lcom/efs/sdk/base/EfsReporter;
    .locals 0

    iget-object p0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->b:Lcom/efs/sdk/base/EfsReporter;

    return-object p0
.end method


# virtual methods
.method public generateLaunchOptions()Ljava/lang/String;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lcom/efs/sdk/base/integrationtesting/IntegrationTestingUtil;->isIntegrationTestingInPeriod()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    sget-boolean v0, Lcom/efs/sdk/h5pagesdk/H5Manager;->isDebug:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v0, "H5ConfigMananger"

    .line 16
    .line 17
    const-string/jumbo v1, "\u91c7\u6837\u672a\u547d\u4e2d\uff0c\u5e76\u4e14\u4e0d\u5904\u4e8e\u96c6\u6210\u6d4b\u8bd5\u6a21\u5f0f"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    const-string v0, ""

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    new-instance v0, Lorg/json/JSONObject;

    .line 27
    .line 28
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 29
    .line 30
    .line 31
    :try_start_0
    const-string v1, "sample"

    .line 32
    .line 33
    iget v2, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->c:I

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->d:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    const-string v2, "sampleResult"

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    :try_start_1
    const-string v1, "Y"

    .line 45
    .line 46
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const-string v1, "N"

    .line 51
    .line 52
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    :goto_0
    iget-object v1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->mContext:Landroid/content/Context;

    .line 56
    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    const-string v2, "appName"

    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    .line 69
    .line 70
    :cond_3
    const-string v1, "bridgeVersion"

    .line 71
    .line 72
    const/4 v2, 0x1

    .line 73
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catch_0
    move-exception v1

    .line 78
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 79
    .line 80
    .line 81
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0
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
.end method

.method public isH5TracerEnable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->d:Z

    return v0
.end method

.method public sendData(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/efs/sdk/base/integrationtesting/IntegrationTestingUtil;->isIntegrationTestingInPeriod()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;-><init>(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/efs/sdk/h5pagesdk/a;->execute(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
.end method
