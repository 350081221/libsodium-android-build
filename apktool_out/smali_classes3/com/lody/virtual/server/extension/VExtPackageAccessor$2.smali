.class Lcom/lody/virtual/server/extension/VExtPackageAccessor$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/helper/IPCHelper$CallableVoid;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/extension/VExtPackageAccessor;->syncPackages()V
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


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call(Lcom/lody/virtual/IExtHelperInterface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Lcom/lody/virtual/IExtHelperInterface;->syncPackages()I

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

    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$2;->call(Lcom/lody/virtual/IExtHelperInterface;)V

    return-void
.end method
