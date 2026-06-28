.class public Lcom/lody/virtual/client/hook/proxies/backup/BackupManagerStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/android/app/backup/IBackupManager$Stub;->asInterface:Lmirror/RefStaticMethod;

    const-string v1, "backup"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected onBindMethods()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 5
    .line 6
    const-string v1, "dataChanged"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 16
    .line 17
    const-string v1, "clearBackupData"

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 26
    .line 27
    const-string v1, "agentConnected"

    .line 28
    .line 29
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 33
    .line 34
    .line 35
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 36
    .line 37
    const-string v1, "agentDisconnected"

    .line 38
    .line 39
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 43
    .line 44
    .line 45
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 46
    .line 47
    const-string v1, "restoreAtInstall"

    .line 48
    .line 49
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 53
    .line 54
    .line 55
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 56
    .line 57
    const-string v1, "setBackupEnabled"

    .line 58
    .line 59
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 63
    .line 64
    .line 65
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 66
    .line 67
    const-string v1, "setBackupProvisioned"

    .line 68
    .line 69
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 73
    .line 74
    .line 75
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 76
    .line 77
    const-string v1, "backupNow"

    .line 78
    .line 79
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 83
    .line 84
    .line 85
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 86
    .line 87
    const-string v1, "fullBackup"

    .line 88
    .line 89
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 93
    .line 94
    .line 95
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 96
    .line 97
    const-string v1, "fullTransportBackup"

    .line 98
    .line 99
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 103
    .line 104
    .line 105
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 106
    .line 107
    const-string v1, "fullRestore"

    .line 108
    .line 109
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 113
    .line 114
    .line 115
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 116
    .line 117
    const-string v1, "acknowledgeFullBackupOrRestore"

    .line 118
    .line 119
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 123
    .line 124
    .line 125
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 126
    .line 127
    const-string v1, "getCurrentTransport"

    .line 128
    .line 129
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 133
    .line 134
    .line 135
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    new-array v1, v1, [Ljava/lang/String;

    .line 139
    .line 140
    const-string v3, "listAllTransports"

    .line 141
    .line 142
    invoke-direct {v0, v3, v1}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 146
    .line 147
    .line 148
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 149
    .line 150
    const-string v1, "selectBackupTransport"

    .line 151
    .line 152
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 156
    .line 157
    .line 158
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 159
    .line 160
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 161
    .line 162
    const-string v3, "isBackupEnabled"

    .line 163
    .line 164
    invoke-direct {v0, v3, v1}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 168
    .line 169
    .line 170
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 171
    .line 172
    const-string v3, "setBackupPassword"

    .line 173
    .line 174
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-direct {v0, v3, v4}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 180
    .line 181
    .line 182
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 183
    .line 184
    const-string v3, "hasBackupPassword"

    .line 185
    .line 186
    invoke-direct {v0, v3, v1}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 190
    .line 191
    .line 192
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 193
    .line 194
    const-string v3, "beginRestoreSession"

    .line 195
    .line 196
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 200
    .line 201
    .line 202
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isOreo()Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_0

    .line 207
    .line 208
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 209
    .line 210
    const-string v3, "selectBackupTransportAsync"

    .line 211
    .line 212
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 216
    .line 217
    .line 218
    :cond_0
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isPie()Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_1

    .line 223
    .line 224
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 225
    .line 226
    const-string v3, "updateTransportAttributes"

    .line 227
    .line 228
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 232
    .line 233
    .line 234
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 235
    .line 236
    const-string v3, "isBackupServiceActive"

    .line 237
    .line 238
    invoke-direct {v0, v3, v1}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 242
    .line 243
    .line 244
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 245
    .line 246
    const-string v1, "updateTransportAttributesForUser"

    .line 247
    .line 248
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 252
    .line 253
    .line 254
    :cond_1
    return-void
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
.end method
