.class public final Landroidx/fragment/app/FragmentViewModelLazyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aD\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\u0008\n\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0010\u0008\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\u0008\u00f8\u0001\u0000\u001aV\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\u0008\n\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0010\u0008\n\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0010\u0008\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\u0008\u00f8\u0001\u0000\u001a4\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\u0008\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\u0008\u00f8\u0001\u0000\u001aF\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\u0008\n\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0010\u0008\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\u0008\u00f8\u0001\u0000\u001aJ\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\r2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00032\u0010\u0008\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0007\u001aZ\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\r2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00032\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0010\u0008\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0007\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0013\u00b2\u0006\u0018\u0010\u0012\u001a\u00020\u0004\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002\u00b2\u0006\u0018\u0010\u0012\u001a\u00020\u0004\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/lifecycle/ViewModel;",
        "VM",
        "Landroidx/fragment/app/Fragment;",
        "Lkotlin/Function0;",
        "Landroidx/lifecycle/ViewModelStoreOwner;",
        "ownerProducer",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
        "factoryProducer",
        "Lkotlin/d0;",
        "viewModels",
        "Landroidx/lifecycle/viewmodel/CreationExtras;",
        "extrasProducer",
        "activityViewModels",
        "Lkotlin/reflect/d;",
        "viewModelClass",
        "Landroidx/lifecycle/ViewModelStore;",
        "storeProducer",
        "createViewModelLazy",
        "owner",
        "fragment-ktx_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final synthetic access$viewModels$lambda-0(Lkotlin/d0;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    invoke-static {p0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->viewModels$lambda-0(Lkotlin/d0;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$viewModels$lambda-1(Lkotlin/d0;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    invoke-static {p0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->viewModels$lambda-1(Lkotlin/d0;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic activityViewModels(Landroidx/fragment/app/Fragment;Lv3/a;)Lkotlin/d0;
    .locals 3
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Landroidx/fragment/app/Fragment;",
            "Lv3/a<",
            "+",
            "Landroidx/lifecycle/ViewModelProvider$Factory;",
            ">;)",
            "Lkotlin/d0<",
            "TVM;>;"
        }
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->HIDDEN:Lkotlin/m;
        message = "Superseded by activityViewModels that takes a CreationExtras producer"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const-string v1, "VM"

    .line 1
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->y(ILjava/lang/String;)V

    const-class v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Lkotlin/jvm/internal/l1;->d(Ljava/lang/Class;)Lkotlin/reflect/d;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$1;

    invoke-direct {v1, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$1;-><init>(Landroidx/fragment/app/Fragment;)V

    new-instance v2, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$2;

    invoke-direct {v2, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$2;-><init>(Landroidx/fragment/app/Fragment;)V

    if-nez p1, :cond_0

    new-instance p1, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$3;

    invoke-direct {p1, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$3;-><init>(Landroidx/fragment/app/Fragment;)V

    :cond_0
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)Lkotlin/d0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic activityViewModels(Landroidx/fragment/app/Fragment;Lv3/a;Lv3/a;)Lkotlin/d0;
    .locals 3
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Landroidx/fragment/app/Fragment;",
            "Lv3/a<",
            "+",
            "Landroidx/lifecycle/viewmodel/CreationExtras;",
            ">;",
            "Lv3/a<",
            "+",
            "Landroidx/lifecycle/ViewModelProvider$Factory;",
            ">;)",
            "Lkotlin/d0<",
            "TVM;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const-string v1, "VM"

    .line 2
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->y(ILjava/lang/String;)V

    const-class v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Lkotlin/jvm/internal/l1;->d(Ljava/lang/Class;)Lkotlin/reflect/d;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$4;

    invoke-direct {v1, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$4;-><init>(Landroidx/fragment/app/Fragment;)V

    new-instance v2, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$5;

    invoke-direct {v2, p1, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$5;-><init>(Lv3/a;Landroidx/fragment/app/Fragment;)V

    if-nez p2, :cond_0

    new-instance p2, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$6;

    invoke-direct {p2, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$6;-><init>(Landroidx/fragment/app/Fragment;)V

    :cond_0
    invoke-static {p0, v0, v1, v2, p2}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)Lkotlin/d0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic activityViewModels$default(Landroidx/fragment/app/Fragment;Lv3/a;ILjava/lang/Object;)Lkotlin/d0;
    .locals 1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    const-string p2, "<this>"

    .line 1
    invoke-static {p0, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x4

    const-string p3, "VM"

    .line 2
    invoke-static {p2, p3}, Lkotlin/jvm/internal/l0;->y(ILjava/lang/String;)V

    const-class p2, Landroidx/lifecycle/ViewModel;

    invoke-static {p2}, Lkotlin/jvm/internal/l1;->d(Ljava/lang/Class;)Lkotlin/reflect/d;

    move-result-object p2

    new-instance p3, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$1;

    invoke-direct {p3, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$1;-><init>(Landroidx/fragment/app/Fragment;)V

    new-instance v0, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$2;

    invoke-direct {v0, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$2;-><init>(Landroidx/fragment/app/Fragment;)V

    if-nez p1, :cond_1

    new-instance p1, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$3;

    invoke-direct {p1, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$3;-><init>(Landroidx/fragment/app/Fragment;)V

    :cond_1
    invoke-static {p0, p2, p3, v0, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)Lkotlin/d0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic activityViewModels$default(Landroidx/fragment/app/Fragment;Lv3/a;Lv3/a;ILjava/lang/Object;)Lkotlin/d0;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    const-string p3, "<this>"

    .line 3
    invoke-static {p0, p3}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x4

    const-string p4, "VM"

    .line 4
    invoke-static {p3, p4}, Lkotlin/jvm/internal/l0;->y(ILjava/lang/String;)V

    const-class p3, Landroidx/lifecycle/ViewModel;

    invoke-static {p3}, Lkotlin/jvm/internal/l1;->d(Ljava/lang/Class;)Lkotlin/reflect/d;

    move-result-object p3

    new-instance p4, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$4;

    invoke-direct {p4, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$4;-><init>(Landroidx/fragment/app/Fragment;)V

    new-instance v0, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$5;

    invoke-direct {v0, p1, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$5;-><init>(Lv3/a;Landroidx/fragment/app/Fragment;)V

    if-nez p2, :cond_2

    new-instance p2, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$6;

    invoke-direct {p2, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$6;-><init>(Landroidx/fragment/app/Fragment;)V

    :cond_2
    invoke-static {p0, p3, p4, v0, p2}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)Lkotlin/d0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lv3/a;Lv3/a;)Lkotlin/d0;
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->HIDDEN:Lkotlin/m;
        message = "Superseded by createViewModelLazy that takes a CreationExtras producer"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "viewModelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storeProducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroidx/fragment/app/FragmentViewModelLazyKt$createViewModelLazy$1;

    invoke-direct {v0, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$createViewModelLazy$1;-><init>(Landroidx/fragment/app/Fragment;)V

    invoke-static {p0, p1, p2, v0, p3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)Lkotlin/d0;

    move-result-object p0

    return-object p0
.end method

.method public static final createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)Lkotlin/d0;
    .locals 1
    .param p0    # Landroidx/fragment/app/Fragment;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/reflect/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/a;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Landroidx/fragment/app/Fragment;",
            "Lkotlin/reflect/d<",
            "TVM;>;",
            "Lv3/a<",
            "+",
            "Landroidx/lifecycle/ViewModelStore;",
            ">;",
            "Lv3/a<",
            "+",
            "Landroidx/lifecycle/viewmodel/CreationExtras;",
            ">;",
            "Lv3/a<",
            "+",
            "Landroidx/lifecycle/ViewModelProvider$Factory;",
            ">;)",
            "Lkotlin/d0<",
            "TVM;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "viewModelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storeProducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extrasProducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p4, :cond_0

    .line 2
    new-instance p4, Landroidx/fragment/app/FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1;

    invoke-direct {p4, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 3
    :cond_0
    new-instance p0, Landroidx/lifecycle/ViewModelLazy;

    invoke-direct {p0, p1, p2, p4, p3}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)V

    return-object p0
.end method

.method public static synthetic createViewModelLazy$default(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lv3/a;Lv3/a;ILjava/lang/Object;)Lkotlin/d0;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-static {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lv3/a;Lv3/a;)Lkotlin/d0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createViewModelLazy$default(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;ILjava/lang/Object;)Lkotlin/d0;
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 2
    new-instance p3, Landroidx/fragment/app/FragmentViewModelLazyKt$createViewModelLazy$2;

    invoke-direct {p3, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$createViewModelLazy$2;-><init>(Landroidx/fragment/app/Fragment;)V

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    .line 3
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)Lkotlin/d0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic viewModels(Landroidx/fragment/app/Fragment;Lv3/a;Lv3/a;)Lkotlin/d0;
    .locals 3
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Landroidx/fragment/app/Fragment;",
            "Lv3/a<",
            "+",
            "Landroidx/lifecycle/ViewModelStoreOwner;",
            ">;",
            "Lv3/a<",
            "+",
            "Landroidx/lifecycle/ViewModelProvider$Factory;",
            ">;)",
            "Lkotlin/d0<",
            "TVM;>;"
        }
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->HIDDEN:Lkotlin/m;
        message = "Superseded by viewModels that takes a CreationExtras producer"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownerProducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lkotlin/h0;->NONE:Lkotlin/h0;

    new-instance v1, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$2;

    invoke-direct {v1, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$2;-><init>(Lv3/a;)V

    invoke-static {v0, v1}, Lkotlin/e0;->b(Lkotlin/h0;Lv3/a;)Lkotlin/d0;

    move-result-object p1

    const/4 v0, 0x4

    const-string v1, "VM"

    .line 2
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->y(ILjava/lang/String;)V

    const-class v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Lkotlin/jvm/internal/l1;->d(Ljava/lang/Class;)Lkotlin/reflect/d;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$2;

    invoke-direct {v1, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$2;-><init>(Lkotlin/d0;)V

    new-instance v2, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$3;

    invoke-direct {v2, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$3;-><init>(Lkotlin/d0;)V

    if-nez p2, :cond_0

    new-instance p2, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$4;

    invoke-direct {p2, p0, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$4;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/d0;)V

    :cond_0
    invoke-static {p0, v0, v1, v2, p2}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)Lkotlin/d0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic viewModels(Landroidx/fragment/app/Fragment;Lv3/a;Lv3/a;Lv3/a;)Lkotlin/d0;
    .locals 3
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Landroidx/fragment/app/Fragment;",
            "Lv3/a<",
            "+",
            "Landroidx/lifecycle/ViewModelStoreOwner;",
            ">;",
            "Lv3/a<",
            "+",
            "Landroidx/lifecycle/viewmodel/CreationExtras;",
            ">;",
            "Lv3/a<",
            "+",
            "Landroidx/lifecycle/ViewModelProvider$Factory;",
            ">;)",
            "Lkotlin/d0<",
            "TVM;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownerProducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lkotlin/h0;->NONE:Lkotlin/h0;

    new-instance v1, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$4;

    invoke-direct {v1, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$4;-><init>(Lv3/a;)V

    invoke-static {v0, v1}, Lkotlin/e0;->b(Lkotlin/h0;Lv3/a;)Lkotlin/d0;

    move-result-object p1

    const/4 v0, 0x4

    const-string v1, "VM"

    .line 4
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->y(ILjava/lang/String;)V

    const-class v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Lkotlin/jvm/internal/l1;->d(Ljava/lang/Class;)Lkotlin/reflect/d;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$6;

    invoke-direct {v1, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$6;-><init>(Lkotlin/d0;)V

    new-instance v2, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$7;

    invoke-direct {v2, p2, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$7;-><init>(Lv3/a;Lkotlin/d0;)V

    if-nez p3, :cond_0

    new-instance p3, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$8;

    invoke-direct {p3, p0, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$8;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/d0;)V

    :cond_0
    invoke-static {p0, v0, v1, v2, p3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)Lkotlin/d0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic viewModels$default(Landroidx/fragment/app/Fragment;Lv3/a;Lv3/a;ILjava/lang/Object;)Lkotlin/d0;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 1
    new-instance p1, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$1;

    invoke-direct {p1, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$1;-><init>(Landroidx/fragment/app/Fragment;)V

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    const-string p3, "<this>"

    .line 2
    invoke-static {p0, p3}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "ownerProducer"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object p3, Lkotlin/h0;->NONE:Lkotlin/h0;

    new-instance p4, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$2;

    invoke-direct {p4, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$2;-><init>(Lv3/a;)V

    invoke-static {p3, p4}, Lkotlin/e0;->b(Lkotlin/h0;Lv3/a;)Lkotlin/d0;

    move-result-object p1

    const/4 p3, 0x4

    const-string p4, "VM"

    .line 4
    invoke-static {p3, p4}, Lkotlin/jvm/internal/l0;->y(ILjava/lang/String;)V

    const-class p3, Landroidx/lifecycle/ViewModel;

    invoke-static {p3}, Lkotlin/jvm/internal/l1;->d(Ljava/lang/Class;)Lkotlin/reflect/d;

    move-result-object p3

    new-instance p4, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$2;

    invoke-direct {p4, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$2;-><init>(Lkotlin/d0;)V

    new-instance v0, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$3;

    invoke-direct {v0, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$3;-><init>(Lkotlin/d0;)V

    if-nez p2, :cond_2

    new-instance p2, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$4;

    invoke-direct {p2, p0, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$4;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/d0;)V

    :cond_2
    invoke-static {p0, p3, p4, v0, p2}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)Lkotlin/d0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic viewModels$default(Landroidx/fragment/app/Fragment;Lv3/a;Lv3/a;Lv3/a;ILjava/lang/Object;)Lkotlin/d0;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 5
    new-instance p1, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$5;

    invoke-direct {p1, p0}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$5;-><init>(Landroidx/fragment/app/Fragment;)V

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    const/4 p5, 0x4

    and-int/2addr p4, p5

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    const-string p4, "<this>"

    .line 6
    invoke-static {p0, p4}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "ownerProducer"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget-object p4, Lkotlin/h0;->NONE:Lkotlin/h0;

    new-instance v0, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$4;

    invoke-direct {v0, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$4;-><init>(Lv3/a;)V

    invoke-static {p4, v0}, Lkotlin/e0;->b(Lkotlin/h0;Lv3/a;)Lkotlin/d0;

    move-result-object p1

    const-string p4, "VM"

    .line 8
    invoke-static {p5, p4}, Lkotlin/jvm/internal/l0;->y(ILjava/lang/String;)V

    const-class p4, Landroidx/lifecycle/ViewModel;

    invoke-static {p4}, Lkotlin/jvm/internal/l1;->d(Ljava/lang/Class;)Lkotlin/reflect/d;

    move-result-object p4

    new-instance p5, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$6;

    invoke-direct {p5, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$6;-><init>(Lkotlin/d0;)V

    new-instance v0, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$7;

    invoke-direct {v0, p2, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$7;-><init>(Lv3/a;Lkotlin/d0;)V

    if-nez p3, :cond_3

    new-instance p3, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$8;

    invoke-direct {p3, p0, p1}, Landroidx/fragment/app/FragmentViewModelLazyKt$viewModels$8;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/d0;)V

    :cond_3
    invoke-static {p0, p4, p5, v0, p3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)Lkotlin/d0;

    move-result-object p0

    return-object p0
.end method

.method private static final viewModels$lambda-0(Lkotlin/d0;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/d0<",
            "+",
            "Landroidx/lifecycle/ViewModelStoreOwner;",
            ">;)",
            "Landroidx/lifecycle/ViewModelStoreOwner;"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/d0;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/ViewModelStoreOwner;

    return-object p0
.end method

.method private static final viewModels$lambda-1(Lkotlin/d0;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/d0<",
            "+",
            "Landroidx/lifecycle/ViewModelStoreOwner;",
            ">;)",
            "Landroidx/lifecycle/ViewModelStoreOwner;"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/d0;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/ViewModelStoreOwner;

    return-object p0
.end method
