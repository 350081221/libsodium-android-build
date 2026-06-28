.class public final Lcom/huawei/agconnect/apms/klm$abc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/agconnect/apms/klm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "abc"
.end annotation


# instance fields
.field public final abc:Landroid/content/Context;

.field public final bcd:Ljava/lang/String;

.field public final cde:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/klm$abc;->abc:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/huawei/agconnect/apms/klm$abc;->bcd:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/huawei/agconnect/apms/klm$abc;->cde:Z

    .line 9
    .line 10
    return-void
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
.method public declared-synchronized run()V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 3
    .line 4
    .line 5
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    sget-object v0, Lcom/huawei/agconnect/apms/klm;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 11
    .line 12
    const-string v1, "start upload anr files isUploadNative: "

    .line 13
    .line 14
    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-boolean v2, p0, Lcom/huawei/agconnect/apms/klm$abc;->cde:Z

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, ", checkAnr:"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    sget-boolean v2, Lcom/huawei/agconnect/apms/lmn;->def:Z

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    xor-int/2addr v2, v3

    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-boolean v1, p0, Lcom/huawei/agconnect/apms/klm$abc;->cde:Z

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    sget-boolean v1, Lcom/huawei/agconnect/apms/lmn;->def:Z

    .line 52
    .line 53
    if-nez v1, :cond_1

    .line 54
    .line 55
    iget-object v1, p0, Lcom/huawei/agconnect/apms/klm$abc;->abc:Landroid/content/Context;

    .line 56
    .line 57
    iget-object v2, p0, Lcom/huawei/agconnect/apms/klm$abc;->bcd:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v1, v2}, Lcom/huawei/agconnect/apms/x1;->abc(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 60
    .line 61
    .line 62
    :cond_1
    const/4 v1, 0x0

    .line 63
    :try_start_2
    sget-object v2, Lcom/huawei/agconnect/apms/klm;->efg:Lcom/huawei/agconnect/apms/pqr;

    .line 64
    .line 65
    iget-object v4, p0, Lcom/huawei/agconnect/apms/klm$abc;->abc:Landroid/content/Context;

    .line 66
    .line 67
    invoke-virtual {v2, v4, v1}, Lcom/huawei/agconnect/apms/pqr;->abc(Landroid/content/Context;Z)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception v2

    .line 73
    :try_start_3
    sget-object v4, Lcom/huawei/agconnect/apms/klm;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 74
    .line 75
    const-string v5, "load anr dir failed. "

    .line 76
    .line 77
    invoke-static {v5}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-static {v2, v5, v4}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 82
    .line 83
    .line 84
    :goto_0
    sget-object v2, Lcom/huawei/agconnect/apms/klm;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 85
    .line 86
    const-string v4, "AnrFileCollector fileList size is:"

    .line 87
    .line 88
    invoke-static {v4}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-interface {v2, v4}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_5

    .line 115
    .line 116
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 120
    :try_start_4
    instance-of v4, v2, Ljava/io/File;

    .line 121
    .line 122
    if-nez v4, :cond_3

    .line 123
    .line 124
    sget-object v2, Lcom/huawei/agconnect/apms/klm;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 125
    .line 126
    const-string v4, "file is not instanceof File\uff01"

    .line 127
    .line 128
    invoke-interface {v2, v4}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    :try_start_5
    move-object v4, v2

    .line 133
    check-cast v4, Ljava/io/File;

    .line 134
    .line 135
    invoke-static {v4}, Lokio/y0;->t(Ljava/io/File;)Lokio/n1;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {v4}, Lokio/y0;->e(Lokio/n1;)Lokio/BufferedSource;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-interface {v4}, Lokio/BufferedSource;->s0()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v4
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 147
    if-eqz v4, :cond_4

    .line 148
    .line 149
    :try_start_6
    new-instance v5, Lorg/json/JSONObject;

    .line 150
    .line 151
    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    const-string v4, "agentVersion"

    .line 155
    .line 156
    invoke-virtual {v5, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    new-instance v6, Landroid/os/Bundle;

    .line 161
    .line 162
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 163
    .line 164
    .line 165
    const-string v7, "agent_version"

    .line 166
    .line 167
    invoke-virtual {v6, v7, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 168
    .line 169
    .line 170
    :try_start_7
    const-string v4, "user_identifier"
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 171
    .line 172
    :try_start_8
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getUserIdentifier()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-virtual {v6, v4, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 177
    .line 178
    .line 179
    :try_start_9
    const-string v4, "platform"
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 180
    .line 181
    :try_start_a
    const-string v7, "platformInformation"

    .line 182
    .line 183
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    invoke-virtual {v6, v4, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 188
    .line 189
    .line 190
    :try_start_b
    const-string v4, "user_settings"
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 191
    .line 192
    :try_start_c
    const-string v7, "userSettingsInformation"

    .line 193
    .line 194
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    invoke-virtual {v6, v4, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 199
    .line 200
    .line 201
    :try_start_d
    const-string v4, "device"
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 202
    .line 203
    :try_start_e
    const-string v7, "deviceInformation"

    .line 204
    .line 205
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    invoke-virtual {v6, v4, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 210
    .line 211
    .line 212
    :try_start_f
    const-string v4, "app"
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 213
    .line 214
    :try_start_10
    const-string v7, "applicationInformation"

    .line 215
    .line 216
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    invoke-virtual {v6, v4, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 221
    .line 222
    .line 223
    :try_start_11
    const-string v4, "anr"
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 224
    .line 225
    :try_start_12
    const-string v7, "anrInfo"

    .line 226
    .line 227
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    invoke-virtual {v6, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->getInstance()Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    const-string v5, "APMS"

    .line 239
    .line 240
    invoke-virtual {v4, v5, v6}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->onEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 241
    .line 242
    .line 243
    sget-object v4, Lcom/huawei/agconnect/apms/klm;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 244
    .line 245
    new-instance v5, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 248
    .line 249
    .line 250
    const-string v7, "upload anr info success, data size: "

    .line 251
    .line 252
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v6}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-interface {v4, v5}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    check-cast v2, Ljava/io/File;

    .line 274
    .line 275
    invoke-static {v2}, Lcom/huawei/agconnect/apms/klm;->abc(Ljava/io/File;)V

    .line 276
    .line 277
    .line 278
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->getInstance()Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->onReport()V

    .line 283
    .line 284
    .line 285
    iget-object v2, p0, Lcom/huawei/agconnect/apms/klm$abc;->bcd:Ljava/lang/String;

    .line 286
    .line 287
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    if-nez v2, :cond_2

    .line 292
    .line 293
    new-instance v2, Ljava/io/File;

    .line 294
    .line 295
    iget-object v4, p0, Lcom/huawei/agconnect/apms/klm$abc;->bcd:Ljava/lang/String;

    .line 296
    .line 297
    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    if-nez v2, :cond_2

    .line 305
    .line 306
    new-instance v2, Ljava/io/File;

    .line 307
    .line 308
    iget-object v4, p0, Lcom/huawei/agconnect/apms/klm$abc;->bcd:Ljava/lang/String;

    .line 309
    .line 310
    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-static {v2}, Lcom/huawei/agconnect/apms/klm;->abc(Ljava/io/File;)V

    .line 314
    .line 315
    .line 316
    goto/16 :goto_1

    .line 317
    .line 318
    :cond_4
    sget-object v2, Lcom/huawei/agconnect/apms/klm;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 319
    .line 320
    const-string v4, "json is null!"

    .line 321
    .line 322
    invoke-interface {v2, v4}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    goto/16 :goto_1

    .line 326
    .line 327
    :catch_0
    sget-object v2, Lcom/huawei/agconnect/apms/klm;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 328
    .line 329
    const-string v4, "Okio.buffer IOException"

    .line 330
    .line 331
    invoke-interface {v2, v4}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 332
    .line 333
    .line 334
    goto/16 :goto_1

    .line 335
    .line 336
    :catchall_1
    move-exception v2

    .line 337
    :try_start_13
    sget-object v4, Lcom/huawei/agconnect/apms/klm;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 338
    .line 339
    const-string v5, "upload anr files failed. "

    .line 340
    .line 341
    invoke-static {v5}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    invoke-static {v2, v5, v4}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_1

    .line 349
    .line 350
    :cond_5
    iget-object v0, p0, Lcom/huawei/agconnect/apms/klm$abc;->abc:Landroid/content/Context;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    .line 351
    .line 352
    :try_start_14
    sget-object v2, Lcom/huawei/agconnect/apms/klm;->efg:Lcom/huawei/agconnect/apms/pqr;

    .line 353
    .line 354
    invoke-virtual {v2, v0, v3}, Lcom/huawei/agconnect/apms/pqr;->abc(Landroid/content/Context;Z)Ljava/util/List;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 359
    .line 360
    .line 361
    move-result v2

    .line 362
    add-int/lit8 v2, v2, -0xa

    .line 363
    .line 364
    :goto_2
    if-ge v1, v2, :cond_7

    .line 365
    .line 366
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    instance-of v3, v3, Ljava/io/File;

    .line 371
    .line 372
    if-nez v3, :cond_6

    .line 373
    .line 374
    goto :goto_3

    .line 375
    :cond_6
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    check-cast v3, Ljava/io/File;

    .line 380
    .line 381
    invoke-static {v3}, Lcom/huawei/agconnect/apms/klm;->abc(Ljava/io/File;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    .line 382
    .line 383
    .line 384
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 385
    .line 386
    goto :goto_2

    .line 387
    :catchall_2
    :try_start_15
    sget-object v0, Lcom/huawei/agconnect/apms/klm;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 388
    .line 389
    const-string v1, "delete unused files failed. "

    .line 390
    .line 391
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    .line 392
    .line 393
    .line 394
    :cond_7
    monitor-exit p0

    .line 395
    return-void

    .line 396
    :catchall_3
    move-exception v0

    .line 397
    monitor-exit p0

    .line 398
    throw v0
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
