.class public final Lcom/yuanqi/master/addapp/AddAppViewModel$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/master/addapp/AddAppViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/yuanqi/master/addapp/AddAppViewModel$Companion;",
        "",
        "()V",
        "appNoteDao",
        "Lcom/yuanqi/master/database/dao/AppNoteDao;",
        "getAppNoteDao",
        "()Lcom/yuanqi/master/database/dao/AppNoteDao;",
        "instance",
        "Lcom/yuanqi/master/addapp/AddAppViewModel;",
        "getInstance",
        "()Lcom/yuanqi/master/addapp/AddAppViewModel;",
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

    invoke-direct {p0}, Lcom/yuanqi/master/addapp/AddAppViewModel$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/yuanqi/master/database/dao/c;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Lcom/yuanqi/master/addapp/AddAppViewModel;->c()Lcom/yuanqi/master/database/dao/c;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lcom/yuanqi/master/addapp/AddAppViewModel;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Lcom/yuanqi/master/addapp/AddAppViewModel;->e()Lkotlin/d0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/d0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yuanqi/master/addapp/AddAppViewModel;

    return-object v0
.end method
