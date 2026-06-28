.class public final Lcom/yuanqi/group/home/HomeViewModel$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/group/home/HomeViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\u000c8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/yuanqi/group/home/HomeViewModel$Companion;",
        "",
        "()V",
        "adModelDao",
        "Lcom/yuanqi/master/database/dao/AdModelDao;",
        "getAdModelDao",
        "()Lcom/yuanqi/master/database/dao/AdModelDao;",
        "appNoteDao",
        "Lcom/yuanqi/master/database/dao/AppNoteDao;",
        "getAppNoteDao",
        "()Lcom/yuanqi/master/database/dao/AppNoteDao;",
        "instance",
        "Lcom/yuanqi/group/home/HomeViewModel;",
        "getInstance",
        "()Lcom/yuanqi/group/home/HomeViewModel;",
        "instance$delegate",
        "Lkotlin/Lazy;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/group/home/HomeViewModel$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/yuanqi/master/database/dao/a;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Lcom/yuanqi/group/home/HomeViewModel;->e()Lcom/yuanqi/master/database/dao/a;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lcom/yuanqi/master/database/dao/c;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Lcom/yuanqi/group/home/HomeViewModel;->f()Lcom/yuanqi/master/database/dao/c;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/yuanqi/group/home/HomeViewModel;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Lcom/yuanqi/group/home/HomeViewModel;->g()Lkotlin/d0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/d0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yuanqi/group/home/HomeViewModel;

    return-object v0
.end method
