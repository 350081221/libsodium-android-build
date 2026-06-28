.class public final Lcom/lzf/easyfloat/core/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lzf/easyfloat/core/d;->o(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0008\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/lzf/easyfloat/core/d$d",
        "Landroid/animation/Animator$AnimatorListener;",
        "Landroid/animation/Animator;",
        "animation",
        "Lkotlin/r2;",
        "onAnimationRepeat",
        "onAnimationEnd",
        "onAnimationCancel",
        "onAnimationStart",
        "easyfloat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/lzf/easyfloat/core/d;

.field final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/lzf/easyfloat/core/d;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lzf/easyfloat/core/d$d;->a:Lcom/lzf/easyfloat/core/d;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/lzf/easyfloat/core/d$d;->b:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0
    .param p1    # Landroid/animation/Animator;
        .annotation build Lp4/m;
        .end annotation
    .end param

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1
    .param p1    # Landroid/animation/Animator;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Lcom/lzf/easyfloat/core/d$d;->a:Lcom/lzf/easyfloat/core/d;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/lzf/easyfloat/core/d;->r()Lcom/lzf/easyfloat/data/FloatConfig;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Lcom/lzf/easyfloat/data/FloatConfig;->setAnim(Z)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/lzf/easyfloat/core/d$d;->a:Lcom/lzf/easyfloat/core/d;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/lzf/easyfloat/core/d;->r()Lcom/lzf/easyfloat/data/FloatConfig;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/lzf/easyfloat/data/FloatConfig;->getImmersionStatusBar()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, Lcom/lzf/easyfloat/core/d$d;->a:Lcom/lzf/easyfloat/core/d;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/lzf/easyfloat/core/d;->u()Landroid/view/WindowManager$LayoutParams;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/16 v0, 0x28

    .line 30
    .line 31
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 32
    .line 33
    :cond_0
    iget-object p1, p0, Lcom/lzf/easyfloat/core/d$d;->a:Lcom/lzf/easyfloat/core/d;

    .line 34
    .line 35
    invoke-static {p1}, Lcom/lzf/easyfloat/core/d;->f(Lcom/lzf/easyfloat/core/d;)V

    .line 36
    .line 37
    .line 38
    return-void
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
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0
    .param p1    # Landroid/animation/Animator;
        .annotation build Lp4/m;
        .end annotation
    .end param

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1
    .param p1    # Landroid/animation/Animator;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Lcom/lzf/easyfloat/core/d$d;->b:Landroid/view/View;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/lzf/easyfloat/core/d$d;->a:Lcom/lzf/easyfloat/core/d;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/lzf/easyfloat/core/d;->r()Lcom/lzf/easyfloat/data/FloatConfig;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-virtual {p1, v0}, Lcom/lzf/easyfloat/data/FloatConfig;->setAnim(Z)V

    .line 15
    .line 16
    .line 17
    return-void
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
.end method
