.class final Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onKeyEvent$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->onKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
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
.field final synthetic this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onKeyEvent$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onKeyEvent$1;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onKeyEvent$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->access$getOnImeActionPerformed$p(Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;)Lv3/l;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onKeyEvent$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getKeyboardOptions()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text/KeyboardOptions;->getImeAction-eUduSuo()I

    move-result v1

    invoke-static {v1}, Landroidx/compose/ui/text/input/ImeAction;->box-impl(I)Landroidx/compose/ui/text/input/ImeAction;

    move-result-object v1

    invoke-interface {v0, v1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
