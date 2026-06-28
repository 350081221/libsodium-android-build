.class public final Lorg/greenrobot/greendao/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public final a:Lorg/greenrobot/greendao/database/a;

.field public final b:Ljava/lang/String;

.field public final c:[Lorg/greenrobot/greendao/i;

.field public final d:[Ljava/lang/String;

.field public final e:[Ljava/lang/String;

.field public final f:[Ljava/lang/String;

.field public final g:Lorg/greenrobot/greendao/i;

.field public final h:Z

.field public final i:Lorg/greenrobot/greendao/internal/e;

.field private j:Lo4/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo4/a<",
            "**>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/greenrobot/greendao/database/a;Ljava/lang/Class;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/greenrobot/greendao/database/a;",
            "Ljava/lang/Class<",
            "+",
            "Lorg/greenrobot/greendao/a<",
            "**>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/greenrobot/greendao/internal/a;->a:Lorg/greenrobot/greendao/database/a;

    :try_start_0
    const-string v0, "TABLENAME"

    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lorg/greenrobot/greendao/internal/a;->b:Ljava/lang/String;

    .line 4
    invoke-static {p2}, Lorg/greenrobot/greendao/internal/a;->e(Ljava/lang/Class;)[Lorg/greenrobot/greendao/i;

    move-result-object p2

    .line 5
    iput-object p2, p0, Lorg/greenrobot/greendao/internal/a;->c:[Lorg/greenrobot/greendao/i;

    .line 6
    array-length v0, p2

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lorg/greenrobot/greendao/internal/a;->d:[Ljava/lang/String;

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    move-object v5, v1

    move v4, v3

    .line 9
    :goto_0
    array-length v6, p2

    if-ge v4, v6, :cond_1

    .line 10
    aget-object v6, p2, v4

    .line 11
    iget-object v7, v6, Lorg/greenrobot/greendao/i;->e:Ljava/lang/String;

    .line 12
    iget-object v8, p0, Lorg/greenrobot/greendao/internal/a;->d:[Ljava/lang/String;

    aput-object v7, v8, v4

    .line 13
    iget-boolean v8, v6, Lorg/greenrobot/greendao/i;->d:Z

    if-eqz v8, :cond_0

    .line 14
    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v5, v6

    goto :goto_1

    .line 15
    :cond_0
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 16
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p2

    new-array p2, p2, [Ljava/lang/String;

    .line 17
    invoke-interface {v2, p2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    iput-object p2, p0, Lorg/greenrobot/greendao/internal/a;->f:[Ljava/lang/String;

    .line 18
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    new-array p2, p2, [Ljava/lang/String;

    .line 19
    invoke-interface {v0, p2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    iput-object p2, p0, Lorg/greenrobot/greendao/internal/a;->e:[Ljava/lang/String;

    .line 20
    array-length v0, p2

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    move-object v1, v5

    :cond_2
    iput-object v1, p0, Lorg/greenrobot/greendao/internal/a;->g:Lorg/greenrobot/greendao/i;

    .line 21
    new-instance v0, Lorg/greenrobot/greendao/internal/e;

    iget-object v4, p0, Lorg/greenrobot/greendao/internal/a;->b:Ljava/lang/String;

    iget-object v5, p0, Lorg/greenrobot/greendao/internal/a;->d:[Ljava/lang/String;

    invoke-direct {v0, p1, v4, v5, p2}, Lorg/greenrobot/greendao/internal/e;-><init>(Lorg/greenrobot/greendao/database/a;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    iput-object v0, p0, Lorg/greenrobot/greendao/internal/a;->i:Lorg/greenrobot/greendao/internal/e;

    if-eqz v1, :cond_5

    .line 22
    iget-object p1, v1, Lorg/greenrobot/greendao/i;->b:Ljava/lang/Class;

    .line 23
    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    const-class p2, Ljava/lang/Long;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    const-class p2, Ljava/lang/Integer;

    .line 24
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    sget-object p2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    const-class p2, Ljava/lang/Short;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    sget-object p2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 25
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    const-class p2, Ljava/lang/Byte;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    move v3, v2

    :cond_4
    iput-boolean v3, p0, Lorg/greenrobot/greendao/internal/a;->h:Z

    goto :goto_2

    .line 26
    :cond_5
    iput-boolean v3, p0, Lorg/greenrobot/greendao/internal/a;->h:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    return-void

    :catch_0
    move-exception p1

    .line 27
    new-instance p2, Lorg/greenrobot/greendao/d;

    const-string v0, "Could not init DAOConfig"

    invoke-direct {p2, v0, p1}, Lorg/greenrobot/greendao/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public constructor <init>(Lorg/greenrobot/greendao/internal/a;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iget-object v0, p1, Lorg/greenrobot/greendao/internal/a;->a:Lorg/greenrobot/greendao/database/a;

    iput-object v0, p0, Lorg/greenrobot/greendao/internal/a;->a:Lorg/greenrobot/greendao/database/a;

    .line 30
    iget-object v0, p1, Lorg/greenrobot/greendao/internal/a;->b:Ljava/lang/String;

    iput-object v0, p0, Lorg/greenrobot/greendao/internal/a;->b:Ljava/lang/String;

    .line 31
    iget-object v0, p1, Lorg/greenrobot/greendao/internal/a;->c:[Lorg/greenrobot/greendao/i;

    iput-object v0, p0, Lorg/greenrobot/greendao/internal/a;->c:[Lorg/greenrobot/greendao/i;

    .line 32
    iget-object v0, p1, Lorg/greenrobot/greendao/internal/a;->d:[Ljava/lang/String;

    iput-object v0, p0, Lorg/greenrobot/greendao/internal/a;->d:[Ljava/lang/String;

    .line 33
    iget-object v0, p1, Lorg/greenrobot/greendao/internal/a;->e:[Ljava/lang/String;

    iput-object v0, p0, Lorg/greenrobot/greendao/internal/a;->e:[Ljava/lang/String;

    .line 34
    iget-object v0, p1, Lorg/greenrobot/greendao/internal/a;->f:[Ljava/lang/String;

    iput-object v0, p0, Lorg/greenrobot/greendao/internal/a;->f:[Ljava/lang/String;

    .line 35
    iget-object v0, p1, Lorg/greenrobot/greendao/internal/a;->g:Lorg/greenrobot/greendao/i;

    iput-object v0, p0, Lorg/greenrobot/greendao/internal/a;->g:Lorg/greenrobot/greendao/i;

    .line 36
    iget-object v0, p1, Lorg/greenrobot/greendao/internal/a;->i:Lorg/greenrobot/greendao/internal/e;

    iput-object v0, p0, Lorg/greenrobot/greendao/internal/a;->i:Lorg/greenrobot/greendao/internal/e;

    .line 37
    iget-boolean p1, p1, Lorg/greenrobot/greendao/internal/a;->h:Z

    iput-boolean p1, p0, Lorg/greenrobot/greendao/internal/a;->h:Z

    return-void
.end method

.method private static e(Ljava/lang/Class;)[Lorg/greenrobot/greendao/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/greenrobot/greendao/a<",
            "**>;>;)[",
            "Lorg/greenrobot/greendao/i;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, "$Properties"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    array-length v1, p0

    .line 36
    const/4 v2, 0x0

    .line 37
    :goto_0
    if-ge v2, v1, :cond_1

    .line 38
    .line 39
    aget-object v3, p0, v2

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/16 v5, 0x9

    .line 46
    .line 47
    and-int/2addr v4, v5

    .line 48
    if-ne v4, v5, :cond_0

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    instance-of v4, v3, Lorg/greenrobot/greendao/i;

    .line 56
    .line 57
    if-eqz v4, :cond_0

    .line 58
    .line 59
    check-cast v3, Lorg/greenrobot/greendao/i;

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    new-array p0, p0, [Lorg/greenrobot/greendao/i;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_3

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Lorg/greenrobot/greendao/i;

    .line 88
    .line 89
    iget v2, v1, Lorg/greenrobot/greendao/i;->a:I

    .line 90
    .line 91
    aget-object v3, p0, v2

    .line 92
    .line 93
    if-nez v3, :cond_2

    .line 94
    .line 95
    aput-object v1, p0, v2

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    new-instance p0, Lorg/greenrobot/greendao/d;

    .line 99
    .line 100
    const-string v0, "Duplicate property ordinals"

    .line 101
    .line 102
    invoke-direct {p0, v0}, Lorg/greenrobot/greendao/d;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p0

    .line 106
    :cond_3
    return-object p0
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


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/greenrobot/greendao/internal/a;->j:Lo4/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lo4/a;->clear()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
    .line 9
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
.end method

.method public b()Lorg/greenrobot/greendao/internal/a;
    .locals 1

    new-instance v0, Lorg/greenrobot/greendao/internal/a;

    invoke-direct {v0, p0}, Lorg/greenrobot/greendao/internal/a;-><init>(Lorg/greenrobot/greendao/internal/a;)V

    return-object v0
.end method

.method public c()Lo4/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo4/a<",
            "**>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/greenrobot/greendao/internal/a;->j:Lo4/a;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, Lorg/greenrobot/greendao/internal/a;->b()Lorg/greenrobot/greendao/internal/a;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo4/d;)V
    .locals 3

    .line 1
    sget-object v0, Lo4/d;->None:Lo4/d;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lorg/greenrobot/greendao/internal/a;->j:Lo4/a;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v0, Lo4/d;->Session:Lo4/d;

    .line 10
    .line 11
    if-ne p1, v0, :cond_2

    .line 12
    .line 13
    iget-boolean p1, p0, Lorg/greenrobot/greendao/internal/a;->h:Z

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    new-instance p1, Lo4/b;

    .line 18
    .line 19
    invoke-direct {p1}, Lo4/b;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lorg/greenrobot/greendao/internal/a;->j:Lo4/a;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    new-instance p1, Lo4/c;

    .line 26
    .line 27
    invoke-direct {p1}, Lo4/c;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lorg/greenrobot/greendao/internal/a;->j:Lo4/a;

    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v2, "Unsupported type: "

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0
    .line 56
    .line 57
    .line 58
.end method

.method public f(Lo4/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo4/a<",
            "**>;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/greenrobot/greendao/internal/a;->j:Lo4/a;

    return-void
.end method
