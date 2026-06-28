.class public final Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/material3/pulltorefresh/PullToRefreshState;


# annotations
.annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 ;2\u00020\u0001:\u0001;B%\u0012\u0006\u00106\u001a\u00020\'\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020\'07\u00a2\u0006\u0004\u00089\u0010:J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\rJ\u0006\u0010\u0010\u001a\u00020\nR\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR+\u0010\"\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010\u0014\"\u0004\u0008 \u0010!R+\u0010&\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008#\u0010\u001e\u001a\u0004\u0008$\u0010\u0014\"\u0004\u0008%\u0010!R+\u0010.\u001a\u00020\'2\u0006\u0010\u001c\u001a\u00020\'8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-R\u0014\u00100\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010\u0014R\u0014\u00102\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00081\u0010\u0014R\u0014\u00104\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00083\u0010\u0014R\u0014\u00105\u001a\u00020\'8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00085\u0010+\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006<"
    }
    d2 = {
        "Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;",
        "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;",
        "Lkotlin/r2;",
        "startRefresh",
        "endRefresh",
        "Landroidx/compose/ui/geometry/Offset;",
        "available",
        "consumeAvailableOffset-MK-Hz9U",
        "(J)J",
        "consumeAvailableOffset",
        "",
        "velocity",
        "onRelease",
        "(FLkotlin/coroutines/d;)Ljava/lang/Object;",
        "offset",
        "animateTo",
        "calculateVerticalOffset",
        "positionalThreshold",
        "F",
        "getPositionalThreshold",
        "()F",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
        "nestedScrollConnection",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
        "getNestedScrollConnection",
        "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
        "setNestedScrollConnection",
        "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V",
        "<set-?>",
        "distancePulled$delegate",
        "Landroidx/compose/runtime/MutableFloatState;",
        "getDistancePulled$material3_release",
        "setDistancePulled$material3_release",
        "(F)V",
        "distancePulled",
        "_verticalOffset$delegate",
        "get_verticalOffset",
        "set_verticalOffset",
        "_verticalOffset",
        "",
        "_refreshing$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "get_refreshing",
        "()Z",
        "set_refreshing",
        "(Z)V",
        "_refreshing",
        "getAdjustedDistancePulled",
        "adjustedDistancePulled",
        "getProgress",
        "progress",
        "getVerticalOffset",
        "verticalOffset",
        "isRefreshing",
        "initialRefreshing",
        "Lkotlin/Function0;",
        "enabled",
        "<init>",
        "(ZFLv3/a;)V",
        "Companion",
        "material3_release"
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
        "SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,558:1\n76#2:559\n109#2,2:560\n76#2:562\n109#2,2:563\n81#3:565\n107#3,2:566\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl\n*L\n417#1:559\n417#1:560,2\n419#1:562\n419#1:563,2\n420#1:565\n420#1:566,2\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final _refreshing$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final _verticalOffset$delegate:Landroidx/compose/runtime/MutableFloatState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final distancePulled$delegate:Landroidx/compose/runtime/MutableFloatState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private nestedScrollConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final positionalThreshold:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->Companion:Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$Companion;

    return-void
.end method

.method public constructor <init>(ZFLv3/a;)V
    .locals 0
    .param p3    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZF",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->positionalThreshold:F

    .line 5
    .line 6
    new-instance p2, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$nestedScrollConnection$1;

    .line 7
    .line 8
    invoke-direct {p2, p3, p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$nestedScrollConnection$1;-><init>(Lv3/a;Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->nestedScrollConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-static {p2}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    iput-object p3, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->distancePulled$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 19
    .line 20
    invoke-static {p2}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->_verticalOffset$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 p2, 0x0

    .line 31
    const/4 p3, 0x2

    .line 32
    invoke-static {p1, p2, p3, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->_refreshing$delegate:Landroidx/compose/runtime/MutableState;

    .line 37
    .line 38
    return-void
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
.end method

.method public static final synthetic access$set_verticalOffset(Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;F)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->set_verticalOffset(F)V

    return-void
.end method

.method private final getAdjustedDistancePulled()F
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->getDistancePulled$material3_release()F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    return v0
.end method

.method private final get_refreshing()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->_refreshing$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method private final get_verticalOffset()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->_verticalOffset$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/FloatState;->getFloatValue()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
    .line 9
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

.method private final set_refreshing(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->_refreshing$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
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

.method private final set_verticalOffset(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->_verticalOffset$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableFloatState;->setFloatValue(F)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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


# virtual methods
.method public final animateTo(FLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 8
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-direct {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->get_verticalOffset()F

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$animateTo$2;

    invoke-direct {v4, p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$animateTo$2;-><init>(Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    move v1, p1

    move-object v5, p2

    invoke-static/range {v0 .. v7}, Landroidx/compose/animation/core/SuspendAnimationKt;->animate$default(FFFLandroidx/compose/animation/core/AnimationSpec;Lv3/p;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final calculateVerticalOffset()F
    .locals 5

    .line 1
    invoke-direct {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->getAdjustedDistancePulled()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->getPositionalThreshold()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    cmpg-float v0, v0, v1

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->getAdjustedDistancePulled()F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->getProgress()F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/high16 v1, 0x3f800000    # 1.0f

    .line 27
    .line 28
    sub-float/2addr v0, v1

    .line 29
    const/4 v1, 0x0

    .line 30
    const/high16 v2, 0x40000000    # 2.0f

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Lkotlin/ranges/s;->H(FFF)F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    float-to-double v1, v0

    .line 37
    const/4 v3, 0x2

    .line 38
    int-to-double v3, v3

    .line 39
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    double-to-float v1, v1

    .line 44
    const/4 v2, 0x4

    .line 45
    int-to-float v2, v2

    .line 46
    div-float/2addr v1, v2

    .line 47
    sub-float/2addr v0, v1

    .line 48
    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->getPositionalThreshold()F

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    mul-float/2addr v1, v0

    .line 53
    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->getPositionalThreshold()F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    add-float/2addr v0, v1

    .line 58
    :goto_0
    return v0
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

.method public final consumeAvailableOffset-MK-Hz9U(J)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->isRefreshing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move p2, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->getDistancePulled$material3_release()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    add-float/2addr v0, p1

    .line 19
    invoke-static {v0, v1}, Lkotlin/ranges/s;->t(FF)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->getDistancePulled$material3_release()F

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    sub-float p2, p1, p2

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->setDistancePulled$material3_release(F)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->calculateVerticalOffset()F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-direct {p0, p1}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->set_verticalOffset(F)V

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-static {v1, p2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 40
    .line 41
    .line 42
    move-result-wide p1

    .line 43
    return-wide p1
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
.end method

.method public endRefresh()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->set_verticalOffset(F)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, v0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->set_refreshing(Z)V

    .line 7
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

.method public final getDistancePulled$material3_release()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->distancePulled$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/FloatState;->getFloatValue()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
    .line 9
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

.method public getNestedScrollConnection()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->nestedScrollConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    return-object v0
.end method

.method public getPositionalThreshold()F
    .locals 1

    iget v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->positionalThreshold:F

    return v0
.end method

.method public getProgress()F
    .locals 2

    invoke-direct {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->getAdjustedDistancePulled()F

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->getPositionalThreshold()F

    move-result v1

    div-float/2addr v0, v1

    return v0
.end method

.method public getVerticalOffset()F
    .locals 1

    invoke-direct {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->get_verticalOffset()F

    move-result v0

    return v0
.end method

.method public isRefreshing()Z
    .locals 1

    invoke-direct {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->get_refreshing()Z

    move-result v0

    return v0
.end method

.method public final onRelease(FLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 5
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lkotlin/coroutines/d<",
            "-",
            "Ljava/lang/Float;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$onRelease$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$onRelease$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$onRelease$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$onRelease$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$onRelease$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$onRelease$1;-><init>(Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$onRelease$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$onRelease$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget p1, v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$onRelease$1;->F$0:F

    .line 40
    .line 41
    iget-object v0, v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$onRelease$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;

    .line 44
    .line 45
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->isRefreshing()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_3

    .line 65
    .line 66
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :cond_3
    invoke-direct {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->getAdjustedDistancePulled()F

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->getPositionalThreshold()F

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    cmpl-float p2, p2, v2

    .line 80
    .line 81
    if-lez p2, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->startRefresh()V

    .line 84
    .line 85
    .line 86
    :cond_4
    move-object v0, p0

    .line 87
    goto :goto_1

    .line 88
    :cond_5
    iput-object p0, v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$onRelease$1;->L$0:Ljava/lang/Object;

    .line 89
    .line 90
    iput p1, v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$onRelease$1;->F$0:F

    .line 91
    .line 92
    iput v3, v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$onRelease$1;->label:I

    .line 93
    .line 94
    invoke-virtual {p0, v4, v0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->animateTo(FLkotlin/coroutines/d;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    if-ne p2, v1, :cond_4

    .line 99
    .line 100
    return-object v1

    .line 101
    :goto_1
    invoke-virtual {v0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->getDistancePulled$material3_release()F

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    cmpg-float p2, p2, v4

    .line 106
    .line 107
    if-nez p2, :cond_6

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    const/4 v3, 0x0

    .line 111
    :goto_2
    if-eqz v3, :cond_7

    .line 112
    .line 113
    :goto_3
    move p1, v4

    .line 114
    goto :goto_4

    .line 115
    :cond_7
    cmpg-float p2, p1, v4

    .line 116
    .line 117
    if-gez p2, :cond_8

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_8
    :goto_4
    invoke-virtual {v0, v4}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->setDistancePulled$material3_release(F)V

    .line 121
    .line 122
    .line 123
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    return-object p1
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

.method public final setDistancePulled$material3_release(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->distancePulled$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableFloatState;->setFloatValue(F)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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

.method public setNestedScrollConnection(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->nestedScrollConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    return-void
.end method

.method public startRefresh()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->set_refreshing(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->getPositionalThreshold()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-direct {p0, v0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->set_verticalOffset(F)V

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
.end method
