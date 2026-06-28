.class Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller;->call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller;

.field final synthetic val$vInstaller:Lcom/lody/virtual/server/IPackageInstaller;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller;Lcom/lody/virtual/server/IPackageInstaller;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller$1;->this$0:Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller;

    iput-object p2, p0, Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller$1;->val$vInstaller:Lcom/lody/virtual/server/IPackageInstaller;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private createSession(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    const/4 p1, 0x0

    .line 2
    aget-object p1, p3, p1

    .line 3
    .line 4
    check-cast p1, Landroid/content/pm/PackageInstaller$SessionParams;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/lody/virtual/server/pm/installer/SessionParams;->create(Landroid/content/pm/PackageInstaller$SessionParams;)Lcom/lody/virtual/server/pm/installer/SessionParams;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 p2, 0x1

    .line 11
    aget-object p2, p3, p2

    .line 12
    .line 13
    check-cast p2, Ljava/lang/String;

    .line 14
    .line 15
    iget-object p3, p0, Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller$1;->val$vInstaller:Lcom/lody/virtual/server/IPackageInstaller;

    .line 16
    .line 17
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-interface {p3, p1, p2, v0}, Lcom/lody/virtual/server/IPackageInstaller;->createSession(Lcom/lody/virtual/server/pm/installer/SessionParams;Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
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
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "call "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, " -> "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-static {p3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "PackageInstaller"

    .line 35
    .line 36
    invoke-static {v1, v0}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/4 v3, 0x1

    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const/4 v6, -0x1

    .line 57
    sparse-switch v2, :sswitch_data_0

    .line 58
    .line 59
    .line 60
    goto/16 :goto_0

    .line 61
    .line 62
    :sswitch_0
    const-string v2, "openSession"

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_0

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :cond_0
    const/16 v6, 0xc

    .line 73
    .line 74
    goto/16 :goto_0

    .line 75
    .line 76
    :sswitch_1
    const-string v2, "unregisterCallback"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_1

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :cond_1
    const/16 v6, 0xb

    .line 87
    .line 88
    goto/16 :goto_0

    .line 89
    .line 90
    :sswitch_2
    const-string v2, "getMySessions"

    .line 91
    .line 92
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_2

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :cond_2
    const/16 v6, 0xa

    .line 101
    .line 102
    goto/16 :goto_0

    .line 103
    .line 104
    :sswitch_3
    const-string v2, "updateSessionAppLabel"

    .line 105
    .line 106
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_3

    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :cond_3
    const/16 v6, 0x9

    .line 115
    .line 116
    goto/16 :goto_0

    .line 117
    .line 118
    :sswitch_4
    const-string v2, "setPermissionsResult"

    .line 119
    .line 120
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_4

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :cond_4
    const/16 v6, 0x8

    .line 129
    .line 130
    goto/16 :goto_0

    .line 131
    .line 132
    :sswitch_5
    const-string v2, "getAllSessions"

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-nez v0, :cond_5

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_5
    const/4 v6, 0x7

    .line 142
    goto :goto_0

    .line 143
    :sswitch_6
    const-string v2, "createSession"

    .line 144
    .line 145
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_6

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_6
    const/4 v6, 0x6

    .line 153
    goto :goto_0

    .line 154
    :sswitch_7
    const-string v2, "abandonSession"

    .line 155
    .line 156
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-nez v0, :cond_7

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_7
    const/4 v6, 0x5

    .line 164
    goto :goto_0

    .line 165
    :sswitch_8
    const-string v2, "getStagedSessions"

    .line 166
    .line 167
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-nez v0, :cond_8

    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_8
    const/4 v6, 0x4

    .line 175
    goto :goto_0

    .line 176
    :sswitch_9
    const-string v2, "registerCallback"

    .line 177
    .line 178
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_9

    .line 183
    .line 184
    goto :goto_0

    .line 185
    :cond_9
    const/4 v6, 0x3

    .line 186
    goto :goto_0

    .line 187
    :sswitch_a
    const-string v2, "updateSessionAppIcon"

    .line 188
    .line 189
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-nez v0, :cond_a

    .line 194
    .line 195
    goto :goto_0

    .line 196
    :cond_a
    const/4 v6, 0x2

    .line 197
    goto :goto_0

    .line 198
    :sswitch_b
    const-string v2, "getSessionInfo"

    .line 199
    .line 200
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-nez v0, :cond_b

    .line 205
    .line 206
    goto :goto_0

    .line 207
    :cond_b
    move v6, v3

    .line 208
    goto :goto_0

    .line 209
    :sswitch_c
    const-string v2, "toString"

    .line 210
    .line 211
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-nez v0, :cond_c

    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_c
    move v6, v4

    .line 219
    :goto_0
    packed-switch v6, :pswitch_data_0

    .line 220
    .line 221
    .line 222
    invoke-static {v1}, Lcom/lody/virtual/helper/utils/VLog;->printStackTrace(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    new-instance p1, Ljava/lang/RuntimeException;

    .line 226
    .line 227
    new-instance p3, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 230
    .line 231
    .line 232
    const-string v0, "Not support PackageInstaller method : "

    .line 233
    .line 234
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p2

    .line 241
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p2

    .line 248
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw p1

    .line 252
    :pswitch_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller$1;->val$vInstaller:Lcom/lody/virtual/server/IPackageInstaller;

    .line 253
    .line 254
    aget-object p2, p3, v4

    .line 255
    .line 256
    check-cast p2, Ljava/lang/Integer;

    .line 257
    .line 258
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 259
    .line 260
    .line 261
    move-result p2

    .line 262
    invoke-interface {p1, p2}, Lcom/lody/virtual/server/IPackageInstaller;->openSession(I)Landroid/content/pm/IPackageInstallerSession;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    return-object p1

    .line 267
    :pswitch_1
    aget-object p1, p3, v4

    .line 268
    .line 269
    check-cast p1, Landroid/content/pm/IPackageInstallerCallback;

    .line 270
    .line 271
    iget-object p2, p0, Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller$1;->val$vInstaller:Lcom/lody/virtual/server/IPackageInstaller;

    .line 272
    .line 273
    invoke-interface {p2, p1}, Lcom/lody/virtual/server/IPackageInstaller;->unregisterCallback(Landroid/content/pm/IPackageInstallerCallback;)V

    .line 274
    .line 275
    .line 276
    return-object v5

    .line 277
    :pswitch_2
    aget-object p1, p3, v4

    .line 278
    .line 279
    check-cast p1, Ljava/lang/String;

    .line 280
    .line 281
    aget-object p2, p3, v3

    .line 282
    .line 283
    check-cast p2, Ljava/lang/Integer;

    .line 284
    .line 285
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 286
    .line 287
    .line 288
    move-result p2

    .line 289
    iget-object p3, p0, Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller$1;->val$vInstaller:Lcom/lody/virtual/server/IPackageInstaller;

    .line 290
    .line 291
    invoke-interface {p3, p1, p2}, Lcom/lody/virtual/server/IPackageInstaller;->getMySessions(Ljava/lang/String;I)Lcom/lody/virtual/remote/VParceledListSlice;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    invoke-virtual {p1}, Lcom/lody/virtual/remote/VParceledListSlice;->getList()Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    new-instance p2, Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 302
    .line 303
    .line 304
    move-result p3

    .line 305
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 306
    .line 307
    .line 308
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 313
    .line 314
    .line 315
    move-result p3

    .line 316
    if-eqz p3, :cond_d

    .line 317
    .line 318
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object p3

    .line 322
    check-cast p3, Lcom/lody/virtual/server/pm/installer/SessionInfo;

    .line 323
    .line 324
    invoke-virtual {p3}, Lcom/lody/virtual/server/pm/installer/SessionInfo;->alloc()Landroid/content/pm/PackageInstaller$SessionInfo;

    .line 325
    .line 326
    .line 327
    move-result-object p3

    .line 328
    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    goto :goto_1

    .line 332
    :cond_d
    invoke-static {p2}, Lcom/lody/virtual/helper/compat/ParceledListSliceCompat;->create(Ljava/util/List;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    return-object p1

    .line 337
    :pswitch_3
    aget-object p1, p3, v4

    .line 338
    .line 339
    check-cast p1, Ljava/lang/Integer;

    .line 340
    .line 341
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 342
    .line 343
    .line 344
    move-result p1

    .line 345
    aget-object p2, p3, v3

    .line 346
    .line 347
    check-cast p2, Ljava/lang/String;

    .line 348
    .line 349
    iget-object p3, p0, Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller$1;->val$vInstaller:Lcom/lody/virtual/server/IPackageInstaller;

    .line 350
    .line 351
    invoke-interface {p3, p1, p2}, Lcom/lody/virtual/server/IPackageInstaller;->updateSessionAppLabel(ILjava/lang/String;)V

    .line 352
    .line 353
    .line 354
    return-object v5

    .line 355
    :pswitch_4
    aget-object p1, p3, v4

    .line 356
    .line 357
    check-cast p1, Ljava/lang/Integer;

    .line 358
    .line 359
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 360
    .line 361
    .line 362
    move-result p1

    .line 363
    aget-object p2, p3, v3

    .line 364
    .line 365
    check-cast p2, Ljava/lang/Boolean;

    .line 366
    .line 367
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 368
    .line 369
    .line 370
    move-result p2

    .line 371
    iget-object p3, p0, Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller$1;->val$vInstaller:Lcom/lody/virtual/server/IPackageInstaller;

    .line 372
    .line 373
    invoke-interface {p3, p1, p2}, Lcom/lody/virtual/server/IPackageInstaller;->setPermissionsResult(IZ)V

    .line 374
    .line 375
    .line 376
    return-object v5

    .line 377
    :pswitch_5
    aget-object p1, p3, v4

    .line 378
    .line 379
    check-cast p1, Ljava/lang/Integer;

    .line 380
    .line 381
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 382
    .line 383
    .line 384
    move-result p1

    .line 385
    iget-object p2, p0, Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller$1;->val$vInstaller:Lcom/lody/virtual/server/IPackageInstaller;

    .line 386
    .line 387
    invoke-interface {p2, p1}, Lcom/lody/virtual/server/IPackageInstaller;->getAllSessions(I)Lcom/lody/virtual/remote/VParceledListSlice;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    invoke-virtual {p1}, Lcom/lody/virtual/remote/VParceledListSlice;->getList()Ljava/util/List;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    new-instance p2, Ljava/util/ArrayList;

    .line 396
    .line 397
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 398
    .line 399
    .line 400
    move-result p3

    .line 401
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 402
    .line 403
    .line 404
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 409
    .line 410
    .line 411
    move-result p3

    .line 412
    if-eqz p3, :cond_e

    .line 413
    .line 414
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object p3

    .line 418
    check-cast p3, Lcom/lody/virtual/server/pm/installer/SessionInfo;

    .line 419
    .line 420
    invoke-virtual {p3}, Lcom/lody/virtual/server/pm/installer/SessionInfo;->alloc()Landroid/content/pm/PackageInstaller$SessionInfo;

    .line 421
    .line 422
    .line 423
    move-result-object p3

    .line 424
    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    goto :goto_2

    .line 428
    :cond_e
    invoke-static {p2}, Lcom/lody/virtual/helper/compat/ParceledListSliceCompat;->create(Ljava/util/List;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    return-object p1

    .line 433
    :pswitch_6
    invoke-direct {p0, p1, p2, p3}, Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller$1;->createSession(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    return-object p1

    .line 438
    :pswitch_7
    iget-object p1, p0, Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller$1;->val$vInstaller:Lcom/lody/virtual/server/IPackageInstaller;

    .line 439
    .line 440
    aget-object p2, p3, v4

    .line 441
    .line 442
    check-cast p2, Ljava/lang/Integer;

    .line 443
    .line 444
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 445
    .line 446
    .line 447
    move-result p2

    .line 448
    invoke-interface {p1, p2}, Lcom/lody/virtual/server/IPackageInstaller;->abandonSession(I)V

    .line 449
    .line 450
    .line 451
    return-object v5

    .line 452
    :pswitch_8
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 453
    .line 454
    invoke-static {p1}, Lcom/lody/virtual/helper/compat/ParceledListSliceCompat;->create(Ljava/util/List;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    return-object p1

    .line 459
    :pswitch_9
    aget-object p1, p3, v4

    .line 460
    .line 461
    check-cast p1, Landroid/content/pm/IPackageInstallerCallback;

    .line 462
    .line 463
    iget-object p2, p0, Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller$1;->val$vInstaller:Lcom/lody/virtual/server/IPackageInstaller;

    .line 464
    .line 465
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 466
    .line 467
    .line 468
    move-result p3

    .line 469
    invoke-interface {p2, p1, p3}, Lcom/lody/virtual/server/IPackageInstaller;->registerCallback(Landroid/content/pm/IPackageInstallerCallback;I)V

    .line 470
    .line 471
    .line 472
    return-object v5

    .line 473
    :pswitch_a
    aget-object p1, p3, v4

    .line 474
    .line 475
    check-cast p1, Ljava/lang/Integer;

    .line 476
    .line 477
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 478
    .line 479
    .line 480
    move-result p1

    .line 481
    aget-object p2, p3, v3

    .line 482
    .line 483
    check-cast p2, Landroid/graphics/Bitmap;

    .line 484
    .line 485
    iget-object p3, p0, Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller$1;->val$vInstaller:Lcom/lody/virtual/server/IPackageInstaller;

    .line 486
    .line 487
    invoke-interface {p3, p1, p2}, Lcom/lody/virtual/server/IPackageInstaller;->updateSessionAppIcon(ILandroid/graphics/Bitmap;)V

    .line 488
    .line 489
    .line 490
    return-object v5

    .line 491
    :pswitch_b
    iget-object p1, p0, Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInstaller$1;->val$vInstaller:Lcom/lody/virtual/server/IPackageInstaller;

    .line 492
    .line 493
    aget-object p2, p3, v4

    .line 494
    .line 495
    check-cast p2, Ljava/lang/Integer;

    .line 496
    .line 497
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 498
    .line 499
    .line 500
    move-result p2

    .line 501
    invoke-interface {p1, p2}, Lcom/lody/virtual/server/IPackageInstaller;->getSessionInfo(I)Lcom/lody/virtual/server/pm/installer/SessionInfo;

    .line 502
    .line 503
    .line 504
    move-result-object p1

    .line 505
    if-eqz p1, :cond_f

    .line 506
    .line 507
    invoke-virtual {p1}, Lcom/lody/virtual/server/pm/installer/SessionInfo;->alloc()Landroid/content/pm/PackageInstaller$SessionInfo;

    .line 508
    .line 509
    .line 510
    move-result-object p1

    .line 511
    return-object p1

    .line 512
    :cond_f
    const/4 p1, 0x0

    .line 513
    return-object p1

    .line 514
    :pswitch_c
    return-object v1

    .line 515
    :sswitch_data_0
    .sparse-switch
        -0x69e9ad94 -> :sswitch_c
        -0x278598d2 -> :sswitch_b
        -0x26ea3c13 -> :sswitch_a
        -0x18089ff8 -> :sswitch_9
        -0x11c4e727 -> :sswitch_8
        -0x592f19f -> :sswitch_7
        -0x3c85a06 -> :sswitch_6
        0x37f2c428 -> :sswitch_5
        0x45bfc97f -> :sswitch_4
        0x49cbe600 -> :sswitch_3
        0x5d788e5f -> :sswitch_2
        0x67a11ca1 -> :sswitch_1
        0x6a952cec -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
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
