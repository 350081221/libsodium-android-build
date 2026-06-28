.class final Lcom/yuanqi/group/home/HomeActivity$j;
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
        "Ljava/util/List<",
        "Lcom/yuanqi/group/home/models/b;",
        ">;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "Lcom/yuanqi/group/home/models/AppData;",
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
.field final synthetic this$0:Lcom/yuanqi/group/home/HomeActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/home/HomeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$j;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/yuanqi/group/home/HomeActivity$j;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yuanqi/group/home/models/b;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    const-string v2, "homeBinding"

    if-eqz v0, :cond_3

    .line 3
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeActivity$j;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {v0}, Lcom/yuanqi/group/home/HomeActivity;->V(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;->selectNum:Landroid/widget/TextView;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeActivity$j;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {v0}, Lcom/yuanqi/group/home/HomeActivity;->V(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    iget-object v0, v1, Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;->totalNum:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/yuanqi/group/home/HomeActivity$j;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v3, 0x2f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/yuanqi/group/home/HomeActivity;->X(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;->i()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {v1}, Lcom/yuanqi/group/home/HomeActivity;->X(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;->i()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ne p1, v2, :cond_2

    const p1, 0x7f0603b2

    goto :goto_1

    :cond_2
    const p1, 0x7f0603bf

    .line 7
    :goto_1
    invoke-static {v1, p1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    .line 8
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_3

    .line 9
    :cond_3
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$j;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {p1}, Lcom/yuanqi/group/home/HomeActivity;->V(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;

    move-result-object p1

    if-nez p1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    move-object p1, v1

    :cond_4
    iget-object p1, p1, Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;->selectNum:Landroid/widget/TextView;

    const-string v0, ""

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$j;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {p1}, Lcom/yuanqi/group/home/HomeActivity;->V(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;

    move-result-object p1

    if-nez p1, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    move-object v1, p1

    :goto_2
    iget-object p1, v1, Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;->totalNum:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    return-void
.end method
