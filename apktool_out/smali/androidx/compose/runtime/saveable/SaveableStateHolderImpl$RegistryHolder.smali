.class public final Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "RegistryHolder"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ.\u0010\u0008\u001a\u00020\u00072&\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00030\u0002R\u0017\u0010\t\u001a\u00020\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001b"
    }
    d2 = {
        "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;",
        "",
        "",
        "",
        "",
        "",
        "map",
        "Lkotlin/r2;",
        "saveTo",
        "key",
        "Ljava/lang/Object;",
        "getKey",
        "()Ljava/lang/Object;",
        "",
        "shouldSave",
        "Z",
        "getShouldSave",
        "()Z",
        "setShouldSave",
        "(Z)V",
        "Landroidx/compose/runtime/saveable/SaveableStateRegistry;",
        "registry",
        "Landroidx/compose/runtime/saveable/SaveableStateRegistry;",
        "getRegistry",
        "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;",
        "<init>",
        "(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;Ljava/lang/Object;)V",
        "runtime-saveable_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final key:Ljava/lang/Object;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final registry:Landroidx/compose/runtime/saveable/SaveableStateRegistry;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private shouldSave:Z

.field final synthetic this$0:Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;Ljava/lang/Object;)V
    .locals 1
    .param p1    # Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;->this$0:Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;->key:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;->shouldSave:Z

    .line 10
    .line 11
    invoke-static {p1}, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->access$getSavedStates$p(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Ljava/util/Map;

    .line 20
    .line 21
    new-instance v0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder$registry$1;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder$registry$1;-><init>(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p2, v0}, Landroidx/compose/runtime/saveable/SaveableStateRegistryKt;->SaveableStateRegistry(Ljava/util/Map;Lv3/l;)Landroidx/compose/runtime/saveable/SaveableStateRegistry;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;->registry:Landroidx/compose/runtime/saveable/SaveableStateRegistry;

    .line 31
    .line 32
    return-void
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
.end method


# virtual methods
.method public final getKey()Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;->key:Ljava/lang/Object;

    return-object v0
.end method

.method public final getRegistry()Landroidx/compose/runtime/saveable/SaveableStateRegistry;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;->registry:Landroidx/compose/runtime/saveable/SaveableStateRegistry;

    return-object v0
.end method

.method public final getShouldSave()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;->shouldSave:Z

    return v0
.end method

.method public final saveTo(Ljava/util/Map;)V
    .locals 2
    .param p1    # Ljava/util/Map;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;>;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;->shouldSave:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;->registry:Landroidx/compose/runtime/saveable/SaveableStateRegistry;

    .line 6
    .line 7
    invoke-interface {v0}, Landroidx/compose/runtime/saveable/SaveableStateRegistry;->performSave()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;->key:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;->key:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final setShouldSave(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;->shouldSave:Z

    return-void
.end method
