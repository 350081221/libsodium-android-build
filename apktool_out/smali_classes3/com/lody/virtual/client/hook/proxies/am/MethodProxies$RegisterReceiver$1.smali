.class Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;->call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;

.field final synthetic val$token:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;Landroid/os/IBinder;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver$1;->this$0:Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;

    iput-object p2, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver$1;->val$token:Landroid/os/IBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver$1;->val$token:Landroid/os/IBinder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver$1;->this$0:Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;->access$000(Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;)Ljava/util/WeakHashMap;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver$1;->val$token:Landroid/os/IBinder;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
