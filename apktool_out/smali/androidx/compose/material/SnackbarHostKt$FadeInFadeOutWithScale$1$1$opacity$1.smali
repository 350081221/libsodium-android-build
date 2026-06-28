.class final Landroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1;->invoke(Lv3/p;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $key:Landroidx/compose/material/SnackbarData;

.field final synthetic $state:Landroidx/compose/material/FadeInFadeOutState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/material/FadeInFadeOutState<",
            "Landroidx/compose/material/SnackbarData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/material/SnackbarData;Landroidx/compose/material/FadeInFadeOutState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/SnackbarData;",
            "Landroidx/compose/material/FadeInFadeOutState<",
            "Landroidx/compose/material/SnackbarData;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1;->$key:Landroidx/compose/material/SnackbarData;

    iput-object p2, p0, Landroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1;->$state:Landroidx/compose/material/FadeInFadeOutState;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Landroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1;->$key:Landroidx/compose/material/SnackbarData;

    iget-object v1, p0, Landroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1;->$state:Landroidx/compose/material/FadeInFadeOutState;

    invoke-virtual {v1}, Landroidx/compose/material/FadeInFadeOutState;->getCurrent()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1;->$state:Landroidx/compose/material/FadeInFadeOutState;

    invoke-virtual {v0}, Landroidx/compose/material/FadeInFadeOutState;->getItems()Ljava/util/List;

    move-result-object v0

    new-instance v1, Landroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1;

    iget-object v2, p0, Landroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1;->$key:Landroidx/compose/material/SnackbarData;

    invoke-direct {v1, v2}, Landroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1;-><init>(Landroidx/compose/material/SnackbarData;)V

    invoke-static {v0, v1}, Lkotlin/collections/u;->I0(Ljava/util/List;Lv3/l;)Z

    .line 4
    iget-object v0, p0, Landroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1;->$state:Landroidx/compose/material/FadeInFadeOutState;

    invoke-virtual {v0}, Landroidx/compose/material/FadeInFadeOutState;->getScope()Landroidx/compose/runtime/RecomposeScope;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/compose/runtime/RecomposeScope;->invalidate()V

    :cond_0
    return-void
.end method
