.class Lcom/lody/virtual/client/service/VServiceRuntime$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/service/VServiceRuntime$1;->onCallbackDied(Landroid/app/IServiceConnection;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/lody/virtual/client/service/VServiceRuntime$1;

.field final synthetic val$callback:Landroid/app/IServiceConnection;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/service/VServiceRuntime$1;Landroid/app/IServiceConnection;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/service/VServiceRuntime$1$1;->this$1:Lcom/lody/virtual/client/service/VServiceRuntime$1;

    iput-object p2, p0, Lcom/lody/virtual/client/service/VServiceRuntime$1$1;->val$callback:Landroid/app/IServiceConnection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime$1$1;->this$1:Lcom/lody/virtual/client/service/VServiceRuntime$1;

    iget-object v0, v0, Lcom/lody/virtual/client/service/VServiceRuntime$1;->this$0:Lcom/lody/virtual/client/service/VServiceRuntime;

    iget-object v1, p0, Lcom/lody/virtual/client/service/VServiceRuntime$1$1;->val$callback:Landroid/app/IServiceConnection;

    invoke-static {v0, v1}, Lcom/lody/virtual/client/service/VServiceRuntime;->access$000(Lcom/lody/virtual/client/service/VServiceRuntime;Landroid/app/IServiceConnection;)V

    return-void
.end method
