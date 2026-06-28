.class final Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0018\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0008H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;",
        "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;",
        "()V",
        "create",
        "Landroid/text/StaticLayout;",
        "params",
        "Landroidx/compose/ui/text/android/StaticLayoutParams;",
        "isFallbackLineSpacingEnabled",
        "",
        "layout",
        "useFallbackLineSpacing",
        "Companion",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static isInitialized:Z

.field private static staticLayoutConstructor:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Landroid/text/StaticLayout;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;->Companion:Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getStaticLayoutConstructor$cp()Ljava/lang/reflect/Constructor;
    .locals 1

    sget-object v0, Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;->staticLayoutConstructor:Ljava/lang/reflect/Constructor;

    return-object v0
.end method

.method public static final synthetic access$isInitialized$cp()Z
    .locals 1

    sget-boolean v0, Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;->isInitialized:Z

    return v0
.end method

.method public static final synthetic access$setInitialized$cp(Z)V
    .locals 0

    sput-boolean p0, Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;->isInitialized:Z

    return-void
.end method

.method public static final synthetic access$setStaticLayoutConstructor$cp(Ljava/lang/reflect/Constructor;)V
    .locals 0

    sput-object p0, Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;->staticLayoutConstructor:Ljava/lang/reflect/Constructor;

    return-void
.end method


# virtual methods
.method public create(Landroidx/compose/ui/text/android/StaticLayoutParams;)Landroid/text/StaticLayout;
    .locals 16
    .param p1    # Landroidx/compose/ui/text/android/StaticLayoutParams;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string/jumbo v0, "unable to call constructor"

    .line 2
    .line 3
    .line 4
    const-string v1, "StaticLayoutFactory"

    .line 5
    .line 6
    sget-object v2, Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;->Companion:Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion;

    .line 7
    .line 8
    invoke-static {v2}, Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion;->access$getStaticLayoutConstructor(Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion;)Ljava/lang/reflect/Constructor;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const/16 v4, 0xd

    .line 16
    .line 17
    :try_start_0
    new-array v4, v4, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getText()Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    const/4 v6, 0x0

    .line 24
    aput-object v5, v4, v6

    .line 25
    .line 26
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getStart()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    const/4 v6, 0x1

    .line 35
    aput-object v5, v4, v6

    .line 36
    .line 37
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getEnd()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const/4 v6, 0x2

    .line 46
    aput-object v5, v4, v6

    .line 47
    .line 48
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getPaint()Landroid/text/TextPaint;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const/4 v6, 0x3

    .line 53
    aput-object v5, v4, v6

    .line 54
    .line 55
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getWidth()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    const/4 v6, 0x4

    .line 64
    aput-object v5, v4, v6

    .line 65
    .line 66
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getAlignment()Landroid/text/Layout$Alignment;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    const/4 v6, 0x5

    .line 71
    aput-object v5, v4, v6

    .line 72
    .line 73
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getTextDir()Landroid/text/TextDirectionHeuristic;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    const/4 v6, 0x6

    .line 78
    aput-object v5, v4, v6

    .line 79
    .line 80
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getLineSpacingMultiplier()F

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    const/4 v6, 0x7

    .line 89
    aput-object v5, v4, v6

    .line 90
    .line 91
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getLineSpacingExtra()F

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    const/16 v6, 0x8

    .line 100
    .line 101
    aput-object v5, v4, v6

    .line 102
    .line 103
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getIncludePadding()Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    const/16 v6, 0x9

    .line 112
    .line 113
    aput-object v5, v4, v6

    .line 114
    .line 115
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getEllipsize()Landroid/text/TextUtils$TruncateAt;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    const/16 v6, 0xa

    .line 120
    .line 121
    aput-object v5, v4, v6

    .line 122
    .line 123
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getEllipsizedWidth()I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    const/16 v6, 0xb

    .line 132
    .line 133
    aput-object v5, v4, v6

    .line 134
    .line 135
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getMaxLines()I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    const/16 v6, 0xc

    .line 144
    .line 145
    aput-object v5, v4, v6

    .line 146
    .line 147
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, Landroid/text/StaticLayout;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    .line 153
    move-object v3, v2

    .line 154
    goto :goto_0

    .line 155
    :catch_0
    sput-object v3, Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;->staticLayoutConstructor:Ljava/lang/reflect/Constructor;

    .line 156
    .line 157
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :catch_1
    sput-object v3, Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;->staticLayoutConstructor:Ljava/lang/reflect/Constructor;

    .line 162
    .line 163
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    goto :goto_0

    .line 167
    :catch_2
    sput-object v3, Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;->staticLayoutConstructor:Ljava/lang/reflect/Constructor;

    .line 168
    .line 169
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 170
    .line 171
    .line 172
    :cond_0
    :goto_0
    if-eqz v3, :cond_1

    .line 173
    .line 174
    return-object v3

    .line 175
    :cond_1
    new-instance v0, Landroid/text/StaticLayout;

    .line 176
    .line 177
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getText()Ljava/lang/CharSequence;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getStart()I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getEnd()I

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getPaint()Landroid/text/TextPaint;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getWidth()I

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getAlignment()Landroid/text/Layout$Alignment;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getLineSpacingMultiplier()F

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getLineSpacingExtra()F

    .line 206
    .line 207
    .line 208
    move-result v12

    .line 209
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getIncludePadding()Z

    .line 210
    .line 211
    .line 212
    move-result v13

    .line 213
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getEllipsize()Landroid/text/TextUtils$TruncateAt;

    .line 214
    .line 215
    .line 216
    move-result-object v14

    .line 217
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getEllipsizedWidth()I

    .line 218
    .line 219
    .line 220
    move-result v15

    .line 221
    move-object v4, v0

    .line 222
    invoke-direct/range {v4 .. v15}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZLandroid/text/TextUtils$TruncateAt;I)V

    .line 223
    .line 224
    .line 225
    return-object v0
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
.end method

.method public isFallbackLineSpacingEnabled(Landroid/text/StaticLayout;Z)Z
    .locals 0
    .param p1    # Landroid/text/StaticLayout;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method
