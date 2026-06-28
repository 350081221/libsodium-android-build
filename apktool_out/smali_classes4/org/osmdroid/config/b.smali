.class public Lorg/osmdroid/config/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/config/c;


# static fields
.field public static final G:Ljava/lang/String; = "osmdroid"


# instance fields
.field protected A:J

.field protected B:I

.field protected C:J

.field protected D:Z

.field protected E:Z

.field private F:Ljava/lang/String;

.field protected a:J

.field protected b:Z

.field protected c:Z

.field protected d:Z

.field protected e:Z

.field protected f:Z

.field protected g:Ljava/lang/String;

.field protected h:Ljava/lang/String;

.field private final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected j:S

.field protected k:S

.field protected l:S

.field protected m:S

.field protected n:S

.field protected o:J

.field protected p:J

.field protected q:Ljava/text/SimpleDateFormat;

.field protected r:Ljava/io/File;

.field protected s:Ljava/io/File;

.field protected t:J

.field protected u:Ljava/lang/Long;

.field protected v:Ljava/net/Proxy;

.field protected w:I

.field protected x:I

.field protected y:Z

.field protected z:S


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x4e20

    .line 5
    .line 6
    iput-wide v0, p0, Lorg/osmdroid/config/b;->a:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lorg/osmdroid/config/b;->b:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lorg/osmdroid/config/b;->c:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lorg/osmdroid/config/b;->d:Z

    .line 14
    .line 15
    iput-boolean v0, p0, Lorg/osmdroid/config/b;->e:Z

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput-boolean v1, p0, Lorg/osmdroid/config/b;->f:Z

    .line 19
    .line 20
    const-string v2, "osmdroid"

    .line 21
    .line 22
    iput-object v2, p0, Lorg/osmdroid/config/b;->g:Ljava/lang/String;

    .line 23
    .line 24
    const-string v2, "User-Agent"

    .line 25
    .line 26
    iput-object v2, p0, Lorg/osmdroid/config/b;->h:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v2, Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Lorg/osmdroid/config/b;->i:Ljava/util/Map;

    .line 34
    .line 35
    const/16 v2, 0x9

    .line 36
    .line 37
    iput-short v2, p0, Lorg/osmdroid/config/b;->j:S

    .line 38
    .line 39
    const/4 v2, 0x2

    .line 40
    iput-short v2, p0, Lorg/osmdroid/config/b;->k:S

    .line 41
    .line 42
    const/16 v2, 0x8

    .line 43
    .line 44
    iput-short v2, p0, Lorg/osmdroid/config/b;->l:S

    .line 45
    .line 46
    const/16 v2, 0x28

    .line 47
    .line 48
    iput-short v2, p0, Lorg/osmdroid/config/b;->m:S

    .line 49
    .line 50
    iput-short v2, p0, Lorg/osmdroid/config/b;->n:S

    .line 51
    .line 52
    const-wide/32 v2, 0x25800000

    .line 53
    .line 54
    .line 55
    iput-wide v2, p0, Lorg/osmdroid/config/b;->o:J

    .line 56
    .line 57
    const-wide/32 v2, 0x1f400000

    .line 58
    .line 59
    .line 60
    iput-wide v2, p0, Lorg/osmdroid/config/b;->p:J

    .line 61
    .line 62
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 63
    .line 64
    const-string v3, "EEE, dd MMM yyyy HH:mm:ss z"

    .line 65
    .line 66
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 67
    .line 68
    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 69
    .line 70
    .line 71
    iput-object v2, p0, Lorg/osmdroid/config/b;->q:Ljava/text/SimpleDateFormat;

    .line 72
    .line 73
    const-wide/16 v2, 0x0

    .line 74
    .line 75
    iput-wide v2, p0, Lorg/osmdroid/config/b;->t:J

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    iput-object v2, p0, Lorg/osmdroid/config/b;->u:Ljava/lang/Long;

    .line 79
    .line 80
    iput-object v2, p0, Lorg/osmdroid/config/b;->v:Ljava/net/Proxy;

    .line 81
    .line 82
    const/16 v2, 0x3e8

    .line 83
    .line 84
    iput v2, p0, Lorg/osmdroid/config/b;->w:I

    .line 85
    .line 86
    const/16 v2, 0x1f4

    .line 87
    .line 88
    iput v2, p0, Lorg/osmdroid/config/b;->x:I

    .line 89
    .line 90
    iput-boolean v1, p0, Lorg/osmdroid/config/b;->y:Z

    .line 91
    .line 92
    iput-short v0, p0, Lorg/osmdroid/config/b;->z:S

    .line 93
    .line 94
    const-wide/32 v2, 0x493e0

    .line 95
    .line 96
    .line 97
    iput-wide v2, p0, Lorg/osmdroid/config/b;->A:J

    .line 98
    .line 99
    const/16 v2, 0x14

    .line 100
    .line 101
    iput v2, p0, Lorg/osmdroid/config/b;->B:I

    .line 102
    .line 103
    const-wide/16 v2, 0x1f4

    .line 104
    .line 105
    iput-wide v2, p0, Lorg/osmdroid/config/b;->C:J

    .line 106
    .line 107
    iput-boolean v1, p0, Lorg/osmdroid/config/b;->D:Z

    .line 108
    .line 109
    iput-boolean v0, p0, Lorg/osmdroid/config/b;->E:Z

    .line 110
    .line 111
    return-void
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

.method private static o0(Landroid/content/SharedPreferences$Editor;)V
    .locals 0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private p0(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/16 v1, 0x80

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, "/"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    return-object p1

    .line 42
    :catch_0
    return-object v0
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

.method private static q0(Landroid/content/SharedPreferences;Ljava/util/Map;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/SharedPreferences;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_2

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-interface {p0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    :goto_1
    return-void
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
.end method

.method private static r0(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences$Editor;Ljava/util/Map;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/SharedPreferences;",
            "Landroid/content/SharedPreferences$Editor;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-interface {p1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_2

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Ljava/util/Map$Entry;

    .line 54
    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    check-cast p2, Ljava/lang/String;

    .line 81
    .line 82
    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    return-void
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
.end method


# virtual methods
.method public A(S)V
    .locals 0

    iput-short p1, p0, Lorg/osmdroid/config/b;->m:S

    return-void
.end method

.method public B()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/config/b;->f:Z

    return v0
.end method

.method public C()S
    .locals 1

    iget-short v0, p0, Lorg/osmdroid/config/b;->j:S

    return v0
.end method

.method public D(Ljava/text/SimpleDateFormat;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/config/b;->q:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public E()Ljava/net/Proxy;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/config/b;->v:Ljava/net/Proxy;

    return-object v0
.end method

.method public F(J)V
    .locals 0

    iput-wide p1, p0, Lorg/osmdroid/config/b;->C:J

    return-void
.end method

.method public G(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/config/b;->D:Z

    return-void
.end method

.method public H(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/config/b;->s:Ljava/io/File;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/io/File;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->m(Landroid/content/Context;)Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v1, "tiles"

    .line 12
    .line 13
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lorg/osmdroid/config/b;->s:Ljava/io/File;

    .line 17
    .line 18
    :cond_0
    :try_start_0
    iget-object p1, p0, Lorg/osmdroid/config/b;->s:Ljava/io/File;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception p1

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v1, "Unable to create tile cache path at "

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lorg/osmdroid/config/b;->s:Ljava/io/File;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "OsmDroid"

    .line 45
    .line 46
    invoke-static {v1, v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 47
    .line 48
    .line 49
    :goto_0
    iget-object p1, p0, Lorg/osmdroid/config/b;->s:Ljava/io/File;

    .line 50
    .line 51
    return-object p1
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public I()J
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/config/b;->p:J

    return-wide v0
.end method

.method public J()S
    .locals 1

    iget-short v0, p0, Lorg/osmdroid/config/b;->k:S

    return v0
.end method

.method public K(J)V
    .locals 0

    iput-wide p1, p0, Lorg/osmdroid/config/b;->p:J

    return-void
.end method

.method public L(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/config/b;->c:Z

    return-void
.end method

.method public M()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/config/b;->b:Z

    return v0
.end method

.method public N()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/config/b;->w:I

    return v0
.end method

.method public O()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/config/b;->E:Z

    return v0
.end method

.method public P()J
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/config/b;->A:J

    return-wide v0
.end method

.method public Q(I)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/config/b;->x:I

    return-void
.end method

.method public R(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/config/b;->f:Z

    return-void
.end method

.method public S(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/config/b;->g:Ljava/lang/String;

    return-void
.end method

.method public T()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/config/b;->D:Z

    return v0
.end method

.method public U()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/config/b;->c:Z

    return v0
.end method

.method public V(J)V
    .locals 0

    iput-wide p1, p0, Lorg/osmdroid/config/b;->a:J

    return-void
.end method

.method public W()S
    .locals 1

    iget-short v0, p0, Lorg/osmdroid/config/b;->z:S

    return v0
.end method

.method public X(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/config/b;->b:Z

    return-void
.end method

.method public Y(S)V
    .locals 0

    iput-short p1, p0, Lorg/osmdroid/config/b;->k:S

    return-void
.end method

.method public Z(Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/config/b;->s:Ljava/io/File;

    return-void
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/config/b;->y:Z

    return v0
.end method

.method public a0()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/config/b;->x:I

    return v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/config/b;->w:I

    return-void
.end method

.method public b0(J)V
    .locals 0

    iput-wide p1, p0, Lorg/osmdroid/config/b;->o:J

    return-void
.end method

.method public c()S
    .locals 1

    iget-short v0, p0, Lorg/osmdroid/config/b;->m:S

    return v0
.end method

.method public c0(J)V
    .locals 0

    iput-wide p1, p0, Lorg/osmdroid/config/b;->A:J

    return-void
.end method

.method public d(S)V
    .locals 0

    iput-short p1, p0, Lorg/osmdroid/config/b;->l:S

    return-void
.end method

.method public d0(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/config/b;->E:Z

    return-void
.end method

.method public e()S
    .locals 1

    iget-short v0, p0, Lorg/osmdroid/config/b;->n:S

    return v0
.end method

.method public e0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/config/b;->h:Ljava/lang/String;

    return-void
.end method

.method public f()Ljava/io/File;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/osmdroid/config/b;->H(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public f0(S)V
    .locals 0

    iput-short p1, p0, Lorg/osmdroid/config/b;->j:S

    return-void
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/config/b;->C:J

    return-wide v0
.end method

.method public g0()J
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/config/b;->t:J

    return-wide v0
.end method

.method public h(S)V
    .locals 0

    iput-short p1, p0, Lorg/osmdroid/config/b;->z:S

    return-void
.end method

.method public h0()S
    .locals 1

    iget-short v0, p0, Lorg/osmdroid/config/b;->l:S

    return v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/config/b;->o:J

    return-wide v0
.end method

.method public i0()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/config/b;->u:Ljava/lang/Long;

    return-object v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/config/b;->B:I

    return v0
.end method

.method public j0(I)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/config/b;->B:I

    return-void
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/config/b;->d:Z

    return v0
.end method

.method public k0(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/config/b;->e:Z

    return-void
.end method

.method public l(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/config/b;->d:Z

    return-void
.end method

.method public l0(Landroid/content/Context;Landroid/content/SharedPreferences;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Lorg/osmdroid/config/b;->p0(Landroid/content/Context;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lorg/osmdroid/config/b;->F:Ljava/lang/String;

    .line 6
    .line 7
    const-string v0, "osmdroid.basePath"

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "osmdroid.cachePath"

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    new-instance v4, Ljava/io/File;

    .line 19
    .line 20
    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_0
    new-instance v2, Ljava/io/File;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->m(Landroid/content/Context;)Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-interface {p2, v0, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v2}, Lorg/osmdroid/config/b;->o(Ljava/io/File;)V

    .line 49
    .line 50
    .line 51
    new-instance v0, Ljava/io/File;

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->H(Landroid/content/Context;)Ljava/io/File;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-interface {p2, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lorg/osmdroid/config/b;->Z(Ljava/io/File;)V

    .line 69
    .line 70
    .line 71
    const-string v0, "osmdroid.DebugMode"

    .line 72
    .line 73
    iget-boolean v2, p0, Lorg/osmdroid/config/b;->b:Z

    .line 74
    .line 75
    invoke-interface {p2, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {p0, v0}, Lorg/osmdroid/config/b;->X(Z)V

    .line 80
    .line 81
    .line 82
    const-string v0, "osmdroid.DebugDownloading"

    .line 83
    .line 84
    iget-boolean v2, p0, Lorg/osmdroid/config/b;->e:Z

    .line 85
    .line 86
    invoke-interface {p2, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-virtual {p0, v0}, Lorg/osmdroid/config/b;->k0(Z)V

    .line 91
    .line 92
    .line 93
    const-string v0, "osmdroid.DebugMapView"

    .line 94
    .line 95
    iget-boolean v2, p0, Lorg/osmdroid/config/b;->c:Z

    .line 96
    .line 97
    invoke-interface {p2, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-virtual {p0, v0}, Lorg/osmdroid/config/b;->L(Z)V

    .line 102
    .line 103
    .line 104
    const-string v0, "osmdroid.DebugTileProvider"

    .line 105
    .line 106
    iget-boolean v2, p0, Lorg/osmdroid/config/b;->d:Z

    .line 107
    .line 108
    invoke-interface {p2, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-virtual {p0, v0}, Lorg/osmdroid/config/b;->l(Z)V

    .line 113
    .line 114
    .line 115
    const-string v0, "osmdroid.HardwareAcceleration"

    .line 116
    .line 117
    iget-boolean v2, p0, Lorg/osmdroid/config/b;->f:Z

    .line 118
    .line 119
    invoke-interface {p2, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-virtual {p0, v0}, Lorg/osmdroid/config/b;->R(Z)V

    .line 124
    .line 125
    .line 126
    const-string v0, "osmdroid.userAgentValue"

    .line 127
    .line 128
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-interface {p2, v0, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->S(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-object p1, p0, Lorg/osmdroid/config/b;->i:Ljava/util/Map;

    .line 140
    .line 141
    const-string v0, "osmdroid.additionalHttpRequestProperty."

    .line 142
    .line 143
    invoke-static {p2, p1, v0}, Lorg/osmdroid/config/b;->q0(Landroid/content/SharedPreferences;Ljava/util/Map;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    const-string p1, "osmdroid.gpsWaitTime"

    .line 147
    .line 148
    iget-wide v2, p0, Lorg/osmdroid/config/b;->a:J

    .line 149
    .line 150
    invoke-interface {p2, p1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 151
    .line 152
    .line 153
    move-result-wide v2

    .line 154
    invoke-virtual {p0, v2, v3}, Lorg/osmdroid/config/b;->V(J)V

    .line 155
    .line 156
    .line 157
    const-string p1, "osmdroid.tileDownloadThreads"

    .line 158
    .line 159
    iget-short v0, p0, Lorg/osmdroid/config/b;->k:S

    .line 160
    .line 161
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    int-to-short p1, p1

    .line 166
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->Y(S)V

    .line 167
    .line 168
    .line 169
    const-string p1, "osmdroid.tileFileSystemThreads"

    .line 170
    .line 171
    iget-short v0, p0, Lorg/osmdroid/config/b;->l:S

    .line 172
    .line 173
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    int-to-short p1, p1

    .line 178
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->d(S)V

    .line 179
    .line 180
    .line 181
    const-string p1, "osmdroid.tileDownloadMaxQueueSize"

    .line 182
    .line 183
    iget-short v0, p0, Lorg/osmdroid/config/b;->m:S

    .line 184
    .line 185
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    int-to-short p1, p1

    .line 190
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->A(S)V

    .line 191
    .line 192
    .line 193
    const-string p1, "osmdroid.tileFileSystemMaxQueueSize"

    .line 194
    .line 195
    iget-short v0, p0, Lorg/osmdroid/config/b;->n:S

    .line 196
    .line 197
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 198
    .line 199
    .line 200
    move-result p1

    .line 201
    int-to-short p1, p1

    .line 202
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->y(S)V

    .line 203
    .line 204
    .line 205
    const-string p1, "osmdroid.ExpirationExtendedDuration"

    .line 206
    .line 207
    iget-wide v2, p0, Lorg/osmdroid/config/b;->t:J

    .line 208
    .line 209
    invoke-interface {p2, p1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 210
    .line 211
    .line 212
    move-result-wide v2

    .line 213
    invoke-virtual {p0, v2, v3}, Lorg/osmdroid/config/b;->x(J)V

    .line 214
    .line 215
    .line 216
    const-string p1, "osmdroid.mapViewRecycler"

    .line 217
    .line 218
    iget-boolean v0, p0, Lorg/osmdroid/config/b;->y:Z

    .line 219
    .line 220
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->t(Z)V

    .line 225
    .line 226
    .line 227
    const-string p1, "osmdroid.ZoomSpeedDefault"

    .line 228
    .line 229
    iget v0, p0, Lorg/osmdroid/config/b;->w:I

    .line 230
    .line 231
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->b(I)V

    .line 236
    .line 237
    .line 238
    const-string p1, "osmdroid.animationSpeedShort"

    .line 239
    .line 240
    iget v0, p0, Lorg/osmdroid/config/b;->x:I

    .line 241
    .line 242
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->Q(I)V

    .line 247
    .line 248
    .line 249
    const-string p1, "osmdroid.cacheTileOvershoot"

    .line 250
    .line 251
    iget-short v0, p0, Lorg/osmdroid/config/b;->z:S

    .line 252
    .line 253
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    int-to-short p1, p1

    .line 258
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->h(S)V

    .line 259
    .line 260
    .line 261
    const-string p1, "osmdroid.TileDownloaderFollowRedirects"

    .line 262
    .line 263
    iget-boolean v0, p0, Lorg/osmdroid/config/b;->D:Z

    .line 264
    .line 265
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->G(Z)V

    .line 270
    .line 271
    .line 272
    const-string p1, "osmdroid.enforceTileSystemBounds"

    .line 273
    .line 274
    const/4 v0, 0x0

    .line 275
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 276
    .line 277
    .line 278
    move-result p1

    .line 279
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->d0(Z)V

    .line 280
    .line 281
    .line 282
    const-string p1, "osmdroid.ExpirationOverride"

    .line 283
    .line 284
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-eqz v0, :cond_4

    .line 289
    .line 290
    const-wide/16 v2, -0x1

    .line 291
    .line 292
    invoke-interface {p2, p1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 293
    .line 294
    .line 295
    move-result-wide p1

    .line 296
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    iput-object p1, p0, Lorg/osmdroid/config/b;->u:Ljava/lang/Long;

    .line 301
    .line 302
    if-eqz p1, :cond_4

    .line 303
    .line 304
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 305
    .line 306
    .line 307
    move-result-wide p1

    .line 308
    cmp-long p1, p1, v2

    .line 309
    .line 310
    if-nez p1, :cond_4

    .line 311
    .line 312
    iput-object v1, p0, Lorg/osmdroid/config/b;->u:Ljava/lang/Long;

    .line 313
    .line 314
    goto :goto_1

    .line 315
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->m(Landroid/content/Context;)Ljava/io/File;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    invoke-virtual {p0, p1}, Lorg/osmdroid/config/b;->H(Landroid/content/Context;)Ljava/io/File;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    if-eqz v4, :cond_2

    .line 328
    .line 329
    invoke-static {v1}, Lorg/osmdroid/tileprovider/util/b;->p(Ljava/io/File;)Z

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    if-nez v4, :cond_3

    .line 334
    .line 335
    :cond_2
    new-instance v1, Ljava/io/File;

    .line 336
    .line 337
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    const-string v4, "osmdroid"

    .line 342
    .line 343
    invoke-direct {v1, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    new-instance v2, Ljava/io/File;

    .line 347
    .line 348
    const-string v4, "tiles"

    .line 349
    .line 350
    invoke-direct {v2, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 354
    .line 355
    .line 356
    :cond_3
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    invoke-interface {v4, v0, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-interface {v4, v3, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 372
    .line 373
    .line 374
    invoke-static {v4}, Lorg/osmdroid/config/b;->o0(Landroid/content/SharedPreferences$Editor;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {p0, v1}, Lorg/osmdroid/config/b;->o(Ljava/io/File;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {p0, v2}, Lorg/osmdroid/config/b;->Z(Ljava/io/File;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-virtual {p0, v0}, Lorg/osmdroid/config/b;->S(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/config/b;->n0(Landroid/content/Context;Landroid/content/SharedPreferences;)V

    .line 391
    .line 392
    .line 393
    :cond_4
    :goto_1
    new-instance p1, Ljava/io/File;

    .line 394
    .line 395
    new-instance p2, Ljava/lang/StringBuilder;

    .line 396
    .line 397
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 398
    .line 399
    .line 400
    invoke-virtual {p0}, Lorg/osmdroid/config/b;->f()Ljava/io/File;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 412
    .line 413
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    const-string v0, "cache.db"

    .line 417
    .line 418
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object p2

    .line 425
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 429
    .line 430
    .line 431
    move-result p2

    .line 432
    if-eqz p2, :cond_5

    .line 433
    .line 434
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 435
    .line 436
    .line 437
    move-result-wide p1

    .line 438
    goto :goto_2

    .line 439
    :cond_5
    const-wide/16 p1, 0x0

    .line 440
    .line 441
    :goto_2
    invoke-virtual {p0}, Lorg/osmdroid/config/b;->f()Ljava/io/File;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-virtual {v0}, Ljava/io/File;->getFreeSpace()J

    .line 446
    .line 447
    .line 448
    move-result-wide v0

    .line 449
    invoke-virtual {p0}, Lorg/osmdroid/config/b;->i()J

    .line 450
    .line 451
    .line 452
    move-result-wide v2

    .line 453
    add-long/2addr v0, p1

    .line 454
    cmp-long p1, v2, v0

    .line 455
    .line 456
    if-lez p1, :cond_6

    .line 457
    .line 458
    long-to-double p1, v0

    .line 459
    const-wide v0, 0x3fee666666666666L    # 0.95

    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    mul-double/2addr v0, p1

    .line 465
    double-to-long v0, v0

    .line 466
    invoke-virtual {p0, v0, v1}, Lorg/osmdroid/config/b;->b0(J)V

    .line 467
    .line 468
    .line 469
    const-wide v0, 0x3feccccccccccccdL    # 0.9

    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    mul-double/2addr p1, v0

    .line 475
    double-to-long p1, p1

    .line 476
    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/config/b;->K(J)V

    .line 477
    .line 478
    .line 479
    :cond_6
    return-void
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
.end method

.method public m(Landroid/content/Context;)Ljava/io/File;
    .locals 4

    .line 1
    const-string v0, "OsmDroid"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lorg/osmdroid/config/b;->r:Ljava/io/File;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    invoke-static {p1}, Lorg/osmdroid/tileprovider/util/b;->d(Landroid/content/Context;)Lorg/osmdroid/tileprovider/util/b$a;

    .line 8
    .line 9
    .line 10
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    const-string v2, "osmdroid"

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    :try_start_1
    iget-object v1, v1, Lorg/osmdroid/tileprovider/util/b$a;->a:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v3, Ljava/io/File;

    .line 18
    .line 19
    invoke-direct {v3, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v3, p0, Lorg/osmdroid/config/b;->r:Ljava/io/File;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v1, Ljava/io/File;

    .line 29
    .line 30
    sget-object v3, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p1, v3}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-direct {v1, v3, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    const-string v1, "Directory not created"

    .line 46
    .line 47
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catch_0
    move-exception v1

    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v3, "Unable to create base path at "

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object v3, p0, Lorg/osmdroid/config/b;->r:Ljava/io/File;

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v0, v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 72
    .line 73
    .line 74
    :cond_1
    :goto_0
    iget-object v0, p0, Lorg/osmdroid/config/b;->r:Ljava/io/File;

    .line 75
    .line 76
    if-nez v0, :cond_2

    .line 77
    .line 78
    if-eqz p1, :cond_2

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, p0, Lorg/osmdroid/config/b;->r:Ljava/io/File;

    .line 85
    .line 86
    :cond_2
    iget-object p1, p0, Lorg/osmdroid/config/b;->r:Ljava/io/File;

    .line 87
    .line 88
    return-object p1
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

.method public m0()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/config/b;->e:Z

    return v0
.end method

.method public n()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/config/b;->i:Ljava/util/Map;

    return-object v0
.end method

.method public n0(Landroid/content/Context;Landroid/content/SharedPreferences;)V
    .locals 3

    .line 1
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lorg/osmdroid/config/b;->u()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "osmdroid.basePath"

    .line 14
    .line 15
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lorg/osmdroid/config/b;->f()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "osmdroid.cachePath"

    .line 27
    .line 28
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    .line 31
    const-string v0, "osmdroid.DebugMode"

    .line 32
    .line 33
    invoke-virtual {p0}, Lorg/osmdroid/config/b;->M()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 38
    .line 39
    .line 40
    const-string v0, "osmdroid.DebugDownloading"

    .line 41
    .line 42
    invoke-virtual {p0}, Lorg/osmdroid/config/b;->m0()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 47
    .line 48
    .line 49
    const-string v0, "osmdroid.DebugMapView"

    .line 50
    .line 51
    invoke-virtual {p0}, Lorg/osmdroid/config/b;->U()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 56
    .line 57
    .line 58
    const-string v0, "osmdroid.DebugTileProvider"

    .line 59
    .line 60
    invoke-virtual {p0}, Lorg/osmdroid/config/b;->k()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 65
    .line 66
    .line 67
    const-string v0, "osmdroid.HardwareAcceleration"

    .line 68
    .line 69
    invoke-virtual {p0}, Lorg/osmdroid/config/b;->B()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 74
    .line 75
    .line 76
    const-string v0, "osmdroid.TileDownloaderFollowRedirects"

    .line 77
    .line 78
    invoke-virtual {p0}, Lorg/osmdroid/config/b;->T()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 83
    .line 84
    .line 85
    const-string v0, "osmdroid.userAgentValue"

    .line 86
    .line 87
    invoke-virtual {p0}, Lorg/osmdroid/config/b;->w()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Lorg/osmdroid/config/b;->i:Ljava/util/Map;

    .line 95
    .line 96
    const-string v1, "osmdroid.additionalHttpRequestProperty."

    .line 97
    .line 98
    invoke-static {p2, p1, v0, v1}, Lorg/osmdroid/config/b;->r0(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences$Editor;Ljava/util/Map;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string p2, "osmdroid.gpsWaitTime"

    .line 102
    .line 103
    iget-wide v0, p0, Lorg/osmdroid/config/b;->a:J

    .line 104
    .line 105
    invoke-interface {p1, p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 106
    .line 107
    .line 108
    const-string p2, "osmdroid.cacheMapTileCount"

    .line 109
    .line 110
    iget-short v0, p0, Lorg/osmdroid/config/b;->j:S

    .line 111
    .line 112
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 113
    .line 114
    .line 115
    const-string p2, "osmdroid.tileDownloadThreads"

    .line 116
    .line 117
    iget-short v0, p0, Lorg/osmdroid/config/b;->k:S

    .line 118
    .line 119
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 120
    .line 121
    .line 122
    const-string p2, "osmdroid.tileFileSystemThreads"

    .line 123
    .line 124
    iget-short v0, p0, Lorg/osmdroid/config/b;->l:S

    .line 125
    .line 126
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 127
    .line 128
    .line 129
    const-string p2, "osmdroid.tileDownloadMaxQueueSize"

    .line 130
    .line 131
    iget-short v0, p0, Lorg/osmdroid/config/b;->m:S

    .line 132
    .line 133
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 134
    .line 135
    .line 136
    const-string p2, "osmdroid.tileFileSystemMaxQueueSize"

    .line 137
    .line 138
    iget-short v0, p0, Lorg/osmdroid/config/b;->n:S

    .line 139
    .line 140
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 141
    .line 142
    .line 143
    const-string p2, "osmdroid.ExpirationExtendedDuration"

    .line 144
    .line 145
    iget-wide v0, p0, Lorg/osmdroid/config/b;->t:J

    .line 146
    .line 147
    invoke-interface {p1, p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 148
    .line 149
    .line 150
    iget-object p2, p0, Lorg/osmdroid/config/b;->u:Ljava/lang/Long;

    .line 151
    .line 152
    if-eqz p2, :cond_0

    .line 153
    .line 154
    const-string v0, "osmdroid.ExpirationOverride"

    .line 155
    .line 156
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 157
    .line 158
    .line 159
    move-result-wide v1

    .line 160
    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 161
    .line 162
    .line 163
    :cond_0
    const-string p2, "osmdroid.ZoomSpeedDefault"

    .line 164
    .line 165
    iget v0, p0, Lorg/osmdroid/config/b;->w:I

    .line 166
    .line 167
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 168
    .line 169
    .line 170
    const-string p2, "osmdroid.animationSpeedShort"

    .line 171
    .line 172
    iget v0, p0, Lorg/osmdroid/config/b;->x:I

    .line 173
    .line 174
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 175
    .line 176
    .line 177
    const-string p2, "osmdroid.mapViewRecycler"

    .line 178
    .line 179
    iget-boolean v0, p0, Lorg/osmdroid/config/b;->y:Z

    .line 180
    .line 181
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 182
    .line 183
    .line 184
    const-string p2, "osmdroid.cacheTileOvershoot"

    .line 185
    .line 186
    iget-short v0, p0, Lorg/osmdroid/config/b;->z:S

    .line 187
    .line 188
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 189
    .line 190
    .line 191
    const-string p2, "osmdroid.enforceTileSystemBounds"

    .line 192
    .line 193
    iget-boolean v0, p0, Lorg/osmdroid/config/b;->E:Z

    .line 194
    .line 195
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 196
    .line 197
    .line 198
    invoke-static {p1}, Lorg/osmdroid/config/b;->o0(Landroid/content/SharedPreferences$Editor;)V

    .line 199
    .line 200
    .line 201
    return-void
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
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
.end method

.method public o(Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/config/b;->r:Ljava/io/File;

    return-void
.end method

.method public p()Ljava/text/SimpleDateFormat;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/config/b;->q:Ljava/text/SimpleDateFormat;

    return-object v0
.end method

.method public q()J
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/config/b;->a:J

    return-wide v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/config/b;->h:Ljava/lang/String;

    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/config/b;->F:Ljava/lang/String;

    return-object v0
.end method

.method public t(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/config/b;->y:Z

    return-void
.end method

.method public u()Ljava/io/File;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/osmdroid/config/b;->m(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public v(Ljava/net/Proxy;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/config/b;->v:Ljava/net/Proxy;

    return-void
.end method

.method public w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/config/b;->g:Ljava/lang/String;

    return-object v0
.end method

.method public x(J)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-gez v2, :cond_0

    .line 6
    .line 7
    iput-wide v0, p0, Lorg/osmdroid/config/b;->t:J

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iput-wide p1, p0, Lorg/osmdroid/config/b;->t:J

    .line 11
    .line 12
    :goto_0
    return-void
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

.method public y(S)V
    .locals 0

    iput-short p1, p0, Lorg/osmdroid/config/b;->n:S

    return-void
.end method

.method public z(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/config/b;->u:Ljava/lang/Long;

    return-void
.end method
