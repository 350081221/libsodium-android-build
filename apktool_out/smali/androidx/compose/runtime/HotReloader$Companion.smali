.class public final Landroidx/compose/runtime/HotReloader$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/HotReloader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0015J\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0002J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroidx/compose/runtime/HotReloader$Companion;",
        "",
        "context",
        "saveStateAndDispose",
        "token",
        "Lkotlin/r2;",
        "loadStateAndCompose",
        "simulateHotReload$runtime_release",
        "(Ljava/lang/Object;)V",
        "simulateHotReload",
        "",
        "key",
        "invalidateGroupsWithKey$runtime_release",
        "(I)V",
        "invalidateGroupsWithKey",
        "",
        "Landroidx/compose/runtime/RecomposerErrorInfo;",
        "getCurrentErrors$runtime_release",
        "()Ljava/util/List;",
        "getCurrentErrors",
        "clearErrors$runtime_release",
        "()V",
        "clearErrors",
        "<init>",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/HotReloader$Companion;-><init>()V

    return-void
.end method

.method private final loadStateAndCompose(Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Landroidx/compose/runtime/Recomposer;->Companion:Landroidx/compose/runtime/Recomposer$Companion;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/Recomposer$Companion;->loadStateAndComposeForHotReload$runtime_release(Ljava/lang/Object;)V

    return-void
.end method

.method private final saveStateAndDispose(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    sget-object p1, Landroidx/compose/runtime/Recomposer;->Companion:Landroidx/compose/runtime/Recomposer$Companion;

    invoke-virtual {p1}, Landroidx/compose/runtime/Recomposer$Companion;->saveStateAndDisposeForHotReload$runtime_release()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final clearErrors$runtime_release()V
    .locals 1
    .annotation build Lp4/p;
    .end annotation

    sget-object v0, Landroidx/compose/runtime/Recomposer;->Companion:Landroidx/compose/runtime/Recomposer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Recomposer$Companion;->clearErrors$runtime_release()V

    return-void
.end method

.method public final getCurrentErrors$runtime_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/RecomposerErrorInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lp4/p;
    .end annotation

    sget-object v0, Landroidx/compose/runtime/Recomposer;->Companion:Landroidx/compose/runtime/Recomposer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Recomposer$Companion;->getCurrentErrors$runtime_release()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invalidateGroupsWithKey$runtime_release(I)V
    .locals 1
    .annotation build Lp4/p;
    .end annotation

    sget-object v0, Landroidx/compose/runtime/Recomposer;->Companion:Landroidx/compose/runtime/Recomposer$Companion;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/Recomposer$Companion;->invalidateGroupsWithKey$runtime_release(I)V

    return-void
.end method

.method public final simulateHotReload$runtime_release(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/p;
    .end annotation

    invoke-direct {p0, p1}, Landroidx/compose/runtime/HotReloader$Companion;->saveStateAndDispose(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/compose/runtime/HotReloader$Companion;->loadStateAndCompose(Ljava/lang/Object;)V

    return-void
.end method
