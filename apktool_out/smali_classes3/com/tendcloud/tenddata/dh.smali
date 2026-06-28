.class public Lcom/tendcloud/tenddata/dh;
.super Lcom/tendcloud/tenddata/cy;
.source "SourceFile"


# instance fields
.field private a:Lcom/tendcloud/tenddata/ba;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/di;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/cy;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/tendcloud/tenddata/dh;->c:Ljava/lang/String;

    .line 13
    .line 14
    sget-object v0, Lcom/tendcloud/tenddata/dh$1;->$SwitchMap$com$talkingdata$sdk$saf$datamodel$network$TDNetworkType:[I

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    aget p1, v0, p1

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    const-string v1, ":"

    .line 24
    .line 25
    const-string v2, "proxy"

    .line 26
    .line 27
    const-string v3, "current"

    .line 28
    .line 29
    const-string v4, "available"

    .line 30
    .line 31
    const-string v5, "ipv6"

    .line 32
    .line 33
    const-string v6, "ip"

    .line 34
    .line 35
    const-string v7, "connected"

    .line 36
    .line 37
    const-string v8, "type"

    .line 38
    .line 39
    const-string v9, "scannable"

    .line 40
    .line 41
    if-eq p1, v0, :cond_4

    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    if-eq p1, v0, :cond_1

    .line 45
    .line 46
    const/4 v0, 0x3

    .line 47
    if-eq p1, v0, :cond_0

    .line 48
    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :cond_0
    :try_start_0
    sget-object p1, Lcom/tendcloud/tenddata/di;->c:Lcom/tendcloud/tenddata/di;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/di;->a()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0, v8, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_2

    .line 61
    .line 62
    :cond_1
    sget-object p1, Lcom/tendcloud/tenddata/di;->b:Lcom/tendcloud/tenddata/di;

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/di;->a()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p0, v8, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 72
    .line 73
    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->e(Landroid/content/Context;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p0, v4, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 85
    .line 86
    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->j(Landroid/content/Context;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p0, v7, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    const-string p1, "cell_ip"

    .line 98
    .line 99
    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p0, v6, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    const-string p1, "cell_ipv6"

    .line 107
    .line 108
    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p0, v5, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 116
    .line 117
    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->b(Landroid/content/Context;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_2

    .line 122
    .line 123
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 124
    .line 125
    const/4 v0, 0x0

    .line 126
    invoke-static {p1, v0}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;Z)Lorg/json/JSONArray;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p0, v3, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_2
    invoke-static {}, Lcom/tendcloud/tenddata/o;->b()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_3

    .line 138
    .line 139
    new-instance p1, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {p0, v2, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_3
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 169
    .line 170
    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->v(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p0, v9, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    .line 176
    .line 177
    goto/16 :goto_2

    .line 178
    .line 179
    :cond_4
    sget-object p1, Lcom/tendcloud/tenddata/di;->a:Lcom/tendcloud/tenddata/di;

    .line 180
    .line 181
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/di;->a()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p0, v8, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 189
    .line 190
    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->d(Landroid/content/Context;)Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {p0, v4, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 202
    .line 203
    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->i(Landroid/content/Context;)Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-eqz p1, :cond_7

    .line 208
    .line 209
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-virtual {p0, v7, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 215
    .line 216
    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->y(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {p0, v3, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 224
    .line 225
    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->z(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-static {p1}, Lcom/tendcloud/tenddata/dh;->a(Lorg/json/JSONArray;)Lcom/tendcloud/tenddata/ba;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    iget-object v3, p0, Lcom/tendcloud/tenddata/dh;->a:Lcom/tendcloud/tenddata/ba;

    .line 234
    .line 235
    if-nez v3, :cond_5

    .line 236
    .line 237
    invoke-virtual {p0, v9, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    iput-object v0, p0, Lcom/tendcloud/tenddata/dh;->a:Lcom/tendcloud/tenddata/ba;

    .line 241
    .line 242
    goto :goto_0

    .line 243
    :cond_5
    new-instance v3, Lcom/tendcloud/tenddata/bb;

    .line 244
    .line 245
    invoke-direct {v3}, Lcom/tendcloud/tenddata/bb;-><init>()V

    .line 246
    .line 247
    .line 248
    iget-object v4, p0, Lcom/tendcloud/tenddata/dh;->a:Lcom/tendcloud/tenddata/ba;

    .line 249
    .line 250
    invoke-virtual {v3, v4, v0}, Lcom/tendcloud/tenddata/bb;->a(Lcom/tendcloud/tenddata/ba;Lcom/tendcloud/tenddata/ba;)D

    .line 251
    .line 252
    .line 253
    move-result-wide v3

    .line 254
    const-wide v7, 0x3fe999999999999aL    # 0.8

    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    cmpl-double v3, v3, v7

    .line 260
    .line 261
    if-lez v3, :cond_6

    .line 262
    .line 263
    const/4 p1, 0x0

    .line 264
    invoke-virtual {p0, v9, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    goto :goto_0

    .line 268
    :cond_6
    invoke-virtual {p0, v9, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    iput-object v0, p0, Lcom/tendcloud/tenddata/dh;->a:Lcom/tendcloud/tenddata/ba;

    .line 272
    .line 273
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    iput-object p1, p0, Lcom/tendcloud/tenddata/dh;->c:Ljava/lang/String;

    .line 282
    .line 283
    :goto_0
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 284
    .line 285
    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->x(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    const-string v0, "configured"

    .line 290
    .line 291
    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-static {v6}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    invoke-virtual {p0, v6, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    invoke-static {v5}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-virtual {p0, v5, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    goto :goto_1

    .line 309
    :cond_7
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 310
    .line 311
    invoke-virtual {p0, v7, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    :goto_1
    invoke-static {}, Lcom/tendcloud/tenddata/o;->b()Z

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    if-eqz p1, :cond_8

    .line 319
    .line 320
    new-instance p1, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 323
    .line 324
    .line 325
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    invoke-virtual {p0, v2, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    :cond_8
    const-string p1, "scannableFingerId"

    .line 350
    .line 351
    iget-object v0, p0, Lcom/tendcloud/tenddata/dh;->c:Ljava/lang/String;

    .line 352
    .line 353
    invoke-virtual {p0, p1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    :catchall_0
    :goto_2
    return-void
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

.method private static a(Lorg/json/JSONArray;)Lcom/tendcloud/tenddata/ba;
    .locals 10

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge v1, v2, :cond_0

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v9, Lcom/tendcloud/tenddata/ax;

    .line 20
    .line 21
    const-string v3, "name"

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const-string v3, "id"

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const-string v3, "level"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    int-to-byte v6, v2

    .line 40
    const/4 v7, 0x0

    .line 41
    const/4 v8, 0x0

    .line 42
    move-object v3, v9

    .line 43
    invoke-direct/range {v3 .. v8}, Lcom/tendcloud/tenddata/ax;-><init>(Ljava/lang/String;Ljava/lang/String;BBB)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception v2

    .line 51
    invoke-static {v2}, Lcom/tendcloud/tenddata/h;->eForInternal(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    new-instance p0, Lcom/tendcloud/tenddata/ba;

    .line 58
    .line 59
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ba;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/ba;->setBsslist(Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_1
    const/4 p0, 0x0

    .line 67
    :goto_2
    return-object p0
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
