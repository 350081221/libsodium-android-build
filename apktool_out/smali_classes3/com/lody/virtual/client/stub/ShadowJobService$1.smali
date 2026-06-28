.class Lcom/lody/virtual/client/stub/ShadowJobService$1;
.super Landroid/app/job/IJobService$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/stub/ShadowJobService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/stub/ShadowJobService;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/stub/ShadowJobService;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/stub/ShadowJobService$1;->this$0:Lcom/lody/virtual/client/stub/ShadowJobService;

    invoke-direct {p0}, Landroid/app/job/IJobService$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method getTransferredDownloadBytes(Landroid/app/job/JobParameters;Landroid/app/job/JobWorkItem;)V
    .locals 0

    return-void
.end method

.method getTransferredUploadBytes(Landroid/app/job/JobParameters;Landroid/app/job/JobWorkItem;)V
    .locals 0

    return-void
.end method

.method onNetworkChanged(Landroid/app/job/JobParameters;)V
    .locals 0

    return-void
.end method

.method public startJob(Landroid/app/job/JobParameters;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/stub/ShadowJobService$1;->this$0:Lcom/lody/virtual/client/stub/ShadowJobService;

    invoke-static {v0, p1}, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->startJob(Landroid/content/Context;Landroid/app/job/JobParameters;)V

    return-void
.end method

.method public stopJob(Landroid/app/job/JobParameters;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/stub/ShadowJobService$1;->this$0:Lcom/lody/virtual/client/stub/ShadowJobService;

    invoke-static {v0, p1}, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->stopJob(Landroid/content/Context;Landroid/app/job/JobParameters;)V

    return-void
.end method
