.class public final Lcom/lzf/easyfloat/utils/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J%\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0007R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\""
    }
    d2 = {
        "Lcom/lzf/easyfloat/utils/g;",
        "",
        "Landroid/app/Activity;",
        "activity",
        "Lkotlin/r2;",
        "h",
        "g",
        "",
        "isShow",
        "",
        "tag",
        "n",
        "(ZLjava/lang/String;)Lkotlin/r2;",
        "j",
        "Landroid/app/Application;",
        "application",
        "m",
        "k",
        "b",
        "Landroid/app/Application;",
        "i",
        "()Landroid/app/Application;",
        "l",
        "(Landroid/app/Application;)V",
        "",
        "c",
        "I",
        "activityCount",
        "Ljava/lang/ref/WeakReference;",
        "d",
        "Ljava/lang/ref/WeakReference;",
        "mTopActivity",
        "<init>",
        "()V",
        "easyfloat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final a:Lcom/lzf/easyfloat/utils/g;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static b:Landroid/app/Application;

.field private static c:I

.field private static d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lzf/easyfloat/utils/g;

    invoke-direct {v0}, Lcom/lzf/easyfloat/utils/g;-><init>()V

    sput-object v0, Lcom/lzf/easyfloat/utils/g;->a:Lcom/lzf/easyfloat/utils/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/lzf/easyfloat/utils/g;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lzf/easyfloat/utils/g;->g(Landroid/app/Activity;)V

    return-void
.end method

.method public static final synthetic b(Lcom/lzf/easyfloat/utils/g;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lzf/easyfloat/utils/g;->h(Landroid/app/Activity;)V

    return-void
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, Lcom/lzf/easyfloat/utils/g;->c:I

    return v0
.end method

.method public static final synthetic d()Ljava/lang/ref/WeakReference;
    .locals 1

    sget-object v0, Lcom/lzf/easyfloat/utils/g;->d:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method public static final synthetic e(I)V
    .locals 0

    sput p0, Lcom/lzf/easyfloat/utils/g;->c:I

    return-void
.end method

.method public static final synthetic f(Ljava/lang/ref/WeakReference;)V
    .locals 0

    sput-object p0, Lcom/lzf/easyfloat/utils/g;->d:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private final g(Landroid/app/Activity;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/lzf/easyfloat/utils/g;->k()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget-object v0, Lcom/lzf/easyfloat/core/e;->a:Lcom/lzf/easyfloat/core/e;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/lzf/easyfloat/core/e;->g()Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_7

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/util/Map$Entry;

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/lang/String;

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lcom/lzf/easyfloat/core/d;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    const/4 v4, 0x1

    .line 57
    if-eqz v3, :cond_5

    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/lzf/easyfloat/core/d;->u()Landroid/view/WindowManager$LayoutParams;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget-object v3, v3, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    .line 64
    .line 65
    if-nez v3, :cond_2

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    const/4 v6, 0x0

    .line 73
    if-nez v5, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-nez v5, :cond_4

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    invoke-virtual {v5}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    :goto_1
    invoke-static {v3, v6}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_5

    .line 92
    .line 93
    sget-object v3, Lcom/lzf/easyfloat/core/e;->a:Lcom/lzf/easyfloat/core/e;

    .line 94
    .line 95
    invoke-virtual {v3, v2, v4}, Lcom/lzf/easyfloat/core/e;->c(Ljava/lang/String;Z)Lkotlin/r2;

    .line 96
    .line 97
    .line 98
    :cond_5
    :goto_2
    invoke-virtual {v1}, Lcom/lzf/easyfloat/core/d;->r()Lcom/lzf/easyfloat/data/FloatConfig;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    sget-object v5, Lcom/lzf/easyfloat/utils/g;->a:Lcom/lzf/easyfloat/utils/g;

    .line 103
    .line 104
    invoke-virtual {v5}, Lcom/lzf/easyfloat/utils/g;->k()Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-nez v6, :cond_1

    .line 109
    .line 110
    invoke-virtual {v1}, Lcom/lzf/easyfloat/core/d;->r()Lcom/lzf/easyfloat/data/FloatConfig;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Lcom/lzf/easyfloat/data/FloatConfig;->getShowPattern()Lm2/a;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    sget-object v6, Lm2/a;->CURRENT_ACTIVITY:Lm2/a;

    .line 119
    .line 120
    if-eq v1, v6, :cond_1

    .line 121
    .line 122
    invoke-virtual {v3}, Lcom/lzf/easyfloat/data/FloatConfig;->getShowPattern()Lm2/a;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    sget-object v6, Lm2/a;->FOREGROUND:Lm2/a;

    .line 127
    .line 128
    if-eq v1, v6, :cond_6

    .line 129
    .line 130
    invoke-virtual {v3}, Lcom/lzf/easyfloat/data/FloatConfig;->getNeedShow$easyfloat_release()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_6

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    const/4 v4, 0x0

    .line 138
    :goto_3
    invoke-direct {v5, v4, v2}, Lcom/lzf/easyfloat/utils/g;->n(ZLjava/lang/String;)Lkotlin/r2;

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_7
    return-void
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

.method private final h(Landroid/app/Activity;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/lzf/easyfloat/core/e;->a:Lcom/lzf/easyfloat/core/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/lzf/easyfloat/core/e;->g()Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/util/Map$Entry;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/String;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lcom/lzf/easyfloat/core/d;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/lzf/easyfloat/core/d;->r()Lcom/lzf/easyfloat/data/FloatConfig;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Lcom/lzf/easyfloat/data/FloatConfig;->getShowPattern()Lm2/a;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    sget-object v4, Lm2/a;->CURRENT_ACTIVITY:Lm2/a;

    .line 48
    .line 49
    if-ne v3, v4, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {v1}, Lcom/lzf/easyfloat/data/FloatConfig;->getShowPattern()Lm2/a;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    sget-object v4, Lm2/a;->BACKGROUND:Lm2/a;

    .line 57
    .line 58
    if-ne v3, v4, :cond_2

    .line 59
    .line 60
    sget-object v1, Lcom/lzf/easyfloat/utils/g;->a:Lcom/lzf/easyfloat/utils/g;

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-direct {v1, v3, v2}, Lcom/lzf/easyfloat/utils/g;->n(ZLjava/lang/String;)Lkotlin/r2;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {v1}, Lcom/lzf/easyfloat/data/FloatConfig;->getNeedShow$easyfloat_release()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_0

    .line 72
    .line 73
    sget-object v3, Lcom/lzf/easyfloat/utils/g;->a:Lcom/lzf/easyfloat/utils/g;

    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/lzf/easyfloat/data/FloatConfig;->getFilterSet()Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {p1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v4}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    xor-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    invoke-direct {v3, v1, v2}, Lcom/lzf/easyfloat/utils/g;->n(ZLjava/lang/String;)Lkotlin/r2;

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    return-void
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

.method private final n(ZLjava/lang/String;)Lkotlin/r2;
    .locals 6

    sget-object v0, Lcom/lzf/easyfloat/core/e;->a:Lcom/lzf/easyfloat/core/e;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lcom/lzf/easyfloat/core/e;->j(Lcom/lzf/easyfloat/core/e;ZLjava/lang/String;ZILjava/lang/Object;)Lkotlin/r2;

    move-result-object p1

    return-object p1
.end method

.method static synthetic o(Lcom/lzf/easyfloat/utils/g;ZLjava/lang/String;ILjava/lang/Object;)Lkotlin/r2;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lcom/lzf/easyfloat/utils/g;->k()Z

    move-result p1

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/lzf/easyfloat/utils/g;->n(ZLjava/lang/String;)Lkotlin/r2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final i()Landroid/app/Application;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lcom/lzf/easyfloat/utils/g;->b:Landroid/app/Application;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "application"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final j()Landroid/app/Activity;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    sget-object v0, Lcom/lzf/easyfloat/utils/g;->d:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    :goto_0
    return-object v0
.end method

.method public final k()Z
    .locals 1

    sget v0, Lcom/lzf/easyfloat/utils/g;->c:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l(Landroid/app/Application;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sput-object p1, Lcom/lzf/easyfloat/utils/g;->b:Landroid/app/Application;

    .line 7
    .line 8
    return-void
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

.method public final m(Landroid/app/Application;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "application"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/lzf/easyfloat/utils/g;->l(Landroid/app/Application;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/lzf/easyfloat/utils/g$a;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/lzf/easyfloat/utils/g$a;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 15
    .line 16
    .line 17
    return-void
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
