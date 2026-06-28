.class final Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$KeyboardActions$4;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/BasicSecureTextFieldKt;->KeyboardActions(Landroidx/compose/foundation/text2/input/ImeActionHandler;)Landroidx/compose/foundation/text/KeyboardActions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/foundation/text/KeyboardActionScope;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/text/KeyboardActionScope;",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/foundation/text/KeyboardActionScope;)V",
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
.field final synthetic $onSubmit:Landroidx/compose/foundation/text2/input/ImeActionHandler;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/ImeActionHandler;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$KeyboardActions$4;->$onSubmit:Landroidx/compose/foundation/text2/input/ImeActionHandler;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/text/KeyboardActionScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$KeyboardActions$4;->invoke(Landroidx/compose/foundation/text/KeyboardActionScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/text/KeyboardActionScope;)V
    .locals 3
    .param p1    # Landroidx/compose/foundation/text/KeyboardActionScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$KeyboardActions$4;->$onSubmit:Landroidx/compose/foundation/text2/input/ImeActionHandler;

    sget-object v1, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getPrevious-eUduSuo()I

    move-result v2

    invoke-interface {v0, v2}, Landroidx/compose/foundation/text2/input/ImeActionHandler;->onImeAction-KlQnJC8(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getPrevious-eUduSuo()I

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/foundation/text/KeyboardActionScope;->defaultKeyboardAction-KlQnJC8(I)V

    :cond_0
    return-void
.end method
