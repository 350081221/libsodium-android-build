.class public final Landroidx/compose/material3/DatePickerDialog_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u009a\u0001\u0010\u0016\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0002\u0008\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0015\u0008\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00a2\u0006\u0002\u0008\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010\u00a2\u0006\u0002\u0008\u0003\u00a2\u0006\u0002\u0008\u0012H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001b\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001d"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "onDismissRequest",
        "Landroidx/compose/runtime/Composable;",
        "confirmButton",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "dismissButton",
        "Landroidx/compose/ui/graphics/Shape;",
        "shape",
        "Landroidx/compose/ui/unit/Dp;",
        "tonalElevation",
        "Landroidx/compose/material3/DatePickerColors;",
        "colors",
        "Landroidx/compose/ui/window/DialogProperties;",
        "properties",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Lkotlin/u;",
        "content",
        "DatePickerDialog-GmEhDVc",
        "(Lv3/a;Lv3/p;Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/window/DialogProperties;Lv3/q;Landroidx/compose/runtime/Composer;II)V",
        "DatePickerDialog",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "DialogButtonsPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "DialogButtonsMainAxisSpacing",
        "F",
        "DialogButtonsCrossAxisSpacing",
        "material3_release"
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
        "SMAP\nDatePickerDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerDialog.android.kt\nandroidx/compose/material3/DatePickerDialog_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,118:1\n154#2:119\n154#2:120\n154#2:121\n*S KotlinDebug\n*F\n+ 1 DatePickerDialog.android.kt\nandroidx/compose/material3/DatePickerDialog_androidKt\n*L\n115#1:119\n116#1:120\n117#1:121\n*E\n"
    }
.end annotation


# static fields
.field private static final DialogButtonsCrossAxisSpacing:F

.field private static final DialogButtonsMainAxisSpacing:F

.field private static final DialogButtonsPadding:Landroidx/compose/foundation/layout/PaddingValues;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v4

    .line 8
    const/4 v1, 0x6

    .line 9
    int-to-float v1, v1

    .line 10
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4$default(FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sput-object v1, Landroidx/compose/material3/DatePickerDialog_androidKt;->DialogButtonsPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 23
    .line 24
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    sput v0, Landroidx/compose/material3/DatePickerDialog_androidKt;->DialogButtonsMainAxisSpacing:F

    .line 29
    .line 30
    const/16 v0, 0xc

    .line 31
    .line 32
    int-to-float v0, v0

    .line 33
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sput v0, Landroidx/compose/material3/DatePickerDialog_androidKt;->DialogButtonsCrossAxisSpacing:F

    .line 38
    .line 39
    return-void
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
.end method

.method public static final DatePickerDialog-GmEhDVc(Lv3/a;Lv3/p;Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/window/DialogProperties;Lv3/q;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .param p0    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/material3/DatePickerColors;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/ui/window/DialogProperties;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p8    # Lv3/q;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p9    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "F",
            "Landroidx/compose/material3/DatePickerColors;",
            "Landroidx/compose/ui/window/DialogProperties;",
            "Lv3/q<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
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
    move/from16 v10, p10

    .line 2
    .line 3
    move/from16 v11, p11

    .line 4
    .line 5
    const v0, -0x22d35dc

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p9

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v8

    .line 14
    and-int/lit8 v1, v11, 0x1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    or-int/lit8 v1, v10, 0x6

    .line 19
    .line 20
    move-object/from16 v9, p0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v1, v10, 0x6

    .line 24
    .line 25
    move-object/from16 v9, p0

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v1, 0x2

    .line 38
    :goto_0
    or-int/2addr v1, v10

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v1, v10

    .line 41
    :goto_1
    and-int/lit8 v2, v11, 0x2

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    or-int/lit8 v1, v1, 0x30

    .line 46
    .line 47
    move-object/from16 v7, p1

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    and-int/lit8 v2, v10, 0x30

    .line 51
    .line 52
    move-object/from16 v7, p1

    .line 53
    .line 54
    if-nez v2, :cond_5

    .line 55
    .line 56
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    const/16 v2, 0x20

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    const/16 v2, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v1, v2

    .line 68
    :cond_5
    :goto_3
    and-int/lit8 v2, v11, 0x4

    .line 69
    .line 70
    if-eqz v2, :cond_6

    .line 71
    .line 72
    or-int/lit16 v1, v1, 0x180

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_6
    and-int/lit16 v3, v10, 0x180

    .line 76
    .line 77
    if-nez v3, :cond_8

    .line 78
    .line 79
    move-object/from16 v3, p2

    .line 80
    .line 81
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_7

    .line 86
    .line 87
    const/16 v4, 0x100

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_7
    const/16 v4, 0x80

    .line 91
    .line 92
    :goto_4
    or-int/2addr v1, v4

    .line 93
    goto :goto_6

    .line 94
    :cond_8
    :goto_5
    move-object/from16 v3, p2

    .line 95
    .line 96
    :goto_6
    and-int/lit8 v4, v11, 0x8

    .line 97
    .line 98
    if-eqz v4, :cond_9

    .line 99
    .line 100
    or-int/lit16 v1, v1, 0xc00

    .line 101
    .line 102
    goto :goto_8

    .line 103
    :cond_9
    and-int/lit16 v5, v10, 0xc00

    .line 104
    .line 105
    if-nez v5, :cond_b

    .line 106
    .line 107
    move-object/from16 v5, p3

    .line 108
    .line 109
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_a

    .line 114
    .line 115
    const/16 v6, 0x800

    .line 116
    .line 117
    goto :goto_7

    .line 118
    :cond_a
    const/16 v6, 0x400

    .line 119
    .line 120
    :goto_7
    or-int/2addr v1, v6

    .line 121
    goto :goto_9

    .line 122
    :cond_b
    :goto_8
    move-object/from16 v5, p3

    .line 123
    .line 124
    :goto_9
    and-int/lit16 v6, v10, 0x6000

    .line 125
    .line 126
    if-nez v6, :cond_e

    .line 127
    .line 128
    and-int/lit8 v6, v11, 0x10

    .line 129
    .line 130
    if-nez v6, :cond_c

    .line 131
    .line 132
    move-object/from16 v6, p4

    .line 133
    .line 134
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    if-eqz v12, :cond_d

    .line 139
    .line 140
    const/16 v12, 0x4000

    .line 141
    .line 142
    goto :goto_a

    .line 143
    :cond_c
    move-object/from16 v6, p4

    .line 144
    .line 145
    :cond_d
    const/16 v12, 0x2000

    .line 146
    .line 147
    :goto_a
    or-int/2addr v1, v12

    .line 148
    goto :goto_b

    .line 149
    :cond_e
    move-object/from16 v6, p4

    .line 150
    .line 151
    :goto_b
    and-int/lit8 v12, v11, 0x20

    .line 152
    .line 153
    const/high16 v13, 0x30000

    .line 154
    .line 155
    if-eqz v12, :cond_f

    .line 156
    .line 157
    or-int/2addr v1, v13

    .line 158
    goto :goto_d

    .line 159
    :cond_f
    and-int/2addr v13, v10

    .line 160
    if-nez v13, :cond_11

    .line 161
    .line 162
    move/from16 v13, p5

    .line 163
    .line 164
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    if-eqz v14, :cond_10

    .line 169
    .line 170
    const/high16 v14, 0x20000

    .line 171
    .line 172
    goto :goto_c

    .line 173
    :cond_10
    const/high16 v14, 0x10000

    .line 174
    .line 175
    :goto_c
    or-int/2addr v1, v14

    .line 176
    goto :goto_e

    .line 177
    :cond_11
    :goto_d
    move/from16 v13, p5

    .line 178
    .line 179
    :goto_e
    const/high16 v14, 0x180000

    .line 180
    .line 181
    and-int/2addr v14, v10

    .line 182
    if-nez v14, :cond_14

    .line 183
    .line 184
    and-int/lit8 v14, v11, 0x40

    .line 185
    .line 186
    if-nez v14, :cond_12

    .line 187
    .line 188
    move-object/from16 v14, p6

    .line 189
    .line 190
    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v15

    .line 194
    if-eqz v15, :cond_13

    .line 195
    .line 196
    const/high16 v15, 0x100000

    .line 197
    .line 198
    goto :goto_f

    .line 199
    :cond_12
    move-object/from16 v14, p6

    .line 200
    .line 201
    :cond_13
    const/high16 v15, 0x80000

    .line 202
    .line 203
    :goto_f
    or-int/2addr v1, v15

    .line 204
    goto :goto_10

    .line 205
    :cond_14
    move-object/from16 v14, p6

    .line 206
    .line 207
    :goto_10
    and-int/lit16 v15, v11, 0x80

    .line 208
    .line 209
    const/high16 v16, 0xc00000

    .line 210
    .line 211
    if-eqz v15, :cond_15

    .line 212
    .line 213
    or-int v1, v1, v16

    .line 214
    .line 215
    move-object/from16 v0, p7

    .line 216
    .line 217
    goto :goto_12

    .line 218
    :cond_15
    and-int v16, v10, v16

    .line 219
    .line 220
    move-object/from16 v0, p7

    .line 221
    .line 222
    if-nez v16, :cond_17

    .line 223
    .line 224
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v17

    .line 228
    if-eqz v17, :cond_16

    .line 229
    .line 230
    const/high16 v17, 0x800000

    .line 231
    .line 232
    goto :goto_11

    .line 233
    :cond_16
    const/high16 v17, 0x400000

    .line 234
    .line 235
    :goto_11
    or-int v1, v1, v17

    .line 236
    .line 237
    :cond_17
    :goto_12
    and-int/lit16 v0, v11, 0x100

    .line 238
    .line 239
    const/high16 v17, 0x6000000

    .line 240
    .line 241
    if-eqz v0, :cond_18

    .line 242
    .line 243
    or-int v1, v1, v17

    .line 244
    .line 245
    goto :goto_14

    .line 246
    :cond_18
    and-int v0, v10, v17

    .line 247
    .line 248
    if-nez v0, :cond_1a

    .line 249
    .line 250
    move-object/from16 v0, p8

    .line 251
    .line 252
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v17

    .line 256
    if-eqz v17, :cond_19

    .line 257
    .line 258
    const/high16 v17, 0x4000000

    .line 259
    .line 260
    goto :goto_13

    .line 261
    :cond_19
    const/high16 v17, 0x2000000

    .line 262
    .line 263
    :goto_13
    or-int v1, v1, v17

    .line 264
    .line 265
    goto :goto_15

    .line 266
    :cond_1a
    :goto_14
    move-object/from16 v0, p8

    .line 267
    .line 268
    :goto_15
    const v17, 0x2492493

    .line 269
    .line 270
    .line 271
    and-int v0, v1, v17

    .line 272
    .line 273
    const v3, 0x2492492

    .line 274
    .line 275
    .line 276
    if-ne v0, v3, :cond_1c

    .line 277
    .line 278
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-nez v0, :cond_1b

    .line 283
    .line 284
    goto :goto_16

    .line 285
    :cond_1b
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 286
    .line 287
    .line 288
    move-object/from16 v3, p2

    .line 289
    .line 290
    move-object/from16 v23, p7

    .line 291
    .line 292
    move-object v4, v5

    .line 293
    move-object v5, v6

    .line 294
    move v6, v13

    .line 295
    move-object v7, v14

    .line 296
    goto/16 :goto_1b

    .line 297
    .line 298
    :cond_1c
    :goto_16
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 299
    .line 300
    .line 301
    and-int/lit8 v0, v10, 0x1

    .line 302
    .line 303
    const v17, -0xe001

    .line 304
    .line 305
    .line 306
    const/4 v3, 0x0

    .line 307
    if-eqz v0, :cond_21

    .line 308
    .line 309
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-eqz v0, :cond_1d

    .line 314
    .line 315
    goto :goto_18

    .line 316
    :cond_1d
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 317
    .line 318
    .line 319
    and-int/lit8 v0, v11, 0x10

    .line 320
    .line 321
    if-eqz v0, :cond_1e

    .line 322
    .line 323
    and-int v1, v1, v17

    .line 324
    .line 325
    :cond_1e
    and-int/lit8 v0, v11, 0x40

    .line 326
    .line 327
    if-eqz v0, :cond_1f

    .line 328
    .line 329
    const v0, -0x380001

    .line 330
    .line 331
    .line 332
    and-int/2addr v1, v0

    .line 333
    :cond_1f
    move-object/from16 v0, p2

    .line 334
    .line 335
    :cond_20
    move-object/from16 v23, p7

    .line 336
    .line 337
    :goto_17
    move-object/from16 v19, v5

    .line 338
    .line 339
    move-object/from16 v20, v6

    .line 340
    .line 341
    move/from16 v21, v13

    .line 342
    .line 343
    move-object/from16 v22, v14

    .line 344
    .line 345
    goto :goto_1a

    .line 346
    :cond_21
    :goto_18
    if-eqz v2, :cond_22

    .line 347
    .line 348
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 349
    .line 350
    goto :goto_19

    .line 351
    :cond_22
    move-object/from16 v0, p2

    .line 352
    .line 353
    :goto_19
    if-eqz v4, :cond_23

    .line 354
    .line 355
    move-object v5, v3

    .line 356
    :cond_23
    and-int/lit8 v2, v11, 0x10

    .line 357
    .line 358
    const/4 v4, 0x6

    .line 359
    if-eqz v2, :cond_24

    .line 360
    .line 361
    sget-object v2, Landroidx/compose/material3/DatePickerDefaults;->INSTANCE:Landroidx/compose/material3/DatePickerDefaults;

    .line 362
    .line 363
    invoke-virtual {v2, v8, v4}, Landroidx/compose/material3/DatePickerDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    and-int v1, v1, v17

    .line 368
    .line 369
    move-object v6, v2

    .line 370
    :cond_24
    if-eqz v12, :cond_25

    .line 371
    .line 372
    sget-object v2, Landroidx/compose/material3/DatePickerDefaults;->INSTANCE:Landroidx/compose/material3/DatePickerDefaults;

    .line 373
    .line 374
    invoke-virtual {v2}, Landroidx/compose/material3/DatePickerDefaults;->getTonalElevation-D9Ej5fM()F

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    move v13, v2

    .line 379
    :cond_25
    and-int/lit8 v2, v11, 0x40

    .line 380
    .line 381
    if-eqz v2, :cond_26

    .line 382
    .line 383
    sget-object v2, Landroidx/compose/material3/DatePickerDefaults;->INSTANCE:Landroidx/compose/material3/DatePickerDefaults;

    .line 384
    .line 385
    invoke-virtual {v2, v8, v4}, Landroidx/compose/material3/DatePickerDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    const v4, -0x380001

    .line 390
    .line 391
    .line 392
    and-int/2addr v1, v4

    .line 393
    move-object v14, v2

    .line 394
    :cond_26
    if-eqz v15, :cond_20

    .line 395
    .line 396
    new-instance v2, Landroidx/compose/ui/window/DialogProperties;

    .line 397
    .line 398
    const/16 v18, 0x0

    .line 399
    .line 400
    const/16 v19, 0x0

    .line 401
    .line 402
    const/16 v20, 0x0

    .line 403
    .line 404
    const/16 v21, 0x0

    .line 405
    .line 406
    const/16 v22, 0x0

    .line 407
    .line 408
    const/16 v23, 0x17

    .line 409
    .line 410
    const/16 v24, 0x0

    .line 411
    .line 412
    move-object/from16 v17, v2

    .line 413
    .line 414
    invoke-direct/range {v17 .. v24}, Landroidx/compose/ui/window/DialogProperties;-><init>(ZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZILkotlin/jvm/internal/w;)V

    .line 415
    .line 416
    .line 417
    move-object/from16 v23, v2

    .line 418
    .line 419
    goto :goto_17

    .line 420
    :goto_1a
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 421
    .line 422
    .line 423
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    if-eqz v2, :cond_27

    .line 428
    .line 429
    const/4 v2, -0x1

    .line 430
    const-string v4, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:73)"

    .line 431
    .line 432
    const v5, -0x22d35dc

    .line 433
    .line 434
    .line 435
    invoke-static {v5, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 436
    .line 437
    .line 438
    :cond_27
    const/4 v2, 0x0

    .line 439
    const/4 v4, 0x3

    .line 440
    invoke-static {v0, v3, v2, v4, v3}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentHeight$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    new-instance v3, Landroidx/compose/material3/DatePickerDialog_androidKt$DatePickerDialog$1;

    .line 445
    .line 446
    move-object v12, v3

    .line 447
    move-object/from16 v13, v20

    .line 448
    .line 449
    move-object/from16 v14, v22

    .line 450
    .line 451
    move/from16 v15, v21

    .line 452
    .line 453
    move-object/from16 v16, p8

    .line 454
    .line 455
    move-object/from16 v17, v19

    .line 456
    .line 457
    move-object/from16 v18, p1

    .line 458
    .line 459
    invoke-direct/range {v12 .. v18}, Landroidx/compose/material3/DatePickerDialog_androidKt$DatePickerDialog$1;-><init>(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/DatePickerColors;FLv3/q;Lv3/p;Lv3/p;)V

    .line 460
    .line 461
    .line 462
    const v4, -0xa22256

    .line 463
    .line 464
    .line 465
    const/4 v5, 0x1

    .line 466
    invoke-static {v8, v4, v5, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    and-int/lit8 v3, v1, 0xe

    .line 471
    .line 472
    or-int/lit16 v3, v3, 0xc00

    .line 473
    .line 474
    shr-int/lit8 v1, v1, 0xf

    .line 475
    .line 476
    and-int/lit16 v1, v1, 0x380

    .line 477
    .line 478
    or-int v6, v3, v1

    .line 479
    .line 480
    const/4 v12, 0x0

    .line 481
    move-object/from16 v1, p0

    .line 482
    .line 483
    move-object/from16 v3, v23

    .line 484
    .line 485
    move-object v5, v8

    .line 486
    move v7, v12

    .line 487
    invoke-static/range {v1 .. v7}, Landroidx/compose/material3/AndroidAlertDialog_androidKt;->BasicAlertDialog(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/window/DialogProperties;Lv3/p;Landroidx/compose/runtime/Composer;II)V

    .line 488
    .line 489
    .line 490
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    if-eqz v1, :cond_28

    .line 495
    .line 496
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 497
    .line 498
    .line 499
    :cond_28
    move-object v3, v0

    .line 500
    move-object/from16 v4, v19

    .line 501
    .line 502
    move-object/from16 v5, v20

    .line 503
    .line 504
    move/from16 v6, v21

    .line 505
    .line 506
    move-object/from16 v7, v22

    .line 507
    .line 508
    :goto_1b
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 509
    .line 510
    .line 511
    move-result-object v12

    .line 512
    if-eqz v12, :cond_29

    .line 513
    .line 514
    new-instance v13, Landroidx/compose/material3/DatePickerDialog_androidKt$DatePickerDialog$2;

    .line 515
    .line 516
    move-object v0, v13

    .line 517
    move-object/from16 v1, p0

    .line 518
    .line 519
    move-object/from16 v2, p1

    .line 520
    .line 521
    move-object/from16 v8, v23

    .line 522
    .line 523
    move-object/from16 v9, p8

    .line 524
    .line 525
    move/from16 v10, p10

    .line 526
    .line 527
    move/from16 v11, p11

    .line 528
    .line 529
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/DatePickerDialog_androidKt$DatePickerDialog$2;-><init>(Lv3/a;Lv3/p;Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/window/DialogProperties;Lv3/q;II)V

    .line 530
    .line 531
    .line 532
    invoke-interface {v12, v13}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 533
    .line 534
    .line 535
    :cond_29
    return-void
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
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
.end method

.method public static final synthetic access$getDialogButtonsCrossAxisSpacing$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/DatePickerDialog_androidKt;->DialogButtonsCrossAxisSpacing:F

    return v0
.end method

.method public static final synthetic access$getDialogButtonsMainAxisSpacing$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/DatePickerDialog_androidKt;->DialogButtonsMainAxisSpacing:F

    return v0
.end method

.method public static final synthetic access$getDialogButtonsPadding$p()Landroidx/compose/foundation/layout/PaddingValues;
    .locals 1

    sget-object v0, Landroidx/compose/material3/DatePickerDialog_androidKt;->DialogButtonsPadding:Landroidx/compose/foundation/layout/PaddingValues;

    return-object v0
.end method
