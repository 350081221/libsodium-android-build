.class final Landroidx/compose/foundation/FocusedBoundsObserverNode$focusBoundsObserver$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/FocusedBoundsObserverNode;-><init>(Lv3/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "focusedBounds",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/ui/layout/LayoutCoordinates;)V",
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
.field final synthetic this$0:Landroidx/compose/foundation/FocusedBoundsObserverNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/FocusedBoundsObserverNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/FocusedBoundsObserverNode$focusBoundsObserver$1;->this$0:Landroidx/compose/foundation/FocusedBoundsObserverNode;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/LayoutCoordinates;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/FocusedBoundsObserverNode$focusBoundsObserver$1;->invoke(Landroidx/compose/ui/layout/LayoutCoordinates;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/FocusedBoundsObserverNode$focusBoundsObserver$1;->this$0:Landroidx/compose/foundation/FocusedBoundsObserverNode;

    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/FocusedBoundsObserverNode$focusBoundsObserver$1;->this$0:Landroidx/compose/foundation/FocusedBoundsObserverNode;

    invoke-virtual {v0}, Landroidx/compose/foundation/FocusedBoundsObserverNode;->getOnPositioned()Lv3/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Landroidx/compose/foundation/FocusedBoundsObserverNode$focusBoundsObserver$1;->this$0:Landroidx/compose/foundation/FocusedBoundsObserverNode;

    invoke-static {v0}, Landroidx/compose/foundation/FocusedBoundsObserverNode;->access$getParent(Landroidx/compose/foundation/FocusedBoundsObserverNode;)Lv3/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
