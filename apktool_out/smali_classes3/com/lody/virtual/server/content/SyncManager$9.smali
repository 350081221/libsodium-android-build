.class Lcom/lody/virtual/server/content/SyncManager$9;
.super Landroid/content/ISyncStatusObserver$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/content/SyncManager;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/server/content/SyncManager;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/content/SyncManager;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$9;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    invoke-direct {p0}, Landroid/content/ISyncStatusObserver$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method public onStatusChanged(I)V
    .locals 0

    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$9;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    invoke-static {p1}, Lcom/lody/virtual/server/content/SyncManager;->access$100(Lcom/lody/virtual/server/content/SyncManager;)V

    return-void
.end method
