.class Lcom/tendcloud/tenddata/zz$23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/zz;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/zz;

.field final synthetic val$service:Lcom/tendcloud/tenddata/a;


# direct methods
.method constructor <init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/zz$23;->this$0:Lcom/tendcloud/tenddata/zz;

    iput-object p2, p0, Lcom/tendcloud/tenddata/zz$23;->val$service:Lcom/tendcloud/tenddata/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/bl;->a()Lcom/tendcloud/tenddata/bl;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/tendcloud/tenddata/zz$a;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/tendcloud/tenddata/zz$a;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 10
    .line 11
    const-string v2, "apiType"

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 22
    .line 23
    const-string v2, "appId"

    .line 24
    .line 25
    invoke-static {}, Lcom/tendcloud/tenddata/zz;->f()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    const-string v4, ""

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    :try_start_1
    invoke-static {}, Lcom/tendcloud/tenddata/zz;->f()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v3, v4

    .line 39
    :goto_0
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    iget-object v1, v0, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 43
    .line 44
    const-string v2, "channelId"

    .line 45
    .line 46
    invoke-static {}, Lcom/tendcloud/tenddata/zz;->g()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-static {}, Lcom/tendcloud/tenddata/zz;->g()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    :cond_1
    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    iget-object v1, v0, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 60
    .line 61
    const-string v2, "service"

    .line 62
    .line 63
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$23;->val$service:Lcom/tendcloud/tenddata/a;

    .line 64
    .line 65
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    iget-object v1, v0, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 69
    .line 70
    const-string v2, "action"

    .line 71
    .line 72
    const-string v3, "init"

    .line 73
    .line 74
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    invoke-static {}, Lcom/tendcloud/tenddata/zz;->c()Landroid/os/Handler;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const/16 v2, 0x65

    .line 82
    .line 83
    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 88
    .line 89
    .line 90
    invoke-static {}, Lcom/tendcloud/tenddata/bm;->a()Lcom/tendcloud/tenddata/bm;

    .line 91
    .line 92
    .line 93
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 94
    .line 95
    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->a(Landroid/content/Context;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_2

    .line 100
    .line 101
    iget-object v0, p0, Lcom/tendcloud/tenddata/zz$23;->val$service:Lcom/tendcloud/tenddata/a;

    .line 102
    .line 103
    invoke-static {v0}, Lcom/tendcloud/tenddata/c;->a(Lcom/tendcloud/tenddata/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    .line 105
    .line 106
    :catchall_0
    :cond_2
    return-void
.end method
