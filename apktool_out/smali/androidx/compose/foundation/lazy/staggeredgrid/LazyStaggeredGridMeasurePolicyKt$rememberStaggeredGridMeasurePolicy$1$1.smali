.class final Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt;->rememberStaggeredGridMeasurePolicy-1tP8Re8(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lv3/a;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlinx/coroutines/s0;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/runtime/Composer;I)Lv3/p;
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
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "invoke-0kLqBqw",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;"
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
        "SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,167:1\n51#2:168\n51#2:169\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n*L\n93#1:168\n96#1:169\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field final synthetic $coroutineScope:Lkotlinx/coroutines/s0;

.field final synthetic $itemProviderLambda:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $mainAxisSpacing:F

.field final synthetic $orientation:Landroidx/compose/foundation/gestures/Orientation;

.field final synthetic $reverseLayout:Z

.field final synthetic $slots:Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;

.field final synthetic $state:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Lv3/a;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLkotlinx/coroutines/s0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;",
            "Lv3/a<",
            "+",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;",
            ">;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "ZF",
            "Lkotlinx/coroutines/s0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    iput-object p2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$slots:Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$itemProviderLambda:Lv3/a;

    iput-object p4, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    iput-object p5, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    iput-boolean p6, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$reverseLayout:Z

    iput p7, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$mainAxisSpacing:F

    iput-object p8, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$coroutineScope:Lkotlinx/coroutines/s0;

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

    invoke-virtual {p0, p1, v0, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->invoke-0kLqBqw(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-0kLqBqw(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;
    .locals 21
    .param p1    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
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
    move-wide/from16 v2, p2

    .line 6
    .line 7
    iget-object v4, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 8
    .line 9
    invoke-static {v2, v3, v4}, Landroidx/compose/foundation/CheckScrollableContainerConstraintsKt;->checkScrollableContainerConstraints-K40F9xA(JLandroidx/compose/foundation/gestures/Orientation;)V

    .line 10
    .line 11
    .line 12
    iget-object v4, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$slots:Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;

    .line 13
    .line 14
    invoke-interface {v4, v1, v2, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;->invoke-0kLqBqw(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;

    .line 15
    .line 16
    .line 17
    move-result-object v10

    .line 18
    iget-object v4, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 19
    .line 20
    sget-object v5, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 21
    .line 22
    const/4 v15, 0x0

    .line 23
    if-ne v4, v5, :cond_0

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    move v11, v4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v11, v15

    .line 29
    :goto_0
    iget-object v4, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$itemProviderLambda:Lv3/a;

    .line 30
    .line 31
    invoke-interface {v4}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    move-object v12, v4

    .line 36
    check-cast v12, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    .line 37
    .line 38
    iget-object v4, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 39
    .line 40
    invoke-virtual {v4, v10}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->setSlots$foundation_release(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;)V

    .line 41
    .line 42
    .line 43
    iget-object v4, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 44
    .line 45
    invoke-virtual {v4, v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->setVertical$foundation_release(Z)V

    .line 46
    .line 47
    .line 48
    iget-object v4, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 49
    .line 50
    invoke-interface {v12}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;->getSpanProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v4, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->setSpanProvider$foundation_release(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;)V

    .line 55
    .line 56
    .line 57
    iget-object v4, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 58
    .line 59
    iget-object v5, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 60
    .line 61
    iget-boolean v6, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$reverseLayout:Z

    .line 62
    .line 63
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt;->access$beforePadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    invoke-interface {v1, v4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 72
    .line 73
    .line 74
    move-result v14

    .line 75
    iget-object v4, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 76
    .line 77
    iget-object v5, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 78
    .line 79
    iget-boolean v6, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$reverseLayout:Z

    .line 80
    .line 81
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt;->access$afterPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-interface {v1, v4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 90
    .line 91
    .line 92
    move-result v16

    .line 93
    iget-object v4, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 94
    .line 95
    iget-object v5, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 96
    .line 97
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-static {v4, v5, v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt;->access$startPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    invoke-interface {v1, v4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v11, :cond_1

    .line 110
    .line 111
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    goto :goto_1

    .line 116
    :cond_1
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    :goto_1
    sub-int/2addr v5, v14

    .line 121
    sub-int v13, v5, v16

    .line 122
    .line 123
    if-eqz v11, :cond_2

    .line 124
    .line 125
    invoke-static {v4, v14}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    .line 126
    .line 127
    .line 128
    move-result-wide v4

    .line 129
    goto :goto_2

    .line 130
    :cond_2
    invoke-static {v14, v4}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    .line 131
    .line 132
    .line 133
    move-result-wide v4

    .line 134
    :goto_2
    move-wide/from16 v17, v4

    .line 135
    .line 136
    iget-object v4, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 137
    .line 138
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/PaddingKt;->calculateStartPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/PaddingKt;->calculateEndPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    add-float/2addr v5, v4

    .line 155
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    invoke-interface {v1, v4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    iget-object v5, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 164
    .line 165
    invoke-interface {v5}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    invoke-interface {v5}, Landroidx/compose/foundation/layout/PaddingValues;->calculateBottomPadding-D9Ej5fM()F

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    add-float/2addr v6, v5

    .line 174
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    invoke-interface {v1, v5}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    iget-object v6, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 183
    .line 184
    invoke-virtual {v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getPinnedItems$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    iget-object v7, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 189
    .line 190
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    invoke-static {v12, v6, v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt;->calculateLazyLayoutPinnedIndices(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;)Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object v19

    .line 198
    invoke-static {v2, v3, v4}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    const/4 v6, 0x0

    .line 203
    invoke-static {v2, v3, v5}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    const/4 v8, 0x0

    .line 208
    const/16 v9, 0xa

    .line 209
    .line 210
    const/16 v20, 0x0

    .line 211
    .line 212
    move-wide/from16 v2, p2

    .line 213
    .line 214
    move v5, v6

    .line 215
    move v6, v7

    .line 216
    move v7, v8

    .line 217
    move v8, v9

    .line 218
    move-object/from16 v9, v20

    .line 219
    .line 220
    invoke-static/range {v2 .. v9}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 221
    .line 222
    .line 223
    move-result-wide v6

    .line 224
    iget v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$mainAxisSpacing:F

    .line 225
    .line 226
    invoke-interface {v1, v2}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 227
    .line 228
    .line 229
    move-result v20

    .line 230
    iget-object v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 231
    .line 232
    iget-boolean v9, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$reverseLayout:Z

    .line 233
    .line 234
    iget-object v8, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$coroutineScope:Lkotlinx/coroutines/s0;

    .line 235
    .line 236
    move-object/from16 v1, p1

    .line 237
    .line 238
    move-object/from16 v3, v19

    .line 239
    .line 240
    move-object v4, v12

    .line 241
    move-object v5, v10

    .line 242
    move-object/from16 v19, v8

    .line 243
    .line 244
    move v8, v11

    .line 245
    move-wide/from16 v10, v17

    .line 246
    .line 247
    move v12, v13

    .line 248
    move/from16 v13, v20

    .line 249
    .line 250
    move/from16 v15, v16

    .line 251
    .line 252
    move-object/from16 v16, v19

    .line 253
    .line 254
    invoke-static/range {v1 .. v16}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->measureStaggeredGrid-sdzDtKU(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/s0;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    iget-object v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 259
    .line 260
    const/4 v3, 0x2

    .line 261
    const/4 v4, 0x0

    .line 262
    const/4 v5, 0x0

    .line 263
    invoke-static {v2, v1, v5, v3, v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->applyMeasureResult$foundation_release$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;ZILjava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    return-object v1
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
