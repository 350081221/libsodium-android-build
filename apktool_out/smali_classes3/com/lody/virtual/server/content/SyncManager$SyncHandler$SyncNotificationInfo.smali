.class Lcom/lody/virtual/server/content/SyncManager$SyncHandler$SyncNotificationInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/content/SyncManager$SyncHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SyncNotificationInfo"
.end annotation


# instance fields
.field public isActive:Z

.field public startTime:Ljava/lang/Long;

.field final synthetic this$1:Lcom/lody/virtual/server/content/SyncManager$SyncHandler;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/content/SyncManager$SyncHandler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$SyncHandler$SyncNotificationInfo;->this$1:Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/lody/virtual/server/content/SyncManager$SyncHandler$SyncNotificationInfo;->isActive:Z

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$SyncHandler$SyncNotificationInfo;->startTime:Ljava/lang/Long;

    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 3
    invoke-virtual {p0, v0}, Lcom/lody/virtual/server/content/SyncManager$SyncHandler$SyncNotificationInfo;->toString(Ljava/lang/StringBuilder;)V

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "isActive "

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/lody/virtual/server/content/SyncManager$SyncHandler$SyncNotificationInfo;->isActive:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", startTime "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager$SyncHandler$SyncNotificationInfo;->startTime:Ljava/lang/Long;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method
