.class public Lcom/bytedance/pangle/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile d:Lcom/bytedance/pangle/i;


# instance fields
.field a:Z

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/pangle/ZeusPluginStateListener;",
            ">;"
        }
    .end annotation
.end field

.field final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/pangle/ZeusPluginEventCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/pangle/i;->b:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/bytedance/pangle/i;->c:Ljava/util/List;

    .line 17
    .line 18
    new-instance v0, Landroid/os/Handler;

    .line 19
    .line 20
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/bytedance/pangle/i;->e:Landroid/os/Handler;

    .line 28
    .line 29
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
.end method

.method public static a()Lcom/bytedance/pangle/i;
    .locals 2

    .line 1
    sget-object v0, Lcom/bytedance/pangle/i;->d:Lcom/bytedance/pangle/i;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/bytedance/pangle/i;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/bytedance/pangle/i;->d:Lcom/bytedance/pangle/i;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/bytedance/pangle/i;

    invoke-direct {v1}, Lcom/bytedance/pangle/i;-><init>()V

    sput-object v1, Lcom/bytedance/pangle/i;->d:Lcom/bytedance/pangle/i;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/bytedance/pangle/i;->d:Lcom/bytedance/pangle/i;

    return-object v0
.end method

.method private static b()V
    .locals 9

    .line 1
    const-string v0, ":"

    .line 2
    .line 3
    invoke-static {}, Lcom/bytedance/pangle/GlobalParam;->getInstance()Lcom/bytedance/pangle/GlobalParam;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/bytedance/pangle/GlobalParam;->getReporter()Lcom/bytedance/pangle/log/IZeusReporter;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "start"

    .line 12
    .line 13
    const-string/jumbo v3, "zeus_stage_plugin"

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, v3, v2}, Lcom/bytedance/pangle/log/IZeusReporter;->saveRecord(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->getAppApplication()Landroid/app/Application;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->getAppApplication()Landroid/app/Application;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const/16 v4, 0x8

    .line 36
    .line 37
    invoke-virtual {v1, v2, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_6

    .line 42
    .line 43
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    .line 44
    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_0
    array-length v1, v2

    .line 50
    const/4 v4, 0x0

    .line 51
    :goto_0
    if-ge v4, v1, :cond_5

    .line 52
    .line 53
    aget-object v5, v2, v4

    .line 54
    .line 55
    iget-object v6, v5, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-nez v6, :cond_4

    .line 62
    .line 63
    iget-object v6, v5, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 64
    .line 65
    new-instance v7, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->getAppApplication()Landroid/app/Application;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v8, ".pangle.servermanager."

    .line 82
    .line 83
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-eqz v6, :cond_4

    .line 95
    .line 96
    iget-object v6, v5, Landroid/content/pm/ProviderInfo;->processName:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    const-string v7, "main"

    .line 103
    .line 104
    if-nez v6, :cond_2

    .line 105
    .line 106
    :try_start_1
    iget-object v6, v5, Landroid/content/pm/ProviderInfo;->processName:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-nez v6, :cond_1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    iget-object v6, v5, Landroid/content/pm/ProviderInfo;->processName:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    const/4 v8, 0x1

    .line 122
    aget-object v6, v6, v8

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    :goto_1
    move-object v6, v7

    .line 126
    :goto_2
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->getServerManagerHashMap()Ljava/util/HashMap;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-virtual {v8, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    check-cast v8, Landroid/content/pm/ProviderInfo;

    .line 135
    .line 136
    if-eqz v8, :cond_3

    .line 137
    .line 138
    invoke-static {v6, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-eqz v7, :cond_3

    .line 143
    .line 144
    iget-object v7, v5, Landroid/content/pm/ProviderInfo;->name:Ljava/lang/String;

    .line 145
    .line 146
    const-class v8, Lcom/bytedance/pangle/servermanager/MainServerManager;

    .line 147
    .line 148
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    invoke-static {v7, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-nez v7, :cond_4

    .line 157
    .line 158
    :cond_3
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->getServerManagerHashMap()Ljava/util/HashMap;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-virtual {v7, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 163
    .line 164
    .line 165
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_5
    invoke-static {}, Lcom/bytedance/pangle/GlobalParam;->getInstance()Lcom/bytedance/pangle/GlobalParam;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0}, Lcom/bytedance/pangle/GlobalParam;->getReporter()Lcom/bytedance/pangle/log/IZeusReporter;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    const-string v1, "finish"

    .line 177
    .line 178
    invoke-interface {v0, v3, v1}, Lcom/bytedance/pangle/log/IZeusReporter;->saveRecord(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_6
    :goto_3
    :try_start_2
    const-string v0, "Zeus/init_pangle"

    .line 183
    .line 184
    const-string v2, "initServerManager failed. packageInfo:"

    .line 185
    .line 186
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-static {v0, v1}, Lcom/bytedance/pangle/log/ZeusLogger;->errReport(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :catch_0
    move-exception v0

    .line 199
    invoke-static {}, Lcom/bytedance/pangle/GlobalParam;->getInstance()Lcom/bytedance/pangle/GlobalParam;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {v1}, Lcom/bytedance/pangle/GlobalParam;->getReporter()Lcom/bytedance/pangle/log/IZeusReporter;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    const-string v4, "error:"

    .line 212
    .line 213
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-interface {v1, v3, v2}, Lcom/bytedance/pangle/log/IZeusReporter;->saveRecord(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    new-instance v1, Ljava/lang/RuntimeException;

    .line 221
    .line 222
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    throw v1
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

.method private c()[Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/pangle/i;->c:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/bytedance/pangle/i;->c:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/bytedance/pangle/i;->c:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    new-array v0, v0, [Ljava/lang/Object;

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    return-object v1

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v1
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
.end method


# virtual methods
.method public final a(IILjava/lang/String;ILjava/lang/Throwable;)V
    .locals 14
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Throwable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 44
    invoke-direct {p0}, Lcom/bytedance/pangle/i;->c()[Ljava/lang/Object;

    move-result-object v0

    .line 45
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v5, v0, v2

    move-object v11, p0

    .line 46
    iget-object v12, v11, Lcom/bytedance/pangle/i;->e:Landroid/os/Handler;

    new-instance v13, Lcom/bytedance/pangle/i$4;

    move-object v3, v13

    move-object v4, p0

    move v6, p1

    move/from16 v7, p2

    move-object/from16 v8, p3

    move/from16 v9, p4

    move-object/from16 v10, p5

    invoke-direct/range {v3 .. v10}, Lcom/bytedance/pangle/i$4;-><init>(Lcom/bytedance/pangle/i;Ljava/lang/Object;IILjava/lang/String;ILjava/lang/Throwable;)V

    invoke-virtual {v12, v13}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    move-object v11, p0

    return-void
.end method

.method final declared-synchronized a(Landroid/app/Application;Z)V
    .locals 6

    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, Lcom/bytedance/pangle/i;->a:Z

    if-eqz v0, :cond_0

    const-string p1, "Zeus/init_pangle"

    const-string p2, "ZeusManager zeus has been inited!"

    .line 8
    invoke-static {p1, p2}, Lcom/bytedance/pangle/log/ZeusLogger;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    monitor-exit p0

    return-void

    :cond_0
    const/16 v1, 0xbb8

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    move-object v0, p0

    .line 10
    :try_start_1
    invoke-virtual/range {v0 .. v5}, Lcom/bytedance/pangle/i;->a(IILjava/lang/String;ILjava/lang/Throwable;)V

    .line 11
    invoke-static {p1}, Lcom/bytedance/pangle/Zeus;->setAppContext(Landroid/app/Application;)V

    .line 12
    invoke-static {}, Lcom/bytedance/pangle/GlobalParam;->getInstance()Lcom/bytedance/pangle/GlobalParam;

    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/bytedance/pangle/GlobalParam;->init()V

    if-eqz p1, :cond_8

    .line 14
    invoke-virtual {v0}, Lcom/bytedance/pangle/GlobalParam;->isDebug()Z

    move-result v1

    invoke-static {v1}, Lcom/bytedance/pangle/log/ZeusLogger;->setDebug(Z)V

    const-string v1, "Zeus/init_pangle"

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ZeusManager init, context = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", hParam = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/bytedance/pangle/log/ZeusLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    new-instance v1, Lcom/bytedance/pangle/i$1;

    invoke-direct {v1, p0}, Lcom/bytedance/pangle/i$1;-><init>(Lcom/bytedance/pangle/i;)V

    invoke-static {v1}, Lcom/bytedance/pangle/d/e;->a(Ljava/lang/Runnable;)V

    .line 17
    invoke-static {}, Lcom/bytedance/pangle/GlobalParam;->getInstance()Lcom/bytedance/pangle/GlobalParam;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/pangle/GlobalParam;->isPostBgDexOptByInit()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 18
    invoke-static {}, Lcom/bytedance/pangle/e/f;->a()V

    :cond_1
    if-eqz p2, :cond_2

    .line 19
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->onPrivacyAgreed()V

    .line 20
    :cond_2
    invoke-static {}, Lcom/bytedance/pangle/c/b;->a()Lcom/bytedance/pangle/c/b;

    move-result-object p2

    new-instance v1, Lcom/bytedance/pangle/i$2;

    invoke-direct {v1, p0}, Lcom/bytedance/pangle/i$2;-><init>(Lcom/bytedance/pangle/i;)V

    .line 21
    iget-object v2, p2, Lcom/bytedance/pangle/c/b;->a:Ljava/util/List;

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 22
    :try_start_2
    iget-object p2, p2, Lcom/bytedance/pangle/c/b;->a:Ljava/util/List;

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
    :try_start_3
    invoke-virtual {v0}, Lcom/bytedance/pangle/GlobalParam;->isCloseFlipped()Z

    move-result p2

    if-nez p2, :cond_3

    .line 25
    invoke-static {}, Lcom/bytedance/pangle/b;->a()V

    .line 26
    :cond_3
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x1

    if-ne p2, v1, :cond_4

    move p2, v2

    goto :goto_0

    :cond_4
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_5

    .line 27
    new-instance p2, Lcom/bytedance/pangle/i$3;

    invoke-direct {p2, p0}, Lcom/bytedance/pangle/i$3;-><init>(Lcom/bytedance/pangle/i;)V

    invoke-static {p2}, Lcom/bytedance/pangle/d/e;->a(Ljava/lang/Runnable;)V

    .line 28
    :cond_5
    invoke-static {}, Lcom/bytedance/pangle/util/i;->j()Z

    move-result p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz p2, :cond_6

    .line 29
    :try_start_4
    invoke-static {}, Lcom/bytedance/pangle/GlobalParam;->getInstance()Lcom/bytedance/pangle/GlobalParam;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bytedance/pangle/GlobalParam;->getReporter()Lcom/bytedance/pangle/log/IZeusReporter;

    move-result-object p2

    const-string/jumbo v1, "zeus_stage_common"

    const-string v3, "invoke disableApiWarning"

    invoke-interface {p2, v1, v3}, Lcom/bytedance/pangle/log/IZeusReporter;->saveRecord(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    invoke-static {}, Lcom/bytedance/pangle/d/a;->a()Ljava/lang/Object;

    move-result-object p2

    const-string v1, "mHiddenApiWarningShown"

    .line 31
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2, v1, v3}, Lcom/bytedance/pangle/util/FieldUtils;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    const-string p2, "Zeus/init_pangle"

    const-string v1, "ZeusManager disableApiWarningShownForAndroidP, true"

    .line 32
    invoke-static {p2, v1}, Lcom/bytedance/pangle/log/ZeusLogger;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catch_0
    move-exception p2

    :try_start_5
    const-string v1, "Zeus/init_pangle"

    const-string v3, "disableApiWarningShownForAndroidP failed"

    .line 33
    invoke-static {v1, v3, p2}, Lcom/bytedance/pangle/log/ZeusLogger;->errReport(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    :cond_6
    :goto_1
    invoke-static {}, Lcom/bytedance/pangle/i;->b()V

    .line 35
    invoke-static {}, Lcom/bytedance/pangle/provider/ContentProviderManager;->getInstance()Lcom/bytedance/pangle/provider/ContentProviderManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bytedance/pangle/provider/ContentProviderManager;->initSystemContentProviderInfo()V

    .line 36
    invoke-virtual {v0}, Lcom/bytedance/pangle/GlobalParam;->closeHookHuaweiOnInit()Z

    move-result p2

    if-nez p2, :cond_7

    .line 37
    invoke-static {p1}, Lcom/bytedance/pangle/Zeus;->hookHuaWeiVerifier(Landroid/app/Application;)V

    .line 38
    :cond_7
    iput-boolean v2, p0, Lcom/bytedance/pangle/i;->a:Z

    const/16 v1, 0xc1c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    move-object v0, p0

    .line 39
    invoke-virtual/range {v0 .. v5}, Lcom/bytedance/pangle/i;->a(IILjava/lang/String;ILjava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 40
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 41
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw p1

    .line 42
    :cond_8
    invoke-static {}, Lcom/bytedance/pangle/GlobalParam;->getInstance()Lcom/bytedance/pangle/GlobalParam;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/pangle/GlobalParam;->getReporter()Lcom/bytedance/pangle/log/IZeusReporter;

    move-result-object p1

    const-string/jumbo p2, "zeus_stage_error"

    const-string v0, "context is null"

    invoke-interface {p1, p2, v0}, Lcom/bytedance/pangle/log/IZeusReporter;->saveRecord(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "context must be not null !!!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method
