.class public final Lokio/internal/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aI\u0010\u0000\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000c\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0016\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0003H\u0000\u001a\"\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0003*\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0003H\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "collectRecursively",
        "",
        "Lkotlin/sequences/SequenceScope;",
        "Lokio/Path;",
        "fileSystem",
        "Lokio/FileSystem;",
        "stack",
        "Lkotlin/collections/ArrayDeque;",
        "path",
        "followSymlinks",
        "",
        "postorder",
        "(Lkotlin/sequences/SequenceScope;Lokio/FileSystem;Lkotlin/collections/ArrayDeque;Lokio/Path;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "commonCopy",
        "source",
        "target",
        "commonCreateDirectories",
        "dir",
        "mustCreate",
        "commonDeleteRecursively",
        "fileOrDirectory",
        "mustExist",
        "commonExists",
        "commonListRecursively",
        "Lkotlin/sequences/Sequence;",
        "commonMetadata",
        "Lokio/FileMetadata;",
        "symlinkTarget",
        "okio"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n52#2,5:156\n52#2,21:161\n60#2,10:182\n57#2,2:192\n71#2,2:194\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,5\n66#1:161,21\n65#1:182,10\n65#1:192,2\n65#1:194,2\n*E\n"
    }
.end annotation

.annotation build Lu3/h;
    name = "-FileSystem"
.end annotation


# direct methods
.method public static final a(Lkotlin/sequences/o;Lokio/u;Lkotlin/collections/k;Lokio/d1;ZZLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 17
    .param p0    # Lkotlin/sequences/o;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lokio/u;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/collections/k;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lokio/d1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p6    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/o<",
            "-",
            "Lokio/d1;",
            ">;",
            "Lokio/u;",
            "Lkotlin/collections/k<",
            "Lokio/d1;",
            ">;",
            "Lokio/d1;",
            "ZZ",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p5

    .line 6
    .line 7
    move-object/from16 v3, p6

    .line 8
    .line 9
    instance-of v4, v3, Lokio/internal/c$a;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Lokio/internal/c$a;

    .line 15
    .line 16
    iget v5, v4, Lokio/internal/c$a;->label:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lokio/internal/c$a;->label:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lokio/internal/c$a;

    .line 29
    .line 30
    invoke-direct {v4, v3}, Lokio/internal/c$a;-><init>(Lkotlin/coroutines/d;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, Lokio/internal/c$a;->result:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iget v6, v4, Lokio/internal/c$a;->label:I

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x3

    .line 43
    const/4 v9, 0x2

    .line 44
    const/4 v10, 0x1

    .line 45
    if-eqz v6, :cond_4

    .line 46
    .line 47
    if-eq v6, v10, :cond_3

    .line 48
    .line 49
    if-eq v6, v9, :cond_2

    .line 50
    .line 51
    if-ne v6, v8, :cond_1

    .line 52
    .line 53
    invoke-static {v3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_8

    .line 57
    .line 58
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_2
    iget-boolean v0, v4, Lokio/internal/c$a;->Z$1:Z

    .line 67
    .line 68
    iget-boolean v1, v4, Lokio/internal/c$a;->Z$0:Z

    .line 69
    .line 70
    iget-object v2, v4, Lokio/internal/c$a;->L$4:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Ljava/util/Iterator;

    .line 73
    .line 74
    iget-object v6, v4, Lokio/internal/c$a;->L$3:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v6, Lokio/d1;

    .line 77
    .line 78
    iget-object v11, v4, Lokio/internal/c$a;->L$2:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v11, Lkotlin/collections/k;

    .line 81
    .line 82
    iget-object v12, v4, Lokio/internal/c$a;->L$1:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v12, Lokio/u;

    .line 85
    .line 86
    iget-object v13, v4, Lokio/internal/c$a;->L$0:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v13, Lkotlin/sequences/o;

    .line 89
    .line 90
    :try_start_0
    invoke-static {v3}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :catchall_0
    move-exception v0

    .line 96
    goto/16 :goto_6

    .line 97
    .line 98
    :cond_3
    iget-boolean v0, v4, Lokio/internal/c$a;->Z$1:Z

    .line 99
    .line 100
    iget-boolean v1, v4, Lokio/internal/c$a;->Z$0:Z

    .line 101
    .line 102
    iget-object v2, v4, Lokio/internal/c$a;->L$3:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v2, Lokio/d1;

    .line 105
    .line 106
    iget-object v6, v4, Lokio/internal/c$a;->L$2:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v6, Lkotlin/collections/k;

    .line 109
    .line 110
    iget-object v11, v4, Lokio/internal/c$a;->L$1:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v11, Lokio/u;

    .line 113
    .line 114
    iget-object v12, v4, Lokio/internal/c$a;->L$0:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v12, Lkotlin/sequences/o;

    .line 117
    .line 118
    invoke-static {v3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    move-object/from16 v16, v2

    .line 122
    .line 123
    move v2, v0

    .line 124
    move v0, v1

    .line 125
    move-object/from16 v1, v16

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_4
    invoke-static {v3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    if-nez v2, :cond_5

    .line 132
    .line 133
    iput-object v0, v4, Lokio/internal/c$a;->L$0:Ljava/lang/Object;

    .line 134
    .line 135
    move-object/from16 v3, p1

    .line 136
    .line 137
    iput-object v3, v4, Lokio/internal/c$a;->L$1:Ljava/lang/Object;

    .line 138
    .line 139
    move-object/from16 v6, p2

    .line 140
    .line 141
    iput-object v6, v4, Lokio/internal/c$a;->L$2:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object v1, v4, Lokio/internal/c$a;->L$3:Ljava/lang/Object;

    .line 144
    .line 145
    move/from16 v11, p4

    .line 146
    .line 147
    iput-boolean v11, v4, Lokio/internal/c$a;->Z$0:Z

    .line 148
    .line 149
    iput-boolean v2, v4, Lokio/internal/c$a;->Z$1:Z

    .line 150
    .line 151
    iput v10, v4, Lokio/internal/c$a;->label:I

    .line 152
    .line 153
    invoke-virtual {v0, v1, v4}, Lkotlin/sequences/o;->b(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v12

    .line 157
    if-ne v12, v5, :cond_6

    .line 158
    .line 159
    return-object v5

    .line 160
    :cond_5
    move-object/from16 v3, p1

    .line 161
    .line 162
    move-object/from16 v6, p2

    .line 163
    .line 164
    move/from16 v11, p4

    .line 165
    .line 166
    :cond_6
    move-object v12, v0

    .line 167
    move v0, v11

    .line 168
    move-object v11, v3

    .line 169
    :goto_1
    invoke-virtual {v11, v1}, Lokio/u;->z(Lokio/d1;)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    if-nez v3, :cond_7

    .line 174
    .line 175
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    :cond_7
    move-object v13, v3

    .line 180
    check-cast v13, Ljava/util/Collection;

    .line 181
    .line 182
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 183
    .line 184
    .line 185
    move-result v13

    .line 186
    xor-int/2addr v13, v10

    .line 187
    if-eqz v13, :cond_f

    .line 188
    .line 189
    move-object v13, v1

    .line 190
    move v14, v7

    .line 191
    :goto_2
    if-eqz v0, :cond_9

    .line 192
    .line 193
    invoke-virtual {v6, v13}, Lkotlin/collections/k;->contains(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v15

    .line 197
    if-nez v15, :cond_8

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_8
    new-instance v0, Ljava/io/IOException;

    .line 201
    .line 202
    new-instance v2, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 205
    .line 206
    .line 207
    const-string v3, "symlink cycle at "

    .line 208
    .line 209
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw v0

    .line 223
    :cond_9
    :goto_3
    invoke-static {v11, v13}, Lokio/internal/c;->h(Lokio/u;Lokio/d1;)Lokio/d1;

    .line 224
    .line 225
    .line 226
    move-result-object v15

    .line 227
    if-nez v15, :cond_e

    .line 228
    .line 229
    if-nez v0, :cond_a

    .line 230
    .line 231
    if-nez v14, :cond_f

    .line 232
    .line 233
    :cond_a
    invoke-virtual {v6, v13}, Lkotlin/collections/k;->addLast(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    :try_start_1
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 240
    move-object v13, v12

    .line 241
    move-object v12, v11

    .line 242
    move-object v11, v6

    .line 243
    move-object v6, v1

    .line 244
    move v1, v0

    .line 245
    move v0, v2

    .line 246
    move-object v2, v3

    .line 247
    :cond_b
    :goto_4
    :try_start_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    if-eqz v3, :cond_d

    .line 252
    .line 253
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    check-cast v3, Lokio/d1;

    .line 258
    .line 259
    if-eqz v0, :cond_c

    .line 260
    .line 261
    move v14, v10

    .line 262
    goto :goto_5

    .line 263
    :cond_c
    move v14, v7

    .line 264
    :goto_5
    iput-object v13, v4, Lokio/internal/c$a;->L$0:Ljava/lang/Object;

    .line 265
    .line 266
    iput-object v12, v4, Lokio/internal/c$a;->L$1:Ljava/lang/Object;

    .line 267
    .line 268
    iput-object v11, v4, Lokio/internal/c$a;->L$2:Ljava/lang/Object;

    .line 269
    .line 270
    iput-object v6, v4, Lokio/internal/c$a;->L$3:Ljava/lang/Object;

    .line 271
    .line 272
    iput-object v2, v4, Lokio/internal/c$a;->L$4:Ljava/lang/Object;

    .line 273
    .line 274
    iput-boolean v1, v4, Lokio/internal/c$a;->Z$0:Z

    .line 275
    .line 276
    iput-boolean v0, v4, Lokio/internal/c$a;->Z$1:Z

    .line 277
    .line 278
    iput v9, v4, Lokio/internal/c$a;->label:I

    .line 279
    .line 280
    move-object/from16 p0, v13

    .line 281
    .line 282
    move-object/from16 p1, v12

    .line 283
    .line 284
    move-object/from16 p2, v11

    .line 285
    .line 286
    move-object/from16 p3, v3

    .line 287
    .line 288
    move/from16 p4, v1

    .line 289
    .line 290
    move/from16 p5, v14

    .line 291
    .line 292
    move-object/from16 p6, v4

    .line 293
    .line 294
    invoke-static/range {p0 .. p6}, Lokio/internal/c;->a(Lkotlin/sequences/o;Lokio/u;Lkotlin/collections/k;Lokio/d1;ZZLkotlin/coroutines/d;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 298
    if-ne v3, v5, :cond_b

    .line 299
    .line 300
    return-object v5

    .line 301
    :cond_d
    invoke-virtual {v11}, Lkotlin/collections/k;->removeLast()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move v2, v0

    .line 305
    move-object v1, v6

    .line 306
    move-object v12, v13

    .line 307
    goto :goto_7

    .line 308
    :catchall_1
    move-exception v0

    .line 309
    move-object v11, v6

    .line 310
    :goto_6
    invoke-virtual {v11}, Lkotlin/collections/k;->removeLast()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    throw v0

    .line 314
    :cond_e
    add-int/lit8 v14, v14, 0x1

    .line 315
    .line 316
    move-object v13, v15

    .line 317
    goto :goto_2

    .line 318
    :cond_f
    :goto_7
    if-eqz v2, :cond_11

    .line 319
    .line 320
    const/4 v0, 0x0

    .line 321
    iput-object v0, v4, Lokio/internal/c$a;->L$0:Ljava/lang/Object;

    .line 322
    .line 323
    iput-object v0, v4, Lokio/internal/c$a;->L$1:Ljava/lang/Object;

    .line 324
    .line 325
    iput-object v0, v4, Lokio/internal/c$a;->L$2:Ljava/lang/Object;

    .line 326
    .line 327
    iput-object v0, v4, Lokio/internal/c$a;->L$3:Ljava/lang/Object;

    .line 328
    .line 329
    iput-object v0, v4, Lokio/internal/c$a;->L$4:Ljava/lang/Object;

    .line 330
    .line 331
    iput v8, v4, Lokio/internal/c$a;->label:I

    .line 332
    .line 333
    invoke-virtual {v12, v1, v4}, Lkotlin/sequences/o;->b(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    if-ne v0, v5, :cond_10

    .line 338
    .line 339
    return-object v5

    .line 340
    :cond_10
    :goto_8
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 341
    .line 342
    return-object v0

    .line 343
    :cond_11
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 344
    .line 345
    return-object v0
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
.end method

.method public static final b(Lokio/u;Lokio/d1;Lokio/d1;)V
    .locals 4
    .param p0    # Lokio/u;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lokio/d1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lokio/d1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "source"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "target"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lokio/u;->M(Lokio/d1;)Lokio/n1;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v0, 0x0

    .line 21
    :try_start_0
    invoke-virtual {p0, p2}, Lokio/u;->J(Lokio/d1;)Lokio/l1;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Lokio/y0;->d(Lokio/l1;)Lokio/m;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 30
    .line 31
    :try_start_1
    move-object p2, p0

    .line 32
    check-cast p2, Lokio/m;

    .line 33
    .line 34
    invoke-interface {p2, p1}, Lokio/m;->G(Lokio/n1;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 39
    .line 40
    .line 41
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto :goto_2

    .line 50
    :cond_0
    :goto_0
    move-object p0, v0

    .line 51
    goto :goto_2

    .line 52
    :catchall_1
    move-exception p2

    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    :try_start_3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_2
    move-exception p0

    .line 60
    :try_start_4
    invoke-static {p2, p0}, Lkotlin/o;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    :goto_1
    move-object p0, p2

    .line 64
    move-object p2, v0

    .line 65
    :goto_2
    if-nez p0, :cond_2

    .line 66
    .line 67
    invoke-static {p2}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v1

    .line 74
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 78
    if-eqz p1, :cond_4

    .line 79
    .line 80
    :try_start_5
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 81
    .line 82
    .line 83
    goto :goto_4

    .line 84
    :catchall_3
    move-exception v0

    .line 85
    goto :goto_4

    .line 86
    :cond_2
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 87
    :catchall_4
    move-exception p0

    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    :try_start_7
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :catchall_5
    move-exception p1

    .line 95
    invoke-static {p0, p1}, Lkotlin/o;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    :goto_3
    move-object v3, v0

    .line 99
    move-object v0, p0

    .line 100
    move-object p0, v3

    .line 101
    :cond_4
    :goto_4
    if-nez v0, :cond_5

    .line 102
    .line 103
    invoke-static {p0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_5
    throw v0
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

.method public static final c(Lokio/u;Lokio/d1;Z)V
    .locals 3
    .param p0    # Lokio/u;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lokio/d1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "dir"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lkotlin/collections/k;

    .line 12
    .line 13
    invoke-direct {v0}, Lkotlin/collections/k;-><init>()V

    .line 14
    .line 15
    .line 16
    move-object v1, p1

    .line 17
    :goto_0
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lokio/u;->w(Lokio/d1;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lkotlin/collections/k;->addFirst(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lokio/d1;->v()Lokio/d1;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    if-eqz p2, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Lkotlin/collections/k;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-nez p2, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p0, Ljava/io/IOException;

    .line 43
    .line 44
    new-instance p2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p1, " already exists."

    .line 53
    .line 54
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-eqz p2, :cond_3

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    check-cast p2, Lokio/d1;

    .line 80
    .line 81
    invoke-virtual {p0, p2}, Lokio/u;->m(Lokio/d1;)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    return-void
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

.method public static final d(Lokio/u;Lokio/d1;Z)V
    .locals 2
    .param p0    # Lokio/u;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lokio/d1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileOrDirectory"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lokio/internal/c$b;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, p1, v1}, Lokio/internal/c$b;-><init>(Lokio/u;Lokio/d1;Lkotlin/coroutines/d;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/sequences/p;->b(Lv3/p;)Lkotlin/sequences/m;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p1}, Lkotlin/sequences/m;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lokio/d1;

    .line 36
    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_0

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    const/4 v1, 0x0

    .line 48
    :goto_1
    invoke-virtual {p0, v0, v1}, Lokio/u;->r(Lokio/d1;Z)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    return-void
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

.method public static final e(Lokio/u;Lokio/d1;)Z
    .locals 1
    .param p0    # Lokio/u;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lokio/d1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lokio/u;->E(Lokio/d1;)Lokio/t;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    :goto_0
    return p0
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
.end method

.method public static final f(Lokio/u;Lokio/d1;Z)Lkotlin/sequences/m;
    .locals 2
    .param p0    # Lokio/u;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lokio/d1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokio/u;",
            "Lokio/d1;",
            "Z)",
            "Lkotlin/sequences/m<",
            "Lokio/d1;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "dir"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lokio/internal/c$c;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p1, p0, p2, v1}, Lokio/internal/c$c;-><init>(Lokio/d1;Lokio/u;ZLkotlin/coroutines/d;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/sequences/p;->b(Lv3/p;)Lkotlin/sequences/m;

    .line 18
    .line 19
    .line 20
    move-result-object p0

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
.end method

.method public static final g(Lokio/u;Lokio/d1;)Lokio/t;
    .locals 2
    .param p0    # Lokio/u;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lokio/d1;
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
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lokio/u;->E(Lokio/d1;)Lokio/t;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance p0, Ljava/io/FileNotFoundException;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v1, "no such file: "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {p0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p0
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
.end method

.method public static final h(Lokio/u;Lokio/d1;)Lokio/d1;
    .locals 1
    .param p0    # Lokio/u;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lokio/d1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lokio/u;->D(Lokio/d1;)Lokio/t;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lokio/t;->i()Lokio/d1;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_0
    invoke-virtual {p1}, Lokio/d1;->v()Lokio/d1;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p0}, Lokio/d1;->B(Lokio/d1;)Lokio/d1;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
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
.end method
