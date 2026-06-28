.class public Lcom/huawei/agconnect/https/Service$Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/agconnect/https/Service;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static get(Lcom/huawei/agconnect/https/HttpsKit;)Lcom/huawei/agconnect/https/Service;
    .locals 2

    new-instance v0, Lcom/huawei/agconnect/https/d;

    invoke-virtual {p0}, Lcom/huawei/agconnect/https/HttpsKit;->client()Lokhttp3/OkHttpClient;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/agconnect/https/HttpsKit;->executor()Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/huawei/agconnect/https/d;-><init>(Lokhttp3/OkHttpClient;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
