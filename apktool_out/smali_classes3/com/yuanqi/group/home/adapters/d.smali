.class public final synthetic Lcom/yuanqi/group/home/adapters/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/home/models/b;

.field public final synthetic b:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/home/models/b;Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/adapters/d;->a:Lcom/yuanqi/group/home/models/b;

    iput-object p2, p0, Lcom/yuanqi/group/home/adapters/d;->b:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/group/home/adapters/d;->a:Lcom/yuanqi/group/home/models/b;

    iget-object v1, p0, Lcom/yuanqi/group/home/adapters/d;->b:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    invoke-static {v0, v1, p1}, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;->a(Lcom/yuanqi/group/home/models/b;Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;Landroid/view/View;)V

    return-void
.end method
