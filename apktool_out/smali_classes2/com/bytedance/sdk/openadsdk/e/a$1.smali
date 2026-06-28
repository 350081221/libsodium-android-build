.class Lcom/bytedance/sdk/openadsdk/e/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/e/a;->b(Ljava/util/concurrent/ExecutorService;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/sdk/openadsdk/e/a;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/e/a;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/e/a$1;->a:Lcom/bytedance/sdk/openadsdk/e/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/e/a$1;->a:Lcom/bytedance/sdk/openadsdk/e/a;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/e/a;->a(Lcom/bytedance/sdk/openadsdk/e/a;)Ljava/util/concurrent/ThreadPoolExecutor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "ApiThread"

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/e/a$1;->a:Lcom/bytedance/sdk/openadsdk/e/a;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/e/a;->a(Lcom/bytedance/sdk/openadsdk/e/a;)Ljava/util/concurrent/ThreadPoolExecutor;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-static {v0, v3}, Lcom/bytedance/sdk/openadsdk/e/a;->a(Lcom/bytedance/sdk/openadsdk/e/a;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "release init pool!"

    .line 22
    .line 23
    invoke-static {v2, v0}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    const-string v3, "release mInitExecutor failed"

    .line 29
    .line 30
    invoke-static {v2, v3, v0}, Lcom/bytedance/sdk/openadsdk/api/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/e/a$1;->a:Lcom/bytedance/sdk/openadsdk/e/a;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/e/a;->b(Lcom/bytedance/sdk/openadsdk/e/a;Ljava/util/concurrent/ThreadPoolExecutor;)Ljava/util/concurrent/ThreadPoolExecutor;

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/e/a$1;->a:Lcom/bytedance/sdk/openadsdk/e/a;

    .line 39
    .line 40
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/e/a;->b(Lcom/bytedance/sdk/openadsdk/e/a;)Ljava/util/concurrent/ThreadPoolExecutor;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    :try_start_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/e/a$1;->a:Lcom/bytedance/sdk/openadsdk/e/a;

    .line 47
    .line 48
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/e/a;->b(Lcom/bytedance/sdk/openadsdk/e/a;)Ljava/util/concurrent/ThreadPoolExecutor;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v0, v3}, Lcom/bytedance/sdk/openadsdk/e/a;->a(Lcom/bytedance/sdk/openadsdk/e/a;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 53
    .line 54
    .line 55
    const-string v0, "release api pool!"

    .line 56
    .line 57
    invoke-static {v2, v0}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_1
    move-exception v0

    .line 62
    const-string v3, "release mApiExecutor failed"

    .line 63
    .line 64
    invoke-static {v2, v3, v0}, Lcom/bytedance/sdk/openadsdk/api/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/e/a$1;->a:Lcom/bytedance/sdk/openadsdk/e/a;

    .line 68
    .line 69
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/e/a;->c(Lcom/bytedance/sdk/openadsdk/e/a;Ljava/util/concurrent/ThreadPoolExecutor;)Ljava/util/concurrent/ThreadPoolExecutor;

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
