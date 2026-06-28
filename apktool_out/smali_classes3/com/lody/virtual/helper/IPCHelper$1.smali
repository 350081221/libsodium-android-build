.class Lcom/lody/virtual/helper/IPCHelper$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/helper/IPCHelper$Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/helper/IPCHelper;->callVoid(Lcom/lody/virtual/helper/IPCHelper$CallableVoid;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/lody/virtual/helper/IPCHelper$Callable<",
        "TS;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/helper/IPCHelper;

.field final synthetic val$callable:Lcom/lody/virtual/helper/IPCHelper$CallableVoid;


# direct methods
.method constructor <init>(Lcom/lody/virtual/helper/IPCHelper;Lcom/lody/virtual/helper/IPCHelper$CallableVoid;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/helper/IPCHelper$1;->this$0:Lcom/lody/virtual/helper/IPCHelper;

    iput-object p2, p0, Lcom/lody/virtual/helper/IPCHelper$1;->val$callable:Lcom/lody/virtual/helper/IPCHelper$CallableVoid;

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
    check-cast p1, Landroid/os/IInterface;

    invoke-virtual {p0, p1}, Lcom/lody/virtual/helper/IPCHelper$1;->call(Landroid/os/IInterface;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public call(Landroid/os/IInterface;)Ljava/lang/Void;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/lody/virtual/helper/IPCHelper$1;->val$callable:Lcom/lody/virtual/helper/IPCHelper$CallableVoid;

    invoke-interface {v0, p1}, Lcom/lody/virtual/helper/IPCHelper$CallableVoid;->call(Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method
