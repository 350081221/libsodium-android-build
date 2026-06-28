.class Lcom/lody/virtual/server/am/VActivityManagerService$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/am/VActivityManagerService;->initProcessLocked(Lcom/lody/virtual/server/am/ProcessRecord;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/server/am/VActivityManagerService;

.field final synthetic val$app:Lcom/lody/virtual/server/am/ProcessRecord;

.field final synthetic val$clientBinder:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/am/VActivityManagerService;Landroid/os/IBinder;Lcom/lody/virtual/server/am/ProcessRecord;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/am/VActivityManagerService$4;->this$0:Lcom/lody/virtual/server/am/VActivityManagerService;

    iput-object p2, p0, Lcom/lody/virtual/server/am/VActivityManagerService$4;->val$clientBinder:Landroid/os/IBinder;

    iput-object p3, p0, Lcom/lody/virtual/server/am/VActivityManagerService$4;->val$app:Lcom/lody/virtual/server/am/ProcessRecord;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/VActivityManagerService$4;->val$clientBinder:Landroid/os/IBinder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/lody/virtual/server/am/VActivityManagerService$4;->this$0:Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/lody/virtual/server/am/VActivityManagerService$4;->val$app:Lcom/lody/virtual/server/am/ProcessRecord;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/lody/virtual/server/am/VActivityManagerService;->access$400(Lcom/lody/virtual/server/am/VActivityManagerService;Lcom/lody/virtual/server/am/ProcessRecord;)V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
