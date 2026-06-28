.class public Lorg/greenrobot/greendao/async/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lorg/greenrobot/greendao/c;

.field private final b:Lorg/greenrobot/greendao/async/c;

.field private c:I


# direct methods
.method public constructor <init>(Lorg/greenrobot/greendao/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/greenrobot/greendao/async/e;->a:Lorg/greenrobot/greendao/c;

    .line 5
    .line 6
    new-instance p1, Lorg/greenrobot/greendao/async/c;

    .line 7
    .line 8
    invoke-direct {p1}, Lorg/greenrobot/greendao/async/c;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lorg/greenrobot/greendao/async/e;->b:Lorg/greenrobot/greendao/async/c;

    .line 12
    .line 13
    return-void
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

.method private o(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/greenrobot/greendao/async/b$a;",
            "Ljava/lang/Class<",
            "TE;>;",
            "Ljava/lang/Object;",
            "I)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/greenrobot/greendao/async/e;->a:Lorg/greenrobot/greendao/c;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lorg/greenrobot/greendao/c;->getDao(Ljava/lang/Class;)Lorg/greenrobot/greendao/a;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    new-instance p2, Lorg/greenrobot/greendao/async/b;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget v0, p0, Lorg/greenrobot/greendao/async/e;->c:I

    .line 11
    .line 12
    or-int v6, p4, v0

    .line 13
    .line 14
    move-object v1, p2

    .line 15
    move-object v2, p1

    .line 16
    move-object v5, p3

    .line 17
    invoke-direct/range {v1 .. v6}, Lorg/greenrobot/greendao/async/b;-><init>(Lorg/greenrobot/greendao/async/b$a;Lorg/greenrobot/greendao/a;Lorg/greenrobot/greendao/database/a;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lorg/greenrobot/greendao/async/e;->b:Lorg/greenrobot/greendao/async/c;

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lorg/greenrobot/greendao/async/c;->a(Lorg/greenrobot/greendao/async/b;)V

    .line 23
    .line 24
    .line 25
    return-object p2
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

.method private p(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;
    .locals 7

    .line 1
    iget-object v0, p0, Lorg/greenrobot/greendao/async/e;->a:Lorg/greenrobot/greendao/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/greenrobot/greendao/c;->getDatabase()Lorg/greenrobot/greendao/database/a;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    new-instance v0, Lorg/greenrobot/greendao/async/b;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    iget v1, p0, Lorg/greenrobot/greendao/async/e;->c:I

    .line 11
    .line 12
    or-int v6, p3, v1

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    move-object v2, p1

    .line 16
    move-object v5, p2

    .line 17
    invoke-direct/range {v1 .. v6}, Lorg/greenrobot/greendao/async/b;-><init>(Lorg/greenrobot/greendao/async/b$a;Lorg/greenrobot/greendao/a;Lorg/greenrobot/greendao/database/a;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lorg/greenrobot/greendao/async/e;->b:Lorg/greenrobot/greendao/async/c;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lorg/greenrobot/greendao/async/c;->a(Lorg/greenrobot/greendao/async/b;)V

    .line 23
    .line 24
    .line 25
    return-object v0
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

.method private q(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;
    .locals 1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2, p3}, Lorg/greenrobot/greendao/async/e;->o(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public A(Ljava/lang/Class;Ljava/lang/Iterable;I)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;",
            "Ljava/lang/Iterable<",
            "TE;>;I)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->InsertInTxIterable:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/greenrobot/greendao/async/e;->o(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public varargs B(Ljava/lang/Class;[Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;[TE;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lorg/greenrobot/greendao/async/e;->y(Ljava/lang/Class;I[Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public C(Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/greendao/async/e;->D(Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public D(Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;
    .locals 1

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->InsertOrReplace:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p2}, Lorg/greenrobot/greendao/async/e;->q(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public varargs E(Ljava/lang/Class;I[Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;I[TE;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->InsertOrReplaceInTxArray:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p3, p2}, Lorg/greenrobot/greendao/async/e;->o(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public F(Ljava/lang/Class;Ljava/lang/Iterable;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;",
            "Ljava/lang/Iterable<",
            "TE;>;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lorg/greenrobot/greendao/async/e;->G(Ljava/lang/Class;Ljava/lang/Iterable;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public G(Ljava/lang/Class;Ljava/lang/Iterable;I)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;",
            "Ljava/lang/Iterable<",
            "TE;>;I)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->InsertOrReplaceInTxIterable:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/greenrobot/greendao/async/e;->o(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public varargs H(Ljava/lang/Class;[Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;[TE;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lorg/greenrobot/greendao/async/e;->E(Ljava/lang/Class;I[Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public I()Z
    .locals 1

    iget-object v0, p0, Lorg/greenrobot/greendao/async/e;->b:Lorg/greenrobot/greendao/async/c;

    invoke-virtual {v0}, Lorg/greenrobot/greendao/async/c;->k()Z

    move-result v0

    return v0
.end method

.method public J(Ljava/lang/Class;Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ")",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lorg/greenrobot/greendao/async/e;->K(Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public K(Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "I)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->Load:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/greenrobot/greendao/async/e;->o(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public L(Ljava/lang/Class;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/greendao/async/e;->M(Ljava/lang/Class;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public M(Ljava/lang/Class;I)Lorg/greenrobot/greendao/async/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;I)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->LoadAll:Lorg/greenrobot/greendao/async/b$a;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1, p2}, Lorg/greenrobot/greendao/async/e;->o(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public N(Lorg/greenrobot/greendao/query/j;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/greenrobot/greendao/query/j<",
            "*>;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/greendao/async/e;->O(Lorg/greenrobot/greendao/query/j;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public O(Lorg/greenrobot/greendao/query/j;I)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/greenrobot/greendao/query/j<",
            "*>;I)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->QueryList:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p2}, Lorg/greenrobot/greendao/async/e;->p(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public P(Lorg/greenrobot/greendao/query/j;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/greenrobot/greendao/query/j<",
            "*>;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/greendao/async/e;->Q(Lorg/greenrobot/greendao/query/j;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public Q(Lorg/greenrobot/greendao/query/j;I)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/greenrobot/greendao/query/j<",
            "*>;I)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->QueryUnique:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p2}, Lorg/greenrobot/greendao/async/e;->p(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public R(Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/greendao/async/e;->S(Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public S(Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;
    .locals 1

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->Refresh:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p2}, Lorg/greenrobot/greendao/async/e;->q(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public T(Ljava/lang/Runnable;)Lorg/greenrobot/greendao/async/b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/greendao/async/e;->U(Ljava/lang/Runnable;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public U(Ljava/lang/Runnable;I)Lorg/greenrobot/greendao/async/b;
    .locals 1

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->TransactionRunnable:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p2}, Lorg/greenrobot/greendao/async/e;->p(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public V(Lorg/greenrobot/greendao/async/d;)V
    .locals 1

    iget-object v0, p0, Lorg/greenrobot/greendao/async/e;->b:Lorg/greenrobot/greendao/async/c;

    invoke-virtual {v0, p1}, Lorg/greenrobot/greendao/async/c;->m(Lorg/greenrobot/greendao/async/d;)V

    return-void
.end method

.method public W(Lorg/greenrobot/greendao/async/d;)V
    .locals 1

    iget-object v0, p0, Lorg/greenrobot/greendao/async/e;->b:Lorg/greenrobot/greendao/async/c;

    invoke-virtual {v0, p1}, Lorg/greenrobot/greendao/async/c;->n(Lorg/greenrobot/greendao/async/d;)V

    return-void
.end method

.method public X(I)V
    .locals 1

    iget-object v0, p0, Lorg/greenrobot/greendao/async/e;->b:Lorg/greenrobot/greendao/async/c;

    invoke-virtual {v0, p1}, Lorg/greenrobot/greendao/async/c;->o(I)V

    return-void
.end method

.method public Y(I)V
    .locals 0

    iput p1, p0, Lorg/greenrobot/greendao/async/e;->c:I

    return-void
.end method

.method public Z(I)V
    .locals 1

    iget-object v0, p0, Lorg/greenrobot/greendao/async/e;->b:Lorg/greenrobot/greendao/async/c;

    invoke-virtual {v0, p1}, Lorg/greenrobot/greendao/async/c;->p(I)V

    return-void
.end method

.method public a(Ljava/util/concurrent/Callable;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "*>;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/greendao/async/e;->b(Ljava/util/concurrent/Callable;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public a0(Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/greendao/async/e;->b0(Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/util/concurrent/Callable;I)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "*>;I)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->TransactionCallable:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p2}, Lorg/greenrobot/greendao/async/e;->p(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public b0(Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;
    .locals 1

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->Update:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p2}, Lorg/greenrobot/greendao/async/e;->q(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Class;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/greendao/async/e;->d(Ljava/lang/Class;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public varargs c0(Ljava/lang/Class;I[Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;I[TE;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->UpdateInTxArray:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p3, p2}, Lorg/greenrobot/greendao/async/e;->o(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/Class;I)Lorg/greenrobot/greendao/async/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;I)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->Count:Lorg/greenrobot/greendao/async/b$a;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1, p2}, Lorg/greenrobot/greendao/async/e;->o(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public d0(Ljava/lang/Class;Ljava/lang/Iterable;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;",
            "Ljava/lang/Iterable<",
            "TE;>;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lorg/greenrobot/greendao/async/e;->e0(Ljava/lang/Class;Ljava/lang/Iterable;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/greendao/async/e;->f(Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public e0(Ljava/lang/Class;Ljava/lang/Iterable;I)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;",
            "Ljava/lang/Iterable<",
            "TE;>;I)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->UpdateInTxIterable:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/greenrobot/greendao/async/e;->o(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;
    .locals 1

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->Delete:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p2}, Lorg/greenrobot/greendao/async/e;->q(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public varargs f0(Ljava/lang/Class;[Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;[TE;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lorg/greenrobot/greendao/async/e;->c0(Ljava/lang/Class;I[Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/Class;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/greendao/async/e;->h(Ljava/lang/Class;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public g0()V
    .locals 1

    iget-object v0, p0, Lorg/greenrobot/greendao/async/e;->b:Lorg/greenrobot/greendao/async/c;

    invoke-virtual {v0}, Lorg/greenrobot/greendao/async/c;->q()V

    return-void
.end method

.method public h(Ljava/lang/Class;I)Lorg/greenrobot/greendao/async/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;I)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->DeleteAll:Lorg/greenrobot/greendao/async/b$a;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1, p2}, Lorg/greenrobot/greendao/async/e;->o(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public h0(I)Z
    .locals 1

    iget-object v0, p0, Lorg/greenrobot/greendao/async/e;->b:Lorg/greenrobot/greendao/async/c;

    invoke-virtual {v0, p1}, Lorg/greenrobot/greendao/async/c;->r(I)Z

    move-result p1

    return p1
.end method

.method public i(Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/greendao/async/e;->j(Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;
    .locals 1

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->DeleteByKey:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p2}, Lorg/greenrobot/greendao/async/e;->q(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public varargs k(Ljava/lang/Class;I[Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;I[TE;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->DeleteInTxArray:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p3, p2}, Lorg/greenrobot/greendao/async/e;->o(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public l(Ljava/lang/Class;Ljava/lang/Iterable;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;",
            "Ljava/lang/Iterable<",
            "TE;>;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lorg/greenrobot/greendao/async/e;->m(Ljava/lang/Class;Ljava/lang/Iterable;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public m(Ljava/lang/Class;Ljava/lang/Iterable;I)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;",
            "Ljava/lang/Iterable<",
            "TE;>;I)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->DeleteInTxIterable:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/greenrobot/greendao/async/e;->o(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public varargs n(Ljava/lang/Class;[Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;[TE;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lorg/greenrobot/greendao/async/e;->k(Ljava/lang/Class;I[Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public r()Lorg/greenrobot/greendao/async/d;
    .locals 1

    iget-object v0, p0, Lorg/greenrobot/greendao/async/e;->b:Lorg/greenrobot/greendao/async/c;

    invoke-virtual {v0}, Lorg/greenrobot/greendao/async/c;->f()Lorg/greenrobot/greendao/async/d;

    move-result-object v0

    return-object v0
.end method

.method public s()Lorg/greenrobot/greendao/async/d;
    .locals 1

    iget-object v0, p0, Lorg/greenrobot/greendao/async/e;->b:Lorg/greenrobot/greendao/async/c;

    invoke-virtual {v0}, Lorg/greenrobot/greendao/async/c;->g()Lorg/greenrobot/greendao/async/d;

    move-result-object v0

    return-object v0
.end method

.method public t()I
    .locals 1

    iget-object v0, p0, Lorg/greenrobot/greendao/async/e;->b:Lorg/greenrobot/greendao/async/c;

    invoke-virtual {v0}, Lorg/greenrobot/greendao/async/c;->h()I

    move-result v0

    return v0
.end method

.method public u()I
    .locals 1

    iget v0, p0, Lorg/greenrobot/greendao/async/e;->c:I

    return v0
.end method

.method public v()I
    .locals 1

    iget-object v0, p0, Lorg/greenrobot/greendao/async/e;->b:Lorg/greenrobot/greendao/async/c;

    invoke-virtual {v0}, Lorg/greenrobot/greendao/async/c;->i()I

    move-result v0

    return v0
.end method

.method public w(Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/greendao/async/e;->x(Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public x(Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;
    .locals 1

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->Insert:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p2}, Lorg/greenrobot/greendao/async/e;->q(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public varargs y(Ljava/lang/Class;I[Ljava/lang/Object;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;I[TE;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    sget-object v0, Lorg/greenrobot/greendao/async/b$a;->InsertInTxArray:Lorg/greenrobot/greendao/async/b$a;

    invoke-direct {p0, v0, p1, p3, p2}, Lorg/greenrobot/greendao/async/e;->o(Lorg/greenrobot/greendao/async/b$a;Ljava/lang/Class;Ljava/lang/Object;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method

.method public z(Ljava/lang/Class;Ljava/lang/Iterable;)Lorg/greenrobot/greendao/async/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;",
            "Ljava/lang/Iterable<",
            "TE;>;)",
            "Lorg/greenrobot/greendao/async/b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lorg/greenrobot/greendao/async/e;->A(Ljava/lang/Class;Ljava/lang/Iterable;I)Lorg/greenrobot/greendao/async/b;

    move-result-object p1

    return-object p1
.end method
