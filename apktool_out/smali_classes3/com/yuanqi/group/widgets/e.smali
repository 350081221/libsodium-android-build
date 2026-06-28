.class public final synthetic Lcom/yuanqi/group/widgets/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/widgets/f;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/widgets/f;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/widgets/e;->a:Lcom/yuanqi/group/widgets/f;

    iput-object p2, p0, Lcom/yuanqi/group/widgets/e;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/group/widgets/e;->a:Lcom/yuanqi/group/widgets/f;

    iget-object v1, p0, Lcom/yuanqi/group/widgets/e;->b:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/yuanqi/group/widgets/f;->a(Lcom/yuanqi/group/widgets/f;Landroid/view/View;)V

    return-void
.end method
