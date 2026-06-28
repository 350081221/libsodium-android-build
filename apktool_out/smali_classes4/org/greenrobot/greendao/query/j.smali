.class public Lorg/greenrobot/greendao/query/j;
.super Lorg/greenrobot/greendao/query/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/greenrobot/greendao/query/j$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/greenrobot/greendao/query/c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final h:Lorg/greenrobot/greendao/query/j$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/greenrobot/greendao/query/j$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field private volatile i:Lorg/greenrobot/greendao/rx/c;

.field private volatile j:Lorg/greenrobot/greendao/rx/c;


# direct methods
.method private constructor <init>(Lorg/greenrobot/greendao/query/j$b;Lorg/greenrobot/greendao/a;Ljava/lang/String;[Ljava/lang/String;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/greenrobot/greendao/query/j$b<",
            "TT;>;",
            "Lorg/greenrobot/greendao/a<",
            "TT;*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "II)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move v4, p5

    move v5, p6

    .line 2
    invoke-direct/range {v0 .. v5}, Lorg/greenrobot/greendao/query/c;-><init>(Lorg/greenrobot/greendao/a;Ljava/lang/String;[Ljava/lang/String;II)V

    .line 3
    iput-object p1, p0, Lorg/greenrobot/greendao/query/j;->h:Lorg/greenrobot/greendao/query/j$b;

    return-void
.end method

.method synthetic constructor <init>(Lorg/greenrobot/greendao/query/j$b;Lorg/greenrobot/greendao/a;Ljava/lang/String;[Ljava/lang/String;IILorg/greenrobot/greendao/query/j$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lorg/greenrobot/greendao/query/j;-><init>(Lorg/greenrobot/greendao/query/j$b;Lorg/greenrobot/greendao/a;Ljava/lang/String;[Ljava/lang/String;II)V

    return-void
.end method

.method static k(Lorg/greenrobot/greendao/a;Ljava/lang/String;[Ljava/lang/Object;II)Lorg/greenrobot/greendao/query/j;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T2:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/greenrobot/greendao/a<",
            "TT2;*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            "II)",
            "Lorg/greenrobot/greendao/query/j<",
            "TT2;>;"
        }
    .end annotation

    .line 1
    new-instance v6, Lorg/greenrobot/greendao/query/j$b;

    .line 2
    .line 3
    invoke-static {p2}, Lorg/greenrobot/greendao/query/a;->e([Ljava/lang/Object;)[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    move-object v0, v6

    .line 8
    move-object v1, p0

    .line 9
    move-object v2, p1

    .line 10
    move v4, p3

    .line 11
    move v5, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Lorg/greenrobot/greendao/query/j$b;-><init>(Lorg/greenrobot/greendao/a;Ljava/lang/String;[Ljava/lang/String;II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v6}, Lorg/greenrobot/greendao/query/b;->b()Lorg/greenrobot/greendao/query/a;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lorg/greenrobot/greendao/query/j;

    .line 20
    .line 21
    return-object p0
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
.end method

.method public static m(Lorg/greenrobot/greendao/a;Ljava/lang/String;[Ljava/lang/Object;)Lorg/greenrobot/greendao/query/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T2:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/greenrobot/greendao/a<",
            "TT2;*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")",
            "Lorg/greenrobot/greendao/query/j<",
            "TT2;>;"
        }
    .end annotation

    const/4 v0, -0x1

    invoke-static {p0, p1, p2, v0, v0}, Lorg/greenrobot/greendao/query/j;->k(Lorg/greenrobot/greendao/a;Ljava/lang/String;[Ljava/lang/Object;II)Lorg/greenrobot/greendao/query/j;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic b(ILjava/lang/Boolean;)Lorg/greenrobot/greendao/query/a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/greenrobot/greendao/query/j;->r(ILjava/lang/Boolean;)Lorg/greenrobot/greendao/query/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(ILjava/lang/Object;)Lorg/greenrobot/greendao/query/a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/greenrobot/greendao/query/j;->s(ILjava/lang/Object;)Lorg/greenrobot/greendao/query/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(ILjava/util/Date;)Lorg/greenrobot/greendao/query/a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/greenrobot/greendao/query/j;->t(ILjava/util/Date;)Lorg/greenrobot/greendao/query/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(I)V
    .locals 0

    invoke-super {p0, p1}, Lorg/greenrobot/greendao/query/c;->f(I)V

    return-void
.end method

.method public bridge synthetic g(I)V
    .locals 0

    invoke-super {p0, p1}, Lorg/greenrobot/greendao/query/c;->g(I)V

    return-void
.end method

.method public bridge synthetic h(ILjava/lang/Object;)Lorg/greenrobot/greendao/query/c;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/greenrobot/greendao/query/j;->s(ILjava/lang/Object;)Lorg/greenrobot/greendao/query/j;

    move-result-object p1

    return-object p1
.end method

.method public i()Lorg/greenrobot/greendao/rx/c;
    .locals 2
    .annotation build Lm4/c;
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/greenrobot/greendao/query/j;->j:Lorg/greenrobot/greendao/rx/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lorg/greenrobot/greendao/rx/c;

    .line 6
    .line 7
    invoke-static {}, Lrx/schedulers/Schedulers;->io()Lrx/Scheduler;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, p0, v1}, Lorg/greenrobot/greendao/rx/c;-><init>(Lorg/greenrobot/greendao/query/j;Lrx/Scheduler;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lorg/greenrobot/greendao/query/j;->j:Lorg/greenrobot/greendao/rx/c;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lorg/greenrobot/greendao/query/j;->j:Lorg/greenrobot/greendao/rx/c;

    .line 17
    .line 18
    return-object v0
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

.method public j()Lorg/greenrobot/greendao/rx/c;
    .locals 1
    .annotation build Lm4/c;
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/greenrobot/greendao/query/j;->i:Lorg/greenrobot/greendao/rx/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lorg/greenrobot/greendao/rx/c;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lorg/greenrobot/greendao/rx/c;-><init>(Lorg/greenrobot/greendao/query/j;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lorg/greenrobot/greendao/query/j;->i:Lorg/greenrobot/greendao/rx/c;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lorg/greenrobot/greendao/query/j;->i:Lorg/greenrobot/greendao/rx/c;

    .line 13
    .line 14
    return-object v0
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

.method public l()Lorg/greenrobot/greendao/query/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/greenrobot/greendao/query/j<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/greenrobot/greendao/query/j;->h:Lorg/greenrobot/greendao/query/j$b;

    invoke-virtual {v0, p0}, Lorg/greenrobot/greendao/query/b;->c(Lorg/greenrobot/greendao/query/a;)Lorg/greenrobot/greendao/query/a;

    move-result-object v0

    check-cast v0, Lorg/greenrobot/greendao/query/j;

    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/greenrobot/greendao/query/a;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/greenrobot/greendao/query/a;->a:Lorg/greenrobot/greendao/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lorg/greenrobot/greendao/a;->getDatabase()Lorg/greenrobot/greendao/database/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lorg/greenrobot/greendao/query/a;->c:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p0, Lorg/greenrobot/greendao/query/a;->d:[Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {v0, v1, v2}, Lorg/greenrobot/greendao/database/a;->b(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lorg/greenrobot/greendao/query/a;->b:Lorg/greenrobot/greendao/g;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lorg/greenrobot/greendao/g;->c(Landroid/database/Cursor;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
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

.method public o()Lorg/greenrobot/greendao/query/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/greenrobot/greendao/query/d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lorg/greenrobot/greendao/query/j;->q()Lorg/greenrobot/greendao/query/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/greenrobot/greendao/query/i;->o()Lorg/greenrobot/greendao/query/d;

    move-result-object v0

    return-object v0
.end method

.method public p()Lorg/greenrobot/greendao/query/i;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/greenrobot/greendao/query/i<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/greenrobot/greendao/query/a;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/greenrobot/greendao/query/a;->a:Lorg/greenrobot/greendao/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lorg/greenrobot/greendao/a;->getDatabase()Lorg/greenrobot/greendao/database/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lorg/greenrobot/greendao/query/a;->c:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p0, Lorg/greenrobot/greendao/query/a;->d:[Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {v0, v1, v2}, Lorg/greenrobot/greendao/database/a;->b(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Lorg/greenrobot/greendao/query/i;

    .line 19
    .line 20
    iget-object v2, p0, Lorg/greenrobot/greendao/query/a;->b:Lorg/greenrobot/greendao/g;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    invoke-direct {v1, v2, v0, v3}, Lorg/greenrobot/greendao/query/i;-><init>(Lorg/greenrobot/greendao/g;Landroid/database/Cursor;Z)V

    .line 24
    .line 25
    .line 26
    return-object v1
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

.method public q()Lorg/greenrobot/greendao/query/i;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/greenrobot/greendao/query/i<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/greenrobot/greendao/query/a;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/greenrobot/greendao/query/a;->a:Lorg/greenrobot/greendao/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lorg/greenrobot/greendao/a;->getDatabase()Lorg/greenrobot/greendao/database/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lorg/greenrobot/greendao/query/a;->c:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p0, Lorg/greenrobot/greendao/query/a;->d:[Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {v0, v1, v2}, Lorg/greenrobot/greendao/database/a;->b(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Lorg/greenrobot/greendao/query/i;

    .line 19
    .line 20
    iget-object v2, p0, Lorg/greenrobot/greendao/query/a;->b:Lorg/greenrobot/greendao/g;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v1, v2, v0, v3}, Lorg/greenrobot/greendao/query/i;-><init>(Lorg/greenrobot/greendao/g;Landroid/database/Cursor;Z)V

    .line 24
    .line 25
    .line 26
    return-object v1
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

.method public r(ILjava/lang/Boolean;)Lorg/greenrobot/greendao/query/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Boolean;",
            ")",
            "Lorg/greenrobot/greendao/query/j<",
            "TT;>;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lorg/greenrobot/greendao/query/a;->b(ILjava/lang/Boolean;)Lorg/greenrobot/greendao/query/a;

    move-result-object p1

    check-cast p1, Lorg/greenrobot/greendao/query/j;

    return-object p1
.end method

.method public s(ILjava/lang/Object;)Lorg/greenrobot/greendao/query/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Object;",
            ")",
            "Lorg/greenrobot/greendao/query/j<",
            "TT;>;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lorg/greenrobot/greendao/query/c;->h(ILjava/lang/Object;)Lorg/greenrobot/greendao/query/c;

    move-result-object p1

    check-cast p1, Lorg/greenrobot/greendao/query/j;

    return-object p1
.end method

.method public t(ILjava/util/Date;)Lorg/greenrobot/greendao/query/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Date;",
            ")",
            "Lorg/greenrobot/greendao/query/j<",
            "TT;>;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lorg/greenrobot/greendao/query/a;->d(ILjava/util/Date;)Lorg/greenrobot/greendao/query/a;

    move-result-object p1

    check-cast p1, Lorg/greenrobot/greendao/query/j;

    return-object p1
.end method

.method public u()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/greenrobot/greendao/query/a;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/greenrobot/greendao/query/a;->a:Lorg/greenrobot/greendao/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lorg/greenrobot/greendao/a;->getDatabase()Lorg/greenrobot/greendao/database/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lorg/greenrobot/greendao/query/a;->c:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p0, Lorg/greenrobot/greendao/query/a;->d:[Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {v0, v1, v2}, Lorg/greenrobot/greendao/database/a;->b(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lorg/greenrobot/greendao/query/a;->b:Lorg/greenrobot/greendao/g;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lorg/greenrobot/greendao/g;->e(Landroid/database/Cursor;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
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

.method public v()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/greenrobot/greendao/query/j;->u()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Lorg/greenrobot/greendao/d;

    .line 9
    .line 10
    const-string v1, "No entity found for query"

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lorg/greenrobot/greendao/d;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
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
