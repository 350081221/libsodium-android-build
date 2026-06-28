.class final Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$applySemantics$4;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->applySemantics(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Boolean;"
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
.field final synthetic this$0:Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$applySemantics$4;->this$0:Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$applySemantics$4;->this$0:Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;

    invoke-static {v0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->access$clearSubstitution(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;)V

    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$applySemantics$4;->this$0:Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;

    invoke-static {v0}, Landroidx/compose/ui/node/SemanticsModifierNodeKt;->invalidateSemantics(Landroidx/compose/ui/node/SemanticsModifierNode;)V

    .line 4
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$applySemantics$4;->this$0:Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;

    invoke-static {v0}, Landroidx/compose/ui/node/LayoutModifierNodeKt;->invalidateMeasurement(Landroidx/compose/ui/node/LayoutModifierNode;)V

    .line 5
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$applySemantics$4;->this$0:Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;

    invoke-static {v0}, Landroidx/compose/ui/node/DrawModifierNodeKt;->invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V

    .line 6
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$applySemantics$4;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
