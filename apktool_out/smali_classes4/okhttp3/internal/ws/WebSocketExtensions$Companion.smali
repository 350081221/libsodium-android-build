.class public final Lokhttp3/internal/ws/WebSocketExtensions$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/ws/WebSocketExtensions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lokhttp3/internal/ws/WebSocketExtensions$Companion;",
        "",
        "()V",
        "HEADER_WEB_SOCKET_EXTENSION",
        "",
        "parse",
        "Lokhttp3/internal/ws/WebSocketExtensions;",
        "responseHeaders",
        "Lokhttp3/Headers;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Lokhttp3/internal/ws/WebSocketExtensions$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final parse(Lokhttp3/Headers;)Lokhttp3/internal/ws/WebSocketExtensions;
    .locals 20
    .param p1    # Lokhttp3/Headers;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "responseHeaders"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p1 .. p1}, Lokhttp3/Headers;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v10, 0x0

    .line 18
    const/4 v11, 0x0

    .line 19
    :goto_0
    if-ge v4, v1, :cond_13

    .line 20
    .line 21
    invoke-virtual {v0, v4}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    const-string v12, "Sec-WebSocket-Extensions"

    .line 26
    .line 27
    const/4 v13, 0x1

    .line 28
    invoke-static {v5, v12, v13}, Lkotlin/text/v;->K1(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    goto/16 :goto_7

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0, v4}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const/4 v12, 0x0

    .line 41
    :goto_1
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v14

    .line 45
    if-ge v12, v14, :cond_12

    .line 46
    .line 47
    const/16 v15, 0x2c

    .line 48
    .line 49
    const/16 v17, 0x0

    .line 50
    .line 51
    const/16 v18, 0x4

    .line 52
    .line 53
    const/16 v19, 0x0

    .line 54
    .line 55
    move-object v14, v5

    .line 56
    move/from16 v16, v12

    .line 57
    .line 58
    invoke-static/range {v14 .. v19}, Lokhttp3/internal/Util;->delimiterOffset$default(Ljava/lang/String;CIIILjava/lang/Object;)I

    .line 59
    .line 60
    .line 61
    move-result v14

    .line 62
    const/16 v15, 0x3b

    .line 63
    .line 64
    invoke-static {v5, v15, v12, v14}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;CII)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-static {v5, v12, v2}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    add-int/2addr v2, v13

    .line 73
    const-string v3, "permessage-deflate"

    .line 74
    .line 75
    invoke-static {v12, v3, v13}, Lkotlin/text/v;->K1(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_11

    .line 80
    .line 81
    if-eqz v6, :cond_1

    .line 82
    .line 83
    move v11, v13

    .line 84
    :cond_1
    move v12, v2

    .line 85
    :cond_2
    :goto_2
    if-ge v12, v14, :cond_10

    .line 86
    .line 87
    invoke-static {v5, v15, v12, v14}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;CII)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    const/16 v3, 0x3d

    .line 92
    .line 93
    invoke-static {v5, v3, v12, v2}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;CII)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-static {v5, v12, v3}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    if-ge v3, v2, :cond_3

    .line 102
    .line 103
    add-int/lit8 v3, v3, 0x1

    .line 104
    .line 105
    invoke-static {v5, v3, v2}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const-string v12, "\""

    .line 110
    .line 111
    invoke-static {v3, v12}, Lkotlin/text/v;->j4(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    goto :goto_3

    .line 116
    :cond_3
    const/4 v3, 0x0

    .line 117
    :goto_3
    add-int/lit8 v12, v2, 0x1

    .line 118
    .line 119
    const-string v2, "client_max_window_bits"

    .line 120
    .line 121
    invoke-static {v6, v2, v13}, Lkotlin/text/v;->K1(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_6

    .line 126
    .line 127
    if-eqz v7, :cond_4

    .line 128
    .line 129
    move v11, v13

    .line 130
    :cond_4
    if-eqz v3, :cond_5

    .line 131
    .line 132
    invoke-static {v3}, Lkotlin/text/v;->X0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    move-object v7, v2

    .line 137
    goto :goto_4

    .line 138
    :cond_5
    const/4 v7, 0x0

    .line 139
    :goto_4
    if-nez v7, :cond_2

    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_6
    const-string v2, "client_no_context_takeover"

    .line 143
    .line 144
    invoke-static {v6, v2, v13}, Lkotlin/text/v;->K1(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_9

    .line 149
    .line 150
    if-eqz v8, :cond_7

    .line 151
    .line 152
    move v11, v13

    .line 153
    :cond_7
    if-eqz v3, :cond_8

    .line 154
    .line 155
    move v11, v13

    .line 156
    :cond_8
    move v8, v13

    .line 157
    goto :goto_2

    .line 158
    :cond_9
    const-string v2, "server_max_window_bits"

    .line 159
    .line 160
    invoke-static {v6, v2, v13}, Lkotlin/text/v;->K1(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_c

    .line 165
    .line 166
    if-eqz v9, :cond_a

    .line 167
    .line 168
    move v11, v13

    .line 169
    :cond_a
    if-eqz v3, :cond_b

    .line 170
    .line 171
    invoke-static {v3}, Lkotlin/text/v;->X0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    move-object v9, v2

    .line 176
    goto :goto_5

    .line 177
    :cond_b
    const/4 v9, 0x0

    .line 178
    :goto_5
    if-nez v9, :cond_2

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_c
    const-string v2, "server_no_context_takeover"

    .line 182
    .line 183
    invoke-static {v6, v2, v13}, Lkotlin/text/v;->K1(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-eqz v2, :cond_f

    .line 188
    .line 189
    if-eqz v10, :cond_d

    .line 190
    .line 191
    move v11, v13

    .line 192
    :cond_d
    if-eqz v3, :cond_e

    .line 193
    .line 194
    move v11, v13

    .line 195
    :cond_e
    move v10, v13

    .line 196
    goto :goto_2

    .line 197
    :cond_f
    :goto_6
    move v11, v13

    .line 198
    goto :goto_2

    .line 199
    :cond_10
    move v6, v13

    .line 200
    goto/16 :goto_1

    .line 201
    .line 202
    :cond_11
    move v12, v2

    .line 203
    move v11, v13

    .line 204
    goto/16 :goto_1

    .line 205
    .line 206
    :cond_12
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_13
    new-instance v0, Lokhttp3/internal/ws/WebSocketExtensions;

    .line 211
    .line 212
    move-object v5, v0

    .line 213
    invoke-direct/range {v5 .. v11}, Lokhttp3/internal/ws/WebSocketExtensions;-><init>(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V

    .line 214
    .line 215
    .line 216
    return-object v0
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
