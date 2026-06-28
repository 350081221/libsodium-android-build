.class public final Landroidx/compose/foundation/gestures/ScrollableKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0099\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0008\u0004*\u00019\u001aH\u0010\u000c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007\u001a\\\u0010\u000c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\" \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\"J\u0010#\u001a8\u0008\u0001\u0012\u0004\u0012\u00020\u001a\u0012\u0013\u0012\u00110\u001b\u00a2\u0006\u000c\u0008\u001c\u0012\u0008\u0008\u001d\u0012\u0004\u0008\u0008(\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f\u0012\u0006\u0012\u0004\u0018\u00010!0\u0019\u00a2\u0006\u0002\u0008\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\"\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'\" \u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00050(8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,\"\u001a\u0010-\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100\"\u0014\u00102\u001a\u0002018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00082\u00103\"\u001a\u00105\u001a\u0002048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108\"\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;\u00a8\u0006<"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Landroidx/compose/foundation/gestures/ScrollableState;",
        "state",
        "Landroidx/compose/foundation/gestures/Orientation;",
        "orientation",
        "",
        "enabled",
        "reverseDirection",
        "Landroidx/compose/foundation/gestures/FlingBehavior;",
        "flingBehavior",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "scrollable",
        "Landroidx/compose/foundation/OverscrollEffect;",
        "overscrollEffect",
        "Landroidx/compose/foundation/gestures/BringIntoViewSpec;",
        "bringIntoViewSpec",
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "Landroidx/compose/ui/input/pointer/PointerEvent;",
        "awaitScrollEvent",
        "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "CanDragCalculation",
        "Lv3/l;",
        "Lkotlin/Function3;",
        "Lkotlinx/coroutines/s0;",
        "Landroidx/compose/ui/geometry/Offset;",
        "Lkotlin/v0;",
        "name",
        "startedPosition",
        "Lkotlin/coroutines/d;",
        "Lkotlin/r2;",
        "",
        "Lkotlin/u;",
        "NoOpOnDragStarted",
        "Lv3/q;",
        "Landroidx/compose/foundation/gestures/ScrollScope;",
        "NoOpScrollScope",
        "Landroidx/compose/foundation/gestures/ScrollScope;",
        "Landroidx/compose/ui/modifier/ProvidableModifierLocal;",
        "ModifierLocalScrollableContainer",
        "Landroidx/compose/ui/modifier/ProvidableModifierLocal;",
        "getModifierLocalScrollableContainer",
        "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;",
        "NoOpFlingBehavior",
        "Landroidx/compose/foundation/gestures/FlingBehavior;",
        "getNoOpFlingBehavior",
        "()Landroidx/compose/foundation/gestures/FlingBehavior;",
        "",
        "DefaultScrollMotionDurationScaleFactor",
        "F",
        "Landroidx/compose/ui/MotionDurationScale;",
        "DefaultScrollMotionDurationScale",
        "Landroidx/compose/ui/MotionDurationScale;",
        "getDefaultScrollMotionDurationScale",
        "()Landroidx/compose/ui/MotionDurationScale;",
        "androidx/compose/foundation/gestures/ScrollableKt$UnityDensity$1",
        "UnityDensity",
        "Landroidx/compose/foundation/gestures/ScrollableKt$UnityDensity$1;",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final CanDragCalculation:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final DefaultScrollMotionDurationScale:Landroidx/compose/ui/MotionDurationScale;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final DefaultScrollMotionDurationScaleFactor:F = 1.0f

.field private static final ModifierLocalScrollableContainer:Landroidx/compose/ui/modifier/ProvidableModifierLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/modifier/ProvidableModifierLocal<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final NoOpFlingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final NoOpOnDragStarted:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Lkotlinx/coroutines/s0;",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final NoOpScrollScope:Landroidx/compose/foundation/gestures/ScrollScope;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final UnityDensity:Landroidx/compose/foundation/gestures/ScrollableKt$UnityDensity$1;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/foundation/gestures/ScrollableKt$CanDragCalculation$1;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableKt$CanDragCalculation$1;

    .line 2
    .line 3
    sput-object v0, Landroidx/compose/foundation/gestures/ScrollableKt;->CanDragCalculation:Lv3/l;

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/foundation/gestures/ScrollableKt$NoOpOnDragStarted$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1}, Landroidx/compose/foundation/gestures/ScrollableKt$NoOpOnDragStarted$1;-><init>(Lkotlin/coroutines/d;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Landroidx/compose/foundation/gestures/ScrollableKt;->NoOpOnDragStarted:Lv3/q;

    .line 12
    .line 13
    new-instance v0, Landroidx/compose/foundation/gestures/ScrollableKt$NoOpScrollScope$1;

    .line 14
    .line 15
    invoke-direct {v0}, Landroidx/compose/foundation/gestures/ScrollableKt$NoOpScrollScope$1;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Landroidx/compose/foundation/gestures/ScrollableKt;->NoOpScrollScope:Landroidx/compose/foundation/gestures/ScrollScope;

    .line 19
    .line 20
    sget-object v0, Landroidx/compose/foundation/gestures/ScrollableKt$ModifierLocalScrollableContainer$1;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableKt$ModifierLocalScrollableContainer$1;

    .line 21
    .line 22
    invoke-static {v0}, Landroidx/compose/ui/modifier/ModifierLocalKt;->modifierLocalOf(Lv3/a;)Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Landroidx/compose/foundation/gestures/ScrollableKt;->ModifierLocalScrollableContainer:Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    .line 27
    .line 28
    new-instance v0, Landroidx/compose/foundation/gestures/ScrollableKt$NoOpFlingBehavior$1;

    .line 29
    .line 30
    invoke-direct {v0}, Landroidx/compose/foundation/gestures/ScrollableKt$NoOpFlingBehavior$1;-><init>()V

    .line 31
    .line 32
    .line 33
    sput-object v0, Landroidx/compose/foundation/gestures/ScrollableKt;->NoOpFlingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 34
    .line 35
    new-instance v0, Landroidx/compose/foundation/gestures/ScrollableKt$DefaultScrollMotionDurationScale$1;

    .line 36
    .line 37
    invoke-direct {v0}, Landroidx/compose/foundation/gestures/ScrollableKt$DefaultScrollMotionDurationScale$1;-><init>()V

    .line 38
    .line 39
    .line 40
    sput-object v0, Landroidx/compose/foundation/gestures/ScrollableKt;->DefaultScrollMotionDurationScale:Landroidx/compose/ui/MotionDurationScale;

    .line 41
    .line 42
    new-instance v0, Landroidx/compose/foundation/gestures/ScrollableKt$UnityDensity$1;

    .line 43
    .line 44
    invoke-direct {v0}, Landroidx/compose/foundation/gestures/ScrollableKt$UnityDensity$1;-><init>()V

    .line 45
    .line 46
    .line 47
    sput-object v0, Landroidx/compose/foundation/gestures/ScrollableKt;->UnityDensity:Landroidx/compose/foundation/gestures/ScrollableKt$UnityDensity$1;

    .line 48
    .line 49
    return-void
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

.method public static final synthetic access$awaitScrollEvent(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/foundation/gestures/ScrollableKt;->awaitScrollEvent(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCanDragCalculation$p()Lv3/l;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/gestures/ScrollableKt;->CanDragCalculation:Lv3/l;

    return-object v0
.end method

.method public static final synthetic access$getNoOpOnDragStarted$p()Lv3/q;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/gestures/ScrollableKt;->NoOpOnDragStarted:Lv3/q;

    return-object v0
.end method

.method public static final synthetic access$getNoOpScrollScope$p()Landroidx/compose/foundation/gestures/ScrollScope;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/gestures/ScrollableKt;->NoOpScrollScope:Landroidx/compose/foundation/gestures/ScrollScope;

    return-object v0
.end method

.method public static final synthetic access$getUnityDensity$p()Landroidx/compose/foundation/gestures/ScrollableKt$UnityDensity$1;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/gestures/ScrollableKt;->UnityDensity:Landroidx/compose/foundation/gestures/ScrollableKt$UnityDensity$1;

    return-object v0
.end method

.method private static final awaitScrollEvent(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerEvent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/compose/foundation/gestures/ScrollableKt$awaitScrollEvent$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/compose/foundation/gestures/ScrollableKt$awaitScrollEvent$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/gestures/ScrollableKt$awaitScrollEvent$1;->label:I

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
    iput v1, v0, Landroidx/compose/foundation/gestures/ScrollableKt$awaitScrollEvent$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/ScrollableKt$awaitScrollEvent$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Landroidx/compose/foundation/gestures/ScrollableKt$awaitScrollEvent$1;-><init>(Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/compose/foundation/gestures/ScrollableKt$awaitScrollEvent$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/gestures/ScrollableKt$awaitScrollEvent$1;->label:I

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
    iget-object p0, v0, Landroidx/compose/foundation/gestures/ScrollableKt$awaitScrollEvent$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iput-object p0, v0, Landroidx/compose/foundation/gestures/ScrollableKt$awaitScrollEvent$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    iput v3, v0, Landroidx/compose/foundation/gestures/ScrollableKt$awaitScrollEvent$1;->label:I

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    invoke-static {p0, p1, v0, v3, p1}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_4

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_4
    :goto_1
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerEvent;->getType-7fucELk()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    sget-object v4, Landroidx/compose/ui/input/pointer/PointerEventType;->Companion:Landroidx/compose/ui/input/pointer/PointerEventType$Companion;

    .line 76
    .line 77
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerEventType$Companion;->getScroll-7fucELk()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-static {v2, v4}, Landroidx/compose/ui/input/pointer/PointerEventType;->equals-impl0(II)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    return-object p1
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

.method public static final getDefaultScrollMotionDurationScale()Landroidx/compose/ui/MotionDurationScale;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/gestures/ScrollableKt;->DefaultScrollMotionDurationScale:Landroidx/compose/ui/MotionDurationScale;

    return-object v0
.end method

.method public static final getModifierLocalScrollableContainer()Landroidx/compose/ui/modifier/ProvidableModifierLocal;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/modifier/ProvidableModifierLocal<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/gestures/ScrollableKt;->ModifierLocalScrollableContainer:Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    return-object v0
.end method

.method public static final getNoOpFlingBehavior()Landroidx/compose/foundation/gestures/FlingBehavior;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/gestures/ScrollableKt;->NoOpFlingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    return-object v0
.end method

.method public static final scrollable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)Landroidx/compose/ui/Modifier;
    .locals 10
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/gestures/ScrollableState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/gestures/Orientation;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/OverscrollEffect;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/foundation/gestures/FlingBehavior;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/foundation/gestures/BringIntoViewSpec;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v9, Landroidx/compose/foundation/gestures/ScrollableElement;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/ScrollableElement;-><init>(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V

    move-object v0, p0

    invoke-interface {p0, v9}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method

.method public static final scrollable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;
    .locals 11
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/gestures/ScrollableState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/gestures/Orientation;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/foundation/gestures/FlingBehavior;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x80

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    move v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    .line 1
    invoke-static/range {v0 .. v10}, Landroidx/compose/foundation/gestures/ScrollableKt;->scrollable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic scrollable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 11

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    move v6, v1

    goto :goto_0

    :cond_0
    move v6, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move v7, v1

    goto :goto_1

    :cond_1
    move/from16 v7, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object/from16 v9, p7

    :goto_3
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_4

    .line 2
    sget-object v0, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->bringIntoViewSpec()Landroidx/compose/foundation/gestures/BringIntoViewSpec;

    move-result-object v0

    move-object v10, v0

    goto :goto_4

    :cond_4
    move-object/from16 v10, p8

    :goto_4
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    .line 3
    invoke-static/range {v2 .. v10}, Landroidx/compose/foundation/gestures/ScrollableKt;->scrollable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic scrollable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/4 p3, 0x1

    :cond_0
    move v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move v4, p4

    and-int/lit8 p3, p7, 0x10

    const/4 p4, 0x0

    if-eqz p3, :cond_2

    move-object v5, p4

    goto :goto_0

    :cond_2
    move-object v5, p5

    :goto_0
    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    move-object v6, p4

    goto :goto_1

    :cond_3
    move-object v6, p6

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 1
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/gestures/ScrollableKt;->scrollable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
