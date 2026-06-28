.class public final Landroidx/compose/foundation/lazy/LazyListMeasureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u001a\u0095\u0002\u0010/\u001a\u00020,2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00102\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00002\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0008\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2/\u0010+\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020(0&\u00a2\u0006\u0002\u0008)\u0012\u0004\u0012\u00020*0%H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010.\u001a\\\u00105\u001a\u0008\u0012\u0004\u0012\u0002010\u00102\u000c\u00102\u001a\u0008\u0012\u0004\u0012\u000201002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u00103\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000e2\u0008\u00104\u001a\u0004\u0018\u00010\u001fH\u0002\u001a4\u00107\u001a\u0008\u0012\u0004\u0012\u0002010\u00102\u0006\u00106\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00002\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0010H\u0002\u001a\u008c\u0001\u0010@\u001a\u0008\u0012\u0004\u0012\u000201002\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u0002010\u00102\u000c\u00109\u001a\u0008\u0012\u0004\u0012\u0002010\u00102\u000c\u0010:\u001a\u0008\u0012\u0004\u0012\u0002010\u00102\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006A"
    }
    d2 = {
        "",
        "itemsCount",
        "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;",
        "measuredItemProvider",
        "mainAxisAvailableSize",
        "beforeContentPadding",
        "afterContentPadding",
        "spaceBetweenItems",
        "firstVisibleItemIndex",
        "firstVisibleItemScrollOffset",
        "",
        "scrollToBeConsumed",
        "Landroidx/compose/ui/unit/Constraints;",
        "constraints",
        "",
        "isVertical",
        "",
        "headerIndexes",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "horizontalArrangement",
        "reverseLayout",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "Landroidx/compose/foundation/lazy/LazyListItemAnimator;",
        "itemAnimator",
        "beyondBoundsItemCount",
        "pinnedItems",
        "hasLookaheadPassOccurred",
        "isLookingAhead",
        "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;",
        "postLookaheadLayoutInfo",
        "Lkotlinx/coroutines/s0;",
        "coroutineScope",
        "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;",
        "placementScopeInvalidator",
        "Lkotlin/Function3;",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "Lkotlin/r2;",
        "Lkotlin/u;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "layout",
        "Landroidx/compose/foundation/lazy/LazyListMeasureResult;",
        "measureLazyList-5IMabDg",
        "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/LazyListItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;Lkotlinx/coroutines/s0;Landroidx/compose/runtime/MutableState;Lv3/q;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;",
        "measureLazyList",
        "",
        "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
        "visibleItems",
        "consumedScroll",
        "lastPostLookaheadLayoutInfo",
        "createItemsAfterList",
        "currentFirstItemIndex",
        "createItemsBeforeList",
        "items",
        "extraItemsBefore",
        "extraItemsAfter",
        "layoutWidth",
        "layoutHeight",
        "finalMainAxisOffset",
        "maxOffset",
        "itemsScrollOffset",
        "calculateItemsOffsets",
        "foundation_release"
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
        "SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,606:1\n1#2:607\n33#3,6:608\n33#3,6:614\n235#3,3:620\n33#3,4:623\n238#3,2:627\n38#3:629\n240#3:630\n116#3,2:631\n33#3,6:633\n118#3:639\n116#3,2:640\n33#3,6:642\n118#3:648\n116#3,2:649\n33#3,6:651\n118#3:657\n33#3,6:658\n51#3,6:664\n33#3,6:670\n33#3,6:676\n33#3,6:682\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n288#1:608,6\n305#1:614,6\n376#1:620,3\n376#1:623,4\n376#1:627,2\n376#1:629\n376#1:630\n434#1:631,2\n434#1:633,6\n434#1:639\n451#1:640,2\n451#1:642,6\n451#1:648\n453#1:649,2\n453#1:651,6\n453#1:657\n474#1:658,6\n501#1:664,6\n585#1:670,6\n592#1:676,6\n598#1:682,6\n*E\n"
    }
.end annotation


# direct methods
.method private static final calculateItemsOffsets(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;IIIIIZ",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    move/from16 v1, p3

    .line 3
    .line 4
    move/from16 v2, p4

    .line 5
    .line 6
    move-object/from16 v3, p9

    .line 7
    .line 8
    move/from16 v4, p11

    .line 9
    .line 10
    move/from16 v5, p6

    .line 11
    .line 12
    if-eqz p8, :cond_0

    .line 13
    .line 14
    move v6, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v6, v1

    .line 17
    :goto_0
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const/4 v7, 0x1

    .line 22
    const/4 v8, 0x0

    .line 23
    move/from16 v9, p5

    .line 24
    .line 25
    if-ge v9, v5, :cond_1

    .line 26
    .line 27
    move v5, v7

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v5, v8

    .line 30
    :goto_1
    if-eqz v5, :cond_4

    .line 31
    .line 32
    if-nez p7, :cond_2

    .line 33
    .line 34
    move v9, v7

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v9, v8

    .line 37
    :goto_2
    if-eqz v9, :cond_3

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v1, "non-zero itemsScrollOffset"

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_4
    :goto_3
    new-instance v9, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    add-int/2addr v10, v11

    .line 63
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    add-int/2addr v10, v11

    .line 68
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    .line 70
    .line 71
    if-eqz v5, :cond_10

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_5

    .line 78
    .line 79
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_5

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_5
    move v7, v8

    .line 87
    :goto_4
    if-eqz v7, :cond_f

    .line 88
    .line 89
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    new-array v7, v5, [I

    .line 94
    .line 95
    move v10, v8

    .line 96
    :goto_5
    if-ge v10, v5, :cond_6

    .line 97
    .line 98
    invoke-static {v10, v4, v5}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->calculateItemsOffsets$reverseAware(IZI)I

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    invoke-interface {p0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    check-cast v11, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 107
    .line 108
    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSize()I

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    aput v11, v7, v10

    .line 113
    .line 114
    add-int/lit8 v10, v10, 0x1

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_6
    new-array v10, v5, [I

    .line 118
    .line 119
    move v11, v8

    .line 120
    :goto_6
    if-ge v11, v5, :cond_7

    .line 121
    .line 122
    aput v8, v10, v11

    .line 123
    .line 124
    add-int/lit8 v11, v11, 0x1

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_7
    if-eqz p8, :cond_9

    .line 128
    .line 129
    if-eqz v3, :cond_8

    .line 130
    .line 131
    move-object/from16 v8, p12

    .line 132
    .line 133
    invoke-interface {v3, v8, v6, v7, v10}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->arrange(Landroidx/compose/ui/unit/Density;I[I[I)V

    .line 134
    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 138
    .line 139
    const-string v1, "null verticalArrangement when isVertical == true"

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v0

    .line 149
    :cond_9
    move-object/from16 v8, p12

    .line 150
    .line 151
    if-eqz p10, :cond_e

    .line 152
    .line 153
    sget-object v3, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 154
    .line 155
    move-object/from16 p5, p10

    .line 156
    .line 157
    move-object/from16 p6, p12

    .line 158
    .line 159
    move/from16 p7, v6

    .line 160
    .line 161
    move-object/from16 p8, v7

    .line 162
    .line 163
    move-object/from16 p9, v3

    .line 164
    .line 165
    move-object/from16 p10, v10

    .line 166
    .line 167
    invoke-interface/range {p5 .. p10}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->arrange(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V

    .line 168
    .line 169
    .line 170
    :goto_7
    invoke-static {v10}, Lkotlin/collections/l;->le([I)Lkotlin/ranges/l;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    if-nez v4, :cond_a

    .line 175
    .line 176
    goto :goto_8

    .line 177
    :cond_a
    invoke-static {v3}, Lkotlin/ranges/s;->q1(Lkotlin/ranges/j;)Lkotlin/ranges/j;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    :goto_8
    invoke-virtual {v3}, Lkotlin/ranges/j;->e()I

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    invoke-virtual {v3}, Lkotlin/ranges/j;->g()I

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    invoke-virtual {v3}, Lkotlin/ranges/j;->i()I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-lez v3, :cond_b

    .line 194
    .line 195
    if-le v7, v8, :cond_c

    .line 196
    .line 197
    :cond_b
    if-gez v3, :cond_13

    .line 198
    .line 199
    if-gt v8, v7, :cond_13

    .line 200
    .line 201
    :cond_c
    :goto_9
    aget v11, v10, v7

    .line 202
    .line 203
    invoke-static {v7, v4, v5}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->calculateItemsOffsets$reverseAware(IZI)I

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v12

    .line 211
    check-cast v12, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 212
    .line 213
    if-eqz v4, :cond_d

    .line 214
    .line 215
    sub-int v11, v6, v11

    .line 216
    .line 217
    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSize()I

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    sub-int/2addr v11, v13

    .line 222
    :cond_d
    invoke-virtual {v12, v11, v1, v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->position(III)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    if-eq v7, v8, :cond_13

    .line 229
    .line 230
    add-int/2addr v7, v3

    .line 231
    goto :goto_9

    .line 232
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 233
    .line 234
    const-string v1, "null horizontalArrangement when isVertical == false"

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw v0

    .line 244
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 245
    .line 246
    const-string v1, "no extra items"

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw v0

    .line 256
    :cond_10
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    move/from16 v5, p7

    .line 261
    .line 262
    move v4, v8

    .line 263
    :goto_a
    if-ge v4, v3, :cond_11

    .line 264
    .line 265
    move-object v6, p1

    .line 266
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    check-cast v7, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 271
    .line 272
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSizeWithSpacings()I

    .line 273
    .line 274
    .line 275
    move-result v10

    .line 276
    sub-int/2addr v5, v10

    .line 277
    invoke-virtual {v7, v5, v1, v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->position(III)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    add-int/lit8 v4, v4, 0x1

    .line 284
    .line 285
    goto :goto_a

    .line 286
    :cond_11
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    move/from16 v4, p7

    .line 291
    .line 292
    move v5, v8

    .line 293
    :goto_b
    if-ge v5, v3, :cond_12

    .line 294
    .line 295
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    check-cast v6, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 300
    .line 301
    invoke-virtual {v6, v4, v1, v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->position(III)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    invoke-virtual {v6}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSizeWithSpacings()I

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    add-int/2addr v4, v6

    .line 312
    add-int/lit8 v5, v5, 0x1

    .line 313
    .line 314
    goto :goto_b

    .line 315
    :cond_12
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    :goto_c
    if-ge v8, v0, :cond_13

    .line 320
    .line 321
    move-object/from16 v3, p2

    .line 322
    .line 323
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    check-cast v5, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 328
    .line 329
    invoke-virtual {v5, v4, v1, v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->position(III)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSizeWithSpacings()I

    .line 336
    .line 337
    .line 338
    move-result v5

    .line 339
    add-int/2addr v4, v5

    .line 340
    add-int/lit8 v8, v8, 0x1

    .line 341
    .line 342
    goto :goto_c

    .line 343
    :cond_13
    return-object v9
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
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
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
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method private static final calculateItemsOffsets$reverseAware(IZI)I
    .locals 0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr p2, p0

    add-int/lit8 p0, p2, -0x1

    :goto_0
    return p0
.end method

.method private static final createItemsAfterList(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IILjava/util/List;FZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;",
            "II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;FZ",
            "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    invoke-static {p0}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    add-int v2, v2, p3

    .line 16
    .line 17
    add-int/lit8 v3, v1, -0x1

    .line 18
    .line 19
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {p0}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 28
    .line 29
    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/4 v5, 0x1

    .line 34
    add-int/2addr v4, v5

    .line 35
    const/4 v6, 0x0

    .line 36
    move-object v7, v6

    .line 37
    if-gt v4, v2, :cond_1

    .line 38
    .line 39
    :goto_0
    if-nez v7, :cond_0

    .line 40
    .line 41
    new-instance v7, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {v0, v4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    if-eq v4, v2, :cond_1

    .line 54
    .line 55
    add-int/lit8 v4, v4, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v4, 0x0

    .line 59
    if-eqz p6, :cond_16

    .line 60
    .line 61
    if-eqz p7, :cond_16

    .line 62
    .line 63
    invoke-interface/range {p7 .. p7}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    check-cast v8, Ljava/util/Collection;

    .line 68
    .line 69
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    xor-int/2addr v8, v5

    .line 74
    if-eqz v8, :cond_16

    .line 75
    .line 76
    invoke-interface/range {p7 .. p7}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    sub-int/2addr v9, v5

    .line 85
    :goto_1
    const/4 v10, -0x1

    .line 86
    if-ge v10, v9, :cond_4

    .line 87
    .line 88
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    check-cast v10, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    .line 93
    .line 94
    invoke-interface {v10}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-le v10, v2, :cond_3

    .line 99
    .line 100
    if-eqz v9, :cond_2

    .line 101
    .line 102
    add-int/lit8 v10, v9, -0x1

    .line 103
    .line 104
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    check-cast v10, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    .line 109
    .line 110
    invoke-interface {v10}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    if-gt v10, v2, :cond_3

    .line 115
    .line 116
    :cond_2
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    check-cast v8, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_3
    add-int/lit8 v9, v9, -0x1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    move-object v8, v6

    .line 127
    :goto_2
    invoke-interface/range {p7 .. p7}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    invoke-static {v9}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    check-cast v9, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    .line 136
    .line 137
    if-eqz v8, :cond_b

    .line 138
    .line 139
    invoke-interface {v8}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    invoke-interface {v9}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    invoke-static {v10, v3}, Ljava/lang/Math;->min(II)I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-gt v8, v3, :cond_b

    .line 152
    .line 153
    :goto_3
    if-eqz v7, :cond_8

    .line 154
    .line 155
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    move v11, v4

    .line 160
    :goto_4
    if-ge v11, v10, :cond_7

    .line 161
    .line 162
    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v12

    .line 166
    move-object v13, v12

    .line 167
    check-cast v13, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 168
    .line 169
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    if-ne v13, v8, :cond_5

    .line 174
    .line 175
    move v13, v5

    .line 176
    goto :goto_5

    .line 177
    :cond_5
    move v13, v4

    .line 178
    :goto_5
    if-eqz v13, :cond_6

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_6
    add-int/lit8 v11, v11, 0x1

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_7
    move-object v12, v6

    .line 185
    :goto_6
    check-cast v12, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_8
    move-object v12, v6

    .line 189
    :goto_7
    if-nez v12, :cond_a

    .line 190
    .line 191
    if-nez v7, :cond_9

    .line 192
    .line 193
    new-instance v7, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 196
    .line 197
    .line 198
    :cond_9
    invoke-virtual {v0, v8}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    :cond_a
    if-eq v8, v3, :cond_b

    .line 206
    .line 207
    add-int/lit8 v8, v8, 0x1

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_b
    invoke-interface/range {p7 .. p7}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getViewportEndOffset()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    invoke-interface {v9}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getOffset()I

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    sub-int/2addr v3, v8

    .line 219
    invoke-interface {v9}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getSize()I

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    sub-int/2addr v3, v8

    .line 224
    int-to-float v3, v3

    .line 225
    sub-float v3, v3, p5

    .line 226
    .line 227
    const/4 v8, 0x0

    .line 228
    cmpl-float v8, v3, v8

    .line 229
    .line 230
    if-lez v8, :cond_16

    .line 231
    .line 232
    invoke-interface {v9}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    .line 233
    .line 234
    .line 235
    move-result v8

    .line 236
    add-int/2addr v8, v5

    .line 237
    move v9, v4

    .line 238
    :goto_8
    if-ge v8, v1, :cond_16

    .line 239
    .line 240
    int-to-float v10, v9

    .line 241
    cmpg-float v10, v10, v3

    .line 242
    .line 243
    if-gez v10, :cond_16

    .line 244
    .line 245
    if-gt v8, v2, :cond_f

    .line 246
    .line 247
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    move v11, v4

    .line 252
    :goto_9
    if-ge v11, v10, :cond_e

    .line 253
    .line 254
    move-object v12, p0

    .line 255
    invoke-interface {p0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v13

    .line 259
    move-object v14, v13

    .line 260
    check-cast v14, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 261
    .line 262
    invoke-virtual {v14}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 263
    .line 264
    .line 265
    move-result v14

    .line 266
    if-ne v14, v8, :cond_c

    .line 267
    .line 268
    move v14, v5

    .line 269
    goto :goto_a

    .line 270
    :cond_c
    move v14, v4

    .line 271
    :goto_a
    if-eqz v14, :cond_d

    .line 272
    .line 273
    goto :goto_b

    .line 274
    :cond_d
    add-int/lit8 v11, v11, 0x1

    .line 275
    .line 276
    goto :goto_9

    .line 277
    :cond_e
    move-object v12, p0

    .line 278
    move-object v13, v6

    .line 279
    :goto_b
    check-cast v13, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 280
    .line 281
    goto :goto_f

    .line 282
    :cond_f
    move-object v12, p0

    .line 283
    if-eqz v7, :cond_13

    .line 284
    .line 285
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 286
    .line 287
    .line 288
    move-result v10

    .line 289
    move v11, v4

    .line 290
    :goto_c
    if-ge v11, v10, :cond_12

    .line 291
    .line 292
    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v13

    .line 296
    move-object v14, v13

    .line 297
    check-cast v14, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 298
    .line 299
    invoke-virtual {v14}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 300
    .line 301
    .line 302
    move-result v14

    .line 303
    if-ne v14, v8, :cond_10

    .line 304
    .line 305
    move v14, v5

    .line 306
    goto :goto_d

    .line 307
    :cond_10
    move v14, v4

    .line 308
    :goto_d
    if-eqz v14, :cond_11

    .line 309
    .line 310
    goto :goto_e

    .line 311
    :cond_11
    add-int/lit8 v11, v11, 0x1

    .line 312
    .line 313
    goto :goto_c

    .line 314
    :cond_12
    move-object v13, v6

    .line 315
    :goto_e
    check-cast v13, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 316
    .line 317
    goto :goto_f

    .line 318
    :cond_13
    move-object v13, v6

    .line 319
    :goto_f
    if-eqz v13, :cond_14

    .line 320
    .line 321
    add-int/lit8 v8, v8, 0x1

    .line 322
    .line 323
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSizeWithSpacings()I

    .line 324
    .line 325
    .line 326
    move-result v10

    .line 327
    :goto_10
    add-int/2addr v9, v10

    .line 328
    goto :goto_8

    .line 329
    :cond_14
    if-nez v7, :cond_15

    .line 330
    .line 331
    new-instance v7, Ljava/util/ArrayList;

    .line 332
    .line 333
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 334
    .line 335
    .line 336
    :cond_15
    invoke-virtual {v0, v8}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 337
    .line 338
    .line 339
    move-result-object v10

    .line 340
    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    add-int/lit8 v8, v8, 0x1

    .line 344
    .line 345
    invoke-static {v7}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v10

    .line 349
    check-cast v10, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 350
    .line 351
    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSizeWithSpacings()I

    .line 352
    .line 353
    .line 354
    move-result v10

    .line 355
    goto :goto_10

    .line 356
    :cond_16
    if-eqz v7, :cond_17

    .line 357
    .line 358
    invoke-static {v7}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    check-cast v1, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 363
    .line 364
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    if-le v1, v2, :cond_17

    .line 369
    .line 370
    invoke-static {v7}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    check-cast v1, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 375
    .line 376
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    :cond_17
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    :goto_11
    if-ge v4, v1, :cond_1a

    .line 385
    .line 386
    move-object/from16 v3, p4

    .line 387
    .line 388
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    check-cast v5, Ljava/lang/Number;

    .line 393
    .line 394
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    if-le v5, v2, :cond_19

    .line 399
    .line 400
    if-nez v7, :cond_18

    .line 401
    .line 402
    new-instance v7, Ljava/util/ArrayList;

    .line 403
    .line 404
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 405
    .line 406
    .line 407
    :cond_18
    invoke-virtual {v0, v5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    :cond_19
    add-int/lit8 v4, v4, 0x1

    .line 415
    .line 416
    goto :goto_11

    .line 417
    :cond_1a
    if-nez v7, :cond_1b

    .line 418
    .line 419
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 420
    .line 421
    .line 422
    move-result-object v7

    .line 423
    :cond_1b
    return-object v7
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
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
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
.end method

.method private static final createItemsBeforeList(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;ILjava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    sub-int p2, p0, p2

    .line 3
    .line 4
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    add-int/lit8 p0, p0, -0x1

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    if-gt p2, p0, :cond_1

    .line 12
    .line 13
    :goto_0
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p1, p0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    if-eq p0, p2, :cond_1

    .line 28
    .line 29
    add-int/lit8 p0, p0, -0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/lit8 p0, p0, -0x1

    .line 37
    .line 38
    if-ltz p0, :cond_5

    .line 39
    .line 40
    :goto_1
    add-int/lit8 v1, p0, -0x1

    .line 41
    .line 42
    invoke-interface {p3, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-ge p0, p2, :cond_3

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    new-instance v0, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-virtual {p1, p0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    :cond_3
    if-gez v1, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    move p0, v1

    .line 72
    goto :goto_1

    .line 73
    :cond_5
    :goto_2
    if-nez v0, :cond_6

    .line 74
    .line 75
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :cond_6
    return-object v0
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
.end method

.method public static final measureLazyList-5IMabDg(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/LazyListItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;Lkotlinx/coroutines/s0;Landroidx/compose/runtime/MutableState;Lv3/q;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;
    .locals 36
    .param p1    # Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p14    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p16    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p17    # Landroidx/compose/foundation/lazy/LazyListItemAnimator;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p19    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p22    # Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p23    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p24    # Landroidx/compose/runtime/MutableState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p25    # Lv3/q;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;",
            "IIIIIIFJZ",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/foundation/lazy/LazyListItemAnimator;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;ZZ",
            "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;",
            "Lkotlinx/coroutines/s0;",
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlin/r2;",
            ">;",
            "Lv3/q<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
            "Lkotlin/r2;",
            ">;+",
            "Landroidx/compose/ui/layout/MeasureResult;",
            ">;)",
            "Landroidx/compose/foundation/lazy/LazyListMeasureResult;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    move/from16 v11, p0

    move-object/from16 v10, p1

    move/from16 v15, p2

    move/from16 v14, p3

    move-wide/from16 v8, p9

    move/from16 v13, p21

    move-object/from16 v12, p25

    const/4 v7, 0x0

    const/16 v25, 0x1

    if-ltz v14, :cond_0

    move/from16 v0, v25

    goto :goto_0

    :cond_0
    move v0, v7

    :goto_0
    if-eqz v0, :cond_2a

    if-ltz p4, :cond_1

    move/from16 v0, v25

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    if-eqz v0, :cond_29

    if-gtz v11, :cond_3

    .line 1
    invoke-static/range {p9 .. p10}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v11

    .line 2
    invoke-static/range {p9 .. p10}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v16

    const/4 v1, 0x0

    .line 3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v0, p17

    move v2, v11

    move/from16 v3, v16

    move-object/from16 v5, p1

    move/from16 v6, p11

    move/from16 v7, p21

    move/from16 v8, p20

    move-object/from16 v9, p23

    .line 4
    invoke-virtual/range {v0 .. v9}, Landroidx/compose/foundation/lazy/LazyListItemAnimator;->onMeasured(IIILjava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;ZZZLkotlinx/coroutines/s0;)V

    .line 5
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$3;->INSTANCE:Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$3;

    invoke-interface {v12, v0, v1, v2}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroidx/compose/ui/layout/MeasureResult;

    .line 6
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    move-result-object v8

    neg-int v9, v14

    add-int v10, v15, p4

    if-eqz p11, :cond_2

    .line 7
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_2

    :cond_2
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    :goto_2
    move-object v13, v0

    .line 8
    new-instance v16, Landroidx/compose/foundation/lazy/LazyListMeasureResult;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    move-object/from16 v0, v16

    move/from16 v12, p15

    move/from16 v14, p4

    move/from16 v15, p5

    invoke-direct/range {v0 .. v15}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;-><init>(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V

    return-object v16

    :cond_3
    move/from16 v0, p6

    if-lt v0, v11, :cond_4

    add-int/lit8 v0, v11, -0x1

    move v1, v7

    goto :goto_3

    :cond_4
    move/from16 v1, p7

    .line 9
    :goto_3
    invoke-static/range {p8 .. p8}, Lkotlin/math/b;->L0(F)I

    move-result v2

    sub-int/2addr v1, v2

    if-nez v0, :cond_5

    if-gez v1, :cond_5

    add-int/2addr v2, v1

    move v1, v7

    .line 10
    :cond_5
    new-instance v6, Lkotlin/collections/k;

    invoke-direct {v6}, Lkotlin/collections/k;-><init>()V

    neg-int v5, v14

    if-gez p5, :cond_6

    move/from16 v3, p5

    goto :goto_4

    :cond_6
    move v3, v7

    :goto_4
    add-int/2addr v3, v5

    add-int/2addr v1, v3

    move v4, v7

    :goto_5
    if-gez v1, :cond_7

    if-lez v0, :cond_7

    add-int/lit8 v0, v0, -0x1

    move/from16 v16, v5

    .line 11
    invoke-virtual {v10, v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v5

    .line 12
    invoke-virtual {v6, v7, v5}, Lkotlin/collections/k;->add(ILjava/lang/Object;)V

    .line 13
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getCrossAxisSize()I

    move-result v7

    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 14
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSizeWithSpacings()I

    move-result v5

    add-int/2addr v1, v5

    move/from16 v5, v16

    const/4 v7, 0x0

    goto :goto_5

    :cond_7
    move/from16 v16, v5

    if-ge v1, v3, :cond_8

    add-int/2addr v2, v1

    move v1, v3

    :cond_8
    sub-int/2addr v1, v3

    add-int v7, v15, p4

    move/from16 p6, v0

    const/4 v5, 0x0

    .line 15
    invoke-static {v7, v5}, Lkotlin/ranges/s;->u(II)I

    move-result v0

    neg-int v5, v1

    move/from16 v19, p6

    move/from16 p7, v1

    move/from16 v20, v4

    move v1, v5

    const/4 v5, 0x0

    const/16 v18, 0x0

    .line 16
    :goto_6
    invoke-virtual {v6}, Lkotlin/collections/f;->size()I

    move-result v4

    if-ge v5, v4, :cond_a

    if-lt v1, v0, :cond_9

    .line 17
    invoke-virtual {v6, v5}, Lkotlin/collections/f;->remove(I)Ljava/lang/Object;

    move/from16 v18, v25

    goto :goto_6

    :cond_9
    add-int/lit8 v19, v19, 0x1

    .line 18
    invoke-virtual {v6, v5}, Lkotlin/collections/k;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSizeWithSpacings()I

    move-result v4

    add-int/2addr v1, v4

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_a
    move/from16 v5, p7

    move v4, v1

    move/from16 v26, v18

    move/from16 v12, v19

    move/from16 v1, v20

    :goto_7
    if-ge v12, v11, :cond_e

    if-lt v4, v0, :cond_b

    if-lez v4, :cond_b

    .line 19
    invoke-virtual {v6}, Lkotlin/collections/k;->isEmpty()Z

    move-result v18

    if-eqz v18, :cond_e

    :cond_b
    move/from16 p7, v0

    .line 20
    invoke-virtual {v10, v12}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSizeWithSpacings()I

    move-result v18

    add-int v4, v4, v18

    if-gt v4, v3, :cond_c

    move/from16 v18, v3

    add-int/lit8 v3, v11, -0x1

    if-eq v12, v3, :cond_d

    add-int/lit8 v3, v12, 0x1

    .line 22
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSizeWithSpacings()I

    move-result v0

    sub-int/2addr v5, v0

    move/from16 v26, v25

    goto :goto_8

    :cond_c
    move/from16 v18, v3

    .line 23
    :cond_d
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getCrossAxisSize()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 24
    invoke-virtual {v6, v0}, Lkotlin/collections/k;->add(Ljava/lang/Object;)Z

    move/from16 v3, p6

    :goto_8
    add-int/lit8 v12, v12, 0x1

    move/from16 v0, p7

    move/from16 p6, v3

    move/from16 v3, v18

    goto :goto_7

    :cond_e
    if-ge v4, v15, :cond_11

    sub-int v0, v15, v4

    sub-int/2addr v5, v0

    add-int/2addr v4, v0

    move v3, v1

    move/from16 v1, p6

    :goto_9
    if-ge v5, v14, :cond_f

    if-lez v1, :cond_f

    add-int/lit8 v1, v1, -0x1

    move/from16 p7, v7

    .line 25
    invoke-virtual {v10, v1}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v7

    move/from16 v18, v12

    const/4 v12, 0x0

    .line 26
    invoke-virtual {v6, v12, v7}, Lkotlin/collections/k;->add(ILjava/lang/Object;)V

    .line 27
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getCrossAxisSize()I

    move-result v12

    invoke-static {v3, v12}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 28
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSizeWithSpacings()I

    move-result v7

    add-int/2addr v5, v7

    move/from16 v7, p7

    move/from16 v12, v18

    goto :goto_9

    :cond_f
    move/from16 p7, v7

    move/from16 v18, v12

    add-int/2addr v0, v2

    if-gez v5, :cond_10

    add-int/2addr v0, v5

    add-int/2addr v4, v5

    move v12, v4

    const/4 v5, 0x0

    goto :goto_a

    :cond_10
    move v12, v4

    goto :goto_a

    :cond_11
    move/from16 p7, v7

    move/from16 v18, v12

    move v3, v1

    move v0, v2

    move v12, v4

    move/from16 v1, p6

    .line 29
    :goto_a
    invoke-static/range {p8 .. p8}, Lkotlin/math/b;->L0(F)I

    move-result v4

    invoke-static {v4}, Lkotlin/math/b;->U(I)I

    move-result v4

    invoke-static {v0}, Lkotlin/math/b;->U(I)I

    move-result v7

    if-ne v4, v7, :cond_12

    .line 30
    invoke-static/range {p8 .. p8}, Lkotlin/math/b;->L0(F)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v7

    if-lt v4, v7, :cond_12

    int-to-float v4, v0

    move v7, v4

    goto :goto_b

    :cond_12
    move/from16 v7, p8

    :goto_b
    sub-float v4, p8, v7

    const/16 v19, 0x0

    if-eqz v13, :cond_13

    if-le v0, v2, :cond_13

    cmpg-float v20, v4, v19

    if-gtz v20, :cond_13

    sub-int/2addr v0, v2

    int-to-float v0, v0

    add-float/2addr v0, v4

    move/from16 v27, v0

    goto :goto_c

    :cond_13
    move/from16 v27, v19

    :goto_c
    if-ltz v5, :cond_14

    move/from16 v0, v25

    goto :goto_d

    :cond_14
    const/4 v0, 0x0

    :goto_d
    if-eqz v0, :cond_28

    neg-int v4, v5

    .line 31
    invoke-virtual {v6}, Lkotlin/collections/k;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    if-gtz v14, :cond_16

    if-gez p5, :cond_15

    goto :goto_e

    :cond_15
    move-object/from16 v2, p19

    move/from16 v19, v3

    move/from16 v28, v5

    move/from16 v3, p18

    move-object v5, v0

    goto :goto_10

    .line 32
    :cond_16
    :goto_e
    invoke-virtual {v6}, Lkotlin/collections/f;->size()I

    move-result v2

    move-object/from16 p6, v0

    move v0, v5

    const/4 v5, 0x0

    :goto_f
    if-ge v5, v2, :cond_17

    .line 33
    invoke-virtual {v6, v5}, Lkotlin/collections/k;->get(I)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move/from16 p8, v2

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSizeWithSpacings()I

    move-result v2

    if-eqz v0, :cond_17

    if-gt v2, v0, :cond_17

    move/from16 v19, v3

    .line 34
    invoke-static {v6}, Lkotlin/collections/u;->G(Ljava/util/List;)I

    move-result v3

    if-eq v5, v3, :cond_18

    sub-int/2addr v0, v2

    add-int/lit8 v5, v5, 0x1

    .line 35
    invoke-virtual {v6, v5}, Lkotlin/collections/k;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-object/from16 p6, v2

    move/from16 v3, v19

    move/from16 v2, p8

    goto :goto_f

    :cond_17
    move/from16 v19, v3

    :cond_18
    move-object/from16 v5, p6

    move/from16 v3, p18

    move-object/from16 v2, p19

    move/from16 v28, v0

    .line 36
    :goto_10
    invoke-static {v1, v10, v3, v2}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->createItemsBeforeList(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;ILjava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 37
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v10, v19

    const/4 v2, 0x0

    :goto_11
    if-ge v2, v0, :cond_19

    .line 38
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    .line 39
    check-cast v19, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move/from16 p6, v0

    .line 40
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getCrossAxisSize()I

    move-result v0

    invoke-static {v10, v0}, Ljava/lang/Math;->max(II)I

    move-result v10

    add-int/lit8 v2, v2, 0x1

    move/from16 v0, p6

    goto :goto_11

    :cond_19
    move-object v0, v6

    move-object/from16 v19, v1

    move-object/from16 v1, p1

    move/from16 v2, p0

    move/from16 v3, p18

    move/from16 v20, v4

    move-object/from16 v4, p19

    move/from16 v29, v16

    move/from16 v16, v10

    move-object v10, v5

    move v5, v7

    move-object/from16 v30, v6

    move/from16 v6, p21

    move/from16 v32, p7

    move v11, v7

    const/16 v31, 0x0

    move-object/from16 v7, p22

    .line 41
    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->createItemsAfterList(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IILjava/util/List;FZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)Ljava/util/List;

    move-result-object v0

    .line 42
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    move/from16 v2, v16

    move/from16 v7, v31

    :goto_12
    if-ge v7, v1, :cond_1a

    .line 43
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 44
    check-cast v3, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 45
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getCrossAxisSize()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/lit8 v7, v7, 0x1

    goto :goto_12

    .line 46
    :cond_1a
    invoke-virtual/range {v30 .. v30}, Lkotlin/collections/k;->first()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1b

    .line 47
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1b

    .line 48
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1b

    move/from16 v33, v25

    goto :goto_13

    :cond_1b
    move/from16 v33, v31

    :goto_13
    if-eqz p11, :cond_1c

    move v1, v2

    goto :goto_14

    :cond_1c
    move v1, v12

    .line 49
    :goto_14
    invoke-static {v8, v9, v1}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v34

    if-eqz p11, :cond_1d

    move v2, v12

    .line 50
    :cond_1d
    invoke-static {v8, v9, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v35

    move-object/from16 v9, p25

    move v7, v12

    move/from16 v8, v18

    move-object/from16 v12, v30

    move v6, v13

    move-object/from16 v13, v19

    move-object v14, v0

    move v5, v15

    move/from16 v15, v34

    move/from16 v16, v35

    move/from16 v17, v7

    move/from16 v18, p2

    move/from16 v19, v20

    move/from16 v20, p11

    move-object/from16 v21, p13

    move-object/from16 v22, p14

    move/from16 v23, p15

    move-object/from16 v24, p16

    .line 51
    invoke-static/range {v12 .. v24}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->calculateItemsOffsets(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;

    move-result-object v12

    float-to-int v1, v11

    move-object/from16 v0, p17

    move/from16 v2, v34

    move/from16 v3, v35

    move-object v4, v12

    move v13, v5

    move-object/from16 v5, p1

    move v14, v6

    move/from16 v6, p11

    move v15, v7

    move/from16 v7, p21

    move/from16 v16, v11

    move v11, v8

    move/from16 v8, p20

    move-object/from16 v17, v10

    move-object v10, v9

    move-object/from16 v9, p23

    .line 52
    invoke-virtual/range {v0 .. v9}, Landroidx/compose/foundation/lazy/LazyListItemAnimator;->onMeasured(IIILjava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;ZZZLkotlinx/coroutines/s0;)V

    .line 53
    move-object/from16 v0, p12

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1e

    move-object v0, v12

    move-object/from16 v1, p1

    move-object/from16 v2, p12

    move/from16 v3, p3

    move/from16 v4, v34

    move/from16 v5, v35

    .line 54
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/LazyListHeadersKt;->findOrComposeLazyListHeader(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;Ljava/util/List;III)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v0

    goto :goto_15

    :cond_1e
    const/4 v0, 0x0

    :goto_15
    move/from16 v9, p0

    move/from16 v4, v16

    if-lt v11, v9, :cond_20

    if-le v15, v13, :cond_1f

    goto :goto_16

    :cond_1f
    move/from16 v3, v31

    goto :goto_17

    :cond_20
    :goto_16
    move/from16 v3, v25

    .line 55
    :goto_17
    invoke-static/range {v34 .. v34}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static/range {v35 .. v35}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v5, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$7;

    move-object/from16 v6, p24

    invoke-direct {v5, v12, v0, v14, v6}, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$7;-><init>(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItem;ZLandroidx/compose/runtime/MutableState;)V

    invoke-interface {v10, v1, v2, v5}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroidx/compose/ui/layout/MeasureResult;

    if-eqz v33, :cond_21

    move-object v8, v12

    goto :goto_1a

    .line 56
    :cond_21
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v2

    move/from16 v7, v31

    :goto_18
    if-ge v7, v2, :cond_26

    .line 58
    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 59
    move-object v8, v6

    check-cast v8, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 60
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v10

    invoke-virtual/range {v30 .. v30}, Lkotlin/collections/k;->first()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v11

    if-lt v10, v11, :cond_22

    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v10

    invoke-virtual/range {v30 .. v30}, Lkotlin/collections/k;->last()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v11

    if-le v10, v11, :cond_23

    :cond_22
    if-ne v8, v0, :cond_24

    :cond_23
    move/from16 v8, v25

    goto :goto_19

    :cond_24
    move/from16 v8, v31

    :goto_19
    if-eqz v8, :cond_25

    .line 61
    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_25
    add-int/lit8 v7, v7, 0x1

    goto :goto_18

    :cond_26
    move-object v8, v1

    :goto_1a
    if-eqz p11, :cond_27

    .line 62
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_1b

    :cond_27
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    :goto_1b
    move-object v13, v0

    .line 63
    new-instance v16, Landroidx/compose/foundation/lazy/LazyListMeasureResult;

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    move/from16 v2, v28

    move/from16 v6, v27

    move/from16 v7, v26

    move/from16 v9, v29

    move/from16 v10, v32

    move/from16 v11, p0

    move/from16 v12, p15

    move/from16 v14, p4

    move/from16 v15, p5

    invoke-direct/range {v0 .. v15}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;-><init>(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V

    return-object v16

    .line 64
    :cond_28
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative currentFirstItemScrollOffset"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 65
    :cond_29
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid afterContentPadding"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 66
    :cond_2a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid beforeContentPadding"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
