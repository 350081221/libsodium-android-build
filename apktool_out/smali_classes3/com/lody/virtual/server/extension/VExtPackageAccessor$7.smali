.class Lcom/lody/virtual/server/extension/VExtPackageAccessor$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/helper/IPCHelper$Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/extension/VExtPackageAccessor;->getRunningAppProcesses()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/lody/virtual/helper/IPCHelper$Callable<",
        "Lcom/lody/virtual/IExtHelperInterface;",
        "Ljava/util/List<",
        "Landroid/app/ActivityManager$RunningAppProcessInfo;",
        ">;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/lody/virtual/IExtHelperInterface;

    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$7;->call(Lcom/lody/virtual/IExtHelperInterface;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public call(Lcom/lody/virtual/IExtHelperInterface;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/lody/virtual/IExtHelperInterface;",
            ")",
            "Ljava/util/List<",
            "Landroid/app/ActivityManager$RunningAppProcessInfo;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Lcom/lody/virtual/IExtHelperInterface;->getRunningAppProcesses()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
