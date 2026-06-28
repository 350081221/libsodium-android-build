.class public final Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/pager/PagerKt;->SnapLayoutInfoProvider(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/DecayAnimationSpec;F)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0003J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u0011\u0010\u000e\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "androidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1",
        "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;",
        "Lkotlin/u0;",
        "",
        "searchForSnappingBounds",
        "",
        "isValidDistance",
        "currentVelocity",
        "calculateSnappingOffset",
        "initialVelocity",
        "calculateApproachOffset",
        "Landroidx/compose/foundation/pager/PagerLayoutInfo;",
        "getLayoutInfo",
        "()Landroidx/compose/foundation/pager/PagerLayoutInfo;",
        "layoutInfo",
        "foundation_release"
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
        "SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1\n+ 2 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,970:1\n956#2,4:971\n956#2,4:976\n956#2,4:980\n956#2,4:984\n956#2,4:988\n956#2,4:992\n956#2,4:996\n956#2,4:1000\n956#2,4:1004\n956#2,4:1008\n956#2,4:1012\n956#2,4:1016\n956#2,4:1020\n956#2,4:1024\n956#2,4:1028\n956#2,4:1032\n956#2,4:1036\n1#3:975\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1\n*L\n602#1:971,4\n617#1:976,4\n627#1:980,4\n635#1:984,4\n639#1:988,4\n654#1:992,4\n664#1:996,4\n677#1:1000,4\n686#1:1004,4\n692#1:1008,4\n703#1:1012,4\n709#1:1016,4\n722#1:1020,4\n727#1:1024,4\n740#1:1028,4\n757#1:1032,4\n790#1:1036,4\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $decayAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/DecayAnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $pagerSnapDistance:Landroidx/compose/foundation/pager/PagerSnapDistance;

.field final synthetic $pagerState:Landroidx/compose/foundation/pager/PagerState;

.field final synthetic $snapPositionalThreshold:F


# direct methods
.method constructor <init>(Landroidx/compose/foundation/pager/PagerState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/foundation/pager/PagerSnapDistance;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/pager/PagerState;",
            "F",
            "Landroidx/compose/animation/core/DecayAnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/foundation/pager/PagerSnapDistance;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 2
    .line 3
    iput p2, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$snapPositionalThreshold:F

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$decayAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerSnapDistance:Landroidx/compose/foundation/pager/PagerSnapDistance;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
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

.method private final searchForSnappingBounds()Lkotlin/u0;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/u0<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/compose/foundation/pager/PagerState;->getPageSize$foundation_release()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, v0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroidx/compose/foundation/pager/PagerState;->getPageSpacing$foundation_release()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    add-int/2addr v1, v2

    .line 16
    iget-object v2, v0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 17
    .line 18
    invoke-virtual {v2}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPage()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iget-object v3, v0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 23
    .line 24
    invoke-static {v3, v1}, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt;->calculateCurrentPageLayoutOffset(Landroidx/compose/foundation/pager/PagerState;I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-interface {v4}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getVisiblePagesInfo()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    div-int/lit8 v4, v4, 0x2

    .line 41
    .line 42
    const/high16 v5, -0x800000    # Float.NEGATIVE_INFINITY

    .line 43
    .line 44
    const/high16 v6, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 45
    .line 46
    move v14, v2

    .line 47
    move v15, v3

    .line 48
    move/from16 v16, v5

    .line 49
    .line 50
    move/from16 v17, v6

    .line 51
    .line 52
    :goto_0
    sub-int v7, v2, v4

    .line 53
    .line 54
    const/4 v8, 0x0

    .line 55
    invoke-static {v7, v8}, Lkotlin/ranges/s;->u(II)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    const/16 v18, 0x0

    .line 60
    .line 61
    if-lt v14, v7, :cond_2

    .line 62
    .line 63
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-static {v7}, Landroidx/compose/foundation/pager/PagerLayoutInfoKt;->getMainAxisViewportSize(Landroidx/compose/foundation/pager/PagerLayoutInfo;)I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-interface {v8}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getBeforeContentPadding()I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-interface {v9}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getAfterContentPadding()I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    invoke-interface {v10}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getPageSize()I

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    invoke-static {}, Landroidx/compose/foundation/pager/PagerStateKt;->getSnapAlignmentStartToStart()Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;

    .line 96
    .line 97
    .line 98
    move-result-object v13

    .line 99
    move v11, v15

    .line 100
    move v12, v14

    .line 101
    invoke-static/range {v7 .. v13}, Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayoutKt;->calculateDistanceToDesiredSnapPosition(IIIIIILandroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;)F

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    cmpg-float v8, v7, v18

    .line 106
    .line 107
    if-gtz v8, :cond_0

    .line 108
    .line 109
    cmpl-float v8, v7, v16

    .line 110
    .line 111
    if-lez v8, :cond_0

    .line 112
    .line 113
    move/from16 v16, v7

    .line 114
    .line 115
    :cond_0
    cmpl-float v8, v7, v18

    .line 116
    .line 117
    if-ltz v8, :cond_1

    .line 118
    .line 119
    cmpg-float v8, v7, v17

    .line 120
    .line 121
    if-gez v8, :cond_1

    .line 122
    .line 123
    move/from16 v17, v7

    .line 124
    .line 125
    :cond_1
    sub-int/2addr v15, v1

    .line 126
    add-int/lit8 v14, v14, -0x1

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_2
    add-int/lit8 v7, v2, 0x1

    .line 130
    .line 131
    add-int/2addr v3, v1

    .line 132
    :goto_1
    add-int v9, v2, v4

    .line 133
    .line 134
    iget-object v10, v0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 135
    .line 136
    invoke-virtual {v10}, Landroidx/compose/foundation/pager/PagerState;->getPageCount()I

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    const/4 v11, 0x1

    .line 141
    sub-int/2addr v10, v11

    .line 142
    invoke-static {v9, v10}, Lkotlin/ranges/s;->B(II)I

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-gt v7, v9, :cond_5

    .line 147
    .line 148
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    invoke-static {v9}, Landroidx/compose/foundation/pager/PagerLayoutInfoKt;->getMainAxisViewportSize(Landroidx/compose/foundation/pager/PagerLayoutInfo;)I

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    invoke-interface {v10}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getBeforeContentPadding()I

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    invoke-interface {v11}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getAfterContentPadding()I

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    invoke-interface {v12}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getPageSize()I

    .line 177
    .line 178
    .line 179
    move-result v12

    .line 180
    invoke-static {}, Landroidx/compose/foundation/pager/PagerStateKt;->getSnapAlignmentStartToStart()Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;

    .line 181
    .line 182
    .line 183
    move-result-object v15

    .line 184
    move v13, v3

    .line 185
    move v14, v7

    .line 186
    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayoutKt;->calculateDistanceToDesiredSnapPosition(IIIIIILandroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;)F

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    cmpl-float v10, v9, v18

    .line 191
    .line 192
    if-ltz v10, :cond_3

    .line 193
    .line 194
    cmpg-float v10, v9, v17

    .line 195
    .line 196
    if-gez v10, :cond_3

    .line 197
    .line 198
    move/from16 v17, v9

    .line 199
    .line 200
    :cond_3
    cmpg-float v10, v9, v18

    .line 201
    .line 202
    if-gtz v10, :cond_4

    .line 203
    .line 204
    cmpl-float v10, v9, v16

    .line 205
    .line 206
    if-lez v10, :cond_4

    .line 207
    .line 208
    move/from16 v16, v9

    .line 209
    .line 210
    :cond_4
    add-int/2addr v3, v1

    .line 211
    add-int/lit8 v7, v7, 0x1

    .line 212
    .line 213
    goto :goto_1

    .line 214
    :cond_5
    cmpg-float v1, v16, v5

    .line 215
    .line 216
    if-nez v1, :cond_6

    .line 217
    .line 218
    move v1, v11

    .line 219
    goto :goto_2

    .line 220
    :cond_6
    move v1, v8

    .line 221
    :goto_2
    if-eqz v1, :cond_7

    .line 222
    .line 223
    move/from16 v16, v17

    .line 224
    .line 225
    :cond_7
    cmpg-float v1, v17, v6

    .line 226
    .line 227
    if-nez v1, :cond_8

    .line 228
    .line 229
    move v8, v11

    .line 230
    :cond_8
    if-eqz v8, :cond_9

    .line 231
    .line 232
    move/from16 v17, v16

    .line 233
    .line 234
    :cond_9
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    return-object v1
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
.end method


# virtual methods
.method public calculateApproachOffset(F)F
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getPageSize$foundation_release()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/compose/foundation/pager/PagerState;->getPageSpacing$foundation_release()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v0, v1

    .line 14
    iget-object v1, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$decayAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v1, v2, p1}, Landroidx/compose/animation/core/DecayAnimationSpecKt;->calculateTargetValue(Landroidx/compose/animation/core/DecayAnimationSpec;FF)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    cmpg-float v2, p1, v2

    .line 22
    .line 23
    if-gez v2, :cond_0

    .line 24
    .line 25
    iget-object v2, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroidx/compose/foundation/pager/PagerState;->getFirstVisiblePage$foundation_release()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v2, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroidx/compose/foundation/pager/PagerState;->getFirstVisiblePage$foundation_release()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    :goto_0
    int-to-float v3, v0

    .line 41
    div-float/2addr v1, v3

    .line 42
    float-to-int v1, v1

    .line 43
    add-int/2addr v1, v2

    .line 44
    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 45
    .line 46
    invoke-virtual {v3}, Landroidx/compose/foundation/pager/PagerState;->getPageCount()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const/4 v9, 0x0

    .line 51
    invoke-static {v1, v9, v3}, Lkotlin/ranges/s;->I(III)I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerSnapDistance:Landroidx/compose/foundation/pager/PagerSnapDistance;

    .line 56
    .line 57
    iget-object v1, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/compose/foundation/pager/PagerState;->getPageSize$foundation_release()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    iget-object v1, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 64
    .line 65
    invoke-virtual {v1}, Landroidx/compose/foundation/pager/PagerState;->getPageSpacing$foundation_release()I

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    move v4, v2

    .line 70
    move v6, p1

    .line 71
    invoke-interface/range {v3 .. v8}, Landroidx/compose/foundation/pager/PagerSnapDistance;->calculateTargetPage(IIFII)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 76
    .line 77
    invoke-virtual {v3}, Landroidx/compose/foundation/pager/PagerState;->getPageCount()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-static {v1, v9, v3}, Lkotlin/ranges/s;->I(III)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    sub-int/2addr v1, v2

    .line 86
    mul-int/2addr v1, v0

    .line 87
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    sub-int/2addr v1, v0

    .line 92
    invoke-static {v1, v9}, Lkotlin/ranges/s;->u(II)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_1

    .line 97
    .line 98
    int-to-float p1, v0

    .line 99
    goto :goto_1

    .line 100
    :cond_1
    int-to-float v0, v0

    .line 101
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    mul-float/2addr p1, v0

    .line 106
    :goto_1
    return p1
.end method

.method public calculateSnappingOffset(F)F
    .locals 7

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->searchForSnappingBounds()Lkotlin/u0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lkotlin/u0;->component1()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0}, Lkotlin/u0;->component2()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v2, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 26
    .line 27
    invoke-static {v2}, Landroidx/compose/foundation/pager/PagerKt;->access$isScrollingForward(Landroidx/compose/foundation/pager/PagerState;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 32
    .line 33
    invoke-static {v3}, Landroidx/compose/foundation/pager/PagerKt;->access$dragGestureDelta(Landroidx/compose/foundation/pager/PagerState;)F

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-interface {v4}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getPageSize()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    int-to-float v4, v4

    .line 46
    div-float/2addr v3, v4

    .line 47
    float-to-int v4, v3

    .line 48
    int-to-float v4, v4

    .line 49
    sub-float/2addr v3, v4

    .line 50
    iget-object v4, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 51
    .line 52
    invoke-virtual {v4}, Landroidx/compose/foundation/pager/PagerState;->getDensity$foundation_release()Landroidx/compose/ui/unit/Density;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v4, p1}, Landroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt;->calculateFinalSnappingItem(Landroidx/compose/ui/unit/Density;F)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    sget-object v4, Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;->Companion:Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem$Companion;

    .line 61
    .line 62
    invoke-virtual {v4}, Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem$Companion;->getClosestItem-bbeMdSM()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    invoke-static {p1, v5}, Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;->equals-impl0(II)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    const/4 v6, 0x0

    .line 71
    if-eqz v5, :cond_2

    .line 72
    .line 73
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iget v3, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$snapPositionalThreshold:F

    .line 78
    .line 79
    cmpl-float p1, p1, v3

    .line 80
    .line 81
    if-lez p1, :cond_0

    .line 82
    .line 83
    if-eqz v2, :cond_6

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    iget-object p1, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 87
    .line 88
    invoke-virtual {p1}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPageOffsetFraction()F

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 97
    .line 98
    invoke-virtual {v3}, Landroidx/compose/foundation/pager/PagerState;->getPositionThresholdFraction$foundation_release()F

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    cmpl-float p1, p1, v3

    .line 107
    .line 108
    if-ltz p1, :cond_1

    .line 109
    .line 110
    if-eqz v2, :cond_3

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    cmpg-float p1, p1, v2

    .line 122
    .line 123
    if-gez p1, :cond_3

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    invoke-virtual {v4}, Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem$Companion;->getNextItem-bbeMdSM()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    invoke-static {p1, v2}, Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;->equals-impl0(II)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_4

    .line 135
    .line 136
    :cond_3
    :goto_0
    move v1, v0

    .line 137
    goto :goto_1

    .line 138
    :cond_4
    invoke-virtual {v4}, Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem$Companion;->getPreviousItem-bbeMdSM()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-static {p1, v0}, Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;->equals-impl0(II)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_5

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_5
    move v1, v6

    .line 150
    :cond_6
    :goto_1
    invoke-virtual {p0, v1}, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->isValidDistance(F)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_7

    .line 155
    .line 156
    move v6, v1

    .line 157
    :cond_7
    return v6
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

.method public final getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    move-result-object v0

    return-object v0
.end method

.method public final isValidDistance(F)Z
    .locals 3

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpg-float v0, p1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-nez v0, :cond_2

    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    cmpg-float p1, p1, v0

    if-nez p1, :cond_1

    move p1, v1

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    return v1
.end method
