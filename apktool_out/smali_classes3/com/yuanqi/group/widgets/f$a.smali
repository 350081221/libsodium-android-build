.class Lcom/yuanqi/group/widgets/f$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/widgets/f;->u(Ljava/util/List;Ljava/lang/Runnable;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Z

.field final synthetic c:Lcom/yuanqi/group/widgets/f;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/f;Ljava/lang/Runnable;Z)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/f$a;->c:Lcom/yuanqi/group/widgets/f;

    iput-object p2, p0, Lcom/yuanqi/group/widgets/f$a;->a:Ljava/lang/Runnable;

    iput-boolean p3, p0, Lcom/yuanqi/group/widgets/f$a;->b:Z

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/yuanqi/group/widgets/f$a;->a:Ljava/lang/Runnable;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/group/widgets/f$a;->c:Lcom/yuanqi/group/widgets/f;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-static {p1, v0}, Lcom/yuanqi/group/widgets/f;->b(Lcom/yuanqi/group/widgets/f;Z)V

    .line 12
    .line 13
    .line 14
    iget-boolean p1, p0, Lcom/yuanqi/group/widgets/f$a;->b:Z

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Lcom/yuanqi/group/widgets/f$a;->c:Lcom/yuanqi/group/widgets/f;

    .line 19
    .line 20
    const/4 v0, -0x1

    .line 21
    invoke-static {p1, v0}, Lcom/yuanqi/group/widgets/f;->c(Lcom/yuanqi/group/widgets/f;I)I

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
    .line 25
    .line 26
    .line 27
.end method
