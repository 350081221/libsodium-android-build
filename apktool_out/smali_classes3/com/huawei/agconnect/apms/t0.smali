.class public Lcom/huawei/agconnect/apms/t0;
.super Lcom/huawei/agconnect/apms/collect/type/CollectableObject;
.source "SourceFile"


# static fields
.field public static final bcd:Lcom/huawei/agconnect/apms/log/AgentLog;


# instance fields
.field public abc:Lcom/huawei/agconnect/apms/gfe;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/t0;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/agconnect/apms/fed;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/type/CollectableObject;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/fed;->bcd()Lcom/huawei/agconnect/apms/gfe;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/huawei/agconnect/apms/t0;->abc:Lcom/huawei/agconnect/apms/gfe;

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
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
.end method


# virtual methods
.method public final abc()Lorg/json/JSONArray;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/t0;->abc:Lcom/huawei/agconnect/apms/gfe;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lorg/json/JSONArray;

    .line 6
    .line 7
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/huawei/agconnect/apms/gfe;->yza:Ljava/util/List;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Lorg/json/JSONArray;

    .line 16
    .line 17
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    new-instance v2, Lorg/json/JSONArray;

    .line 26
    .line 27
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    :goto_0
    if-ge v3, v1, :cond_3

    .line 32
    .line 33
    new-instance v4, Lorg/json/JSONArray;

    .line 34
    .line 35
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Lcom/huawei/agconnect/apms/o;

    .line 43
    .line 44
    iget-object v6, v5, Lcom/huawei/agconnect/apms/o;->abc:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v6}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 51
    .line 52
    .line 53
    iget-object v6, v5, Lcom/huawei/agconnect/apms/o;->def:Ljava/lang/String;

    .line 54
    .line 55
    if-nez v6, :cond_2

    .line 56
    .line 57
    const-string v6, "null"

    .line 58
    .line 59
    :cond_2
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 60
    .line 61
    .line 62
    iget v6, v5, Lcom/huawei/agconnect/apms/o;->bcd:I

    .line 63
    .line 64
    invoke-static {v6, v4}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 65
    .line 66
    .line 67
    iget v6, v5, Lcom/huawei/agconnect/apms/o;->cde:I

    .line 68
    .line 69
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-static {v6}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Number;)Ljava/lang/Number;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Lcom/huawei/agconnect/apms/o;->abc()Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-static {v5}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 96
    .line 97
    .line 98
    add-int/lit8 v3, v3, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    return-object v2
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public asJsonObject()Lorg/json/JSONObject;
    .locals 7

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "url"

    .line 7
    .line 8
    :try_start_0
    iget-object v2, p0, Lcom/huawei/agconnect/apms/t0;->abc:Lcom/huawei/agconnect/apms/gfe;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    const-string v3, ""

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    move-object v2, v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/gfe;->hij()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :goto_0
    invoke-static {v2}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 25
    .line 26
    .line 27
    const-string v1, "serverIp"

    .line 28
    .line 29
    :try_start_2
    iget-object v2, p0, Lcom/huawei/agconnect/apms/t0;->abc:Lcom/huawei/agconnect/apms/gfe;

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    move-object v2, v3

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/gfe;->fgh()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 39
    :goto_1
    const-string v4, "null"

    .line 40
    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    move-object v2, v4

    .line 44
    :cond_2
    :try_start_3
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 45
    .line 46
    .line 47
    const-string v1, "statusCode"

    .line 48
    .line 49
    :try_start_4
    iget-object v2, p0, Lcom/huawei/agconnect/apms/t0;->abc:Lcom/huawei/agconnect/apms/gfe;

    .line 50
    .line 51
    if-nez v2, :cond_3

    .line 52
    .line 53
    const/4 v2, -0x1

    .line 54
    goto :goto_2

    .line 55
    :cond_3
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/gfe;->ghi()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v2}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Number;)Ljava/lang/Number;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    .line 68
    .line 69
    .line 70
    const-string v1, "errorMsg"

    .line 71
    .line 72
    :try_start_5
    iget-object v2, p0, Lcom/huawei/agconnect/apms/t0;->abc:Lcom/huawei/agconnect/apms/gfe;

    .line 73
    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/gfe;->cde()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    :goto_3
    if-nez v3, :cond_5

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_5
    move-object v4, v3

    .line 85
    :goto_4
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    .line 86
    .line 87
    .line 88
    const-string v1, "bytesReceived"

    .line 89
    .line 90
    :try_start_6
    iget-object v2, p0, Lcom/huawei/agconnect/apms/t0;->abc:Lcom/huawei/agconnect/apms/gfe;

    .line 91
    .line 92
    const-wide/16 v3, -0x1

    .line 93
    .line 94
    if-nez v2, :cond_6

    .line 95
    .line 96
    move-wide v5, v3

    .line 97
    goto :goto_5

    .line 98
    :cond_6
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/gfe;->abc()J

    .line 99
    .line 100
    .line 101
    move-result-wide v5

    .line 102
    :goto_5
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-static {v2}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Number;)Ljava/lang/Number;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    .line 111
    .line 112
    .line 113
    const-string v1, "bytesSent"

    .line 114
    .line 115
    :try_start_7
    iget-object v2, p0, Lcom/huawei/agconnect/apms/t0;->abc:Lcom/huawei/agconnect/apms/gfe;

    .line 116
    .line 117
    if-nez v2, :cond_7

    .line 118
    .line 119
    move-wide v5, v3

    .line 120
    goto :goto_6

    .line 121
    :cond_7
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/gfe;->bcd()J

    .line 122
    .line 123
    .line 124
    move-result-wide v5

    .line 125
    :goto_6
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-static {v2}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Number;)Ljava/lang/Number;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_0

    .line 134
    .line 135
    .line 136
    const-string v1, "dnsArray"

    .line 137
    .line 138
    :try_start_8
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/t0;->abc()Lorg/json/JSONArray;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_0

    .line 143
    .line 144
    .line 145
    const-string v1, "socketArray"

    .line 146
    .line 147
    :try_start_9
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/t0;->bcd()Lorg/json/JSONArray;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_0

    .line 152
    .line 153
    .line 154
    const-string v1, "responseHeaderCost"

    .line 155
    .line 156
    :try_start_a
    iget-object v2, p0, Lcom/huawei/agconnect/apms/t0;->abc:Lcom/huawei/agconnect/apms/gfe;

    .line 157
    .line 158
    if-nez v2, :cond_8

    .line 159
    .line 160
    goto :goto_7

    .line 161
    :cond_8
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/gfe;->def()I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    iget-object v3, p0, Lcom/huawei/agconnect/apms/t0;->abc:Lcom/huawei/agconnect/apms/gfe;

    .line 166
    .line 167
    invoke-virtual {v3}, Lcom/huawei/agconnect/apms/gfe;->efg()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    sub-int/2addr v2, v3

    .line 172
    int-to-long v3, v2

    .line 173
    :goto_7
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-static {v2}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Number;)Ljava/lang/Number;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_0

    .line 182
    .line 183
    .line 184
    goto :goto_8

    .line 185
    :catch_0
    move-exception v1

    .line 186
    sget-object v2, Lcom/huawei/agconnect/apms/t0;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 187
    .line 188
    const-string v3, "asJsonObject "

    .line 189
    .line 190
    invoke-static {v3}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-interface {v2, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    :goto_8
    return-object v0
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

.method public final bcd()Lorg/json/JSONArray;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/t0;->abc:Lcom/huawei/agconnect/apms/gfe;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lorg/json/JSONArray;

    .line 6
    .line 7
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/huawei/agconnect/apms/gfe;->yxw:Ljava/util/List;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Lorg/json/JSONArray;

    .line 16
    .line 17
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    new-instance v2, Lorg/json/JSONArray;

    .line 26
    .line 27
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    :goto_0
    if-ge v3, v1, :cond_6

    .line 32
    .line 33
    new-instance v4, Lorg/json/JSONArray;

    .line 34
    .line 35
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Lcom/huawei/agconnect/apms/p;

    .line 43
    .line 44
    iget-object v6, v5, Lcom/huawei/agconnect/apms/p;->abc:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v6}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 51
    .line 52
    .line 53
    iget v6, v5, Lcom/huawei/agconnect/apms/p;->bcd:I

    .line 54
    .line 55
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-static {v6}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Number;)Ljava/lang/Number;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 64
    .line 65
    .line 66
    iget v6, v5, Lcom/huawei/agconnect/apms/p;->cde:I

    .line 67
    .line 68
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-static {v6}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Number;)Ljava/lang/Number;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 77
    .line 78
    .line 79
    iget v6, v5, Lcom/huawei/agconnect/apms/p;->def:I

    .line 80
    .line 81
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-static {v6}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Number;)Ljava/lang/Number;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 90
    .line 91
    .line 92
    iget v6, v5, Lcom/huawei/agconnect/apms/p;->efg:I

    .line 93
    .line 94
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-static {v6}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Number;)Ljava/lang/Number;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 103
    .line 104
    .line 105
    iget-boolean v6, v5, Lcom/huawei/agconnect/apms/p;->fgh:Z

    .line 106
    .line 107
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-static {v6}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 116
    .line 117
    .line 118
    iget-object v6, v5, Lcom/huawei/agconnect/apms/p;->ghi:Ljava/lang/String;

    .line 119
    .line 120
    const-string v7, "null"

    .line 121
    .line 122
    if-nez v6, :cond_2

    .line 123
    .line 124
    move-object v6, v7

    .line 125
    :cond_2
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 126
    .line 127
    .line 128
    iget-object v6, v5, Lcom/huawei/agconnect/apms/p;->hij:Ljava/lang/String;

    .line 129
    .line 130
    if-nez v6, :cond_3

    .line 131
    .line 132
    move-object v6, v7

    .line 133
    :cond_3
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 134
    .line 135
    .line 136
    iget-object v6, v5, Lcom/huawei/agconnect/apms/p;->ijk:Ljava/lang/String;

    .line 137
    .line 138
    if-nez v6, :cond_4

    .line 139
    .line 140
    move-object v6, v7

    .line 141
    :cond_4
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 142
    .line 143
    .line 144
    iget-boolean v6, v5, Lcom/huawei/agconnect/apms/p;->jkl:Z

    .line 145
    .line 146
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-static {v6}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 155
    .line 156
    .line 157
    iget-object v5, v5, Lcom/huawei/agconnect/apms/p;->klm:Ljava/lang/String;

    .line 158
    .line 159
    if-nez v5, :cond_5

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    move-object v7, v5

    .line 163
    :goto_1
    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 167
    .line 168
    .line 169
    add-int/lit8 v3, v3, 0x1

    .line 170
    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :cond_6
    return-object v2
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
