.class Lcom/yuanqi/group/widgets/LauncherIconView$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/widgets/LauncherIconView;->o(FF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/yuanqi/group/widgets/LauncherIconView;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/LauncherIconView;Z)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/LauncherIconView$c;->b:Lcom/yuanqi/group/widgets/LauncherIconView;

    iput-boolean p2, p0, Lcom/yuanqi/group/widgets/LauncherIconView$c;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LauncherIconView$c;->b:Lcom/yuanqi/group/widgets/LauncherIconView;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, p1}, Lcom/yuanqi/group/widgets/LauncherIconView;->f(Lcom/yuanqi/group/widgets/LauncherIconView;F)F

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/yuanqi/group/widgets/LauncherIconView$c;->b:Lcom/yuanqi/group/widgets/LauncherIconView;

    .line 17
    .line 18
    invoke-static {p1}, Lcom/yuanqi/group/widgets/LauncherIconView;->e(Lcom/yuanqi/group/widgets/LauncherIconView;)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 v0, 0x0

    .line 23
    cmpg-float p1, v0, p1

    .line 24
    .line 25
    const/high16 v0, 0x42c80000    # 100.0f

    .line 26
    .line 27
    if-gez p1, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, Lcom/yuanqi/group/widgets/LauncherIconView$c;->b:Lcom/yuanqi/group/widgets/LauncherIconView;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/yuanqi/group/widgets/LauncherIconView;->e(Lcom/yuanqi/group/widgets/LauncherIconView;)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    cmpg-float p1, p1, v0

    .line 36
    .line 37
    if-gez p1, :cond_0

    .line 38
    .line 39
    iget-object p1, p0, Lcom/yuanqi/group/widgets/LauncherIconView$c;->b:Lcom/yuanqi/group/widgets/LauncherIconView;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/group/widgets/LauncherIconView$c;->b:Lcom/yuanqi/group/widgets/LauncherIconView;

    .line 46
    .line 47
    invoke-static {p1}, Lcom/yuanqi/group/widgets/LauncherIconView;->e(Lcom/yuanqi/group/widgets/LauncherIconView;)F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    cmpl-float p1, p1, v0

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    iget-boolean p1, p0, Lcom/yuanqi/group/widgets/LauncherIconView$c;->a:Z

    .line 56
    .line 57
    if-nez p1, :cond_1

    .line 58
    .line 59
    iget-object p1, p0, Lcom/yuanqi/group/widgets/LauncherIconView$c;->b:Lcom/yuanqi/group/widgets/LauncherIconView;

    .line 60
    .line 61
    invoke-static {p1}, Lcom/yuanqi/group/widgets/LauncherIconView;->g(Lcom/yuanqi/group/widgets/LauncherIconView;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_0
    return-void
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
