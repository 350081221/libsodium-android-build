.class Lcom/bytedance/sdk/openadsdk/api/a$c$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bytedance/sdk/openadsdk/api/a$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/sdk/openadsdk/api/a$b;

.field final synthetic b:I

.field final synthetic c:Lcom/bytedance/sdk/openadsdk/api/a$c;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/a$c;Lcom/bytedance/sdk/openadsdk/api/a$b;I)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$7;->c:Lcom/bytedance/sdk/openadsdk/api/a$c;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$7;->a:Lcom/bytedance/sdk/openadsdk/api/a$b;

    iput p3, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$7;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    const-string v0, "_tt_ad_sdk_"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$7;->c:Lcom/bytedance/sdk/openadsdk/api/a$c;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bytedance/sdk/openadsdk/api/a$c;)Lcom/bykv/vk/openvk/api/proto/Manager;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$7;->a:Lcom/bytedance/sdk/openadsdk/api/a$b;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$7;->c:Lcom/bytedance/sdk/openadsdk/api/a$c;

    .line 14
    .line 15
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bytedance/sdk/openadsdk/api/a$c;)Lcom/bykv/vk/openvk/api/proto/Manager;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v1, v2}, Lcom/bytedance/sdk/openadsdk/api/a$b;->a(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v2, "Not ready, no manager: "

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$7;->b:I

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v3, "Unexpected manager call error: "

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v0, v2}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$7;->c:Lcom/bytedance/sdk/openadsdk/api/a$c;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    return-void
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
