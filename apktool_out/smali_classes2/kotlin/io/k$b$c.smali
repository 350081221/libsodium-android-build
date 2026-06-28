.class final Lkotlin/io/k$b$c;
.super Lkotlin/io/k$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/io/k$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u000c\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;",
        "Lkotlin/io/FileTreeWalk$DirectoryState;",
        "rootDir",
        "Ljava/io/File;",
        "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V",
        "fileIndex",
        "",
        "fileList",
        "",
        "[Ljava/io/File;",
        "rootVisited",
        "",
        "step",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private b:Z

.field private c:[Ljava/io/File;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private d:I

.field final synthetic e:Lkotlin/io/k$b;


# direct methods
.method public constructor <init>(Lkotlin/io/k$b;Ljava/io/File;)V
    .locals 1
    .param p1    # Lkotlin/io/k$b;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "rootDir"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lkotlin/io/k$b$c;->e:Lkotlin/io/k$b;

    .line 7
    .line 8
    invoke-direct {p0, p2}, Lkotlin/io/k$a;-><init>(Ljava/io/File;)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method


# virtual methods
.method public b()Ljava/io/File;
    .locals 10
    .annotation build Lp4/m;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lkotlin/io/k$b$c;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lkotlin/io/k$b$c;->e:Lkotlin/io/k$b;

    .line 7
    .line 8
    iget-object v0, v0, Lkotlin/io/k$b;->d:Lkotlin/io/k;

    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/io/k;->e(Lkotlin/io/k;)Lv3/l;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lkotlin/io/k$c;->a()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-interface {v0, v4}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    move v2, v3

    .line 35
    :cond_0
    if-eqz v2, :cond_1

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_1
    iput-boolean v3, p0, Lkotlin/io/k$b$c;->b:Z

    .line 39
    .line 40
    invoke-virtual {p0}, Lkotlin/io/k$c;->a()Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :cond_2
    iget-object v0, p0, Lkotlin/io/k$b$c;->c:[Ljava/io/File;

    .line 46
    .line 47
    if-eqz v0, :cond_5

    .line 48
    .line 49
    iget v2, p0, Lkotlin/io/k$b$c;->d:I

    .line 50
    .line 51
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    array-length v0, v0

    .line 55
    if-ge v2, v0, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    iget-object v0, p0, Lkotlin/io/k$b$c;->e:Lkotlin/io/k$b;

    .line 59
    .line 60
    iget-object v0, v0, Lkotlin/io/k$b;->d:Lkotlin/io/k;

    .line 61
    .line 62
    invoke-static {v0}, Lkotlin/io/k;->g(Lkotlin/io/k;)Lv3/l;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    invoke-virtual {p0}, Lkotlin/io/k$c;->a()Ljava/io/File;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-interface {v0, v2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    :cond_4
    return-object v1

    .line 76
    :cond_5
    :goto_0
    iget-object v0, p0, Lkotlin/io/k$b$c;->c:[Ljava/io/File;

    .line 77
    .line 78
    if-nez v0, :cond_9

    .line 79
    .line 80
    invoke-virtual {p0}, Lkotlin/io/k$c;->a()Ljava/io/File;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, p0, Lkotlin/io/k$b$c;->c:[Ljava/io/File;

    .line 89
    .line 90
    if-nez v0, :cond_6

    .line 91
    .line 92
    iget-object v0, p0, Lkotlin/io/k$b$c;->e:Lkotlin/io/k$b;

    .line 93
    .line 94
    iget-object v0, v0, Lkotlin/io/k$b;->d:Lkotlin/io/k;

    .line 95
    .line 96
    invoke-static {v0}, Lkotlin/io/k;->f(Lkotlin/io/k;)Lv3/p;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v0, :cond_6

    .line 101
    .line 102
    invoke-virtual {p0}, Lkotlin/io/k$c;->a()Ljava/io/File;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    new-instance v9, Lkotlin/io/a;

    .line 107
    .line 108
    invoke-virtual {p0}, Lkotlin/io/k$c;->a()Ljava/io/File;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    const/4 v5, 0x0

    .line 113
    const-string v6, "Cannot list files in a directory"

    .line 114
    .line 115
    const/4 v7, 0x2

    .line 116
    const/4 v8, 0x0

    .line 117
    move-object v3, v9

    .line 118
    invoke-direct/range {v3 .. v8}, Lkotlin/io/a;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/w;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v0, v2, v9}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :cond_6
    iget-object v0, p0, Lkotlin/io/k$b$c;->c:[Ljava/io/File;

    .line 125
    .line 126
    if-eqz v0, :cond_7

    .line 127
    .line 128
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    array-length v0, v0

    .line 132
    if-nez v0, :cond_9

    .line 133
    .line 134
    :cond_7
    iget-object v0, p0, Lkotlin/io/k$b$c;->e:Lkotlin/io/k$b;

    .line 135
    .line 136
    iget-object v0, v0, Lkotlin/io/k$b;->d:Lkotlin/io/k;

    .line 137
    .line 138
    invoke-static {v0}, Lkotlin/io/k;->g(Lkotlin/io/k;)Lv3/l;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-eqz v0, :cond_8

    .line 143
    .line 144
    invoke-virtual {p0}, Lkotlin/io/k$c;->a()Ljava/io/File;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-interface {v0, v2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    :cond_8
    return-object v1

    .line 152
    :cond_9
    iget-object v0, p0, Lkotlin/io/k$b$c;->c:[Ljava/io/File;

    .line 153
    .line 154
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget v1, p0, Lkotlin/io/k$b$c;->d:I

    .line 158
    .line 159
    add-int/lit8 v2, v1, 0x1

    .line 160
    .line 161
    iput v2, p0, Lkotlin/io/k$b$c;->d:I

    .line 162
    .line 163
    aget-object v0, v0, v1

    .line 164
    .line 165
    return-object v0
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
.end method
