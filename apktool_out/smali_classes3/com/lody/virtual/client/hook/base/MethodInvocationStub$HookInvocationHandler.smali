.class Lcom/lody/virtual/client/hook/base/MethodInvocationStub$HookInvocationHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/base/MethodInvocationStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "HookInvocationHandler"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;


# direct methods
.method private constructor <init>(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/client/hook/base/MethodInvocationStub$HookInvocationHandler;->this$0:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;Lcom/lody/virtual/client/hook/base/MethodInvocationStub$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub$HookInvocationHandler;-><init>(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    iget-object v0, v1, Lcom/lody/virtual/client/hook/base/MethodInvocationStub$HookInvocationHandler;->this$0:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 8
    .line 9
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v0, v4}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getMethodProxy(Ljava/lang/String;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isStartup()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v5, 0x1

    .line 26
    const/4 v6, 0x0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    invoke-virtual {v4}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isEnable()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    move v7, v5

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v7, v6

    .line 40
    :goto_0
    iget-object v0, v1, Lcom/lody/virtual/client/hook/base/MethodInvocationStub$HookInvocationHandler;->this$0:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 41
    .line 42
    invoke-static {v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->access$100(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)Lcom/lody/virtual/client/hook/annotations/LogInvocation$Condition;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v8, Lcom/lody/virtual/client/hook/annotations/LogInvocation$Condition;->NEVER:Lcom/lody/virtual/client/hook/annotations/LogInvocation$Condition;

    .line 47
    .line 48
    if-ne v0, v8, :cond_2

    .line 49
    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    invoke-virtual {v4}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getInvocationLoggingCondition()Lcom/lody/virtual/client/hook/annotations/LogInvocation$Condition;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eq v0, v8, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move v0, v6

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    :goto_1
    move v0, v5

    .line 62
    :goto_2
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-virtual {v8}, Lcom/lody/virtual/client/core/VirtualCore;->isVAppProcess()Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-nez v8, :cond_3

    .line 71
    .line 72
    move v8, v6

    .line 73
    goto :goto_3

    .line 74
    :cond_3
    move v8, v0

    .line 75
    :goto_3
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-string v9, "setDynamicShortcuts"

    .line 80
    .line 81
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    const-string v10, "huawei"

    .line 94
    .line 95
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-nez v9, :cond_4

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v9, "honor"

    .line 106
    .line 107
    invoke-virtual {v0, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_6

    .line 112
    .line 113
    :cond_4
    sget-object v0, Lmirror/com/android/internal/infra/AndroidFuture;->ctor:Lmirror/RefConstructor;

    .line 114
    .line 115
    if-nez v0, :cond_5

    .line 116
    .line 117
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_5
    invoke-virtual {v0}, Lmirror/RefConstructor;->newInstance()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    sget-object v2, Lmirror/com/android/internal/infra/AndroidFuture;->complete:Lmirror/RefMethod;

    .line 125
    .line 126
    new-array v3, v5, [Ljava/lang/Object;

    .line 127
    .line 128
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 129
    .line 130
    aput-object v4, v3, v6

    .line 131
    .line 132
    invoke-virtual {v2, v0, v3}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    return-object v0

    .line 136
    :cond_6
    if-eqz v8, :cond_7

    .line 137
    .line 138
    :try_start_0
    invoke-static/range {p3 .. p3}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->argsToString([Ljava/lang/Object;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    sub-int/2addr v10, v5

    .line 147
    invoke-virtual {v0, v5, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    goto :goto_4

    .line 152
    :catchall_0
    move-exception v0

    .line 153
    new-instance v10, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    const-string v11, ""

    .line 159
    .line 160
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    :goto_4
    move-object v10, v0

    .line 175
    goto :goto_5

    .line 176
    :cond_7
    const/4 v10, 0x0

    .line 177
    :goto_5
    const-string v11, ") => "

    .line 178
    .line 179
    const-string v12, "("

    .line 180
    .line 181
    const-string v13, "."

    .line 182
    .line 183
    const-string v14, "void"

    .line 184
    .line 185
    if-eqz v8, :cond_8

    .line 186
    .line 187
    :try_start_1
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->access$200()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    const-string v15, "method(%s),proxy(%s),proxyMethod(%s)"

    .line 192
    .line 193
    const/4 v9, 0x3

    .line 194
    new-array v9, v9, [Ljava/lang/Object;

    .line 195
    .line 196
    aput-object v2, v9, v6

    .line 197
    .line 198
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 199
    .line 200
    .line 201
    move-result-object v16

    .line 202
    aput-object v16, v9, v5

    .line 203
    .line 204
    const/16 v16, 0x2

    .line 205
    .line 206
    aput-object v4, v9, v16

    .line 207
    .line 208
    invoke-static {v0, v15, v9}, Lcom/lody/virtual/helper/utils/VLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->access$200()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    const-string v9, "args(%s)"

    .line 216
    .line 217
    new-array v15, v5, [Ljava/lang/Object;

    .line 218
    .line 219
    aput-object v10, v15, v6

    .line 220
    .line 221
    invoke-static {v0, v9, v15}, Lcom/lody/virtual/helper/utils/VLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    goto :goto_6

    .line 225
    :catchall_1
    move-exception v0

    .line 226
    move-object v3, v0

    .line 227
    const/4 v9, 0x0

    .line 228
    goto/16 :goto_a

    .line 229
    .line 230
    :cond_8
    :goto_6
    if-eqz v7, :cond_9

    .line 231
    .line 232
    iget-object v0, v1, Lcom/lody/virtual/client/hook/base/MethodInvocationStub$HookInvocationHandler;->this$0:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 233
    .line 234
    invoke-static {v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->access$300(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v4, v0, v2, v3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->beforeCall(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-eqz v0, :cond_9

    .line 243
    .line 244
    iget-object v0, v1, Lcom/lody/virtual/client/hook/base/MethodInvocationStub$HookInvocationHandler;->this$0:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 245
    .line 246
    invoke-static {v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->access$300(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {v4, v0, v2, v3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 254
    :try_start_2
    iget-object v0, v1, Lcom/lody/virtual/client/hook/base/MethodInvocationStub$HookInvocationHandler;->this$0:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 255
    .line 256
    invoke-static {v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->access$300(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v4, v0, v2, v3, v9}, Lcom/lody/virtual/client/hook/base/MethodProxy;->afterCall(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 264
    goto :goto_7

    .line 265
    :cond_9
    :try_start_3
    iget-object v0, v1, Lcom/lody/virtual/client/hook/base/MethodInvocationStub$HookInvocationHandler;->this$0:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 266
    .line 267
    invoke-static {v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->access$300(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 275
    :goto_7
    move-object v9, v0

    .line 276
    if-eqz v8, :cond_a

    .line 277
    .line 278
    :try_start_4
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->access$200()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    const-string v3, "result(%s)"

    .line 283
    .line 284
    new-array v15, v5, [Ljava/lang/Object;

    .line 285
    .line 286
    aput-object v9, v15, v6

    .line 287
    .line 288
    invoke-static {v0, v3, v15}, Lcom/lody/virtual/helper/utils/VLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 289
    .line 290
    .line 291
    goto :goto_8

    .line 292
    :catchall_2
    move-exception v0

    .line 293
    move-object v3, v0

    .line 294
    goto :goto_a

    .line 295
    :cond_a
    :goto_8
    if-eqz v8, :cond_d

    .line 296
    .line 297
    iget-object v0, v1, Lcom/lody/virtual/client/hook/base/MethodInvocationStub$HookInvocationHandler;->this$0:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 298
    .line 299
    invoke-static {v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->access$100(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)Lcom/lody/virtual/client/hook/annotations/LogInvocation$Condition;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v0, v7, v6}, Lcom/lody/virtual/client/hook/annotations/LogInvocation$Condition;->getLogLevel(ZZ)I

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-eqz v4, :cond_b

    .line 308
    .line 309
    invoke-virtual {v4}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getInvocationLoggingCondition()Lcom/lody/virtual/client/hook/annotations/LogInvocation$Condition;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    invoke-virtual {v3, v7, v6}, Lcom/lody/virtual/client/hook/annotations/LogInvocation$Condition;->getLogLevel(ZZ)I

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    :cond_b
    if-ltz v0, :cond_d

    .line 322
    .line 323
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 328
    .line 329
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-eqz v3, :cond_c

    .line 334
    .line 335
    goto :goto_9

    .line 336
    :cond_c
    invoke-static {v9}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->argToString(Ljava/lang/Object;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v14

    .line 340
    :goto_9
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->access$200()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    new-instance v4, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v5

    .line 357
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    invoke-static {v0, v3, v2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 387
    .line 388
    .line 389
    :cond_d
    return-object v9

    .line 390
    :goto_a
    :try_start_5
    instance-of v0, v3, Ljava/lang/reflect/InvocationTargetException;

    .line 391
    .line 392
    if-eqz v0, :cond_e

    .line 393
    .line 394
    move-object v0, v3

    .line 395
    check-cast v0, Ljava/lang/reflect/InvocationTargetException;

    .line 396
    .line 397
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    if-eqz v0, :cond_e

    .line 402
    .line 403
    move-object v0, v3

    .line 404
    check-cast v0, Ljava/lang/reflect/InvocationTargetException;

    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 407
    .line 408
    .line 409
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 410
    move-object v15, v0

    .line 411
    goto :goto_b

    .line 412
    :cond_e
    move-object v15, v3

    .line 413
    :goto_b
    if-eqz v8, :cond_f

    .line 414
    .line 415
    :try_start_6
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->access$200()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 419
    :try_start_7
    const-string v6, "Throwable(%s)"

    .line 420
    .line 421
    new-array v2, v5, [Ljava/lang/Object;

    .line 422
    .line 423
    invoke-static {v3}, Lcom/lody/virtual/helper/utils/VLog;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 427
    const/16 v16, 0x0

    .line 428
    .line 429
    :try_start_8
    aput-object v3, v2, v16

    .line 430
    .line 431
    invoke-static {v0, v6, v2}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    goto :goto_c

    .line 435
    :catchall_3
    move-exception v0

    .line 436
    const/16 v16, 0x0

    .line 437
    .line 438
    goto :goto_d

    .line 439
    :catchall_4
    move-exception v0

    .line 440
    move/from16 v16, v6

    .line 441
    .line 442
    goto :goto_d

    .line 443
    :cond_f
    move/from16 v16, v6

    .line 444
    .line 445
    :goto_c
    throw v15
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 446
    :catchall_5
    move-exception v0

    .line 447
    :goto_d
    move-object v3, v15

    .line 448
    goto :goto_e

    .line 449
    :catchall_6
    move-exception v0

    .line 450
    move/from16 v16, v6

    .line 451
    .line 452
    :goto_e
    if-eqz v8, :cond_15

    .line 453
    .line 454
    iget-object v2, v1, Lcom/lody/virtual/client/hook/base/MethodInvocationStub$HookInvocationHandler;->this$0:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 455
    .line 456
    invoke-static {v2}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->access$100(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)Lcom/lody/virtual/client/hook/annotations/LogInvocation$Condition;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    if-eqz v3, :cond_10

    .line 461
    .line 462
    move v6, v5

    .line 463
    goto :goto_f

    .line 464
    :cond_10
    move/from16 v6, v16

    .line 465
    .line 466
    :goto_f
    invoke-virtual {v2, v7, v6}, Lcom/lody/virtual/client/hook/annotations/LogInvocation$Condition;->getLogLevel(ZZ)I

    .line 467
    .line 468
    .line 469
    move-result v2

    .line 470
    if-eqz v4, :cond_12

    .line 471
    .line 472
    invoke-virtual {v4}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getInvocationLoggingCondition()Lcom/lody/virtual/client/hook/annotations/LogInvocation$Condition;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    if-eqz v3, :cond_11

    .line 477
    .line 478
    goto :goto_10

    .line 479
    :cond_11
    move/from16 v5, v16

    .line 480
    .line 481
    :goto_10
    invoke-virtual {v4, v7, v5}, Lcom/lody/virtual/client/hook/annotations/LogInvocation$Condition;->getLogLevel(ZZ)I

    .line 482
    .line 483
    .line 484
    move-result v4

    .line 485
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    :cond_12
    if-ltz v2, :cond_15

    .line 490
    .line 491
    if-nez v3, :cond_14

    .line 492
    .line 493
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 498
    .line 499
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result v3

    .line 503
    if-eqz v3, :cond_13

    .line 504
    .line 505
    goto :goto_11

    .line 506
    :cond_13
    invoke-static {v9}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->argToString(Ljava/lang/Object;)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v14

    .line 510
    goto :goto_11

    .line 511
    :cond_14
    invoke-virtual {v3}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v14

    .line 515
    :goto_11
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->access$200()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    new-instance v4, Ljava/lang/StringBuilder;

    .line 520
    .line 521
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v5

    .line 532
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v5

    .line 542
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v4

    .line 561
    invoke-static {v2, v3, v4}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 562
    .line 563
    .line 564
    :cond_15
    throw v0
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
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
