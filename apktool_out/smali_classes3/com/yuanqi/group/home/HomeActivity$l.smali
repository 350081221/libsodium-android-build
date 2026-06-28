.class final Lcom/yuanqi/group/home/HomeActivity$l;
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


# instance fields
.field final synthetic this$0:Lcom/yuanqi/group/home/HomeActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/home/HomeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$l;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/yuanqi/group/home/HomeActivity$l;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 3

    .line 2
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$l;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {p1}, Lcom/yuanqi/group/home/HomeActivity;->a0(Lcom/yuanqi/group/home/HomeActivity;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$l;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {p1}, Lx2/a;->b(Landroid/app/Activity;)Lcom/yuanqi/master/tools/guide/core/a;

    move-result-object p1

    const-string v0, "guide_start"

    .line 4
    invoke-virtual {p1, v0}, Lcom/yuanqi/master/tools/guide/core/a;->f(Ljava/lang/String;)Lcom/yuanqi/master/tools/guide/core/a;

    move-result-object p1

    .line 5
    new-instance v0, Lcom/yuanqi/group/home/HomeActivity$l$a;

    iget-object v1, p0, Lcom/yuanqi/group/home/HomeActivity$l;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-direct {v0, v1}, Lcom/yuanqi/group/home/HomeActivity$l$a;-><init>(Lcom/yuanqi/group/home/HomeActivity;)V

    invoke-virtual {p1, v0}, Lcom/yuanqi/master/tools/guide/core/a;->g(Ly2/b;)Lcom/yuanqi/master/tools/guide/core/a;

    move-result-object p1

    .line 6
    invoke-static {}, Lcom/yuanqi/master/tools/guide/model/a;->D()Lcom/yuanqi/master/tools/guide/model/a;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/yuanqi/group/home/HomeActivity$l;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {v1}, Lcom/yuanqi/group/home/HomeActivity;->V(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "homeBinding"

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    iget-object v1, v1, Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;->homeMenu:Landroid/widget/ImageView;

    sget-object v2, Lcom/yuanqi/master/tools/guide/model/b$a;->RECTANGLE:Lcom/yuanqi/master/tools/guide/model/b$a;

    invoke-virtual {v0, v1, v2}, Lcom/yuanqi/master/tools/guide/model/a;->h(Landroid/view/View;Lcom/yuanqi/master/tools/guide/model/b$a;)Lcom/yuanqi/master/tools/guide/model/a;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [I

    const v2, 0x7f0c00e5

    .line 8
    invoke-virtual {v0, v2, v1}, Lcom/yuanqi/master/tools/guide/model/a;->I(I[I)Lcom/yuanqi/master/tools/guide/model/a;

    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Lcom/yuanqi/master/tools/guide/core/a;->a(Lcom/yuanqi/master/tools/guide/model/a;)Lcom/yuanqi/master/tools/guide/core/a;

    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/yuanqi/master/tools/guide/core/a;->j()Lcom/yuanqi/master/tools/guide/core/b;

    :cond_1
    return-void
.end method
