.class public Lcom/lody/virtual/helper/utils/ACache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/helper/utils/ACache$Utils;,
        Lcom/lody/virtual/helper/utils/ACache$ACacheManager;,
        Lcom/lody/virtual/helper/utils/ACache$xFileOutputStream;
    }
.end annotation


# static fields
.field private static final MAX_COUNT:I = 0x7fffffff

.field private static final MAX_SIZE:I = 0x2faf080

.field public static final TIME_DAY:I = 0x15180

.field public static final TIME_HOUR:I = 0xe10

.field private static mInstanceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/lody/virtual/helper/utils/ACache;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/lody/virtual/helper/utils/ACache;->mInstanceMap:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Ljava/io/File;JI)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p2, Ljava/lang/RuntimeException;

    .line 18
    .line 19
    new-instance p3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string p4, "can\'t make dirs in "

    .line 25
    .line 26
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p2

    .line 44
    :cond_1
    :goto_0
    new-instance v7, Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    move-object v0, v7

    .line 48
    move-object v1, p0

    .line 49
    move-object v2, p1

    .line 50
    move-wide v3, p2

    .line 51
    move v5, p4

    .line 52
    invoke-direct/range {v0 .. v6}, Lcom/lody/virtual/helper/utils/ACache$ACacheManager;-><init>(Lcom/lody/virtual/helper/utils/ACache;Ljava/io/File;JILcom/lody/virtual/helper/utils/ACache$1;)V

    .line 53
    .line 54
    .line 55
    iput-object v7, p0, Lcom/lody/virtual/helper/utils/ACache;->mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    .line 56
    .line 57
    return-void
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
.end method

.method static synthetic access$100(Lcom/lody/virtual/helper/utils/ACache;)Lcom/lody/virtual/helper/utils/ACache$ACacheManager;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/helper/utils/ACache;->mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    return-object p0
.end method

.method public static get(Landroid/content/Context;)Lcom/lody/virtual/helper/utils/ACache;
    .locals 1

    const-string v0, "ACache"

    .line 1
    invoke-static {p0, v0}, Lcom/lody/virtual/helper/utils/ACache;->get(Landroid/content/Context;Ljava/lang/String;)Lcom/lody/virtual/helper/utils/ACache;

    move-result-object p0

    return-object p0
.end method

.method public static get(Landroid/content/Context;JI)Lcom/lody/virtual/helper/utils/ACache;
    .locals 2

    .line 5
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    const-string v1, "ACache"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    invoke-static {v0, p1, p2, p3}, Lcom/lody/virtual/helper/utils/ACache;->get(Ljava/io/File;JI)Lcom/lody/virtual/helper/utils/ACache;

    move-result-object p0

    return-object p0
.end method

.method public static get(Landroid/content/Context;Ljava/lang/String;)Lcom/lody/virtual/helper/utils/ACache;
    .locals 2

    .line 2
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-wide/32 p0, 0x2faf080

    const v1, 0x7fffffff

    .line 3
    invoke-static {v0, p0, p1, v1}, Lcom/lody/virtual/helper/utils/ACache;->get(Ljava/io/File;JI)Lcom/lody/virtual/helper/utils/ACache;

    move-result-object p0

    return-object p0
.end method

.method public static get(Ljava/io/File;)Lcom/lody/virtual/helper/utils/ACache;
    .locals 3

    const-wide/32 v0, 0x2faf080

    const v2, 0x7fffffff

    .line 4
    invoke-static {p0, v0, v1, v2}, Lcom/lody/virtual/helper/utils/ACache;->get(Ljava/io/File;JI)Lcom/lody/virtual/helper/utils/ACache;

    move-result-object p0

    return-object p0
.end method

.method public static get(Ljava/io/File;JI)Lcom/lody/virtual/helper/utils/ACache;
    .locals 3

    .line 7
    sget-object v0, Lcom/lody/virtual/helper/utils/ACache;->mInstanceMap:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/lody/virtual/helper/utils/ACache;->myPid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/lody/virtual/helper/utils/ACache;

    if-nez v0, :cond_0

    .line 8
    new-instance v0, Lcom/lody/virtual/helper/utils/ACache;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/lody/virtual/helper/utils/ACache;-><init>(Ljava/io/File;JI)V

    .line 9
    sget-object p1, Lcom/lody/virtual/helper/utils/ACache;->mInstanceMap:Ljava/util/Map;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/lody/virtual/helper/utils/ACache;->myPid()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private static myPid()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/helper/utils/ACache;->mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    invoke-static {v0}, Lcom/lody/virtual/helper/utils/ACache$ACacheManager;->access$1600(Lcom/lody/virtual/helper/utils/ACache$ACacheManager;)V

    return-void
.end method

.method public file(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/utils/ACache;->mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/lody/virtual/helper/utils/ACache$ACacheManager;->access$300(Lcom/lody/virtual/helper/utils/ACache$ACacheManager;Ljava/lang/String;)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return-object p1
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

.method public get(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 10
    iget-object v0, p0, Lcom/lody/virtual/helper/utils/ACache;->mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    invoke-static {v0, p1}, Lcom/lody/virtual/helper/utils/ACache$ACacheManager;->access$500(Lcom/lody/virtual/helper/utils/ACache$ACacheManager;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 12
    :cond_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public getAsBinary(Ljava/lang/String;)[B
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/helper/utils/ACache;->mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    .line 3
    .line 4
    invoke-static {v1, p1}, Lcom/lody/virtual/helper/utils/ACache$ACacheManager;->access$500(Lcom/lody/virtual/helper/utils/ACache$ACacheManager;Ljava/lang/String;)Ljava/io/File;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v2, Ljava/io/RandomAccessFile;

    .line 16
    .line 17
    const-string v3, "r"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :try_start_1
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    long-to-int v1, v3

    .line 27
    new-array v1, v1, [B

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/io/RandomAccessFile;->read([B)I

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Lcom/lody/virtual/helper/utils/ACache$Utils;->access$900([B)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    invoke-static {v1}, Lcom/lody/virtual/helper/utils/ACache$Utils;->access$1000([B)[B

    .line 39
    .line 40
    .line 41
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    :try_start_2
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_0
    move-exception v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 48
    .line 49
    .line 50
    :goto_0
    return-object p1

    .line 51
    :cond_1
    :try_start_3
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catch_1
    move-exception v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-virtual {p0, p1}, Lcom/lody/virtual/helper/utils/ACache;->remove(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :catch_2
    move-exception p1

    .line 64
    goto :goto_2

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    goto :goto_4

    .line 67
    :catch_3
    move-exception p1

    .line 68
    move-object v2, v0

    .line 69
    :goto_2
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 70
    .line 71
    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    :try_start_5
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :catch_4
    move-exception p1

    .line 79
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 80
    .line 81
    .line 82
    :cond_2
    :goto_3
    return-object v0

    .line 83
    :catchall_1
    move-exception p1

    .line 84
    move-object v0, v2

    .line 85
    :goto_4
    if-eqz v0, :cond_3

    .line 86
    .line 87
    :try_start_6
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 88
    .line 89
    .line 90
    goto :goto_5

    .line 91
    :catch_5
    move-exception v0

    .line 92
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 93
    .line 94
    .line 95
    :cond_3
    :goto_5
    throw p1
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
.end method

.method public getAsBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/lody/virtual/helper/utils/ACache;->getAsBinary(Ljava/lang/String;)[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lcom/lody/virtual/helper/utils/ACache;->getAsBinary(Ljava/lang/String;)[B

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/ACache$Utils;->access$1200([B)Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public getAsDrawable(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/lody/virtual/helper/utils/ACache;->getAsBinary(Ljava/lang/String;)[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lcom/lody/virtual/helper/utils/ACache;->getAsBinary(Ljava/lang/String;)[B

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/ACache$Utils;->access$1200([B)Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/ACache$Utils;->access$1400(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getAsJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/lody/virtual/helper/utils/ACache;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return-object p1
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

.method public getAsJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/lody/virtual/helper/utils/ACache;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return-object p1
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

.method public getAsObject(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lcom/lody/virtual/helper/utils/ACache;->getAsBinary(Ljava/lang/String;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_4

    .line 7
    .line 8
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    .line 13
    :try_start_1
    new-instance p1, Ljava/io/ObjectInputStream;

    .line 14
    .line 15
    invoke-direct {p1, v1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    .line 17
    .line 18
    :try_start_2
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 22
    :try_start_3
    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 28
    .line 29
    .line 30
    :goto_0
    :try_start_4
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :catch_1
    move-exception p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    .line 37
    .line 38
    :goto_1
    return-object v0

    .line 39
    :catch_2
    move-exception v2

    .line 40
    goto :goto_2

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    move-object v3, v0

    .line 43
    move-object v0, p1

    .line 44
    move-object p1, v3

    .line 45
    goto :goto_5

    .line 46
    :catch_3
    move-exception v2

    .line 47
    move-object p1, v0

    .line 48
    goto :goto_2

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    move-object v1, v0

    .line 51
    move-object v0, p1

    .line 52
    move-object p1, v1

    .line 53
    goto :goto_5

    .line 54
    :catch_4
    move-exception v2

    .line 55
    move-object p1, v0

    .line 56
    move-object v1, p1

    .line 57
    :goto_2
    :try_start_5
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 58
    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    :try_start_6
    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :catch_5
    move-exception v1

    .line 67
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 68
    .line 69
    .line 70
    :cond_0
    :goto_3
    if-eqz p1, :cond_1

    .line 71
    .line 72
    :try_start_7
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 73
    .line 74
    .line 75
    goto :goto_4

    .line 76
    :catch_6
    move-exception p1

    .line 77
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 78
    .line 79
    .line 80
    :cond_1
    :goto_4
    return-object v0

    .line 81
    :catchall_2
    move-exception v0

    .line 82
    :goto_5
    if-eqz v1, :cond_2

    .line 83
    .line 84
    :try_start_8
    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 85
    .line 86
    .line 87
    goto :goto_6

    .line 88
    :catch_7
    move-exception v1

    .line 89
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 90
    .line 91
    .line 92
    :cond_2
    :goto_6
    if-eqz p1, :cond_3

    .line 93
    .line 94
    :try_start_9
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 95
    .line 96
    .line 97
    goto :goto_7

    .line 98
    :catch_8
    move-exception p1

    .line 99
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 100
    .line 101
    .line 102
    :cond_3
    :goto_7
    throw v0

    .line 103
    :cond_4
    return-object v0
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
.end method

.method public getAsString(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/utils/ACache;->mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/lody/virtual/helper/utils/ACache$ACacheManager;->access$500(Lcom/lody/virtual/helper/utils/ACache$ACacheManager;Ljava/lang/String;)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-object v2

    .line 15
    :cond_0
    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    .line 16
    .line 17
    new-instance v3, Ljava/io/FileReader;

    .line 18
    .line 19
    invoke-direct {v3, v0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    :try_start_1
    const-string v0, ""

    .line 26
    .line 27
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    new-instance v4, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/ACache$Utils;->access$600(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_2

    .line 54
    .line 55
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/ACache$Utils;->access$700(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catch_0
    move-exception v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 65
    .line 66
    .line 67
    :goto_1
    return-object p1

    .line 68
    :cond_2
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :catch_1
    move-exception v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 74
    .line 75
    .line 76
    :goto_2
    invoke-virtual {p0, p1}, Lcom/lody/virtual/helper/utils/ACache;->remove(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    return-object v2

    .line 80
    :catch_2
    move-exception p1

    .line 81
    goto :goto_3

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    goto :goto_5

    .line 84
    :catch_3
    move-exception p1

    .line 85
    move-object v1, v2

    .line 86
    :goto_3
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 87
    .line 88
    .line 89
    if-eqz v1, :cond_3

    .line 90
    .line 91
    :try_start_5
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 92
    .line 93
    .line 94
    goto :goto_4

    .line 95
    :catch_4
    move-exception p1

    .line 96
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_4
    return-object v2

    .line 100
    :catchall_1
    move-exception p1

    .line 101
    move-object v2, v1

    .line 102
    :goto_5
    if-eqz v2, :cond_4

    .line 103
    .line 104
    :try_start_6
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 105
    .line 106
    .line 107
    goto :goto_6

    .line 108
    :catch_5
    move-exception v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 110
    .line 111
    .line 112
    :cond_4
    :goto_6
    throw p1
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
.end method

.method public put(Ljava/lang/String;)Ljava/io/OutputStream;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 36
    new-instance v0, Lcom/lody/virtual/helper/utils/ACache$xFileOutputStream;

    iget-object v1, p0, Lcom/lody/virtual/helper/utils/ACache;->mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    invoke-static {v1, p1}, Lcom/lody/virtual/helper/utils/ACache$ACacheManager;->access$300(Lcom/lody/virtual/helper/utils/ACache$ACacheManager;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/lody/virtual/helper/utils/ACache$xFileOutputStream;-><init>(Lcom/lody/virtual/helper/utils/ACache;Ljava/io/File;)V

    return-object v0
.end method

.method public put(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 49
    invoke-static {p2}, Lcom/lody/virtual/helper/utils/ACache$Utils;->access$1100(Landroid/graphics/Bitmap;)[B

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/lody/virtual/helper/utils/ACache;->put(Ljava/lang/String;[B)V

    return-void
.end method

.method public put(Ljava/lang/String;Landroid/graphics/Bitmap;I)V
    .locals 0

    .line 50
    invoke-static {p2}, Lcom/lody/virtual/helper/utils/ACache$Utils;->access$1100(Landroid/graphics/Bitmap;)[B

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/lody/virtual/helper/utils/ACache;->put(Ljava/lang/String;[BI)V

    return-void
.end method

.method public put(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 51
    invoke-static {p2}, Lcom/lody/virtual/helper/utils/ACache$Utils;->access$1300(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/lody/virtual/helper/utils/ACache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public put(Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 52
    invoke-static {p2}, Lcom/lody/virtual/helper/utils/ACache$Utils;->access$1300(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/lody/virtual/helper/utils/ACache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;I)V

    return-void
.end method

.method public put(Ljava/lang/String;Ljava/io/Serializable;)V
    .locals 1

    const/4 v0, -0x1

    .line 38
    invoke-virtual {p0, p1, p2, v0}, Lcom/lody/virtual/helper/utils/ACache;->put(Ljava/lang/String;Ljava/io/Serializable;I)V

    return-void
.end method

.method public put(Ljava/lang/String;Ljava/io/Serializable;I)V
    .locals 3

    const/4 v0, 0x0

    .line 39
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 40
    new-instance v2, Ljava/io/ObjectOutputStream;

    invoke-direct {v2, v1}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 41
    :try_start_1
    invoke-virtual {v2, p2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 42
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p2

    const/4 v0, -0x1

    if-eq p3, v0, :cond_0

    .line 43
    invoke-virtual {p0, p1, p2, p3}, Lcom/lody/virtual/helper/utils/ACache;->put(Ljava/lang/String;[BI)V

    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/lody/virtual/helper/utils/ACache;->put(Ljava/lang/String;[B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catchall_0
    move-exception p1

    move-object v0, v2

    goto :goto_3

    :catch_0
    move-exception p1

    move-object v0, v2

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    .line 46
    :goto_1
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 47
    :try_start_4
    invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    :goto_2
    return-void

    :goto_3
    :try_start_5
    invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 48
    :catch_3
    throw p1
.end method

.method public put(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/utils/ACache;->mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    invoke-static {v0, p1}, Lcom/lody/virtual/helper/utils/ACache$ACacheManager;->access$300(Lcom/lody/virtual/helper/utils/ACache$ACacheManager;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v2, Ljava/io/FileWriter;

    invoke-direct {v2, p1}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    const/16 v3, 0x400

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    invoke-virtual {v1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->flush()V

    .line 5
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :catchall_0
    move-exception p2

    move-object v0, v1

    goto :goto_3

    :catch_1
    move-exception p2

    move-object v0, v1

    goto :goto_0

    :catchall_1
    move-exception p2

    goto :goto_3

    :catch_2
    move-exception p2

    .line 6
    :goto_0
    :try_start_3
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v0, :cond_0

    .line 7
    :try_start_4
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->flush()V

    .line 8
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_2

    :catch_3
    move-exception p2

    .line 9
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 10
    :cond_0
    :goto_2
    iget-object p2, p0, Lcom/lody/virtual/helper/utils/ACache;->mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    invoke-static {p2, p1}, Lcom/lody/virtual/helper/utils/ACache$ACacheManager;->access$200(Lcom/lody/virtual/helper/utils/ACache$ACacheManager;Ljava/io/File;)V

    return-void

    :goto_3
    if-eqz v0, :cond_1

    .line 11
    :try_start_5
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->flush()V

    .line 12
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_4

    :catch_4
    move-exception v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    :cond_1
    :goto_4
    iget-object v0, p0, Lcom/lody/virtual/helper/utils/ACache;->mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    invoke-static {v0, p1}, Lcom/lody/virtual/helper/utils/ACache$ACacheManager;->access$200(Lcom/lody/virtual/helper/utils/ACache$ACacheManager;Ljava/io/File;)V

    .line 15
    throw p2
.end method

.method public put(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 16
    invoke-static {p3, p2}, Lcom/lody/virtual/helper/utils/ACache$Utils;->access$400(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/lody/virtual/helper/utils/ACache;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public put(Ljava/lang/String;Lorg/json/JSONArray;)V
    .locals 0

    .line 19
    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/lody/virtual/helper/utils/ACache;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public put(Ljava/lang/String;Lorg/json/JSONArray;I)V
    .locals 0

    .line 20
    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/lody/virtual/helper/utils/ACache;->put(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public put(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    .line 17
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/lody/virtual/helper/utils/ACache;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public put(Ljava/lang/String;Lorg/json/JSONObject;I)V
    .locals 0

    .line 18
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/lody/virtual/helper/utils/ACache;->put(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public put(Ljava/lang/String;[B)V
    .locals 2

    .line 21
    iget-object v0, p0, Lcom/lody/virtual/helper/utils/ACache;->mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    invoke-static {v0, p1}, Lcom/lody/virtual/helper/utils/ACache$ACacheManager;->access$300(Lcom/lody/virtual/helper/utils/ACache$ACacheManager;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    const/4 v0, 0x0

    .line 22
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    :try_start_1
    invoke-virtual {v1, p2}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 25
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :catchall_0
    move-exception p2

    move-object v0, v1

    goto :goto_3

    :catch_1
    move-exception p2

    move-object v0, v1

    goto :goto_0

    :catchall_1
    move-exception p2

    goto :goto_3

    :catch_2
    move-exception p2

    .line 26
    :goto_0
    :try_start_3
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v0, :cond_0

    .line 27
    :try_start_4
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 28
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_2

    :catch_3
    move-exception p2

    .line 29
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    :cond_0
    :goto_2
    iget-object p2, p0, Lcom/lody/virtual/helper/utils/ACache;->mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    invoke-static {p2, p1}, Lcom/lody/virtual/helper/utils/ACache$ACacheManager;->access$200(Lcom/lody/virtual/helper/utils/ACache$ACacheManager;Ljava/io/File;)V

    return-void

    :goto_3
    if-eqz v0, :cond_1

    .line 31
    :try_start_5
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 32
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_4

    :catch_4
    move-exception v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 34
    :cond_1
    :goto_4
    iget-object v0, p0, Lcom/lody/virtual/helper/utils/ACache;->mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    invoke-static {v0, p1}, Lcom/lody/virtual/helper/utils/ACache$ACacheManager;->access$200(Lcom/lody/virtual/helper/utils/ACache$ACacheManager;Ljava/io/File;)V

    .line 35
    throw p2
.end method

.method public put(Ljava/lang/String;[BI)V
    .locals 0

    .line 37
    invoke-static {p3, p2}, Lcom/lody/virtual/helper/utils/ACache$Utils;->access$800(I[B)[B

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/lody/virtual/helper/utils/ACache;->put(Ljava/lang/String;[B)V

    return-void
.end method

.method public remove(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/helper/utils/ACache;->mCache:Lcom/lody/virtual/helper/utils/ACache$ACacheManager;

    invoke-static {v0, p1}, Lcom/lody/virtual/helper/utils/ACache$ACacheManager;->access$1500(Lcom/lody/virtual/helper/utils/ACache$ACacheManager;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
