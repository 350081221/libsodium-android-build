.class Lcom/lody/virtual/client/ipc/VActivityManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/ipc/VActivityManager;->launchApp(ILjava/lang/String;Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/ipc/VActivityManager;

.field final synthetic val$intent:Landroid/content/Intent;

.field final synthetic val$userId:I


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/ipc/VActivityManager;Landroid/content/Intent;I)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/ipc/VActivityManager$1;->this$0:Lcom/lody/virtual/client/ipc/VActivityManager;

    iput-object p2, p0, Lcom/lody/virtual/client/ipc/VActivityManager$1;->val$intent:Landroid/content/Intent;

    iput p3, p0, Lcom/lody/virtual/client/ipc/VActivityManager$1;->val$userId:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    move-result-object v0

    iget-object v1, p0, Lcom/lody/virtual/client/ipc/VActivityManager$1;->val$intent:Landroid/content/Intent;

    iget v2, p0, Lcom/lody/virtual/client/ipc/VActivityManager$1;->val$userId:I

    invoke-virtual {v0, v1, v2}, Lcom/lody/virtual/client/ipc/VActivityManager;->startActivity(Landroid/content/Intent;I)I

    return-void
.end method
