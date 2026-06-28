.class Lcom/yuanqi/group/widgets/MaterialRippleLayout$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/widgets/MaterialRippleLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$d;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$d;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    invoke-static {v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->h(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    return-void
.end method
