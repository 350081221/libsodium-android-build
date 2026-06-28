.class Lcom/yuanqi/group/widgets/RippleButton$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/widgets/RippleButton;->onTouchEvent(Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/group/widgets/RippleButton;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/RippleButton;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/RippleButton$b;->a:Lcom/yuanqi/group/widgets/RippleButton;

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
    iget-object p1, p0, Lcom/yuanqi/group/widgets/RippleButton$b;->a:Lcom/yuanqi/group/widgets/RippleButton;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Lcom/yuanqi/group/widgets/RippleButton;->setRadius(F)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/yuanqi/group/widgets/RippleButton$b;->a:Lcom/yuanqi/group/widgets/RippleButton;

    .line 8
    .line 9
    const/high16 v0, 0x3f800000    # 1.0f

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/yuanqi/group/widgets/RippleButton$b;->a:Lcom/yuanqi/group/widgets/RippleButton;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-static {p1, v0}, Lcom/yuanqi/group/widgets/RippleButton;->a(Lcom/yuanqi/group/widgets/RippleButton;Z)Z

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/yuanqi/group/widgets/RippleButton$b;->a:Lcom/yuanqi/group/widgets/RippleButton;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/yuanqi/group/widgets/RippleButton;->a(Lcom/yuanqi/group/widgets/RippleButton;Z)Z

    return-void
.end method
