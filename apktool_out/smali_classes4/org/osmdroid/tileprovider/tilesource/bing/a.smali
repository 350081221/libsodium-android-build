.class public Lorg/osmdroid/tileprovider/tilesource/bing/a;
.super Lorg/osmdroid/tileprovider/tilesource/QuadTreeTileSource;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/tileprovider/tilesource/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/osmdroid/tileprovider/tilesource/QuadTreeTileSource;",
        "Lorg/osmdroid/tileprovider/tilesource/d<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field private static final f:Ljava/lang/String; = "BING_KEY"

.field public static final g:Ljava/lang/String; = "Aerial"

.field public static final h:Ljava/lang/String; = "AerialWithLabels"

.field public static final i:Ljava/lang/String; = "Road"

.field private static final j:Ljava/lang/String; = ".jpeg"

.field private static final k:Ljava/lang/String; = "https://dev.virtualearth.net/REST/V1/Imagery/Metadata/%s?mapVersion=v1&output=json&uriScheme=https&key=%s"

.field private static l:Ljava/lang/String; = ""


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v1, "BingMaps"

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/16 v3, 0x13

    .line 5
    .line 6
    const/16 v4, 0x100

    .line 7
    .line 8
    const-string v5, ".jpeg"

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    move-object v0, p0

    .line 12
    invoke-direct/range {v0 .. v6}, Lorg/osmdroid/tileprovider/tilesource/QuadTreeTileSource;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "Road"

    .line 16
    .line 17
    iput-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {}, Lorg/osmdroid/tileprovider/tilesource/bing/c;->a()Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 24
    .line 25
    iput-object p1, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->c:Ljava/lang/String;

    .line 26
    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    new-instance p1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, "-"

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->c:Ljava/lang/String;

    .line 66
    .line 67
    :cond_0
    return-void
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

.method public static d()Ljava/lang/String;
    .locals 1

    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->l:Ljava/lang/String;

    return-object v0
.end method

.method private e()Lorg/osmdroid/tileprovider/tilesource/bing/c;
    .locals 10

    .line 1
    const-string v0, "end getMetaData"

    .line 2
    .line 3
    const-string v1, "getMetaData"

    .line 4
    .line 5
    const-string v2, "OsmDroid"

    .line 6
    .line 7
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    new-instance v3, Ljava/net/URL;

    .line 12
    .line 13
    const-string v4, "https://dev.virtualearth.net/REST/V1/Imagery/Metadata/%s?mapVersion=v1&output=json&uriScheme=https&key=%s"

    .line 14
    .line 15
    const/4 v5, 0x2

    .line 16
    new-array v5, v5, [Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v6, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->a:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    aput-object v6, v5, v7

    .line 22
    .line 23
    sget-object v6, Lorg/osmdroid/tileprovider/tilesource/bing/a;->l:Ljava/lang/String;

    .line 24
    .line 25
    const/4 v7, 0x1

    .line 26
    aput-object v6, v5, v7

    .line 27
    .line 28
    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 40
    .line 41
    :try_start_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v5, "make request "

    .line 47
    .line 48
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v5}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v5}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-interface {v4}, Lorg/osmdroid/config/c;->r()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-interface {v5}, Lorg/osmdroid/config/c;->w()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-virtual {v3, v4, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-interface {v4}, Lorg/osmdroid/config/c;->n()Ljava/util/Map;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-eqz v5, :cond_0

    .line 113
    .line 114
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    check-cast v5, Ljava/util/Map$Entry;

    .line 119
    .line 120
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    check-cast v6, Ljava/lang/String;

    .line 125
    .line 126
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v3, v6, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_0
    invoke-virtual {v3}, Ljava/net/URLConnection;->connect()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    const/16 v5, 0xc8

    .line 144
    .line 145
    if-eq v4, v5, :cond_1

    .line 146
    .line 147
    new-instance v4, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    const-string v5, "Cannot get response for url "

    .line 153
    .line 154
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {v5}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v5, " "

    .line 169
    .line 170
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-static {v2, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-object v4, v1

    .line 188
    move-object v5, v4

    .line 189
    move-object v6, v5

    .line 190
    goto :goto_1

    .line 191
    :cond_1
    invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 192
    .line 193
    .line 194
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 195
    :try_start_2
    new-instance v5, Ljava/io/ByteArrayOutputStream;

    .line 196
    .line 197
    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 198
    .line 199
    .line 200
    :try_start_3
    new-instance v6, Ljava/io/BufferedOutputStream;

    .line 201
    .line 202
    const/16 v7, 0x2000

    .line 203
    .line 204
    invoke-direct {v6, v5, v7}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 205
    .line 206
    .line 207
    :try_start_4
    invoke-static {v4, v6}, Lorg/osmdroid/tileprovider/util/StreamUtils;->copy(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    .line 208
    .line 209
    .line 210
    invoke-virtual {v6}, Ljava/io/BufferedOutputStream;->flush()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    invoke-static {v7}, Lorg/osmdroid/tileprovider/tilesource/bing/b;->a(Ljava/lang/String;)Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 218
    .line 219
    .line 220
    move-result-object v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 221
    move-object v9, v4

    .line 222
    move-object v4, v1

    .line 223
    move-object v1, v9

    .line 224
    :goto_1
    :try_start_5
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :catch_0
    move-exception v3

    .line 229
    invoke-static {v2, v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 230
    .line 231
    .line 232
    :goto_2
    if-eqz v1, :cond_2

    .line 233
    .line 234
    :try_start_6
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :catch_1
    move-exception v1

    .line 239
    invoke-static {v2, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 240
    .line 241
    .line 242
    :cond_2
    :goto_3
    if-eqz v5, :cond_3

    .line 243
    .line 244
    :try_start_7
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 245
    .line 246
    .line 247
    goto :goto_4

    .line 248
    :catch_2
    move-exception v1

    .line 249
    invoke-static {v2, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 250
    .line 251
    .line 252
    :cond_3
    :goto_4
    if-eqz v6, :cond_4

    .line 253
    .line 254
    :try_start_8
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    .line 255
    .line 256
    .line 257
    goto :goto_5

    .line 258
    :catch_3
    move-exception v1

    .line 259
    invoke-static {v2, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 260
    .line 261
    .line 262
    :cond_4
    :goto_5
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 263
    .line 264
    .line 265
    move-object v1, v4

    .line 266
    goto/16 :goto_e

    .line 267
    .line 268
    :catchall_0
    move-exception v1

    .line 269
    move-object v9, v3

    .line 270
    move-object v3, v1

    .line 271
    move-object v1, v9

    .line 272
    goto/16 :goto_f

    .line 273
    .line 274
    :catch_4
    move-exception v7

    .line 275
    move-object v9, v5

    .line 276
    move-object v5, v4

    .line 277
    move-object v4, v7

    .line 278
    move-object v7, v6

    .line 279
    goto :goto_6

    .line 280
    :catchall_1
    move-exception v6

    .line 281
    move-object v9, v6

    .line 282
    move-object v6, v1

    .line 283
    move-object v1, v3

    .line 284
    move-object v3, v9

    .line 285
    goto/16 :goto_f

    .line 286
    .line 287
    :catch_5
    move-exception v6

    .line 288
    move-object v7, v1

    .line 289
    move-object v9, v5

    .line 290
    move-object v5, v4

    .line 291
    move-object v4, v6

    .line 292
    :goto_6
    move-object v6, v9

    .line 293
    goto :goto_9

    .line 294
    :catchall_2
    move-exception v5

    .line 295
    move-object v6, v1

    .line 296
    move-object v1, v3

    .line 297
    move-object v3, v5

    .line 298
    move-object v5, v6

    .line 299
    goto/16 :goto_f

    .line 300
    .line 301
    :catch_6
    move-exception v5

    .line 302
    move-object v6, v1

    .line 303
    move-object v7, v6

    .line 304
    move-object v9, v5

    .line 305
    move-object v5, v4

    .line 306
    move-object v4, v9

    .line 307
    goto :goto_9

    .line 308
    :catchall_3
    move-exception v4

    .line 309
    move-object v5, v1

    .line 310
    move-object v6, v5

    .line 311
    move-object v1, v3

    .line 312
    goto :goto_7

    .line 313
    :catch_7
    move-exception v4

    .line 314
    move-object v5, v1

    .line 315
    goto :goto_8

    .line 316
    :catchall_4
    move-exception v4

    .line 317
    move-object v5, v1

    .line 318
    move-object v6, v5

    .line 319
    :goto_7
    move-object v3, v4

    .line 320
    move-object v4, v6

    .line 321
    goto :goto_f

    .line 322
    :catch_8
    move-exception v4

    .line 323
    move-object v3, v1

    .line 324
    move-object v5, v3

    .line 325
    :goto_8
    move-object v6, v5

    .line 326
    move-object v7, v6

    .line 327
    :goto_9
    :try_start_9
    const-string v8, "Error getting imagery meta data"

    .line 328
    .line 329
    invoke-static {v2, v8, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 330
    .line 331
    .line 332
    if-eqz v3, :cond_5

    .line 333
    .line 334
    :try_start_a
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9

    .line 335
    .line 336
    .line 337
    goto :goto_a

    .line 338
    :catch_9
    move-exception v3

    .line 339
    invoke-static {v2, v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 340
    .line 341
    .line 342
    :cond_5
    :goto_a
    if-eqz v5, :cond_6

    .line 343
    .line 344
    :try_start_b
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_a

    .line 345
    .line 346
    .line 347
    goto :goto_b

    .line 348
    :catch_a
    move-exception v3

    .line 349
    invoke-static {v2, v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 350
    .line 351
    .line 352
    :cond_6
    :goto_b
    if-eqz v6, :cond_7

    .line 353
    .line 354
    :try_start_c
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_b

    .line 355
    .line 356
    .line 357
    goto :goto_c

    .line 358
    :catch_b
    move-exception v3

    .line 359
    invoke-static {v2, v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 360
    .line 361
    .line 362
    :cond_7
    :goto_c
    if-eqz v7, :cond_8

    .line 363
    .line 364
    :try_start_d
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_c

    .line 365
    .line 366
    .line 367
    goto :goto_d

    .line 368
    :catch_c
    move-exception v3

    .line 369
    invoke-static {v2, v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 370
    .line 371
    .line 372
    :cond_8
    :goto_d
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 373
    .line 374
    .line 375
    :goto_e
    return-object v1

    .line 376
    :catchall_5
    move-exception v4

    .line 377
    move-object v1, v3

    .line 378
    move-object v3, v4

    .line 379
    move-object v4, v5

    .line 380
    move-object v5, v6

    .line 381
    move-object v6, v7

    .line 382
    :goto_f
    if-eqz v1, :cond_9

    .line 383
    .line 384
    :try_start_e
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_d

    .line 385
    .line 386
    .line 387
    goto :goto_10

    .line 388
    :catch_d
    move-exception v1

    .line 389
    invoke-static {v2, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 390
    .line 391
    .line 392
    :cond_9
    :goto_10
    if-eqz v4, :cond_a

    .line 393
    .line 394
    :try_start_f
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_e

    .line 395
    .line 396
    .line 397
    goto :goto_11

    .line 398
    :catch_e
    move-exception v1

    .line 399
    invoke-static {v2, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 400
    .line 401
    .line 402
    :cond_a
    :goto_11
    if-eqz v5, :cond_b

    .line 403
    .line 404
    :try_start_10
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_f

    .line 405
    .line 406
    .line 407
    goto :goto_12

    .line 408
    :catch_f
    move-exception v1

    .line 409
    invoke-static {v2, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 410
    .line 411
    .line 412
    :cond_b
    :goto_12
    if-eqz v6, :cond_c

    .line 413
    .line 414
    :try_start_11
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_10

    .line 415
    .line 416
    .line 417
    goto :goto_13

    .line 418
    :catch_10
    move-exception v1

    .line 419
    invoke-static {v2, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 420
    .line 421
    .line 422
    :cond_c
    :goto_13
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 423
    .line 424
    .line 425
    throw v3
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
    .line 461
    .line 462
    .line 463
    .line 464
.end method

.method public static h(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "BING_KEY"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lorg/osmdroid/tileprovider/util/ManifestUtil;->retrieveKey(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sput-object p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->l:Ljava/lang/String;

    .line 8
    .line 9
    return-void
    .line 10
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
.end method

.method public static i(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->l:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/tilesource/bing/a;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->a:Ljava/lang/String;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :try_start_0
    iput-object v1, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->e:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v1, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->d:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v1, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    iput-boolean v2, v1, Lorg/osmdroid/tileprovider/tilesource/bing/c;->h:Z

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p1

    .line 27
    :cond_0
    :goto_0
    iput-object p1, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/tilesource/bing/a;->pathBase()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mName:Ljava/lang/String;

    .line 34
    .line 35
    return-void
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
.end method

.method public bridge synthetic c(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public g()Lorg/osmdroid/tileprovider/tilesource/bing/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 2
    .line 3
    iget-boolean v0, v0, Lorg/osmdroid/tileprovider/tilesource/bing/c;->h:Z

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 9
    .line 10
    iget-boolean v0, v0, Lorg/osmdroid/tileprovider/tilesource/bing/c;->h:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Lorg/osmdroid/tileprovider/tilesource/bing/a;->e()Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iput-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 21
    .line 22
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/tilesource/bing/a;->j()V

    .line 23
    .line 24
    .line 25
    :cond_0
    monitor-exit p0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw v0

    .line 30
    :cond_1
    :goto_0
    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 31
    .line 32
    return-object v0
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
.end method

.method public getBaseUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 2
    .line 3
    iget-boolean v0, v0, Lorg/osmdroid/tileprovider/tilesource/bing/c;->h:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/tilesource/bing/a;->g()Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->d:Ljava/lang/String;

    .line 11
    .line 12
    return-object v0
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
.end method

.method public getCopyrightNotice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    iget-object v0, v0, Lorg/osmdroid/tileprovider/tilesource/bing/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getMaximumZoomLevel()I
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    iget v0, v0, Lorg/osmdroid/tileprovider/tilesource/bing/c;->f:I

    return v0
.end method

.method public getMinimumZoomLevel()I
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    iget v0, v0, Lorg/osmdroid/tileprovider/tilesource/bing/c;->g:I

    return v0
.end method

.method public getTileSizePixels()I
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    iget v0, v0, Lorg/osmdroid/tileprovider/tilesource/bing/c;->b:I

    return v0
.end method

.method public getTileURLString(J)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 2
    .line 3
    iget-boolean v0, v0, Lorg/osmdroid/tileprovider/tilesource/bing/c;->h:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/tilesource/bing/a;->g()Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->e:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    new-array v1, v1, [Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/tileprovider/tilesource/QuadTreeTileSource;->quadTree(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    aput-object p1, v1, v2

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
    .line 27
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
.end method

.method protected j()V
    .locals 6

    .line 1
    const-string v0, "updateBaseUrl"

    .line 2
    .line 3
    const-string v1, "OsmDroid"

    .line 4
    .line 5
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 9
    .line 10
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/tilesource/bing/c;->c()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v2, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 15
    .line 16
    iget-object v2, v2, Lorg/osmdroid/tileprovider/tilesource/bing/c;->d:Ljava/lang/String;

    .line 17
    .line 18
    const-string v3, "/"

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-lez v2, :cond_0

    .line 26
    .line 27
    iget-object v4, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 28
    .line 29
    iget-object v4, v4, Lorg/osmdroid/tileprovider/tilesource/bing/c;->d:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v4, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iput-object v2, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->d:Ljava/lang/String;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v2, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 39
    .line 40
    iget-object v2, v2, Lorg/osmdroid/tileprovider/tilesource/bing/c;->d:Ljava/lang/String;

    .line 41
    .line 42
    iput-object v2, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->d:Ljava/lang/String;

    .line 43
    .line 44
    :goto_0
    iget-object v2, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->b:Lorg/osmdroid/tileprovider/tilesource/bing/c;

    .line 45
    .line 46
    iget-object v2, v2, Lorg/osmdroid/tileprovider/tilesource/bing/c;->d:Ljava/lang/String;

    .line 47
    .line 48
    iput-object v2, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->e:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    iget-object v2, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->d:Ljava/lang/String;

    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    new-array v5, v4, [Ljava/lang/Object;

    .line 56
    .line 57
    aput-object v0, v5, v3

    .line 58
    .line 59
    invoke-static {v2, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iput-object v2, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->d:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v2, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->e:Ljava/lang/String;

    .line 66
    .line 67
    const/4 v5, 0x3

    .line 68
    new-array v5, v5, [Ljava/lang/Object;

    .line 69
    .line 70
    aput-object v0, v5, v3

    .line 71
    .line 72
    const-string v0, "%s"

    .line 73
    .line 74
    aput-object v0, v5, v4

    .line 75
    .line 76
    const/4 v0, 0x2

    .line 77
    iget-object v3, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->c:Ljava/lang/String;

    .line 78
    .line 79
    aput-object v3, v5, v0

    .line 80
    .line 81
    invoke-static {v2, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->e:Ljava/lang/String;

    .line 86
    .line 87
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v2, "updated url = "

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object v2, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->e:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    const-string v0, "end updateBaseUrl"

    .line 110
    .line 111
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    return-void
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
    .line 461
    .line 462
    .line 463
    .line 464
.end method

.method public pathBase()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/osmdroid/tileprovider/tilesource/bing/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
