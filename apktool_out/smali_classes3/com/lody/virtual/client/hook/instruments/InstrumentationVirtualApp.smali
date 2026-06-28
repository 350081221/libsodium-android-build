.class public Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;
.super Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/client/interfaces/IInjector;


# static fields
.field private static final TAG:Ljava/lang/String; = "InstrumentationVirtualApp"

.field private static gDefault:Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/app/Instrumentation;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;-><init>(Landroid/app/Instrumentation;)V

    return-void
.end method

.method private checkActivityCallback()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/InvocationStubManager;->getInstance()Lcom/lody/virtual/client/core/InvocationStubManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/lody/virtual/client/hook/proxies/am/HCallbackStub;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/core/InvocationStubManager;->checkEnv(Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/lody/virtual/client/core/InvocationStubManager;->getInstance()Lcom/lody/virtual/client/core/InvocationStubManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-class v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/core/InvocationStubManager;->checkEnv(Ljava/lang/Class;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private checkIsEnvOk(Landroid/app/Instrumentation;)Z
    .locals 9

    .line 1
    instance-of v0, p1, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v2, Landroid/app/Instrumentation;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    return v4

    .line 21
    :cond_1
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Lcom/lody/virtual/client/VClient;->getCurrentPackage()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-string v5, "com.zhiliaoapp.musically"

    .line 30
    .line 31
    invoke-static {v3, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v5, 0x1a

    .line 40
    .line 41
    if-ne v3, v5, :cond_2

    .line 42
    .line 43
    return v4

    .line 44
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eqz v3, :cond_4

    .line 49
    .line 50
    array-length v5, v3

    .line 51
    move v6, v4

    .line 52
    :goto_0
    if-ge v6, v5, :cond_4

    .line 53
    .line 54
    aget-object v7, v3, v6

    .line 55
    .line 56
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual {v2, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-eqz v8, :cond_3

    .line 65
    .line 66
    invoke-virtual {v7, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 67
    .line 68
    .line 69
    :try_start_0
    invoke-virtual {v7, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    instance-of v7, v7, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    .line 75
    if-eqz v7, :cond_3

    .line 76
    .line 77
    return v1

    .line 78
    :catch_0
    return v4

    .line 79
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_2

    .line 91
    .line 92
    return v4
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
.end method

.method private static create()Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;
    .locals 2

    .line 1
    sget-object v0, Lmirror/android/app/ActivityThread;->mInstrumentation:Lmirror/RefObject;

    .line 2
    .line 3
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->mainThread()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/app/Instrumentation;

    .line 12
    .line 13
    instance-of v1, v0, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    new-instance v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;-><init>(Landroid/app/Instrumentation;)V

    .line 23
    .line 24
    .line 25
    return-object v1
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
.end method

.method private dynamicResolveConflict()V
    .locals 10

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    array-length v1, v0

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    if-ge v3, v1, :cond_1

    .line 15
    .line 16
    aget-object v4, v0, v3

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    const-class v6, Landroid/app/Instrumentation;

    .line 23
    .line 24
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    sget-object v5, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->TAG:Ljava/lang/String;

    .line 31
    .line 32
    const-string v6, "resolve conflict instrumentation: %s->%s"

    .line 33
    .line 34
    const/4 v7, 0x2

    .line 35
    new-array v7, v7, [Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v8, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    .line 38
    .line 39
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    aput-object v8, v7, v2

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    const/4 v9, 0x1

    .line 54
    aput-object v8, v7, v9

    .line 55
    .line 56
    invoke-static {v5, v6, v7}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 60
    .line 61
    .line 62
    iget-object v5, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    .line 63
    .line 64
    iget-object v6, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    .line 65
    .line 66
    invoke-virtual {v4, v5, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 74
    .line 75
    .line 76
    :cond_1
    return-void
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
.end method

.method private getAppCallback()Lcom/lody/virtual/client/core/AppCallback;
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getAppCallback()Lcom/lody/virtual/client/core/AppCallback;

    move-result-object v0

    return-object v0
.end method

.method public static getDefault()Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;
    .locals 2

    .line 1
    sget-object v0, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->gDefault:Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->gDefault:Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->create()Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sput-object v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->gDefault:Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;

    .line 17
    .line 18
    :cond_0
    monitor-exit v0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw v1

    .line 23
    :cond_1
    :goto_0
    sget-object v0, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->gDefault:Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;

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
.end method


# virtual methods
.method public callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->checkActivityCallback()V

    .line 2
    sget-object v0, Lmirror/android/app/Activity;->mActivityInfo:Lmirror/RefObject;

    invoke-virtual {v0, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ActivityInfo;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-static {p1, v0}, Lcom/lody/virtual/client/fixer/ContextFixer;->fixContext(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    invoke-static {p1}, Lcom/lody/virtual/client/fixer/ActivityFixer;->fixActivity(Landroid/app/Activity;)V

    .line 6
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->getAppCallback()Lcom/lody/virtual/client/core/AppCallback;

    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, Lcom/lody/virtual/client/core/AppCallback;->beforeActivityOnCreate(Landroid/app/Activity;)V

    .line 8
    invoke-super {p0, p1, p2}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 9
    invoke-interface {v0, p1}, Lcom/lody/virtual/client/core/AppCallback;->afterActivityOnCreate(Landroid/app/Activity;)V

    return-void
.end method

.method public callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->checkActivityCallback()V

    .line 11
    sget-object v0, Lmirror/android/app/Activity;->mActivityInfo:Lmirror/RefObject;

    invoke-virtual {v0, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ActivityInfo;

    if-eqz v0, :cond_0

    .line 12
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {p1, v0}, Lcom/lody/virtual/client/fixer/ContextFixer;->fixContext(Landroid/content/Context;Ljava/lang/String;)V

    .line 14
    invoke-static {p1}, Lcom/lody/virtual/client/fixer/ActivityFixer;->fixActivity(Landroid/app/Activity;)V

    .line 15
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->getAppCallback()Lcom/lody/virtual/client/core/AppCallback;

    move-result-object v0

    .line 16
    invoke-interface {v0, p1}, Lcom/lody/virtual/client/core/AppCallback;->beforeActivityOnCreate(Landroid/app/Activity;)V

    .line 17
    invoke-super {p0, p1, p2, p3}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V

    .line 18
    invoke-interface {v0, p1}, Lcom/lody/virtual/client/core/AppCallback;->afterActivityOnCreate(Landroid/app/Activity;)V

    return-void
.end method

.method public callActivityOnDestroy(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->getAppCallback()Lcom/lody/virtual/client/core/AppCallback;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lcom/lody/virtual/client/core/AppCallback;->beforeActivityOnDestroy(Landroid/app/Activity;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->callActivityOnDestroy(Landroid/app/Activity;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/lody/virtual/client/core/AppCallback;->afterActivityOnDestroy(Landroid/app/Activity;)V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public callActivityOnPause(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->checkActivityCallback()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->callActivityOnPause(Landroid/app/Activity;)V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
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
.end method

.method public callActivityOnResume(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->getAppCallback()Lcom/lody/virtual/client/core/AppCallback;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lcom/lody/virtual/client/core/AppCallback;->beforeActivityOnResume(Landroid/app/Activity;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->callActivityOnResume(Landroid/app/Activity;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/lody/virtual/client/core/AppCallback;->afterActivityOnResume(Landroid/app/Activity;)V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public callActivityOnStart(Landroid/app/Activity;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->getAppCallback()Lcom/lody/virtual/client/core/AppCallback;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lcom/lody/virtual/client/core/AppCallback;->beforeActivityOnStart(Landroid/app/Activity;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->callActivityOnStart(Landroid/app/Activity;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2}, Lcom/lody/virtual/client/core/SettingConfig;->disableSetScreenOrientation(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    sget-object v1, Lmirror/android/app/Activity;->mActivityInfo:Lmirror/RefObject;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Landroid/content/pm/ActivityInfo;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    iget v2, v1, Landroid/content/pm/ActivityInfo;->screenOrientation:I

    .line 36
    .line 37
    const/4 v3, -0x1

    .line 38
    if-eq v2, v3, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-ne v2, v3, :cond_0

    .line 45
    .line 46
    iget v1, v1, Landroid/content/pm/ActivityInfo;->screenOrientation:I

    .line 47
    .line 48
    invoke-virtual {p1, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-interface {v0, p1}, Lcom/lody/virtual/client/core/AppCallback;->afterActivityOnStart(Landroid/app/Activity;)V

    .line 52
    .line 53
    .line 54
    return-void
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

.method public callActivityOnStop(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->getAppCallback()Lcom/lody/virtual/client/core/AppCallback;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lcom/lody/virtual/client/core/AppCallback;->beforeActivityOnStop(Landroid/app/Activity;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->callActivityOnStop(Landroid/app/Activity;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/lody/virtual/client/core/AppCallback;->afterActivityOnStop(Landroid/app/Activity;)V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public callApplicationOnCreate(Landroid/app/Application;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->checkActivityCallback()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->callApplicationOnCreate(Landroid/app/Application;)V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
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
.end method

.method public getBaseInstrumentation()Landroid/app/Instrumentation;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    return-object v0
.end method

.method public inject()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    sget-object v0, Lmirror/android/app/ActivityThread;->mInstrumentation:Lmirror/RefObject;

    .line 2
    .line 3
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->mainThread()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/app/Instrumentation;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    .line 14
    .line 15
    sget-object v0, Lmirror/android/app/ActivityThread;->mInstrumentation:Lmirror/RefObject;

    .line 16
    .line 17
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->mainThread()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1, p0}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    return-void
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
.end method

.method public isEnvBad()Z
    .locals 2

    sget-object v0, Lmirror/android/app/ActivityThread;->mInstrumentation:Lmirror/RefObject;

    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->mainThread()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Instrumentation;

    invoke-direct {p0, v0}, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->checkIsEnvOk(Landroid/app/Instrumentation;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
