.class Lcom/huawei/hms/support/api/PendingResultImpl$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/support/api/transport/DatagramTransport$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hms/support/api/PendingResultImpl;->setResultCallback(Landroid/os/Looper;Lcom/huawei/hms/support/api/client/ResultCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/support/api/PendingResultImpl$d;

.field final synthetic b:Lcom/huawei/hms/support/api/client/ResultCallback;

.field final synthetic c:Lcom/huawei/hms/support/api/PendingResultImpl;


# direct methods
.method constructor <init>(Lcom/huawei/hms/support/api/PendingResultImpl;Lcom/huawei/hms/support/api/PendingResultImpl$d;Lcom/huawei/hms/support/api/client/ResultCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/support/api/PendingResultImpl$c;->c:Lcom/huawei/hms/support/api/PendingResultImpl;

    iput-object p2, p0, Lcom/huawei/hms/support/api/PendingResultImpl$c;->a:Lcom/huawei/hms/support/api/PendingResultImpl$d;

    iput-object p3, p0, Lcom/huawei/hms/support/api/PendingResultImpl$c;->b:Lcom/huawei/hms/support/api/client/ResultCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/hms/support/api/PendingResultImpl$c;->c:Lcom/huawei/hms/support/api/PendingResultImpl;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lcom/huawei/hms/support/api/PendingResultImpl;->access$000(Lcom/huawei/hms/support/api/PendingResultImpl;ILcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/huawei/hms/support/api/PendingResultImpl$c;->a:Lcom/huawei/hms/support/api/PendingResultImpl$d;

    .line 7
    .line 8
    iget-object p2, p0, Lcom/huawei/hms/support/api/PendingResultImpl$c;->b:Lcom/huawei/hms/support/api/client/ResultCallback;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/huawei/hms/support/api/PendingResultImpl$c;->c:Lcom/huawei/hms/support/api/PendingResultImpl;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/huawei/hms/support/api/PendingResultImpl;->access$200(Lcom/huawei/hms/support/api/PendingResultImpl;)Lcom/huawei/hms/support/api/client/Result;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, p2, v0}, Lcom/huawei/hms/support/api/PendingResultImpl$d;->a(Lcom/huawei/hms/support/api/client/ResultCallback;Lcom/huawei/hms/support/api/client/Result;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
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
