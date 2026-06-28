.class public final Landroidx/compose/foundation/gestures/DraggableKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u001a#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u00cb\u0001\u0010\u001e\u001a\u00020\u0008*\u00020\u00082\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000c2>\u0008\u0002\u0010\u001a\u001a8\u0008\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011\u00a2\u0006\u0002\u0008\u00192>\u0008\u0002\u0010\u001c\u001a8\u0008\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011\u00a2\u0006\u0002\u0008\u00192\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001aT\u0010)\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0013\u0018\u00010(*\u00020 2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000c0\u00002\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000c0#2\u0006\u0010%\u001a\u00020$2\u0006\u0010\'\u001a\u00020&H\u0082@\u00a2\u0006\u0004\u0008)\u0010*\u001aY\u00103\u001a\u00020\u000c*\u00020 2\u0006\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020.0-2\u0006\u0010\u001d\u001a\u00020\u000c2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000c0\u0000H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u00102\u001aG\u00109\u001a\u00020\u000c*\u00020 2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000c0\u00002\u0006\u00105\u001a\u0002042\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020\u0000H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u00087\u00108\u001a\u001e\u0010<\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008:\u0010;\u001a\u001e\u0010<\u001a\u00020\u0001*\u00020=2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008>\u0010;\"\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010A\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006B"
    }
    d2 = {
        "Lkotlin/Function1;",
        "",
        "Lkotlin/r2;",
        "onDelta",
        "Landroidx/compose/foundation/gestures/DraggableState;",
        "DraggableState",
        "rememberDraggableState",
        "(Lv3/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;",
        "Landroidx/compose/ui/Modifier;",
        "state",
        "Landroidx/compose/foundation/gestures/Orientation;",
        "orientation",
        "",
        "enabled",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "startDragImmediately",
        "Lkotlin/Function3;",
        "Lkotlinx/coroutines/s0;",
        "Landroidx/compose/ui/geometry/Offset;",
        "Lkotlin/v0;",
        "name",
        "startedPosition",
        "Lkotlin/coroutines/d;",
        "",
        "Lkotlin/u;",
        "onDragStarted",
        "velocity",
        "onDragStopped",
        "reverseDirection",
        "draggable",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLv3/q;Lv3/q;Z)Landroidx/compose/ui/Modifier;",
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "canDrag",
        "Lkotlin/Function0;",
        "Landroidx/compose/ui/input/pointer/util/VelocityTracker;",
        "velocityTracker",
        "Landroidx/compose/foundation/gestures/PointerDirectionConfig;",
        "pointerDirectionConfig",
        "Lkotlin/u0;",
        "awaitDownAndSlop",
        "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lv3/l;Lv3/a;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/PointerDirectionConfig;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "startEvent",
        "initialDelta",
        "Lkotlinx/coroutines/channels/h0;",
        "Landroidx/compose/foundation/gestures/DragEvent;",
        "channel",
        "hasDragged",
        "awaitDrag-Su4bsnU",
        "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/h0;ZLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "awaitDrag",
        "Landroidx/compose/ui/input/pointer/PointerId;",
        "pointerId",
        "onDrag",
        "onDragOrUp-Axegvzg",
        "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lv3/l;JLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "onDragOrUp",
        "toFloat-3MmeM6k",
        "(JLandroidx/compose/foundation/gestures/Orientation;)F",
        "toFloat",
        "Landroidx/compose/ui/unit/Velocity;",
        "toFloat-sF-c-tU",
        "Landroidx/compose/foundation/gestures/DragScope;",
        "NoOpDragScope",
        "Landroidx/compose/foundation/gestures/DragScope;",
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
        "SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,680:1\n25#2:681\n1116#3,6:682\n659#4,10:688\n669#4,4:707\n673#4,38:718\n579#4,6:756\n613#4,4:762\n617#4,2:775\n619#4,8:784\n586#4,10:792\n116#5,2:698\n33#5,6:700\n118#5:706\n33#5,6:711\n118#5:717\n116#5,2:766\n33#5,6:768\n118#5:774\n33#5,6:777\n118#5:783\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n144#1:681\n144#1:682,6\n593#1:688,10\n593#1:707,4\n593#1:718,38\n640#1:756,6\n640#1:762,4\n640#1:775,2\n640#1:784,8\n640#1:792,10\n593#1:698,2\n593#1:700,6\n593#1:706\n593#1:711,6\n593#1:717\n640#1:766,2\n640#1:768,6\n640#1:774\n640#1:777,6\n640#1:783\n*E\n"
    }
.end annotation


# static fields
.field private static final NoOpDragScope:Landroidx/compose/foundation/gestures/DragScope;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/gestures/DraggableKt$NoOpDragScope$1;

    invoke-direct {v0}, Landroidx/compose/foundation/gestures/DraggableKt$NoOpDragScope$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/DraggableKt;->NoOpDragScope:Landroidx/compose/foundation/gestures/DragScope;

    return-void
.end method

.method public static final DraggableState(Lv3/l;)Landroidx/compose/foundation/gestures/DraggableState;
    .locals 1
    .param p0    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/r2;",
            ">;)",
            "Landroidx/compose/foundation/gestures/DraggableState;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/gestures/DefaultDraggableState;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/gestures/DefaultDraggableState;-><init>(Lv3/l;)V

    return-object v0
.end method

.method public static final synthetic access$awaitDownAndSlop(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lv3/l;Lv3/a;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/PointerDirectionConfig;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/gestures/DraggableKt;->awaitDownAndSlop(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lv3/l;Lv3/a;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/PointerDirectionConfig;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$awaitDrag-Su4bsnU(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/h0;ZLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p8}, Landroidx/compose/foundation/gestures/DraggableKt;->awaitDrag-Su4bsnU(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/h0;ZLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getNoOpDragScope$p()Landroidx/compose/foundation/gestures/DragScope;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/gestures/DraggableKt;->NoOpDragScope:Landroidx/compose/foundation/gestures/DragScope;

    return-object v0
.end method

.method public static final synthetic access$onDragOrUp-Axegvzg(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lv3/l;JLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/gestures/DraggableKt;->onDragOrUp-Axegvzg(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lv3/l;JLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toFloat-3MmeM6k(JLandroidx/compose/foundation/gestures/Orientation;)F
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/gestures/DraggableKt;->toFloat-3MmeM6k(JLandroidx/compose/foundation/gestures/Orientation;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$toFloat-sF-c-tU(JLandroidx/compose/foundation/gestures/Orientation;)F
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/gestures/DraggableKt;->toFloat-sF-c-tU(JLandroidx/compose/foundation/gestures/Orientation;)F

    move-result p0

    return p0
.end method

.method private static final awaitDownAndSlop(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lv3/l;Lv3/a;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/PointerDirectionConfig;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/ui/input/pointer/util/VelocityTracker;",
            "Landroidx/compose/foundation/gestures/PointerDirectionConfig;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/u0<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    instance-of v2, v1, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;

    .line 11
    .line 12
    iget v3, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;-><init>(Lkotlin/coroutines/d;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->label:I

    .line 36
    .line 37
    const/4 v5, 0x4

    .line 38
    const/4 v6, 0x3

    .line 39
    const/4 v7, 0x2

    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v9, 0x1

    .line 42
    const/4 v10, 0x0

    .line 43
    if-eqz v4, :cond_5

    .line 44
    .line 45
    if-eq v4, v9, :cond_4

    .line 46
    .line 47
    if-eq v4, v7, :cond_3

    .line 48
    .line 49
    if-eq v4, v6, :cond_2

    .line 50
    .line 51
    if-ne v4, v5, :cond_1

    .line 52
    .line 53
    iget-wide v11, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->J$0:J

    .line 54
    .line 55
    iget v0, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->F$0:F

    .line 56
    .line 57
    iget-object v4, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$5:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 60
    .line 61
    iget-object v7, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$4:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v7, Lkotlin/jvm/internal/k1$g;

    .line 64
    .line 65
    iget-object v13, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$3:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v13, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 68
    .line 69
    iget-object v14, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$2:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v14, Lv3/p;

    .line 72
    .line 73
    iget-object v15, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$1:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v15, Lkotlin/jvm/internal/k1$g;

    .line 76
    .line 77
    iget-object v5, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$0:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v5, Landroidx/compose/foundation/gestures/PointerDirectionConfig;

    .line 80
    .line 81
    invoke-static {v1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    move v1, v0

    .line 85
    move-object v0, v5

    .line 86
    move-wide v9, v11

    .line 87
    move-object v5, v13

    .line 88
    move-object v12, v14

    .line 89
    move-object v13, v15

    .line 90
    const/4 v8, 0x4

    .line 91
    goto/16 :goto_9

    .line 92
    .line 93
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 96
    .line 97
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v0

    .line 101
    :cond_2
    iget-wide v4, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->J$0:J

    .line 102
    .line 103
    iget v0, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->F$0:F

    .line 104
    .line 105
    iget-object v7, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$4:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v7, Lkotlin/jvm/internal/k1$g;

    .line 108
    .line 109
    iget-object v11, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$3:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v11, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 112
    .line 113
    iget-object v12, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$2:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v12, Lv3/p;

    .line 116
    .line 117
    iget-object v13, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$1:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v13, Lkotlin/jvm/internal/k1$g;

    .line 120
    .line 121
    iget-object v14, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$0:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v14, Landroidx/compose/foundation/gestures/PointerDirectionConfig;

    .line 124
    .line 125
    invoke-static {v1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    move-object/from16 v18, v2

    .line 129
    .line 130
    move v2, v0

    .line 131
    move-object v0, v14

    .line 132
    move-wide v14, v4

    .line 133
    move-object v5, v11

    .line 134
    move-object v4, v3

    .line 135
    move-object/from16 v3, v18

    .line 136
    .line 137
    goto/16 :goto_4

    .line 138
    .line 139
    :cond_3
    iget-object v0, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$2:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, Landroidx/compose/foundation/gestures/PointerDirectionConfig;

    .line 142
    .line 143
    iget-object v4, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$1:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v4, Landroidx/compose/ui/input/pointer/util/VelocityTracker;

    .line 146
    .line 147
    iget-object v5, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$0:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v5, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 150
    .line 151
    invoke-static {v1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_2

    .line 155
    .line 156
    :cond_4
    iget-object v0, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$4:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Landroidx/compose/foundation/gestures/PointerDirectionConfig;

    .line 159
    .line 160
    iget-object v4, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$3:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v4, Landroidx/compose/ui/input/pointer/util/VelocityTracker;

    .line 163
    .line 164
    iget-object v5, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$2:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v5, Lv3/a;

    .line 167
    .line 168
    iget-object v11, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$1:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v11, Lv3/l;

    .line 171
    .line 172
    iget-object v12, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$0:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v12, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 175
    .line 176
    invoke-static {v1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_5
    invoke-static {v1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    sget-object v1, Landroidx/compose/ui/input/pointer/PointerEventPass;->Initial:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 184
    .line 185
    iput-object v0, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$0:Ljava/lang/Object;

    .line 186
    .line 187
    move-object/from16 v4, p1

    .line 188
    .line 189
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$1:Ljava/lang/Object;

    .line 190
    .line 191
    move-object/from16 v5, p2

    .line 192
    .line 193
    iput-object v5, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$2:Ljava/lang/Object;

    .line 194
    .line 195
    move-object/from16 v11, p3

    .line 196
    .line 197
    iput-object v11, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$3:Ljava/lang/Object;

    .line 198
    .line 199
    move-object/from16 v12, p4

    .line 200
    .line 201
    iput-object v12, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$4:Ljava/lang/Object;

    .line 202
    .line 203
    iput v9, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->label:I

    .line 204
    .line 205
    invoke-static {v0, v8, v1, v2}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    if-ne v1, v3, :cond_6

    .line 210
    .line 211
    return-object v3

    .line 212
    :cond_6
    move-object/from16 v18, v12

    .line 213
    .line 214
    move-object v12, v0

    .line 215
    move-object/from16 v0, v18

    .line 216
    .line 217
    move-object/from16 v19, v11

    .line 218
    .line 219
    move-object v11, v4

    .line 220
    move-object/from16 v4, v19

    .line 221
    .line 222
    :goto_1
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 223
    .line 224
    invoke-interface {v11, v1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    check-cast v11, Ljava/lang/Boolean;

    .line 229
    .line 230
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 231
    .line 232
    .line 233
    move-result v11

    .line 234
    if-nez v11, :cond_7

    .line 235
    .line 236
    goto/16 :goto_d

    .line 237
    .line 238
    :cond_7
    invoke-interface {v5}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    check-cast v5, Ljava/lang/Boolean;

    .line 243
    .line 244
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    if-eqz v5, :cond_8

    .line 249
    .line 250
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 251
    .line 252
    .line 253
    invoke-static {v4, v1}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->addPointerInputChange(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V

    .line 254
    .line 255
    .line 256
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 257
    .line 258
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 259
    .line 260
    .line 261
    move-result-wide v2

    .line 262
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-static {v1, v0}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    goto/16 :goto_d

    .line 271
    .line 272
    :cond_8
    const/4 v1, 0x0

    .line 273
    const/4 v5, 0x0

    .line 274
    const/4 v11, 0x2

    .line 275
    const/4 v13, 0x0

    .line 276
    iput-object v12, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$0:Ljava/lang/Object;

    .line 277
    .line 278
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$1:Ljava/lang/Object;

    .line 279
    .line 280
    iput-object v0, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$2:Ljava/lang/Object;

    .line 281
    .line 282
    iput-object v10, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$3:Ljava/lang/Object;

    .line 283
    .line 284
    iput-object v10, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$4:Ljava/lang/Object;

    .line 285
    .line 286
    iput v7, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->label:I

    .line 287
    .line 288
    move-object/from16 p0, v12

    .line 289
    .line 290
    move/from16 p1, v1

    .line 291
    .line 292
    move-object/from16 p2, v5

    .line 293
    .line 294
    move-object/from16 p3, v2

    .line 295
    .line 296
    move/from16 p4, v11

    .line 297
    .line 298
    move-object/from16 p5, v13

    .line 299
    .line 300
    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    if-ne v1, v3, :cond_9

    .line 305
    .line 306
    return-object v3

    .line 307
    :cond_9
    move-object v5, v12

    .line 308
    :goto_2
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 309
    .line 310
    invoke-static {v4, v1}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->addPointerInputChange(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V

    .line 311
    .line 312
    .line 313
    new-instance v7, Lkotlin/jvm/internal/k1$g;

    .line 314
    .line 315
    invoke-direct {v7}, Lkotlin/jvm/internal/k1$g;-><init>()V

    .line 316
    .line 317
    .line 318
    sget-object v11, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 319
    .line 320
    invoke-virtual {v11}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 321
    .line 322
    .line 323
    move-result-wide v12

    .line 324
    iput-wide v12, v7, Lkotlin/jvm/internal/k1$g;->element:J

    .line 325
    .line 326
    new-instance v12, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$postPointerSlop$1;

    .line 327
    .line 328
    invoke-direct {v12, v4, v7}, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$postPointerSlop$1;-><init>(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlin/jvm/internal/k1$g;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 332
    .line 333
    .line 334
    move-result-wide v13

    .line 335
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    invoke-interface {v5}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    invoke-static {v4, v13, v14}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-eqz v4, :cond_a

    .line 348
    .line 349
    move-object v4, v10

    .line 350
    goto/16 :goto_c

    .line 351
    .line 352
    :cond_a
    invoke-interface {v5}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    invoke-static {v4, v1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    new-instance v4, Lkotlin/jvm/internal/k1$g;

    .line 361
    .line 362
    invoke-direct {v4}, Lkotlin/jvm/internal/k1$g;-><init>()V

    .line 363
    .line 364
    .line 365
    iput-wide v13, v4, Lkotlin/jvm/internal/k1$g;->element:J

    .line 366
    .line 367
    invoke-virtual {v11}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 368
    .line 369
    .line 370
    move-result-wide v13

    .line 371
    :goto_3
    iput-object v0, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$0:Ljava/lang/Object;

    .line 372
    .line 373
    iput-object v7, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$1:Ljava/lang/Object;

    .line 374
    .line 375
    iput-object v12, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$2:Ljava/lang/Object;

    .line 376
    .line 377
    iput-object v5, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$3:Ljava/lang/Object;

    .line 378
    .line 379
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$4:Ljava/lang/Object;

    .line 380
    .line 381
    iput-object v10, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$5:Ljava/lang/Object;

    .line 382
    .line 383
    iput v1, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->F$0:F

    .line 384
    .line 385
    iput-wide v13, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->J$0:J

    .line 386
    .line 387
    iput v6, v2, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->label:I

    .line 388
    .line 389
    invoke-static {v5, v10, v2, v9, v10}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v11

    .line 393
    if-ne v11, v3, :cond_b

    .line 394
    .line 395
    return-object v3

    .line 396
    :cond_b
    move-wide v14, v13

    .line 397
    move-object v13, v7

    .line 398
    move-object v7, v4

    .line 399
    move-object v4, v3

    .line 400
    move-object v3, v2

    .line 401
    move v2, v1

    .line 402
    move-object v1, v11

    .line 403
    :goto_4
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 404
    .line 405
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 406
    .line 407
    .line 408
    move-result-object v11

    .line 409
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 410
    .line 411
    .line 412
    move-result v6

    .line 413
    :goto_5
    if-ge v8, v6, :cond_d

    .line 414
    .line 415
    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v16

    .line 419
    move-object/from16 v17, v16

    .line 420
    .line 421
    check-cast v17, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 422
    .line 423
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 424
    .line 425
    .line 426
    move-result-wide v9

    .line 427
    move-object/from16 v17, v4

    .line 428
    .line 429
    move-object/from16 p0, v5

    .line 430
    .line 431
    iget-wide v4, v7, Lkotlin/jvm/internal/k1$g;->element:J

    .line 432
    .line 433
    invoke-static {v9, v10, v4, v5}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 434
    .line 435
    .line 436
    move-result v4

    .line 437
    if-eqz v4, :cond_c

    .line 438
    .line 439
    goto :goto_6

    .line 440
    :cond_c
    add-int/lit8 v8, v8, 0x1

    .line 441
    .line 442
    move-object/from16 v5, p0

    .line 443
    .line 444
    move-object/from16 v4, v17

    .line 445
    .line 446
    const/4 v9, 0x1

    .line 447
    const/4 v10, 0x0

    .line 448
    goto :goto_5

    .line 449
    :cond_d
    move-object/from16 v17, v4

    .line 450
    .line 451
    move-object/from16 p0, v5

    .line 452
    .line 453
    const/16 v16, 0x0

    .line 454
    .line 455
    :goto_6
    move-object/from16 v4, v16

    .line 456
    .line 457
    check-cast v4, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 458
    .line 459
    if-nez v4, :cond_e

    .line 460
    .line 461
    goto/16 :goto_a

    .line 462
    .line 463
    :cond_e
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 464
    .line 465
    .line 466
    move-result v5

    .line 467
    if-eqz v5, :cond_f

    .line 468
    .line 469
    goto/16 :goto_a

    .line 470
    .line 471
    :cond_f
    invoke-static {v4}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 472
    .line 473
    .line 474
    move-result v5

    .line 475
    if-eqz v5, :cond_13

    .line 476
    .line 477
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 482
    .line 483
    .line 484
    move-result v4

    .line 485
    const/4 v5, 0x0

    .line 486
    :goto_7
    if-ge v5, v4, :cond_11

    .line 487
    .line 488
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v6

    .line 492
    move-object v8, v6

    .line 493
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 494
    .line 495
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 496
    .line 497
    .line 498
    move-result v8

    .line 499
    if-eqz v8, :cond_10

    .line 500
    .line 501
    goto :goto_8

    .line 502
    :cond_10
    add-int/lit8 v5, v5, 0x1

    .line 503
    .line 504
    goto :goto_7

    .line 505
    :cond_11
    const/4 v6, 0x0

    .line 506
    :goto_8
    check-cast v6, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 507
    .line 508
    if-nez v6, :cond_12

    .line 509
    .line 510
    goto :goto_a

    .line 511
    :cond_12
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 512
    .line 513
    .line 514
    move-result-wide v4

    .line 515
    iput-wide v4, v7, Lkotlin/jvm/internal/k1$g;->element:J

    .line 516
    .line 517
    move-object/from16 v5, p0

    .line 518
    .line 519
    move v1, v2

    .line 520
    move-object v2, v3

    .line 521
    move-object v4, v7

    .line 522
    move-object v7, v13

    .line 523
    move-wide v13, v14

    .line 524
    move-object/from16 v3, v17

    .line 525
    .line 526
    const/4 v6, 0x3

    .line 527
    const/4 v8, 0x0

    .line 528
    goto :goto_b

    .line 529
    :cond_13
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 530
    .line 531
    .line 532
    move-result-wide v5

    .line 533
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPreviousPosition-F1C5BW0()J

    .line 534
    .line 535
    .line 536
    move-result-wide v8

    .line 537
    invoke-static {v5, v6, v8, v9}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    .line 538
    .line 539
    .line 540
    move-result-wide v5

    .line 541
    invoke-static {v14, v15, v5, v6}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 542
    .line 543
    .line 544
    move-result-wide v5

    .line 545
    invoke-interface {v0, v5, v6}, Landroidx/compose/foundation/gestures/PointerDirectionConfig;->calculateDeltaChange-k-4lQ0M(J)F

    .line 546
    .line 547
    .line 548
    move-result v1

    .line 549
    cmpg-float v1, v1, v2

    .line 550
    .line 551
    if-gez v1, :cond_16

    .line 552
    .line 553
    sget-object v1, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 554
    .line 555
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$0:Ljava/lang/Object;

    .line 556
    .line 557
    iput-object v13, v3, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$1:Ljava/lang/Object;

    .line 558
    .line 559
    iput-object v12, v3, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$2:Ljava/lang/Object;

    .line 560
    .line 561
    move-object/from16 v11, p0

    .line 562
    .line 563
    iput-object v11, v3, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$3:Ljava/lang/Object;

    .line 564
    .line 565
    iput-object v7, v3, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$4:Ljava/lang/Object;

    .line 566
    .line 567
    iput-object v4, v3, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->L$5:Ljava/lang/Object;

    .line 568
    .line 569
    iput v2, v3, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->F$0:F

    .line 570
    .line 571
    iput-wide v5, v3, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->J$0:J

    .line 572
    .line 573
    const/4 v8, 0x4

    .line 574
    iput v8, v3, Landroidx/compose/foundation/gestures/DraggableKt$awaitDownAndSlop$1;->label:I

    .line 575
    .line 576
    invoke-interface {v11, v1, v3}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    move-object/from16 v9, v17

    .line 581
    .line 582
    if-ne v1, v9, :cond_14

    .line 583
    .line 584
    return-object v9

    .line 585
    :cond_14
    move v1, v2

    .line 586
    move-object v2, v3

    .line 587
    move-object v3, v9

    .line 588
    move-wide v9, v5

    .line 589
    move-object v5, v11

    .line 590
    :goto_9
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 591
    .line 592
    .line 593
    move-result v4

    .line 594
    if-eqz v4, :cond_15

    .line 595
    .line 596
    :goto_a
    move-object v7, v13

    .line 597
    const/4 v4, 0x0

    .line 598
    goto :goto_c

    .line 599
    :cond_15
    move-object v4, v7

    .line 600
    move-object v7, v13

    .line 601
    const/4 v6, 0x3

    .line 602
    const/4 v8, 0x0

    .line 603
    move-wide v13, v9

    .line 604
    :goto_b
    const/4 v9, 0x1

    .line 605
    const/4 v10, 0x0

    .line 606
    goto/16 :goto_3

    .line 607
    .line 608
    :cond_16
    move-object/from16 v11, p0

    .line 609
    .line 610
    move-object/from16 v9, v17

    .line 611
    .line 612
    const/4 v8, 0x4

    .line 613
    invoke-interface {v0, v5, v6, v2}, Landroidx/compose/foundation/gestures/PointerDirectionConfig;->calculatePostSlopOffset-8S9VItk(JF)J

    .line 614
    .line 615
    .line 616
    move-result-wide v5

    .line 617
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    invoke-interface {v12, v4, v1}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 625
    .line 626
    .line 627
    move-result v1

    .line 628
    if-eqz v1, :cond_18

    .line 629
    .line 630
    move-object v7, v13

    .line 631
    :goto_c
    if-eqz v4, :cond_17

    .line 632
    .line 633
    iget-wide v0, v7, Lkotlin/jvm/internal/k1$g;->element:J

    .line 634
    .line 635
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    invoke-static {v4, v0}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 640
    .line 641
    .line 642
    move-result-object v10

    .line 643
    goto :goto_d

    .line 644
    :cond_17
    const/4 v10, 0x0

    .line 645
    :goto_d
    return-object v10

    .line 646
    :cond_18
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 647
    .line 648
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 649
    .line 650
    .line 651
    move-result-wide v4

    .line 652
    move v1, v2

    .line 653
    move-object v2, v3

    .line 654
    move-object v3, v9

    .line 655
    const/4 v6, 0x3

    .line 656
    const/4 v8, 0x0

    .line 657
    const/4 v9, 0x1

    .line 658
    const/4 v10, 0x0

    .line 659
    move-wide/from16 v18, v4

    .line 660
    .line 661
    move-object v4, v7

    .line 662
    move-object v5, v11

    .line 663
    move-object v7, v13

    .line 664
    move-wide/from16 v13, v18

    .line 665
    .line 666
    goto/16 :goto_3
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
.end method

.method private static final awaitDrag-Su4bsnU(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/h0;ZLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "J",
            "Landroidx/compose/ui/input/pointer/util/VelocityTracker;",
            "Lkotlinx/coroutines/channels/h0<",
            "-",
            "Landroidx/compose/foundation/gestures/DragEvent;",
            ">;Z",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object v0, p5

    .line 2
    move v1, p6

    .line 3
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    mul-float/2addr v6, v2

    .line 36
    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    mul-float/2addr v2, v3

    .line 41
    invoke-static {v6, v2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    invoke-static {v4, v5, v2, v3}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    new-instance v4, Landroidx/compose/foundation/gestures/DragEvent$DragStarted;

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-direct {v4, v2, v3, v5}, Landroidx/compose/foundation/gestures/DragEvent$DragStarted;-><init>(JLkotlin/jvm/internal/w;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p5, v4}, Lkotlinx/coroutines/channels/h0;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    new-instance v2, Landroidx/compose/foundation/gestures/DragEvent$DragDelta;

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    const/high16 v3, -0x40800000    # -1.0f

    .line 63
    .line 64
    move-wide v6, p2

    .line 65
    invoke-static {p2, p3, v3}, Landroidx/compose/ui/geometry/Offset;->times-tuRUvjQ(JF)J

    .line 66
    .line 67
    .line 68
    move-result-wide v3

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move-wide v6, p2

    .line 71
    move-wide v3, v6

    .line 72
    :goto_0
    invoke-direct {v2, v3, v4, v5}, Landroidx/compose/foundation/gestures/DragEvent$DragDelta;-><init>(JLkotlin/jvm/internal/w;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p5, v2}, Lkotlinx/coroutines/channels/h0;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    new-instance v4, Landroidx/compose/foundation/gestures/DraggableKt$awaitDrag$2;

    .line 83
    .line 84
    move-object v5, p4

    .line 85
    invoke-direct {v4, p4, p5, p6}, Landroidx/compose/foundation/gestures/DraggableKt$awaitDrag$2;-><init>(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/h0;Z)V

    .line 86
    .line 87
    .line 88
    move-object p1, p7

    .line 89
    move-wide p2, v2

    .line 90
    move-object p4, v4

    .line 91
    move-object/from16 p5, p8

    .line 92
    .line 93
    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/gestures/DraggableKt;->onDragOrUp-Axegvzg(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lv3/l;JLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0
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
.end method

.method public static final draggable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLv3/q;Lv3/q;Z)Landroidx/compose/ui/Modifier;
    .locals 11
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/gestures/DraggableState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/gestures/Orientation;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Lv3/q;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p7    # Lv3/q;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/gestures/DraggableState;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Z",
            "Lv3/q<",
            "-",
            "Lkotlinx/coroutines/s0;",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lv3/q<",
            "-",
            "Lkotlinx/coroutines/s0;",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;Z)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v10, Landroidx/compose/foundation/gestures/DraggableElement;

    sget-object v2, Landroidx/compose/foundation/gestures/DraggableKt$draggable$3;->INSTANCE:Landroidx/compose/foundation/gestures/DraggableKt$draggable$3;

    new-instance v6, Landroidx/compose/foundation/gestures/DraggableKt$draggable$4;

    move/from16 v0, p5

    invoke-direct {v6, v0}, Landroidx/compose/foundation/gestures/DraggableKt$draggable$4;-><init>(Z)V

    new-instance v8, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;

    const/4 v0, 0x0

    move-object v3, p2

    move-object/from16 v1, p7

    invoke-direct {v8, v1, p2, v0}, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;-><init>(Lv3/q;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/d;)V

    move-object v0, v10

    move-object v1, p1

    move v4, p3

    move-object v5, p4

    move-object/from16 v7, p6

    move/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Landroidx/compose/foundation/gestures/DraggableElement;-><init>(Landroidx/compose/foundation/gestures/DraggableState;Lv3/l;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/a;Lv3/q;Lv3/q;Z)V

    move-object v0, p0

    invoke-interface {p0, v10}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic draggable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLv3/q;Lv3/q;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 11

    .line 1
    move/from16 v0, p9

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    move v5, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v5, p3

    .line 11
    :goto_0
    and-int/lit8 v1, v0, 0x8

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    move-object v6, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move-object v6, p4

    .line 19
    :goto_1
    and-int/lit8 v1, v0, 0x10

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    move v7, v3

    .line 25
    goto :goto_2

    .line 26
    :cond_2
    move/from16 v7, p5

    .line 27
    .line 28
    :goto_2
    and-int/lit8 v1, v0, 0x20

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    new-instance v1, Landroidx/compose/foundation/gestures/DraggableKt$draggable$1;

    .line 33
    .line 34
    invoke-direct {v1, v2}, Landroidx/compose/foundation/gestures/DraggableKt$draggable$1;-><init>(Lkotlin/coroutines/d;)V

    .line 35
    .line 36
    .line 37
    move-object v8, v1

    .line 38
    goto :goto_3

    .line 39
    :cond_3
    move-object/from16 v8, p6

    .line 40
    .line 41
    :goto_3
    and-int/lit8 v1, v0, 0x40

    .line 42
    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    new-instance v1, Landroidx/compose/foundation/gestures/DraggableKt$draggable$2;

    .line 46
    .line 47
    invoke-direct {v1, v2}, Landroidx/compose/foundation/gestures/DraggableKt$draggable$2;-><init>(Lkotlin/coroutines/d;)V

    .line 48
    .line 49
    .line 50
    move-object v9, v1

    .line 51
    goto :goto_4

    .line 52
    :cond_4
    move-object/from16 v9, p7

    .line 53
    .line 54
    :goto_4
    and-int/lit16 v0, v0, 0x80

    .line 55
    .line 56
    if-eqz v0, :cond_5

    .line 57
    .line 58
    move v10, v3

    .line 59
    goto :goto_5

    .line 60
    :cond_5
    move/from16 v10, p8

    .line 61
    .line 62
    :goto_5
    move-object v2, p0

    .line 63
    move-object v3, p1

    .line 64
    move-object v4, p2

    .line 65
    invoke-static/range {v2 .. v10}, Landroidx/compose/foundation/gestures/DraggableKt;->draggable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLv3/q;Lv3/q;Z)Landroidx/compose/ui/Modifier;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0
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
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
.end method

.method private static final onDragOrUp-Axegvzg(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lv3/l;JLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Ljava/lang/Boolean;",
            ">;J",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Lkotlin/r2;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    instance-of v1, v0, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;

    .line 9
    .line 10
    iget v2, v1, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;-><init>(Lkotlin/coroutines/d;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v3, v1, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;->label:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v5, :cond_1

    .line 40
    .line 41
    iget-object v3, v1, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;->L$4:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lkotlin/jvm/internal/k1$g;

    .line 44
    .line 45
    iget-object v7, v1, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;->L$3:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v7, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 48
    .line 49
    iget-object v8, v1, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v8, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 52
    .line 53
    iget-object v9, v1, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v9, Lv3/l;

    .line 56
    .line 57
    iget-object v10, v1, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v10, Lv3/l;

    .line 60
    .line 61
    invoke-static {v0}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object/from16 v16, v3

    .line 65
    .line 66
    move-object v3, v1

    .line 67
    move-object v1, v10

    .line 68
    move-object/from16 v10, v16

    .line 69
    .line 70
    move-object/from16 v17, v9

    .line 71
    .line 72
    move-object v9, v2

    .line 73
    move-object/from16 v2, v17

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_2
    invoke-static {v0}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-wide/from16 v7, p2

    .line 92
    .line 93
    invoke-static {v0, v7, v8}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    move-object/from16 v2, p4

    .line 100
    .line 101
    move-object v14, v6

    .line 102
    goto/16 :goto_a

    .line 103
    .line 104
    :cond_3
    move-object/from16 v0, p0

    .line 105
    .line 106
    move-object v3, v1

    .line 107
    move-object v9, v2

    .line 108
    move-object/from16 v1, p1

    .line 109
    .line 110
    move-object/from16 v2, p4

    .line 111
    .line 112
    :goto_1
    new-instance v10, Lkotlin/jvm/internal/k1$g;

    .line 113
    .line 114
    invoke-direct {v10}, Lkotlin/jvm/internal/k1$g;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-wide v7, v10, Lkotlin/jvm/internal/k1$g;->element:J

    .line 118
    .line 119
    move-object v7, v0

    .line 120
    :goto_2
    iput-object v1, v3, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;->L$0:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v2, v3, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;->L$1:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;->L$2:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v7, v3, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;->L$3:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object v10, v3, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;->L$4:Ljava/lang/Object;

    .line 129
    .line 130
    iput v5, v3, Landroidx/compose/foundation/gestures/DraggableKt$onDragOrUp$1;->label:I

    .line 131
    .line 132
    invoke-static {v7, v6, v3, v5, v6}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    if-ne v8, v9, :cond_4

    .line 137
    .line 138
    return-object v9

    .line 139
    :cond_4
    move-object/from16 v16, v8

    .line 140
    .line 141
    move-object v8, v0

    .line 142
    move-object/from16 v0, v16

    .line 143
    .line 144
    :goto_3
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 145
    .line 146
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    const/4 v13, 0x0

    .line 155
    :goto_4
    if-ge v13, v12, :cond_6

    .line 156
    .line 157
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v14

    .line 161
    move-object v15, v14

    .line 162
    check-cast v15, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 163
    .line 164
    invoke-virtual {v15}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 165
    .line 166
    .line 167
    move-result-wide v4

    .line 168
    move-object/from16 p0, v7

    .line 169
    .line 170
    iget-wide v6, v10, Lkotlin/jvm/internal/k1$g;->element:J

    .line 171
    .line 172
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_5

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 180
    .line 181
    const/4 v5, 0x1

    .line 182
    const/4 v6, 0x0

    .line 183
    move-object/from16 v7, p0

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_6
    move-object/from16 p0, v7

    .line 187
    .line 188
    const/4 v14, 0x0

    .line 189
    :goto_5
    check-cast v14, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 190
    .line 191
    if-nez v14, :cond_7

    .line 192
    .line 193
    const/4 v14, 0x0

    .line 194
    goto :goto_8

    .line 195
    :cond_7
    invoke-static {v14}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-eqz v4, :cond_b

    .line 200
    .line 201
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    const/4 v5, 0x0

    .line 210
    :goto_6
    if-ge v5, v4, :cond_9

    .line 211
    .line 212
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    move-object v7, v6

    .line 217
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 218
    .line 219
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    if-eqz v7, :cond_8

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_9
    const/4 v6, 0x0

    .line 230
    :goto_7
    check-cast v6, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 231
    .line 232
    if-nez v6, :cond_a

    .line 233
    .line 234
    goto :goto_8

    .line 235
    :cond_a
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 236
    .line 237
    .line 238
    move-result-wide v4

    .line 239
    iput-wide v4, v10, Lkotlin/jvm/internal/k1$g;->element:J

    .line 240
    .line 241
    goto :goto_d

    .line 242
    :cond_b
    invoke-interface {v1, v14}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    check-cast v0, Ljava/lang/Boolean;

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_11

    .line 253
    .line 254
    :goto_8
    if-nez v14, :cond_c

    .line 255
    .line 256
    :goto_9
    const/4 v14, 0x0

    .line 257
    goto :goto_a

    .line 258
    :cond_c
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_d

    .line 263
    .line 264
    goto :goto_9

    .line 265
    :cond_d
    invoke-static {v14}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_10

    .line 270
    .line 271
    :goto_a
    if-eqz v14, :cond_e

    .line 272
    .line 273
    invoke-interface {v2, v14}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    sget-object v6, Lkotlin/r2;->a:Lkotlin/r2;

    .line 277
    .line 278
    goto :goto_b

    .line 279
    :cond_e
    const/4 v6, 0x0

    .line 280
    :goto_b
    if-eqz v6, :cond_f

    .line 281
    .line 282
    const/4 v4, 0x1

    .line 283
    goto :goto_c

    .line 284
    :cond_f
    const/4 v4, 0x0

    .line 285
    :goto_c
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    return-object v0

    .line 290
    :cond_10
    invoke-interface {v2, v14}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 294
    .line 295
    .line 296
    move-result-wide v4

    .line 297
    move-object v0, v8

    .line 298
    const/4 v6, 0x0

    .line 299
    move-wide v7, v4

    .line 300
    const/4 v5, 0x1

    .line 301
    goto/16 :goto_1

    .line 302
    .line 303
    :cond_11
    :goto_d
    move-object/from16 v7, p0

    .line 304
    .line 305
    move-object v0, v8

    .line 306
    const/4 v5, 0x1

    .line 307
    const/4 v6, 0x0

    .line 308
    goto/16 :goto_2
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

.method public static final rememberDraggableState(Lv3/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;
    .locals 3
    .param p0    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Landroidx/compose/foundation/gestures/DraggableState;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const v0, -0xaec199d

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:141)"

    .line 15
    .line 16
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    and-int/lit8 p2, p2, 0xe

    .line 20
    .line 21
    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const p2, -0x1d58f75c

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-ne p2, v0, :cond_1

    .line 42
    .line 43
    new-instance p2, Landroidx/compose/foundation/gestures/DraggableKt$rememberDraggableState$1$1;

    .line 44
    .line 45
    invoke-direct {p2, p0}, Landroidx/compose/foundation/gestures/DraggableKt$rememberDraggableState$1$1;-><init>(Landroidx/compose/runtime/State;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p2}, Landroidx/compose/foundation/gestures/DraggableKt;->DraggableState(Lv3/l;)Landroidx/compose/foundation/gestures/DraggableState;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 56
    .line 57
    .line 58
    check-cast p2, Landroidx/compose/foundation/gestures/DraggableState;

    .line 59
    .line 60
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_2

    .line 65
    .line 66
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 70
    .line 71
    .line 72
    return-object p2
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

.method private static final toFloat-3MmeM6k(JLandroidx/compose/foundation/gestures/Orientation;)F
    .locals 1

    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-ne p2, v0, :cond_0

    invoke-static {p0, p1}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result p0

    :goto_0
    return p0
.end method

.method private static final toFloat-sF-c-tU(JLandroidx/compose/foundation/gestures/Orientation;)F
    .locals 1

    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-ne p2, v0, :cond_0

    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Velocity;->getY-impl(J)F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Velocity;->getX-impl(J)F

    move-result p0

    :goto_0
    return p0
.end method
