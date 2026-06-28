.class final Lcom/bytedance/pangle/LocalBroadcastManager$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/pangle/LocalBroadcastManager;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/pangle/LocalBroadcastManager;


# direct methods
.method constructor <init>(Lcom/bytedance/pangle/LocalBroadcastManager;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/pangle/LocalBroadcastManager$1;->a:Lcom/bytedance/pangle/LocalBroadcastManager;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/bytedance/pangle/LocalBroadcastManager$1;->a:Lcom/bytedance/pangle/LocalBroadcastManager;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/bytedance/pangle/LocalBroadcastManager;->executePendingBroadcasts()V

    .line 13
    .line 14
    .line 15
    return-void
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
