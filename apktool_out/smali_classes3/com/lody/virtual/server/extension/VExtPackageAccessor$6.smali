.class Lcom/lody/virtual/server/extension/VExtPackageAccessor$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/helper/IPCHelper$Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/extension/VExtPackageAccessor;->getRecentTasks(II)Ljava/util/List;
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
        "Landroid/app/ActivityManager$RecentTaskInfo;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic val$flags:I

.field final synthetic val$maxNum:I


# direct methods
.method constructor <init>(II)V
    .locals 0

    iput p1, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$6;->val$maxNum:I

    iput p2, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$6;->val$flags:I

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

    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$6;->call(Lcom/lody/virtual/IExtHelperInterface;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public call(Lcom/lody/virtual/IExtHelperInterface;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/lody/virtual/IExtHelperInterface;",
            ")",
            "Ljava/util/List<",
            "Landroid/app/ActivityManager$RecentTaskInfo;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2
    iget v0, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$6;->val$maxNum:I

    iget v1, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$6;->val$flags:I

    invoke-interface {p1, v0, v1}, Lcom/lody/virtual/IExtHelperInterface;->getRecentTasks(II)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
