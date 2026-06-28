.class public final Landroidx/compose/ui/platform/ViewLayer$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/ViewLayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR$\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R*\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b8\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u000e\u001a\u0004\u0008\u0012\u0010\u0010\"\u0004\u0008\u0013\u0010\u0014R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006!"
    }
    d2 = {
        "Landroidx/compose/ui/platform/ViewLayer$Companion;",
        "",
        "Landroid/view/View;",
        "view",
        "Lkotlin/r2;",
        "updateDisplayList",
        "Landroid/view/ViewOutlineProvider;",
        "OutlineProvider",
        "Landroid/view/ViewOutlineProvider;",
        "getOutlineProvider",
        "()Landroid/view/ViewOutlineProvider;",
        "",
        "<set-?>",
        "hasRetrievedMethod",
        "Z",
        "getHasRetrievedMethod",
        "()Z",
        "shouldUseDispatchDraw",
        "getShouldUseDispatchDraw",
        "setShouldUseDispatchDraw$ui_release",
        "(Z)V",
        "Lkotlin/Function2;",
        "Landroid/graphics/Matrix;",
        "getMatrix",
        "Lv3/p;",
        "Ljava/lang/reflect/Field;",
        "recreateDisplayList",
        "Ljava/lang/reflect/Field;",
        "Ljava/lang/reflect/Method;",
        "updateDisplayListIfDirtyMethod",
        "Ljava/lang/reflect/Method;",
        "<init>",
        "()V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,505:1\n26#2:506\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n*L\n460#1:506\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/ViewLayer$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getHasRetrievedMethod()Z
    .locals 1

    invoke-static {}, Landroidx/compose/ui/platform/ViewLayer;->access$getHasRetrievedMethod$cp()Z

    move-result v0

    return v0
.end method

.method public final getOutlineProvider()Landroid/view/ViewOutlineProvider;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Landroidx/compose/ui/platform/ViewLayer;->access$getOutlineProvider$cp()Landroid/view/ViewOutlineProvider;

    move-result-object v0

    return-object v0
.end method

.method public final getShouldUseDispatchDraw()Z
    .locals 1

    invoke-static {}, Landroidx/compose/ui/platform/ViewLayer;->access$getShouldUseDispatchDraw$cp()Z

    move-result v0

    return v0
.end method

.method public final setShouldUseDispatchDraw$ui_release(Z)V
    .locals 0

    invoke-static {p1}, Landroidx/compose/ui/platform/ViewLayer;->access$setShouldUseDispatchDraw$cp(Z)V

    return-void
.end method

.method public final updateDisplayList(Landroid/view/View;)V
    .locals 11
    .param p1    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BanUncheckedReflection"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Class;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/ViewLayer$Companion;->getHasRetrievedMethod()Z

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    const/4 v4, 0x0

    .line 11
    if-nez v3, :cond_3

    .line 12
    .line 13
    invoke-static {v2}, Landroidx/compose/ui/platform/ViewLayer;->access$setHasRetrievedMethod$cp(Z)V

    .line 14
    .line 15
    .line 16
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    const/16 v5, 0x1c

    .line 19
    .line 20
    const-string v6, "mRecreateDisplayList"

    .line 21
    .line 22
    const-string/jumbo v7, "updateDisplayListIfDirty"

    .line 23
    .line 24
    .line 25
    const-class v8, Landroid/view/View;

    .line 26
    .line 27
    if-ge v3, v5, :cond_0

    .line 28
    .line 29
    :try_start_1
    new-array v0, v4, [Ljava/lang/Class;

    .line 30
    .line 31
    invoke-virtual {v8, v7, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Landroidx/compose/ui/platform/ViewLayer;->access$setUpdateDisplayListIfDirtyMethod$cp(Ljava/lang/reflect/Method;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v8, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Landroidx/compose/ui/platform/ViewLayer;->access$setRecreateDisplayList$cp(Ljava/lang/reflect/Field;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string v3, "getDeclaredMethod"

    .line 47
    .line 48
    const/4 v5, 0x2

    .line 49
    new-array v9, v5, [Ljava/lang/Class;

    .line 50
    .line 51
    aput-object v0, v9, v4

    .line 52
    .line 53
    new-array v10, v4, [Ljava/lang/Class;

    .line 54
    .line 55
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    aput-object v10, v9, v2

    .line 60
    .line 61
    invoke-virtual {v1, v3, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    new-array v5, v5, [Ljava/lang/Object;

    .line 66
    .line 67
    aput-object v7, v5, v4

    .line 68
    .line 69
    new-array v7, v4, [Ljava/lang/Class;

    .line 70
    .line 71
    aput-object v7, v5, v2

    .line 72
    .line 73
    invoke-virtual {v3, v8, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Ljava/lang/reflect/Method;

    .line 78
    .line 79
    invoke-static {v3}, Landroidx/compose/ui/platform/ViewLayer;->access$setUpdateDisplayListIfDirtyMethod$cp(Ljava/lang/reflect/Method;)V

    .line 80
    .line 81
    .line 82
    const-string v3, "getDeclaredField"

    .line 83
    .line 84
    new-array v5, v2, [Ljava/lang/Class;

    .line 85
    .line 86
    aput-object v0, v5, v4

    .line 87
    .line 88
    invoke-virtual {v1, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    new-array v1, v2, [Ljava/lang/Object;

    .line 93
    .line 94
    aput-object v6, v1, v4

    .line 95
    .line 96
    invoke-virtual {v0, v8, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Ljava/lang/reflect/Field;

    .line 101
    .line 102
    invoke-static {v0}, Landroidx/compose/ui/platform/ViewLayer;->access$setRecreateDisplayList$cp(Ljava/lang/reflect/Field;)V

    .line 103
    .line 104
    .line 105
    :goto_0
    invoke-static {}, Landroidx/compose/ui/platform/ViewLayer;->access$getUpdateDisplayListIfDirtyMethod$cp()Ljava/lang/reflect/Method;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-nez v0, :cond_1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 113
    .line 114
    .line 115
    :goto_1
    invoke-static {}, Landroidx/compose/ui/platform/ViewLayer;->access$getRecreateDisplayList$cp()Ljava/lang/reflect/Field;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-nez v0, :cond_2

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 123
    .line 124
    .line 125
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/ui/platform/ViewLayer;->access$getRecreateDisplayList$cp()Ljava/lang/reflect/Field;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-eqz v0, :cond_4

    .line 130
    .line 131
    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    .line 132
    .line 133
    .line 134
    :cond_4
    invoke-static {}, Landroidx/compose/ui/platform/ViewLayer;->access$getUpdateDisplayListIfDirtyMethod$cp()Ljava/lang/reflect/Method;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    new-array v1, v4, [Ljava/lang/Object;

    .line 141
    .line 142
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :catchall_0
    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/ViewLayer$Companion;->setShouldUseDispatchDraw$ui_release(Z)V

    .line 147
    .line 148
    .line 149
    :cond_5
    :goto_3
    return-void
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
.end method
