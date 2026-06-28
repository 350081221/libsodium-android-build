.class Lio/busniess/va/delegate/MyComponentDelegate$2$1;
.super Lu/dont/know/what/i/am/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/busniess/va/delegate/MyComponentDelegate$2;->afterHookedMethod(Lu/dont/know/what/i/am/g$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lio/busniess/va/delegate/MyComponentDelegate$2;


# direct methods
.method constructor <init>(Lio/busniess/va/delegate/MyComponentDelegate$2;)V
    .locals 0

    iput-object p1, p0, Lio/busniess/va/delegate/MyComponentDelegate$2$1;->this$1:Lio/busniess/va/delegate/MyComponentDelegate$2;

    invoke-direct {p0}, Lu/dont/know/what/i/am/g;-><init>()V

    return-void
.end method


# virtual methods
.method protected afterHookedMethod(Lu/dont/know/what/i/am/g$a;)V
    .locals 10
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
    invoke-super {p0, p1}, Lu/dont/know/what/i/am/g;->afterHookedMethod(Lu/dont/know/what/i/am/g$a;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lu/dont/know/what/i/am/g$a;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Landroid/os/Bundle;

    .line 13
    .line 14
    new-instance v3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v4, "bundle =="

    .line 20
    .line 21
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v4, "\n "

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v4, p1, Lu/dont/know/what/i/am/g$a;->e:[Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    aget-object v4, v4, v5

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const-string v4, "test "

    .line 45
    .line 46
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    const-string v3, "result"

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    new-instance v5, Lorg/json/JSONObject;

    .line 56
    .line 57
    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :try_start_0
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    const-string v6, "lat"

    .line 65
    .line 66
    iget-object v7, p0, Lio/busniess/va/delegate/MyComponentDelegate$2$1;->this$1:Lio/busniess/va/delegate/MyComponentDelegate$2;

    .line 67
    .line 68
    iget-object v7, v7, Lio/busniess/va/delegate/MyComponentDelegate$2;->this$0:Lio/busniess/va/delegate/MyComponentDelegate;

    .line 69
    .line 70
    iget-object v8, v7, Lio/busniess/va/delegate/MyComponentDelegate;->vLocation:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 71
    .line 72
    invoke-virtual {v8}, Lcom/lody/virtual/remote/vloc/VLocation;->getLatitude()D

    .line 73
    .line 74
    .line 75
    move-result-wide v8

    .line 76
    invoke-virtual {v7, v8, v9}, Lio/busniess/va/delegate/MyComponentDelegate;->format(D)D

    .line 77
    .line 78
    .line 79
    move-result-wide v7

    .line 80
    invoke-virtual {v4, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    const-string v6, "lng"

    .line 84
    .line 85
    iget-object v7, p0, Lio/busniess/va/delegate/MyComponentDelegate$2$1;->this$1:Lio/busniess/va/delegate/MyComponentDelegate$2;

    .line 86
    .line 87
    iget-object v7, v7, Lio/busniess/va/delegate/MyComponentDelegate$2;->this$0:Lio/busniess/va/delegate/MyComponentDelegate;

    .line 88
    .line 89
    iget-object v8, v7, Lio/busniess/va/delegate/MyComponentDelegate;->vLocation:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 90
    .line 91
    invoke-virtual {v8}, Lcom/lody/virtual/remote/vloc/VLocation;->getLongitude()D

    .line 92
    .line 93
    .line 94
    move-result-wide v8

    .line 95
    invoke-virtual {v7, v8, v9}, Lio/busniess/va/delegate/MyComponentDelegate;->format(D)D

    .line 96
    .line 97
    .line 98
    move-result-wide v7

    .line 99
    invoke-virtual {v4, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    .line 104
    .line 105
    :catch_0
    :try_start_1
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    const-string v4, "latitude"

    .line 110
    .line 111
    iget-object v6, p0, Lio/busniess/va/delegate/MyComponentDelegate$2$1;->this$1:Lio/busniess/va/delegate/MyComponentDelegate$2;

    .line 112
    .line 113
    iget-object v6, v6, Lio/busniess/va/delegate/MyComponentDelegate$2;->this$0:Lio/busniess/va/delegate/MyComponentDelegate;

    .line 114
    .line 115
    iget-object v7, v6, Lio/busniess/va/delegate/MyComponentDelegate;->vLocation:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 116
    .line 117
    invoke-virtual {v7}, Lcom/lody/virtual/remote/vloc/VLocation;->getLatitude()D

    .line 118
    .line 119
    .line 120
    move-result-wide v7

    .line 121
    invoke-virtual {v6, v7, v8}, Lio/busniess/va/delegate/MyComponentDelegate;->format(D)D

    .line 122
    .line 123
    .line 124
    move-result-wide v6

    .line 125
    invoke-virtual {v1, v4, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 126
    .line 127
    .line 128
    const-string v4, "longitude"

    .line 129
    .line 130
    iget-object v6, p0, Lio/busniess/va/delegate/MyComponentDelegate$2$1;->this$1:Lio/busniess/va/delegate/MyComponentDelegate$2;

    .line 131
    .line 132
    iget-object v6, v6, Lio/busniess/va/delegate/MyComponentDelegate$2;->this$0:Lio/busniess/va/delegate/MyComponentDelegate;

    .line 133
    .line 134
    iget-object v7, v6, Lio/busniess/va/delegate/MyComponentDelegate;->vLocation:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 135
    .line 136
    invoke-virtual {v7}, Lcom/lody/virtual/remote/vloc/VLocation;->getLongitude()D

    .line 137
    .line 138
    .line 139
    move-result-wide v7

    .line 140
    invoke-virtual {v6, v7, v8}, Lio/busniess/va/delegate/MyComponentDelegate;->format(D)D

    .line 141
    .line 142
    .line 143
    move-result-wide v6

    .line 144
    invoke-virtual {v1, v4, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 148
    .line 149
    .line 150
    :catch_1
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v2, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v2}, Lu/dont/know/what/i/am/g$a;->h(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    return-void
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
