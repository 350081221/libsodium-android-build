.class final Lcom/yuanqi/master/location/MapActivity$b;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/location/MapActivity;->d0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/network/model/CustomAddress;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "customAddress",
        "Lcom/yuanqi/master/network/model/CustomAddress;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yuanqi/master/location/MapActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/location/MapActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/location/MapActivity$b;->this$0:Lcom/yuanqi/master/location/MapActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/yuanqi/master/network/model/CustomAddress;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/location/MapActivity$b;->invoke(Lcom/yuanqi/master/network/model/CustomAddress;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/yuanqi/master/network/model/CustomAddress;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity$b;->this$0:Lcom/yuanqi/master/location/MapActivity;

    invoke-static {v0}, Lcom/yuanqi/master/location/MapActivity;->U(Lcom/yuanqi/master/location/MapActivity;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity$b;->this$0:Lcom/yuanqi/master/location/MapActivity;

    invoke-static {v0}, Lcom/yuanqi/master/location/MapActivity;->U(Lcom/yuanqi/master/location/MapActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity$b;->this$0:Lcom/yuanqi/master/location/MapActivity;

    invoke-static {v0}, Lcom/yuanqi/master/location/MapActivity;->U(Lcom/yuanqi/master/location/MapActivity;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object p1, p0, Lcom/yuanqi/master/location/MapActivity$b;->this$0:Lcom/yuanqi/master/location/MapActivity;

    invoke-static {p1}, Lcom/yuanqi/master/location/MapActivity;->S(Lcom/yuanqi/master/location/MapActivity;)Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_1
    iget-object p1, p1, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->rvResult:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 5
    iget-object p1, p0, Lcom/yuanqi/master/location/MapActivity$b;->this$0:Lcom/yuanqi/master/location/MapActivity;

    invoke-static {p1}, Lcom/yuanqi/master/location/MapActivity;->T(Lcom/yuanqi/master/location/MapActivity;)Lcom/yuanqi/master/location/AddressAdapter;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_2
    return-void
.end method
