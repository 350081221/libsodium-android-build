.class public Lcom/huawei/agconnect/apms/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/huawei/agconnect/apms/c;

    .line 2
    .line 3
    sget-object v1, Lcom/huawei/agconnect/apms/i0;->cde:Lcom/huawei/agconnect/apms/i0;

    .line 4
    .line 5
    iget v1, v1, Lcom/huawei/agconnect/apms/i0;->abc:I

    .line 6
    .line 7
    const-string v2, "okhttp3"

    .line 8
    .line 9
    invoke-direct {v0, v2, v1}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->notifyToAsyncEnterMethod(Lcom/huawei/agconnect/apms/c;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
    .line 24
    .line 25
    .line 26
    .line 27
.end method
