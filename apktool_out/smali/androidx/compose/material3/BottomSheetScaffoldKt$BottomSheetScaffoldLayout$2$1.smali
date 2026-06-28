.class final Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/BottomSheetScaffoldKt;->BottomSheetScaffoldLayout-PxNyym8(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/q;Lv3/q;Lv3/p;FLv3/a;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
        "Landroidx/compose/ui/unit/Constraints;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "invoke-0kLqBqw",
        "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $body:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $bottomSheet:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Ljava/lang/Integer;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $containerColor:J

.field final synthetic $contentColor:J

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $sheetOffset:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $sheetPeekHeight:F

.field final synthetic $sheetState:Landroidx/compose/material3/SheetState;

.field final synthetic $snackbarHost:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $topBar:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lv3/p;Lv3/p;Lv3/q;Landroidx/compose/ui/Modifier;JJLv3/q;FLv3/a;Landroidx/compose/material3/SheetState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/q<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "JJ",
            "Lv3/q<",
            "-",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;F",
            "Lv3/a<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/material3/SheetState;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$topBar:Lv3/p;

    iput-object p2, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$snackbarHost:Lv3/p;

    iput-object p3, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$bottomSheet:Lv3/q;

    iput-object p4, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$modifier:Landroidx/compose/ui/Modifier;

    iput-wide p5, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$containerColor:J

    iput-wide p7, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$contentColor:J

    iput-object p9, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$body:Lv3/q;

    iput p10, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$sheetPeekHeight:F

    iput-object p11, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$sheetOffset:Lv3/a;

    iput-object p12, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$sheetState:Landroidx/compose/material3/SheetState;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    check-cast p2, Landroidx/compose/ui/unit/Constraints;

    invoke-virtual {p2}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->invoke-0kLqBqw(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-0kLqBqw(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 26
    .param p1    # Landroidx/compose/ui/layout/SubcomposeMeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 6
    .line 7
    .line 8
    move-result v12

    .line 9
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 10
    .line 11
    .line 12
    move-result v13

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x0

    .line 17
    const/16 v8, 0xa

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    move-wide/from16 v2, p2

    .line 21
    .line 22
    invoke-static/range {v2 .. v9}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    sget-object v4, Landroidx/compose/material3/BottomSheetScaffoldLayoutSlot;->Sheet:Landroidx/compose/material3/BottomSheetScaffoldLayoutSlot;

    .line 27
    .line 28
    new-instance v5, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$sheetPlaceable$1;

    .line 29
    .line 30
    iget-object v6, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$bottomSheet:Lv3/q;

    .line 31
    .line 32
    invoke-direct {v5, v6, v13}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$sheetPlaceable$1;-><init>(Lv3/q;I)V

    .line 33
    .line 34
    .line 35
    const v6, -0x470d37f4

    .line 36
    .line 37
    .line 38
    const/4 v7, 0x1

    .line 39
    invoke-static {v6, v7, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-interface {v1, v4, v5}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->subcompose(Ljava/lang/Object;Lv3/p;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Landroidx/compose/ui/layout/Measurable;

    .line 53
    .line 54
    invoke-interface {v4, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    iget-object v4, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$topBar:Lv3/p;

    .line 59
    .line 60
    if-eqz v4, :cond_0

    .line 61
    .line 62
    sget-object v8, Landroidx/compose/material3/BottomSheetScaffoldLayoutSlot;->TopBar:Landroidx/compose/material3/BottomSheetScaffoldLayoutSlot;

    .line 63
    .line 64
    new-instance v9, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$topBarPlaceable$1$1;

    .line 65
    .line 66
    invoke-direct {v9, v4}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$topBarPlaceable$1$1;-><init>(Lv3/p;)V

    .line 67
    .line 68
    .line 69
    const v4, -0x340c053d    # -3.1978886E7f

    .line 70
    .line 71
    .line 72
    invoke-static {v4, v7, v9}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-interface {v1, v8, v4}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->subcompose(Ljava/lang/Object;Lv3/p;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Landroidx/compose/ui/layout/Measurable;

    .line 85
    .line 86
    invoke-interface {v4, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    goto :goto_0

    .line 91
    :cond_0
    const/4 v4, 0x0

    .line 92
    :goto_0
    move-object v11, v4

    .line 93
    if-eqz v11, :cond_1

    .line 94
    .line 95
    invoke-virtual {v11}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    move v10, v4

    .line 100
    goto :goto_1

    .line 101
    :cond_1
    move v10, v5

    .line 102
    :goto_1
    const/16 v16, 0x0

    .line 103
    .line 104
    const/16 v17, 0x0

    .line 105
    .line 106
    const/16 v18, 0x0

    .line 107
    .line 108
    sub-int v19, v13, v10

    .line 109
    .line 110
    const/16 v20, 0x7

    .line 111
    .line 112
    const/16 v21, 0x0

    .line 113
    .line 114
    move-wide v14, v2

    .line 115
    invoke-static/range {v14 .. v21}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 116
    .line 117
    .line 118
    move-result-wide v8

    .line 119
    sget-object v4, Landroidx/compose/material3/BottomSheetScaffoldLayoutSlot;->Body:Landroidx/compose/material3/BottomSheetScaffoldLayoutSlot;

    .line 120
    .line 121
    new-instance v15, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$bodyPlaceable$1;

    .line 122
    .line 123
    iget-object v14, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$modifier:Landroidx/compose/ui/Modifier;

    .line 124
    .line 125
    move-object/from16 p3, v6

    .line 126
    .line 127
    iget-wide v5, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$containerColor:J

    .line 128
    .line 129
    move-wide/from16 v22, v8

    .line 130
    .line 131
    iget-wide v7, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$contentColor:J

    .line 132
    .line 133
    iget-object v9, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$body:Lv3/q;

    .line 134
    .line 135
    move-object/from16 v24, v11

    .line 136
    .line 137
    iget v11, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$sheetPeekHeight:F

    .line 138
    .line 139
    move-object/from16 v16, v14

    .line 140
    .line 141
    move-object v14, v15

    .line 142
    move/from16 v25, v10

    .line 143
    .line 144
    move-object v10, v15

    .line 145
    move-object/from16 v15, v16

    .line 146
    .line 147
    move-wide/from16 v16, v5

    .line 148
    .line 149
    move-wide/from16 v18, v7

    .line 150
    .line 151
    move-object/from16 v20, v9

    .line 152
    .line 153
    move/from16 v21, v11

    .line 154
    .line 155
    invoke-direct/range {v14 .. v21}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$bodyPlaceable$1;-><init>(Landroidx/compose/ui/Modifier;JJLv3/q;F)V

    .line 156
    .line 157
    .line 158
    const v5, -0x56f9f05f

    .line 159
    .line 160
    .line 161
    const/4 v6, 0x1

    .line 162
    invoke-static {v5, v6, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-interface {v1, v4, v5}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->subcompose(Ljava/lang/Object;Lv3/p;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    const/4 v5, 0x0

    .line 171
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    check-cast v4, Landroidx/compose/ui/layout/Measurable;

    .line 176
    .line 177
    move-wide/from16 v6, v22

    .line 178
    .line 179
    invoke-interface {v4, v6, v7}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    sget-object v4, Landroidx/compose/material3/BottomSheetScaffoldLayoutSlot;->Snackbar:Landroidx/compose/material3/BottomSheetScaffoldLayoutSlot;

    .line 184
    .line 185
    iget-object v6, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$snackbarHost:Lv3/p;

    .line 186
    .line 187
    invoke-interface {v1, v4, v6}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->subcompose(Ljava/lang/Object;Lv3/p;)Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    check-cast v4, Landroidx/compose/ui/layout/Measurable;

    .line 196
    .line 197
    invoke-interface {v4, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    const/4 v14, 0x0

    .line 202
    new-instance v15, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;

    .line 203
    .line 204
    iget-object v3, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$sheetOffset:Lv3/a;

    .line 205
    .line 206
    iget-object v7, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$sheetState:Landroidx/compose/material3/SheetState;

    .line 207
    .line 208
    move-object v2, v15

    .line 209
    move v4, v12

    .line 210
    move-object/from16 v5, p3

    .line 211
    .line 212
    move v8, v13

    .line 213
    move/from16 v10, v25

    .line 214
    .line 215
    move-object/from16 v11, v24

    .line 216
    .line 217
    invoke-direct/range {v2 .. v11}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;-><init>(Lv3/a;ILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/material3/SheetState;ILandroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/layout/Placeable;)V

    .line 218
    .line 219
    .line 220
    const/4 v6, 0x4

    .line 221
    const/4 v7, 0x0

    .line 222
    move-object/from16 v1, p1

    .line 223
    .line 224
    move v2, v12

    .line 225
    move v3, v13

    .line 226
    move-object v4, v14

    .line 227
    move-object v5, v15

    .line 228
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lv3/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    return-object v1
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
.end method
