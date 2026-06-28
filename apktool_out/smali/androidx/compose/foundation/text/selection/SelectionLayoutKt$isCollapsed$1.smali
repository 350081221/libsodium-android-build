.class final Landroidx/compose/foundation/text/selection/SelectionLayoutKt$isCollapsed$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/selection/SelectionLayoutKt;->isCollapsed(Landroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/SelectionLayout;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/foundation/text/selection/SelectableInfo;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/foundation/text/selection/SelectableInfo;",
        "it",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/foundation/text/selection/SelectableInfo;)V",
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
.field final synthetic $allTextsEmpty:Lkotlin/jvm/internal/k1$a;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/k1$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionLayoutKt$isCollapsed$1;->$allTextsEmpty:Lkotlin/jvm/internal/k1$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/text/selection/SelectableInfo;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/selection/SelectionLayoutKt$isCollapsed$1;->invoke(Landroidx/compose/foundation/text/selection/SelectableInfo;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/text/selection/SelectableInfo;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/text/selection/SelectableInfo;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    invoke-virtual {p1}, Landroidx/compose/foundation/text/selection/SelectableInfo;->getInputText()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v0, 0x0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionLayoutKt$isCollapsed$1;->$allTextsEmpty:Lkotlin/jvm/internal/k1$a;

    iput-boolean v0, p1, Lkotlin/jvm/internal/k1$a;->element:Z

    :cond_1
    return-void
.end method
