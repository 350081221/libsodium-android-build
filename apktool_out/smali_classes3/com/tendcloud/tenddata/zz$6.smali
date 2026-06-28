.class Lcom/tendcloud/tenddata/zz$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/zz;->a(Lcom/tendcloud/tenddata/TalkingDataProfile;Lcom/tendcloud/tenddata/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/zz;

.field final synthetic val$profile:Lcom/tendcloud/tenddata/TalkingDataProfile;

.field final synthetic val$service:Lcom/tendcloud/tenddata/a;


# direct methods
.method constructor <init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Lcom/tendcloud/tenddata/TalkingDataProfile;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/zz$6;->this$0:Lcom/tendcloud/tenddata/zz;

    iput-object p2, p0, Lcom/tendcloud/tenddata/zz$6;->val$service:Lcom/tendcloud/tenddata/a;

    iput-object p3, p0, Lcom/tendcloud/tenddata/zz$6;->val$profile:Lcom/tendcloud/tenddata/TalkingDataProfile;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lcom/tendcloud/tenddata/zz$a;

    .line 4
    .line 5
    invoke-direct {v1}, Lcom/tendcloud/tenddata/zz$a;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 9
    .line 10
    const-string v3, "apiType"

    .line 11
    .line 12
    const/16 v4, 0x9

    .line 13
    .line 14
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 22
    .line 23
    const-string v3, "domain"

    .line 24
    .line 25
    const-string v4, "account"

    .line 26
    .line 27
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 31
    .line 32
    const-string v3, "service"

    .line 33
    .line 34
    iget-object v4, p0, Lcom/tendcloud/tenddata/zz$6;->val$service:Lcom/tendcloud/tenddata/a;

    .line 35
    .line 36
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 40
    .line 41
    const-string v3, "update"

    .line 42
    .line 43
    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    const-string v2, "APP"

    .line 47
    .line 48
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$6;->val$service:Lcom/tendcloud/tenddata/a;

    .line 49
    .line 50
    invoke-virtual {v3}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 61
    .line 62
    const-string v3, "_td_update"

    .line 63
    .line 64
    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :cond_0
    iget-object v0, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 68
    .line 69
    const-string v2, "data"

    .line 70
    .line 71
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$6;->val$profile:Lcom/tendcloud/tenddata/TalkingDataProfile;

    .line 72
    .line 73
    invoke-static {v3}, Lcom/tendcloud/tenddata/y;->a(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    invoke-static {}, Lcom/tendcloud/tenddata/zz;->c()Landroid/os/Handler;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const/16 v2, 0x66

    .line 85
    .line 86
    invoke-static {v0, v2, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    :catchall_0
    return-void
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method
