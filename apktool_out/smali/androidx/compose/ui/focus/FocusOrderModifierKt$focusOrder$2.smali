.class final Landroidx/compose/ui/focus/FocusOrderModifierKt$focusOrder$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/focus/FocusOrderModifierKt;->focusOrder(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;Lv3/l;)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/focus/FocusProperties;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusProperties;",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/ui/focus/FocusProperties;)V",
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
.field final synthetic $scope:Landroidx/compose/ui/focus/FocusOrderToProperties;


# direct methods
.method constructor <init>(Landroidx/compose/ui/focus/FocusOrderToProperties;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOrderModifierKt$focusOrder$2;->$scope:Landroidx/compose/ui/focus/FocusOrderToProperties;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/focus/FocusProperties;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusOrderModifierKt$focusOrder$2;->invoke(Landroidx/compose/ui/focus/FocusProperties;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/focus/FocusProperties;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusProperties;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOrderModifierKt$focusOrder$2;->$scope:Landroidx/compose/ui/focus/FocusOrderToProperties;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/focus/FocusOrderToProperties;->apply(Landroidx/compose/ui/focus/FocusProperties;)V

    return-void
.end method
