.class Lcom/yuanqi/group/effects/ExplosionField$c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/effects/ExplosionField;->j(Landroid/view/View;Lcom/yuanqi/group/effects/ExplosionField$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/group/effects/ExplosionField$d;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lcom/yuanqi/group/effects/ExplosionField;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/effects/ExplosionField;Lcom/yuanqi/group/effects/ExplosionField$d;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/effects/ExplosionField$c;->c:Lcom/yuanqi/group/effects/ExplosionField;

    iput-object p2, p0, Lcom/yuanqi/group/effects/ExplosionField$c;->a:Lcom/yuanqi/group/effects/ExplosionField$d;

    iput-object p3, p0, Lcom/yuanqi/group/effects/ExplosionField$c;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/yuanqi/group/effects/ExplosionField$c;->a:Lcom/yuanqi/group/effects/ExplosionField$d;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/yuanqi/group/effects/ExplosionField$c;->b:Landroid/view/View;

    .line 6
    .line 7
    invoke-interface {p1, v0}, Lcom/yuanqi/group/effects/ExplosionField$d;->a(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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
.end method
