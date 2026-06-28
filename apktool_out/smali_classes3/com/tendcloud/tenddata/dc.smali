.class public Lcom/tendcloud/tenddata/dc;
.super Lcom/tendcloud/tenddata/cy;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/cy;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/tendcloud/tenddata/j;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "tid"

    .line 11
    .line 12
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public a()V
    .locals 11

    .line 1
    const-string v0, "meid5"

    .line 2
    .line 3
    const-string v1, "meid"

    .line 4
    .line 5
    const-string v2, "imei5"

    .line 6
    .line 7
    const-string v3, "imei"

    .line 8
    .line 9
    const-string v4, "serialNo"

    .line 10
    .line 11
    invoke-static {v4}, Lcom/tendcloud/tenddata/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {p0, v4, v5}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v4, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v4}, Lcom/tendcloud/tenddata/l;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const-string v5, "adId"

    .line 25
    .line 26
    invoke-virtual {p0, v5, v4}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    sget-object v4, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 30
    .line 31
    invoke-static {v4}, Lcom/tendcloud/tenddata/o;->A(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    new-instance v5, Lorg/json/JSONArray;

    .line 36
    .line 37
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance v6, Lorg/json/JSONArray;

    .line 41
    .line 42
    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v7, Lorg/json/JSONArray;

    .line 46
    .line 47
    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v8, Lorg/json/JSONArray;

    .line 51
    .line 52
    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    .line 53
    .line 54
    .line 55
    if-eqz v4, :cond_7

    .line 56
    .line 57
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-lez v9, :cond_7

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    invoke-virtual {v4, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-eqz v10, :cond_0

    .line 73
    .line 74
    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    invoke-virtual {v5, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 79
    .line 80
    .line 81
    :cond_0
    invoke-virtual {v9, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-eqz v10, :cond_1

    .line 86
    .line 87
    invoke-virtual {v9, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    invoke-virtual {v6, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 92
    .line 93
    .line 94
    :cond_1
    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-eqz v10, :cond_2

    .line 99
    .line 100
    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    invoke-virtual {v7, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 105
    .line 106
    .line 107
    :cond_2
    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-eqz v10, :cond_3

    .line 112
    .line 113
    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    invoke-virtual {v8, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 118
    .line 119
    .line 120
    :cond_3
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    const/4 v10, 0x2

    .line 125
    if-ne v9, v10, :cond_7

    .line 126
    .line 127
    const/4 v9, 0x1

    .line 128
    invoke-virtual {v4, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-eqz v9, :cond_4

    .line 137
    .line 138
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v5, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 143
    .line 144
    .line 145
    :cond_4
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_5

    .line 150
    .line 151
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v6, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 156
    .line 157
    .line 158
    :cond_5
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_6

    .line 163
    .line 164
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v7, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 169
    .line 170
    .line 171
    :cond_6
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_7

    .line 176
    .line 177
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v8, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 182
    .line 183
    .line 184
    :cond_7
    const-string v0, "imeis"

    .line 185
    .line 186
    invoke-virtual {p0, v0, v5}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    const-string v0, "imeis5"

    .line 190
    .line 191
    invoke-virtual {p0, v0, v6}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    const-string v0, "meids"

    .line 195
    .line 196
    invoke-virtual {p0, v0, v7}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    const-string v0, "meids5"

    .line 200
    .line 201
    invoke-virtual {p0, v0, v8}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    .line 203
    .line 204
    :catch_0
    new-instance v0, Lorg/json/JSONArray;

    .line 205
    .line 206
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 207
    .line 208
    .line 209
    const-string v1, "mac"

    .line 210
    .line 211
    invoke-static {v1}, Lcom/tendcloud/tenddata/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 216
    .line 217
    .line 218
    const-string v1, "wifiMacs"

    .line 219
    .line 220
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    new-instance v0, Lorg/json/JSONArray;

    .line 224
    .line 225
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 226
    .line 227
    .line 228
    const-string v1, "ethMac"

    .line 229
    .line 230
    invoke-static {v1}, Lcom/tendcloud/tenddata/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 235
    .line 236
    .line 237
    const-string v1, "ethMacs"

    .line 238
    .line 239
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    const-string v0, "androidId"

    .line 243
    .line 244
    invoke-static {v0}, Lcom/tendcloud/tenddata/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {p0, v0, v1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-static {}, Lcom/tendcloud/tenddata/df;->a()Lcom/tendcloud/tenddata/df;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    const-string v1, "msaIds"

    .line 260
    .line 261
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    return-void
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
