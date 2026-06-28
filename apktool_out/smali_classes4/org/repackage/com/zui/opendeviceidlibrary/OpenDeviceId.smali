.class public Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$CallBack;
    }
.end annotation


# static fields
.field private static c:Ljava/lang/String; = "OpenDeviceId library"

.field private static d:Z = false


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;

.field private e:Landroid/content/ServiceConnection;

.field private f:Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$CallBack;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a:Landroid/content/Context;

    .line 6
    .line 7
    iput-object v0, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->f:Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$CallBack;

    .line 8
    .line 9
    return-void
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

.method static synthetic a(Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;)Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b:Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;

    return-object p1
.end method

.method static synthetic a(Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;)Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$CallBack;
    .locals 0

    .line 2
    iget-object p0, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->f:Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$CallBack;

    return-object p0
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    .line 21
    sget-boolean v0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->d:Z

    if-eqz v0, :cond_0

    sget-object v0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->c:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method static synthetic a(Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    .line 10
    sget-boolean v0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->d:Z

    if-eqz v0, :cond_0

    sget-object v0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->c:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$CallBack;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$CallBack<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 4
    iput-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a:Landroid/content/Context;

    .line 5
    iput-object p2, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->f:Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$CallBack;

    .line 6
    new-instance p1, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$1;

    invoke-direct {p1, p0}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$1;-><init>(Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;)V

    iput-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->e:Landroid/content/ServiceConnection;

    .line 7
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string p2, "org.repackage.com.zui.deviceidservice"

    const-string v0, "org.repackage.com.zui.deviceidservice.DeviceidService"

    .line 8
    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    iget-object p2, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a:Landroid/content/Context;

    iget-object v0, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->e:Landroid/content/ServiceConnection;

    const/4 v1, 0x1

    invoke-virtual {p2, p1, v0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "bindService Successful!"

    .line 10
    invoke-direct {p0, p1}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Ljava/lang/String;)V

    return v1

    :cond_0
    const-string p1, "bindService Failed!"

    .line 11
    invoke-direct {p0, p1}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Ljava/lang/String;)V

    const/4 p1, -0x1

    return p1

    .line 12
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Context can not be null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a()Ljava/lang/String;
    .locals 2

    .line 13
    iget-object v0, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a:Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 14
    :try_start_0
    iget-object v0, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b:Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;

    if-eqz v0, :cond_0

    .line 15
    invoke-interface {v0}, Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;->a()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "getOAID error, RemoteException!"

    .line 16
    invoke-direct {p0, v1}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    const-string v0, "Context is null."

    .line 18
    invoke-direct {p0, v0}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b(Ljava/lang/String;)V

    .line 19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Context is null, must be new OpenDeviceId first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Z)V
    .locals 0

    .line 20
    sput-boolean p1, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->d:Z

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a:Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b:Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;->b()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "getUDID error, Exception!"

    .line 4
    invoke-direct {p0, v1}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "getUDID error, RemoteException!"

    .line 6
    invoke-direct {p0, v1}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    const-string v0, "Context is null."

    .line 8
    invoke-direct {p0, v0}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b(Ljava/lang/String;)V

    .line 9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Context is null, must be new OpenDeviceId first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b:Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    const-string v1, "Device support opendeviceid"

    .line 7
    .line 8
    invoke-direct {p0, v1}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b:Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;

    .line 12
    .line 13
    invoke-interface {v1}, Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;->c()Z

    .line 14
    .line 15
    .line 16
    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    :cond_0
    return v0

    .line 18
    :catch_0
    const-string v1, "isSupport error, RemoteException!"

    .line 19
    .line 20
    invoke-direct {p0, v1}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return v0
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

.method public d()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "liufeng, getVAID package\uff1a"

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {p0, v1}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const-string v1, ""

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    :try_start_0
    iget-object v1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b:Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-interface {v1, v0}, Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    return-object v0

    .line 48
    :catch_0
    move-exception v0

    .line 49
    const-string v1, "getVAID error, RemoteException!"

    .line 50
    .line 51
    invoke-direct {p0, v1}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const-string v0, "input package is null!"

    .line 59
    .line 60
    invoke-direct {p0, v0}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 64
    return-object v0

    .line 65
    :cond_2
    const-string v0, "Context is null."

    .line 66
    .line 67
    invoke-direct {p0, v0}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 71
    .line 72
    const-string v1, "Context is null, must be new OpenDeviceId first"

    .line 73
    .line 74
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0
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
.end method

.method public e()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "liufeng, getAAID package\uff1a"

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {p0, v1}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    const-string v2, ""

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    :try_start_0
    iget-object v3, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b:Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-interface {v3, v0}, Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    :cond_0
    iget-object v2, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b:Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;

    .line 57
    .line 58
    invoke-interface {v2, v0}, Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;->c(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    iget-object v2, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b:Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;

    .line 65
    .line 66
    invoke-interface {v2, v0}, Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    move-object v1, v0

    .line 71
    goto :goto_0

    .line 72
    :catch_0
    const-string v0, "getAAID error, RemoteException!"

    .line 73
    .line 74
    invoke-direct {p0, v0}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    const-string v0, "input package is null!"

    .line 79
    .line 80
    invoke-direct {p0, v0}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    :goto_0
    return-object v1

    .line 84
    :cond_3
    const-string v0, "Context is null."

    .line 85
    .line 86
    invoke-direct {p0, v0}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 90
    .line 91
    const-string v1, "Context is null, must be new OpenDeviceId first"

    .line 92
    .line 93
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v0
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
.end method

.method public f()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->e:Landroid/content/ServiceConnection;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "unBind Service successful"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    const-string v0, "unBind Service exception"

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->b:Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;

    .line 21
    .line 22
    return-void
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
