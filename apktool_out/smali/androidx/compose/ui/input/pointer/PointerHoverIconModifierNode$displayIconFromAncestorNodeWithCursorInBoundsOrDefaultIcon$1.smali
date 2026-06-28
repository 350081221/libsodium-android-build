.class final Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;->displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;",
        "invoke",
        "(Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $pointerHoverIconModifierNode:Lkotlin/jvm/internal/k1$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/k1$h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1;->$pointerHoverIconModifierNode:Lkotlin/jvm/internal/k1$h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;)Ljava/lang/Boolean;
    .locals 1
    .param p1    # Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1;->$pointerHoverIconModifierNode:Lkotlin/jvm/internal/k1$h;

    iget-object v0, v0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    if-nez v0, :cond_0

    invoke-static {p1}, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;->access$getCursorInBoundsOfNode$p(Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1;->$pointerHoverIconModifierNode:Lkotlin/jvm/internal/k1$h;

    iput-object p1, v0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1;->$pointerHoverIconModifierNode:Lkotlin/jvm/internal/k1$h;

    iget-object v0, v0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;->getOverrideDescendants()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    invoke-static {p1}, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;->access$getCursorInBoundsOfNode$p(Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1;->$pointerHoverIconModifierNode:Lkotlin/jvm/internal/k1$h;

    iput-object p1, v0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 8
    :cond_1
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1;->invoke(Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
