.class Lcom/lody/virtual/server/extension/VExtPackageAccessor$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/helper/IPCHelper$CallableVoid;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/extension/VExtPackageAccessor;->forceStop([I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/lody/virtual/helper/IPCHelper$CallableVoid<",
        "Lcom/lody/virtual/IExtHelperInterface;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$pids:[I


# direct methods
.method constructor <init>([I)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$4;->val$pids:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call(Lcom/lody/virtual/IExtHelperInterface;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$4;->val$pids:[I

    invoke-interface {p1, v0}, Lcom/lody/virtual/IExtHelperInterface;->forceStop([I)V

    return-void
.end method

.method public bridge synthetic call(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/lody/virtual/IExtHelperInterface;

    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$4;->call(Lcom/lody/virtual/IExtHelperInterface;)V

    return-void
.end method
