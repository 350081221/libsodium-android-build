.class public Lcom/huawei/agconnect/apms/hilog/task/FetchTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/kji;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/agconnect/apms/hilog/task/FetchTask$FetchCallback;
    }
.end annotation


# static fields
.field public static final bcd:Lcom/huawei/agconnect/apms/log/AgentLog;


# instance fields
.field public final abc:Lcom/huawei/agconnect/apms/hilog/task/FetchTask$FetchCallback;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/hilog/task/FetchTask;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/agconnect/apms/hilog/task/FetchTask$FetchCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/hilog/task/FetchTask;->abc:Lcom/huawei/agconnect/apms/hilog/task/FetchTask$FetchCallback;

    .line 5
    .line 6
    return-void
    .line 7
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

.method public static synthetic a(Lcom/huawei/agconnect/apms/hilog/task/FetchTask;Lcom/huawei/agconnect/remoteconfig/ConfigValues;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/agconnect/apms/hilog/task/FetchTask;->abc(Lcom/huawei/agconnect/remoteconfig/ConfigValues;)V

    return-void
.end method

.method private synthetic abc(Lcom/huawei/agconnect/remoteconfig/ConfigValues;)V
    .locals 1

    .line 9
    new-instance v0, Lu1/a;

    invoke-direct {v0, p0, p1}, Lu1/a;-><init>(Lcom/huawei/agconnect/apms/hilog/task/FetchTask;Lcom/huawei/agconnect/remoteconfig/ConfigValues;)V

    invoke-static {v0}, Lcom/huawei/agconnect/apms/hgf;->abc(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic abc(Ljava/lang/Exception;)V
    .locals 2

    .line 10
    sget-object v0, Lcom/huawei/agconnect/apms/hilog/task/FetchTask;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "FetchTask fetch fail, "

    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/huawei/agconnect/apms/hilog/task/FetchTask;Lcom/huawei/agconnect/remoteconfig/ConfigValues;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/agconnect/apms/hilog/task/FetchTask;->bcd(Lcom/huawei/agconnect/remoteconfig/ConfigValues;)V

    return-void
.end method

.method private synthetic bcd(Lcom/huawei/agconnect/remoteconfig/ConfigValues;)V
    .locals 7

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;->getInstance()Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;->apply(Lcom/huawei/agconnect/remoteconfig/ConfigValues;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/huawei/agconnect/apms/hilog/task/FetchTask;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 9
    .line 10
    const-string v1, "FetchTask handleConfig"

    .line 11
    .line 12
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const-string p1, "FetchTask config is null"

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    const/16 v1, 0xa

    .line 26
    .line 27
    if-ge v0, v1, :cond_5

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v2, "apms.hilog_task_"

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {p1, v1}, Lcom/huawei/agconnect/remoteconfig/ConfigValues;->containKey(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    sget-object v1, Lcom/huawei/agconnect/apms/hilog/task/FetchTask;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 53
    .line 54
    new-instance v3, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v4, "FetchTask config contains "

    .line 60
    .line 61
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-interface {v1, v3}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v3, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-interface {p1, v2}, Lcom/huawei/agconnect/remoteconfig/ConfigValues;->getValueAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-static {v2}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->fromJson(Ljava/lang/String;)Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    if-nez v2, :cond_1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->isValidateTaskTime()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_2

    .line 105
    .line 106
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 107
    .line 108
    .line 109
    move-result-wide v3

    .line 110
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->getTaskStartTime()J

    .line 111
    .line 112
    .line 113
    move-result-wide v5

    .line 114
    cmp-long v5, v3, v5

    .line 115
    .line 116
    if-ltz v5, :cond_4

    .line 117
    .line 118
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->getTaskEndTime()J

    .line 119
    .line 120
    .line 121
    move-result-wide v5

    .line 122
    cmp-long v3, v3, v5

    .line 123
    .line 124
    if-lez v3, :cond_2

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_2
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getUserIdentifier()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {v2, v3}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->isValidTask(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-nez v3, :cond_3

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_3
    invoke-static {v2}, Lcom/huawei/agconnect/apms/jih;->abc(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;)I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    const-string v4, "FetchTask taskId "

    .line 143
    .line 144
    invoke-static {v4}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->getTaskId()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string v5, ", state "

    .line 156
    .line 157
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-interface {v1, v4}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    if-nez v3, :cond_4

    .line 171
    .line 172
    invoke-static {}, Lcom/huawei/agconnect/apms/wvu;->bcd()V

    .line 173
    .line 174
    .line 175
    sget-object p1, Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;->ghi:Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;

    .line 176
    .line 177
    invoke-virtual {p1, v2}, Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;->abc(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;)V

    .line 178
    .line 179
    .line 180
    iget-object p1, p0, Lcom/huawei/agconnect/apms/hilog/task/FetchTask;->abc:Lcom/huawei/agconnect/apms/hilog/task/FetchTask$FetchCallback;

    .line 181
    .line 182
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->clone()Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/hilog/task/FetchTask$FetchCallback;->onReceiveTask(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;)V

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_4
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :cond_5
    :goto_2
    return-void
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


# virtual methods
.method public abc()V
    .locals 4

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/hilog/task/FetchTask;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "FetchTask execute"

    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->cde()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 4
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getUserIdentifier()Ljava/lang/String;

    move-result-object v2

    const-string v3, "apms.user_id"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-static {}, Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;->getInstance()Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;->setCustomAttributes(Ljava/util/Map;)V

    .line 6
    invoke-static {}, Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;->getInstance()Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;

    move-result-object v1

    const-wide/16 v2, 0x12c

    invoke-virtual {v1, v2, v3}, Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;->fetch(J)Lcom/huawei/hmf/tasks/Task;

    move-result-object v1

    new-instance v2, Lu1/b;

    invoke-direct {v2, p0}, Lu1/b;-><init>(Lcom/huawei/agconnect/apms/hilog/task/FetchTask;)V

    invoke-virtual {v1, v2}, Lcom/huawei/hmf/tasks/Task;->k(Lcom/huawei/hmf/tasks/i;)Lcom/huawei/hmf/tasks/Task;

    move-result-object v1

    new-instance v2, Lu1/c;

    invoke-direct {v2}, Lu1/c;-><init>()V

    .line 7
    invoke-virtual {v1, v2}, Lcom/huawei/hmf/tasks/Task;->h(Lcom/huawei/hmf/tasks/h;)Lcom/huawei/hmf/tasks/Task;

    const-string v1, "FetchTask execute end"

    .line 8
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    return-void
.end method
