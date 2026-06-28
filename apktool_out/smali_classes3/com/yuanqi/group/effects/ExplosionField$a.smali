.class Lcom/yuanqi/group/effects/ExplosionField$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/effects/ExplosionField;->h(Landroid/graphics/Bitmap;Landroid/graphics/Rect;JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/group/effects/ExplosionField;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/effects/ExplosionField;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/effects/ExplosionField$a;->a:Lcom/yuanqi/group/effects/ExplosionField;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/effects/ExplosionField$a;->a:Lcom/yuanqi/group/effects/ExplosionField;

    invoke-static {v0}, Lcom/yuanqi/group/effects/ExplosionField;->a(Lcom/yuanqi/group/effects/ExplosionField;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
