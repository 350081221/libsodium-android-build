.class Lcom/lody/virtual/client/ipc/VLocationManager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/ipc/VLocationManager;->notifyGpsStatus(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/ipc/VLocationManager;

.field final synthetic val$transport:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/ipc/VLocationManager;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/ipc/VLocationManager$2;->this$0:Lcom/lody/virtual/client/ipc/VLocationManager;

    iput-object p2, p0, Lcom/lody/virtual/client/ipc/VLocationManager$2;->val$transport:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/VLocationManager$2;->val$transport:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/client/hook/proxies/location/MockLocationHelper;->invokeSvStatusChanged(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/VLocationManager$2;->val$transport:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/lody/virtual/client/hook/proxies/location/MockLocationHelper;->invokeNmeaReceived(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
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
.end method
