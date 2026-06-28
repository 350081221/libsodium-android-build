.class Lcom/yuanqi/group/widgets/l$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/widgets/l$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/group/widgets/l$a;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/l$a;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/l$a$a;->a:Lcom/yuanqi/group/widgets/l$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/yuanqi/group/widgets/l$a$a;->a:Lcom/yuanqi/group/widgets/l$a;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/yuanqi/group/widgets/l$a;->a:Landroid/view/View;

    .line 4
    .line 5
    check-cast p1, Lcom/yuanqi/group/widgets/m;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-interface {p1, v0}, Lcom/yuanqi/group/widgets/m;->setShimmering(Z)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/yuanqi/group/widgets/l$a$a;->a:Lcom/yuanqi/group/widgets/l$a;

    .line 12
    .line 13
    iget-object p1, p1, Lcom/yuanqi/group/widgets/l$a;->a:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/yuanqi/group/widgets/l$a$a;->a:Lcom/yuanqi/group/widgets/l$a;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/yuanqi/group/widgets/l$a;->b:Lcom/yuanqi/group/widgets/l;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-static {p1, v0}, Lcom/yuanqi/group/widgets/l;->c(Lcom/yuanqi/group/widgets/l;Landroid/animation/ObjectAnimator;)Landroid/animation/ObjectAnimator;

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
