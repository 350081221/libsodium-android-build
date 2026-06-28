.class public final Lcom/lzf/easyfloat/core/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lzf/easyfloat/core/g;->h(Landroid/view/View;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;)V
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
        "com/lzf/easyfloat/core/g$b",
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
.field final synthetic a:Lcom/lzf/easyfloat/core/g;

.field final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/lzf/easyfloat/core/g;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lzf/easyfloat/core/g$b;->a:Lcom/lzf/easyfloat/core/g;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/lzf/easyfloat/core/g$b;->b:Landroid/view/View;

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
    .locals 1
    .param p1    # Landroid/animation/Animator;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/lzf/easyfloat/core/g$b;->a:Lcom/lzf/easyfloat/core/g;

    iget-object v0, p0, Lcom/lzf/easyfloat/core/g$b;->b:Landroid/view/View;

    invoke-static {p1, v0}, Lcom/lzf/easyfloat/core/g;->b(Lcom/lzf/easyfloat/core/g;Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1
    .param p1    # Landroid/animation/Animator;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/lzf/easyfloat/core/g$b;->a:Lcom/lzf/easyfloat/core/g;

    iget-object v0, p0, Lcom/lzf/easyfloat/core/g$b;->b:Landroid/view/View;

    invoke-static {p1, v0}, Lcom/lzf/easyfloat/core/g;->b(Lcom/lzf/easyfloat/core/g;Landroid/view/View;)V

    return-void
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

    iget-object p1, p0, Lcom/lzf/easyfloat/core/g$b;->a:Lcom/lzf/easyfloat/core/g;

    invoke-virtual {p1}, Lcom/lzf/easyfloat/core/g;->d()Lcom/lzf/easyfloat/data/FloatConfig;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/lzf/easyfloat/data/FloatConfig;->setAnim(Z)V

    return-void
.end method
