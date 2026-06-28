.class public final Landroidx/navigation/compose/BackStackEntryIdViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0008\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR(\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroidx/navigation/compose/BackStackEntryIdViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "Lkotlin/r2;",
        "onCleared",
        "",
        "IdKey",
        "Ljava/lang/String;",
        "Ljava/util/UUID;",
        "id",
        "Ljava/util/UUID;",
        "getId",
        "()Ljava/util/UUID;",
        "Ljava/lang/ref/WeakReference;",
        "Landroidx/compose/runtime/saveable/SaveableStateHolder;",
        "saveableStateHolderRef",
        "Ljava/lang/ref/WeakReference;",
        "getSaveableStateHolderRef",
        "()Ljava/lang/ref/WeakReference;",
        "setSaveableStateHolderRef",
        "(Ljava/lang/ref/WeakReference;)V",
        "Landroidx/lifecycle/SavedStateHandle;",
        "handle",
        "<init>",
        "(Landroidx/lifecycle/SavedStateHandle;)V",
        "navigation-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nNavBackStackEntryProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryProvider.kt\nandroidx/navigation/compose/BackStackEntryIdViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"
    }
.end annotation


# instance fields
.field private final IdKey:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final id:Ljava/util/UUID;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public saveableStateHolderRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/compose/runtime/saveable/SaveableStateHolder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/SavedStateHandle;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "SaveableStateHolder_BackStackEntryKey"

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/navigation/compose/BackStackEntryIdViewModel;->IdKey:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/util/UUID;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iput-object v1, p0, Landroidx/navigation/compose/BackStackEntryIdViewModel;->id:Ljava/util/UUID;

    .line 24
    .line 25
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method


# virtual methods
.method public final getId()Ljava/util/UUID;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/navigation/compose/BackStackEntryIdViewModel;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public final getSaveableStateHolderRef()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/compose/runtime/saveable/SaveableStateHolder;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/navigation/compose/BackStackEntryIdViewModel;->saveableStateHolderRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "saveableStateHolderRef"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method protected onCleared()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/lifecycle/ViewModel;->onCleared()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/navigation/compose/BackStackEntryIdViewModel;->getSaveableStateHolderRef()Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/compose/runtime/saveable/SaveableStateHolder;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/navigation/compose/BackStackEntryIdViewModel;->id:Ljava/util/UUID;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Landroidx/compose/runtime/saveable/SaveableStateHolder;->removeState(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Landroidx/navigation/compose/BackStackEntryIdViewModel;->getSaveableStateHolderRef()Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    .line 26
    .line 27
    .line 28
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final setSaveableStateHolderRef(Ljava/lang/ref/WeakReference;)V
    .locals 0
    .param p1    # Ljava/lang/ref/WeakReference;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/compose/runtime/saveable/SaveableStateHolder;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/navigation/compose/BackStackEntryIdViewModel;->saveableStateHolderRef:Ljava/lang/ref/WeakReference;

    return-void
.end method
