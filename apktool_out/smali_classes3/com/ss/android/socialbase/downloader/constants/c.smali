.class public interface abstract Lcom/ss/android/socialbase/downloader/constants/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;

.field public static final c:[Ljava/lang/String;

.field public static final d:[Ljava/lang/String;

.field public static final e:[Ljava/lang/String;

.field public static final f:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 40

    .line 1
    const-string v0, "_id"

    .line 2
    .line 3
    const-string v1, "url"

    .line 4
    .line 5
    const-string v2, "savePath"

    .line 6
    .line 7
    const-string v3, "tempPath"

    .line 8
    .line 9
    const-string v4, "name"

    .line 10
    .line 11
    const-string v5, "chunkCount"

    .line 12
    .line 13
    const-string v6, "status"

    .line 14
    .line 15
    const-string v7, "curBytes"

    .line 16
    .line 17
    const-string v8, "totalBytes"

    .line 18
    .line 19
    const-string v9, "eTag"

    .line 20
    .line 21
    const-string v10, "onlyWifi"

    .line 22
    .line 23
    const-string v11, "force"

    .line 24
    .line 25
    const-string v12, "retryCount"

    .line 26
    .line 27
    const-string v13, "extra"

    .line 28
    .line 29
    const-string v14, "mimeType"

    .line 30
    .line 31
    const-string v15, "title"

    .line 32
    .line 33
    const-string v16, "notificationEnable"

    .line 34
    .line 35
    const-string v17, "notificationVisibility"

    .line 36
    .line 37
    const-string v18, "isFirstDownload"

    .line 38
    .line 39
    const-string v19, "isFirstSuccess"

    .line 40
    .line 41
    const-string v20, "needHttpsToHttpRetry"

    .line 42
    .line 43
    const-string v21, "downloadTime"

    .line 44
    .line 45
    const-string v22, "packageName"

    .line 46
    .line 47
    const-string v23, "md5"

    .line 48
    .line 49
    const-string v24, "retryDelay"

    .line 50
    .line 51
    const-string v25, "curRetryTime"

    .line 52
    .line 53
    const-string v26, "retryDelayStatus"

    .line 54
    .line 55
    const-string v27, "defaultHttpServiceBackUp"

    .line 56
    .line 57
    const-string v28, "chunkRunnableReuse"

    .line 58
    .line 59
    const-string v29, "retryDelayTimeArray"

    .line 60
    .line 61
    const-string v30, "chunkDowngradeRetry"

    .line 62
    .line 63
    const-string v31, "backUpUrlsStr"

    .line 64
    .line 65
    const-string v32, "backUpUrlRetryCount"

    .line 66
    .line 67
    const-string v33, "realDownloadTime"

    .line 68
    .line 69
    const-string v34, "retryScheduleMinutes"

    .line 70
    .line 71
    const-string v35, "independentProcess"

    .line 72
    .line 73
    const-string v36, "auxiliaryJsonobjectString"

    .line 74
    .line 75
    const-string v37, "iconUrl"

    .line 76
    .line 77
    const-string v38, "appVersionCode"

    .line 78
    .line 79
    const-string v39, "taskId"

    .line 80
    .line 81
    filled-new-array/range {v0 .. v39}, [Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Lcom/ss/android/socialbase/downloader/constants/c;->a:[Ljava/lang/String;

    .line 86
    .line 87
    const-string v0, "_id"

    .line 88
    .line 89
    filled-new-array {v0}, [Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    sput-object v1, Lcom/ss/android/socialbase/downloader/constants/c;->b:[Ljava/lang/String;

    .line 94
    .line 95
    const-string v2, "_id"

    .line 96
    .line 97
    const-string v3, "chunkIndex"

    .line 98
    .line 99
    const-string v4, "startOffset"

    .line 100
    .line 101
    const-string v5, "curOffset"

    .line 102
    .line 103
    const-string v6, "endOffset"

    .line 104
    .line 105
    const-string v7, "chunkContentLen"

    .line 106
    .line 107
    const-string v8, "hostChunkIndex"

    .line 108
    .line 109
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    sput-object v1, Lcom/ss/android/socialbase/downloader/constants/c;->c:[Ljava/lang/String;

    .line 114
    .line 115
    filled-new-array {v0}, [Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    sput-object v1, Lcom/ss/android/socialbase/downloader/constants/c;->d:[Ljava/lang/String;

    .line 120
    .line 121
    const-string v1, "info"

    .line 122
    .line 123
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    sput-object v1, Lcom/ss/android/socialbase/downloader/constants/c;->e:[Ljava/lang/String;

    .line 128
    .line 129
    filled-new-array {v0}, [Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    sput-object v0, Lcom/ss/android/socialbase/downloader/constants/c;->f:[Ljava/lang/String;

    .line 134
    .line 135
    return-void
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
.end method
