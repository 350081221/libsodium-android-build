.class final Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$applySemantics$3;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->applySemantics(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/q<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "start",
        "",
        "end",
        "relativeToOriginal",
        "invoke",
        "(IIZ)Ljava/lang/Boolean;"
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
.field final synthetic this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$applySemantics$3;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(IIZ)Ljava/lang/Boolean;
    .locals 4
    .annotation build Lp4/l;
    .end annotation

    if-eqz p3, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$applySemantics$3;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getTextFieldState()Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getUntransformedText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$applySemantics$3;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getTextFieldState()Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v0

    .line 4
    :goto_0
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    move-result-wide v1

    .line 5
    iget-object v3, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$applySemantics$3;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getEnabled()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 6
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-ltz v3, :cond_6

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-le v3, v0, :cond_1

    goto :goto_4

    .line 8
    :cond_1
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v0

    if-ne p1, v0, :cond_2

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v0

    if-ne p2, v0, :cond_2

    .line 9
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 10
    :cond_2
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v0

    if-nez p3, :cond_4

    if-ne p1, p2, :cond_3

    goto :goto_1

    .line 11
    :cond_3
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$applySemantics$3;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getTextFieldSelectionState()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    move-result-object p1

    sget-object p2, Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;->Selection:Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->updateTextToolbarState(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V

    goto :goto_2

    .line 12
    :cond_4
    :goto_1
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$applySemantics$3;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getTextFieldSelectionState()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    move-result-object p1

    sget-object p2, Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;->None:Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->updateTextToolbarState(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V

    :goto_2
    if-eqz p3, :cond_5

    .line 13
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$applySemantics$3;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getTextFieldState()Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->selectUntransformedCharsIn-5zc-tL8(J)V

    goto :goto_3

    .line 14
    :cond_5
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$applySemantics$3;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getTextFieldState()Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->selectCharsIn-5zc-tL8(J)V

    .line 15
    :goto_3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 16
    :cond_6
    :goto_4
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$applySemantics$3;->invoke(IIZ)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
