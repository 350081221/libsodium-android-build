.class final Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/navigation/compose/DialogHostKt;->DialogHost(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Lkotlinx/coroutines/s0;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1"
    f = "DialogHost.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/s0;",
        "Lkotlin/r2;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n1855#2,2:138\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$2$1\n*L\n75#1:138,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $dialogNavigator:Landroidx/navigation/compose/DialogNavigator;

.field final synthetic $dialogsToDispose:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $transitionInProgress$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/util/Set<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;>;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/runtime/State;Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/Set<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;>;",
            "Landroidx/navigation/compose/DialogNavigator;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;->$transitionInProgress$delegate:Landroidx/compose/runtime/State;

    iput-object p2, p0, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;->$dialogNavigator:Landroidx/navigation/compose/DialogNavigator;

    iput-object p3, p0, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;->$dialogsToDispose:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance p1, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;

    iget-object v0, p0, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;->$transitionInProgress$delegate:Landroidx/compose/runtime/State;

    iget-object v1, p0, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;->$dialogNavigator:Landroidx/navigation/compose/DialogNavigator;

    iget-object v2, p0, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;->$dialogsToDispose:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-direct {p1, v0, v1, v2, p2}, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;-><init>(Landroidx/compose/runtime/State;Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/s0;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;->$transitionInProgress$delegate:Landroidx/compose/runtime/State;

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/navigation/compose/DialogHostKt;->access$DialogHost$lambda$1(Landroidx/compose/runtime/State;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/Iterable;

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;->$dialogNavigator:Landroidx/navigation/compose/DialogNavigator;

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/navigation/compose/DialogHostKt$DialogHost$2$1;->$dialogsToDispose:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Landroidx/navigation/NavBackStackEntry;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/navigation/compose/DialogNavigator;->getBackStack$navigation_compose_release()Lkotlinx/coroutines/flow/t0;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-interface {v3}, Lkotlinx/coroutines/flow/t0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_0

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-nez v3, :cond_0

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Landroidx/navigation/compose/DialogNavigator;->onTransitionComplete$navigation_compose_release(Landroidx/navigation/NavBackStackEntry;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1
    .line 76
    .line 77
    .line 78
.end method
