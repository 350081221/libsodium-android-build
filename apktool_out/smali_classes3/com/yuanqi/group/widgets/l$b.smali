.class Lcom/yuanqi/group/widgets/l$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yuanqi/group/widgets/n$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/widgets/l;->t(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/yuanqi/group/widgets/l;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/l;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/l$b;->b:Lcom/yuanqi/group/widgets/l;

    iput-object p2, p0, Lcom/yuanqi/group/widgets/l$b;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/yuanqi/group/widgets/l$b;->a:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
