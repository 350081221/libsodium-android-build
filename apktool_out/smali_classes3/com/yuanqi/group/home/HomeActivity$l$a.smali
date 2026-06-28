.class public final Lcom/yuanqi/group/home/HomeActivity$l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeActivity$l;->invoke(Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "com/yuanqi/group/home/HomeActivity$initObserver$4$1",
        "Lcom/yuanqi/master/tools/guide/listener/OnGuideChangedListener;",
        "onRemoved",
        "",
        "controller",
        "Lcom/yuanqi/master/tools/guide/core/Controller;",
        "onShowed",
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
.field final synthetic a:Lcom/yuanqi/group/home/HomeActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/home/HomeActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$l$a;->a:Lcom/yuanqi/group/home/HomeActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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


# virtual methods
.method public a(Lcom/yuanqi/master/tools/guide/core/b;)V
    .locals 1
    .param p1    # Lcom/yuanqi/master/tools/guide/core/b;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$l$a;->a:Lcom/yuanqi/group/home/HomeActivity;

    invoke-virtual {p1}, Lcom/yuanqi/group/home/HomeActivity;->w0()Lcom/yuanqi/group/home/HomeViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yuanqi/group/home/HomeViewModel;->M()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Lcom/yuanqi/master/tools/guide/core/b;)V
    .locals 1
    .param p1    # Lcom/yuanqi/master/tools/guide/core/b;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$l$a;->a:Lcom/yuanqi/group/home/HomeActivity;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-static {p1, v0}, Lcom/yuanqi/group/home/HomeActivity;->i0(Lcom/yuanqi/group/home/HomeActivity;Z)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$l$a;->a:Lcom/yuanqi/group/home/HomeActivity;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/yuanqi/group/home/HomeActivity;->w0()Lcom/yuanqi/group/home/HomeViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lcom/yuanqi/group/home/HomeViewModel;->M()Landroidx/lifecycle/MutableLiveData;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$l$a;->a:Lcom/yuanqi/group/home/HomeActivity;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/yuanqi/group/home/HomeActivity;->V(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    const-string p1, "homeBinding"

    .line 31
    .line 32
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    :cond_0
    iget-object p1, p1, Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;->homeLauncher:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-lez p1, :cond_1

    .line 43
    .line 44
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$l$a;->a:Lcom/yuanqi/group/home/HomeActivity;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/yuanqi/group/home/HomeActivity;->w0()Lcom/yuanqi/group/home/HomeViewModel;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lcom/yuanqi/group/home/HomeViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method
