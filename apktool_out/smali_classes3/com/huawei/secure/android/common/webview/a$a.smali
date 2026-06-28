.class Lcom/huawei/secure/android/common/webview/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/secure/android/common/webview/a;->b()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/CountDownLatch;

.field final synthetic b:Lcom/huawei/secure/android/common/webview/a;


# direct methods
.method constructor <init>(Lcom/huawei/secure/android/common/webview/a;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/secure/android/common/webview/a$a;->b:Lcom/huawei/secure/android/common/webview/a;

    iput-object p2, p0, Lcom/huawei/secure/android/common/webview/a$a;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/secure/android/common/webview/a$a;->b:Lcom/huawei/secure/android/common/webview/a;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/huawei/secure/android/common/webview/a;->a(Lcom/huawei/secure/android/common/webview/a;)Landroid/webkit/WebView;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lcom/huawei/secure/android/common/webview/a;->d(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/huawei/secure/android/common/webview/a$a;->a:Ljava/util/concurrent/CountDownLatch;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method
