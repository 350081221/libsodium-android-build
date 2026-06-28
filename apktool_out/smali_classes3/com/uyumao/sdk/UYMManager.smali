.class public Lcom/uyumao/sdk/UYMManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lcom/uyumao/sdk/UYMManager;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static enableYm1(Landroid/content/Context;Z)V
    .locals 0

    sput-boolean p1, Lcom/uyumao/d;->a:Z

    return-void
.end method

.method public static enableYm2(Landroid/content/Context;Z)V
    .locals 0

    sput-boolean p1, Lcom/uyumao/d;->b:Z

    return-void
.end method

.method public static enableYm3(Landroid/content/Context;Z)V
    .locals 0

    sput-boolean p1, Lcom/uyumao/d;->c:Z

    return-void
.end method

.method public static enableYm4(Landroid/content/Context;Z)V
    .locals 0

    sput-boolean p1, Lcom/uyumao/d;->d:Z

    return-void
.end method

.method public static enableYm5(Landroid/content/Context;Z)V
    .locals 0

    sput-boolean p1, Lcom/uyumao/d;->e:Z

    return-void
.end method

.method public static enableYm6(Landroid/content/Context;Z)V
    .locals 0

    sput-boolean p1, Lcom/uyumao/d;->f:Z

    return-void
.end method

.method public static declared-synchronized getInstance()Lcom/uyumao/sdk/UYMManager;
    .locals 2

    .line 1
    const-class v0, Lcom/uyumao/sdk/UYMManager;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/uyumao/sdk/UYMManager;->a:Lcom/uyumao/sdk/UYMManager;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/uyumao/sdk/UYMManager;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/uyumao/sdk/UYMManager;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/uyumao/sdk/UYMManager;->a:Lcom/uyumao/sdk/UYMManager;

    .line 14
    .line 15
    :cond_0
    sget-object v1, Lcom/uyumao/sdk/UYMManager;->a:Lcom/uyumao/sdk/UYMManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-object v1

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    monitor-exit v0

    .line 21
    throw v1
    .line 22
    .line 23
.end method

.method public static getSdkVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "1.1.2"

    return-object v0
.end method

.method public static processEvent(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "actionName"

    .line 2
    .line 3
    sget-boolean v1, Lcom/uyumao/d;->a:Z

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sput-object v1, Lcom/uyumao/d;->g:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 19
    .line 20
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v0, Lcom/uyumao/d;->m:Ljava/util/Map;

    .line 34
    .line 35
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/lang/Integer;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    sget-object v0, Lcom/uyumao/d$e;->a:Lcom/uyumao/d;

    .line 48
    .line 49
    invoke-static {p0, p1, v0, v1}, Lcom/uyumao/g;->a(Landroid/content/Context;ILcom/uyumao/g$a;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    :catchall_0
    :cond_1
    :goto_0
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
.end method


# virtual methods
.method public declared-synchronized init(Landroid/content/Context;)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-boolean v1, Lcom/uyumao/c;->a:Z

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    sput-boolean v2, Lcom/uyumao/c;->a:Z

    .line 18
    .line 19
    const-string v1, "uyumao_info"

    .line 20
    .line 21
    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v4, Ljava/text/SimpleDateFormat;

    .line 26
    .line 27
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    const-string v6, "yyyyMMdd"

    .line 32
    .line 33
    invoke-direct {v4, v6, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 34
    .line 35
    .line 36
    new-instance v5, Ljava/util/Date;

    .line 37
    .line 38
    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-interface {v1, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    new-instance v1, Ljava/lang/Thread;

    .line 52
    .line 53
    new-instance v4, Lcom/uyumao/a;

    .line 54
    .line 55
    invoke-direct {v4, v0}, Lcom/uyumao/a;-><init>(Landroid/content/Context;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v1, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    new-instance v1, Lcom/uyumao/b;

    .line 66
    .line 67
    invoke-direct {v1, v0}, Lcom/uyumao/b;-><init>(Landroid/content/Context;)V

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lcom/uyumao/l;->a()Lcom/uyumao/l;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v4}, Lcom/uyumao/l;->b()Ljava/util/concurrent/ExecutorService;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-interface {v4, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 79
    .line 80
    .line 81
    :goto_0
    :try_start_1
    sget-object v1, Lcom/uyumao/c;->b:Lcom/uyumao/h;

    .line 82
    .line 83
    if-eqz v1, :cond_3

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    new-instance v1, Lcom/uyumao/h;

    .line 89
    .line 90
    invoke-direct {v1}, Lcom/uyumao/h;-><init>()V

    .line 91
    .line 92
    .line 93
    sput-object v1, Lcom/uyumao/c;->b:Lcom/uyumao/h;

    .line 94
    .line 95
    new-instance v1, Landroid/content/IntentFilter;

    .line 96
    .line 97
    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v4, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 101
    .line 102
    invoke-virtual {v1, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    sget-object v4, Lcom/uyumao/c;->b:Lcom/uyumao/h;

    .line 106
    .line 107
    invoke-virtual {v0, v4, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    .line 109
    .line 110
    :catchall_0
    :goto_1
    :try_start_2
    sput-object p1, Lcom/uyumao/e;->a:Landroid/content/Context;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 111
    .line 112
    :try_start_3
    const-string p1, "com.umeng.commonsdk.UMConfigure"

    .line 113
    .line 114
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    const-class v0, Lcom/umeng/ccg/ActionInfo;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 119
    .line 120
    :try_start_4
    const-string v1, "registerActionInfo"
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 121
    .line 122
    :try_start_5
    new-array v4, v2, [Ljava/lang/Class;

    .line 123
    .line 124
    aput-object v0, v4, v3

    .line 125
    .line 126
    invoke-virtual {p1, v1, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-eqz p1, :cond_4

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    move v2, v3

    .line 134
    :goto_2
    if-eqz v2, :cond_5

    .line 135
    .line 136
    new-instance p1, Lcom/uyumao/sdk/UYMManager$a;

    .line 137
    .line 138
    invoke-direct {p1, p0}, Lcom/uyumao/sdk/UYMManager$a;-><init>(Lcom/uyumao/sdk/UYMManager;)V

    .line 139
    .line 140
    .line 141
    invoke-static {p1}, Lcom/umeng/commonsdk/UMConfigure;->registerActionInfo(Lcom/umeng/ccg/ActionInfo;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 142
    .line 143
    .line 144
    :catchall_1
    :cond_5
    :try_start_6
    sget-boolean p1, Lcom/uyumao/d;->f:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 145
    .line 146
    if-nez p1, :cond_6

    .line 147
    .line 148
    monitor-exit p0

    .line 149
    return-void

    .line 150
    :cond_6
    :try_start_7
    sget-object p1, Lcom/uyumao/e;->b:Ljava/lang/ref/WeakReference;

    .line 151
    .line 152
    if-eqz p1, :cond_7

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, Ljava/util/concurrent/Future;

    .line 159
    .line 160
    if-eqz p1, :cond_7

    .line 161
    .line 162
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-nez v0, :cond_7

    .line 167
    .line 168
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-nez p1, :cond_7

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_7
    new-instance p1, Lcom/uyumao/q;

    .line 176
    .line 177
    invoke-direct {p1}, Lcom/uyumao/q;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-static {p1}, Lcom/uyumao/s;->a(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 185
    .line 186
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    sput-object v0, Lcom/uyumao/e;->b:Ljava/lang/ref/WeakReference;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :catchall_2
    move-exception p1

    .line 193
    :try_start_8
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 194
    .line 195
    .line 196
    :goto_3
    monitor-exit p0

    .line 197
    return-void

    .line 198
    :catchall_3
    move-exception p1

    .line 199
    monitor-exit p0

    .line 200
    throw p1
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
