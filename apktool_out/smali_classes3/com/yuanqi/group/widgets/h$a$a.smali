.class Lcom/yuanqi/group/widgets/h$a$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/widgets/h$a;->j(Lcom/yuanqi/group/widgets/h$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/ImageView;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:J

.field final synthetic f:Landroid/view/ViewGroup;

.field final synthetic g:Lcom/yuanqi/group/widgets/h$a;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/h$a;Landroid/widget/ImageView;IIIJLandroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/h$a$a;->g:Lcom/yuanqi/group/widgets/h$a;

    iput-object p2, p0, Lcom/yuanqi/group/widgets/h$a$a;->a:Landroid/widget/ImageView;

    iput p3, p0, Lcom/yuanqi/group/widgets/h$a$a;->b:I

    iput p4, p0, Lcom/yuanqi/group/widgets/h$a$a;->c:I

    iput p5, p0, Lcom/yuanqi/group/widgets/h$a$a;->d:I

    iput-wide p6, p0, Lcom/yuanqi/group/widgets/h$a$a;->e:J

    iput-object p8, p0, Lcom/yuanqi/group/widgets/h$a$a;->f:Landroid/view/ViewGroup;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/yuanqi/group/widgets/h$a$a;->g:Lcom/yuanqi/group/widgets/h$a;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/yuanqi/group/widgets/h$a;->a(Lcom/yuanqi/group/widgets/h$a;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/yuanqi/group/widgets/h$a$a;->g:Lcom/yuanqi/group/widgets/h$a;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/yuanqi/group/widgets/h$a;->d(Lcom/yuanqi/group/widgets/h$a;)Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/yuanqi/group/widgets/h$a$a;->g:Lcom/yuanqi/group/widgets/h$a;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/yuanqi/group/widgets/h$a;->b(Lcom/yuanqi/group/widgets/h$a;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, p0, Lcom/yuanqi/group/widgets/h$a$a;->g:Lcom/yuanqi/group/widgets/h$a;

    .line 22
    .line 23
    invoke-static {v1}, Lcom/yuanqi/group/widgets/h$a;->c(Lcom/yuanqi/group/widgets/h$a;)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/yuanqi/group/widgets/h$a$a;->g:Lcom/yuanqi/group/widgets/h$a;

    .line 31
    .line 32
    invoke-static {p1}, Lcom/yuanqi/group/widgets/h$a;->f(Lcom/yuanqi/group/widgets/h$a;)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v0, Lcom/yuanqi/group/widgets/h$a$a$a;

    .line 37
    .line 38
    invoke-direct {v0, p0}, Lcom/yuanqi/group/widgets/h$a$a$a;-><init>(Lcom/yuanqi/group/widgets/h$a$a;)V

    .line 39
    .line 40
    .line 41
    const-wide/16 v1, 0x3e8

    .line 42
    .line 43
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 44
    .line 45
    .line 46
    return-void
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
