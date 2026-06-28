.class Lcom/yuanqi/group/widgets/LauncherIconView$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/widgets/LauncherIconView;->m(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/yuanqi/group/widgets/LauncherIconView;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/LauncherIconView;I)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/LauncherIconView$b;->b:Lcom/yuanqi/group/widgets/LauncherIconView;

    iput p2, p0, Lcom/yuanqi/group/widgets/LauncherIconView$b;->a:I

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lcom/yuanqi/group/widgets/LauncherIconView$b;->a:I

    .line 5
    .line 6
    if-lez p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LauncherIconView$b;->b:Lcom/yuanqi/group/widgets/LauncherIconView;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    int-to-float p1, p1

    .line 12
    invoke-static {v0, v1, p1}, Lcom/yuanqi/group/widgets/LauncherIconView;->d(Lcom/yuanqi/group/widgets/LauncherIconView;FF)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
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
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    return-void
.end method
