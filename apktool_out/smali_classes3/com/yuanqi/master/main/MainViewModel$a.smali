.class public final Lcom/yuanqi/master/main/MainViewModel$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/master/main/MainViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0080\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/yuanqi/master/main/MainViewModel$AddResult;",
        "",
        "(Lcom/yuanqi/master/main/MainViewModel;)V",
        "appData",
        "Lcom/yuanqi/group/home/models/PackageAppData;",
        "getAppData",
        "()Lcom/yuanqi/group/home/models/PackageAppData;",
        "setAppData",
        "(Lcom/yuanqi/group/home/models/PackageAppData;)V",
        "userId",
        "",
        "getUserId",
        "()I",
        "setUserId",
        "(I)V",
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
.field private a:Lcom/yuanqi/group/home/models/i;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private b:I

.field final synthetic c:Lcom/yuanqi/master/main/MainViewModel;


# direct methods
.method public constructor <init>(Lcom/yuanqi/master/main/MainViewModel;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/main/MainViewModel$a;->c:Lcom/yuanqi/master/main/MainViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/yuanqi/group/home/models/i;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/main/MainViewModel$a;->a:Lcom/yuanqi/group/home/models/i;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/master/main/MainViewModel$a;->b:I

    return v0
.end method

.method public final c(Lcom/yuanqi/group/home/models/i;)V
    .locals 0
    .param p1    # Lcom/yuanqi/group/home/models/i;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/yuanqi/master/main/MainViewModel$a;->a:Lcom/yuanqi/group/home/models/i;

    return-void
.end method

.method public final d(I)V
    .locals 0

    iput p1, p0, Lcom/yuanqi/master/main/MainViewModel$a;->b:I

    return-void
.end method
