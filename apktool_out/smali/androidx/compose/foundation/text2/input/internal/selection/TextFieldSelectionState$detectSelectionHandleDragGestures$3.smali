.class final Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$3;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectSelectionHandleDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/r2;",
        "invoke",
        "()V",
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
.field final synthetic $dragBeginPosition:Lkotlin/jvm/internal/k1$g;

.field final synthetic $dragTotalDistance:Lkotlin/jvm/internal/k1$g;

.field final synthetic this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$g;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$3;->$dragBeginPosition:Lkotlin/jvm/internal/k1$g;

    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$3;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    iput-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$3;->$dragTotalDistance:Lkotlin/jvm/internal/k1$g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$3;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$3;->$dragBeginPosition:Lkotlin/jvm/internal/k1$g;

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$3;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$3;->$dragTotalDistance:Lkotlin/jvm/internal/k1$g;

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$detectSelectionHandleDragGestures$onDragStop$2(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$g;)V

    return-void
.end method
