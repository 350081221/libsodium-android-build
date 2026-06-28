.class Lcom/lody/virtual/server/extension/VExtPackageAccessor$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/helper/IPCHelper$CallableVoid;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/extension/VExtPackageAccessor;->cleanPackageData([ILjava/lang/String;)V
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
.field final synthetic val$packageName:Ljava/lang/String;

.field final synthetic val$userIds:[I


# direct methods
.method constructor <init>([ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$3;->val$userIds:[I

    iput-object p2, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$3;->val$packageName:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call(Lcom/lody/virtual/IExtHelperInterface;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$3;->val$userIds:[I

    iget-object v1, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$3;->val$packageName:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/lody/virtual/IExtHelperInterface;->cleanPackageData([ILjava/lang/String;)V

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

    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$3;->call(Lcom/lody/virtual/IExtHelperInterface;)V

    return-void
.end method
