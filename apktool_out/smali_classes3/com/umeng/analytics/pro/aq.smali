.class public Lcom/umeng/analytics/pro/aq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String; = ""

.field private static b:Ljava/lang/String; = ""

.field private static final c:Ljava/lang/String; = "hw_sc.build.platform.version"

.field private static final d:Ljava/lang/String; = "ro.build.version.emui"

.field private static final e:Ljava/lang/String; = "ro.build.version.magic"

.field private static final f:Ljava/lang/String; = "ro.miui.ui.version.name"

.field private static final g:Ljava/lang/String; = "ro.build.version.opporom"

.field private static final h:Ljava/lang/String; = "ro.vivo.os.name"

.field private static final i:Ljava/lang/String; = "ro.vivo.os.version"

.field private static final j:Ljava/lang/String; = "ro.build.version.oplusrom"

.field private static final k:Ljava/lang/String; = "ro.rom.version"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 5
    sget-object v0, Lcom/umeng/analytics/pro/aq;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-static {p0}, Lcom/umeng/analytics/pro/aq;->e(Ljava/lang/String;)V

    .line 7
    :cond_0
    sget-object p0, Lcom/umeng/analytics/pro/aq;->a:Ljava/lang/String;

    return-object p0
.end method

.method private static a()Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.huawei.system.BuildEx"

    .line 1
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getOsBrand"

    new-array v3, v0, [Ljava/lang/Class;

    .line 2
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v0, [Ljava/lang/Object;

    .line 3
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 4
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    xor-int/lit8 v0, v0, 0x1

    :catchall_0
    return v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aq;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lcom/umeng/analytics/pro/aq;->e(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    sget-object p0, Lcom/umeng/analytics/pro/aq;->b:Ljava/lang/String;

    .line 13
    .line 14
    return-object p0
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

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    const-string v0, " "

    .line 11
    .line 12
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    :try_start_0
    const-string v0, "android.os.SystemProperties"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "get"

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    new-array v3, v2, [Ljava/lang/Class;

    .line 11
    .line 12
    const-class v4, Ljava/lang/String;

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    aput-object v4, v3, v5

    .line 16
    .line 17
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-array v2, v2, [Ljava/lang/Object;

    .line 22
    .line 23
    aput-object p0, v2, v5

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    return-object p0

    .line 32
    :catchall_0
    const/4 p0, 0x0

    .line 33
    return-object p0
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
.end method

.method private static e(Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "ro.build.version.magic"

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0}, Lcom/umeng/analytics/pro/aq;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    sparse-switch v1, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :sswitch_0
    const-string v1, "HUAWEI"

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    goto :goto_1

    .line 25
    :sswitch_1
    const-string v1, "REDMI"

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x3

    .line 34
    goto :goto_1

    .line 35
    :sswitch_2
    const-string v1, "HONOR"

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    goto :goto_1

    .line 45
    :sswitch_3
    const-string v1, "VIVO"

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    const/4 p0, 0x6

    .line 54
    goto :goto_1

    .line 55
    :sswitch_4
    const-string v1, "OPPO"

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_0

    .line 62
    .line 63
    const/4 p0, 0x5

    .line 64
    goto :goto_1

    .line 65
    :sswitch_5
    const-string v1, "ONEPLUS"

    .line 66
    .line 67
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_0

    .line 72
    .line 73
    const/4 p0, 0x7

    .line 74
    goto :goto_1

    .line 75
    :sswitch_6
    const-string v1, "XIAOMI"

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_0

    .line 82
    .line 83
    const/4 p0, 0x2

    .line 84
    goto :goto_1

    .line 85
    :sswitch_7
    const-string v1, "REALME"

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    if-eqz p0, :cond_0

    .line 92
    .line 93
    const/4 p0, 0x4

    .line 94
    goto :goto_1

    .line 95
    :cond_0
    :goto_0
    const/4 p0, -0x1

    .line 96
    :goto_1
    const-string v1, "ro.build.version.emui"

    .line 97
    .line 98
    const-string v2, "EMUI"

    .line 99
    .line 100
    const-string v3, "ColorOS"

    .line 101
    .line 102
    packed-switch p0, :pswitch_data_0

    .line 103
    .line 104
    .line 105
    :try_start_1
    const-string p0, "Android"

    .line 106
    .line 107
    goto/16 :goto_2

    .line 108
    .line 109
    :pswitch_0
    const-string p0, "HydrogenOS"

    .line 110
    .line 111
    sput-object p0, Lcom/umeng/analytics/pro/aq;->a:Ljava/lang/String;

    .line 112
    .line 113
    const-string p0, "ro.rom.version"

    .line 114
    .line 115
    invoke-static {p0}, Lcom/umeng/analytics/pro/aq;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_1

    .line 124
    .line 125
    sput-object v3, Lcom/umeng/analytics/pro/aq;->a:Ljava/lang/String;

    .line 126
    .line 127
    const-string p0, "ro.build.version.oplusrom"

    .line 128
    .line 129
    invoke-static {p0}, Lcom/umeng/analytics/pro/aq;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    :cond_1
    sput-object p0, Lcom/umeng/analytics/pro/aq;->b:Ljava/lang/String;

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :pswitch_1
    const-string p0, "Funtouch"

    .line 137
    .line 138
    sput-object p0, Lcom/umeng/analytics/pro/aq;->a:Ljava/lang/String;

    .line 139
    .line 140
    const-string p0, "ro.vivo.os.version"

    .line 141
    .line 142
    invoke-static {p0}, Lcom/umeng/analytics/pro/aq;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    sput-object p0, Lcom/umeng/analytics/pro/aq;->b:Ljava/lang/String;

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :pswitch_2
    sput-object v3, Lcom/umeng/analytics/pro/aq;->a:Ljava/lang/String;

    .line 150
    .line 151
    const-string p0, "ro.build.version.opporom"

    .line 152
    .line 153
    invoke-static {p0}, Lcom/umeng/analytics/pro/aq;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    sput-object p0, Lcom/umeng/analytics/pro/aq;->b:Ljava/lang/String;

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :pswitch_3
    const-string p0, "MIUI"

    .line 161
    .line 162
    sput-object p0, Lcom/umeng/analytics/pro/aq;->a:Ljava/lang/String;

    .line 163
    .line 164
    const-string p0, "ro.miui.ui.version.name"

    .line 165
    .line 166
    invoke-static {p0}, Lcom/umeng/analytics/pro/aq;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    sput-object p0, Lcom/umeng/analytics/pro/aq;->b:Ljava/lang/String;

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :pswitch_4
    invoke-static {v0}, Lcom/umeng/analytics/pro/aq;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-nez p0, :cond_2

    .line 182
    .line 183
    const-string p0, "MagicUI"

    .line 184
    .line 185
    sput-object p0, Lcom/umeng/analytics/pro/aq;->a:Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v0}, Lcom/umeng/analytics/pro/aq;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    sput-object p0, Lcom/umeng/analytics/pro/aq;->b:Ljava/lang/String;

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_2
    sput-object v2, Lcom/umeng/analytics/pro/aq;->a:Ljava/lang/String;

    .line 195
    .line 196
    invoke-static {v1}, Lcom/umeng/analytics/pro/aq;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    sput-object p0, Lcom/umeng/analytics/pro/aq;->b:Ljava/lang/String;

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :pswitch_5
    invoke-static {}, Lcom/umeng/analytics/pro/aq;->a()Z

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    if-eqz p0, :cond_3

    .line 208
    .line 209
    const-string p0, "hw_sc.build.platform.version"

    .line 210
    .line 211
    invoke-static {p0}, Lcom/umeng/analytics/pro/aq;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    sput-object p0, Lcom/umeng/analytics/pro/aq;->b:Ljava/lang/String;

    .line 216
    .line 217
    const-string p0, "HarmonyOS"

    .line 218
    .line 219
    sput-object p0, Lcom/umeng/analytics/pro/aq;->a:Ljava/lang/String;

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_3
    sput-object v2, Lcom/umeng/analytics/pro/aq;->a:Ljava/lang/String;

    .line 223
    .line 224
    invoke-static {v1}, Lcom/umeng/analytics/pro/aq;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    sput-object p0, Lcom/umeng/analytics/pro/aq;->b:Ljava/lang/String;

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :goto_2
    sput-object p0, Lcom/umeng/analytics/pro/aq;->a:Ljava/lang/String;

    .line 232
    .line 233
    sget-object p0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 234
    .line 235
    sput-object p0, Lcom/umeng/analytics/pro/aq;->b:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    .line 237
    :catchall_0
    :goto_3
    return-void

    .line 238
    nop

    .line 239
    :sswitch_data_0
    .sparse-switch
        -0x7027944a -> :sswitch_7
        -0x65b21745 -> :sswitch_6
        -0x23e7db20 -> :sswitch_5
        0x251fa0 -> :sswitch_4
        0x2834ac -> :sswitch_3
        0x41bb44a -> :sswitch_2
        0x4a3edcd -> :sswitch_1
        0x7fa995e7 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
