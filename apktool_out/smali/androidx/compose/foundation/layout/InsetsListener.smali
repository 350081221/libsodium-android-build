.class final Landroidx/compose/foundation/layout/InsetsListener;
.super Landroidx/core/view/WindowInsetsAnimationCompat$Callback;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Landroidx/core/view/OnApplyWindowInsetsListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000cH\u0016J\u0008\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0012H\u0016R\u0017\u0010\u001a\u001a\u00020\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008%\u0010 \u001a\u0004\u0008&\u0010\"\"\u0004\u0008\'\u0010$R$\u0010(\u001a\u0004\u0018\u00010\u000c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-\u00a8\u00060"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/InsetsListener;",
        "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;",
        "Ljava/lang/Runnable;",
        "Landroidx/core/view/OnApplyWindowInsetsListener;",
        "Landroid/view/View$OnAttachStateChangeListener;",
        "Landroidx/core/view/WindowInsetsAnimationCompat;",
        "animation",
        "Lkotlin/r2;",
        "onPrepare",
        "Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;",
        "bounds",
        "onStart",
        "Landroidx/core/view/WindowInsetsCompat;",
        "insets",
        "",
        "runningAnimations",
        "onProgress",
        "onEnd",
        "Landroid/view/View;",
        "view",
        "onApplyWindowInsets",
        "run",
        "onViewAttachedToWindow",
        "v",
        "onViewDetachedFromWindow",
        "Landroidx/compose/foundation/layout/WindowInsetsHolder;",
        "composeInsets",
        "Landroidx/compose/foundation/layout/WindowInsetsHolder;",
        "getComposeInsets",
        "()Landroidx/compose/foundation/layout/WindowInsetsHolder;",
        "",
        "prepared",
        "Z",
        "getPrepared",
        "()Z",
        "setPrepared",
        "(Z)V",
        "runningAnimation",
        "getRunningAnimation",
        "setRunningAnimation",
        "savedInsets",
        "Landroidx/core/view/WindowInsetsCompat;",
        "getSavedInsets",
        "()Landroidx/core/view/WindowInsetsCompat;",
        "setSavedInsets",
        "(Landroidx/core/view/WindowInsetsCompat;)V",
        "<init>",
        "(Landroidx/compose/foundation/layout/WindowInsetsHolder;)V",
        "foundation-layout_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final composeInsets:Landroidx/compose/foundation/layout/WindowInsetsHolder;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private prepared:Z

.field private runningAnimation:Z

.field private savedInsets:Landroidx/core/view/WindowInsetsCompat;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/layout/WindowInsetsHolder;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/layout/WindowInsetsHolder;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Landroidx/compose/foundation/layout/WindowInsetsHolder;->getConsumes()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-direct {p0, v0}, Landroidx/core/view/WindowInsetsAnimationCompat$Callback;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Landroidx/compose/foundation/layout/InsetsListener;->composeInsets:Landroidx/compose/foundation/layout/WindowInsetsHolder;

    .line 11
    .line 12
    return-void
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
.end method


# virtual methods
.method public final getComposeInsets()Landroidx/compose/foundation/layout/WindowInsetsHolder;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/InsetsListener;->composeInsets:Landroidx/compose/foundation/layout/WindowInsetsHolder;

    return-object v0
.end method

.method public final getPrepared()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/InsetsListener;->prepared:Z

    return v0
.end method

.method public final getRunningAnimation()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/InsetsListener;->runningAnimation:Z

    return v0
.end method

.method public final getSavedInsets()Landroidx/core/view/WindowInsetsCompat;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/InsetsListener;->savedInsets:Landroidx/core/view/WindowInsetsCompat;

    return-object v0
.end method

.method public onApplyWindowInsets(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/core/view/WindowInsetsCompat;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iput-object p2, p0, Landroidx/compose/foundation/layout/InsetsListener;->savedInsets:Landroidx/core/view/WindowInsetsCompat;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/layout/InsetsListener;->composeInsets:Landroidx/compose/foundation/layout/WindowInsetsHolder;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Landroidx/compose/foundation/layout/WindowInsetsHolder;->updateImeAnimationTarget(Landroidx/core/view/WindowInsetsCompat;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Landroidx/compose/foundation/layout/InsetsListener;->prepared:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v1, 0x1e

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-boolean p1, p0, Landroidx/compose/foundation/layout/InsetsListener;->runningAnimation:Z

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, Landroidx/compose/foundation/layout/InsetsListener;->composeInsets:Landroidx/compose/foundation/layout/WindowInsetsHolder;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroidx/compose/foundation/layout/WindowInsetsHolder;->updateImeAnimationSource(Landroidx/core/view/WindowInsetsCompat;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Landroidx/compose/foundation/layout/InsetsListener;->composeInsets:Landroidx/compose/foundation/layout/WindowInsetsHolder;

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    const/4 v1, 0x0

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-static {p1, p2, v2, v0, v1}, Landroidx/compose/foundation/layout/WindowInsetsHolder;->update$default(Landroidx/compose/foundation/layout/WindowInsetsHolder;Landroidx/core/view/WindowInsetsCompat;IILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/compose/foundation/layout/InsetsListener;->composeInsets:Landroidx/compose/foundation/layout/WindowInsetsHolder;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroidx/compose/foundation/layout/WindowInsetsHolder;->getConsumes()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    sget-object p2, Landroidx/core/view/WindowInsetsCompat;->CONSUMED:Landroidx/core/view/WindowInsetsCompat;

    .line 48
    .line 49
    :cond_2
    return-object p2
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

.method public onEnd(Landroidx/core/view/WindowInsetsAnimationCompat;)V
    .locals 6
    .param p1    # Landroidx/core/view/WindowInsetsAnimationCompat;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/compose/foundation/layout/InsetsListener;->prepared:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Landroidx/compose/foundation/layout/InsetsListener;->runningAnimation:Z

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/compose/foundation/layout/InsetsListener;->savedInsets:Landroidx/core/view/WindowInsetsCompat;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsAnimationCompat;->getDurationMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v2, v2, v4

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Landroidx/compose/foundation/layout/InsetsListener;->composeInsets:Landroidx/compose/foundation/layout/WindowInsetsHolder;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Landroidx/compose/foundation/layout/WindowInsetsHolder;->updateImeAnimationSource(Landroidx/core/view/WindowInsetsCompat;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Landroidx/compose/foundation/layout/InsetsListener;->composeInsets:Landroidx/compose/foundation/layout/WindowInsetsHolder;

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Landroidx/compose/foundation/layout/WindowInsetsHolder;->updateImeAnimationTarget(Landroidx/core/view/WindowInsetsCompat;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Landroidx/compose/foundation/layout/InsetsListener;->composeInsets:Landroidx/compose/foundation/layout/WindowInsetsHolder;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    invoke-static {v2, v1, v0, v4, v3}, Landroidx/compose/foundation/layout/WindowInsetsHolder;->update$default(Landroidx/compose/foundation/layout/WindowInsetsHolder;Landroidx/core/view/WindowInsetsCompat;IILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iput-object v3, p0, Landroidx/compose/foundation/layout/InsetsListener;->savedInsets:Landroidx/core/view/WindowInsetsCompat;

    .line 38
    .line 39
    invoke-super {p0, p1}, Landroidx/core/view/WindowInsetsAnimationCompat$Callback;->onEnd(Landroidx/core/view/WindowInsetsAnimationCompat;)V

    .line 40
    .line 41
    .line 42
    return-void
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public onPrepare(Landroidx/core/view/WindowInsetsAnimationCompat;)V
    .locals 1
    .param p1    # Landroidx/core/view/WindowInsetsAnimationCompat;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/compose/foundation/layout/InsetsListener;->prepared:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Landroidx/compose/foundation/layout/InsetsListener;->runningAnimation:Z

    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/core/view/WindowInsetsAnimationCompat$Callback;->onPrepare(Landroidx/core/view/WindowInsetsAnimationCompat;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
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
.end method

.method public onProgress(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;
    .locals 3
    .param p1    # Landroidx/core/view/WindowInsetsCompat;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/view/WindowInsetsCompat;",
            "Ljava/util/List<",
            "Landroidx/core/view/WindowInsetsAnimationCompat;",
            ">;)",
            "Landroidx/core/view/WindowInsetsCompat;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object p2, p0, Landroidx/compose/foundation/layout/InsetsListener;->composeInsets:Landroidx/compose/foundation/layout/WindowInsetsHolder;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p2, p1, v2, v0, v1}, Landroidx/compose/foundation/layout/WindowInsetsHolder;->update$default(Landroidx/compose/foundation/layout/WindowInsetsHolder;Landroidx/core/view/WindowInsetsCompat;IILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Landroidx/compose/foundation/layout/InsetsListener;->composeInsets:Landroidx/compose/foundation/layout/WindowInsetsHolder;

    .line 10
    .line 11
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/WindowInsetsHolder;->getConsumes()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    sget-object p1, Landroidx/core/view/WindowInsetsCompat;->CONSUMED:Landroidx/core/view/WindowInsetsCompat;

    .line 18
    .line 19
    :cond_0
    return-object p1
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

.method public onStart(Landroidx/core/view/WindowInsetsAnimationCompat;Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;
    .locals 1
    .param p1    # Landroidx/core/view/WindowInsetsAnimationCompat;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/compose/foundation/layout/InsetsListener;->prepared:Z

    .line 3
    .line 4
    invoke-super {p0, p1, p2}, Landroidx/core/view/WindowInsetsAnimationCompat$Callback;->onStart(Landroidx/core/view/WindowInsetsAnimationCompat;Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
    .line 9
    .line 10
    .line 11
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

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param

    return-void
.end method

.method public run()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/layout/InsetsListener;->prepared:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Landroidx/compose/foundation/layout/InsetsListener;->prepared:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Landroidx/compose/foundation/layout/InsetsListener;->runningAnimation:Z

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/compose/foundation/layout/InsetsListener;->savedInsets:Landroidx/core/view/WindowInsetsCompat;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v2, p0, Landroidx/compose/foundation/layout/InsetsListener;->composeInsets:Landroidx/compose/foundation/layout/WindowInsetsHolder;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Landroidx/compose/foundation/layout/WindowInsetsHolder;->updateImeAnimationSource(Landroidx/core/view/WindowInsetsCompat;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Landroidx/compose/foundation/layout/InsetsListener;->composeInsets:Landroidx/compose/foundation/layout/WindowInsetsHolder;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static {v2, v1, v0, v3, v4}, Landroidx/compose/foundation/layout/WindowInsetsHolder;->update$default(Landroidx/compose/foundation/layout/WindowInsetsHolder;Landroidx/core/view/WindowInsetsCompat;IILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object v4, p0, Landroidx/compose/foundation/layout/InsetsListener;->savedInsets:Landroidx/core/view/WindowInsetsCompat;

    .line 27
    .line 28
    :cond_0
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final setPrepared(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/layout/InsetsListener;->prepared:Z

    return-void
.end method

.method public final setRunningAnimation(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/layout/InsetsListener;->runningAnimation:Z

    return-void
.end method

.method public final setSavedInsets(Landroidx/core/view/WindowInsetsCompat;)V
    .locals 0
    .param p1    # Landroidx/core/view/WindowInsetsCompat;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/foundation/layout/InsetsListener;->savedInsets:Landroidx/core/view/WindowInsetsCompat;

    return-void
.end method
