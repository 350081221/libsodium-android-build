.class Lcom/tendcloud/tenddata/zz$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/zz;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/zz;

.field final synthetic val$content:Ljava/lang/String;

.field final synthetic val$features:Lcom/tendcloud/tenddata/a;

.field final synthetic val$method:Ljava/lang/String;

.field final synthetic val$profileId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/zz$9;->this$0:Lcom/tendcloud/tenddata/zz;

    iput-object p2, p0, Lcom/tendcloud/tenddata/zz$9;->val$features:Lcom/tendcloud/tenddata/a;

    iput-object p3, p0, Lcom/tendcloud/tenddata/zz$9;->val$profileId:Ljava/lang/String;

    iput-object p4, p0, Lcom/tendcloud/tenddata/zz$9;->val$method:Ljava/lang/String;

    iput-object p5, p0, Lcom/tendcloud/tenddata/zz$9;->val$content:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/zz$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tendcloud/tenddata/zz$a;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 7
    .line 8
    const-string v2, "apiType"

    .line 9
    .line 10
    const/16 v3, 0x11

    .line 11
    .line 12
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 20
    .line 21
    const-string v2, "service"

    .line 22
    .line 23
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$9;->val$features:Lcom/tendcloud/tenddata/a;

    .line 24
    .line 25
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    iget-object v1, v0, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 29
    .line 30
    const-string v2, "domain"

    .line 31
    .line 32
    const-string v3, "account"

    .line 33
    .line 34
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iget-object v1, v0, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 38
    .line 39
    const-string v2, "action"

    .line 40
    .line 41
    const-string v3, "card"

    .line 42
    .line 43
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    new-instance v1, Ljava/util/TreeMap;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v2, "accountId"

    .line 52
    .line 53
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$9;->val$profileId:Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    const-string v2, "method"

    .line 59
    .line 60
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$9;->val$method:Ljava/lang/String;

    .line 61
    .line 62
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    const-string v2, "content"

    .line 66
    .line 67
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$9;->val$content:Ljava/lang/String;

    .line 68
    .line 69
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    iget-object v2, v0, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 73
    .line 74
    const-string v3, "data"

    .line 75
    .line 76
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    invoke-static {}, Lcom/tendcloud/tenddata/zz;->c()Landroid/os/Handler;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    const/16 v2, 0x66

    .line 84
    .line 85
    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    :catchall_0
    return-void
    .line 93
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
