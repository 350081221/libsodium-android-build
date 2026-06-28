.class public final Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$ViewHolderPreview;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ViewHolderPreview"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$ViewHolderPreview;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "binding",
        "Lcom/yqtech/multiapp/databinding/ItemLauncherAppPreviewBinding;",
        "(Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;Lcom/yqtech/multiapp/databinding/ItemLauncherAppPreviewBinding;)V",
        "getBinding",
        "()Lcom/yqtech/multiapp/databinding/ItemLauncherAppPreviewBinding;",
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


# instance fields
.field private final a:Lcom/yqtech/multiapp/databinding/ItemLauncherAppPreviewBinding;
    .annotation build Lp4/l;
    .end annotation
.end field

.field final synthetic b:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;


# direct methods
.method public constructor <init>(Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;Lcom/yqtech/multiapp/databinding/ItemLauncherAppPreviewBinding;)V
    .locals 1
    .param p1    # Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yqtech/multiapp/databinding/ItemLauncherAppPreviewBinding;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$ViewHolderPreview;->b:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/yqtech/multiapp/databinding/ItemLauncherAppPreviewBinding;->getRoot()Landroid/widget/FrameLayout;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$ViewHolderPreview;->a:Lcom/yqtech/multiapp/databinding/ItemLauncherAppPreviewBinding;

    .line 16
    .line 17
    return-void
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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method


# virtual methods
.method public final a()Lcom/yqtech/multiapp/databinding/ItemLauncherAppPreviewBinding;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$ViewHolderPreview;->a:Lcom/yqtech/multiapp/databinding/ItemLauncherAppPreviewBinding;

    return-object v0
.end method
