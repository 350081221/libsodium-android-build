.class public Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/content/SyncStorageEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AuthorityInfo"
.end annotation


# instance fields
.field final account:Landroid/accounts/Account;

.field final authority:Ljava/lang/String;

.field backoffDelay:J

.field backoffTime:J

.field delayUntil:J

.field enabled:Z

.field final ident:I

.field final periodicSyncs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/content/PeriodicSync;",
            ">;"
        }
    .end annotation
.end field

.field final service:Landroid/content/ComponentName;

.field syncable:I

.field final userId:I


# direct methods
.method constructor <init>(Landroid/accounts/Account;ILjava/lang/String;I)V
    .locals 6

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->account:Landroid/accounts/Account;

    .line 17
    iput p2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->userId:I

    .line 18
    iput-object p3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    const/4 p2, 0x0

    .line 19
    iput-object p2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->service:Landroid/content/ComponentName;

    .line 20
    iput p4, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    const/4 p2, 0x0

    .line 21
    iput-boolean p2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->enabled:Z

    const/4 p2, -0x1

    .line 22
    iput p2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->syncable:I

    const-wide/16 v0, -0x1

    .line 23
    iput-wide v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffTime:J

    .line 24
    iput-wide v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffDelay:J

    .line 25
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    .line 26
    new-instance p4, Landroid/content/PeriodicSync;

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-wide/32 v4, 0x15180

    move-object v0, p4

    move-object v1, p1

    move-object v2, p3

    invoke-direct/range {v0 .. v5}, Landroid/content/PeriodicSync;-><init>(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;J)V

    const-wide/32 v0, 0x15180

    .line 27
    invoke-static {v0, v1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->calculateDefaultFlexTime(J)J

    move-result-wide v0

    .line 28
    sget-object p1, Lmirror/android/content/PeriodicSync;->flexTime:Lmirror/RefLong;

    invoke-virtual {p1, p4, v0, v1}, Lmirror/RefLong;->set(Ljava/lang/Object;J)V

    .line 29
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method constructor <init>(Landroid/content/ComponentName;II)V
    .locals 6

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 31
    iput-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->account:Landroid/accounts/Account;

    .line 32
    iput p2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->userId:I

    const/4 v2, 0x0

    .line 33
    iput-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 34
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->service:Landroid/content/ComponentName;

    .line 35
    iput p3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    const/4 p1, 0x1

    .line 36
    iput-boolean p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->enabled:Z

    const/4 p1, -0x1

    .line 37
    iput p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->syncable:I

    const-wide/16 p1, -0x1

    .line 38
    iput-wide p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffTime:J

    .line 39
    iput-wide p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffDelay:J

    .line 40
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    .line 41
    new-instance p2, Landroid/content/PeriodicSync;

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-wide/32 v4, 0x15180

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Landroid/content/PeriodicSync;-><init>(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 42
    sget-object p3, Lmirror/android/content/PeriodicSync;->flexTime:Lmirror/RefLong;

    const-wide/32 v0, 0x15180

    invoke-static {v0, v1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->calculateDefaultFlexTime(J)J

    move-result-wide v0

    invoke-virtual {p3, p2, v0, v1}, Lmirror/RefLong;->set(Ljava/lang/Object;J)V

    .line 43
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method constructor <init>(Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->account:Landroid/accounts/Account;

    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->account:Landroid/accounts/Account;

    .line 3
    iget v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->userId:I

    iput v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->userId:I

    .line 4
    iget-object v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 5
    iget-object v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->service:Landroid/content/ComponentName;

    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->service:Landroid/content/ComponentName;

    .line 6
    iget v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    iput v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 7
    iget-boolean v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->enabled:Z

    iput-boolean v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->enabled:Z

    .line 8
    iget v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->syncable:I

    iput v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->syncable:I

    .line 9
    iget-wide v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffTime:J

    iput-wide v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffTime:J

    .line 10
    iget-wide v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffDelay:J

    iput-wide v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffDelay:J

    .line 11
    iget-wide v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->delayUntil:J

    iput-wide v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->delayUntil:J

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    .line 13
    iget-object p1, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/PeriodicSync;

    .line 14
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    invoke-static {v0}, Lmirror/android/content/PeriodicSync;->clone(Landroid/content/PeriodicSync;)Landroid/content/PeriodicSync;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method
