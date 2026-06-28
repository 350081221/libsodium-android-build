.class public final Landroidx/window/layout/SidecarWindowBackend$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/window/layout/SidecarWindowBackend;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0007J\u0008\u0010\r\u001a\u00020\u000cH\u0007R\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/window/layout/SidecarWindowBackend$Companion;",
        "",
        "Landroid/content/Context;",
        "context",
        "Landroidx/window/layout/SidecarWindowBackend;",
        "getInstance",
        "Landroidx/window/layout/ExtensionInterfaceCompat;",
        "initAndVerifyExtension",
        "Landroidx/window/core/Version;",
        "sidecarVersion",
        "",
        "isSidecarVersionSupported",
        "Lkotlin/r2;",
        "resetInstance",
        "DEBUG",
        "Z",
        "",
        "TAG",
        "Ljava/lang/String;",
        "globalInstance",
        "Landroidx/window/layout/SidecarWindowBackend;",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "globalLock",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "<init>",
        "()V",
        "window_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
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

    invoke-direct {p0}, Landroidx/window/layout/SidecarWindowBackend$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInstance(Landroid/content/Context;)Landroidx/window/layout/SidecarWindowBackend;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroidx/window/layout/SidecarWindowBackend;->access$getGlobalInstance$cp()Landroidx/window/layout/SidecarWindowBackend;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-static {}, Landroidx/window/layout/SidecarWindowBackend;->access$getGlobalLock$cp()Ljava/util/concurrent/locks/ReentrantLock;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-static {}, Landroidx/window/layout/SidecarWindowBackend;->access$getGlobalInstance$cp()Landroidx/window/layout/SidecarWindowBackend;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    sget-object v1, Landroidx/window/layout/SidecarWindowBackend;->Companion:Landroidx/window/layout/SidecarWindowBackend$Companion;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Landroidx/window/layout/SidecarWindowBackend$Companion;->initAndVerifyExtension(Landroid/content/Context;)Landroidx/window/layout/ExtensionInterfaceCompat;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v1, Landroidx/window/layout/SidecarWindowBackend;

    .line 32
    .line 33
    invoke-direct {v1, p1}, Landroidx/window/layout/SidecarWindowBackend;-><init>(Landroidx/window/layout/ExtensionInterfaceCompat;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Landroidx/window/layout/SidecarWindowBackend;->access$setGlobalInstance$cp(Landroidx/window/layout/SidecarWindowBackend;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/window/layout/SidecarWindowBackend;->access$getGlobalInstance$cp()Landroidx/window/layout/SidecarWindowBackend;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-object p1
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

.method public final initAndVerifyExtension(Landroid/content/Context;)Landroidx/window/layout/ExtensionInterfaceCompat;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :try_start_0
    sget-object v1, Landroidx/window/layout/SidecarCompat;->Companion:Landroidx/window/layout/SidecarCompat$Companion;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/window/layout/SidecarCompat$Companion;->getSidecarVersion()Landroidx/window/core/Version;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0, v1}, Landroidx/window/layout/SidecarWindowBackend$Companion;->isSidecarVersionSupported(Landroidx/window/core/Version;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    new-instance v1, Landroidx/window/layout/SidecarCompat;

    .line 20
    .line 21
    invoke-direct {v1, p1}, Landroidx/window/layout/SidecarCompat;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Landroidx/window/layout/SidecarCompat;->validateExtensionInterface()Z

    .line 25
    .line 26
    .line 27
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v0, v1

    .line 32
    :catchall_0
    :cond_1
    :goto_0
    return-object v0
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

.method public final isSidecarVersionSupported(Landroidx/window/core/Version;)Z
    .locals 2
    .param p1    # Landroidx/window/core/Version;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    sget-object v1, Landroidx/window/core/Version;->Companion:Landroidx/window/core/Version$Companion;

    invoke-virtual {v1}, Landroidx/window/core/Version$Companion;->getVERSION_0_1()Landroidx/window/core/Version;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroidx/window/core/Version;->compareTo(Landroidx/window/core/Version;)I

    move-result p1

    if-ltz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public final resetInstance()V
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Landroidx/window/layout/SidecarWindowBackend;->access$setGlobalInstance$cp(Landroidx/window/layout/SidecarWindowBackend;)V

    return-void
.end method
