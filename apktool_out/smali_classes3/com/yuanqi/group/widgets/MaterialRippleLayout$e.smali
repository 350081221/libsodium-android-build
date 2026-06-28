.class Lcom/yuanqi/group/widgets/MaterialRippleLayout$e;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/widgets/MaterialRippleLayout;->B(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/yuanqi/group/widgets/MaterialRippleLayout;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$e;->b:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    iput-object p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$e;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$e;->b:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->l(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$e;->b:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->setRadius(F)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$e;->b:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->m(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->setRippleAlpha(Ljava/lang/Integer;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$e;->a:Ljava/lang/Runnable;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$e;->b:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 33
    .line 34
    invoke-static {p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->n(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$e;->a:Ljava/lang/Runnable;

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$e;->b:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 46
    .line 47
    invoke-static {p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->h(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-virtual {p1, v0}, Landroid/view/View;->setPressed(Z)V

    .line 53
    .line 54
    .line 55
    return-void
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
