.class public Lcom/lody/virtual/client/hook/proxies/fingerprint/FingerprintManagerStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x17
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/android/hardware/fingerprint/IFingerprintService$Stub;->asInterface:Lmirror/RefStaticMethod;

    const-string v1, "fingerprint"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected onBindMethods()V
    .locals 4

    .line 1
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 2
    .line 3
    const-string v1, "isHardwareDetected"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 12
    .line 13
    const-string v1, "hasEnrolledFingerprints"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 22
    .line 23
    const-string v1, "authenticate"

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 29
    .line 30
    .line 31
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 32
    .line 33
    const-string v2, "cancelAuthentication"

    .line 34
    .line 35
    invoke-direct {v0, v2}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 39
    .line 40
    .line 41
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 42
    .line 43
    const-string v2, "getEnrolledFingerprints"

    .line 44
    .line 45
    invoke-direct {v0, v2}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 49
    .line 50
    .line 51
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 52
    .line 53
    const-string v3, "getAuthenticatorId"

    .line 54
    .line 55
    invoke-direct {v0, v3}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 59
    .line 60
    .line 61
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 62
    .line 63
    const-string v3, "getSensorPropertiesInternal"

    .line 64
    .line 65
    invoke-direct {v0, v3}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 69
    .line 70
    .line 71
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 72
    .line 73
    const-string v3, "getSensorProperties"

    .line 74
    .line 75
    invoke-direct {v0, v3}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 79
    .line 80
    .line 81
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 82
    .line 83
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 87
    .line 88
    .line 89
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 90
    .line 91
    const-string v1, "detectFingerprint"

    .line 92
    .line 93
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 97
    .line 98
    .line 99
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 100
    .line 101
    const-string v1, "prepareForAuthentication"

    .line 102
    .line 103
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 107
    .line 108
    .line 109
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 110
    .line 111
    const-string v1, "cancelFingerprintDetect"

    .line 112
    .line 113
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 117
    .line 118
    .line 119
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 120
    .line 121
    const-string v1, "cancelAuthenticationFromService"

    .line 122
    .line 123
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 127
    .line 128
    .line 129
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 130
    .line 131
    const-string v1, "enroll"

    .line 132
    .line 133
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 137
    .line 138
    .line 139
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 140
    .line 141
    const-string v1, "remove"

    .line 142
    .line 143
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 147
    .line 148
    .line 149
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 150
    .line 151
    const-string v1, "removeAll"

    .line 152
    .line 153
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 157
    .line 158
    .line 159
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 160
    .line 161
    invoke-direct {v0, v2}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 165
    .line 166
    .line 167
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 168
    .line 169
    const-string v1, "isHardwareDetectedDeprecated"

    .line 170
    .line 171
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 175
    .line 176
    .line 177
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 178
    .line 179
    const-string v1, "generateChallenge"

    .line 180
    .line 181
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 185
    .line 186
    .line 187
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 188
    .line 189
    const-string v1, "revokeChallenge"

    .line 190
    .line 191
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 195
    .line 196
    .line 197
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 198
    .line 199
    const-string v1, "hasEnrolledFingerprintsDeprecated"

    .line 200
    .line 201
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 205
    .line 206
    .line 207
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 208
    .line 209
    const-string v1, "resetLockout"

    .line 210
    .line 211
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 215
    .line 216
    .line 217
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 218
    .line 219
    const-string v1, "addLockoutResetCallback"

    .line 220
    .line 221
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 225
    .line 226
    .line 227
    return-void
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
.end method
