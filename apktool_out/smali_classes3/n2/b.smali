.class public final Ln2/b;
.super Landroid/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln2/b$a;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "Ln2/b;",
        "Landroid/app/Fragment;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Lkotlin/r2;",
        "onActivityCreated",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "<init>",
        "()V",
        "a",
        "easyfloat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final a:Ln2/b$a;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static b:Lcom/lzf/easyfloat/interfaces/g;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln2/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln2/b$a;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Ln2/b;->a:Ln2/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method public static synthetic a(Ln2/b;)V
    .locals 0

    invoke-static {p0}, Ln2/b;->d(Ln2/b;)V

    return-void
.end method

.method public static final synthetic c(Lcom/lzf/easyfloat/interfaces/g;)V
    .locals 0

    sput-object p0, Ln2/b;->b:Lcom/lzf/easyfloat/interfaces/g;

    return-void
.end method

.method private static final d(Ln2/b;)V
    .locals 4

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {v0}, Ln2/c;->a(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sget-object v1, Lcom/lzf/easyfloat/utils/h;->a:Lcom/lzf/easyfloat/utils/h;

    .line 18
    .line 19
    const-string v2, "PermissionFragment onActivityResult: "

    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Lcom/lzf/easyfloat/utils/h;->e(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object v1, Ln2/b;->b:Lcom/lzf/easyfloat/interfaces/g;

    .line 33
    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-interface {v1, v0}, Lcom/lzf/easyfloat/interfaces/g;->a(Z)V

    .line 38
    .line 39
    .line 40
    :goto_0
    const/4 v0, 0x0

    .line 41
    sput-object v0, Ln2/b;->b:Lcom/lzf/easyfloat/interfaces/g;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/app/Fragment;->getFragmentManager()Landroid/app/FragmentManager;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 56
    .line 57
    .line 58
    return-void
    .line 59
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


# virtual methods
.method public b()V
    .locals 0

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Ln2/c;->a:Ln2/c;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Ln2/c;->k(Landroid/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Lcom/lzf/easyfloat/utils/h;->a:Lcom/lzf/easyfloat/utils/h;

    .line 10
    .line 11
    const-string v0, "PermissionFragment\uff1arequestPermission"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcom/lzf/easyfloat/utils/h;->e(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
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

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .param p3    # Landroid/content/Intent;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const/16 p2, 0xc7

    if-ne p1, p2, :cond_0

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p2, Ln2/a;

    invoke-direct {p2, p0}, Ln2/a;-><init>(Ln2/b;)V

    const-wide/16 v0, 0x1f4

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
