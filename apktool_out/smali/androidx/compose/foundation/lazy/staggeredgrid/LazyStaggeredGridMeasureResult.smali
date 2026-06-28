.class public final Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;
.implements Landroidx/compose/ui/layout/MeasureResult;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0085\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010!\u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020)0(\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00103\u001a\u00020\u0005\u0012\u0006\u00105\u001a\u00020\u0005\u0012\u0006\u00107\u001a\u00020\u0005\u0012\u0006\u00109\u001a\u00020\u0005\u0012\u0006\u0010;\u001a\u00020\u0005\u00a2\u0006\u0004\u0008M\u0010NJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u000e\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000b\u001a\u0004\u0008\u000f\u0010\rR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\u0017\u0010!\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001c\u001a\u0004\u0008!\u0010\u001eR\u0017\u0010\"\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001c\u001a\u0004\u0008#\u0010\u001eR\u001a\u0010$\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R \u0010*\u001a\u0008\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008*\u0010+\u001a\u0004\u0008,\u0010-R \u0010/\u001a\u00020.8\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102R\u001a\u00103\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00083\u0010%\u001a\u0004\u00084\u0010\'R\u001a\u00105\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00085\u0010%\u001a\u0004\u00086\u0010\'R\u001a\u00107\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00087\u0010%\u001a\u0004\u00088\u0010\'R\u001a\u00109\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00089\u0010%\u001a\u0004\u0008:\u0010\'R\u001a\u0010;\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008;\u0010%\u001a\u0004\u0008<\u0010\'R\u001a\u0010>\u001a\u00020=8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008>\u0010?\u001a\u0004\u0008@\u0010AR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00050B8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010ER\u0014\u0010H\u001a\u00020\u00058\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010\'R\u0014\u0010J\u001a\u00020\u00058\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010\'R\u0011\u0010L\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010\u001e\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006O"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Lkotlin/r2;",
        "placeChildren",
        "",
        "delta",
        "",
        "tryToApplyScrollWithoutRemeasure",
        "",
        "firstVisibleItemIndices",
        "[I",
        "getFirstVisibleItemIndices",
        "()[I",
        "firstVisibleItemScrollOffsets",
        "getFirstVisibleItemScrollOffsets",
        "",
        "consumedScroll",
        "F",
        "getConsumedScroll",
        "()F",
        "setConsumedScroll",
        "(F)V",
        "measureResult",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "getMeasureResult",
        "()Landroidx/compose/ui/layout/MeasureResult;",
        "canScrollForward",
        "Z",
        "getCanScrollForward",
        "()Z",
        "setCanScrollForward",
        "(Z)V",
        "isVertical",
        "remeasureNeeded",
        "getRemeasureNeeded",
        "totalItemsCount",
        "I",
        "getTotalItemsCount",
        "()I",
        "",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
        "visibleItemsInfo",
        "Ljava/util/List;",
        "getVisibleItemsInfo",
        "()Ljava/util/List;",
        "Landroidx/compose/ui/unit/IntSize;",
        "viewportSize",
        "J",
        "getViewportSize-YbymL2g",
        "()J",
        "viewportStartOffset",
        "getViewportStartOffset",
        "viewportEndOffset",
        "getViewportEndOffset",
        "beforeContentPadding",
        "getBeforeContentPadding",
        "afterContentPadding",
        "getAfterContentPadding",
        "mainAxisItemSpacing",
        "getMainAxisItemSpacing",
        "Landroidx/compose/foundation/gestures/Orientation;",
        "orientation",
        "Landroidx/compose/foundation/gestures/Orientation;",
        "getOrientation",
        "()Landroidx/compose/foundation/gestures/Orientation;",
        "",
        "Landroidx/compose/ui/layout/AlignmentLine;",
        "getAlignmentLines",
        "()Ljava/util/Map;",
        "alignmentLines",
        "getHeight",
        "height",
        "getWidth",
        "width",
        "getCanScrollBackward",
        "canScrollBackward",
        "<init>",
        "([I[IFLandroidx/compose/ui/layout/MeasureResult;ZZZILjava/util/List;JIIIIILkotlin/jvm/internal/w;)V",
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
        "SMAP\nLazyStaggeredGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,249:1\n33#2,6:250\n33#2,6:256\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n*L\n181#1:250,6\n214#1:256,6\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final afterContentPadding:I

.field private final beforeContentPadding:I

.field private canScrollForward:Z

.field private consumedScroll:F

.field private final firstVisibleItemIndices:[I
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final firstVisibleItemScrollOffsets:[I
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final isVertical:Z

.field private final mainAxisItemSpacing:I

.field private final measureResult:Landroidx/compose/ui/layout/MeasureResult;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final orientation:Landroidx/compose/foundation/gestures/Orientation;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final remeasureNeeded:Z

.field private final totalItemsCount:I

.field private final viewportEndOffset:I

.field private final viewportSize:J

.field private final viewportStartOffset:I

.field private final visibleItemsInfo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>([I[IFLandroidx/compose/ui/layout/MeasureResult;ZZZILjava/util/List;JIIIII)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I[IF",
            "Landroidx/compose/ui/layout/MeasureResult;",
            "ZZZI",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
            ">;JIIIII)V"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    move v1, p6

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    move-object v2, p1

    .line 7
    iput-object v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->firstVisibleItemIndices:[I

    .line 8
    .line 9
    move-object v2, p2

    .line 10
    iput-object v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->firstVisibleItemScrollOffsets:[I

    .line 11
    .line 12
    move v2, p3

    .line 13
    iput v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->consumedScroll:F

    .line 14
    .line 15
    move-object v2, p4

    .line 16
    iput-object v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->measureResult:Landroidx/compose/ui/layout/MeasureResult;

    .line 17
    .line 18
    move v2, p5

    .line 19
    iput-boolean v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->canScrollForward:Z

    .line 20
    .line 21
    iput-boolean v1, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->isVertical:Z

    .line 22
    .line 23
    move v2, p7

    .line 24
    iput-boolean v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->remeasureNeeded:Z

    .line 25
    .line 26
    move v2, p8

    .line 27
    iput v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->totalItemsCount:I

    .line 28
    .line 29
    move-object v2, p9

    .line 30
    iput-object v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->visibleItemsInfo:Ljava/util/List;

    .line 31
    .line 32
    move-wide v2, p10

    .line 33
    iput-wide v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->viewportSize:J

    .line 34
    .line 35
    move/from16 v2, p12

    .line 36
    .line 37
    iput v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->viewportStartOffset:I

    .line 38
    .line 39
    move/from16 v2, p13

    .line 40
    .line 41
    iput v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->viewportEndOffset:I

    .line 42
    .line 43
    move/from16 v2, p14

    .line 44
    .line 45
    iput v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->beforeContentPadding:I

    .line 46
    .line 47
    move/from16 v2, p15

    .line 48
    .line 49
    iput v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->afterContentPadding:I

    .line 50
    .line 51
    move/from16 v2, p16

    .line 52
    .line 53
    iput v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->mainAxisItemSpacing:I

    .line 54
    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 61
    .line 62
    :goto_0
    iput-object v1, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 63
    .line 64
    return-void
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
.end method

.method public synthetic constructor <init>([I[IFLandroidx/compose/ui/layout/MeasureResult;ZZZILjava/util/List;JIIIIILkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct/range {p0 .. p16}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;-><init>([I[IFLandroidx/compose/ui/layout/MeasureResult;ZZZILjava/util/List;JIIIII)V

    return-void
.end method


# virtual methods
.method public getAfterContentPadding()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->afterContentPadding:I

    return v0
.end method

.method public getAlignmentLines()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/AlignmentLine;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->measureResult:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->getAlignmentLines()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getBeforeContentPadding()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->beforeContentPadding:I

    return v0
.end method

.method public final getCanScrollBackward()Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->firstVisibleItemIndices:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->firstVisibleItemScrollOffsets:[I

    aget v0, v0, v1

    if-lez v0, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final getCanScrollForward()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->canScrollForward:Z

    return v0
.end method

.method public final getConsumedScroll()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->consumedScroll:F

    return v0
.end method

.method public final getFirstVisibleItemIndices()[I
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->firstVisibleItemIndices:[I

    return-object v0
.end method

.method public final getFirstVisibleItemScrollOffsets()[I
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->firstVisibleItemScrollOffsets:[I

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->measureResult:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    move-result v0

    return v0
.end method

.method public getMainAxisItemSpacing()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->mainAxisItemSpacing:I

    return v0
.end method

.method public final getMeasureResult()Landroidx/compose/ui/layout/MeasureResult;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->measureResult:Landroidx/compose/ui/layout/MeasureResult;

    return-object v0
.end method

.method public getOrientation()Landroidx/compose/foundation/gestures/Orientation;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    return-object v0
.end method

.method public final getRemeasureNeeded()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->remeasureNeeded:Z

    return v0
.end method

.method public getTotalItemsCount()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->totalItemsCount:I

    return v0
.end method

.method public getViewportEndOffset()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->viewportEndOffset:I

    return v0
.end method

.method public getViewportSize-YbymL2g()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->viewportSize:J

    return-wide v0
.end method

.method public getViewportStartOffset()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->viewportStartOffset:I

    return v0
.end method

.method public getVisibleItemsInfo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->visibleItemsInfo:Ljava/util/List;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->measureResult:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    move-result v0

    return v0
.end method

.method public final isVertical()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->isVertical:Z

    return v0
.end method

.method public placeChildren()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->measureResult:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->placeChildren()V

    return-void
.end method

.method public final setCanScrollForward(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->canScrollForward:Z

    return-void
.end method

.method public final setConsumedScroll(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->consumedScroll:F

    return-void
.end method

.method public final tryToApplyScrollWithoutRemeasure(I)Z
    .locals 8

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->remeasureNeeded:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_11

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getVisibleItemsInfo()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_11

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->firstVisibleItemIndices:[I

    .line 17
    .line 18
    array-length v0, v0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    move v0, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v0, v1

    .line 25
    :goto_0
    if-nez v0, :cond_11

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->firstVisibleItemScrollOffsets:[I

    .line 28
    .line 29
    array-length v0, v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    move v0, v2

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v0, v1

    .line 35
    :goto_1
    if-eqz v0, :cond_2

    .line 36
    .line 37
    goto/16 :goto_c

    .line 38
    .line 39
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getVisibleItemsInfo()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    move v4, v1

    .line 48
    :goto_2
    if-ge v4, v3, :cond_d

    .line 49
    .line 50
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    .line 55
    .line 56
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getNonScrollableItem()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-nez v6, :cond_c

    .line 61
    .line 62
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getMainAxisOffset()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-gtz v6, :cond_3

    .line 67
    .line 68
    move v6, v2

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    move v6, v1

    .line 71
    :goto_3
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getMainAxisOffset()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    add-int/2addr v7, p1

    .line 76
    if-gtz v7, :cond_4

    .line 77
    .line 78
    move v7, v2

    .line 79
    goto :goto_4

    .line 80
    :cond_4
    move v7, v1

    .line 81
    :goto_4
    if-eq v6, v7, :cond_5

    .line 82
    .line 83
    goto/16 :goto_9

    .line 84
    .line 85
    :cond_5
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getMainAxisOffset()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getViewportStartOffset()I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-gt v6, v7, :cond_8

    .line 94
    .line 95
    if-gez p1, :cond_6

    .line 96
    .line 97
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getMainAxisOffset()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    add-int/2addr v6, v7

    .line 106
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getViewportStartOffset()I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    sub-int/2addr v6, v7

    .line 111
    neg-int v7, p1

    .line 112
    if-le v6, v7, :cond_7

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_6
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getViewportStartOffset()I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getMainAxisOffset()I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    sub-int/2addr v6, v7

    .line 124
    if-le v6, p1, :cond_7

    .line 125
    .line 126
    :goto_5
    move v6, v2

    .line 127
    goto :goto_6

    .line 128
    :cond_7
    move v6, v1

    .line 129
    :goto_6
    if-nez v6, :cond_8

    .line 130
    .line 131
    return v1

    .line 132
    :cond_8
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getMainAxisOffset()I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    add-int/2addr v6, v7

    .line 141
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getViewportEndOffset()I

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-lt v6, v7, :cond_b

    .line 146
    .line 147
    if-gez p1, :cond_9

    .line 148
    .line 149
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getMainAxisOffset()I

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    add-int/2addr v6, v5

    .line 158
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getViewportEndOffset()I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    sub-int/2addr v6, v5

    .line 163
    neg-int v5, p1

    .line 164
    if-le v6, v5, :cond_a

    .line 165
    .line 166
    goto :goto_7

    .line 167
    :cond_9
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getViewportEndOffset()I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getMainAxisOffset()I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    sub-int/2addr v6, v5

    .line 176
    if-le v6, p1, :cond_a

    .line 177
    .line 178
    :goto_7
    move v5, v2

    .line 179
    goto :goto_8

    .line 180
    :cond_a
    move v5, v1

    .line 181
    :goto_8
    if-nez v5, :cond_b

    .line 182
    .line 183
    return v1

    .line 184
    :cond_b
    add-int/lit8 v4, v4, 0x1

    .line 185
    .line 186
    goto/16 :goto_2

    .line 187
    .line 188
    :cond_c
    :goto_9
    return v1

    .line 189
    :cond_d
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->firstVisibleItemScrollOffsets:[I

    .line 190
    .line 191
    array-length v0, v0

    .line 192
    move v3, v1

    .line 193
    :goto_a
    if-ge v3, v0, :cond_e

    .line 194
    .line 195
    iget-object v4, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->firstVisibleItemScrollOffsets:[I

    .line 196
    .line 197
    aget v5, v4, v3

    .line 198
    .line 199
    sub-int/2addr v5, p1

    .line 200
    aput v5, v4, v3

    .line 201
    .line 202
    add-int/lit8 v3, v3, 0x1

    .line 203
    .line 204
    goto :goto_a

    .line 205
    :cond_e
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getVisibleItemsInfo()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    :goto_b
    if-ge v1, v3, :cond_f

    .line 214
    .line 215
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    check-cast v4, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    .line 220
    .line 221
    invoke-virtual {v4, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->applyScrollDelta(I)V

    .line 222
    .line 223
    .line 224
    add-int/lit8 v1, v1, 0x1

    .line 225
    .line 226
    goto :goto_b

    .line 227
    :cond_f
    int-to-float v0, p1

    .line 228
    iput v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->consumedScroll:F

    .line 229
    .line 230
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->canScrollForward:Z

    .line 231
    .line 232
    if-nez v0, :cond_10

    .line 233
    .line 234
    if-lez p1, :cond_10

    .line 235
    .line 236
    iput-boolean v2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->canScrollForward:Z

    .line 237
    .line 238
    :cond_10
    return v2

    .line 239
    :cond_11
    :goto_c
    return v1
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
