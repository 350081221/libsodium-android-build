.class public final Landroidx/compose/foundation/lazy/LazyListMeasureResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
.implements Landroidx/compose/ui/layout/MeasureResult;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0007\n\u0002\u0008\n\n\u0002\u0010 \n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0087\u0001\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010M\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u001b\u0012\u0006\u0010$\u001a\u00020\u0007\u0012\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\n0&\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\u0006\u0010/\u001a\u00020\u0005\u0012\u0006\u00101\u001a\u00020\u0007\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00108\u001a\u00020\u0005\u0012\u0006\u0010:\u001a\u00020\u0005\u00a2\u0006\u0004\u0008N\u0010OJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0016\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R\u0017\u0010\"\u001a\u00020\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001d\u001a\u0004\u0008#\u0010\u001fR\u0017\u0010$\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010\u0016\u001a\u0004\u0008%\u0010\u0018R \u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\n0&8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\u001a\u0010+\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008+\u0010\u0010\u001a\u0004\u0008,\u0010\u0012R\u001a\u0010-\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008-\u0010\u0010\u001a\u0004\u0008.\u0010\u0012R\u001a\u0010/\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008/\u0010\u0010\u001a\u0004\u00080\u0010\u0012R\u001a\u00101\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00081\u0010\u0016\u001a\u0004\u00082\u0010\u0018R\u001a\u00104\u001a\u0002038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107R\u001a\u00108\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00088\u0010\u0010\u001a\u0004\u00089\u0010\u0012R\u001a\u0010:\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008:\u0010\u0010\u001a\u0004\u0008;\u0010\u0012R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00050<8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008>\u0010?R\u0014\u0010B\u001a\u00020\u00058\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010\u0012R\u0014\u0010D\u001a\u00020\u00058\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010\u0012R\u0011\u0010F\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008E\u0010\u0018R\u001a\u0010J\u001a\u00020G8VX\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008H\u0010IR\u0014\u0010L\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010\u0012\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006P"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/LazyListMeasureResult;",
        "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Lkotlin/r2;",
        "placeChildren",
        "",
        "delta",
        "",
        "updateAnimations",
        "tryToApplyScrollWithoutRemeasure",
        "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
        "firstVisibleItem",
        "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
        "getFirstVisibleItem",
        "()Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
        "firstVisibleItemScrollOffset",
        "I",
        "getFirstVisibleItemScrollOffset",
        "()I",
        "setFirstVisibleItemScrollOffset",
        "(I)V",
        "canScrollForward",
        "Z",
        "getCanScrollForward",
        "()Z",
        "setCanScrollForward",
        "(Z)V",
        "",
        "consumedScroll",
        "F",
        "getConsumedScroll",
        "()F",
        "setConsumedScroll",
        "(F)V",
        "scrollBackAmount",
        "getScrollBackAmount",
        "remeasureNeeded",
        "getRemeasureNeeded",
        "",
        "visibleItemsInfo",
        "Ljava/util/List;",
        "getVisibleItemsInfo",
        "()Ljava/util/List;",
        "viewportStartOffset",
        "getViewportStartOffset",
        "viewportEndOffset",
        "getViewportEndOffset",
        "totalItemsCount",
        "getTotalItemsCount",
        "reverseLayout",
        "getReverseLayout",
        "Landroidx/compose/foundation/gestures/Orientation;",
        "orientation",
        "Landroidx/compose/foundation/gestures/Orientation;",
        "getOrientation",
        "()Landroidx/compose/foundation/gestures/Orientation;",
        "afterContentPadding",
        "getAfterContentPadding",
        "mainAxisItemSpacing",
        "getMainAxisItemSpacing",
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
        "Landroidx/compose/ui/unit/IntSize;",
        "getViewportSize-YbymL2g",
        "()J",
        "viewportSize",
        "getBeforeContentPadding",
        "beforeContentPadding",
        "measureResult",
        "<init>",
        "(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V",
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
        "SMAP\nLazyListMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,124:1\n33#2,6:125\n*S KotlinDebug\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n*L\n110#1:125,6\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final synthetic $$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

.field private final afterContentPadding:I

.field private canScrollForward:Z

.field private consumedScroll:F

.field private final firstVisibleItem:Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private firstVisibleItemScrollOffset:I

.field private final mainAxisItemSpacing:I

.field private final orientation:Landroidx/compose/foundation/gestures/Orientation;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final remeasureNeeded:Z

.field private final reverseLayout:Z

.field private final scrollBackAmount:F

.field private final totalItemsCount:I

.field private final viewportEndOffset:I

.field private final viewportStartOffset:I

.field private final visibleItemsInfo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
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

.method public constructor <init>(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/layout/MeasureResult;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p8    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/foundation/gestures/Orientation;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            "IZF",
            "Landroidx/compose/ui/layout/MeasureResult;",
            "FZ",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;IIIZ",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->firstVisibleItem:Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 5
    .line 6
    iput p2, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->firstVisibleItemScrollOffset:I

    .line 7
    .line 8
    iput-boolean p3, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->canScrollForward:Z

    .line 9
    .line 10
    iput p4, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->consumedScroll:F

    .line 11
    .line 12
    iput p6, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->scrollBackAmount:F

    .line 13
    .line 14
    iput-boolean p7, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->remeasureNeeded:Z

    .line 15
    .line 16
    iput-object p8, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->visibleItemsInfo:Ljava/util/List;

    .line 17
    .line 18
    iput p9, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->viewportStartOffset:I

    .line 19
    .line 20
    iput p10, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->viewportEndOffset:I

    .line 21
    .line 22
    iput p11, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->totalItemsCount:I

    .line 23
    .line 24
    iput-boolean p12, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->reverseLayout:Z

    .line 25
    .line 26
    iput-object p13, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 27
    .line 28
    iput p14, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->afterContentPadding:I

    .line 29
    .line 30
    iput p15, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->mainAxisItemSpacing:I

    .line 31
    .line 32
    iput-object p5, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->$$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

    .line 33
    .line 34
    return-void
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


# virtual methods
.method public getAfterContentPadding()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->afterContentPadding:I

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

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->$$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->getAlignmentLines()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getBeforeContentPadding()I
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->getViewportStartOffset()I

    move-result v0

    neg-int v0, v0

    return v0
.end method

.method public final getCanScrollBackward()Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->firstVisibleItem:Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->firstVisibleItemScrollOffset:I

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final getCanScrollForward()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->canScrollForward:Z

    return v0
.end method

.method public final getConsumedScroll()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->consumedScroll:F

    return v0
.end method

.method public final getFirstVisibleItem()Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->firstVisibleItem:Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    return-object v0
.end method

.method public final getFirstVisibleItemScrollOffset()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->firstVisibleItemScrollOffset:I

    return v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->$$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    move-result v0

    return v0
.end method

.method public getMainAxisItemSpacing()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->mainAxisItemSpacing:I

    return v0
.end method

.method public getOrientation()Landroidx/compose/foundation/gestures/Orientation;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    return-object v0
.end method

.method public final getRemeasureNeeded()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->remeasureNeeded:Z

    return v0
.end method

.method public getReverseLayout()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->reverseLayout:Z

    return v0
.end method

.method public final getScrollBackAmount()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->scrollBackAmount:F

    return v0
.end method

.method public getTotalItemsCount()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->totalItemsCount:I

    return v0
.end method

.method public getViewportEndOffset()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->viewportEndOffset:I

    return v0
.end method

.method public getViewportSize-YbymL2g()J
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public getViewportStartOffset()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->viewportStartOffset:I

    return v0
.end method

.method public getVisibleItemsInfo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->visibleItemsInfo:Ljava/util/List;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->$$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    move-result v0

    return v0
.end method

.method public placeChildren()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->$$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->placeChildren()V

    return-void
.end method

.method public final setCanScrollForward(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->canScrollForward:Z

    return-void
.end method

.method public final setConsumedScroll(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->consumedScroll:F

    return-void
.end method

.method public final setFirstVisibleItemScrollOffset(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->firstVisibleItemScrollOffset:I

    return-void
.end method

.method public final tryToApplyScrollWithoutRemeasure(IZ)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->remeasureNeeded:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_7

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->getVisibleItemsInfo()Ljava/util/List;

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
    if-nez v0, :cond_7

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->firstVisibleItem:Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 17
    .line 18
    if-eqz v0, :cond_7

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSizeWithSpacings()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->firstVisibleItemScrollOffset:I

    .line 25
    .line 26
    sub-int/2addr v2, p1

    .line 27
    const/4 v3, 0x1

    .line 28
    if-ltz v2, :cond_0

    .line 29
    .line 30
    if-ge v2, v0, :cond_0

    .line 31
    .line 32
    move v0, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v0, v1

    .line 35
    :goto_0
    if-nez v0, :cond_1

    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->getVisibleItemsInfo()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lkotlin/collections/u;->y2(Ljava/util/List;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->getVisibleItemsInfo()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getNonScrollableItem()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_7

    .line 64
    .line 65
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getNonScrollableItem()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :cond_2
    if-gez p1, :cond_3

    .line 74
    .line 75
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getOffset()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSizeWithSpacings()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    add-int/2addr v4, v0

    .line 84
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->getViewportStartOffset()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    sub-int/2addr v4, v0

    .line 89
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getOffset()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSizeWithSpacings()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    add-int/2addr v0, v2

    .line 98
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->getViewportEndOffset()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    sub-int/2addr v0, v2

    .line 103
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    neg-int v2, p1

    .line 108
    if-le v0, v2, :cond_4

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->getViewportStartOffset()I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getOffset()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    sub-int/2addr v4, v0

    .line 120
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->getViewportEndOffset()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getOffset()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    sub-int/2addr v0, v2

    .line 129
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-le v0, p1, :cond_4

    .line 134
    .line 135
    :goto_1
    move v0, v3

    .line 136
    goto :goto_2

    .line 137
    :cond_4
    move v0, v1

    .line 138
    :goto_2
    if-eqz v0, :cond_7

    .line 139
    .line 140
    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->firstVisibleItemScrollOffset:I

    .line 141
    .line 142
    sub-int/2addr v0, p1

    .line 143
    iput v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->firstVisibleItemScrollOffset:I

    .line 144
    .line 145
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->getVisibleItemsInfo()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    :goto_3
    if-ge v1, v2, :cond_5

    .line 154
    .line 155
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    check-cast v4, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 160
    .line 161
    invoke-virtual {v4, p1, p2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->applyScrollDelta(IZ)V

    .line 162
    .line 163
    .line 164
    add-int/lit8 v1, v1, 0x1

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_5
    int-to-float p2, p1

    .line 168
    iput p2, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->consumedScroll:F

    .line 169
    .line 170
    iget-boolean p2, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->canScrollForward:Z

    .line 171
    .line 172
    if-nez p2, :cond_6

    .line 173
    .line 174
    if-lez p1, :cond_6

    .line 175
    .line 176
    iput-boolean v3, p0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;->canScrollForward:Z

    .line 177
    .line 178
    :cond_6
    move v1, v3

    .line 179
    :cond_7
    :goto_4
    return v1
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
