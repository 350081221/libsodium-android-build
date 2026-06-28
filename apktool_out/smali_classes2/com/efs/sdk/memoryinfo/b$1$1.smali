.class final Lcom/efs/sdk/memoryinfo/b$1$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/efs/sdk/memoryinfo/b$1;->onChange(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Landroid/os/HandlerThread;

.field final synthetic e:Lcom/efs/sdk/memoryinfo/b$1;


# direct methods
.method constructor <init>(Lcom/efs/sdk/memoryinfo/b$1;Landroid/os/Looper;Landroid/os/HandlerThread;)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/memoryinfo/b$1$1;->e:Lcom/efs/sdk/memoryinfo/b$1;

    iput-object p3, p0, Lcom/efs/sdk/memoryinfo/b$1$1;->d:Landroid/os/HandlerThread;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 2
    .line 3
    .line 4
    iget p1, p1, Landroid/os/Message;->what:I

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    iget-object p1, p0, Lcom/efs/sdk/memoryinfo/b$1$1;->d:Landroid/os/HandlerThread;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/os/HandlerThread;->quit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    :catchall_0
    :cond_0
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
    .line 24
.end method
