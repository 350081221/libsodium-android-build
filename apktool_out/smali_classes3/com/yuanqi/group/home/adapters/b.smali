.class public final synthetic Lcom/yuanqi/group/home/adapters/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

.field public final synthetic b:I

.field public final synthetic c:Lcom/yuanqi/group/home/models/b;

.field public final synthetic d:Lv2/b;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;ILcom/yuanqi/group/home/models/b;Lv2/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/adapters/b;->a:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    iput p2, p0, Lcom/yuanqi/group/home/adapters/b;->b:I

    iput-object p3, p0, Lcom/yuanqi/group/home/adapters/b;->c:Lcom/yuanqi/group/home/models/b;

    iput-object p4, p0, Lcom/yuanqi/group/home/adapters/b;->d:Lv2/b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/yuanqi/group/home/adapters/b;->a:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    iget v1, p0, Lcom/yuanqi/group/home/adapters/b;->b:I

    iget-object v2, p0, Lcom/yuanqi/group/home/adapters/b;->c:Lcom/yuanqi/group/home/models/b;

    iget-object v3, p0, Lcom/yuanqi/group/home/adapters/b;->d:Lv2/b;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;->c(Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;ILcom/yuanqi/group/home/models/b;Lv2/b;Landroid/view/View;)V

    return-void
.end method
