.class final Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectCursorHandleDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/geometry/Offset;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/geometry/Offset;",
        "it",
        "Lkotlin/r2;",
        "invoke-k-4lQ0M",
        "(J)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $cursorDragDelta:Lkotlin/jvm/internal/k1$g;

.field final synthetic $cursorDragStart:Lkotlin/jvm/internal/k1$g;

.field final synthetic this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$g;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$2;->$cursorDragStart:Lkotlin/jvm/internal/k1$g;

    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    iput-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$2;->$cursorDragDelta:Lkotlin/jvm/internal/k1$g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/ui/geometry/Offset;

    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$2;->invoke-k-4lQ0M(J)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke-k-4lQ0M(J)V
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$2;->$cursorDragStart:Lkotlin/jvm/internal/k1$g;

    .line 2
    .line 3
    iget-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 4
    .line 5
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getCursorRect()Landroidx/compose/ui/geometry/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Rect;->getBottomCenter-F1C5BW0()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionHandlesKt;->getAdjustedCoordinates-k-4lQ0M(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iput-wide v0, p1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 18
    .line 19
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$2;->$cursorDragDelta:Lkotlin/jvm/internal/k1$g;

    .line 20
    .line 21
    sget-object p2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 22
    .line 23
    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iput-wide v0, p1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 28
    .line 29
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 30
    .line 31
    const/4 p2, 0x1

    .line 32
    invoke-static {p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$setInTouchMode(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Z)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 36
    .line 37
    invoke-static {p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$markStartContentVisibleOffset(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 41
    .line 42
    sget-object p2, Landroidx/compose/foundation/text/Handle;->Cursor:Landroidx/compose/foundation/text/Handle;

    .line 43
    .line 44
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$2;->$cursorDragStart:Lkotlin/jvm/internal/k1$g;

    .line 45
    .line 46
    iget-wide v0, v0, Lkotlin/jvm/internal/k1$g;->element:J

    .line 47
    .line 48
    invoke-static {p1, p2, v0, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$updateHandleDragging-Uv8p0NA(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/Handle;J)V

    .line 49
    .line 50
    .line 51
    return-void
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
