.class public final Lcom/yuanqi/master/tools/UserNameAdapter$ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/master/tools/UserNameAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolder"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\u0004\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/yuanqi/master/tools/UserNameAdapter$ViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "itemView",
        "Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;",
        "(Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;)V",
        "binding",
        "getBinding",
        "()Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;",
        "setBinding",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:I = 0x8


# instance fields
.field private a:Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;)V
    .locals 1
    .param p1    # Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "itemView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;->getRoot()Landroid/widget/TextView;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/yuanqi/master/tools/UserNameAdapter$ViewHolder;->a:Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public final a()Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/tools/UserNameAdapter$ViewHolder;->a:Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;

    return-object v0
.end method

.method public final b(Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;)V
    .locals 1
    .param p1    # Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/yuanqi/master/tools/UserNameAdapter$ViewHolder;->a:Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
