.class public final Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u001a<\u0010\u0007\u001a\u00020\u00012\u0010\u0008\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0002\u0008\u0005H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a-\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0013\u0008\u0008\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0002\u0008\u0005H\u0083\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\" \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014\u00b2\u0006\u0017\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0002\u0008\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "onDismissRequest",
        "Landroidx/compose/ui/window/PopupPositionProvider;",
        "popupPositionProvider",
        "Landroidx/compose/runtime/Composable;",
        "content",
        "ExposedDropdownMenuPopup",
        "(Lv3/a;Landroidx/compose/ui/window/PopupPositionProvider;Lv3/p;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "SimpleStack",
        "(Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "",
        "LocalPopupTestTag",
        "Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "getLocalPopupTestTag",
        "()Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "currentContent",
        "material_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,464:1\n74#2:465\n74#2:466\n74#2:467\n74#2:468\n25#3:469\n456#3,8:487\n464#3,6:501\n456#3,8:519\n464#3,6:533\n1116#4,6:470\n79#5,11:476\n92#5:507\n79#5,11:508\n92#5:539\n3737#6,6:495\n3737#6,6:527\n81#7:540\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt\n*L\n85#1:465\n86#1:466\n87#1:467\n88#1:468\n92#1:469\n150#1:487,8\n150#1:501,6\n179#1:519,8\n179#1:533,6\n92#1:470,6\n150#1:476,11\n150#1:507\n179#1:508,11\n179#1:539\n150#1:495,6\n179#1:527,6\n90#1:540\n*E\n"
    }
.end annotation


# static fields
.field private static final LocalPopupTestTag:Landroidx/compose/runtime/ProvidableCompositionLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$LocalPopupTestTag$1;->INSTANCE:Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$LocalPopupTestTag$1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Landroidx/compose/runtime/CompositionLocalKt;->compositionLocalOf$default(Landroidx/compose/runtime/SnapshotMutationPolicy;Lv3/a;ILjava/lang/Object;)Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    sput-object v0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt;->LocalPopupTestTag:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-void
.end method

.method public static final ExposedDropdownMenuPopup(Lv3/a;Landroidx/compose/ui/window/PopupPositionProvider;Lv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .param p0    # Lv3/a;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/window/PopupPositionProvider;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/window/PopupPositionProvider;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v7, p1

    .line 2
    .line 3
    move-object/from16 v8, p2

    .line 4
    .line 5
    move/from16 v9, p4

    .line 6
    .line 7
    const v0, -0x2a30f3ae

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p3

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    and-int/lit8 v1, p5, 0x1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    or-int/lit8 v2, v9, 0x6

    .line 21
    .line 22
    move v3, v2

    .line 23
    move-object/from16 v2, p0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    and-int/lit8 v2, v9, 0xe

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    move-object/from16 v2, p0

    .line 31
    .line 32
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    const/4 v3, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v3, 0x2

    .line 41
    :goto_0
    or-int/2addr v3, v9

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move-object/from16 v2, p0

    .line 44
    .line 45
    move v3, v9

    .line 46
    :goto_1
    and-int/lit8 v4, p5, 0x2

    .line 47
    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    or-int/lit8 v3, v3, 0x30

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    and-int/lit8 v4, v9, 0x70

    .line 54
    .line 55
    if-nez v4, :cond_5

    .line 56
    .line 57
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_4

    .line 62
    .line 63
    const/16 v4, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    const/16 v4, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr v3, v4

    .line 69
    :cond_5
    :goto_3
    and-int/lit8 v4, p5, 0x4

    .line 70
    .line 71
    if-eqz v4, :cond_6

    .line 72
    .line 73
    or-int/lit16 v3, v3, 0x180

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_6
    and-int/lit16 v4, v9, 0x380

    .line 77
    .line 78
    if-nez v4, :cond_8

    .line 79
    .line 80
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_7

    .line 85
    .line 86
    const/16 v4, 0x100

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_7
    const/16 v4, 0x80

    .line 90
    .line 91
    :goto_4
    or-int/2addr v3, v4

    .line 92
    :cond_8
    :goto_5
    move v5, v3

    .line 93
    and-int/lit16 v3, v5, 0x2db

    .line 94
    .line 95
    const/16 v4, 0x92

    .line 96
    .line 97
    if-ne v3, v4, :cond_a

    .line 98
    .line 99
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-nez v3, :cond_9

    .line 104
    .line 105
    goto :goto_6

    .line 106
    :cond_9
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 107
    .line 108
    .line 109
    move-object v1, v2

    .line 110
    move-object v12, v6

    .line 111
    goto/16 :goto_a

    .line 112
    .line 113
    :cond_a
    :goto_6
    if-eqz v1, :cond_b

    .line 114
    .line 115
    const/4 v1, 0x0

    .line 116
    move-object v4, v1

    .line 117
    goto :goto_7

    .line 118
    :cond_b
    move-object v4, v2

    .line 119
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_c

    .line 124
    .line 125
    const/4 v1, -0x1

    .line 126
    const-string v2, "androidx.compose.material.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.android.kt:83)"

    .line 127
    .line 128
    invoke-static {v0, v5, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_c
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalView()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    move-object v3, v0

    .line 140
    check-cast v3, Landroid/view/View;

    .line 141
    .line 142
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    move-object/from16 v17, v0

    .line 151
    .line 152
    check-cast v17, Landroidx/compose/ui/unit/Density;

    .line 153
    .line 154
    sget-object v0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt;->LocalPopupTestTag:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 155
    .line 156
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    move-object v2, v0

    .line 161
    check-cast v2, Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    move-object v1, v0

    .line 172
    check-cast v1, Landroidx/compose/ui/unit/LayoutDirection;

    .line 173
    .line 174
    const/4 v0, 0x0

    .line 175
    invoke-static {v6, v0}, Landroidx/compose/runtime/ComposablesKt;->rememberCompositionContext(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;

    .line 176
    .line 177
    .line 178
    move-result-object v15

    .line 179
    shr-int/lit8 v10, v5, 0x6

    .line 180
    .line 181
    and-int/lit8 v10, v10, 0xe

    .line 182
    .line 183
    invoke-static {v8, v6, v10}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 184
    .line 185
    .line 186
    move-result-object v14

    .line 187
    new-array v10, v0, [Ljava/lang/Object;

    .line 188
    .line 189
    const/4 v11, 0x0

    .line 190
    const/4 v12, 0x0

    .line 191
    sget-object v13, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupId$1;->INSTANCE:Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupId$1;

    .line 192
    .line 193
    const/16 v16, 0xc08

    .line 194
    .line 195
    const/16 v18, 0x6

    .line 196
    .line 197
    move-object/from16 v19, v14

    .line 198
    .line 199
    move-object v14, v6

    .line 200
    move-object/from16 v20, v15

    .line 201
    .line 202
    move/from16 v15, v16

    .line 203
    .line 204
    move/from16 v16, v18

    .line 205
    .line 206
    invoke-static/range {v10 .. v16}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lv3/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    check-cast v10, Ljava/util/UUID;

    .line 211
    .line 212
    const v11, -0x1d58f75c

    .line 213
    .line 214
    .line 215
    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 223
    .line 224
    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    if-ne v11, v12, :cond_d

    .line 229
    .line 230
    new-instance v11, Landroidx/compose/material/internal/PopupLayout;

    .line 231
    .line 232
    move v12, v0

    .line 233
    move-object v0, v11

    .line 234
    move-object v13, v1

    .line 235
    move-object v1, v4

    .line 236
    move-object v14, v2

    .line 237
    move-object v15, v4

    .line 238
    move-object/from16 v4, v17

    .line 239
    .line 240
    move/from16 v16, v5

    .line 241
    .line 242
    move-object/from16 v5, p1

    .line 243
    .line 244
    move-object v12, v6

    .line 245
    move-object v6, v10

    .line 246
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material/internal/PopupLayout;-><init>(Lv3/a;Ljava/lang/String;Landroid/view/View;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/window/PopupPositionProvider;Ljava/util/UUID;)V

    .line 247
    .line 248
    .line 249
    new-instance v0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1;

    .line 250
    .line 251
    move-object/from16 v1, v19

    .line 252
    .line 253
    invoke-direct {v0, v11, v1}, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1;-><init>(Landroidx/compose/material/internal/PopupLayout;Landroidx/compose/runtime/State;)V

    .line 254
    .line 255
    .line 256
    const v1, 0x22935827

    .line 257
    .line 258
    .line 259
    const/4 v2, 0x1

    .line 260
    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    move-object/from16 v1, v20

    .line 265
    .line 266
    invoke-virtual {v11, v1, v0}, Landroidx/compose/material/internal/PopupLayout;->setContent(Landroidx/compose/runtime/CompositionContext;Lv3/p;)V

    .line 267
    .line 268
    .line 269
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_d
    move-object v13, v1

    .line 274
    move-object v14, v2

    .line 275
    move-object v15, v4

    .line 276
    move/from16 v16, v5

    .line 277
    .line 278
    move-object v12, v6

    .line 279
    :goto_8
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 280
    .line 281
    .line 282
    check-cast v11, Landroidx/compose/material/internal/PopupLayout;

    .line 283
    .line 284
    new-instance v0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1;

    .line 285
    .line 286
    invoke-direct {v0, v11, v15, v14, v13}, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1;-><init>(Landroidx/compose/material/internal/PopupLayout;Lv3/a;Ljava/lang/String;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 287
    .line 288
    .line 289
    const/16 v1, 0x8

    .line 290
    .line 291
    invoke-static {v11, v0, v12, v1}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 292
    .line 293
    .line 294
    new-instance v0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2;

    .line 295
    .line 296
    invoke-direct {v0, v11, v15, v14, v13}, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2;-><init>(Landroidx/compose/material/internal/PopupLayout;Lv3/a;Ljava/lang/String;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 297
    .line 298
    .line 299
    const/4 v1, 0x0

    .line 300
    invoke-static {v0, v12, v1}, Landroidx/compose/runtime/EffectsKt;->SideEffect(Lv3/a;Landroidx/compose/runtime/Composer;I)V

    .line 301
    .line 302
    .line 303
    new-instance v0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$3;

    .line 304
    .line 305
    invoke-direct {v0, v11, v7}, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$3;-><init>(Landroidx/compose/material/internal/PopupLayout;Landroidx/compose/ui/window/PopupPositionProvider;)V

    .line 306
    .line 307
    .line 308
    shr-int/lit8 v1, v16, 0x3

    .line 309
    .line 310
    and-int/lit8 v1, v1, 0xe

    .line 311
    .line 312
    invoke-static {v7, v0, v12, v1}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 313
    .line 314
    .line 315
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 316
    .line 317
    new-instance v1, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5;

    .line 318
    .line 319
    invoke-direct {v1, v11}, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5;-><init>(Landroidx/compose/material/internal/PopupLayout;)V

    .line 320
    .line 321
    .line 322
    invoke-static {v0, v1}, Landroidx/compose/ui/layout/OnGloballyPositionedModifierKt;->onGloballyPositioned(Landroidx/compose/ui/Modifier;Lv3/l;)Landroidx/compose/ui/Modifier;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    new-instance v1, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6;

    .line 327
    .line 328
    invoke-direct {v1, v11, v13}, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6;-><init>(Landroidx/compose/material/internal/PopupLayout;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 329
    .line 330
    .line 331
    const v2, -0x4ee9b9da

    .line 332
    .line 333
    .line 334
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 335
    .line 336
    .line 337
    const/4 v2, 0x0

    .line 338
    invoke-static {v12, v2}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    sget-object v4, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 347
    .line 348
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    instance-of v6, v6, Landroidx/compose/runtime/Applier;

    .line 361
    .line 362
    if-nez v6, :cond_e

    .line 363
    .line 364
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 365
    .line 366
    .line 367
    :cond_e
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 368
    .line 369
    .line 370
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 371
    .line 372
    .line 373
    move-result v6

    .line 374
    if-eqz v6, :cond_f

    .line 375
    .line 376
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 377
    .line 378
    .line 379
    goto :goto_9

    .line 380
    :cond_f
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 381
    .line 382
    .line 383
    :goto_9
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    invoke-static {v5, v1, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-static {v5, v2, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    if-nez v2, :cond_10

    .line 410
    .line 411
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-static {v2, v4}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    if-nez v2, :cond_11

    .line 424
    .line 425
    :cond_10
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    invoke-interface {v5, v2, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 437
    .line 438
    .line 439
    :cond_11
    invoke-static {v12}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    const/4 v2, 0x0

    .line 448
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    invoke-interface {v0, v1, v12, v2}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    const v0, 0x7ab4aae9

    .line 456
    .line 457
    .line 458
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 459
    .line 460
    .line 461
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 462
    .line 463
    .line 464
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 465
    .line 466
    .line 467
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 468
    .line 469
    .line 470
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    if-eqz v0, :cond_12

    .line 475
    .line 476
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 477
    .line 478
    .line 479
    :cond_12
    move-object v1, v15

    .line 480
    :goto_a
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 481
    .line 482
    .line 483
    move-result-object v6

    .line 484
    if-eqz v6, :cond_13

    .line 485
    .line 486
    new-instance v10, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$7;

    .line 487
    .line 488
    move-object v0, v10

    .line 489
    move-object/from16 v2, p1

    .line 490
    .line 491
    move-object/from16 v3, p2

    .line 492
    .line 493
    move/from16 v4, p4

    .line 494
    .line 495
    move/from16 v5, p5

    .line 496
    .line 497
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$7;-><init>(Lv3/a;Landroidx/compose/ui/window/PopupPositionProvider;Lv3/p;II)V

    .line 498
    .line 499
    .line 500
    invoke-interface {v6, v10}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 501
    .line 502
    .line 503
    :cond_13
    return-void
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
.end method

.method private static final ExposedDropdownMenuPopup$lambda$0(Landroidx/compose/runtime/State;)Lv3/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;>;)",
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv3/p;

    return-object p0
.end method

.method private static final SimpleStack(Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;I)V
    .locals 6
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    const v0, -0x40b94c71

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1;->INSTANCE:Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1;

    .line 8
    .line 9
    shr-int/lit8 v1, p3, 0x3

    .line 10
    .line 11
    and-int/lit8 v1, v1, 0xe

    .line 12
    .line 13
    shl-int/lit8 p3, p3, 0x3

    .line 14
    .line 15
    and-int/lit8 p3, p3, 0x70

    .line 16
    .line 17
    or-int/2addr p3, v1

    .line 18
    const v1, -0x4ee9b9da

    .line 19
    .line 20
    .line 21
    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {p2, v1}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 34
    .line 35
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-static {p0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    shl-int/lit8 p3, p3, 0x9

    .line 44
    .line 45
    and-int/lit16 p3, p3, 0x1c00

    .line 46
    .line 47
    or-int/lit8 p3, p3, 0x6

    .line 48
    .line 49
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    instance-of v5, v5, Landroidx/compose/runtime/Applier;

    .line 54
    .line 55
    if-nez v5, :cond_0

    .line 56
    .line 57
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 58
    .line 59
    .line 60
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 61
    .line 62
    .line 63
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    invoke-interface {p2, v4}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 74
    .line 75
    .line 76
    :goto_0
    invoke-static {p2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-static {v4, v0, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v4, v2, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_2

    .line 103
    .line 104
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_3

    .line 117
    .line 118
    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-interface {v4, v1, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    invoke-static {p2}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    shr-int/lit8 v1, p3, 0x3

    .line 141
    .line 142
    and-int/lit8 v1, v1, 0x70

    .line 143
    .line 144
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-interface {p0, v0, p2, v1}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    const p0, 0x7ab4aae9

    .line 152
    .line 153
    .line 154
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 155
    .line 156
    .line 157
    shr-int/lit8 p0, p3, 0x9

    .line 158
    .line 159
    and-int/lit8 p0, p0, 0xe

    .line 160
    .line 161
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-interface {p1, p2, p0}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 169
    .line 170
    .line 171
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 172
    .line 173
    .line 174
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 175
    .line 176
    .line 177
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 178
    .line 179
    .line 180
    return-void
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
.end method

.method public static final synthetic access$ExposedDropdownMenuPopup$lambda$0(Landroidx/compose/runtime/State;)Lv3/p;
    .locals 0

    invoke-static {p0}, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt;->ExposedDropdownMenuPopup$lambda$0(Landroidx/compose/runtime/State;)Lv3/p;

    move-result-object p0

    return-object p0
.end method

.method public static final getLocalPopupTestTag()Landroidx/compose/runtime/ProvidableCompositionLocal;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt;->LocalPopupTestTag:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-object v0
.end method
