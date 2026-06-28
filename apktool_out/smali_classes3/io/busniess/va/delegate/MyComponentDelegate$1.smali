.class Lio/busniess/va/delegate/MyComponentDelegate$1;
.super Lu/dont/know/what/i/am/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/busniess/va/delegate/MyComponentDelegate;->beforeApplicationCreate(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/busniess/va/delegate/MyComponentDelegate;


# direct methods
.method constructor <init>(Lio/busniess/va/delegate/MyComponentDelegate;)V
    .locals 0

    iput-object p1, p0, Lio/busniess/va/delegate/MyComponentDelegate$1;->this$0:Lio/busniess/va/delegate/MyComponentDelegate;

    invoke-direct {p0}, Lu/dont/know/what/i/am/g;-><init>()V

    return-void
.end method


# virtual methods
.method protected beforeHookedMethod(Lu/dont/know/what/i/am/g$a;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    const-string v0, "location"

    .line 2
    .line 3
    const-string v1, "content"

    .line 4
    .line 5
    iget-object v2, p1, Lu/dont/know/what/i/am/g$a;->e:[Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    aget-object v2, v2, v3

    .line 9
    .line 10
    check-cast v2, Landroid/os/Message;

    .line 11
    .line 12
    iget v4, v2, Landroid/os/Message;->what:I

    .line 13
    .line 14
    const/16 v5, 0x1387

    .line 15
    .line 16
    if-ne v4, v5, :cond_0

    .line 17
    .line 18
    new-instance v4, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v5, "\u4f4d\u7f6e\u4fe1\u606f"

    .line 24
    .line 25
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v5, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-string v5, "test"

    .line 38
    .line 39
    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    iget-object v4, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v4, Landroid/util/Pair;

    .line 45
    .line 46
    iget-object v6, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v6, Ljava/lang/String;

    .line 49
    .line 50
    new-instance v7, Lorg/json/JSONObject;

    .line 51
    .line 52
    invoke-direct {v7, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :try_start_0
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    const-string v8, "lat"

    .line 60
    .line 61
    iget-object v9, p0, Lio/busniess/va/delegate/MyComponentDelegate$1;->this$0:Lio/busniess/va/delegate/MyComponentDelegate;

    .line 62
    .line 63
    iget-object v10, v9, Lio/busniess/va/delegate/MyComponentDelegate;->vLocation:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 64
    .line 65
    invoke-virtual {v10}, Lcom/lody/virtual/remote/vloc/VLocation;->getLatitude()D

    .line 66
    .line 67
    .line 68
    move-result-wide v10

    .line 69
    invoke-virtual {v9, v10, v11}, Lio/busniess/va/delegate/MyComponentDelegate;->format(D)D

    .line 70
    .line 71
    .line 72
    move-result-wide v9

    .line 73
    invoke-virtual {v6, v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    const-string v8, "lng"

    .line 77
    .line 78
    iget-object v9, p0, Lio/busniess/va/delegate/MyComponentDelegate$1;->this$0:Lio/busniess/va/delegate/MyComponentDelegate;

    .line 79
    .line 80
    iget-object v10, v9, Lio/busniess/va/delegate/MyComponentDelegate;->vLocation:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 81
    .line 82
    invoke-virtual {v10}, Lcom/lody/virtual/remote/vloc/VLocation;->getLongitude()D

    .line 83
    .line 84
    .line 85
    move-result-wide v10

    .line 86
    invoke-virtual {v9, v10, v11}, Lio/busniess/va/delegate/MyComponentDelegate;->format(D)D

    .line 87
    .line 88
    .line 89
    move-result-wide v9

    .line 90
    invoke-virtual {v6, v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v7, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    .line 96
    :catch_0
    :try_start_1
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v6, "latitude"

    .line 101
    .line 102
    iget-object v8, p0, Lio/busniess/va/delegate/MyComponentDelegate$1;->this$0:Lio/busniess/va/delegate/MyComponentDelegate;

    .line 103
    .line 104
    iget-object v9, v8, Lio/busniess/va/delegate/MyComponentDelegate;->vLocation:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 105
    .line 106
    invoke-virtual {v9}, Lcom/lody/virtual/remote/vloc/VLocation;->getLatitude()D

    .line 107
    .line 108
    .line 109
    move-result-wide v9

    .line 110
    invoke-virtual {v8, v9, v10}, Lio/busniess/va/delegate/MyComponentDelegate;->format(D)D

    .line 111
    .line 112
    .line 113
    move-result-wide v8

    .line 114
    invoke-virtual {v1, v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    const-string v6, "longitude"

    .line 118
    .line 119
    iget-object v8, p0, Lio/busniess/va/delegate/MyComponentDelegate$1;->this$0:Lio/busniess/va/delegate/MyComponentDelegate;

    .line 120
    .line 121
    iget-object v9, v8, Lio/busniess/va/delegate/MyComponentDelegate;->vLocation:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 122
    .line 123
    invoke-virtual {v9}, Lcom/lody/virtual/remote/vloc/VLocation;->getLongitude()D

    .line 124
    .line 125
    .line 126
    move-result-wide v9

    .line 127
    invoke-virtual {v8, v9, v10}, Lio/busniess/va/delegate/MyComponentDelegate;->format(D)D

    .line 128
    .line 129
    .line 130
    move-result-wide v8

    .line 131
    invoke-virtual {v1, v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 135
    .line 136
    .line 137
    :catch_1
    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iget-object v1, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 142
    .line 143
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    new-instance v1, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    const-string v4, "\u4fee\u6539\u540e "

    .line 153
    .line 154
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 168
    .line 169
    iget-object v0, p1, Lu/dont/know/what/i/am/g$a;->e:[Ljava/lang/Object;

    .line 170
    .line 171
    aput-object v2, v0, v3

    .line 172
    .line 173
    invoke-super {p0, p1}, Lu/dont/know/what/i/am/g;->beforeHookedMethod(Lu/dont/know/what/i/am/g$a;)V

    .line 174
    .line 175
    .line 176
    :cond_0
    return-void
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
