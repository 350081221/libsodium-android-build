.class public final Lcom/bytedance/pangle/receiver/a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/bytedance/pangle/receiver/c;->a()Lcom/bytedance/pangle/receiver/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v0, v0, Lcom/bytedance/pangle/receiver/c;->c:Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {}, Lcom/bytedance/pangle/receiver/c;->a()Lcom/bytedance/pangle/receiver/c;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1, p2}, Lcom/bytedance/pangle/receiver/c;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    new-instance v0, Lcom/bytedance/pangle/receiver/a$1;

    .line 30
    .line 31
    invoke-direct {v0, p0, p1, p2}, Lcom/bytedance/pangle/receiver/a$1;-><init>(Lcom/bytedance/pangle/receiver/a;Landroid/content/Context;Landroid/content/Intent;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lcom/bytedance/pangle/d/e;->b(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
