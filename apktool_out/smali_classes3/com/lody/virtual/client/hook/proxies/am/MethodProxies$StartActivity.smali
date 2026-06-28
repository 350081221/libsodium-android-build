.class public Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StartActivity;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/am/MethodProxies;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StartActivity"
.end annotation


# static fields
.field private static final SCHEME_CONTENT:Ljava/lang/String; = "content"

.field private static final SCHEME_FILE:Ljava/lang/String; = "file"

.field private static final SCHEME_PACKAGE:Ljava/lang/String; = "package"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/client/hook/base/MethodProxy;-><init>()V

    return-void
.end method

.method private handleInstallRequest(Landroid/content/Intent;)Z
    .locals 7

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getAppRequestListener()Lcom/lody/virtual/client/core/VirtualCore$AppRequestListener;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "file"

    .line 21
    .line 22
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x1

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    new-instance v1, Ljava/io/File;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Lcom/lody/virtual/client/NativeEngine;->getRedirectedPath(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {v0, p1}, Lcom/lody/virtual/client/core/VirtualCore$AppRequestListener;->onRequestInstall(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return v3

    .line 50
    :cond_0
    const-string v2, "content"

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    new-instance v2, Ljava/io/File;

    .line 63
    .line 64
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getHostContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-direct {v2, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getHostContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v5, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 89
    .line 90
    .line 91
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 92
    :try_start_1
    new-instance v5, Ljava/io/FileOutputStream;

    .line 93
    .line 94
    invoke-direct {v5, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    .line 96
    .line 97
    const/16 v4, 0x400

    .line 98
    .line 99
    :try_start_2
    new-array v4, v4, [B

    .line 100
    .line 101
    :goto_0
    invoke-virtual {p1, v4}, Ljava/io/InputStream;->read([B)I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-lez v6, :cond_1

    .line 106
    .line 107
    invoke-virtual {v5, v4, v1, v6}, Ljava/io/OutputStream;->write([BII)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    invoke-virtual {v5}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/FileUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    goto :goto_1

    .line 120
    :catch_0
    move-exception v1

    .line 121
    goto :goto_2

    .line 122
    :catchall_1
    move-exception v0

    .line 123
    move-object v5, v4

    .line 124
    :goto_1
    move-object v4, p1

    .line 125
    goto :goto_5

    .line 126
    :catch_1
    move-exception v1

    .line 127
    move-object v5, v4

    .line 128
    :goto_2
    move-object v4, p1

    .line 129
    goto :goto_3

    .line 130
    :catchall_2
    move-exception v0

    .line 131
    move-object v5, v4

    .line 132
    goto :goto_5

    .line 133
    :catch_2
    move-exception v1

    .line 134
    move-object v5, v4

    .line 135
    :goto_3
    :try_start_3
    const-string p1, "VA"

    .line 136
    .line 137
    invoke-static {p1, v1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 138
    .line 139
    .line 140
    invoke-static {v4}, Lcom/lody/virtual/helper/utils/FileUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 141
    .line 142
    .line 143
    :goto_4
    invoke-static {v5}, Lcom/lody/virtual/helper/utils/FileUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-interface {v0, p1}, Lcom/lody/virtual/client/core/VirtualCore$AppRequestListener;->onRequestInstall(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return v3

    .line 154
    :catchall_3
    move-exception v0

    .line 155
    :goto_5
    invoke-static {v4}, Lcom/lody/virtual/helper/utils/FileUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v5}, Lcom/lody/virtual/helper/utils/FileUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 159
    .line 160
    .line 161
    throw v0

    .line 162
    :cond_2
    return v1
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

.method private handleUninstallRequest(Landroid/content/Intent;)Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getAppRequestListener()Lcom/lody/virtual/client/core/VirtualCore$AppRequestListener;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "package"

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {v0, p1}, Lcom/lody/virtual/client/core/VirtualCore$AppRequestListener;->onRequestUninstall(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    return p1

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    return p1
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


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    const-class v4, Landroid/content/Intent;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    invoke-static {v3, v4, v5}, Lcom/lody/virtual/helper/utils/ArrayUtils;->indexOfObject([Ljava/lang/Object;Ljava/lang/Class;I)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-gez v4, :cond_0

    .line 17
    .line 18
    sget v1, Lcom/lody/virtual/helper/compat/ActivityManagerCompat;->START_INTENT_NOT_RESOLVED:I

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    return-object v1

    .line 25
    :cond_0
    const-class v6, Landroid/os/IBinder;

    .line 26
    .line 27
    const/4 v7, 0x2

    .line 28
    invoke-static {v3, v6, v7}, Lcom/lody/virtual/helper/utils/ArrayUtils;->indexOfObject([Ljava/lang/Object;Ljava/lang/Class;I)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    add-int/lit8 v8, v4, 0x1

    .line 33
    .line 34
    aget-object v8, v3, v8

    .line 35
    .line 36
    check-cast v8, Ljava/lang/String;

    .line 37
    .line 38
    new-instance v10, Landroid/content/Intent;

    .line 39
    .line 40
    aget-object v9, v3, v4

    .line 41
    .line 42
    check-cast v9, Landroid/content/Intent;

    .line 43
    .line 44
    invoke-direct {v10, v9}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v10}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-virtual {v10, v9, v8}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    if-ltz v6, :cond_1

    .line 55
    .line 56
    aget-object v9, v3, v6

    .line 57
    .line 58
    check-cast v9, Landroid/os/IBinder;

    .line 59
    .line 60
    move-object v15, v9

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v15, 0x0

    .line 63
    :goto_0
    const-class v9, Landroid/os/Bundle;

    .line 64
    .line 65
    invoke-static {v3, v9}, Lcom/lody/virtual/helper/utils/ArrayUtils;->getFirst([Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    move-object v13, v9

    .line 70
    check-cast v13, Landroid/os/Bundle;

    .line 71
    .line 72
    if-eqz v15, :cond_2

    .line 73
    .line 74
    add-int/lit8 v11, v6, 0x1

    .line 75
    .line 76
    aget-object v11, v3, v11

    .line 77
    .line 78
    check-cast v11, Ljava/lang/String;

    .line 79
    .line 80
    add-int/2addr v6, v7

    .line 81
    aget-object v6, v3, v6

    .line 82
    .line 83
    check-cast v6, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    move-object v14, v11

    .line 90
    goto :goto_1

    .line 91
    :cond_2
    const/4 v6, 0x0

    .line 92
    const/4 v14, 0x0

    .line 93
    :goto_1
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    invoke-virtual {v10}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v12

    .line 101
    const-string v5, "android.intent.action.MAIN"

    .line 102
    .line 103
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_4

    .line 108
    .line 109
    const-string v5, "android.intent.category.HOME"

    .line 110
    .line 111
    invoke-virtual {v10, v5}, Landroid/content/Intent;->hasCategory(Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_4

    .line 116
    .line 117
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {v5, v10}, Lcom/lody/virtual/client/core/SettingConfig;->onHandleLauncherIntent(Landroid/content/Intent;)Landroid/content/Intent;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    if-eqz v5, :cond_3

    .line 126
    .line 127
    aput-object v5, v3, v4

    .line 128
    .line 129
    :cond_3
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    return-object v1

    .line 134
    :cond_4
    const-string v5, "android.settings.APP_NOTIFICATION_SETTINGS"

    .line 135
    .line 136
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-nez v5, :cond_1a

    .line 141
    .line 142
    const-string v5, "android.settings.CHANNEL_NOTIFICATION_SETTINGS"

    .line 143
    .line 144
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-eqz v5, :cond_5

    .line 149
    .line 150
    goto/16 :goto_6

    .line 151
    .line 152
    :cond_5
    invoke-static {v10}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isHostIntent(Landroid/content/Intent;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_6

    .line 157
    .line 158
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    return-object v1

    .line 163
    :cond_6
    const-string v5, "android.intent.action.INSTALL_PACKAGE"

    .line 164
    .line 165
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    const-string v8, "package"

    .line 170
    .line 171
    const-string v7, "android.intent.action.VIEW"

    .line 172
    .line 173
    if-nez v5, :cond_9

    .line 174
    .line 175
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-eqz v5, :cond_7

    .line 180
    .line 181
    const-string v5, "application/vnd.android.package-archive"

    .line 182
    .line 183
    invoke-virtual {v10}, Landroid/content/Intent;->getType()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v9

    .line 187
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-eqz v5, :cond_7

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_7
    const-string v5, "android.intent.action.UNINSTALL_PACKAGE"

    .line 195
    .line 196
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-nez v5, :cond_8

    .line 201
    .line 202
    const-string v5, "android.intent.action.DELETE"

    .line 203
    .line 204
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    if-eqz v5, :cond_b

    .line 209
    .line 210
    :cond_8
    invoke-virtual {v10}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-eqz v5, :cond_b

    .line 219
    .line 220
    invoke-direct {v0, v10}, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StartActivity;->handleUninstallRequest(Landroid/content/Intent;)Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_b

    .line 225
    .line 226
    const/4 v5, 0x0

    .line 227
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    return-object v1

    .line 232
    :cond_9
    :goto_2
    invoke-direct {v0, v10}, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StartActivity;->handleInstallRequest(Landroid/content/Intent;)Z

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    if-eqz v5, :cond_b

    .line 237
    .line 238
    if-eqz v15, :cond_a

    .line 239
    .line 240
    if-lez v6, :cond_a

    .line 241
    .line 242
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v1, v15, v14, v6}, Lcom/lody/virtual/client/ipc/VActivityManager;->sendCancelActivityResult(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 247
    .line 248
    .line 249
    :cond_a
    const/4 v1, 0x0

    .line 250
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    return-object v1

    .line 255
    :cond_b
    invoke-virtual {v10}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    invoke-virtual {v10}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 260
    .line 261
    .line 262
    move-result-object v9

    .line 263
    if-eqz v9, :cond_c

    .line 264
    .line 265
    invoke-virtual {v10}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    invoke-virtual {v9}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v9

    .line 273
    goto :goto_3

    .line 274
    :cond_c
    const-string v9, ""

    .line 275
    .line 276
    :goto_3
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 277
    .line 278
    .line 279
    move-result v18

    .line 280
    if-nez v18, :cond_d

    .line 281
    .line 282
    invoke-virtual {v0, v9}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isAppPkg(Ljava/lang/String;)Z

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    if-eqz v9, :cond_d

    .line 287
    .line 288
    const/4 v9, 0x1

    .line 289
    goto :goto_4

    .line 290
    :cond_d
    const/4 v9, 0x0

    .line 291
    :goto_4
    if-eqz v5, :cond_f

    .line 292
    .line 293
    invoke-virtual {v0, v5}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isAppPkg(Ljava/lang/String;)Z

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    if-nez v5, :cond_f

    .line 298
    .line 299
    if-nez v9, :cond_f

    .line 300
    .line 301
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isR()Z

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    if-eqz v5, :cond_e

    .line 306
    .line 307
    const-string v5, "android.content.pm.action.REQUEST_PERMISSIONS"

    .line 308
    .line 309
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    if-eqz v5, :cond_e

    .line 314
    .line 315
    const/4 v5, 0x2

    .line 316
    sub-int/2addr v4, v5

    .line 317
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getHostPkg()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    aput-object v5, v3, v4

    .line 322
    .line 323
    :cond_e
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    return-object v1

    .line 328
    :cond_f
    invoke-static {v10}, Lcom/lody/virtual/client/stub/ChooserActivity;->check(Landroid/content/Intent;)Z

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    if-eqz v5, :cond_10

    .line 333
    .line 334
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    invoke-virtual {v5}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackage()Z

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    new-instance v7, Landroid/content/Intent;

    .line 343
    .line 344
    invoke-direct {v7, v10}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 345
    .line 346
    .line 347
    invoke-static {v11, v5, v7}, Lcom/lody/virtual/helper/utils/ComponentUtils;->processOutsideIntent(IZLandroid/content/Intent;)Landroid/content/Intent;

    .line 348
    .line 349
    .line 350
    move-result-object v5

    .line 351
    aput-object v5, v3, v4

    .line 352
    .line 353
    new-instance v4, Landroid/os/Bundle;

    .line 354
    .line 355
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 356
    .line 357
    .line 358
    const-string v7, "android.intent.extra.user_handle"

    .line 359
    .line 360
    invoke-virtual {v4, v7, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 361
    .line 362
    .line 363
    const-string v7, "android.intent.extra.virtual.data"

    .line 364
    .line 365
    invoke-virtual {v4, v7, v13}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 366
    .line 367
    .line 368
    const-string v7, "android.intent.extra.virtual.who"

    .line 369
    .line 370
    invoke-virtual {v4, v7, v14}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    const-string v7, "android.intent.extra.virtual.request_code"

    .line 374
    .line 375
    invoke-virtual {v4, v7, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 376
    .line 377
    .line 378
    const-string v6, "_va|ibinder|resultTo"

    .line 379
    .line 380
    invoke-static {v4, v6, v15}, Lcom/lody/virtual/helper/compat/BundleCompat;->putBinder(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/IBinder;)V

    .line 381
    .line 382
    .line 383
    new-instance v6, Landroid/content/ComponentName;

    .line 384
    .line 385
    sget-object v7, Lcom/lody/virtual/client/stub/StubManifest;->PACKAGE_NAME:Ljava/lang/String;

    .line 386
    .line 387
    const-class v8, Lcom/lody/virtual/client/stub/ChooserActivity;

    .line 388
    .line 389
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v8

    .line 393
    invoke-direct {v6, v7, v8}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 397
    .line 398
    .line 399
    const/4 v6, 0x0

    .line 400
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v5, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    return-object v1

    .line 411
    :cond_10
    add-int/lit8 v5, v4, -0x1

    .line 412
    .line 413
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getHostPkg()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v9

    .line 417
    aput-object v9, v3, v5

    .line 418
    .line 419
    invoke-virtual {v10}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v5

    .line 423
    if-eqz v5, :cond_11

    .line 424
    .line 425
    invoke-virtual {v10}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v5

    .line 433
    if-eqz v5, :cond_11

    .line 434
    .line 435
    invoke-virtual {v10}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 436
    .line 437
    .line 438
    move-result-object v5

    .line 439
    if-eqz v5, :cond_11

    .line 440
    .line 441
    if-eqz v12, :cond_11

    .line 442
    .line 443
    const-string v5, "android.settings."

    .line 444
    .line 445
    invoke-virtual {v12, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 446
    .line 447
    .line 448
    move-result v5

    .line 449
    if-eqz v5, :cond_11

    .line 450
    .line 451
    new-instance v5, Ljava/lang/StringBuilder;

    .line 452
    .line 453
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 454
    .line 455
    .line 456
    const-string v8, "package:"

    .line 457
    .line 458
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getHostPkg()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v8

    .line 465
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v5

    .line 472
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 473
    .line 474
    .line 475
    move-result-object v5

    .line 476
    invoke-virtual {v10, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 477
    .line 478
    .line 479
    :cond_11
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 480
    .line 481
    .line 482
    move-result-object v5

    .line 483
    invoke-virtual {v5, v10, v11}, Lcom/lody/virtual/client/core/VirtualCore;->resolveActivityInfo(Landroid/content/Intent;I)Landroid/content/pm/ActivityInfo;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    if-nez v5, :cond_17

    .line 488
    .line 489
    const/4 v8, 0x1

    .line 490
    new-array v5, v8, [Ljava/lang/Object;

    .line 491
    .line 492
    const/4 v6, 0x0

    .line 493
    aput-object v10, v5, v6

    .line 494
    .line 495
    const-string v8, "VActivityManager"

    .line 496
    .line 497
    const-string v9, "Unable to resolve activityInfo : %s"

    .line 498
    .line 499
    invoke-static {v8, v9, v5}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v10}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v5

    .line 506
    if-eqz v5, :cond_12

    .line 507
    .line 508
    invoke-virtual {v10}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v5

    .line 512
    invoke-virtual {v0, v5}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isAppPkg(Ljava/lang/String;)Z

    .line 513
    .line 514
    .line 515
    move-result v5

    .line 516
    if-eqz v5, :cond_12

    .line 517
    .line 518
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    return-object v1

    .line 523
    :cond_12
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 524
    .line 525
    .line 526
    move-result-object v5

    .line 527
    invoke-virtual {v5}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackage()Z

    .line 528
    .line 529
    .line 530
    move-result v5

    .line 531
    invoke-static {v11, v5, v10}, Lcom/lody/virtual/helper/utils/ComponentUtils;->processOutsideIntent(IZLandroid/content/Intent;)Landroid/content/Intent;

    .line 532
    .line 533
    .line 534
    move-result-object v5

    .line 535
    aput-object v5, v3, v4

    .line 536
    .line 537
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 538
    .line 539
    .line 540
    move-result-object v4

    .line 541
    invoke-virtual {v4}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPackageManager()Lcom/lody/virtual/client/env/HostPackageManager;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    const-wide/16 v5, 0x0

    .line 546
    .line 547
    invoke-virtual {v4, v10, v5, v6}, Lcom/lody/virtual/client/env/HostPackageManager;->resolveActivity(Landroid/content/Intent;J)Landroid/content/pm/ResolveInfo;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    if-eqz v4, :cond_13

    .line 552
    .line 553
    iget-object v5, v4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 554
    .line 555
    if-nez v5, :cond_14

    .line 556
    .line 557
    :cond_13
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getPM()Landroid/content/pm/PackageManager;

    .line 558
    .line 559
    .line 560
    move-result-object v5

    .line 561
    const/4 v6, 0x0

    .line 562
    invoke-virtual {v10, v5, v6}, Landroid/content/Intent;->resolveActivityInfo(Landroid/content/pm/PackageManager;I)Landroid/content/pm/ActivityInfo;

    .line 563
    .line 564
    .line 565
    move-result-object v5

    .line 566
    if-eqz v5, :cond_14

    .line 567
    .line 568
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    return-object v1

    .line 573
    :cond_14
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result v5

    .line 577
    if-nez v5, :cond_16

    .line 578
    .line 579
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 580
    .line 581
    .line 582
    move-result-object v5

    .line 583
    invoke-virtual {v5, v12}, Lcom/lody/virtual/client/core/SettingConfig;->isOutsideAction(Ljava/lang/String;)Z

    .line 584
    .line 585
    .line 586
    move-result v5

    .line 587
    if-nez v5, :cond_16

    .line 588
    .line 589
    if-eqz v4, :cond_15

    .line 590
    .line 591
    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 592
    .line 593
    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 594
    .line 595
    invoke-static {v4}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isOutsidePackage(Ljava/lang/String;)Z

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    if-eqz v4, :cond_15

    .line 600
    .line 601
    goto :goto_5

    .line 602
    :cond_15
    sget v1, Lcom/lody/virtual/helper/compat/ActivityManagerCompat;->START_INTENT_NOT_RESOLVED:I

    .line 603
    .line 604
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    return-object v1

    .line 609
    :cond_16
    :goto_5
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    return-object v1

    .line 614
    :cond_17
    invoke-static {v5}, Lcom/lody/virtual/oem/apps/VAppFix;->isPreventStartActivity(Landroid/content/pm/ActivityInfo;)Z

    .line 615
    .line 616
    .line 617
    move-result v1

    .line 618
    if-eqz v1, :cond_18

    .line 619
    .line 620
    const/4 v1, 0x0

    .line 621
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    return-object v1

    .line 626
    :cond_18
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 627
    .line 628
    .line 629
    move-result-object v9

    .line 630
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    invoke-virtual {v1}, Lcom/lody/virtual/client/VClient;->getCurrentPackage()Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v16

    .line 638
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 639
    .line 640
    .line 641
    move-result v17

    .line 642
    move-object v11, v5

    .line 643
    move-object v12, v15

    .line 644
    move-object v8, v14

    .line 645
    move-object v1, v15

    .line 646
    move v15, v6

    .line 647
    invoke-virtual/range {v9 .. v17}, Lcom/lody/virtual/client/ipc/VActivityManager;->startActivity(Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;Landroid/os/Bundle;Ljava/lang/String;ILjava/lang/String;I)I

    .line 648
    .line 649
    .line 650
    move-result v2

    .line 651
    if-eqz v2, :cond_19

    .line 652
    .line 653
    if-eqz v1, :cond_19

    .line 654
    .line 655
    if-lez v6, :cond_19

    .line 656
    .line 657
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 658
    .line 659
    .line 660
    move-result-object v3

    .line 661
    invoke-virtual {v3, v1, v8, v6}, Lcom/lody/virtual/client/ipc/VActivityManager;->sendCancelActivityResult(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 662
    .line 663
    .line 664
    :cond_19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    return-object v1

    .line 669
    :cond_1a
    :goto_6
    aget-object v4, v3, v4

    .line 670
    .line 671
    check-cast v4, Landroid/content/Intent;

    .line 672
    .line 673
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isOreo()Z

    .line 674
    .line 675
    .line 676
    move-result v5

    .line 677
    if-eqz v5, :cond_1b

    .line 678
    .line 679
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 680
    .line 681
    .line 682
    move-result-object v5

    .line 683
    invoke-virtual {v5}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPkg()Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v5

    .line 687
    const-string v6, "android.provider.extra.APP_PACKAGE"

    .line 688
    .line 689
    invoke-virtual {v4, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 690
    .line 691
    .line 692
    goto :goto_7

    .line 693
    :cond_1b
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 694
    .line 695
    .line 696
    move-result-object v5

    .line 697
    invoke-virtual {v5}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPkg()Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v5

    .line 701
    const-string v6, "app_package"

    .line 702
    .line 703
    invoke-virtual {v4, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 704
    .line 705
    .line 706
    :goto_7
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v1

    .line 710
    return-object v1
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
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
.end method

.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "startActivity"

    return-object v0
.end method

.method public isEnable()Z
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isAppProcess()Z

    move-result v0

    return v0
.end method
