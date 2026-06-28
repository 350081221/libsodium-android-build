.class public final Landroidx/savedstate/ViewTreeSavedStateRegistryOwner;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u001d\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Landroid/view/View;",
        "Landroidx/savedstate/SavedStateRegistryOwner;",
        "owner",
        "Lkotlin/r2;",
        "set",
        "(Landroid/view/View;Landroidx/savedstate/SavedStateRegistryOwner;)V",
        "setViewTreeSavedStateRegistryOwner",
        "get",
        "(Landroid/view/View;)Landroidx/savedstate/SavedStateRegistryOwner;",
        "findViewTreeSavedStateRegistryOwner",
        "savedstate_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lu3/h;
    name = "ViewTreeSavedStateRegistryOwner"
.end annotation


# direct methods
.method public static final get(Landroid/view/View;)Landroidx/savedstate/SavedStateRegistryOwner;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .annotation build Lu3/h;
        name = "get"
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/savedstate/ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1;->INSTANCE:Landroidx/savedstate/ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lkotlin/sequences/p;->l(Ljava/lang/Object;Lv3/l;)Lkotlin/sequences/m;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget-object v0, Landroidx/savedstate/ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2;->INSTANCE:Landroidx/savedstate/ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2;

    .line 13
    .line 14
    invoke-static {p0, v0}, Lkotlin/sequences/p;->p1(Lkotlin/sequences/m;Lv3/l;)Lkotlin/sequences/m;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lkotlin/sequences/p;->F0(Lkotlin/sequences/m;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Landroidx/savedstate/SavedStateRegistryOwner;

    .line 23
    .line 24
    return-object p0
.end method

.method public static final set(Landroid/view/View;Landroidx/savedstate/SavedStateRegistryOwner;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/savedstate/SavedStateRegistryOwner;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lu3/h;
        name = "set"
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroidx/savedstate/R$id;->view_tree_saved_state_registry_owner:I

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
