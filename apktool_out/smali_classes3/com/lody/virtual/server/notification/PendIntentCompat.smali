.class Lcom/lody/virtual/server/notification/PendIntentCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/server/notification/PendIntentCompat$RectInfo;
    }
.end annotation


# instance fields
.field private clickIntents:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation
.end field

.field private mRemoteViews:Landroid/widget/RemoteViews;


# direct methods
.method constructor <init>(Landroid/widget/RemoteViews;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lody/virtual/server/notification/PendIntentCompat;->mRemoteViews:Landroid/widget/RemoteViews;

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

.method private findIntent(Landroid/graphics/Rect;Ljava/util/List;)Lcom/lody/virtual/server/notification/PendIntentCompat$RectInfo;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            "Ljava/util/List<",
            "Lcom/lody/virtual/server/notification/PendIntentCompat$RectInfo;",
            ">;)",
            "Lcom/lody/virtual/server/notification/PendIntentCompat$RectInfo;"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lcom/lody/virtual/server/notification/PendIntentCompat$RectInfo;

    .line 18
    .line 19
    iget-object v3, v2, Lcom/lody/virtual/server/notification/PendIntentCompat$RectInfo;->rect:Landroid/graphics/Rect;

    .line 20
    .line 21
    invoke-direct {p0, p1, v3}, Lcom/lody/virtual/server/notification/PendIntentCompat;->getOverlapArea(Landroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-le v3, v0, :cond_0

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v1, "find two:"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, v2, Lcom/lody/virtual/server/notification/PendIntentCompat$RectInfo;->rect:Landroid/graphics/Rect;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v1, "PendingIntentCompat"

    .line 49
    .line 50
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    :cond_1
    move-object v1, v2

    .line 54
    move v0, v3

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    return-object v1
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
.end method

.method private getClickIntents(Landroid/widget/RemoteViews;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/RemoteViews;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v1, "mActions"

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Lcom/lody/virtual/helper/utils/Reflect;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    :goto_0
    if-nez p1, :cond_1

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1
    instance-of v1, p1, Ljava/util/Collection;

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    check-cast p1, Ljava/util/Collection;

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    :try_start_1
    invoke-static {v1}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const-string v3, "getActionName"

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/utils/Reflect;->call(Ljava/lang/String;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Lcom/lody/virtual/helper/utils/Reflect;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :catch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    :goto_2
    const-string v3, "SetOnClickPendingIntent"

    .line 76
    .line 77
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_2

    .line 82
    .line 83
    invoke-static {v1}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    const-string v3, "viewId"

    .line 88
    .line 89
    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/utils/Reflect;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-static {v1}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const-string v3, "pendingIntent"

    .line 104
    .line 105
    invoke-virtual {v1, v3}, Lcom/lody/virtual/helper/utils/Reflect;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Landroid/app/PendingIntent;

    .line 110
    .line 111
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    return-object v0
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

.method private getOverlapArea(Landroid/graphics/Rect;Landroid/graphics/Rect;)I
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 7
    .line 8
    iget v2, p2, Landroid/graphics/Rect;->left:I

    .line 9
    .line 10
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 15
    .line 16
    iget v1, p1, Landroid/graphics/Rect;->top:I

    .line 17
    .line 18
    iget v2, p2, Landroid/graphics/Rect;->top:I

    .line 19
    .line 20
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 25
    .line 26
    iget v1, p1, Landroid/graphics/Rect;->right:I

    .line 27
    .line 28
    iget v2, p2, Landroid/graphics/Rect;->right:I

    .line 29
    .line 30
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 35
    .line 36
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 37
    .line 38
    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 39
    .line 40
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iput p1, v0, Landroid/graphics/Rect;->bottom:I

    .line 45
    .line 46
    iget p2, v0, Landroid/graphics/Rect;->left:I

    .line 47
    .line 48
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 49
    .line 50
    if-ge p2, v1, :cond_0

    .line 51
    .line 52
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 53
    .line 54
    if-ge v0, p1, :cond_0

    .line 55
    .line 56
    sub-int/2addr v1, p2

    .line 57
    sub-int/2addr p1, v0

    .line 58
    mul-int/2addr v1, p1

    .line 59
    return v1

    .line 60
    :cond_0
    const/4 p1, 0x0

    .line 61
    return p1
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
.end method

.method private getRect(Landroid/view/View;)Landroid/graphics/Rect;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    check-cast p1, Landroid/view/ViewGroup;

    .line 41
    .line 42
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/notification/PendIntentCompat;->getRect(Landroid/view/View;)Landroid/graphics/Rect;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 47
    .line 48
    iget v2, p1, Landroid/graphics/Rect;->top:I

    .line 49
    .line 50
    add-int/2addr v1, v2

    .line 51
    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 52
    .line 53
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 54
    .line 55
    iget v2, p1, Landroid/graphics/Rect;->left:I

    .line 56
    .line 57
    add-int/2addr v1, v2

    .line 58
    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 59
    .line 60
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 61
    .line 62
    iget v2, p1, Landroid/graphics/Rect;->left:I

    .line 63
    .line 64
    add-int/2addr v1, v2

    .line 65
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 66
    .line 67
    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 68
    .line 69
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 70
    .line 71
    add-int/2addr v1, p1

    .line 72
    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 73
    .line 74
    :cond_0
    return-object v0
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
.end method

.method private setIntentByViewGroup(Landroid/widget/RemoteViews;Landroid/view/ViewGroup;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/RemoteViews;",
            "Landroid/view/ViewGroup;",
            "Ljava/util/List<",
            "Lcom/lody/virtual/server/notification/PendIntentCompat$RectInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, v1}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, v0, :cond_3

    .line 15
    .line 16
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    check-cast v2, Landroid/view/ViewGroup;

    .line 25
    .line 26
    invoke-direct {p0, p1, v2, p3}, Lcom/lody/virtual/server/notification/PendIntentCompat;->setIntentByViewGroup(Landroid/widget/RemoteViews;Landroid/view/ViewGroup;Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    instance-of v3, v2, Landroid/widget/TextView;

    .line 31
    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    instance-of v3, v2, Landroid/widget/ImageView;

    .line 35
    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    :cond_1
    invoke-direct {p0, v2}, Lcom/lody/virtual/server/notification/PendIntentCompat;->getRect(Landroid/view/View;)Landroid/graphics/Rect;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-direct {p0, v3, p3}, Lcom/lody/virtual/server/notification/PendIntentCompat;->findIntent(Landroid/graphics/Rect;Ljava/util/List;)Lcom/lody/virtual/server/notification/PendIntentCompat$RectInfo;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    iget-object v3, v3, Lcom/lody/virtual/server/notification/PendIntentCompat$RectInfo;->mPendingIntent:Landroid/app/PendingIntent;

    .line 53
    .line 54
    invoke-virtual {p1, v2, v3}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    return-void
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
.method public findPendIntents()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/notification/PendIntentCompat;->clickIntents:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/lody/virtual/server/notification/PendIntentCompat;->mRemoteViews:Landroid/widget/RemoteViews;

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/lody/virtual/server/notification/PendIntentCompat;->getClickIntents(Landroid/widget/RemoteViews;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/lody/virtual/server/notification/PendIntentCompat;->clickIntents:Ljava/util/Map;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/server/notification/PendIntentCompat;->clickIntents:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setPendIntent(Landroid/widget/RemoteViews;Landroid/view/View;Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/lody/virtual/server/notification/PendIntentCompat;->findPendIntents()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lcom/lody/virtual/server/notification/PendIntentCompat;->clickIntents:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-virtual {p3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    invoke-direct {p0, v4}, Lcom/lody/virtual/server/notification/PendIntentCompat;->getRect(Landroid/view/View;)Landroid/graphics/Rect;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    new-instance v5, Lcom/lody/virtual/server/notification/PendIntentCompat$RectInfo;

    .line 56
    .line 57
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Landroid/app/PendingIntent;

    .line 62
    .line 63
    invoke-direct {v5, p0, v4, v3, v2}, Lcom/lody/virtual/server/notification/PendIntentCompat$RectInfo;-><init>(Lcom/lody/virtual/server/notification/PendIntentCompat;Landroid/graphics/Rect;Landroid/app/PendingIntent;I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    instance-of p3, p2, Landroid/view/ViewGroup;

    .line 73
    .line 74
    if-eqz p3, :cond_2

    .line 75
    .line 76
    check-cast p2, Landroid/view/ViewGroup;

    .line 77
    .line 78
    invoke-direct {p0, p1, p2, v1}, Lcom/lody/virtual/server/notification/PendIntentCompat;->setIntentByViewGroup(Landroid/widget/RemoteViews;Landroid/view/ViewGroup;Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void
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
