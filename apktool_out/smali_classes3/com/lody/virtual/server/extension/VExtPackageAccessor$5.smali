.class Lcom/lody/virtual/server/extension/VExtPackageAccessor$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/helper/IPCHelper$Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/extension/VExtPackageAccessor;->getRunningTasks(I)Ljava/util/List;
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
        "Landroid/app/ActivityManager$RunningTaskInfo;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic val$maxNum:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$5;->val$maxNum:I

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

    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$5;->call(Lcom/lody/virtual/IExtHelperInterface;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public call(Lcom/lody/virtual/IExtHelperInterface;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/lody/virtual/IExtHelperInterface;",
            ")",
            "Ljava/util/List<",
            "Landroid/app/ActivityManager$RunningTaskInfo;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2
    iget v0, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$5;->val$maxNum:I

    invoke-interface {p1, v0}, Lcom/lody/virtual/IExtHelperInterface;->getRunningTasks(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
