.class public Lcom/huawei/agconnect/apms/wvu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final abc:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static bcd:Lcom/huawei/agconnect/apms/onm;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/huawei/agconnect/apms/wvu;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    new-instance v0, Lcom/huawei/agconnect/apms/nml;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/nml;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/huawei/agconnect/apms/wvu;->bcd:Lcom/huawei/agconnect/apms/onm;

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
.end method

.method public static abc()V
    .locals 0

    .line 7
    invoke-static {}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->enableDebugNative()V

    return-void
.end method

.method public static abc(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/wvu;->bcd:Lcom/huawei/agconnect/apms/onm;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p0, p1, p2}, Lcom/huawei/agconnect/apms/onm;->abc(ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static abc(Landroid/content/Context;Lcom/huawei/agconnect/apms/ijk;)V
    .locals 1

    if-nez p0, :cond_0

    .line 3
    sget-object p0, Lcom/huawei/agconnect/apms/wvu;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string p1, "HiLog init context is null"

    invoke-interface {p0, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    new-instance v0, Ls1/e;

    invoke-direct {v0, p0, p1}, Ls1/e;-><init>(Landroid/content/Context;Lcom/huawei/agconnect/apms/ijk;)V

    invoke-static {v0}, Lcom/huawei/agconnect/apms/hgf;->abc(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static abc(Lcom/huawei/agconnect/apms/hilog/task/FetchTask$FetchCallback;)V
    .locals 1

    if-nez p0, :cond_0

    .line 5
    sget-object p0, Lcom/huawei/agconnect/apms/wvu;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v0, "HiLog fetch callback is null"

    invoke-interface {p0, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_0
    new-instance v0, Ls1/f;

    invoke-direct {v0, p0}, Ls1/f;-><init>(Lcom/huawei/agconnect/apms/hilog/task/FetchTask$FetchCallback;)V

    invoke-static {v0}, Lcom/huawei/agconnect/apms/hgf;->abc(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static abc(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;)V
    .locals 2

    .line 8
    sget-object v0, Lcom/huawei/agconnect/apms/wvu;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "HiLog deny"

    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    if-nez p0, :cond_0

    const-string p0, "HiLog deny taskInfo is null"

    .line 9
    invoke-interface {v0, p0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    return-void

    .line 10
    :cond_0
    new-instance v0, Ls1/c;

    invoke-direct {v0, p0}, Ls1/c;-><init>(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;)V

    invoke-static {v0}, Lcom/huawei/agconnect/apms/hgf;->abc(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bcd()V
    .locals 1

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/wvu;->bcd:Lcom/huawei/agconnect/apms/onm;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/huawei/agconnect/apms/onm;->flush()V

    :cond_0
    return-void
.end method

.method public static synthetic bcd(Landroid/content/Context;Lcom/huawei/agconnect/apms/ijk;)V
    .locals 1

    .line 3
    new-instance v0, Lcom/huawei/agconnect/apms/mlk;

    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/mlk;-><init>(Landroid/content/Context;)V

    .line 4
    iput-object p1, v0, Lcom/huawei/agconnect/apms/mlk;->bcd:Lcom/huawei/agconnect/apms/ijk;

    .line 5
    sget-object p0, Lcom/huawei/agconnect/apms/mlk;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string p1, "InitTask execute"

    invoke-interface {p0, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 6
    sget-object p0, Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;->ghi:Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;

    .line 7
    iget-object p1, v0, Lcom/huawei/agconnect/apms/mlk;->abc:Landroid/content/Context;

    iget-object v0, v0, Lcom/huawei/agconnect/apms/mlk;->bcd:Lcom/huawei/agconnect/apms/ijk;

    invoke-virtual {p0, p1, v0}, Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;->abc(Landroid/content/Context;Lcom/huawei/agconnect/apms/ijk;)V

    .line 8
    new-instance p1, Lcom/huawei/agconnect/apms/uts$abc;

    invoke-direct {p1}, Lcom/huawei/agconnect/apms/uts$abc;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;->def()Ljava/lang/String;

    move-result-object v0

    .line 9
    iput-object v0, p1, Lcom/huawei/agconnect/apms/uts$abc;->bcd:Ljava/lang/String;

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;->bcd()Ljava/lang/String;

    move-result-object p0

    .line 11
    iput-object p0, p1, Lcom/huawei/agconnect/apms/uts$abc;->abc:Ljava/lang/String;

    const/16 p0, 0x2000

    .line 12
    iput p0, p1, Lcom/huawei/agconnect/apms/uts$abc;->def:I

    const/4 p0, 0x2

    .line 13
    iput p0, p1, Lcom/huawei/agconnect/apms/uts$abc;->cde:I

    .line 14
    new-instance p0, Lcom/huawei/agconnect/apms/srq;

    invoke-direct {p0}, Lcom/huawei/agconnect/apms/srq;-><init>()V

    .line 15
    iput-object p0, p1, Lcom/huawei/agconnect/apms/uts$abc;->fgh:Lcom/huawei/agconnect/apms/srq;

    const/4 p0, 0x0

    .line 16
    iput-boolean p0, p1, Lcom/huawei/agconnect/apms/uts$abc;->ghi:Z

    .line 17
    iget-object p0, p1, Lcom/huawei/agconnect/apms/uts$abc;->bcd:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_2

    .line 18
    iget-object p0, p1, Lcom/huawei/agconnect/apms/uts$abc;->abc:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    .line 19
    iget-object p0, p1, Lcom/huawei/agconnect/apms/uts$abc;->fgh:Lcom/huawei/agconnect/apms/srq;

    if-nez p0, :cond_0

    .line 20
    new-instance p0, Lcom/huawei/agconnect/apms/srq;

    invoke-direct {p0}, Lcom/huawei/agconnect/apms/srq;-><init>()V

    iput-object p0, p1, Lcom/huawei/agconnect/apms/uts$abc;->fgh:Lcom/huawei/agconnect/apms/srq;

    .line 21
    :cond_0
    new-instance p0, Lcom/huawei/agconnect/apms/uts;

    invoke-direct {p0, p1}, Lcom/huawei/agconnect/apms/uts;-><init>(Lcom/huawei/agconnect/apms/uts$abc;)V

    .line 22
    new-instance p1, Lcom/huawei/agconnect/apms/pon;

    invoke-direct {p1}, Lcom/huawei/agconnect/apms/pon;-><init>()V

    .line 23
    invoke-virtual {p1, p0}, Lcom/huawei/agconnect/apms/pon;->abc(Lcom/huawei/agconnect/apms/tsr;)V

    .line 24
    sput-object p1, Lcom/huawei/agconnect/apms/wvu;->bcd:Lcom/huawei/agconnect/apms/onm;

    return-void

    .line 25
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "bufferFilePath cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 26
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "logFilePath cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic bcd(Lcom/huawei/agconnect/apms/hilog/task/FetchTask$FetchCallback;)V
    .locals 1

    .line 27
    new-instance v0, Lcom/huawei/agconnect/apms/hilog/task/FetchTask;

    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/hilog/task/FetchTask;-><init>(Lcom/huawei/agconnect/apms/hilog/task/FetchTask$FetchCallback;)V

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/hilog/task/FetchTask;->abc()V

    return-void
.end method

.method public static bcd(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;)V
    .locals 2

    .line 28
    sget-object v0, Lcom/huawei/agconnect/apms/wvu;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "HiLog grant"

    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    if-nez p0, :cond_0

    const-string p0, "HiLog grant taskInfo is null"

    .line 29
    invoke-interface {v0, p0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    return-void

    .line 30
    :cond_0
    new-instance v0, Ls1/d;

    invoke-direct {v0, p0}, Ls1/d;-><init>(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;)V

    invoke-static {v0}, Lcom/huawei/agconnect/apms/hgf;->bcd(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic cde(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;)V
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 15
    .line 16
    .line 17
    const-string v1, "0:0"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 20
    .line 21
    .line 22
    const-string v1, "V"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 25
    .line 26
    .line 27
    const-string v1, "CONFIRM:REJECT"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 30
    .line 31
    .line 32
    const-string v1, ""

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 35
    .line 36
    .line 37
    new-instance v2, Lorg/json/JSONArray;

    .line 38
    .line 39
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {p0, v0, v1}, Lcom/huawei/agconnect/apms/ihg;->abc(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->getInstance()Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string v2, "APMS_LOG"

    .line 58
    .line 59
    invoke-virtual {v1, v2, v0}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->onEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x1

    .line 63
    invoke-static {p0, v0}, Lcom/huawei/agconnect/apms/jih;->abc(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;I)V

    .line 64
    .line 65
    .line 66
    const-wide/16 v0, 0x3e8

    .line 67
    .line 68
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catch_0
    sget-object p0, Lcom/huawei/agconnect/apms/wvu;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 73
    .line 74
    const-string v0, "HiLog deny InterruptedException"

    .line 75
    .line 76
    invoke-interface {p0, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :goto_0
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->getInstance()Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->onReport()V

    .line 84
    .line 85
    .line 86
    return-void
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
.end method

.method public static synthetic def(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;)V
    .locals 15

    .line 1
    new-instance v0, Lcom/huawei/agconnect/apms/ihg;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/ihg;-><init>(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/huawei/agconnect/apms/ihg;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 7
    .line 8
    const-string v2, "UploadTask execute"

    .line 9
    .line 10
    invoke-interface {v1, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, Lcom/huawei/agconnect/apms/ihg;->abc:Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_0
    invoke-static {v2}, Lcom/huawei/agconnect/apms/jih;->abc(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    const-string v3, "UploadTask taskId "

    .line 26
    .line 27
    invoke-static {v3}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v0, v0, Lcom/huawei/agconnect/apms/ihg;->abc:Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->getTaskId()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, ", state "

    .line 41
    .line 42
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, ", return"

    .line 49
    .line 50
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_1
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/ihg;->abc()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const-string v3, "UploadTask upload file size "

    .line 67
    .line 68
    invoke-static {v3}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-interface {v1, v3}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_2

    .line 91
    .line 92
    const-string v0, "UploadTask upload log line 0"

    .line 93
    .line 94
    invoke-interface {v1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_4

    .line 98
    .line 99
    :cond_2
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->getInstance()Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->onReport()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/ihg;->bcd()V

    .line 107
    .line 108
    .line 109
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const-wide/16 v2, 0x0

    .line 114
    .line 115
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_7

    .line 120
    .line 121
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    check-cast v4, Ljava/io/File;

    .line 126
    .line 127
    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    sget-object v6, Lcom/huawei/agconnect/apms/ihg;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 132
    .line 133
    new-instance v7, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    const-string v8, "UploadTask upload file "

    .line 139
    .line 140
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-interface {v6, v7}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    new-instance v6, Ljava/io/BufferedReader;

    .line 158
    .line 159
    new-instance v7, Ljava/io/FileReader;

    .line 160
    .line 161
    invoke-direct {v7, v5}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-direct {v6, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    .line 166
    .line 167
    const-wide/16 v7, 0x1

    .line 168
    .line 169
    add-long v9, v2, v7

    .line 170
    .line 171
    :try_start_1
    new-instance v5, Lorg/json/JSONArray;

    .line 172
    .line 173
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 174
    .line 175
    .line 176
    const/4 v11, 0x0

    .line 177
    move v12, v11

    .line 178
    :cond_3
    :goto_1
    invoke-virtual {v6}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    if-eqz v13, :cond_5

    .line 183
    .line 184
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 185
    .line 186
    .line 187
    move-result v14

    .line 188
    add-int/2addr v12, v14

    .line 189
    const/16 v14, 0x7800

    .line 190
    .line 191
    if-lt v12, v14, :cond_4

    .line 192
    .line 193
    invoke-virtual {v5}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v12

    .line 201
    invoke-virtual {v0, v5, v12}, Lcom/huawei/agconnect/apms/ihg;->abc(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    new-instance v5, Lorg/json/JSONArray;

    .line 205
    .line 206
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 207
    .line 208
    .line 209
    move v12, v11

    .line 210
    :cond_4
    invoke-virtual {v0, v9, v10, v13}, Lcom/huawei/agconnect/apms/ihg;->abc(JLjava/lang/String;)Lorg/json/JSONArray;

    .line 211
    .line 212
    .line 213
    move-result-object v13

    .line 214
    if-eqz v13, :cond_3

    .line 215
    .line 216
    add-long/2addr v9, v7

    .line 217
    invoke-virtual {v5, v13}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 218
    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_5
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    if-lez v11, :cond_6

    .line 226
    .line 227
    invoke-virtual {v5}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-virtual {v0, v5, v4}, Lcom/huawei/agconnect/apms/ihg;->abc(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    .line 237
    .line 238
    :cond_6
    sub-long v2, v9, v7

    .line 239
    .line 240
    :try_start_2
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :catchall_0
    move-exception v4

    .line 245
    :try_start_3
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 246
    :catchall_1
    move-exception v5

    .line 247
    :try_start_4
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 248
    .line 249
    .line 250
    goto :goto_2

    .line 251
    :catchall_2
    move-exception v6

    .line 252
    :try_start_5
    invoke-virtual {v4, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 253
    .line 254
    .line 255
    :goto_2
    throw v5
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 256
    :catch_0
    sget-object v4, Lcom/huawei/agconnect/apms/ihg;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 257
    .line 258
    const-string v5, "UploadTask uploadFile IOException"

    .line 259
    .line 260
    invoke-interface {v4, v5}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    :goto_3
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->getInstance()Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    invoke-virtual {v4}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->onReport()V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/ihg;->bcd()V

    .line 271
    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :cond_7
    sget-object v0, Lcom/huawei/agconnect/apms/ihg;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 276
    .line 277
    new-instance v1, Ljava/lang/StringBuilder;

    .line 278
    .line 279
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 280
    .line 281
    .line 282
    const-string v4, "UploadTask upload log line "

    .line 283
    .line 284
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->getInstance()Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->onReport()V

    .line 302
    .line 303
    .line 304
    :goto_4
    const/4 v0, 0x2

    .line 305
    invoke-static {p0, v0}, Lcom/huawei/agconnect/apms/jih;->abc(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;I)V

    .line 306
    .line 307
    .line 308
    return-void
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
