.class public Lcom/ss/android/downloadad/api/download/AdDownloadController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/download/api/download/DownloadController;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;
    }
.end annotation


# instance fields
.field protected mDownloadMarketInterceptor:Lcom/ss/android/download/api/config/DownloadMarketInterceptor;

.field protected mDownloadMode:I

.field protected mEnableAH:Z

.field protected mEnableAM:Z

.field protected mEnableNewActivity:Z

.field protected mEnableOppoAutoDownload:Z

.field protected mEnableShowComplianceDialog:Z

.field protected mExtraClickOperation:Ljava/lang/Object;

.field protected mExtraJson:Lorg/json/JSONObject;

.field protected mExtraObject:Ljava/lang/Object;

.field protected mInterceptFlag:I

.field protected mIsAddToDownloadManage:Z

.field protected mIsAutoDownloadOnCardShow:Z

.field protected mIsEnableBackDialog:Z

.field protected mLinkMode:I

.field protected mShouldUseNewWebView:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableShowComplianceDialog:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableNewActivity:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableAH:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableAM:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableOppoAutoDownload:Z

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mDownloadMarketInterceptor:Lcom/ss/android/download/api/config/DownloadMarketInterceptor;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/download/AdDownloadController;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;-><init>()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    const-string v1, "link_mode"

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setLinkMode(I)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 17
    .line 18
    .line 19
    const-string v1, "download_mode"

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setDownloadMode(I)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 26
    .line 27
    .line 28
    const-string v1, "enable_back_dialog"

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x1

    .line 36
    if-ne v1, v3, :cond_1

    .line 37
    .line 38
    move v1, v3

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v1, v2

    .line 41
    :goto_0
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setIsEnableBackDialog(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 42
    .line 43
    .line 44
    const-string v1, "add_to_manage"

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-ne v1, v3, :cond_2

    .line 51
    .line 52
    move v1, v3

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move v1, v2

    .line 55
    :goto_1
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setIsAddToDownloadManage(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 56
    .line 57
    .line 58
    const-string v1, "use_new_webview"

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-ne v1, v3, :cond_3

    .line 65
    .line 66
    move v1, v3

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    move v1, v2

    .line 69
    :goto_2
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setShouldUseNewWebView(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 70
    .line 71
    .line 72
    const-string v1, "intercept_flag"

    .line 73
    .line 74
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setInterceptFlag(I)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 79
    .line 80
    .line 81
    const-string v1, "enable_show_compliance_dialog"

    .line 82
    .line 83
    invoke-virtual {p0, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-ne v1, v3, :cond_4

    .line 88
    .line 89
    move v1, v3

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    move v1, v2

    .line 92
    :goto_3
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableShowComplianceDialog(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 93
    .line 94
    .line 95
    const-string v1, "is_auto_download_on_card_show"

    .line 96
    .line 97
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-ne v1, v3, :cond_5

    .line 102
    .line 103
    move v1, v3

    .line 104
    goto :goto_4

    .line 105
    :cond_5
    move v1, v2

    .line 106
    :goto_4
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setIsAutoDownloadOnCardShow(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 107
    .line 108
    .line 109
    const-string v1, "enable_new_activity"

    .line 110
    .line 111
    invoke-virtual {p0, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-ne v1, v3, :cond_6

    .line 116
    .line 117
    move v1, v3

    .line 118
    goto :goto_5

    .line 119
    :cond_6
    move v1, v2

    .line 120
    :goto_5
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableNewActivity(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 121
    .line 122
    .line 123
    const-string v1, "enable_ah"

    .line 124
    .line 125
    invoke-virtual {p0, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-ne v1, v3, :cond_7

    .line 130
    .line 131
    move v1, v3

    .line 132
    goto :goto_6

    .line 133
    :cond_7
    move v1, v2

    .line 134
    :goto_6
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableAH(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 135
    .line 136
    .line 137
    const-string v1, "enable_am"

    .line 138
    .line 139
    invoke-virtual {p0, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-ne v1, v3, :cond_8

    .line 144
    .line 145
    move v1, v3

    .line 146
    goto :goto_7

    .line 147
    :cond_8
    move v1, v2

    .line 148
    :goto_7
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableAM(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 149
    .line 150
    .line 151
    const-string v1, "extra"

    .line 152
    .line 153
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setExtraJson(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 158
    .line 159
    .line 160
    const-string v1, "enable_oppo_auto_download"

    .line 161
    .line 162
    invoke-virtual {p0, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    if-ne p0, v3, :cond_9

    .line 167
    .line 168
    move v2, v3

    .line 169
    :cond_9
    invoke-virtual {v0, v2}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableOppoAutoDownload(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    .line 171
    .line 172
    goto :goto_8

    .line 173
    :catch_0
    move-exception p0

    .line 174
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->u()Lcom/ss/android/download/api/b/a;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    const-string v2, "AdDownloadController fromJson"

    .line 179
    .line 180
    invoke-interface {v1, p0, v2}, Lcom/ss/android/download/api/b/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    :goto_8
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadController;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    return-object p0
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


# virtual methods
.method public enableAH()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableAH:Z

    return v0
.end method

.method public enableAM()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableAM:Z

    return v0
.end method

.method public enableNewActivity()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableNewActivity:Z

    return v0
.end method

.method public enableOppoAutoDownload()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableOppoAutoDownload:Z

    return v0
.end method

.method public enableShowComplianceDialog()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableShowComplianceDialog:Z

    return v0
.end method

.method public getDowloadChunkCount()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getDownloadMarketInterceptor()Lcom/ss/android/download/api/config/DownloadMarketInterceptor;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mDownloadMarketInterceptor:Lcom/ss/android/download/api/config/DownloadMarketInterceptor;

    return-object v0
.end method

.method public getDownloadMode()I
    .locals 1

    iget v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mDownloadMode:I

    return v0
.end method

.method public getExtraClickOperation()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mExtraClickOperation:Ljava/lang/Object;

    return-object v0
.end method

.method public getExtraJson()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mExtraJson:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getExtraObject()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mExtraObject:Ljava/lang/Object;

    return-object v0
.end method

.method public getInterceptFlag()I
    .locals 1

    iget v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mInterceptFlag:I

    return v0
.end method

.method public getLinkMode()I
    .locals 1

    iget v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mLinkMode:I

    return v0
.end method

.method public isAddToDownloadManage()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mIsAddToDownloadManage:Z

    return v0
.end method

.method public isAutoDownloadOnCardShow()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mIsAutoDownloadOnCardShow:Z

    return v0
.end method

.method public isEnableBackDialog()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mIsEnableBackDialog:Z

    return v0
.end method

.method public isEnableMultipleDownload()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setDownloadMarketInterceptor(Lcom/ss/android/download/api/config/DownloadMarketInterceptor;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mDownloadMarketInterceptor:Lcom/ss/android/download/api/config/DownloadMarketInterceptor;

    return-void
.end method

.method public setDownloadMode(I)V
    .locals 0

    iput p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mDownloadMode:I

    return-void
.end method

.method public setEnableNewActivity(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableNewActivity:Z

    return-void
.end method

.method public setEnableOppoAutoDownload(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableOppoAutoDownload:Z

    return-void
.end method

.method public setEnableShowComplianceDialog(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableShowComplianceDialog:Z

    return-void
.end method

.method public setExtraJson(Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mExtraJson:Lorg/json/JSONObject;

    return-void
.end method

.method public setExtraObject(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mExtraObject:Ljava/lang/Object;

    return-void
.end method

.method public setIsAutoDownloadOnCardShow(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mIsAutoDownloadOnCardShow:Z

    return-void
.end method

.method public setLinkMode(I)V
    .locals 0

    iput p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mLinkMode:I

    return-void
.end method

.method public shouldUseNewWebView()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mShouldUseNewWebView:Z

    return v0
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v1, "link_mode"

    .line 7
    .line 8
    iget v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mLinkMode:I

    .line 9
    .line 10
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    const-string v1, "download_mode"

    .line 18
    .line 19
    iget v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mDownloadMode:I

    .line 20
    .line 21
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    const-string v1, "enable_back_dialog"

    .line 29
    .line 30
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mIsEnableBackDialog:Z

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    move v2, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v2, v4

    .line 39
    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    const-string v1, "add_to_manage"

    .line 47
    .line 48
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mIsAddToDownloadManage:Z

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    move v2, v3

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move v2, v4

    .line 55
    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    const-string v1, "use_new_webview"

    .line 63
    .line 64
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mShouldUseNewWebView:Z

    .line 65
    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    move v2, v3

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    move v2, v4

    .line 71
    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    const-string v1, "intercept_flag"

    .line 79
    .line 80
    iget v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mInterceptFlag:I

    .line 81
    .line 82
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 87
    .line 88
    .line 89
    const-string v1, "enable_show_compliance_dialog"

    .line 90
    .line 91
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableShowComplianceDialog:Z

    .line 92
    .line 93
    if-eqz v2, :cond_3

    .line 94
    .line 95
    move v2, v3

    .line 96
    goto :goto_3

    .line 97
    :cond_3
    move v2, v4

    .line 98
    :goto_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    const-string v1, "is_auto_download_on_card_show"

    .line 106
    .line 107
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mIsAutoDownloadOnCardShow:Z

    .line 108
    .line 109
    if-eqz v2, :cond_4

    .line 110
    .line 111
    move v2, v3

    .line 112
    goto :goto_4

    .line 113
    :cond_4
    move v2, v4

    .line 114
    :goto_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    const-string v1, "extra"

    .line 122
    .line 123
    iget-object v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mExtraJson:Lorg/json/JSONObject;

    .line 124
    .line 125
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 126
    .line 127
    .line 128
    const-string v1, "enable_new_activity"

    .line 129
    .line 130
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableNewActivity:Z

    .line 131
    .line 132
    if-eqz v2, :cond_5

    .line 133
    .line 134
    move v2, v3

    .line 135
    goto :goto_5

    .line 136
    :cond_5
    move v2, v4

    .line 137
    :goto_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 142
    .line 143
    .line 144
    const-string v1, "enable_ah"

    .line 145
    .line 146
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableAH:Z

    .line 147
    .line 148
    if-eqz v2, :cond_6

    .line 149
    .line 150
    move v2, v3

    .line 151
    goto :goto_6

    .line 152
    :cond_6
    move v2, v4

    .line 153
    :goto_6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 158
    .line 159
    .line 160
    const-string v1, "enable_am"

    .line 161
    .line 162
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableAM:Z

    .line 163
    .line 164
    if-eqz v2, :cond_7

    .line 165
    .line 166
    move v2, v3

    .line 167
    goto :goto_7

    .line 168
    :cond_7
    move v2, v4

    .line 169
    :goto_7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 174
    .line 175
    .line 176
    const-string v1, "enable_oppo_auto_download"

    .line 177
    .line 178
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadController;->mEnableOppoAutoDownload:Z

    .line 179
    .line 180
    if-eqz v2, :cond_8

    .line 181
    .line 182
    goto :goto_8

    .line 183
    :cond_8
    move v3, v4

    .line 184
    :goto_8
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    .line 190
    .line 191
    goto :goto_9

    .line 192
    :catch_0
    move-exception v1

    .line 193
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->u()Lcom/ss/android/download/api/b/a;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    const-string v3, "AdDownloadController toJson"

    .line 198
    .line 199
    invoke-interface {v2, v1, v3}, Lcom/ss/android/download/api/b/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :goto_9
    return-object v0
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
.end method
