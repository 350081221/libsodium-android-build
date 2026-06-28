.class Lcom/yuanqi/group/widgets/LauncherIconView$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/widgets/LauncherIconView;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/group/widgets/LauncherIconView;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/LauncherIconView;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/LauncherIconView$d;->a:Lcom/yuanqi/group/widgets/LauncherIconView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LauncherIconView$d;->a:Lcom/yuanqi/group/widgets/LauncherIconView;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lcom/yuanqi/group/widgets/LauncherIconView;->h(Lcom/yuanqi/group/widgets/LauncherIconView;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LauncherIconView$d;->a:Lcom/yuanqi/group/widgets/LauncherIconView;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Float;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {v0, p1}, Lcom/yuanqi/group/widgets/LauncherIconView;->i(Lcom/yuanqi/group/widgets/LauncherIconView;F)F

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/yuanqi/group/widgets/LauncherIconView$d;->a:Lcom/yuanqi/group/widgets/LauncherIconView;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 25
    .line 26
    .line 27
    return-void
.end method
