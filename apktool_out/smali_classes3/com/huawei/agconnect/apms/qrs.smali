.class public Lcom/huawei/agconnect/apms/qrs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public abc:Ljava/lang/String;

.field public bcd:Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;

.field public cde:Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;

.field public def:Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;

.field public efg:Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

.field public fgh:Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/rst;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getVersion()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/huawei/agconnect/apms/qrs;->abc:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getApplicationInformation()Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/huawei/agconnect/apms/qrs;->efg:Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    .line 15
    .line 16
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getDeviceInformation()Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/huawei/agconnect/apms/qrs;->bcd:Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;

    .line 21
    .line 22
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getPlatformInformation()Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/huawei/agconnect/apms/qrs;->cde:Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;

    .line 27
    .line 28
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getUserSettingsInformation()Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/huawei/agconnect/apms/qrs;->def:Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;

    .line 33
    .line 34
    new-instance v0, Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;-><init>(Lcom/huawei/agconnect/apms/rst;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lcom/huawei/agconnect/apms/qrs;->fgh:Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;

    .line 40
    .line 41
    return-void
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
.end method


# virtual methods
.method public abc()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/huawei/agconnect/apms/qrs;->fgh:Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;->getAllThreadStack()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lorg/json/JSONArray;

    .line 13
    .line 14
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-ge v3, v4, :cond_0

    .line 23
    .line 24
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Lcom/huawei/agconnect/apms/tuv;

    .line 29
    .line 30
    invoke-virtual {v4}, Lcom/huawei/agconnect/apms/tuv;->asJsonArray()Lorg/json/JSONArray;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 35
    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v1, Lorg/json/JSONArray;

    .line 41
    .line 42
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getRuntimeEnvInformation()Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->asJsonArray()Lorg/json/JSONArray;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 54
    .line 55
    .line 56
    iget-object v3, p0, Lcom/huawei/agconnect/apms/qrs;->fgh:Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;

    .line 57
    .line 58
    invoke-virtual {v3}, Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;->getAnrTimeStamp()J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 63
    .line 64
    .line 65
    iget-object v3, p0, Lcom/huawei/agconnect/apms/qrs;->fgh:Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;

    .line 66
    .line 67
    invoke-virtual {v3}, Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;->getIsRoot()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Z)Lorg/json/JSONArray;

    .line 72
    .line 73
    .line 74
    iget-object v3, p0, Lcom/huawei/agconnect/apms/qrs;->fgh:Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;

    .line 75
    .line 76
    invoke-virtual {v3}, Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;->getParentActivity()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 81
    .line 82
    .line 83
    iget-object v3, p0, Lcom/huawei/agconnect/apms/qrs;->fgh:Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;

    .line 84
    .line 85
    invoke-virtual {v3}, Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;->getLongMsg()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 93
    .line 94
    .line 95
    iget-object v2, p0, Lcom/huawei/agconnect/apms/qrs;->fgh:Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;

    .line 96
    .line 97
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;->getAnrMemInfo()Lcom/huawei/agconnect/apms/stu;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/stu;->asJsonArray()Lorg/json/JSONArray;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 106
    .line 107
    .line 108
    iget-object v2, p0, Lcom/huawei/agconnect/apms/qrs;->fgh:Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;

    .line 109
    .line 110
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/collect/model/event/anr/AnrEvent;->getTracesInfo()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 115
    .line 116
    .line 117
    const-string v2, "anrInfo"

    .line 118
    .line 119
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, Lcom/huawei/agconnect/apms/qrs;->efg:Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    .line 123
    .line 124
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->asJsonArray()Lorg/json/JSONArray;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const-string v2, "applicationInformation"

    .line 133
    .line 134
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    iget-object v1, p0, Lcom/huawei/agconnect/apms/qrs;->cde:Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;

    .line 138
    .line 139
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->asJsonArray()Lorg/json/JSONArray;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    const-string v2, "platformInformation"

    .line 148
    .line 149
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    iget-object v1, p0, Lcom/huawei/agconnect/apms/qrs;->abc:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_1

    .line 159
    .line 160
    const-string v1, ""

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_1
    iget-object v1, p0, Lcom/huawei/agconnect/apms/qrs;->abc:Ljava/lang/String;

    .line 164
    .line 165
    :goto_1
    const-string v2, "agentVersion"

    .line 166
    .line 167
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    iget-object v1, p0, Lcom/huawei/agconnect/apms/qrs;->bcd:Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;

    .line 171
    .line 172
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->asJsonArray()Lorg/json/JSONArray;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    const-string v2, "deviceInformation"

    .line 181
    .line 182
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    iget-object v1, p0, Lcom/huawei/agconnect/apms/qrs;->def:Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;

    .line 186
    .line 187
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;->asJsonArray()Lorg/json/JSONArray;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    const-string v2, "userSettingsInformation"

    .line 196
    .line 197
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    new-instance v1, Lorg/json/JSONObject;

    .line 201
    .line 202
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    return-object v0
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
