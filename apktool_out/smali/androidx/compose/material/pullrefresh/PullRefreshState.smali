.class public final Landroidx/compose/material/pullrefresh/PullRefreshState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/material/ExperimentalMaterialApi;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B5\u0008\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0012\u0010 \u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u001f0\u001e\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u00a2\u0006\u0004\u0008G\u0010HJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0006\u001a\u00020\u0002H\u0002J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\tJ\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR \u0010 \u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u001f0\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u001b\u0010%\u001a\u00020\u00028BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010!\u001a\u0004\u0008#\u0010$R+\u0010,\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010\u0012R+\u00101\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u0010$\"\u0004\u00080\u0010\u0016R+\u00105\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00082\u0010.\u001a\u0004\u00083\u0010$\"\u0004\u00084\u0010\u0016R+\u00109\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00086\u0010.\u001a\u0004\u00087\u0010$\"\u0004\u00088\u0010\u0016R+\u0010=\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008:\u0010.\u001a\u0004\u0008;\u0010$\"\u0004\u0008<\u0010\u0016R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0011\u0010B\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010*R\u0014\u0010E\u001a\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010$R\u0014\u0010\u0014\u001a\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010$\u00a8\u0006I"
    }
    d2 = {
        "Landroidx/compose/material/pullrefresh/PullRefreshState;",
        "",
        "",
        "offset",
        "Lkotlinx/coroutines/l2;",
        "animateIndicatorTo",
        "calculateIndicatorPosition",
        "pullDelta",
        "onPull$material_release",
        "(F)F",
        "onPull",
        "velocity",
        "onRelease$material_release",
        "onRelease",
        "",
        "refreshing",
        "Lkotlin/r2;",
        "setRefreshing$material_release",
        "(Z)V",
        "setRefreshing",
        "threshold",
        "setThreshold$material_release",
        "(F)V",
        "setThreshold",
        "refreshingOffset",
        "setRefreshingOffset$material_release",
        "setRefreshingOffset",
        "Lkotlinx/coroutines/s0;",
        "animationScope",
        "Lkotlinx/coroutines/s0;",
        "Landroidx/compose/runtime/State;",
        "Lkotlin/Function0;",
        "onRefreshState",
        "Landroidx/compose/runtime/State;",
        "adjustedDistancePulled$delegate",
        "getAdjustedDistancePulled",
        "()F",
        "adjustedDistancePulled",
        "<set-?>",
        "_refreshing$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "get_refreshing",
        "()Z",
        "set_refreshing",
        "_refreshing",
        "_position$delegate",
        "Landroidx/compose/runtime/MutableFloatState;",
        "get_position",
        "set_position",
        "_position",
        "distancePulled$delegate",
        "getDistancePulled",
        "setDistancePulled",
        "distancePulled",
        "_threshold$delegate",
        "get_threshold",
        "set_threshold",
        "_threshold",
        "_refreshingOffset$delegate",
        "get_refreshingOffset",
        "set_refreshingOffset",
        "_refreshingOffset",
        "Landroidx/compose/foundation/MutatorMutex;",
        "mutatorMutex",
        "Landroidx/compose/foundation/MutatorMutex;",
        "getProgress",
        "progress",
        "getRefreshing$material_release",
        "getPosition$material_release",
        "position",
        "getThreshold$material_release",
        "<init>",
        "(Lkotlinx/coroutines/s0;Landroidx/compose/runtime/State;FF)V",
        "material_release"
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
        "SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,234:1\n81#2:235\n81#2:236\n107#2,2:237\n76#3:239\n109#3,2:240\n76#3:242\n109#3,2:243\n76#3:245\n109#3,2:246\n76#3:248\n109#3,2:249\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n*L\n122#1:235\n124#1:236\n124#1:237,2\n125#1:239\n125#1:240,2\n126#1:242\n126#1:243,2\n127#1:245\n127#1:246,2\n128#1:248\n128#1:249,2\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final _position$delegate:Landroidx/compose/runtime/MutableFloatState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final _refreshing$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final _refreshingOffset$delegate:Landroidx/compose/runtime/MutableFloatState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final _threshold$delegate:Landroidx/compose/runtime/MutableFloatState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final adjustedDistancePulled$delegate:Landroidx/compose/runtime/State;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final animationScope:Lkotlinx/coroutines/s0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final distancePulled$delegate:Landroidx/compose/runtime/MutableFloatState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final mutatorMutex:Landroidx/compose/foundation/MutatorMutex;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final onRefreshState:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;>;"
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

.method public constructor <init>(Lkotlinx/coroutines/s0;Landroidx/compose/runtime/State;FF)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/State;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/s0;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;>;FF)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->animationScope:Lkotlinx/coroutines/s0;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->onRefreshState:Landroidx/compose/runtime/State;

    .line 7
    .line 8
    new-instance p1, Landroidx/compose/material/pullrefresh/PullRefreshState$adjustedDistancePulled$2;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Landroidx/compose/material/pullrefresh/PullRefreshState$adjustedDistancePulled$2;-><init>(Landroidx/compose/material/pullrefresh/PullRefreshState;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lv3/a;)Landroidx/compose/runtime/State;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->adjustedDistancePulled$delegate:Landroidx/compose/runtime/State;

    .line 18
    .line 19
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    const/4 v0, 0x2

    .line 23
    invoke-static {p1, p2, v0, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->_refreshing$delegate:Landroidx/compose/runtime/MutableState;

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-static {p1}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iput-object p2, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->_position$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 35
    .line 36
    invoke-static {p1}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->distancePulled$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 41
    .line 42
    invoke-static {p4}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->_threshold$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 47
    .line 48
    invoke-static {p3}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->_refreshingOffset$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 53
    .line 54
    new-instance p1, Landroidx/compose/foundation/MutatorMutex;

    .line 55
    .line 56
    invoke-direct {p1}, Landroidx/compose/foundation/MutatorMutex;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->mutatorMutex:Landroidx/compose/foundation/MutatorMutex;

    .line 60
    .line 61
    return-void
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

.method public static final synthetic access$getDistancePulled(Landroidx/compose/material/pullrefresh/PullRefreshState;)F
    .locals 0

    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getDistancePulled()F

    move-result p0

    return p0
.end method

.method public static final synthetic access$getMutatorMutex$p(Landroidx/compose/material/pullrefresh/PullRefreshState;)Landroidx/compose/foundation/MutatorMutex;
    .locals 0

    iget-object p0, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->mutatorMutex:Landroidx/compose/foundation/MutatorMutex;

    return-object p0
.end method

.method public static final synthetic access$get_position(Landroidx/compose/material/pullrefresh/PullRefreshState;)F
    .locals 0

    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->get_position()F

    move-result p0

    return p0
.end method

.method public static final synthetic access$set_position(Landroidx/compose/material/pullrefresh/PullRefreshState;F)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/material/pullrefresh/PullRefreshState;->set_position(F)V

    return-void
.end method

.method private final animateIndicatorTo(F)Lkotlinx/coroutines/l2;
    .locals 6

    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->animationScope:Lkotlinx/coroutines/s0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Landroidx/compose/material/pullrefresh/PullRefreshState$animateIndicatorTo$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Landroidx/compose/material/pullrefresh/PullRefreshState$animateIndicatorTo$1;-><init>(Landroidx/compose/material/pullrefresh/PullRefreshState;FLkotlin/coroutines/d;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    move-result-object p1

    return-object p1
.end method

.method private final calculateIndicatorPosition()F
    .locals 5

    .line 1
    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getAdjustedDistancePulled()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getThreshold$material_release()F

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
    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getAdjustedDistancePulled()F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getProgress()F

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
    invoke-virtual {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getThreshold$material_release()F

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    mul-float/2addr v1, v0

    .line 53
    invoke-virtual {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getThreshold$material_release()F

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

.method private final getAdjustedDistancePulled()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->adjustedDistancePulled$delegate:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

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

.method private final getDistancePulled()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->distancePulled$delegate:Landroidx/compose/runtime/MutableFloatState;

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

.method private final get_position()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->_position$delegate:Landroidx/compose/runtime/MutableFloatState;

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

.method private final get_refreshing()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->_refreshing$delegate:Landroidx/compose/runtime/MutableState;

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

.method private final get_refreshingOffset()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->_refreshingOffset$delegate:Landroidx/compose/runtime/MutableFloatState;

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

.method private final get_threshold()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->_threshold$delegate:Landroidx/compose/runtime/MutableFloatState;

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

.method private final setDistancePulled(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->distancePulled$delegate:Landroidx/compose/runtime/MutableFloatState;

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

.method private final set_position(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->_position$delegate:Landroidx/compose/runtime/MutableFloatState;

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

.method private final set_refreshing(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->_refreshing$delegate:Landroidx/compose/runtime/MutableState;

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

.method private final set_refreshingOffset(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->_refreshingOffset$delegate:Landroidx/compose/runtime/MutableFloatState;

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

.method private final set_threshold(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->_threshold$delegate:Landroidx/compose/runtime/MutableFloatState;

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
.method public final getPosition$material_release()F
    .locals 1

    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->get_position()F

    move-result v0

    return v0
.end method

.method public final getProgress()F
    .locals 2

    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getAdjustedDistancePulled()F

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getThreshold$material_release()F

    move-result v1

    div-float/2addr v0, v1

    return v0
.end method

.method public final getRefreshing$material_release()Z
    .locals 1

    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->get_refreshing()Z

    move-result v0

    return v0
.end method

.method public final getThreshold$material_release()F
    .locals 1

    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->get_threshold()F

    move-result v0

    return v0
.end method

.method public final onPull$material_release(F)F
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->get_refreshing()Z

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
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getDistancePulled()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-float/2addr v0, p1

    .line 14
    invoke-static {v0, v1}, Lkotlin/ranges/s;->t(FF)F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getDistancePulled()F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sub-float v0, p1, v0

    .line 23
    .line 24
    invoke-direct {p0, p1}, Landroidx/compose/material/pullrefresh/PullRefreshState;->setDistancePulled(F)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->calculateIndicatorPosition()F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-direct {p0, p1}, Landroidx/compose/material/pullrefresh/PullRefreshState;->set_position(F)V

    .line 32
    .line 33
    .line 34
    return v0
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
.end method

.method public final onRelease$material_release(F)F
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getRefreshing$material_release()Z

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
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getAdjustedDistancePulled()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getThreshold$material_release()F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    cmpl-float v0, v0, v2

    .line 18
    .line 19
    if-lez v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshState;->onRefreshState:Landroidx/compose/runtime/State;

    .line 22
    .line 23
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lv3/a;

    .line 28
    .line 29
    invoke-interface {v0}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-direct {p0, v1}, Landroidx/compose/material/pullrefresh/PullRefreshState;->animateIndicatorTo(F)Lkotlinx/coroutines/l2;

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getDistancePulled()F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    cmpg-float v0, v0, v1

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 v0, 0x0

    .line 46
    :goto_0
    if-eqz v0, :cond_3

    .line 47
    .line 48
    :goto_1
    move p1, v1

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    cmpg-float v0, p1, v1

    .line 51
    .line 52
    if-gez v0, :cond_4

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_4
    :goto_2
    invoke-direct {p0, v1}, Landroidx/compose/material/pullrefresh/PullRefreshState;->setDistancePulled(F)V

    .line 56
    .line 57
    .line 58
    return p1
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

.method public final setRefreshing$material_release(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->get_refreshing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq v0, p1, :cond_1

    .line 6
    .line 7
    invoke-direct {p0, p1}, Landroidx/compose/material/pullrefresh/PullRefreshState;->set_refreshing(Z)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, v0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->setDistancePulled(F)V

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->get_refreshingOffset()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    :cond_0
    invoke-direct {p0, v0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->animateIndicatorTo(F)Lkotlinx/coroutines/l2;

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
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

.method public final setRefreshingOffset$material_release(F)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->get_refreshingOffset()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    cmpg-float v0, v0, p1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-direct {p0, p1}, Landroidx/compose/material/pullrefresh/PullRefreshState;->set_refreshingOffset(F)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getRefreshing$material_release()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-direct {p0, p1}, Landroidx/compose/material/pullrefresh/PullRefreshState;->animateIndicatorTo(F)Lkotlinx/coroutines/l2;

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final setThreshold$material_release(F)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/material/pullrefresh/PullRefreshState;->set_threshold(F)V

    return-void
.end method
