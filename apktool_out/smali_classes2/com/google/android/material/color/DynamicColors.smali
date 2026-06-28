.class public Lcom/google/android/material/color/DynamicColors;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/color/DynamicColors$DeviceSupportCondition;,
        Lcom/google/android/material/color/DynamicColors$DynamicColorsActivityLifecycleCallbacks;,
        Lcom/google/android/material/color/DynamicColors$OnAppliedCallback;,
        Lcom/google/android/material/color/DynamicColors$Precondition;
    }
.end annotation


# static fields
.field private static final DEFAULT_DEVICE_SUPPORT_CONDITION:Lcom/google/android/material/color/DynamicColors$DeviceSupportCondition;

.field private static final DYNAMIC_COLOR_SUPPORTED_BRANDS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/material/color/DynamicColors$DeviceSupportCondition;",
            ">;"
        }
    .end annotation
.end field

.field private static final DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/material/color/DynamicColors$DeviceSupportCondition;",
            ">;"
        }
    .end annotation
.end field

.field private static final DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE:[I

.field private static final SAMSUNG_DEVICE_SUPPORT_CONDITION:Lcom/google/android/material/color/DynamicColors$DeviceSupportCondition;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PrivateApi"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String;

.field private static final USE_DEFAULT_THEME_OVERLAY:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    sget v2, Lcom/google/android/material/R$attr;->dynamicColorThemeOverlay:I

    .line 6
    .line 7
    aput v2, v0, v1

    .line 8
    .line 9
    sput-object v0, Lcom/google/android/material/color/DynamicColors;->DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE:[I

    .line 10
    .line 11
    new-instance v0, Lcom/google/android/material/color/DynamicColors$1;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/google/android/material/color/DynamicColors$1;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lcom/google/android/material/color/DynamicColors;->DEFAULT_DEVICE_SUPPORT_CONDITION:Lcom/google/android/material/color/DynamicColors$DeviceSupportCondition;

    .line 17
    .line 18
    new-instance v1, Lcom/google/android/material/color/DynamicColors$2;

    .line 19
    .line 20
    invoke-direct {v1}, Lcom/google/android/material/color/DynamicColors$2;-><init>()V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lcom/google/android/material/color/DynamicColors;->SAMSUNG_DEVICE_SUPPORT_CONDITION:Lcom/google/android/material/color/DynamicColors$DeviceSupportCondition;

    .line 24
    .line 25
    new-instance v2, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v3, "fcnt"

    .line 31
    .line 32
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    const-string v3, "google"

    .line 36
    .line 37
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const-string v3, "hmd global"

    .line 41
    .line 42
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    const-string v3, "infinix"

    .line 46
    .line 47
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const-string v3, "infinix mobility limited"

    .line 51
    .line 52
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    const-string v3, "itel"

    .line 56
    .line 57
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    const-string v3, "kyocera"

    .line 61
    .line 62
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    const-string v3, "lenovo"

    .line 66
    .line 67
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    const-string v3, "lge"

    .line 71
    .line 72
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    const-string v3, "meizu"

    .line 76
    .line 77
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    const-string v3, "motorola"

    .line 81
    .line 82
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    const-string v3, "nothing"

    .line 86
    .line 87
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    const-string v3, "oneplus"

    .line 91
    .line 92
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    const-string v3, "oppo"

    .line 96
    .line 97
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    const-string v3, "realme"

    .line 101
    .line 102
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    const-string v3, "robolectric"

    .line 106
    .line 107
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    const-string v3, "samsung"

    .line 111
    .line 112
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    const-string v1, "sharp"

    .line 116
    .line 117
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    const-string v1, "shift"

    .line 121
    .line 122
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    const-string v1, "sony"

    .line 126
    .line 127
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    const-string v1, "tcl"

    .line 131
    .line 132
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    const-string v1, "tecno"

    .line 136
    .line 137
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    const-string v1, "tecno mobile limited"

    .line 141
    .line 142
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    const-string/jumbo v1, "vivo"

    .line 146
    .line 147
    .line 148
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    const-string/jumbo v1, "wingtech"

    .line 152
    .line 153
    .line 154
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    const-string/jumbo v1, "xiaomi"

    .line 158
    .line 159
    .line 160
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    sput-object v1, Lcom/google/android/material/color/DynamicColors;->DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS:Ljava/util/Map;

    .line 168
    .line 169
    new-instance v1, Ljava/util/HashMap;

    .line 170
    .line 171
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 172
    .line 173
    .line 174
    const-string v2, "asus"

    .line 175
    .line 176
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    const-string v2, "jio"

    .line 180
    .line 181
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    sput-object v0, Lcom/google/android/material/color/DynamicColors;->DYNAMIC_COLOR_SUPPORTED_BRANDS:Ljava/util/Map;

    .line 189
    .line 190
    const-class v0, Lcom/google/android/material/color/DynamicColors;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    sput-object v0, Lcom/google/android/material/color/DynamicColors;->TAG:Ljava/lang/String;

    .line 197
    .line 198
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static applyIfAvailable(Landroid/app/Activity;)V
    .locals 0
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/google/android/material/color/DynamicColors;->applyToActivityIfAvailable(Landroid/app/Activity;)V

    return-void
.end method

.method public static applyIfAvailable(Landroid/app/Activity;I)V
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # I
        .annotation build Landroidx/annotation/StyleRes;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    new-instance v0, Lcom/google/android/material/color/DynamicColorsOptions$Builder;

    invoke-direct {v0}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;-><init>()V

    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;->setThemeOverlay(I)Lcom/google/android/material/color/DynamicColorsOptions$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;->build()Lcom/google/android/material/color/DynamicColorsOptions;

    move-result-object p1

    .line 4
    invoke-static {p0, p1}, Lcom/google/android/material/color/DynamicColors;->applyToActivityIfAvailable(Landroid/app/Activity;Lcom/google/android/material/color/DynamicColorsOptions;)V

    return-void
.end method

.method public static applyIfAvailable(Landroid/app/Activity;Lcom/google/android/material/color/DynamicColors$Precondition;)V
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/android/material/color/DynamicColors$Precondition;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    new-instance v0, Lcom/google/android/material/color/DynamicColorsOptions$Builder;

    invoke-direct {v0}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;-><init>()V

    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;->setPrecondition(Lcom/google/android/material/color/DynamicColors$Precondition;)Lcom/google/android/material/color/DynamicColorsOptions$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;->build()Lcom/google/android/material/color/DynamicColorsOptions;

    move-result-object p1

    .line 7
    invoke-static {p0, p1}, Lcom/google/android/material/color/DynamicColors;->applyToActivityIfAvailable(Landroid/app/Activity;Lcom/google/android/material/color/DynamicColorsOptions;)V

    return-void
.end method

.method public static applyToActivitiesIfAvailable(Landroid/app/Application;)V
    .locals 1
    .param p0    # Landroid/app/Application;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Lcom/google/android/material/color/DynamicColorsOptions$Builder;

    invoke-direct {v0}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;->build()Lcom/google/android/material/color/DynamicColorsOptions;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/material/color/DynamicColors;->applyToActivitiesIfAvailable(Landroid/app/Application;Lcom/google/android/material/color/DynamicColorsOptions;)V

    return-void
.end method

.method public static applyToActivitiesIfAvailable(Landroid/app/Application;I)V
    .locals 1
    .param p0    # Landroid/app/Application;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # I
        .annotation build Landroidx/annotation/StyleRes;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    new-instance v0, Lcom/google/android/material/color/DynamicColorsOptions$Builder;

    invoke-direct {v0}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;-><init>()V

    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;->setThemeOverlay(I)Lcom/google/android/material/color/DynamicColorsOptions$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;->build()Lcom/google/android/material/color/DynamicColorsOptions;

    move-result-object p1

    .line 4
    invoke-static {p0, p1}, Lcom/google/android/material/color/DynamicColors;->applyToActivitiesIfAvailable(Landroid/app/Application;Lcom/google/android/material/color/DynamicColorsOptions;)V

    return-void
.end method

.method public static applyToActivitiesIfAvailable(Landroid/app/Application;ILcom/google/android/material/color/DynamicColors$Precondition;)V
    .locals 1
    .param p0    # Landroid/app/Application;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # I
        .annotation build Landroidx/annotation/StyleRes;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/material/color/DynamicColors$Precondition;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 8
    new-instance v0, Lcom/google/android/material/color/DynamicColorsOptions$Builder;

    invoke-direct {v0}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;-><init>()V

    .line 9
    invoke-virtual {v0, p1}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;->setThemeOverlay(I)Lcom/google/android/material/color/DynamicColorsOptions$Builder;

    move-result-object p1

    .line 10
    invoke-virtual {p1, p2}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;->setPrecondition(Lcom/google/android/material/color/DynamicColors$Precondition;)Lcom/google/android/material/color/DynamicColorsOptions$Builder;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;->build()Lcom/google/android/material/color/DynamicColorsOptions;

    move-result-object p1

    .line 12
    invoke-static {p0, p1}, Lcom/google/android/material/color/DynamicColors;->applyToActivitiesIfAvailable(Landroid/app/Application;Lcom/google/android/material/color/DynamicColorsOptions;)V

    return-void
.end method

.method public static applyToActivitiesIfAvailable(Landroid/app/Application;Lcom/google/android/material/color/DynamicColors$Precondition;)V
    .locals 1
    .param p0    # Landroid/app/Application;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/android/material/color/DynamicColors$Precondition;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    new-instance v0, Lcom/google/android/material/color/DynamicColorsOptions$Builder;

    invoke-direct {v0}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;-><init>()V

    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;->setPrecondition(Lcom/google/android/material/color/DynamicColors$Precondition;)Lcom/google/android/material/color/DynamicColorsOptions$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;->build()Lcom/google/android/material/color/DynamicColorsOptions;

    move-result-object p1

    .line 7
    invoke-static {p0, p1}, Lcom/google/android/material/color/DynamicColors;->applyToActivitiesIfAvailable(Landroid/app/Application;Lcom/google/android/material/color/DynamicColorsOptions;)V

    return-void
.end method

.method public static applyToActivitiesIfAvailable(Landroid/app/Application;Lcom/google/android/material/color/DynamicColorsOptions;)V
    .locals 1
    .param p0    # Landroid/app/Application;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/android/material/color/DynamicColorsOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 13
    new-instance v0, Lcom/google/android/material/color/DynamicColors$DynamicColorsActivityLifecycleCallbacks;

    invoke-direct {v0, p1}, Lcom/google/android/material/color/DynamicColors$DynamicColorsActivityLifecycleCallbacks;-><init>(Lcom/google/android/material/color/DynamicColorsOptions;)V

    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public static applyToActivityIfAvailable(Landroid/app/Activity;)V
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Lcom/google/android/material/color/DynamicColorsOptions$Builder;

    invoke-direct {v0}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;->build()Lcom/google/android/material/color/DynamicColorsOptions;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/material/color/DynamicColors;->applyToActivityIfAvailable(Landroid/app/Activity;Lcom/google/android/material/color/DynamicColorsOptions;)V

    return-void
.end method

.method public static applyToActivityIfAvailable(Landroid/app/Activity;Lcom/google/android/material/color/DynamicColorsOptions;)V
    .locals 5
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/android/material/color/DynamicColorsOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-static {}, Lcom/google/android/material/color/DynamicColors;->isDynamicColorAvailable()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions;->getContentBasedSeedColor()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_2

    .line 4
    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions;->getThemeOverlay()I

    move-result v0

    if-nez v0, :cond_1

    .line 5
    sget-object v0, Lcom/google/android/material/color/DynamicColors;->DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE:[I

    invoke-static {p0, v0}, Lcom/google/android/material/color/DynamicColors;->getDefaultThemeOverlay(Landroid/content/Context;[I)I

    move-result v0

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions;->getThemeOverlay()I

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 7
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions;->getPrecondition()Lcom/google/android/material/color/DynamicColors$Precondition;

    move-result-object v1

    invoke-interface {v1, p0, v0}, Lcom/google/android/material/color/DynamicColors$Precondition;->shouldApplyDynamicColors(Landroid/app/Activity;I)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 8
    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions;->getContentBasedSeedColor()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 9
    new-instance v0, Lcom/google/android/material/color/utilities/SchemeContent;

    .line 10
    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions;->getContentBasedSeedColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/material/color/utilities/Hct;->fromInt(I)Lcom/google/android/material/color/utilities/Hct;

    move-result-object v1

    .line 11
    invoke-static {p0}, Lcom/google/android/material/color/MaterialColors;->isLightTheme(Landroid/content/Context;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    .line 12
    invoke-static {p0}, Lcom/google/android/material/color/DynamicColors;->getSystemContrast(Landroid/content/Context;)F

    move-result v3

    float-to-double v3, v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/material/color/utilities/SchemeContent;-><init>(Lcom/google/android/material/color/utilities/Hct;ZD)V

    .line 13
    invoke-static {}, Lcom/google/android/material/color/ColorResourcesOverride;->getInstance()Lcom/google/android/material/color/ColorResourcesOverride;

    move-result-object v1

    if-nez v1, :cond_3

    return-void

    .line 14
    :cond_3
    invoke-static {v0}, Lcom/google/android/material/color/MaterialColorUtilitiesHelper;->createColorResourcesIdsToColorValues(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/util/Map;

    move-result-object v0

    .line 15
    invoke-interface {v1, p0, v0}, Lcom/google/android/material/color/ColorResourcesOverride;->applyIfPossible(Landroid/content/Context;Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_5

    return-void

    .line 16
    :cond_4
    invoke-static {p0, v0}, Lcom/google/android/material/color/ThemeUtils;->applyThemeOverlay(Landroid/content/Context;I)V

    .line 17
    :cond_5
    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions;->getOnAppliedCallback()Lcom/google/android/material/color/DynamicColors$OnAppliedCallback;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/google/android/material/color/DynamicColors$OnAppliedCallback;->onApplied(Landroid/app/Activity;)V

    :cond_6
    return-void
.end method

.method private static getDefaultThemeOverlay(Landroid/content/Context;[I)I
    .locals 0
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 11
    .line 12
    .line 13
    return p1
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
.end method

.method private static getSystemContrast(Landroid/content/Context;)F
    .locals 2

    .line 1
    const-string/jumbo v0, "uimode"

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroid/app/UiModeManager;

    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v1, 0x22

    .line 15
    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroid/app/UiModeManager;->getContrast()F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 25
    :goto_1
    return p0
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
.end method

.method public static isDynamicColorAvailable()Z
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    .annotation build Landroidx/annotation/ChecksSdkIntAtLeast;
        api = 0x1f
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    invoke-static {}, Landroidx/core/os/BuildCompat;->isAtLeastT()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return v1

    .line 17
    :cond_1
    sget-object v0, Lcom/google/android/material/color/DynamicColors;->DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS:Ljava/util/Map;

    .line 18
    .line 19
    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 20
    .line 21
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lcom/google/android/material/color/DynamicColors$DeviceSupportCondition;

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    sget-object v0, Lcom/google/android/material/color/DynamicColors;->DYNAMIC_COLOR_SUPPORTED_BRANDS:Ljava/util/Map;

    .line 36
    .line 37
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lcom/google/android/material/color/DynamicColors$DeviceSupportCondition;

    .line 48
    .line 49
    :cond_2
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-interface {v0}, Lcom/google/android/material/color/DynamicColors$DeviceSupportCondition;->isSupported()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    move v2, v1

    .line 58
    :cond_3
    return v2
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
.end method

.method public static wrapContextIfAvailable(Landroid/content/Context;)Landroid/content/Context;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lcom/google/android/material/color/DynamicColors;->wrapContextIfAvailable(Landroid/content/Context;I)Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method public static wrapContextIfAvailable(Landroid/content/Context;I)Landroid/content/Context;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # I
        .annotation build Landroidx/annotation/StyleRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    new-instance v0, Lcom/google/android/material/color/DynamicColorsOptions$Builder;

    invoke-direct {v0}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;-><init>()V

    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;->setThemeOverlay(I)Lcom/google/android/material/color/DynamicColorsOptions$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions$Builder;->build()Lcom/google/android/material/color/DynamicColorsOptions;

    move-result-object p1

    .line 4
    invoke-static {p0, p1}, Lcom/google/android/material/color/DynamicColors;->wrapContextIfAvailable(Landroid/content/Context;Lcom/google/android/material/color/DynamicColorsOptions;)Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method public static wrapContextIfAvailable(Landroid/content/Context;Lcom/google/android/material/color/DynamicColorsOptions;)Landroid/content/Context;
    .locals 5
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/android/material/color/DynamicColorsOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 5
    invoke-static {}, Lcom/google/android/material/color/DynamicColors;->isDynamicColorAvailable()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions;->getThemeOverlay()I

    move-result v0

    if-nez v0, :cond_1

    .line 7
    sget-object v0, Lcom/google/android/material/color/DynamicColors;->DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE:[I

    invoke-static {p0, v0}, Lcom/google/android/material/color/DynamicColors;->getDefaultThemeOverlay(Landroid/content/Context;[I)I

    move-result v0

    :cond_1
    if-nez v0, :cond_2

    return-object p0

    .line 8
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions;->getContentBasedSeedColor()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 9
    new-instance v1, Lcom/google/android/material/color/utilities/SchemeContent;

    .line 10
    invoke-virtual {p1}, Lcom/google/android/material/color/DynamicColorsOptions;->getContentBasedSeedColor()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/material/color/utilities/Hct;->fromInt(I)Lcom/google/android/material/color/utilities/Hct;

    move-result-object p1

    .line 11
    invoke-static {p0}, Lcom/google/android/material/color/MaterialColors;->isLightTheme(Landroid/content/Context;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    .line 12
    invoke-static {p0}, Lcom/google/android/material/color/DynamicColors;->getSystemContrast(Landroid/content/Context;)F

    move-result v3

    float-to-double v3, v3

    invoke-direct {v1, p1, v2, v3, v4}, Lcom/google/android/material/color/utilities/SchemeContent;-><init>(Lcom/google/android/material/color/utilities/Hct;ZD)V

    .line 13
    invoke-static {}, Lcom/google/android/material/color/ColorResourcesOverride;->getInstance()Lcom/google/android/material/color/ColorResourcesOverride;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 14
    invoke-static {v1}, Lcom/google/android/material/color/MaterialColorUtilitiesHelper;->createColorResourcesIdsToColorValues(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/util/Map;

    move-result-object v0

    .line 15
    invoke-interface {p1, p0, v0}, Lcom/google/android/material/color/ColorResourcesOverride;->wrapContextIfPossible(Landroid/content/Context;Ljava/util/Map;)Landroid/content/Context;

    move-result-object p0

    return-object p0

    .line 16
    :cond_3
    new-instance p1, Landroid/view/ContextThemeWrapper;

    invoke-direct {p1, p0, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    return-object p1
.end method
