.class public final synthetic Lcom/yuanqi/master/tools/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/yuanqi/master/tools/c1$b;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/master/tools/c1$b;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/tools/b1;->a:Lcom/yuanqi/master/tools/c1$b;

    iput-object p2, p0, Lcom/yuanqi/master/tools/b1;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/tools/b1;->a:Lcom/yuanqi/master/tools/c1$b;

    iget-object v1, p0, Lcom/yuanqi/master/tools/b1;->b:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/yuanqi/master/tools/c1$a;->a(Lcom/yuanqi/master/tools/c1$b;Landroid/view/View;)V

    return-void
.end method
