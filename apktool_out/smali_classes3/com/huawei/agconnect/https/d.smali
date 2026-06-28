.class public Lcom/huawei/agconnect/https/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/https/Service;


# instance fields
.field private a:Lokhttp3/OkHttpClient;

.field private b:Ljava/util/concurrent/Executor;


# direct methods
.method constructor <init>(Lokhttp3/OkHttpClient;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/agconnect/https/d;->a:Lokhttp3/OkHttpClient;

    iput-object p2, p0, Lcom/huawei/agconnect/https/d;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method static synthetic a(Lcom/huawei/agconnect/https/d;)Lokhttp3/OkHttpClient;
    .locals 0

    iget-object p0, p0, Lcom/huawei/agconnect/https/d;->a:Lokhttp3/OkHttpClient;

    return-object p0
.end method


# virtual methods
.method public execute(Lcom/huawei/agconnect/https/Method;)Lcom/huawei/hmf/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/huawei/agconnect/https/Method;",
            ")",
            "Lcom/huawei/hmf/tasks/Task<",
            "Lcom/huawei/agconnect/https/HttpsResult;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/agconnect/https/d;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/huawei/agconnect/https/d$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/agconnect/https/d$1;-><init>(Lcom/huawei/agconnect/https/d;Lcom/huawei/agconnect/https/Method;)V

    invoke-static {v0, v1}, Lcom/huawei/hmf/tasks/m;->g(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/huawei/hmf/tasks/Task;

    move-result-object p1

    return-object p1
.end method
