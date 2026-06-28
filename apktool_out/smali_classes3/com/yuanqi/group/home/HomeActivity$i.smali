.class final Lcom/yuanqi/group/home/HomeActivity$i;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeActivity;->M0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/lang/Boolean;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/yuanqi/group/home/HomeActivity$initObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1191:1\n1855#2,2:1192\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/yuanqi/group/home/HomeActivity$initObserver$1\n*L\n295#1:1192,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yuanqi/group/home/HomeActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/home/HomeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$i;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/yuanqi/group/home/HomeActivity$i;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 3

    .line 2
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_3

    .line 3
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$i;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {p1}, Lcom/yuanqi/group/home/HomeActivity;->X(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;->i()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Iterable;

    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yuanqi/group/home/models/b;

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, v0, Lcom/yuanqi/group/home/models/b;->isSelect:Z

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$i;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {p1}, Lcom/yuanqi/group/home/HomeActivity;->V(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "homeBinding"

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    iget-object p1, p1, Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;->selectNum:Landroid/widget/TextView;

    const-string v2, ""

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$i;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {p1}, Lcom/yuanqi/group/home/HomeActivity;->V(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v0, p1

    :goto_1
    iget-object p1, v0, Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;->totalNum:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    :cond_3
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$i;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {p1}, Lcom/yuanqi/group/home/HomeActivity;->X(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 9
    :cond_4
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$i;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {p1}, Lcom/yuanqi/group/home/HomeActivity;->U(Lcom/yuanqi/group/home/HomeActivity;)V

    return-void
.end method
