.class public final Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/RememberObserver;
.implements Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$Prefetcher;
.implements Ljava/lang/Runnable;
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$Companion;,
        Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00029:B\'\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u00087\u00108J \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u0005H\u0002J\u0008\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\"\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0008\u0010\u001a\u001a\u00020\u000eH\u0016J\u0008\u0010\u001b\u001a\u00020\u000eH\u0016J\u0008\u0010\u001c\u001a\u00020\u000eH\u0016R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u001a\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0016\u0010-\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0016\u0010/\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u0010.R\u0016\u00100\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u001c\u00104\u001a\n 3*\u0004\u0018\u000102028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0016\u00106\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00086\u00101\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006;"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;",
        "Landroidx/compose/runtime/RememberObserver;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$Prefetcher;",
        "Ljava/lang/Runnable;",
        "Landroid/view/Choreographer$FrameCallback;",
        "",
        "now",
        "nextFrame",
        "average",
        "",
        "enoughTimeLeft",
        "new",
        "current",
        "calculateAverageTime",
        "Lkotlin/r2;",
        "run",
        "frameTimeNanos",
        "doFrame",
        "",
        "index",
        "Landroidx/compose/ui/unit/Constraints;",
        "constraints",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;",
        "schedulePrefetch-0kLqBqw",
        "(IJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;",
        "schedulePrefetch",
        "onRemembered",
        "onForgotten",
        "onAbandoned",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;",
        "prefetchState",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;",
        "Landroidx/compose/ui/layout/SubcomposeLayoutState;",
        "subcomposeLayoutState",
        "Landroidx/compose/ui/layout/SubcomposeLayoutState;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;",
        "itemContentFactory",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;",
        "Landroid/view/View;",
        "view",
        "Landroid/view/View;",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;",
        "prefetchRequests",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "averagePrecomposeTimeNs",
        "J",
        "averagePremeasureTimeNs",
        "prefetchScheduled",
        "Z",
        "Landroid/view/Choreographer;",
        "kotlin.jvm.PlatformType",
        "choreographer",
        "Landroid/view/Choreographer;",
        "isActive",
        "<init>",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroid/view/View;)V",
        "Companion",
        "PrefetchRequest",
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
        "SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,319:1\n1208#2:320\n1187#2,2:321\n523#3:323\n26#4,5:324\n26#4,5:330\n1#5:329\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n*L\n122#1:320\n122#1:321,2\n160#1:323\n165#1:324,5\n187#1:330,5\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static frameIntervalNs:J


# instance fields
.field private averagePrecomposeTimeNs:J

.field private averagePremeasureTimeNs:J

.field private final choreographer:Landroid/view/Choreographer;

.field private isActive:Z

.field private final itemContentFactory:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final prefetchRequests:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private prefetchScheduled:Z

.field private final prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final subcomposeLayoutState:Landroidx/compose/ui/layout/SubcomposeLayoutState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final view:Landroid/view/View;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->Companion:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$Companion;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroid/view/View;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/layout/SubcomposeLayoutState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->subcomposeLayoutState:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->itemContentFactory:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->view:Landroid/view/View;

    .line 11
    .line 12
    new-instance p1, Landroidx/compose/runtime/collection/MutableVector;

    .line 13
    .line 14
    const/16 p2, 0x10

    .line 15
    .line 16
    new-array p2, p2, [Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;

    .line 17
    .line 18
    const/4 p3, 0x0

    .line 19
    invoke-direct {p1, p2, p3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->prefetchRequests:Landroidx/compose/runtime/collection/MutableVector;

    .line 23
    .line 24
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->choreographer:Landroid/view/Choreographer;

    .line 29
    .line 30
    sget-object p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->Companion:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$Companion;

    .line 31
    .line 32
    invoke-static {p1, p4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$Companion;->access$calculateFrameIntervalIfNeeded(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$Companion;Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    return-void
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

.method public static final synthetic access$getFrameIntervalNs$cp()J
    .locals 2

    sget-wide v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->frameIntervalNs:J

    return-wide v0
.end method

.method public static final synthetic access$setFrameIntervalNs$cp(J)V
    .locals 0

    sput-wide p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->frameIntervalNs:J

    return-void
.end method

.method private final calculateAverageTime(JJ)J
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    int-to-long v0, v0

    div-long/2addr p3, v0

    const/4 v2, 0x3

    int-to-long v2, v2

    mul-long/2addr p3, v2

    div-long/2addr p1, v0

    add-long/2addr p1, p3

    :goto_0
    return-wide p1
.end method

.method private final enoughTimeLeft(JJJ)Z
    .locals 0

    add-long/2addr p1, p5

    cmp-long p1, p1, p3

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public doFrame(J)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->isActive:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->view:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
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
.end method

.method public onAbandoned()V
    .locals 0

    return-void
.end method

.method public onForgotten()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->isActive:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;->setPrefetcher$foundation_release(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$Prefetcher;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->view:Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->choreographer:Landroid/view/Choreographer;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 18
    .line 19
    .line 20
    return-void
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
.end method

.method public onRemembered()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;->setPrefetcher$foundation_release(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$Prefetcher;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->isActive:Z

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public run()V
    .locals 18

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    iget-object v0, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->prefetchRequests:Landroidx/compose/runtime/collection/MutableVector;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v9, 0x0

    .line 10
    if-nez v0, :cond_e

    .line 11
    .line 12
    iget-boolean v0, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->prefetchScheduled:Z

    .line 13
    .line 14
    if-eqz v0, :cond_e

    .line 15
    .line 16
    iget-boolean v0, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->isActive:Z

    .line 17
    .line 18
    if-eqz v0, :cond_e

    .line 19
    .line 20
    iget-object v0, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->view:Landroid/view/View;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getWindowVisibility()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto/16 :goto_a

    .line 29
    .line 30
    :cond_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 31
    .line 32
    iget-object v1, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->view:Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/view/View;->getDrawingTime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    sget-wide v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->frameIntervalNs:J

    .line 43
    .line 44
    add-long v10, v0, v2

    .line 45
    .line 46
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    cmp-long v0, v0, v10

    .line 51
    .line 52
    const/4 v12, 0x1

    .line 53
    if-lez v0, :cond_1

    .line 54
    .line 55
    move v0, v12

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move v0, v9

    .line 58
    :goto_0
    move v13, v9

    .line 59
    :goto_1
    iget-object v1, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->prefetchRequests:Landroidx/compose/runtime/collection/MutableVector;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->isNotEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_c

    .line 66
    .line 67
    if-nez v13, :cond_c

    .line 68
    .line 69
    iget-object v1, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->prefetchRequests:Landroidx/compose/runtime/collection/MutableVector;

    .line 70
    .line 71
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    aget-object v1, v1, v9

    .line 76
    .line 77
    move-object v14, v1

    .line 78
    check-cast v14, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;

    .line 79
    .line 80
    iget-object v1, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->itemContentFactory:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;

    .line 81
    .line 82
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;->getItemProvider()Lv3/a;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-interface {v1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    move-object v15, v1

    .line 91
    check-cast v15, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;

    .line 92
    .line 93
    invoke-virtual {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;->getCanceled()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_b

    .line 98
    .line 99
    invoke-interface {v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;->getItemCount()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-virtual {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;->getIndex()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-ltz v2, :cond_2

    .line 108
    .line 109
    if-ge v2, v1, :cond_2

    .line 110
    .line 111
    move v1, v12

    .line 112
    goto :goto_2

    .line 113
    :cond_2
    move v1, v9

    .line 114
    :goto_2
    if-nez v1, :cond_3

    .line 115
    .line 116
    goto/16 :goto_8

    .line 117
    .line 118
    :cond_3
    invoke-virtual {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;->getPrecomposeHandle()Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-nez v1, :cond_6

    .line 123
    .line 124
    const-string v1, "compose:lazylist:prefetch:compose"

    .line 125
    .line 126
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :try_start_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 130
    .line 131
    .line 132
    move-result-wide v16

    .line 133
    iget-wide v6, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->averagePrecomposeTimeNs:J

    .line 134
    .line 135
    move-object/from16 v1, p0

    .line 136
    .line 137
    move-wide/from16 v2, v16

    .line 138
    .line 139
    move-wide v4, v10

    .line 140
    invoke-direct/range {v1 .. v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->enoughTimeLeft(JJJ)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-nez v1, :cond_5

    .line 145
    .line 146
    if-eqz v0, :cond_4

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_4
    move v13, v12

    .line 150
    goto :goto_4

    .line 151
    :cond_5
    :goto_3
    invoke-virtual {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;->getIndex()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    invoke-interface {v15, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;->getKey(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;->getIndex()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-interface {v15, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;->getContentType(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iget-object v2, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->itemContentFactory:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;

    .line 168
    .line 169
    invoke-virtual {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;->getIndex()I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    invoke-virtual {v2, v3, v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;->getContent(ILjava/lang/Object;Ljava/lang/Object;)Lv3/p;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    iget-object v2, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->subcomposeLayoutState:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    .line 178
    .line 179
    invoke-virtual {v2, v0, v1}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->precompose(Ljava/lang/Object;Lv3/p;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v14, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;->setPrecomposeHandle(Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;)V

    .line 184
    .line 185
    .line 186
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 187
    .line 188
    .line 189
    move-result-wide v0

    .line 190
    sub-long v0, v0, v16

    .line 191
    .line 192
    iget-wide v2, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->averagePrecomposeTimeNs:J

    .line 193
    .line 194
    invoke-direct {v8, v0, v1, v2, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->calculateAverageTime(JJ)J

    .line 195
    .line 196
    .line 197
    move-result-wide v0

    .line 198
    iput-wide v0, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->averagePrecomposeTimeNs:J

    .line 199
    .line 200
    move v0, v9

    .line 201
    :goto_4
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    .line 203
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_1

    .line 207
    .line 208
    :catchall_0
    move-exception v0

    .line 209
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 210
    .line 211
    .line 212
    throw v0

    .line 213
    :cond_6
    invoke-virtual {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;->getMeasured()Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    xor-int/2addr v1, v12

    .line 218
    if-eqz v1, :cond_a

    .line 219
    .line 220
    const-string v1, "compose:lazylist:prefetch:measure"

    .line 221
    .line 222
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    :try_start_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 226
    .line 227
    .line 228
    move-result-wide v15

    .line 229
    iget-wide v6, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->averagePremeasureTimeNs:J

    .line 230
    .line 231
    move-object/from16 v1, p0

    .line 232
    .line 233
    move-wide v2, v15

    .line 234
    move-wide v4, v10

    .line 235
    invoke-direct/range {v1 .. v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->enoughTimeLeft(JJJ)Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-nez v1, :cond_8

    .line 240
    .line 241
    if-eqz v0, :cond_7

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_7
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 245
    .line 246
    move v13, v12

    .line 247
    goto :goto_7

    .line 248
    :cond_8
    :goto_5
    invoke-virtual {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;->getPrecomposeHandle()Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-interface {v0}, Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;->getPlaceablesCount()I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    move v2, v9

    .line 260
    :goto_6
    if-ge v2, v1, :cond_9

    .line 261
    .line 262
    invoke-virtual {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;->getConstraints-msEJaDk()J

    .line 263
    .line 264
    .line 265
    move-result-wide v3

    .line 266
    invoke-interface {v0, v2, v3, v4}, Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;->premeasure-0kLqBqw(IJ)V

    .line 267
    .line 268
    .line 269
    add-int/lit8 v2, v2, 0x1

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_9
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 273
    .line 274
    .line 275
    move-result-wide v0

    .line 276
    sub-long/2addr v0, v15

    .line 277
    iget-wide v2, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->averagePremeasureTimeNs:J

    .line 278
    .line 279
    invoke-direct {v8, v0, v1, v2, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->calculateAverageTime(JJ)J

    .line 280
    .line 281
    .line 282
    move-result-wide v0

    .line 283
    iput-wide v0, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->averagePremeasureTimeNs:J

    .line 284
    .line 285
    iget-object v0, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->prefetchRequests:Landroidx/compose/runtime/collection/MutableVector;

    .line 286
    .line 287
    invoke-virtual {v0, v9}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 288
    .line 289
    .line 290
    move v0, v9

    .line 291
    :goto_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 292
    .line 293
    .line 294
    goto/16 :goto_1

    .line 295
    .line 296
    :catchall_1
    move-exception v0

    .line 297
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 298
    .line 299
    .line 300
    throw v0

    .line 301
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 302
    .line 303
    const-string v1, "request already measured"

    .line 304
    .line 305
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw v0

    .line 313
    :cond_b
    :goto_8
    iget-object v1, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->prefetchRequests:Landroidx/compose/runtime/collection/MutableVector;

    .line 314
    .line 315
    invoke-virtual {v1, v9}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    goto/16 :goto_1

    .line 319
    .line 320
    :cond_c
    if-eqz v13, :cond_d

    .line 321
    .line 322
    iget-object v0, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->choreographer:Landroid/view/Choreographer;

    .line 323
    .line 324
    invoke-virtual {v0, v8}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 325
    .line 326
    .line 327
    goto :goto_9

    .line 328
    :cond_d
    iput-boolean v9, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->prefetchScheduled:Z

    .line 329
    .line 330
    :goto_9
    return-void

    .line 331
    :cond_e
    :goto_a
    iput-boolean v9, v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->prefetchScheduled:Z

    .line 332
    .line 333
    return-void
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

.method public schedulePrefetch-0kLqBqw(IJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, p2, p3, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;-><init>(IJLkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->prefetchRequests:Landroidx/compose/runtime/collection/MutableVector;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-boolean p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->prefetchScheduled:Z

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->prefetchScheduled:Z

    .line 18
    .line 19
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;->view:Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object v0
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
.end method
