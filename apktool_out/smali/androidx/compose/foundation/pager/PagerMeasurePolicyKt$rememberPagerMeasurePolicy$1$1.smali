.class final Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/pager/PagerMeasurePolicyKt;->rememberPagerMeasurePolicy-121YqSk(Lv3/a;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;Lv3/a;Landroidx/compose/runtime/Composer;II)Lv3/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "Landroidx/compose/ui/unit/Constraints;",
        "Landroidx/compose/foundation/pager/PagerMeasureResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/foundation/pager/PagerMeasureResult;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "containerConstraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "invoke-0kLqBqw",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/pager/PagerMeasureResult;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,221:1\n1#2:222\n495#3,4:223\n500#3:232\n129#4,5:227\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n*L\n149#1:223,4\n149#1:232\n149#1:227,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $beyondBoundsPageCount:I

.field final synthetic $contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field final synthetic $horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

.field final synthetic $itemProviderLambda:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $orientation:Landroidx/compose/foundation/gestures/Orientation;

.field final synthetic $pageCount:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $pageSize:Landroidx/compose/foundation/pager/PageSize;

.field final synthetic $pageSpacing:F

.field final synthetic $reverseLayout:Z

.field final synthetic $snapPositionInLayout:Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;

.field final synthetic $state:Landroidx/compose/foundation/pager/PagerState;

.field final synthetic $verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/pager/PagerState;FLandroidx/compose/foundation/pager/PageSize;Lv3/a;Lv3/a;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILandroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Z",
            "Landroidx/compose/foundation/pager/PagerState;",
            "F",
            "Landroidx/compose/foundation/pager/PageSize;",
            "Lv3/a<",
            "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;",
            ">;",
            "Lv3/a<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "I",
            "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    iput-object p2, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    iput-boolean p3, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$reverseLayout:Z

    iput-object p4, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    iput p5, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$pageSpacing:F

    iput-object p6, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$pageSize:Landroidx/compose/foundation/pager/PageSize;

    iput-object p7, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$itemProviderLambda:Lv3/a;

    iput-object p8, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$pageCount:Lv3/a;

    iput-object p9, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

    iput-object p10, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    iput p11, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$beyondBoundsPageCount:I

    iput-object p12, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$snapPositionInLayout:Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;

    check-cast p2, Landroidx/compose/ui/unit/Constraints;

    invoke-virtual {p2}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->invoke-0kLqBqw(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/pager/PagerMeasureResult;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-0kLqBqw(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/pager/PagerMeasureResult;
    .locals 32
    .param p1    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v4, p2

    .line 6
    .line 7
    iget-object v2, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 8
    .line 9
    sget-object v3, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 10
    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-eqz v2, :cond_1

    .line 17
    .line 18
    move-object v6, v3

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    sget-object v6, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 21
    .line 22
    :goto_1
    invoke-static {v4, v5, v6}, Landroidx/compose/foundation/CheckScrollableContainerConstraintsKt;->checkScrollableContainerConstraints-K40F9xA(JLandroidx/compose/foundation/gestures/Orientation;)V

    .line 23
    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    iget-object v6, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 28
    .line 29
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    invoke-interface {v6, v7}, Landroidx/compose/foundation/layout/PaddingValues;->calculateLeftPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    invoke-interface {v0, v6}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    iget-object v6, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 43
    .line 44
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/PaddingKt;->calculateStartPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-interface {v0, v6}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    :goto_2
    if-eqz v2, :cond_3

    .line 57
    .line 58
    iget-object v7, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 59
    .line 60
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-interface {v7, v8}, Landroidx/compose/foundation/layout/PaddingValues;->calculateRightPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    invoke-interface {v0, v7}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    goto :goto_3

    .line 73
    :cond_3
    iget-object v7, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 74
    .line 75
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/PaddingKt;->calculateEndPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    invoke-interface {v0, v7}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    :goto_3
    iget-object v8, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 88
    .line 89
    invoke-interface {v8}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    invoke-interface {v0, v8}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    iget-object v9, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 98
    .line 99
    invoke-interface {v9}, Landroidx/compose/foundation/layout/PaddingValues;->calculateBottomPadding-D9Ej5fM()F

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    invoke-interface {v0, v9}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    add-int v10, v8, v9

    .line 108
    .line 109
    add-int v11, v6, v7

    .line 110
    .line 111
    if-eqz v2, :cond_4

    .line 112
    .line 113
    move v12, v10

    .line 114
    goto :goto_4

    .line 115
    :cond_4
    move v12, v11

    .line 116
    :goto_4
    if-eqz v2, :cond_5

    .line 117
    .line 118
    iget-boolean v13, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$reverseLayout:Z

    .line 119
    .line 120
    if-nez v13, :cond_5

    .line 121
    .line 122
    move v13, v8

    .line 123
    goto :goto_5

    .line 124
    :cond_5
    if-eqz v2, :cond_6

    .line 125
    .line 126
    iget-boolean v13, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$reverseLayout:Z

    .line 127
    .line 128
    if-eqz v13, :cond_6

    .line 129
    .line 130
    move v13, v9

    .line 131
    goto :goto_5

    .line 132
    :cond_6
    if-nez v2, :cond_7

    .line 133
    .line 134
    iget-boolean v9, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$reverseLayout:Z

    .line 135
    .line 136
    if-nez v9, :cond_7

    .line 137
    .line 138
    move v13, v6

    .line 139
    goto :goto_5

    .line 140
    :cond_7
    move v13, v7

    .line 141
    :goto_5
    sub-int v14, v12, v13

    .line 142
    .line 143
    neg-int v7, v11

    .line 144
    neg-int v9, v10

    .line 145
    invoke-static {v4, v5, v7, v9}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    .line 146
    .line 147
    .line 148
    move-result-wide v17

    .line 149
    iget-object v7, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    .line 150
    .line 151
    invoke-virtual {v7, v0}, Landroidx/compose/foundation/pager/PagerState;->setDensity$foundation_release(Landroidx/compose/ui/unit/Density;)V

    .line 152
    .line 153
    .line 154
    iget v7, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$pageSpacing:F

    .line 155
    .line 156
    invoke-interface {v0, v7}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    if-eqz v2, :cond_8

    .line 161
    .line 162
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    sub-int/2addr v7, v10

    .line 167
    goto :goto_6

    .line 168
    :cond_8
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    sub-int/2addr v7, v11

    .line 173
    :goto_6
    iget-boolean v9, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$reverseLayout:Z

    .line 174
    .line 175
    if-eqz v9, :cond_c

    .line 176
    .line 177
    if-lez v7, :cond_9

    .line 178
    .line 179
    goto :goto_8

    .line 180
    :cond_9
    if-eqz v2, :cond_a

    .line 181
    .line 182
    goto :goto_7

    .line 183
    :cond_a
    add-int/2addr v6, v7

    .line 184
    :goto_7
    if-eqz v2, :cond_b

    .line 185
    .line 186
    add-int/2addr v8, v7

    .line 187
    :cond_b
    invoke-static {v6, v8}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    .line 188
    .line 189
    .line 190
    move-result-wide v8

    .line 191
    goto :goto_9

    .line 192
    :cond_c
    :goto_8
    invoke-static {v6, v8}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    .line 193
    .line 194
    .line 195
    move-result-wide v8

    .line 196
    :goto_9
    move-wide/from16 v23, v8

    .line 197
    .line 198
    iget-object v2, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$pageSize:Landroidx/compose/foundation/pager/PageSize;

    .line 199
    .line 200
    invoke-interface {v2, v0, v7, v12}, Landroidx/compose/foundation/pager/PageSize;->calculateMainAxisPageSize(Landroidx/compose/ui/unit/Density;II)I

    .line 201
    .line 202
    .line 203
    move-result v25

    .line 204
    iget-object v2, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    .line 205
    .line 206
    const/16 v26, 0x0

    .line 207
    .line 208
    iget-object v6, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 209
    .line 210
    if-ne v6, v3, :cond_d

    .line 211
    .line 212
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    move/from16 v27, v6

    .line 217
    .line 218
    goto :goto_a

    .line 219
    :cond_d
    move/from16 v27, v25

    .line 220
    .line 221
    :goto_a
    const/16 v28, 0x0

    .line 222
    .line 223
    iget-object v6, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 224
    .line 225
    if-eq v6, v3, :cond_e

    .line 226
    .line 227
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    move/from16 v29, v3

    .line 232
    .line 233
    goto :goto_b

    .line 234
    :cond_e
    move/from16 v29, v25

    .line 235
    .line 236
    :goto_b
    const/16 v30, 0x5

    .line 237
    .line 238
    const/16 v31, 0x0

    .line 239
    .line 240
    invoke-static/range {v26 .. v31}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    .line 241
    .line 242
    .line 243
    move-result-wide v8

    .line 244
    invoke-virtual {v2, v8, v9}, Landroidx/compose/foundation/pager/PagerState;->setPremeasureConstraints-BRTryo0$foundation_release(J)V

    .line 245
    .line 246
    .line 247
    iget-object v2, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$itemProviderLambda:Lv3/a;

    .line 248
    .line 249
    invoke-interface {v2}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    move-object v8, v2

    .line 254
    check-cast v8, Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;

    .line 255
    .line 256
    add-int v2, v25, v12

    .line 257
    .line 258
    sget-object v3, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 259
    .line 260
    iget-object v6, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    .line 261
    .line 262
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->createNonObservableSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    :try_start_0
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 267
    .line 268
    .line 269
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 270
    :try_start_1
    invoke-virtual {v6}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPage()I

    .line 271
    .line 272
    .line 273
    move-result v15

    .line 274
    invoke-virtual {v6, v8, v15}, Landroidx/compose/foundation/pager/PagerState;->matchScrollPositionWithKey$foundation_release(Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;I)I

    .line 275
    .line 276
    .line 277
    move-result v15

    .line 278
    invoke-static {v6, v2}, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt;->calculateCurrentPageLayoutOffset(Landroidx/compose/foundation/pager/PagerState;I)I

    .line 279
    .line 280
    .line 281
    move-result v31

    .line 282
    sget-object v2, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 283
    .line 284
    :try_start_2
    invoke-virtual {v3, v9}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 285
    .line 286
    .line 287
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 288
    .line 289
    .line 290
    iget-object v2, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    .line 291
    .line 292
    invoke-virtual {v2}, Landroidx/compose/foundation/pager/PagerState;->getPinnedPages$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    iget-object v3, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    .line 297
    .line 298
    invoke-virtual {v3}, Landroidx/compose/foundation/pager/PagerState;->getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    invoke-static {v8, v2, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt;->calculateLazyLayoutPinnedIndices(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;)Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object v27

    .line 306
    iget-object v2, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$pageCount:Lv3/a;

    .line 307
    .line 308
    invoke-interface {v2}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    check-cast v2, Ljava/lang/Number;

    .line 313
    .line 314
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    iget-object v2, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    .line 319
    .line 320
    invoke-virtual {v2}, Landroidx/compose/foundation/pager/PagerState;->getPlacementScopeInvalidator-zYiylxw$foundation_release()Landroidx/compose/runtime/MutableState;

    .line 321
    .line 322
    .line 323
    move-result-object v29

    .line 324
    iget-object v2, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 325
    .line 326
    move-object/from16 v19, v2

    .line 327
    .line 328
    iget-object v2, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

    .line 329
    .line 330
    move-object/from16 v20, v2

    .line 331
    .line 332
    iget-object v2, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    .line 333
    .line 334
    move-object/from16 v21, v2

    .line 335
    .line 336
    iget-boolean v2, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$reverseLayout:Z

    .line 337
    .line 338
    move/from16 v22, v2

    .line 339
    .line 340
    iget v2, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$beyondBoundsPageCount:I

    .line 341
    .line 342
    move/from16 v26, v2

    .line 343
    .line 344
    iget-object v2, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$snapPositionInLayout:Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;

    .line 345
    .line 346
    move-object/from16 v28, v2

    .line 347
    .line 348
    new-instance v2, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$2;

    .line 349
    .line 350
    move-object/from16 v30, v2

    .line 351
    .line 352
    move-object/from16 v3, p1

    .line 353
    .line 354
    move-wide/from16 v4, p2

    .line 355
    .line 356
    move v6, v11

    .line 357
    move v11, v7

    .line 358
    move v7, v10

    .line 359
    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$2;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;JII)V

    .line 360
    .line 361
    .line 362
    move-object v2, v8

    .line 363
    move-object/from16 v8, p1

    .line 364
    .line 365
    move-object v10, v2

    .line 366
    move v0, v12

    .line 367
    move v12, v13

    .line 368
    move v13, v14

    .line 369
    move v14, v0

    .line 370
    const/4 v0, 0x0

    .line 371
    move/from16 v16, v31

    .line 372
    .line 373
    invoke-static/range {v8 .. v30}, Landroidx/compose/foundation/pager/PagerMeasureKt;->measurePager-_JDW0YA(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;Landroidx/compose/runtime/MutableState;Lv3/q;)Landroidx/compose/foundation/pager/PagerMeasureResult;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    iget-object v3, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    .line 378
    .line 379
    const/4 v4, 0x2

    .line 380
    const/4 v5, 0x0

    .line 381
    invoke-static {v3, v2, v0, v4, v5}, Landroidx/compose/foundation/pager/PagerState;->applyMeasureResult$foundation_release$default(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerMeasureResult;ZILjava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    return-object v2

    .line 385
    :catchall_0
    move-exception v0

    .line 386
    :try_start_3
    invoke-virtual {v3, v9}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 387
    .line 388
    .line 389
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 390
    :catchall_1
    move-exception v0

    .line 391
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 392
    .line 393
    .line 394
    throw v0
.end method
