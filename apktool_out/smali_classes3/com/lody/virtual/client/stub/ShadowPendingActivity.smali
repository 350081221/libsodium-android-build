.class public Lcom/lody/virtual/client/stub/ShadowPendingActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->startActivityTrace(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 v0, 0x1

    .line 23
    :try_start_0
    invoke-static {p1, v0}, Lcom/lody/virtual/helper/utils/ComponentUtils;->parseIntentSenderInfo(Landroid/content/Intent;Z)Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-eqz v0, :cond_3

    .line 34
    .line 35
    iget v1, v0, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->userId:I

    .line 36
    .line 37
    const/4 v2, -0x1

    .line 38
    if-eq v1, v2, :cond_3

    .line 39
    .line 40
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v2, v0, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->intent:Landroid/content/Intent;

    .line 45
    .line 46
    iget v3, v0, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->userId:I

    .line 47
    .line 48
    invoke-virtual {v1, v2, v3}, Lcom/lody/virtual/client/core/VirtualCore;->resolveActivityInfo(Landroid/content/Intent;I)Landroid/content/pm/ActivityInfo;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    if-nez v6, :cond_0

    .line 53
    .line 54
    const-class v0, Lcom/lody/virtual/client/stub/ShadowPendingActivity;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v2, "failed to resolve intent: "

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {v0, p1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_0
    iget-object p1, v0, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->callerActivity:Landroid/os/IBinder;

    .line 85
    .line 86
    if-eqz p1, :cond_2

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/app/Activity;->isTaskRoot()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    iget-object p1, v0, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->intent:Landroid/content/Intent;

    .line 96
    .line 97
    const/high16 v1, 0x2000000

    .line 98
    .line 99
    invoke-virtual {p1, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    iget-object v5, v0, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->intent:Landroid/content/Intent;

    .line 107
    .line 108
    iget-object v7, v0, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->callerActivity:Landroid/os/IBinder;

    .line 109
    .line 110
    iget-object v8, v0, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->options:Landroid/os/Bundle;

    .line 111
    .line 112
    const/4 v9, 0x0

    .line 113
    const/4 v10, -0x1

    .line 114
    iget-object v11, v0, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->targetPkg:Ljava/lang/String;

    .line 115
    .line 116
    iget v12, v0, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->userId:I

    .line 117
    .line 118
    invoke-virtual/range {v4 .. v12}, Lcom/lody/virtual/client/ipc/VActivityManager;->startActivity(Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;Landroid/os/Bundle;Ljava/lang/String;ILjava/lang/String;I)I

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_2
    :goto_1
    iget-object p1, v0, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->intent:Landroid/content/Intent;

    .line 123
    .line 124
    const/high16 v1, 0x10000000

    .line 125
    .line 126
    invoke-virtual {p1, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 127
    .line 128
    .line 129
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    iget-object v5, v0, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->intent:Landroid/content/Intent;

    .line 134
    .line 135
    const/4 v7, 0x0

    .line 136
    iget-object v8, v0, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->options:Landroid/os/Bundle;

    .line 137
    .line 138
    const/4 v9, 0x0

    .line 139
    const/4 v10, -0x1

    .line 140
    iget-object v11, v0, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->targetPkg:Ljava/lang/String;

    .line 141
    .line 142
    iget v12, v0, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->userId:I

    .line 143
    .line 144
    invoke-virtual/range {v4 .. v12}, Lcom/lody/virtual/client/ipc/VActivityManager;->startActivity(Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;Landroid/os/Bundle;Ljava/lang/String;ILjava/lang/String;I)I

    .line 145
    .line 146
    .line 147
    :cond_3
    :goto_2
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 148
    .line 149
    .line 150
    return-void
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

.method protected onRestart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartEnd()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeEnd()V

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method
