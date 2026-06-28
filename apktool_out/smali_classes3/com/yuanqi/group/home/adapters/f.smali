.class public final synthetic Lcom/yuanqi/group/home/adapters/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/home/models/b;

.field public final synthetic b:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

.field public final synthetic c:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

.field public final synthetic d:I

.field public final synthetic e:Lv2/b;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/home/models/b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;ILv2/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/adapters/f;->a:Lcom/yuanqi/group/home/models/b;

    iput-object p2, p0, Lcom/yuanqi/group/home/adapters/f;->b:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    iput-object p3, p0, Lcom/yuanqi/group/home/adapters/f;->c:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    iput p4, p0, Lcom/yuanqi/group/home/adapters/f;->d:I

    iput-object p5, p0, Lcom/yuanqi/group/home/adapters/f;->e:Lv2/b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    iget-object v0, p0, Lcom/yuanqi/group/home/adapters/f;->a:Lcom/yuanqi/group/home/models/b;

    iget-object v1, p0, Lcom/yuanqi/group/home/adapters/f;->b:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    iget-object v2, p0, Lcom/yuanqi/group/home/adapters/f;->c:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    iget v3, p0, Lcom/yuanqi/group/home/adapters/f;->d:I

    iget-object v4, p0, Lcom/yuanqi/group/home/adapters/f;->e:Lv2/b;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;->g(Lcom/yuanqi/group/home/models/b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;ILv2/b;Landroid/view/View;)V

    return-void
.end method
