.class final Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandle$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;-><init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/ui/unit/Density;ZZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;",
        "invoke"
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
.field final synthetic this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandle$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;
    .locals 8
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandle$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v0

    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandle$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    invoke-static {v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getShowCursorHandle(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 4
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandle$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getDraggingHandle()Landroidx/compose/foundation/text/Handle;

    move-result-object v0

    sget-object v3, Landroidx/compose/foundation/text/Handle;->Cursor:Landroidx/compose/foundation/text/Handle;

    if-eq v0, v3, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandle$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getCursorHandleInBounds(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    move v2, v1

    :cond_2
    if-nez v2, :cond_3

    .line 7
    sget-object v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;->Companion:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState$Companion;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState$Companion;->getHidden()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;

    move-result-object v0

    return-object v0

    .line 8
    :cond_3
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;

    const/4 v2, 0x1

    .line 9
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandle$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getCursorRect()Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getBottomCenter-F1C5BW0()J

    move-result-wide v3

    .line 10
    sget-object v5, Landroidx/compose/ui/text/style/ResolvedTextDirection;->Ltr:Landroidx/compose/ui/text/style/ResolvedTextDirection;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    .line 11
    invoke-direct/range {v1 .. v7}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;-><init>(ZJLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLkotlin/jvm/internal/w;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandle$2;->invoke()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;

    move-result-object v0

    return-object v0
.end method
