.class Lcom/lody/virtual/client/VClient$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/VClient;->bindApplication(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/VClient;

.field final synthetic val$cond:Landroid/os/ConditionVariable;

.field final synthetic val$packageName:Ljava/lang/String;

.field final synthetic val$processName:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/VClient;Ljava/lang/String;Ljava/lang/String;Landroid/os/ConditionVariable;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/VClient$1;->this$0:Lcom/lody/virtual/client/VClient;

    iput-object p2, p0, Lcom/lody/virtual/client/VClient$1;->val$packageName:Ljava/lang/String;

    iput-object p3, p0, Lcom/lody/virtual/client/VClient$1;->val$processName:Ljava/lang/String;

    iput-object p4, p0, Lcom/lody/virtual/client/VClient$1;->val$cond:Landroid/os/ConditionVariable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/VClient$1;->this$0:Lcom/lody/virtual/client/VClient;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lody/virtual/client/VClient$1;->val$packageName:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/lody/virtual/client/VClient$1;->val$processName:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/lody/virtual/client/VClient$1;->val$cond:Landroid/os/ConditionVariable;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lcom/lody/virtual/client/VClient;->access$100(Lcom/lody/virtual/client/VClient;Ljava/lang/String;Ljava/lang/String;Landroid/os/ConditionVariable;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/lody/virtual/client/VClient$1;->val$cond:Landroid/os/ConditionVariable;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
