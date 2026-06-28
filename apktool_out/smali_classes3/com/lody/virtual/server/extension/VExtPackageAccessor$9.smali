.class Lcom/lody/virtual/server/extension/VExtPackageAccessor$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/helper/IPCHelper$CallableVoid;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/extension/VExtPackageAccessor;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
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
.field final synthetic val$intent:Landroid/content/Intent;

.field final synthetic val$options:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$9;->val$intent:Landroid/content/Intent;

    iput-object p2, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$9;->val$options:Landroid/os/Bundle;

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
    iget-object v0, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$9;->val$intent:Landroid/content/Intent;

    iget-object v1, p0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$9;->val$options:Landroid/os/Bundle;

    invoke-interface {p1, v0, v1}, Lcom/lody/virtual/IExtHelperInterface;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

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

    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$9;->call(Lcom/lody/virtual/IExtHelperInterface;)V

    return-void
.end method
