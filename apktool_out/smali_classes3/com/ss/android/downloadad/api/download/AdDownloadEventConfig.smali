.class public Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/download/api/download/DownloadEventConfig;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;
    }
.end annotation


# instance fields
.field protected mClickButtonTag:Ljava/lang/String;

.field protected mClickContinueLabel:Ljava/lang/String;

.field protected mClickInstallLabel:Ljava/lang/String;

.field protected mClickItemTag:Ljava/lang/String;

.field protected mClickLabel:Ljava/lang/String;

.field protected mClickPauseLabel:Ljava/lang/String;

.field protected mClickStartLabel:Ljava/lang/String;

.field protected mDownloadScene:I

.field protected transient mExtraEventObject:Ljava/lang/Object;

.field protected mExtraJson:Lorg/json/JSONObject;

.field protected mIsEnableClickEvent:Z

.field protected mIsEnableV3Event:Z

.field protected mParamsJson:Lorg/json/JSONObject;

.field protected mRefer:Ljava/lang/String;

.field protected mStorageDenyLabel:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mIsEnableClickEvent:Z

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mIsEnableV3Event:Z

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mIsEnableClickEvent:Z

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mIsEnableV3Event:Z

    if-nez p1, :cond_0

    return-void

    .line 7
    :cond_0
    iget-object v0, p1, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickButtonTag:Ljava/lang/String;

    iput-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickButtonTag:Ljava/lang/String;

    .line 8
    iget-object v0, p1, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickItemTag:Ljava/lang/String;

    iput-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickItemTag:Ljava/lang/String;

    .line 9
    iget-object v0, p1, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickLabel:Ljava/lang/String;

    iput-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickLabel:Ljava/lang/String;

    .line 10
    iget-object v0, p1, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickStartLabel:Ljava/lang/String;

    iput-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickStartLabel:Ljava/lang/String;

    .line 11
    iget-object v0, p1, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickPauseLabel:Ljava/lang/String;

    iput-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickPauseLabel:Ljava/lang/String;

    .line 12
    iget-object v0, p1, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickContinueLabel:Ljava/lang/String;

    iput-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickContinueLabel:Ljava/lang/String;

    .line 13
    iget-object v0, p1, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickInstallLabel:Ljava/lang/String;

    iput-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickInstallLabel:Ljava/lang/String;

    .line 14
    iget-object v0, p1, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mStorageDenyLabel:Ljava/lang/String;

    iput-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mStorageDenyLabel:Ljava/lang/String;

    .line 15
    iget v0, p1, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mDownloadScene:I

    iput v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mDownloadScene:I

    .line 16
    iget-boolean v0, p1, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mIsEnableClickEvent:Z

    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mIsEnableClickEvent:Z

    .line 17
    iget-boolean v0, p1, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mIsEnableV3Event:Z

    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mIsEnableV3Event:Z

    .line 18
    iget-object v0, p1, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mRefer:Ljava/lang/String;

    iput-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mRefer:Ljava/lang/String;

    .line 19
    iget-object v0, p1, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mExtraJson:Lorg/json/JSONObject;

    iput-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mExtraJson:Lorg/json/JSONObject;

    .line 20
    iget-object p1, p1, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mParamsJson:Lorg/json/JSONObject;

    iput-object p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mParamsJson:Lorg/json/JSONObject;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;
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
    new-instance v0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;-><init>()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    const-string v1, "click_button_tag"

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickButtonTag(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 17
    .line 18
    .line 19
    const-string v1, "click_item_tag"

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickItemTag(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 26
    .line 27
    .line 28
    const-string v1, "click_label"

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 35
    .line 36
    .line 37
    const-string v1, "click_start_label"

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickStartLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 44
    .line 45
    .line 46
    const-string v1, "click_continue_label"

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickContinueLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 53
    .line 54
    .line 55
    const-string v1, "click_pause_label"

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickPauseLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 62
    .line 63
    .line 64
    const-string v1, "click_install_label"

    .line 65
    .line 66
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickInstallLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 71
    .line 72
    .line 73
    const-string v1, "storage_deny_label"

    .line 74
    .line 75
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setStorageDenyLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 80
    .line 81
    .line 82
    const-string v1, "refer"

    .line 83
    .line 84
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setRefer(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 89
    .line 90
    .line 91
    const-string v1, "download_scene"

    .line 92
    .line 93
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setDownloadScene(I)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 98
    .line 99
    .line 100
    const-string v1, "enable_click_event"

    .line 101
    .line 102
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    const/4 v2, 0x0

    .line 107
    const/4 v3, 0x1

    .line 108
    if-ne v1, v3, :cond_1

    .line 109
    .line 110
    move v1, v3

    .line 111
    goto :goto_0

    .line 112
    :cond_1
    move v1, v2

    .line 113
    :goto_0
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setIsEnableClickEvent(Z)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 114
    .line 115
    .line 116
    const-string v1, "enable_v3_event"

    .line 117
    .line 118
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-ne v1, v3, :cond_2

    .line 123
    .line 124
    move v2, v3

    .line 125
    :cond_2
    invoke-virtual {v0, v2}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setIsEnableV3Event(Z)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 126
    .line 127
    .line 128
    const-string v1, "extra"

    .line 129
    .line 130
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setExtraJson(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 135
    .line 136
    .line 137
    const-string v1, "params_json"

    .line 138
    .line 139
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setParamsJson(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :catch_0
    move-exception p0

    .line 148
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->u()Lcom/ss/android/download/api/b/a;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    const-string v2, "AdDownloadEventConfig fromJson"

    .line 153
    .line 154
    invoke-interface {v1, p0, v2}, Lcom/ss/android/download/api/b/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :goto_1
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    return-object p0
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


# virtual methods
.method public getClickButtonTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickButtonTag:Ljava/lang/String;

    return-object v0
.end method

.method public getClickContinueLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickContinueLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getClickInstallLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickInstallLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getClickItemTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickItemTag:Ljava/lang/String;

    return-object v0
.end method

.method public getClickLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getClickPauseLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickPauseLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getClickStartLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickStartLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getDownloadScene()I
    .locals 1

    iget v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mDownloadScene:I

    return v0
.end method

.method public getExtraEventObject()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mExtraEventObject:Ljava/lang/Object;

    return-object v0
.end method

.method public getExtraJson()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mExtraJson:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getParamsJson()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mParamsJson:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getRefer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mRefer:Ljava/lang/String;

    return-object v0
.end method

.method public getStorageDenyLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mStorageDenyLabel:Ljava/lang/String;

    return-object v0
.end method

.method public isEnableClickEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mIsEnableClickEvent:Z

    return v0
.end method

.method public isEnableV3Event()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mIsEnableV3Event:Z

    return v0
.end method

.method public setClickButtonTag(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickButtonTag:Ljava/lang/String;

    return-void
.end method

.method public setClickItemTag(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickItemTag:Ljava/lang/String;

    return-void
.end method

.method public setDownloadScene(I)V
    .locals 0

    iput p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mDownloadScene:I

    return-void
.end method

.method public setExtraEventObject(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mExtraEventObject:Ljava/lang/Object;

    return-void
.end method

.method public setExtraJson(Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mExtraJson:Lorg/json/JSONObject;

    return-void
.end method

.method public setParamsJson(Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mParamsJson:Lorg/json/JSONObject;

    return-void
.end method

.method public setQuickAppEventTag(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setRefer(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mRefer:Ljava/lang/String;

    return-void
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
    const-string v1, "click_button_tag"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickButtonTag:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "click_item_tag"

    .line 14
    .line 15
    iget-object v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickItemTag:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    const-string v1, "click_label"

    .line 21
    .line 22
    iget-object v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickLabel:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    const-string v1, "click_start_label"

    .line 28
    .line 29
    iget-object v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickStartLabel:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    const-string v1, "click_continue_label"

    .line 35
    .line 36
    iget-object v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickContinueLabel:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    const-string v1, "click_pause_label"

    .line 42
    .line 43
    iget-object v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickPauseLabel:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    const-string v1, "click_install_label"

    .line 49
    .line 50
    iget-object v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mClickInstallLabel:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    const-string v1, "storage_deny_label"

    .line 56
    .line 57
    iget-object v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mStorageDenyLabel:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    const-string v1, "refer"

    .line 63
    .line 64
    iget-object v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mRefer:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    const-string v1, "download_scene"

    .line 70
    .line 71
    iget v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mDownloadScene:I

    .line 72
    .line 73
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 78
    .line 79
    .line 80
    const-string v1, "enable_click_event"

    .line 81
    .line 82
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mIsEnableClickEvent:Z

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    const/4 v4, 0x0

    .line 86
    if-eqz v2, :cond_0

    .line 87
    .line 88
    move v2, v3

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    move v2, v4

    .line 91
    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    const-string v1, "enable_v3_event"

    .line 99
    .line 100
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mIsEnableV3Event:Z

    .line 101
    .line 102
    if-eqz v2, :cond_1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    move v3, v4

    .line 106
    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    .line 112
    .line 113
    const-string v1, "extra"

    .line 114
    .line 115
    iget-object v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mExtraJson:Lorg/json/JSONObject;

    .line 116
    .line 117
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 118
    .line 119
    .line 120
    const-string v1, "params_json"

    .line 121
    .line 122
    iget-object v2, p0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->mParamsJson:Lorg/json/JSONObject;

    .line 123
    .line 124
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :catch_0
    move-exception v1

    .line 129
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->u()Lcom/ss/android/download/api/b/a;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    const-string v3, "AdDownloadEventConfig toJson"

    .line 134
    .line 135
    invoke-interface {v2, v1, v3}, Lcom/ss/android/download/api/b/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :goto_2
    return-object v0
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
