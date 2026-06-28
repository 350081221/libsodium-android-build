.class public Lcom/huawei/secure/android/common/util/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "ZipUtil"

.field private static final b:I = 0x6400000

.field private static final c:I = 0x64

.field private static final d:I = 0x1000

.field private static final e:Ljava/lang/String; = ".."

.field private static final f:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const-string v0, "..\\"

    .line 2
    .line 3
    const-string v1, "../"

    .line 4
    .line 5
    const-string v2, "./"

    .line 6
    .line 7
    const-string v3, ".\\.\\"

    .line 8
    .line 9
    const-string v4, "%00"

    .line 10
    .line 11
    const-string v5, "..%2F"

    .line 12
    .line 13
    const-string v6, "..%5C"

    .line 14
    .line 15
    const-string v7, ".%2F"

    .line 16
    .line 17
    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/huawei/secure/android/common/util/m;->f:[Ljava/lang/String;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/io/File;Ljava/io/File;JZZ)Ljava/util/List;
    .locals 16
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/io/File;",
            "JZZ)",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v1, :cond_e

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_10

    .line 11
    .line 12
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v8, "ZipUtil"

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    if-nez p5, :cond_1

    .line 21
    .line 22
    :try_start_0
    new-instance v0, Ljava/util/zip/ZipFile;

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    move-object v10, v0

    .line 28
    goto :goto_1

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto/16 :goto_f

    .line 31
    .line 32
    :catch_0
    move-exception v0

    .line 33
    const/4 v9, 0x0

    .line 34
    goto/16 :goto_c

    .line 35
    .line 36
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v5, "not a utf8 zip file, use gbk open zip file : "

    .line 42
    .line 43
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v8, v0}, Lcom/huawei/secure/android/common/util/e;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Ljava/util/zip/ZipFile;

    .line 57
    .line 58
    const-string v5, "GBK"

    .line 59
    .line 60
    invoke-static {v5}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-direct {v0, v1, v5}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :goto_1
    :try_start_1
    invoke-virtual {v10}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    .line 69
    .line 70
    .line 71
    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_a

    .line 72
    move v11, v4

    .line 73
    const/4 v4, 0x0

    .line 74
    :cond_2
    :goto_2
    :try_start_2
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 75
    .line 76
    .line 77
    move-result v5
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_9

    .line 78
    if-eqz v5, :cond_b

    .line 79
    .line 80
    :try_start_3
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    check-cast v5, Ljava/util/zip/ZipEntry;
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_9

    .line 85
    .line 86
    :try_start_4
    invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    if-eqz v12, :cond_3

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    sget-object v12, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    .line 98
    .line 99
    invoke-static {v6, v12}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-static {v6}, Lcom/huawei/secure/android/common/util/m;->o(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v12
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_9

    .line 107
    if-eqz v12, :cond_4

    .line 108
    .line 109
    :try_start_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v1, "zipPath is a invalid path: "

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-static {v6}, Lcom/huawei/secure/android/common/util/m;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 131
    .line 132
    .line 133
    move-object/from16 p5, v10

    .line 134
    .line 135
    const/4 v9, 0x0

    .line 136
    goto/16 :goto_8

    .line 137
    .line 138
    :catchall_1
    move-exception v0

    .line 139
    move-object v3, v10

    .line 140
    goto/16 :goto_a

    .line 141
    .line 142
    :cond_4
    :try_start_6
    const-string v12, "\\\\"

    .line 143
    .line 144
    const-string v13, "/"

    .line 145
    .line 146
    invoke-virtual {v6, v12, v13}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    new-instance v12, Ljava/io/File;

    .line 151
    .line 152
    invoke-direct {v12, v2, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_9

    .line 153
    .line 154
    .line 155
    if-eqz p4, :cond_5

    .line 156
    .line 157
    :try_start_7
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    if-eqz v6, :cond_5

    .line 162
    .line 163
    invoke-virtual {v12}, Ljava/io/File;->isFile()Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-eqz v6, :cond_5

    .line 168
    .line 169
    invoke-static {v12}, Lcom/huawei/secure/android/common/util/m;->n(Ljava/io/File;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 170
    .line 171
    .line 172
    :cond_5
    :try_start_8
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 176
    .line 177
    .line 178
    move-result v6
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_9

    .line 179
    if-eqz v6, :cond_6

    .line 180
    .line 181
    :try_start_9
    invoke-static {v12}, Lcom/huawei/secure/android/common/util/m;->d(Ljava/io/File;)Z

    .line 182
    .line 183
    .line 184
    move-result v5
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 185
    if-nez v5, :cond_2

    .line 186
    .line 187
    invoke-static {v10}, Lcom/huawei/secure/android/common/util/d;->b(Ljava/io/Closeable;)V

    .line 188
    .line 189
    .line 190
    invoke-static {v7}, Lcom/huawei/secure/android/common/util/m;->g(Ljava/util/List;)Z

    .line 191
    .line 192
    .line 193
    return-object v3

    .line 194
    :cond_6
    :try_start_a
    invoke-static {v12}, Lcom/huawei/secure/android/common/util/m;->i(Ljava/io/File;)Z

    .line 195
    .line 196
    .line 197
    move-result v6
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 198
    if-nez v6, :cond_7

    .line 199
    .line 200
    invoke-static {v10}, Lcom/huawei/secure/android/common/util/d;->b(Ljava/io/Closeable;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v7}, Lcom/huawei/secure/android/common/util/m;->g(Ljava/util/List;)Z

    .line 204
    .line 205
    .line 206
    return-object v3

    .line 207
    :cond_7
    :try_start_b
    new-instance v6, Ljava/io/BufferedInputStream;

    .line 208
    .line 209
    invoke-virtual {v10, v5}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    invoke-direct {v6, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 214
    .line 215
    .line 216
    :try_start_c
    new-instance v5, Ljava/io/FileOutputStream;

    .line 217
    .line 218
    invoke-direct {v5, v12}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 219
    .line 220
    .line 221
    :try_start_d
    new-instance v12, Ljava/io/BufferedOutputStream;

    .line 222
    .line 223
    invoke-direct {v12, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 224
    .line 225
    .line 226
    const/16 v13, 0x400

    .line 227
    .line 228
    :try_start_e
    new-array v13, v13, [B

    .line 229
    .line 230
    :goto_3
    invoke-virtual {v6, v13}, Ljava/io/InputStream;->read([B)I

    .line 231
    .line 232
    .line 233
    move-result v14
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 234
    const/4 v15, -0x1

    .line 235
    if-eq v14, v15, :cond_9

    .line 236
    .line 237
    add-int/2addr v4, v14

    .line 238
    move-object/from16 p5, v10

    .line 239
    .line 240
    int-to-long v9, v4

    .line 241
    cmp-long v9, v9, p2

    .line 242
    .line 243
    if-lez v9, :cond_8

    .line 244
    .line 245
    :try_start_f
    const-string v9, "unzipFileNew: over than top size"

    .line 246
    .line 247
    invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 248
    .line 249
    .line 250
    const/4 v9, 0x0

    .line 251
    const/4 v11, 0x0

    .line 252
    goto :goto_4

    .line 253
    :catchall_2
    move-exception v0

    .line 254
    goto :goto_5

    .line 255
    :cond_8
    const/4 v9, 0x0

    .line 256
    :try_start_10
    invoke-virtual {v12, v13, v9, v14}, Ljava/io/OutputStream;->write([BII)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    .line 257
    .line 258
    .line 259
    move-object/from16 v10, p5

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :catchall_3
    move-exception v0

    .line 263
    goto :goto_6

    .line 264
    :cond_9
    move-object/from16 p5, v10

    .line 265
    .line 266
    const/4 v9, 0x0

    .line 267
    :goto_4
    :try_start_11
    invoke-static {v6}, Lcom/huawei/secure/android/common/util/d;->c(Ljava/io/InputStream;)V

    .line 268
    .line 269
    .line 270
    invoke-static {v12}, Lcom/huawei/secure/android/common/util/d;->d(Ljava/io/OutputStream;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v5}, Lcom/huawei/secure/android/common/util/d;->d(Ljava/io/OutputStream;)V

    .line 274
    .line 275
    .line 276
    move-object/from16 v10, p5

    .line 277
    .line 278
    goto/16 :goto_2

    .line 279
    .line 280
    :catchall_4
    move-exception v0

    .line 281
    move-object/from16 p5, v10

    .line 282
    .line 283
    :goto_5
    const/4 v9, 0x0

    .line 284
    goto :goto_6

    .line 285
    :catchall_5
    move-exception v0

    .line 286
    move-object/from16 p5, v10

    .line 287
    .line 288
    const/4 v9, 0x0

    .line 289
    move-object v12, v3

    .line 290
    :goto_6
    move-object v3, v5

    .line 291
    goto :goto_7

    .line 292
    :catchall_6
    move-exception v0

    .line 293
    move-object/from16 p5, v10

    .line 294
    .line 295
    const/4 v9, 0x0

    .line 296
    move-object v12, v3

    .line 297
    goto :goto_7

    .line 298
    :catchall_7
    move-exception v0

    .line 299
    move-object/from16 p5, v10

    .line 300
    .line 301
    const/4 v9, 0x0

    .line 302
    move-object v6, v3

    .line 303
    move-object v12, v6

    .line 304
    :goto_7
    invoke-static {v6}, Lcom/huawei/secure/android/common/util/d;->c(Ljava/io/InputStream;)V

    .line 305
    .line 306
    .line 307
    invoke-static {v12}, Lcom/huawei/secure/android/common/util/d;->d(Ljava/io/OutputStream;)V

    .line 308
    .line 309
    .line 310
    invoke-static {v3}, Lcom/huawei/secure/android/common/util/d;->d(Ljava/io/OutputStream;)V

    .line 311
    .line 312
    .line 313
    throw v0

    .line 314
    :catch_1
    move-exception v0

    .line 315
    move-object/from16 p5, v10

    .line 316
    .line 317
    const/4 v9, 0x0

    .line 318
    new-instance v3, Ljava/lang/StringBuilder;

    .line 319
    .line 320
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 321
    .line 322
    .line 323
    const-string v4, "not a utf8 zip file, IllegalArgumentException : "

    .line 324
    .line 325
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-static {v8, v0}, Lcom/huawei/secure/android/common/util/e;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    const/4 v6, 0x1

    .line 343
    move-object/from16 v1, p0

    .line 344
    .line 345
    move-object/from16 v2, p1

    .line 346
    .line 347
    move-wide/from16 v3, p2

    .line 348
    .line 349
    move/from16 v5, p4

    .line 350
    .line 351
    invoke-static/range {v1 .. v6}, Lcom/huawei/secure/android/common/util/m;->a(Ljava/io/File;Ljava/io/File;JZZ)Ljava/util/List;

    .line 352
    .line 353
    .line 354
    move-result-object v0
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_2
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 355
    invoke-static/range {p5 .. p5}, Lcom/huawei/secure/android/common/util/d;->b(Ljava/io/Closeable;)V

    .line 356
    .line 357
    .line 358
    if-nez v11, :cond_a

    .line 359
    .line 360
    invoke-static {v7}, Lcom/huawei/secure/android/common/util/m;->g(Ljava/util/List;)Z

    .line 361
    .line 362
    .line 363
    :cond_a
    return-object v0

    .line 364
    :catchall_8
    move-exception v0

    .line 365
    goto :goto_9

    .line 366
    :catch_2
    move-exception v0

    .line 367
    goto :goto_b

    .line 368
    :cond_b
    move-object/from16 p5, v10

    .line 369
    .line 370
    move v9, v11

    .line 371
    :goto_8
    invoke-static/range {p5 .. p5}, Lcom/huawei/secure/android/common/util/d;->b(Ljava/io/Closeable;)V

    .line 372
    .line 373
    .line 374
    if-nez v9, :cond_c

    .line 375
    .line 376
    invoke-static {v7}, Lcom/huawei/secure/android/common/util/m;->g(Ljava/util/List;)Z

    .line 377
    .line 378
    .line 379
    goto :goto_d

    .line 380
    :catchall_9
    move-exception v0

    .line 381
    move-object/from16 p5, v10

    .line 382
    .line 383
    :goto_9
    move-object/from16 v3, p5

    .line 384
    .line 385
    :goto_a
    move v9, v11

    .line 386
    goto :goto_e

    .line 387
    :catchall_a
    move-exception v0

    .line 388
    move-object/from16 p5, v10

    .line 389
    .line 390
    move-object/from16 v3, p5

    .line 391
    .line 392
    move v9, v4

    .line 393
    goto :goto_e

    .line 394
    :catch_3
    move-exception v0

    .line 395
    move-object/from16 p5, v10

    .line 396
    .line 397
    const/4 v9, 0x0

    .line 398
    :goto_b
    move-object/from16 v3, p5

    .line 399
    .line 400
    :goto_c
    :try_start_12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 401
    .line 402
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 403
    .line 404
    .line 405
    const-string v2, "unzip new IOException : "

    .line 406
    .line 407
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-static {v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_b

    .line 422
    .line 423
    .line 424
    invoke-static {v3}, Lcom/huawei/secure/android/common/util/d;->b(Ljava/io/Closeable;)V

    .line 425
    .line 426
    .line 427
    invoke-static {v7}, Lcom/huawei/secure/android/common/util/m;->g(Ljava/util/List;)Z

    .line 428
    .line 429
    .line 430
    :cond_c
    :goto_d
    return-object v7

    .line 431
    :catchall_b
    move-exception v0

    .line 432
    :goto_e
    move v4, v9

    .line 433
    :goto_f
    invoke-static {v3}, Lcom/huawei/secure/android/common/util/d;->b(Ljava/io/Closeable;)V

    .line 434
    .line 435
    .line 436
    if-nez v4, :cond_d

    .line 437
    .line 438
    invoke-static {v7}, Lcom/huawei/secure/android/common/util/m;->g(Ljava/util/List;)Z

    .line 439
    .line 440
    .line 441
    :cond_d
    throw v0

    .line 442
    :cond_e
    :goto_10
    return-object v3
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
.end method

.method private static b(Ljava/io/FileInputStream;Ljava/io/BufferedOutputStream;Ljava/util/zip/ZipInputStream;Ljava/io/FileOutputStream;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/huawei/secure/android/common/util/d;->c(Ljava/io/InputStream;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/huawei/secure/android/common/util/d;->d(Ljava/io/OutputStream;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lcom/huawei/secure/android/common/util/d;->c(Ljava/io/InputStream;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p3}, Lcom/huawei/secure/android/common/util/d;->d(Ljava/io/OutputStream;)V

    .line 11
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
.end method

.method private static c(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Lcom/huawei/secure/android/common/util/m;->o(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "ZipUtil"

    .line 15
    .line 16
    const-string v0, "IllegalArgumentException--path is not a standard path"

    .line 17
    .line 18
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    const-string v0, "path is not a standard path"

    .line 24
    .line 25
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p0

    .line 29
    :cond_1
    :goto_0
    return-void
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
.end method

.method private static d(Ljava/io/File;)Z
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    move-result p0

    if-eqz p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method private static e(Ljava/lang/String;JIZ)Z
    .locals 11
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x18
    .end annotation

    .line 1
    const-string v0, "close zipFile IOException "

    .line 2
    .line 3
    const-string v1, "ZipUtil"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    if-nez p4, :cond_0

    .line 8
    .line 9
    :try_start_0
    new-instance p4, Ljava/util/zip/ZipFile;

    .line 10
    .line 11
    invoke-direct {p4, p0}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    move-object v2, p4

    .line 15
    goto :goto_1

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_0
    new-instance p4, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v4, "not a utf8 zip file, use gbk open zip file : "

    .line 25
    .line 26
    invoke-virtual {p4, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p4

    .line 36
    invoke-static {v1, p4}, Lcom/huawei/secure/android/common/util/e;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance p4, Ljava/util/zip/ZipFile;

    .line 40
    .line 41
    const-string v4, "GBK"

    .line 42
    .line 43
    invoke-static {v4}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-direct {p4, p0, v4}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :goto_1
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    .line 52
    .line 53
    .line 54
    move-result-object p4

    .line 55
    const-wide/16 v4, 0x0

    .line 56
    .line 57
    move v6, v3

    .line 58
    :cond_1
    invoke-interface {p4}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 59
    .line 60
    .line 61
    move-result v7
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    const/4 v8, 0x1

    .line 63
    if-eqz v7, :cond_3

    .line 64
    .line 65
    :try_start_1
    invoke-interface {p4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    check-cast v7, Ljava/util/zip/ZipEntry;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    :try_start_2
    invoke-virtual {v7}, Ljava/util/zip/ZipEntry;->getSize()J

    .line 72
    .line 73
    .line 74
    move-result-wide v9

    .line 75
    add-long/2addr v4, v9

    .line 76
    add-int/2addr v6, v8

    .line 77
    invoke-virtual {v7}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-static {v8}, Lcom/huawei/secure/android/common/util/m;->o(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-nez v8, :cond_2

    .line 86
    .line 87
    if-ge v6, p3, :cond_2

    .line 88
    .line 89
    cmp-long v8, v4, p1

    .line 90
    .line 91
    if-gtz v8, :cond_2

    .line 92
    .line 93
    invoke-virtual {v7}, Ljava/util/zip/ZipEntry;->getSize()J

    .line 94
    .line 95
    .line 96
    move-result-wide v7

    .line 97
    const-wide/16 v9, -0x1

    .line 98
    .line 99
    cmp-long v7, v7, v9

    .line 100
    .line 101
    if-nez v7, :cond_1

    .line 102
    .line 103
    :cond_2
    const-string p0, "File name is invalid or too many files or too big"

    .line 104
    .line 105
    invoke-static {v1, p0}, Lcom/huawei/secure/android/common/util/e;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :catch_0
    move-exception p4

    .line 110
    new-instance v4, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v5, "not a utf8 zip file, IllegalArgumentException : "

    .line 116
    .line 117
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p4

    .line 124
    invoke-virtual {v4, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p4

    .line 131
    invoke-static {v1, p4}, Lcom/huawei/secure/android/common/util/e;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {p0, p1, p2, p3, v8}, Lcom/huawei/secure/android/common/util/m;->e(Ljava/lang/String;JIZ)Z

    .line 135
    .line 136
    .line 137
    move-result p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 138
    move v3, p0

    .line 139
    goto :goto_2

    .line 140
    :cond_3
    move v3, v8

    .line 141
    :goto_2
    :try_start_3
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :catch_1
    move-exception p0

    .line 146
    :try_start_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    const-string p2, "not a valid zip file, IOException : "

    .line 152
    .line 153
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-static {v1, p0}, Lcom/huawei/secure/android/common/util/e;->l(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 168
    .line 169
    .line 170
    if-eqz v2, :cond_4

    .line 171
    .line 172
    :try_start_5
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :catch_2
    invoke-static {v1, v0}, Lcom/huawei/secure/android/common/util/e;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :cond_4
    :goto_3
    return v3

    .line 180
    :goto_4
    if-eqz v2, :cond_5

    .line 181
    .line 182
    :try_start_6
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :catch_3
    invoke-static {v1, v0}, Lcom/huawei/secure/android/common/util/e;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    :cond_5
    :goto_5
    throw p0
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
.end method

.method private static f(Ljava/lang/String;Ljava/lang/String;JI)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/secure/android/common/util/k;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "ZipUtil"

    .line 7
    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    invoke-static {p0}, Lcom/huawei/secure/android/common/util/m;->o(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_3

    .line 22
    .line 23
    invoke-static {p1}, Lcom/huawei/secure/android/common/util/m;->o(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-static {p0, p2, p3, p4, v1}, Lcom/huawei/secure/android/common/util/m;->e(Ljava/lang/String;JIZ)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_2
    const-string p0, "zip file contains valid chars or too many files"

    .line 39
    .line 40
    invoke-static {v2, p0}, Lcom/huawei/secure/android/common/util/e;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance p0, Lcom/huawei/secure/android/common/util/k;

    .line 44
    .line 45
    const-string p1, "unsecure zipfile!"

    .line 46
    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/secure/android/common/util/k;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0

    .line 51
    :cond_3
    :goto_0
    const-string p0, "target directory is not valid"

    .line 52
    .line 53
    invoke-static {v2, p0}, Lcom/huawei/secure/android/common/util/e;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return v1

    .line 57
    :cond_4
    :goto_1
    const-string p0, "zip file is not valid"

    .line 58
    .line 59
    invoke-static {v2, p0}, Lcom/huawei/secure/android/common/util/e;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return v1
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
.end method

.method private static g(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;)Z"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/io/File;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/huawei/secure/android/common/util/m;->n(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :catch_0
    move-exception p0

    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v1, "unzip fail delete file failed"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string v0, "ZipUtil"

    .line 46
    .line 47
    invoke-static {v0, p0}, Lcom/huawei/secure/android/common/util/e;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return p0
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
.end method

.method private static h(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/huawei/secure/android/common/util/m;->c(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/File;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-object v0
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
.end method

.method private static i(Ljava/io/File;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Lcom/huawei/secure/android/common/util/m;->d(Ljava/io/File;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    return v0

    .line 27
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->createNewFile()Z

    .line 28
    .line 29
    .line 30
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    return p0

    .line 32
    :catch_0
    const-string p0, "ZipUtil"

    .line 33
    .line 34
    const-string v1, "createOrExistsFile IOException "

    .line 35
    .line 36
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    return v0
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
.end method

.method private static j(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/huawei/secure/android/common/util/m;->h(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static k(Ljava/io/File;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-nez p0, :cond_1

    .line 9
    .line 10
    const-string p0, "ZipUtil"

    .line 11
    .line 12
    const-string v0, "delete file error"

    .line 13
    .line 14
    invoke-static {p0, v0}, Lcom/huawei/secure/android/common/util/e;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
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

.method private static l(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, -0x1

    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    return-object p0
    .line 25
    .line 26
    .line 27
.end method

.method private static m(Ljava/io/File;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    const-string p0, "ZipUtil"

    .line 17
    .line 18
    const-string v0, "mkdirs error , files exists or IOException."

    .line 19
    .line 20
    invoke-static {p0, v0}, Lcom/huawei/secure/android/common/util/e;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private static n(Ljava/io/File;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-static {p0}, Lcom/huawei/secure/android/common/util/m;->k(Ljava/io/File;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_5

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    array-length v1, v0

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    array-length v1, v0

    .line 31
    const/4 v2, 0x0

    .line 32
    :goto_0
    if-ge v2, v1, :cond_3

    .line 33
    .line 34
    aget-object v3, v0, v2

    .line 35
    .line 36
    invoke-static {v3}, Lcom/huawei/secure/android/common/util/m;->n(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    invoke-static {p0}, Lcom/huawei/secure/android/common/util/m;->k(Ljava/io/File;)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_4
    :goto_1
    invoke-static {p0}, Lcom/huawei/secure/android/common/util/m;->k(Ljava/io/File;)V

    .line 47
    .line 48
    .line 49
    :cond_5
    :goto_2
    return-void
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
.end method

.method private static o(Ljava/lang/String;)Z
    .locals 6

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string p0, "ZipUtil"

    .line 9
    .line 10
    const-string v0, "isContainInvalidStr: name is null"

    .line 11
    .line 12
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    const-string v0, ".."

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x1

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    return v2

    .line 26
    :cond_1
    sget-object v0, Lcom/huawei/secure/android/common/util/m;->f:[Ljava/lang/String;

    .line 27
    .line 28
    array-length v3, v0

    .line 29
    move v4, v1

    .line 30
    :goto_0
    if-ge v4, v3, :cond_3

    .line 31
    .line 32
    aget-object v5, v0, v4

    .line 33
    .line 34
    invoke-virtual {p0, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    return v2

    .line 41
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    return v1
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
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;JIZ)Z
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/secure/android/common/util/k;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "ZipUtil"

    .line 4
    .line 5
    invoke-static/range {p0 .. p4}, Lcom/huawei/secure/android/common/util/m;->f(Ljava/lang/String;Ljava/lang/String;JI)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    return v3

    .line 13
    :cond_0
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-le v4, v5, :cond_1

    .line 30
    .line 31
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    sub-int/2addr v4, v2

    .line 40
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_1
    const/16 v2, 0x1000

    .line 45
    .line 46
    new-array v4, v2, [B

    .line 47
    .line 48
    new-instance v5, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    :try_start_0
    new-instance v7, Ljava/io/FileInputStream;

    .line 55
    .line 56
    move-object/from16 v8, p0

    .line 57
    .line 58
    invoke-direct {v7, v8}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 59
    .line 60
    .line 61
    :try_start_1
    new-instance v8, Ljava/util/zip/ZipInputStream;

    .line 62
    .line 63
    new-instance v9, Ljava/io/BufferedInputStream;

    .line 64
    .line 65
    invoke-direct {v9, v7}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {v8, v9}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 69
    .line 70
    .line 71
    const/4 v9, 0x1

    .line 72
    move v11, v3

    .line 73
    move v10, v9

    .line 74
    move-object v9, v6

    .line 75
    :goto_0
    :try_start_2
    invoke-virtual {v8}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    if-eqz v12, :cond_8

    .line 80
    .line 81
    invoke-virtual {v12}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    const-string v14, "\\\\"

    .line 86
    .line 87
    const-string v15, "/"

    .line 88
    .line 89
    invoke-virtual {v13, v14, v15}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v13

    .line 93
    new-instance v14, Ljava/io/File;

    .line 94
    .line 95
    invoke-direct {v14, v0, v13}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    sget-object v15, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    .line 99
    .line 100
    invoke-static {v13, v15}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v13

    .line 104
    invoke-static {v13}, Lcom/huawei/secure/android/common/util/m;->o(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v15

    .line 108
    if-eqz v15, :cond_2

    .line 109
    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v2, "zipPath is a invalid path: "

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-static {v13}, Lcom/huawei/secure/android/common/util/m;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move v2, v3

    .line 135
    move v10, v2

    .line 136
    goto/16 :goto_6

    .line 137
    .line 138
    :cond_2
    if-eqz p5, :cond_3

    .line 139
    .line 140
    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    if-eqz v13, :cond_3

    .line 145
    .line 146
    invoke-virtual {v14}, Ljava/io/File;->isFile()Z

    .line 147
    .line 148
    .line 149
    move-result v13

    .line 150
    if-eqz v13, :cond_3

    .line 151
    .line 152
    invoke-static {v14}, Lcom/huawei/secure/android/common/util/m;->n(Ljava/io/File;)V

    .line 153
    .line 154
    .line 155
    :cond_3
    invoke-virtual {v12}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 156
    .line 157
    .line 158
    move-result v12

    .line 159
    if-eqz v12, :cond_4

    .line 160
    .line 161
    invoke-static {v14}, Lcom/huawei/secure/android/common/util/m;->m(Ljava/io/File;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v5, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move v2, v3

    .line 168
    goto :goto_3

    .line 169
    :cond_4
    invoke-virtual {v14}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    if-eqz v12, :cond_5

    .line 174
    .line 175
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    .line 176
    .line 177
    .line 178
    move-result v13

    .line 179
    if-nez v13, :cond_5

    .line 180
    .line 181
    invoke-static {v12}, Lcom/huawei/secure/android/common/util/m;->m(Ljava/io/File;)V

    .line 182
    .line 183
    .line 184
    :cond_5
    new-instance v12, Ljava/io/FileOutputStream;

    .line 185
    .line 186
    invoke-direct {v12, v14}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 187
    .line 188
    .line 189
    :try_start_3
    new-instance v9, Ljava/io/BufferedOutputStream;

    .line 190
    .line 191
    invoke-direct {v9, v12}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 192
    .line 193
    .line 194
    :goto_1
    :try_start_4
    invoke-virtual {v8, v4, v3, v2}, Ljava/util/zip/ZipInputStream;->read([BII)I

    .line 195
    .line 196
    .line 197
    move-result v6
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 198
    const/4 v13, -0x1

    .line 199
    if-eq v6, v13, :cond_7

    .line 200
    .line 201
    add-int/2addr v11, v6

    .line 202
    int-to-long v2, v11

    .line 203
    cmp-long v2, v2, p2

    .line 204
    .line 205
    if-lez v2, :cond_6

    .line 206
    .line 207
    :try_start_5
    const-string v2, "unzip  over than top size"

    .line 208
    .line 209
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 210
    .line 211
    .line 212
    const/4 v2, 0x0

    .line 213
    const/4 v10, 0x0

    .line 214
    goto :goto_2

    .line 215
    :catch_0
    move-exception v0

    .line 216
    move-object v6, v12

    .line 217
    const/4 v2, 0x0

    .line 218
    goto :goto_5

    .line 219
    :cond_6
    const/4 v2, 0x0

    .line 220
    :try_start_6
    invoke-virtual {v9, v4, v2, v6}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 221
    .line 222
    .line 223
    move v3, v2

    .line 224
    const/16 v2, 0x1000

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_7
    move v2, v3

    .line 228
    :goto_2
    invoke-interface {v5, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    invoke-virtual {v9}, Ljava/io/BufferedOutputStream;->flush()V

    .line 232
    .line 233
    .line 234
    invoke-static {v9}, Lcom/huawei/secure/android/common/util/d;->d(Ljava/io/OutputStream;)V

    .line 235
    .line 236
    .line 237
    invoke-static {v12}, Lcom/huawei/secure/android/common/util/d;->d(Ljava/io/OutputStream;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 238
    .line 239
    .line 240
    move-object v6, v9

    .line 241
    move-object v9, v12

    .line 242
    :goto_3
    :try_start_7
    invoke-virtual {v8}, Ljava/util/zip/ZipInputStream;->closeEntry()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 243
    .line 244
    .line 245
    move v3, v2

    .line 246
    const/16 v2, 0x1000

    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :catchall_0
    move-exception v0

    .line 251
    goto :goto_7

    .line 252
    :catch_1
    move-exception v0

    .line 253
    move-object/from16 v16, v9

    .line 254
    .line 255
    move-object v9, v6

    .line 256
    move-object/from16 v6, v16

    .line 257
    .line 258
    goto :goto_5

    .line 259
    :catch_2
    move-exception v0

    .line 260
    goto :goto_4

    .line 261
    :catchall_1
    move-exception v0

    .line 262
    goto :goto_b

    .line 263
    :catch_3
    move-exception v0

    .line 264
    move v2, v3

    .line 265
    :goto_4
    move-object v6, v12

    .line 266
    :goto_5
    move-object v12, v6

    .line 267
    goto :goto_c

    .line 268
    :catchall_2
    move-exception v0

    .line 269
    goto :goto_8

    .line 270
    :catch_4
    move-exception v0

    .line 271
    move v2, v3

    .line 272
    goto :goto_a

    .line 273
    :cond_8
    move v2, v3

    .line 274
    :goto_6
    :try_start_8
    invoke-static {v8}, Lcom/huawei/secure/android/common/util/d;->c(Ljava/io/InputStream;)V

    .line 275
    .line 276
    .line 277
    invoke-static {v7}, Lcom/huawei/secure/android/common/util/d;->c(Ljava/io/InputStream;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 278
    .line 279
    .line 280
    move v3, v10

    .line 281
    goto :goto_e

    .line 282
    :catch_5
    move-exception v0

    .line 283
    goto :goto_9

    .line 284
    :goto_7
    move-object v12, v9

    .line 285
    :goto_8
    move-object v9, v6

    .line 286
    goto :goto_b

    .line 287
    :catch_6
    move-exception v0

    .line 288
    move v2, v3

    .line 289
    :goto_9
    move-object v12, v9

    .line 290
    :goto_a
    move-object v9, v6

    .line 291
    goto :goto_c

    .line 292
    :catchall_3
    move-exception v0

    .line 293
    move-object v8, v6

    .line 294
    move-object v9, v8

    .line 295
    move-object v12, v9

    .line 296
    :goto_b
    move-object v6, v7

    .line 297
    goto :goto_f

    .line 298
    :catch_7
    move-exception v0

    .line 299
    move v2, v3

    .line 300
    move-object v8, v6

    .line 301
    move-object v9, v8

    .line 302
    move-object v12, v9

    .line 303
    :goto_c
    move-object v6, v7

    .line 304
    goto :goto_d

    .line 305
    :catchall_4
    move-exception v0

    .line 306
    move-object v8, v6

    .line 307
    move-object v9, v8

    .line 308
    move-object v12, v9

    .line 309
    goto :goto_f

    .line 310
    :catch_8
    move-exception v0

    .line 311
    move v2, v3

    .line 312
    move-object v8, v6

    .line 313
    move-object v9, v8

    .line 314
    move-object v12, v9

    .line 315
    :goto_d
    :try_start_9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 318
    .line 319
    .line 320
    const-string v4, "Unzip IOException : "

    .line 321
    .line 322
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-static {v1, v0}, Lcom/huawei/secure/android/common/util/e;->l(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 337
    .line 338
    .line 339
    move v3, v2

    .line 340
    move-object v7, v6

    .line 341
    move-object v6, v9

    .line 342
    move-object v9, v12

    .line 343
    :goto_e
    invoke-static {v7, v6, v8, v9}, Lcom/huawei/secure/android/common/util/m;->b(Ljava/io/FileInputStream;Ljava/io/BufferedOutputStream;Ljava/util/zip/ZipInputStream;Ljava/io/FileOutputStream;)V

    .line 344
    .line 345
    .line 346
    if-nez v3, :cond_9

    .line 347
    .line 348
    invoke-static {v5}, Lcom/huawei/secure/android/common/util/m;->g(Ljava/util/List;)Z

    .line 349
    .line 350
    .line 351
    :cond_9
    return v3

    .line 352
    :catchall_5
    move-exception v0

    .line 353
    :goto_f
    invoke-static {v6, v9, v8, v12}, Lcom/huawei/secure/android/common/util/m;->b(Ljava/io/FileInputStream;Ljava/io/BufferedOutputStream;Ljava/util/zip/ZipInputStream;Ljava/io/FileOutputStream;)V

    .line 354
    .line 355
    .line 356
    throw v0
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
.end method

.method public static q(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/secure/android/common/util/k;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-wide/32 v2, 0x6400000

    const/16 v4, 0x64

    move-object v0, p0

    move-object v1, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, Lcom/huawei/secure/android/common/util/m;->p(Ljava/lang/String;Ljava/lang/String;JIZ)Z

    move-result p0

    return p0
.end method

.method public static r(Ljava/lang/String;Ljava/lang/String;JIZ)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JIZ)",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/secure/android/common/util/k;
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/huawei/secure/android/common/util/m;->f(Ljava/lang/String;Ljava/lang/String;JI)Z

    .line 2
    .line 3
    .line 4
    move-result p4

    .line 5
    if-nez p4, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    sget-object p4, Ljava/io/File;->separator:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, p4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-le v0, v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result p4

    .line 35
    sub-int/2addr v0, p4

    .line 36
    const/4 p4, 0x0

    .line 37
    invoke-virtual {p1, p4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :cond_1
    invoke-static {p0}, Lcom/huawei/secure/android/common/util/m;->j(Ljava/lang/String;)Ljava/io/File;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {p1}, Lcom/huawei/secure/android/common/util/m;->j(Ljava/lang/String;)Ljava/io/File;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/4 v5, 0x0

    .line 50
    move-wide v2, p2

    .line 51
    move v4, p5

    .line 52
    invoke-static/range {v0 .. v5}, Lcom/huawei/secure/android/common/util/m;->a(Ljava/io/File;Ljava/io/File;JZZ)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
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
.end method

.method public static s(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/secure/android/common/util/k;
        }
    .end annotation

    const-wide/32 v2, 0x6400000

    const/16 v4, 0x64

    move-object v0, p0

    move-object v1, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, Lcom/huawei/secure/android/common/util/m;->r(Ljava/lang/String;Ljava/lang/String;JIZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
