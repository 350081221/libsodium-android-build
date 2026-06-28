.class public Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/content/SyncStorageEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PendingOperation"
.end annotation


# instance fields
.field final account:Landroid/accounts/Account;

.field final authority:Ljava/lang/String;

.field authorityId:I

.field final expedited:Z

.field final extras:Landroid/os/Bundle;

.field flatExtras:[B

.field final reason:I

.field final serviceName:Landroid/content/ComponentName;

.field final syncSource:I

.field final userId:I


# direct methods
.method constructor <init>(Landroid/accounts/Account;IIILjava/lang/String;Landroid/os/Bundle;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->account:Landroid/accounts/Account;

    .line 3
    iput p2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->userId:I

    .line 4
    iput p4, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->syncSource:I

    .line 5
    iput p3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->reason:I

    .line 6
    iput-object p5, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->authority:Ljava/lang/String;

    if-eqz p6, :cond_0

    .line 7
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1, p6}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object p6, p1

    :cond_0
    iput-object p6, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->extras:Landroid/os/Bundle;

    .line 8
    iput-boolean p7, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->expedited:Z

    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->authorityId:I

    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->serviceName:Landroid/content/ComponentName;

    return-void
.end method

.method constructor <init>(Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iget-object v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->account:Landroid/accounts/Account;

    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->account:Landroid/accounts/Account;

    .line 13
    iget v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->userId:I

    iput v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->userId:I

    .line 14
    iget v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->reason:I

    iput v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->reason:I

    .line 15
    iget v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->syncSource:I

    iput v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->syncSource:I

    .line 16
    iget-object v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->authority:Ljava/lang/String;

    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->authority:Ljava/lang/String;

    .line 17
    iget-object v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->extras:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->extras:Landroid/os/Bundle;

    .line 18
    iget v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->authorityId:I

    iput v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->authorityId:I

    .line 19
    iget-boolean v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->expedited:Z

    iput-boolean v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->expedited:Z

    .line 20
    iget-object p1, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->serviceName:Landroid/content/ComponentName;

    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->serviceName:Landroid/content/ComponentName;

    return-void
.end method
