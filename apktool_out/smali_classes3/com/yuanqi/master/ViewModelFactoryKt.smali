.class public final Lcom/yuanqi/master/ViewModelFactoryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0017\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "ViewModelFactory",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
        "getViewModelFactory$annotations",
        "()V",
        "getViewModelFactory",
        "()Landroidx/lifecycle/ViewModelProvider$Factory;",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Landroidx/lifecycle/ViewModelProvider$Factory;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/yuanqi/master/ViewModelFactoryKt$ViewModelFactory$1;

    invoke-direct {v0}, Lcom/yuanqi/master/ViewModelFactoryKt$ViewModelFactory$1;-><init>()V

    sput-object v0, Lcom/yuanqi/master/ViewModelFactoryKt;->a:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-void
.end method

.method public static final a()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lcom/yuanqi/master/ViewModelFactoryKt;->a:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0
.end method

.method public static synthetic b()V
    .locals 0

    return-void
.end method
