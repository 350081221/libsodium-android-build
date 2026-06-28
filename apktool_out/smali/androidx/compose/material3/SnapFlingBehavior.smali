.class public final Landroidx/compose/material3/SnapFlingBehavior;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/gestures/FlingBehavior;


# annotations
.annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u000c*\u0001:\u0008\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001b\u0012\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u00106\u001a\u000205\u00a2\u0006\u0004\u0008J\u0010KJ(\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J(\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\n\u0010\u0008J(\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u0008J0\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ*\u0010\u0012\u001a\u00028\u0000\"\u000e\u0008\u0000\u0010\u0010*\u0008\u0012\u0004\u0012\u00028\u00000\u000f*\u0008\u0012\u0004\u0012\u00028\u00000\u0011H\u0082\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J*\u0010\u0014\u001a\u00028\u0000\"\u000e\u0008\u0000\u0010\u0010*\u0008\u0012\u0004\u0012\u00028\u00000\u000f*\u0008\u0012\u0004\u0012\u00028\u00000\u0011H\u0082\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002JJ\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00032\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00192\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001bH\u0082@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJR\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00192\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00030 H\u0082@\u00a2\u0006\u0004\u0008\"\u0010#J\u0014\u0010%\u001a\u00020\u0003*\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0002J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0002J\u001c\u0010+\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@\u00a2\u0006\u0004\u0008+\u0010\u0008J\u0013\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010,H\u0096\u0002J\u0008\u00101\u001a\u000200H\u0016R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u00102R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u00103R\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00030 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0014\u00108\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0014\u0010=\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008=\u00109R\u001a\u0010?\u001a\u00020>8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008?\u00109R\u001a\u0010C\u001a\u0008\u0012\u0004\u0012\u00020(0@8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010BR\u0014\u0010F\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010ER\u0018\u0010I\u001a\u000200*\u00020&8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010H\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006L"
    }
    d2 = {
        "Landroidx/compose/material3/SnapFlingBehavior;",
        "Landroidx/compose/foundation/gestures/FlingBehavior;",
        "Landroidx/compose/foundation/gestures/ScrollScope;",
        "",
        "initialVelocity",
        "Landroidx/compose/material3/AnimationResult;",
        "Landroidx/compose/animation/core/AnimationVector1D;",
        "fling",
        "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;",
        "velocity",
        "shortSnap",
        "longSnap",
        "initialTargetOffset",
        "runApproach",
        "(Landroidx/compose/foundation/gestures/ScrollScope;FFLkotlin/coroutines/d;)Ljava/lang/Object;",
        "",
        "T",
        "Lkotlin/ranges/f;",
        "component1",
        "(Lkotlin/ranges/f;)Ljava/lang/Comparable;",
        "component2",
        "Landroidx/compose/foundation/lazy/LazyListState;",
        "lazyListState",
        "findClosestOffset",
        "targetOffset",
        "Landroidx/compose/animation/core/AnimationState;",
        "animationState",
        "Landroidx/compose/animation/core/DecayAnimationSpec;",
        "decayAnimationSpec",
        "animateDecay",
        "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "cancelOffset",
        "Landroidx/compose/animation/core/AnimationSpec;",
        "snapAnimationSpec",
        "animateSnap",
        "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "target",
        "coerceToTarget",
        "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;",
        "layoutInfo",
        "Landroidx/compose/foundation/lazy/LazyListItemInfo;",
        "item",
        "calculateDistanceToDesiredSnapPosition",
        "performFling",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "Landroidx/compose/foundation/lazy/LazyListState;",
        "Landroidx/compose/animation/core/DecayAnimationSpec;",
        "Landroidx/compose/animation/core/AnimationSpec;",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "velocityThreshold",
        "F",
        "androidx/compose/material3/SnapFlingBehavior$motionScaleDuration$1",
        "motionScaleDuration",
        "Landroidx/compose/material3/SnapFlingBehavior$motionScaleDuration$1;",
        "DefaultScrollMotionDurationScaleFactor",
        "Landroidx/compose/ui/unit/Dp;",
        "MinFlingVelocityDp",
        "",
        "getVisibleItemsInfo",
        "()Ljava/util/List;",
        "visibleItemsInfo",
        "getItemSize",
        "()F",
        "itemSize",
        "getSingleAxisViewportSize",
        "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I",
        "singleAxisViewportSize",
        "<init>",
        "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/unit/Density;)V",
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
        "SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/material3/SnapFlingBehavior\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,356:1\n1#2:357\n154#3:358\n132#4,3:359\n33#4,4:362\n135#4,2:366\n38#4:368\n137#4:369\n33#4,6:370\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/material3/SnapFlingBehavior\n*L\n346#1:358\n71#1:359,3\n71#1:362,4\n71#1:366,2\n71#1:368\n71#1:369\n199#1:370,6\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final DefaultScrollMotionDurationScaleFactor:F

.field private final MinFlingVelocityDp:F

.field private final decayAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/DecayAnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final density:Landroidx/compose/ui/unit/Density;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final lazyListState:Landroidx/compose/foundation/lazy/LazyListState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private motionScaleDuration:Landroidx/compose/material3/SnapFlingBehavior$motionScaleDuration$1;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final snapAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final velocityThreshold:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/unit/Density;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/lazy/LazyListState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/animation/core/DecayAnimationSpec;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/animation/core/AnimationSpec;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Landroidx/compose/animation/core/DecayAnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/ui/unit/Density;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/material3/SnapFlingBehavior;->lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/material3/SnapFlingBehavior;->decayAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/material3/SnapFlingBehavior;->snapAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/compose/material3/SnapFlingBehavior;->density:Landroidx/compose/ui/unit/Density;

    .line 11
    .line 12
    iget p1, p0, Landroidx/compose/material3/SnapFlingBehavior;->MinFlingVelocityDp:F

    .line 13
    .line 14
    invoke-interface {p4, p1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, Landroidx/compose/material3/SnapFlingBehavior;->velocityThreshold:F

    .line 19
    .line 20
    new-instance p1, Landroidx/compose/material3/SnapFlingBehavior$motionScaleDuration$1;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Landroidx/compose/material3/SnapFlingBehavior$motionScaleDuration$1;-><init>(Landroidx/compose/material3/SnapFlingBehavior;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Landroidx/compose/material3/SnapFlingBehavior;->motionScaleDuration:Landroidx/compose/material3/SnapFlingBehavior$motionScaleDuration$1;

    .line 26
    .line 27
    const/high16 p1, 0x3f800000    # 1.0f

    .line 28
    .line 29
    iput p1, p0, Landroidx/compose/material3/SnapFlingBehavior;->DefaultScrollMotionDurationScaleFactor:F

    .line 30
    .line 31
    const/16 p1, 0x190

    .line 32
    .line 33
    int-to-float p1, p1

    .line 34
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iput p1, p0, Landroidx/compose/material3/SnapFlingBehavior;->MinFlingVelocityDp:F

    .line 39
    .line 40
    return-void
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

.method public static final synthetic access$animateDecay(Landroidx/compose/material3/SnapFlingBehavior;Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/compose/material3/SnapFlingBehavior;->animateDecay(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$animateDecay$consumeDelta(Landroidx/compose/animation/core/AnimationScope;Landroidx/compose/foundation/gestures/ScrollScope;F)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/material3/SnapFlingBehavior;->animateDecay$consumeDelta(Landroidx/compose/animation/core/AnimationScope;Landroidx/compose/foundation/gestures/ScrollScope;F)V

    return-void
.end method

.method public static final synthetic access$animateSnap(Landroidx/compose/material3/SnapFlingBehavior;Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/material3/SnapFlingBehavior;->animateSnap(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$coerceToTarget(Landroidx/compose/material3/SnapFlingBehavior;FF)F
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/material3/SnapFlingBehavior;->coerceToTarget(FF)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$fling(Landroidx/compose/material3/SnapFlingBehavior;Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/material3/SnapFlingBehavior;->fling(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDefaultScrollMotionDurationScaleFactor$p(Landroidx/compose/material3/SnapFlingBehavior;)F
    .locals 0

    iget p0, p0, Landroidx/compose/material3/SnapFlingBehavior;->DefaultScrollMotionDurationScaleFactor:F

    return p0
.end method

.method public static final synthetic access$getVelocityThreshold$p(Landroidx/compose/material3/SnapFlingBehavior;)F
    .locals 0

    iget p0, p0, Landroidx/compose/material3/SnapFlingBehavior;->velocityThreshold:F

    return p0
.end method

.method public static final synthetic access$longSnap(Landroidx/compose/material3/SnapFlingBehavior;Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/material3/SnapFlingBehavior;->longSnap(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$runApproach(Landroidx/compose/material3/SnapFlingBehavior;Landroidx/compose/foundation/gestures/ScrollScope;FFLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/material3/SnapFlingBehavior;->runApproach(Landroidx/compose/foundation/gestures/ScrollScope;FFLkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$shortSnap(Landroidx/compose/material3/SnapFlingBehavior;Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/material3/SnapFlingBehavior;->shortSnap(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final animateDecay(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "F",
            "Landroidx/compose/animation/core/AnimationState<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;",
            "Landroidx/compose/animation/core/DecayAnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/material3/AnimationResult<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p5, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$1;->label:I

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
    iput v1, v0, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$1;-><init>(Landroidx/compose/material3/SnapFlingBehavior;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget p2, v0, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$1;->F$0:F

    .line 39
    .line 40
    iget-object p1, v0, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$1;->L$1:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lkotlin/jvm/internal/k1$e;

    .line 43
    .line 44
    iget-object p3, v0, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$1;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p3, Landroidx/compose/animation/core/AnimationState;

    .line 47
    .line 48
    invoke-static {p5}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    invoke-static {p5}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance p5, Lkotlin/jvm/internal/k1$e;

    .line 64
    .line 65
    invoke-direct {p5}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3}, Landroidx/compose/animation/core/AnimationState;->getVelocity()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    const/4 v4, 0x0

    .line 79
    cmpg-float v2, v2, v4

    .line 80
    .line 81
    if-nez v2, :cond_3

    .line 82
    .line 83
    move v2, v3

    .line 84
    goto :goto_1

    .line 85
    :cond_3
    const/4 v2, 0x0

    .line 86
    :goto_1
    xor-int/2addr v2, v3

    .line 87
    new-instance v4, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$2;

    .line 88
    .line 89
    invoke-direct {v4, p2, p0, p5, p1}, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$2;-><init>(FLandroidx/compose/material3/SnapFlingBehavior;Lkotlin/jvm/internal/k1$e;Landroidx/compose/foundation/gestures/ScrollScope;)V

    .line 90
    .line 91
    .line 92
    iput-object p3, v0, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p5, v0, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$1;->L$1:Ljava/lang/Object;

    .line 95
    .line 96
    iput p2, v0, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$1;->F$0:F

    .line 97
    .line 98
    iput v3, v0, Landroidx/compose/material3/SnapFlingBehavior$animateDecay$1;->label:I

    .line 99
    .line 100
    invoke-static {p3, p4, v2, v4, v0}, Landroidx/compose/animation/core/SuspendAnimationKt;->animateDecay(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-ne p1, v1, :cond_4

    .line 105
    .line 106
    return-object v1

    .line 107
    :cond_4
    move-object p1, p5

    .line 108
    :goto_2
    new-instance p4, Landroidx/compose/material3/AnimationResult;

    .line 109
    .line 110
    iget p1, p1, Lkotlin/jvm/internal/k1$e;->element:F

    .line 111
    .line 112
    sub-float/2addr p2, p1

    .line 113
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-direct {p4, p1, p3}, Landroidx/compose/material3/AnimationResult;-><init>(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationState;)V

    .line 118
    .line 119
    .line 120
    return-object p4
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
.end method

.method private static final animateDecay$consumeDelta(Landroidx/compose/animation/core/AnimationScope;Landroidx/compose/foundation/gestures/ScrollScope;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/AnimationScope<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "F)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1, p2}, Landroidx/compose/foundation/gestures/ScrollScope;->scrollBy(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sub-float/2addr p2, p1

    .line 6
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/high16 p2, 0x3f000000    # 0.5f

    .line 11
    .line 12
    cmpl-float p1, p1, p2

    .line 13
    .line 14
    if-lez p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
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
.end method

.method private final animateSnap(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "FF",
            "Landroidx/compose/animation/core/AnimationState<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/material3/AnimationResult<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    move-object/from16 v1, p6

    .line 3
    .line 4
    instance-of v2, v1, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    move-object v2, v1

    .line 9
    check-cast v2, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;

    .line 10
    .line 11
    iget v3, v2, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->label:I

    .line 12
    .line 13
    const/high16 v4, -0x80000000

    .line 14
    .line 15
    and-int v5, v3, v4

    .line 16
    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    sub-int/2addr v3, v4

    .line 20
    iput v3, v2, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->label:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v2, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;

    .line 24
    .line 25
    invoke-direct {v2, p0, v1}, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;-><init>(Landroidx/compose/material3/SnapFlingBehavior;Lkotlin/coroutines/d;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    move-object v8, v2

    .line 29
    iget-object v1, v8, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget v3, v8, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->label:I

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    if-ne v3, v4, :cond_1

    .line 41
    .line 42
    iget v2, v8, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->F$1:F

    .line 43
    .line 44
    iget v3, v8, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->F$0:F

    .line 45
    .line 46
    iget-object v4, v8, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->L$2:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v4, Lkotlin/jvm/internal/k1$e;

    .line 49
    .line 50
    iget-object v5, v8, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->L$1:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v5, Landroidx/compose/animation/core/AnimationState;

    .line 53
    .line 54
    iget-object v6, v8, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v6, Landroidx/compose/material3/SnapFlingBehavior;

    .line 57
    .line 58
    invoke-static {v1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move v11, v3

    .line 62
    move-object v1, v5

    .line 63
    goto :goto_2

    .line 64
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v1

    .line 72
    :cond_2
    invoke-static {v1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lkotlin/jvm/internal/k1$e;

    .line 76
    .line 77
    invoke-direct {v1}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual/range {p4 .. p4}, Landroidx/compose/animation/core/AnimationState;->getVelocity()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual/range {p4 .. p4}, Landroidx/compose/animation/core/AnimationState;->getVelocity()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    check-cast v3, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    const/4 v6, 0x0

    .line 105
    cmpg-float v3, v3, v6

    .line 106
    .line 107
    if-nez v3, :cond_3

    .line 108
    .line 109
    move v3, v4

    .line 110
    goto :goto_1

    .line 111
    :cond_3
    const/4 v3, 0x0

    .line 112
    :goto_1
    xor-int/lit8 v6, v3, 0x1

    .line 113
    .line 114
    new-instance v7, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$2;

    .line 115
    .line 116
    move-object v3, p1

    .line 117
    move/from16 v10, p3

    .line 118
    .line 119
    invoke-direct {v7, p0, v10, v1, p1}, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$2;-><init>(Landroidx/compose/material3/SnapFlingBehavior;FLkotlin/jvm/internal/k1$e;Landroidx/compose/foundation/gestures/ScrollScope;)V

    .line 120
    .line 121
    .line 122
    iput-object v0, v8, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->L$0:Ljava/lang/Object;

    .line 123
    .line 124
    move-object/from16 v10, p4

    .line 125
    .line 126
    iput-object v10, v8, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->L$1:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object v1, v8, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->L$2:Ljava/lang/Object;

    .line 129
    .line 130
    move v11, p2

    .line 131
    iput v11, v8, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->F$0:F

    .line 132
    .line 133
    iput v9, v8, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->F$1:F

    .line 134
    .line 135
    iput v4, v8, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->label:I

    .line 136
    .line 137
    move-object/from16 v3, p4

    .line 138
    .line 139
    move-object v4, v5

    .line 140
    move-object/from16 v5, p5

    .line 141
    .line 142
    invoke-static/range {v3 .. v8}, Landroidx/compose/animation/core/SuspendAnimationKt;->animateTo(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    if-ne v3, v2, :cond_4

    .line 147
    .line 148
    return-object v2

    .line 149
    :cond_4
    move-object v6, v0

    .line 150
    move-object v4, v1

    .line 151
    move v2, v9

    .line 152
    move-object v1, v10

    .line 153
    :goto_2
    invoke-virtual {v1}, Landroidx/compose/animation/core/AnimationState;->getVelocity()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    check-cast v3, Ljava/lang/Number;

    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    invoke-direct {v6, v3, v2}, Landroidx/compose/material3/SnapFlingBehavior;->coerceToTarget(FF)F

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    new-instance v12, Landroidx/compose/material3/AnimationResult;

    .line 168
    .line 169
    iget v2, v4, Lkotlin/jvm/internal/k1$e;->element:F

    .line 170
    .line 171
    sub-float/2addr v11, v2

    .line 172
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    const/4 v2, 0x0

    .line 177
    const-wide/16 v4, 0x0

    .line 178
    .line 179
    const-wide/16 v6, 0x0

    .line 180
    .line 181
    const/4 v8, 0x0

    .line 182
    const/16 v9, 0x1d

    .line 183
    .line 184
    const/4 v10, 0x0

    .line 185
    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/core/AnimationStateKt;->copy$default(Landroidx/compose/animation/core/AnimationState;FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-direct {v12, v11, v1}, Landroidx/compose/material3/AnimationResult;-><init>(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationState;)V

    .line 190
    .line 191
    .line 192
    return-object v12
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
.end method

.method private final calculateDistanceToDesiredSnapPosition(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;Landroidx/compose/foundation/lazy/LazyListItemInfo;)F
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/material3/SnapFlingBehavior;->getSingleAxisViewportSize(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getBeforeContentPadding()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getAfterContentPadding()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    sub-int/2addr v0, p1

    .line 15
    int-to-float p1, v0

    .line 16
    const/4 v0, 0x2

    .line 17
    int-to-float v0, v0

    .line 18
    div-float/2addr p1, v0

    .line 19
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getSize()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    int-to-float v1, v1

    .line 24
    div-float/2addr v1, v0

    .line 25
    sub-float/2addr p1, v1

    .line 26
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getOffset()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    int-to-float p2, p2

    .line 31
    sub-float/2addr p2, p1

    .line 32
    return p2
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

.method private final coerceToTarget(FF)F
    .locals 2

    const/4 v0, 0x0

    cmpg-float v1, p2, v0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    return v0

    :cond_1
    cmpl-float v0, p2, v0

    if-lez v0, :cond_2

    invoke-static {p1, p2}, Lkotlin/ranges/s;->A(FF)F

    move-result p1

    goto :goto_1

    :cond_2
    invoke-static {p1, p2}, Lkotlin/ranges/s;->t(FF)F

    move-result p1

    :goto_1
    return p1
.end method

.method private final component1(Lkotlin/ranges/f;)Ljava/lang/Comparable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "-TT;>;>(",
            "Lkotlin/ranges/f<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-interface {p1}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object p1

    return-object p1
.end method

.method private final component2(Lkotlin/ranges/f;)Ljava/lang/Comparable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "-TT;>;>(",
            "Lkotlin/ranges/f<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-interface {p1}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object p1

    return-object p1
.end method

.method private final findClosestOffset(FLandroidx/compose/foundation/lazy/LazyListState;)F
    .locals 5

    .line 1
    invoke-static {p2, p0}, Landroidx/compose/material3/SnapFlingBehavior;->findClosestOffset$calculateSnappingOffsetBounds(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/SnapFlingBehavior;)Lkotlin/ranges/f;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p2}, Landroidx/compose/material3/SnapFlingBehavior;->component1(Lkotlin/ranges/f;)Ljava/lang/Comparable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-direct {p0, p2}, Landroidx/compose/material3/SnapFlingBehavior;->component2(Lkotlin/ranges/f;)Ljava/lang/Comparable;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/4 v1, 0x0

    .line 30
    cmpg-float v2, p1, v1

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    const/4 v4, 0x0

    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    move v2, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v2, v4

    .line 39
    :goto_0
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    cmpg-float p1, p1, v2

    .line 50
    .line 51
    if-gtz p1, :cond_6

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    const/high16 v2, 0x3f800000    # 1.0f

    .line 55
    .line 56
    cmpg-float v2, p1, v2

    .line 57
    .line 58
    if-nez v2, :cond_2

    .line 59
    .line 60
    move v2, v3

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    move v2, v4

    .line 63
    :goto_1
    if-eqz v2, :cond_3

    .line 64
    .line 65
    :goto_2
    move v0, p2

    .line 66
    goto :goto_4

    .line 67
    :cond_3
    const/high16 p2, -0x40800000    # -1.0f

    .line 68
    .line 69
    cmpg-float p1, p1, p2

    .line 70
    .line 71
    if-nez p1, :cond_4

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    move v3, v4

    .line 75
    :goto_3
    if-eqz v3, :cond_5

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_5
    move v0, v1

    .line 79
    :cond_6
    :goto_4
    invoke-static {v0}, Landroidx/compose/material3/SnapFlingBehavior;->findClosestOffset$isValidDistance(F)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_7

    .line 84
    .line 85
    move v1, v0

    .line 86
    :cond_7
    return v1
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

.method private static final findClosestOffset$calculateSnappingOffsetBounds(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/SnapFlingBehavior;)Lkotlin/ranges/f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Landroidx/compose/material3/SnapFlingBehavior;",
            ")",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListState;->getLayoutInfo()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/high16 v2, -0x800000    # Float.NEGATIVE_INFINITY

    .line 14
    .line 15
    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    if-ge v4, v1, :cond_2

    .line 19
    .line 20
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    .line 25
    .line 26
    invoke-direct {p1, p0, v5}, Landroidx/compose/material3/SnapFlingBehavior;->calculateDistanceToDesiredSnapPosition(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;Landroidx/compose/foundation/lazy/LazyListItemInfo;)F

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    const/4 v6, 0x0

    .line 31
    cmpg-float v7, v5, v6

    .line 32
    .line 33
    if-gtz v7, :cond_0

    .line 34
    .line 35
    cmpl-float v7, v5, v2

    .line 36
    .line 37
    if-lez v7, :cond_0

    .line 38
    .line 39
    move v2, v5

    .line 40
    :cond_0
    cmpl-float v6, v5, v6

    .line 41
    .line 42
    if-ltz v6, :cond_1

    .line 43
    .line 44
    cmpg-float v6, v5, v3

    .line 45
    .line 46
    if-gez v6, :cond_1

    .line 47
    .line 48
    move v3, v5

    .line 49
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-static {v2, v3}, Lkotlin/ranges/s;->e(FF)Lkotlin/ranges/f;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
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

.method private static final findClosestOffset$isValidDistance(F)Z
    .locals 3

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpg-float v0, p0, v0

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

    cmpg-float p0, p0, v0

    if-nez p0, :cond_1

    move p0, v1

    goto :goto_1

    :cond_1
    move p0, v2

    :goto_1
    if-nez p0, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    return v1
.end method

.method private final fling(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "F",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/material3/AnimationResult<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Landroidx/compose/material3/SnapFlingBehavior$fling$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/material3/SnapFlingBehavior$fling$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/material3/SnapFlingBehavior$fling$1;->label:I

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
    iput v1, v0, Landroidx/compose/material3/SnapFlingBehavior$fling$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/material3/SnapFlingBehavior$fling$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/compose/material3/SnapFlingBehavior$fling$1;-><init>(Landroidx/compose/material3/SnapFlingBehavior;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/material3/SnapFlingBehavior$fling$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/material3/SnapFlingBehavior$fling$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p3, p0, Landroidx/compose/material3/SnapFlingBehavior;->motionScaleDuration:Landroidx/compose/material3/SnapFlingBehavior$motionScaleDuration$1;

    .line 54
    .line 55
    new-instance v2, Landroidx/compose/material3/SnapFlingBehavior$fling$result$1;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-direct {v2, p2, p0, p1, v4}, Landroidx/compose/material3/SnapFlingBehavior$fling$result$1;-><init>(FLandroidx/compose/material3/SnapFlingBehavior;Landroidx/compose/foundation/gestures/ScrollScope;Lkotlin/coroutines/d;)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, Landroidx/compose/material3/SnapFlingBehavior$fling$1;->label:I

    .line 62
    .line 63
    invoke-static {p3, v2, v0}, Lkotlinx/coroutines/i;->h(Lkotlin/coroutines/g;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    if-ne p3, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    check-cast p3, Landroidx/compose/material3/AnimationResult;

    .line 71
    .line 72
    return-object p3
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

.method private final getItemSize()F
    .locals 5

    .line 1
    invoke-direct {p0}, Landroidx/compose/material3/SnapFlingBehavior;->getVisibleItemsInfo()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/util/Collection;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-direct {p0}, Landroidx/compose/material3/SnapFlingBehavior;->getVisibleItemsInfo()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    move v3, v2

    .line 25
    :goto_0
    if-ge v2, v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    .line 32
    .line 33
    invoke-interface {v4}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getSize()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    add-int/2addr v3, v4

    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    int-to-float v0, v3

    .line 42
    invoke-direct {p0}, Landroidx/compose/material3/SnapFlingBehavior;->getVisibleItemsInfo()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    int-to-float v1, v1

    .line 51
    div-float/2addr v0, v1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v0, 0x0

    .line 54
    :goto_1
    return v0
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

.method private final getSingleAxisViewportSize(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I
    .locals 2

    invoke-interface {p1}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getOrientation()Landroidx/compose/foundation/gestures/Orientation;

    move-result-object v0

    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getViewportSize-YbymL2g()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getViewportSize-YbymL2g()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    move-result p1

    :goto_0
    return p1
.end method

.method private final getVisibleItemsInfo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListItemInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/SnapFlingBehavior;->lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListState;->getLayoutInfo()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private final longSnap(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "F",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/material3/AnimationResult<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    instance-of v4, v3, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;

    .line 15
    .line 16
    iget v5, v4, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;->label:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;->label:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;

    .line 29
    .line 30
    invoke-direct {v4, v0, v3}, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;-><init>(Landroidx/compose/material3/SnapFlingBehavior;Lkotlin/coroutines/d;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    move-object v11, v4

    .line 34
    iget-object v3, v11, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;->result:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iget v5, v11, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;->label:I

    .line 41
    .line 42
    const/4 v6, 0x2

    .line 43
    const/4 v7, 0x1

    .line 44
    if-eqz v5, :cond_3

    .line 45
    .line 46
    if-eq v5, v7, :cond_2

    .line 47
    .line 48
    if-ne v5, v6, :cond_1

    .line 49
    .line 50
    invoke-static {v3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :cond_2
    iget-object v1, v11, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;->L$1:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Landroidx/compose/foundation/gestures/ScrollScope;

    .line 66
    .line 67
    iget-object v2, v11, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Landroidx/compose/material3/SnapFlingBehavior;

    .line 70
    .line 71
    invoke-static {v3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    move-object v5, v2

    .line 75
    goto :goto_3

    .line 76
    :cond_3
    invoke-static {v3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v3, v0, Landroidx/compose/material3/SnapFlingBehavior;->decayAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;

    .line 80
    .line 81
    const/4 v5, 0x0

    .line 82
    invoke-static {v3, v5, v2}, Landroidx/compose/animation/core/DecayAnimationSpecKt;->calculateTargetValue(Landroidx/compose/animation/core/DecayAnimationSpec;FF)F

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    invoke-direct/range {p0 .. p0}, Landroidx/compose/material3/SnapFlingBehavior;->getItemSize()F

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    sub-float/2addr v3, v8

    .line 95
    invoke-static {v3, v5}, Lkotlin/ranges/s;->t(FF)F

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    cmpg-float v5, v3, v5

    .line 100
    .line 101
    if-nez v5, :cond_4

    .line 102
    .line 103
    move v5, v7

    .line 104
    goto :goto_1

    .line 105
    :cond_4
    const/4 v5, 0x0

    .line 106
    :goto_1
    if-eqz v5, :cond_5

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    invoke-static/range {p2 .. p2}, Ljava/lang/Math;->signum(F)F

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    mul-float/2addr v3, v5

    .line 114
    :goto_2
    iput-object v0, v11, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;->L$0:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v1, v11, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;->L$1:Ljava/lang/Object;

    .line 117
    .line 118
    iput v7, v11, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;->label:I

    .line 119
    .line 120
    invoke-direct {v0, v1, v3, v2, v11}, Landroidx/compose/material3/SnapFlingBehavior;->runApproach(Landroidx/compose/foundation/gestures/ScrollScope;FFLkotlin/coroutines/d;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-ne v3, v4, :cond_6

    .line 125
    .line 126
    return-object v4

    .line 127
    :cond_6
    move-object v5, v0

    .line 128
    :goto_3
    check-cast v3, Landroidx/compose/material3/AnimationResult;

    .line 129
    .line 130
    invoke-virtual {v3}, Landroidx/compose/material3/AnimationResult;->component1()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    invoke-virtual {v3}, Landroidx/compose/material3/AnimationResult;->component2()Landroidx/compose/animation/core/AnimationState;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    const/4 v13, 0x0

    .line 145
    const/4 v14, 0x0

    .line 146
    const-wide/16 v15, 0x0

    .line 147
    .line 148
    const-wide/16 v17, 0x0

    .line 149
    .line 150
    const/16 v19, 0x0

    .line 151
    .line 152
    const/16 v20, 0x1e

    .line 153
    .line 154
    const/16 v21, 0x0

    .line 155
    .line 156
    invoke-static/range {v12 .. v21}, Landroidx/compose/animation/core/AnimationStateKt;->copy$default(Landroidx/compose/animation/core/AnimationState;FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    iget-object v10, v5, Landroidx/compose/material3/SnapFlingBehavior;->snapAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 161
    .line 162
    const/4 v2, 0x0

    .line 163
    iput-object v2, v11, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;->L$0:Ljava/lang/Object;

    .line 164
    .line 165
    iput-object v2, v11, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;->L$1:Ljava/lang/Object;

    .line 166
    .line 167
    iput v6, v11, Landroidx/compose/material3/SnapFlingBehavior$longSnap$1;->label:I

    .line 168
    .line 169
    move-object v6, v1

    .line 170
    move v7, v8

    .line 171
    invoke-direct/range {v5 .. v11}, Landroidx/compose/material3/SnapFlingBehavior;->animateSnap(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    if-ne v3, v4, :cond_7

    .line 176
    .line 177
    return-object v4

    .line 178
    :cond_7
    :goto_4
    return-object v3
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
.end method

.method private final runApproach(Landroidx/compose/foundation/gestures/ScrollScope;FFLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "FF",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/material3/AnimationResult<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    instance-of v1, v0, Landroidx/compose/material3/SnapFlingBehavior$runApproach$1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Landroidx/compose/material3/SnapFlingBehavior$runApproach$1;

    .line 11
    .line 12
    iget v2, v1, Landroidx/compose/material3/SnapFlingBehavior$runApproach$1;->label:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, Landroidx/compose/material3/SnapFlingBehavior$runApproach$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Landroidx/compose/material3/SnapFlingBehavior$runApproach$1;

    .line 25
    .line 26
    invoke-direct {v1, v6, v0}, Landroidx/compose/material3/SnapFlingBehavior$runApproach$1;-><init>(Landroidx/compose/material3/SnapFlingBehavior;Lkotlin/coroutines/d;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    move-object v5, v1

    .line 30
    iget-object v0, v5, Landroidx/compose/material3/SnapFlingBehavior$runApproach$1;->result:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    iget v1, v5, Landroidx/compose/material3/SnapFlingBehavior$runApproach$1;->label:I

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    iget-object v1, v5, Landroidx/compose/material3/SnapFlingBehavior$runApproach$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Landroidx/compose/material3/SnapFlingBehavior;

    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :cond_2
    invoke-static {v0}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    const-wide/16 v10, 0x0

    .line 64
    .line 65
    const-wide/16 v12, 0x0

    .line 66
    .line 67
    const/4 v14, 0x0

    .line 68
    const/16 v15, 0x1c

    .line 69
    .line 70
    const/16 v16, 0x0

    .line 71
    .line 72
    move/from16 v9, p3

    .line 73
    .line 74
    invoke-static/range {v8 .. v16}, Landroidx/compose/animation/core/AnimationStateKt;->AnimationState$default(FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget-object v4, v6, Landroidx/compose/material3/SnapFlingBehavior;->decayAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;

    .line 79
    .line 80
    iput-object v6, v5, Landroidx/compose/material3/SnapFlingBehavior$runApproach$1;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    iput v2, v5, Landroidx/compose/material3/SnapFlingBehavior$runApproach$1;->label:I

    .line 83
    .line 84
    move-object/from16 v0, p0

    .line 85
    .line 86
    move-object/from16 v1, p1

    .line 87
    .line 88
    move/from16 v2, p2

    .line 89
    .line 90
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/SnapFlingBehavior;->animateDecay(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-ne v0, v7, :cond_3

    .line 95
    .line 96
    return-object v7

    .line 97
    :cond_3
    move-object v1, v6

    .line 98
    :goto_1
    check-cast v0, Landroidx/compose/material3/AnimationResult;

    .line 99
    .line 100
    invoke-virtual {v0}, Landroidx/compose/material3/AnimationResult;->component2()Landroidx/compose/animation/core/AnimationState;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Landroidx/compose/animation/core/AnimationState;->getVelocity()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    iget-object v3, v1, Landroidx/compose/material3/SnapFlingBehavior;->lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

    .line 115
    .line 116
    invoke-direct {v1, v2, v3}, Landroidx/compose/material3/SnapFlingBehavior;->findClosestOffset(FLandroidx/compose/foundation/lazy/LazyListState;)F

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    new-instance v2, Landroidx/compose/material3/AnimationResult;

    .line 121
    .line 122
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-direct {v2, v1, v0}, Landroidx/compose/material3/AnimationResult;-><init>(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationState;)V

    .line 127
    .line 128
    .line 129
    return-object v2
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

.method private final shortSnap(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "F",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/material3/AnimationResult<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, v7, Landroidx/compose/material3/SnapFlingBehavior;->lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

    .line 5
    .line 6
    invoke-direct {v7, v0, v1}, Landroidx/compose/material3/SnapFlingBehavior;->findClosestOffset(FLandroidx/compose/foundation/lazy/LazyListState;)F

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    const/4 v8, 0x0

    .line 11
    const-wide/16 v10, 0x0

    .line 12
    .line 13
    const-wide/16 v12, 0x0

    .line 14
    .line 15
    const/4 v14, 0x0

    .line 16
    const/16 v15, 0x1c

    .line 17
    .line 18
    const/16 v16, 0x0

    .line 19
    .line 20
    move/from16 v9, p2

    .line 21
    .line 22
    invoke-static/range {v8 .. v16}, Landroidx/compose/animation/core/AnimationStateKt;->AnimationState$default(FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-object v5, v7, Landroidx/compose/material3/SnapFlingBehavior;->snapAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 27
    .line 28
    move-object/from16 v0, p0

    .line 29
    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    move v2, v3

    .line 33
    move-object/from16 v6, p3

    .line 34
    .line 35
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/SnapFlingBehavior;->animateSnap(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
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


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    instance-of v0, p1, Landroidx/compose/material3/SnapFlingBehavior;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Landroidx/compose/material3/SnapFlingBehavior;

    .line 7
    .line 8
    iget-object v0, p1, Landroidx/compose/material3/SnapFlingBehavior;->snapAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 9
    .line 10
    iget-object v2, p0, Landroidx/compose/material3/SnapFlingBehavior;->snapAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 11
    .line 12
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p1, Landroidx/compose/material3/SnapFlingBehavior;->decayAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/compose/material3/SnapFlingBehavior;->decayAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;

    .line 21
    .line 22
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p1, Landroidx/compose/material3/SnapFlingBehavior;->lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/compose/material3/SnapFlingBehavior;->lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

    .line 31
    .line 32
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    iget-object p1, p1, Landroidx/compose/material3/SnapFlingBehavior;->density:Landroidx/compose/ui/unit/Density;

    .line 39
    .line 40
    iget-object v0, p0, Landroidx/compose/material3/SnapFlingBehavior;->density:Landroidx/compose/ui/unit/Density;

    .line 41
    .line 42
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    :cond_0
    return v1
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

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/SnapFlingBehavior;->snapAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    add-int/2addr v1, v0

    .line 9
    mul-int/lit8 v1, v1, 0x1f

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/material3/SnapFlingBehavior;->decayAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/compose/material3/SnapFlingBehavior;->lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v1, v0

    .line 27
    mul-int/lit8 v1, v1, 0x1f

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/compose/material3/SnapFlingBehavior;->density:Landroidx/compose/ui/unit/Density;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    add-int/2addr v1, v0

    .line 36
    return v1
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

.method public performFling(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 4
    .param p1    # Landroidx/compose/foundation/gestures/ScrollScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "F",
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
    instance-of v0, p3, Landroidx/compose/material3/SnapFlingBehavior$performFling$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/material3/SnapFlingBehavior$performFling$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/material3/SnapFlingBehavior$performFling$1;->label:I

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
    iput v1, v0, Landroidx/compose/material3/SnapFlingBehavior$performFling$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/material3/SnapFlingBehavior$performFling$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/compose/material3/SnapFlingBehavior$performFling$1;-><init>(Landroidx/compose/material3/SnapFlingBehavior;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/material3/SnapFlingBehavior$performFling$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/material3/SnapFlingBehavior$performFling$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput v3, v0, Landroidx/compose/material3/SnapFlingBehavior$performFling$1;->label:I

    .line 54
    .line 55
    invoke-direct {p0, p1, p2, v0}, Landroidx/compose/material3/SnapFlingBehavior;->fling(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    if-ne p3, v1, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    :goto_1
    check-cast p3, Landroidx/compose/material3/AnimationResult;

    .line 63
    .line 64
    invoke-virtual {p3}, Landroidx/compose/material3/AnimationResult;->component1()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Ljava/lang/Number;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-virtual {p3}, Landroidx/compose/material3/AnimationResult;->component2()Landroidx/compose/animation/core/AnimationState;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    const/4 p3, 0x0

    .line 79
    cmpg-float p1, p1, p3

    .line 80
    .line 81
    if-nez p1, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    const/4 v3, 0x0

    .line 85
    :goto_2
    if-eqz v3, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    invoke-virtual {p2}, Landroidx/compose/animation/core/AnimationState;->getVelocity()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    :goto_3
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1
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
