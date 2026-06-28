.class Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper$a;
.super Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;-><init>(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper$a;->a:Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper$a;->a:Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public onItemRangeChanged(II)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper$a;->a:Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeChanged(II)V

    return-void
.end method

.method public onItemRangeInserted(II)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper$a;->a:Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeInserted(II)V

    return-void
.end method

.method public onItemRangeMoved(III)V
    .locals 0

    iget-object p3, p0, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper$a;->a:Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;

    invoke-virtual {p3, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemMoved(II)V

    return-void
.end method

.method public onItemRangeRemoved(II)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper$a;->a:Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeRemoved(II)V

    return-void
.end method
