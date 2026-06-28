.class public Lcom/lody/virtual/client/hook/proxies/appwidget/AppWidgetManagerStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/com/android/internal/appwidget/IAppWidgetService$Stub;->asInterface:Lmirror/RefStaticMethod;

    const-string v1, "appwidget"

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
    const/4 v1, 0x0

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-array v3, v1, [I

    .line 12
    .line 13
    const-string v4, "startListening"

    .line 14
    .line 15
    invoke-direct {v0, v4, v3}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 22
    .line 23
    const-string v3, "stopListening"

    .line 24
    .line 25
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 29
    .line 30
    .line 31
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 32
    .line 33
    const-string v3, "allocateAppWidgetId"

    .line 34
    .line 35
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 39
    .line 40
    .line 41
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 42
    .line 43
    const-string v3, "deleteAppWidgetId"

    .line 44
    .line 45
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 49
    .line 50
    .line 51
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 52
    .line 53
    const-string v3, "deleteHost"

    .line 54
    .line 55
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 59
    .line 60
    .line 61
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 62
    .line 63
    const-string v3, "deleteAllHosts"

    .line 64
    .line 65
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 69
    .line 70
    .line 71
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 72
    .line 73
    const-string v3, "getAppWidgetViews"

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    invoke-direct {v0, v3, v4}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 80
    .line 81
    .line 82
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 83
    .line 84
    const-string v3, "getAppWidgetIdsForHost"

    .line 85
    .line 86
    invoke-direct {v0, v3, v4}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 90
    .line 91
    .line 92
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 93
    .line 94
    const-string v3, "createAppWidgetConfigIntentSender"

    .line 95
    .line 96
    invoke-direct {v0, v3, v4}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 100
    .line 101
    .line 102
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 103
    .line 104
    const-string v3, "updateAppWidgetIds"

    .line 105
    .line 106
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 110
    .line 111
    .line 112
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 113
    .line 114
    const-string v3, "updateAppWidgetOptions"

    .line 115
    .line 116
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 120
    .line 121
    .line 122
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 123
    .line 124
    const-string v3, "getAppWidgetOptions"

    .line 125
    .line 126
    invoke-direct {v0, v3, v4}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 130
    .line 131
    .line 132
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 133
    .line 134
    const-string v3, "partiallyUpdateAppWidgetIds"

    .line 135
    .line 136
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 140
    .line 141
    .line 142
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 143
    .line 144
    const-string v3, "updateAppWidgetProvider"

    .line 145
    .line 146
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 150
    .line 151
    .line 152
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 153
    .line 154
    const-string v3, "notifyAppWidgetViewDataChanged"

    .line 155
    .line 156
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 160
    .line 161
    .line 162
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 163
    .line 164
    const-string v3, "getInstalledProvidersForProfile"

    .line 165
    .line 166
    invoke-direct {v0, v3, v4}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 170
    .line 171
    .line 172
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 173
    .line 174
    const-string v3, "getAppWidgetInfo"

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
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 185
    .line 186
    const-string v4, "hasBindAppWidgetPermission"

    .line 187
    .line 188
    invoke-direct {v0, v4, v3}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 192
    .line 193
    .line 194
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 195
    .line 196
    const-string v4, "setBindAppWidgetPermission"

    .line 197
    .line 198
    invoke-direct {v0, v4, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 202
    .line 203
    .line 204
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 205
    .line 206
    const-string v4, "bindAppWidgetId"

    .line 207
    .line 208
    invoke-direct {v0, v4, v3}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 212
    .line 213
    .line 214
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 215
    .line 216
    const-string v4, "bindRemoteViewsService"

    .line 217
    .line 218
    invoke-direct {v0, v4, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 222
    .line 223
    .line 224
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 225
    .line 226
    const-string v4, "unbindRemoteViewsService"

    .line 227
    .line 228
    invoke-direct {v0, v4, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

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
    const-string v4, "getAppWidgetIds"

    .line 237
    .line 238
    new-array v1, v1, [I

    .line 239
    .line 240
    invoke-direct {v0, v4, v1}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 244
    .line 245
    .line 246
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 247
    .line 248
    const-string v1, "isBoundWidgetPackage"

    .line 249
    .line 250
    invoke-direct {v0, v1, v3}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 254
    .line 255
    .line 256
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 257
    .line 258
    const-string v1, "updateAppWidgetProviderInfo"

    .line 259
    .line 260
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 264
    .line 265
    .line 266
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 267
    .line 268
    const-string v1, "requestPinAppWidget"

    .line 269
    .line 270
    invoke-direct {v0, v1, v3}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 274
    .line 275
    .line 276
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 277
    .line 278
    const-string v1, "noteAppWidgetTapped"

    .line 279
    .line 280
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 284
    .line 285
    .line 286
    return-void
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
